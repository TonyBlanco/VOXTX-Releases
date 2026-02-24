package com.google.ads.interactivemedia.v3.impl.data;

import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.google.ads.interactivemedia.v3.internal.apl;
import com.google.ads.interactivemedia.v3.internal.aru;
import com.google.ads.interactivemedia.v3.internal.ato;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aq {
    public static String a(byte[] bArr, boolean z9) {
        return Base64.encodeToString(bArr, true != z9 ? 2 : 11);
    }

    public static byte[] b(String str, boolean z9) throws IllegalArgumentException {
        byte[] bArrDecode = Base64.decode(str, true != z9 ? 2 : 11);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static boolean c(int i9) {
        int i10 = i9 - 1;
        int i11 = apl.f20476a;
        if (i9 != 0) {
            return i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(android.content.Context r8, com.google.ads.interactivemedia.v3.internal.aru r9) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.impl.data.aq.d(android.content.Context, com.google.ads.interactivemedia.v3.internal.aru):int");
    }

    private static final String e(aru aruVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strA = ato.OS_ARCH.a();
        if (!TextUtils.isEmpty(strA) && hashSet.contains(strA)) {
            return strA;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException | NoSuchFieldException e9) {
            aruVar.c(2024, 0L, e9);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void f(byte[] bArr, String str, aru aruVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("os.arch:");
        sb.append(ato.OS_ARCH.a());
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        aruVar.b(4007, sb.toString());
    }
}
