package G;

import F.e;
import F.h;
import M.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import s.C2701g;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2701g f2114b;

    public static class a extends g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h.e f2115a;

        public a(h.e eVar) {
            this.f2115a = eVar;
        }

        @Override // M.g.c
        public void a(int i9) {
            h.e eVar = this.f2115a;
            if (eVar != null) {
                eVar.f(i9);
            }
        }

        @Override // M.g.c
        public void b(Typeface typeface) {
            h.e eVar = this.f2115a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i9 = Build.VERSION.SDK_INT;
        f2113a = i9 >= 29 ? new k() : i9 >= 28 ? new j() : i9 >= 26 ? new i() : (i9 < 24 || !h.i()) ? new g() : new h();
        f2114b = new C2701g(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i9) {
        if (context != null) {
            return Typeface.create(typeface, i9);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i9) {
        return f2113a.b(context, cancellationSignal, bVarArr, i9);
    }

    public static Typeface c(Context context, e.b bVar, Resources resources, int i9, String str, int i10, int i11, h.e eVar, Handler handler, boolean z9) {
        Typeface typefaceA;
        if (bVar instanceof e.C0022e) {
            e.C0022e c0022e = (e.C0022e) bVar;
            Typeface typefaceG = g(c0022e.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = M.g.c(context, c0022e.b(), i11, !z9 ? eVar != null : c0022e.a() != 0, z9 ? c0022e.d() : -1, h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f2113a.a(context, (e.c) bVar, resources, i11);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f2114b.put(e(resources, i9, str, i10, i11), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i9, String str, int i10, int i11) {
        Typeface typefaceD = f2113a.d(context, resources, i9, str, i11);
        if (typefaceD != null) {
            f2114b.put(e(resources, i9, str, i10, i11), typefaceD);
        }
        return typefaceD;
    }

    public static String e(Resources resources, int i9, String str, int i10, int i11) {
        return resources.getResourcePackageName(i9) + '-' + str + '-' + i10 + '-' + i9 + '-' + i11;
    }

    public static Typeface f(Resources resources, int i9, String str, int i10, int i11) {
        return (Typeface) f2114b.get(e(resources, i9, str, i10, i11));
    }

    public static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
