package androidx.leanback.widget;

import android.database.Observable;

/* JADX INFO: renamed from: androidx.leanback.widget.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1169y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f15825a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f15827c;

    /* JADX INFO: renamed from: androidx.leanback.widget.y$a */
    public static final class a extends Observable {
        public void a() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((b) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.widget.y$b */
    public static abstract class b {
        public abstract void a();
    }

    public AbstractC1169y(E e9) {
        h(new S(e9));
    }

    public abstract Object a(int i9);

    public long b(int i9) {
        return -1L;
    }

    public final F c() {
        return this.f15827c;
    }

    public final boolean d() {
        return this.f15826b;
    }

    public final void e() {
        this.f15825a.a();
    }

    public void f() {
    }

    public final void g(b bVar) {
        this.f15825a.registerObserver(bVar);
    }

    public final void h(F f9) {
        if (f9 == null) {
            throw new IllegalArgumentException("Presenter selector must not be null");
        }
        F f10 = this.f15827c;
        boolean z9 = false;
        boolean z10 = f10 != null;
        if (z10 && f10 != f9) {
            z9 = true;
        }
        this.f15827c = f9;
        if (z9) {
            f();
        }
        if (z10) {
            e();
        }
    }

    public abstract int i();

    public final void j(b bVar) {
        this.f15825a.unregisterObserver(bVar);
    }
}
