package T4;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f9534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9536c;

    public d() {
        this.f9535b = 0;
        this.f9536c = 0;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9535b = 0;
        this.f9536c = 0;
    }

    public int E() {
        e eVar = this.f9534a;
        if (eVar != null) {
            return eVar.b();
        }
        return 0;
    }

    public void F(CoordinatorLayout coordinatorLayout, View view, int i9) {
        coordinatorLayout.J(view, i9);
    }

    public boolean G(int i9) {
        e eVar = this.f9534a;
        if (eVar != null) {
            return eVar.e(i9);
        }
        this.f9535b = i9;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i9) {
        F(coordinatorLayout, view, i9);
        if (this.f9534a == null) {
            this.f9534a = new e(view);
        }
        this.f9534a.c();
        this.f9534a.a();
        int i10 = this.f9535b;
        if (i10 != 0) {
            this.f9534a.e(i10);
            this.f9535b = 0;
        }
        int i11 = this.f9536c;
        if (i11 == 0) {
            return true;
        }
        this.f9534a.d(i11);
        this.f9536c = 0;
        return true;
    }
}
