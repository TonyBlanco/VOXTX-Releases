package org.simpleframework.xml.transform;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
class CharacterArrayTransform implements Transform {
    private final Class entry;

    public CharacterArrayTransform(Class cls) {
        this.entry = cls;
    }

    private Object read(char[] cArr, int i9) throws Exception {
        Object objNewInstance = Array.newInstance((Class<?>) this.entry, i9);
        for (int i10 = 0; i10 < i9; i10++) {
            Array.set(objNewInstance, i10, Character.valueOf(cArr[i10]));
        }
        return objNewInstance;
    }

    private String write(Object obj, int i9) throws Exception {
        StringBuilder sb = new StringBuilder(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj2 = Array.get(obj, i10);
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb.toString();
    }

    @Override // org.simpleframework.xml.transform.Transform
    public Object read(String str) throws Exception {
        char[] charArray = str.toCharArray();
        return this.entry == Character.TYPE ? charArray : read(charArray, charArray.length);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Object obj) throws Exception {
        return this.entry == Character.TYPE ? new String((char[]) obj) : write(obj, Array.getLength(obj));
    }
}
