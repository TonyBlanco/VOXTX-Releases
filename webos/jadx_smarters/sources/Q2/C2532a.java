package q2;

import android.util.Log;
import java.util.Queue;

/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2532a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2532a f46799b = new C2532a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Queue f46800a = AbstractC2539h.c(0);

    public static C2532a a() {
        return f46799b;
    }

    public byte[] b() {
        byte[] bArr;
        synchronized (this.f46800a) {
            bArr = (byte[]) this.f46800a.poll();
        }
        if (bArr == null) {
            bArr = new byte[65536];
            if (Log.isLoggable("ByteArrayPool", 3)) {
                Log.d("ByteArrayPool", "Created temp bytes");
            }
        }
        return bArr;
    }

    public boolean c(byte[] bArr) {
        boolean z9 = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f46800a) {
            try {
                if (this.f46800a.size() < 32) {
                    this.f46800a.offer(bArr);
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9;
    }
}
