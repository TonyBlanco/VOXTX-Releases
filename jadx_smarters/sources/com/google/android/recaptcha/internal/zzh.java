package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import k8.i;
import k8.m;
import l8.AbstractC2205B;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzh extends Exception {

    @NotNull
    public static final zzg zza = new zzg(null);

    @NotNull
    private static final Map zzb;

    @NotNull
    private final zzf zzc;

    @NotNull
    private final zzd zzd;

    @NotNull
    private final Map zze = AbstractC2205B.e(m.a(zzf.zze, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), m.a(zzf.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), m.a(zzf.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), m.a(zzf.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), m.a(zzf.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), m.a(zzf.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)));

    static {
        i iVarA = m.a(zzmf.JS_NETWORK_ERROR, new zzh(zzf.zze, zzd.zzm));
        zzmf zzmfVar = zzmf.JS_INTERNAL_ERROR;
        zzf zzfVar = zzf.zzc;
        zzb = AbstractC2205B.e(iVarA, m.a(zzmfVar, new zzh(zzfVar, zzd.zzk)), m.a(zzmf.JS_INVALID_SITE_KEY, new zzh(zzf.zzf, zzd.zzn)), m.a(zzmf.JS_INVALID_SITE_KEY_TYPE, new zzh(zzf.zzg, zzd.zzo)), m.a(zzmf.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzh(zzf.zzh, zzd.zzp)), m.a(zzmf.JS_INVALID_ACTION, new zzh(zzf.zzi, zzd.zzq)), m.a(zzmf.JS_PROGRAM_ERROR, new zzh(zzfVar, zzd.zzv)));
    }

    public zzh(@NotNull zzf zzfVar, @NotNull zzd zzdVar) {
        this.zzc = zzfVar;
        this.zzd = zzdVar;
    }

    @NotNull
    public final zzd zza() {
        return this.zzd;
    }

    @NotNull
    public final zzf zzb() {
        return this.zzc;
    }

    @NotNull
    public final RecaptchaException zzc() {
        RecaptchaException recaptchaException = (RecaptchaException) this.zze.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.UNKNOWN_ERROR, null, 2, null) : recaptchaException;
    }
}
