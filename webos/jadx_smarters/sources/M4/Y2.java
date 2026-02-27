package M4;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class Y2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4551a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bundle f4554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f4555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f4556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f4557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f4558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4559j;

    public Y2(C0824t3 c0824t3, String str, String str2, long j9, Bundle bundle, boolean z9, boolean z10, boolean z11, String str3) {
        this.f4559j = c0824t3;
        this.f4551a = str;
        this.f4552c = str2;
        this.f4553d = j9;
        this.f4554e = bundle;
        this.f4555f = z9;
        this.f4556g = z10;
        this.f4557h = z11;
        this.f4558i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4559j.w(this.f4551a, this.f4552c, this.f4553d, this.f4554e, this.f4555f, this.f4556g, this.f4557h, this.f4558i);
    }
}
