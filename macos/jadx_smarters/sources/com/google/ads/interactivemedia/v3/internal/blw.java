package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
final class blw implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f21680a;

    public blw(int i9) {
        this.f21680a = i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        int i9 = this.f21680a;
        if (i9 == 0) {
            if (bofVar.c() == Date.class) {
                return new blx();
            }
            return null;
        }
        if (i9 != 1) {
            Class clsC = bofVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new bnv(clsC);
        }
        Type typeD = bofVar.d();
        boolean z9 = typeD instanceof GenericArrayType;
        if (!z9 && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
            return null;
        }
        Type genericComponentType = z9 ? ((GenericArrayType) typeD).getGenericComponentType() : ((Class) typeD).getComponentType();
        return new blu(bjtVar, bjtVar.a(bof.b(genericComponentType)), bks.a(genericComponentType));
    }
}
