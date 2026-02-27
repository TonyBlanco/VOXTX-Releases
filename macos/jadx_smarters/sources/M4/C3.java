package M4;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class C3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f4210a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A3 f4211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A3 f4212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I3 f4214f;

    public C3(I3 i32, Bundle bundle, A3 a32, A3 a33, long j9) {
        this.f4214f = i32;
        this.f4210a = bundle;
        this.f4211c = a32;
        this.f4212d = a33;
        this.f4213e = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        I3.w(this.f4214f, this.f4210a, this.f4211c, this.f4212d, this.f4213e);
    }
}
