package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.services.s3.internal.Constants;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzag {
    private static String zza(Object obj) {
        if (obj == null) {
            return Constants.NULL_VERSION_ID;
        }
        try {
            return obj.toString();
        } catch (Exception e9) {
            String str = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for " + str, (Throwable) e9);
            return "<" + str + " threw " + e9.getClass().getName() + ">";
        }
    }

    public static String zza(String str) {
        return zzx.zzb(str);
    }

    public static String zza(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        int i9 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            objArr[i10] = zza(objArr[i10]);
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (objArr.length * 16));
        int i11 = 0;
        while (i9 < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i11)) != -1) {
            sb.append((CharSequence) strValueOf, i11, iIndexOf);
            sb.append(objArr[i9]);
            i11 = iIndexOf + 2;
            i9++;
        }
        sb.append((CharSequence) strValueOf, i11, strValueOf.length());
        if (i9 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i9]);
            for (int i12 = i9 + 1; i12 < objArr.length; i12++) {
                sb.append(", ");
                sb.append(objArr[i12]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String zzb(String str) {
        return zzx.zzc(str);
    }

    public static boolean zzc(String str) {
        return zzx.zzd(str);
    }
}
