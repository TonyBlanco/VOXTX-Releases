package v6;

import C8.i;
import F8.a;
import a0.AbstractC1073a;
import android.content.Context;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.w;
import o8.InterfaceC2372d;
import q8.AbstractC2645d;
import t6.C2796b;

/* JADX INFO: renamed from: v6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2892f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f51444c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y8.a f51445d = AbstractC1073a.b("firebase_session_settings", null, null, null, 14, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2894h f51446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2894h f51447b;

    /* JADX INFO: renamed from: v6.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ i[] f51448a = {C.g(new w(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Y.f b(Context context) {
            return (Y.f) C2892f.f51445d.a(context, f51448a[0]);
        }
    }

    /* JADX INFO: renamed from: v6.f$b */
    public static final class b extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f51449a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f51450c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f51452e;

        public b(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f51450c = obj;
            this.f51452e |= Integer.MIN_VALUE;
            return C2892f.this.g(this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2892f(Context context, o8.g blockingDispatcher, o8.g backgroundDispatcher, k6.h firebaseInstallationsApi, C2796b appInfo) {
        this(new C2888b(context), new C2889c(backgroundDispatcher, firebaseInstallationsApi, appInfo, new C2890d(appInfo, blockingDispatcher, null, 4, null), f51444c.b(context)));
        l.e(context, "context");
        l.e(blockingDispatcher, "blockingDispatcher");
        l.e(backgroundDispatcher, "backgroundDispatcher");
        l.e(firebaseInstallationsApi, "firebaseInstallationsApi");
        l.e(appInfo, "appInfo");
    }

    public C2892f(InterfaceC2894h localOverrideSettings, InterfaceC2894h remoteSettings) {
        l.e(localOverrideSettings, "localOverrideSettings");
        l.e(remoteSettings, "remoteSettings");
        this.f51446a = localOverrideSettings;
        this.f51447b = remoteSettings;
    }

    public final double b() {
        Double dC = this.f51446a.c();
        if (dC != null) {
            double dDoubleValue = dC.doubleValue();
            if (e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dC2 = this.f51447b.c();
        if (dC2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dC2.doubleValue();
        if (e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        F8.a aVarB = this.f51446a.b();
        if (aVarB != null) {
            long jG = aVarB.G();
            if (f(jG)) {
                return jG;
            }
        }
        F8.a aVarB2 = this.f51447b.b();
        if (aVarB2 != null) {
            long jG2 = aVarB2.G();
            if (f(jG2)) {
                return jG2;
            }
        }
        a.C0031a c0031a = F8.a.f2095c;
        return F8.c.o(30, F8.d.MINUTES);
    }

    public final boolean d() {
        Boolean boolA = this.f51446a.a();
        if (boolA != null) {
            return boolA.booleanValue();
        }
        Boolean boolA2 = this.f51447b.a();
        if (boolA2 != null) {
            return boolA2.booleanValue();
        }
        return true;
    }

    public final boolean e(double d9) {
        return 0.0d <= d9 && d9 <= 1.0d;
    }

    public final boolean f(long j9) {
        return F8.a.A(j9) && F8.a.v(j9);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(o8.InterfaceC2372d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof v6.C2892f.b
            if (r0 == 0) goto L13
            r0 = r6
            v6.f$b r0 = (v6.C2892f.b) r0
            int r1 = r0.f51452e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51452e = r1
            goto L18
        L13:
            v6.f$b r0 = new v6.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f51450c
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f51452e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            k8.k.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f51449a
            v6.f r2 = (v6.C2892f) r2
            k8.k.b(r6)
            goto L4d
        L3c:
            k8.k.b(r6)
            v6.h r6 = r5.f51446a
            r0.f51449a = r5
            r0.f51452e = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            v6.h r6 = r2.f51447b
            r2 = 0
            r0.f51449a = r2
            r0.f51452e = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            k8.q r6 = k8.q.f43674a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.C2892f.g(o8.d):java.lang.Object");
    }
}
