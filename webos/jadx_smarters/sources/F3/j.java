package F3;

import F3.k;
import O2.C0936z0;
import android.net.Uri;
import d4.AbstractC1684a;
import java.util.Collections;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0936z0 f1983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2743y f1984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f1987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f1988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f1989h;

    public static class b extends j implements E3.f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final k.a f1990i;

        public b(long j9, C0936z0 c0936z0, List list, k.a aVar, List list2, List list3, List list4) {
            super(j9, c0936z0, list, aVar, list2, list3, list4);
            this.f1990i = aVar;
        }

        @Override // F3.j
        public String a() {
            return null;
        }

        @Override // F3.j
        public E3.f b() {
            return this;
        }

        @Override // E3.f
        public long c(long j9) {
            return this.f1990i.j(j9);
        }

        @Override // E3.f
        public long d(long j9, long j10) {
            return this.f1990i.h(j9, j10);
        }

        @Override // E3.f
        public long e(long j9, long j10) {
            return this.f1990i.d(j9, j10);
        }

        @Override // E3.f
        public long f(long j9, long j10) {
            return this.f1990i.f(j9, j10);
        }

        @Override // E3.f
        public i g(long j9) {
            return this.f1990i.k(this, j9);
        }

        @Override // E3.f
        public long h(long j9, long j10) {
            return this.f1990i.i(j9, j10);
        }

        @Override // E3.f
        public long i(long j9) {
            return this.f1990i.g(j9);
        }

        @Override // E3.f
        public boolean j() {
            return this.f1990i.l();
        }

        @Override // E3.f
        public long k() {
            return this.f1990i.e();
        }

        @Override // E3.f
        public long l(long j9, long j10) {
            return this.f1990i.c(j9, j10);
        }

        @Override // F3.j
        public i m() {
            return null;
        }
    }

    public static class c extends j {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Uri f1991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f1992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final String f1993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final i f1994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final m f1995m;

        public c(long j9, C0936z0 c0936z0, List list, k.e eVar, List list2, List list3, List list4, String str, long j10) {
            super(j9, c0936z0, list, eVar, list2, list3, list4);
            this.f1991i = Uri.parse(((F3.b) list.get(0)).f1929a);
            i iVarC = eVar.c();
            this.f1994l = iVarC;
            this.f1993k = str;
            this.f1992j = j10;
            this.f1995m = iVarC != null ? null : new m(new i(null, 0L, j10));
        }

        @Override // F3.j
        public String a() {
            return this.f1993k;
        }

        @Override // F3.j
        public E3.f b() {
            return this.f1995m;
        }

        @Override // F3.j
        public i m() {
            return this.f1994l;
        }
    }

    public j(long j9, C0936z0 c0936z0, List list, k kVar, List list2, List list3, List list4) {
        AbstractC1684a.a(!list.isEmpty());
        this.f1982a = j9;
        this.f1983b = c0936z0;
        this.f1984c = AbstractC2743y.r(list);
        this.f1986e = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f1987f = list3;
        this.f1988g = list4;
        this.f1989h = kVar.a(this);
        this.f1985d = kVar.b();
    }

    public static j o(long j9, C0936z0 c0936z0, List list, k kVar, List list2, List list3, List list4, String str) {
        if (kVar instanceof k.e) {
            return new c(j9, c0936z0, list, (k.e) kVar, list2, list3, list4, str, -1L);
        }
        if (kVar instanceof k.a) {
            return new b(j9, c0936z0, list, (k.a) kVar, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    public abstract String a();

    public abstract E3.f b();

    public abstract i m();

    public i n() {
        return this.f1989h;
    }
}
