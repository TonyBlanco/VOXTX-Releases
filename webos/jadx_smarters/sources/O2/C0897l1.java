package O2;

import java.io.IOException;

/* JADX INFO: renamed from: O2.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0897l1 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6128a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6129c;

    public C0897l1(String str, Throwable th, boolean z9, int i9) {
        super(str, th);
        this.f6128a = z9;
        this.f6129c = i9;
    }

    public static C0897l1 a(String str, Throwable th) {
        return new C0897l1(str, th, true, 1);
    }

    public static C0897l1 b(String str, Throwable th) {
        return new C0897l1(str, th, true, 0);
    }

    public static C0897l1 c(String str, Throwable th) {
        return new C0897l1(str, th, true, 4);
    }

    public static C0897l1 d(String str, Throwable th) {
        return new C0897l1(str, th, false, 4);
    }

    public static C0897l1 e(String str) {
        return new C0897l1(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f6128a + ", dataType=" + this.f6129c + "}";
    }
}
