package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class aok extends apj {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ayt f20430j = new ayt();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f20431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final afm f20432i;

    public aok(anw anwVar, agl aglVar, int i9, Context context, afm afmVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", aglVar, i9, 27, null, null, null);
        this.f20431h = context;
        this.f20432i = afmVar;
    }

    public static String c(afm afmVar) {
        if (afmVar == null || !afmVar.f() || aoa.g(afmVar.d().c())) {
            return null;
        }
        return afmVar.d().c();
    }

    private final String d() {
        try {
            if (this.f20468a.k() != null) {
                this.f20468a.k().get();
            }
            agc agcVarC = this.f20468a.c();
            if (agcVarC == null || !agcVarC.aj()) {
                return null;
            }
            return agcVarC.f();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    private final boolean e() {
        return this.f20468a.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        Boolean boolValueOf;
        int i9;
        String strD;
        ama amaVar;
        AtomicReference atomicReferenceB = f20430j.b(this.f20431h.getPackageName());
        synchronized (atomicReferenceB) {
            try {
                ama amaVar2 = (ama) atomicReferenceB.get();
                if (amaVar2 == null || aoa.g(amaVar2.f20178a) || amaVar2.f20178a.equals("E") || amaVar2.f20178a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (aoa.g(c(this.f20432i))) {
                        afm afmVar = this.f20432i;
                        if (aoa.g(c(afmVar))) {
                            boolValueOf = Boolean.valueOf(afmVar != null && afmVar.e() && afmVar.c().c() == afo.f19471d);
                        } else {
                            boolValueOf = Boolean.FALSE;
                        }
                        i9 = (boolValueOf.booleanValue() && e()) ? afo.f19471d : afo.f19470c;
                    } else {
                        i9 = afo.f19472e;
                    }
                    Boolean boolValueOf2 = Boolean.valueOf(i9 == afo.f19470c);
                    Boolean bool = (Boolean) aqo.f20530e.f();
                    String strB = ((Boolean) aqo.f20529d.f()).booleanValue() ? b() : null;
                    if (bool.booleanValue() && e() && aoa.g(strB)) {
                        strB = d();
                    }
                    ama amaVar3 = new ama((String) this.f20471d.invoke(null, this.f20431h, boolValueOf2, strB));
                    if (aoa.g(amaVar3.f20178a) || amaVar3.f20178a.equals("E")) {
                        int i10 = i9 - 1;
                        if (i9 == 0) {
                            throw null;
                        }
                        if (i10 == 3) {
                            strD = d();
                            if (!aoa.g(strD)) {
                                amaVar3.f20178a = strD;
                            }
                        } else if (i10 == 4) {
                            strD = this.f20432i.d().c();
                            amaVar3.f20178a = strD;
                        }
                    }
                    atomicReferenceB.set(amaVar3);
                }
                amaVar = (ama) atomicReferenceB.get();
            } finally {
            }
        }
        synchronized (this.f20474g) {
            if (amaVar != null) {
                try {
                    this.f20474g.ag(amaVar.f20178a);
                    this.f20474g.aH(amaVar.f20179b);
                    this.f20474g.aJ(amaVar.f20180c);
                    this.f20474g.R(amaVar.f20181d);
                    this.f20474g.af(amaVar.f20182e);
                } finally {
                }
            }
        }
    }

    public final String b() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrI = aoa.i((String) aqo.f20531f.f());
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrI)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(aoa.i((String) aqo.f20532g.f()))));
            }
            Context context = this.f20431h;
            String packageName = context.getPackageName();
            this.f20468a.j();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final azi aziVarP = azi.p();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.ads.interactivemedia.v3.internal.apk
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    azi aziVar = aziVarP;
                    if (list == null) {
                        aziVar.j(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            ApkChecksum apkChecksumA = C.a(list.get(i9));
                            if (apkChecksumA.getType() == 8) {
                                aziVar.j(aoa.c(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        aziVar.j(null);
                    } catch (Throwable unused) {
                        aziVar.j(null);
                    }
                }
            });
            return (String) aziVarP.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
