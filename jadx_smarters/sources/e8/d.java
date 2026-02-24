package E8;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements D8.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f1722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w8.p f1725d;

    public static final class a implements Iterator, x8.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1726a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public B8.c f1729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1730f;

        public a() {
            int iH = B8.h.h(d.this.f1723b, 0, d.this.f1722a.length());
            this.f1727c = iH;
            this.f1728d = iH;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b() {
            /*
                r6 = this;
                int r0 = r6.f1728d
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f1726a = r1
                r0 = 0
                r6.f1729e = r0
                goto L99
            Lc:
                E8.d r0 = E8.d.this
                int r0 = E8.d.d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f1730f
                int r0 = r0 + r3
                r6.f1730f = r0
                E8.d r4 = E8.d.this
                int r4 = E8.d.d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f1728d
                E8.d r4 = E8.d.this
                java.lang.CharSequence r4 = E8.d.c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                B8.c r0 = new B8.c
                int r1 = r6.f1727c
                E8.d r4 = E8.d.this
                java.lang.CharSequence r4 = E8.d.c(r4)
                int r4 = E8.o.L(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f1729e = r0
            L44:
                r6.f1728d = r2
                goto L97
            L47:
                E8.d r0 = E8.d.this
                w8.p r0 = E8.d.b(r0)
                E8.d r4 = E8.d.this
                java.lang.CharSequence r4 = E8.d.c(r4)
                int r5 = r6.f1728d
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                k8.i r0 = (k8.i) r0
                if (r0 != 0) goto L73
                B8.c r0 = new B8.c
                int r1 = r6.f1727c
                E8.d r4 = E8.d.this
                java.lang.CharSequence r4 = E8.d.c(r4)
                int r4 = E8.o.L(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f1727c
                B8.c r4 = B8.h.m(r4, r2)
                r6.f1729e = r4
                int r2 = r2 + r0
                r6.f1727c = r2
                if (r0 != 0) goto L95
                r1 = 1
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f1726a = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E8.d.a.b():void");
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public B8.c next() {
            if (this.f1726a == -1) {
                b();
            }
            if (this.f1726a == 0) {
                throw new NoSuchElementException();
            }
            B8.c cVar = this.f1729e;
            kotlin.jvm.internal.l.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f1729e = null;
            this.f1726a = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1726a == -1) {
                b();
            }
            return this.f1726a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence input, int i9, int i10, w8.p getNextMatch) {
        kotlin.jvm.internal.l.e(input, "input");
        kotlin.jvm.internal.l.e(getNextMatch, "getNextMatch");
        this.f1722a = input;
        this.f1723b = i9;
        this.f1724c = i10;
        this.f1725d = getNextMatch;
    }

    @Override // D8.d
    public Iterator iterator() {
        return new a();
    }
}
