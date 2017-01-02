/*
 *
 *  * Copyright 2015 the Lite Dicom Parser Project Authors (Izzat Bahadirov et alia).
 *  * Licensed AS IS and WITHOUT WARRANTY under the Apache License,
 *  * Version 2.0. Details: <http://www.apache.org/licenses/LICENSE-2.0>
 *
 */

package com.twosheds.dicom.dataelement;

import com.twosheds.dicom.Tag;

public class DataElement {
    private Tag tag;
    private ValueRepresentation valueRepresentation;

    DataElement(int group, int element, ValueRepresentation valueRepresentation) {
        tag = new Tag(group, element);
        this.valueRepresentation = valueRepresentation;
    }

    public Tag getTag() {
        return tag;
    }

    public ValueRepresentation getValueRepresentation() {
        return valueRepresentation;
    }
}
