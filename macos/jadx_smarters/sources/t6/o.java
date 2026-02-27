package t6;

import o8.InterfaceC2372d;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f50829c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6.h f50830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f50831b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50832a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f50833c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f50834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f50835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f50836f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f50838h;

        public b(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f50836f = obj;
            this.f50838h |= Integer.MIN_VALUE;
            return o.this.a(null, this);
        }
    }

    public o(k6.h firebaseInstallations, i eventGDTLogger) {
        kotlin.jvm.internal.l.e(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.l.e(eventGDTLogger, "eventGDTLogger");
        this.f50830a = firebaseInstallations;
        this.f50831b = eventGDTLogger;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(t6.r r7, o8.InterfaceC2372d r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof t6.o.b
            if (r0 == 0) goto L13
            r0 = r8
            t6.o$b r0 = (t6.o.b) r0
            int r1 = r0.f50838h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50838h = r1
            goto L18
        L13:
            t6.o$b r0 = new t6.o$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f50836f
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f50838h
            r3 = 1
            java.lang.String r4 = "SessionCoordinator"
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.f50835e
            t6.u r7 = (t6.u) r7
            java.lang.Object r1 = r0.f50834d
            t6.u r1 = (t6.u) r1
            java.lang.Object r2 = r0.f50833c
            t6.r r2 = (t6.r) r2
            java.lang.Object r0 = r0.f50832a
            t6.o r0 = (t6.o) r0
            k8.k.b(r8)     // Catch: java.lang.Exception -> L3b
            goto L6d
        L3b:
            r7 = move-exception
            goto L7a
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            k8.k.b(r8)
            t6.u r8 = r7.c()
            k6.h r2 = r6.f50830a     // Catch: java.lang.Exception -> L75
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = "firebaseInstallations.id"
            kotlin.jvm.internal.l.d(r2, r5)     // Catch: java.lang.Exception -> L75
            r0.f50832a = r6     // Catch: java.lang.Exception -> L75
            r0.f50833c = r7     // Catch: java.lang.Exception -> L75
            r0.f50834d = r8     // Catch: java.lang.Exception -> L75
            r0.f50835e = r8     // Catch: java.lang.Exception -> L75
            r0.f50838h = r3     // Catch: java.lang.Exception -> L75
            java.lang.Object r0 = L8.b.a(r2, r0)     // Catch: java.lang.Exception -> L75
            if (r0 != r1) goto L68
            return r1
        L68:
            r2 = r7
            r7 = r8
            r1 = r7
            r8 = r0
            r0 = r6
        L6d:
            java.lang.String r3 = "{\n        firebaseInstallations.id.await()\n      }"
            kotlin.jvm.internal.l.d(r8, r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3b
            goto L96
        L75:
            r0 = move-exception
            r2 = r7
            r1 = r8
            r7 = r0
            r0 = r6
        L7a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "Error getting Firebase Installation ID: "
            r8.append(r3)
            r8.append(r7)
            java.lang.String r7 = ". Using an empty ID"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.e(r4, r7)
            java.lang.String r8 = ""
            r7 = r1
        L96:
            r7.g(r8)
            t6.i r7 = r0.f50831b     // Catch: java.lang.RuntimeException -> Lbb
            r7.a(r2)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lbb
            r7.<init>()     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r8 = "Successfully logged Session Start event: "
            r7.append(r8)     // Catch: java.lang.RuntimeException -> Lbb
            t6.u r8 = r2.c()     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r8 = r8.e()     // Catch: java.lang.RuntimeException -> Lbb
            r7.append(r8)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.RuntimeException -> Lbb
            android.util.Log.i(r4, r7)     // Catch: java.lang.RuntimeException -> Lbb
            goto Lc1
        Lbb:
            r7 = move-exception
            java.lang.String r8 = "Error logging Session Start event to DataTransport: "
            android.util.Log.e(r4, r8, r7)
        Lc1:
            k8.q r7 = k8.q.f43674a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.o.a(t6.r, o8.d):java.lang.Object");
    }
}
