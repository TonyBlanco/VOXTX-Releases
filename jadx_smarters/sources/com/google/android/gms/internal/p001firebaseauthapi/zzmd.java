package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Build;
import android.util.Log;
import com.amazonaws.internal.keyvaluestore.f;
import com.amazonaws.internal.keyvaluestore.g;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmd implements zzcc {
    private static final Object zza = new Object();
    private static final String zzb = "zzmd";
    private final String zzc;
    private KeyStore zzd;

    public static final class zza {
        KeyStore zza;
        private String zzb = null;

        public zza() {
            this.zza = null;
            if (!zzmd.zza()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zza = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    public zzmd() throws GeneralSecurityException {
        this(new zza());
    }

    private zzmd(zza zzaVar) {
        this.zzc = null;
        this.zzd = zzaVar.zza;
    }

    public static /* synthetic */ boolean zza() {
        return Build.VERSION.SDK_INT >= 23;
    }

    public static boolean zzc(String str) throws GeneralSecurityException {
        zzmd zzmdVar = new zzmd();
        synchronized (zza) {
            try {
                if (zzmdVar.zzd(str)) {
                    return false;
                }
                String strZza = zzxo.zza("android-keystore://", str);
                KeyGenerator keyGenerator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, "AndroidKeyStore");
                g.a();
                keyGenerator.init(f.a(strZza, 3).setKeySize(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                keyGenerator.generateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized boolean zzd(String str) throws GeneralSecurityException {
        String strZza;
        strZza = zzxo.zza("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.zzd = keyStore;
                keyStore.load(null);
                return this.zzd.containsAlias(strZza);
            } catch (IOException e9) {
                throw new GeneralSecurityException(e9);
            }
        }
        return this.zzd.containsAlias(strZza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcc
    public final synchronized zzbg zza(String str) throws GeneralSecurityException {
        zzmb zzmbVar;
        zzmbVar = new zzmb(zzxo.zza("android-keystore://", str), this.zzd);
        byte[] bArrZza = zzou.zza(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrZza, zzmbVar.zza(zzmbVar.zzb(bArrZza, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzmbVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzcc
    public final synchronized boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }
}
