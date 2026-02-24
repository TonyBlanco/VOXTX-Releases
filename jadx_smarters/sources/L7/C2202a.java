package l7;

import android.content.Context;
import android.graphics.Bitmap;
import com.android.volley.toolbox.a;
import h1.o;
import i1.C1875b;
import i1.C1877d;
import i1.h;
import s.C2701g;

/* JADX INFO: renamed from: l7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2202a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2202a f44223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f44224d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f44225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.android.volley.toolbox.a f44226b;

    /* JADX INFO: renamed from: l7.a$a, reason: collision with other inner class name */
    public class C0375a implements a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2701g f44227a = new C2701g(20);

        public C0375a() {
        }

        @Override // com.android.volley.toolbox.a.f
        public void a(String str, Bitmap bitmap) {
            this.f44227a.put(str, bitmap);
        }

        @Override // com.android.volley.toolbox.a.f
        public Bitmap b(String str) {
            return (Bitmap) this.f44227a.get(str);
        }
    }

    public C2202a(Context context) {
        f44224d = context;
        o oVarC = c();
        this.f44225a = oVarC;
        this.f44226b = new com.android.volley.toolbox.a(oVarC, new C0375a());
    }

    public static synchronized C2202a b(Context context) {
        try {
            if (f44223c == null) {
                f44223c = new C2202a(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44223c;
    }

    public com.android.volley.toolbox.a a() {
        return this.f44226b;
    }

    public final o c() {
        if (this.f44225a == null) {
            o oVar = new o(new C1877d(f44224d.getCacheDir(), 10485760), new C1875b(new h()));
            this.f44225a = oVar;
            oVar.g();
        }
        return this.f44225a;
    }
}
