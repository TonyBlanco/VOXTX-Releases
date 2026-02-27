package com.google.android.gms.internal.p001firebaseauthapi;

import com.amplifyframework.core.model.ModelIdentifier;
import j$.util.DesugarTimeZone;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanc {
    private static final zzamb zza = (zzamb) ((zzajc) zzamb.zzc().zza(-62135596800L).zza(0).zzf());
    private static final zzamb zzb = (zzamb) ((zzajc) zzamb.zzc().zza(253402300799L).zza(999999999).zzf());
    private static final zzamb zzc = (zzamb) ((zzajc) zzamb.zzc().zza(0L).zza(0).zzf());
    private static final ThreadLocal<SimpleDateFormat> zzd = new zzane();
    private static final Method zze = zzc("now");
    private static final Method zzf = zzc("getEpochSecond");
    private static final Method zzg = zzc("getNano");

    public static long zza(zzamb zzambVar) {
        return zzb(zzambVar).zzb();
    }

    public static zzamb zza(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf == -1) {
            throw new ParseException("Failed to parse timestamp: invalid timestamp \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, 0);
        }
        int iIndexOf2 = str.indexOf(90, iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(43, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.indexOf(45, iIndexOf);
        }
        if (iIndexOf2 == -1) {
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        String strSubstring2 = str.substring(0, iIndexOf2);
        int iIndexOf3 = strSubstring2.indexOf(46);
        if (iIndexOf3 != -1) {
            String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
            strSubstring = strSubstring2.substring(iIndexOf3 + 1);
            strSubstring2 = strSubstring3;
        } else {
            strSubstring = "";
        }
        long time = zzd.get().parse(strSubstring2).getTime() / 1000;
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i9 = 0; i9 < 9; i9++) {
                iCharAt *= 10;
                if (i9 < strSubstring.length()) {
                    if (strSubstring.charAt(i9) < '0' || strSubstring.charAt(i9) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt += strSubstring.charAt(i9) - '0';
                }
            }
        }
        if (str.charAt(iIndexOf2) != 'Z') {
            long jZzb = zzb(str.substring(iIndexOf2 + 1));
            time = str.charAt(iIndexOf2) == '+' ? time - jZzb : time + jZzb;
        } else if (str.length() != iIndexOf2 + 1) {
            throw new ParseException("Failed to parse timestamp: invalid trailing data \"" + str.substring(iIndexOf2) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, 0);
        }
        if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
            try {
                time = zzbe.zza(time, iCharAt / Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
                iCharAt %= Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            } catch (IllegalArgumentException e9) {
                ParseException parseException = new ParseException("Failed to parse timestamp " + str + " Timestamp is out of range.", 0);
                parseException.initCause(e9);
                throw parseException;
            }
        }
        if (iCharAt < 0) {
            iCharAt += Http2Connection.DEGRADED_PONG_TIMEOUT_NS;
            time = zzbe.zzb(time, 1L);
        }
        return zzb((zzamb) ((zzajc) zzamb.zzc().zza(time).zza(iCharAt).zzf()));
    }

    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }

    private static long zzb(String str) throws ParseException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid offset value: " + str, 0);
        }
        try {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        } catch (NumberFormatException e9) {
            ParseException parseException = new ParseException("Invalid offset value: " + str, 0);
            parseException.initCause(e9);
            throw parseException;
        }
    }

    private static zzamb zzb(zzamb zzambVar) {
        long jZzb = zzambVar.zzb();
        int iZza = zzambVar.zza();
        if (jZzb < -62135596800L || jZzb > 253402300799L || iZza < 0 || iZza >= 1000000000) {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzb), Integer.valueOf(iZza)));
        }
        return zzambVar;
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
