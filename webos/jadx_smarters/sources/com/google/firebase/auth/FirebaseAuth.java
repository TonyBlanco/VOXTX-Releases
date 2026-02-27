package com.google.firebase.auth;

import A5.f;
import G5.AbstractC0540g;
import G5.AbstractC0553u;
import G5.C0538e;
import G5.C0541h;
import G5.F;
import G5.i0;
import G5.j0;
import G5.k0;
import H5.AbstractC0630v;
import H5.C0611b;
import H5.C0612c;
import H5.C0628t;
import H5.I;
import H5.InterfaceC0610a;
import H5.InterfaceC0627s;
import H5.M;
import H5.N;
import H5.Q;
import H5.S;
import H5.T;
import H5.d0;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.p001firebaseauthapi.zzaai;
import com.google.android.gms.internal.p001firebaseauthapi.zzacf;
import com.google.android.gms.internal.p001firebaseauthapi.zzafn;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import j6.InterfaceC2102b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import o6.C2367b;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseAuth implements InterfaceC0610a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f27872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f27873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f27874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f27875d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zzaai f27876e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC0553u f27877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0612c f27878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f27879h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f27880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f27881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f27882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public I f27883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f27884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RecaptchaAction f27885n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RecaptchaAction f27886o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final N f27887p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final S f27888q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C0628t f27889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC2102b f27890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC2102b f27891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public M f27892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Executor f27893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f27894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f27895x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f27896y;

    public class a implements T {
        public a() {
        }

        @Override // H5.T
        public final void a(zzafn zzafnVar, AbstractC0553u abstractC0553u) {
            r.m(zzafnVar);
            r.m(abstractC0553u);
            abstractC0553u.P(zzafnVar);
            FirebaseAuth.this.r(abstractC0553u, zzafnVar, true);
        }
    }

    public class b implements InterfaceC0627s, T {
        public b() {
        }

        @Override // H5.T
        public final void a(zzafn zzafnVar, AbstractC0553u abstractC0553u) {
            r.m(zzafnVar);
            r.m(abstractC0553u);
            abstractC0553u.P(zzafnVar);
            FirebaseAuth.this.s(abstractC0553u, zzafnVar, true, true);
        }

        @Override // H5.InterfaceC0627s
        public final void zza(Status status) {
            if (status.I() == 17011 || status.I() == 17021 || status.I() == 17005 || status.I() == 17091) {
                FirebaseAuth.this.k();
            }
        }
    }

    public FirebaseAuth(f fVar, zzaai zzaaiVar, N n9, S s9, C0628t c0628t, InterfaceC2102b interfaceC2102b, InterfaceC2102b interfaceC2102b2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzafn zzafnVarC;
        this.f27873b = new CopyOnWriteArrayList();
        this.f27874c = new CopyOnWriteArrayList();
        this.f27875d = new CopyOnWriteArrayList();
        this.f27879h = new Object();
        this.f27881j = new Object();
        this.f27884m = RecaptchaAction.custom("getOobCode");
        this.f27885n = RecaptchaAction.custom("signInWithPassword");
        this.f27886o = RecaptchaAction.custom("signUpPassword");
        this.f27872a = (f) r.m(fVar);
        this.f27876e = (zzaai) r.m(zzaaiVar);
        N n10 = (N) r.m(n9);
        this.f27887p = n10;
        this.f27878g = new C0612c();
        S s10 = (S) r.m(s9);
        this.f27888q = s10;
        this.f27889r = (C0628t) r.m(c0628t);
        this.f27890s = interfaceC2102b;
        this.f27891t = interfaceC2102b2;
        this.f27893v = executor2;
        this.f27894w = executor3;
        this.f27895x = executor4;
        AbstractC0553u abstractC0553uA = n10.a();
        this.f27877f = abstractC0553uA;
        if (abstractC0553uA != null && (zzafnVarC = n10.c(abstractC0553uA)) != null) {
            v(this, this.f27877f, zzafnVarC, false, false);
        }
        s10.b(this);
    }

    public FirebaseAuth(f fVar, InterfaceC2102b interfaceC2102b, InterfaceC2102b interfaceC2102b2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(fVar, new zzaai(fVar, executor2, scheduledExecutorService), new N(fVar.l(), fVar.q()), S.c(), C0628t.a(), interfaceC2102b, interfaceC2102b2, executor, executor2, executor3, executor4);
    }

    public static M I(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.f27892u == null) {
            firebaseAuth.f27892u = new M((f) r.m(firebaseAuth.f27872a));
        }
        return firebaseAuth.f27892u;
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) f.m().j(FirebaseAuth.class);
    }

    @Keep
    public static FirebaseAuth getInstance(f fVar) {
        return (FirebaseAuth) fVar.j(FirebaseAuth.class);
    }

    public static void u(FirebaseAuth firebaseAuth, AbstractC0553u abstractC0553u) {
        String str;
        if (abstractC0553u != null) {
            str = "Notifying auth state listeners about user ( " + abstractC0553u.L() + " ).";
        } else {
            str = "Notifying auth state listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f27895x.execute(new k0(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[PHI: r2
      0x0028: PHI (r2v3 boolean) = (r2v0 boolean), (r2v1 boolean) binds: [B:12:0x0026, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v(com.google.firebase.auth.FirebaseAuth r4, G5.AbstractC0553u r5, com.google.android.gms.internal.p001firebaseauthapi.zzafn r6, boolean r7, boolean r8) {
        /*
            com.google.android.gms.common.internal.r.m(r5)
            com.google.android.gms.common.internal.r.m(r6)
            G5.u r0 = r4.f27877f
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1e
            java.lang.String r0 = r5.L()
            G5.u r3 = r4.f27877f
            java.lang.String r3 = r3.L()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 != 0) goto L24
            if (r8 == 0) goto L24
            return
        L24:
            G5.u r8 = r4.f27877f
            if (r8 != 0) goto L2a
        L28:
            r1 = 1
            goto L46
        L2a:
            com.google.android.gms.internal.firebase-auth-api.zzafn r8 = r8.S()
            java.lang.String r8 = r8.zzc()
            java.lang.String r3 = r6.zzc()
            boolean r8 = r8.equals(r3)
            r8 = r8 ^ r2
            if (r0 == 0) goto L41
            if (r8 != 0) goto L41
            r8 = 0
            goto L42
        L41:
            r8 = 1
        L42:
            r2 = r8
            if (r0 != 0) goto L46
            goto L28
        L46:
            com.google.android.gms.common.internal.r.m(r5)
            G5.u r8 = r4.f27877f
            if (r8 == 0) goto L7e
            java.lang.String r8 = r5.L()
            java.lang.String r0 = r4.g()
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L5c
            goto L7e
        L5c:
            G5.u r8 = r4.f27877f
            java.util.List r0 = r5.J()
            r8.O(r0)
            boolean r8 = r5.M()
            if (r8 != 0) goto L70
            G5.u r8 = r4.f27877f
            r8.Q()
        L70:
            G5.z r8 = r5.I()
            java.util.List r8 = r8.a()
            G5.u r0 = r4.f27877f
            r0.R(r8)
            goto L80
        L7e:
            r4.f27877f = r5
        L80:
            if (r7 == 0) goto L89
            H5.N r8 = r4.f27887p
            G5.u r0 = r4.f27877f
            r8.f(r0)
        L89:
            if (r2 == 0) goto L97
            G5.u r8 = r4.f27877f
            if (r8 == 0) goto L92
            r8.P(r6)
        L92:
            G5.u r8 = r4.f27877f
            x(r4, r8)
        L97:
            if (r1 == 0) goto L9e
            G5.u r8 = r4.f27877f
            u(r4, r8)
        L9e:
            if (r7 == 0) goto La5
            H5.N r7 = r4.f27887p
            r7.d(r5, r6)
        La5:
            G5.u r5 = r4.f27877f
            if (r5 == 0) goto Lb4
            H5.M r4 = I(r4)
            com.google.android.gms.internal.firebase-auth-api.zzafn r5 = r5.S()
            r4.d(r5)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.v(com.google.firebase.auth.FirebaseAuth, G5.u, com.google.android.gms.internal.firebase-auth-api.zzafn, boolean, boolean):void");
    }

    public static void x(FirebaseAuth firebaseAuth, AbstractC0553u abstractC0553u) {
        String str;
        if (abstractC0553u != null) {
            str = "Notifying id token listeners about user ( " + abstractC0553u.L() + " ).";
        } else {
            str = "Notifying id token listeners about a sign-out event.";
        }
        Log.d("FirebaseAuth", str);
        firebaseAuth.f27895x.execute(new i0(firebaseAuth, new C2367b(abstractC0553u != null ? abstractC0553u.zzd() : null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [H5.Q, com.google.firebase.auth.FirebaseAuth$b] */
    /* JADX WARN: Type inference failed for: r9v0, types: [H5.Q, com.google.firebase.auth.FirebaseAuth$b] */
    public final Task A(AbstractC0553u abstractC0553u, AbstractC0540g abstractC0540g) {
        r.m(abstractC0553u);
        r.m(abstractC0540g);
        AbstractC0540g abstractC0540gJ = abstractC0540g.J();
        if (!(abstractC0540gJ instanceof C0541h)) {
            return abstractC0540gJ instanceof F ? this.f27876e.zzb(this.f27872a, abstractC0553u, (F) abstractC0540gJ, this.f27882k, (Q) new b()) : this.f27876e.zzc(this.f27872a, abstractC0553u, abstractC0540gJ, abstractC0553u.K(), new b());
        }
        C0541h c0541h = (C0541h) abstractC0540gJ;
        return CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD.equals(c0541h.I()) ? q(c0541h.zzc(), r.g(c0541h.zzd()), abstractC0553u.K(), abstractC0553u, true) : y(r.g(c0541h.zze())) ? Tasks.forException(zzacf.zza(new Status(17072))) : m(c0541h, abstractC0553u, true);
    }

    public final InterfaceC2102b B() {
        return this.f27890s;
    }

    public final InterfaceC2102b C() {
        return this.f27891t;
    }

    public final Executor D() {
        return this.f27893v;
    }

    public final void G() {
        r.m(this.f27887p);
        AbstractC0553u abstractC0553u = this.f27877f;
        if (abstractC0553u != null) {
            N n9 = this.f27887p;
            r.m(abstractC0553u);
            n9.e(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", abstractC0553u.L()));
            this.f27877f = null;
        }
        this.f27887p.e("com.google.firebase.auth.FIREBASE_USER");
        x(this, null);
        u(this, null);
    }

    public Task a(boolean z9) {
        return o(this.f27877f, z9);
    }

    public f b() {
        return this.f27872a;
    }

    public AbstractC0553u c() {
        return this.f27877f;
    }

    public String d() {
        return this.f27896y;
    }

    public String e() {
        String str;
        synchronized (this.f27879h) {
            str = this.f27880i;
        }
        return str;
    }

    public String f() {
        String str;
        synchronized (this.f27881j) {
            str = this.f27882k;
        }
        return str;
    }

    public String g() {
        AbstractC0553u abstractC0553u = this.f27877f;
        if (abstractC0553u == null) {
            return null;
        }
        return abstractC0553u.L();
    }

    public void h(String str) {
        r.g(str);
        synchronized (this.f27881j) {
            this.f27882k = str;
        }
    }

    public Task i() {
        AbstractC0553u abstractC0553u = this.f27877f;
        if (abstractC0553u == null || !abstractC0553u.M()) {
            return this.f27876e.zza(this.f27872a, new a(), this.f27882k);
        }
        C0611b c0611b = (C0611b) this.f27877f;
        c0611b.X(false);
        return Tasks.forResult(new d0(c0611b));
    }

    public Task j(AbstractC0540g abstractC0540g) {
        r.m(abstractC0540g);
        AbstractC0540g abstractC0540gJ = abstractC0540g.J();
        if (abstractC0540gJ instanceof C0541h) {
            C0541h c0541h = (C0541h) abstractC0540gJ;
            return !c0541h.M() ? q(c0541h.zzc(), (String) r.m(c0541h.zzd()), this.f27882k, null, false) : y(r.g(c0541h.zze())) ? Tasks.forException(zzacf.zza(new Status(17072))) : m(c0541h, null, false);
        }
        if (abstractC0540gJ instanceof F) {
            return this.f27876e.zza(this.f27872a, (F) abstractC0540gJ, this.f27882k, (T) new a());
        }
        return this.f27876e.zza(this.f27872a, abstractC0540gJ, this.f27882k, new a());
    }

    public void k() {
        G();
        M m9 = this.f27892u;
        if (m9 != null) {
            m9.b();
        }
    }

    public final Task m(C0541h c0541h, AbstractC0553u abstractC0553u, boolean z9) {
        return new com.google.firebase.auth.b(this, z9, abstractC0553u, c0541h).c(this, this.f27882k, this.f27884m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [H5.Q, com.google.firebase.auth.FirebaseAuth$b] */
    public final Task n(AbstractC0553u abstractC0553u, AbstractC0540g abstractC0540g) {
        r.m(abstractC0540g);
        r.m(abstractC0553u);
        return abstractC0540g instanceof C0541h ? new c(this, abstractC0553u, (C0541h) abstractC0540g.J()).c(this, abstractC0553u.K(), this.f27886o, "EMAIL_PASSWORD_PROVIDER") : this.f27876e.zza(this.f27872a, abstractC0553u, abstractC0540g.J(), (String) null, (Q) new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [G5.j0, H5.Q] */
    public final Task o(AbstractC0553u abstractC0553u, boolean z9) {
        if (abstractC0553u == null) {
            return Tasks.forException(zzacf.zza(new Status(17495)));
        }
        zzafn zzafnVarS = abstractC0553u.S();
        return (!zzafnVarS.zzg() || z9) ? this.f27876e.zza(this.f27872a, abstractC0553u, zzafnVarS.zzd(), (Q) new j0(this)) : Tasks.forResult(AbstractC0630v.a(zzafnVarS.zzc()));
    }

    public final Task p(String str) {
        return this.f27876e.zza(this.f27882k, str);
    }

    public final Task q(String str, String str2, String str3, AbstractC0553u abstractC0553u, boolean z9) {
        return new com.google.firebase.auth.a(this, str, z9, abstractC0553u, str2, str3).c(this, str3, this.f27885n, "EMAIL_PASSWORD_PROVIDER");
    }

    public final void r(AbstractC0553u abstractC0553u, zzafn zzafnVar, boolean z9) {
        s(abstractC0553u, zzafnVar, true, false);
    }

    public final void s(AbstractC0553u abstractC0553u, zzafn zzafnVar, boolean z9, boolean z10) {
        v(this, abstractC0553u, zzafnVar, true, z10);
    }

    public final synchronized void t(I i9) {
        this.f27883l = i9;
    }

    public final synchronized I w() {
        return this.f27883l;
    }

    public final boolean y(String str) {
        C0538e c0538eB = C0538e.b(str);
        return (c0538eB == null || TextUtils.equals(this.f27882k, c0538eB.c())) ? false : true;
    }
}
