package p3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.ads.interactivemedia.v3.internal.B1;
import com.google.ads.interactivemedia.v3.internal.S;
import com.google.ads.interactivemedia.v3.internal.z1;
import d4.AbstractC1684a;
import d4.C1691h;
import d4.k0;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: p3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2400f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ArrayDeque f46249g = new ArrayDeque();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f46250h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f46251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HandlerThread f46252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f46253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f46254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1691h f46255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46256f;

    /* JADX INFO: renamed from: p3.f$a */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C2400f.this.f(message);
        }
    }

    /* JADX INFO: renamed from: p3.f$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46260c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f46261d = new MediaCodec.CryptoInfo();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f46262e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46263f;

        public void a(int i9, int i10, int i11, long j9, int i12) {
            this.f46258a = i9;
            this.f46259b = i10;
            this.f46260c = i11;
            this.f46262e = j9;
            this.f46263f = i12;
        }
    }

    public C2400f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C1691h());
    }

    public C2400f(MediaCodec mediaCodec, HandlerThread handlerThread, C1691h c1691h) {
        this.f46251a = mediaCodec;
        this.f46252b = handlerThread;
        this.f46255e = c1691h;
        this.f46254d = new AtomicReference();
    }

    public static void c(U2.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f9678f;
        cryptoInfo.numBytesOfClearData = e(cVar.f9676d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(cVar.f9677e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) AbstractC1684a.e(d(cVar.f9674b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) AbstractC1684a.e(d(cVar.f9673a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f9675c;
        if (k0.f39777a >= 24) {
            B1.a();
            cryptoInfo.setPattern(S.a(cVar.f9679g, cVar.f9680h));
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b k() {
        ArrayDeque arrayDeque = f46249g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o(b bVar) {
        ArrayDeque arrayDeque = f46249g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public final void b() {
        this.f46255e.d();
        ((Handler) AbstractC1684a.e(this.f46253c)).obtainMessage(2).sendToTarget();
        this.f46255e.a();
    }

    public final void f(Message message) {
        b bVar;
        int i9 = message.what;
        if (i9 == 0) {
            bVar = (b) message.obj;
            g(bVar.f46258a, bVar.f46259b, bVar.f46260c, bVar.f46262e, bVar.f46263f);
        } else if (i9 != 1) {
            bVar = null;
            if (i9 != 2) {
                z1.a(this.f46254d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f46255e.f();
            }
        } else {
            bVar = (b) message.obj;
            h(bVar.f46258a, bVar.f46259b, bVar.f46261d, bVar.f46262e, bVar.f46263f);
        }
        if (bVar != null) {
            o(bVar);
        }
    }

    public final void g(int i9, int i10, int i11, long j9, int i12) {
        try {
            this.f46251a.queueInputBuffer(i9, i10, i11, j9, i12);
        } catch (RuntimeException e9) {
            z1.a(this.f46254d, null, e9);
        }
    }

    public final void h(int i9, int i10, MediaCodec.CryptoInfo cryptoInfo, long j9, int i11) {
        try {
            synchronized (f46250h) {
                this.f46251a.queueSecureInputBuffer(i9, i10, cryptoInfo, j9, i11);
            }
        } catch (RuntimeException e9) {
            z1.a(this.f46254d, null, e9);
        }
    }

    public void i() {
        if (this.f46256f) {
            try {
                j();
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e9);
            }
        }
    }

    public final void j() {
        ((Handler) AbstractC1684a.e(this.f46253c)).removeCallbacksAndMessages(null);
        b();
    }

    public void l() {
        RuntimeException runtimeException = (RuntimeException) this.f46254d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public void m(int i9, int i10, int i11, long j9, int i12) {
        l();
        b bVarK = k();
        bVarK.a(i9, i10, i11, j9, i12);
        ((Handler) k0.j(this.f46253c)).obtainMessage(0, bVarK).sendToTarget();
    }

    public void n(int i9, int i10, U2.c cVar, long j9, int i11) {
        l();
        b bVarK = k();
        bVarK.a(i9, i10, 0, j9, i11);
        c(cVar, bVarK.f46261d);
        ((Handler) k0.j(this.f46253c)).obtainMessage(1, bVarK).sendToTarget();
    }

    public void p() {
        if (this.f46256f) {
            i();
            this.f46252b.quit();
        }
        this.f46256f = false;
    }

    public void q() {
        if (this.f46256f) {
            return;
        }
        this.f46252b.start();
        this.f46253c = new a(this.f46252b.getLooper());
        this.f46256f = true;
    }

    public void r() {
        b();
    }
}
