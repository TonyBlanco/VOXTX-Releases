package com.google.android.gms.internal.p001firebaseauthapi;

import A5.f;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
final class zzacu extends zzadi implements zzaef {
    private zzaco zza;
    private zzacn zzb;
    private zzadq zzc;
    private final zzacr zzd;
    private final f zze;
    private String zzf;
    private zzact zzg;

    public zzacu(f fVar, zzacr zzacrVar) {
        this(fVar, zzacrVar, null, null, null);
    }

    private zzacu(f fVar, zzacr zzacrVar, zzadq zzadqVar, zzaco zzacoVar, zzacn zzacnVar) {
        this.zze = fVar;
        this.zzf = fVar.p().b();
        this.zzd = (zzacr) r.m(zzacrVar);
        zza(null, null, null);
        zzaed.zza(this.zzf, this);
    }

    private final void zza(zzadq zzadqVar, zzaco zzacoVar, zzacn zzacnVar) {
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        String strZza = zzaea.zza("firebear.secureToken");
        if (TextUtils.isEmpty(strZza)) {
            strZza = zzaed.zzd(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: " + strZza);
        }
        if (this.zzc == null) {
            this.zzc = new zzadq(strZza, zzb());
        }
        String strZza2 = zzaea.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza2)) {
            strZza2 = zzaed.zzb(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: " + strZza2);
        }
        if (this.zza == null) {
            this.zza = new zzaco(strZza2, zzb());
        }
        String strZza3 = zzaea.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(strZza3)) {
            strZza3 = zzaed.zzc(this.zzf);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: " + strZza3);
        }
        if (this.zzb == null) {
            this.zzb = new zzacn(strZza3, zzb());
        }
    }

    private final zzact zzb() {
        if (this.zzg == null) {
            this.zzg = new zzact(this.zze, this.zzd.zzb());
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaef
    public final void zza() {
        zza(null, null, null);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzaek zzaekVar, zzadk<zzaen> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzaekVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/createAuthUri", this.zzf), zzaekVar, zzadkVar, zzaen.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzaem zzaemVar, zzadk<Void> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzaemVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/deleteAccount", this.zzf), zzaemVar, zzadkVar, Void.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzaep zzaepVar, zzadk<zzaeo> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzaepVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/emailLinkSignin", this.zzf), zzaepVar, zzadkVar, zzaeo.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzaer zzaerVar, zzadk<zzaeq> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzaerVar);
        r.m(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:finalize", this.zzf), zzaerVar, zzadkVar, zzaeq.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzaet zzaetVar, zzadk<zzaes> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzaetVar);
        r.m(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaSignIn:finalize", this.zzf), zzaetVar, zzadkVar, zzaes.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzafa zzafaVar, zzadk<zzafd> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzafaVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getAccountInfo", this.zzf), zzafaVar, zzadkVar, zzafd.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzafb zzafbVar, zzadk<zzafn> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzafbVar);
        r.m(zzadkVar);
        zzadq zzadqVar = this.zzc;
        zzadn.zza(zzadqVar.zza("/token", this.zzf), zzafbVar, zzadkVar, zzafn.class, zzadqVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzafe zzafeVar, zzadk<zzafh> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzafeVar);
        r.m(zzadkVar);
        if (zzafeVar.zzb() != null) {
            zzb().zzb(zzafeVar.zzb().zze());
        }
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getOobConfirmationCode", this.zzf), zzafeVar, zzadkVar, zzafh.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzafg zzafgVar, zzadk<zzafj> zzadkVar) {
        r.m(zzafgVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/getRecaptchaParam", this.zzf), zzadkVar, zzafj.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzafl zzaflVar, zzadk<zzafk> zzadkVar) {
        r.m(zzaflVar);
        r.m(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/recaptchaConfig", this.zzf) + "&clientType=" + zzaflVar.zzb() + "&version=" + zzaflVar.zzc(), zzadkVar, zzafk.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzafx zzafxVar, zzadk<zzafw> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzafxVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/resetPassword", this.zzf), zzafxVar, zzadkVar, zzafw.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzafz zzafzVar, zzadk<zzagb> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzafzVar);
        r.m(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts:revokeToken", this.zzf), zzafzVar, zzadkVar, zzagb.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzaga zzagaVar, zzadk<zzagd> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzagaVar);
        r.m(zzadkVar);
        if (!TextUtils.isEmpty(zzagaVar.zzc())) {
            zzb().zzb(zzagaVar.zzc());
        }
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/sendVerificationCode", this.zzf), zzagaVar, zzadkVar, zzagd.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzagc zzagcVar, zzadk<zzagf> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzagcVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/setAccountInfo", this.zzf), zzagcVar, zzadkVar, zzagf.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzage zzageVar, zzadk<zzagh> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzageVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/signupNewUser", this.zzf), zzageVar, zzadkVar, zzagh.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzagg zzaggVar, zzadk<zzagj> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzaggVar);
        r.m(zzadkVar);
        if (zzaggVar instanceof zzagk) {
            zzagk zzagkVar = (zzagk) zzaggVar;
            if (!TextUtils.isEmpty(zzagkVar.zzb())) {
                zzb().zzb(zzagkVar.zzb());
            }
        }
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:start", this.zzf), zzaggVar, zzadkVar, zzagj.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzagi zzagiVar, zzadk<zzagl> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzagiVar);
        r.m(zzadkVar);
        if (!TextUtils.isEmpty(zzagiVar.zzb())) {
            zzb().zzb(zzagiVar.zzb());
        }
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaSignIn:start", this.zzf), zzagiVar, zzadkVar, zzagl.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzagt zzagtVar, zzadk<zzagv> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzagtVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyAssertion", this.zzf), zzagtVar, zzadkVar, zzagv.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzagu zzaguVar, zzadk<zzagx> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzaguVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyCustomToken", this.zzf), zzaguVar, zzadkVar, zzagx.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzagw zzagwVar, zzadk<zzagz> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzagwVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyPassword", this.zzf), zzagwVar, zzadkVar, zzagz.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzagy zzagyVar, zzadk<zzahb> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzagyVar);
        r.m(zzadkVar);
        zzaco zzacoVar = this.zza;
        zzadn.zza(zzacoVar.zza("/verifyPhoneNumber", this.zzf), zzagyVar, zzadkVar, zzahb.class, zzacoVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(zzaha zzahaVar, zzadk<zzahd> zzadkVar) throws IllegalAccessException, InvocationTargetException {
        r.m(zzahaVar);
        r.m(zzadkVar);
        zzacn zzacnVar = this.zzb;
        zzadn.zza(zzacnVar.zza("/accounts/mfaEnrollment:withdraw", this.zzf), zzahaVar, zzadkVar, zzahd.class, zzacnVar.zza);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadi
    public final void zza(String str, zzadk<Void> zzadkVar) {
        r.m(zzadkVar);
        zzb().zza(str);
        zzadkVar.zza((Void) null);
    }
}
