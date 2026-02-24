package org.simpleframework.xml.transform;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
class ArrayTransform implements Transform {
    private final Transform delegate;
    private final Class entry;
    private final StringArrayTransform split = new StringArrayTransform();

    public ArrayTransform(Transform transform, Class cls) {
        this.delegate = transform;
        this.entry = cls;
    }

    private Object read(String[] strArr, int i9) throws Exception {
        Object objNewInstance = Array.newInstance((Class<?>) this.entry, i9);
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = this.delegate.read(strArr[i10]);
            if (obj != null) {
                Array.set(objNewInstance, i10, obj);
            }
        }
        return objNewInstance;
    }

    private String write(Object obj, int i9) throws Exception {
        String[] strArr = new String[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj2 = Array.get(obj, i10);
            if (obj2 != null) {
                strArr[i10] = this.delegate.write(obj2);
            }
        }
        return this.split.write(strArr);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public Object read(String str) throws Exception {
        String[] strArr = this.split.read(str);
        return read(strArr, strArr.length);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Object obj) throws Exception {
        return write(obj, Array.getLength(obj));
    }
}
