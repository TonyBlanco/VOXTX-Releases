package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class bma implements bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bkw f21686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21687b;

    public bma(bkw bkwVar, int i9) {
        this.f21687b = i9;
        this.f21686a = bkwVar;
    }

    public static final bkl b(bkw bkwVar, bjt bjtVar, bof bofVar, bkn bknVar) {
        bke bkeVar;
        bkl bmoVar;
        Object objA = bkwVar.a(bof.a(bknVar.a())).a();
        boolean zB = bknVar.b();
        if (objA instanceof bkl) {
            bmoVar = (bkl) objA;
        } else if (objA instanceof bkm) {
            bmoVar = ((bkm) objA).a(bjtVar, bofVar);
        } else {
            if (objA instanceof bke) {
                bkeVar = (bke) objA;
            } else {
                if (!(objA instanceof bjx)) {
                    throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + bofVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                }
                bkeVar = null;
            }
            bmoVar = new bmo(bkeVar, objA instanceof bjx ? (bjx) objA : null, bjtVar, bofVar, null, zB);
            zB = false;
        }
        return (bmoVar == null || !zB) ? bmoVar : bmoVar.nullSafe();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        int i9 = this.f21687b;
        if (i9 == 0) {
            bkn bknVar = (bkn) bofVar.c().getAnnotation(bkn.class);
            if (bknVar == null) {
                return null;
            }
            return b(this.f21686a, bjtVar, bofVar, bknVar);
        }
        if (i9 == 1) {
            Type typeD = bofVar.d();
            Class clsC = bofVar.c();
            if (!Collection.class.isAssignableFrom(clsC)) {
                return null;
            }
            Type typeE = bks.e(typeD, clsC);
            return new blv(bjtVar, typeE, bjtVar.a(bof.b(typeE)), this.f21686a.a(bofVar));
        }
        Type typeD2 = bofVar.d();
        Class clsC2 = bofVar.c();
        if (!Map.class.isAssignableFrom(clsC2)) {
            return null;
        }
        Type[] typeArrI = bks.i(typeD2, clsC2);
        Type type = typeArrI[0];
        return new bmf(bjtVar, typeArrI[0], (type == Boolean.TYPE || type == Boolean.class) ? bnw.f21784f : bjtVar.a(bof.b(type)), typeArrI[1], bjtVar.a(bof.b(typeArrI[1])), this.f21686a.a(bofVar));
    }
}
