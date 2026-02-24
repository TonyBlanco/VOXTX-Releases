package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.onesignal.C1562k1;
import com.onesignal.O;
import com.onesignal.R0;
import com.onesignal.S1;
import com.onesignal.T0;
import com.onesignal.T1;
import com.onesignal.Y1;
import com.onesignal.b2;
import com.onesignal.u2;
import d.AbstractC1617D;
import j$.time.ZoneId;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public abstract class F1 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static InterfaceC1565l1 f38243B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static O7.e f38244C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static C1562k1 f38245D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static C1541d1 f38246E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static R7.c f38247F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static T0 f38248G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Object f38249H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static String f38250I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static String f38251J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static OSUtils f38252K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static boolean f38253L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static boolean f38254M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static boolean f38255N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static boolean f38256O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static boolean f38257P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static O.d f38258Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static Collection f38259R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static HashSet f38260S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final ArrayList f38261T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static C1583s f38262U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static C1544e1 f38263V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static C1544e1 f38264W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static C1535b1 f38265X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static OSSubscriptionState f38266Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static OSSubscriptionState f38267Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static C1535b1 f38269a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f38270b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static C1590u0 f38271b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f38272c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static C1590u0 f38273c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f38274d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static C1535b1 f38275d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f38276e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static C1556i1 f38277e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static C1556i1 f38279f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static C1535b1 f38281g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static u f38283h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static Y1 f38285i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final List f38287j0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f38290m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f38291n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static l2 f38293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static j2 f38294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static k2 f38295r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static C1589u f38297t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f38268a = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static v f38278f = v.NONE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static v f38280g = v.WARN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f38282h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f38284i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f38286j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f38288k = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Q7.a f38289l = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static r f38292o = r.APP_CLOSE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static P0 f38296s = new O0();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static C1562k1.b f38298u = new c();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static C0 f38299v = new C0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static InterfaceC1588t1 f38300w = new C1591u1();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static C1553h1 f38301x = new C1553h1();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static C1580q1 f38302y = new C1580q1(f38296s);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static C1582r1 f38303z = new C1582r1(f38301x, f38296s);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static G1 f38242A = new U1();

    public interface A {
        void a(boolean z9);
    }

    public static class B {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f38304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38305b;

        public B(int i9, String str) {
            this.f38304a = str;
            this.f38305b = i9;
        }
    }

    /* JADX INFO: renamed from: com.onesignal.F1$a, reason: case insensitive filesystem */
    public class RunnableC1528a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                F1.l1();
            } catch (JSONException e9) {
                F1.b(v.FATAL, "FATAL Error registering device!", e9);
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.F1$b, reason: case insensitive filesystem */
    public class RunnableC1529b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38306a;

        public RunnableC1529b(JSONObject jSONObject, s sVar) {
            this.f38306a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            F1.f38296s.debug("Running sendTags() operation from pending task queue.");
            F1.z1(this.f38306a, null);
        }
    }

    public class c implements C1562k1.b {
        @Override // com.onesignal.C1562k1.b
        public void a(List list) {
            if (F1.f38246E == null) {
                F1.a(v.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (F1.f38246E != null) {
                F1.f38246E.e();
            }
            F1.a0().g(list);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38307a;

        public d(JSONObject jSONObject, s sVar) {
            this.f38307a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38307a == null) {
                F1.f38296s.error("Attempted to send null tags");
                return;
            }
            JSONObject jSONObject = W1.h(false).f38894b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = this.f38307a.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    Object objOpt = this.f38307a.opt(next);
                    if ((objOpt instanceof JSONArray) || (objOpt instanceof JSONObject)) {
                        F1.a(v.ERROR, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
                    } else if (!this.f38307a.isNull(next) && !"".equals(objOpt)) {
                        jSONObject2.put(next, objOpt.toString());
                    } else if (jSONObject != null && jSONObject.has(next)) {
                        jSONObject2.put(next, "");
                    }
                } catch (Throwable unused) {
                }
            }
            if (jSONObject2.toString().equals("{}")) {
                F1.f38296s.debug("Send tags ended successfully");
                return;
            }
            F1.f38296s.debug("Available tags to send: " + jSONObject2.toString());
            W1.q(jSONObject2, null);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f38308a;

        public e(w wVar) {
            this.f38308a = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            F1.f38296s.debug("Running getTags() operation from pending queue.");
            F1.u0(this.f38308a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f38309a;

        public f(w wVar) {
            this.f38309a = wVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (F1.f38261T) {
                try {
                    F1.f38261T.add(this.f38309a);
                    if (F1.f38261T.size() > 1) {
                        return;
                    }
                    F1.p1();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class g implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            u2.e eVarH = W1.h(!F1.f38255N);
            if (eVarH.f38893a) {
                boolean unused = F1.f38255N = true;
            }
            synchronized (F1.f38261T) {
                try {
                    Iterator it = F1.f38261T.iterator();
                    while (it.hasNext()) {
                        ((w) it.next()).a((eVarH.f38894b == null || eVarH.toString().equals("{}")) ? null : eVarH.f38894b);
                    }
                    F1.f38261T.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class h extends T1.g {
        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            F1.T0("sending Notification Opened Failed", i9, th, str);
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f38310a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f38311c;

        public i(x xVar, boolean z9) {
            this.f38310a = xVar;
            this.f38311c = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            F1.f38296s.debug("Running promptLocation() operation from pending queue.");
            F1.f1(this.f38310a, this.f38311c);
        }
    }

    public class j {
    }

    public class k extends O.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x f38312a;

        public k(x xVar) {
            this.f38312a = xVar;
        }

        @Override // com.onesignal.O.b
        public void a(O.d dVar) {
            if (F1.I1("promptLocation()") || dVar == null) {
                return;
            }
            W1.w(dVar);
        }

        @Override // com.onesignal.O.e
        public void b(z zVar) {
            super.b(zVar);
            x xVar = this.f38312a;
            if (xVar != null) {
                xVar.a(zVar);
            }
        }

        @Override // com.onesignal.O.b
        public O.f getType() {
            return O.f.PROMPT_LOCATION;
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f38313a;

        public l(int i9) {
            this.f38313a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            F1.f38296s.debug("Running removeNotification() operation from pending queue.");
            F1.n1(this.f38313a);
        }
    }

    public class m implements O.b {
        @Override // com.onesignal.O.b
        public void a(O.d dVar) {
            O.d unused = F1.f38258Q = dVar;
            boolean unused2 = F1.f38254M = true;
            F1.k1();
        }

        @Override // com.onesignal.O.b
        public O.f getType() {
            return O.f.STARTUP;
        }
    }

    public class n implements Y1.a {
        @Override // com.onesignal.Y1.a
        public void a(String str, int i9) {
            F1.f38296s.debug("registerForPushToken completed with id: " + str + " status: " + i9);
            if (i9 >= 1 ? F1.g1(F1.f38288k) : !(W1.e() != null || (F1.f38288k != 1 && !F1.g1(F1.f38288k)))) {
                int unused = F1.f38288k = i9;
            }
            String unused2 = F1.f38251J = str;
            boolean unused3 = F1.f38253L = true;
            F1.T(F1.f38270b).h(str);
            F1.k1();
        }
    }

    public class o implements S1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f38314a;

        public o(boolean z9) {
            this.f38314a = z9;
        }

        @Override // com.onesignal.S1.c
        public void a(S1.f fVar) {
            boolean unused = F1.f38257P = false;
            String str = fVar.f38539a;
            if (str != null) {
                F1.f38276e = str;
            }
            F1.f38301x.q(fVar, F1.f38244C, F1.f38243B, F1.f38296s);
            F1.b1();
            AbstractC1558j0.g(F1.f38270b, fVar.f38543e);
            if (this.f38314a) {
                F1.j1();
            }
        }
    }

    public class p implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f38315a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38316c;

        public p(v vVar, String str) {
            this.f38315a = vVar;
            this.f38316c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (F1.P() != null) {
                new AlertDialog.Builder(F1.P()).setTitle(this.f38315a.toString()).setMessage(this.f38316c).show();
            }
        }
    }

    public class q implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            F1.f38296s.debug("Running onAppLostFocus() operation from a pending task queue.");
            F1.B();
        }
    }

    public enum r {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        public boolean isAppClose() {
            return equals(APP_CLOSE);
        }

        public boolean isAppOpen() {
            return equals(APP_OPEN);
        }

        public boolean isNotificationClick() {
            return equals(NOTIFICATION_CLICK);
        }
    }

    public interface s {
        void a(B b9);
    }

    public interface t {
        void a(r rVar);
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONArray f38317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public T1.g f38319c;

        public u(JSONArray jSONArray) {
            this.f38317a = jSONArray;
        }
    }

    public enum v {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    public interface w {
        void a(JSONObject jSONObject);
    }

    public interface x {
        void a(z zVar);
    }

    public interface y {
        void a(C1538c1 c1538c1);
    }

    public enum z {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    static {
        C1568m1 c1568m1 = new C1568m1();
        f38243B = c1568m1;
        O7.e eVar = new O7.e(c1568m1, f38296s, f38300w);
        f38244C = eVar;
        f38245D = new C1562k1(f38298u, eVar, f38296s);
        f38249H = new j();
        f38250I = "native";
        f38252K = new OSUtils();
        f38259R = new ArrayList();
        f38260S = new HashSet();
        f38261T = new ArrayList();
        f38287j0 = new CopyOnWriteArrayList();
    }

    public static boolean A(v vVar) {
        return vVar.compareTo(f38278f) < 1 || vVar.compareTo(f38280g) < 1;
    }

    public static void A0() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            f38294q = new j2(f38270b);
        } catch (ClassNotFoundException unused) {
        }
    }

    public static void A1(String str) {
        if (str == null || str.isEmpty()) {
            f38296s.a("setAppId called with id: " + str + ", ignoring!");
            return;
        }
        if (!str.equals(f38274d)) {
            f38290m = false;
            f38296s.verbose("setAppId called with id: " + str + " changing id from: " + f38274d);
        }
        f38274d = str;
        if (f38270b == null) {
            f38296s.a("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
        } else {
            WeakReference weakReference = f38272c;
            J0((weakReference == null || weakReference.get() == null) ? f38270b : (Context) f38272c.get());
        }
    }

    public static void B() {
        if (f38291n) {
            return;
        }
        j2 j2Var = f38294q;
        if (j2Var != null) {
            j2Var.c();
        }
        a0().a();
        v1();
    }

    public static void B0() {
        String strN0 = n0();
        if (strN0 == null) {
            a(v.DEBUG, "App id set for first time:  " + f38274d);
            AbstractC1563l.d(0, f38270b);
            r1(f38274d);
            return;
        }
        if (strN0.equals(f38274d)) {
            return;
        }
        a(v.DEBUG, "App id has changed:\nFrom: " + strN0 + "\n To: " + f38274d + "\nClearing the user id, app state, and remoteParams as they are no longer valid");
        r1(f38274d);
        W1.o();
        f38301x.a();
    }

    public static void B1(boolean z9) {
        f38291n = z9;
    }

    public static void C(r rVar) {
        Iterator it = new ArrayList(f38268a).iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(rVar);
        }
    }

    public static void C0() {
    }

    public static void C1(long j9) {
        f38296s.debug("Last session time set to: " + j9);
        R1.l(R1.f38511a, "OS_LAST_SESSION_TIME", j9);
    }

    public static void D(v vVar, String str, Throwable th) {
        if (th != null) {
            str = str + "\n" + Log.getStackTraceString(th);
        }
        Iterator it = f38287j0.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            new M7.a(vVar, str);
            throw null;
        }
    }

    public static void D0(Activity activity, JSONArray jSONArray, String str) {
        if (I1(null)) {
            return;
        }
        W0(activity, jSONArray);
        if (f38295r != null && Z()) {
            f38295r.g(L(jSONArray));
        }
        if (H1(activity, jSONArray)) {
            y(str);
        }
        d1(activity, jSONArray);
        q1(jSONArray);
    }

    public static void D1(boolean z9) {
        if (j0().f()) {
            f38296s.a("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (!o1() || z9) {
            j0().o(z9);
        } else {
            a(v.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        }
    }

    public static void E(JSONArray jSONArray, s sVar) {
        if (I1("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                jSONObject.put(jSONArray.getString(i9), "");
            }
            z1(jSONObject, sVar);
        } catch (Throwable th) {
            b(v.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    public static void E0(V0 v02) {
        try {
            JSONObject jSONObject = new JSONObject(v02.e().toString());
            jSONObject.put("androidNotificationId", v02.a());
            Z0 z0L = L(T.g(jSONObject));
            if (f38295r == null || !Z()) {
                return;
            }
            f38295r.h(z0L);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public static void E1(boolean z9) {
        C1533b.c((Application) f38270b);
        if (z9) {
            f38289l = new Q7.a(f38243B);
            R1.o();
            M1 m1U = U();
            T0 t02 = new T0(m1U, f38296s);
            f38248G = t02;
            t02.h();
            b0().D();
            if (f38247F == null) {
                f38247F = new R7.c(f38296s, f38242A, m1U, f38243B);
            }
            f38245D.g();
            f0().d();
        }
    }

    public static void F() {
        if (J1()) {
            f38296s.debug("Starting new session with appEntryState: " + M());
            W1.r();
            f0().e();
            f38245D.m(M());
            b0().n0();
            C1(f38300w.a());
        } else if (N0()) {
            f38296s.debug("Continue on same session with appEntryState: " + M());
            f38245D.c(M());
        }
        b0().T();
        if (!f38291n && I0()) {
            f38296s.debug("doSessionInit on background with already registered user");
        }
        M1();
    }

    public static void F0() {
    }

    public static void F1(Context context) {
        String string;
        ApplicationInfo applicationInfoA = AbstractC1557j.f38736a.a(context);
        if (applicationInfoA == null || (string = applicationInfoA.metaData.getString("com.onesignal.PrivacyConsent")) == null) {
            return;
        }
        D1("ENABLE".equalsIgnoreCase(string));
    }

    public static void G() {
    }

    public static boolean G0() {
        return !TextUtils.isEmpty(f38284i);
    }

    public static boolean G1(V0 v02) {
        v vVar;
        String str;
        if (N0()) {
            vVar = v.INFO;
            str = "No NotificationWillShowInForegroundHandler setup, show notification";
        } else {
            vVar = v.INFO;
            str = "App is in background, show notification";
        }
        c1(vVar, str);
        return false;
    }

    public static void H() {
    }

    public static boolean H0() {
        return !TextUtils.isEmpty(f38286j);
    }

    public static boolean H1(Activity activity, JSONArray jSONArray) {
        if (f38291n) {
            return false;
        }
        try {
            return new Y0(activity, jSONArray.getJSONObject(0)).a();
        } catch (JSONException e9) {
            e9.printStackTrace();
            return true;
        }
    }

    public static void I(S0 s02) {
        c1(v.INFO, "Fire notificationWillShowInForegroundHandler");
        C1532a1 c1532a1C = s02.c();
        try {
            throw null;
        } catch (Throwable th) {
            c1(v.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            c1532a1C.b(c1532a1C.c());
            throw th;
        }
    }

    public static boolean I0() {
        return y0() != null;
    }

    public static boolean I1(String str) {
        if (!o1()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        a(v.WARN, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
        return true;
    }

    public static void J() {
    }

    public static synchronized void J0(Context context) {
        P0 p02;
        String str;
        f38296s.verbose("Starting OneSignal initialization!");
        S0.h(f38270b);
        if (!o1() && f38301x.k()) {
            int iA = f38288k;
            if (iA == Integer.MAX_VALUE) {
                iA = f38252K.A(f38270b, f38274d);
            }
            f38288k = iA;
            if (R0()) {
                return;
            }
            if (f38290m) {
                f38296s.debug("OneSignal SDK initialization already completed.");
                return;
            }
            z0(context);
            f38272c = null;
            W1.k();
            B0();
            A0();
            OSPermissionChangedInternalObserver.b(R(f38270b));
            F();
            if (l2.a(f38270b)) {
                f38293p = new l2(f38270b);
            }
            if (k2.a()) {
                f38295r = new k2(f38270b);
            }
            f38290m = true;
            a(v.VERBOSE, "OneSignal SDK initialization done.");
            f0().q();
            f38303z.f();
            return;
        }
        if (f38301x.k()) {
            p02 = f38296s;
            str = "OneSignal SDK initialization delayed, waiting for privacy consent to be set.";
        } else {
            p02 = f38296s;
            str = "OneSignal SDK initialization delayed, waiting for remote params.";
        }
        p02.verbose(str);
        f38262U = new C1583s(f38270b, f38274d);
        String str2 = f38274d;
        f38274d = null;
        if (str2 != null && context != null) {
            U0(str2, y0(), false);
        }
    }

    public static boolean J1() {
        return N0() && Q0();
    }

    public static void K(JSONObject jSONObject) {
    }

    public static void K0(Context context) {
        if (context == null) {
            f38296s.a("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f38272c = new WeakReference((Activity) context);
        }
        boolean z9 = f38270b == null;
        f38270b = context.getApplicationContext();
        E1(z9);
        F1(f38270b);
        if (f38274d != null) {
            f38296s.verbose("initWithContext called with: " + context);
            J0(context);
            return;
        }
        String strN0 = n0();
        if (strN0 == null) {
            f38296s.a("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
            return;
        }
        f38296s.verbose("appContext set and cached app id found, calling setAppId with: " + strN0);
        A1(strN0);
    }

    public static void K1(boolean z9) {
        f38296s.debug("OneSignal startLocationShared: " + z9);
        j0().n(z9);
        if (z9) {
            return;
        }
        f38296s.debug("OneSignal is shareLocation set false, clearing last location!");
        W1.a();
    }

    public static Z0 L(JSONArray jSONArray) {
        int length = jSONArray.length();
        int iOptInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z9 = true;
        String strOptString = null;
        JSONObject jSONObject = null;
        for (int i9 = 0; i9 < length; i9++) {
            try {
                jSONObject = jSONArray.getJSONObject(i9);
                if (strOptString == null && jSONObject.has("actionId")) {
                    strOptString = jSONObject.optString("actionId", null);
                }
                if (z9) {
                    z9 = false;
                } else {
                    arrayList.add(new Q0(jSONObject));
                }
            } catch (Throwable th) {
                b(v.ERROR, "Error parsing JSON item " + i9 + "/" + length + " for callback.", th);
            }
        }
        return new Z0(new Q0(arrayList, jSONObject, iOptInt), new R0(strOptString != null ? R0.a.ActionTaken : R0.a.Opened, strOptString));
    }

    public static void L0() {
        ArrayList arrayList = f38261T;
        synchronized (arrayList) {
            try {
                if (arrayList.size() == 0) {
                    return;
                }
                new Thread(new g(), "OS_GETTAGS_CALLBACK").start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void L1() {
        O.g(f38270b, false, false, new m());
    }

    public static r M() {
        return f38292o;
    }

    public static boolean M0() {
        return f38290m && N0();
    }

    public static void M1() {
        if (f38256O) {
            return;
        }
        f38256O = true;
        if (f38291n && W1.g()) {
            f38254M = false;
        }
        L1();
        f38253L = false;
        if (k0() != null) {
            j1();
        } else {
            U0(f38274d, y0(), true);
        }
    }

    public static Integer N() {
        com.onesignal.A a9 = X1.f38626a.a(f38270b, f38270b.getPackageName(), 0);
        if (!a9.b() || a9.a() == null) {
            return null;
        }
        return Integer.valueOf(a9.a().versionCode);
    }

    public static boolean N0() {
        return f38291n;
    }

    public static void N1(String str) {
        s1(str);
        Q(f38270b).f(str);
        try {
            W1.x(new JSONObject().put("parent_player_id", str));
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public static boolean O() {
        return f38301x.b();
    }

    public static boolean O0() {
        return f38290m;
    }

    public static void O1(String str) {
        t1(str);
        S(f38270b).f(str);
    }

    public static Activity P() {
        C1530a c1530aB = C1533b.b();
        if (c1530aB != null) {
            return c1530aB.e();
        }
        return null;
    }

    public static boolean P0() {
        return f38301x.h();
    }

    public static void P1(String str) {
        u1(str);
        L0();
        T(f38270b).i(str);
        u uVar = f38283h0;
        if (uVar != null) {
            x1(uVar.f38317a, uVar.f38318b, uVar.f38319c);
            f38283h0 = null;
        }
        W1.n();
    }

    public static C1590u0 Q(Context context) {
        if (context == null) {
            return null;
        }
        if (f38271b0 == null) {
            C1590u0 c1590u0 = new C1590u0(false);
            f38271b0 = c1590u0;
            c1590u0.b().b(new OSEmailSubscriptionChangedInternalObserver());
        }
        return f38271b0;
    }

    public static boolean Q0() {
        long jA = v0().a();
        long jC0 = c0();
        long j9 = jA - jC0;
        f38296s.debug("isPastOnSessionTime currentTimeMillis: " + jA + " lastSessionTime: " + jC0 + " difference: " + j9);
        return j9 >= 30000;
    }

    public static boolean Q1() {
        return f38301x.e();
    }

    public static C1544e1 R(Context context) {
        if (context == null) {
            return null;
        }
        if (f38263V == null) {
            C1544e1 c1544e1 = new C1544e1(false);
            f38263V = c1544e1;
            c1544e1.d().b(new OSPermissionChangedInternalObserver());
        }
        return f38263V;
    }

    public static boolean R0() {
        return f38288k == -999;
    }

    public static C1556i1 S(Context context) {
        if (context == null) {
            return null;
        }
        if (f38277e0 == null) {
            C1556i1 c1556i1 = new C1556i1(false);
            f38277e0 = c1556i1;
            c1556i1.b().b(new OSSMSSubscriptionChangedInternalObserver());
        }
        return f38277e0;
    }

    public static boolean S0() {
        return f38301x.i();
    }

    public static OSSubscriptionState T(Context context) {
        if (context == null) {
            return null;
        }
        if (f38266Y == null) {
            f38266Y = new OSSubscriptionState(false, R(context).b());
            R(context).d().a(f38266Y);
            f38266Y.b().b(new OSSubscriptionChangedInternalObserver());
        }
        return f38266Y;
    }

    public static void T0(String str, int i9, Throwable th, String str2) {
        String str3;
        if (str2 == null || !A(v.INFO)) {
            str3 = "";
        } else {
            str3 = "\n" + str2 + "\n";
        }
        b(v.WARN, "HTTP code: " + i9 + " " + str + str3, th);
    }

    public static M1 U() {
        return M1.i(f38270b);
    }

    public static void U0(String str, String str2, boolean z9) {
        if (k0() != null || f38257P) {
            return;
        }
        f38257P = true;
        S1.e(str, str2, new o(z9));
    }

    public static M1 V(Context context) {
        return M1.i(context);
    }

    public static void V0(Context context, JSONObject jSONObject, T0.d dVar) {
        if (f38248G == null) {
            f38248G = new T0(V(context), f38296s);
        }
        f38248G.j(jSONObject, dVar);
    }

    public static boolean W() {
        return f38301x.g();
    }

    public static void W0(Context context, JSONArray jSONArray) {
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            try {
                String strOptString = new JSONObject(jSONArray.getJSONObject(i9).optString("custom", null)).optString("i", null);
                if (!f38260S.contains(strOptString)) {
                    f38260S.add(strOptString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", o0(context));
                    jSONObject.put("player_id", p0(context));
                    jSONObject.put("opened", true);
                    jSONObject.put("device_type", f38252K.e());
                    T1.l("notifications/" + strOptString, jSONObject, new h());
                }
            } catch (Throwable th) {
                b(v.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    public static String X() {
        if (f38284i == null && f38270b != null) {
            f38284i = R1.f(R1.f38511a, "OS_EMAIL_ID", null);
        }
        if (TextUtils.isEmpty(f38284i)) {
            return null;
        }
        return f38284i;
    }

    public static void X0() {
        v vVar = v.DEBUG;
        a(vVar, "Application on focus");
        B1(true);
        r rVar = f38292o;
        r rVar2 = r.NOTIFICATION_CLICK;
        if (!rVar.equals(rVar2)) {
            C(f38292o);
            if (!f38292o.equals(rVar2)) {
                f38292o = r.APP_OPEN;
            }
        }
        O.l();
        C1573o0.f38786a.h();
        if (OSUtils.T(f38274d)) {
            return;
        }
        if (f38301x.k()) {
            Y0();
        } else {
            a(vVar, "Delay onAppFocus logic due to missing remote params");
            U0(f38274d, y0(), false);
        }
    }

    public static C1535b1 Y() {
        if (f38275d0 == null) {
            f38275d0 = new C1535b1("onOSEmailSubscriptionChanged", true);
        }
        return f38275d0;
    }

    public static void Y0() {
        if (I1("onAppFocus")) {
            return;
        }
        a0().b();
        F();
        l2 l2Var = f38293p;
        if (l2Var != null) {
            l2Var.u();
        }
        OSNotificationRestoreWorkManager.c(f38270b, false);
        i1();
        if (f38295r != null && Z()) {
            f38295r.f();
        }
        C1574o1.q().p(f38270b);
    }

    public static boolean Z() {
        return f38301x.c();
    }

    public static void Z0() {
        a(v.DEBUG, "Application lost focus initDone: " + f38290m);
        B1(false);
        f38292o = r.APP_CLOSE;
        C1(v0().a());
        O.l();
        if (f38290m) {
            B();
        } else if (f38303z.g("onAppLostFocus()")) {
            f38296s.error("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
            f38303z.c(new q());
        }
    }

    public static void a(v vVar, String str) {
        b(vVar, str, null);
    }

    public static C1589u a0() {
        if (f38297t == null) {
            f38297t = new C1589u(new C1599x0(), f38296s);
        }
        return f38297t;
    }

    public static void a1() {
        i1();
    }

    public static void b(v vVar, String str, Throwable th) {
        if (vVar.compareTo(f38280g) < 1) {
            if (vVar == v.VERBOSE) {
                Log.v("OneSignal", str, th);
            } else if (vVar == v.DEBUG) {
                Log.d("OneSignal", str, th);
            } else if (vVar == v.INFO) {
                Log.i("OneSignal", str, th);
            } else if (vVar == v.WARN) {
                Log.w("OneSignal", str, th);
            } else if (vVar == v.ERROR || vVar == v.FATAL) {
                Log.e("OneSignal", str, th);
            }
        }
        if (vVar.compareTo(f38278f) < 1 && P() != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    String str3 = str2 + th.getMessage();
                    StringWriter stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = str3 + stringWriter.toString();
                }
                OSUtils.S(new p(vVar, str2));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
        D(vVar, str, th);
    }

    public static B0 b0() {
        return f38299v.a(U(), f38302y, d0(), s0(), f38289l);
    }

    public static void b1() {
        if (h1() || !f38291n) {
            return;
        }
        Y0();
    }

    public static long c0() {
        return R1.d(R1.f38511a, "OS_LAST_SESSION_TIME", -31000L);
    }

    public static void c1(v vVar, String str) {
        a(vVar, str);
    }

    public static P0 d0() {
        return f38296s;
    }

    public static void d1(Activity activity, JSONArray jSONArray) {
        try {
            Intent intentB = C1604z.f38964a.a(activity, jSONArray.getJSONObject(0)).b();
            if (intentB != null) {
                f38296s.info("SDK running startActivity with Intent: " + intentB);
                activity.startActivity(intentB);
            } else {
                f38296s.info("SDK not showing an Activity automatically due to it's settings.");
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public static String e0(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString("custom"));
        } catch (JSONException unused) {
            f38296s.debug("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        f38296s.debug("Not a OneSignal formatted FCM message. No 'i' field in custom.");
        return null;
    }

    public static void e1(boolean z9, A a9) {
        C1573o0.f38786a.i(z9, a9);
    }

    public static C1541d1 f0() {
        if (f38246E == null) {
            synchronized (f38249H) {
                try {
                    if (f38246E == null) {
                        if (f38247F == null) {
                            f38247F = new R7.c(f38296s, f38242A, U(), f38243B);
                        }
                        f38246E = new C1541d1(f38245D, f38247F);
                    }
                } finally {
                }
            }
        }
        return f38246E;
    }

    public static void f1(x xVar, boolean z9) {
        if (f38303z.g("promptLocation()")) {
            f38296s.error("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            f38303z.c(new i(xVar, z9));
        } else {
            if (I1("promptLocation()")) {
                return;
            }
            O.g(f38270b, true, z9, new k(xVar));
        }
    }

    public static C1535b1 g0() {
        if (f38265X == null) {
            f38265X = new C1535b1("onOSPermissionChanged", true);
        }
        return f38265X;
    }

    public static boolean g1(int i9) {
        return i9 < -6;
    }

    public static Y1 h0() {
        Y1 c2Var;
        Y1 y12 = f38285i0;
        if (y12 != null) {
            return y12;
        }
        if (OSUtils.C()) {
            c2Var = new Z1();
        } else {
            if (OSUtils.B()) {
                if (OSUtils.r()) {
                    c2Var = i0();
                }
                return f38285i0;
            }
            c2Var = new c2();
        }
        f38285i0 = c2Var;
        return f38285i0;
    }

    public static boolean h1() {
        String strA;
        Context contextB;
        if (f38290m) {
            return false;
        }
        C1583s c1583s = f38262U;
        if (c1583s == null) {
            strA = n0();
            contextB = f38270b;
            f38296s.error("Trying to continue OneSignal with null delayed params");
        } else {
            strA = c1583s.a();
            contextB = f38262U.b();
        }
        f38296s.debug("reassignDelayedInitParams with appContext: " + f38270b);
        f38262U = null;
        A1(strA);
        if (f38290m) {
            return true;
        }
        if (contextB == null) {
            f38296s.error("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        K0(contextB);
        return true;
    }

    public static b2 i0() {
        S1.d dVar = f38301x.d().f38553o;
        return new b2(f38270b, dVar != null ? new b2.a(dVar.f38528a, dVar.f38529b, dVar.f38530c) : null);
    }

    public static void i1() {
        R(f38270b).f();
    }

    public static C1553h1 j0() {
        return f38301x;
    }

    public static void j1() {
        h0().a(f38270b, f38276e, new n());
    }

    public static S1.f k0() {
        return f38301x.d();
    }

    public static void k1() {
        f38296s.debug("registerUser:registerForPushFired:" + f38253L + ", locationFired: " + f38254M + ", remoteParams: " + k0() + ", appId: " + f38274d);
        if (!f38253L || !f38254M || k0() == null || f38274d == null) {
            f38296s.debug("registerUser not possible");
        } else {
            OSUtils.W(new Thread(new RunnableC1528a(), "OS_REG_USER"));
        }
    }

    public static String l0() {
        if (f38286j == null && f38270b != null) {
            f38286j = R1.f(R1.f38511a, "PREFS_OS_SMS_ID", null);
        }
        if (TextUtils.isEmpty(f38286j)) {
            return null;
        }
        return f38286j;
    }

    public static void l1() throws JSONException {
        O.d dVar;
        String packageName = f38270b.getPackageName();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", n0());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", x0());
        jSONObject.put("timezone_id", w0());
        jSONObject.put(IjkMediaMeta.IJKM_KEY_LANGUAGE, f38289l.b());
        jSONObject.put("sdk", "040812");
        jSONObject.put("sdk_type", f38250I);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        Integer numN = N();
        if (numN != null) {
            jSONObject.put("game_version", numN);
        }
        jSONObject.put("net_type", f38252K.i());
        jSONObject.put("carrier", f38252K.d());
        jSONObject.put("rooted", h2.a());
        W1.v(jSONObject, null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", f38251J);
        jSONObject2.put("subscribableStatus", f38288k);
        jSONObject2.put("androidPermission", z());
        jSONObject2.put("device_type", f38252K.e());
        W1.x(jSONObject2);
        if (P0() && (dVar = f38258Q) != null) {
            W1.w(dVar);
        }
        f38296s.debug("registerUserTask calling readyToUpdate");
        W1.m(true);
        f38256O = false;
    }

    public static C1535b1 m0() {
        if (f38281g0 == null) {
            f38281g0 = new C1535b1("onSMSSubscriptionChanged", true);
        }
        return f38281g0;
    }

    public static void m1(t tVar) {
        f38268a.remove(tVar);
    }

    public static String n0() {
        return o0(f38270b);
    }

    public static void n1(int i9) {
        if (f38303z.g("removeNotification()") || f38248G == null) {
            f38296s.error("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            f38303z.c(new l(i9));
        } else {
            if (I1("removeNotification()")) {
                return;
            }
            f38248G.k(i9, new WeakReference(f38270b));
        }
    }

    public static String o0(Context context) {
        if (context == null) {
            return null;
        }
        return R1.f(R1.f38511a, "GT_APP_ID", null);
    }

    public static boolean o1() {
        return f38270b == null || (S0() && !Q1());
    }

    public static String p0(Context context) {
        if (context == null) {
            return null;
        }
        return R1.f(R1.f38511a, "GT_PLAYER_ID", null);
    }

    public static void p1() {
        if (y0() == null) {
            f38296s.a("getTags called under a null user!");
        } else {
            L0();
        }
    }

    public static String q0() {
        return "040812";
    }

    public static void q1(JSONArray jSONArray) {
        f38259R.add(jSONArray);
    }

    public static C1562k1 r0() {
        return f38245D;
    }

    public static void r1(String str) {
        if (f38270b == null) {
            return;
        }
        R1.m(R1.f38511a, "GT_APP_ID", str);
    }

    public static InterfaceC1565l1 s0() {
        return f38243B;
    }

    public static void s1(String str) {
        f38284i = str;
        if (f38270b == null) {
            return;
        }
        R1.m(R1.f38511a, "OS_EMAIL_ID", "".equals(f38284i) ? null : f38284i);
    }

    public static C1535b1 t0() {
        if (f38269a0 == null) {
            f38269a0 = new C1535b1("onOSSubscriptionChanged", true);
        }
        return f38269a0;
    }

    public static void t1(String str) {
        f38286j = str;
        if (f38270b == null) {
            return;
        }
        R1.m(R1.f38511a, "PREFS_OS_SMS_ID", "".equals(f38286j) ? null : f38286j);
    }

    public static void u0(w wVar) {
        if (f38303z.g("getTags()")) {
            f38296s.error("Waiting for remote params. Moving getTags() operation to a pending queue.");
            f38303z.c(new e(wVar));
        } else {
            if (I1("getTags()")) {
                return;
            }
            if (wVar == null) {
                f38296s.error("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new f(wVar), "OS_GETTAGS").start();
            }
        }
    }

    public static void u1(String str) {
        f38282h = str;
        if (f38270b == null) {
            return;
        }
        R1.m(R1.f38511a, "GT_PLAYER_ID", f38282h);
    }

    public static InterfaceC1588t1 v0() {
        return f38300w;
    }

    public static boolean v1() {
        boolean zL = W1.l();
        f38296s.debug("OneSignal scheduleSyncService unsyncedChanges: " + zL);
        if (zL) {
            C1574o1.q().s(f38270b);
        }
        boolean zM = O.m(f38270b);
        f38296s.debug("OneSignal scheduleSyncService locationScheduled: " + zM);
        return zM || zL;
    }

    public static String w0() {
        return Build.VERSION.SDK_INT >= 26 ? ZoneId.systemDefault().getId() : TimeZone.getDefault().getID();
    }

    public static void w1(List list) {
        C1541d1 c1541d1 = f38246E;
        if (c1541d1 == null || f38274d == null) {
            a(v.ERROR, "Make sure OneSignal.init is called first");
        } else {
            c1541d1.m(list);
        }
    }

    public static void x(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", f38252K.i());
        } catch (Throwable unused) {
        }
    }

    public static int x0() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    public static void x1(JSONArray jSONArray, boolean z9, T1.g gVar) {
        if (I1("sendPurchases()")) {
            return;
        }
        if (y0() == null) {
            u uVar = new u(jSONArray);
            f38283h0 = uVar;
            uVar.f38318b = z9;
            uVar.f38319c = gVar;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", n0());
            if (z9) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", jSONArray);
            W1.p(jSONObject, gVar);
        } catch (Throwable th) {
            b(v.ERROR, "Failed to generate JSON for sendPurchases.", th);
        }
    }

    public static void y(String str) {
        r rVar = r.NOTIFICATION_CLICK;
        f38292o = rVar;
        f38245D.j(rVar, str);
    }

    public static String y0() {
        Context context;
        if (f38282h == null && (context = f38270b) != null) {
            f38282h = p0(context);
        }
        return f38282h;
    }

    public static void y1(JSONObject jSONObject) {
        z1(jSONObject, null);
    }

    public static boolean z() {
        if (f38301x.t()) {
            return OSUtils.a(f38270b);
        }
        return true;
    }

    public static void z0(Context context) {
        C1530a c1530aB = C1533b.b();
        boolean z9 = context instanceof Activity;
        boolean z10 = P() == null;
        B1(!z10 || z9);
        f38296s.debug("OneSignal handleActivityLifecycleHandler inForeground: " + f38291n);
        if (!f38291n) {
            if (c1530aB != null) {
                c1530aB.t(true);
                return;
            }
            return;
        }
        if (z10 && z9 && c1530aB != null) {
            c1530aB.s((Activity) context);
            c1530aB.t(true);
        }
        OSNotificationRestoreWorkManager.c(context, false);
        a0().b();
    }

    public static void z1(JSONObject jSONObject, s sVar) {
        if (f38303z.g("sendTags()")) {
            f38296s.error("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            f38303z.c(new RunnableC1529b(jSONObject, sVar));
        } else {
            if (I1("sendTags()")) {
                return;
            }
            d dVar = new d(jSONObject, sVar);
            if (!f38303z.e()) {
                dVar.run();
            } else {
                f38296s.debug("Sending sendTags() operation to pending task queue.");
                f38303z.c(dVar);
            }
        }
    }
}
