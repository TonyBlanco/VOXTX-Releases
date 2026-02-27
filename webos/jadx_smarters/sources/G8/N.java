package G8;

import o8.AbstractC2374f;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public enum N {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2298a;

        static {
            int[] iArr = new int[N.values().length];
            iArr[N.DEFAULT.ordinal()] = 1;
            iArr[N.ATOMIC.ordinal()] = 2;
            iArr[N.UNDISPATCHED.ordinal()] = 3;
            iArr[N.LAZY.ordinal()] = 4;
            f2298a = iArr;
        }
    }

    public static /* synthetic */ void isLazy$annotations() {
    }

    public final <T> void invoke(@NotNull w8.l lVar, @NotNull InterfaceC2372d interfaceC2372d) throws Throwable {
        int i9 = a.f2298a[ordinal()];
        if (i9 == 1) {
            K8.a.c(lVar, interfaceC2372d);
            return;
        }
        if (i9 == 2) {
            AbstractC2374f.a(lVar, interfaceC2372d);
        } else if (i9 == 3) {
            K8.b.a(lVar, interfaceC2372d);
        } else if (i9 != 4) {
            throw new k8.h();
        }
    }

    public final <R, T> void invoke(@NotNull w8.p pVar, R r9, @NotNull InterfaceC2372d interfaceC2372d) throws Throwable {
        int i9 = a.f2298a[ordinal()];
        if (i9 == 1) {
            K8.a.e(pVar, r9, interfaceC2372d, null, 4, null);
            return;
        }
        if (i9 == 2) {
            AbstractC2374f.b(pVar, r9, interfaceC2372d);
        } else if (i9 == 3) {
            K8.b.b(pVar, r9, interfaceC2372d);
        } else if (i9 != 4) {
            throw new k8.h();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
