package com.google.ads.interactivemedia.v3.internal;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class bao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f21006a = Logger.getLogger(bao.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicReference f21007b = new AtomicReference(new bab());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentMap f21008c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap f21009d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap f21010e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ConcurrentMap f21011f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ConcurrentMap f21012g = new ConcurrentHashMap();

    private bao() {
    }

    @Deprecated
    public static azp a(String str) throws GeneralSecurityException {
        String strValueOf;
        String str2;
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        ConcurrentMap concurrentMap = f21010e;
        Locale locale = Locale.US;
        azp azpVar = (azp) concurrentMap.get(str.toLowerCase(locale));
        if (azpVar != null) {
            return azpVar;
        }
        String strConcat = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(locale).startsWith("tinkaead")) {
            strConcat = strConcat.concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(locale).startsWith("tinkdeterministicaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call DeterministicAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkstreamingaead")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call StreamingAeadConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkhybriddecrypt") || str.toLowerCase(locale).startsWith("tinkhybridencrypt")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call HybridConfig.register().";
        } else if (str.toLowerCase(locale).startsWith("tinkmac")) {
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call MacConfig.register().";
        } else {
            if (!str.toLowerCase(locale).startsWith("tinkpublickeysign") && !str.toLowerCase(locale).startsWith("tinkpublickeyverify")) {
                if (str.toLowerCase(locale).startsWith("tink")) {
                    strValueOf = String.valueOf(strConcat);
                    str2 = "Maybe call TinkConfig.register().";
                }
                throw new GeneralSecurityException(strConcat);
            }
            strValueOf = String.valueOf(strConcat);
            str2 = "Maybe call SignatureConfig.register().";
        }
        strConcat = strValueOf.concat(str2);
        throw new GeneralSecurityException(strConcat);
    }

    public static azv b(String str) throws GeneralSecurityException {
        return ((bab) f21007b.get()).b(str);
    }

    public static synchronized brs c(bht bhtVar) throws GeneralSecurityException {
        azv azvVarB;
        azvVarB = b(bhtVar.e());
        if (!((Boolean) f21009d.get(bhtVar.e())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(bhtVar.e())));
        }
        return azvVarB.b(bhtVar.d());
    }

    public static Class d(Class cls) {
        bam bamVar = (bam) f21011f.get(cls);
        if (bamVar == null) {
            return null;
        }
        return bamVar.a();
    }

    public static Object e(bhr bhrVar, Class cls) throws GeneralSecurityException {
        return f(bhrVar.e(), bhrVar.d(), cls);
    }

    public static Object f(String str, bpb bpbVar, Class cls) throws GeneralSecurityException {
        return ((bab) f21007b.get()).a(str, cls).d(bpbVar);
    }

    public static Object g(String str, brs brsVar, Class cls) throws GeneralSecurityException {
        return ((bab) f21007b.get()).a(str, cls).e(brsVar);
    }

    public static Object h(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return f(str, bpb.t(bArr), cls);
    }

    public static Object i(bal balVar, Class cls) throws GeneralSecurityException {
        bam bamVar = (bam) f21011f.get(cls);
        if (bamVar == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(balVar.c().getName()));
        }
        if (bamVar.a().equals(balVar.c())) {
            return bamVar.c(balVar);
        }
        throw new GeneralSecurityException("Wrong input primitive class, expected " + bamVar.a().toString() + ", got " + balVar.c().toString());
    }

    public static synchronized Map j() {
        return Collections.unmodifiableMap(f21012g);
    }

    public static synchronized void k(azv azvVar, boolean z9) throws GeneralSecurityException {
        if (azvVar == null) {
            throw new IllegalArgumentException("key manager must be non-null.");
        }
        AtomicReference atomicReference = f21007b;
        bab babVar = new bab((bab) atomicReference.get());
        babVar.d(azvVar);
        if (!bch.a(bch.f21049a)) {
            throw new GeneralSecurityException("Registering key managers is not supported in FIPS mode");
        }
        String strF = azvVar.f();
        p(strF, Collections.emptyMap(), z9);
        f21009d.put(strF, Boolean.valueOf(z9));
        atomicReference.set(babVar);
    }

    public static synchronized void l(bam bamVar) throws GeneralSecurityException {
        try {
            if (bamVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class clsB = bamVar.b();
            ConcurrentMap concurrentMap = f21011f;
            if (concurrentMap.containsKey(clsB)) {
                bam bamVar2 = (bam) concurrentMap.get(clsB);
                if (!bamVar.getClass().getName().equals(bamVar2.getClass().getName())) {
                    f21006a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(clsB.toString()));
                    throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", clsB.getName(), bamVar2.getClass().getName(), bamVar.getClass().getName()));
                }
            }
            concurrentMap.put(clsB, bamVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void m(bht bhtVar) throws GeneralSecurityException {
        azv azvVarB = b(bhtVar.e());
        if (!((Boolean) f21009d.get(bhtVar.e())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(bhtVar.e())));
        }
        azvVarB.a(bhtVar.d());
    }

    public static synchronized void n(bep bepVar, beb bebVar) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = f21007b;
            bab babVar = new bab((bab) atomicReference.get());
            babVar.c(bepVar, bebVar);
            String strD = bepVar.d();
            String strD2 = bebVar.d();
            p(strD, bepVar.a().c(), true);
            p(strD2, Collections.emptyMap(), false);
            if (!((bab) atomicReference.get()).f(strD)) {
                f21008c.put(strD, r(bepVar));
                q(bepVar.d(), bepVar.a().c());
            }
            ConcurrentMap concurrentMap = f21009d;
            concurrentMap.put(strD, Boolean.TRUE);
            concurrentMap.put(strD2, Boolean.FALSE);
            atomicReference.set(babVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void o(beb bebVar) throws GeneralSecurityException {
        try {
            AtomicReference atomicReference = f21007b;
            bab babVar = new bab((bab) atomicReference.get());
            babVar.e(bebVar);
            String strD = bebVar.d();
            p(strD, bebVar.a().c(), true);
            if (!((bab) atomicReference.get()).f(strD)) {
                f21008c.put(strD, r(bebVar));
                q(strD, bebVar.a().c());
            }
            f21009d.put(strD, Boolean.TRUE);
            atomicReference.set(babVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    private static synchronized void p(String str, Map map, boolean z9) throws GeneralSecurityException {
        if (z9) {
            try {
                ConcurrentMap concurrentMap = f21009d;
                if (concurrentMap.containsKey(str) && !((Boolean) concurrentMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                }
                if (((bab) f21007b.get()).f(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!f21012g.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (f21012g.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.ads.interactivemedia.v3.internal.brs, java.lang.Object] */
    private static void q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            f21012g.put((String) entry.getKey(), oq.i(str, ((bdz) entry.getValue()).f21124a.av(), ((bdz) entry.getValue()).f21125b));
        }
    }

    private static ban r(beb bebVar) {
        return new ban();
    }
}
