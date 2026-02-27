package p4;

import android.net.Uri;
import com.google.android.gms.cast.MediaInfo;
import n4.C2281m;
import x4.C2957a;

/* JADX INFO: renamed from: p4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2430e {
    public static Uri a(MediaInfo mediaInfo, int i9) {
        C2281m c2281mQ;
        if (mediaInfo == null || (c2281mQ = mediaInfo.Q()) == null || c2281mQ.H() == null || c2281mQ.H().size() <= i9) {
            return null;
        }
        return ((C2957a) c2281mQ.H().get(i9)).H();
    }
}
