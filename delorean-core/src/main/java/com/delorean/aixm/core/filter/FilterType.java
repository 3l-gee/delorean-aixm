package com.delorean.aixm.core.filter;

public enum FilterType {
    MESSAGE_MEMBER, // Top level members
    FEATURE,        // The actual core features (e.g., DMEType)
    TIMESLICE       // The temporal slices (e.g., DMETimeSlicePropertyType)
}
