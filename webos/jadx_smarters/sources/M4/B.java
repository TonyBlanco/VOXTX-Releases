package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4196a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E0 f4198d;

    public B(E0 e02, String str, long j9) {
        this.f4198d = e02;
        this.f4196a = str;
        this.f4197c = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E0.j(this.f4198d, this.f4196a, this.f4197c);
    }
}
