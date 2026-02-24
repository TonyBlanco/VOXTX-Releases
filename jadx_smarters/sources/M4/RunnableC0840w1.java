package M4;

import android.util.Log;

/* JADX INFO: renamed from: M4.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0840w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5103a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0858z1 f5108g;

    public RunnableC0840w1(C0858z1 c0858z1, int i9, String str, Object obj, Object obj2, Object obj3) {
        this.f5108g = c0858z1;
        this.f5103a = i9;
        this.f5104c = str;
        this.f5105d = obj;
        this.f5106e = obj2;
        this.f5107f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0858z1 c0858z1;
        char c9;
        P1 p1F = this.f5108g.f4245a.F();
        if (!p1F.n()) {
            Log.println(6, this.f5108g.D(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        C0858z1 c0858z12 = this.f5108g;
        if (c0858z12.f5139c == 0) {
            if (c0858z12.f4245a.z().H()) {
                c0858z1 = this.f5108g;
                c0858z1.f4245a.b();
                c9 = 'C';
            } else {
                c0858z1 = this.f5108g;
                c0858z1.f4245a.b();
                c9 = 'c';
            }
            c0858z1.f5139c = c9;
        }
        C0858z1 c0858z13 = this.f5108g;
        if (c0858z13.f5140d < 0) {
            c0858z13.f4245a.z().q();
            c0858z13.f5140d = 79000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.f5103a);
        C0858z1 c0858z14 = this.f5108g;
        String strSubstring = "2" + cCharAt + c0858z14.f5139c + c0858z14.f5140d + ":" + C0858z1.A(true, this.f5104c, this.f5105d, this.f5106e, this.f5107f);
        if (strSubstring.length() > 1024) {
            strSubstring = this.f5104c.substring(0, 1024);
        }
        N1 n12 = p1F.f4403d;
        if (n12 != null) {
            n12.b(strSubstring, 1L);
        }
    }
}
