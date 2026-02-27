package V2;

import P2.v0;
import V2.G;
import android.media.MediaDrmException;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements G {
    @Override // V2.G
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public G.d b() {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public byte[] c() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // V2.G
    public void d(G.b bVar) {
    }

    @Override // V2.G
    public /* synthetic */ void e(byte[] bArr, v0 v0Var) {
        F.a(this, bArr, v0Var);
    }

    @Override // V2.G
    public void f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public void g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public int h() {
        return 1;
    }

    @Override // V2.G
    public CryptoConfig i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public boolean j(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public void k(byte[] bArr) {
    }

    @Override // V2.G
    public byte[] l(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public G.a m(byte[] bArr, List list, int i9, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // V2.G
    public void release() {
    }
}
