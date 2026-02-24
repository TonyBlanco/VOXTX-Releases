package H3;

import android.net.Uri;
import b4.C1226q;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.S;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d4.AbstractC1684a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class a implements InterfaceC1224o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1224o f2412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f2414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CipherInputStream f2415d;

    public a(InterfaceC1224o interfaceC1224o, byte[] bArr, byte[] bArr2) {
        this.f2412a = interfaceC1224o;
        this.f2413b = bArr;
        this.f2414c = bArr2;
    }

    @Override // b4.InterfaceC1224o
    public final long a(C1227s c1227s) {
        try {
            Cipher cipherJ = j();
            try {
                cipherJ.init(2, new SecretKeySpec(this.f2413b, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(this.f2414c));
                C1226q c1226q = new C1226q(this.f2412a, c1227s);
                this.f2415d = new CipherInputStream(c1226q, cipherJ);
                c1226q.c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e9) {
                throw new RuntimeException(e9);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // b4.InterfaceC1224o
    public void close() {
        if (this.f2415d != null) {
            this.f2415d = null;
            this.f2412a.close();
        }
    }

    @Override // b4.InterfaceC1224o
    public final Map e() {
        return this.f2412a.e();
    }

    @Override // b4.InterfaceC1224o
    public final void g(S s9) {
        AbstractC1684a.e(s9);
        this.f2412a.g(s9);
    }

    @Override // b4.InterfaceC1224o
    public final Uri getUri() {
        return this.f2412a.getUri();
    }

    public Cipher j() {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // b4.InterfaceC1220k
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        AbstractC1684a.e(this.f2415d);
        int i11 = this.f2415d.read(bArr, i9, i10);
        if (i11 < 0) {
            return -1;
        }
        return i11;
    }
}
