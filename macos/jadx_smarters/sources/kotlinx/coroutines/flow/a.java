package kotlinx.coroutines.flow;

import o8.InterfaceC2372d;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.a$a, reason: collision with other inner class name */
    public static final class C0366a extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f43697a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f43698c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f43700e;

        public C0366a(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f43698c = obj;
            this.f43700e |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public abstract Object a(c cVar, InterfaceC2372d interfaceC2372d);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlinx.coroutines.flow.c r6, o8.InterfaceC2372d r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.a.C0366a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.a.C0366a) r0
            int r1 = r0.f43700e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43700e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f43698c
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f43700e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f43697a
            J8.i r6 = (J8.i) r6
            k8.k.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            k8.k.b(r7)
            J8.i r7 = new J8.i
            o8.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f43697a = r7     // Catch: java.lang.Throwable -> L55
            r0.f43700e = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.a(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            k8.q r6 = k8.q.f43674a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.a.b(kotlinx.coroutines.flow.c, o8.d):java.lang.Object");
    }
}
