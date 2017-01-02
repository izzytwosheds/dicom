/*
 *
 *  * Copyright 2015 the Lite Dicom Parser Project Authors (Izzat Bahadirov et alia).
 *  * Licensed AS IS and WITHOUT WARRANTY under the Apache License,
 *  * Version 2.0. Details: <http://www.apache.org/licenses/LICENSE-2.0>
 *
 */

package com.twosheds.dicom.dataelement;

import java.util.HashMap;

public enum ValueRepresentation {
    AE(16),
    AS(4),
    AT(4),
    CS(16),
    DA(8),
    DS(16),
    DT(26),
    FL(4),
    FD(8),
    IS(12),
    LO(64),
    LT(10240),
    OB(0),
    OF(-1),
    OW(0),
    PN(64),
    SH(16),
    SL(4),
    SQ(-1),
    SS(2),
    ST(1024),
    TM(16),
    UI(64),
    UL(4),
    UN(-1),
    US(2),
    UT(-1);

    private long size;

    private static HashMap<String, ValueRepresentation> lookupMap;

    ValueRepresentation(long size) {
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public static ValueRepresentation getVrByName(String vr) {
        initializeMapping();

        return lookupMap.get(vr.toUpperCase());
    }

    private static void initializeMapping() {
        if (lookupMap == null) {
            lookupMap = new HashMap<>(ValueRepresentation.values().length);

            for (ValueRepresentation vr: ValueRepresentation.values()) {
                lookupMap.put(vr.toString(), vr);
            }
        }
    }
}

