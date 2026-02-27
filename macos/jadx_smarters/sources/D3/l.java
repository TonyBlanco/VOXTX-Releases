package D3;

import O2.C0936z0;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.r;
import d4.k0;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f1421k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f1422l;

    public l(InterfaceC1224o interfaceC1224o, C1227s c1227s, int i9, C0936z0 c0936z0, int i10, Object obj, byte[] bArr) {
        l lVar;
        byte[] bArr2;
        super(interfaceC1224o, c1227s, i9, c0936z0, i10, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = k0.f39782f;
            lVar = this;
        } else {
            lVar = this;
            bArr2 = bArr;
        }
        lVar.f1421k = bArr2;
    }

    @Override // b4.G.e
    public final void a() {
        try {
            this.f1384j.a(this.f1377c);
            int i9 = 0;
            int i10 = 0;
            while (i9 != -1 && !this.f1422l) {
                i(i10);
                i9 = this.f1384j.read(this.f1421k, i10, Http2.INITIAL_MAX_FRAME_SIZE);
                if (i9 != -1) {
                    i10 += i9;
                }
            }
            if (!this.f1422l) {
                g(this.f1421k, i10);
            }
            r.a(this.f1384j);
        } catch (Throwable th) {
            r.a(this.f1384j);
            throw th;
        }
    }

    @Override // b4.G.e
    public final void c() {
        this.f1422l = true;
    }

    public abstract void g(byte[] bArr, int i9);

    public byte[] h() {
        return this.f1421k;
    }

    public final void i(int i9) {
        byte[] bArr = this.f1421k;
        if (bArr.length < i9 + Http2.INITIAL_MAX_FRAME_SIZE) {
            this.f1421k = Arrays.copyOf(bArr, bArr.length + Http2.INITIAL_MAX_FRAME_SIZE);
        }
    }
}
