package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;

/* JADX INFO: loaded from: classes3.dex */
final class zzako {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, TokenParser.SP);
    }

    public static String zza(zzakn zzaknVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzaknVar, sb, 0);
        return sb.toString();
    }

    private static void zza(int i9, StringBuilder sb) {
        while (i9 > 0) {
            char[] cArr = zza;
            int length = i9 > cArr.length ? cArr.length : i9;
            sb.append(cArr, 0, length);
            i9 -= length;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void zza(com.google.android.gms.internal.p001firebaseauthapi.zzakn r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzako.zza(com.google.android.gms.internal.firebase-auth-api.zzakn, java.lang.StringBuilder, int):void");
    }

    public static void zza(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i9, sb);
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
            sb.append(zzalw.zza(zzahp.zza((String) obj)));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof zzahp) {
            sb.append(": \"");
            sb.append(zzalw.zza((zzahp) obj));
            sb.append(TokenParser.DQUOTE);
            return;
        }
        if (obj instanceof zzajc) {
            sb.append(" {");
            zza((zzajc) obj, sb, i9 + 2);
            sb.append("\n");
            zza(i9, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i11 = i9 + 2;
        zza(sb, i11, "key", entry.getKey());
        zza(sb, i11, "value", entry.getValue());
        sb.append("\n");
        zza(i9, sb);
        sb.append("}");
    }
}
