package A7;

import android.content.Context;
import android.util.Base64;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LiveStreamDBHandler f159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap f160b = new HashMap();

    public final String a(String str) {
        return Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 0).replace("\n", "");
    }

    public String b(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    inputStream.close();
                    return sb.toString();
                }
                sb.append(line + "\n");
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public String c(InputStream inputStream, Context context) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String str = "";
            do {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if ((line.contains("http://") && !line.contains("tvg-logo")) || (line.contains("https://") && !line.contains("tvg-logo"))) {
                    str = line;
                }
            } while (str.equals(""));
            inputStream.close();
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0302 A[Catch: Exception -> 0x023e, TryCatch #113 {Exception -> 0x023e, blocks: (B:71:0x01fc, B:73:0x0202, B:76:0x0209, B:99:0x02af, B:110:0x02dd, B:113:0x0302, B:115:0x0312, B:119:0x031c, B:121:0x0322, B:122:0x0330, B:123:0x0334, B:118:0x0319, B:124:0x033d, B:126:0x0348, B:129:0x0353, B:131:0x035b, B:133:0x0361, B:106:0x02ca, B:82:0x0226, B:88:0x0256, B:93:0x0282, B:97:0x029b, B:92:0x026f, B:95:0x0288, B:90:0x025c), top: B:1437:0x01fc, inners: #46, #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011a A[Catch: Exception -> 0x00fd, TRY_LEAVE, TryCatch #27 {Exception -> 0x00fd, blocks: (B:16:0x00e7, B:18:0x00ed, B:25:0x011a), top: B:1265:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x08c4 A[PHI: r13 r14 r25 r68
      0x08c4: PHI (r13v27 java.lang.String) = (r13v26 java.lang.String), (r13v28 java.lang.String) binds: [B:270:0x08c2, B:266:0x08b1] A[DONT_GENERATE, DONT_INLINE]
      0x08c4: PHI (r14v42 java.lang.String) = (r14v41 java.lang.String), (r14v43 java.lang.String) binds: [B:270:0x08c2, B:266:0x08b1] A[DONT_GENERATE, DONT_INLINE]
      0x08c4: PHI (r25v29 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>) = 
      (r25v28 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
      (r25v30 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
     binds: [B:270:0x08c2, B:266:0x08b1] A[DONT_GENERATE, DONT_INLINE]
      0x08c4: PHI (r68v9 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>) = 
      (r68v8 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
      (r68v10 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
     binds: [B:270:0x08c2, B:266:0x08b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0c24  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0dc4  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x118e  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x135e  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x1530  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x1700  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x18d2  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x1aa4  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x1c62  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x1e20  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x1fde  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0256 A[Catch: Exception -> 0x023e, TRY_ENTER, TRY_LEAVE, TryCatch #113 {Exception -> 0x023e, blocks: (B:71:0x01fc, B:73:0x0202, B:76:0x0209, B:99:0x02af, B:110:0x02dd, B:113:0x0302, B:115:0x0312, B:119:0x031c, B:121:0x0322, B:122:0x0330, B:123:0x0334, B:118:0x0319, B:124:0x033d, B:126:0x0348, B:129:0x0353, B:131:0x035b, B:133:0x0361, B:106:0x02ca, B:82:0x0226, B:88:0x0256, B:93:0x0282, B:97:0x029b, B:92:0x026f, B:95:0x0288, B:90:0x025c), top: B:1437:0x01fc, inners: #46, #67 }] */
    /* JADX WARN: Removed duplicated region for block: B:919:0x219c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(java.io.InputStream r71, android.content.Context r72) {
        /*
            Method dump skipped, instruction units count: 10212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.a.d(java.io.InputStream, android.content.Context):boolean");
    }
}
