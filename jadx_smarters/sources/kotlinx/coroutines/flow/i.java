package kotlinx.coroutines.flow;

import kotlin.jvm.internal.B;
import o8.InterfaceC2372d;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class i {

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f43711a;

        public a(B b9) {
            this.f43711a = b9;
        }

        @Override // kotlinx.coroutines.flow.c
        public Object a(Object obj, InterfaceC2372d interfaceC2372d) {
            this.f43711a.f43676a = obj;
            throw new J8.a(this);
        }
    }

    public static final class b extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f43712a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f43713c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f43714d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43715e;

        public b(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f43714d = obj;
            this.f43715e |= Integer.MIN_VALUE;
            return d.d(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(kotlinx.coroutines.flow.b r4, o8.InterfaceC2372d r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.i.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.i$b r0 = (kotlinx.coroutines.flow.i.b) r0
            int r1 = r0.f43715e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43715e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.i$b r0 = new kotlinx.coroutines.flow.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f43714d
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f43715e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f43713c
            kotlinx.coroutines.flow.i$a r4 = (kotlinx.coroutines.flow.i.a) r4
            java.lang.Object r0 = r0.f43712a
            kotlin.jvm.internal.B r0 = (kotlin.jvm.internal.B) r0
            k8.k.b(r5)     // Catch: J8.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            k8.k.b(r5)
            kotlin.jvm.internal.B r5 = new kotlin.jvm.internal.B
            r5.<init>()
            kotlinx.coroutines.internal.y r2 = J8.h.f3403a
            r5.f43676a = r2
            kotlinx.coroutines.flow.i$a r2 = new kotlinx.coroutines.flow.i$a
            r2.<init>(r5)
            r0.f43712a = r5     // Catch: J8.a -> L5b
            r0.f43713c = r2     // Catch: J8.a -> L5b
            r0.f43715e = r3     // Catch: J8.a -> L5b
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: J8.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            J8.f.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.f43676a
            kotlinx.coroutines.internal.y r5 = J8.h.f3403a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.i.a(kotlinx.coroutines.flow.b, o8.d):java.lang.Object");
    }
}
