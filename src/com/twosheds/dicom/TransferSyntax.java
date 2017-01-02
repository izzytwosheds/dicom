package com.twosheds.dicom;

/*
 * Copyright 2017 the Lite Dicom Parser Library Project Authors (Izzat Bahadirov et alia).
 * Licensed AS IS and WITHOUT WARRANTY under the Apache License,
 * Version 2.0. Details: <http://www.apache.org/licenses/LICENSE-2.0>
 */

public enum TransferSyntax {
    IMPLICIT_LITTLE_ENDIAN("1.2.840.10008.1.2", false),
    EXPLICIT_LITTLE_ENDIAN("1.2.840.10008.1.2.1", false),
    EXPLICIT_BIG_ENDIAN_DEFLATED("1.2.840.10008.1.2.1.99", false),
    EXPLICIT_BIG_ENDIAN("1.2.840.10008.1.2.2", false),
    JPEG_BASELINE_LOSSY_1("1.2.840.10008.1.2.4.50", false),
    JPEG_BASELINE_LOSSY_2_4("1.2.840.10008.1.2.4.51", false),
    JPEG_EXTENDED_3_5("1.2.840.10008.1.2.4.52", true),
    JPEG_SPECTRAL_SELECTION_6_8("1.2.840.10008.1.2.4.53", true),
    JPEG_SPECTRAL_SELECTION_7_9("1.2.840.10008.1.2.4.54", true),
    JPEG_FULL_PROGRESSION_10_12("1.2.840.10008.1.2.4.55", true),
    JPEG_FULL_PROGRESSION_11_13("1.2.840.10008.1.2.4.56", true),
    JPEG_LOSSLESS_14("1.2.840.10008.1.2.4.57", false),
    JPEG_LOSSLESS_15("1.2.840.10008.1.2.4.58", true),
    JPEG_EXTENDED_HIERARCHICAL_16_18("1.2.840.10008.1.2.4.59", true),
    JPEG_EXTENDED_HIERARCHICAL_17_19("1.2.840.10008.1.2.4.60", true),
    JPEG_SPECTRAL_SELECTION_HIERARCHICAL_20_22("1.2.840.10008.1.2.4.61", true),
    JPEG_SPECTRAL_SELECTION_HIERARCHICAL_21_23("1.2.840.10008.1.2.4.62", true),
    JPEG_FULL_PROGRESSION_HIERARCHICAL_24_26("1.2.840.10008.1.2.4.63", true),
    JPEG_FULL_PROGRESSION_HIERARCHICAL_25_27("1.2.840.10008.1.2.4.64", true),
    JPEG_LOSSLESS_HIERARCHICAL_28("1.2.840.10008.1.2.4.65", true),
    JPEG_LOSSLESS_HIERARCHICAL_29("1.2.840.10008.1.2.4.66", true),
    JPEG_LOSSLESS_HIERARCHICAL_FIRST_ORDER_PREDICTION("1.2.840.10008.1.2.4.70", false),
    JPEG_LS_LOSSLESS("1.2.840.10008.1.2.4.80", false),
    JPEG_LS_LOSSY("1.2.840.10008.1.2.4.81", false),
    JPEG_2000_LOSSLESS("1.2.840.10008.1.2.4.90", false),
    JPEG_2000_LOSSY("1.2.840.10008.1.2.4.91", false),
    JPEG_2000_PART2_LOSSLESS("1.2.840.10008.1.2.4.92", false),
    JPEG_2000_PART2_LOSSY("1.2.840.10008.1.2.4.93", false),
    JPIP("1.2.840.10008.1.2.4.94", false),
    JPIP_DEFLATE("1.2.840.10008.1.2.4.95", false),
    RLE_LOSSLESS("1.2.840.10008.1.2.5", false),
    RFC_2557_MIME_ENCAPSULATION("1.2.840.10008.1.2.6.1", false),
    MPEG2("1.2.840.10008.1.2.4.100", false),
    MPEG4("1.2.840.10008.1.2.4.102", false),
    MPEG4_BD_COMPATIBLE("1.2.840.10008.1.2.4.104", false);

    private String uid;
    private boolean isRetired;

    TransferSyntax(String uid, boolean retired) {
        this.uid = uid;
        this.isRetired = retired;
    }

    public String getUid() {
        return uid;
    }

    public boolean isRetired() {
        return isRetired;
    }
}
