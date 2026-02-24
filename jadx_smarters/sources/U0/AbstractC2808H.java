package u0;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: u0.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2808H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50887a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f50888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f50889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f50890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2807G f50891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2809I f50893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f50894i;

    /* JADX INFO: renamed from: u0.H$a */
    public static abstract class a {
        public abstract void a(AbstractC2808H abstractC2808H, C2809I c2809i);
    }

    /* JADX INFO: renamed from: u0.H$b */
    public static abstract class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f50895a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Executor f50896b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f50897c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C2806F f50898d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Collection f50899e;

        /* JADX INFO: renamed from: u0.H$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f50900a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C2806F f50901c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Collection f50902d;

            public a(d dVar, C2806F c2806f, Collection collection) {
                this.f50900a = dVar;
                this.f50901c = c2806f;
                this.f50902d = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f50900a.a(b.this, this.f50901c, this.f50902d);
            }
        }

        /* JADX INFO: renamed from: u0.H$b$b, reason: collision with other inner class name */
        public class RunnableC0459b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f50904a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C2806F f50905c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Collection f50906d;

            public RunnableC0459b(d dVar, C2806F c2806f, Collection collection) {
                this.f50904a = dVar;
                this.f50905c = c2806f;
                this.f50906d = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f50904a.a(b.this, this.f50905c, this.f50906d);
            }
        }

        /* JADX INFO: renamed from: u0.H$b$c */
        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C2806F f50908a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f50909b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f50910c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final boolean f50911d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final boolean f50912e;

            /* JADX INFO: renamed from: u0.H$b$c$a */
            public static final class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final C2806F f50913a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f50914b = 1;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public boolean f50915c = false;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public boolean f50916d = false;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public boolean f50917e = false;

                public a(C2806F c2806f) {
                    if (c2806f == null) {
                        throw new NullPointerException("descriptor must not be null");
                    }
                    this.f50913a = c2806f;
                }

                public c a() {
                    return new c(this.f50913a, this.f50914b, this.f50915c, this.f50916d, this.f50917e);
                }

                public a b(boolean z9) {
                    this.f50916d = z9;
                    return this;
                }

                public a c(boolean z9) {
                    this.f50917e = z9;
                    return this;
                }

                public a d(boolean z9) {
                    this.f50915c = z9;
                    return this;
                }

                public a e(int i9) {
                    this.f50914b = i9;
                    return this;
                }
            }

            public c(C2806F c2806f, int i9, boolean z9, boolean z10, boolean z11) {
                this.f50908a = c2806f;
                this.f50909b = i9;
                this.f50910c = z9;
                this.f50911d = z10;
                this.f50912e = z11;
            }

            public static c a(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new c(C2806F.d(bundle.getBundle("mrDescriptor")), bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
            }

            public C2806F b() {
                return this.f50908a;
            }

            public int c() {
                return this.f50909b;
            }

            public boolean d() {
                return this.f50911d;
            }

            public boolean e() {
                return this.f50912e;
            }

            public boolean f() {
                return this.f50910c;
            }
        }

        /* JADX INFO: renamed from: u0.H$b$d */
        public interface d {
            void a(b bVar, C2806F c2806f, Collection collection);
        }

        public String j() {
            return null;
        }

        public String k() {
            return null;
        }

        public final void l(C2806F c2806f, Collection collection) {
            if (c2806f == null) {
                throw new NullPointerException("groupRoute must not be null");
            }
            if (collection == null) {
                throw new NullPointerException("dynamicRoutes must not be null");
            }
            synchronized (this.f50895a) {
                try {
                    Executor executor = this.f50896b;
                    if (executor != null) {
                        executor.execute(new RunnableC0459b(this.f50897c, c2806f, collection));
                    } else {
                        this.f50898d = c2806f;
                        this.f50899e = new ArrayList(collection);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public abstract void m(String str);

        public abstract void n(String str);

        public abstract void o(List list);

        public void p(Executor executor, d dVar) {
            synchronized (this.f50895a) {
                try {
                    if (executor == null) {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                    if (dVar == null) {
                        throw new NullPointerException("Listener shouldn't be null");
                    }
                    this.f50896b = executor;
                    this.f50897c = dVar;
                    Collection collection = this.f50899e;
                    if (collection != null && !collection.isEmpty()) {
                        C2806F c2806f = this.f50898d;
                        Collection collection2 = this.f50899e;
                        this.f50898d = null;
                        this.f50899e = null;
                        this.f50896b.execute(new a(dVar, c2806f, collection2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: u0.H$c */
    public final class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                AbstractC2808H.this.l();
            } else {
                if (i9 != 2) {
                    return;
                }
                AbstractC2808H.this.m();
            }
        }
    }

    /* JADX INFO: renamed from: u0.H$d */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f50919a;

        public d(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.f50919a = componentName;
        }

        public ComponentName a() {
            return this.f50919a;
        }

        public String b() {
            return this.f50919a.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.f50919a.flattenToShortString() + " }";
        }
    }

    /* JADX INFO: renamed from: u0.H$e */
    public static abstract class e {
        public void d() {
        }

        public void e() {
        }

        public abstract void f(int i9);

        public void g() {
        }

        public void h(int i9) {
            g();
        }

        public abstract void i(int i9);
    }

    public AbstractC2808H(Context context) {
        this(context, null);
    }

    public AbstractC2808H(Context context, d dVar) {
        this.f50889d = new c();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f50887a = context;
        this.f50888c = dVar == null ? new d(new ComponentName(context, getClass())) : dVar;
    }

    public void l() {
        this.f50894i = false;
        a aVar = this.f50890e;
        if (aVar != null) {
            aVar.a(this, this.f50893h);
        }
    }

    public void m() {
        this.f50892g = false;
        u(this.f50891f);
    }

    public final Context n() {
        return this.f50887a;
    }

    public final C2809I o() {
        return this.f50893h;
    }

    public final C2807G p() {
        return this.f50891f;
    }

    public final d q() {
        return this.f50888c;
    }

    public b r(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public abstract e s(String str);

    public e t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return s(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public abstract void u(C2807G c2807g);

    public final void v(a aVar) {
        C2812L.d();
        this.f50890e = aVar;
    }

    public final void w(C2809I c2809i) {
        C2812L.d();
        if (this.f50893h != c2809i) {
            this.f50893h = c2809i;
            if (this.f50894i) {
                return;
            }
            this.f50894i = true;
            this.f50889d.sendEmptyMessage(1);
        }
    }

    public final void x(C2807G c2807g) {
        C2812L.d();
        if (O.c.a(this.f50891f, c2807g)) {
            return;
        }
        y(c2807g);
    }

    public final void y(C2807G c2807g) {
        this.f50891f = c2807g;
        if (this.f50892g) {
            return;
        }
        this.f50892g = true;
        this.f50889d.sendEmptyMessage(2);
    }
}
