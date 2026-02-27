package T4;

import P.L;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9542f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9543g = true;

    public e(View view) {
        this.f9537a = view;
    }

    public void a() {
        View view = this.f9537a;
        L.d0(view, this.f9540d - (view.getTop() - this.f9538b));
        View view2 = this.f9537a;
        L.c0(view2, this.f9541e - (view2.getLeft() - this.f9539c));
    }

    public int b() {
        return this.f9540d;
    }

    public void c() {
        this.f9538b = this.f9537a.getTop();
        this.f9539c = this.f9537a.getLeft();
    }

    public boolean d(int i9) {
        if (!this.f9543g || this.f9541e == i9) {
            return false;
        }
        this.f9541e = i9;
        a();
        return true;
    }

    public boolean e(int i9) {
        if (!this.f9542f || this.f9540d == i9) {
            return false;
        }
        this.f9540d = i9;
        a();
        return true;
    }
}
