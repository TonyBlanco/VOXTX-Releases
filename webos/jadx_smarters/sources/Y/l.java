package Y;

import G8.AbstractC0579k;
import G8.InterfaceC0605x0;
import G8.L;
import I8.h;
import com.google.android.gms.common.api.a;
import java.util.concurrent.atomic.AtomicInteger;
import k8.q;
import o8.InterfaceC2372d;
import w8.p;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L f10508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f10509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I8.f f10510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicInteger f10511d;

    public static final class a extends kotlin.jvm.internal.m implements w8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w8.l f10512a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f10513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f10514d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w8.l lVar, l lVar2, p pVar) {
            super(1);
            this.f10512a = lVar;
            this.f10513c = lVar2;
            this.f10514d = pVar;
        }

        public final void a(Throwable th) {
            q qVar;
            this.f10512a.invoke(th);
            this.f10513c.f10510c.c(th);
            do {
                Object objF = I8.h.f(this.f10513c.f10510c.b());
                if (objF == null) {
                    qVar = null;
                } else {
                    this.f10514d.invoke(objF, th);
                    qVar = q.f43674a;
                }
            } while (qVar != null);
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f43674a;
        }
    }

    public static final class b extends q8.l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10515a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10516c;

        public b(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L l9, InterfaceC2372d interfaceC2372d) {
            return ((b) create(l9, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return l.this.new b(interfaceC2372d);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // q8.AbstractC2642a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p8.AbstractC2512c.d()
                int r1 = r5.f10516c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                k8.k.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f10515a
                w8.p r1 = (w8.p) r1
                k8.k.b(r6)
                goto L56
            L22:
                k8.k.b(r6)
                Y.l r6 = Y.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = Y.l.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = 1
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                Y.l r6 = Y.l.this
                G8.L r6 = Y.l.d(r6)
                G8.M.d(r6)
                Y.l r6 = Y.l.this
                w8.p r1 = Y.l.a(r6)
                Y.l r6 = Y.l.this
                I8.f r6 = Y.l.b(r6)
                r5.f10515a = r1
                r5.f10516c = r3
                java.lang.Object r6 = r6.d(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r4 = 0
                r5.f10515a = r4
                r5.f10516c = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                Y.l r6 = Y.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = Y.l.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                k8.q r6 = k8.q.f43674a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l(L scope, w8.l onComplete, p onUndeliveredElement, p consumeMessage) {
        kotlin.jvm.internal.l.e(scope, "scope");
        kotlin.jvm.internal.l.e(onComplete, "onComplete");
        kotlin.jvm.internal.l.e(onUndeliveredElement, "onUndeliveredElement");
        kotlin.jvm.internal.l.e(consumeMessage, "consumeMessage");
        this.f10508a = scope;
        this.f10509b = consumeMessage;
        this.f10510c = I8.g.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f10511d = new AtomicInteger(0);
        InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) scope.t().a(InterfaceC0605x0.f2366b0);
        if (interfaceC0605x0 == null) {
            return;
        }
        interfaceC0605x0.i(new a(onComplete, this, onUndeliveredElement));
    }

    public final void e(Object obj) throws Throwable {
        Object objA = this.f10510c.a(obj);
        if (objA instanceof h.a) {
            Throwable thE = I8.h.e(objA);
            if (thE != null) {
                throw thE;
            }
            throw new I8.k("Channel was closed normally");
        }
        if (!I8.h.h(objA)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f10511d.getAndIncrement() == 0) {
            AbstractC0579k.d(this.f10508a, null, null, new b(null), 3, null);
        }
    }
}
