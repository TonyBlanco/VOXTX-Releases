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
public class NSTIJKPlayerMulti1 extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f36670A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f36671B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SharedPreferences f36672C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SharedPreferences f36673D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Context f36674E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2858a f36675F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f36676G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f36677H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f36678I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Activity f36679J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public NSTIJKPlayerMulti1 f36680K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public AudioManager f36681L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public i f36682M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public LiveStreamDBHandler f36683N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Context f36684O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f36685P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36686Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36687R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36688S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36689T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f36690U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public a.InterfaceC0291a f36691V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public List f36692W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36693a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f36694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f36695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36696e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f36697e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36698f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f36699f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36700g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f36701g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a.b f36702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public IMediaPlayer f36703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f36704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f36715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36716v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f36717w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Handler f36718x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f36719y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f36720z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = NSTIJKPlayerMulti1.this;
            nSTIJKPlayerMulti1.f36720z++;
            nSTIJKPlayerMulti1.K();
            w.P0(NSTIJKPlayerMulti1.this.f36679J, NSTIJKPlayerMulti1.this.f36679J.getResources().getString(j.f13262g5) + " (" + NSTIJKPlayerMulti1.this.f36720z + "/" + NSTIJKPlayerMulti1.this.f36670A + ")");
            NSTIJKPlayerMulti1.this.S();
            NSTIJKPlayerMulti1.this.start();
        }
    }

    public class b implements IMediaPlayer.OnVideoSizeChangedListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerMulti1.this.f36704j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti1.this.f36705k = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerMulti1.this.f36677H = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerMulti1.this.f36678I = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerMulti1.this.f36704j == 0 || NSTIJKPlayerMulti1.this.f36705k == 0) {
                return;
            }
            if (NSTIJKPlayerMulti1.this.f36676G != null) {
                NSTIJKPlayerMulti1.this.f36676G.c(NSTIJKPlayerMulti1.this.f36704j, NSTIJKPlayerMulti1.this.f36705k);
                NSTIJKPlayerMulti1.this.f36676G.a(NSTIJKPlayerMulti1.this.f36677H, NSTIJKPlayerMulti1.this.f36678I);
            }
            NSTIJKPlayerMulti1.this.requestLayout();
        }
    }

    public class c implements IMediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti1.this.f36698f = 2;
            if (NSTIJKPlayerMulti1.this.f36710p != null) {
                NSTIJKPlayerMulti1.this.f36710p.onPrepared(NSTIJKPlayerMulti1.this.f36703i);
            }
            NSTIJKPlayerMulti1.d(NSTIJKPlayerMulti1.this);
            NSTIJKPlayerMulti1.this.f36704j = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerMulti1.this.f36705k = iMediaPlayer.getVideoHeight();
            if (NSTIJKPlayerMulti1.this.f36704j == 0 || NSTIJKPlayerMulti1.this.f36705k == 0) {
                if (NSTIJKPlayerMulti1.this.f36700g == 3) {
                    NSTIJKPlayerMulti1.this.start();
                }
            } else if (NSTIJKPlayerMulti1.this.f36676G != null) {
                NSTIJKPlayerMulti1.this.f36676G.c(NSTIJKPlayerMulti1.this.f36704j, NSTIJKPlayerMulti1.this.f36705k);
                NSTIJKPlayerMulti1.this.f36676G.a(NSTIJKPlayerMulti1.this.f36677H, NSTIJKPlayerMulti1.this.f36678I);
                if ((!NSTIJKPlayerMulti1.this.f36676G.d() || (NSTIJKPlayerMulti1.this.f36706l == NSTIJKPlayerMulti1.this.f36704j && NSTIJKPlayerMulti1.this.f36707m == NSTIJKPlayerMulti1.this.f36705k)) && NSTIJKPlayerMulti1.this.f36700g == 3) {
                    NSTIJKPlayerMulti1.this.start();
                    NSTIJKPlayerMulti1.d(NSTIJKPlayerMulti1.this);
                }
            }
        }
    }

    public class d implements IMediaPlayer.OnCompletionListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerMulti1.this.f36698f = 5;
            NSTIJKPlayerMulti1.this.f36700g = 5;
            NSTIJKPlayerMulti1.d(NSTIJKPlayerMulti1.this);
            NSTIJKPlayerMulti1.this.a0(-1);
            if (NSTIJKPlayerMulti1.this.f36709o != null) {
                NSTIJKPlayerMulti1.this.f36709o.onCompletion(NSTIJKPlayerMulti1.this.f36703i);
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
            if (NSTIJKPlayerMulti1.this.f36713s != null) {
                NSTIJKPlayerMulti1.this.f36713s.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerMulti1.this.a0(2);
                str = NSTIJKPlayerMulti1.this.f36693a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerMulti1.this.a0(1);
                str = NSTIJKPlayerMulti1.this.f36693a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerMulti1.this.f36693a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerMulti1.this.f36708n = i10;
                        Log.d(NSTIJKPlayerMulti1.this.f36693a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        if (NSTIJKPlayerMulti1.this.f36676G != null) {
                            NSTIJKPlayerMulti1.this.f36676G.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerMulti1.this.f36693a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerMulti1.this.a0(1);
                                str = NSTIJKPlayerMulti1.this.f36693a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerMulti1.this.a0(6);
                                str = NSTIJKPlayerMulti1.this.f36693a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerMulti1.this.f36693a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerMulti1.this.f36693a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerMulti1.this.f36693a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerMulti1.this.f36693a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerMulti1.this.f36693a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerMulti1.this.f36693a;
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
            Log.d(NSTIJKPlayerMulti1.this.f36693a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerMulti1.this.f36698f = -1;
            NSTIJKPlayerMulti1.this.f36700g = -1;
            NSTIJKPlayerMulti1.d(NSTIJKPlayerMulti1.this);
            NSTIJKPlayerMulti1.this.a0(-1);
            if (NSTIJKPlayerMulti1.this.f36712r != null) {
                NSTIJKPlayerMulti1.this.f36712r.onError(NSTIJKPlayerMulti1.this.f36703i, i9, i10);
            }
            return true;
        }
    }

    public class g implements IMediaPlayer.OnBufferingUpdateListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerMulti1.this.f36711q = i9;
        }
    }

    public class h implements a.InterfaceC0291a {
        public h() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            if (bVar.a() != NSTIJKPlayerMulti1.this.f36676G) {
                Log.e(NSTIJKPlayerMulti1.this.f36693a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti1.this.f36706l = i10;
            NSTIJKPlayerMulti1.this.f36707m = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerMulti1.this.f36700g == 3;
            if (!NSTIJKPlayerMulti1.this.f36676G.d() || (NSTIJKPlayerMulti1.this.f36704j == i10 && NSTIJKPlayerMulti1.this.f36705k == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerMulti1.this.f36703i != null && z10 && z9) {
                if (NSTIJKPlayerMulti1.this.f36714t != 0) {
                    NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = NSTIJKPlayerMulti1.this;
                    nSTIJKPlayerMulti1.seekTo(nSTIJKPlayerMulti1.f36714t);
                }
                NSTIJKPlayerMulti1.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            if (bVar.a() != NSTIJKPlayerMulti1.this.f36676G) {
                Log.e(NSTIJKPlayerMulti1.this.f36693a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerMulti1.this.f36702h = bVar;
            if (NSTIJKPlayerMulti1.this.f36703i == null) {
                NSTIJKPlayerMulti1.this.S();
            } else {
                NSTIJKPlayerMulti1 nSTIJKPlayerMulti1 = NSTIJKPlayerMulti1.this;
                nSTIJKPlayerMulti1.H(nSTIJKPlayerMulti1.f36703i, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            if (bVar.a() != NSTIJKPlayerMulti1.this.f36676G) {
                Log.e(NSTIJKPlayerMulti1.this.f36693a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerMulti1.this.f36702h = null;
                NSTIJKPlayerMulti1.this.U();
            }
        }
    }

    public class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f36729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f36730b;

        public i(Activity activity) {
            this.f36729a = activity;
        }

        public i a() {
            View view = this.f36730b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public i b(int i9) {
            this.f36730b = this.f36729a.findViewById(i9);
            return this;
        }

        public i c() {
            View view = this.f36730b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public i d(CharSequence charSequence) {
            View view = this.f36730b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public i e() {
            View view = this.f36730b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerMulti1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36693a = "NSTIJKPlayerMulti1";
        this.f36696e = 0;
        this.f36698f = 0;
        this.f36700g = 0;
        this.f36702h = null;
        this.f36703i = null;
        this.f36715u = true;
        this.f36716v = true;
        this.f36717w = true;
        this.f36720z = 0;
        this.f36670A = 5;
        this.f36671B = false;
        this.f36685P = new b();
        this.f36686Q = new c();
        this.f36687R = new d();
        this.f36688S = new e();
        this.f36689T = new f();
        this.f36690U = new g();
        this.f36691V = new h();
        this.f36692W = new ArrayList();
        this.f36697e0 = 0;
        this.f36699f0 = 0;
        this.f36701g0 = false;
        O(context);
    }

    public static /* synthetic */ InterfaceC2938b d(NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
        nSTIJKPlayerMulti1.getClass();
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
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerMulti1.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J() {
        AbstractServiceC2895a.d(this.f36703i);
    }

    public final void K() {
        this.f36682M.b(a7.f.f12096B).a();
        this.f36682M.b(a7.f.f12146G).a();
        L();
    }

    public void L() {
        this.f36682M.b(a7.f.f12236P).a();
        this.f36682M.b(a7.f.f12484o2).a();
        this.f36682M.b(a7.f.S9).a();
        this.f36718x.removeCallbacksAndMessages(null);
    }

    public final void M() {
        boolean zP = this.f36675F.p();
        this.f36701g0 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f36703i = AbstractServiceC2895a.a();
        }
    }

    public final void N() {
        this.f36692W.clear();
        if (this.f36675F.s()) {
            this.f36692W.add(1);
        }
        if (this.f36675F.t()) {
            this.f36692W.add(2);
        }
        if (this.f36675F.r()) {
            this.f36692W.add(0);
        }
        if (this.f36692W.isEmpty()) {
            this.f36692W.add(1);
        }
        int iIntValue = ((Integer) this.f36692W.get(this.f36697e0)).intValue();
        this.f36699f0 = iIntValue;
        setRender(iIntValue);
    }

    public final void O(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36674E = applicationContext;
        this.f36675F = new C2858a(applicationContext);
        M();
        N();
        this.f36704j = 0;
        this.f36705k = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f36698f = 0;
        this.f36700g = 0;
    }

    public boolean P() {
        return this.f36701g0;
    }

    public final boolean Q() {
        int i9;
        return (this.f36703i == null || (i9 = this.f36698f) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    public void R() {
        IMediaPlayer iMediaPlayer = this.f36703i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    public void S() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f36694c == null || this.f36702h == null) {
            return;
        }
        T(false);
        try {
            ((AudioManager) this.f36674E.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        this.f36682M.b(a7.f.f12146G).a();
        try {
            IMediaPlayer iMediaPlayerI = I(this.f36675F.x());
            this.f36703i = iMediaPlayerI;
            iMediaPlayerI.setOnPreparedListener(this.f36686Q);
            this.f36703i.setOnVideoSizeChangedListener(this.f36685P);
            this.f36703i.setOnCompletionListener(this.f36687R);
            this.f36703i.setOnErrorListener(this.f36689T);
            this.f36703i.setOnInfoListener(this.f36688S);
            this.f36703i.setOnBufferingUpdateListener(this.f36690U);
            this.f36711q = 0;
            String scheme = this.f36694c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f36675F.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f36703i.setDataSource(new C2937a(new File(this.f36694c.toString())));
            } else {
                this.f36703i.setDataSource(this.f36674E, this.f36694c, this.f36695d);
            }
            H(this.f36703i, this.f36702h);
            this.f36703i.setAudioStreamType(3);
            this.f36703i.setScreenOnWhilePlaying(true);
            this.f36703i.prepareAsync();
            this.f36681L = (AudioManager) this.f36679J.getSystemService("audio");
            this.f36698f = 1;
        } catch (IOException e9) {
            Log.w(this.f36693a, "Unable to open content: " + this.f36694c, e9);
            this.f36698f = -1;
            this.f36700g = -1;
            onErrorListener = this.f36689T;
            onErrorListener.onError(this.f36703i, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f36693a, "Unable to open content: " + this.f36694c, e10);
            this.f36698f = -1;
            this.f36700g = -1;
            onErrorListener = this.f36689T;
            onErrorListener.onError(this.f36703i, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f36693a, "Unable to open content: " + this.f36694c, e11);
            this.f36698f = -1;
            this.f36700g = -1;
            onErrorListener = this.f36689T;
            onErrorListener.onError(this.f36703i, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f36693a, "Unable to open content: " + this.f36694c, e12);
            this.f36698f = -1;
            this.f36700g = -1;
            onErrorListener = this.f36689T;
            onErrorListener.onError(this.f36703i, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void T(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f36703i;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f36703i.release();
            this.f36703i = null;
            this.f36698f = 0;
            if (z9) {
                this.f36700g = 0;
            }
            ((AudioManager) this.f36674E.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void U() {
        IMediaPlayer iMediaPlayer = this.f36703i;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void V() {
        Handler handler = this.f36718x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void W(Activity activity, NSTIJKPlayerMulti1 nSTIJKPlayerMulti1) {
        this.f36679J = activity;
        this.f36680K = nSTIJKPlayerMulti1;
        this.f36718x = new Handler();
        this.f36682M = new i(activity);
    }

    public final void X(Uri uri, Map map, boolean z9, String str) {
        this.f36694c = uri;
        this.f36695d = map;
        this.f36714t = 0;
        this.f36719y = z9;
        c0();
        S();
        requestLayout();
        invalidate();
    }

    public void Y(Uri uri, boolean z9, String str) {
        X(uri, null, z9, str);
    }

    public final void Z(String str) {
        this.f36682M.b(a7.f.Jm).a();
        this.f36682M.b(a7.f.f12146G).e();
        this.f36682M.b(a7.f.f12186K).d(str);
    }

    public final void a0(int i9) {
        this.f36696e = i9;
        if (i9 == -1) {
            if (this.f36720z < this.f36670A) {
                this.f36671B = true;
                this.f36718x.postDelayed(new a(), 3000L);
                return;
            }
            K();
            this.f36694c = null;
            Z(this.f36679J.getResources().getString(j.f13214b7));
            c0();
            this.f36671B = false;
            return;
        }
        if (i9 == 1) {
            this.f36682M.b(a7.f.f12096B).e();
            return;
        }
        if (i9 == 3) {
            this.f36720z = 0;
            this.f36682M.b(a7.f.f12120D3).a();
            this.f36682M.b(a7.f.f12110C3).e();
            if (this.f36719y) {
                this.f36682M.b(a7.f.f12110C3).c();
            }
        } else {
            if (i9 != 6) {
                if (i9 != 2) {
                    if (i9 == 4) {
                        this.f36682M.b(a7.f.f12120D3).e();
                        this.f36682M.b(a7.f.f12110C3).a();
                        if (this.f36719y) {
                            this.f36682M.b(a7.f.f12120D3).c();
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f36720z = 0;
                this.f36682M.b(a7.f.f12146G).a();
                this.f36682M.b(a7.f.Jm).e();
                this.f36682M.b(a7.f.f12120D3).a();
                this.f36682M.b(a7.f.f12110C3).e();
                this.f36682M.b(a7.f.f12096B).a();
                if (this.f36679J.findViewById(a7.f.f12502q).isFocusable()) {
                    return;
                }
                R();
                return;
            }
            this.f36720z = 0;
            this.f36682M.b(a7.f.f12146G).a();
            this.f36682M.b(a7.f.Jm).e();
            this.f36682M.b(a7.f.f12120D3).a();
            this.f36682M.b(a7.f.f12110C3).e();
        }
        this.f36682M.b(a7.f.f12096B).a();
    }

    public void b0() {
        AbstractServiceC2895a.d(null);
    }

    public void c0() {
        IMediaPlayer iMediaPlayer = this.f36703i;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f36703i.release();
            this.f36703i = null;
            this.f36698f = 0;
            this.f36700g = 0;
            ((AudioManager) this.f36674E.getSystemService("audio")).abandonAudioFocus(null);
            a.b bVar = this.f36702h;
            if (bVar == null || bVar.c() == null) {
                return;
            }
            this.f36702h.c().setFormat(-2);
            this.f36702h.c().setFormat(-1);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f36715u;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f36716v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f36717w;
    }

    public void d0() {
        IMediaPlayer iMediaPlayer = this.f36703i;
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
        if (this.f36703i != null) {
            return this.f36711q;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (Q()) {
            return (int) this.f36703i.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (Q()) {
            return (int) this.f36703i.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return Q() && (iMediaPlayer = this.f36703i) != null && iMediaPlayer.isPlaying();
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
        if (Q() && (iMediaPlayer = this.f36703i) != null && iMediaPlayer.isPlaying()) {
            this.f36703i.pause();
            this.f36698f = 4;
        }
        this.f36700g = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (Q()) {
            this.f36703i.seekTo(i9);
            i9 = 0;
        }
        this.f36714t = i9;
    }

    public void setContext(Context context) {
        this.f36684O = context;
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f36683N = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f36709o = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f36712r = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f36713s = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f36710p = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f36693a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f36703i != null) {
                cVar.getSurfaceHolder().b(this.f36703i);
                cVar.c(this.f36703i.getVideoWidth(), this.f36703i.getVideoHeight());
                cVar.a(this.f36703i.getVideoSarNum(), this.f36703i.getVideoSarDen());
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f36676G != null) {
            IMediaPlayer iMediaPlayer = this.f36703i;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f36676G.getView();
            this.f36676G.b(this.f36691V);
            this.f36676G = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f36676G = aVar;
        this.f36672C = this.f36674E.getSharedPreferences("loginPrefs", 0);
        int i11 = this.f36704j;
        if (i11 > 0 && (i10 = this.f36705k) > 0) {
            aVar.c(i11, i10);
        }
        int i12 = this.f36677H;
        if (i12 > 0 && (i9 = this.f36678I) > 0) {
            aVar.a(i12, i9);
        }
        View view2 = this.f36676G.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f36676G.e(this.f36691V);
        this.f36676G.setVideoRotation(this.f36708n);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (Q()) {
            this.f36703i.start();
            this.f36698f = 3;
        }
        this.f36700g = 3;
    }
}
