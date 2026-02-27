package y;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: y.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2972f implements InterfaceC2970d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2979m f52044d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52047g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2970d f52041a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52042b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f52043c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f52045e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f52048h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2973g f52049i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f52050j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f52051k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List f52052l = new ArrayList();

    /* JADX INFO: renamed from: y.f$a */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C2972f(AbstractC2979m abstractC2979m) {
        this.f52044d = abstractC2979m;
    }

    @Override // y.InterfaceC2970d
    public void a(InterfaceC2970d interfaceC2970d) {
        Iterator it = this.f52052l.iterator();
        while (it.hasNext()) {
            if (!((C2972f) it.next()).f52050j) {
                return;
            }
        }
        this.f52043c = true;
        InterfaceC2970d interfaceC2970d2 = this.f52041a;
        if (interfaceC2970d2 != null) {
            interfaceC2970d2.a(this);
        }
        if (this.f52042b) {
            this.f52044d.a(this);
            return;
        }
        C2972f c2972f = null;
        int i9 = 0;
        for (C2972f c2972f2 : this.f52052l) {
            if (!(c2972f2 instanceof C2973g)) {
                i9++;
                c2972f = c2972f2;
            }
        }
        if (c2972f != null && i9 == 1 && c2972f.f52050j) {
            C2973g c2973g = this.f52049i;
            if (c2973g != null) {
                if (!c2973g.f52050j) {
                    return;
                } else {
                    this.f52046f = this.f52048h * c2973g.f52047g;
                }
            }
            d(c2972f.f52047g + this.f52046f);
        }
        InterfaceC2970d interfaceC2970d3 = this.f52041a;
        if (interfaceC2970d3 != null) {
            interfaceC2970d3.a(this);
        }
    }

    public void b(InterfaceC2970d interfaceC2970d) {
        this.f52051k.add(interfaceC2970d);
        if (this.f52050j) {
            interfaceC2970d.a(interfaceC2970d);
        }
    }

    public void c() {
        this.f52052l.clear();
        this.f52051k.clear();
        this.f52050j = false;
        this.f52047g = 0;
        this.f52043c = false;
        this.f52042b = false;
    }

    public void d(int i9) {
        if (this.f52050j) {
            return;
        }
        this.f52050j = true;
        this.f52047g = i9;
        for (InterfaceC2970d interfaceC2970d : this.f52051k) {
            interfaceC2970d.a(interfaceC2970d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52044d.f52068b.p());
        sb.append(":");
        sb.append(this.f52045e);
        sb.append("(");
        sb.append(this.f52050j ? Integer.valueOf(this.f52047g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f52052l.size());
        sb.append(":d=");
        sb.append(this.f52051k.size());
        sb.append(">");
        return sb.toString();
    }
}
