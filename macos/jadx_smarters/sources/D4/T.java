package d4;

import android.os.SystemClock;
import b4.G;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f39725a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f39726b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f39727c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f39728d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f39729e = "time.android.com";

    public interface b {
        void a(IOException iOException);

        void b();
    }

    public static final class c implements G.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f39730a;

        public c(b bVar) {
            this.f39730a = bVar;
        }

        @Override // b4.G.b
        public void W(G.e eVar, long j9, long j10) {
            if (this.f39730a != null) {
                if (T.k()) {
                    this.f39730a.b();
                } else {
                    this.f39730a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // b4.G.b
        public G.c j(G.e eVar, long j9, long j10, IOException iOException, int i9) {
            b bVar = this.f39730a;
            if (bVar != null) {
                bVar.a(iOException);
            }
            return b4.G.f17500f;
        }

        @Override // b4.G.b
        public void t(G.e eVar, long j9, long j10, boolean z9) {
        }
    }

    public static final class d implements G.e {
        public d() {
        }

        @Override // b4.G.e
        public void a() {
            synchronized (T.f39725a) {
                synchronized (T.f39726b) {
                    if (T.f39727c) {
                        return;
                    }
                    long jL = T.l();
                    synchronized (T.f39726b) {
                        long unused = T.f39728d = jL;
                        boolean unused2 = T.f39727c = true;
                    }
                }
            }
        }

        @Override // b4.G.e
        public void c() {
        }
    }

    public static void g(byte b9, byte b10, int i9, long j9) throws IOException {
        if (b9 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b10 != 4 && b10 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b10));
        }
        if (i9 != 0 && i9 <= 15) {
            if (j9 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i9);
        }
    }

    public static long h() {
        long j9;
        synchronized (f39726b) {
            try {
                j9 = f39727c ? f39728d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j9;
    }

    public static String i() {
        String str;
        synchronized (f39726b) {
            str = f39729e;
        }
        return str;
    }

    public static void j(b4.G g9, b bVar) {
        if (k()) {
            if (bVar != null) {
                bVar.b();
            }
        } else {
            if (g9 == null) {
                g9 = new b4.G("SntpClient");
            }
            g9.n(new d(), new c(bVar), 1);
        }
    }

    public static boolean k() {
        boolean z9;
        synchronized (f39726b) {
            z9 = f39727c;
        }
        return z9;
    }

    public static long l() throws UnknownHostException {
        InetAddress byName = InetAddress.getByName(i());
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            o(bArr, 40, jCurrentTimeMillis);
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j9 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b9 = bArr[0];
            int i9 = bArr[1] & 255;
            long jN = n(bArr, 24);
            long jN2 = n(bArr, 32);
            long jN3 = n(bArr, 40);
            g((byte) ((b9 >> 6) & 3), (byte) (b9 & 7), i9, jN3);
            long j10 = (j9 + (((jN2 - jN) + (jN3 - j9)) / 2)) - jElapsedRealtime2;
            datagramSocket.close();
            return j10;
        } catch (Throwable th) {
            try {
                datagramSocket.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long m(byte[] bArr, int i9) {
        int i10 = bArr[i9];
        int i11 = bArr[i9 + 1];
        int i12 = bArr[i9 + 2];
        int i13 = bArr[i9 + 3];
        if ((i10 & 128) == 128) {
            i10 = (i10 & 127) + 128;
        }
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        return (((long) i10) << 24) + (((long) i11) << 16) + (((long) i12) << 8) + ((long) i13);
    }

    public static long n(byte[] bArr, int i9) {
        long jM = m(bArr, i9);
        long jM2 = m(bArr, i9 + 4);
        if (jM == 0 && jM2 == 0) {
            return 0L;
        }
        return ((jM - 2208988800L) * 1000) + ((jM2 * 1000) / IjkMediaMeta.AV_CH_WIDE_RIGHT);
    }

    public static void o(byte[] bArr, int i9, long j9) {
        if (j9 == 0) {
            Arrays.fill(bArr, i9, i9 + 8, (byte) 0);
            return;
        }
        long j10 = j9 / 1000;
        long j11 = j9 - (j10 * 1000);
        bArr[i9] = (byte) (r2 >> 24);
        bArr[i9 + 1] = (byte) (r2 >> 16);
        bArr[i9 + 2] = (byte) (r2 >> 8);
        bArr[i9 + 3] = (byte) (j10 + 2208988800L);
        long j12 = (j11 * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
        bArr[i9 + 4] = (byte) (j12 >> 24);
        bArr[i9 + 5] = (byte) (j12 >> 16);
        bArr[i9 + 6] = (byte) (j12 >> 8);
        bArr[i9 + 7] = (byte) (Math.random() * 255.0d);
    }
}
