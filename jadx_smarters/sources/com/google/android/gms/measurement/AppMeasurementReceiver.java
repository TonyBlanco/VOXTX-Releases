package com.google.android.gms.measurement;

import M4.T1;
import M4.U1;
import android.content.Context;
import android.content.Intent;
import k0.AbstractC2131a;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends AbstractC2131a implements T1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U1 f26945d;

    @Override // M4.T1
    public void a(Context context, Intent intent) {
        AbstractC2131a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f26945d == null) {
            this.f26945d = new U1(this);
        }
        this.f26945d.a(context, intent);
    }
}
