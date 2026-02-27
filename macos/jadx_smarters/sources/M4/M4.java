package M4;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class M4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4373a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4374c = "_err";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f4375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N4 f4376e;

    public M4(N4 n42, String str, String str2, Bundle bundle) {
        this.f4376e = n42;
        this.f4373a = str;
        this.f4375d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4376e.f4389a.k((C0832v) com.google.android.gms.common.internal.r.m(this.f4376e.f4389a.h0().y0(this.f4373a, this.f4374c, this.f4375d, "auto", this.f4376e.f4389a.a().a(), false, true)), this.f4373a);
    }
}
