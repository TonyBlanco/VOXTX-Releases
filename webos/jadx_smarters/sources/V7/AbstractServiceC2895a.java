package v7;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: renamed from: v7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractServiceC2895a extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static IMediaPlayer f51472a;

    public static IMediaPlayer a() {
        return f51472a;
    }

    public static void b(Context context) {
        context.startService(c(context));
    }

    public static Intent c(Context context) {
        return new Intent(context, (Class<?>) AbstractServiceC2895a.class);
    }

    public static void d(IMediaPlayer iMediaPlayer) {
        IMediaPlayer iMediaPlayer2 = f51472a;
        if (iMediaPlayer2 != null && iMediaPlayer2 != iMediaPlayer) {
            if (iMediaPlayer2.isPlaying()) {
                f51472a.stop();
            }
            f51472a.release();
            f51472a = null;
        }
        f51472a = iMediaPlayer;
    }
}
