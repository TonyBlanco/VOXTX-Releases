package kotlinx.coroutines.flow;

import k8.q;
import kotlin.jvm.internal.y;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2645d;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h {

    public static final class a implements kotlinx.coroutines.flow.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.b f43701a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f43702c;

        public a(kotlinx.coroutines.flow.b bVar, p pVar) {
            this.f43701a = bVar;
            this.f43702c = pVar;
        }

        @Override // kotlinx.coroutines.flow.b
        public Object b(c cVar, InterfaceC2372d interfaceC2372d) {
            Object objB = this.f43701a.b(new b(new y(), cVar, this.f43702c), interfaceC2372d);
            return objB == AbstractC2512c.d() ? objB : q.f43674a;
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y f43703a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f43704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f43705d;

        public static final class a extends AbstractC2645d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f43706a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f43707c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f43708d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f43710f;

            public a(InterfaceC2372d interfaceC2372d) {
                super(interfaceC2372d);
            }

            @Override // q8.AbstractC2642a
            public final Object invokeSuspend(Object obj) {
                this.f43708d = obj;
                this.f43710f |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(y yVar, c cVar, p pVar) {
            this.f43703a = yVar;
            this.f43704c = cVar;
            this.f43705d = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r7, o8.InterfaceC2372d r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.h.b.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.h$b$a r0 = (kotlinx.coroutines.flow.h.b.a) r0
                int r1 = r0.f43710f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f43710f = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.h$b$a r0 = new kotlinx.coroutines.flow.h$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f43708d
                java.lang.Object r1 = p8.AbstractC2512c.d()
                int r2 = r0.f43710f
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                k8.k.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f43707c
                java.lang.Object r2 = r0.f43706a
                kotlinx.coroutines.flow.h$b r2 = (kotlinx.coroutines.flow.h.b) r2
                k8.k.b(r8)
                goto L6c
            L41:
                k8.k.b(r8)
                goto L59
            L45:
                k8.k.b(r8)
                kotlin.jvm.internal.y r8 = r6.f43703a
                boolean r8 = r8.f43695a
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.c r8 = r6.f43704c
                r0.f43710f = r5
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                k8.q r7 = k8.q.f43674a
                return r7
            L5c:
                w8.p r8 = r6.f43705d
                r0.f43706a = r6
                r0.f43707c = r7
                r0.f43710f = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.y r8 = r2.f43703a
                r8.f43695a = r5
                kotlinx.coroutines.flow.c r8 = r2.f43704c
                r2 = 0
                r0.f43706a = r2
                r0.f43707c = r2
                r0.f43710f = r3
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                k8.q r7 = k8.q.f43674a
                return r7
            L8b:
                k8.q r7 = k8.q.f43674a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h.b.a(java.lang.Object, o8.d):java.lang.Object");
        }
    }

    public static final kotlinx.coroutines.flow.b a(kotlinx.coroutines.flow.b bVar, p pVar) {
        return new a(bVar, pVar);
    }
}
