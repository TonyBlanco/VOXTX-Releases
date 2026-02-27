package B8;

import l8.y;
import r8.AbstractC2694c;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements Iterable, x8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f766e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f767a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f769d;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public d(long j9, long j10, long j11) {
        if (j11 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j11 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f767a = j9;
        this.f768c = AbstractC2694c.d(j9, j10, j11);
        this.f769d = j11;
    }

    public final long d() {
        return this.f767a;
    }

    public final long f() {
        return this.f768c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public y iterator() {
        return new e(this.f767a, this.f768c, this.f769d);
    }
}
