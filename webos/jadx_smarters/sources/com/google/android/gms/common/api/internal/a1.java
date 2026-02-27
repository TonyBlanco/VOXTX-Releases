package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import w4.C2914b;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y0 f26579a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f26580c;

    public a1(b1 b1Var, Y0 y02) {
        this.f26580c = b1Var;
        this.f26579a = y02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26580c.f26586a) {
            C2914b c2914bB = this.f26579a.b();
            if (c2914bB.K()) {
                b1 b1Var = this.f26580c;
                b1Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(b1Var.getActivity(), (PendingIntent) com.google.android.gms.common.internal.r.m(c2914bB.J()), this.f26579a.a(), false), 1);
                return;
            }
            b1 b1Var2 = this.f26580c;
            if (b1Var2.f26589e.d(b1Var2.getActivity(), c2914bB.H(), null) != null) {
                b1 b1Var3 = this.f26580c;
                b1Var3.f26589e.z(b1Var3.getActivity(), b1Var3.mLifecycleFragment, c2914bB.H(), 2, this.f26580c);
                return;
            }
            if (c2914bB.H() != 18) {
                this.f26580c.a(c2914bB, this.f26579a.a());
                return;
            }
            b1 b1Var4 = this.f26580c;
            Dialog dialogU = b1Var4.f26589e.u(b1Var4.getActivity(), b1Var4);
            b1 b1Var5 = this.f26580c;
            b1Var5.f26589e.v(b1Var5.getActivity().getApplicationContext(), new Z0(this, dialogU));
        }
    }
}
