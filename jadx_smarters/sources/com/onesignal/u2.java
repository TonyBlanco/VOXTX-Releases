package com.onesignal;

import android.os.Handler;
import android.os.HandlerThread;
import com.onesignal.F1;
import com.onesignal.O;
import com.onesignal.T1;
import com.onesignal.W1;
import d.AbstractC1617D;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W1.c f38873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38874c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m2 f38882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m2 f38883l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38872a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AtomicBoolean f38875d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Queue f38876e = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Queue f38877f = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Queue f38878g = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public HashMap f38879h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f38880i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f38881j = false;

    public class a {
        public a() {
        }
    }

    public class b extends T1.g {
        public b() {
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            F1.a(F1.v.WARN, "Failed last request. statusCode: " + i9 + "\nresponse: " + str);
            if (u2.this.S(i9, str, "already logged out of email")) {
                u2.this.M();
            } else if (u2.this.S(i9, str, "not a valid device_type")) {
                u2.this.I();
            } else {
                u2.this.H(i9);
            }
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            u2.this.M();
        }
    }

    public class c extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38887b;

        public c(JSONObject jSONObject, JSONObject jSONObject2) {
            this.f38886a = jSONObject;
            this.f38887b = jSONObject2;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            F1.v vVar = F1.v.ERROR;
            F1.a(vVar, "Failed PUT sync request with status code: " + i9 + " and response: " + str);
            synchronized (u2.this.f38872a) {
                try {
                    if (u2.this.S(i9, str, "No user with this id found")) {
                        u2.this.I();
                    } else {
                        u2.this.H(i9);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f38886a.has("tags")) {
                u2.this.W(new F1.B(i9, str));
            }
            if (this.f38886a.has("external_user_id")) {
                F1.c1(vVar, "Error setting external user id for push with status code: " + i9 + " and message: " + str);
                u2.this.u();
            }
            if (this.f38886a.has(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
                u2.this.p(new W1.b(i9, str));
            }
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            synchronized (u2.this.f38872a) {
                u2.this.z().r(this.f38887b, this.f38886a);
                u2.this.O(this.f38886a);
            }
            if (this.f38886a.has("tags")) {
                u2.this.X();
            }
            if (this.f38886a.has("external_user_id")) {
                u2.this.v();
            }
            if (this.f38886a.has(IjkMediaMeta.IJKM_KEY_LANGUAGE)) {
                u2.this.q();
            }
        }
    }

    public class d extends T1.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f38890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38891c;

        public d(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.f38889a = jSONObject;
            this.f38890b = jSONObject2;
            this.f38891c = str;
        }

        @Override // com.onesignal.T1.g
        public void a(int i9, String str, Throwable th) {
            synchronized (u2.this.f38872a) {
                try {
                    u2.this.f38881j = false;
                    F1.a(F1.v.WARN, "Failed last request. statusCode: " + i9 + "\nresponse: " + str);
                    if (u2.this.S(i9, str, "not a valid device_type")) {
                        u2.this.I();
                    } else {
                        u2.this.H(i9);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.onesignal.T1.g
        public void b(String str) {
            synchronized (u2.this.f38872a) {
                try {
                    u2 u2Var = u2.this;
                    u2Var.f38881j = false;
                    u2Var.z().r(this.f38889a, this.f38890b);
                    try {
                        F1.c1(F1.v.DEBUG, "doCreateOrNewSession:response: " + str);
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has(Name.MARK)) {
                            String strOptString = jSONObject.optString(Name.MARK);
                            u2.this.c0(strOptString);
                            F1.a(F1.v.INFO, "Device registered, UserId = " + strOptString);
                        } else {
                            F1.a(F1.v.INFO, "session sent, UserId = " + this.f38891c);
                        }
                        u2.this.G().s("session", Boolean.FALSE);
                        u2.this.G().q();
                        if (jSONObject.has("in_app_messages")) {
                            F1.b0().l0(jSONObject.getJSONArray("in_app_messages"));
                        }
                        u2.this.O(this.f38890b);
                    } catch (JSONException e9) {
                        F1.b(F1.v.ERROR, "ERROR parsing on_session or create JSON Response.", e9);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f38893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public JSONObject f38894b;

        public e(boolean z9, JSONObject jSONObject) {
            this.f38893a = z9;
            this.f38894b = jSONObject;
        }
    }

    public class f extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38895a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f38896c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f38897d;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!u2.this.f38875d.get()) {
                    u2.this.a0(false);
                }
            }
        }

        public f(int i9) {
            super("OSH_NetworkHandlerThread_" + u2.this.f38873b);
            this.f38895a = i9;
            start();
            this.f38896c = new Handler(getLooper());
        }

        public boolean a() {
            boolean zHasMessages;
            synchronized (this.f38896c) {
                try {
                    boolean z9 = this.f38897d < 3;
                    boolean zHasMessages2 = this.f38896c.hasMessages(0);
                    if (z9 && !zHasMessages2) {
                        this.f38897d++;
                        this.f38896c.postDelayed(b(), this.f38897d * 15000);
                    }
                    zHasMessages = this.f38896c.hasMessages(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zHasMessages;
        }

        public final Runnable b() {
            if (this.f38895a != 0) {
                return null;
            }
            return new a();
        }

        public void c() {
            if (u2.this.f38874c) {
                synchronized (this.f38896c) {
                    this.f38897d = 0;
                    this.f38896c.removeCallbacksAndMessages(null);
                    this.f38896c.postDelayed(b(), 5000L);
                }
            }
        }
    }

    public u2(W1.c cVar) {
        this.f38873b = cVar;
    }

    public abstract String A();

    public abstract F1.v B();

    public f C(Integer num) {
        f fVar;
        synchronized (this.f38880i) {
            try {
                if (!this.f38879h.containsKey(num)) {
                    this.f38879h.put(num, new f(num.intValue()));
                }
                fVar = (f) this.f38879h.get(num);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public String D() {
        return F().l().g("identifier", null);
    }

    public boolean E() {
        return G().i().b("session");
    }

    public m2 F() {
        if (this.f38883l == null) {
            synchronized (this.f38872a) {
                try {
                    if (this.f38883l == null) {
                        this.f38883l = N("TOSYNC_STATE", true);
                    }
                } finally {
                }
            }
        }
        return this.f38883l;
    }

    public m2 G() {
        if (this.f38883l == null) {
            this.f38883l = z().c("TOSYNC_STATE");
        }
        T();
        return this.f38883l;
    }

    public final void H(int i9) {
        if (i9 == 403) {
            F1.a(F1.v.FATAL, "403 error updating player, omitting further retries!");
            x();
        } else {
            if (C(0).a()) {
                return;
            }
            x();
        }
    }

    public final void I() {
        F1.a(F1.v.WARN, "Creating new player based on missing player_id noted above.");
        F1.F0();
        R();
        c0(null);
        T();
    }

    public void J() {
        if (this.f38882k == null) {
            synchronized (this.f38872a) {
                try {
                    if (this.f38882k == null) {
                        this.f38882k = N("CURRENT_STATE", true);
                    }
                } finally {
                }
            }
        }
        F();
    }

    public final void K(boolean z9) {
        String strA = A();
        if (Z() && strA != null) {
            s(strA);
            return;
        }
        if (this.f38882k == null) {
            J();
        }
        boolean z10 = !z9 && L();
        synchronized (this.f38872a) {
            try {
                JSONObject jSONObjectD = z().d(F(), z10);
                JSONObject jSONObjectF = z().f(F(), null);
                F1.c1(F1.v.DEBUG, "UserStateSynchronizer internalSyncUserState from session call: " + z10 + " jsonBody: " + jSONObjectD);
                if (jSONObjectD == null) {
                    z().r(jSONObjectF, null);
                    X();
                    v();
                    q();
                    return;
                }
                F().q();
                if (z10) {
                    r(strA, jSONObjectD, jSONObjectF);
                } else {
                    t(strA, jSONObjectD, jSONObjectF);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean L() {
        return (F().i().b("session") || A() == null) && !this.f38881j;
    }

    public final void M() {
        F().v("logoutEmail");
        this.f38883l.v("email_auth_hash");
        this.f38883l.w("parent_player_id");
        this.f38883l.w("email");
        this.f38883l.q();
        z().v("email_auth_hash");
        z().w("parent_player_id");
        String strF = z().l().f("email");
        z().w("email");
        W1.s();
        F1.a(F1.v.INFO, "Device successfully logged out of email: " + strF);
        F1.F0();
    }

    public abstract m2 N(String str, boolean z9);

    public abstract void O(JSONObject jSONObject);

    public boolean P() {
        boolean z9;
        if (this.f38883l == null) {
            return false;
        }
        synchronized (this.f38872a) {
            z9 = z().d(this.f38883l, L()) != null;
            this.f38883l.q();
        }
        return z9;
    }

    public void Q(boolean z9) {
        boolean z10 = this.f38874c != z9;
        this.f38874c = z9;
        if (z10 && z9) {
            T();
        }
    }

    public void R() {
        z().z(new JSONObject());
        z().q();
    }

    public final boolean S(int i9, String str, String str2) {
        if (i9 == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("errors")) {
                    return jSONObject.optString("errors").contains(str2);
                }
                return false;
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
        return false;
    }

    public abstract void T();

    public void U(JSONObject jSONObject, T1.g gVar) {
        T1.j("players/" + A() + "/on_purchase", jSONObject, gVar);
    }

    public void V(JSONObject jSONObject, F1.s sVar) {
        if (sVar != null) {
            this.f38876e.add(sVar);
        }
        G().h(jSONObject, null);
    }

    public final void W(F1.B b9) {
        AbstractC1617D.a(this.f38876e.poll());
    }

    public final void X() {
        JSONObject jSONObject = W1.h(false).f38894b;
        AbstractC1617D.a(this.f38876e.poll());
    }

    public void Y() {
        try {
            synchronized (this.f38872a) {
                G().s("session", Boolean.TRUE);
                G().q();
            }
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }

    public final boolean Z() {
        return F().i().c("logoutEmail", false);
    }

    public void a0(boolean z9) {
        this.f38875d.set(true);
        K(z9);
        this.f38875d.set(false);
    }

    public void b0(JSONObject jSONObject, W1.a aVar) {
        if (aVar != null) {
            this.f38878g.add(aVar);
        }
        G().h(jSONObject, null);
    }

    public abstract void c0(String str);

    public void d0(O.d dVar) {
        G().y(dVar);
    }

    public abstract void n(JSONObject jSONObject);

    public void o() {
        F().b();
        F().q();
    }

    public final void p(W1.b bVar) {
        AbstractC1617D.a(this.f38878g.poll());
    }

    public final void q() {
        W1.c();
        AbstractC1617D.a(this.f38878g.poll());
    }

    public final void r(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2;
        if (str == null) {
            str2 = "players";
        } else {
            str2 = "players/" + str + "/on_session";
        }
        this.f38881j = true;
        n(jSONObject);
        T1.k(str2, jSONObject, new d(jSONObject2, jSONObject, str));
    }

    public final void s(String str) {
        String str2 = "players/" + str + "/email_logout";
        JSONObject jSONObject = new JSONObject();
        try {
            E eI = z().i();
            if (eI.a("email_auth_hash")) {
                jSONObject.put("email_auth_hash", eI.f("email_auth_hash"));
            }
            E eL = z().l();
            if (eL.a("parent_player_id")) {
                jSONObject.put("parent_player_id", eL.f("parent_player_id"));
            }
            jSONObject.put("app_id", eL.f("app_id"));
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        T1.k(str2, jSONObject, new b());
    }

    public final void t(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null) {
            F1.c1(B(), "Error updating the user record because of the null user id");
            W(new F1.B(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            u();
            p(new W1.b(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        T1.m("players/" + str, jSONObject, new c(jSONObject, jSONObject2));
    }

    public final void u() {
        AbstractC1617D.a(this.f38877f.poll());
    }

    public final void v() {
        AbstractC1617D.a(this.f38877f.poll());
    }

    public abstract void w(JSONObject jSONObject);

    public final void x() {
        JSONObject jSONObjectD = z().d(this.f38883l, false);
        if (jSONObjectD != null) {
            w(jSONObjectD);
        }
        if (F().i().c("logoutEmail", false)) {
            F1.C0();
        }
    }

    public JSONObject y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set set) {
        JSONObject jSONObjectB;
        synchronized (this.f38872a) {
            jSONObjectB = H.b(jSONObject, jSONObject2, jSONObject3, set);
        }
        return jSONObjectB;
    }

    public m2 z() {
        if (this.f38882k == null) {
            synchronized (this.f38872a) {
                try {
                    if (this.f38882k == null) {
                        this.f38882k = N("CURRENT_STATE", true);
                    }
                } finally {
                }
            }
        }
        return this.f38882k;
    }
}
