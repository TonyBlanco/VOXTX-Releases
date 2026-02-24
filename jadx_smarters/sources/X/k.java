package x;

import java.util.ArrayList;
import w.C2898c;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f51861w0 = new ArrayList();

    public abstract void G0();

    public void H0(e eVar) {
        this.f51861w0.remove(eVar);
        eVar.s0(null);
    }

    public void I0() {
        this.f51861w0.clear();
    }

    @Override // x.e
    public void W() {
        this.f51861w0.clear();
        super.W();
    }

    @Override // x.e
    public void X(C2898c c2898c) {
        super.X(c2898c);
        int size = this.f51861w0.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((e) this.f51861w0.get(i9)).X(c2898c);
        }
    }

    public void b(e eVar) {
        this.f51861w0.add(eVar);
        if (eVar.E() != null) {
            ((k) eVar.E()).H0(eVar);
        }
        eVar.s0(this);
    }
}
