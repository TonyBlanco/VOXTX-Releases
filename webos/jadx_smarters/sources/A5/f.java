package A5;

import I5.C0637c;
import I5.C0641g;
import I5.o;
import I5.x;
import J5.C;
import L.u;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.interactivemedia.v3.internal.z1;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1355c;
import com.google.android.gms.common.internal.AbstractC1418q;
import com.google.android.gms.common.internal.r;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import j6.InterfaceC2102b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o6.C2366a;
import s.C2695a;
import w6.AbstractC2936c;
import w6.C2935b;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f121k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map f122l = new C2695a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I5.o f126d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC2102b f130h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f127e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f128f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f131i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f132j = new CopyOnWriteArrayList();

    public interface a {
        void a(boolean z9);
    }

    public static class b implements ComponentCallbacks2C1355c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static AtomicReference f133a = new AtomicReference();

        public static void c(Context context) {
            if (C4.m.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f133a.get() == null) {
                    b bVar = new b();
                    if (z1.a(f133a, null, bVar)) {
                        ComponentCallbacks2C1355c.c(application);
                        ComponentCallbacks2C1355c.b().a(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1355c.a
        public void a(boolean z9) {
            synchronized (f.f121k) {
                try {
                    for (f fVar : new ArrayList(f.f122l.values())) {
                        if (fVar.f127e.get()) {
                            fVar.A(z9);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static AtomicReference f134b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f135a;

        public c(Context context) {
            this.f135a = context;
        }

        public static void b(Context context) {
            if (f134b.get() == null) {
                c cVar = new c(context);
                if (z1.a(f134b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f135a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f121k) {
                try {
                    Iterator it = f.f122l.values().iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).r();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    public f(final Context context, String str, o oVar) {
        this.f123a = (Context) r.m(context);
        this.f124b = r.g(str);
        this.f125c = (o) r.m(oVar);
        q qVarB = FirebaseInitProvider.b();
        AbstractC2936c.b("Firebase");
        AbstractC2936c.b("ComponentDiscovery");
        List listB = C0641g.c(context, ComponentDiscoveryService.class).b();
        AbstractC2936c.a();
        AbstractC2936c.b("Runtime");
        o.b bVarG = I5.o.m(C.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C0637c.s(context, Context.class, new Class[0])).b(C0637c.s(this, f.class, new Class[0])).b(C0637c.s(oVar, o.class, new Class[0])).g(new C2935b());
        if (u.a(context) && FirebaseInitProvider.c()) {
            bVarG.b(C0637c.s(qVarB, q.class, new Class[0]));
        }
        I5.o oVarE = bVarG.e();
        this.f126d = oVarE;
        AbstractC2936c.a();
        this.f129g = new x(new InterfaceC2102b() { // from class: A5.d
            @Override // j6.InterfaceC2102b
            public final Object get() {
                return this.f118a.x(context);
            }
        });
        this.f130h = oVarE.g(h6.f.class);
        g(new a() { // from class: A5.e
            @Override // A5.f.a
            public final void a(boolean z9) {
                this.f120a.y(z9);
            }
        });
        AbstractC2936c.a();
    }

    public static List k() {
        ArrayList arrayList = new ArrayList();
        synchronized (f121k) {
            try {
                Iterator it = f122l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((f) it.next()).o());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static f m() {
        f fVar;
        synchronized (f121k) {
            try {
                fVar = (f) f122l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C4.n.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((h6.f) fVar.f130h.get()).l();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f n(String str) {
        f fVar;
        String str2;
        synchronized (f121k) {
            try {
                fVar = (f) f122l.get(z(str));
                if (fVar == null) {
                    List listK = k();
                    if (listK.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listK);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((h6.f) fVar.f130h.get()).l();
            } finally {
            }
        }
        return fVar;
    }

    public static f s(Context context) {
        synchronized (f121k) {
            try {
                if (f122l.containsKey("[DEFAULT]")) {
                    return m();
                }
                o oVarA = o.a(context);
                if (oVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return t(context, oVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f t(Context context, o oVar) {
        return u(context, oVar, "[DEFAULT]");
    }

    public static f u(Context context, o oVar, String str) {
        f fVar;
        b.c(context);
        String strZ = z(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f121k) {
            Map map = f122l;
            r.q(!map.containsKey(strZ), "FirebaseApp name " + strZ + " already exists!");
            r.n(context, "Application context cannot be null.");
            fVar = new f(context, strZ, oVar);
            map.put(strZ, fVar);
        }
        fVar.r();
        return fVar;
    }

    public static String z(String str) {
        return str.trim();
    }

    public final void A(boolean z9) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f131i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(z9);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f124b.equals(((f) obj).o());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f127e.get() && ComponentCallbacks2C1355c.b().d()) {
            aVar.a(true);
        }
        this.f131i.add(aVar);
    }

    public void h(g gVar) {
        i();
        r.m(gVar);
        this.f132j.add(gVar);
    }

    public int hashCode() {
        return this.f124b.hashCode();
    }

    public final void i() {
        r.q(!this.f128f.get(), "FirebaseApp was deleted");
    }

    public Object j(Class cls) {
        i();
        return this.f126d.a(cls);
    }

    public Context l() {
        i();
        return this.f123a;
    }

    public String o() {
        i();
        return this.f124b;
    }

    public o p() {
        i();
        return this.f125c;
    }

    public String q() {
        return C4.c.e(o().getBytes(Charset.defaultCharset())) + "+" + C4.c.e(p().c().getBytes(Charset.defaultCharset()));
    }

    public final void r() {
        if (!u.a(this.f123a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + o());
            c.b(this.f123a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + o());
        this.f126d.p(w());
        ((h6.f) this.f130h.get()).l();
    }

    public String toString() {
        return AbstractC1418q.d(this).a("name", this.f124b).a("options", this.f125c).toString();
    }

    public boolean v() {
        i();
        return ((C2366a) this.f129g.get()).b();
    }

    public boolean w() {
        return "[DEFAULT]".equals(o());
    }

    public final /* synthetic */ C2366a x(Context context) {
        return new C2366a(context, q(), (g6.c) this.f126d.a(g6.c.class));
    }

    public final /* synthetic */ void y(boolean z9) {
        if (z9) {
            return;
        }
        ((h6.f) this.f130h.get()).l();
    }
}
