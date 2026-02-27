package q4;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.zzbf;
import com.google.android.gms.internal.cast.zzdx;
import com.google.android.gms.internal.cast.zzdy;
import java.util.List;
import n4.C2281m;
import n4.C2284p;
import o4.AbstractC2342t;
import o4.C2325b;
import o4.C2326c;
import o4.C2346x;
import p4.C2426a;
import p4.C2431f;
import p4.C2433h;
import p4.C2434i;
import p4.X;
import t4.C2775b;
import x4.C2957a;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C2775b f46885w = new C2775b("MediaSessionManager");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2326c f46887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbf f46888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2346x f46889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2433h f46890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ComponentName f46891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComponentName f46892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2547b f46893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C2547b f46894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f46895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Handler f46896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f46897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2434i.a f46898m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2434i f46899n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CastDevice f46900o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MediaSessionCompat f46901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MediaSessionCompat.Callback f46902q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f46903r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f46904s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f46905t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f46906u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f46907v;

    /* JADX WARN: Multi-variable type inference failed */
    public w(Context context, C2326c c2326c, zzbf zzbfVar) {
        this.f46886a = context;
        this.f46887b = c2326c;
        this.f46888c = zzbfVar;
        C2325b c2325bD = C2325b.d();
        Object[] objArr = 0;
        this.f46889d = c2325bD != null ? c2325bD.c() : null;
        C2426a c2426aH = c2326c.H();
        this.f46890e = c2426aH == null ? null : c2426aH.L();
        this.f46898m = new v(this, objArr == true ? 1 : 0);
        String strH = c2426aH == null ? null : c2426aH.H();
        this.f46891f = !TextUtils.isEmpty(strH) ? new ComponentName(context, strH) : null;
        String strJ = c2426aH == null ? null : c2426aH.J();
        this.f46892g = !TextUtils.isEmpty(strJ) ? new ComponentName(context, strJ) : null;
        C2547b c2547b = new C2547b(context);
        this.f46893h = c2547b;
        c2547b.c(new r(this));
        C2547b c2547b2 = new C2547b(context);
        this.f46894i = c2547b2;
        c2547b2.c(new s(this));
        this.f46896k = new zzdy(Looper.getMainLooper());
        this.f46895j = p.e(c2326c) ? new p(context) : null;
        this.f46897l = new Runnable() { // from class: q4.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f46880a.j();
            }
        };
    }

    public static final boolean v(String str) {
        return TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT);
    }

    public final void h(C2434i c2434i, CastDevice castDevice) {
        AudioManager audioManager;
        C2326c c2326c = this.f46887b;
        C2426a c2426aH = c2326c == null ? null : c2326c.H();
        if (this.f46903r || this.f46887b == null || c2426aH == null || this.f46890e == null || c2434i == null || castDevice == null || this.f46892g == null) {
            f46885w.a("skip attaching media session", new Object[0]);
            return;
        }
        this.f46899n = c2434i;
        c2434i.N(this.f46898m);
        this.f46900o = castDevice;
        if (!C4.m.f() && (audioManager = (AudioManager) this.f46886a.getSystemService("audio")) != null) {
            audioManager.requestAudioFocus(null, 3, 3);
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(this.f46892g);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f46886a, 0, intent, zzdx.zza);
        if (c2426aH.K()) {
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this.f46886a, "CastMediaSession", this.f46892g, broadcast);
            this.f46901p = mediaSessionCompat;
            u(0, null);
            CastDevice castDevice2 = this.f46900o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.J())) {
                mediaSessionCompat.setMetadata(new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST, this.f46886a.getResources().getString(AbstractC2342t.f46000b, this.f46900o.J())).build());
            }
            t tVar = new t(this);
            this.f46902q = tVar;
            mediaSessionCompat.setCallback(tVar);
            mediaSessionCompat.setActive(true);
            this.f46888c.zzr(mediaSessionCompat);
        }
        this.f46903r = true;
        l(false);
    }

    public final void i(int i9) {
        AudioManager audioManager;
        if (this.f46903r) {
            this.f46903r = false;
            C2434i c2434i = this.f46899n;
            if (c2434i != null) {
                c2434i.X(this.f46898m);
            }
            if (!C4.m.f() && (audioManager = (AudioManager) this.f46886a.getSystemService("audio")) != null) {
                audioManager.abandonAudioFocus(null);
            }
            this.f46888c.zzr(null);
            C2547b c2547b = this.f46893h;
            if (c2547b != null) {
                c2547b.a();
            }
            C2547b c2547b2 = this.f46894i;
            if (c2547b2 != null) {
                c2547b2.a();
            }
            MediaSessionCompat mediaSessionCompat = this.f46901p;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setCallback(null);
                this.f46901p.setMetadata(new MediaMetadataCompat.Builder().build());
                u(0, null);
            }
            MediaSessionCompat mediaSessionCompat2 = this.f46901p;
            if (mediaSessionCompat2 != null) {
                mediaSessionCompat2.setActive(false);
                this.f46901p.release();
                this.f46901p = null;
            }
            this.f46899n = null;
            this.f46900o = null;
            this.f46902q = null;
            s();
            if (i9 == 0) {
                t();
            }
        }
    }

    public final /* synthetic */ void j() {
        r(false);
    }

    public final void k(CastDevice castDevice) {
        f46885w.e("update Cast device to %s", castDevice);
        this.f46900o = castDevice;
        l(false);
    }

    public final void l(boolean z9) {
        C2284p c2284pI;
        C2434i c2434i = this.f46899n;
        if (c2434i == null) {
            return;
        }
        int iY = c2434i.Y();
        MediaInfo mediaInfoJ = c2434i.j();
        if (c2434i.t() && (c2284pI = c2434i.i()) != null && c2284pI.L() != null) {
            mediaInfoJ = c2284pI.L();
        }
        u(iY, mediaInfoJ);
        if (!c2434i.q()) {
            s();
            t();
        } else if (iY != 0) {
            p pVar = this.f46895j;
            if (pVar != null) {
                f46885w.a("Update media notification.", new Object[0]);
                pVar.d(this.f46900o, this.f46899n, this.f46901p, z9);
            }
            if (c2434i.t()) {
                return;
            }
            r(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(java.lang.String r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -945151566(0xffffffffc7aa21b2, float:-87107.39)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = -945080078(0xffffffffc7ab38f2, float:-87665.89)
            if (r0 == r1) goto L20
            r1 = 235550565(0xe0a3765, float:1.7036485E-30)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 0
            goto L35
        L20:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 1
            goto L35
        L2a:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 2
            goto L35
        L34:
            r5 = -1
        L35:
            if (r5 == 0) goto L61
            r0 = 0
            if (r5 == r3) goto L51
            if (r5 == r2) goto L3e
            goto L6d
        L3e:
            p4.i r5 = r4.f46899n
            if (r5 == 0) goto L4b
            boolean r5 = r5.o0()
            if (r5 == 0) goto L4b
            r0 = 32
            goto L6d
        L4b:
            java.lang.String r5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
        L4d:
            r7.putBoolean(r5, r3)
            return r0
        L51:
            p4.i r5 = r4.f46899n
            if (r5 == 0) goto L5e
            boolean r5 = r5.p0()
            if (r5 == 0) goto L5e
            r0 = 16
            goto L6d
        L5e:
            java.lang.String r5 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            goto L4d
        L61:
            r5 = 3
            if (r6 != r5) goto L69
            r6 = 514(0x202, double:2.54E-321)
            r0 = r6
            r6 = 3
            goto L6b
        L69:
            r0 = 512(0x200, double:2.53E-321)
        L6b:
            if (r6 == r2) goto L6e
        L6d:
            return r0
        L6e:
            r5 = 516(0x204, double:2.55E-321)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.w.m(java.lang.String, int, android.os.Bundle):long");
    }

    public final Uri n(C2281m c2281m, int i9) {
        C2426a c2426aH = this.f46887b.H();
        if (c2426aH != null) {
            c2426aH.I();
        }
        C2957a c2957a = c2281m.L() ? (C2957a) c2281m.H().get(0) : null;
        if (c2957a == null) {
            return null;
        }
        return c2957a.H();
    }

    public final MediaMetadataCompat.Builder o() {
        MediaSessionCompat mediaSessionCompat = this.f46901p;
        MediaMetadataCompat metadata = mediaSessionCompat == null ? null : mediaSessionCompat.getController().getMetadata();
        return metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
    }

    public final void p(Bitmap bitmap, int i9) {
        MediaSessionCompat mediaSessionCompat = this.f46901p;
        if (mediaSessionCompat == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        mediaSessionCompat.setMetadata(o().putBitmap(i9 == 0 ? MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON : MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmap).build());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.support.v4.media.session.PlaybackStateCompat.Builder r9, java.lang.String r10, p4.C2431f r11) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.w.q(android.support.v4.media.session.PlaybackStateCompat$Builder, java.lang.String, p4.f):void");
    }

    public final void r(boolean z9) {
        if (this.f46887b.I()) {
            Runnable runnable = this.f46897l;
            if (runnable != null) {
                this.f46896k.removeCallbacks(runnable);
            }
            Intent intent = new Intent(this.f46886a, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f46886a.getPackageName());
            try {
                this.f46886a.startService(intent);
            } catch (IllegalStateException unused) {
                if (z9) {
                    this.f46896k.postDelayed(this.f46897l, 1000L);
                }
            }
        }
    }

    public final void s() {
        p pVar = this.f46895j;
        if (pVar != null) {
            f46885w.a("Stopping media notification.", new Object[0]);
            pVar.c();
        }
    }

    public final void t() {
        if (this.f46887b.I()) {
            this.f46896k.removeCallbacks(this.f46897l);
            Intent intent = new Intent(this.f46886a, (Class<?>) ReconnectionService.class);
            intent.setPackage(this.f46886a.getPackageName());
            this.f46886a.stopService(intent);
        }
    }

    public final void u(int i9, MediaInfo mediaInfo) {
        MediaSessionCompat mediaSessionCompat;
        C2281m c2281mQ;
        PendingIntent activity;
        MediaSessionCompat mediaSessionCompat2 = this.f46901p;
        if (mediaSessionCompat2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        PlaybackStateCompat.Builder builder = new PlaybackStateCompat.Builder();
        C2434i c2434i = this.f46899n;
        if (c2434i != null && this.f46895j != null) {
            builder.setState(i9, (c2434i.Y() == 0 || c2434i.s()) ? 0L : c2434i.g(), 1.0f);
            if (i9 != 0) {
                C2433h c2433h = this.f46890e;
                X xM0 = c2433h != null ? c2433h.m0() : null;
                C2434i c2434i2 = this.f46899n;
                long jM = (c2434i2 == null || c2434i2.s() || this.f46899n.w()) ? 0L : 256L;
                if (xM0 != null) {
                    List<C2431f> listF = x.f(xM0);
                    if (listF != null) {
                        for (C2431f c2431f : listF) {
                            String strH = c2431f.H();
                            if (v(strH)) {
                                jM |= m(strH, i9, bundle);
                            } else {
                                q(builder, strH, c2431f);
                            }
                        }
                    }
                } else {
                    C2433h c2433h2 = this.f46890e;
                    if (c2433h2 != null) {
                        for (String str : c2433h2.H()) {
                            if (v(str)) {
                                jM |= m(str, i9, bundle);
                            } else {
                                q(builder, str, null);
                            }
                        }
                    }
                }
                builder = builder.setActions(jM);
            }
        }
        mediaSessionCompat2.setPlaybackState(builder.build());
        C2433h c2433h3 = this.f46890e;
        if (c2433h3 != null && c2433h3.p0()) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        C2433h c2433h4 = this.f46890e;
        if (c2433h4 != null && c2433h4.o0()) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            mediaSessionCompat2.setExtras(bundle);
        }
        if (i9 == 0) {
            mediaSessionCompat2.setMetadata(new MediaMetadataCompat.Builder().build());
            return;
        }
        if (this.f46899n != null) {
            if (this.f46891f == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.f46891f);
                activity = PendingIntent.getActivity(this.f46886a, 0, intent, zzdx.zza | 134217728);
            }
            if (activity != null) {
                mediaSessionCompat2.setSessionActivity(activity);
            }
        }
        if (this.f46899n == null || (mediaSessionCompat = this.f46901p) == null || mediaInfo == null || (c2281mQ = mediaInfo.Q()) == null) {
            return;
        }
        C2434i c2434i3 = this.f46899n;
        long jS = (c2434i3 == null || !c2434i3.s()) ? mediaInfo.S() : 0L;
        String strJ = c2281mQ.J("com.google.android.gms.cast.metadata.TITLE");
        String strJ2 = c2281mQ.J("com.google.android.gms.cast.metadata.SUBTITLE");
        MediaMetadataCompat.Builder builderPutLong = o().putLong(MediaMetadataCompat.METADATA_KEY_DURATION, jS);
        if (strJ != null) {
            builderPutLong.putString(MediaMetadataCompat.METADATA_KEY_TITLE, strJ);
            builderPutLong.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE, strJ);
        }
        if (strJ2 != null) {
            builderPutLong.putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_SUBTITLE, strJ2);
        }
        mediaSessionCompat.setMetadata(builderPutLong.build());
        Uri uriN = n(c2281mQ, 0);
        if (uriN != null) {
            this.f46893h.d(uriN);
        } else {
            p(null, 0);
        }
        Uri uriN2 = n(c2281mQ, 3);
        if (uriN2 != null) {
            this.f46894i.d(uriN2);
        } else {
            p(null, 3);
        }
    }
}
