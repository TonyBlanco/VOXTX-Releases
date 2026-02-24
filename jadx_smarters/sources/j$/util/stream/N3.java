package j$.util.stream;

import java.security.AccessController;

/* JADX INFO: loaded from: classes2.dex */
abstract class N3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f42490a = ((Boolean) AccessController.doPrivileged(new M3())).booleanValue();

    static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
