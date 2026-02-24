package d;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.os.Build;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: d.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC1645x extends Service {

    /* JADX INFO: renamed from: d.x$a */
    public static class a {
        public static int a() {
            return IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        }
    }

    public static ServiceInfo a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1645x.class), Build.VERSION.SDK_INT >= 24 ? a.a() | 128 : 640);
    }
}
