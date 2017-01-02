/*
 *
 *  * Copyright 2015 the Lite Dicom Parser Project Authors (Izzat Bahadirov et alia).
 *  * Licensed AS IS and WITHOUT WARRANTY under the Apache License,
 *  * Version 2.0. Details: <http://www.apache.org/licenses/LICENSE-2.0>
 *
 */

package com.twosheds.dicom.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/**
 * This is a utility class, which reads bytes from an input stream into an automatically resizeable buffer
 * and interprets them into expected type values
 */

public class ReadBuffer {
    private byte[] buffer = new byte[Short.MAX_VALUE];

    public int readUnsignedShort(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        read(inputStream, 0, 2);

        return Util.getUnsignedShort(buffer, byteOrder);
    }

    public long readUnsignedInt(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        read(inputStream, 0, 4);

        return Util.getUnsignedInt(buffer, byteOrder);
    }

    public String readString(InputStream inputStream, int length) throws IOException {
        read(inputStream, 0, length);

        return new String(buffer, 0, length);
    }

    private void read(InputStream inputStream, int start, int length) throws IOException {
        if (start+length > buffer.length) {
            byte[] oldBuffer = buffer;
            buffer = new byte[start+length];
            System.arraycopy(oldBuffer, 0, buffer, 0, oldBuffer.length);
        }

        int pos = start;
        while (pos < start+length) {
            int bytesRead = inputStream.read(buffer, pos, start + length - pos);
            pos += bytesRead;
        }
    }
}
