package K0;

import K0.AbstractC0681l;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: K0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0685p extends AbstractC0681l {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f3559L;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f3557J = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f3558K = true;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f3560M = false;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f3561N = 0;

    /* JADX INFO: renamed from: K0.p$a */
    public class a extends AbstractC0682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0681l f3562a;

        public a(AbstractC0681l abstractC0681l) {
            this.f3562a = abstractC0681l;
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            this.f3562a.U();
            abstractC0681l.Q(this);
        }
    }

    /* JADX INFO: renamed from: K0.p$b */
    public static class b extends AbstractC0682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C0685p f3564a;

        public b(C0685p c0685p) {
            this.f3564a = c0685p;
        }

        @Override // K0.AbstractC0682m, K0.AbstractC0681l.f
        public void a(AbstractC0681l abstractC0681l) {
            C0685p c0685p = this.f3564a;
            if (c0685p.f3560M) {
                return;
            }
            c0685p.b0();
            this.f3564a.f3560M = true;
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            C0685p c0685p = this.f3564a;
            int i9 = c0685p.f3559L - 1;
            c0685p.f3559L = i9;
            if (i9 == 0) {
                c0685p.f3560M = false;
                c0685p.p();
            }
            abstractC0681l.Q(this);
        }
    }

    @Override // K0.AbstractC0681l
    public void O(View view) {
        super.O(view);
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).O(view);
        }
    }

    @Override // K0.AbstractC0681l
    public void S(View view) {
        super.S(view);
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).S(view);
        }
    }

    @Override // K0.AbstractC0681l
    public void U() {
        if (this.f3557J.isEmpty()) {
            b0();
            p();
            return;
        }
        p0();
        if (this.f3558K) {
            Iterator it = this.f3557J.iterator();
            while (it.hasNext()) {
                ((AbstractC0681l) it.next()).U();
            }
            return;
        }
        for (int i9 = 1; i9 < this.f3557J.size(); i9++) {
            ((AbstractC0681l) this.f3557J.get(i9 - 1)).b(new a((AbstractC0681l) this.f3557J.get(i9)));
        }
        AbstractC0681l abstractC0681l = (AbstractC0681l) this.f3557J.get(0);
        if (abstractC0681l != null) {
            abstractC0681l.U();
        }
    }

    @Override // K0.AbstractC0681l
    public void W(AbstractC0681l.e eVar) {
        super.W(eVar);
        this.f3561N |= 8;
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).W(eVar);
        }
    }

    @Override // K0.AbstractC0681l
    public void Y(AbstractC0676g abstractC0676g) {
        super.Y(abstractC0676g);
        this.f3561N |= 4;
        if (this.f3557J != null) {
            for (int i9 = 0; i9 < this.f3557J.size(); i9++) {
                ((AbstractC0681l) this.f3557J.get(i9)).Y(abstractC0676g);
            }
        }
    }

    @Override // K0.AbstractC0681l
    public void Z(AbstractC0684o abstractC0684o) {
        super.Z(abstractC0684o);
        this.f3561N |= 2;
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).Z(abstractC0684o);
        }
    }

    @Override // K0.AbstractC0681l
    public String c0(String str) {
        String strC0 = super.c0(str);
        for (int i9 = 0; i9 < this.f3557J.size(); i9++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strC0);
            sb.append("\n");
            sb.append(((AbstractC0681l) this.f3557J.get(i9)).c0(str + "  "));
            strC0 = sb.toString();
        }
        return strC0;
    }

    @Override // K0.AbstractC0681l
    public void cancel() {
        super.cancel();
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).cancel();
        }
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public C0685p b(AbstractC0681l.f fVar) {
        return (C0685p) super.b(fVar);
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public C0685p c(View view) {
        for (int i9 = 0; i9 < this.f3557J.size(); i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).c(view);
        }
        return (C0685p) super.c(view);
    }

    public C0685p f0(AbstractC0681l abstractC0681l) {
        g0(abstractC0681l);
        long j9 = this.f3519d;
        if (j9 >= 0) {
            abstractC0681l.V(j9);
        }
        if ((this.f3561N & 1) != 0) {
            abstractC0681l.X(t());
        }
        if ((this.f3561N & 2) != 0) {
            x();
            abstractC0681l.Z(null);
        }
        if ((this.f3561N & 4) != 0) {
            abstractC0681l.Y(w());
        }
        if ((this.f3561N & 8) != 0) {
            abstractC0681l.W(s());
        }
        return this;
    }

    @Override // K0.AbstractC0681l
    public void g(s sVar) {
        if (H(sVar.f3569b)) {
            for (AbstractC0681l abstractC0681l : this.f3557J) {
                if (abstractC0681l.H(sVar.f3569b)) {
                    abstractC0681l.g(sVar);
                    sVar.f3570c.add(abstractC0681l);
                }
            }
        }
    }

    public final void g0(AbstractC0681l abstractC0681l) {
        this.f3557J.add(abstractC0681l);
        abstractC0681l.f3534s = this;
    }

    public AbstractC0681l h0(int i9) {
        if (i9 < 0 || i9 >= this.f3557J.size()) {
            return null;
        }
        return (AbstractC0681l) this.f3557J.get(i9);
    }

    @Override // K0.AbstractC0681l
    public void i(s sVar) {
        super.i(sVar);
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).i(sVar);
        }
    }

    public int i0() {
        return this.f3557J.size();
    }

    @Override // K0.AbstractC0681l
    public void j(s sVar) {
        if (H(sVar.f3569b)) {
            for (AbstractC0681l abstractC0681l : this.f3557J) {
                if (abstractC0681l.H(sVar.f3569b)) {
                    abstractC0681l.j(sVar);
                    sVar.f3570c.add(abstractC0681l);
                }
            }
        }
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public C0685p Q(AbstractC0681l.f fVar) {
        return (C0685p) super.Q(fVar);
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public C0685p R(View view) {
        for (int i9 = 0; i9 < this.f3557J.size(); i9++) {
            ((AbstractC0681l) this.f3557J.get(i9)).R(view);
        }
        return (C0685p) super.R(view);
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public C0685p V(long j9) {
        ArrayList arrayList;
        super.V(j9);
        if (this.f3519d >= 0 && (arrayList = this.f3557J) != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((AbstractC0681l) this.f3557J.get(i9)).V(j9);
            }
        }
        return this;
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC0681l clone() {
        C0685p c0685p = (C0685p) super.clone();
        c0685p.f3557J = new ArrayList();
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            c0685p.g0(((AbstractC0681l) this.f3557J.get(i9)).clone());
        }
        return c0685p;
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public C0685p X(TimeInterpolator timeInterpolator) {
        this.f3561N |= 1;
        ArrayList arrayList = this.f3557J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((AbstractC0681l) this.f3557J.get(i9)).X(timeInterpolator);
            }
        }
        return (C0685p) super.X(timeInterpolator);
    }

    public C0685p n0(int i9) {
        if (i9 == 0) {
            this.f3558K = true;
        } else {
            if (i9 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i9);
            }
            this.f3558K = false;
        }
        return this;
    }

    @Override // K0.AbstractC0681l
    public void o(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        long jZ = z();
        int size = this.f3557J.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC0681l abstractC0681l = (AbstractC0681l) this.f3557J.get(i9);
            if (jZ > 0 && (this.f3558K || i9 == 0)) {
                long jZ2 = abstractC0681l.z();
                if (jZ2 > 0) {
                    abstractC0681l.a0(jZ2 + jZ);
                } else {
                    abstractC0681l.a0(jZ);
                }
            }
            abstractC0681l.o(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    @Override // K0.AbstractC0681l
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public C0685p a0(long j9) {
        return (C0685p) super.a0(j9);
    }

    public final void p0() {
        b bVar = new b(this);
        Iterator it = this.f3557J.iterator();
        while (it.hasNext()) {
            ((AbstractC0681l) it.next()).b(bVar);
        }
        this.f3559L = this.f3557J.size();
    }
}
