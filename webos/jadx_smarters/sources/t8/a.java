package t8;

import s8.C2753a;
import z8.c;

/* JADX INFO: loaded from: classes4.dex */
public class a extends C2753a {

    /* JADX INFO: renamed from: t8.a$a, reason: collision with other inner class name */
    public static final class C0458a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0458a f50873a = new C0458a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f50874b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f50874b = num;
        }
    }

    @Override // r8.C2692a
    public c b() {
        return c(24) ? new A8.a() : super.b();
    }

    public final boolean c(int i9) {
        Integer num = C0458a.f50874b;
        return num == null || num.intValue() >= i9;
    }
}
