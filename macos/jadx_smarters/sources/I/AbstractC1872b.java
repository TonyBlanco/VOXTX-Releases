package i;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: i.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1872b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f41710a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41711c;

    /* JADX INFO: renamed from: i.b$a */
    public interface a {
        boolean a(AbstractC1872b abstractC1872b, MenuItem menuItem);

        void b(AbstractC1872b abstractC1872b);

        boolean c(AbstractC1872b abstractC1872b, Menu menu);

        boolean d(AbstractC1872b abstractC1872b, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f41710a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f41711c;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i9);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f41710a = obj;
    }

    public abstract void q(int i9);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z9) {
        this.f41711c = z9;
    }
}
