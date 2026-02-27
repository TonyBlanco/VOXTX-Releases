package b4;

import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: b4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1216g implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f17578b = new ArrayList(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1227s f17580d;

    public AbstractC1216g(boolean z9) {
        this.f17577a = z9;
    }

    @Override // b4.InterfaceC1224o
    public /* synthetic */ Map e() {
        return AbstractC1223n.a(this);
    }

    @Override // b4.InterfaceC1224o
    public final void g(S s9) {
        AbstractC1684a.e(s9);
        if (this.f17578b.contains(s9)) {
            return;
        }
        this.f17578b.add(s9);
        this.f17579c++;
    }

    public final void t(int i9) {
        C1227s c1227s = (C1227s) k0.j(this.f17580d);
        for (int i10 = 0; i10 < this.f17579c; i10++) {
            ((S) this.f17578b.get(i10)).f(this, c1227s, this.f17577a, i9);
        }
    }

    public final void u() {
        C1227s c1227s = (C1227s) k0.j(this.f17580d);
        for (int i9 = 0; i9 < this.f17579c; i9++) {
            ((S) this.f17578b.get(i9)).i(this, c1227s, this.f17577a);
        }
        this.f17580d = null;
    }

    public final void v(C1227s c1227s) {
        for (int i9 = 0; i9 < this.f17579c; i9++) {
            ((S) this.f17578b.get(i9)).c(this, c1227s, this.f17577a);
        }
    }

    public final void w(C1227s c1227s) {
        this.f17580d = c1227s;
        for (int i9 = 0; i9 < this.f17579c; i9++) {
            ((S) this.f17578b.get(i9)).a(this, c1227s, this.f17577a);
        }
    }
}
