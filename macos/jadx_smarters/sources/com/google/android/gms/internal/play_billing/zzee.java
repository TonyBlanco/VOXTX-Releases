package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
final class zzee {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, TokenParser.SP);
    }

    public static String zza(zzec zzecVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzecVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i9, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char cCharAt = str.charAt(i10);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzfd.zza(new zzbn(((String) obj).getBytes(zzda.zzb))));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof zzbq) {
            sb.append(": \"");
            sb.append(zzfd.zza((zzbq) obj));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof zzcs) {
            sb.append(" {");
            zzd((zzcs) obj, sb, i9 + 2);
            sb.append("\n");
            zzc(i9, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i11 = i9 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i11, "key", entry.getKey());
        zzb(sb, i11, "value", entry.getValue());
        sb.append("\n");
        zzc(i9, sb);
        sb.append("}");
    }

    private static void zzc(int i9, StringBuilder sb) {
        while (i9 > 0) {
            int i10 = 80;
            if (i9 <= 80) {
                i10 = i9;
            }
            sb.append(zza, 0, i10);
            i9 -= i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zzd(com.google.android.gms.internal.play_billing.zzec r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzee.zzd(com.google.android.gms.internal.play_billing.zzec, java.lang.StringBuilder, int):void");
    }
}
