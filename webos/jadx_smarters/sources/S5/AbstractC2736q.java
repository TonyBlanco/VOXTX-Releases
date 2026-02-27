package s5;

import java.util.Comparator;
import w5.AbstractC2929a;

/* JADX INFO: renamed from: s5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2736q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC2736q f50116a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC2736q f50117b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC2736q f50118c = new b(1);

    /* JADX INFO: renamed from: s5.q$a */
    public class a extends AbstractC2736q {
        public a() {
            super(null);
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q d(int i9, int i10) {
            return k(w5.f.e(i9, i10));
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q e(long j9, long j10) {
            return k(w5.h.a(j9, j10));
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q g(boolean z9, boolean z10) {
            return k(AbstractC2929a.a(z9, z10));
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q h(boolean z9, boolean z10) {
            return k(AbstractC2929a.a(z10, z9));
        }

        @Override // s5.AbstractC2736q
        public int i() {
            return 0;
        }

        public AbstractC2736q k(int i9) {
            return i9 < 0 ? AbstractC2736q.f50117b : i9 > 0 ? AbstractC2736q.f50118c : AbstractC2736q.f50116a;
        }
    }

    /* JADX INFO: renamed from: s5.q$b */
    public static final class b extends AbstractC2736q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f50119d;

        public b(int i9) {
            super(null);
            this.f50119d = i9;
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q d(int i9, int i10) {
            return this;
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q e(long j9, long j10) {
            return this;
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q g(boolean z9, boolean z10) {
            return this;
        }

        @Override // s5.AbstractC2736q
        public AbstractC2736q h(boolean z9, boolean z10) {
            return this;
        }

        @Override // s5.AbstractC2736q
        public int i() {
            return this.f50119d;
        }
    }

    public AbstractC2736q() {
    }

    public /* synthetic */ AbstractC2736q(a aVar) {
        this();
    }

    public static AbstractC2736q j() {
        return f50116a;
    }

    public abstract AbstractC2736q d(int i9, int i10);

    public abstract AbstractC2736q e(long j9, long j10);

    public abstract AbstractC2736q f(Object obj, Object obj2, Comparator comparator);

    public abstract AbstractC2736q g(boolean z9, boolean z10);

    public abstract AbstractC2736q h(boolean z9, boolean z10);

    public abstract int i();
}
