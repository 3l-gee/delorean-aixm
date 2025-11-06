# AIXM Post Code Gen modification

The JAXB pipeline has its limitations, so some changes must be made manually after each code generation. Although this is tedious, it is the best compromise I have found as it allows  99% code generation with persistence xml parsing and more with only 1% manual edits.

## Hyper-JAXB unhandled cases


defines column names for embedded fields
´´´´´xml
<hj:embedded>
    <orm:attribute-override name="embeded field name">
        <orm:column name="column name" length="4"/>
    </orm:attribute-override>
</hj:embedded>
´´´´


´´´´´xml
<hj:entity>
    <orm:table name="dme_tsp" schema="navaids_points"/>
</hj:entity>
´´´´

´´´´´xml
<hj:many-to-one/>
    <orm:join-column name="name of the join column"/>
<hj:many-to-one>
´´´´

´´´´´xml
<hj:one-to-one/>
    <orm:join-column name="name of the join column"/>
<hj:one-to-one>
´´´´

´´´´´xml
<hj:one-to-many/>
    <orm:join-column name="name of the join column"/>
<hj:one-to-many>
´´´´

´´´´´xml
<hj:many-to-many>
    <orm:join-table name="join-table name">
        <orm:join-column name="join column name"  referenced-column-name="hjid" />
        <orm:inverse-join-column name="inverse join column name" referenced-column-name="hjid" />
    </orm:join-table>
    <orm:order-column/>
</hj:many-to-many>
´´´´

## Adapter removal