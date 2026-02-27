package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class dy extends ct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f22751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DatagramPacket f22752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f22753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DatagramSocket f22754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MulticastSocket f22755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InetAddress f22756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f22757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f22758h;

    public dy() {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.f22751a = bArr;
        this.f22752b = new DatagramPacket(bArr, 0, AdError.SERVER_ERROR_CODE);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws dx {
        if (i10 == 0) {
            return 0;
        }
        if (this.f22758h == 0) {
            try {
                DatagramSocket datagramSocket = this.f22754d;
                af.s(datagramSocket);
                datagramSocket.receive(this.f22752b);
                int length = this.f22752b.getLength();
                this.f22758h = length;
                g(length);
            } catch (SocketTimeoutException e9) {
                throw new dx(e9, AdError.CACHE_ERROR_CODE);
            } catch (IOException e10) {
                throw new dx(e10, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f22752b.getLength();
        int i11 = this.f22758h;
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.f22751a, length2 - i11, bArr, i9, iMin);
        this.f22758h -= iMin;
        return iMin;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final long b(dc dcVar) throws dx {
        Uri uri = dcVar.f22688a;
        this.f22753c = uri;
        String host = uri.getHost();
        af.s(host);
        int port = this.f22753c.getPort();
        i(dcVar);
        try {
            this.f22756f = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f22756f, port);
            if (this.f22756f.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f22755e = multicastSocket;
                multicastSocket.joinGroup(this.f22756f);
                this.f22754d = this.f22755e;
            } else {
                this.f22754d = new DatagramSocket(inetSocketAddress);
            }
            this.f22754d.setSoTimeout(8000);
            this.f22757g = true;
            j(dcVar);
            return -1L;
        } catch (IOException e9) {
            throw new dx(e9, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e10) {
            throw new dx(e10, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final Uri c() {
        return this.f22753c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.cy
    public final void d() {
        this.f22753c = null;
        MulticastSocket multicastSocket = this.f22755e;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f22756f;
                af.s(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f22755e = null;
        }
        DatagramSocket datagramSocket = this.f22754d;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f22754d = null;
        }
        this.f22756f = null;
        this.f22758h = 0;
        if (this.f22757g) {
            this.f22757g = false;
            h();
        }
    }
}
