/*
 *
 *  * Copyright 2015 the Lite Dicom Parser Project Authors (Izzat Bahadirov et alia).
 *  * Licensed AS IS and WITHOUT WARRANTY under the Apache License,
 *  * Version 2.0. Details: <http://www.apache.org/licenses/LICENSE-2.0>
 *
 */

package com.twosheds.dicom.util;

import java.nio.ByteOrder;

/**
 * Utility class for basic conversions
 */

public class Util {
    public static int getUnsignedShort(byte[] buffer, ByteOrder byteOrder) {
        return getUnsignedShort(buffer, 0, byteOrder);
    }

    public static int getUnsignedShort(byte[] buffer, int pos, ByteOrder byteOrder) {
        int ret;

        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            ret = (buffer[pos] & 0xFF) << 8
                    | (buffer[pos+1] & 0xFF);
        } else {
            ret = (buffer[pos+1] & 0xFF) << 8
                    | (buffer[pos] & 0xFF);
        }

        ret &= 0x0000ffffL;

        return ret;
    }

    public static long getUnsignedInt(byte[] buffer, ByteOrder byteOrder) {
        return getUnsignedInt(buffer, 0, byteOrder);
    }

    public static long getUnsignedInt(byte[] buffer, int pos, ByteOrder byteOrder) {
        long ret;

        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            ret = (buffer[pos] & 0xFF) << 24
                    | (buffer[pos+1] & 0xFF) << 16
                    | (buffer[pos+2] & 0xFF) << 8
                    | (buffer[pos+3] & 0xFF);
        } else {
            ret = (buffer[pos+3] & 0xFF) << 24
                    | (buffer[pos+2] & 0xFF) << 16
                    | (buffer[pos+1] & 0xFF) << 8
                    | (buffer[pos] & 0xFF);
        }

        ret &= 0x00000000ffffffffL;

        return ret;
    }
}
