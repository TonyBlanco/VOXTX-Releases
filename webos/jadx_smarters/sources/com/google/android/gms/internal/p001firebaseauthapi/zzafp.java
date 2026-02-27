package com.google.android.gms.internal.p001firebaseauthapi;

import C4.c;
import com.google.android.gms.common.internal.r;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzafp {
    public static long zza(String str) {
        zzafo zzafoVarZzb = zzb(str);
        return zzafoVarZzb.zza().longValue() - zzafoVarZzb.zzb().longValue();
    }

    private static zzafo zzb(String str) {
        r.g(str);
        List<String> listZza = zzab.zza('.').zza((CharSequence) str);
        if (listZza.size() >= 2) {
            try {
                return zzafo.zza(new String(c.b(listZza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e9) {
                throw new RuntimeException("Unable to decode token", e9);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
