package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1180j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AtomicReference f15932a = new AtomicReference();

    /* JADX INFO: renamed from: androidx.lifecycle.j$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f15934b;

        static {
            int[] iArr = new int[b.values().length];
            f15934b = iArr;
            try {
                iArr[b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15934b[b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15934b[b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15934b[b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15934b[b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15934b[b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15934b[b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f15933a = iArr2;
            try {
                iArr2[c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15933a[c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15933a[c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15933a[c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f15933a[c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.j$b */
    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static b downFrom(c cVar) {
            int i9 = a.f15933a[cVar.ordinal()];
            if (i9 == 1) {
                return ON_DESTROY;
            }
            if (i9 == 2) {
                return ON_STOP;
            }
            if (i9 != 3) {
                return null;
            }
            return ON_PAUSE;
        }

        public static b downTo(c cVar) {
            int i9 = a.f15933a[cVar.ordinal()];
            if (i9 == 1) {
                return ON_STOP;
            }
            if (i9 == 2) {
                return ON_PAUSE;
            }
            if (i9 != 4) {
                return null;
            }
            return ON_DESTROY;
        }

        public static b upFrom(c cVar) {
            int i9 = a.f15933a[cVar.ordinal()];
            if (i9 == 1) {
                return ON_START;
            }
            if (i9 == 2) {
                return ON_RESUME;
            }
            if (i9 != 5) {
                return null;
            }
            return ON_CREATE;
        }

        public static b upTo(c cVar) {
            int i9 = a.f15933a[cVar.ordinal()];
            if (i9 == 1) {
                return ON_CREATE;
            }
            if (i9 == 2) {
                return ON_START;
            }
            if (i9 != 3) {
                return null;
            }
            return ON_RESUME;
        }

        public c getTargetState() {
            switch (a.f15934b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.j$c */
    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(c cVar) {
            return compareTo(cVar) >= 0;
        }
    }

    public abstract void a(InterfaceC1185o interfaceC1185o);

    public abstract c b();

    public abstract void c(InterfaceC1185o interfaceC1185o);
}
