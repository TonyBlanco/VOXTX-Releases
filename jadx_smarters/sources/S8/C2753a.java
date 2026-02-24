package s8;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.l;
import r8.C2692a;

/* JADX INFO: renamed from: s8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2753a extends C2692a {

    /* JADX INFO: renamed from: s8.a$a, reason: collision with other inner class name */
    public static final class C0451a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0451a f50444a = new C0451a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f50445b;

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
            f50445b = num;
        }
    }

    private final boolean c(int i9) {
        Integer num = C0451a.f50445b;
        return num == null || num.intValue() >= i9;
    }

    @Override // r8.C2692a
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        l.e(cause, "cause");
        l.e(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
