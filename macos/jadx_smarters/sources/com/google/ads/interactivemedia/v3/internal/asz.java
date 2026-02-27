package com.google.ads.interactivemedia.v3.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class asz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ata f20669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20672d;

    public /* synthetic */ asz(ata ataVar, byte[] bArr) {
        this.f20669a = ataVar;
        this.f20670b = bArr;
    }

    public final synchronized void a() {
        try {
            ata ataVar = this.f20669a;
            if (ataVar.f20676b) {
                ataVar.f20675a.h(this.f20670b);
                this.f20669a.f20675a.g(this.f20671c);
                this.f20669a.f20675a.f(this.f20672d);
                this.f20669a.f20675a.j();
                this.f20669a.f20675a.e();
            }
        } catch (RemoteException e9) {
            Log.d("GASS", "Clearcut log failed", e9);
        }
    }

    public final void b(int i9) {
        this.f20672d = i9;
    }

    public final void c(int i9) {
        this.f20671c = i9;
    }
}
