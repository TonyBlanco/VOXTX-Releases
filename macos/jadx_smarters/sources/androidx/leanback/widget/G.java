package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.E;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f15346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public F f15347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f15348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E.a f15349d;

    public void a() {
        E e9 = this.f15348c;
        if (e9 != null) {
            e9.f(this.f15349d);
            this.f15346a.removeView(this.f15349d.f15344a);
            this.f15349d = null;
            this.f15348c = null;
        }
    }

    public final ViewGroup b() {
        return this.f15346a;
    }

    public void c(ViewGroup viewGroup, F f9) {
        a();
        this.f15346a = viewGroup;
        this.f15347b = f9;
    }

    public abstract void d(View view);

    public abstract void e(View view);

    public void f(Object obj) {
        i(obj);
        h(true);
    }

    public void g(View view, boolean z9) {
        view.setVisibility(z9 ? 0 : 8);
    }

    public final void h(boolean z9) {
        E.a aVar = this.f15349d;
        if (aVar != null) {
            g(aVar.f15344a, z9);
        }
    }

    public final void i(Object obj) {
        E eA = this.f15347b.a(obj);
        E e9 = this.f15348c;
        if (eA != e9) {
            h(false);
            a();
            this.f15348c = eA;
            if (eA == null) {
                return;
            }
            E.a aVarE = eA.e(this.f15346a);
            this.f15349d = aVarE;
            d(aVarE.f15344a);
        } else if (e9 == null) {
            return;
        } else {
            e9.f(this.f15349d);
        }
        this.f15348c.b(this.f15349d, obj);
        e(this.f15349d.f15344a);
    }

    public void j() {
        h(false);
    }
}
