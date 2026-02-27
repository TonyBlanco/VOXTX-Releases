package l1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43866d = (Runtime.getRuntime().availableProcessors() * 2) + 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2172a f43867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2172a f43868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f43869c;

    public c() {
        f fVar = new f(10);
        this.f43867a = new C2172a(f43866d, fVar);
        this.f43868b = new C2172a(2, fVar);
        this.f43869c = new e();
    }

    @Override // l1.d
    public Executor a() {
        return this.f43869c;
    }

    @Override // l1.d
    public C2172a b() {
        return this.f43868b;
    }

    @Override // l1.d
    public C2172a c() {
        return this.f43867a;
    }
}
