package j$.util;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d0 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
