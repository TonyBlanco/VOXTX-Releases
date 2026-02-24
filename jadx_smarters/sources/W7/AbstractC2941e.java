package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.MediaPlayerProxy;

/* JADX INFO: renamed from: w7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2941e {
    public static long a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static void b(IMediaPlayer iMediaPlayer, int i9) {
        IjkMediaPlayer ijkMediaPlayerC = c(iMediaPlayer);
        if (ijkMediaPlayerC == null) {
            return;
        }
        ijkMediaPlayerC.deselectTrack(i9);
    }

    public static IjkMediaPlayer c(IMediaPlayer iMediaPlayer) {
        if (iMediaPlayer == null) {
            return null;
        }
        if (!(iMediaPlayer instanceof IjkMediaPlayer)) {
            if (!(iMediaPlayer instanceof MediaPlayerProxy)) {
                return null;
            }
            MediaPlayerProxy mediaPlayerProxy = (MediaPlayerProxy) iMediaPlayer;
            if (!(mediaPlayerProxy.getInternalMediaPlayer() instanceof IjkMediaPlayer)) {
                return null;
            }
            iMediaPlayer = mediaPlayerProxy.getInternalMediaPlayer();
        }
        return (IjkMediaPlayer) iMediaPlayer;
    }

    public static int d(IMediaPlayer iMediaPlayer, int i9) {
        IjkMediaPlayer ijkMediaPlayerC = c(iMediaPlayer);
        if (ijkMediaPlayerC == null) {
            return -1;
        }
        return ijkMediaPlayerC.getSelectedTrack(i9);
    }

    public static void e(IMediaPlayer iMediaPlayer, int i9) {
        IjkMediaPlayer ijkMediaPlayerC = c(iMediaPlayer);
        if (ijkMediaPlayerC == null) {
            return;
        }
        ijkMediaPlayerC.selectTrack(i9);
    }
}
