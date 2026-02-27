package com.google.firebase.auth;

import G5.AbstractC0540g;
import G5.AbstractC0553u;
import G5.C0541h;
import H5.D;
import H5.Q;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth.b;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0553u f27909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0541h f27910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f27911c;

    public c(FirebaseAuth firebaseAuth, AbstractC0553u abstractC0553u, C0541h c0541h) {
        this.f27911c = firebaseAuth;
        this.f27909a = abstractC0553u;
        this.f27910b = c0541h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [H5.Q, com.google.firebase.auth.FirebaseAuth$b] */
    @Override // H5.D
    public final Task d(String str) {
        Log.i("FirebaseAuth", TextUtils.isEmpty(str) ? "Linking email account with empty reCAPTCHA token" : "Got reCAPTCHA token for linking email account");
        return this.f27911c.f27876e.zza(this.f27911c.f27872a, this.f27909a, (AbstractC0540g) this.f27910b, str, (Q) this.f27911c.new b());
    }
}
