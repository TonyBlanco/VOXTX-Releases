package O2;

/* JADX INFO: renamed from: O2.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0931x0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6360a;

    public C0931x0(int i9) {
        super(a(i9));
        this.f6360a = i9;
    }

    public static String a(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.";
    }
}
