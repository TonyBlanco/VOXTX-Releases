package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class qw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ArrayDeque f24295a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f24296b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MediaCodec f24297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f24298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f24299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference f24300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final agp f24302h;

    public qw(MediaCodec mediaCodec, HandlerThread handlerThread) {
        agp agpVar = new agp();
        this.f24297c = mediaCodec;
        this.f24298d = handlerThread;
        this.f24302h = agpVar;
        this.f24300f = new AtomicReference();
    }

    public static /* bridge */ /* synthetic */ void a(qw qwVar, Message message) {
        qv qvVar;
        int i9 = message.what;
        try {
            if (i9 == 0) {
                qvVar = (qv) message.obj;
                qwVar.f24297c.queueInputBuffer(qvVar.f24289a, 0, qvVar.f24291c, qvVar.f24293e, qvVar.f24294f);
            } else if (i9 != 1) {
                qvVar = null;
                if (i9 != 2) {
                    pi.b(qwVar.f24300f, new IllegalStateException(String.valueOf(message.what)));
                } else {
                    qwVar.f24302h.f();
                }
            } else {
                qvVar = (qv) message.obj;
                int i10 = qvVar.f24289a;
                MediaCodec.CryptoInfo cryptoInfo = qvVar.f24292d;
                long j9 = qvVar.f24293e;
                int i11 = qvVar.f24294f;
                synchronized (f24296b) {
                    qwVar.f24297c.queueSecureInputBuffer(i10, 0, cryptoInfo, j9, i11);
                }
            }
        } catch (RuntimeException e9) {
            pi.b(qwVar.f24300f, e9);
        }
        if (qvVar != null) {
            ArrayDeque arrayDeque = f24295a;
            synchronized (arrayDeque) {
                arrayDeque.add(qvVar);
            }
        }
    }

    private static qv g() {
        ArrayDeque arrayDeque = f24295a;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new qv();
                }
                return (qv) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void h() {
        RuntimeException runtimeException = (RuntimeException) this.f24300f.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void b() {
        if (this.f24301g) {
            try {
                Handler handler = this.f24299e;
                af.s(handler);
                handler.removeCallbacksAndMessages(null);
                this.f24302h.g();
                Handler handler2 = this.f24299e;
                af.s(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.f24302h.c();
            } catch (InterruptedException e9) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e9);
            }
        }
    }

    public final void c() {
        if (this.f24301g) {
            b();
            this.f24298d.quit();
        }
        this.f24301g = false;
    }

    public final void d() {
        if (this.f24301g) {
            return;
        }
        this.f24298d.start();
        this.f24299e = new qu(this, this.f24298d.getLooper());
        this.f24301g = true;
    }

    public final void e(int i9, int i10, long j9, int i11) {
        h();
        qv qvVarG = g();
        qvVarG.a(i9, i10, j9, i11);
        Handler handler = this.f24299e;
        int i12 = cq.f22640a;
        handler.obtainMessage(0, qvVarG).sendToTarget();
    }

    public final void f(int i9, ec ecVar, long j9) {
        h();
        qv qvVarG = g();
        qvVarG.a(i9, 0, j9, 0);
        MediaCodec.CryptoInfo cryptoInfo = qvVarG.f24292d;
        cryptoInfo.numSubSamples = ecVar.f22768f;
        cryptoInfo.numBytesOfClearData = j(ecVar.f22766d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(ecVar.f22767e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) af.s(i(ecVar.f22764b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) af.s(i(ecVar.f22763a, cryptoInfo.iv));
        cryptoInfo.mode = ecVar.f22765c;
        if (cq.f22640a >= 24) {
            B1.a();
            cryptoInfo.setPattern(S.a(ecVar.f22769g, ecVar.f22770h));
        }
        this.f24299e.obtainMessage(1, qvVarG).sendToTarget();
    }
}
