package com.google.firebase.auth;

import G5.AbstractC0553u;
import G5.C0541h;
import H5.D;
import H5.Q;
import H5.T;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.a;
import com.google.firebase.auth.FirebaseAuth.b;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0553u f27906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0541h f27907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f27908d;

    public b(FirebaseAuth firebaseAuth, boolean z9, AbstractC0553u abstractC0553u, C0541h c0541h) {
        this.f27908d = firebaseAuth;
        this.f27905a = z9;
        this.f27906b = abstractC0553u;
        this.f27907c = c0541h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [H5.Q, com.google.firebase.auth.FirebaseAuth$b] */
    @Override // H5.D
    public final Task d(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Email link login/reauth with empty reCAPTCHA token" : "Got reCAPTCHA token for login/reauth with email link");
        return this.f27905a ? this.f27908d.f27876e.zzb(this.f27908d.f27872a, (AbstractC0553u) r.m(this.f27906b), this.f27907c, str, (Q) this.f27908d.new b()) : this.f27908d.f27876e.zza(this.f27908d.f27872a, this.f27907c, str, (T) this.f27908d.new a());
    }
}
