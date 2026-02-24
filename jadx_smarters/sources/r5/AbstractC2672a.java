package r5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: r5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2672a implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f49716a = b.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f49717c;

    /* JADX INFO: renamed from: r5.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0432a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49718a;

        static {
            int[] iArr = new int[b.values().length];
            f49718a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49718a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: r5.a$b */
    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object b();

    public final Object c() {
        this.f49716a = b.DONE;
        return null;
    }

    public final boolean d() {
        this.f49716a = b.FAILED;
        this.f49717c = b();
        if (this.f49716a == b.DONE) {
            return false;
        }
        this.f49716a = b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m.p(this.f49716a != b.FAILED);
        int i9 = C0432a.f49718a[this.f49716a.ordinal()];
        if (i9 == 1) {
            return false;
        }
        if (i9 != 2) {
            return d();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f49716a = b.NOT_READY;
        Object objA = i.a(this.f49717c);
        this.f49717c = null;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
