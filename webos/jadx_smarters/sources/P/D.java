package P;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6737b;

    public D(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f6736a | this.f6737b;
    }

    public void b(View view, View view2, int i9) {
        c(view, view2, i9, 0);
    }

    public void c(View view, View view2, int i9, int i10) {
        if (i10 == 1) {
            this.f6737b = i9;
        } else {
            this.f6736a = i9;
        }
    }

    public void d(View view, int i9) {
        if (i9 == 1) {
            this.f6737b = 0;
        } else {
            this.f6736a = 0;
        }
    }
}
