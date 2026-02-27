package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import a7.j;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.TextView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m7.w;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import u7.C2858a;
import v7.AbstractServiceC2895a;
import w7.C2937a;
import w7.InterfaceC2938b;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerMulti4 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f36856A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f36857B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences f36858C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f36859D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Context f36860E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2858a f36861F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f36862G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f36863H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f36864I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Activity f36865J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public NSTIJKPlayerMulti4 f36866K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public AudioManager f36867L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public i f36868M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public LiveStreamDBHandler f36869N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Context f36870O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f36871P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36872Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36873R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36874S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36875T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f36876U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a.InterfaceC0291a f36877V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public List f36878W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36879a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f36880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f36881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36882e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f36883e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36884f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f36885f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36886g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f36887g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.b f36888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IMediaPlayer f36889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f36903w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f36904x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f36905y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f36906z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = NSTIJKPlayerMulti4.this;
            nSTIJKPlayerMulti4.f36906z++;
            nSTIJKPlayerMulti4.K();
            w.P0(NSTIJKPlayerMulti4.this.f36865J, NSTIJKPlayerMulti4.this.f36865J.getResources().getString(j.f13262g5) + " (" + NSTIJKPlayerMulti4.this.f36906z + "/" + NSTIJKPlayerMulti4.this.f36856A + ")");
            NSTIJKPlayerMulti4.this.S();
            NSTIJKPlayerMulti4.this.start();
        }
    }

    public class b implements IMediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerMulti4.this.f36890j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti4.this.f36891k = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerMulti4.this.f36863H = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerMulti4.this.f36864I = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerMulti4.this.f36890j == 0 || NSTIJKPlayerMulti4.this.f36891k == 0) {
                return;
            }
            if (NSTIJKPlayerMulti4.this.f36862G != null) {
                NSTIJKPlayerMulti4.this.f36862G.c(NSTIJKPlayerMulti4.this.f36890j, NSTIJKPlayerMulti4.this.f36891k);
                NSTIJKPlayerMulti4.this.f36862G.a(NSTIJKPlayerMulti4.this.f36863H, NSTIJKPlayerMulti4.this.f36864I);
            }
            NSTIJKPlayerMulti4.this.requestLayout();
        }
    }

    public class c implements IMediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti4.this.f36884f = 2;
            if (NSTIJKPlayerMulti4.this.f36896p != null) {
                NSTIJKPlayerMulti4.this.f36896p.onPrepared(NSTIJKPlayerMulti4.this.f36889i);
            }
            NSTIJKPlayerMulti4.d(NSTIJKPlayerMulti4.this);
            NSTIJKPlayerMulti4.this.f36890j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti4.this.f36891k = iMediaPlayer.getVideoHeight();
            if (NSTIJKPlayerMulti4.this.f36890j == 0 || NSTIJKPlayerMulti4.this.f36891k == 0) {
                if (NSTIJKPlayerMulti4.this.f36886g == 3) {
                    NSTIJKPlayerMulti4.this.start();
                }
            } else if (NSTIJKPlayerMulti4.this.f36862G != null) {
                NSTIJKPlayerMulti4.this.f36862G.c(NSTIJKPlayerMulti4.this.f36890j, NSTIJKPlayerMulti4.this.f36891k);
                NSTIJKPlayerMulti4.this.f36862G.a(NSTIJKPlayerMulti4.this.f36863H, NSTIJKPlayerMulti4.this.f36864I);
                if ((!NSTIJKPlayerMulti4.this.f36862G.d() || (NSTIJKPlayerMulti4.this.f36892l == NSTIJKPlayerMulti4.this.f36890j && NSTIJKPlayerMulti4.this.f36893m == NSTIJKPlayerMulti4.this.f36891k)) && NSTIJKPlayerMulti4.this.f36886g == 3) {
                    NSTIJKPlayerMulti4.this.start();
                    NSTIJKPlayerMulti4.d(NSTIJKPlayerMulti4.this);
                }
            }
        }
    }

    public class d implements IMediaPlayer.OnCompletionListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti4.this.f36884f = 5;
            NSTIJKPlayerMulti4.this.f36886g = 5;
            NSTIJKPlayerMulti4.d(NSTIJKPlayerMulti4.this);
            NSTIJKPlayerMulti4.this.a0(-1);
            if (NSTIJKPlayerMulti4.this.f36895o != null) {
                NSTIJKPlayerMulti4.this.f36895o.onCompletion(NSTIJKPlayerMulti4.this.f36889i);
            }
        }
    }

    public class e implements IMediaPlayer.OnInfoListener {
        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i9, int i10) {
            String str;
            String str2;
            if (NSTIJKPlayerMulti4.this.f36899s != null) {
                NSTIJKPlayerMulti4.this.f36899s.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerMulti4.this.a0(2);
                str = NSTIJKPlayerMulti4.this.f36879a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerMulti4.this.a0(1);
                str = NSTIJKPlayerMulti4.this.f36879a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerMulti4.this.f36879a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerMulti4.this.f36894n = i10;
                        Log.d(NSTIJKPlayerMulti4.this.f36879a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        if (NSTIJKPlayerMulti4.this.f36862G != null) {
                            NSTIJKPlayerMulti4.this.f36862G.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerMulti4.this.f36879a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerMulti4.this.a0(1);
                                str = NSTIJKPlayerMulti4.this.f36879a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerMulti4.this.a0(6);
                                str = NSTIJKPlayerMulti4.this.f36879a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerMulti4.this.f36879a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerMulti4.this.f36879a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerMulti4.this.f36879a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerMulti4.this.f36879a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerMulti4.this.f36879a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerMulti4.this.f36879a;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class f implements IMediaPlayer.OnErrorListener {
        public f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i9, int i10) {
            Log.d(NSTIJKPlayerMulti4.this.f36879a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerMulti4.this.f36884f = -1;
            NSTIJKPlayerMulti4.this.f36886g = -1;
            NSTIJKPlayerMulti4.d(NSTIJKPlayerMulti4.this);
            NSTIJKPlayerMulti4.this.a0(-1);
            if (NSTIJKPlayerMulti4.this.f36898r != null) {
                NSTIJKPlayerMulti4.this.f36898r.onError(NSTIJKPlayerMulti4.this.f36889i, i9, i10);
            }
            return true;
        }
    }

    public class g implements IMediaPlayer.OnBufferingUpdateListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerMulti4.this.f36897q = i9;
        }
    }

    public class h implements a.InterfaceC0291a {
        public h() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            if (bVar.a() != NSTIJKPlayerMulti4.this.f36862G) {
                Log.e(NSTIJKPlayerMulti4.this.f36879a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti4.this.f36892l = i10;
            NSTIJKPlayerMulti4.this.f36893m = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerMulti4.this.f36886g == 3;
            if (!NSTIJKPlayerMulti4.this.f36862G.d() || (NSTIJKPlayerMulti4.this.f36890j == i10 && NSTIJKPlayerMulti4.this.f36891k == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerMulti4.this.f36889i != null && z10 && z9) {
                if (NSTIJKPlayerMulti4.this.f36900t != 0) {
                    NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = NSTIJKPlayerMulti4.this;
                    nSTIJKPlayerMulti4.seekTo(nSTIJKPlayerMulti4.f36900t);
                }
                NSTIJKPlayerMulti4.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            if (bVar.a() != NSTIJKPlayerMulti4.this.f36862G) {
                Log.e(NSTIJKPlayerMulti4.this.f36879a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti4.this.f36888h = bVar;
            if (NSTIJKPlayerMulti4.this.f36889i == null) {
                NSTIJKPlayerMulti4.this.S();
            } else {
                NSTIJKPlayerMulti4 nSTIJKPlayerMulti4 = NSTIJKPlayerMulti4.this;
                nSTIJKPlayerMulti4.H(nSTIJKPlayerMulti4.f36889i, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            if (bVar.a() != NSTIJKPlayerMulti4.this.f36862G) {
                Log.e(NSTIJKPlayerMulti4.this.f36879a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerMulti4.this.f36888h = null;
                NSTIJKPlayerMulti4.this.U();
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f36915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f36916b;

        public i(Activity activity) {
            this.f36915a = activity;
        }

        public i a() {
            View view = this.f36916b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public i b(int i9) {
            this.f36916b = this.f36915a.findViewById(i9);
            return this;
        }

        public i c() {
            View view = this.f36916b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public i d(CharSequence charSequence) {
            View view = this.f36916b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public i e() {
            View view = this.f36916b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36879a = "NSTIJKPlayerMulti4";
        this.f36882e = 0;
        this.f36884f = 0;
        this.f36886g = 0;
        this.f36888h = null;
        this.f36889i = null;
        this.f36901u = true;
        this.f36902v = true;
        this.f36903w = true;
        this.f36906z = 0;
        this.f36856A = 5;
        this.f36857B = false;
        this.f36871P = new b();
        this.f36872Q = new c();
        this.f36873R = new d();
        this.f36874S = new e();
        this.f36875T = new f();
        this.f36876U = new g();
        this.f36877V = new h();
        this.f36878W = new ArrayList();
        this.f36883e0 = 0;
        this.f36885f0 = 0;
        this.f36887g0 = false;
        O(context);
    }

    public static /* synthetic */ InterfaceC2938b d(NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
        nSTIJKPlayerMulti4.getClass();
        return null;
    }

    public final void G() {
    }

    public final void H(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer I(int r10) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti4.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J() {
        AbstractServiceC2895a.d(this.f36889i);
    }

    public final void K() {
        this.f36868M.b(a7.f.f12126E).a();
        this.f36868M.b(a7.f.f12176J).a();
        L();
    }

    public void L() {
        this.f36868M.b(a7.f.f12266S).a();
        this.f36868M.b(a7.f.f12515r2).a();
        this.f36868M.b(a7.f.V9).a();
        this.f36904x.removeCallbacksAndMessages(null);
    }

    public final void M() {
        boolean zP = this.f36861F.p();
        this.f36887g0 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f36889i = AbstractServiceC2895a.a();
        }
    }

    public final void N() {
        this.f36878W.clear();
        if (this.f36861F.s()) {
            this.f36878W.add(1);
        }
        if (this.f36861F.t()) {
            this.f36878W.add(2);
        }
        if (this.f36861F.r()) {
            this.f36878W.add(0);
        }
        if (this.f36878W.isEmpty()) {
            this.f36878W.add(1);
        }
        int iIntValue = ((Integer) this.f36878W.get(this.f36883e0)).intValue();
        this.f36885f0 = iIntValue;
        setRender(iIntValue);
    }

    public final void O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36860E = applicationContext;
        this.f36861F = new C2858a(applicationContext);
        M();
        N();
        this.f36890j = 0;
        this.f36891k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f36884f = 0;
        this.f36886g = 0;
    }

    public boolean P() {
        return this.f36887g0;
    }

    public final boolean Q() {
        int i9;
        return (this.f36889i == null || (i9 = this.f36884f) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    public void R() {
        IMediaPlayer iMediaPlayer = this.f36889i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    public void S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f36880c == null || this.f36888h == null) {
            return;
        }
        T(false);
        try {
            ((AudioManager) this.f36860E.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        this.f36868M.b(a7.f.f12176J).a();
        try {
            IMediaPlayer iMediaPlayerI = I(this.f36861F.x());
            this.f36889i = iMediaPlayerI;
            iMediaPlayerI.setOnPreparedListener(this.f36872Q);
            this.f36889i.setOnVideoSizeChangedListener(this.f36871P);
            this.f36889i.setOnCompletionListener(this.f36873R);
            this.f36889i.setOnErrorListener(this.f36875T);
            this.f36889i.setOnInfoListener(this.f36874S);
            this.f36889i.setOnBufferingUpdateListener(this.f36876U);
            this.f36897q = 0;
            String scheme = this.f36880c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f36861F.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f36889i.setDataSource(new C2937a(new File(this.f36880c.toString())));
            } else {
                this.f36889i.setDataSource(this.f36860E, this.f36880c, this.f36881d);
            }
            H(this.f36889i, this.f36888h);
            this.f36889i.setAudioStreamType(3);
            this.f36889i.setScreenOnWhilePlaying(true);
            this.f36889i.prepareAsync();
            this.f36867L = (AudioManager) this.f36865J.getSystemService("audio");
            this.f36884f = 1;
        } catch (IOException e9) {
            Log.w(this.f36879a, "Unable to open content: " + this.f36880c, e9);
            this.f36884f = -1;
            this.f36886g = -1;
            onErrorListener = this.f36875T;
            onErrorListener.onError(this.f36889i, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f36879a, "Unable to open content: " + this.f36880c, e10);
            this.f36884f = -1;
            this.f36886g = -1;
            onErrorListener = this.f36875T;
            onErrorListener.onError(this.f36889i, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f36879a, "Unable to open content: " + this.f36880c, e11);
            this.f36884f = -1;
            this.f36886g = -1;
            onErrorListener = this.f36875T;
            onErrorListener.onError(this.f36889i, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f36879a, "Unable to open content: " + this.f36880c, e12);
            this.f36884f = -1;
            this.f36886g = -1;
            onErrorListener = this.f36875T;
            onErrorListener.onError(this.f36889i, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void T(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f36889i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f36889i.release();
            this.f36889i = null;
            this.f36884f = 0;
            if (z9) {
                this.f36886g = 0;
            }
            ((AudioManager) this.f36860E.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void U() {
        IMediaPlayer iMediaPlayer = this.f36889i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void V() {
        Handler handler = this.f36904x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void W(Activity activity, NSTIJKPlayerMulti4 nSTIJKPlayerMulti4) {
        this.f36865J = activity;
        this.f36866K = nSTIJKPlayerMulti4;
        this.f36904x = new Handler();
        this.f36868M = new i(activity);
    }

    public final void X(Uri uri, Map map, boolean z9, String str) {
        this.f36880c = uri;
        this.f36881d = map;
        this.f36900t = 0;
        this.f36905y = z9;
        c0();
        S();
        requestLayout();
        invalidate();
    }

    public void Y(Uri uri, boolean z9, String str) {
        X(uri, null, z9, str);
    }

    public final void Z(String str) {
        this.f36868M.b(a7.f.Mm).a();
        this.f36868M.b(a7.f.f12176J).e();
        this.f36868M.b(a7.f.f12216N).d(str);
    }

    public final void a0(int i9) {
        this.f36882e = i9;
        if (i9 == -1) {
            if (this.f36906z < this.f36856A) {
                this.f36857B = true;
                this.f36904x.postDelayed(new a(), 3000L);
                return;
            }
            K();
            this.f36880c = null;
            Z(this.f36865J.getResources().getString(j.f13214b7));
            c0();
            this.f36857B = false;
            return;
        }
        if (i9 == 1) {
            this.f36868M.b(a7.f.f12126E).e();
            return;
        }
        if (i9 == 3) {
            this.f36906z = 0;
            this.f36868M.b(a7.f.f12120D3).a();
            this.f36868M.b(a7.f.f12110C3).e();
            if (this.f36905y) {
                this.f36868M.b(a7.f.f12110C3).c();
            }
        } else {
            if (i9 != 6) {
                if (i9 != 2) {
                    if (i9 == 4) {
                        this.f36868M.b(a7.f.f12120D3).e();
                        this.f36868M.b(a7.f.f12110C3).a();
                        if (this.f36905y) {
                            this.f36868M.b(a7.f.f12120D3).c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f36906z = 0;
                this.f36868M.b(a7.f.f12176J).a();
                this.f36868M.b(a7.f.Mm).e();
                this.f36868M.b(a7.f.f12120D3).a();
                this.f36868M.b(a7.f.f12110C3).e();
                this.f36868M.b(a7.f.f12126E).a();
                if (this.f36865J.findViewById(a7.f.f12532t).isFocusable()) {
                    return;
                }
                R();
                return;
            }
            this.f36906z = 0;
            this.f36868M.b(a7.f.f12176J).a();
            this.f36868M.b(a7.f.Mm).e();
            this.f36868M.b(a7.f.f12120D3).a();
            this.f36868M.b(a7.f.f12110C3).e();
        }
        this.f36868M.b(a7.f.f12126E).a();
    }

    public void b0() {
        AbstractServiceC2895a.d(null);
    }

    public void c0() {
        IMediaPlayer iMediaPlayer = this.f36889i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f36889i.release();
            this.f36889i = null;
            this.f36884f = 0;
            this.f36886g = 0;
            ((AudioManager) this.f36860E.getSystemService("audio")).abandonAudioFocus(null);
            a.b bVar = this.f36888h;
            if (bVar == null || bVar.c() == null) {
                return;
            }
            this.f36888h.c().setFormat(-2);
            this.f36888h.c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f36901u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f36902v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f36903w;
    }

    public void d0() {
        IMediaPlayer iMediaPlayer = this.f36889i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f36889i != null) {
            return this.f36897q;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (Q()) {
            return (int) this.f36889i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (Q()) {
            return (int) this.f36889i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return Q() && (iMediaPlayer = this.f36889i) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 4 || i9 == 24 || i9 == 25 || i9 == 164 || i9 == 82 || i9 != 5) {
        }
        Q();
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (Q() && (iMediaPlayer = this.f36889i) != null && iMediaPlayer.isPlaying()) {
            this.f36889i.pause();
            this.f36884f = 4;
        }
        this.f36886g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (Q()) {
            this.f36889i.seekTo(i9);
            i9 = 0;
        }
        this.f36900t = i9;
    }

    public void setContext(Context context) {
        this.f36870O = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f36869N = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f36895o = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f36898r = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f36899s = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f36896p = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f36879a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f36889i != null) {
                cVar.getSurfaceHolder().b(this.f36889i);
                cVar.c(this.f36889i.getVideoWidth(), this.f36889i.getVideoHeight());
                cVar.a(this.f36889i.getVideoSarNum(), this.f36889i.getVideoSarDen());
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f36862G != null) {
            IMediaPlayer iMediaPlayer = this.f36889i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f36862G.getView();
            this.f36862G.b(this.f36877V);
            this.f36862G = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f36862G = aVar;
        this.f36858C = this.f36860E.getSharedPreferences("loginPrefs", 0);
        int i11 = this.f36890j;
        if (i11 > 0 && (i10 = this.f36891k) > 0) {
            aVar.c(i11, i10);
        }
        int i12 = this.f36863H;
        if (i12 > 0 && (i9 = this.f36864I) > 0) {
            aVar.a(i12, i9);
        }
        View view2 = this.f36862G.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f36862G.e(this.f36877V);
        this.f36862G.setVideoRotation(this.f36894n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (Q()) {
            this.f36889i.start();
            this.f36884f = 3;
        }
        this.f36886g = 3;
    }
}
