package u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u0.AbstractC2808H;
import u0.C2812L;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends AbstractC2808H implements ServiceConnection {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f51049r = Log.isLoggable("MediaRouteProviderProxy", 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ComponentName f51050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f51051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f51052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f51053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f51054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f51055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f51056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f51057q;

    public final class a implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Messenger f51058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f51059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Messenger f51060d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f51063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f51064h;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f51061e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f51062f = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final SparseArray f51065i = new SparseArray();

        /* JADX INFO: renamed from: u0.i0$a$a, reason: collision with other inner class name */
        public class RunnableC0462a implements Runnable {
            public RunnableC0462a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                i0.this.J(aVar);
            }
        }

        public a(Messenger messenger) {
            this.f51058a = messenger;
            e eVar = new e(this);
            this.f51059c = eVar;
            this.f51060d = new Messenger(eVar);
        }

        public void a(int i9, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = this.f51061e;
            this.f51061e = i10 + 1;
            s(12, i10, i9, null, bundle);
        }

        public int b(String str, C2812L.c cVar) {
            int i9 = this.f51062f;
            this.f51062f = i9 + 1;
            int i10 = this.f51061e;
            this.f51061e = i10 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            s(11, i10, i9, null, bundle);
            this.f51065i.put(i10, cVar);
            return i9;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            i0.this.f51051k.post(new b());
        }

        public int c(String str, String str2) {
            int i9 = this.f51062f;
            this.f51062f = i9 + 1;
            Bundle bundle = new Bundle();
            bundle.putString("routeId", str);
            bundle.putString("routeGroupId", str2);
            int i10 = this.f51061e;
            this.f51061e = i10 + 1;
            s(3, i10, i9, null, bundle);
            return i9;
        }

        public void d() {
            s(2, 0, 0, null, null);
            this.f51059c.a();
            this.f51058a.getBinder().unlinkToDeath(this, 0);
            i0.this.f51051k.post(new RunnableC0462a());
        }

        public void e() {
            int size = this.f51065i.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((C2812L.c) this.f51065i.valueAt(i9)).a(null, null);
            }
            this.f51065i.clear();
        }

        public boolean f(int i9, String str, Bundle bundle) {
            C2812L.c cVar = (C2812L.c) this.f51065i.get(i9);
            if (cVar == null) {
                return false;
            }
            this.f51065i.remove(i9);
            cVar.a(str, bundle);
            return true;
        }

        public boolean g(int i9, Bundle bundle) {
            C2812L.c cVar = (C2812L.c) this.f51065i.get(i9);
            if (cVar == null) {
                return false;
            }
            this.f51065i.remove(i9);
            cVar.b(bundle);
            return true;
        }

        public void h(int i9) {
            i0.this.H(this, i9);
        }

        public boolean i(Bundle bundle) {
            if (this.f51063g == 0) {
                return false;
            }
            i0.this.I(this, C2809I.a(bundle));
            return true;
        }

        public void j(int i9, Bundle bundle) {
            C2812L.c cVar = (C2812L.c) this.f51065i.get(i9);
            if (bundle == null || !bundle.containsKey("routeId")) {
                cVar.a("DynamicGroupRouteController is created without valid route id.", bundle);
            } else {
                this.f51065i.remove(i9);
                cVar.b(bundle);
            }
        }

        public boolean k(int i9, Bundle bundle) {
            if (this.f51063g == 0) {
                return false;
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable("groupRoute");
            C2806F c2806fD = bundle2 != null ? C2806F.d(bundle2) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("dynamicRoutes");
            ArrayList arrayList = new ArrayList();
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC2808H.b.c.a((Bundle) it.next()));
            }
            i0.this.N(this, i9, c2806fD, arrayList);
            return true;
        }

        public boolean l(int i9) {
            if (i9 == this.f51064h) {
                this.f51064h = 0;
                i0.this.K(this, "Registration failed");
            }
            C2812L.c cVar = (C2812L.c) this.f51065i.get(i9);
            if (cVar == null) {
                return true;
            }
            this.f51065i.remove(i9);
            cVar.a(null, null);
            return true;
        }

        public boolean m(int i9) {
            return true;
        }

        public boolean n(int i9, int i10, Bundle bundle) {
            if (this.f51063g != 0 || i9 != this.f51064h || i10 < 1) {
                return false;
            }
            this.f51064h = 0;
            this.f51063g = i10;
            i0.this.I(this, C2809I.a(bundle));
            i0.this.L(this);
            return true;
        }

        public boolean o() {
            int i9 = this.f51061e;
            this.f51061e = i9 + 1;
            this.f51064h = i9;
            if (!s(1, i9, 4, null, null)) {
                return false;
            }
            try {
                this.f51058a.getBinder().linkToDeath(this, 0);
                return true;
            } catch (RemoteException unused) {
                binderDied();
                return false;
            }
        }

        public void p(int i9) {
            int i10 = this.f51061e;
            this.f51061e = i10 + 1;
            s(4, i10, i9, null, null);
        }

        public void q(int i9, String str) {
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = this.f51061e;
            this.f51061e = i10 + 1;
            s(13, i10, i9, null, bundle);
        }

        public void r(int i9) {
            int i10 = this.f51061e;
            this.f51061e = i10 + 1;
            s(5, i10, i9, null, null);
        }

        public final boolean s(int i9, int i10, int i11, Object obj, Bundle bundle) {
            Message messageObtain = Message.obtain();
            messageObtain.what = i9;
            messageObtain.arg1 = i10;
            messageObtain.arg2 = i11;
            messageObtain.obj = obj;
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f51060d;
            try {
                this.f51058a.send(messageObtain);
                return true;
            } catch (DeadObjectException unused) {
                return false;
            } catch (RemoteException e9) {
                if (i9 == 2) {
                    return false;
                }
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e9);
                return false;
            }
        }

        public void t(C2807G c2807g) {
            int i9 = this.f51061e;
            this.f51061e = i9 + 1;
            s(10, i9, 0, c2807g != null ? c2807g.a() : null, null);
        }

        public void u(int i9, int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            int i11 = this.f51061e;
            this.f51061e = i11 + 1;
            s(7, i11, i9, null, bundle);
        }

        public void v(int i9, int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i10);
            int i11 = this.f51061e;
            this.f51061e = i11 + 1;
            s(6, i11, i9, null, bundle);
        }

        public void w(int i9, List list) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i10 = this.f51061e;
            this.f51061e = i10 + 1;
            s(14, i10, i9, null, bundle);
        }

        public void x(int i9, int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            int i11 = this.f51061e;
            this.f51061e = i11 + 1;
            s(8, i11, i9, null, bundle);
        }
    }

    public interface b {
        void a(AbstractC2808H.e eVar);
    }

    public interface c {
        void a(a aVar);

        int b();

        void c();
    }

    public static final class d extends Handler {
    }

    public static final class e extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f51069a;

        public e(a aVar) {
            this.f51069a = new WeakReference(aVar);
        }

        public void a() {
            this.f51069a.clear();
        }

        public final boolean b(a aVar, int i9, int i10, int i11, Object obj, Bundle bundle) {
            switch (i9) {
                case 0:
                    aVar.l(i10);
                    return true;
                case 1:
                    aVar.m(i10);
                    return true;
                case 2:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.n(i10, i11, (Bundle) obj);
                    }
                    return false;
                case 3:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.g(i10, (Bundle) obj);
                    }
                    return false;
                case 4:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.f(i10, bundle == null ? null : bundle.getString("error"), (Bundle) obj);
                    }
                    return false;
                case 5:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.i((Bundle) obj);
                    }
                    return false;
                case 6:
                    if (obj instanceof Bundle) {
                        aVar.j(i10, (Bundle) obj);
                        return false;
                    }
                    Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                    return false;
                case 7:
                    if (obj == null || (obj instanceof Bundle)) {
                        return aVar.k(i11, (Bundle) obj);
                    }
                    return false;
                case 8:
                    aVar.h(i11);
                    return false;
                default:
                    return false;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            a aVar = (a) this.f51069a.get();
            if (aVar == null || b(aVar, message.what, message.arg1, message.arg2, message.obj, message.peekData()) || !i0.f51049r) {
                return;
            }
            Log.d("MediaRouteProviderProxy", "Unhandled message from server: " + message);
        }
    }

    public final class f extends AbstractC2808H.b implements c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f51070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f51071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f51072h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f51073i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f51075k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public a f51076l;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f51074j = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51077m = -1;

        public class a extends C2812L.c {
            public a() {
            }

            @Override // u0.C2812L.c
            public void a(String str, Bundle bundle) {
                Log.d("MediaRouteProviderProxy", "Error: " + str + ", data: " + bundle);
            }

            @Override // u0.C2812L.c
            public void b(Bundle bundle) {
                f.this.f51071g = bundle.getString("groupableTitle");
                f.this.f51072h = bundle.getString("transferableTitle");
            }
        }

        public f(String str) {
            this.f51070f = str;
        }

        @Override // u0.i0.c
        public void a(a aVar) {
            a aVar2 = new a();
            this.f51076l = aVar;
            int iB = aVar.b(this.f51070f, aVar2);
            this.f51077m = iB;
            if (this.f51073i) {
                aVar.r(iB);
                int i9 = this.f51074j;
                if (i9 >= 0) {
                    aVar.u(this.f51077m, i9);
                    this.f51074j = -1;
                }
                int i10 = this.f51075k;
                if (i10 != 0) {
                    aVar.x(this.f51077m, i10);
                    this.f51075k = 0;
                }
            }
        }

        @Override // u0.i0.c
        public int b() {
            return this.f51077m;
        }

        @Override // u0.i0.c
        public void c() {
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.p(this.f51077m);
                this.f51076l = null;
                this.f51077m = 0;
            }
        }

        @Override // u0.AbstractC2808H.e
        public void d() {
            i0.this.M(this);
        }

        @Override // u0.AbstractC2808H.e
        public void e() {
            this.f51073i = true;
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.r(this.f51077m);
            }
        }

        @Override // u0.AbstractC2808H.e
        public void f(int i9) {
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.u(this.f51077m, i9);
            } else {
                this.f51074j = i9;
                this.f51075k = 0;
            }
        }

        @Override // u0.AbstractC2808H.e
        public void g() {
            h(0);
        }

        @Override // u0.AbstractC2808H.e
        public void h(int i9) {
            this.f51073i = false;
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.v(this.f51077m, i9);
            }
        }

        @Override // u0.AbstractC2808H.e
        public void i(int i9) {
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.x(this.f51077m, i9);
            } else {
                this.f51075k += i9;
            }
        }

        @Override // u0.AbstractC2808H.b
        public String j() {
            return this.f51071g;
        }

        @Override // u0.AbstractC2808H.b
        public String k() {
            return this.f51072h;
        }

        @Override // u0.AbstractC2808H.b
        public void m(String str) {
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.a(this.f51077m, str);
            }
        }

        @Override // u0.AbstractC2808H.b
        public void n(String str) {
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.q(this.f51077m, str);
            }
        }

        @Override // u0.AbstractC2808H.b
        public void o(List list) {
            a aVar = this.f51076l;
            if (aVar != null) {
                aVar.w(this.f51077m, list);
            }
        }

        public void q(C2806F c2806f, List list) {
            l(c2806f, list);
        }
    }

    public final class g extends AbstractC2808H.e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f51082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51083d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f51084e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public a f51085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f51086g;

        public g(String str, String str2) {
            this.f51080a = str;
            this.f51081b = str2;
        }

        @Override // u0.i0.c
        public void a(a aVar) {
            this.f51085f = aVar;
            int iC = aVar.c(this.f51080a, this.f51081b);
            this.f51086g = iC;
            if (this.f51082c) {
                aVar.r(iC);
                int i9 = this.f51083d;
                if (i9 >= 0) {
                    aVar.u(this.f51086g, i9);
                    this.f51083d = -1;
                }
                int i10 = this.f51084e;
                if (i10 != 0) {
                    aVar.x(this.f51086g, i10);
                    this.f51084e = 0;
                }
            }
        }

        @Override // u0.i0.c
        public int b() {
            return this.f51086g;
        }

        @Override // u0.i0.c
        public void c() {
            a aVar = this.f51085f;
            if (aVar != null) {
                aVar.p(this.f51086g);
                this.f51085f = null;
                this.f51086g = 0;
            }
        }

        @Override // u0.AbstractC2808H.e
        public void d() {
            i0.this.M(this);
        }

        @Override // u0.AbstractC2808H.e
        public void e() {
            this.f51082c = true;
            a aVar = this.f51085f;
            if (aVar != null) {
                aVar.r(this.f51086g);
            }
        }

        @Override // u0.AbstractC2808H.e
        public void f(int i9) {
            a aVar = this.f51085f;
            if (aVar != null) {
                aVar.u(this.f51086g, i9);
            } else {
                this.f51083d = i9;
                this.f51084e = 0;
            }
        }

        @Override // u0.AbstractC2808H.e
        public void g() {
            h(0);
        }

        @Override // u0.AbstractC2808H.e
        public void h(int i9) {
            this.f51082c = false;
            a aVar = this.f51085f;
            if (aVar != null) {
                aVar.v(this.f51086g, i9);
            }
        }

        @Override // u0.AbstractC2808H.e
        public void i(int i9) {
            a aVar = this.f51085f;
            if (aVar != null) {
                aVar.x(this.f51086g, i9);
            } else {
                this.f51084e += i9;
            }
        }
    }

    public i0(Context context, ComponentName componentName) {
        super(context, new AbstractC2808H.d(componentName));
        this.f51052l = new ArrayList();
        this.f51050j = componentName;
        this.f51051k = new d();
    }

    public final void A() {
        if (this.f51054n) {
            return;
        }
        boolean z9 = f51049r;
        if (z9) {
            Log.d("MediaRouteProviderProxy", this + ": Binding");
        }
        Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.f51050j);
        try {
            boolean zBindService = n().bindService(intent, this, Build.VERSION.SDK_INT >= 29 ? 4097 : 1);
            this.f51054n = zBindService;
            if (zBindService || !z9) {
                return;
            }
            Log.d("MediaRouteProviderProxy", this + ": Bind failed");
        } catch (SecurityException e9) {
            if (f51049r) {
                Log.d("MediaRouteProviderProxy", this + ": Bind failed", e9);
            }
        }
    }

    public final AbstractC2808H.b B(String str) {
        C2809I c2809iO = o();
        if (c2809iO == null) {
            return null;
        }
        List listB = c2809iO.b();
        int size = listB.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((C2806F) listB.get(i9)).l().equals(str)) {
                f fVar = new f(str);
                this.f51052l.add(fVar);
                if (this.f51056p) {
                    fVar.a(this.f51055o);
                }
                U();
                return fVar;
            }
        }
        return null;
    }

    public final AbstractC2808H.e C(String str, String str2) {
        C2809I c2809iO = o();
        if (c2809iO == null) {
            return null;
        }
        List listB = c2809iO.b();
        int size = listB.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((C2806F) listB.get(i9)).l().equals(str)) {
                g gVar = new g(str, str2);
                this.f51052l.add(gVar);
                if (this.f51056p) {
                    gVar.a(this.f51055o);
                }
                U();
                return gVar;
            }
        }
        return null;
    }

    public final void D() {
        int size = this.f51052l.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((c) this.f51052l.get(i9)).c();
        }
    }

    public final void E() {
        if (this.f51055o != null) {
            w(null);
            this.f51056p = false;
            D();
            this.f51055o.d();
            this.f51055o = null;
        }
    }

    public final c F(int i9) {
        for (c cVar : this.f51052l) {
            if (cVar.b() == i9) {
                return cVar;
            }
        }
        return null;
    }

    public boolean G(String str, String str2) {
        return this.f51050j.getPackageName().equals(str) && this.f51050j.getClassName().equals(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void H(a aVar, int i9) {
        if (this.f51055o == aVar) {
            c cVarF = F(i9);
            b bVar = this.f51057q;
            if (bVar != null && (cVarF instanceof AbstractC2808H.e)) {
                bVar.a((AbstractC2808H.e) cVarF);
            }
            M(cVarF);
        }
    }

    public void I(a aVar, C2809I c2809i) {
        if (this.f51055o == aVar) {
            if (f51049r) {
                Log.d("MediaRouteProviderProxy", this + ": Descriptor changed, descriptor=" + c2809i);
            }
            w(c2809i);
        }
    }

    public void J(a aVar) {
        if (this.f51055o == aVar) {
            if (f51049r) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection died");
            }
            E();
        }
    }

    public void K(a aVar, String str) {
        if (this.f51055o == aVar) {
            if (f51049r) {
                Log.d("MediaRouteProviderProxy", this + ": Service connection error - " + str);
            }
            T();
        }
    }

    public void L(a aVar) {
        if (this.f51055o == aVar) {
            this.f51056p = true;
            z();
            C2807G c2807gP = p();
            if (c2807gP != null) {
                this.f51055o.t(c2807gP);
            }
        }
    }

    public void M(c cVar) {
        this.f51052l.remove(cVar);
        cVar.c();
        U();
    }

    public void N(a aVar, int i9, C2806F c2806f, List list) {
        if (this.f51055o == aVar) {
            if (f51049r) {
                Log.d("MediaRouteProviderProxy", this + ": DynamicRouteDescriptors changed, descriptors=" + list);
            }
            c cVarF = F(i9);
            if (cVarF instanceof f) {
                ((f) cVarF).q(c2806f, list);
            }
        }
    }

    public void O() {
        if (this.f51055o == null && Q()) {
            T();
            A();
        }
    }

    public void P(b bVar) {
        this.f51057q = bVar;
    }

    public final boolean Q() {
        if (this.f51053m) {
            return (p() == null && this.f51052l.isEmpty()) ? false : true;
        }
        return false;
    }

    public void R() {
        if (this.f51053m) {
            return;
        }
        if (f51049r) {
            Log.d("MediaRouteProviderProxy", this + ": Starting");
        }
        this.f51053m = true;
        U();
    }

    public void S() {
        if (this.f51053m) {
            if (f51049r) {
                Log.d("MediaRouteProviderProxy", this + ": Stopping");
            }
            this.f51053m = false;
            U();
        }
    }

    public final void T() {
        if (this.f51054n) {
            if (f51049r) {
                Log.d("MediaRouteProviderProxy", this + ": Unbinding");
            }
            this.f51054n = false;
            E();
            try {
                n().unbindService(this);
            } catch (IllegalArgumentException e9) {
                Log.e("MediaRouteProviderProxy", this + ": unbindService failed", e9);
            }
        }
    }

    public final void U() {
        if (Q()) {
            A();
        } else {
            T();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z9 = f51049r;
        if (z9) {
            Log.d("MediaRouteProviderProxy", this + ": Connected");
        }
        if (this.f51054n) {
            E();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (!AbstractC2810J.a(messenger)) {
                Log.e("MediaRouteProviderProxy", this + ": Service returned invalid messenger binder");
                return;
            }
            a aVar = new a(messenger);
            if (aVar.o()) {
                this.f51055o = aVar;
            } else if (z9) {
                Log.d("MediaRouteProviderProxy", this + ": Registration failed");
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (f51049r) {
            Log.d("MediaRouteProviderProxy", this + ": Service disconnected");
        }
        E();
    }

    @Override // u0.AbstractC2808H
    public AbstractC2808H.b r(String str) {
        if (str != null) {
            return B(str);
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    @Override // u0.AbstractC2808H
    public AbstractC2808H.e s(String str) {
        if (str != null) {
            return C(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    @Override // u0.AbstractC2808H
    public AbstractC2808H.e t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return C(str, str2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    public String toString() {
        return "Service connection " + this.f51050j.flattenToShortString();
    }

    @Override // u0.AbstractC2808H
    public void u(C2807G c2807g) {
        if (this.f51056p) {
            this.f51055o.t(c2807g);
        }
        U();
    }

    public final void z() {
        int size = this.f51052l.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((c) this.f51052l.get(i9)).a(this.f51055o);
        }
    }
}
