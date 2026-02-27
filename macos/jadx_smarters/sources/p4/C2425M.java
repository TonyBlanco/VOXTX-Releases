package p4;

import com.google.android.gms.cast.MediaError;
import java.util.Iterator;
import java.util.List;
import n4.C2284p;
import p4.C2434i;
import t4.InterfaceC2789p;

/* JADX INFO: renamed from: p4.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2425M implements InterfaceC2789p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2434i f46409a;

    public /* synthetic */ C2425M(C2434i c2434i, AbstractC2424L abstractC2424L) {
        this.f46409a = c2434i;
    }

    @Override // t4.InterfaceC2789p
    public final void a(int[] iArr, int i9) {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).i(iArr, i9);
        }
    }

    @Override // t4.InterfaceC2789p
    public final void b(int[] iArr) {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).k(iArr);
        }
    }

    @Override // t4.InterfaceC2789p
    public final void c(int[] iArr) {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).h(iArr);
        }
    }

    @Override // t4.InterfaceC2789p
    public final void d(MediaError mediaError) {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).b(mediaError);
        }
    }

    @Override // t4.InterfaceC2789p
    public final void e(int[] iArr) {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).m(iArr);
        }
    }

    @Override // t4.InterfaceC2789p
    public final void f(C2284p[] c2284pArr) {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).j(c2284pArr);
        }
    }

    @Override // t4.InterfaceC2789p
    public final void g(List list, List list2, int i9) {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).l(list, list2, i9);
        }
    }

    public final void h() {
        C2434i.a0(this.f46409a);
    }

    @Override // t4.InterfaceC2789p
    public final void zza() {
        Iterator it = this.f46409a.f46525h.iterator();
        while (it.hasNext()) {
            ((C2434i.b) it.next()).a();
        }
        Iterator it2 = this.f46409a.f46526i.iterator();
        while (it2.hasNext()) {
            ((C2434i.a) it2.next()).a();
        }
    }

    @Override // t4.InterfaceC2789p
    public final void zzc() {
        h();
        Iterator it = this.f46409a.f46525h.iterator();
        while (it.hasNext()) {
            ((C2434i.b) it.next()).b();
        }
        Iterator it2 = this.f46409a.f46526i.iterator();
        while (it2.hasNext()) {
            ((C2434i.a) it2.next()).c();
        }
    }

    @Override // t4.InterfaceC2789p
    public final void zzd() {
        Iterator it = this.f46409a.f46525h.iterator();
        while (it.hasNext()) {
            ((C2434i.b) it.next()).e();
        }
        Iterator it2 = this.f46409a.f46526i.iterator();
        while (it2.hasNext()) {
            ((C2434i.a) it2.next()).d();
        }
    }

    @Override // t4.InterfaceC2789p
    public final void zzk() {
        Iterator it = this.f46409a.f46525h.iterator();
        while (it.hasNext()) {
            ((C2434i.b) it.next()).c();
        }
        Iterator it2 = this.f46409a.f46526i.iterator();
        while (it2.hasNext()) {
            ((C2434i.a) it2.next()).e();
        }
    }

    @Override // t4.InterfaceC2789p
    public final void zzl() {
        Iterator it = this.f46409a.f46526i.iterator();
        while (it.hasNext()) {
            ((C2434i.a) it.next()).n();
        }
    }

    @Override // t4.InterfaceC2789p
    public final void zzm() {
        h();
        C2434i.j0(this.f46409a);
        Iterator it = this.f46409a.f46525h.iterator();
        while (it.hasNext()) {
            ((C2434i.b) it.next()).f();
        }
        Iterator it2 = this.f46409a.f46526i.iterator();
        while (it2.hasNext()) {
            ((C2434i.a) it2.next()).g();
        }
    }
}
