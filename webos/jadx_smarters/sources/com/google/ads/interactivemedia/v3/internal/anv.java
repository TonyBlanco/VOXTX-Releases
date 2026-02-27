package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes3.dex */
final class anv implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f20358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ anw f20359b;

    public anv(anw anwVar, int i9) {
        this.f20359b = anwVar;
        this.f20358a = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agc agcVarB;
        anw anwVar = this.f20359b;
        if (this.f20358a > 0) {
            try {
                Thread.sleep(r1 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = anwVar.f20361a.getPackageManager().getPackageInfo(anwVar.f20361a.getPackageName(), 0);
            Context context = anwVar.f20361a;
            agcVarB = asa.b(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            agcVarB = null;
        }
        this.f20359b.f20372m = agcVarB;
        if (this.f20358a < 4) {
            if (agcVarB != null && agcVarB.aj() && !agcVarB.f().equals("0000000000000000000000000000000000000000000000000000000000000000") && agcVarB.ak() && agcVarB.d().d() && agcVarB.d().a() != -2) {
                return;
            }
            this.f20359b.s(this.f20358a + 1);
        }
    }
}
