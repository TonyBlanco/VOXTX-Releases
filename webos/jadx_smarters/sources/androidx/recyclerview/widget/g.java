package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17065e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f17069i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17061a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17066f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17067g = 0;

    public boolean a(RecyclerView.A a9) {
        int i9 = this.f17063c;
        return i9 >= 0 && i9 < a9.c();
    }

    public View b(RecyclerView.v vVar) {
        View viewO = vVar.o(this.f17063c);
        this.f17063c += this.f17064d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f17062b + ", mCurrentPosition=" + this.f17063c + ", mItemDirection=" + this.f17064d + ", mLayoutDirection=" + this.f17065e + ", mStartLine=" + this.f17066f + ", mEndLine=" + this.f17067g + '}';
    }
}
