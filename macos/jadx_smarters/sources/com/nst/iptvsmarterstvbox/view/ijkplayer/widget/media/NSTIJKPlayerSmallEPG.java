package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TableLayout;
import android.widget.TextView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m7.AbstractC2237a;
import m7.w;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import u7.C2858a;
import v7.AbstractServiceC2895a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.InterfaceC2938b;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerSmallEPG extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final int[] f37378M0 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f37379A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37380A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f37381B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37382B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f37383C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f37384C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f37385D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public IMediaPlayer.OnSeekCompleteListener f37386D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Handler f37387E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public IMediaPlayer.OnTimedTextListener f37388E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Handler f37389F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public a.InterfaceC0291a f37390F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f37391G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f37392G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f37393H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f37394H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f37395I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public List f37396I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f37397J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f37398J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f37399K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f37400K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f37401L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f37402L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f37403M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences f37404N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public Context f37405O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C2858a f37406P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f37407Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f37408R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f37409S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f37410T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f37411U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f37412V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f37413W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37414a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f37415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f37417e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f37418e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37419f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Activity f37420f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37421g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public NSTIJKPlayerSmallEPG f37422g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37423h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AudioManager f37424h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.b f37425i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f37426i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IMediaPlayer f37427j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f37428j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37429k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f37430k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37431l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public m f37432l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37433m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Boolean f37434m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37435n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Boolean f37436n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37437o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Boolean f37438o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37439p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Boolean f37440p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37441q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Boolean f37442q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37443r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Boolean f37444r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37445s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SharedPreferences f37446s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37447t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public SharedPreferences f37448t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f37449u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public SharedPreferences f37450u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37451v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public SharedPreferences f37452v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f37453w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Handler f37454w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37455x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f37456x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f37457y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37458y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f37459z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37460z0;

    public class a implements IMediaPlayer.OnBufferingUpdateListener {
        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerSmallEPG.this.f37443r = i9;
        }
    }

    public class b implements IMediaPlayer.OnSeekCompleteListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSmallEPG.this.f37413W = System.currentTimeMillis();
        }
    }

    public class c implements IMediaPlayer.OnTimedTextListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText != null) {
                NSTIJKPlayerSmallEPG.this.f37418e0.setText(ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", ""));
            }
        }
    }

    public class d implements a.InterfaceC0291a {
        public d() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            if (bVar.a() != NSTIJKPlayerSmallEPG.this.f37407Q) {
                Log.e(NSTIJKPlayerSmallEPG.this.f37414a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSmallEPG.this.f37433m = i10;
            NSTIJKPlayerSmallEPG.this.f37435n = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerSmallEPG.this.f37423h == 3;
            if (!NSTIJKPlayerSmallEPG.this.f37407Q.d() || (NSTIJKPlayerSmallEPG.this.f37429k == i10 && NSTIJKPlayerSmallEPG.this.f37431l == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerSmallEPG.this.f37427j != null && z10 && z9) {
                if (NSTIJKPlayerSmallEPG.this.f37449u != 0) {
                    NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = NSTIJKPlayerSmallEPG.this;
                    nSTIJKPlayerSmallEPG.seekTo(nSTIJKPlayerSmallEPG.f37449u);
                }
                NSTIJKPlayerSmallEPG.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            if (bVar.a() != NSTIJKPlayerSmallEPG.this.f37407Q) {
                Log.e(NSTIJKPlayerSmallEPG.this.f37414a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSmallEPG.this.f37425i = bVar;
            if (NSTIJKPlayerSmallEPG.this.f37427j == null) {
                NSTIJKPlayerSmallEPG.this.V();
            } else {
                NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = NSTIJKPlayerSmallEPG.this;
                nSTIJKPlayerSmallEPG.J(nSTIJKPlayerSmallEPG.f37427j, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            if (bVar.a() != NSTIJKPlayerSmallEPG.this.f37407Q) {
                Log.e(NSTIJKPlayerSmallEPG.this.f37414a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerSmallEPG.this.f37425i = null;
                NSTIJKPlayerSmallEPG.this.X();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSmallEPG.this.P();
        }
    }

    public class f extends Handler {
        public f(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 2) {
                NSTIJKPlayerSmallEPG.this.N(false);
            } else {
                if (i9 != 4) {
                    return;
                }
                NSTIJKPlayerSmallEPG.this.f37432l0.b(a7.f.f12285U).a();
                NSTIJKPlayerSmallEPG.this.f37432l0.b(a7.f.f12552v).a();
                NSTIJKPlayerSmallEPG.this.f37432l0.b(a7.f.f12582y).a();
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = NSTIJKPlayerSmallEPG.this;
            nSTIJKPlayerSmallEPG.f37397J++;
            nSTIJKPlayerSmallEPG.O();
            w.P0(NSTIJKPlayerSmallEPG.this.f37420f0, NSTIJKPlayerSmallEPG.this.f37420f0.getResources().getString(a7.j.f13262g5) + " (" + NSTIJKPlayerSmallEPG.this.f37397J + "/" + NSTIJKPlayerSmallEPG.this.f37399K + ")");
            NSTIJKPlayerSmallEPG.this.V();
            NSTIJKPlayerSmallEPG.this.start();
        }
    }

    public class h implements IMediaPlayer.OnVideoSizeChangedListener {
        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerSmallEPG.this.f37429k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSmallEPG.this.f37431l = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSmallEPG.this.f37408R = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSmallEPG.this.f37409S = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSmallEPG.this.f37429k == 0 || NSTIJKPlayerSmallEPG.this.f37431l == 0) {
                return;
            }
            if (NSTIJKPlayerSmallEPG.this.f37407Q != null) {
                NSTIJKPlayerSmallEPG.this.f37407Q.c(NSTIJKPlayerSmallEPG.this.f37429k, NSTIJKPlayerSmallEPG.this.f37431l);
                NSTIJKPlayerSmallEPG.this.f37407Q.a(NSTIJKPlayerSmallEPG.this.f37408R, NSTIJKPlayerSmallEPG.this.f37409S);
            }
            NSTIJKPlayerSmallEPG.this.requestLayout();
        }
    }

    public class i implements IMediaPlayer.OnPreparedListener {
        public i() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSmallEPG.this.f37411U = System.currentTimeMillis();
            NSTIJKPlayerSmallEPG.this.f37421g = 2;
            if (NSTIJKPlayerSmallEPG.this.f37441q != null) {
                NSTIJKPlayerSmallEPG.this.f37441q.onPrepared(NSTIJKPlayerSmallEPG.this.f37427j);
            }
            NSTIJKPlayerSmallEPG.o(NSTIJKPlayerSmallEPG.this);
            NSTIJKPlayerSmallEPG.this.f37429k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSmallEPG.this.f37431l = iMediaPlayer.getVideoHeight();
            int i9 = NSTIJKPlayerSmallEPG.this.f37449u;
            if (i9 != 0) {
                NSTIJKPlayerSmallEPG.this.seekTo(i9);
            }
            if (NSTIJKPlayerSmallEPG.this.f37429k == 0 || NSTIJKPlayerSmallEPG.this.f37431l == 0) {
                if (NSTIJKPlayerSmallEPG.this.f37423h == 3) {
                    NSTIJKPlayerSmallEPG.this.start();
                    return;
                }
                return;
            }
            if (NSTIJKPlayerSmallEPG.this.f37407Q != null) {
                NSTIJKPlayerSmallEPG.this.f37407Q.c(NSTIJKPlayerSmallEPG.this.f37429k, NSTIJKPlayerSmallEPG.this.f37431l);
                NSTIJKPlayerSmallEPG.this.f37407Q.a(NSTIJKPlayerSmallEPG.this.f37408R, NSTIJKPlayerSmallEPG.this.f37409S);
                if (!NSTIJKPlayerSmallEPG.this.f37407Q.d() || (NSTIJKPlayerSmallEPG.this.f37433m == NSTIJKPlayerSmallEPG.this.f37429k && NSTIJKPlayerSmallEPG.this.f37435n == NSTIJKPlayerSmallEPG.this.f37431l)) {
                    if (NSTIJKPlayerSmallEPG.this.f37423h == 3) {
                        NSTIJKPlayerSmallEPG.this.start();
                    } else {
                        if (NSTIJKPlayerSmallEPG.this.isPlaying()) {
                            return;
                        }
                        if (i9 == 0 && NSTIJKPlayerSmallEPG.this.getCurrentPosition() <= 0) {
                            return;
                        }
                    }
                    NSTIJKPlayerSmallEPG.o(NSTIJKPlayerSmallEPG.this);
                }
            }
        }
    }

    public class j implements IMediaPlayer.OnCompletionListener {
        public j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSmallEPG.this.f37421g = 5;
            NSTIJKPlayerSmallEPG.this.f37423h = 5;
            NSTIJKPlayerSmallEPG.o(NSTIJKPlayerSmallEPG.this);
            NSTIJKPlayerSmallEPG.this.f0(-1);
            if (NSTIJKPlayerSmallEPG.this.f37439p != null) {
                NSTIJKPlayerSmallEPG.this.f37439p.onCompletion(NSTIJKPlayerSmallEPG.this.f37427j);
            }
        }
    }

    public class k implements IMediaPlayer.OnInfoListener {
        public k() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i9, int i10) {
            String str;
            String str2;
            if (NSTIJKPlayerSmallEPG.this.f37447t != null) {
                NSTIJKPlayerSmallEPG.this.f37447t.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerSmallEPG.this.f0(2);
                str = NSTIJKPlayerSmallEPG.this.f37414a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerSmallEPG.this.f0(1);
                str = NSTIJKPlayerSmallEPG.this.f37414a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerSmallEPG.this.f37414a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerSmallEPG.this.f37437o = i10;
                        Log.d(NSTIJKPlayerSmallEPG.this.f37414a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        if (NSTIJKPlayerSmallEPG.this.f37407Q != null) {
                            NSTIJKPlayerSmallEPG.this.f37407Q.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerSmallEPG.this.f37414a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSmallEPG.this.f0(1);
                                str = NSTIJKPlayerSmallEPG.this.f37414a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSmallEPG.this.f0(6);
                                str = NSTIJKPlayerSmallEPG.this.f37414a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSmallEPG.this.f37414a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerSmallEPG.this.f37414a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSmallEPG.this.f37414a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSmallEPG.this.f37414a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSmallEPG.this.f37414a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSmallEPG.this.f37414a;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class l implements IMediaPlayer.OnErrorListener {
        public l() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i9, int i10) {
            Log.d(NSTIJKPlayerSmallEPG.this.f37414a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerSmallEPG.this.f37421g = -1;
            NSTIJKPlayerSmallEPG.this.f37423h = -1;
            NSTIJKPlayerSmallEPG.o(NSTIJKPlayerSmallEPG.this);
            NSTIJKPlayerSmallEPG.this.f0(-1);
            if (NSTIJKPlayerSmallEPG.this.f37445s != null) {
                NSTIJKPlayerSmallEPG.this.f37445s.onError(NSTIJKPlayerSmallEPG.this.f37427j, i9, i10);
            }
            return true;
        }
    }

    public class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f37473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f37474b;

        public m(Activity activity) {
            this.f37473a = activity;
        }

        public m a() {
            View view = this.f37474b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public m b(int i9) {
            this.f37474b = this.f37473a.findViewById(i9);
            return this;
        }

        public m c() {
            View view = this.f37474b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        public m d() {
            View view = this.f37474b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public m e(CharSequence charSequence) {
            View view = this.f37474b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public m f(int i9) {
            View view = this.f37474b;
            if (view != null) {
                view.setVisibility(i9);
            }
            return this;
        }

        public m g() {
            View view = this.f37474b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSmallEPG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37414a = "NSTIJKPlayerSmallEPG";
        this.f37419f = 0;
        this.f37421g = 0;
        this.f37423h = 0;
        this.f37425i = null;
        this.f37427j = null;
        this.f37451v = true;
        this.f37453w = true;
        this.f37455x = true;
        this.f37457y = -1;
        this.f37459z = -1L;
        this.f37381B = true;
        this.f37383C = false;
        this.f37385D = 7000;
        this.f37393H = 0;
        this.f37397J = 0;
        this.f37399K = 5;
        this.f37401L = false;
        this.f37410T = 0L;
        this.f37411U = 0L;
        this.f37412V = 0L;
        this.f37413W = 0L;
        this.f37428j0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f37434m0 = bool;
        this.f37436n0 = bool;
        this.f37438o0 = bool;
        this.f37440p0 = bool;
        this.f37442q0 = bool;
        this.f37444r0 = bool;
        this.f37454w0 = new f(Looper.getMainLooper());
        this.f37456x0 = new h();
        this.f37458y0 = new i();
        this.f37460z0 = new j();
        this.f37380A0 = new k();
        this.f37382B0 = new l();
        this.f37384C0 = new a();
        this.f37386D0 = new b();
        this.f37388E0 = new c();
        this.f37390F0 = new d();
        this.f37392G0 = 4;
        this.f37394H0 = f37378M0[0];
        this.f37396I0 = new ArrayList();
        this.f37398J0 = 0;
        this.f37400K0 = 0;
        this.f37402L0 = false;
        S(context);
    }

    public static /* synthetic */ InterfaceC2938b o(NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
        nSTIJKPlayerSmallEPG.getClass();
        return null;
    }

    public final void J(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer K(int r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG.K(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void L(int i9) {
        AbstractC2941e.b(this.f37427j, i9);
    }

    public void M() {
        AbstractServiceC2895a.d(this.f37427j);
    }

    public void N(boolean z9) {
        if (z9 || this.f37379A) {
            d0(false);
            this.f37432l0.b(a7.f.f12236P).a();
            this.f37432l0.b(a7.f.f12484o2).a();
            this.f37432l0.b(a7.f.f12592z).c();
            this.f37432l0.b(a7.f.S9).a();
            this.f37379A = false;
            P();
        }
    }

    public final void O() {
        this.f37432l0.b(a7.f.f12086A).a();
        this.f37432l0.b(a7.f.f12146G).a();
        if (AbstractC2237a.f44434B.booleanValue()) {
            this.f37432l0.b(a7.f.Sm).a();
        }
        d0(false);
        P();
    }

    public void P() {
        this.f37432l0.b(a7.f.f12236P).a();
        this.f37432l0.b(a7.f.f12484o2).a();
        this.f37432l0.b(a7.f.S9).a();
        this.f37379A = false;
        this.f37387E.removeCallbacksAndMessages(null);
        if (AbstractC2237a.f44434B.booleanValue()) {
            this.f37432l0.b(a7.f.Sm).g();
        }
    }

    public final void Q() {
        boolean zP = this.f37406P.p();
        this.f37402L0 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f37427j = AbstractServiceC2895a.a();
        }
    }

    public final void R() {
        this.f37396I0.clear();
        if (this.f37406P.s()) {
            this.f37396I0.add(1);
        }
        if (this.f37406P.t()) {
            this.f37396I0.add(2);
        }
        if (this.f37406P.r()) {
            this.f37396I0.add(0);
        }
        if (this.f37396I0.isEmpty()) {
            this.f37396I0.add(1);
        }
        int iIntValue = ((Integer) this.f37396I0.get(this.f37398J0)).intValue();
        this.f37400K0 = iIntValue;
        setRender(iIntValue);
    }

    public final void S(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f37405O = applicationContext;
        this.f37406P = new C2858a(applicationContext);
        Q();
        R();
        this.f37429k = 0;
        this.f37431l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f37421g = 0;
        this.f37423h = 0;
        TextView textView = new TextView(context);
        this.f37418e0 = textView;
        textView.setTextSize(24.0f);
        this.f37418e0.setTextColor(context.getResources().getColor(a7.c.f11849G));
        this.f37418e0.setGravity(17);
        addView(this.f37418e0, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    public boolean T() {
        return this.f37402L0;
    }

    public final boolean U() {
        int i9;
        return (this.f37427j == null || (i9 = this.f37421g) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    public void V() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f37415c == null || this.f37425i == null) {
            return;
        }
        W(false);
        try {
            ((AudioManager) this.f37405O.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            this.f37427j = K(this.f37406P.x());
            getContext();
            this.f37427j.setOnPreparedListener(this.f37458y0);
            this.f37427j.setOnVideoSizeChangedListener(this.f37456x0);
            this.f37427j.setOnCompletionListener(this.f37460z0);
            this.f37427j.setOnErrorListener(this.f37382B0);
            this.f37427j.setOnInfoListener(this.f37380A0);
            this.f37427j.setOnBufferingUpdateListener(this.f37384C0);
            this.f37427j.setOnSeekCompleteListener(this.f37386D0);
            this.f37427j.setOnTimedTextListener(this.f37388E0);
            this.f37443r = 0;
            String scheme = this.f37415c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f37406P.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f37427j.setDataSource(new C2937a(new File(this.f37415c.toString())));
            } else {
                this.f37427j.setDataSource(this.f37405O, this.f37415c, this.f37417e);
            }
            J(this.f37427j, this.f37425i);
            this.f37427j.setAudioStreamType(3);
            this.f37427j.setScreenOnWhilePlaying(true);
            this.f37410T = System.currentTimeMillis();
            this.f37427j.prepareAsync();
            this.f37430k0 = this.f37420f0.getResources().getDisplayMetrics().widthPixels;
            AudioManager audioManager = (AudioManager) this.f37420f0.getSystemService("audio");
            this.f37424h0 = audioManager;
            this.f37426i0 = audioManager.getStreamMaxVolume(3);
            this.f37421g = 1;
        } catch (IOException e9) {
            Log.w(this.f37414a, "Unable to open content: " + this.f37415c, e9);
            this.f37421g = -1;
            this.f37423h = -1;
            onErrorListener = this.f37382B0;
            onErrorListener.onError(this.f37427j, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f37414a, "Unable to open content: " + this.f37415c, e10);
            this.f37421g = -1;
            this.f37423h = -1;
            onErrorListener = this.f37382B0;
            onErrorListener.onError(this.f37427j, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f37414a, "Unable to open content: " + this.f37415c, e11);
            this.f37421g = -1;
            this.f37423h = -1;
            onErrorListener = this.f37382B0;
            onErrorListener.onError(this.f37427j, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f37414a, "Unable to open content: " + this.f37415c, e12);
            this.f37421g = -1;
            this.f37423h = -1;
            onErrorListener = this.f37382B0;
            onErrorListener.onError(this.f37427j, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void W(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f37427j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f37427j.release();
            this.f37427j = null;
            this.f37421g = 0;
            if (z9) {
                this.f37423h = 0;
            }
            ((AudioManager) this.f37405O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void X() {
        IMediaPlayer iMediaPlayer = this.f37427j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void Y(int i9) {
        AbstractC2941e.e(this.f37427j, i9);
    }

    public void Z(Activity activity, NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG) {
        this.f37420f0 = activity;
        this.f37422g0 = nSTIJKPlayerSmallEPG;
        this.f37387E = new Handler();
        this.f37389F = new Handler();
        this.f37432l0 = new m(activity);
    }

    public final void a0(Uri uri, Map map, boolean z9, String str) {
        this.f37415c = uri;
        this.f37416d = str;
        this.f37417e = map;
        this.f37449u = 0;
        this.f37395I = z9;
        h0();
        V();
        requestLayout();
        invalidate();
    }

    public void b0(Uri uri, boolean z9, String str) {
        a0(uri, null, z9, str);
    }

    public void c0(int i9) {
        this.f37432l0.b(a7.f.f12236P).g();
        this.f37432l0.b(a7.f.f12484o2).g();
        this.f37432l0.b(a7.f.S9).g();
        if (!this.f37383C) {
            d0(true);
        }
        if (!this.f37391G) {
            this.f37432l0.b(a7.f.f12592z).g();
        }
        ((LinearLayout) this.f37420f0.findViewById(a7.f.f12540t7)).setVisibility(0);
        this.f37387E.postDelayed(new e(), 5000L);
        i0();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f37451v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f37453w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f37455x;
    }

    public void d0(boolean z9) {
        this.f37432l0.b(a7.f.f12562w).f(z9 ? 0 : 8);
        this.f37432l0.b(a7.f.f12572x).f(z9 ? 0 : 8);
        this.f37432l0.b(a7.f.f12136F).f(z9 ? 0 : 8);
    }

    public final void e0(String str) {
        this.f37432l0.b(a7.f.Im).a();
        this.f37432l0.b(a7.f.f12146G).g();
        this.f37432l0.b(a7.f.f12186K).e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f0(int r9) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG.f0(int):void");
    }

    public void g0() {
        AbstractServiceC2895a.d(null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f37427j != null) {
            return this.f37443r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (U()) {
            return (int) this.f37427j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f37393H;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (U()) {
            return (int) this.f37427j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f37395I);
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f37427j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h0() {
        IMediaPlayer iMediaPlayer = this.f37427j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f37427j.release();
            this.f37427j = null;
            this.f37421g = 0;
            this.f37423h = 0;
            ((AudioManager) this.f37405O.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public final void i0() {
        m mVar;
        int i9;
        IMediaPlayer iMediaPlayer = this.f37427j;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.f37432l0.b(a7.f.f12110C3).a();
            this.f37432l0.b(a7.f.f12120D3).g();
            mVar = this.f37432l0;
            i9 = a7.f.f12120D3;
        } else {
            this.f37432l0.b(a7.f.f12120D3).a();
            this.f37432l0.b(a7.f.f12110C3).g();
            mVar = this.f37432l0;
            i9 = a7.f.f12110C3;
        }
        mVar.b(i9).d();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return U() && (iMediaPlayer = this.f37427j) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 4 || i9 == 24 || i9 == 25 || i9 == 164 || i9 == 82 || i9 != 5) {
        }
        U();
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (U() && (iMediaPlayer = this.f37427j) != null && iMediaPlayer.isPlaying()) {
            this.f37427j.pause();
            this.f37421g = 4;
        }
        this.f37423h = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (U()) {
            this.f37412V = System.currentTimeMillis();
            this.f37427j.seekTo(i9);
            i9 = 0;
        }
        this.f37449u = i9;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f37393H = i9;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f37439p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f37445s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f37447t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f37441q = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f37414a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f37427j != null) {
                cVar.getSurfaceHolder().b(this.f37427j);
                cVar.c(this.f37427j.getVideoWidth(), this.f37427j.getVideoHeight());
                cVar.a(this.f37427j.getVideoSarNum(), this.f37427j.getVideoSarDen());
                cVar.setAspectRatio(this.f37394H0);
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f37407Q != null) {
            IMediaPlayer iMediaPlayer = this.f37427j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f37407Q.getView();
            this.f37407Q.b(this.f37390F0);
            this.f37407Q = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f37407Q = aVar;
        SharedPreferences sharedPreferences = this.f37405O.getSharedPreferences("loginPrefs", 0);
        this.f37403M = sharedPreferences;
        int i11 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f37392G0 = i11;
        aVar.setAspectRatio(i11);
        int i12 = this.f37429k;
        if (i12 > 0 && (i10 = this.f37431l) > 0) {
            aVar.c(i12, i10);
        }
        int i13 = this.f37408R;
        if (i13 > 0 && (i9 = this.f37409S) > 0) {
            aVar.a(i13, i9);
        }
        View view2 = this.f37407Q.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f37407Q.e(this.f37390F0);
        this.f37407Q.setVideoRotation(this.f37437o);
    }

    public void setTitle(CharSequence charSequence) {
        this.f37432l0.b(a7.f.f12226O).e(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (U()) {
            this.f37427j.start();
            this.f37421g = 3;
        }
        this.f37423h = 3;
    }
}
