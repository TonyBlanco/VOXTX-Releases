package q0;

import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: q0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2518b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC2519c f46759a;

    public C2518b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        String strA = C2524h.a(remoteUserInfo);
        if (strA == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f46759a = new C2524h(remoteUserInfo);
    }

    public C2518b(String str, int i9, int i10) {
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        this.f46759a = Build.VERSION.SDK_INT >= 28 ? new C2524h(str, i9, i10) : new C2525i(str, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2518b) {
            return this.f46759a.equals(((C2518b) obj).f46759a);
        }
        return false;
    }

    public int hashCode() {
        return this.f46759a.hashCode();
    }
}
