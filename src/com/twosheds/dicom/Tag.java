/*
 *
 *  * Copyright 2015 the Lite Dicom Parser Project Authors (Izzat Bahadirov et alia).
 *  * Licensed AS IS and WITHOUT WARRANTY under the Apache License,
 *  * Version 2.0. Details: <http://www.apache.org/licenses/LICENSE-2.0>
 *
 */

package com.twosheds.dicom;

public class Tag {
    private int group;
    private int element;

    public Tag(int group, int element) {
        this.group = group;
        this.element = element;
    }

    public int getGroup() {
        return group;
    }

    public int getElement() {
        return element;
    }

    @Override
    public int hashCode() {
        return (group & 0xFFFF << 16) | (element & 0xFFFF);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Tag)) {
            return false;
        }

        Tag otherTag = (Tag) other;
        return (otherTag.group == this.group && otherTag.element == this.element);
    }

    @Override
    public String toString() {
        return "(" + group + ", " + element + ')';
    }
}
