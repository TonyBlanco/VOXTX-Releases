package O1;

import Z1.l;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import j2.C2078d;
import j2.C2087m;
import j2.InterfaceC2077c;
import j2.InterfaceC2081g;
import j2.InterfaceC2082h;
import j2.InterfaceC2086l;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public class j implements InterfaceC2082h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2081g f5482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2086l f5483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2087m f5484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f5485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f5486f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2081g f5487a;

        public a(InterfaceC2081g interfaceC2081g) {
            this.f5487a = interfaceC2081g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5487a.a(j.this);
        }
    }

    public interface b {
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f5489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f5490b;

        public final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f5492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Class f5493b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f5494c = true;

            public a(Object obj) {
                this.f5492a = obj;
                this.f5493b = j.p(obj);
            }

            public f a(Class cls) {
                f fVar = (f) j.this.f5486f.a(new f(j.this.f5481a, j.this.f5485e, this.f5493b, c.this.f5489a, c.this.f5490b, cls, j.this.f5484d, j.this.f5482b, j.this.f5486f));
                if (this.f5494c) {
                    fVar.o(this.f5492a);
                }
                return fVar;
            }
        }

        public c(l lVar, Class cls) {
            this.f5489a = lVar;
            this.f5490b = cls;
        }

        public a c(Object obj) {
            return new a(obj);
        }
    }

    public class d {
        public d() {
        }

        public O1.e a(O1.e eVar) {
            j.n(j.this);
            return eVar;
        }
    }

    public static class e implements InterfaceC2077c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2087m f5497a;

        public e(C2087m c2087m) {
            this.f5497a = c2087m;
        }

        @Override // j2.InterfaceC2077c.a
        public void onConnectivityChanged(boolean z9) {
            if (z9) {
                this.f5497a.d();
            }
        }
    }

    public j(Context context, InterfaceC2081g interfaceC2081g, InterfaceC2086l interfaceC2086l) {
        this(context, interfaceC2081g, interfaceC2086l, new C2087m(), new C2078d());
    }

    public j(Context context, InterfaceC2081g interfaceC2081g, InterfaceC2086l interfaceC2086l, C2087m c2087m, C2078d c2078d) {
        this.f5481a = context.getApplicationContext();
        this.f5482b = interfaceC2081g;
        this.f5483c = interfaceC2086l;
        this.f5484d = c2087m;
        this.f5485e = g.i(context);
        this.f5486f = new d();
        InterfaceC2077c interfaceC2077cA = c2078d.a(context, new e(c2087m));
        if (AbstractC2539h.h()) {
            new Handler(Looper.getMainLooper()).post(new a(interfaceC2081g));
        } else {
            interfaceC2081g.a(this);
        }
        interfaceC2081g.a(interfaceC2077cA);
    }

    public static /* synthetic */ b n(j jVar) {
        jVar.getClass();
        return null;
    }

    public static Class p(Object obj) {
        if (obj != null) {
            return obj.getClass();
        }
        return null;
    }

    public O1.d o() {
        return r(String.class);
    }

    @Override // j2.InterfaceC2082h
    public void onDestroy() {
        this.f5484d.a();
    }

    @Override // j2.InterfaceC2082h
    public void onStart() {
        v();
    }

    @Override // j2.InterfaceC2082h
    public void onStop() {
        u();
    }

    public O1.d q(String str) {
        return (O1.d) o().D(str);
    }

    public final O1.d r(Class cls) {
        l lVarE = g.e(cls, this.f5481a);
        l lVarB = g.b(cls, this.f5481a);
        if (cls == null || lVarE != null || lVarB != null) {
            d dVar = this.f5486f;
            return (O1.d) dVar.a(new O1.d(cls, lVarE, lVarB, this.f5481a, this.f5485e, this.f5484d, this.f5482b, dVar));
        }
        throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
    }

    public void s() {
        this.f5485e.h();
    }

    public void t(int i9) {
        this.f5485e.t(i9);
    }

    public void u() {
        AbstractC2539h.a();
        this.f5484d.b();
    }

    public void v() {
        AbstractC2539h.a();
        this.f5484d.e();
    }

    public c w(l lVar, Class cls) {
        return new c(lVar, cls);
    }
}
