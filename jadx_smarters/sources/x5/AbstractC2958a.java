package x5;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import r5.m;

/* JADX INFO: renamed from: x5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2958a {
    public final Type a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        m.h(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
