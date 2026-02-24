package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import o4.AbstractC2345w;
import o4.C2328e;
import p4.C2434i;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final C2775b log = new C2775b(TAG);

    private static C2434i getRemoteMediaClient(C2328e c2328e) {
        if (c2328e == null || !c2328e.c()) {
            return null;
        }
        return c2328e.r();
    }

    private void seek(C2328e c2328e, long j9) {
        C2434i remoteMediaClient;
        if (j9 == 0 || (remoteMediaClient = getRemoteMediaClient(c2328e)) == null || remoteMediaClient.s() || remoteMediaClient.w()) {
            return;
        }
        remoteMediaClient.R(remoteMediaClient.g() + j9);
    }

    private void togglePlayback(C2328e c2328e) {
        C2434i remoteMediaClient = getRemoteMediaClient(c2328e);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.W();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r10, android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaIntentReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void onReceiveActionForward(AbstractC2345w abstractC2345w, long j9) {
        if (abstractC2345w instanceof C2328e) {
            seek((C2328e) abstractC2345w, j9);
        }
    }

    public void onReceiveActionMediaButton(AbstractC2345w abstractC2345w, Intent intent) {
        KeyEvent keyEvent;
        if ((abstractC2345w instanceof C2328e) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) ((Bundle) r.m(intent.getExtras())).get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            togglePlayback((C2328e) abstractC2345w);
        }
    }

    public void onReceiveActionRewind(AbstractC2345w abstractC2345w, long j9) {
        if (abstractC2345w instanceof C2328e) {
            seek((C2328e) abstractC2345w, -j9);
        }
    }

    public void onReceiveActionSkipNext(AbstractC2345w abstractC2345w) {
        C2434i remoteMediaClient;
        if (!(abstractC2345w instanceof C2328e) || (remoteMediaClient = getRemoteMediaClient((C2328e) abstractC2345w)) == null || remoteMediaClient.w()) {
            return;
        }
        remoteMediaClient.J(null);
    }

    public void onReceiveActionSkipPrev(AbstractC2345w abstractC2345w) {
        C2434i remoteMediaClient;
        if (!(abstractC2345w instanceof C2328e) || (remoteMediaClient = getRemoteMediaClient((C2328e) abstractC2345w)) == null || remoteMediaClient.w()) {
            return;
        }
        remoteMediaClient.K(null);
    }

    public void onReceiveActionTogglePlayback(AbstractC2345w abstractC2345w) {
        if (abstractC2345w instanceof C2328e) {
            togglePlayback((C2328e) abstractC2345w);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
