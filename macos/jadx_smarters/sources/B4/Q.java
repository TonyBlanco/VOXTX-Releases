package b4;

import android.net.Uri;
import d4.AbstractC1684a;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Q implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1224o f17549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1222m f17550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17552d;

    public Q(InterfaceC1224o interfaceC1224o, InterfaceC1222m interfaceC1222m) {
        this.f17549a = (InterfaceC1224o) AbstractC1684a.e(interfaceC1224o);
        this.f17550b = (InterfaceC1222m) AbstractC1684a.e(interfaceC1222m);
    }

    @Override // b4.InterfaceC1224o
    public long a(C1227s c1227s) {
        long jA = this.f17549a.a(c1227s);
        this.f17552d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (c1227s.f17605h == -1 && jA != -1) {
            c1227s = c1227s.f(0L, jA);
        }
        this.f17551c = true;
        this.f17550b.a(c1227s);
        return this.f17552d;
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        try {
            this.f17549a.close();
        } finally {
            if (this.f17551c) {
                this.f17551c = false;
                this.f17550b.close();
            }
        }
    }

    @Override // b4.InterfaceC1224o
    public Map e() {
        return this.f17549a.e();
    }

    @Override // b4.InterfaceC1224o
    public void g(S s9) {
        AbstractC1684a.e(s9);
        this.f17549a.g(s9);
    }

    @Override // b4.InterfaceC1224o
    public Uri getUri() {
        return this.f17549a.getUri();
    }

    @Override // b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) {
        if (this.f17552d == 0) {
            return -1;
        }
        int i11 = this.f17549a.read(bArr, i9, i10);
        if (i11 > 0) {
            this.f17550b.write(bArr, i9, i11);
            long j9 = this.f17552d;
            if (j9 != -1) {
                this.f17552d = j9 - ((long) i11);
            }
        }
        return i11;
    }
}
