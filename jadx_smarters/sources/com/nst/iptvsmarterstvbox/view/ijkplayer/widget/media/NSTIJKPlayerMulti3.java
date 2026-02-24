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
public class NSTIJKPlayerMulti3 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f36794A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f36795B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences f36796C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f36797D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Context f36798E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2858a f36799F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f36800G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f36801H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f36802I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Activity f36803J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public NSTIJKPlayerMulti3 f36804K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public AudioManager f36805L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public i f36806M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public LiveStreamDBHandler f36807N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Context f36808O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f36809P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36810Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36811R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36812S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36813T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f36814U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a.InterfaceC0291a f36815V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public List f36816W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36817a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f36818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f36819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36820e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f36821e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36822f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f36823f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36824g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f36825g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.b f36826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IMediaPlayer f36827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36828j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36829k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36830l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36831m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36832n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36833o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36834p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36835q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36836r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36837s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36838t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36839u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36840v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f36841w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f36842x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f36843y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f36844z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = NSTIJKPlayerMulti3.this;
            nSTIJKPlayerMulti3.f36844z++;
            nSTIJKPlayerMulti3.K();
            w.P0(NSTIJKPlayerMulti3.this.f36803J, NSTIJKPlayerMulti3.this.f36803J.getResources().getString(j.f13262g5) + " (" + NSTIJKPlayerMulti3.this.f36844z + "/" + NSTIJKPlayerMulti3.this.f36794A + ")");
            NSTIJKPlayerMulti3.this.S();
            NSTIJKPlayerMulti3.this.start();
        }
    }

    public class b implements IMediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerMulti3.this.f36828j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti3.this.f36829k = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerMulti3.this.f36801H = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerMulti3.this.f36802I = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerMulti3.this.f36828j == 0 || NSTIJKPlayerMulti3.this.f36829k == 0) {
                return;
            }
            if (NSTIJKPlayerMulti3.this.f36800G != null) {
                NSTIJKPlayerMulti3.this.f36800G.c(NSTIJKPlayerMulti3.this.f36828j, NSTIJKPlayerMulti3.this.f36829k);
                NSTIJKPlayerMulti3.this.f36800G.a(NSTIJKPlayerMulti3.this.f36801H, NSTIJKPlayerMulti3.this.f36802I);
            }
            NSTIJKPlayerMulti3.this.requestLayout();
        }
    }

    public class c implements IMediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti3.this.f36822f = 2;
            if (NSTIJKPlayerMulti3.this.f36834p != null) {
                NSTIJKPlayerMulti3.this.f36834p.onPrepared(NSTIJKPlayerMulti3.this.f36827i);
            }
            NSTIJKPlayerMulti3.d(NSTIJKPlayerMulti3.this);
            NSTIJKPlayerMulti3.this.f36828j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti3.this.f36829k = iMediaPlayer.getVideoHeight();
            if (NSTIJKPlayerMulti3.this.f36828j == 0 || NSTIJKPlayerMulti3.this.f36829k == 0) {
                if (NSTIJKPlayerMulti3.this.f36824g == 3) {
                    NSTIJKPlayerMulti3.this.start();
                }
            } else if (NSTIJKPlayerMulti3.this.f36800G != null) {
                NSTIJKPlayerMulti3.this.f36800G.c(NSTIJKPlayerMulti3.this.f36828j, NSTIJKPlayerMulti3.this.f36829k);
                NSTIJKPlayerMulti3.this.f36800G.a(NSTIJKPlayerMulti3.this.f36801H, NSTIJKPlayerMulti3.this.f36802I);
                if ((!NSTIJKPlayerMulti3.this.f36800G.d() || (NSTIJKPlayerMulti3.this.f36830l == NSTIJKPlayerMulti3.this.f36828j && NSTIJKPlayerMulti3.this.f36831m == NSTIJKPlayerMulti3.this.f36829k)) && NSTIJKPlayerMulti3.this.f36824g == 3) {
                    NSTIJKPlayerMulti3.this.start();
                    NSTIJKPlayerMulti3.d(NSTIJKPlayerMulti3.this);
                }
            }
        }
    }

    public class d implements IMediaPlayer.OnCompletionListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti3.this.f36822f = 5;
            NSTIJKPlayerMulti3.this.f36824g = 5;
            NSTIJKPlayerMulti3.d(NSTIJKPlayerMulti3.this);
            NSTIJKPlayerMulti3.this.a0(-1);
            if (NSTIJKPlayerMulti3.this.f36833o != null) {
                NSTIJKPlayerMulti3.this.f36833o.onCompletion(NSTIJKPlayerMulti3.this.f36827i);
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
            if (NSTIJKPlayerMulti3.this.f36837s != null) {
                NSTIJKPlayerMulti3.this.f36837s.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerMulti3.this.a0(2);
                str = NSTIJKPlayerMulti3.this.f36817a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerMulti3.this.a0(1);
                str = NSTIJKPlayerMulti3.this.f36817a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerMulti3.this.f36817a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerMulti3.this.f36832n = i10;
                        Log.d(NSTIJKPlayerMulti3.this.f36817a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        if (NSTIJKPlayerMulti3.this.f36800G != null) {
                            NSTIJKPlayerMulti3.this.f36800G.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerMulti3.this.f36817a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerMulti3.this.a0(1);
                                str = NSTIJKPlayerMulti3.this.f36817a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerMulti3.this.a0(6);
                                str = NSTIJKPlayerMulti3.this.f36817a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerMulti3.this.f36817a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerMulti3.this.f36817a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerMulti3.this.f36817a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerMulti3.this.f36817a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerMulti3.this.f36817a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerMulti3.this.f36817a;
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
            Log.d(NSTIJKPlayerMulti3.this.f36817a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerMulti3.this.f36822f = -1;
            NSTIJKPlayerMulti3.this.f36824g = -1;
            NSTIJKPlayerMulti3.d(NSTIJKPlayerMulti3.this);
            NSTIJKPlayerMulti3.this.a0(-1);
            if (NSTIJKPlayerMulti3.this.f36836r != null) {
                NSTIJKPlayerMulti3.this.f36836r.onError(NSTIJKPlayerMulti3.this.f36827i, i9, i10);
            }
            return true;
        }
    }

    public class g implements IMediaPlayer.OnBufferingUpdateListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerMulti3.this.f36835q = i9;
        }
    }

    public class h implements a.InterfaceC0291a {
        public h() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            if (bVar.a() != NSTIJKPlayerMulti3.this.f36800G) {
                Log.e(NSTIJKPlayerMulti3.this.f36817a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti3.this.f36830l = i10;
            NSTIJKPlayerMulti3.this.f36831m = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerMulti3.this.f36824g == 3;
            if (!NSTIJKPlayerMulti3.this.f36800G.d() || (NSTIJKPlayerMulti3.this.f36828j == i10 && NSTIJKPlayerMulti3.this.f36829k == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerMulti3.this.f36827i != null && z10 && z9) {
                if (NSTIJKPlayerMulti3.this.f36838t != 0) {
                    NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = NSTIJKPlayerMulti3.this;
                    nSTIJKPlayerMulti3.seekTo(nSTIJKPlayerMulti3.f36838t);
                }
                NSTIJKPlayerMulti3.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            if (bVar.a() != NSTIJKPlayerMulti3.this.f36800G) {
                Log.e(NSTIJKPlayerMulti3.this.f36817a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti3.this.f36826h = bVar;
            if (NSTIJKPlayerMulti3.this.f36827i == null) {
                NSTIJKPlayerMulti3.this.S();
            } else {
                NSTIJKPlayerMulti3 nSTIJKPlayerMulti3 = NSTIJKPlayerMulti3.this;
                nSTIJKPlayerMulti3.H(nSTIJKPlayerMulti3.f36827i, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            if (bVar.a() != NSTIJKPlayerMulti3.this.f36800G) {
                Log.e(NSTIJKPlayerMulti3.this.f36817a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerMulti3.this.f36826h = null;
                NSTIJKPlayerMulti3.this.U();
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f36853a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f36854b;

        public i(Activity activity) {
            this.f36853a = activity;
        }

        public i a() {
            View view = this.f36854b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public i b(int i9) {
            this.f36854b = this.f36853a.findViewById(i9);
            return this;
        }

        public i c() {
            View view = this.f36854b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public i d(CharSequence charSequence) {
            View view = this.f36854b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public i e() {
            View view = this.f36854b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36817a = "NSTIJKPlayerMulti3";
        this.f36820e = 0;
        this.f36822f = 0;
        this.f36824g = 0;
        this.f36826h = null;
        this.f36827i = null;
        this.f36839u = true;
        this.f36840v = true;
        this.f36841w = true;
        this.f36844z = 0;
        this.f36794A = 5;
        this.f36795B = false;
        this.f36809P = new b();
        this.f36810Q = new c();
        this.f36811R = new d();
        this.f36812S = new e();
        this.f36813T = new f();
        this.f36814U = new g();
        this.f36815V = new h();
        this.f36816W = new ArrayList();
        this.f36821e0 = 0;
        this.f36823f0 = 0;
        this.f36825g0 = false;
        O(context);
    }

    public static /* synthetic */ InterfaceC2938b d(NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
        nSTIJKPlayerMulti3.getClass();
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti3.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J() {
        AbstractServiceC2895a.d(this.f36827i);
    }

    public final void K() {
        this.f36806M.b(a7.f.f12116D).a();
        this.f36806M.b(a7.f.f12166I).a();
        L();
    }

    public void L() {
        this.f36806M.b(a7.f.f12256R).a();
        this.f36806M.b(a7.f.f12505q2).a();
        this.f36806M.b(a7.f.U9).a();
        this.f36842x.removeCallbacksAndMessages(null);
    }

    public final void M() {
        boolean zP = this.f36799F.p();
        this.f36825g0 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f36827i = AbstractServiceC2895a.a();
        }
    }

    public final void N() {
        this.f36816W.clear();
        if (this.f36799F.s()) {
            this.f36816W.add(1);
        }
        if (this.f36799F.t()) {
            this.f36816W.add(2);
        }
        if (this.f36799F.r()) {
            this.f36816W.add(0);
        }
        if (this.f36816W.isEmpty()) {
            this.f36816W.add(1);
        }
        int iIntValue = ((Integer) this.f36816W.get(this.f36821e0)).intValue();
        this.f36823f0 = iIntValue;
        setRender(iIntValue);
    }

    public final void O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36798E = applicationContext;
        this.f36799F = new C2858a(applicationContext);
        M();
        N();
        this.f36828j = 0;
        this.f36829k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f36822f = 0;
        this.f36824g = 0;
    }

    public boolean P() {
        return this.f36825g0;
    }

    public final boolean Q() {
        int i9;
        return (this.f36827i == null || (i9 = this.f36822f) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    public void R() {
        IMediaPlayer iMediaPlayer = this.f36827i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    public void S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f36818c == null || this.f36826h == null) {
            return;
        }
        T(false);
        try {
            ((AudioManager) this.f36798E.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        this.f36806M.b(a7.f.f12166I).a();
        try {
            IMediaPlayer iMediaPlayerI = I(this.f36799F.x());
            this.f36827i = iMediaPlayerI;
            iMediaPlayerI.setOnPreparedListener(this.f36810Q);
            this.f36827i.setOnVideoSizeChangedListener(this.f36809P);
            this.f36827i.setOnCompletionListener(this.f36811R);
            this.f36827i.setOnErrorListener(this.f36813T);
            this.f36827i.setOnInfoListener(this.f36812S);
            this.f36827i.setOnBufferingUpdateListener(this.f36814U);
            this.f36835q = 0;
            String scheme = this.f36818c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f36799F.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f36827i.setDataSource(new C2937a(new File(this.f36818c.toString())));
            } else {
                this.f36827i.setDataSource(this.f36798E, this.f36818c, this.f36819d);
            }
            H(this.f36827i, this.f36826h);
            this.f36827i.setAudioStreamType(3);
            this.f36827i.setScreenOnWhilePlaying(true);
            this.f36827i.prepareAsync();
            this.f36805L = (AudioManager) this.f36803J.getSystemService("audio");
            this.f36822f = 1;
        } catch (IOException e9) {
            Log.w(this.f36817a, "Unable to open content: " + this.f36818c, e9);
            this.f36822f = -1;
            this.f36824g = -1;
            onErrorListener = this.f36813T;
            onErrorListener.onError(this.f36827i, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f36817a, "Unable to open content: " + this.f36818c, e10);
            this.f36822f = -1;
            this.f36824g = -1;
            onErrorListener = this.f36813T;
            onErrorListener.onError(this.f36827i, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f36817a, "Unable to open content: " + this.f36818c, e11);
            this.f36822f = -1;
            this.f36824g = -1;
            onErrorListener = this.f36813T;
            onErrorListener.onError(this.f36827i, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f36817a, "Unable to open content: " + this.f36818c, e12);
            this.f36822f = -1;
            this.f36824g = -1;
            onErrorListener = this.f36813T;
            onErrorListener.onError(this.f36827i, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void T(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f36827i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f36827i.release();
            this.f36827i = null;
            this.f36822f = 0;
            if (z9) {
                this.f36824g = 0;
            }
            ((AudioManager) this.f36798E.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void U() {
        IMediaPlayer iMediaPlayer = this.f36827i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void V() {
        Handler handler = this.f36842x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void W(Activity activity, NSTIJKPlayerMulti3 nSTIJKPlayerMulti3) {
        this.f36803J = activity;
        this.f36804K = nSTIJKPlayerMulti3;
        this.f36842x = new Handler();
        this.f36806M = new i(activity);
    }

    public final void X(Uri uri, Map map, boolean z9, String str) {
        this.f36818c = uri;
        this.f36819d = map;
        this.f36838t = 0;
        this.f36843y = z9;
        c0();
        S();
        requestLayout();
        invalidate();
    }

    public void Y(Uri uri, boolean z9, String str) {
        X(uri, null, z9, str);
    }

    public final void Z(String str) {
        this.f36806M.b(a7.f.Lm).a();
        this.f36806M.b(a7.f.f12166I).e();
        this.f36806M.b(a7.f.f12206M).d(str);
    }

    public final void a0(int i9) {
        this.f36820e = i9;
        if (i9 == -1) {
            if (this.f36844z < this.f36794A) {
                this.f36795B = true;
                this.f36842x.postDelayed(new a(), 3000L);
                return;
            }
            K();
            this.f36818c = null;
            Z(this.f36803J.getResources().getString(j.f13214b7));
            c0();
            this.f36795B = false;
            return;
        }
        if (i9 == 1) {
            this.f36806M.b(a7.f.f12116D).e();
            return;
        }
        if (i9 == 3) {
            this.f36844z = 0;
            this.f36806M.b(a7.f.f12120D3).a();
            this.f36806M.b(a7.f.f12110C3).e();
            if (this.f36843y) {
                this.f36806M.b(a7.f.f12110C3).c();
            }
        } else {
            if (i9 != 6) {
                if (i9 != 2) {
                    if (i9 == 4) {
                        this.f36806M.b(a7.f.f12120D3).e();
                        this.f36806M.b(a7.f.f12110C3).a();
                        if (this.f36843y) {
                            this.f36806M.b(a7.f.f12120D3).c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f36844z = 0;
                this.f36806M.b(a7.f.f12166I).a();
                this.f36806M.b(a7.f.Lm).e();
                this.f36806M.b(a7.f.f12120D3).a();
                this.f36806M.b(a7.f.f12110C3).e();
                this.f36806M.b(a7.f.f12116D).a();
                if (this.f36803J.findViewById(a7.f.f12522s).isFocusable()) {
                    return;
                }
                R();
                return;
            }
            this.f36844z = 0;
            this.f36806M.b(a7.f.f12166I).a();
            this.f36806M.b(a7.f.Lm).e();
            this.f36806M.b(a7.f.f12120D3).a();
            this.f36806M.b(a7.f.f12110C3).e();
        }
        this.f36806M.b(a7.f.f12116D).a();
    }

    public void b0() {
        AbstractServiceC2895a.d(null);
    }

    public void c0() {
        IMediaPlayer iMediaPlayer = this.f36827i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f36827i.release();
            this.f36827i = null;
            this.f36822f = 0;
            this.f36824g = 0;
            ((AudioManager) this.f36798E.getSystemService("audio")).abandonAudioFocus(null);
            a.b bVar = this.f36826h;
            if (bVar == null || bVar.c() == null) {
                return;
            }
            this.f36826h.c().setFormat(-2);
            this.f36826h.c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f36839u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f36840v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f36841w;
    }

    public void d0() {
        IMediaPlayer iMediaPlayer = this.f36827i;
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
        if (this.f36827i != null) {
            return this.f36835q;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (Q()) {
            return (int) this.f36827i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (Q()) {
            return (int) this.f36827i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return Q() && (iMediaPlayer = this.f36827i) != null && iMediaPlayer.isPlaying();
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
        if (Q() && (iMediaPlayer = this.f36827i) != null && iMediaPlayer.isPlaying()) {
            this.f36827i.pause();
            this.f36822f = 4;
        }
        this.f36824g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (Q()) {
            this.f36827i.seekTo(i9);
            i9 = 0;
        }
        this.f36838t = i9;
    }

    public void setContext(Context context) {
        this.f36808O = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f36807N = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f36833o = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f36836r = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f36837s = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f36834p = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f36817a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f36827i != null) {
                cVar.getSurfaceHolder().b(this.f36827i);
                cVar.c(this.f36827i.getVideoWidth(), this.f36827i.getVideoHeight());
                cVar.a(this.f36827i.getVideoSarNum(), this.f36827i.getVideoSarDen());
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f36800G != null) {
            IMediaPlayer iMediaPlayer = this.f36827i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f36800G.getView();
            this.f36800G.b(this.f36815V);
            this.f36800G = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f36800G = aVar;
        this.f36796C = this.f36798E.getSharedPreferences("loginPrefs", 0);
        int i11 = this.f36828j;
        if (i11 > 0 && (i10 = this.f36829k) > 0) {
            aVar.c(i11, i10);
        }
        int i12 = this.f36801H;
        if (i12 > 0 && (i9 = this.f36802I) > 0) {
            aVar.a(i12, i9);
        }
        View view2 = this.f36800G.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f36800G.e(this.f36815V);
        this.f36800G.setVideoRotation(this.f36832n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (Q()) {
            this.f36827i.start();
            this.f36822f = 3;
        }
        this.f36824g = 3;
    }
}
