package okio;

import E8.c;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-Platform, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class Platform {
    @NotNull
    public static final byte[] asUtf8ToByteArray(@NotNull String asUtf8ToByteArray) {
        l.e(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
        byte[] bytes = asUtf8ToByteArray.getBytes(c.f1714b);
        l.d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m162synchronized(@NotNull Object lock, @NotNull w8.a block) {
        R r9;
        l.e(lock, "lock");
        l.e(block, "block");
        synchronized (lock) {
            try {
                r9 = (R) block.invoke();
                k.b(1);
            } catch (Throwable th) {
                k.b(1);
                k.a(1);
                throw th;
            }
        }
        k.a(1);
        return r9;
    }

    @NotNull
    public static final String toUtf8String(@NotNull byte[] toUtf8String) {
        l.e(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, c.f1714b);
    }
}
