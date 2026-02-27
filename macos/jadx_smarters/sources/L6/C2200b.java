package l6;

import A5.f;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2200b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f44217c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f44218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44219b;

    public C2200b(f fVar) {
        this.f44218a = fVar.l().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f44219b = b(fVar);
    }

    public static String b(f fVar) {
        String strD = fVar.p().d();
        if (strD != null) {
            return strD;
        }
        String strC = fVar.p().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e9) {
            Log.w("ContentValues", "Invalid key stored " + e9);
            return null;
        }
    }

    public String f() {
        synchronized (this.f44218a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        String string;
        synchronized (this.f44218a) {
            string = this.f44218a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f44218a) {
            try {
                String string = this.f44218a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f44218a) {
            try {
                for (String str : f44217c) {
                    String string = this.f44218a.getString(a(this.f44219b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
