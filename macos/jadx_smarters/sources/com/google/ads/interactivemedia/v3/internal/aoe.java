package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager;

/* JADX INFO: loaded from: classes3.dex */
final class aoe implements AppOpsManager.OnOpActiveChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ aof f20420a;

    public aoe(aof aofVar) {
        this.f20420a = aofVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i9, String str2, boolean z9) {
        aof aofVar;
        boolean z10;
        if (z9) {
            this.f20420a.f20422b = System.currentTimeMillis();
            aofVar = this.f20420a;
            z10 = true;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aof aofVar2 = this.f20420a;
            if (aofVar2.f20423c > 0 && jCurrentTimeMillis >= aofVar2.f20423c) {
                aofVar2.f20424d = jCurrentTimeMillis - aofVar2.f20423c;
            }
            aofVar = this.f20420a;
            z10 = false;
        }
        aofVar.f20425e = z10;
    }
}
