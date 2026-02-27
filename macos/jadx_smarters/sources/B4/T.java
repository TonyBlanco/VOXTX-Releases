package b4;

import android.net.Uri;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class T extends AbstractC1216g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f17553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f17554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DatagramPacket f17555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f17556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatagramSocket f17557i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MulticastSocket f17558j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InetAddress f17559k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f17560l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17561m;

    public static final class a extends C1225p {
        public a(Throwable th, int i9) {
            super(th, i9);
        }
    }

    public T() {
        this(AdError.SERVER_ERROR_CODE);
    }

    public T(int i9) {
        this(i9, 8000);
    }

    public T(int i9, int i10) {
        super(true);
        this.f17553e = i10;
        byte[] bArr = new byte[i9];
        this.f17554f = bArr;
        this.f17555g = new DatagramPacket(bArr, 0, i9);
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) throws a {
        Uri uri = c1227s.f17598a;
        this.f17556h = uri;
        String str = (String) AbstractC1684a.e(uri.getHost());
        int port = this.f17556h.getPort();
        v(c1227s);
        try {
            this.f17559k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f17559k, port);
            if (this.f17559k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f17558j = multicastSocket;
                multicastSocket.joinGroup(this.f17559k);
                this.f17557i = this.f17558j;
            } else {
                this.f17557i = new DatagramSocket(inetSocketAddress);
            }
            this.f17557i.setSoTimeout(this.f17553e);
            this.f17560l = true;
            w(c1227s);
            return -1L;
        } catch (IOException e9) {
            throw new a(e9, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e10) {
            throw new a(e10, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        this.f17556h = null;
        MulticastSocket multicastSocket = this.f17558j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC1684a.e(this.f17559k));
            } catch (IOException unused) {
            }
            this.f17558j = null;
        }
        DatagramSocket datagramSocket = this.f17557i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f17557i = null;
        }
        this.f17559k = null;
        this.f17561m = 0;
        if (this.f17560l) {
            this.f17560l = false;
            u();
        }
    }

    public int getLocalPort() {
        DatagramSocket datagramSocket = this.f17557i;
        if (datagramSocket == null) {
            return -1;
        }
        return datagramSocket.getLocalPort();
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17556h;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws a {
        if (i10 == 0) {
            return 0;
        }
        if (this.f17561m == 0) {
            try {
                ((DatagramSocket) AbstractC1684a.e(this.f17557i)).receive(this.f17555g);
                int length = this.f17555g.getLength();
                this.f17561m = length;
                t(length);
            } catch (SocketTimeoutException e9) {
                throw new a(e9, AdError.CACHE_ERROR_CODE);
            } catch (IOException e10) {
                throw new a(e10, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f17555g.getLength();
        int i11 = this.f17561m;
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.f17554f, length2 - i11, bArr, i9, iMin);
        this.f17561m -= iMin;
        return iMin;
    }
}
