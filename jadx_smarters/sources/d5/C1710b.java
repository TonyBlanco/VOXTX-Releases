package d5;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: d5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1710b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f39839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39840b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39841c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C1710b(InterfaceC1709a interfaceC1709a) {
        this.f39839a = (View) interfaceC1709a;
    }

    public final void a() {
        ViewParent parent = this.f39839a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).f(this.f39839a);
        }
    }

    public int b() {
        return this.f39841c;
    }

    public boolean c() {
        return this.f39840b;
    }

    public void d(Bundle bundle) {
        this.f39840b = bundle.getBoolean("expanded", false);
        this.f39841c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f39840b) {
            a();
        }
    }

    public Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f39840b);
        bundle.putInt("expandedComponentIdHint", this.f39841c);
        return bundle;
    }

    public void f(int i9) {
        this.f39841c = i9;
    }
}
