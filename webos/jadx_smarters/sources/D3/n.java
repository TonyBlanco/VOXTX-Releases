package D3;

import O2.C0936z0;
import b4.C1227s;
import b4.InterfaceC1224o;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f1427k;

    public n(InterfaceC1224o interfaceC1224o, C1227s c1227s, C0936z0 c0936z0, int i9, Object obj, long j9, long j10, long j11) {
        super(interfaceC1224o, c1227s, 1, c0936z0, i9, obj, j9, j10);
        AbstractC1684a.e(c0936z0);
        this.f1427k = j11;
    }

    public long g() {
        long j9 = this.f1427k;
        if (j9 != -1) {
            return 1 + j9;
        }
        return -1L;
    }

    public abstract boolean h();
}
