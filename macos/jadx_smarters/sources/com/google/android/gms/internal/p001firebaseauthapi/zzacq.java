package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public class zzacq {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzacq";

    private zzacq() {
    }

    public static Object zza(String str, Type type) throws zzaaf {
        if (type == String.class) {
            try {
                zzael zzaelVar = (zzael) new zzael().zza(str);
                if (zzaelVar.zzb()) {
                    return zzaelVar.zza();
                }
                throw new zzaaf("No error message: " + str);
            } catch (Exception e9) {
                throw new zzaaf("Json conversion failed! " + e9.getMessage(), e9);
            }
        }
        if (type == Void.class) {
            return null;
        }
        try {
            try {
                return ((zzacs) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
            } catch (Exception e10) {
                throw new zzaaf("Json conversion failed! " + e10.getMessage(), e10);
            }
        } catch (Exception e11) {
            throw new zzaaf("Instantiation of JsonResponse failed! " + String.valueOf(type), e11);
        }
    }
}
