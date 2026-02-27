package com.onesignal;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.C1577p1;
import com.onesignal.C1584s0;
import com.onesignal.C1605z0;
import com.onesignal.F1;
import com.onesignal.M0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.client.config.CookieSpecs;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class B0 extends AbstractC1579q0 implements C1584s0.c, C1577p1.c {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f38122u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static ArrayList f38123v = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P0 f38124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1580q1 f38125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q7.a f38126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1577p1 f38127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public M0 f38128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1600x1 f38129f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f38131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f38132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f38133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set f38134k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f38135l;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Date f38143t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f38136m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public I0 f38137n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f38138o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f38139p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f38140q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public A0 f38141r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f38142s = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f38130g = new ArrayList();

    public class a implements M0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D0 f38145b;

        public a(String str, D0 d02) {
            this.f38144a = str;
            this.f38145b = d02;
        }

        @Override // com.onesignal.M0.i
        public void a(String str) {
            B0.this.f38134k.remove(this.f38144a);
            this.f38145b.m(this.f38144a);
        }

        @Override // com.onesignal.M0.i
        public void onSuccess(String str) {
        }
    }

    public class b extends AbstractRunnableC1560k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0 f38147a;

        public b(D0 d02) {
            this.f38147a = d02;
        }

        @Override // com.onesignal.AbstractRunnableC1560k, java.lang.Runnable
        public void run() {
            super.run();
            B0.this.f38128e.A(this.f38147a);
            B0.this.f38128e.B(B0.this.f38143t);
        }
    }

    public class c implements F1.w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f38149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D0 f38150b;

        public c(boolean z9, D0 d02) {
            this.f38149a = z9;
            this.f38150b = d02;
        }

        @Override // com.onesignal.F1.w
        public void a(JSONObject jSONObject) {
            B0.this.f38142s = false;
            if (jSONObject != null) {
                B0.this.f38140q = jSONObject.toString();
            }
            if (B0.this.f38141r != null) {
                if (!this.f38149a) {
                    F1.r0().k(this.f38150b.f38963a);
                }
                A0 a02 = B0.this.f38141r;
                B0 b02 = B0.this;
                a02.h(b02.t0(b02.f38141r.a()));
                v2.I(this.f38150b, B0.this.f38141r);
                B0.this.f38141r = null;
            }
        }
    }

    public class d implements M0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0 f38152a;

        public d(D0 d02) {
            this.f38152a = d02;
        }

        @Override // com.onesignal.M0.i
        public void a(String str) {
            B0.this.f38139p = false;
            try {
                if (new JSONObject(str).getBoolean("retry")) {
                    B0.this.k0(this.f38152a);
                } else {
                    B0.this.Y(this.f38152a, true);
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }

        @Override // com.onesignal.M0.i
        public void onSuccess(String str) {
            try {
                A0 a0H0 = B0.this.h0(new JSONObject(str), this.f38152a);
                if (a0H0.a() == null) {
                    B0.this.f38124a.debug("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                    return;
                }
                if (B0.this.f38142s) {
                    B0.this.f38141r = a0H0;
                    return;
                }
                F1.r0().k(this.f38152a.f38963a);
                B0.this.f0(this.f38152a);
                a0H0.h(B0.this.t0(a0H0.a()));
                v2.I(this.f38152a, a0H0);
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    public class e implements M0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0 f38154a;

        public e(D0 d02) {
            this.f38154a = d02;
        }

        @Override // com.onesignal.M0.i
        public void a(String str) {
            B0.this.E(null);
        }

        @Override // com.onesignal.M0.i
        public void onSuccess(String str) {
            try {
                A0 a0H0 = B0.this.h0(new JSONObject(str), this.f38154a);
                if (a0H0.a() == null) {
                    B0.this.f38124a.debug("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else {
                    if (B0.this.f38142s) {
                        B0.this.f38141r = a0H0;
                        return;
                    }
                    B0.this.f0(this.f38154a);
                    a0H0.h(B0.this.t0(a0H0.a()));
                    v2.I(this.f38154a, a0H0);
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    public class f extends AbstractRunnableC1560k {
        public f() {
        }

        @Override // com.onesignal.AbstractRunnableC1560k, java.lang.Runnable
        public void run() {
            super.run();
            B0.this.f38128e.h();
        }
    }

    public class g extends ArrayList {
        public g() {
            add("android");
            add("app");
            add("all");
        }
    }

    public class h extends AbstractRunnableC1560k {
        public h() {
        }

        @Override // com.onesignal.AbstractRunnableC1560k, java.lang.Runnable
        public void run() {
            super.run();
            synchronized (B0.f38122u) {
                B0 b02 = B0.this;
                b02.f38136m = b02.f38128e.k();
                B0.this.f38124a.debug("Retrieved IAMs from DB redisplayedInAppMessages: " + B0.this.f38136m.toString());
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONArray f38158a;

        public i(JSONArray jSONArray) {
            this.f38158a = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            B0.this.m0();
            try {
                B0.this.j0(this.f38158a);
            } catch (JSONException e9) {
                B0.this.f38124a.error("ERROR processing InAppMessageJson JSON Response.", e9);
            }
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            B0.this.f38124a.debug("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
            B0.this.H();
        }
    }

    public class k implements M0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0 f38161a;

        public k(D0 d02) {
            this.f38161a = d02;
        }

        @Override // com.onesignal.M0.i
        public void a(String str) {
            B0.this.f38132i.remove(this.f38161a.f38963a);
        }

        @Override // com.onesignal.M0.i
        public void onSuccess(String str) {
        }
    }

    public class l implements F1.x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0 f38163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f38164b;

        public l(D0 d02, List list) {
            this.f38163a = d02;
            this.f38164b = list;
        }

        @Override // com.onesignal.F1.x
        public void a(F1.z zVar) {
            B0.this.f38137n = null;
            B0.this.f38124a.debug("IAM prompt to handle finished with result: " + zVar);
            D0 d02 = this.f38163a;
            if (d02.f38193k && zVar == F1.z.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                B0.this.r0(d02, this.f38164b);
            } else {
                B0.this.s0(d02, this.f38164b);
            }
        }
    }

    public class m implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ D0 f38166a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f38167c;

        public m(D0 d02, List list) {
            this.f38166a = d02;
            this.f38167c = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            B0.this.s0(this.f38166a, this.f38167c);
        }
    }

    public class n implements M0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38169a;

        public n(String str) {
            this.f38169a = str;
        }

        @Override // com.onesignal.M0.i
        public void a(String str) {
            B0.this.f38133j.remove(this.f38169a);
        }

        @Override // com.onesignal.M0.i
        public void onSuccess(String str) {
        }
    }

    public B0(M1 m12, C1580q1 c1580q1, P0 p02, InterfaceC1565l1 interfaceC1565l1, Q7.a aVar) {
        this.f38143t = null;
        this.f38125b = c1580q1;
        Set setK = OSUtils.K();
        this.f38131h = setK;
        this.f38135l = new ArrayList();
        Set setK2 = OSUtils.K();
        this.f38132i = setK2;
        Set setK3 = OSUtils.K();
        this.f38133j = setK3;
        Set setK4 = OSUtils.K();
        this.f38134k = setK4;
        this.f38129f = new C1600x1(this);
        this.f38127d = new C1577p1(this);
        this.f38126c = aVar;
        this.f38124a = p02;
        M0 m0P = P(m12, p02, interfaceC1565l1);
        this.f38128e = m0P;
        Set setM = m0P.m();
        if (setM != null) {
            setK.addAll(setM);
        }
        Set setP = this.f38128e.p();
        if (setP != null) {
            setK2.addAll(setP);
        }
        Set setS = this.f38128e.s();
        if (setS != null) {
            setK3.addAll(setS);
        }
        Set setL = this.f38128e.l();
        if (setL != null) {
            setK4.addAll(setL);
        }
        Date dateQ = this.f38128e.q();
        if (dateQ != null) {
            this.f38143t = dateQ;
        }
        S();
    }

    public final void B() {
        synchronized (this.f38135l) {
            try {
                if (!this.f38127d.c()) {
                    this.f38124a.a("In app message not showing due to system condition not correct");
                    return;
                }
                this.f38124a.debug("displayFirstIAMOnQueue: " + this.f38135l);
                if (this.f38135l.size() > 0 && !U()) {
                    this.f38124a.debug("No IAM showing currently, showing first item in the queue!");
                    F((D0) this.f38135l.get(0));
                    return;
                }
                this.f38124a.debug("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + U());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(D0 d02, List list) {
        if (list.size() > 0) {
            this.f38124a.debug("IAM showing prompts from IAM: " + d02.toString());
            v2.x();
            s0(d02, list);
        }
    }

    public void D() {
        d(new f(), "OS_IAM_DB_ACCESS");
    }

    public final void E(D0 d02) {
        F1.r0().i();
        if (q0()) {
            this.f38124a.debug("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.f38139p = false;
        synchronized (this.f38135l) {
            if (d02 != null) {
                try {
                    if (!d02.f38193k && this.f38135l.size() > 0) {
                        if (!this.f38135l.contains(d02)) {
                            this.f38124a.debug("Message already removed from the queue!");
                            return;
                        }
                        String str = ((D0) this.f38135l.remove(0)).f38963a;
                        this.f38124a.debug("In app message with id: " + str + ", dismissed (removed) from the queue!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f38135l.size() > 0) {
                this.f38124a.debug("In app message on queue available: " + ((D0) this.f38135l.get(0)).f38963a);
                F((D0) this.f38135l.get(0));
            } else {
                this.f38124a.debug("In app message dismissed evaluating messages");
                H();
            }
        }
    }

    public final void F(D0 d02) {
        if (!this.f38138o) {
            this.f38124a.verbose("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.f38139p = true;
        Q(d02, false);
        this.f38128e.n(F1.f38274d, d02.f38963a, u0(d02), new d(d02));
    }

    public void G(String str) {
        this.f38139p = true;
        D0 d02 = new D0(true);
        Q(d02, true);
        this.f38128e.o(F1.f38274d, str, new e(d02));
    }

    public final void H() {
        this.f38124a.debug("Starting evaluateInAppMessages");
        if (p0()) {
            this.f38125b.c(new j());
            return;
        }
        for (D0 d02 : this.f38130g) {
            if (this.f38129f.b(d02)) {
                o0(d02);
                if (!this.f38131h.contains(d02.f38963a) && !d02.h()) {
                    k0(d02);
                }
            }
        }
    }

    public void I(Runnable runnable) {
        synchronized (f38122u) {
            try {
                if (p0()) {
                    this.f38124a.debug("Delaying task due to redisplay data not retrieved yet");
                    this.f38125b.c(runnable);
                } else {
                    runnable.run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void J(C1605z0 c1605z0) {
        if (c1605z0.b() == null || c1605z0.b().isEmpty()) {
            return;
        }
        if (c1605z0.f() == C1605z0.a.BROWSER) {
            OSUtils.N(c1605z0.b());
        } else if (c1605z0.f() == C1605z0.a.IN_APP_WEBVIEW) {
            K1.b(c1605z0.b(), true);
        }
    }

    public final void K(String str, List list) {
        F1.r0().h(str);
        F1.w1(list);
    }

    public final void L(String str, C1605z0 c1605z0) {
        List list = F1.f38268a;
    }

    public final void M(D0 d02, C1605z0 c1605z0) {
        String strU0 = u0(d02);
        if (strU0 == null) {
            return;
        }
        String strA = c1605z0.a();
        if (!(d02.e().e() && d02.f(strA)) && this.f38134k.contains(strA)) {
            return;
        }
        this.f38134k.add(strA);
        d02.a(strA);
        this.f38128e.D(F1.f38274d, F1.y0(), strU0, new OSUtils().e(), d02.f38963a, strA, c1605z0.g(), this.f38134k, new a(strA, d02));
    }

    public final void N(D0 d02, G0 g02) {
        String strU0 = u0(d02);
        if (strU0 == null) {
            return;
        }
        String strA = g02.a();
        String str = d02.f38963a + strA;
        if (!this.f38133j.contains(str)) {
            this.f38133j.add(str);
            this.f38128e.F(F1.f38274d, F1.y0(), strU0, new OSUtils().e(), d02.f38963a, strA, this.f38133j, new n(str));
            return;
        }
        this.f38124a.verbose("Already sent page impression for id: " + strA);
    }

    public final void O(C1605z0 c1605z0) {
        if (c1605z0.e() != null) {
            N0 n0E = c1605z0.e();
            if (n0E.a() != null) {
                F1.y1(n0E.a());
            }
            if (n0E.b() != null) {
                F1.E(n0E.b(), null);
            }
        }
    }

    public M0 P(M1 m12, P0 p02, InterfaceC1565l1 interfaceC1565l1) {
        if (this.f38128e == null) {
            this.f38128e = new M0(m12, p02, interfaceC1565l1);
        }
        return this.f38128e;
    }

    public final void Q(D0 d02, boolean z9) {
        this.f38142s = false;
        if (z9 || d02.d()) {
            this.f38142s = true;
            F1.u0(new c(z9, d02));
        }
    }

    public final boolean R(D0 d02) {
        if (this.f38129f.e(d02)) {
            return !d02.g();
        }
        return d02.i() || (!d02.g() && d02.f38185c.isEmpty());
    }

    public void S() {
        this.f38125b.c(new h());
        this.f38125b.f();
    }

    public void T() {
        if (!this.f38130g.isEmpty()) {
            this.f38124a.debug("initWithCachedInAppMessages with already in memory messages: " + this.f38130g);
            return;
        }
        String strR = this.f38128e.r();
        this.f38124a.debug("initWithCachedInAppMessages: " + strR);
        if (strR == null || strR.isEmpty()) {
            return;
        }
        synchronized (f38122u) {
            try {
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            if (this.f38130g.isEmpty()) {
                j0(new JSONArray(strR));
            }
        }
    }

    public boolean U() {
        return this.f38139p;
    }

    public final void V(C1605z0 c1605z0) {
        if (c1605z0.e() != null) {
            this.f38124a.debug("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + c1605z0.e().toString());
        }
        if (c1605z0.c().size() > 0) {
            this.f38124a.debug("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + c1605z0.c().toString());
        }
    }

    public final void W(Collection collection) {
        for (D0 d02 : this.f38130g) {
            if (!d02.i() && this.f38136m.contains(d02) && this.f38129f.d(d02, collection)) {
                this.f38124a.debug("Trigger changed for message: " + d02.toString());
                d02.p(true);
            }
        }
    }

    public void X(D0 d02) {
        Y(d02, false);
    }

    public void Y(D0 d02, boolean z9) {
        if (!d02.f38193k) {
            this.f38131h.add(d02.f38963a);
            if (!z9) {
                this.f38128e.x(this.f38131h);
                this.f38143t = new Date();
                i0(d02);
            }
            this.f38124a.debug("OSInAppMessageController messageWasDismissed dismissedMessages: " + this.f38131h.toString());
        }
        if (!q0()) {
            b0(d02);
        }
        E(d02);
    }

    public void Z(D0 d02, JSONObject jSONObject) {
        C1605z0 c1605z0 = new C1605z0(jSONObject);
        c1605z0.j(d02.q());
        L(d02.f38963a, c1605z0);
        C(d02, c1605z0.d());
        J(c1605z0);
        M(d02, c1605z0);
        O(c1605z0);
        K(d02.f38963a, c1605z0.c());
    }

    @Override // com.onesignal.C1577p1.c
    public void a() {
        B();
    }

    public void a0(D0 d02, JSONObject jSONObject) {
        C1605z0 c1605z0 = new C1605z0(jSONObject);
        c1605z0.j(d02.q());
        L(d02.f38963a, c1605z0);
        C(d02, c1605z0.d());
        J(c1605z0);
        V(c1605z0);
    }

    @Override // com.onesignal.C1584s0.c
    public void b() {
        this.f38124a.debug("messageTriggerConditionChanged called");
        H();
    }

    public void b0(D0 d02) {
        this.f38124a.verbose("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
    }

    @Override // com.onesignal.C1584s0.c
    public void c(String str) {
        this.f38124a.debug("messageDynamicTriggerCompleted called with triggerId: " + str);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        W(hashSet);
    }

    public void c0(D0 d02) {
        this.f38124a.verbose("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
    }

    public void d0(D0 d02) {
        c0(d02);
        if (d02.f38193k || this.f38132i.contains(d02.f38963a)) {
            return;
        }
        this.f38132i.add(d02.f38963a);
        String strU0 = u0(d02);
        if (strU0 == null) {
            return;
        }
        this.f38128e.E(F1.f38274d, F1.y0(), strU0, new OSUtils().e(), d02.f38963a, this.f38132i, new k(d02));
    }

    public void e0(D0 d02) {
        this.f38124a.verbose("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
    }

    public void f0(D0 d02) {
        this.f38124a.verbose("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
    }

    public void g0(D0 d02, JSONObject jSONObject) {
        G0 g02 = new G0(jSONObject);
        if (d02.f38193k) {
            return;
        }
        N(d02, g02);
    }

    public final A0 h0(JSONObject jSONObject, D0 d02) {
        A0 a02 = new A0(jSONObject);
        d02.n(a02.b().doubleValue());
        return a02;
    }

    public final void i0(D0 d02) {
        d02.e().h(F1.v0().a() / 1000);
        d02.e().c();
        d02.p(false);
        d02.o(true);
        d(new b(d02), "OS_IAM_DB_ACCESS");
        int iIndexOf = this.f38136m.indexOf(d02);
        if (iIndexOf != -1) {
            this.f38136m.set(iIndexOf, d02);
        } else {
            this.f38136m.add(d02);
        }
        this.f38124a.debug("persistInAppMessageForRedisplay: " + d02.toString() + " with msg array data: " + this.f38136m.toString());
    }

    public final void j0(JSONArray jSONArray) {
        synchronized (f38122u) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    D0 d02 = new D0(jSONArray.getJSONObject(i9));
                    if (d02.f38963a != null) {
                        arrayList.add(d02);
                    }
                }
                this.f38130g = arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
        H();
    }

    public final void k0(D0 d02) {
        synchronized (this.f38135l) {
            try {
                if (!this.f38135l.contains(d02)) {
                    this.f38135l.add(d02);
                    this.f38124a.debug("In app message with id: " + d02.f38963a + ", added to the queue");
                }
                B();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l0(JSONArray jSONArray) {
        this.f38128e.y(jSONArray.toString());
        I(new i(jSONArray));
    }

    public final void m0() {
        Iterator it = this.f38136m.iterator();
        while (it.hasNext()) {
            ((D0) it.next()).o(false);
        }
    }

    public void n0() {
        C1584s0.e();
    }

    public final void o0(D0 d02) {
        boolean zContains = this.f38131h.contains(d02.f38963a);
        int iIndexOf = this.f38136m.indexOf(d02);
        if (!zContains || iIndexOf == -1) {
            return;
        }
        D0 d03 = (D0) this.f38136m.get(iIndexOf);
        d02.e().g(d03.e());
        d02.o(d03.g());
        boolean zR = R(d02);
        this.f38124a.debug("setDataForRedisplay: " + d02.toString() + " triggerHasChanged: " + zR);
        if (zR && d02.e().d() && d02.e().i()) {
            this.f38124a.debug("setDataForRedisplay message available for redisplay: " + d02.f38963a);
            this.f38131h.remove(d02.f38963a);
            this.f38132i.remove(d02.f38963a);
            this.f38133j.clear();
            this.f38128e.C(this.f38133j);
            d02.b();
        }
    }

    public boolean p0() {
        boolean z9;
        synchronized (f38122u) {
            try {
                z9 = this.f38136m == null && this.f38125b.e();
            } finally {
            }
        }
        return z9;
    }

    public final boolean q0() {
        return this.f38137n != null;
    }

    public final void r0(D0 d02, List list) {
        String string = F1.f38270b.getString(g2.f38723b);
        new AlertDialog.Builder(F1.P()).setTitle(string).setMessage(F1.f38270b.getString(g2.f38722a)).setPositiveButton(R.string.ok, new m(d02, list)).show();
    }

    public final void s0(D0 d02, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            I0 i02 = (I0) it.next();
            if (!i02.c()) {
                this.f38137n = i02;
                break;
            }
        }
        if (this.f38137n == null) {
            this.f38124a.debug("No IAM prompt to handle, dismiss message: " + d02.f38963a);
            X(d02);
            return;
        }
        this.f38124a.debug("IAM prompt to handle: " + this.f38137n.toString());
        this.f38137n.d(true);
        this.f38137n.b(new l(d02, list));
    }

    public String t0(String str) {
        return str + String.format("\n\n<script>\n    setPlayerTags(%s);\n</script>", this.f38140q);
    }

    public final String u0(D0 d02) {
        String strB = this.f38126c.b();
        for (String str : f38123v) {
            if (d02.f38184b.containsKey(str)) {
                HashMap map = (HashMap) d02.f38184b.get(str);
                if (!map.containsKey(strB)) {
                    strB = CookieSpecs.DEFAULT;
                }
                return (String) map.get(strB);
            }
        }
        return null;
    }
}
