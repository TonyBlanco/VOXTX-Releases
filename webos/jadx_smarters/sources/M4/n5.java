package M4;

import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzey;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f4960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f4961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f4962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f4963f;

    public n5(String str, int i9) {
        this.f4958a = str;
        this.f4959b = i9;
    }

    public static Boolean d(String str, int i9, boolean z9, String str2, List list, String str3, C0858z1 c0858z1) {
        boolean zStartsWith;
        if (i9 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z9 && i9 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i9 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z9 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c0858z1 != null) {
                        c0858z1.w().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                zStartsWith = str.startsWith(str2);
                break;
            case 3:
                zStartsWith = str.endsWith(str2);
                break;
            case 4:
                zStartsWith = str.contains(str2);
                break;
            case 5:
                zStartsWith = str.equals(str2);
                break;
            case 6:
                if (list == null) {
                    return null;
                }
                zStartsWith = list.contains(str);
                break;
            default:
                return null;
        }
        return Boolean.valueOf(zStartsWith);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean e(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.zzer r9, double r10) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.n5.e(java.math.BigDecimal, com.google.android.gms.internal.measurement.zzer, double):java.lang.Boolean");
    }

    public static Boolean f(String str, zzey zzeyVar, C0858z1 c0858z1) {
        List list;
        com.google.android.gms.common.internal.r.m(zzeyVar);
        if (str == null || !zzeyVar.zzi() || zzeyVar.zzj() == 1) {
            return null;
        }
        if (zzeyVar.zzj() == 7) {
            if (zzeyVar.zza() == 0) {
                return null;
            }
        } else if (!zzeyVar.zzh()) {
            return null;
        }
        int iZzj = zzeyVar.zzj();
        boolean zZzf = zzeyVar.zzf();
        String strZzd = (zZzf || iZzj == 2 || iZzj == 7) ? zzeyVar.zzd() : zzeyVar.zzd().toUpperCase(Locale.ENGLISH);
        if (zzeyVar.zza() == 0) {
            list = null;
        } else {
            List listZze = zzeyVar.zze();
            if (!zZzf) {
                ArrayList arrayList = new ArrayList(listZze.size());
                Iterator it = listZze.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listZze = Collections.unmodifiableList(arrayList);
            }
            list = listZze;
        }
        return d(str, iZzj, zZzf, strZzd, list, iZzj == 2 ? strZzd : null, c0858z1);
    }

    public static Boolean g(double d9, zzer zzerVar) {
        try {
            return e(new BigDecimal(d9), zzerVar, Math.ulp(d9));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(long j9, zzer zzerVar) {
        try {
            return e(new BigDecimal(j9), zzerVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, zzer zzerVar) {
        if (!U4.P(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), zzerVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean j(Boolean bool, boolean z9) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z9);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
