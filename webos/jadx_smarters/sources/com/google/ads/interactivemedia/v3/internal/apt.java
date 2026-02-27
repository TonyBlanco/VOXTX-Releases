package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.common.internal.Hide;
import h4.C1858a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class apt extends apw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final amv f20497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final amx f20498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final and f20499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20500d = false;

    public apt(Context context, Executor executor, aff affVar) {
        ana anaVar = new ana(context, executor, affVar);
        this.f20497a = anaVar;
        this.f20499c = new and(anaVar);
        this.f20498b = affVar.c() ? null : amx.j(context);
    }

    @Deprecated
    private final aro u(aro aroVar, aro aroVar2, boolean z9) {
        try {
            Uri uri = (Uri) arp.d(aroVar);
            Context context = (Context) arp.d(aroVar2);
            return arp.c(z9 ? this.f20499c.a(uri, context) : this.f20499c.g(uri, context));
        } catch (ane unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final int b() {
        amv amvVar = this.f20497a;
        if (!(amvVar instanceof ana)) {
            return -1;
        }
        amv amvVarA = ((ana) amvVar).a();
        if (amvVarA instanceof anc) {
            return 1;
        }
        return amvVarA instanceof ams ? 2 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final aro c(aro aroVar, aro aroVar2) {
        return u(aroVar, aroVar2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final aro d(aro aroVar, aro aroVar2) {
        return u(aroVar, aroVar2, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final String e(aro aroVar, String str) {
        return ((ana) this.f20497a).e((Context) arp.d(aroVar), str, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final String f(aro aroVar) {
        return g(aroVar, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final String g(aro aroVar, byte[] bArr) {
        Context context = (Context) arp.d(aroVar);
        String strG = this.f20497a.g(context, bArr);
        amx amxVar = this.f20498b;
        if (amxVar == null || !this.f20500d) {
            return strG;
        }
        String strM = this.f20498b.m(strG, amxVar.g(context, bArr));
        this.f20500d = false;
        return strM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String h(aro aroVar, aro aroVar2, aro aroVar3, aro aroVar4) {
        return this.f20497a.e((Context) arp.d(aroVar), (String) arp.d(aroVar2), (View) arp.d(aroVar3), (Activity) arp.d(aroVar4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String i(aro aroVar) {
        return this.f20497a.f((Context) arp.d(aroVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String j() {
        return "ms";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final String k(aro aroVar, aro aroVar2, aro aroVar3) {
        return this.f20497a.h((Context) arp.d(aroVar), (View) arp.d(aroVar2), (Activity) arp.d(aroVar3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final void l(aro aroVar) {
        this.f20499c.b((MotionEvent) arp.d(aroVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final void m(aro aroVar) {
        this.f20497a.n((View) arp.d(aroVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final void n(String str, String str2) {
        this.f20499c.c(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final void o(String str) {
        this.f20499c.d(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final boolean p(aro aroVar) {
        return this.f20499c.f((Uri) arp.d(aroVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final boolean q(aro aroVar) {
        return this.f20499c.e((Uri) arp.d(aroVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final boolean r() {
        return this.f20497a.q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    @Deprecated
    public final boolean s(String str, boolean z9) {
        if (this.f20498b == null) {
            return false;
        }
        this.f20498b.o(new C1858a.C0341a(str, z9));
        this.f20500d = true;
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apx
    public final boolean t() {
        return this.f20497a.s();
    }
}
