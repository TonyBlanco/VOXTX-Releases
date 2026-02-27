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
public class NSTIJKPlayerMulti2 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f36732A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f36733B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences f36734C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f36735D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Context f36736E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2858a f36737F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f36738G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f36739H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f36740I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Activity f36741J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public NSTIJKPlayerMulti2 f36742K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public AudioManager f36743L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public i f36744M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public LiveStreamDBHandler f36745N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Context f36746O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f36747P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36748Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36749R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36750S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36751T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f36752U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a.InterfaceC0291a f36753V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public List f36754W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36755a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f36756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f36757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36758e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f36759e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36760f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f36761f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36762g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f36763g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.b f36764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IMediaPlayer f36765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36775s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36776t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36777u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36778v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f36779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f36780x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f36781y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f36782z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = NSTIJKPlayerMulti2.this;
            nSTIJKPlayerMulti2.f36782z++;
            nSTIJKPlayerMulti2.K();
            w.P0(NSTIJKPlayerMulti2.this.f36741J, NSTIJKPlayerMulti2.this.f36741J.getResources().getString(j.f13262g5) + " (" + NSTIJKPlayerMulti2.this.f36782z + "/" + NSTIJKPlayerMulti2.this.f36732A + ")");
            NSTIJKPlayerMulti2.this.S();
            NSTIJKPlayerMulti2.this.start();
        }
    }

    public class b implements IMediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerMulti2.this.f36766j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti2.this.f36767k = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerMulti2.this.f36739H = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerMulti2.this.f36740I = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerMulti2.this.f36766j == 0 || NSTIJKPlayerMulti2.this.f36767k == 0) {
                return;
            }
            if (NSTIJKPlayerMulti2.this.f36738G != null) {
                NSTIJKPlayerMulti2.this.f36738G.c(NSTIJKPlayerMulti2.this.f36766j, NSTIJKPlayerMulti2.this.f36767k);
                NSTIJKPlayerMulti2.this.f36738G.a(NSTIJKPlayerMulti2.this.f36739H, NSTIJKPlayerMulti2.this.f36740I);
            }
            NSTIJKPlayerMulti2.this.requestLayout();
        }
    }

    public class c implements IMediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti2.this.f36760f = 2;
            if (NSTIJKPlayerMulti2.this.f36772p != null) {
                NSTIJKPlayerMulti2.this.f36772p.onPrepared(NSTIJKPlayerMulti2.this.f36765i);
            }
            NSTIJKPlayerMulti2.d(NSTIJKPlayerMulti2.this);
            NSTIJKPlayerMulti2.this.f36766j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti2.this.f36767k = iMediaPlayer.getVideoHeight();
            if (NSTIJKPlayerMulti2.this.f36766j == 0 || NSTIJKPlayerMulti2.this.f36767k == 0) {
                if (NSTIJKPlayerMulti2.this.f36762g == 3) {
                    NSTIJKPlayerMulti2.this.start();
                }
            } else if (NSTIJKPlayerMulti2.this.f36738G != null) {
                NSTIJKPlayerMulti2.this.f36738G.c(NSTIJKPlayerMulti2.this.f36766j, NSTIJKPlayerMulti2.this.f36767k);
                NSTIJKPlayerMulti2.this.f36738G.a(NSTIJKPlayerMulti2.this.f36739H, NSTIJKPlayerMulti2.this.f36740I);
                if ((!NSTIJKPlayerMulti2.this.f36738G.d() || (NSTIJKPlayerMulti2.this.f36768l == NSTIJKPlayerMulti2.this.f36766j && NSTIJKPlayerMulti2.this.f36769m == NSTIJKPlayerMulti2.this.f36767k)) && NSTIJKPlayerMulti2.this.f36762g == 3) {
                    NSTIJKPlayerMulti2.this.start();
                    NSTIJKPlayerMulti2.d(NSTIJKPlayerMulti2.this);
                }
            }
        }
    }

    public class d implements IMediaPlayer.OnCompletionListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti2.this.f36760f = 5;
            NSTIJKPlayerMulti2.this.f36762g = 5;
            NSTIJKPlayerMulti2.d(NSTIJKPlayerMulti2.this);
            NSTIJKPlayerMulti2.this.a0(-1);
            if (NSTIJKPlayerMulti2.this.f36771o != null) {
                NSTIJKPlayerMulti2.this.f36771o.onCompletion(NSTIJKPlayerMulti2.this.f36765i);
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
            if (NSTIJKPlayerMulti2.this.f36775s != null) {
                NSTIJKPlayerMulti2.this.f36775s.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerMulti2.this.a0(2);
                str = NSTIJKPlayerMulti2.this.f36755a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerMulti2.this.a0(1);
                str = NSTIJKPlayerMulti2.this.f36755a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerMulti2.this.f36755a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerMulti2.this.f36770n = i10;
                        Log.d(NSTIJKPlayerMulti2.this.f36755a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        if (NSTIJKPlayerMulti2.this.f36738G != null) {
                            NSTIJKPlayerMulti2.this.f36738G.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerMulti2.this.f36755a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerMulti2.this.a0(1);
                                str = NSTIJKPlayerMulti2.this.f36755a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerMulti2.this.a0(6);
                                str = NSTIJKPlayerMulti2.this.f36755a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerMulti2.this.f36755a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerMulti2.this.f36755a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerMulti2.this.f36755a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerMulti2.this.f36755a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerMulti2.this.f36755a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerMulti2.this.f36755a;
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
            Log.d(NSTIJKPlayerMulti2.this.f36755a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerMulti2.this.f36760f = -1;
            NSTIJKPlayerMulti2.this.f36762g = -1;
            NSTIJKPlayerMulti2.d(NSTIJKPlayerMulti2.this);
            NSTIJKPlayerMulti2.this.a0(-1);
            if (NSTIJKPlayerMulti2.this.f36774r != null) {
                NSTIJKPlayerMulti2.this.f36774r.onError(NSTIJKPlayerMulti2.this.f36765i, i9, i10);
            }
            return true;
        }
    }

    public class g implements IMediaPlayer.OnBufferingUpdateListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerMulti2.this.f36773q = i9;
        }
    }

    public class h implements a.InterfaceC0291a {
        public h() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            if (bVar.a() != NSTIJKPlayerMulti2.this.f36738G) {
                Log.e(NSTIJKPlayerMulti2.this.f36755a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti2.this.f36768l = i10;
            NSTIJKPlayerMulti2.this.f36769m = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerMulti2.this.f36762g == 3;
            if (!NSTIJKPlayerMulti2.this.f36738G.d() || (NSTIJKPlayerMulti2.this.f36766j == i10 && NSTIJKPlayerMulti2.this.f36767k == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerMulti2.this.f36765i != null && z10 && z9) {
                if (NSTIJKPlayerMulti2.this.f36776t != 0) {
                    NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = NSTIJKPlayerMulti2.this;
                    nSTIJKPlayerMulti2.seekTo(nSTIJKPlayerMulti2.f36776t);
                }
                NSTIJKPlayerMulti2.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            if (bVar.a() != NSTIJKPlayerMulti2.this.f36738G) {
                Log.e(NSTIJKPlayerMulti2.this.f36755a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti2.this.f36764h = bVar;
            if (NSTIJKPlayerMulti2.this.f36765i == null) {
                NSTIJKPlayerMulti2.this.S();
            } else {
                NSTIJKPlayerMulti2 nSTIJKPlayerMulti2 = NSTIJKPlayerMulti2.this;
                nSTIJKPlayerMulti2.H(nSTIJKPlayerMulti2.f36765i, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            if (bVar.a() != NSTIJKPlayerMulti2.this.f36738G) {
                Log.e(NSTIJKPlayerMulti2.this.f36755a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerMulti2.this.f36764h = null;
                NSTIJKPlayerMulti2.this.U();
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f36791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f36792b;

        public i(Activity activity) {
            this.f36791a = activity;
        }

        public i a() {
            View view = this.f36792b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public i b(int i9) {
            this.f36792b = this.f36791a.findViewById(i9);
            return this;
        }

        public i c() {
            View view = this.f36792b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public i d(CharSequence charSequence) {
            View view = this.f36792b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public i e() {
            View view = this.f36792b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36755a = "NSTIJKPlayerMulti2";
        this.f36758e = 0;
        this.f36760f = 0;
        this.f36762g = 0;
        this.f36764h = null;
        this.f36765i = null;
        this.f36777u = true;
        this.f36778v = true;
        this.f36779w = true;
        this.f36782z = 0;
        this.f36732A = 5;
        this.f36733B = false;
        this.f36747P = new b();
        this.f36748Q = new c();
        this.f36749R = new d();
        this.f36750S = new e();
        this.f36751T = new f();
        this.f36752U = new g();
        this.f36753V = new h();
        this.f36754W = new ArrayList();
        this.f36759e0 = 0;
        this.f36761f0 = 0;
        this.f36763g0 = false;
        O(context);
    }

    public static /* synthetic */ InterfaceC2938b d(NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
        nSTIJKPlayerMulti2.getClass();
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti2.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J() {
        AbstractServiceC2895a.d(this.f36765i);
    }

    public final void K() {
        this.f36744M.b(a7.f.f12106C).a();
        this.f36744M.b(a7.f.f12156H).a();
        L();
    }

    public void L() {
        this.f36744M.b(a7.f.f12246Q).a();
        this.f36744M.b(a7.f.f12494p2).a();
        this.f36744M.b(a7.f.T9).a();
        this.f36780x.removeCallbacksAndMessages(null);
    }

    public final void M() {
        boolean zP = this.f36737F.p();
        this.f36763g0 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f36765i = AbstractServiceC2895a.a();
        }
    }

    public final void N() {
        this.f36754W.clear();
        if (this.f36737F.s()) {
            this.f36754W.add(1);
        }
        if (this.f36737F.t()) {
            this.f36754W.add(2);
        }
        if (this.f36737F.r()) {
            this.f36754W.add(0);
        }
        if (this.f36754W.isEmpty()) {
            this.f36754W.add(1);
        }
        int iIntValue = ((Integer) this.f36754W.get(this.f36759e0)).intValue();
        this.f36761f0 = iIntValue;
        setRender(iIntValue);
    }

    public final void O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36736E = applicationContext;
        this.f36737F = new C2858a(applicationContext);
        M();
        N();
        this.f36766j = 0;
        this.f36767k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f36760f = 0;
        this.f36762g = 0;
    }

    public boolean P() {
        return this.f36763g0;
    }

    public final boolean Q() {
        int i9;
        return (this.f36765i == null || (i9 = this.f36760f) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    public void R() {
        IMediaPlayer iMediaPlayer = this.f36765i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    public void S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f36756c == null || this.f36764h == null) {
            return;
        }
        T(false);
        ((AudioManager) this.f36736E.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        this.f36744M.b(a7.f.f12156H).a();
        try {
            IMediaPlayer iMediaPlayerI = I(this.f36737F.x());
            this.f36765i = iMediaPlayerI;
            iMediaPlayerI.setOnPreparedListener(this.f36748Q);
            this.f36765i.setOnVideoSizeChangedListener(this.f36747P);
            this.f36765i.setOnCompletionListener(this.f36749R);
            this.f36765i.setOnErrorListener(this.f36751T);
            this.f36765i.setOnInfoListener(this.f36750S);
            this.f36765i.setOnBufferingUpdateListener(this.f36752U);
            this.f36773q = 0;
            String scheme = this.f36756c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f36737F.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f36765i.setDataSource(new C2937a(new File(this.f36756c.toString())));
            } else {
                this.f36765i.setDataSource(this.f36736E, this.f36756c, this.f36757d);
            }
            H(this.f36765i, this.f36764h);
            this.f36765i.setAudioStreamType(3);
            this.f36765i.setScreenOnWhilePlaying(true);
            this.f36765i.prepareAsync();
            this.f36743L = (AudioManager) this.f36741J.getSystemService("audio");
            this.f36760f = 1;
        } catch (IOException e9) {
            Log.w(this.f36755a, "Unable to open content: " + this.f36756c, e9);
            this.f36760f = -1;
            this.f36762g = -1;
            onErrorListener = this.f36751T;
            onErrorListener.onError(this.f36765i, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f36755a, "Unable to open content: " + this.f36756c, e10);
            this.f36760f = -1;
            this.f36762g = -1;
            onErrorListener = this.f36751T;
            onErrorListener.onError(this.f36765i, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f36755a, "Unable to open content: " + this.f36756c, e11);
            this.f36760f = -1;
            this.f36762g = -1;
            onErrorListener = this.f36751T;
            onErrorListener.onError(this.f36765i, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f36755a, "Unable to open content: " + this.f36756c, e12);
            this.f36760f = -1;
            this.f36762g = -1;
            onErrorListener = this.f36751T;
            onErrorListener.onError(this.f36765i, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void T(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f36765i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f36765i.release();
            this.f36765i = null;
            this.f36760f = 0;
            if (z9) {
                this.f36762g = 0;
            }
            ((AudioManager) this.f36736E.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void U() {
        IMediaPlayer iMediaPlayer = this.f36765i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void V() {
        Handler handler = this.f36780x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void W(Activity activity, NSTIJKPlayerMulti2 nSTIJKPlayerMulti2) {
        this.f36741J = activity;
        this.f36742K = nSTIJKPlayerMulti2;
        this.f36780x = new Handler();
        this.f36744M = new i(activity);
    }

    public final void X(Uri uri, Map map, boolean z9, String str) {
        this.f36756c = uri;
        this.f36757d = map;
        this.f36776t = 0;
        this.f36781y = z9;
        c0();
        S();
        requestLayout();
        invalidate();
    }

    public void Y(Uri uri, boolean z9, String str) {
        X(uri, null, z9, str);
    }

    public final void Z(String str) {
        this.f36744M.b(a7.f.Km).a();
        this.f36744M.b(a7.f.f12156H).e();
        this.f36744M.b(a7.f.f12196L).d(str);
    }

    public final void a0(int i9) {
        this.f36758e = i9;
        if (i9 == -1) {
            if (this.f36782z < this.f36732A) {
                this.f36733B = true;
                this.f36780x.postDelayed(new a(), 3000L);
                return;
            }
            K();
            this.f36756c = null;
            Z(this.f36741J.getResources().getString(j.f13214b7));
            c0();
            this.f36733B = false;
            return;
        }
        if (i9 == 1) {
            this.f36744M.b(a7.f.f12106C).e();
            return;
        }
        if (i9 == 3) {
            this.f36782z = 0;
            this.f36744M.b(a7.f.f12120D3).a();
            this.f36744M.b(a7.f.f12110C3).e();
            if (this.f36781y) {
                this.f36744M.b(a7.f.f12110C3).c();
            }
        } else {
            if (i9 != 6) {
                if (i9 != 2) {
                    if (i9 == 4) {
                        this.f36744M.b(a7.f.f12120D3).e();
                        this.f36744M.b(a7.f.f12110C3).a();
                        if (this.f36781y) {
                            this.f36744M.b(a7.f.f12120D3).c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f36782z = 0;
                this.f36744M.b(a7.f.f12156H).a();
                this.f36744M.b(a7.f.Km).e();
                this.f36744M.b(a7.f.f12120D3).a();
                this.f36744M.b(a7.f.f12110C3).e();
                this.f36744M.b(a7.f.f12106C).a();
                if (this.f36741J.findViewById(a7.f.f12512r).isFocusable()) {
                    return;
                }
                R();
                return;
            }
            this.f36782z = 0;
            this.f36744M.b(a7.f.f12156H).a();
            this.f36744M.b(a7.f.Km).e();
            this.f36744M.b(a7.f.f12120D3).a();
            this.f36744M.b(a7.f.f12110C3).e();
        }
        this.f36744M.b(a7.f.f12106C).a();
    }

    public void b0() {
        AbstractServiceC2895a.d(null);
    }

    public void c0() {
        IMediaPlayer iMediaPlayer = this.f36765i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f36765i.release();
            this.f36765i = null;
            this.f36760f = 0;
            this.f36762g = 0;
            ((AudioManager) this.f36736E.getSystemService("audio")).abandonAudioFocus(null);
            a.b bVar = this.f36764h;
            if (bVar == null || bVar.c() == null) {
                return;
            }
            this.f36764h.c().setFormat(-2);
            this.f36764h.c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f36777u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f36778v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f36779w;
    }

    public void d0() {
        IMediaPlayer iMediaPlayer = this.f36765i;
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
        if (this.f36765i != null) {
            return this.f36773q;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (Q()) {
            return (int) this.f36765i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (Q()) {
            return (int) this.f36765i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return Q() && (iMediaPlayer = this.f36765i) != null && iMediaPlayer.isPlaying();
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
        if (Q() && (iMediaPlayer = this.f36765i) != null && iMediaPlayer.isPlaying()) {
            this.f36765i.pause();
            this.f36760f = 4;
        }
        this.f36762g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (Q()) {
            this.f36765i.seekTo(i9);
            i9 = 0;
        }
        this.f36776t = i9;
    }

    public void setContext(Context context) {
        this.f36746O = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f36745N = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f36771o = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f36774r = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f36775s = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f36772p = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f36755a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f36765i != null) {
                cVar.getSurfaceHolder().b(this.f36765i);
                cVar.c(this.f36765i.getVideoWidth(), this.f36765i.getVideoHeight());
                cVar.a(this.f36765i.getVideoSarNum(), this.f36765i.getVideoSarDen());
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f36738G != null) {
            IMediaPlayer iMediaPlayer = this.f36765i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f36738G.getView();
            this.f36738G.b(this.f36753V);
            this.f36738G = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f36738G = aVar;
        this.f36734C = this.f36736E.getSharedPreferences("loginPrefs", 0);
        int i11 = this.f36766j;
        if (i11 > 0 && (i10 = this.f36767k) > 0) {
            aVar.c(i11, i10);
        }
        int i12 = this.f36739H;
        if (i12 > 0 && (i9 = this.f36740I) > 0) {
            aVar.a(i12, i9);
        }
        View view2 = this.f36738G.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f36738G.e(this.f36753V);
        this.f36738G.setVideoRotation(this.f36770n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (Q()) {
            this.f36765i.start();
            this.f36760f = 3;
        }
        this.f36762g = 3;
    }
}
