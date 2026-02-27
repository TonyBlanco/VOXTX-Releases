package K3;

import android.net.Uri;
import d4.AbstractC1684a;
import d4.b0;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f3777c;

    public x(long j9, int i9, Uri uri) {
        this.f3775a = j9;
        this.f3776b = i9;
        this.f3777c = uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s5.AbstractC2743y a(java.lang.String r18, android.net.Uri r19) throws O2.C0897l1 {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K3.x.a(java.lang.String, android.net.Uri):s5.y");
    }

    public static Uri b(String str, Uri uri) {
        AbstractC1684a.a(((String) AbstractC1684a.e(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) AbstractC1684a.e(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        if (string.endsWith("/")) {
            return b0.e(string, str);
        }
        return b0.e(string + "/", str);
    }
}
