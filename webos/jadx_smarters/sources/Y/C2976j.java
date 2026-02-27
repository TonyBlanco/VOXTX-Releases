package y;

import x.e;
import y.AbstractC2979m;
import y.C2972f;

/* JADX INFO: renamed from: y.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2976j extends AbstractC2979m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int[] f52054k = new int[2];

    /* JADX INFO: renamed from: y.j$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52055a;

        static {
            int[] iArr = new int[AbstractC2979m.b.values().length];
            f52055a = iArr;
            try {
                iArr[AbstractC2979m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52055a[AbstractC2979m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52055a[AbstractC2979m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C2976j(x.e eVar) {
        super(eVar);
        this.f52074h.f52045e = C2972f.a.LEFT;
        this.f52075i.f52045e = C2972f.a.RIGHT;
        this.f52072f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x029d, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // y.AbstractC2979m, y.InterfaceC2970d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(y.InterfaceC2970d r17) {
        /*
            Method dump skipped, instruction units count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2976j.a(y.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1  */
    @Override // y.AbstractC2979m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y.C2976j.d():void");
    }

    @Override // y.AbstractC2979m
    public void e() {
        C2972f c2972f = this.f52074h;
        if (c2972f.f52050j) {
            this.f52068b.B0(c2972f.f52047g);
        }
    }

    @Override // y.AbstractC2979m
    public void f() {
        this.f52069c = null;
        this.f52074h.c();
        this.f52075i.c();
        this.f52071e.c();
        this.f52073g = false;
    }

    @Override // y.AbstractC2979m
    public boolean m() {
        return this.f52070d != e.b.MATCH_CONSTRAINT || this.f52068b.f51801l == 0;
    }

    public final void q(int[] iArr, int i9, int i10, int i11, int i12, float f9, int i13) {
        int i14 = i10 - i9;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f9) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f9) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f9) + 0.5f);
        int i17 = (int) ((i14 / f9) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    public void r() {
        this.f52073g = false;
        this.f52074h.c();
        this.f52074h.f52050j = false;
        this.f52075i.c();
        this.f52075i.f52050j = false;
        this.f52071e.f52050j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f52068b.p();
    }
}
