package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final File f20643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f20644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f20645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20646d;

    public asr(Context context, int i9) {
        this.f20645c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        com.google.ads.interactivemedia.v3.impl.data.av.e(dir, false);
        this.f20644b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        com.google.ads.interactivemedia.v3.impl.data.av.e(dir2, true);
        this.f20643a = dir2;
        this.f20646d = i9;
    }

    @VisibleForTesting
    public static String a(apo apoVar) {
        return C4.j.a(apoVar.av());
    }

    private final File e() {
        File file = new File(this.f20644b, Integer.toString(apl.b(this.f20646d)));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String f() {
        return "FBAMTD" + apl.b(this.f20646d);
    }

    private final String g() {
        return "LATMTD" + apl.b(this.f20646d);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(com.google.ads.interactivemedia.v3.internal.apm r8, com.google.ads.interactivemedia.v3.internal.asu r9) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.asr.b(com.google.ads.interactivemedia.v3.internal.apm, com.google.ads.interactivemedia.v3.internal.asu):boolean");
    }

    @VisibleForTesting
    public final apo c(int i9) {
        SharedPreferences sharedPreferences;
        String strF;
        if (i9 == 1) {
            sharedPreferences = this.f20645c;
            strF = g();
        } else {
            sharedPreferences = this.f20645c;
            strF = f();
        }
        String string = sharedPreferences.getString(strF, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            apo apoVarG = apo.g(bpb.t(C4.j.d(string)));
            String strK = apoVarG.k();
            File fileA = com.google.ads.interactivemedia.v3.impl.data.av.a(strK, "pcam.jar", e());
            if (!fileA.exists()) {
                fileA = com.google.ads.interactivemedia.v3.impl.data.av.a(strK, "pcam", e());
            }
            File fileA2 = com.google.ads.interactivemedia.v3.impl.data.av.a(strK, "pcbc", e());
            if (fileA.exists()) {
                if (fileA2.exists()) {
                    return apoVarG;
                }
            }
        } catch (bqw unused) {
        }
        return null;
    }

    public final asq d(int i9) {
        apo apoVarC = c(1);
        if (apoVarC == null) {
            return null;
        }
        String strK = apoVarC.k();
        File fileA = com.google.ads.interactivemedia.v3.impl.data.av.a(strK, "pcam.jar", e());
        if (!fileA.exists()) {
            fileA = com.google.ads.interactivemedia.v3.impl.data.av.a(strK, "pcam", e());
        }
        return new asq(apoVarC, fileA, com.google.ads.interactivemedia.v3.impl.data.av.a(strK, "pcbc", e()), com.google.ads.interactivemedia.v3.impl.data.av.a(strK, "pcopt", e()));
    }
}
