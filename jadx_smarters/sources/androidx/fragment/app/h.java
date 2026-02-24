package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.N;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f15029a;

    public h(j jVar) {
        this.f15029a = jVar;
    }

    public static h b(j jVar) {
        return new h((j) O.h.g(jVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        j jVar = this.f15029a;
        jVar.f15035f.k(jVar, jVar, fragment);
    }

    public void c() {
        this.f15029a.f15035f.y();
    }

    public void d(Configuration configuration) {
        this.f15029a.f15035f.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f15029a.f15035f.B(menuItem);
    }

    public void f() {
        this.f15029a.f15035f.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f15029a.f15035f.D(menu, menuInflater);
    }

    public void h() {
        this.f15029a.f15035f.E();
    }

    public void i() {
        this.f15029a.f15035f.G();
    }

    public void j(boolean z9) {
        this.f15029a.f15035f.H(z9);
    }

    public boolean k(MenuItem menuItem) {
        return this.f15029a.f15035f.J(menuItem);
    }

    public void l(Menu menu) {
        this.f15029a.f15035f.K(menu);
    }

    public void m() {
        this.f15029a.f15035f.M();
    }

    public void n(boolean z9) {
        this.f15029a.f15035f.N(z9);
    }

    public boolean o(Menu menu) {
        return this.f15029a.f15035f.O(menu);
    }

    public void p() {
        this.f15029a.f15035f.Q();
    }

    public void q() {
        this.f15029a.f15035f.R();
    }

    public void r() {
        this.f15029a.f15035f.T();
    }

    public boolean s() {
        return this.f15029a.f15035f.a0(true);
    }

    public m t() {
        return this.f15029a.f15035f;
    }

    public void u() {
        this.f15029a.f15035f.T0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f15029a.f15035f.u0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        j jVar = this.f15029a;
        if (!(jVar instanceof N)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        jVar.f15035f.j1(parcelable);
    }

    public Parcelable x() {
        return this.f15029a.f15035f.l1();
    }
}
