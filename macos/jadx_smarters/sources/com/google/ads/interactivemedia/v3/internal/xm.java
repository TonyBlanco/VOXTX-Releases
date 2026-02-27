package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class xm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f25064a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f25065b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f25066c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f25067d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f25068e = "time.android.com";

    public static /* bridge */ /* synthetic */ long a() throws UnknownHostException {
        String str;
        synchronized (f25065b) {
            str = f25068e;
        }
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(Constants.MAXIMUM_UPLOAD_PARTS);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jCurrentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
            } else {
                long j9 = jCurrentTimeMillis / 1000;
                Long.signum(j9);
                long j10 = jCurrentTimeMillis - (j9 * 1000);
                long j11 = j9 + 2208988800L;
                bArr[40] = (byte) (j11 >> 24);
                bArr[41] = (byte) (j11 >> 16);
                bArr[42] = (byte) (j11 >> 8);
                bArr[43] = (byte) j11;
                long j12 = (j10 * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
                bArr[44] = (byte) (j12 >> 24);
                bArr[45] = (byte) (j12 >> 16);
                bArr[46] = (byte) (j12 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            long j13 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
            byte b9 = bArr[0];
            int i9 = (b9 >> 6) & 3;
            int i10 = b9 & 7;
            int i11 = bArr[1] & 255;
            long jK = k(bArr, 24);
            long jK2 = k(bArr, 32);
            long jK3 = k(bArr, 40);
            if (i9 == 3) {
                throw new IOException("SNTP: Unsynchronized server");
            }
            if (i10 != 4 && i10 != 5) {
                throw new IOException("SNTP: Untrusted mode: " + i10);
            }
            if (i11 == 0 || i11 > 15) {
                throw new IOException("SNTP: Untrusted stratum: " + i11);
            }
            if (jK3 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
            long j14 = ((jK2 - jK) + (jK3 - j13)) / 2;
            datagramSocket.close();
            return (j13 + j14) - jElapsedRealtime2;
        } finally {
        }
    }

    public static long b() {
        long j9;
        synchronized (f25065b) {
            try {
                j9 = f25066c ? f25067d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j9;
    }

    public static void f(xc xcVar, xj xjVar) {
        if (h()) {
            xjVar.b();
            return;
        }
        if (xcVar == null) {
            xcVar = new xc("SntpClient");
        }
        xcVar.b(new xl(null), new xk(xjVar), 1);
    }

    public static boolean h() {
        boolean z9;
        synchronized (f25065b) {
            z9 = f25066c;
        }
        return z9;
    }

    private static long j(byte[] bArr, int i9) {
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

    private static long k(byte[] bArr, int i9) {
        long j9 = j(bArr, i9);
        long j10 = j(bArr, i9 + 4);
        if (j9 == 0) {
            if (j10 == 0) {
                return 0L;
            }
            j9 = 0;
        }
        return ((j9 - 2208988800L) * 1000) + ((j10 * 1000) / IjkMediaMeta.AV_CH_WIDE_RIGHT);
    }
}
