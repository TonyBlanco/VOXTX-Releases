package j$.util;

import java.security.AccessController;

/* JADX INFO: loaded from: classes2.dex */
abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f42351a = ((Boolean) AccessController.doPrivileged(new d0())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
