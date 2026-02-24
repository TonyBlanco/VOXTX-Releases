package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class beb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f21128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f21129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class f21130c;

    @SafeVarargs
    public beb(Class cls, beo... beoVarArr) {
        this.f21128a = cls;
        HashMap map = new HashMap();
        for (int i9 = 0; i9 <= 0; i9++) {
            beo beoVar = beoVarArr[i9];
            if (map.containsKey(beoVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(beoVar.b().getCanonicalName())));
            }
            map.put(beoVar.b(), beoVar);
        }
        this.f21130c = beoVarArr[0].b();
        this.f21129b = Collections.unmodifiableMap(map);
    }

    public bea a() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract bhq b();

    public abstract brs c(bpb bpbVar) throws bqw;

    public abstract String d();

    public abstract void e(brs brsVar) throws GeneralSecurityException;

    public int f() {
        return bch.f21049a;
    }

    public final Class i() {
        return this.f21130c;
    }

    public final Class j() {
        return this.f21128a;
    }

    public final Object k(brs brsVar, Class cls) throws GeneralSecurityException {
        beo beoVar = (beo) this.f21129b.get(cls);
        if (beoVar != null) {
            return beoVar.a(brsVar);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public final Set l() {
        return this.f21129b.keySet();
    }
}
