package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes3.dex */
final class bkr implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Type f21611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f21612b;

    public bkr(Type[] typeArr, Type[] typeArr2) {
        int length = typeArr2.length;
        bjh.d(length <= 1);
        bjh.d(typeArr.length == 1);
        if (length != 1) {
            Type type = typeArr[0];
            type.getClass();
            bks.g(type);
            this.f21612b = null;
            this.f21611a = bks.d(typeArr[0]);
            return;
        }
        Type type2 = typeArr2[0];
        type2.getClass();
        bks.g(type2);
        bjh.d(typeArr[0] == Object.class);
        this.f21612b = bks.d(typeArr2[0]);
        this.f21611a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && bks.h(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f21612b;
        return type != null ? new Type[]{type} : bks.f21613a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f21611a};
    }

    public final int hashCode() {
        Type type = this.f21612b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f21611a.hashCode() + 31);
    }

    public final String toString() {
        String strValueOf;
        String str;
        Type type = this.f21612b;
        if (type != null) {
            strValueOf = String.valueOf(bks.b(type));
            str = "? super ";
        } else {
            Type type2 = this.f21611a;
            if (type2 == Object.class) {
                return "?";
            }
            strValueOf = String.valueOf(bks.b(type2));
            str = "? extends ";
        }
        return str.concat(strValueOf);
    }
}
