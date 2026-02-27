package com.google.android.gms.internal.p001firebaseauthapi;

import A4.a;
import E4.e;
import G5.F;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import j4.AbstractC2096a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
final class zzadu {
    private static final a zza = new a("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzaeb> zzd = new HashMap<>();

    public zzadu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(str3.getBytes(zzq.zza));
            String strSubstring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            zza.a("Package: " + str + " -- Hash: " + strSubstring, new Object[0]);
            return strSubstring;
        } catch (NoSuchAlgorithmException e9) {
            zza.c("NoSuchAlgorithm: " + e9.getMessage(), new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void zza(zzadu zzaduVar, String str) {
        zzaeb zzaebVar = zzaduVar.zzd.get(str);
        if (zzaebVar == null || zzag.zzc(zzaebVar.zzd) || zzag.zzc(zzaebVar.zze) || zzaebVar.zzb.isEmpty()) {
            return;
        }
        Iterator<zzacd> it = zzaebVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(F.L(zzaebVar.zzd, zzaebVar.zze));
        }
        zzaebVar.zzh = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null || zzaebVar.zzh || zzag.zzc(zzaebVar.zzd)) {
            return;
        }
        zza.g("Timed out waiting for SMS.", new Object[0]);
        Iterator<zzacd> it = zzaebVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zza(zzaebVar.zzd);
        }
        zzaebVar.zzi = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzb(String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null) {
            return;
        }
        if (!zzaebVar.zzi) {
            zze(str);
        }
        zzc(str);
    }

    public final zzacd zza(zzacd zzacdVar, String str) {
        return new zzadz(this, zzacdVar, str);
    }

    public final void zza(final String str, zzacd zzacdVar, long j9, boolean z9) {
        this.zzd.put(str, new zzaeb(j9, z9));
        zzb(zzacdVar, str);
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar.zza <= 0) {
            zza.g("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzaebVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzadx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb(str);
            }
        }, zzaebVar.zza, TimeUnit.SECONDS);
        if (!zzaebVar.zzc) {
            zza.g("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzady zzadyVar = new zzady(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        zzc.zza(this.zzb.getApplicationContext(), zzadyVar, intentFilter);
        AbstractC2096a.a(this.zzb).startSmsRetriever().addOnFailureListener(new zzadw(this));
    }

    public final String zzb() {
        try {
            String packageName = this.zzb.getPackageName();
            String strZza = zza(packageName, (Build.VERSION.SDK_INT < 28 ? e.a(this.zzb).e(packageName, 64).signatures : e.a(this.zzb).e(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (strZza != null) {
                return strZza;
            }
            zza.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    public final void zzb(zzacd zzacdVar, String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null) {
            return;
        }
        zzaebVar.zzb.add(zzacdVar);
        if (zzaebVar.zzg) {
            zzacdVar.zzb(zzaebVar.zzd);
        }
        if (zzaebVar.zzh) {
            zzacdVar.zza(F.L(zzaebVar.zzd, zzaebVar.zze));
        }
        if (zzaebVar.zzi) {
            zzacdVar.zza(zzaebVar.zzd);
        }
    }

    public final void zzc(String str) {
        zzaeb zzaebVar = this.zzd.get(str);
        if (zzaebVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzaebVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzaebVar.zzf.cancel(false);
        }
        zzaebVar.zzb.clear();
        this.zzd.remove(str);
    }

    public final boolean zzd(String str) {
        return this.zzd.get(str) != null;
    }
}
