package j$.util.stream;

import j$.util.C1924h;
import j$.util.C1926j;
import j$.util.C1927k;
import j$.util.C1928l;
import j$.util.C1929m;
import j$.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2024s implements Supplier, Predicate, IntFunction, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42743a;

    public /* synthetic */ C2024s(int i9) {
        this.f42743a = i9;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i9) {
        switch (this.f42743a) {
            case 10:
                ((C1924h) obj).accept(i9);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i9);
                break;
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j9) {
        switch (this.f42743a) {
            case LangUtils.HASH_SEED /* 17 */:
                ((C1926j) obj).accept(j9);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j9;
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.f42743a) {
            case 11:
                ((C1924h) obj).b((C1924h) obj2);
                break;
            case 16:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            case 20:
                ((C1926j) obj).b((C1926j) obj2);
                break;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                break;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f42743a) {
        }
        return j$.com.android.tools.r8.a.a(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.f42743a) {
            case 11:
                break;
            case 16:
                break;
            case 20:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i9) {
        switch (this.f42743a) {
            case 5:
                return new Object[i9];
            case 6:
                return new Integer[i9];
            case 8:
                return Integer.valueOf(i9);
            case 21:
                return new Long[i9];
            default:
                return new Object[i9];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j9) {
        return Long.valueOf(j9);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i9, int i10) {
        switch (this.f42743a) {
            case 9:
                return Math.min(i9, i10);
            case 12:
                return i9 + i10;
            default:
                return Math.max(i9, i10);
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j9, long j10) {
        switch (this.f42743a) {
            case 18:
                return Math.min(j9, j10);
            case 26:
                return Math.max(j9, j10);
            default:
                return j9 + j10;
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f42743a) {
            case 0:
                return new double[3];
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new long[2];
            default:
                return new long[2];
        }
    }

    public Predicate negate() {
        switch (this.f42743a) {
        }
        return new j$.util.function.a(this, 2);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f42743a) {
        }
        return j$.com.android.tools.r8.a.h(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.f42743a) {
            case 1:
                return ((C1927k) obj).c();
            case 2:
                return ((C1928l) obj).c();
            case 3:
                return ((C1929m) obj).c();
            default:
                return ((Optional) obj).c();
        }
    }
}
