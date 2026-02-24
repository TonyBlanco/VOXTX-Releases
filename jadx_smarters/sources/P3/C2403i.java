package p3;

import d4.AbstractC1684a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: p3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2403i extends U2.g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f46278j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46279k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f46280l;

    public C2403i() {
        super(2);
        this.f46280l = 32;
    }

    @Override // U2.g, U2.a
    public void clear() {
        super.clear();
        this.f46279k = 0;
    }

    public boolean o(U2.g gVar) {
        AbstractC1684a.a(!gVar.j());
        AbstractC1684a.a(!gVar.hasSupplementalData());
        AbstractC1684a.a(!gVar.isEndOfStream());
        if (!p(gVar)) {
            return false;
        }
        int i9 = this.f46279k;
        this.f46279k = i9 + 1;
        if (i9 == 0) {
            this.f9701f = gVar.f9701f;
            if (gVar.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (gVar.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = gVar.f9699d;
        if (byteBuffer != null) {
            e(byteBuffer.remaining());
            this.f9699d.put(byteBuffer);
        }
        this.f46278j = gVar.f9701f;
        return true;
    }

    public final boolean p(U2.g gVar) {
        ByteBuffer byteBuffer;
        if (!t()) {
            return true;
        }
        if (this.f46279k >= this.f46280l || gVar.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = gVar.f9699d;
        return byteBuffer2 == null || (byteBuffer = this.f9699d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long q() {
        return this.f9701f;
    }

    public long r() {
        return this.f46278j;
    }

    public int s() {
        return this.f46279k;
    }

    public boolean t() {
        return this.f46279k > 0;
    }

    public void u(int i9) {
        AbstractC1684a.a(i9 > 0);
        this.f46280l = i9;
    }
}
