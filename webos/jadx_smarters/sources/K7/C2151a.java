package k7;

import P.L;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import k7.b;

/* JADX INFO: renamed from: k7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2151a extends f.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0364a f43628d;

    /* JADX INFO: renamed from: k7.a$a, reason: collision with other inner class name */
    public interface InterfaceC0364a {
        void f(int i9);

        boolean h(int i9, int i10);
    }

    public C2151a(InterfaceC0364a interfaceC0364a) {
        this.f43628d = interfaceC0364a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.f.e
    public void A(RecyclerView.D d9, int i9) {
        if (i9 != 0 && (d9 instanceof b.e)) {
            ((b.e) d9).b();
        }
        super.A(d9, i9);
    }

    @Override // androidx.recyclerview.widget.f.e
    public void B(RecyclerView.D d9, int i9) {
        this.f43628d.f(d9.m());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.f.e
    public void c(RecyclerView recyclerView, RecyclerView.D d9) {
        super.c(recyclerView, d9);
        if (d9 instanceof b.e) {
            ((b.e) d9).a();
        }
    }

    @Override // androidx.recyclerview.widget.f.e
    public int k(RecyclerView recyclerView, RecyclerView.D d9) {
        return f.e.t(3, 32);
    }

    @Override // androidx.recyclerview.widget.f.e
    public boolean q() {
        return true;
    }

    @Override // androidx.recyclerview.widget.f.e
    public boolean r() {
        return true;
    }

    @Override // androidx.recyclerview.widget.f.e
    public void u(Canvas canvas, RecyclerView recyclerView, RecyclerView.D d9, float f9, float f10, int i9, boolean z9) {
        if (i9 != 1) {
            super.u(canvas, recyclerView, d9, f9, f10, i9, z9);
        } else if (d9 instanceof b.g) {
            L.L0(((b.g) d9).f43643A, f9);
        }
    }

    @Override // androidx.recyclerview.widget.f.e
    public boolean y(RecyclerView recyclerView, RecyclerView.D d9, RecyclerView.D d10) {
        if (d9.o() != d10.o()) {
            return false;
        }
        this.f43628d.h(d9.m(), d10.m());
        return true;
    }
}
