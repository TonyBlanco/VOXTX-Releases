package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class bky implements Cloneable, bkm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bky f21629a = new bky();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f21630b = -1.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21631c = 136;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21632d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f21633e = Collections.emptyList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f21634f = Collections.emptyList();

    private final boolean f(Class cls) {
        return h(cls);
    }

    private final boolean g(Class cls, boolean z9) {
        for (com.google.ads.interactivemedia.v3.impl.data.k kVar : z9 ? this.f21633e : this.f21634f) {
        }
        return false;
    }

    private final boolean h(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || i(cls)) {
            return false;
        }
        return cls.isAnonymousClass() || cls.isLocalClass();
    }

    private static final boolean i(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkm
    public final bkl a(bjt bjtVar, bof bofVar) {
        boolean z9;
        boolean z10;
        Class clsC = bofVar.c();
        boolean zF = f(clsC);
        if (zF) {
            z9 = true;
        } else {
            g(clsC, true);
            z9 = false;
        }
        if (zF) {
            z10 = true;
        } else {
            g(clsC, false);
            z10 = false;
        }
        if (z9 || z10) {
            return new bkx(this, z10, z9, bjtVar, bofVar);
        }
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bky clone() {
        try {
            return (bky) super.clone();
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }

    public final boolean c(Class cls, boolean z9) {
        if (f(cls)) {
            return true;
        }
        g(cls, z9);
        return false;
    }

    public final boolean d(Field field, boolean z9) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || h(field.getType())) {
            return true;
        }
        List<com.google.ads.interactivemedia.v3.impl.data.k> list = z9 ? this.f21633e : this.f21634f;
        if (list.isEmpty()) {
            return false;
        }
        bjk bjkVar = new bjk(field);
        for (com.google.ads.interactivemedia.v3.impl.data.k kVar : list) {
            if (com.google.ads.interactivemedia.v3.impl.data.k.i(bjkVar)) {
                return true;
            }
        }
        return false;
    }

    public final bky e(com.google.ads.interactivemedia.v3.impl.data.k kVar) {
        bky bkyVarClone = clone();
        ArrayList arrayList = new ArrayList(this.f21633e);
        bkyVarClone.f21633e = arrayList;
        arrayList.add(kVar);
        return bkyVarClone;
    }
}
