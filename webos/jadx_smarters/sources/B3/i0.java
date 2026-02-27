package B3;

import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1681B;
import d4.AbstractC1687d;
import java.util.ArrayList;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements InterfaceC0901n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i0 f587e = new i0(new g0[0]);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f588f = d4.k0.A0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC0901n.a f589g = new InterfaceC0901n.a() { // from class: B3.h0
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return i0.d(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f590a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2743y f591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f592d;

    public i0(g0... g0VarArr) {
        this.f591c = AbstractC2743y.s(g0VarArr);
        this.f590a = g0VarArr.length;
        e();
    }

    public static /* synthetic */ i0 d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f588f);
        return parcelableArrayList == null ? new i0(new g0[0]) : new i0((g0[]) AbstractC1687d.d(g0.f580i, parcelableArrayList).toArray(new g0[0]));
    }

    private void e() {
        int i9 = 0;
        while (i9 < this.f591c.size()) {
            int i10 = i9 + 1;
            for (int i11 = i10; i11 < this.f591c.size(); i11++) {
                if (((g0) this.f591c.get(i9)).equals(this.f591c.get(i11))) {
                    AbstractC1681B.e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i9 = i10;
        }
    }

    public g0 b(int i9) {
        return (g0) this.f591c.get(i9);
    }

    public int c(g0 g0Var) {
        int iIndexOf = this.f591c.indexOf(g0Var);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f590a == i0Var.f590a && this.f591c.equals(i0Var.f591c);
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f588f, AbstractC1687d.i(this.f591c));
        return bundle;
    }

    public int hashCode() {
        if (this.f592d == 0) {
            this.f592d = this.f591c.hashCode();
        }
        return this.f592d;
    }
}
