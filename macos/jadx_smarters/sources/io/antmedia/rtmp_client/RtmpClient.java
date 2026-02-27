package io.antmedia.rtmp_client;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class RtmpClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f41928a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41929b = Constants.MAXIMUM_UPLOAD_PARTS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41930c = Constants.MAXIMUM_UPLOAD_PARTS;

    public static class a extends IOException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41931a;

        public a(int i9) {
            super("RTMP error: " + i9);
            this.f41931a = i9;
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j9);

    private native int nativeOpen(String str, boolean z9, long j9, int i9, int i10);

    private native int nativeRead(byte[] bArr, int i9, int i10, long j9) throws IllegalStateException;

    public void a() {
        nativeClose(this.f41928a);
        this.f41928a = 0L;
    }

    public void b(String str, boolean z9) throws a {
        long jNativeAlloc = nativeAlloc();
        this.f41928a = jNativeAlloc;
        if (jNativeAlloc == 0) {
            throw new a(-2);
        }
        int iNativeOpen = nativeOpen(str, z9, jNativeAlloc, this.f41929b, this.f41930c);
        if (iNativeOpen == 0) {
            return;
        }
        this.f41928a = 0L;
        throw new a(iNativeOpen);
    }

    public int c(byte[] bArr, int i9, int i10) throws a {
        int iNativeRead = nativeRead(bArr, i9, i10, this.f41928a);
        if (iNativeRead >= 0 || iNativeRead == -1) {
            return iNativeRead;
        }
        throw new a(iNativeRead);
    }
}
