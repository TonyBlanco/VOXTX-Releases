package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import c0.C1242a;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f14819d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f14821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f14822c = 0;

    public g(m mVar, int i9) {
        this.f14821b = mVar;
        this.f14820a = i9;
    }

    public void a(Canvas canvas, float f9, float f10, Paint paint) {
        Typeface typefaceG = this.f14821b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f14821b.c(), this.f14820a * 2, 2, f9, f10, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i9) {
        return g().h(i9);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f14822c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final C1242a g() {
        ThreadLocal threadLocal = f14819d;
        C1242a c1242a = (C1242a) threadLocal.get();
        if (c1242a == null) {
            c1242a = new C1242a();
            threadLocal.set(c1242a);
        }
        this.f14821b.d().j(c1242a, this.f14820a);
        return c1242a;
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z9) {
        this.f14822c = z9 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i9 = 0; i9 < iC; i9++) {
            sb.append(Integer.toHexString(b(i9)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
