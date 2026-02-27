package M4;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: M4.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0741f3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4675a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4679f;

    public RunnableC0741f3(C0824t3 c0824t3, AtomicReference atomicReference, String str, String str2, String str3, boolean z9) {
        this.f4679f = c0824t3;
        this.f4675a = atomicReference;
        this.f4676c = str2;
        this.f4677d = str3;
        this.f4678e = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4679f.f4245a.L().W(this.f4675a, null, this.f4676c, this.f4677d, this.f4678e);
    }
}
