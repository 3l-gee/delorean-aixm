package com.aixm.delorean.core.unit;

import com.aixm.delorean.core.DeloreanUtility;
import com.aixm.delorean.core.context.ContextWarehouse;
import com.aixm.delorean.core.context.GmlIdConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.lang.reflect.Field;
import java.util.UUID;
import java.util.stream.Stream;

public class ContextTest {

    @Test
    @Order(1)
    void ContextLifecycle() throws Exception {

        // --- No active context at the beginning ---
        assertEquals(ContextWarehouse.hasActiveContext(), false);

        // --- Create first context ---
        ContextWarehouse.getInstance().setContext("first", "Context for unit testing");
        String firstCtxt = ContextWarehouse.getInstance().getActive().getRef();
        assertEquals(ContextWarehouse.hasActiveContext(), true);

        // --- Check active context properties ---
        String activeHash = ContextWarehouse.getInstance().getActive().getHash();
        assertEquals(activeHash.length(), 36);

        // -- different id leads to different uuid when hashed to same context ---
        String id1 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        String id2 = DeloreanUtility.generateHash("uuid-2", ContextWarehouse.getActiveHash());
        assertNotEquals(id1, id2);

        // --- same id leads to same uuid when hashed to same context ---
        String id3 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        String id4 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        assertEquals(id3, id4);

        // -- different id leads to different uuid when hashed to different newcontext ---
        String id5 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().setContext("second", "change context");
        String secondCtxt = ContextWarehouse.getInstance().getActive().getRef();
        String id6 = DeloreanUtility.generateHash("uuid-2", ContextWarehouse.getActiveHash());
        assertNotEquals(id5, id6);

        // --- same id leads to different uuid when hashed to different new context ---
        String id7 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().setContext("third", "change context");
        String thirdCtxt = ContextWarehouse.getInstance().getActive().getRef();
        String id8 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());

        // --- same id leads to different uuid when hashed to different switched context ---
        ContextWarehouse.getInstance().switchContext(firstCtxt);
        String id9 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().switchContext(secondCtxt);
        String id10 = DeloreanUtility.generateHash("uuid-2", ContextWarehouse.getActiveHash());
        assertNotEquals(id9, id10);

        // --- same id leads to different uuid when hashed to different switched context ---
        String id11 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().switchContext(thirdCtxt);
        String id12 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        assertNotEquals(id11, id12);

        // --- list contexts ---
        assertEquals(3, ContextWarehouse.getInstance().listContexts().size());

        // clear contexts for next tests
        ContextWarehouse.getInstance().clearContexts();
        assertEquals(ContextWarehouse.hasActiveContext(), false);
        assertEquals(0, ContextWarehouse.getInstance().listContexts().size());

        // --- register contexts with custom salt ---
        ContextWarehouse.getInstance().registerContext("308623e3-9826-47ed-915b-a6b6e029a938", "first registered context", "registered context with custom salt");
        String regFirstCtxct = ContextWarehouse.getInstance().getActive().getRef();
        ContextWarehouse.getInstance().registerContext("9e3a5e82-cbf1-44b5-bd9e-a0fd902d2ec9", "second registered context", "registered context with custom salt");
        String regSecondCtxct = ContextWarehouse.getInstance().getActive().getRef();
        ContextWarehouse.getInstance().registerContext("e7f76179-d246-439c-823c-8a93e912915f", "third registered context", "registered context with custom salt");
        String regThirdCtxct = ContextWarehouse.getInstance().getActive().getRef();

        // -- different id leads to different uuid when hashed to same context ---
        ContextWarehouse.getInstance().switchContext(regSecondCtxct);
        String id50= DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().switchContext(regFirstCtxct);
        ContextWarehouse.getInstance().switchContext(regSecondCtxct);
        String id51 = DeloreanUtility.generateHash("uuid-2", ContextWarehouse.getActiveHash());
        assertNotEquals(id50, id51);

        // --- same id leads to same uuid when hashed to same context ---
        ContextWarehouse.getInstance().switchContext(regFirstCtxct);
        String id52 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().switchContext(regThirdCtxct);
        ContextWarehouse.getInstance().switchContext(regFirstCtxct);
        String id53 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        assertEquals(id52, id53);

        // -- different id leads to different uuid when hashed to different context ---
        ContextWarehouse.getInstance().switchContext(regFirstCtxct);
        String id54 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().switchContext(regThirdCtxct);
        ContextWarehouse.getInstance().switchContext(regSecondCtxct);
        String id55 = DeloreanUtility.generateHash("uuid-2", ContextWarehouse.getActiveHash());
        assertNotEquals(id54, id55);

        // --- same id leads to different uuid when hashed to different context ---
        ContextWarehouse.getInstance().switchContext(regFirstCtxct);
        String id56 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        ContextWarehouse.getInstance().switchContext(regThirdCtxct);
        ContextWarehouse.getInstance().switchContext(regSecondCtxct);
        String id57 = DeloreanUtility.generateHash("uuid-1", ContextWarehouse.getActiveHash());
        assertNotEquals(id56, id57);

        // -- different uuid leads to different id when hashed to same context ---
        String id58 = ContextWarehouse.getActiveId("755ad255-9b92-4517-b6c6-a3f79fb643ce");
        String id59 = ContextWarehouse.getActiveId("ede4bc9d-bff3-4581-9548-0c37fffa1606");
        assertNotEquals(id58, id59);

        // --- same uuid leads to same id when hashed to same context ---
        String id60 = ContextWarehouse.getActiveId("755ad255-9b92-4517-b6c6-a3f79fb643ce");
        String id61 = ContextWarehouse.getActiveId("755ad255-9b92-4517-b6c6-a3f79fb643ce");
        assertEquals(id60, id61);

        // --- same uuid leads to same id when hashed to different context ---
        String id62 = ContextWarehouse.getActiveId("755ad255-9b92-4517-b6c6-a3f79fb643ce");
        ContextWarehouse.getInstance().setContext(regSecondCtxct, "change context");
        String id63 = ContextWarehouse.getActiveId("755ad255-9b92-4517-b6c6-a3f79fb643ce");
        assertEquals(id62, id63);

    }
    
}
