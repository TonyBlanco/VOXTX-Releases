package u8;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import k8.AbstractC2152a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC2152a.a(th, th2);
            }
        }
    }
}
