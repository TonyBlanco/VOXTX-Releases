package u0;

import D.AbstractC0520c;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import com.amazonaws.services.s3.model.InstructionFileId;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import q0.AbstractC2527k;
import s.C2695a;
import u0.AbstractC2808H;
import u0.C2811K;
import u0.C2839x;
import u0.k0;
import u0.l0;
import u0.m0;
import y5.InterfaceFutureC2987b;

/* JADX INFO: renamed from: u0.L, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2812L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f50928c = Log.isLoggable("MediaRouter", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static d f50929d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f50931b = new ArrayList();

    /* JADX INFO: renamed from: u0.L$a */
    public static abstract class a {
        public void onProviderAdded(C2812L c2812l, g gVar) {
        }

        public void onProviderChanged(C2812L c2812l, g gVar) {
        }

        public void onProviderRemoved(C2812L c2812l, g gVar) {
        }

        public void onRouteAdded(C2812L c2812l, h hVar) {
        }

        public abstract void onRouteChanged(C2812L c2812l, h hVar);

        public void onRoutePresentationDisplayChanged(C2812L c2812l, h hVar) {
        }

        public void onRouteRemoved(C2812L c2812l, h hVar) {
        }

        @Deprecated
        public void onRouteSelected(C2812L c2812l, h hVar) {
        }

        public void onRouteSelected(C2812L c2812l, h hVar, int i9) {
            onRouteSelected(c2812l, hVar);
        }

        public void onRouteSelected(C2812L c2812l, h hVar, int i9, h hVar2) {
            onRouteSelected(c2812l, hVar, i9);
        }

        @Deprecated
        public void onRouteUnselected(C2812L c2812l, h hVar) {
        }

        public void onRouteUnselected(C2812L c2812l, h hVar, int i9) {
            onRouteUnselected(c2812l, hVar);
        }

        public void onRouteVolumeChanged(C2812L c2812l, h hVar) {
        }

        public void onRouterParamsChanged(C2812L c2812l, g0 g0Var) {
        }
    }

    /* JADX INFO: renamed from: u0.L$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2812L f50932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f50933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2811K f50934c = C2811K.f50924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f50935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f50936e;

        public b(C2812L c2812l, a aVar) {
            this.f50932a = c2812l;
            this.f50933b = aVar;
        }

        public boolean a(h hVar, int i9, h hVar2, int i10) {
            if ((this.f50935d & 2) != 0 || hVar.E(this.f50934c)) {
                return true;
            }
            if (C2812L.r() && hVar.w() && i9 == 262 && i10 == 3 && hVar2 != null) {
                return !hVar2.w();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: u0.L$c */
    public static abstract class c {
        public abstract void a(String str, Bundle bundle);

        public abstract void b(Bundle bundle);
    }

    /* JADX INFO: renamed from: u0.L$d */
    public static final class d implements m0.e, k0.c {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f50937A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public e f50938B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public f f50939C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public e f50940D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public MediaSessionCompat f50941E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public MediaSessionCompat f50942F;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f50945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f50946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m0 f50947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k0 f50948d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f50949e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C2839x f50950f;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f50959o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public a0 f50960p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public g0 f50961q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public h f50962r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public h f50963s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public h f50964t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public AbstractC2808H.e f50965u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public h f50966v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public AbstractC2808H.e f50967w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public C2807G f50969y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public C2807G f50970z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f50951g = new ArrayList();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f50952h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Map f50953i = new HashMap();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f50954j = new ArrayList();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList f50955k = new ArrayList();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final l0.b f50956l = new l0.b();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final g f50957m = new g();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final HandlerC0460d f50958n = new HandlerC0460d();

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final Map f50968x = new HashMap();

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public final MediaSessionCompat.OnActiveChangeListener f50943G = new a();

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public AbstractC2808H.b.d f50944H = new c();

        /* JADX INFO: renamed from: u0.L$d$a */
        public class a implements MediaSessionCompat.OnActiveChangeListener {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.OnActiveChangeListener
            public void onActiveChanged() {
                MediaSessionCompat mediaSessionCompat = d.this.f50941E;
                if (mediaSessionCompat != null) {
                    if (mediaSessionCompat.isActive()) {
                        d dVar = d.this;
                        dVar.f(dVar.f50941E.getRemoteControlClient());
                    } else {
                        d dVar2 = d.this;
                        dVar2.G(dVar2.f50941E.getRemoteControlClient());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: u0.L$d$b */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.Q();
            }
        }

        /* JADX INFO: renamed from: u0.L$d$c */
        public class c implements AbstractC2808H.b.d {
            public c() {
            }

            @Override // u0.AbstractC2808H.b.d
            public void a(AbstractC2808H.b bVar, C2806F c2806f, Collection collection) {
                d dVar = d.this;
                if (bVar != dVar.f50967w || c2806f == null) {
                    if (bVar == dVar.f50965u) {
                        if (c2806f != null) {
                            dVar.V(dVar.f50964t, c2806f);
                        }
                        d.this.f50964t.L(collection);
                        return;
                    }
                    return;
                }
                g gVarQ = dVar.f50966v.q();
                String strL = c2806f.l();
                h hVar = new h(gVarQ, strL, d.this.g(gVarQ, strL));
                hVar.F(c2806f);
                d dVar2 = d.this;
                if (dVar2.f50964t == hVar) {
                    return;
                }
                dVar2.E(dVar2, hVar, dVar2.f50967w, 3, dVar2.f50966v, collection);
                d dVar3 = d.this;
                dVar3.f50966v = null;
                dVar3.f50967w = null;
            }
        }

        /* JADX INFO: renamed from: u0.L$d$d, reason: collision with other inner class name */
        public final class HandlerC0460d extends Handler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f50974a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f50975b = new ArrayList();

            public HandlerC0460d() {
            }

            public final void a(b bVar, int i9, Object obj, int i10) {
                C2812L c2812l = bVar.f50932a;
                a aVar = bVar.f50933b;
                int i11 = 65280 & i9;
                if (i11 != 256) {
                    if (i11 != 512) {
                        if (i11 == 768 && i9 == 769) {
                            aVar.onRouterParamsChanged(c2812l, (g0) obj);
                            return;
                        }
                        return;
                    }
                    g gVar = (g) obj;
                    switch (i9) {
                        case 513:
                            aVar.onProviderAdded(c2812l, gVar);
                            break;
                        case 514:
                            aVar.onProviderRemoved(c2812l, gVar);
                            break;
                        case 515:
                            aVar.onProviderChanged(c2812l, gVar);
                            break;
                    }
                }
                h hVar = (i9 == 264 || i9 == 262) ? (h) ((O.d) obj).f5401b : (h) obj;
                h hVar2 = (i9 == 264 || i9 == 262) ? (h) ((O.d) obj).f5400a : null;
                if (hVar == null || !bVar.a(hVar, i9, hVar2, i10)) {
                    return;
                }
                switch (i9) {
                    case 257:
                        aVar.onRouteAdded(c2812l, hVar);
                        break;
                    case 258:
                        aVar.onRouteRemoved(c2812l, hVar);
                        break;
                    case 259:
                        aVar.onRouteChanged(c2812l, hVar);
                        break;
                    case 260:
                        aVar.onRouteVolumeChanged(c2812l, hVar);
                        break;
                    case 261:
                        aVar.onRoutePresentationDisplayChanged(c2812l, hVar);
                        break;
                    case 262:
                        aVar.onRouteSelected(c2812l, hVar, i10, hVar);
                        break;
                    case 263:
                        aVar.onRouteUnselected(c2812l, hVar, i10);
                        break;
                    case 264:
                        aVar.onRouteSelected(c2812l, hVar, i10, hVar2);
                        break;
                }
            }

            public void b(int i9, Object obj) {
                obtainMessage(i9, obj).sendToTarget();
            }

            public void c(int i9, Object obj, int i10) {
                Message messageObtainMessage = obtainMessage(i9, obj);
                messageObtainMessage.arg1 = i10;
                messageObtainMessage.sendToTarget();
            }

            public final void d(int i9, Object obj) {
                if (i9 == 262) {
                    h hVar = (h) ((O.d) obj).f5401b;
                    d.this.f50947c.D(hVar);
                    if (d.this.f50962r == null || !hVar.w()) {
                        return;
                    }
                    Iterator it = this.f50975b.iterator();
                    while (it.hasNext()) {
                        d.this.f50947c.C((h) it.next());
                    }
                    this.f50975b.clear();
                }
                if (i9 == 264) {
                    h hVar2 = (h) ((O.d) obj).f5401b;
                    this.f50975b.add(hVar2);
                    d.this.f50947c.A(hVar2);
                    d.this.f50947c.D(hVar2);
                    return;
                }
                switch (i9) {
                    case 257:
                        d.this.f50947c.A((h) obj);
                        break;
                    case 258:
                        d.this.f50947c.C((h) obj);
                        break;
                    case 259:
                        d.this.f50947c.B((h) obj);
                        break;
                }
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i9 = message.what;
                Object obj = message.obj;
                int i10 = message.arg1;
                if (i9 == 259 && d.this.v().k().equals(((h) obj).k())) {
                    d.this.W(true);
                }
                d(i9, obj);
                try {
                    int size = d.this.f50951g.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        C2812L c2812l = (C2812L) ((WeakReference) d.this.f50951g.get(size)).get();
                        if (c2812l == null) {
                            d.this.f50951g.remove(size);
                        } else {
                            this.f50974a.addAll(c2812l.f50931b);
                        }
                    }
                    int size2 = this.f50974a.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        a((b) this.f50974a.get(i11), i9, obj, i10);
                    }
                    this.f50974a.clear();
                } catch (Throwable th) {
                    this.f50974a.clear();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: u0.L$d$e */
        public final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MediaSessionCompat f50977a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f50978b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f50979c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public AbstractC2527k f50980d;

            /* JADX INFO: renamed from: u0.L$d$e$a */
            public class a extends AbstractC2527k {

                /* JADX INFO: renamed from: u0.L$d$e$a$a, reason: collision with other inner class name */
                public class RunnableC0461a implements Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f50983a;

                    public RunnableC0461a(int i9) {
                        this.f50983a = i9;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = d.this.f50964t;
                        if (hVar != null) {
                            hVar.G(this.f50983a);
                        }
                    }
                }

                /* JADX INFO: renamed from: u0.L$d$e$a$b */
                public class b implements Runnable {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f50985a;

                    public b(int i9) {
                        this.f50985a = i9;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        h hVar = d.this.f50964t;
                        if (hVar != null) {
                            hVar.H(this.f50985a);
                        }
                    }
                }

                public a(int i9, int i10, int i11, String str) {
                    super(i9, i10, i11, str);
                }

                @Override // q0.AbstractC2527k
                public void e(int i9) {
                    d.this.f50958n.post(new b(i9));
                }

                @Override // q0.AbstractC2527k
                public void f(int i9) {
                    d.this.f50958n.post(new RunnableC0461a(i9));
                }
            }

            public e(MediaSessionCompat mediaSessionCompat) {
                this.f50977a = mediaSessionCompat;
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = this.f50977a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.setPlaybackToLocal(d.this.f50956l.f51111d);
                    this.f50980d = null;
                }
            }

            public void b(int i9, int i10, int i11, String str) {
                if (this.f50977a != null) {
                    AbstractC2527k abstractC2527k = this.f50980d;
                    if (abstractC2527k != null && i9 == this.f50978b && i10 == this.f50979c) {
                        abstractC2527k.h(i11);
                        return;
                    }
                    a aVar = new a(i9, i10, i11, str);
                    this.f50980d = aVar;
                    this.f50977a.setPlaybackToRemote(aVar);
                }
            }

            public MediaSessionCompat.Token c() {
                MediaSessionCompat mediaSessionCompat = this.f50977a;
                if (mediaSessionCompat != null) {
                    return mediaSessionCompat.getSessionToken();
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: u0.L$d$f */
        public final class f extends C2839x.a {
            public f() {
            }

            @Override // u0.C2839x.a
            public void a(AbstractC2808H.e eVar) {
                if (eVar == d.this.f50965u) {
                    d(2);
                } else if (C2812L.f50928c) {
                    Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=" + eVar);
                }
            }

            @Override // u0.C2839x.a
            public void b(int i9) {
                d(i9);
            }

            @Override // u0.C2839x.a
            public void c(String str, int i9) {
                h hVar;
                Iterator it = d.this.u().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hVar = null;
                        break;
                    }
                    hVar = (h) it.next();
                    if (hVar.r() == d.this.f50950f && TextUtils.equals(str, hVar.e())) {
                        break;
                    }
                }
                if (hVar != null) {
                    d.this.K(hVar, i9);
                    return;
                }
                Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + str);
            }

            public void d(int i9) {
                h hVarH = d.this.h();
                if (d.this.v() != hVarH) {
                    d.this.K(hVarH, i9);
                }
            }
        }

        /* JADX INFO: renamed from: u0.L$d$g */
        public final class g extends AbstractC2808H.a {
            public g() {
            }

            @Override // u0.AbstractC2808H.a
            public void a(AbstractC2808H abstractC2808H, C2809I c2809i) {
                d.this.U(abstractC2808H, c2809i);
            }
        }

        /* JADX INFO: renamed from: u0.L$d$h */
        public final class h implements l0.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l0 f50989a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f50990b;

            public h(Object obj) {
                l0 l0VarB = l0.b(d.this.f50945a, obj);
                this.f50989a = l0VarB;
                l0VarB.d(this);
                e();
            }

            @Override // u0.l0.c
            public void a(int i9) {
                h hVar;
                if (this.f50990b || (hVar = d.this.f50964t) == null) {
                    return;
                }
                hVar.G(i9);
            }

            @Override // u0.l0.c
            public void b(int i9) {
                h hVar;
                if (this.f50990b || (hVar = d.this.f50964t) == null) {
                    return;
                }
                hVar.H(i9);
            }

            public void c() {
                this.f50990b = true;
                this.f50989a.d(null);
            }

            public Object d() {
                return this.f50989a.a();
            }

            public void e() {
                this.f50989a.c(d.this.f50956l);
            }
        }

        public d(Context context) {
            this.f50945a = context;
            this.f50959o = AbstractC0520c.a((ActivityManager) context.getSystemService("activity"));
        }

        public final boolean A(h hVar) {
            return hVar.r() == this.f50947c && hVar.f51007b.equals("DEFAULT_ROUTE");
        }

        public final boolean B(h hVar) {
            return hVar.r() == this.f50947c && hVar.J("android.media.intent.category.LIVE_AUDIO") && !hVar.J("android.media.intent.category.LIVE_VIDEO");
        }

        public boolean C() {
            g0 g0Var = this.f50961q;
            if (g0Var == null) {
                return false;
            }
            return g0Var.e();
        }

        public void D() {
            if (this.f50964t.y()) {
                List<h> listL = this.f50964t.l();
                HashSet hashSet = new HashSet();
                Iterator it = listL.iterator();
                while (it.hasNext()) {
                    hashSet.add(((h) it.next()).f51008c);
                }
                Iterator it2 = this.f50968x.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet.contains(entry.getKey())) {
                        AbstractC2808H.e eVar = (AbstractC2808H.e) entry.getValue();
                        eVar.h(0);
                        eVar.d();
                        it2.remove();
                    }
                }
                for (h hVar : listL) {
                    if (!this.f50968x.containsKey(hVar.f51008c)) {
                        AbstractC2808H.e eVarT = hVar.r().t(hVar.f51007b, this.f50964t.f51007b);
                        eVarT.e();
                        this.f50968x.put(hVar.f51008c, eVarT);
                    }
                }
            }
        }

        public void E(d dVar, h hVar, AbstractC2808H.e eVar, int i9, h hVar2, Collection collection) {
            e eVar2;
            f fVar = this.f50939C;
            if (fVar != null) {
                fVar.a();
                this.f50939C = null;
            }
            f fVar2 = new f(dVar, hVar, eVar, i9, hVar2, collection);
            this.f50939C = fVar2;
            if (fVar2.f50993b != 3 || (eVar2 = this.f50938B) == null) {
                fVar2.b();
                return;
            }
            InterfaceFutureC2987b interfaceFutureC2987bOnPrepareTransfer = eVar2.onPrepareTransfer(this.f50964t, fVar2.f50995d);
            if (interfaceFutureC2987bOnPrepareTransfer == null) {
                this.f50939C.b();
            } else {
                this.f50939C.d(interfaceFutureC2987bOnPrepareTransfer);
            }
        }

        public void F(h hVar) {
            if (!(this.f50965u instanceof AbstractC2808H.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a aVarP = p(hVar);
            if (this.f50964t.l().contains(hVar) && aVarP != null && aVarP.d()) {
                if (this.f50964t.l().size() <= 1) {
                    Log.w("MediaRouter", "Ignoring attempt to remove the last member route.");
                    return;
                } else {
                    ((AbstractC2808H.b) this.f50965u).n(hVar.e());
                    return;
                }
            }
            Log.w("MediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + hVar);
        }

        public void G(Object obj) {
            int iK = k(obj);
            if (iK >= 0) {
                ((h) this.f50955k.remove(iK)).c();
            }
        }

        public void H(h hVar, int i9) {
            AbstractC2808H.e eVar;
            AbstractC2808H.e eVar2;
            if (hVar == this.f50964t && (eVar2 = this.f50965u) != null) {
                eVar2.f(i9);
            } else {
                if (this.f50968x.isEmpty() || (eVar = (AbstractC2808H.e) this.f50968x.get(hVar.f51008c)) == null) {
                    return;
                }
                eVar.f(i9);
            }
        }

        public void I(h hVar, int i9) {
            AbstractC2808H.e eVar;
            AbstractC2808H.e eVar2;
            if (hVar == this.f50964t && (eVar2 = this.f50965u) != null) {
                eVar2.i(i9);
            } else {
                if (this.f50968x.isEmpty() || (eVar = (AbstractC2808H.e) this.f50968x.get(hVar.f51008c)) == null) {
                    return;
                }
                eVar.i(i9);
            }
        }

        public void J(h hVar, int i9) {
            if (!this.f50952h.contains(hVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + hVar);
                return;
            }
            if (!hVar.f51012g) {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + hVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                AbstractC2808H abstractC2808HR = hVar.r();
                C2839x c2839x = this.f50950f;
                if (abstractC2808HR == c2839x && this.f50964t != hVar) {
                    c2839x.E(hVar.e());
                    return;
                }
            }
            K(hVar, i9);
        }

        public void K(h hVar, int i9) {
            StringBuilder sb;
            String str;
            if (C2812L.f50929d == null || (this.f50963s != null && hVar.v())) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 3; i10 < stackTrace.length; i10++) {
                    StackTraceElement stackTraceElement = stackTrace[i10];
                    sb2.append(stackTraceElement.getClassName());
                    sb2.append(InstructionFileId.DOT);
                    sb2.append(stackTraceElement.getMethodName());
                    sb2.append(":");
                    sb2.append(stackTraceElement.getLineNumber());
                    sb2.append("  ");
                }
                if (C2812L.f50929d == null) {
                    sb = new StringBuilder();
                    str = "setSelectedRouteInternal is called while sGlobal is null: pkgName=";
                } else {
                    sb = new StringBuilder();
                    str = "Default route is selected while a BT route is available: pkgName=";
                }
                sb.append(str);
                sb.append(this.f50945a.getPackageName());
                sb.append(", callers=");
                sb.append(sb2.toString());
                Log.w("MediaRouter", sb.toString());
            }
            if (this.f50964t == hVar) {
                return;
            }
            if (this.f50966v != null) {
                this.f50966v = null;
                AbstractC2808H.e eVar = this.f50967w;
                if (eVar != null) {
                    eVar.h(3);
                    this.f50967w.d();
                    this.f50967w = null;
                }
            }
            if (y() && hVar.q().g()) {
                AbstractC2808H.b bVarR = hVar.r().r(hVar.f51007b);
                if (bVarR != null) {
                    bVarR.p(E.b.getMainExecutor(this.f50945a), this.f50944H);
                    this.f50966v = hVar;
                    this.f50967w = bVarR;
                    bVarR.e();
                    return;
                }
                Log.w("MediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + hVar);
            }
            AbstractC2808H.e eVarS = hVar.r().s(hVar.f51007b);
            if (eVarS != null) {
                eVarS.e();
            }
            if (C2812L.f50928c) {
                Log.d("MediaRouter", "Route selected: " + hVar);
            }
            if (this.f50964t != null) {
                E(this, hVar, eVarS, i9, null, null);
                return;
            }
            this.f50964t = hVar;
            this.f50965u = eVarS;
            this.f50958n.c(262, new O.d(null, hVar), i9);
        }

        public void L(MediaSessionCompat mediaSessionCompat) {
            this.f50942F = mediaSessionCompat;
            M(mediaSessionCompat != null ? new e(mediaSessionCompat) : null);
        }

        public final void M(e eVar) {
            e eVar2 = this.f50940D;
            if (eVar2 != null) {
                eVar2.a();
            }
            this.f50940D = eVar;
            if (eVar != null) {
                S();
            }
        }

        public void N(g0 g0Var) {
            g0 g0Var2 = this.f50961q;
            this.f50961q = g0Var;
            if (y()) {
                if (this.f50950f == null) {
                    C2839x c2839x = new C2839x(this.f50945a, new f());
                    this.f50950f = c2839x;
                    a(c2839x);
                    Q();
                    this.f50948d.f();
                }
                if ((g0Var2 == null ? false : g0Var2.e()) != (g0Var != null ? g0Var.e() : false)) {
                    this.f50950f.y(this.f50970z);
                }
            } else {
                AbstractC2808H abstractC2808H = this.f50950f;
                if (abstractC2808H != null) {
                    b(abstractC2808H);
                    this.f50950f = null;
                    this.f50948d.f();
                }
            }
            this.f50958n.b(769, g0Var);
        }

        public final void O() {
            this.f50960p = new a0(new b());
            a(this.f50947c);
            C2839x c2839x = this.f50950f;
            if (c2839x != null) {
                a(c2839x);
            }
            k0 k0Var = new k0(this.f50945a, this);
            this.f50948d = k0Var;
            k0Var.h();
        }

        public void P(h hVar) {
            if (!(this.f50965u instanceof AbstractC2808H.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a aVarP = p(hVar);
            if (aVarP == null || !aVarP.c()) {
                Log.w("MediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
            } else {
                ((AbstractC2808H.b) this.f50965u).o(Collections.singletonList(hVar.e()));
            }
        }

        public void Q() {
            C2807G c2807g;
            C2811K.a aVar = new C2811K.a();
            this.f50960p.c();
            int size = this.f50951g.size();
            int i9 = 0;
            boolean z9 = false;
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C2812L c2812l = (C2812L) ((WeakReference) this.f50951g.get(size)).get();
                if (c2812l == null) {
                    this.f50951g.remove(size);
                } else {
                    int size2 = c2812l.f50931b.size();
                    i9 += size2;
                    for (int i10 = 0; i10 < size2; i10++) {
                        b bVar = (b) c2812l.f50931b.get(i10);
                        aVar.c(bVar.f50934c);
                        boolean z10 = (bVar.f50935d & 1) != 0;
                        this.f50960p.b(z10, bVar.f50936e);
                        if (z10) {
                            z9 = true;
                        }
                        int i11 = bVar.f50935d;
                        if ((i11 & 4) != 0 && !this.f50959o) {
                            z9 = true;
                        }
                        if ((i11 & 8) != 0) {
                            z9 = true;
                        }
                    }
                }
            }
            boolean zA = this.f50960p.a();
            this.f50937A = i9;
            C2811K c2811kD = z9 ? aVar.d() : C2811K.f50924c;
            R(aVar.d(), zA);
            C2807G c2807g2 = this.f50969y;
            if (c2807g2 != null && c2807g2.c().equals(c2811kD) && this.f50969y.d() == zA) {
                return;
            }
            if (!c2811kD.f() || zA) {
                c2807g = new C2807G(c2811kD, zA);
            } else if (this.f50969y == null) {
                return;
            } else {
                c2807g = null;
            }
            this.f50969y = c2807g;
            if (C2812L.f50928c) {
                Log.d("MediaRouter", "Updated discovery request: " + this.f50969y);
            }
            if (z9 && !zA && this.f50959o) {
                Log.i("MediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
            }
            int size3 = this.f50954j.size();
            for (int i12 = 0; i12 < size3; i12++) {
                AbstractC2808H abstractC2808H = ((g) this.f50954j.get(i12)).f51002a;
                if (abstractC2808H != this.f50950f) {
                    abstractC2808H.x(this.f50969y);
                }
            }
        }

        public final void R(C2811K c2811k, boolean z9) {
            if (y()) {
                C2807G c2807g = this.f50970z;
                if (c2807g != null && c2807g.c().equals(c2811k) && this.f50970z.d() == z9) {
                    return;
                }
                if (!c2811k.f() || z9) {
                    this.f50970z = new C2807G(c2811k, z9);
                } else if (this.f50970z == null) {
                    return;
                } else {
                    this.f50970z = null;
                }
                if (C2812L.f50928c) {
                    Log.d("MediaRouter", "Updated MediaRoute2Provider's discovery request: " + this.f50970z);
                }
                this.f50950f.x(this.f50970z);
            }
        }

        public void S() {
            e eVar;
            l0.b bVar;
            String strB;
            h hVar = this.f50964t;
            if (hVar != null) {
                this.f50956l.f51108a = hVar.s();
                this.f50956l.f51109b = this.f50964t.u();
                this.f50956l.f51110c = this.f50964t.t();
                this.f50956l.f51111d = this.f50964t.n();
                this.f50956l.f51112e = this.f50964t.o();
                if (y() && this.f50964t.r() == this.f50950f) {
                    bVar = this.f50956l;
                    strB = C2839x.B(this.f50965u);
                } else {
                    bVar = this.f50956l;
                    strB = null;
                }
                bVar.f51113f = strB;
                int size = this.f50955k.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((h) this.f50955k.get(i9)).e();
                }
                if (this.f50940D == null) {
                    return;
                }
                if (this.f50964t != o() && this.f50964t != m()) {
                    l0.b bVar2 = this.f50956l;
                    this.f50940D.b(bVar2.f51110c == 1 ? 2 : 0, bVar2.f51109b, bVar2.f51108a, bVar2.f51113f);
                    return;
                }
                eVar = this.f50940D;
            } else {
                eVar = this.f50940D;
                if (eVar == null) {
                    return;
                }
            }
            eVar.a();
        }

        public final void T(g gVar, C2809I c2809i) {
            boolean z9;
            StringBuilder sb;
            String str;
            if (gVar.h(c2809i)) {
                int i9 = 0;
                if (c2809i == null || !(c2809i.c() || c2809i == this.f50947c.o())) {
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + c2809i);
                    z9 = false;
                } else {
                    List<C2806F> listB = c2809i.b();
                    ArrayList<O.d> arrayList = new ArrayList();
                    ArrayList<O.d> arrayList2 = new ArrayList();
                    z9 = false;
                    for (C2806F c2806f : listB) {
                        if (c2806f == null || !c2806f.x()) {
                            sb = new StringBuilder();
                            str = "Ignoring invalid system route descriptor: ";
                            sb.append(str);
                            sb.append(c2806f);
                            Log.w("MediaRouter", sb.toString());
                        } else {
                            String strL = c2806f.l();
                            int iB = gVar.b(strL);
                            if (iB < 0) {
                                h hVar = new h(gVar, strL, g(gVar, strL));
                                int i10 = i9 + 1;
                                gVar.f51003b.add(i9, hVar);
                                this.f50952h.add(hVar);
                                if (c2806f.j().size() > 0) {
                                    arrayList.add(new O.d(hVar, c2806f));
                                } else {
                                    hVar.F(c2806f);
                                    if (C2812L.f50928c) {
                                        Log.d("MediaRouter", "Route added: " + hVar);
                                    }
                                    this.f50958n.b(257, hVar);
                                }
                                i9 = i10;
                            } else if (iB < i9) {
                                sb = new StringBuilder();
                                str = "Ignoring route descriptor with duplicate id: ";
                                sb.append(str);
                                sb.append(c2806f);
                                Log.w("MediaRouter", sb.toString());
                            } else {
                                h hVar2 = (h) gVar.f51003b.get(iB);
                                int i11 = i9 + 1;
                                Collections.swap(gVar.f51003b, iB, i9);
                                if (c2806f.j().size() > 0) {
                                    arrayList2.add(new O.d(hVar2, c2806f));
                                } else if (V(hVar2, c2806f) != 0 && hVar2 == this.f50964t) {
                                    i9 = i11;
                                    z9 = true;
                                }
                                i9 = i11;
                            }
                        }
                    }
                    for (O.d dVar : arrayList) {
                        h hVar3 = (h) dVar.f5400a;
                        hVar3.F((C2806F) dVar.f5401b);
                        if (C2812L.f50928c) {
                            Log.d("MediaRouter", "Route added: " + hVar3);
                        }
                        this.f50958n.b(257, hVar3);
                    }
                    for (O.d dVar2 : arrayList2) {
                        h hVar4 = (h) dVar2.f5400a;
                        if (V(hVar4, (C2806F) dVar2.f5401b) != 0 && hVar4 == this.f50964t) {
                            z9 = true;
                        }
                    }
                }
                for (int size = gVar.f51003b.size() - 1; size >= i9; size--) {
                    h hVar5 = (h) gVar.f51003b.get(size);
                    hVar5.F(null);
                    this.f50952h.remove(hVar5);
                }
                W(z9);
                for (int size2 = gVar.f51003b.size() - 1; size2 >= i9; size2--) {
                    h hVar6 = (h) gVar.f51003b.remove(size2);
                    if (C2812L.f50928c) {
                        Log.d("MediaRouter", "Route removed: " + hVar6);
                    }
                    this.f50958n.b(258, hVar6);
                }
                if (C2812L.f50928c) {
                    Log.d("MediaRouter", "Provider changed: " + gVar);
                }
                this.f50958n.b(515, gVar);
            }
        }

        public void U(AbstractC2808H abstractC2808H, C2809I c2809i) {
            g gVarJ = j(abstractC2808H);
            if (gVarJ != null) {
                T(gVarJ, c2809i);
            }
        }

        public int V(h hVar, C2806F c2806f) {
            int iF = hVar.F(c2806f);
            if (iF != 0) {
                if ((iF & 1) != 0) {
                    if (C2812L.f50928c) {
                        Log.d("MediaRouter", "Route changed: " + hVar);
                    }
                    this.f50958n.b(259, hVar);
                }
                if ((iF & 2) != 0) {
                    if (C2812L.f50928c) {
                        Log.d("MediaRouter", "Route volume changed: " + hVar);
                    }
                    this.f50958n.b(260, hVar);
                }
                if ((iF & 4) != 0) {
                    if (C2812L.f50928c) {
                        Log.d("MediaRouter", "Route presentation display changed: " + hVar);
                    }
                    this.f50958n.b(261, hVar);
                }
            }
            return iF;
        }

        public void W(boolean z9) {
            h hVar = this.f50962r;
            if (hVar != null && !hVar.B()) {
                Log.i("MediaRouter", "Clearing the default route because it is no longer selectable: " + this.f50962r);
                this.f50962r = null;
            }
            if (this.f50962r == null && !this.f50952h.isEmpty()) {
                Iterator it = this.f50952h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h hVar2 = (h) it.next();
                    if (A(hVar2) && hVar2.B()) {
                        this.f50962r = hVar2;
                        Log.i("MediaRouter", "Found default route: " + this.f50962r);
                        break;
                    }
                }
            }
            h hVar3 = this.f50963s;
            if (hVar3 != null && !hVar3.B()) {
                Log.i("MediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f50963s);
                this.f50963s = null;
            }
            if (this.f50963s == null && !this.f50952h.isEmpty()) {
                Iterator it2 = this.f50952h.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    h hVar4 = (h) it2.next();
                    if (B(hVar4) && hVar4.B()) {
                        this.f50963s = hVar4;
                        Log.i("MediaRouter", "Found bluetooth route: " + this.f50963s);
                        break;
                    }
                }
            }
            h hVar5 = this.f50964t;
            if (hVar5 != null && hVar5.x()) {
                if (z9) {
                    D();
                    S();
                    return;
                }
                return;
            }
            Log.i("MediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f50964t);
            K(h(), 0);
        }

        @Override // u0.k0.c
        public void a(AbstractC2808H abstractC2808H) {
            if (j(abstractC2808H) == null) {
                g gVar = new g(abstractC2808H);
                this.f50954j.add(gVar);
                if (C2812L.f50928c) {
                    Log.d("MediaRouter", "Provider added: " + gVar);
                }
                this.f50958n.b(513, gVar);
                T(gVar, abstractC2808H.o());
                abstractC2808H.v(this.f50957m);
                abstractC2808H.x(this.f50969y);
            }
        }

        @Override // u0.k0.c
        public void b(AbstractC2808H abstractC2808H) {
            g gVarJ = j(abstractC2808H);
            if (gVarJ != null) {
                abstractC2808H.v(null);
                abstractC2808H.x(null);
                T(gVarJ, null);
                if (C2812L.f50928c) {
                    Log.d("MediaRouter", "Provider removed: " + gVarJ);
                }
                this.f50958n.b(514, gVarJ);
                this.f50954j.remove(gVarJ);
            }
        }

        @Override // u0.m0.e
        public void c(String str) {
            h hVarA;
            this.f50958n.removeMessages(262);
            g gVarJ = j(this.f50947c);
            if (gVarJ == null || (hVarA = gVarJ.a(str)) == null) {
                return;
            }
            hVarA.I();
        }

        @Override // u0.k0.c
        public void d(i0 i0Var, AbstractC2808H.e eVar) {
            if (this.f50965u == eVar) {
                J(h(), 2);
            }
        }

        public void e(h hVar) {
            if (!(this.f50965u instanceof AbstractC2808H.b)) {
                throw new IllegalStateException("There is no currently selected dynamic group route.");
            }
            h.a aVarP = p(hVar);
            if (!this.f50964t.l().contains(hVar) && aVarP != null && aVarP.b()) {
                ((AbstractC2808H.b) this.f50965u).m(hVar.e());
                return;
            }
            Log.w("MediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + hVar);
        }

        public void f(Object obj) {
            if (k(obj) < 0) {
                this.f50955k.add(new h(obj));
            }
        }

        public String g(g gVar, String str) {
            String strFlattenToShortString = gVar.c().flattenToShortString();
            String str2 = strFlattenToShortString + ":" + str;
            if (l(str2) < 0) {
                this.f50953i.put(new O.d(strFlattenToShortString, str), str2);
                return str2;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + strFlattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i9 = 2;
            while (true) {
                String str3 = String.format(Locale.US, "%s_%d", str2, Integer.valueOf(i9));
                if (l(str3) < 0) {
                    this.f50953i.put(new O.d(strFlattenToShortString, str), str3);
                    return str3;
                }
                i9++;
            }
        }

        public h h() {
            for (h hVar : this.f50952h) {
                if (hVar != this.f50962r && B(hVar) && hVar.B()) {
                    return hVar;
                }
            }
            return this.f50962r;
        }

        public void i() {
            if (this.f50946b) {
                return;
            }
            this.f50946b = true;
            this.f50949e = Build.VERSION.SDK_INT >= 30 ? h0.a(this.f50945a) : false;
            this.f50950f = this.f50949e ? new C2839x(this.f50945a, new f()) : null;
            this.f50947c = m0.z(this.f50945a, this);
            O();
        }

        public final g j(AbstractC2808H abstractC2808H) {
            int size = this.f50954j.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((g) this.f50954j.get(i9)).f51002a == abstractC2808H) {
                    return (g) this.f50954j.get(i9);
                }
            }
            return null;
        }

        public final int k(Object obj) {
            int size = this.f50955k.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((h) this.f50955k.get(i9)).d() == obj) {
                    return i9;
                }
            }
            return -1;
        }

        public final int l(String str) {
            int size = this.f50952h.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((h) this.f50952h.get(i9)).f51008c.equals(str)) {
                    return i9;
                }
            }
            return -1;
        }

        public h m() {
            return this.f50963s;
        }

        public int n() {
            return this.f50937A;
        }

        public h o() {
            h hVar = this.f50962r;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public h.a p(h hVar) {
            return this.f50964t.h(hVar);
        }

        public MediaSessionCompat.Token q() {
            e eVar = this.f50940D;
            if (eVar != null) {
                return eVar.c();
            }
            MediaSessionCompat mediaSessionCompat = this.f50942F;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.getSessionToken();
            }
            return null;
        }

        public h r(String str) {
            for (h hVar : this.f50952h) {
                if (hVar.f51008c.equals(str)) {
                    return hVar;
                }
            }
            return null;
        }

        public C2812L s(Context context) {
            int size = this.f50951g.size();
            while (true) {
                size--;
                if (size < 0) {
                    C2812L c2812l = new C2812L(context);
                    this.f50951g.add(new WeakReference(c2812l));
                    return c2812l;
                }
                C2812L c2812l2 = (C2812L) ((WeakReference) this.f50951g.get(size)).get();
                if (c2812l2 == null) {
                    this.f50951g.remove(size);
                } else if (c2812l2.f50930a == context) {
                    return c2812l2;
                }
            }
        }

        public g0 t() {
            return this.f50961q;
        }

        public List u() {
            return this.f50952h;
        }

        public h v() {
            h hVar = this.f50964t;
            if (hVar != null) {
                return hVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public String w(g gVar, String str) {
            return (String) this.f50953i.get(new O.d(gVar.c().flattenToShortString(), str));
        }

        public boolean x() {
            Bundle bundle;
            g0 g0Var = this.f50961q;
            return g0Var == null || (bundle = g0Var.f51043e) == null || bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true);
        }

        public boolean y() {
            g0 g0Var;
            return this.f50949e && ((g0Var = this.f50961q) == null || g0Var.c());
        }

        public boolean z(C2811K c2811k, int i9) {
            if (c2811k.f()) {
                return false;
            }
            if ((i9 & 2) == 0 && this.f50959o) {
                return true;
            }
            g0 g0Var = this.f50961q;
            boolean z9 = g0Var != null && g0Var.d() && y();
            int size = this.f50952h.size();
            for (int i10 = 0; i10 < size; i10++) {
                h hVar = (h) this.f50952h.get(i10);
                if (((i9 & 1) == 0 || !hVar.w()) && ((!z9 || hVar.w() || hVar.r() == this.f50950f) && hVar.E(c2811k))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: u0.L$e */
    public interface e {
        InterfaceFutureC2987b onPrepareTransfer(h hVar, h hVar2);
    }

    /* JADX INFO: renamed from: u0.L$f */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2808H.e f50992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f50994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h f50995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final h f50996e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f50997f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final WeakReference f50998g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceFutureC2987b f50999h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f51000i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f51001j = false;

        public f(d dVar, h hVar, AbstractC2808H.e eVar, int i9, h hVar2, Collection collection) {
            this.f50998g = new WeakReference(dVar);
            this.f50995d = hVar;
            this.f50992a = eVar;
            this.f50993b = i9;
            this.f50994c = dVar.f50964t;
            this.f50996e = hVar2;
            this.f50997f = collection != null ? new ArrayList(collection) : null;
            dVar.f50958n.postDelayed(new RunnableC2813M(this), 15000L);
        }

        public void a() {
            if (this.f51000i || this.f51001j) {
                return;
            }
            this.f51001j = true;
            AbstractC2808H.e eVar = this.f50992a;
            if (eVar != null) {
                eVar.h(0);
                this.f50992a.d();
            }
        }

        public void b() {
            InterfaceFutureC2987b interfaceFutureC2987b;
            C2812L.d();
            if (this.f51000i || this.f51001j) {
                return;
            }
            d dVar = (d) this.f50998g.get();
            if (dVar == null || dVar.f50939C != this || ((interfaceFutureC2987b = this.f50999h) != null && interfaceFutureC2987b.isCancelled())) {
                a();
                return;
            }
            this.f51000i = true;
            dVar.f50939C = null;
            e();
            c();
        }

        public final void c() {
            d dVar = (d) this.f50998g.get();
            if (dVar == null) {
                return;
            }
            h hVar = this.f50995d;
            dVar.f50964t = hVar;
            dVar.f50965u = this.f50992a;
            h hVar2 = this.f50996e;
            if (hVar2 == null) {
                dVar.f50958n.c(262, new O.d(this.f50994c, hVar), this.f50993b);
            } else {
                dVar.f50958n.c(264, new O.d(hVar2, hVar), this.f50993b);
            }
            dVar.f50968x.clear();
            dVar.D();
            dVar.S();
            List list = this.f50997f;
            if (list != null) {
                dVar.f50964t.L(list);
            }
        }

        public void d(InterfaceFutureC2987b interfaceFutureC2987b) {
            d dVar = (d) this.f50998g.get();
            if (dVar == null || dVar.f50939C != this) {
                Log.w("MediaRouter", "Router is released. Cancel transfer");
                a();
            } else {
                if (this.f50999h != null) {
                    throw new IllegalStateException("future is already set");
                }
                this.f50999h = interfaceFutureC2987b;
                RunnableC2813M runnableC2813M = new RunnableC2813M(this);
                final d.HandlerC0460d handlerC0460d = dVar.f50958n;
                Objects.requireNonNull(handlerC0460d);
                interfaceFutureC2987b.addListener(runnableC2813M, new Executor() { // from class: u0.N
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handlerC0460d.post(runnable);
                    }
                });
            }
        }

        public final void e() {
            d dVar = (d) this.f50998g.get();
            if (dVar != null) {
                h hVar = dVar.f50964t;
                h hVar2 = this.f50994c;
                if (hVar != hVar2) {
                    return;
                }
                dVar.f50958n.c(263, hVar2, this.f50993b);
                AbstractC2808H.e eVar = dVar.f50965u;
                if (eVar != null) {
                    eVar.h(this.f50993b);
                    dVar.f50965u.d();
                }
                if (!dVar.f50968x.isEmpty()) {
                    for (AbstractC2808H.e eVar2 : dVar.f50968x.values()) {
                        eVar2.h(this.f50993b);
                        eVar2.d();
                    }
                    dVar.f50968x.clear();
                }
                dVar.f50965u = null;
            }
        }
    }

    /* JADX INFO: renamed from: u0.L$g */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC2808H f51002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f51003b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC2808H.d f51004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C2809I f51005d;

        public g(AbstractC2808H abstractC2808H) {
            this.f51002a = abstractC2808H;
            this.f51004c = abstractC2808H.q();
        }

        public h a(String str) {
            int size = this.f51003b.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((h) this.f51003b.get(i9)).f51007b.equals(str)) {
                    return (h) this.f51003b.get(i9);
                }
            }
            return null;
        }

        public int b(String str) {
            int size = this.f51003b.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((h) this.f51003b.get(i9)).f51007b.equals(str)) {
                    return i9;
                }
            }
            return -1;
        }

        public ComponentName c() {
            return this.f51004c.a();
        }

        public String d() {
            return this.f51004c.b();
        }

        public AbstractC2808H e() {
            C2812L.d();
            return this.f51002a;
        }

        public List f() {
            C2812L.d();
            return Collections.unmodifiableList(this.f51003b);
        }

        public boolean g() {
            C2809I c2809i = this.f51005d;
            return c2809i != null && c2809i.d();
        }

        public boolean h(C2809I c2809i) {
            if (this.f51005d == c2809i) {
                return false;
            }
            this.f51005d = c2809i;
            return true;
        }

        public String toString() {
            return "MediaRouter.RouteProviderInfo{ packageName=" + d() + " }";
        }
    }

    /* JADX INFO: renamed from: u0.L$h */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f51006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f51008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f51009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f51010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Uri f51011f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f51012g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f51013h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f51014i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f51016k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f51017l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f51018m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f51019n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f51020o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f51021p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Display f51022q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Bundle f51024s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public IntentSender f51025t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public C2806F f51026u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public Map f51028w;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final ArrayList f51015j = new ArrayList();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f51023r = -1;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public List f51027v = new ArrayList();

        /* JADX INFO: renamed from: u0.L$h$a */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbstractC2808H.b.c f51029a;

            public a(AbstractC2808H.b.c cVar) {
                this.f51029a = cVar;
            }

            public int a() {
                AbstractC2808H.b.c cVar = this.f51029a;
                if (cVar != null) {
                    return cVar.c();
                }
                return 1;
            }

            public boolean b() {
                AbstractC2808H.b.c cVar = this.f51029a;
                return cVar != null && cVar.d();
            }

            public boolean c() {
                AbstractC2808H.b.c cVar = this.f51029a;
                return cVar != null && cVar.e();
            }

            public boolean d() {
                AbstractC2808H.b.c cVar = this.f51029a;
                return cVar == null || cVar.f();
            }
        }

        public h(g gVar, String str, String str2) {
            this.f51006a = gVar;
            this.f51007b = str;
            this.f51008c = str2;
        }

        public static boolean D(h hVar) {
            return TextUtils.equals(hVar.r().q().b(), "android");
        }

        public final boolean A(List list, List list2) {
            if (list == list2) {
                return true;
            }
            if (list == null || list2 == null) {
                return false;
            }
            ListIterator listIterator = list.listIterator();
            ListIterator listIterator2 = list2.listIterator();
            while (listIterator.hasNext() && listIterator2.hasNext()) {
                if (!z((IntentFilter) listIterator.next(), (IntentFilter) listIterator2.next())) {
                    return false;
                }
            }
            return (listIterator.hasNext() || listIterator2.hasNext()) ? false : true;
        }

        public boolean B() {
            return this.f51026u != null && this.f51012g;
        }

        public boolean C() {
            C2812L.d();
            return C2812L.i().v() == this;
        }

        public boolean E(C2811K c2811k) {
            if (c2811k == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            C2812L.d();
            return c2811k.h(this.f51015j);
        }

        public int F(C2806F c2806f) {
            if (this.f51026u != c2806f) {
                return K(c2806f);
            }
            return 0;
        }

        public void G(int i9) {
            C2812L.d();
            C2812L.i().H(this, Math.min(this.f51021p, Math.max(0, i9)));
        }

        public void H(int i9) {
            C2812L.d();
            if (i9 != 0) {
                C2812L.i().I(this, i9);
            }
        }

        public void I() {
            C2812L.d();
            C2812L.i().J(this, 3);
        }

        public boolean J(String str) {
            if (str == null) {
                throw new IllegalArgumentException("category must not be null");
            }
            C2812L.d();
            int size = this.f51015j.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((IntentFilter) this.f51015j.get(i9)).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public int K(C2806F c2806f) {
            int i9;
            this.f51026u = c2806f;
            if (c2806f == null) {
                return 0;
            }
            if (O.c.a(this.f51009d, c2806f.o())) {
                i9 = 0;
            } else {
                this.f51009d = c2806f.o();
                i9 = 1;
            }
            if (!O.c.a(this.f51010e, c2806f.g())) {
                this.f51010e = c2806f.g();
                i9 = 1;
            }
            if (!O.c.a(this.f51011f, c2806f.k())) {
                this.f51011f = c2806f.k();
                i9 = 1;
            }
            if (this.f51012g != c2806f.w()) {
                this.f51012g = c2806f.w();
                i9 = 1;
            }
            if (this.f51013h != c2806f.e()) {
                this.f51013h = c2806f.e();
                i9 = 1;
            }
            if (!A(this.f51015j, c2806f.f())) {
                this.f51015j.clear();
                this.f51015j.addAll(c2806f.f());
                i9 = 1;
            }
            if (this.f51016k != c2806f.q()) {
                this.f51016k = c2806f.q();
                i9 = 1;
            }
            if (this.f51017l != c2806f.p()) {
                this.f51017l = c2806f.p();
                i9 = 1;
            }
            if (this.f51018m != c2806f.h()) {
                this.f51018m = c2806f.h();
                i9 = 1;
            }
            int i10 = 3;
            if (this.f51019n != c2806f.u()) {
                this.f51019n = c2806f.u();
                i9 = 3;
            }
            if (this.f51020o != c2806f.t()) {
                this.f51020o = c2806f.t();
                i9 = 3;
            }
            if (this.f51021p != c2806f.v()) {
                this.f51021p = c2806f.v();
            } else {
                i10 = i9;
            }
            if (this.f51023r != c2806f.r()) {
                this.f51023r = c2806f.r();
                this.f51022q = null;
                i10 |= 5;
            }
            if (!O.c.a(this.f51024s, c2806f.i())) {
                this.f51024s = c2806f.i();
                i10 |= 1;
            }
            if (!O.c.a(this.f51025t, c2806f.s())) {
                this.f51025t = c2806f.s();
                i10 |= 1;
            }
            if (this.f51014i != c2806f.a()) {
                this.f51014i = c2806f.a();
                i10 |= 5;
            }
            List listJ = c2806f.j();
            ArrayList arrayList = new ArrayList();
            boolean z9 = listJ.size() != this.f51027v.size();
            if (!listJ.isEmpty()) {
                d dVarI = C2812L.i();
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    h hVarR = dVarI.r(dVarI.w(q(), (String) it.next()));
                    if (hVarR != null) {
                        arrayList.add(hVarR);
                        if (!z9 && !this.f51027v.contains(hVarR)) {
                            z9 = true;
                        }
                    }
                }
            }
            if (!z9) {
                return i10;
            }
            this.f51027v = arrayList;
            return i10 | 1;
        }

        public void L(Collection collection) {
            this.f51027v.clear();
            if (this.f51028w == null) {
                this.f51028w = new C2695a();
            }
            this.f51028w.clear();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC2808H.b.c cVar = (AbstractC2808H.b.c) it.next();
                h hVarB = b(cVar);
                if (hVarB != null) {
                    this.f51028w.put(hVarB.f51008c, cVar);
                    if (cVar.c() == 2 || cVar.c() == 3) {
                        this.f51027v.add(hVarB);
                    }
                }
            }
            C2812L.i().f50958n.b(259, this);
        }

        public boolean a() {
            return this.f51014i;
        }

        public h b(AbstractC2808H.b.c cVar) {
            return q().a(cVar.b().l());
        }

        public int c() {
            return this.f51013h;
        }

        public String d() {
            return this.f51010e;
        }

        public String e() {
            return this.f51007b;
        }

        public int f() {
            return this.f51018m;
        }

        public AbstractC2808H.b g() {
            C2812L.d();
            AbstractC2808H.e eVar = C2812L.i().f50965u;
            if (eVar instanceof AbstractC2808H.b) {
                return (AbstractC2808H.b) eVar;
            }
            return null;
        }

        public a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("route must not be null");
            }
            Map map = this.f51028w;
            if (map == null || !map.containsKey(hVar.f51008c)) {
                return null;
            }
            return new a((AbstractC2808H.b.c) this.f51028w.get(hVar.f51008c));
        }

        public Bundle i() {
            return this.f51024s;
        }

        public Uri j() {
            return this.f51011f;
        }

        public String k() {
            return this.f51008c;
        }

        public List l() {
            return Collections.unmodifiableList(this.f51027v);
        }

        public String m() {
            return this.f51009d;
        }

        public int n() {
            return this.f51017l;
        }

        public int o() {
            return this.f51016k;
        }

        public int p() {
            return this.f51023r;
        }

        public g q() {
            return this.f51006a;
        }

        public AbstractC2808H r() {
            return this.f51006a.e();
        }

        public int s() {
            return this.f51020o;
        }

        public int t() {
            if (!y() || C2812L.o()) {
                return this.f51019n;
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MediaRouter.RouteInfo{ uniqueId=" + this.f51008c + ", name=" + this.f51009d + ", description=" + this.f51010e + ", iconUri=" + this.f51011f + ", enabled=" + this.f51012g + ", connectionState=" + this.f51013h + ", canDisconnect=" + this.f51014i + ", playbackType=" + this.f51016k + ", playbackStream=" + this.f51017l + ", deviceType=" + this.f51018m + ", volumeHandling=" + this.f51019n + ", volume=" + this.f51020o + ", volumeMax=" + this.f51021p + ", presentationDisplayId=" + this.f51023r + ", extras=" + this.f51024s + ", settingsIntent=" + this.f51025t + ", providerPackageName=" + this.f51006a.d());
            if (y()) {
                sb.append(", members=[");
                int size = this.f51027v.size();
                for (int i9 = 0; i9 < size; i9++) {
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    if (this.f51027v.get(i9) != this) {
                        sb.append(((h) this.f51027v.get(i9)).k());
                    }
                }
                sb.append(']');
            }
            sb.append(" }");
            return sb.toString();
        }

        public int u() {
            return this.f51021p;
        }

        public boolean v() {
            C2812L.d();
            return C2812L.i().o() == this;
        }

        public boolean w() {
            if (v() || this.f51018m == 3) {
                return true;
            }
            return D(this) && J("android.media.intent.category.LIVE_AUDIO") && !J("android.media.intent.category.LIVE_VIDEO");
        }

        public boolean x() {
            return this.f51012g;
        }

        public boolean y() {
            return l().size() >= 1;
        }

        public final boolean z(IntentFilter intentFilter, IntentFilter intentFilter2) {
            int iCountActions;
            if (intentFilter == intentFilter2) {
                return true;
            }
            if (intentFilter == null || intentFilter2 == null || (iCountActions = intentFilter.countActions()) != intentFilter2.countActions()) {
                return false;
            }
            for (int i9 = 0; i9 < iCountActions; i9++) {
                if (!intentFilter.getAction(i9).equals(intentFilter2.getAction(i9))) {
                    return false;
                }
            }
            int iCountCategories = intentFilter.countCategories();
            if (iCountCategories != intentFilter2.countCategories()) {
                return false;
            }
            for (int i10 = 0; i10 < iCountCategories; i10++) {
                if (!intentFilter.getCategory(i10).equals(intentFilter2.getCategory(i10))) {
                    return false;
                }
            }
            return true;
        }
    }

    public C2812L(Context context) {
        this.f50930a = context;
    }

    public static void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static int h() {
        if (f50929d == null) {
            return 0;
        }
        return i().n();
    }

    public static d i() {
        d dVar = f50929d;
        if (dVar == null) {
            return null;
        }
        dVar.i();
        return f50929d;
    }

    public static C2812L j(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        d();
        if (f50929d == null) {
            f50929d = new d(context.getApplicationContext());
        }
        return f50929d.s(context);
    }

    public static boolean o() {
        if (f50929d == null) {
            return false;
        }
        return i().x();
    }

    public static boolean p() {
        if (f50929d == null) {
            return false;
        }
        return i().y();
    }

    public static boolean r() {
        d dVarI = i();
        if (dVarI == null) {
            return false;
        }
        return dVarI.C();
    }

    public void a(C2811K c2811k, a aVar) {
        b(c2811k, aVar, 0);
    }

    public void b(C2811K c2811k, a aVar, int i9) {
        b bVar;
        boolean z9;
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (f50928c) {
            Log.d("MediaRouter", "addCallback: selector=" + c2811k + ", callback=" + aVar + ", flags=" + Integer.toHexString(i9));
        }
        int iE = e(aVar);
        if (iE < 0) {
            bVar = new b(this, aVar);
            this.f50931b.add(bVar);
        } else {
            bVar = (b) this.f50931b.get(iE);
        }
        boolean z10 = true;
        if (i9 != bVar.f50935d) {
            bVar.f50935d = i9;
            z9 = true;
        } else {
            z9 = false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i9 & 1) != 0) {
            z9 = true;
        }
        bVar.f50936e = jElapsedRealtime;
        if (bVar.f50934c.b(c2811k)) {
            z10 = z9;
        } else {
            bVar.f50934c = new C2811K.a(bVar.f50934c).c(c2811k).d();
        }
        if (z10) {
            i().Q();
        }
    }

    public void c(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        d();
        i().e(hVar);
    }

    public final int e(a aVar) {
        int size = this.f50931b.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((b) this.f50931b.get(i9)).f50933b == aVar) {
                return i9;
            }
        }
        return -1;
    }

    public h f() {
        d();
        d dVarI = i();
        if (dVarI == null) {
            return null;
        }
        return dVarI.m();
    }

    public h g() {
        d();
        return i().o();
    }

    public MediaSessionCompat.Token k() {
        d dVar = f50929d;
        if (dVar == null) {
            return null;
        }
        return dVar.q();
    }

    public g0 l() {
        d();
        d dVarI = i();
        if (dVarI == null) {
            return null;
        }
        return dVarI.t();
    }

    public List m() {
        d();
        d dVarI = i();
        return dVarI == null ? Collections.emptyList() : dVarI.u();
    }

    public h n() {
        d();
        return i().v();
    }

    public boolean q(C2811K c2811k, int i9) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        d();
        return i().z(c2811k, i9);
    }

    public void s(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        d();
        if (f50928c) {
            Log.d("MediaRouter", "removeCallback: callback=" + aVar);
        }
        int iE = e(aVar);
        if (iE >= 0) {
            this.f50931b.remove(iE);
            i().Q();
        }
    }

    public void t(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        d();
        i().F(hVar);
    }

    public void u(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        d();
        if (f50928c) {
            Log.d("MediaRouter", "selectRoute: " + hVar);
        }
        i().J(hVar, 3);
    }

    public void v(MediaSessionCompat mediaSessionCompat) {
        d();
        if (f50928c) {
            Log.d("MediaRouter", "setMediaSessionCompat: " + mediaSessionCompat);
        }
        i().L(mediaSessionCompat);
    }

    public void w(e eVar) {
        d();
        i().f50938B = eVar;
    }

    public void x(g0 g0Var) {
        d();
        i().N(g0Var);
    }

    public void y(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("route must not be null");
        }
        d();
        i().P(hVar);
    }

    public void z(int i9) {
        if (i9 < 0 || i9 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        d();
        d dVarI = i();
        h hVarH = dVarI.h();
        if (dVarI.v() != hVarH) {
            dVarI.J(hVarH, i9);
        }
    }
}
