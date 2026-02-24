package c5;

import R4.b;
import android.content.Context;
import android.graphics.Color;
import i5.AbstractC1892b;

/* JADX INFO: renamed from: c5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1274a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f18308f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f18313e;

    public C1274a(Context context) {
        this(AbstractC1892b.b(context, b.f8682q, false), Z4.a.b(context, b.f8681p, 0), Z4.a.b(context, b.f8680o, 0), Z4.a.b(context, b.f8678m, 0), context.getResources().getDisplayMetrics().density);
    }

    public C1274a(boolean z9, int i9, int i10, int i11, float f9) {
        this.f18309a = z9;
        this.f18310b = i9;
        this.f18311c = i10;
        this.f18312d = i11;
        this.f18313e = f9;
    }

    public float a(float f9) {
        if (this.f18313e <= 0.0f || f9 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f9 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i9, float f9) {
        int i10;
        float fA = a(f9);
        int iAlpha = Color.alpha(i9);
        int iH = Z4.a.h(G.a.o(i9, 255), this.f18310b, fA);
        if (fA > 0.0f && (i10 = this.f18311c) != 0) {
            iH = Z4.a.g(iH, G.a.o(i10, f18308f));
        }
        return G.a.o(iH, iAlpha);
    }

    public int c(int i9, float f9) {
        return (this.f18309a && e(i9)) ? b(i9, f9) : i9;
    }

    public boolean d() {
        return this.f18309a;
    }

    public final boolean e(int i9) {
        return G.a.o(i9, 255) == this.f18312d;
    }
}
