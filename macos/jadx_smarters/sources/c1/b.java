package c1;

import a1.k;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC1247a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f18184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f18185b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f18186c = new a();

    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            b.this.d(runnable);
        }
    }

    public b(Executor executor) {
        this.f18184a = new k(executor);
    }

    @Override // c1.InterfaceC1247a
    public Executor a() {
        return this.f18186c;
    }

    @Override // c1.InterfaceC1247a
    public void b(Runnable runnable) {
        this.f18184a.execute(runnable);
    }

    @Override // c1.InterfaceC1247a
    public k c() {
        return this.f18184a;
    }

    public void d(Runnable runnable) {
        this.f18185b.post(runnable);
    }
}
