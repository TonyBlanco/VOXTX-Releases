package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    @NotNull
    private volatile /* synthetic */ Object _next = null;

    @NotNull
    private volatile /* synthetic */ long _state = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f43775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f43777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43770e = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final y f43773h = new y("REMOVE_FROZEN");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43771f = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f43772g = AtomicLongFieldUpdater.newUpdater(o.class, "_state");

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a(long j9) {
            return (j9 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j9, int i9) {
            return d(j9, 1073741823L) | ((long) i9);
        }

        public final long c(long j9, int i9) {
            return d(j9, 1152921503533105152L) | (((long) i9) << 30);
        }

        public final long d(long j9, long j10) {
            return j9 & (~j10);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f43778a;

        public b(int i9) {
            this.f43778a = i9;
        }
    }

    public o(int i9, boolean z9) {
        this.f43774a = i9;
        this.f43775b = z9;
        int i10 = i9 - 1;
        this.f43776c = i10;
        this.f43777d = new AtomicReferenceArray(i9);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i9 & i10) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r12) {
        /*
            r11 = this;
        L0:
            long r2 = r11._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L12
            kotlinx.coroutines.internal.o$a r12 = kotlinx.coroutines.internal.o.f43770e
            int r12 = r12.a(r2)
            return r12
        L12:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r0 = 30
            long r4 = r4 >> r0
            int r8 = (int) r4
            int r9 = r11.f43776c
            int r0 = r8 + 2
            r0 = r0 & r9
            r4 = r1 & r9
            r5 = 1
            if (r0 != r4) goto L2c
            return r5
        L2c:
            boolean r0 = r11.f43775b
            r4 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 != 0) goto L4b
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r11.f43777d
            r10 = r8 & r9
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L4b
            int r0 = r11.f43774a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L4a
            int r8 = r8 - r1
            r1 = r8 & r4
            int r0 = r0 >> 1
            if (r1 <= r0) goto L0
        L4a:
            return r5
        L4b:
            int r0 = r8 + 1
            r0 = r0 & r4
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.internal.o.f43772g
            kotlinx.coroutines.internal.o$a r4 = kotlinx.coroutines.internal.o.f43770e
            long r4 = r4.c(r2, r0)
            r0 = r1
            r1 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r11.f43777d
            r1 = r8 & r9
            r0.set(r1, r12)
            r0 = r11
        L66:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L79
            kotlinx.coroutines.internal.o r0 = r0.i()
            kotlinx.coroutines.internal.o r0 = r0.e(r8, r12)
            if (r0 != 0) goto L66
        L79:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.a(java.lang.Object):int");
    }

    public final o b(long j9) {
        o oVar = new o(this.f43774a * 2, this.f43775b);
        int i9 = (int) (1073741823 & j9);
        int i10 = (int) ((1152921503533105152L & j9) >> 30);
        while (true) {
            int i11 = this.f43776c;
            if ((i9 & i11) == (i10 & i11)) {
                oVar._state = f43770e.d(j9, 1152921504606846976L);
                return oVar;
            }
            Object bVar = this.f43777d.get(i11 & i9);
            if (bVar == null) {
                bVar = new b(i9);
            }
            oVar.f43777d.set(oVar.f43776c & i9, bVar);
            i9++;
        }
    }

    public final o c(long j9) {
        while (true) {
            o oVar = (o) this._next;
            if (oVar != null) {
                return oVar;
            }
            AbstractC2755b.a(f43771f, this, null, b(j9));
        }
    }

    public final boolean d() {
        long j9;
        do {
            j9 = this._state;
            if ((j9 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j9) != 0) {
                return false;
            }
        } while (!f43772g.compareAndSet(this, j9, j9 | 2305843009213693952L));
        return true;
    }

    public final o e(int i9, Object obj) {
        Object obj2 = this.f43777d.get(this.f43776c & i9);
        if (!(obj2 instanceof b) || ((b) obj2).f43778a != i9) {
            return null;
        }
        this.f43777d.set(i9 & this.f43776c, obj);
        return this;
    }

    public final int f() {
        long j9 = this._state;
        return 1073741823 & (((int) ((j9 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j9)));
    }

    public final boolean g() {
        long j9 = this._state;
        return ((int) (1073741823 & j9)) == ((int) ((j9 & 1152921503533105152L) >> 30));
    }

    public final long h() {
        long j9;
        long j10;
        do {
            j9 = this._state;
            if ((j9 & 1152921504606846976L) != 0) {
                return j9;
            }
            j10 = j9 | 1152921504606846976L;
        } while (!f43772g.compareAndSet(this, j9, j10));
        return j10;
    }

    public final o i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j9 = this._state;
            if ((1152921504606846976L & j9) != 0) {
                return f43773h;
            }
            int i9 = (int) (1073741823 & j9);
            int i10 = (int) ((1152921503533105152L & j9) >> 30);
            int i11 = this.f43776c;
            if ((i10 & i11) == (i9 & i11)) {
                return null;
            }
            Object obj = this.f43777d.get(i11 & i9);
            if (obj == null) {
                if (this.f43775b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i9 + 1) & 1073741823;
                if (f43772g.compareAndSet(this, j9, f43770e.b(j9, i12))) {
                    this.f43777d.set(this.f43776c & i9, null);
                    return obj;
                }
                if (this.f43775b) {
                    o oVarK = this;
                    do {
                        oVarK = oVarK.k(i9, i12);
                    } while (oVarK != null);
                    return obj;
                }
            }
        }
    }

    public final o k(int i9, int i10) {
        long j9;
        int i11;
        do {
            j9 = this._state;
            i11 = (int) (1073741823 & j9);
            if ((1152921504606846976L & j9) != 0) {
                return i();
            }
        } while (!f43772g.compareAndSet(this, j9, f43770e.b(j9, i10)));
        this.f43777d.set(i11 & this.f43776c, null);
        return null;
    }
}
