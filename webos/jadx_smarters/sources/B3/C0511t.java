package B3;

import android.net.Uri;
import b4.C1227s;
import b4.InterfaceC1224o;
import d4.AbstractC1684a;
import java.util.Map;

/* JADX INFO: renamed from: B3.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0511t implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1224o f627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f631e;

    /* JADX INFO: renamed from: B3.t$a */
    public interface a {
        void b(d4.M m9);
    }

    public C0511t(InterfaceC1224o interfaceC1224o, int i9, a aVar) {
        AbstractC1684a.a(i9 > 0);
        this.f627a = interfaceC1224o;
        this.f628b = i9;
        this.f629c = aVar;
        this.f630d = new byte[1];
        this.f631e = i9;
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) {
        throw new UnsupportedOperationException();
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // b4.InterfaceC1224o
    public Map e() {
        return this.f627a.e();
    }

    @Override // b4.InterfaceC1224o
    public void g(b4.S s9) {
        AbstractC1684a.e(s9);
        this.f627a.g(s9);
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f627a.getUri();
    }

    public final boolean j() {
        if (this.f627a.read(this.f630d, 0, 1) == -1) {
            return false;
        }
        int i9 = (this.f630d[0] & 255) << 4;
        if (i9 == 0) {
            return true;
        }
        byte[] bArr = new byte[i9];
        int i10 = i9;
        int i11 = 0;
        while (i10 > 0) {
            int i12 = this.f627a.read(bArr, i11, i10);
            if (i12 == -1) {
                return false;
            }
            i11 += i12;
            i10 -= i12;
        }
        while (i9 > 0 && bArr[i9 - 1] == 0) {
            i9--;
        }
        if (i9 > 0) {
            this.f629c.b(new d4.M(bArr, i9));
        }
        return true;
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) {
        if (this.f631e == 0) {
            if (!j()) {
                return -1;
            }
            this.f631e = this.f628b;
        }
        int i11 = this.f627a.read(bArr, i9, Math.min(this.f631e, i10));
        if (i11 != -1) {
            this.f631e -= i11;
        }
        return i11;
    }
}
