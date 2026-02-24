package Y;

import d.AbstractC1617D;
import java.util.Iterator;
import java.util.List;
import k8.q;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.AbstractC2645d;
import w8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10488a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: Y.e$a$a, reason: collision with other inner class name */
        public static final class C0141a extends q8.l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10489a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f10490c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ List f10491d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0141a(List list, InterfaceC2372d interfaceC2372d) {
                super(2, interfaceC2372d);
                this.f10491d = list;
            }

            @Override // w8.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i iVar, InterfaceC2372d interfaceC2372d) {
                return ((C0141a) create(iVar, interfaceC2372d)).invokeSuspend(q.f43674a);
            }

            @Override // q8.AbstractC2642a
            public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
                C0141a c0141a = new C0141a(this.f10491d, interfaceC2372d);
                c0141a.f10490c = obj;
                return c0141a;
            }

            @Override // q8.AbstractC2642a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objD = AbstractC2512c.d();
                int i9 = this.f10489a;
                if (i9 == 0) {
                    k8.k.b(obj);
                    i iVar = (i) this.f10490c;
                    a aVar = e.f10488a;
                    List list = this.f10491d;
                    this.f10489a = 1;
                    if (aVar.c(list, iVar, this) == objD) {
                        return objD;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k8.k.b(obj);
                }
                return q.f43674a;
            }
        }

        public static final class b extends AbstractC2645d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f10492a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f10493c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public /* synthetic */ Object f10494d;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f10496f;

            public b(InterfaceC2372d interfaceC2372d) {
                super(interfaceC2372d);
            }

            @Override // q8.AbstractC2642a
            public final Object invokeSuspend(Object obj) {
                this.f10494d = obj;
                this.f10496f |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        public static final class c extends q8.l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f10497a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f10498c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f10499d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f10500e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public /* synthetic */ Object f10501f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ List f10502g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final /* synthetic */ List f10503h;

            /* JADX INFO: renamed from: Y.e$a$c$a, reason: collision with other inner class name */
            public static final class C0142a extends q8.l implements w8.l {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f10504a;

                public C0142a(d dVar, InterfaceC2372d interfaceC2372d) {
                    super(1, interfaceC2372d);
                }

                @Override // w8.l
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC2372d interfaceC2372d) {
                    return ((C0142a) create(interfaceC2372d)).invokeSuspend(q.f43674a);
                }

                @Override // q8.AbstractC2642a
                public final InterfaceC2372d create(InterfaceC2372d interfaceC2372d) {
                    return new C0142a(null, interfaceC2372d);
                }

                @Override // q8.AbstractC2642a
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC2512c.d();
                    int i9 = this.f10504a;
                    if (i9 == 0) {
                        k8.k.b(obj);
                        this.f10504a = 1;
                        throw null;
                    }
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k8.k.b(obj);
                    return q.f43674a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, InterfaceC2372d interfaceC2372d) {
                super(2, interfaceC2372d);
                this.f10502g = list;
                this.f10503h = list2;
            }

            @Override // w8.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, InterfaceC2372d interfaceC2372d) {
                return ((c) create(obj, interfaceC2372d)).invokeSuspend(q.f43674a);
            }

            @Override // q8.AbstractC2642a
            public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
                c cVar = new c(this.f10502g, this.f10503h, interfaceC2372d);
                cVar.f10501f = obj;
                return cVar;
            }

            @Override // q8.AbstractC2642a
            public final Object invokeSuspend(Object obj) throws Throwable {
                List list;
                Iterator it;
                AbstractC2512c.d();
                int i9 = this.f10500e;
                if (i9 == 0) {
                    k8.k.b(obj);
                    obj = this.f10501f;
                    List list2 = this.f10502g;
                    list = this.f10503h;
                    it = list2.iterator();
                } else if (i9 == 1) {
                    Object obj2 = this.f10499d;
                    AbstractC1617D.a(this.f10498c);
                    Iterator it2 = (Iterator) this.f10497a;
                    List list3 = (List) this.f10501f;
                    k8.k.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0142a(null, null));
                        this.f10501f = list3;
                        this.f10497a = it2;
                        this.f10498c = null;
                        this.f10499d = null;
                        this.f10500e = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f10497a;
                    list = (List) this.f10501f;
                    k8.k.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                AbstractC1617D.a(it.next());
                this.f10501f = list;
                this.f10497a = it;
                this.f10498c = null;
                this.f10499d = obj;
                this.f10500e = 1;
                throw null;
            }
        }

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final p b(List migrations) {
            kotlin.jvm.internal.l.e(migrations, "migrations");
            return new C0141a(migrations, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(java.util.List r7, Y.i r8, o8.InterfaceC2372d r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof Y.e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                Y.e$a$b r0 = (Y.e.a.b) r0
                int r1 = r0.f10496f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10496f = r1
                goto L18
            L13:
                Y.e$a$b r0 = new Y.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f10494d
                java.lang.Object r1 = p8.AbstractC2512c.d()
                int r2 = r0.f10496f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f10493c
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f10492a
                kotlin.jvm.internal.B r8 = (kotlin.jvm.internal.B) r8
                k8.k.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f10492a
                java.util.List r7 = (java.util.List) r7
                k8.k.b(r9)
                goto L60
            L46:
                k8.k.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                Y.e$a$c r2 = new Y.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f10492a = r9
                r0.f10496f = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                kotlin.jvm.internal.B r8 = new kotlin.jvm.internal.B
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                w8.l r9 = (w8.l) r9
                r0.f10492a = r8     // Catch: java.lang.Throwable -> L34
                r0.f10493c = r7     // Catch: java.lang.Throwable -> L34
                r0.f10496f = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                java.lang.Object r2 = r8.f43676a
                if (r2 != 0) goto L8b
                r8.f43676a = r9
                goto L6b
            L8b:
                kotlin.jvm.internal.l.b(r2)
                java.lang.Object r2 = r8.f43676a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                k8.AbstractC2152a.a(r2, r9)
                goto L6b
            L96:
                java.lang.Object r7 = r8.f43676a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                k8.q r7 = k8.q.f43674a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.e.a.c(java.util.List, Y.i, o8.d):java.lang.Object");
        }
    }
}
