package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import android.os.HandlerThread;
import b4.G;
import d4.AbstractC1684a;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r5.AbstractC2675d;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Charset f25703h = AbstractC2675d.f49724c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f25704a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G f25705c = new G("ExoPlayer:RtspMessageChannel:ReceiverLoader");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f25706d = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0246g f25707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f25708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f25709g;

    public interface b {
        void j(byte[] bArr);
    }

    public final class c implements G.b {
        public c() {
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(f fVar, long j9, long j10, boolean z9) {
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void W(f fVar, long j9, long j10) {
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public G.c j(f fVar, long j9, long j10, IOException iOException, int i9) {
            if (!g.this.f25709g) {
                g.this.f25704a.a(iOException);
            }
            return G.f17500f;
        }
    }

    public interface d {
        void a(Exception exc);

        void b(List list, Exception exc);

        void c(List list);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f25711a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f25712b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f25713c;

        public static byte[] d(byte b9, DataInputStream dataInputStream) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = {b9, dataInputStream.readByte()};
            byteArrayOutputStream.write(bArr);
            while (true) {
                if (bArr[0] == 13 && bArr[1] == 10) {
                    return byteArrayOutputStream.toByteArray();
                }
                bArr[0] = bArr[1];
                byte b10 = dataInputStream.readByte();
                bArr[1] = b10;
                byteArrayOutputStream.write(b10);
            }
        }

        public final AbstractC2743y a(byte[] bArr) {
            AbstractC1684a.g(this.f25712b == 3);
            if (bArr.length <= 0 || bArr[bArr.length - 1] != 10) {
                throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
            }
            this.f25711a.add((bArr.length <= 1 || bArr[bArr.length + (-2)] != 13) ? new String(bArr, 0, bArr.length - 1, g.f25703h) : new String(bArr, 0, bArr.length - 2, g.f25703h));
            AbstractC2743y abstractC2743yR = AbstractC2743y.r(this.f25711a);
            e();
            return abstractC2743yR;
        }

        public final AbstractC2743y b(byte[] bArr) {
            AbstractC1684a.a(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
            String str = new String(bArr, 0, bArr.length - 2, g.f25703h);
            this.f25711a.add(str);
            int i9 = this.f25712b;
            if (i9 == 1) {
                if (!h.f(str)) {
                    return null;
                }
                this.f25712b = 2;
                return null;
            }
            if (i9 != 2) {
                throw new IllegalStateException();
            }
            long jG = h.g(str);
            if (jG != -1) {
                this.f25713c = jG;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.f25713c > 0) {
                this.f25712b = 3;
                return null;
            }
            AbstractC2743y abstractC2743yR = AbstractC2743y.r(this.f25711a);
            e();
            return abstractC2743yR;
        }

        public AbstractC2743y c(byte b9, DataInputStream dataInputStream) throws IOException {
            AbstractC2743y abstractC2743yB = b(d(b9, dataInputStream));
            while (abstractC2743yB == null) {
                if (this.f25712b == 3) {
                    long j9 = this.f25713c;
                    if (j9 <= 0) {
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    int iD = w5.f.d(j9);
                    AbstractC1684a.g(iD != -1);
                    byte[] bArr = new byte[iD];
                    dataInputStream.readFully(bArr, 0, iD);
                    abstractC2743yB = a(bArr);
                } else {
                    abstractC2743yB = b(d(dataInputStream.readByte(), dataInputStream));
                }
            }
            return abstractC2743yB;
        }

        public final void e() {
            this.f25711a.clear();
            this.f25712b = 1;
            this.f25713c = 0L;
        }
    }

    public final class f implements G.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DataInputStream f25714a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e f25715c = new e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f25716d;

        public f(InputStream inputStream) {
            this.f25714a = new DataInputStream(inputStream);
        }

        @Override // b4.G.e
        public void a() throws IOException {
            while (!this.f25716d) {
                byte b9 = this.f25714a.readByte();
                if (b9 == 36) {
                    b();
                } else {
                    d(b9);
                }
            }
        }

        public final void b() throws IOException {
            int unsignedByte = this.f25714a.readUnsignedByte();
            int unsignedShort = this.f25714a.readUnsignedShort();
            byte[] bArr = new byte[unsignedShort];
            this.f25714a.readFully(bArr, 0, unsignedShort);
            b bVar = (b) g.this.f25706d.get(Integer.valueOf(unsignedByte));
            if (bVar == null || g.this.f25709g) {
                return;
            }
            bVar.j(bArr);
        }

        @Override // b4.G.e
        public void c() {
            this.f25716d = true;
        }

        public final void d(byte b9) {
            if (g.this.f25709g) {
                return;
            }
            g.this.f25704a.c(this.f25715c.c(b9, this.f25714a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.g$g, reason: collision with other inner class name */
    public final class C0246g implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OutputStream f25718a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final HandlerThread f25719c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f25720d;

        public C0246g(OutputStream outputStream) {
            this.f25718a = outputStream;
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
            this.f25719c = handlerThread;
            handlerThread.start();
            this.f25720d = new Handler(handlerThread.getLooper());
        }

        public final /* synthetic */ void c(byte[] bArr, List list) {
            try {
                this.f25718a.write(bArr);
            } catch (Exception e9) {
                if (g.this.f25709g) {
                    return;
                }
                g.this.f25704a.b(list, e9);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Handler handler = this.f25720d;
            final HandlerThread handlerThread = this.f25719c;
            Objects.requireNonNull(handlerThread);
            handler.post(new Runnable() { // from class: K3.r
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quit();
                }
            });
            try {
                this.f25719c.join();
            } catch (InterruptedException unused) {
                this.f25719c.interrupt();
            }
        }

        public void d(final List list) {
            final byte[] bArrB = h.b(list);
            this.f25720d.post(new Runnable() { // from class: K3.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3755a.c(bArrB, list);
                }
            });
        }
    }

    public g(d dVar) {
        this.f25704a = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f25709g) {
            return;
        }
        try {
            C0246g c0246g = this.f25707e;
            if (c0246g != null) {
                c0246g.close();
            }
            this.f25705c.l();
            Socket socket = this.f25708f;
            if (socket != null) {
                socket.close();
            }
            this.f25709g = true;
        } catch (Throwable th) {
            this.f25709g = true;
            throw th;
        }
    }

    public void e(Socket socket) {
        this.f25708f = socket;
        this.f25707e = new C0246g(socket.getOutputStream());
        this.f25705c.n(new f(socket.getInputStream()), new c(), 0);
    }

    public void g(int i9, b bVar) {
        this.f25706d.put(Integer.valueOf(i9), bVar);
    }

    public void h(List list) {
        AbstractC1684a.i(this.f25707e);
        this.f25707e.d(list);
    }
}
