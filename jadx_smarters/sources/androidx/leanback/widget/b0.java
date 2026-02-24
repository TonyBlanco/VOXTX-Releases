package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.google.android.gms.common.api.a;
import java.util.Map;
import s.C2701g;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15630a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15631b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2701g f15632c;

    public static String e(int i9) {
        return Integer.toString(i9);
    }

    public void a() {
        C2701g c2701g;
        int i9 = this.f15630a;
        if (i9 == 2) {
            if (this.f15631b <= 0) {
                throw new IllegalArgumentException();
            }
            C2701g c2701g2 = this.f15632c;
            if (c2701g2 != null && c2701g2.maxSize() == this.f15631b) {
                return;
            } else {
                c2701g = new C2701g(this.f15631b);
            }
        } else if (i9 == 3 || i9 == 1) {
            C2701g c2701g3 = this.f15632c;
            if (c2701g3 != null && c2701g3.maxSize() == Integer.MAX_VALUE) {
                return;
            } else {
                c2701g = new C2701g(a.e.API_PRIORITY_OTHER);
            }
        } else {
            c2701g = null;
        }
        this.f15632c = c2701g;
    }

    public void b() {
        C2701g c2701g = this.f15632c;
        if (c2701g != null) {
            c2701g.evictAll();
        }
    }

    public final int c() {
        return this.f15631b;
    }

    public final int d() {
        return this.f15630a;
    }

    public final void f(Bundle bundle) {
        C2701g c2701g = this.f15632c;
        if (c2701g == null || bundle == null) {
            return;
        }
        c2701g.evictAll();
        for (String str : bundle.keySet()) {
            this.f15632c.put(str, bundle.getSparseParcelableArray(str));
        }
    }

    public final void g(View view, int i9) {
        if (this.f15632c != null) {
            SparseArray<Parcelable> sparseArray = (SparseArray) this.f15632c.remove(e(i9));
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
            }
        }
    }

    public void h(int i9) {
        C2701g c2701g = this.f15632c;
        if (c2701g == null || c2701g.size() == 0) {
            return;
        }
        this.f15632c.remove(e(i9));
    }

    public final Bundle i() {
        C2701g c2701g = this.f15632c;
        if (c2701g == null || c2701g.size() == 0) {
            return null;
        }
        Map<Object, Object> mapSnapshot = this.f15632c.snapshot();
        Bundle bundle = new Bundle();
        for (Map.Entry<Object, Object> entry : mapSnapshot.entrySet()) {
            bundle.putSparseParcelableArray((String) entry.getKey(), (SparseArray) entry.getValue());
        }
        return bundle;
    }

    public final void j(View view, int i9) {
        int i10 = this.f15630a;
        if (i10 == 1) {
            h(i9);
        } else if (i10 == 2 || i10 == 3) {
            l(view, i9);
        }
    }

    public final Bundle k(Bundle bundle, View view, int i9) {
        if (this.f15630a != 0) {
            String strE = e(i9);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(strE, sparseArray);
        }
        return bundle;
    }

    public final void l(View view, int i9) {
        if (this.f15632c != null) {
            String strE = e(i9);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.f15632c.put(strE, sparseArray);
        }
    }

    public final void m(int i9) {
        this.f15631b = i9;
        a();
    }

    public final void n(int i9) {
        this.f15630a = i9;
        a();
    }
}
