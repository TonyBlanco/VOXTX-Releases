package com.google.ads.interactivemedia.v3.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
final class bab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f20982a = Logger.getLogger(bab.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f20983b;

    public bab() {
        this.f20983b = new ConcurrentHashMap();
    }

    public bab(bab babVar) {
        this.f20983b = new ConcurrentHashMap(babVar.f20983b);
    }

    private static baa g(beb bebVar) {
        return new azy(bebVar, 0);
    }

    private final synchronized baa h(String str) throws GeneralSecurityException {
        if (!this.f20983b.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (baa) this.f20983b.get(str);
    }

    private final synchronized void i(baa baaVar, boolean z9) throws GeneralSecurityException {
        try {
            String strF = baaVar.b().f();
            baa baaVar2 = (baa) this.f20983b.get(strF);
            if (baaVar2 != null && !baaVar2.c().equals(baaVar.c())) {
                f20982a.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(strF));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strF, baaVar2.c().getName(), baaVar.c().getName()));
            }
            if (z9) {
                this.f20983b.put(strF, baaVar);
            } else {
                this.f20983b.putIfAbsent(strF, baaVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final azv a(String str, Class cls) throws GeneralSecurityException {
        baa baaVarH = h(str);
        if (baaVarH.e().contains(cls)) {
            return baaVarH.a(cls);
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(baaVarH.c());
        Set<Class> setE = baaVarH.e();
        StringBuilder sb = new StringBuilder();
        boolean z9 = true;
        for (Class cls2 : setE) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z9 = false;
        }
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + strValueOf + ", supported primitives: " + sb.toString());
    }

    public final azv b(String str) throws GeneralSecurityException {
        return h(str).b();
    }

    public final synchronized void c(bep bepVar, beb bebVar) throws GeneralSecurityException {
        Class clsD;
        try {
            int iF = bepVar.f();
            int iF2 = bebVar.f();
            if (!bch.a(iF)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(bepVar.getClass()) + " as it is not FIPS compatible.");
            }
            if (!bch.a(iF2)) {
                throw new GeneralSecurityException("failed to register key manager " + String.valueOf(bebVar.getClass()) + " as it is not FIPS compatible.");
            }
            String strD = bepVar.d();
            String strD2 = bebVar.d();
            if (this.f20983b.containsKey(strD) && ((baa) this.f20983b.get(strD)).d() != null && (clsD = ((baa) this.f20983b.get(strD)).d()) != null && !clsD.getName().equals(bebVar.getClass().getName())) {
                f20982a.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + strD + " with inconsistent public key type " + strD2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", bepVar.getClass().getName(), clsD.getName(), bebVar.getClass().getName()));
            }
            i(new azz(bepVar, bebVar), true);
            i(g(bebVar), false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(azv azvVar) throws GeneralSecurityException {
        if (!bch.a(bch.f21049a)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        i(new azy(azvVar, 1), false);
    }

    public final synchronized void e(beb bebVar) throws GeneralSecurityException {
        if (!bch.a(bebVar.f())) {
            throw new GeneralSecurityException("failed to register key manager " + String.valueOf(bebVar.getClass()) + " as it is not FIPS compatible.");
        }
        i(g(bebVar), false);
    }

    public final boolean f(String str) {
        return this.f20983b.containsKey(str);
    }
}
