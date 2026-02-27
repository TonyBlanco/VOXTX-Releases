package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC1180j;

/* JADX INFO: loaded from: classes.dex */
public class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f15858b = new Handler();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f15859c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final q f15860a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC1180j.b f15861c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15862d = false;

        public a(q qVar, AbstractC1180j.b bVar) {
            this.f15860a = qVar;
            this.f15861c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15862d) {
                return;
            }
            this.f15860a.h(this.f15861c);
            this.f15862d = true;
        }
    }

    public H(InterfaceC1186p interfaceC1186p) {
        this.f15857a = new q(interfaceC1186p);
    }

    public AbstractC1180j a() {
        return this.f15857a;
    }

    public void b() {
        f(AbstractC1180j.b.ON_START);
    }

    public void c() {
        f(AbstractC1180j.b.ON_CREATE);
    }

    public void d() {
        f(AbstractC1180j.b.ON_STOP);
        f(AbstractC1180j.b.ON_DESTROY);
    }

    public void e() {
        f(AbstractC1180j.b.ON_START);
    }

    public final void f(AbstractC1180j.b bVar) {
        a aVar = this.f15859c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f15857a, bVar);
        this.f15859c = aVar2;
        this.f15858b.postAtFrontOfQueue(aVar2);
    }
}
