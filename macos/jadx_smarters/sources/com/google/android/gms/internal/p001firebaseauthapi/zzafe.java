package com.google.android.gms.internal.p001firebaseauthapi;

import G5.C0537d;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafe implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private C0537d zze;
    private String zzf;
    private String zzg;

    public zzafe(int i9) {
        this.zza = zza(i9);
    }

    private zzafe(int i9, C0537d c0537d, String str, String str2, String str3, String str4, String str5) {
        this.zza = zza(7);
        this.zze = (C0537d) r.m(c0537d);
        this.zzb = null;
        this.zzc = str2;
        this.zzd = str3;
        this.zzf = null;
        this.zzg = null;
    }

    public static zzafe zza(C0537d c0537d, String str, String str2) {
        r.g(str);
        r.g(str2);
        r.m(c0537d);
        return new zzafe(7, c0537d, null, str2, str, null, null);
    }

    private static String zza(int i9) {
        return i9 != 1 ? i9 != 4 ? i9 != 6 ? i9 != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_AND_CHANGE_EMAIL" : "EMAIL_SIGNIN" : "VERIFY_EMAIL" : "PASSWORD_RESET";
    }

    public final zzafe zza(C0537d c0537d) {
        this.zze = (C0537d) r.m(c0537d);
        return this;
    }

    public final zzafe zza(String str) {
        this.zzg = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        int i9;
        i9 = 1;
        JSONObject jSONObject = new JSONObject();
        String str = this.zza;
        str.hashCode();
        switch (str) {
            case "PASSWORD_RESET":
                break;
            case "VERIFY_EMAIL":
                i9 = 4;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                i9 = 7;
                break;
            case "EMAIL_SIGNIN":
                i9 = 6;
                break;
            default:
                i9 = 0;
                break;
        }
        jSONObject.put("requestType", i9);
        String str2 = this.zzb;
        if (str2 != null) {
            jSONObject.put("email", str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("newEmail", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put(ClientConstants.TOKEN_TYPE_ID, str4);
        }
        C0537d c0537d = this.zze;
        if (c0537d != null) {
            jSONObject.put("androidInstallApp", c0537d.I());
            jSONObject.put("canHandleCodeInApp", this.zze.H());
            if (this.zze.M() != null) {
                jSONObject.put("continueUrl", this.zze.M());
            }
            if (this.zze.L() != null) {
                jSONObject.put("iosBundleId", this.zze.L());
            }
            if (this.zze.zzd() != null) {
                jSONObject.put("iosAppStoreId", this.zze.zzd());
            }
            if (this.zze.K() != null) {
                jSONObject.put("androidPackageName", this.zze.K());
            }
            if (this.zze.J() != null) {
                jSONObject.put("androidMinimumVersion", this.zze.J());
            }
            if (this.zze.zzc() != null) {
                jSONObject.put("dynamicLinkDomain", this.zze.zzc());
            }
        }
        String str5 = this.zzf;
        if (str5 != null) {
            jSONObject.put("tenantId", str5);
        }
        String str6 = this.zzg;
        if (str6 != null) {
            zzahc.zza(jSONObject, "captchaResp", str6);
        } else {
            zzahc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C0537d zzb() {
        return this.zze;
    }

    public final zzafe zzb(String str) {
        this.zzb = r.g(str);
        return this;
    }

    public final zzafe zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final zzafe zzd(String str) {
        this.zzd = r.g(str);
        return this;
    }
}
