package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import j$.util.Objects;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f13503a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O.a f13505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnBackInvokedCallback f13506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f13507e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f13504b = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13508f = false;

    public class LifecycleOnBackPressedCancellable implements InterfaceC1184n, androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1180j f13509a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f13510c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public androidx.activity.a f13511d;

        public LifecycleOnBackPressedCancellable(AbstractC1180j abstractC1180j, h hVar) {
            this.f13509a = abstractC1180j;
            this.f13510c = hVar;
            abstractC1180j.a(this);
        }

        @Override // androidx.lifecycle.InterfaceC1184n
        public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
            if (bVar == AbstractC1180j.b.ON_START) {
                this.f13511d = OnBackPressedDispatcher.this.c(this.f13510c);
                return;
            }
            if (bVar != AbstractC1180j.b.ON_STOP) {
                if (bVar == AbstractC1180j.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f13511d;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f13509a.c(this);
            this.f13510c.e(this);
            androidx.activity.a aVar = this.f13511d;
            if (aVar != null) {
                aVar.cancel();
                this.f13511d = null;
            }
        }
    }

    public static class a {
        public static OnBackInvokedCallback a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new k(runnable);
        }

        public static void b(Object obj, int i9, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i9, (OnBackInvokedCallback) obj2);
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class b implements androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f13513a;

        public b(h hVar) {
            this.f13513a = hVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f13504b.remove(this.f13513a);
            this.f13513a.e(this);
            if (L.a.d()) {
                this.f13513a.g(null);
                OnBackPressedDispatcher.this.h();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f13503a = runnable;
        if (L.a.d()) {
            this.f13505c = new O.a() { // from class: androidx.activity.i
                @Override // O.a
                public final void accept(Object obj) {
                    this.f13522a.e((Boolean) obj);
                }
            };
            this.f13506d = a.a(new Runnable() { // from class: androidx.activity.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13523a.f();
                }
            });
        }
    }

    public void b(InterfaceC1186p interfaceC1186p, h hVar) {
        AbstractC1180j lifecycle = interfaceC1186p.getLifecycle();
        if (lifecycle.b() == AbstractC1180j.c.DESTROYED) {
            return;
        }
        hVar.a(new LifecycleOnBackPressedCancellable(lifecycle, hVar));
        if (L.a.d()) {
            h();
            hVar.g(this.f13505c);
        }
    }

    public androidx.activity.a c(h hVar) {
        this.f13504b.add(hVar);
        b bVar = new b(hVar);
        hVar.a(bVar);
        if (L.a.d()) {
            h();
            hVar.g(this.f13505c);
        }
        return bVar;
    }

    public boolean d() {
        Iterator itDescendingIterator = this.f13504b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (((h) itDescendingIterator.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void e(Boolean bool) {
        if (L.a.d()) {
            h();
        }
    }

    public void f() {
        Iterator itDescendingIterator = this.f13504b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            h hVar = (h) itDescendingIterator.next();
            if (hVar.c()) {
                hVar.b();
                return;
            }
        }
        Runnable runnable = this.f13503a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f13507e = onBackInvokedDispatcher;
        h();
    }

    public void h() {
        boolean zD = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f13507e;
        if (onBackInvokedDispatcher != null) {
            if (zD && !this.f13508f) {
                a.b(onBackInvokedDispatcher, 0, this.f13506d);
                this.f13508f = true;
            } else {
                if (zD || !this.f13508f) {
                    return;
                }
                a.c(onBackInvokedDispatcher, this.f13506d);
                this.f13508f = false;
            }
        }
    }
}
