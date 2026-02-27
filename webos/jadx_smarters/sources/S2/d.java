package s2;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class d extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f49882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f49887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f49888j;

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void E(f fVar, int i9) {
        fVar.P();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public f L(ViewGroup viewGroup, int i9) {
        f fVar = new f(LayoutInflater.from(viewGroup.getContext()), viewGroup, this.f49883e);
        fVar.U(this.f49885g);
        fVar.S(this.f49884f);
        fVar.V(this.f49888j);
        fVar.T(this.f49886h);
        fVar.Q(this.f49887i);
        return fVar;
    }

    public void l0(boolean z9) {
        this.f49887i = z9;
    }

    public void m0(int i9) {
        this.f49883e = i9;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f49882d;
    }

    public void n0(int i9) {
        this.f49882d = i9;
    }

    public void p0(int i9) {
        this.f49884f = i9;
    }

    public void q0(int i9) {
        this.f49885g = i9;
    }

    public void r0(int i9) {
        this.f49886h = i9;
    }

    public void s0(Drawable drawable) {
        this.f49888j = drawable;
    }
}
