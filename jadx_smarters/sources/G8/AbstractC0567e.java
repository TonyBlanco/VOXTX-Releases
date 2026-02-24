package G8;

import o8.InterfaceC2372d;
import q8.AbstractC2645d;

/* JADX INFO: renamed from: G8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0567e {

    /* JADX INFO: renamed from: G8.e$a */
    public static final class a extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f2327a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f2328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2329d;

        public a(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f2328c = obj;
            this.f2329d |= Integer.MIN_VALUE;
            return AbstractC0567e.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.Collection r4, o8.InterfaceC2372d r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof G8.AbstractC0567e.a
            if (r0 == 0) goto L13
            r0 = r5
            G8.e$a r0 = (G8.AbstractC0567e.a) r0
            int r1 = r0.f2329d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2329d = r1
            goto L18
        L13:
            G8.e$a r0 = new G8.e$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2328c
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f2329d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f2327a
            java.util.Iterator r4 = (java.util.Iterator) r4
            k8.k.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            k8.k.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            G8.x0 r5 = (G8.InterfaceC0605x0) r5
            r0.f2327a = r4
            r0.f2329d = r3
            java.lang.Object r5 = r5.m(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            k8.q r4 = k8.q.f43674a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.AbstractC0567e.a(java.util.Collection, o8.d):java.lang.Object");
    }
}
