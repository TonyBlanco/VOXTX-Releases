package P3;

import d4.AbstractC1684a;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends U2.i implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f7240n;

    public class a extends o {
        public a() {
        }

        @Override // com.google.android.exoplayer2.decoder.a
        public void release() {
            h.this.r(this);
        }
    }

    public h(String str) {
        super(new n[2], new o[2]);
        this.f7240n = str;
        u(1024);
    }

    @Override // U2.i
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final k j(n nVar, o oVar, boolean z9) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) AbstractC1684a.e(nVar.f9699d);
            oVar.d(nVar.f9701f, z(byteBuffer.array(), byteBuffer.limit(), z9), nVar.f7254j);
            oVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (k e9) {
            return e9;
        }
    }

    @Override // P3.j
    public void a(long j9) {
    }

    @Override // U2.d
    public final String getName() {
        return this.f7240n;
    }

    @Override // U2.i
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final n g() {
        return new n();
    }

    @Override // U2.i
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final o h() {
        return new a();
    }

    @Override // U2.i
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final k i(Throwable th) {
        return new k("Unexpected decode error", th);
    }

    public abstract i z(byte[] bArr, int i9, boolean z9);
}
