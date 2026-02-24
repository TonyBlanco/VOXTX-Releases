package s5;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: s5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2721b extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0444b f50045a = EnumC0444b.NOT_READY;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f50046c;

    /* JADX INFO: renamed from: s5.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f50047a;

        static {
            int[] iArr = new int[EnumC0444b.values().length];
            f50047a = iArr;
            try {
                iArr[EnumC0444b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50047a[EnumC0444b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: s5.b$b, reason: collision with other inner class name */
    public enum EnumC0444b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object b();

    public final Object c() {
        this.f50045a = EnumC0444b.DONE;
        return null;
    }

    public final boolean d() {
        this.f50045a = EnumC0444b.FAILED;
        this.f50046c = b();
        if (this.f50045a == EnumC0444b.DONE) {
            return false;
        }
        this.f50045a = EnumC0444b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        r5.m.p(this.f50045a != EnumC0444b.FAILED);
        int i9 = a.f50047a[this.f50045a.ordinal()];
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
        this.f50045a = EnumC0444b.NOT_READY;
        Object objA = O.a(this.f50046c);
        this.f50046c = null;
        return objA;
    }
}
