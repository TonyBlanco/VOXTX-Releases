package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1180j;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends N0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f15124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f15126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Fragment f15127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15128g;

    public r(m mVar) {
        this(mVar, 0);
    }

    public r(m mVar, int i9) {
        this.f15126e = null;
        this.f15127f = null;
        this.f15124c = mVar;
        this.f15125d = i9;
    }

    public static String r(int i9, long j9) {
        return "android:switcher:" + i9 + ":" + j9;
    }

    @Override // N0.a
    public void a(ViewGroup viewGroup, int i9, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f15126e == null) {
            this.f15126e = this.f15124c.m();
        }
        this.f15126e.m(fragment);
        if (fragment.equals(this.f15127f)) {
            this.f15127f = null;
        }
    }

    @Override // N0.a
    public void b(ViewGroup viewGroup) {
        w wVar = this.f15126e;
        if (wVar != null) {
            if (!this.f15128g) {
                try {
                    this.f15128g = true;
                    wVar.l();
                } finally {
                    this.f15128g = false;
                }
            }
            this.f15126e = null;
        }
    }

    @Override // N0.a
    public Object g(ViewGroup viewGroup, int i9) {
        if (this.f15126e == null) {
            this.f15126e = this.f15124c.m();
        }
        long jQ = q(i9);
        Fragment fragmentH0 = this.f15124c.h0(r(viewGroup.getId(), jQ));
        if (fragmentH0 != null) {
            this.f15126e.h(fragmentH0);
        } else {
            fragmentH0 = p(i9);
            this.f15126e.c(viewGroup.getId(), fragmentH0, r(viewGroup.getId(), jQ));
        }
        if (fragmentH0 != this.f15127f) {
            fragmentH0.setMenuVisibility(false);
            if (this.f15125d == 1) {
                this.f15126e.u(fragmentH0, AbstractC1180j.c.STARTED);
            } else {
                fragmentH0.setUserVisibleHint(false);
            }
        }
        return fragmentH0;
    }

    @Override // N0.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // N0.a
    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // N0.a
    public Parcelable k() {
        return null;
    }

    @Override // N0.a
    public void l(ViewGroup viewGroup, int i9, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f15127f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f15125d == 1) {
                    if (this.f15126e == null) {
                        this.f15126e = this.f15124c.m();
                    }
                    this.f15126e.u(this.f15127f, AbstractC1180j.c.STARTED);
                } else {
                    this.f15127f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f15125d == 1) {
                if (this.f15126e == null) {
                    this.f15126e = this.f15124c.m();
                }
                this.f15126e.u(fragment, AbstractC1180j.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f15127f = fragment;
        }
    }

    @Override // N0.a
    public void n(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract Fragment p(int i9);

    public long q(int i9) {
        return i9;
    }
}
