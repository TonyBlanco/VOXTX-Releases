package v6;

import G8.AbstractC0577j;
import G8.L;
import b0.C1194a;
import b0.d;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2645d;
import q8.l;
import w8.p;

/* JADX INFO: renamed from: v6.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2893g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f51453c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d.a f51454d = b0.f.a("firebase_sessions_enabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d.a f51455e = b0.f.b("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d.a f51456f = b0.f.d("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d.a f51457g = b0.f.d("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d.a f51458h = b0.f.e("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y.f f51459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C2891e f51460b;

    /* JADX INFO: renamed from: v6.g$a */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f51461a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51462c;

        public a(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L l9, InterfaceC2372d interfaceC2372d) {
            return ((a) create(l9, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return C2893g.this.new a(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2893g c2893g;
            Object objD = AbstractC2512c.d();
            int i9 = this.f51462c;
            if (i9 == 0) {
                k.b(obj);
                C2893g c2893g2 = C2893g.this;
                kotlinx.coroutines.flow.b data = c2893g2.f51459a.getData();
                this.f51461a = c2893g2;
                this.f51462c = 1;
                Object objD2 = kotlinx.coroutines.flow.d.d(data, this);
                if (objD2 == objD) {
                    return objD;
                }
                c2893g = c2893g2;
                obj = objD2;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2893g = (C2893g) this.f51461a;
                k.b(obj);
            }
            c2893g.l(((b0.d) obj).d());
            return q.f43674a;
        }
    }

    /* JADX INFO: renamed from: v6.g$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: v6.g$c */
    public static final class c extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f51464a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51466d;

        public c(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f51464a = obj;
            this.f51466d |= Integer.MIN_VALUE;
            return C2893g.this.h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: v6.g$d */
    public static final class d extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51467a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f51468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f51469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d.a f51470e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C2893g f51471f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, d.a aVar, C2893g c2893g, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f51469d = obj;
            this.f51470e = aVar;
            this.f51471f = c2893g;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1194a c1194a, InterfaceC2372d interfaceC2372d) {
            return ((d) create(c1194a, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            d dVar = new d(this.f51469d, this.f51470e, this.f51471f, interfaceC2372d);
            dVar.f51468c = obj;
            return dVar;
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC2512c.d();
            if (this.f51467a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k.b(obj);
            C1194a c1194a = (C1194a) this.f51468c;
            Object obj2 = this.f51469d;
            if (obj2 != null) {
                c1194a.i(this.f51470e, obj2);
            } else {
                c1194a.h(this.f51470e);
            }
            this.f51471f.l(c1194a);
            return q.f43674a;
        }
    }

    public C2893g(Y.f dataStore) {
        kotlin.jvm.internal.l.e(dataStore, "dataStore");
        this.f51459a = dataStore;
        AbstractC0577j.b(null, new a(null), 1, null);
    }

    public final boolean d() {
        C2891e c2891e = this.f51460b;
        C2891e c2891e2 = null;
        if (c2891e == null) {
            kotlin.jvm.internal.l.s("sessionConfigs");
            c2891e = null;
        }
        Long lB = c2891e.b();
        C2891e c2891e3 = this.f51460b;
        if (c2891e3 == null) {
            kotlin.jvm.internal.l.s("sessionConfigs");
        } else {
            c2891e2 = c2891e3;
        }
        Integer numA = c2891e2.a();
        return lB == null || numA == null || (System.currentTimeMillis() - lB.longValue()) / ((long) 1000) >= ((long) numA.intValue());
    }

    public final Integer e() {
        C2891e c2891e = this.f51460b;
        if (c2891e == null) {
            kotlin.jvm.internal.l.s("sessionConfigs");
            c2891e = null;
        }
        return c2891e.d();
    }

    public final Double f() {
        C2891e c2891e = this.f51460b;
        if (c2891e == null) {
            kotlin.jvm.internal.l.s("sessionConfigs");
            c2891e = null;
        }
        return c2891e.e();
    }

    public final Boolean g() {
        C2891e c2891e = this.f51460b;
        if (c2891e == null) {
            kotlin.jvm.internal.l.s("sessionConfigs");
            c2891e = null;
        }
        return c2891e.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(b0.d.a r6, java.lang.Object r7, o8.InterfaceC2372d r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof v6.C2893g.c
            if (r0 == 0) goto L13
            r0 = r8
            v6.g$c r0 = (v6.C2893g.c) r0
            int r1 = r0.f51466d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51466d = r1
            goto L18
        L13:
            v6.g$c r0 = new v6.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f51464a
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f51466d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            k8.k.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            k8.k.b(r8)
            Y.f r8 = r5.f51459a     // Catch: java.io.IOException -> L29
            v6.g$d r2 = new v6.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f51466d = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = b0.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            k8.q r6 = k8.q.f43674a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C2893g.h(b0.d$a, java.lang.Object, o8.d):java.lang.Object");
    }

    public final Object i(Double d9, InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objH = h(f51455e, d9, interfaceC2372d);
        return objH == AbstractC2512c.d() ? objH : q.f43674a;
    }

    public final Object j(Integer num, InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objH = h(f51457g, num, interfaceC2372d);
        return objH == AbstractC2512c.d() ? objH : q.f43674a;
    }

    public final Object k(Long l9, InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objH = h(f51458h, l9, interfaceC2372d);
        return objH == AbstractC2512c.d() ? objH : q.f43674a;
    }

    public final void l(b0.d dVar) {
        this.f51460b = new C2891e((Boolean) dVar.b(f51454d), (Double) dVar.b(f51455e), (Integer) dVar.b(f51456f), (Integer) dVar.b(f51457g), (Long) dVar.b(f51458h));
    }

    public final Object m(Integer num, InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objH = h(f51456f, num, interfaceC2372d);
        return objH == AbstractC2512c.d() ? objH : q.f43674a;
    }

    public final Object n(Boolean bool, InterfaceC2372d interfaceC2372d) throws Throwable {
        Object objH = h(f51454d, bool, interfaceC2372d);
        return objH == AbstractC2512c.d() ? objH : q.f43674a;
    }
}
