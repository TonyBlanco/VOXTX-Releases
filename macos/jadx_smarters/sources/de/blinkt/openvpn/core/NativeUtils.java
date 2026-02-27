package de.blinkt.openvpn.core;

import android.os.Build;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import okhttp3.internal.http2.Http2;
import okio.Segment;

/* JADX INFO: loaded from: classes4.dex */
public abstract class NativeUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f39986a = {16, 64, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 1024, Segment.SIZE, Http2.INITIAL_MAX_FRAME_SIZE};

    static {
        if (b()) {
            return;
        }
        System.loadLibrary("ovpnutil");
        System.loadLibrary("osslspeedtest");
    }

    public static String a() {
        return b() ? "ROBO" : getJNIAPI();
    }

    public static boolean b() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    private static native String getJNIAPI();
}
