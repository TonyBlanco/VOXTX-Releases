package y;

import java.util.ArrayList;

/* JADX INFO: renamed from: y.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2977k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f52056h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2979m f52059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2979m f52060d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52062f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52063g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f52057a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f52058b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f52061e = new ArrayList();

    public C2977k(AbstractC2979m abstractC2979m, int i9) {
        this.f52059c = null;
        this.f52060d = null;
        int i10 = f52056h;
        this.f52062f = i10;
        f52056h = i10 + 1;
        this.f52059c = abstractC2979m;
        this.f52060d = abstractC2979m;
        this.f52063g = i9;
    }

    public void a(AbstractC2979m abstractC2979m) {
        this.f52061e.add(abstractC2979m);
        this.f52060d = abstractC2979m;
    }

    public long b(x.f fVar, int i9) {
        long j9;
        AbstractC2979m abstractC2979m;
        long j10;
        long jD;
        AbstractC2979m abstractC2979m2 = this.f52059c;
        if (abstractC2979m2 instanceof C2969c) {
            if (((C2969c) abstractC2979m2).f52072f != i9) {
                return 0L;
            }
        } else if (i9 == 0) {
            if (!(abstractC2979m2 instanceof C2976j)) {
                return 0L;
            }
        } else if (!(abstractC2979m2 instanceof C2978l)) {
            return 0L;
        }
        C2972f c2972f = (i9 == 0 ? fVar.f51787e : fVar.f51789f).f52074h;
        C2972f c2972f2 = (i9 == 0 ? fVar.f51787e : fVar.f51789f).f52075i;
        boolean zContains = abstractC2979m2.f52074h.f52052l.contains(c2972f);
        boolean zContains2 = this.f52059c.f52075i.f52052l.contains(c2972f2);
        long j11 = this.f52059c.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                jD = d(this.f52059c.f52074h, r13.f52046f);
                j10 = ((long) this.f52059c.f52074h.f52046f) + j11;
            } else if (zContains2) {
                long jC = c(this.f52059c.f52075i, r13.f52046f);
                j10 = ((long) (-this.f52059c.f52075i.f52046f)) + j11;
                jD = -jC;
            } else {
                AbstractC2979m abstractC2979m3 = this.f52059c;
                j9 = ((long) abstractC2979m3.f52074h.f52046f) + abstractC2979m3.j();
                abstractC2979m = this.f52059c;
            }
            return Math.max(jD, j10);
        }
        long jD2 = d(this.f52059c.f52074h, 0L);
        long jC2 = c(this.f52059c.f52075i, 0L);
        long j12 = jD2 - j11;
        AbstractC2979m abstractC2979m4 = this.f52059c;
        int i10 = abstractC2979m4.f52075i.f52046f;
        if (j12 >= (-i10)) {
            j12 += (long) i10;
        }
        int i11 = abstractC2979m4.f52074h.f52046f;
        long j13 = ((-jC2) - j11) - ((long) i11);
        if (j13 >= i11) {
            j13 -= (long) i11;
        }
        float fM = abstractC2979m4.f52068b.m(i9);
        float f9 = fM > 0.0f ? (long) ((j13 / fM) + (j12 / (1.0f - fM))) : 0L;
        long j14 = ((long) ((f9 * fM) + 0.5f)) + j11 + ((long) ((f9 * (1.0f - fM)) + 0.5f));
        abstractC2979m = this.f52059c;
        j9 = ((long) abstractC2979m.f52074h.f52046f) + j14;
        return j9 - ((long) abstractC2979m.f52075i.f52046f);
    }

    public final long c(C2972f c2972f, long j9) {
        AbstractC2979m abstractC2979m = c2972f.f52044d;
        if (abstractC2979m instanceof C2975i) {
            return j9;
        }
        int size = c2972f.f52051k.size();
        long jMin = j9;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC2970d interfaceC2970d = (InterfaceC2970d) c2972f.f52051k.get(i9);
            if (interfaceC2970d instanceof C2972f) {
                C2972f c2972f2 = (C2972f) interfaceC2970d;
                if (c2972f2.f52044d != abstractC2979m) {
                    jMin = Math.min(jMin, c(c2972f2, ((long) c2972f2.f52046f) + j9));
                }
            }
        }
        if (c2972f != abstractC2979m.f52075i) {
            return jMin;
        }
        long j10 = j9 - abstractC2979m.j();
        return Math.min(Math.min(jMin, c(abstractC2979m.f52074h, j10)), j10 - ((long) abstractC2979m.f52074h.f52046f));
    }

    public final long d(C2972f c2972f, long j9) {
        AbstractC2979m abstractC2979m = c2972f.f52044d;
        if (abstractC2979m instanceof C2975i) {
            return j9;
        }
        int size = c2972f.f52051k.size();
        long jMax = j9;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC2970d interfaceC2970d = (InterfaceC2970d) c2972f.f52051k.get(i9);
            if (interfaceC2970d instanceof C2972f) {
                C2972f c2972f2 = (C2972f) interfaceC2970d;
                if (c2972f2.f52044d != abstractC2979m) {
                    jMax = Math.max(jMax, d(c2972f2, ((long) c2972f2.f52046f) + j9));
                }
            }
        }
        if (c2972f != abstractC2979m.f52074h) {
            return jMax;
        }
        long j10 = j9 + abstractC2979m.j();
        return Math.max(Math.max(jMax, d(abstractC2979m.f52075i, j10)), j10 - ((long) abstractC2979m.f52075i.f52046f));
    }
}
