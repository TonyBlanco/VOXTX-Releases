package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.android.gms.common.internal.r;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagc implements zzacp {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private String zzj;
    private boolean zzh = true;
    private zzago zzg = new zzago();
    private zzago zzi = new zzago();

    public final zzagc zza(String str) {
        r.g(str);
        this.zzi.zzb().add(str);
        return this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzacp
    public final String zza() throws JSONException {
        int i9;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", this.zzh);
        if (!this.zzi.zzb().isEmpty()) {
            List<String> listZzb = this.zzi.zzb();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < listZzb.size(); i10++) {
                jSONArray.put(listZzb.get(i10));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List<String> listZzb2 = this.zzg.zzb();
        int size = listZzb2.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < listZzb2.size(); i11++) {
            String str = listZzb2.get(i11);
            str.hashCode();
            switch (str) {
                case "DISPLAY_NAME":
                    i9 = 2;
                    break;
                case "EMAIL":
                    i9 = 1;
                    break;
                case "PHOTO_URL":
                    i9 = 4;
                    break;
                case "PASSWORD":
                    i9 = 5;
                    break;
                default:
                    i9 = 0;
                    break;
            }
            iArr[i11] = i9;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i12 = 0; i12 < size; i12++) {
                jSONArray2.put(iArr[i12]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.zza;
        if (str2 != null) {
            jSONObject.put(ClientConstants.TOKEN_TYPE_ID, str2);
        }
        String str3 = this.zzc;
        if (str3 != null) {
            jSONObject.put("email", str3);
        }
        String str4 = this.zzd;
        if (str4 != null) {
            jSONObject.put(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, str4);
        }
        String str5 = this.zzb;
        if (str5 != null) {
            jSONObject.put("displayName", str5);
        }
        String str6 = this.zzf;
        if (str6 != null) {
            jSONObject.put("photoUrl", str6);
        }
        String str7 = this.zze;
        if (str7 != null) {
            jSONObject.put("oobCode", str7);
        }
        String str8 = this.zzj;
        if (str8 != null) {
            jSONObject.put("tenantId", str8);
        }
        return jSONObject.toString();
    }

    public final zzagc zzb(String str) {
        if (str == null) {
            this.zzg.zzb().add("DISPLAY_NAME");
        } else {
            this.zzb = str;
        }
        return this;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final zzagc zzc(String str) {
        if (str == null) {
            this.zzg.zzb().add("EMAIL");
        } else {
            this.zzc = str;
        }
        return this;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzagc zzd(String str) {
        this.zza = r.g(str);
        return this;
    }

    public final String zzd() {
        return this.zzd;
    }

    public final zzagc zze(String str) {
        this.zze = r.g(str);
        return this;
    }

    public final String zze() {
        return this.zzf;
    }

    public final zzagc zzf(String str) {
        if (str == null) {
            this.zzg.zzb().add("PASSWORD");
        } else {
            this.zzd = str;
        }
        return this;
    }

    public final zzagc zzg(String str) {
        if (str == null) {
            this.zzg.zzb().add("PHOTO_URL");
        } else {
            this.zzf = str;
        }
        return this;
    }

    public final zzagc zzh(String str) {
        this.zzj = str;
        return this;
    }

    public final boolean zzi(String str) {
        r.g(str);
        return this.zzg.zzb().contains(str);
    }
}
