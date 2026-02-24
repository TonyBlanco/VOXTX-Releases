package j$.util.concurrent;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes2.dex */
final class w implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
