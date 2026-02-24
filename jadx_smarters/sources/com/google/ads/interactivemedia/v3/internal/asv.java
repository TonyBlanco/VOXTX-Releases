package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class asv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f20655a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f20656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f20657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f20658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ash f20659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20660f;

    public asv(Context context, int i9, ash ashVar, boolean z9) {
        this.f20660f = false;
        this.f20656b = context;
        this.f20658d = Integer.toString(apl.b(i9));
        this.f20657c = context.getSharedPreferences("pcvmspf", 0);
        this.f20659e = ashVar;
        this.f20660f = z9;
    }

    private final File e(String str) {
        return new File(new File(this.f20656b.getDir("pccache", 0), this.f20658d), str);
    }

    private static String f(apm apmVar) {
        apn apnVarD = apo.d();
        apnVarD.e(apmVar.c().k());
        apnVarD.a(apmVar.c().j());
        apnVarD.b(apmVar.c().a());
        apnVarD.d(apmVar.c().c());
        apnVarD.c(apmVar.c().b());
        return C4.j.a(((apo) apnVarD.aY()).av());
    }

    private final String g() {
        return "FBAMTD".concat(String.valueOf(this.f20658d));
    }

    private final String h() {
        return "LATMTD".concat(String.valueOf(this.f20658d));
    }

    private final void i(int i9, long j9) {
        ash ashVar = this.f20659e;
        if (ashVar != null) {
            ashVar.a(i9, j9);
        }
    }

    private final void j(int i9, long j9, String str) {
        ash ashVar = this.f20659e;
        if (ashVar != null) {
            ashVar.b(i9, j9, str);
        }
    }

    private final apo k(int i9) {
        SharedPreferences sharedPreferences;
        String strG;
        int i10;
        if (i9 == 1) {
            sharedPreferences = this.f20657c;
            strG = h();
        } else {
            sharedPreferences = this.f20657c;
            strG = g();
        }
        String string = sharedPreferences.getString(strG, null);
        if (string == null) {
            return null;
        }
        try {
            return apo.h(bpb.t(C4.j.d(string)), this.f20660f ? bqb.a() : bqb.b());
        } catch (bqw unused) {
            return null;
        } catch (NullPointerException unused2) {
            i10 = 2029;
            i(i10, System.currentTimeMillis());
            return null;
        } catch (RuntimeException unused3) {
            i10 = 2032;
            i(i10, System.currentTimeMillis());
            return null;
        }
    }

    public final boolean a(apm apmVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f20655a) {
            try {
                if (!com.google.ads.interactivemedia.v3.impl.data.av.d(new File(e(apmVar.c().k()), "pcbc"), apmVar.d().B())) {
                    i(4020, jCurrentTimeMillis);
                    return false;
                }
                String strF = f(apmVar);
                SharedPreferences.Editor editorEdit = this.f20657c.edit();
                editorEdit.putString(h(), strF);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    i(5015, jCurrentTimeMillis);
                } else {
                    i(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(apm apmVar, asu asuVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f20655a) {
            try {
                apo apoVarK = k(1);
                String strK = apmVar.c().k();
                if (apoVarK != null && apoVarK.k().equals(strK)) {
                    i(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileE = e(strK);
                if (fileE.exists()) {
                    j(4023, jCurrentTimeMillis2, "d:" + (true != fileE.isDirectory() ? "0" : "1") + ",f:" + (true != fileE.isFile() ? "0" : "1"));
                    i(4015, jCurrentTimeMillis2);
                } else if (!fileE.mkdirs()) {
                    j(4024, jCurrentTimeMillis2, "cw:".concat(true != fileE.canWrite() ? "0" : "1"));
                    i(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileE2 = e(strK);
                File file = new File(fileE2, "pcam.jar");
                File file2 = new File(fileE2, "pcbc");
                if (!com.google.ads.interactivemedia.v3.impl.data.av.d(file, apmVar.e().B())) {
                    i(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!com.google.ads.interactivemedia.v3.impl.data.av.d(file2, apmVar.d().B())) {
                    i(4017, jCurrentTimeMillis);
                    return false;
                }
                if (!asuVar.a(file)) {
                    i(4018, jCurrentTimeMillis);
                    com.google.ads.interactivemedia.v3.impl.data.av.c(fileE2);
                    return false;
                }
                String strF = f(apmVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.f20657c.getString(h(), null);
                SharedPreferences.Editor editorEdit = this.f20657c.edit();
                editorEdit.putString(h(), strF);
                if (string != null) {
                    editorEdit.putString(g(), string);
                }
                if (!editorEdit.commit()) {
                    i(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                apo apoVarK2 = k(1);
                if (apoVarK2 != null) {
                    hashSet.add(apoVarK2.k());
                }
                apo apoVarK3 = k(2);
                if (apoVarK3 != null) {
                    hashSet.add(apoVarK3.k());
                }
                for (File file3 : new File(this.f20656b.getDir("pccache", 0), this.f20658d).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        com.google.ads.interactivemedia.v3.impl.data.av.c(file3);
                    }
                }
                i(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final asq c(int i9) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f20655a) {
            try {
                apo apoVarK = k(1);
                if (apoVarK == null) {
                    i(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileE = e(apoVarK.k());
                File file = new File(fileE, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileE, "pcam");
                }
                File file2 = new File(fileE, "pcbc");
                File file3 = new File(fileE, "pcopt");
                i(5016, jCurrentTimeMillis);
                return new asq(apoVarK, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(int i9) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f20655a) {
            try {
                apo apoVarK = k(1);
                if (apoVarK == null) {
                    i(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileE = e(apoVarK.k());
                if (!new File(fileE, "pcam.jar").exists()) {
                    i(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileE, "pcbc").exists()) {
                    i(5019, jCurrentTimeMillis);
                    return true;
                }
                i(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
