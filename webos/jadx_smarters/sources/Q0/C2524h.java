package q0;

import android.media.session.MediaSessionManager;

/* JADX INFO: renamed from: q0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2524h extends C2525i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaSessionManager.RemoteUserInfo f46760d;

    public C2524h(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
        this.f46760d = remoteUserInfo;
    }

    public C2524h(String str, int i9, int i10) {
        super(str, i9, i10);
        this.f46760d = AbstractC2520d.a(str, i9, i10);
    }

    public static String a(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        return remoteUserInfo.getPackageName();
    }
}
