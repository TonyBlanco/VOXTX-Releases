package x;

import w.C2899d;
import x.d;
import x.e;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f51853w0 = -1.0f;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f51854x0 = -1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f51855y0 = -1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public d f51856z0 = this.f51755C;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f51851A0 = 0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public int f51852B0 = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51857a;

        static {
            int[] iArr = new int[d.b.values().length];
            f51857a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51857a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51857a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51857a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51857a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51857a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51857a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51857a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f51857a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.f51763K.clear();
        this.f51763K.add(this.f51856z0);
        int length = this.f51762J.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f51762J[i9] = this.f51856z0;
        }
    }

    @Override // x.e
    public void F0(C2899d c2899d) {
        if (E() == null) {
            return;
        }
        int iX = c2899d.x(this.f51856z0);
        if (this.f51851A0 == 1) {
            B0(iX);
            C0(0);
            e0(E().t());
            A0(0);
            return;
        }
        B0(0);
        C0(iX);
        A0(E().N());
        e0(0);
    }

    public int G0() {
        return this.f51851A0;
    }

    public int H0() {
        return this.f51854x0;
    }

    public int I0() {
        return this.f51855y0;
    }

    public float J0() {
        return this.f51853w0;
    }

    public void K0(int i9) {
        if (i9 > -1) {
            this.f51853w0 = -1.0f;
            this.f51854x0 = i9;
            this.f51855y0 = -1;
        }
    }

    public void L0(int i9) {
        if (i9 > -1) {
            this.f51853w0 = -1.0f;
            this.f51854x0 = -1;
            this.f51855y0 = i9;
        }
    }

    public void M0(float f9) {
        if (f9 > -1.0f) {
            this.f51853w0 = f9;
            this.f51854x0 = -1;
            this.f51855y0 = -1;
        }
    }

    public void N0(int i9) {
        if (this.f51851A0 == i9) {
            return;
        }
        this.f51851A0 = i9;
        this.f51763K.clear();
        this.f51856z0 = this.f51851A0 == 1 ? this.f51754B : this.f51755C;
        this.f51763K.add(this.f51856z0);
        int length = this.f51762J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f51762J[i10] = this.f51856z0;
        }
    }

    @Override // x.e
    public void f(C2899d c2899d) {
        f fVar = (f) E();
        if (fVar == null) {
            return;
        }
        d dVarK = fVar.k(d.b.LEFT);
        d dVarK2 = fVar.k(d.b.RIGHT);
        e eVar = this.f51766N;
        boolean z9 = eVar != null && eVar.f51765M[0] == e.b.WRAP_CONTENT;
        if (this.f51851A0 == 0) {
            dVarK = fVar.k(d.b.TOP);
            dVarK2 = fVar.k(d.b.BOTTOM);
            e eVar2 = this.f51766N;
            z9 = eVar2 != null && eVar2.f51765M[1] == e.b.WRAP_CONTENT;
        }
        if (this.f51854x0 != -1) {
            w.i iVarQ = c2899d.q(this.f51856z0);
            c2899d.e(iVarQ, c2899d.q(dVarK), this.f51854x0, 8);
            if (z9) {
                c2899d.h(c2899d.q(dVarK2), iVarQ, 0, 5);
                return;
            }
            return;
        }
        if (this.f51855y0 == -1) {
            if (this.f51853w0 != -1.0f) {
                c2899d.d(C2899d.s(c2899d, c2899d.q(this.f51856z0), c2899d.q(dVarK2), this.f51853w0));
                return;
            }
            return;
        }
        w.i iVarQ2 = c2899d.q(this.f51856z0);
        w.i iVarQ3 = c2899d.q(dVarK2);
        c2899d.e(iVarQ2, iVarQ3, -this.f51855y0, 8);
        if (z9) {
            c2899d.h(iVarQ2, c2899d.q(dVarK), 0, 5);
            c2899d.h(iVarQ3, iVarQ2, 0, 5);
        }
    }

    @Override // x.e
    public boolean g() {
        return true;
    }

    @Override // x.e
    public d k(d.b bVar) {
        switch (a.f51857a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f51851A0 == 1) {
                    return this.f51856z0;
                }
                break;
            case 3:
            case 4:
                if (this.f51851A0 == 0) {
                    return this.f51856z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }
}
