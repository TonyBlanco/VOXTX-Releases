package kotlinx.coroutines.sync;

import kotlinx.coroutines.internal.y;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f43846a = new y("LOCK_FAIL");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f43847b = new y("UNLOCK_FAIL");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f43848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f43849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f43850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43851f;

    static {
        y yVar = new y("LOCKED");
        f43848c = yVar;
        y yVar2 = new y("UNLOCKED");
        f43849d = yVar2;
        f43850e = new a(yVar);
        f43851f = new a(yVar2);
    }

    public static final b a(boolean z9) {
        return new c(z9);
    }

    public static /* synthetic */ b b(boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        return a(z9);
    }
}
