package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1180j;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class u extends N0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f15150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f15152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f15153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f15154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Fragment f15155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15156i;

    public u(m mVar) {
        this(mVar, 0);
    }

    public u(m mVar, int i9) {
        this.f15152e = null;
        this.f15153f = new ArrayList();
        this.f15154g = new ArrayList();
        this.f15155h = null;
        this.f15150c = mVar;
        this.f15151d = i9;
    }

    @Override // N0.a
    public void a(ViewGroup viewGroup, int i9, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f15152e == null) {
            this.f15152e = this.f15150c.m();
        }
        while (this.f15153f.size() <= i9) {
            this.f15153f.add(null);
        }
        this.f15153f.set(i9, fragment.isAdded() ? this.f15150c.m1(fragment) : null);
        this.f15154g.set(i9, null);
        this.f15152e.p(fragment);
        if (fragment.equals(this.f15155h)) {
            this.f15155h = null;
        }
    }

    @Override // N0.a
    public void b(ViewGroup viewGroup) {
        w wVar = this.f15152e;
        if (wVar != null) {
            if (!this.f15156i) {
                try {
                    this.f15156i = true;
                    wVar.l();
                } finally {
                    this.f15156i = false;
                }
            }
            this.f15152e = null;
        }
    }

    @Override // N0.a
    public Object g(ViewGroup viewGroup, int i9) {
        Fragment.m mVar;
        Fragment fragment;
        if (this.f15154g.size() > i9 && (fragment = (Fragment) this.f15154g.get(i9)) != null) {
            return fragment;
        }
        if (this.f15152e == null) {
            this.f15152e = this.f15150c.m();
        }
        Fragment fragmentP = p(i9);
        if (this.f15153f.size() > i9 && (mVar = (Fragment.m) this.f15153f.get(i9)) != null) {
            fragmentP.setInitialSavedState(mVar);
        }
        while (this.f15154g.size() <= i9) {
            this.f15154g.add(null);
        }
        fragmentP.setMenuVisibility(false);
        if (this.f15151d == 0) {
            fragmentP.setUserVisibleHint(false);
        }
        this.f15154g.set(i9, fragmentP);
        this.f15152e.b(viewGroup.getId(), fragmentP);
        if (this.f15151d == 1) {
            this.f15152e.u(fragmentP, AbstractC1180j.c.STARTED);
        }
        return fragmentP;
    }

    @Override // N0.a
    public boolean h(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // N0.a
    public void j(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f15153f.clear();
            this.f15154g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f15153f.add((Fragment.m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i9 = Integer.parseInt(str.substring(1));
                    Fragment fragmentO0 = this.f15150c.o0(bundle, str);
                    if (fragmentO0 != null) {
                        while (this.f15154g.size() <= i9) {
                            this.f15154g.add(null);
                        }
                        fragmentO0.setMenuVisibility(false);
                        this.f15154g.set(i9, fragmentO0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // N0.a
    public Parcelable k() {
        Bundle bundle;
        if (this.f15153f.size() > 0) {
            bundle = new Bundle();
            Fragment.m[] mVarArr = new Fragment.m[this.f15153f.size()];
            this.f15153f.toArray(mVarArr);
            bundle.putParcelableArray("states", mVarArr);
        } else {
            bundle = null;
        }
        for (int i9 = 0; i9 < this.f15154g.size(); i9++) {
            Fragment fragment = (Fragment) this.f15154g.get(i9);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f15150c.c1(bundle, "f" + i9, fragment);
            }
        }
        return bundle;
    }

    @Override // N0.a
    public void l(ViewGroup viewGroup, int i9, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f15155h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f15151d == 1) {
                    if (this.f15152e == null) {
                        this.f15152e = this.f15150c.m();
                    }
                    this.f15152e.u(this.f15155h, AbstractC1180j.c.STARTED);
                } else {
                    this.f15155h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f15151d == 1) {
                if (this.f15152e == null) {
                    this.f15152e = this.f15150c.m();
                }
                this.f15152e.u(fragment, AbstractC1180j.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f15155h = fragment;
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
}
