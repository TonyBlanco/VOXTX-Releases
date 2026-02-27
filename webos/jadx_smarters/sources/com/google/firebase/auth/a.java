package com.google.firebase.auth;

import G5.AbstractC0553u;
import H5.D;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.a;
import com.google.firebase.auth.FirebaseAuth.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f27900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0553u f27901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f27902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f27903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f27904f;

    public a(FirebaseAuth firebaseAuth, String str, boolean z9, AbstractC0553u abstractC0553u, String str2, String str3) {
        this.f27904f = firebaseAuth;
        this.f27899a = str;
        this.f27900b = z9;
        this.f27901c = abstractC0553u;
        this.f27902d = str2;
        this.f27903e = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [H5.Q, com.google.firebase.auth.FirebaseAuth$b] */
    @Override // H5.D
    public final Task d(String str) {
        String str2;
        StringBuilder sb;
        if (TextUtils.isEmpty(str)) {
            String str3 = this.f27899a;
            sb = new StringBuilder("Logging in as ");
            sb.append(str3);
            str2 = " with empty reCAPTCHA token";
        } else {
            str2 = this.f27899a;
            sb = new StringBuilder("Got reCAPTCHA token for login with email ");
        }
        sb.append(str2);
        Log.i("FirebaseAuth", sb.toString());
        return this.f27900b ? this.f27904f.f27876e.zzb(this.f27904f.f27872a, (AbstractC0553u) r.m(this.f27901c), this.f27899a, this.f27902d, this.f27903e, str, this.f27904f.new b()) : this.f27904f.f27876e.zzb(this.f27904f.f27872a, this.f27899a, this.f27902d, this.f27903e, str, this.f27904f.new a());
    }
}
