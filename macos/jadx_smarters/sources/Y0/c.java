package y0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f52120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f52121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f52122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f52123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f52124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f52125j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f52126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f52127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f52128c = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f52129d = true;

    static {
        c cVar = new c();
        f52120e = cVar;
        m(cVar);
        p(cVar);
        c cVar2 = new c();
        f52121f = cVar2;
        o(cVar2);
        p(cVar2);
        c cVar3 = new c();
        f52122g = cVar3;
        l(cVar3);
        p(cVar3);
        c cVar4 = new c();
        f52123h = cVar4;
        m(cVar4);
        n(cVar4);
        c cVar5 = new c();
        f52124i = cVar5;
        o(cVar5);
        n(cVar5);
        c cVar6 = new c();
        f52125j = cVar6;
        l(cVar6);
        n(cVar6);
    }

    public c() {
        float[] fArr = new float[3];
        this.f52126a = fArr;
        float[] fArr2 = new float[3];
        this.f52127b = fArr2;
        r(fArr);
        r(fArr2);
        q();
    }

    public static void l(c cVar) {
        float[] fArr = cVar.f52127b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    public static void m(c cVar) {
        float[] fArr = cVar.f52127b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    public static void n(c cVar) {
        float[] fArr = cVar.f52126a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    public static void o(c cVar) {
        float[] fArr = cVar.f52127b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    public static void p(c cVar) {
        float[] fArr = cVar.f52126a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    public static void r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    public float a() {
        return this.f52128c[1];
    }

    public float b() {
        return this.f52127b[2];
    }

    public float c() {
        return this.f52126a[2];
    }

    public float d() {
        return this.f52127b[0];
    }

    public float e() {
        return this.f52126a[0];
    }

    public float f() {
        return this.f52128c[2];
    }

    public float g() {
        return this.f52128c[0];
    }

    public float h() {
        return this.f52127b[1];
    }

    public float i() {
        return this.f52126a[1];
    }

    public boolean j() {
        return this.f52129d;
    }

    public void k() {
        int length = this.f52128c.length;
        float f9 = 0.0f;
        for (int i9 = 0; i9 < length; i9++) {
            float f10 = this.f52128c[i9];
            if (f10 > 0.0f) {
                f9 += f10;
            }
        }
        if (f9 != 0.0f) {
            int length2 = this.f52128c.length;
            for (int i10 = 0; i10 < length2; i10++) {
                float[] fArr = this.f52128c;
                float f11 = fArr[i10];
                if (f11 > 0.0f) {
                    fArr[i10] = f11 / f9;
                }
            }
        }
    }

    public final void q() {
        float[] fArr = this.f52128c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }
}
