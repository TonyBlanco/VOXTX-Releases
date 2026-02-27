package androidx.recyclerview.widget;

import P.C0959a;
import P.L;
import Q.C;
import Q.D;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class l extends C0959a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f17085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f17086e;

    public static class a extends C0959a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l f17087d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f17088e = new WeakHashMap();

        public a(l lVar) {
            this.f17087d = lVar;
        }

        @Override // P.C0959a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C0959a c0959a = (C0959a) this.f17088e.get(view);
            return c0959a != null ? c0959a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // P.C0959a
        public D b(View view) {
            C0959a c0959a = (C0959a) this.f17088e.get(view);
            return c0959a != null ? c0959a.b(view) : super.b(view);
        }

        @Override // P.C0959a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C0959a c0959a = (C0959a) this.f17088e.get(view);
            if (c0959a != null) {
                c0959a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // P.C0959a
        public void g(View view, C c9) {
            if (!this.f17087d.o() && this.f17087d.f17085d.getLayoutManager() != null) {
                this.f17087d.f17085d.getLayoutManager().k1(view, c9);
                C0959a c0959a = (C0959a) this.f17088e.get(view);
                if (c0959a != null) {
                    c0959a.g(view, c9);
                    return;
                }
            }
            super.g(view, c9);
        }

        @Override // P.C0959a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C0959a c0959a = (C0959a) this.f17088e.get(view);
            if (c0959a != null) {
                c0959a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // P.C0959a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0959a c0959a = (C0959a) this.f17088e.get(viewGroup);
            return c0959a != null ? c0959a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // P.C0959a
        public boolean j(View view, int i9, Bundle bundle) {
            if (this.f17087d.o() || this.f17087d.f17085d.getLayoutManager() == null) {
                return super.j(view, i9, bundle);
            }
            C0959a c0959a = (C0959a) this.f17088e.get(view);
            if (c0959a != null) {
                if (c0959a.j(view, i9, bundle)) {
                    return true;
                }
            } else if (super.j(view, i9, bundle)) {
                return true;
            }
            return this.f17087d.f17085d.getLayoutManager().E1(view, i9, bundle);
        }

        @Override // P.C0959a
        public void l(View view, int i9) {
            C0959a c0959a = (C0959a) this.f17088e.get(view);
            if (c0959a != null) {
                c0959a.l(view, i9);
            } else {
                super.l(view, i9);
            }
        }

        @Override // P.C0959a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C0959a c0959a = (C0959a) this.f17088e.get(view);
            if (c0959a != null) {
                c0959a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        public C0959a n(View view) {
            return (C0959a) this.f17088e.remove(view);
        }

        public void o(View view) {
            C0959a c0959aN = L.n(view);
            if (c0959aN == null || c0959aN == this) {
                return;
            }
            this.f17088e.put(view, c0959aN);
        }
    }

    public l(RecyclerView recyclerView) {
        this.f17085d = recyclerView;
        C0959a c0959aN = n();
        this.f17086e = (c0959aN == null || !(c0959aN instanceof a)) ? new a(this) : (a) c0959aN;
    }

    @Override // P.C0959a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().g1(accessibilityEvent);
        }
    }

    @Override // P.C0959a
    public void g(View view, C c9) {
        super.g(view, c9);
        if (o() || this.f17085d.getLayoutManager() == null) {
            return;
        }
        this.f17085d.getLayoutManager().i1(c9);
    }

    @Override // P.C0959a
    public boolean j(View view, int i9, Bundle bundle) {
        if (super.j(view, i9, bundle)) {
            return true;
        }
        if (o() || this.f17085d.getLayoutManager() == null) {
            return false;
        }
        return this.f17085d.getLayoutManager().C1(i9, bundle);
    }

    public C0959a n() {
        return this.f17086e;
    }

    public boolean o() {
        return this.f17085d.q0();
    }
}
