package u0;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import u0.AbstractC2808H;
import u0.C2806F;
import u0.C2809I;
import u0.C2811K;
import u0.C2812L;

/* JADX INFO: renamed from: u0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2839x extends AbstractC2808H {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f51133t = Log.isLoggable("MR2Provider", 3);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MediaRouter2 f51134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f51135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f51136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final MediaRouter2.RouteCallback f51137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MediaRouter2.TransferCallback f51138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MediaRouter2.ControllerCallback f51139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f51140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Executor f51141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f51142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map f51143s;

    /* JADX INFO: renamed from: u0.x$a */
    public static abstract class a {
        public abstract void a(AbstractC2808H.e eVar);

        public abstract void b(int i9);

        public abstract void c(String str, int i9);
    }

    /* JADX INFO: renamed from: u0.x$b */
    public class b extends MediaRouter2.ControllerCallback {
        public b() {
        }

        @Override // android.media.MediaRouter2.ControllerCallback
        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            C2839x.this.D(routingController);
        }
    }

    /* JADX INFO: renamed from: u0.x$c */
    public class c extends AbstractC2808H.b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f51145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final MediaRouter2.RoutingController f51146g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Messenger f51147h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Messenger f51148i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Handler f51150k;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public C2806F f51154o;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final SparseArray f51149j = new SparseArray();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public AtomicInteger f51151l = new AtomicInteger(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Runnable f51152m = new Runnable() { // from class: u0.D
            @Override // java.lang.Runnable
            public final void run() {
                this.f50878a.s();
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51153n = -1;

        /* JADX INFO: renamed from: u0.x$c$a */
        public class a extends Handler {
            public a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i9 = message.what;
                int i10 = message.arg1;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                C2812L.c cVar = (C2812L.c) c.this.f51149j.get(i10);
                if (cVar == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                c.this.f51149j.remove(i10);
                if (i9 == 3) {
                    cVar.b((Bundle) obj);
                } else {
                    if (i9 != 4) {
                        return;
                    }
                    cVar.a(bundlePeekData == null ? null : bundlePeekData.getString("error"), (Bundle) obj);
                }
            }
        }

        public c(MediaRouter2.RoutingController routingController, String str) {
            this.f51146g = routingController;
            this.f51145f = str;
            Messenger messengerZ = C2839x.z(routingController);
            this.f51147h = messengerZ;
            this.f51148i = messengerZ == null ? null : new Messenger(new a());
            this.f51150k = new Handler(Looper.getMainLooper());
        }

        @Override // u0.AbstractC2808H.e
        public void d() {
            this.f51146g.release();
        }

        @Override // u0.AbstractC2808H.e
        public void f(int i9) {
            MediaRouter2.RoutingController routingController = this.f51146g;
            if (routingController == null) {
                return;
            }
            routingController.setVolume(i9);
            this.f51153n = i9;
            t();
        }

        @Override // u0.AbstractC2808H.e
        public void i(int i9) {
            MediaRouter2.RoutingController routingController = this.f51146g;
            if (routingController == null) {
                return;
            }
            int volume = this.f51153n;
            if (volume < 0) {
                volume = routingController.getVolume();
            }
            int iMax = Math.max(0, Math.min(volume + i9, this.f51146g.getVolumeMax()));
            this.f51153n = iMax;
            this.f51146g.setVolume(iMax);
            t();
        }

        @Override // u0.AbstractC2808H.b
        public void m(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info mediaRoute2InfoA = C2839x.this.A(str);
            if (mediaRoute2InfoA != null) {
                this.f51146g.selectRoute(mediaRoute2InfoA);
                return;
            }
            Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=" + str);
        }

        @Override // u0.AbstractC2808H.b
        public void n(String str) {
            if (str == null || str.isEmpty()) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
                return;
            }
            MediaRoute2Info mediaRoute2InfoA = C2839x.this.A(str);
            if (mediaRoute2InfoA != null) {
                this.f51146g.deselectRoute(mediaRoute2InfoA);
                return;
            }
            Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=" + str);
        }

        @Override // u0.AbstractC2808H.b
        public void o(List list) {
            if (list == null || list.isEmpty()) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
                return;
            }
            String str = (String) list.get(0);
            MediaRoute2Info mediaRoute2InfoA = C2839x.this.A(str);
            if (mediaRoute2InfoA != null) {
                C2839x.this.f51134j.transferTo(mediaRoute2InfoA);
                return;
            }
            Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
        }

        public String r() {
            C2806F c2806f = this.f51154o;
            return c2806f != null ? c2806f.l() : this.f51146g.getId();
        }

        public final /* synthetic */ void s() {
            this.f51153n = -1;
        }

        public final void t() {
            this.f51150k.removeCallbacks(this.f51152m);
            this.f51150k.postDelayed(this.f51152m, 1000L);
        }

        public void u(C2806F c2806f) {
            this.f51154o = c2806f;
        }

        public void v(String str, int i9) {
            MediaRouter2.RoutingController routingController = this.f51146g;
            if (routingController == null || routingController.isReleased() || this.f51147h == null) {
                return;
            }
            int andIncrement = this.f51151l.getAndIncrement();
            Message messageObtain = Message.obtain();
            messageObtain.what = 7;
            messageObtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i9);
            bundle.putString("routeId", str);
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f51148i;
            try {
                this.f51147h.send(messageObtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e9) {
                Log.e("MR2Provider", "Could not send control request to service.", e9);
            }
        }

        public void w(String str, int i9) {
            MediaRouter2.RoutingController routingController = this.f51146g;
            if (routingController == null || routingController.isReleased() || this.f51147h == null) {
                return;
            }
            int andIncrement = this.f51151l.getAndIncrement();
            Message messageObtain = Message.obtain();
            messageObtain.what = 8;
            messageObtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i9);
            bundle.putString("routeId", str);
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.f51148i;
            try {
                this.f51147h.send(messageObtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e9) {
                Log.e("MR2Provider", "Could not send control request to service.", e9);
            }
        }
    }

    /* JADX INFO: renamed from: u0.x$d */
    public class d extends AbstractC2808H.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f51158b;

        public d(String str, c cVar) {
            this.f51157a = str;
            this.f51158b = cVar;
        }

        @Override // u0.AbstractC2808H.e
        public void f(int i9) {
            c cVar;
            String str = this.f51157a;
            if (str == null || (cVar = this.f51158b) == null) {
                return;
            }
            cVar.v(str, i9);
        }

        @Override // u0.AbstractC2808H.e
        public void i(int i9) {
            c cVar;
            String str = this.f51157a;
            if (str == null || (cVar = this.f51158b) == null) {
                return;
            }
            cVar.w(str, i9);
        }
    }

    /* JADX INFO: renamed from: u0.x$e */
    public class e extends MediaRouter2.RouteCallback {
        public e() {
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesAdded(List list) {
            C2839x.this.C();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesChanged(List list) {
            C2839x.this.C();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public void onRoutesRemoved(List list) {
            C2839x.this.C();
        }
    }

    /* JADX INFO: renamed from: u0.x$f */
    public class f extends MediaRouter2.TransferCallback {
        public f() {
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onStop(MediaRouter2.RoutingController routingController) {
            AbstractC2808H.e eVar = (AbstractC2808H.e) C2839x.this.f51136l.remove(routingController);
            if (eVar != null) {
                C2839x.this.f51135k.a(eVar);
                return;
            }
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            C2839x.this.f51136l.remove(routingController);
            if (routingController2 == C2839x.this.f51134j.getSystemController()) {
                C2839x.this.f51135k.b(3);
                return;
            }
            List selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                return;
            }
            String id = AbstractC2819c.a(selectedRoutes.get(0)).getId();
            C2839x.this.f51136l.put(routingController2, C2839x.this.new c(routingController2, id));
            C2839x.this.f51135k.c(id, 3);
            C2839x.this.D(routingController2);
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
        }
    }

    public C2839x(Context context, a aVar) {
        super(context);
        this.f51136l = new ArrayMap();
        this.f51137m = new e();
        this.f51138n = new f();
        this.f51139o = new b();
        this.f51142r = new ArrayList();
        this.f51143s = new ArrayMap();
        this.f51134j = MediaRouter2.getInstance(context);
        this.f51135k = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f51140p = handler;
        Objects.requireNonNull(handler);
        this.f51141q = new ExecutorC2838w(handler);
    }

    public static String B(AbstractC2808H.e eVar) {
        MediaRouter2.RoutingController routingController;
        if ((eVar instanceof c) && (routingController = ((c) eVar).f51146g) != null) {
            return routingController.getId();
        }
        return null;
    }

    public static Messenger z(MediaRouter2.RoutingController routingController) {
        Bundle controlHints;
        if (routingController == null || (controlHints = routingController.getControlHints()) == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public MediaRoute2Info A(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.f51142r.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoA = AbstractC2819c.a(it.next());
            if (TextUtils.equals(mediaRoute2InfoA.getId(), str)) {
                return mediaRoute2InfoA;
            }
        }
        return null;
    }

    public void C() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySetA = AbstractC2837v.a();
        Iterator it = this.f51134j.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoA = AbstractC2819c.a(it.next());
            if (mediaRoute2InfoA != null && !arraySetA.contains(mediaRoute2InfoA) && !mediaRoute2InfoA.isSystemRoute()) {
                arraySetA.add(mediaRoute2InfoA);
                arrayList.add(mediaRoute2InfoA);
            }
        }
        if (arrayList.equals(this.f51142r)) {
            return;
        }
        this.f51142r = arrayList;
        this.f51143s.clear();
        Iterator it2 = this.f51142r.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoA2 = AbstractC2819c.a(it2.next());
            Bundle extras = mediaRoute2InfoA2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoA2);
            } else {
                this.f51143s.put(mediaRoute2InfoA2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.f51142r.iterator();
        while (it3.hasNext()) {
            MediaRoute2Info mediaRoute2InfoA3 = AbstractC2819c.a(it3.next());
            C2806F c2806fC = Z.c(mediaRoute2InfoA3);
            if (mediaRoute2InfoA3 != null) {
                arrayList2.add(c2806fC);
            }
        }
        w(new C2809I.a().d(true).b(arrayList2).c());
    }

    public void D(MediaRouter2.RoutingController routingController) {
        c cVar = (c) this.f51136l.get(routingController);
        if (cVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        List listA = Z.a(selectedRoutes);
        C2806F c2806fC = Z.c(AbstractC2819c.a(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = n().getString(t0.j.f50594p);
        C2806F c2806fD = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    c2806fD = C2806F.d(bundle);
                }
            } catch (Exception e9) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e9);
            }
        }
        if (c2806fD == null) {
            c2806fD = new C2806F.a(routingController.getId(), string).g(2).p(1).r(routingController.getVolume()).t(routingController.getVolumeMax()).s(routingController.getVolumeHandling()).b(c2806fC.f()).d(listA).e();
        }
        List listA2 = Z.a(routingController.getSelectableRoutes());
        List listA3 = Z.a(routingController.getDeselectableRoutes());
        C2809I c2809iO = o();
        if (c2809iO == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<C2806F> listB = c2809iO.b();
        if (!listB.isEmpty()) {
            for (C2806F c2806f : listB) {
                String strL = c2806f.l();
                arrayList.add(new AbstractC2808H.b.c.a(c2806f).e(listA.contains(strL) ? 3 : 1).b(listA2.contains(strL)).d(listA3.contains(strL)).c(true).a());
            }
        }
        cVar.u(c2806fD);
        cVar.l(c2806fD, arrayList);
    }

    public void E(String str) {
        MediaRoute2Info mediaRoute2InfoA = A(str);
        if (mediaRoute2InfoA != null) {
            this.f51134j.transferTo(mediaRoute2InfoA);
            return;
        }
        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
    }

    public final C2807G F(C2807G c2807g, boolean z9) {
        if (c2807g == null) {
            c2807g = new C2807G(C2811K.f50924c, false);
        }
        List listE = c2807g.c().e();
        if (!z9) {
            listE.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!listE.contains("android.media.intent.category.LIVE_AUDIO")) {
            listE.add("android.media.intent.category.LIVE_AUDIO");
        }
        return new C2807G(new C2811K.a().a(listE).d(), c2807g.d());
    }

    @Override // u0.AbstractC2808H
    public AbstractC2808H.b r(String str) {
        Iterator it = this.f51136l.entrySet().iterator();
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, cVar.f51145f)) {
                return cVar;
            }
        }
        return null;
    }

    @Override // u0.AbstractC2808H
    public AbstractC2808H.e s(String str) {
        return new d((String) this.f51143s.get(str), null);
    }

    @Override // u0.AbstractC2808H
    public AbstractC2808H.e t(String str, String str2) {
        String str3 = (String) this.f51143s.get(str);
        for (c cVar : this.f51136l.values()) {
            if (TextUtils.equals(str2, cVar.r())) {
                return new d(str3, cVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new d(str3, null);
    }

    @Override // u0.AbstractC2808H
    public void u(C2807G c2807g) {
        if (C2812L.h() <= 0) {
            this.f51134j.unregisterRouteCallback(this.f51137m);
            this.f51134j.unregisterTransferCallback(this.f51138n);
            this.f51134j.unregisterControllerCallback(this.f51139o);
        } else {
            this.f51134j.registerRouteCallback(this.f51141q, this.f51137m, Z.b(F(c2807g, C2812L.r())));
            this.f51134j.registerTransferCallback(this.f51141q, this.f51138n);
            this.f51134j.registerControllerCallback(this.f51141q, this.f51139o);
        }
    }
}
