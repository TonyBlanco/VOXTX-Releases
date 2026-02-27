package K3;

import O2.C0897l1;
import d4.k0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f3771c = new w(0, -9223372036854775807L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f3772d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3774b;

    public w(long j9, long j10) {
        this.f3773a = j9;
        this.f3774b = j10;
    }

    public static String b(long j9) {
        return k0.D("npt=%.3f-", Double.valueOf(j9 / 1000.0d));
    }

    public static w d(String str) throws C0897l1 {
        long j9;
        Matcher matcher = f3772d.matcher(str);
        com.google.android.exoplayer2.source.rtsp.h.a(matcher.matches(), str);
        String strGroup = matcher.group(1);
        com.google.android.exoplayer2.source.rtsp.h.a(strGroup != null, str);
        long j10 = ((String) k0.j(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j9 = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                com.google.android.exoplayer2.source.rtsp.h.a(j9 >= j10, str);
            } catch (NumberFormatException e9) {
                throw C0897l1.c(strGroup2, e9);
            }
        } else {
            j9 = -9223372036854775807L;
        }
        return new w(j10, j9);
    }

    public long a() {
        return this.f3774b - this.f3773a;
    }

    public boolean c() {
        return this.f3774b == -9223372036854775807L;
    }
}
