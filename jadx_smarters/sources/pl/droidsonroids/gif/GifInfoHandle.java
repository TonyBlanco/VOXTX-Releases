package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class GifInfoHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f46702a;

    static {
        g.b();
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.f46702a = n(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public GifInfoHandle(String str) {
        this.f46702a = openFile(str);
    }

    public static native int createTempNativeFileDescriptor() throws GifIOException;

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z9) throws GifIOException;

    private static native void free(long j9);

    private static native int getCurrentFrameIndex(long j9);

    private static native int getCurrentLoop(long j9);

    private static native int getCurrentPosition(long j9);

    private static native int getDuration(long j9);

    private static native int getHeight(long j9);

    private static native int getLoopCount(long j9);

    private static native int getNativeErrorCode(long j9);

    private static native int getNumberOfFrames(long j9);

    private static native long[] getSavedState(long j9);

    private static native int getWidth(long j9);

    public static int h(FileDescriptor fileDescriptor, boolean z9) throws ErrnoException {
        try {
            int iCreateTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, iCreateTempNativeFileDescriptor);
            return iCreateTempNativeFileDescriptor;
        } finally {
            if (z9) {
                Os.close(fileDescriptor);
            }
        }
    }

    private static native boolean isOpaque(long j9);

    public static long n(FileDescriptor fileDescriptor, long j9, boolean z9) throws GifIOException {
        int iH;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                iH = h(fileDescriptor, z9);
            } catch (Exception e9) {
                throw new GifIOException(b.OPEN_FAILED.errorCode, e9.getMessage());
            }
        } else {
            iH = extractNativeFileDescriptor(fileDescriptor, z9);
        }
        return openNativeFileDescriptor(iH, j9);
    }

    public static GifInfoHandle o(ContentResolver contentResolver, Uri uri) throws IOException {
        if (TransferTable.COLUMN_FILE.equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return new GifInfoHandle(assetFileDescriptorOpenAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    public static native long openFile(String str) throws GifIOException;

    public static native long openNativeFileDescriptor(int i9, long j9) throws GifIOException;

    private static native long renderFrame(long j9, Bitmap bitmap);

    private static native boolean reset(long j9);

    private static native long restoreRemainder(long j9);

    private static native int restoreSavedState(long j9, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j9);

    private static native void seekToTime(long j9, int i9, Bitmap bitmap);

    private static native void setLoopCount(long j9, char c9);

    public synchronized int a() {
        return getCurrentFrameIndex(this.f46702a);
    }

    public synchronized int b() {
        return getCurrentLoop(this.f46702a);
    }

    public synchronized int c() {
        return getCurrentPosition(this.f46702a);
    }

    public synchronized int d() {
        return getDuration(this.f46702a);
    }

    public synchronized int e() {
        return getHeight(this.f46702a);
    }

    public synchronized int f() {
        return getLoopCount(this.f46702a);
    }

    public void finalize() throws Throwable {
        try {
            p();
        } finally {
            super.finalize();
        }
    }

    public synchronized int g() {
        return getNativeErrorCode(this.f46702a);
    }

    public synchronized int i() {
        return getNumberOfFrames(this.f46702a);
    }

    public synchronized long[] j() {
        return getSavedState(this.f46702a);
    }

    public synchronized int k() {
        return getWidth(this.f46702a);
    }

    public synchronized boolean l() {
        return isOpaque(this.f46702a);
    }

    public synchronized boolean m() {
        return this.f46702a == 0;
    }

    public synchronized void p() {
        free(this.f46702a);
        this.f46702a = 0L;
    }

    public synchronized long q(Bitmap bitmap) {
        return renderFrame(this.f46702a, bitmap);
    }

    public synchronized boolean r() {
        return reset(this.f46702a);
    }

    public synchronized long s() {
        return restoreRemainder(this.f46702a);
    }

    public synchronized int t(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f46702a, jArr, bitmap);
    }

    public synchronized void u() {
        saveRemainder(this.f46702a);
    }

    public synchronized void v(int i9, Bitmap bitmap) {
        seekToTime(this.f46702a, i9, bitmap);
    }

    public void w(int i9) {
        if (i9 < 0 || i9 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f46702a, (char) i9);
        }
    }
}
