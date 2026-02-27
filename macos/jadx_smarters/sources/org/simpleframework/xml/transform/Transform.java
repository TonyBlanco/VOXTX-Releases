package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes4.dex */
public interface Transform<T> {
    T read(String str) throws Exception;

    String write(T t9) throws Exception;
}
