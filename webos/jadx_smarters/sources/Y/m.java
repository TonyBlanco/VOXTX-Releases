package Y;

import G8.AbstractC0606y;
import G8.InterfaceC0602w;
import G8.L;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.B;
import kotlin.jvm.internal.y;
import l8.s;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2643b;
import q8.AbstractC2645d;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Y.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f10518k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set f10519l = new LinkedHashSet();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f10520m = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w8.a f10521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y.k f10522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y.b f10523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L f10524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.b f10525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k8.f f10527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f10528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f10529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y.l f10530j;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Set a() {
            return m.f10519l;
        }

        public final Object b() {
            return m.f10520m;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Y.n f10531a;

            public a(Y.n nVar) {
                super(null);
                this.f10531a = nVar;
            }

            public Y.n a() {
                return this.f10531a;
            }
        }

        /* JADX INFO: renamed from: Y.m$b$b, reason: collision with other inner class name */
        public static final class C0143b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final w8.p f10532a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterfaceC0602w f10533b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Y.n f10534c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final o8.g f10535d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0143b(w8.p transform, InterfaceC0602w ack, Y.n nVar, o8.g callerContext) {
                super(null);
                kotlin.jvm.internal.l.e(transform, "transform");
                kotlin.jvm.internal.l.e(ack, "ack");
                kotlin.jvm.internal.l.e(callerContext, "callerContext");
                this.f10532a = transform;
                this.f10533b = ack;
                this.f10534c = nVar;
                this.f10535d = callerContext;
            }

            public final InterfaceC0602w a() {
                return this.f10533b;
            }

            public final o8.g b() {
                return this.f10535d;
            }

            public Y.n c() {
                return this.f10534c;
            }

            public final w8.p d() {
                return this.f10532a;
            }
        }

        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class c extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FileOutputStream f10536a;

        public c(FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.l.e(fileOutputStream, "fileOutputStream");
            this.f10536a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f10536a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i9) throws IOException {
            this.f10536a.write(i9);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b9) throws IOException {
            kotlin.jvm.internal.l.e(b9, "b");
            this.f10536a.write(b9);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i9, int i10) throws IOException {
            kotlin.jvm.internal.l.e(bytes, "bytes");
            this.f10536a.write(bytes, i9, i10);
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements w8.l {
        public d() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                m.this.f10528h.setValue(new Y.h(th));
            }
            a aVar = m.f10518k;
            Object objB = aVar.b();
            m mVar = m.this;
            synchronized (objB) {
                aVar.a().remove(mVar.q().getAbsolutePath());
                k8.q qVar = k8.q.f43674a;
            }
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return k8.q.f43674a;
        }
    }

    public static final class e extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f10538a = new e();

        public e() {
            super(2);
        }

        public final void a(b msg, Throwable th) {
            kotlin.jvm.internal.l.e(msg, "msg");
            if (msg instanceof b.C0143b) {
                InterfaceC0602w interfaceC0602wA = ((b.C0143b) msg).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                interfaceC0602wA.n(th);
            }
        }

        @Override // w8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return k8.q.f43674a;
        }
    }

    public static final class f extends q8.l implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10539a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f10540c;

        public f(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, InterfaceC2372d interfaceC2372d) {
            return ((f) create(bVar, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            f fVar = m.this.new f(interfaceC2372d);
            fVar.f10540c = obj;
            return fVar;
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f10539a;
            if (i9 == 0) {
                k8.k.b(obj);
                b bVar = (b) this.f10540c;
                if (bVar instanceof b.a) {
                    this.f10539a = 1;
                    if (m.this.r((b.a) bVar, this) == objD) {
                        return objD;
                    }
                } else if (bVar instanceof b.C0143b) {
                    this.f10539a = 2;
                    if (m.this.s((b.C0143b) bVar, this) == objD) {
                        return objD;
                    }
                }
            } else {
                if (i9 != 1 && i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k8.k.b(obj);
            }
            return k8.q.f43674a;
        }
    }

    public static final class g extends q8.l implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10542a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f10543c;

        public static final class a extends q8.l implements w8.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10545a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f10546c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Y.n f10547d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Y.n nVar, InterfaceC2372d interfaceC2372d) {
                super(2, interfaceC2372d);
                this.f10547d = nVar;
            }

            @Override // w8.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Y.n nVar, InterfaceC2372d interfaceC2372d) {
                return ((a) create(nVar, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
            }

            @Override // q8.AbstractC2642a
            public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
                a aVar = new a(this.f10547d, interfaceC2372d);
                aVar.f10546c = obj;
                return aVar;
            }

            @Override // q8.AbstractC2642a
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC2512c.d();
                if (this.f10545a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k8.k.b(obj);
                Y.n nVar = (Y.n) this.f10546c;
                Y.n nVar2 = this.f10547d;
                boolean z9 = false;
                if (!(nVar2 instanceof Y.c) && !(nVar2 instanceof Y.h) && nVar == nVar2) {
                    z9 = true;
                }
                return AbstractC2643b.a(z9);
            }
        }

        public static final class b implements kotlinx.coroutines.flow.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.b f10548a;

            public static final class a implements kotlinx.coroutines.flow.c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.c f10549a;

                /* JADX INFO: renamed from: Y.m$g$b$a$a, reason: collision with other inner class name */
                public static final class C0144a extends AbstractC2645d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f10550a;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public int f10551c;

                    public C0144a(InterfaceC2372d interfaceC2372d) {
                        super(interfaceC2372d);
                    }

                    @Override // q8.AbstractC2642a
                    public final Object invokeSuspend(Object obj) {
                        this.f10550a = obj;
                        this.f10551c |= Integer.MIN_VALUE;
                        return a.this.a(null, this);
                    }
                }

                public a(kotlinx.coroutines.flow.c cVar) {
                    this.f10549a = cVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.c
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object a(java.lang.Object r5, o8.InterfaceC2372d r6) throws java.lang.Throwable {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof Y.m.g.b.a.C0144a
                        if (r0 == 0) goto L13
                        r0 = r6
                        Y.m$g$b$a$a r0 = (Y.m.g.b.a.C0144a) r0
                        int r1 = r0.f10551c
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f10551c = r1
                        goto L18
                    L13:
                        Y.m$g$b$a$a r0 = new Y.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f10550a
                        java.lang.Object r1 = p8.AbstractC2512c.d()
                        int r2 = r0.f10551c
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        k8.k.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        k8.k.b(r6)
                        kotlinx.coroutines.flow.c r6 = r4.f10549a
                        Y.n r5 = (Y.n) r5
                        boolean r2 = r5 instanceof Y.j
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof Y.h
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof Y.c
                        if (r2 == 0) goto L56
                        Y.c r5 = (Y.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f10551c = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        k8.q r5 = k8.q.f43674a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof Y.o
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        k8.h r5 = new k8.h
                        r5.<init>()
                        throw r5
                    L6c:
                        Y.h r5 = (Y.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L73:
                        Y.j r5 = (Y.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Y.m.g.b.a.a(java.lang.Object, o8.d):java.lang.Object");
                }
            }

            public b(kotlinx.coroutines.flow.b bVar) {
                this.f10548a = bVar;
            }

            @Override // kotlinx.coroutines.flow.b
            public Object b(kotlinx.coroutines.flow.c cVar, InterfaceC2372d interfaceC2372d) {
                Object objB = this.f10548a.b(new a(cVar), interfaceC2372d);
                return objB == AbstractC2512c.d() ? objB : k8.q.f43674a;
            }
        }

        public g(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.c cVar, InterfaceC2372d interfaceC2372d) {
            return ((g) create(cVar, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            g gVar = m.this.new g(interfaceC2372d);
            gVar.f10543c = obj;
            return gVar;
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f10542a;
            if (i9 == 0) {
                k8.k.b(obj);
                kotlinx.coroutines.flow.c cVar = (kotlinx.coroutines.flow.c) this.f10543c;
                Y.n nVar = (Y.n) m.this.f10528h.getValue();
                if (!(nVar instanceof Y.c)) {
                    m.this.f10530j.e(new b.a(nVar));
                }
                b bVar = new b(kotlinx.coroutines.flow.d.a(m.this.f10528h, new a(nVar, null)));
                this.f10542a = 1;
                if (kotlinx.coroutines.flow.d.b(cVar, bVar, this) == objD) {
                    return objD;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k8.k.b(obj);
            }
            return k8.q.f43674a;
        }
    }

    public static final class h extends kotlin.jvm.internal.m implements w8.a {
        public h() {
            super(0);
        }

        @Override // w8.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File invoke() {
            File file = (File) m.this.f10521a.invoke();
            String it = file.getAbsolutePath();
            a aVar = m.f10518k;
            synchronized (aVar.b()) {
                if (!(!aVar.a().contains(it))) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set setA = aVar.a();
                kotlin.jvm.internal.l.d(it, "it");
                setA.add(it);
            }
            return file;
        }
    }

    public static final class i extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10554a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10556d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f10557e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10559g;

        public i(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10557e = obj;
            this.f10559g |= Integer.MIN_VALUE;
            return m.this.s(null, this);
        }
    }

    public static final class j extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10560a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10561c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10562d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f10563e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f10564f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f10565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f10566h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f10568j;

        public j(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10566h = obj;
            this.f10568j |= Integer.MIN_VALUE;
            return m.this.t(this);
        }
    }

    public static final class k implements Y.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.sync.b f10569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y f10570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ B f10571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f10572d;

        public static final class a extends AbstractC2645d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f10573a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f10574c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f10575d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f10576e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public Object f10577f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public /* synthetic */ Object f10578g;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f10580i;

            public a(InterfaceC2372d interfaceC2372d) {
                super(interfaceC2372d);
            }

            @Override // q8.AbstractC2642a
            public final Object invokeSuspend(Object obj) {
                this.f10578g = obj;
                this.f10580i |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(kotlinx.coroutines.sync.b bVar, y yVar, B b9, m mVar) {
            this.f10569a = bVar;
            this.f10570b = yVar;
            this.f10571c = b9;
            this.f10572d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Y.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(w8.p r11, o8.InterfaceC2372d r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.m.k.a(w8.p, o8.d):java.lang.Object");
        }
    }

    public static final class l extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10581a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f10582c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10584e;

        public l(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10582c = obj;
            this.f10584e |= Integer.MIN_VALUE;
            return m.this.u(this);
        }
    }

    /* JADX INFO: renamed from: Y.m$m, reason: collision with other inner class name */
    public static final class C0145m extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10585a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f10586c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10588e;

        public C0145m(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10586c = obj;
            this.f10588e |= Integer.MIN_VALUE;
            return m.this.v(this);
        }
    }

    public static final class n extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10589a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f10592e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10594g;

        public n(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10592e = obj;
            this.f10594g |= Integer.MIN_VALUE;
            return m.this.w(this);
        }
    }

    public static final class o extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10595a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10596c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f10597d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10599f;

        public o(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10597d = obj;
            this.f10599f |= Integer.MIN_VALUE;
            return m.this.x(this);
        }
    }

    public static final class p extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10600a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f10603e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10605g;

        public p(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10603e = obj;
            this.f10605g |= Integer.MIN_VALUE;
            return m.this.y(null, null, this);
        }
    }

    public static final class q extends q8.l implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10606a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w8.p f10607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f10608d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(w8.p pVar, Object obj, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f10607c = pVar;
            this.f10608d = obj;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L l9, InterfaceC2372d interfaceC2372d) {
            return ((q) create(l9, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return new q(this.f10607c, this.f10608d, interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f10606a;
            if (i9 == 0) {
                k8.k.b(obj);
                w8.p pVar = this.f10607c;
                Object obj2 = this.f10608d;
                this.f10606a = 1;
                obj = pVar.invoke(obj2, this);
                if (obj == objD) {
                    return objD;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k8.k.b(obj);
            }
            return obj;
        }
    }

    public static final class r extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10609a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f10610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f10611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f10612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f10613f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f10614g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f10616i;

        public r(InterfaceC2372d interfaceC2372d) {
            super(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) {
            this.f10614g = obj;
            this.f10616i |= Integer.MIN_VALUE;
            return m.this.z(null, this);
        }
    }

    public m(w8.a produceFile, Y.k serializer, List initTasksList, Y.b corruptionHandler, L scope) {
        kotlin.jvm.internal.l.e(produceFile, "produceFile");
        kotlin.jvm.internal.l.e(serializer, "serializer");
        kotlin.jvm.internal.l.e(initTasksList, "initTasksList");
        kotlin.jvm.internal.l.e(corruptionHandler, "corruptionHandler");
        kotlin.jvm.internal.l.e(scope, "scope");
        this.f10521a = produceFile;
        this.f10522b = serializer;
        this.f10523c = corruptionHandler;
        this.f10524d = scope;
        this.f10525e = kotlinx.coroutines.flow.d.e(new g(null));
        this.f10526f = ".tmp";
        this.f10527g = k8.g.a(new h());
        this.f10528h = kotlinx.coroutines.flow.m.a(Y.o.f10617a);
        this.f10529i = s.L(initTasksList);
        this.f10530j = new Y.l(scope, new d(), e.f10538a, new f(null));
    }

    @Override // Y.f
    public Object a(w8.p pVar, InterfaceC2372d interfaceC2372d) throws Throwable {
        InterfaceC0602w interfaceC0602wB = AbstractC0606y.b(null, 1, null);
        this.f10530j.e(new b.C0143b(pVar, interfaceC0602wB, (Y.n) this.f10528h.getValue(), interfaceC2372d.getContext()));
        return interfaceC0602wB.q(interfaceC2372d);
    }

    @Override // Y.f
    public kotlinx.coroutines.flow.b getData() {
        return this.f10525e;
    }

    public final void p(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(kotlin.jvm.internal.l.l("Unable to create parent directories of ", file));
        }
    }

    public final File q() {
        return (File) this.f10527g.getValue();
    }

    public final Object r(b.a aVar, InterfaceC2372d interfaceC2372d) throws Throwable {
        Y.n nVar = (Y.n) this.f10528h.getValue();
        if (!(nVar instanceof Y.c)) {
            if (nVar instanceof Y.j) {
                if (nVar == aVar.a()) {
                    Object objV = v(interfaceC2372d);
                    return objV == AbstractC2512c.d() ? objV : k8.q.f43674a;
                }
            } else {
                if (kotlin.jvm.internal.l.a(nVar, Y.o.f10617a)) {
                    Object objV2 = v(interfaceC2372d);
                    return objV2 == AbstractC2512c.d() ? objV2 : k8.q.f43674a;
                }
                if (nVar instanceof Y.h) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return k8.q.f43674a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v0, types: [Y.m$b$b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [Y.m$b$b] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [G8.w] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(Y.m.b.C0143b r9, o8.InterfaceC2372d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.s(Y.m$b$b, o8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(o8.InterfaceC2372d r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.t(o8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(o8.InterfaceC2372d r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Y.m.l
            if (r0 == 0) goto L13
            r0 = r5
            Y.m$l r0 = (Y.m.l) r0
            int r1 = r0.f10584e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10584e = r1
            goto L18
        L13:
            Y.m$l r0 = new Y.m$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10582c
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f10584e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f10581a
            Y.m r0 = (Y.m) r0
            k8.k.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            k8.k.b(r5)
            r0.f10581a = r4     // Catch: java.lang.Throwable -> L48
            r0.f10584e = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            k8.q r5 = k8.q.f43674a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            kotlinx.coroutines.flow.j r0 = r0.f10528h
            Y.j r1 = new Y.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.u(o8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(o8.InterfaceC2372d r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Y.m.C0145m
            if (r0 == 0) goto L13
            r0 = r5
            Y.m$m r0 = (Y.m.C0145m) r0
            int r1 = r0.f10588e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10588e = r1
            goto L18
        L13:
            Y.m$m r0 = new Y.m$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10586c
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f10588e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f10585a
            Y.m r0 = (Y.m) r0
            k8.k.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            k8.k.b(r5)
            r0.f10585a = r4     // Catch: java.lang.Throwable -> L45
            r0.f10588e = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            kotlinx.coroutines.flow.j r0 = r0.f10528h
            Y.j r1 = new Y.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            k8.q r5 = k8.q.f43674a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.v(o8.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [Y.m] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Y.m$n, o8.d] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [Y.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(o8.InterfaceC2372d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Y.m.n
            if (r0 == 0) goto L13
            r0 = r6
            Y.m$n r0 = (Y.m.n) r0
            int r1 = r0.f10594g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10594g = r1
            goto L18
        L13:
            Y.m$n r0 = new Y.m$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10592e
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f10594g
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f10591d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f10590c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f10589a
            Y.m r0 = (Y.m) r0
            k8.k.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            k8.k.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.q()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            Y.k r6 = r5.f10522b     // Catch: java.lang.Throwable -> L65
            r0.f10589a = r5     // Catch: java.lang.Throwable -> L65
            r0.f10590c = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f10591d = r4     // Catch: java.lang.Throwable -> L65
            r0.f10594g = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.c(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            u8.a.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            u8.a.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            Y.k r6 = r0.f10522b
            java.lang.Object r6 = r6.a()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.w(o8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(o8.InterfaceC2372d r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Y.m.o
            if (r0 == 0) goto L13
            r0 = r8
            Y.m$o r0 = (Y.m.o) r0
            int r1 = r0.f10599f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10599f = r1
            goto L18
        L13:
            Y.m$o r0 = new Y.m$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10597d
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f10599f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f10596c
            java.lang.Object r0 = r0.f10595a
            Y.a r0 = (Y.a) r0
            k8.k.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f10596c
            Y.a r2 = (Y.a) r2
            java.lang.Object r4 = r0.f10595a
            Y.m r4 = (Y.m) r4
            k8.k.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f10595a
            Y.m r2 = (Y.m) r2
            k8.k.b(r8)     // Catch: Y.a -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            k8.k.b(r8)
            r0.f10595a = r7     // Catch: Y.a -> L64
            r0.f10599f = r5     // Catch: Y.a -> L64
            java.lang.Object r8 = r7.w(r0)     // Catch: Y.a -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            Y.b r5 = r2.f10523c
            r0.f10595a = r2
            r0.f10596c = r8
            r0.f10599f = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f10595a = r2     // Catch: java.io.IOException -> L88
            r0.f10596c = r8     // Catch: java.io.IOException -> L88
            r0.f10599f = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.z(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            k8.AbstractC2152a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.x(o8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(w8.p r8, o8.g r9, o8.InterfaceC2372d r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof Y.m.p
            if (r0 == 0) goto L13
            r0 = r10
            Y.m$p r0 = (Y.m.p) r0
            int r1 = r0.f10605g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10605g = r1
            goto L18
        L13:
            Y.m$p r0 = new Y.m$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f10603e
            java.lang.Object r1 = p8.AbstractC2512c.d()
            int r2 = r0.f10605g
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f10601c
            java.lang.Object r9 = r0.f10600a
            Y.m r9 = (Y.m) r9
            k8.k.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f10602d
            java.lang.Object r9 = r0.f10601c
            Y.c r9 = (Y.c) r9
            java.lang.Object r2 = r0.f10600a
            Y.m r2 = (Y.m) r2
            k8.k.b(r10)
            goto L73
        L49:
            k8.k.b(r10)
            kotlinx.coroutines.flow.j r10 = r7.f10528h
            java.lang.Object r10 = r10.getValue()
            Y.c r10 = (Y.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            Y.m$q r6 = new Y.m$q
            r6.<init>(r8, r2, r3)
            r0.f10600a = r7
            r0.f10601c = r10
            r0.f10602d = r2
            r0.f10605g = r5
            java.lang.Object r8 = G8.AbstractC0575i.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = kotlin.jvm.internal.l.a(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.f10600a = r2
            r0.f10601c = r10
            r0.f10602d = r3
            r0.f10605g = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            kotlinx.coroutines.flow.j r9 = r9.f10528h
            Y.c r10 = new Y.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.y(w8.p, o8.g, o8.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.Object r8, o8.InterfaceC2372d r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.m.z(java.lang.Object, o8.d):java.lang.Object");
    }
}
