package com.google.android.gms.common.internal;

import android.os.Bundle;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends S {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC1404c f26836g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(AbstractC1404c abstractC1404c, int i9, Bundle bundle) {
        super(abstractC1404c, i9, null);
        this.f26836g = abstractC1404c;
    }

    @Override // com.google.android.gms.common.internal.S
    public final void f(C2914b c2914b) {
        if (this.f26836g.enableLocalFallback() && AbstractC1404c.zzo(this.f26836g)) {
            AbstractC1404c.zzk(this.f26836g, 16);
        } else {
            this.f26836g.zzc.c(c2914b);
            this.f26836g.onConnectionFailed(c2914b);
        }
    }

    @Override // com.google.android.gms.common.internal.S
    public final boolean g() {
        this.f26836g.zzc.c(C2914b.f51646j);
        return true;
    }
}
