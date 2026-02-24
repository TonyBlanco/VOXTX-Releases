package W1;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import q2.AbstractC2539h;
import q2.C2536e;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2536e f10224a = new C2536e(1000);

    public String a(S1.c cVar) {
        String strL;
        synchronized (this.f10224a) {
            strL = (String) this.f10224a.g(cVar);
        }
        if (strL == null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
                cVar.a(messageDigest);
                strL = AbstractC2539h.l(messageDigest.digest());
            } catch (UnsupportedEncodingException | NoSuchAlgorithmException e9) {
                e9.printStackTrace();
            }
            synchronized (this.f10224a) {
                this.f10224a.k(cVar, strL);
            }
        }
        return strL;
    }
}
