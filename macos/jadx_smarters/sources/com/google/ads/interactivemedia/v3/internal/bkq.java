package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class bkq implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f21608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f21609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type[] f21610c;

    public bkq(Type type, Type type2, Type... typeArr) {
        type2.getClass();
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z9 = true;
            boolean z10 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z10) {
                z9 = false;
            }
            bjh.d(z9);
        }
        this.f21608a = type == null ? null : bks.d(type);
        this.f21609b = bks.d(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f21610c = typeArr2;
        int length = typeArr2.length;
        for (int i9 = 0; i9 < length; i9++) {
            Type type3 = this.f21610c[i9];
            type3.getClass();
            bks.g(type3);
            Type[] typeArr3 = this.f21610c;
            typeArr3[i9] = bks.d(typeArr3[i9]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && bks.h(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f21610c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f21608a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f21609b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f21610c) ^ this.f21609b.hashCode();
        Type type = this.f21608a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        int length = this.f21610c.length;
        if (length == 0) {
            return bks.b(this.f21609b);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(bks.b(this.f21609b));
        sb.append("<");
        sb.append(bks.b(this.f21610c[0]));
        for (int i9 = 1; i9 < length; i9++) {
            sb.append(", ");
            sb.append(bks.b(this.f21610c[i9]));
        }
        sb.append(">");
        return sb.toString();
    }
}
