package H5;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p001firebaseauthapi.zzbi;
import com.google.android.gms.internal.p001firebaseauthapi.zzbo;
import com.google.android.gms.internal.p001firebaseauthapi.zzcd;
import com.google.android.gms.internal.p001firebaseauthapi.zzkm;
import com.google.android.gms.internal.p001firebaseauthapi.zzkt;
import com.google.android.gms.internal.p001firebaseauthapi.zzma;
import com.google.android.gms.internal.p001firebaseauthapi.zzw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Y f2647c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzma f2649b;

    public Y(Context context, String str, boolean z9) {
        zzma zzmaVarZza;
        this.f2648a = str;
        try {
            zzkm.zza();
            zzma.zza zzaVarZza = new zzma.zza().zza(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str)).zza(zzkt.zza);
            zzaVarZza.zza(String.format("android-keystore://firebear_master_key_id.%s", str));
            zzmaVarZza = zzaVarZza.zza();
        } catch (IOException | GeneralSecurityException e9) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e9.getMessage());
            zzmaVarZza = null;
        }
        this.f2649b = zzmaVarZza;
    }

    public static Y a(Context context, String str) {
        Y y9 = f2647c;
        if (y9 == null || !zzw.zza(y9.f2648a, str)) {
            f2647c = new Y(context, str, true);
        }
        return f2647c;
    }

    public final String b() {
        if (this.f2649b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzcd zzcdVarZza = zzbi.zza(byteArrayOutputStream);
        try {
            synchronized (this.f2649b) {
                this.f2649b.zza().zza().zza(zzcdVarZza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e9) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e9.getMessage());
            return null;
        }
    }

    public final String c(String str) {
        String str2;
        zzma zzmaVar = this.f2649b;
        if (zzmaVar == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (zzmaVar) {
                str2 = new String(((zzbo) this.f2649b.zza().zza(zzbo.class)).zza(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e9) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e9.getMessage());
            return null;
        }
    }
}
