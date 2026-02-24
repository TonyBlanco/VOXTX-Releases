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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TableLayout;
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
import m7.AbstractC2237a;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import u7.C2858a;
import v7.AbstractServiceC2895a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.InterfaceC2938b;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerSeriesThumbnail extends FrameLayout implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public static final int[] f36918U0 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f36919A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public LinearLayout f36920A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f36921B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public LinearLayout f36922B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f36923C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public ProgressBar f36924C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Handler f36925D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f36926D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Handler f36927E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public Handler f36928E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f36929F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f36930F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f36931G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36932G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f36933H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36934H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f36935I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36936I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f36937J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36938J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f36939K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f36940K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences f36941L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public IMediaPlayer.OnSeekCompleteListener f36942L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public Context f36943M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public IMediaPlayer.OnTimedTextListener f36944M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C2858a f36945N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public a.InterfaceC0291a f36946N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f36947O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f36948O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f36949P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f36950P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f36951Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public List f36952Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f36953R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f36954R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f36955S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f36956S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f36957T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f36958T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f36959U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f36960V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Activity f36961W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36962a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f36963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f36965e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public NSTIJKPlayerSeriesThumbnail f36966e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36967f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public AudioManager f36968f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36969g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f36970g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36971h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f36972h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.b f36973i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f36974i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IMediaPlayer f36975j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public k f36976j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36977k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Boolean f36978k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36979l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Boolean f36980l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36981m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Boolean f36982m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36983n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Boolean f36984n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36985o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Boolean f36986o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36987p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Boolean f36988p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36989q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SharedPreferences f36990q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36991r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public SharedPreferences f36992r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36993s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SharedPreferences f36994s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36995t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public SharedPreferences f36996t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f36997u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public LiveStreamDBHandler f36998u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36999v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Context f37000v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f37001w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public NSTIJKPlayerSeriesThumbnail f37002w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37003x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LinearLayout f37004x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f37005y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public LinearLayout f37006y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f37007z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public ImageView f37008z0;

    public class a implements a.InterfaceC0291a {
        public a() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            if (bVar.a() != NSTIJKPlayerSeriesThumbnail.this.f36947O) {
                Log.e(NSTIJKPlayerSeriesThumbnail.this.f36962a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSeriesThumbnail.this.f36981m = i10;
            NSTIJKPlayerSeriesThumbnail.this.f36983n = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerSeriesThumbnail.this.f36971h == 3;
            if (!NSTIJKPlayerSeriesThumbnail.this.f36947O.d() || (NSTIJKPlayerSeriesThumbnail.this.f36977k == i10 && NSTIJKPlayerSeriesThumbnail.this.f36979l == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerSeriesThumbnail.this.f36975j != null && z10 && z9) {
                if (NSTIJKPlayerSeriesThumbnail.this.f36997u != 0) {
                    NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = NSTIJKPlayerSeriesThumbnail.this;
                    nSTIJKPlayerSeriesThumbnail.seekTo(nSTIJKPlayerSeriesThumbnail.f36997u);
                }
                NSTIJKPlayerSeriesThumbnail.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            if (bVar.a() != NSTIJKPlayerSeriesThumbnail.this.f36947O) {
                Log.e(NSTIJKPlayerSeriesThumbnail.this.f36962a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerSeriesThumbnail.this.f36973i = bVar;
            if (NSTIJKPlayerSeriesThumbnail.this.f36975j == null) {
                NSTIJKPlayerSeriesThumbnail.this.U();
            } else {
                NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = NSTIJKPlayerSeriesThumbnail.this;
                nSTIJKPlayerSeriesThumbnail.H(nSTIJKPlayerSeriesThumbnail.f36975j, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            if (bVar.a() != NSTIJKPlayerSeriesThumbnail.this.f36947O) {
                Log.e(NSTIJKPlayerSeriesThumbnail.this.f36962a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerSeriesThumbnail.this.f36973i = null;
                NSTIJKPlayerSeriesThumbnail.this.W();
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 2) {
                NSTIJKPlayerSeriesThumbnail.this.L(false);
            } else {
                if (i9 != 4) {
                    return;
                }
                NSTIJKPlayerSeriesThumbnail.this.f36976j0.b(a7.f.f12285U).a();
                NSTIJKPlayerSeriesThumbnail.this.f36976j0.b(a7.f.f12552v).a();
                NSTIJKPlayerSeriesThumbnail.this.f36976j0.b(a7.f.f12582y).a();
            }
        }
    }

    public class c implements IMediaPlayer.OnVideoSizeChangedListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerSeriesThumbnail.this.f36977k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSeriesThumbnail.this.f36979l = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSeriesThumbnail.this.f36949P = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSeriesThumbnail.this.f36951Q = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSeriesThumbnail.this.f36977k == 0 || NSTIJKPlayerSeriesThumbnail.this.f36979l == 0) {
                return;
            }
            if (NSTIJKPlayerSeriesThumbnail.this.f36947O != null) {
                NSTIJKPlayerSeriesThumbnail.this.f36947O.c(NSTIJKPlayerSeriesThumbnail.this.f36977k, NSTIJKPlayerSeriesThumbnail.this.f36979l);
                NSTIJKPlayerSeriesThumbnail.this.f36947O.a(NSTIJKPlayerSeriesThumbnail.this.f36949P, NSTIJKPlayerSeriesThumbnail.this.f36951Q);
            }
            NSTIJKPlayerSeriesThumbnail.this.requestLayout();
        }
    }

    public class d implements IMediaPlayer.OnPreparedListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSeriesThumbnail.this.f36955S = System.currentTimeMillis();
            NSTIJKPlayerSeriesThumbnail.this.f36969g = 2;
            if (NSTIJKPlayerSeriesThumbnail.this.f36989q != null) {
                NSTIJKPlayerSeriesThumbnail.this.f36989q.onPrepared(NSTIJKPlayerSeriesThumbnail.this.f36975j);
            }
            NSTIJKPlayerSeriesThumbnail.c(NSTIJKPlayerSeriesThumbnail.this);
            NSTIJKPlayerSeriesThumbnail.this.f36977k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSeriesThumbnail.this.f36979l = iMediaPlayer.getVideoHeight();
            int i9 = NSTIJKPlayerSeriesThumbnail.this.f36997u;
            if (i9 != 0) {
                NSTIJKPlayerSeriesThumbnail.this.seekTo(i9);
            }
            if (NSTIJKPlayerSeriesThumbnail.this.f36977k == 0 || NSTIJKPlayerSeriesThumbnail.this.f36979l == 0) {
                if (NSTIJKPlayerSeriesThumbnail.this.f36971h == 3) {
                    NSTIJKPlayerSeriesThumbnail.this.start();
                    return;
                }
                return;
            }
            if (NSTIJKPlayerSeriesThumbnail.this.f36947O != null) {
                NSTIJKPlayerSeriesThumbnail.this.f36947O.c(NSTIJKPlayerSeriesThumbnail.this.f36977k, NSTIJKPlayerSeriesThumbnail.this.f36979l);
                NSTIJKPlayerSeriesThumbnail.this.f36947O.a(NSTIJKPlayerSeriesThumbnail.this.f36949P, NSTIJKPlayerSeriesThumbnail.this.f36951Q);
                if (!NSTIJKPlayerSeriesThumbnail.this.f36947O.d() || (NSTIJKPlayerSeriesThumbnail.this.f36981m == NSTIJKPlayerSeriesThumbnail.this.f36977k && NSTIJKPlayerSeriesThumbnail.this.f36983n == NSTIJKPlayerSeriesThumbnail.this.f36979l)) {
                    if (NSTIJKPlayerSeriesThumbnail.this.f36971h == 3) {
                        NSTIJKPlayerSeriesThumbnail.this.start();
                    } else {
                        if (NSTIJKPlayerSeriesThumbnail.this.isPlaying()) {
                            return;
                        }
                        if (i9 == 0 && NSTIJKPlayerSeriesThumbnail.this.getCurrentPosition() <= 0) {
                            return;
                        }
                    }
                    NSTIJKPlayerSeriesThumbnail.c(NSTIJKPlayerSeriesThumbnail.this);
                }
            }
        }
    }

    public class e implements IMediaPlayer.OnCompletionListener {
        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSeriesThumbnail.this.f36969g = 5;
            NSTIJKPlayerSeriesThumbnail.this.f36971h = 5;
            NSTIJKPlayerSeriesThumbnail.c(NSTIJKPlayerSeriesThumbnail.this);
            NSTIJKPlayerSeriesThumbnail.this.c0(-1);
            if (NSTIJKPlayerSeriesThumbnail.this.f36987p != null) {
                NSTIJKPlayerSeriesThumbnail.this.f36987p.onCompletion(NSTIJKPlayerSeriesThumbnail.this.f36975j);
            }
        }
    }

    public class f implements IMediaPlayer.OnInfoListener {
        public f() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i9, int i10) {
            String str;
            String str2;
            if (NSTIJKPlayerSeriesThumbnail.this.f36995t != null) {
                NSTIJKPlayerSeriesThumbnail.this.f36995t.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerSeriesThumbnail.this.c0(2);
                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerSeriesThumbnail.this.c0(1);
                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerSeriesThumbnail.this.f36985o = i10;
                        Log.d(NSTIJKPlayerSeriesThumbnail.this.f36962a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        if (NSTIJKPlayerSeriesThumbnail.this.f36947O != null) {
                            NSTIJKPlayerSeriesThumbnail.this.f36947O.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSeriesThumbnail.this.c0(1);
                                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSeriesThumbnail.this.c0(6);
                                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSeriesThumbnail.this.f36962a;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class g implements IMediaPlayer.OnErrorListener {
        public g() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i9, int i10) {
            Log.d(NSTIJKPlayerSeriesThumbnail.this.f36962a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerSeriesThumbnail.this.f36969g = -1;
            NSTIJKPlayerSeriesThumbnail.this.f36971h = -1;
            NSTIJKPlayerSeriesThumbnail.c(NSTIJKPlayerSeriesThumbnail.this);
            NSTIJKPlayerSeriesThumbnail.this.c0(-1);
            if (NSTIJKPlayerSeriesThumbnail.this.f36993s != null) {
                NSTIJKPlayerSeriesThumbnail.this.f36993s.onError(NSTIJKPlayerSeriesThumbnail.this.f36975j, i9, i10);
            }
            return true;
        }
    }

    public class h implements IMediaPlayer.OnBufferingUpdateListener {
        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerSeriesThumbnail.this.f36991r = i9;
        }
    }

    public class i implements IMediaPlayer.OnSeekCompleteListener {
        public i() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSeriesThumbnail.this.f36959U = System.currentTimeMillis();
        }
    }

    public class j implements IMediaPlayer.OnTimedTextListener {
        public j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText != null) {
                NSTIJKPlayerSeriesThumbnail.this.f36960V.setText(ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", ""));
            }
        }
    }

    public class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f37019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f37020b;

        public k(Activity activity) {
            this.f37019a = activity;
        }

        public k a() {
            View view = this.f37020b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public k b(int i9) {
            this.f37020b = this.f37019a.findViewById(i9);
            return this;
        }

        public k c() {
            View view = this.f37020b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        public k d() {
            View view = this.f37020b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public k e(CharSequence charSequence) {
            View view = this.f37020b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public k f(int i9) {
            View view = this.f37020b;
            if (view != null) {
                view.setVisibility(i9);
            }
            return this;
        }

        public k g() {
            View view = this.f37020b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSeriesThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36962a = "NSTIJKPlayerEPG";
        this.f36967f = 0;
        this.f36969g = 0;
        this.f36971h = 0;
        this.f36973i = null;
        this.f36975j = null;
        this.f36999v = true;
        this.f37001w = true;
        this.f37003x = true;
        this.f37005y = -1;
        this.f37007z = -1L;
        this.f36921B = false;
        this.f36923C = 7000;
        this.f36929F = 0;
        this.f36933H = 0;
        this.f36935I = 5;
        this.f36937J = false;
        this.f36953R = 0L;
        this.f36955S = 0L;
        this.f36957T = 0L;
        this.f36959U = 0L;
        this.f36972h0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f36978k0 = bool;
        this.f36980l0 = bool;
        this.f36982m0 = bool;
        this.f36984n0 = bool;
        this.f36986o0 = bool;
        this.f36988p0 = bool;
        this.f36926D0 = 0;
        this.f36928E0 = new b(Looper.getMainLooper());
        this.f36930F0 = new c();
        this.f36932G0 = new d();
        this.f36934H0 = new e();
        this.f36936I0 = new f();
        this.f36938J0 = new g();
        this.f36940K0 = new h();
        this.f36942L0 = new i();
        this.f36944M0 = new j();
        this.f36946N0 = new a();
        this.f36948O0 = 4;
        this.f36950P0 = f36918U0[0];
        this.f36952Q0 = new ArrayList();
        this.f36954R0 = 0;
        this.f36956S0 = 0;
        this.f36958T0 = false;
        Q(context);
    }

    public static /* synthetic */ InterfaceC2938b c(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
        nSTIJKPlayerSeriesThumbnail.getClass();
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
    public tv.danmaku.ijk.media.player.IMediaPlayer I(int r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail.I(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void J(int i9) {
        AbstractC2941e.b(this.f36975j, i9);
    }

    public void K() {
        AbstractServiceC2895a.d(this.f36975j);
    }

    public void L(boolean z9) {
        if (z9 || this.f36919A) {
            b0(false);
            this.f36976j0.b(a7.f.f12236P).a();
            this.f36976j0.b(a7.f.f12484o2).a();
            this.f36976j0.b(a7.f.f12592z).c();
            this.f36976j0.b(a7.f.S9).a();
            this.f36919A = false;
            N();
        }
    }

    public void M(NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail, LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar, int i9) {
        this.f37002w0 = nSTIJKPlayerSeriesThumbnail;
        this.f37004x0 = linearLayout;
        this.f37006y0 = linearLayout2;
        this.f37008z0 = imageView;
        this.f36920A0 = linearLayout3;
        this.f36922B0 = linearLayout4;
        this.f36924C0 = progressBar;
        this.f36926D0 = i9;
    }

    public void N() {
        this.f36976j0.b(a7.f.f12236P).a();
        this.f36976j0.b(a7.f.f12484o2).a();
        this.f36976j0.b(a7.f.S9).a();
        this.f36919A = false;
        this.f36925D.removeCallbacksAndMessages(null);
        if (AbstractC2237a.f44434B.booleanValue()) {
            this.f36976j0.b(a7.f.Sm).g();
        }
    }

    public final void O() {
        boolean zP = this.f36945N.p();
        this.f36958T0 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f36975j = AbstractServiceC2895a.a();
        }
    }

    public final void P() {
        this.f36952Q0.clear();
        if (this.f36945N.s()) {
            this.f36952Q0.add(1);
        }
        if (this.f36945N.t()) {
            this.f36952Q0.add(2);
        }
        if (this.f36945N.r()) {
            this.f36952Q0.add(0);
        }
        if (this.f36952Q0.isEmpty()) {
            this.f36952Q0.add(1);
        }
        int iIntValue = ((Integer) this.f36952Q0.get(this.f36954R0)).intValue();
        this.f36956S0 = iIntValue;
        setRender(iIntValue);
    }

    public final void Q(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36943M = applicationContext;
        this.f36945N = new C2858a(applicationContext);
        O();
        P();
        this.f36977k = 0;
        this.f36979l = 0;
        this.f36969g = 0;
        this.f36971h = 0;
        TextView textView = new TextView(context);
        this.f36960V = textView;
        textView.setTextSize(24.0f);
        this.f36960V.setTextColor(context.getResources().getColor(a7.c.f11849G));
        this.f36960V.setGravity(17);
        addView(this.f36960V, new FrameLayout.LayoutParams(-1, -2, 80));
    }

    public boolean R() {
        return this.f36958T0;
    }

    public final boolean S() {
        int i9;
        return (this.f36975j == null || (i9 = this.f36969g) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    public void T() {
        IMediaPlayer iMediaPlayer = this.f36975j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    public void U() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f36963c == null || this.f36973i == null) {
            return;
        }
        V(false);
        try {
            ((AudioManager) this.f36943M.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            this.f36975j = I(this.f36945N.x());
            getContext();
            this.f36975j.setOnPreparedListener(this.f36932G0);
            this.f36975j.setOnVideoSizeChangedListener(this.f36930F0);
            this.f36975j.setOnCompletionListener(this.f36934H0);
            this.f36975j.setOnErrorListener(this.f36938J0);
            this.f36975j.setOnInfoListener(this.f36936I0);
            this.f36975j.setOnBufferingUpdateListener(this.f36940K0);
            this.f36975j.setOnSeekCompleteListener(this.f36942L0);
            this.f36975j.setOnTimedTextListener(this.f36944M0);
            this.f36991r = 0;
            String scheme = this.f36963c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f36945N.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f36975j.setDataSource(new C2937a(new File(this.f36963c.toString())));
            } else {
                this.f36975j.setDataSource(this.f36943M, this.f36963c, this.f36965e);
            }
            H(this.f36975j, this.f36973i);
            this.f36975j.setAudioStreamType(3);
            this.f36975j.setScreenOnWhilePlaying(true);
            this.f36953R = System.currentTimeMillis();
            this.f36975j.prepareAsync();
            this.f36974i0 = this.f36961W.getResources().getDisplayMetrics().widthPixels;
            AudioManager audioManager = (AudioManager) this.f36961W.getSystemService("audio");
            this.f36968f0 = audioManager;
            this.f36970g0 = audioManager.getStreamMaxVolume(3);
            T();
            this.f36969g = 1;
        } catch (IOException e9) {
            Log.w(this.f36962a, "Unable to open content: " + this.f36963c, e9);
            this.f36969g = -1;
            this.f36971h = -1;
            onErrorListener = this.f36938J0;
            onErrorListener.onError(this.f36975j, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f36962a, "Unable to open content: " + this.f36963c, e10);
            this.f36969g = -1;
            this.f36971h = -1;
            onErrorListener = this.f36938J0;
            onErrorListener.onError(this.f36975j, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f36962a, "Unable to open content: " + this.f36963c, e11);
            this.f36969g = -1;
            this.f36971h = -1;
            onErrorListener = this.f36938J0;
            onErrorListener.onError(this.f36975j, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f36962a, "Unable to open content: " + this.f36963c, e12);
            this.f36969g = -1;
            this.f36971h = -1;
            onErrorListener = this.f36938J0;
            onErrorListener.onError(this.f36975j, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void V(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f36975j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f36975j.release();
            this.f36975j = null;
            this.f36969g = 0;
            if (z9) {
                this.f36971h = 0;
            }
            ((AudioManager) this.f36943M.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void W() {
        IMediaPlayer iMediaPlayer = this.f36975j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void X(int i9) {
        AbstractC2941e.e(this.f36975j, i9);
    }

    public void Y(Activity activity, NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail) {
        this.f36961W = activity;
        this.f36966e0 = nSTIJKPlayerSeriesThumbnail;
        this.f36925D = new Handler();
        this.f36927E = new Handler();
        this.f36976j0 = new k(activity);
    }

    public final void Z(Uri uri, Map map, boolean z9, String str) {
        this.f36963c = uri;
        this.f36964d = str;
        this.f36965e = map;
        this.f36997u = 0;
        this.f36931G = z9;
        e0();
        U();
        requestLayout();
        invalidate();
    }

    public void a0(Uri uri, boolean z9, String str) {
        Z(uri, null, z9, str);
    }

    public void b0(boolean z9) {
        this.f36976j0.b(a7.f.f12562w).f(z9 ? 0 : 8);
        this.f36976j0.b(a7.f.f12572x).f(z9 ? 0 : 8);
        this.f36976j0.b(a7.f.f12136F).f(z9 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(int r8) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail.c0(int):void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f36999v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f37001w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f37003x;
    }

    public void d0() {
        AbstractServiceC2895a.d(null);
    }

    public void e0() {
        IMediaPlayer iMediaPlayer = this.f36975j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f36975j.release();
            this.f36975j = null;
            this.f36969g = 0;
            this.f36971h = 0;
            ((AudioManager) this.f36943M.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f36975j != null) {
            return this.f36991r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (S()) {
            return (int) this.f36975j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f36929F;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (S()) {
            return (int) this.f36975j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f36931G);
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f36975j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return S() && (iMediaPlayer = this.f36975j) != null && iMediaPlayer.isPlaying();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 4 || i9 == 24 || i9 == 25 || i9 == 164 || i9 == 82 || i9 != 5) {
        }
        S();
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (S() && (iMediaPlayer = this.f36975j) != null && iMediaPlayer.isPlaying()) {
            this.f36975j.pause();
            this.f36969g = 4;
        }
        this.f36971h = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (S()) {
            this.f36957T = System.currentTimeMillis();
            this.f36975j.seekTo(i9);
            i9 = 0;
        }
        this.f36997u = i9;
    }

    public void setContext(Context context) {
        this.f37000v0 = context;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f36929F = i9;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f36998u0 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        G();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f36987p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f36993s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f36995t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f36989q = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f36962a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f36975j != null) {
                cVar.getSurfaceHolder().b(this.f36975j);
                cVar.c(this.f36975j.getVideoWidth(), this.f36975j.getVideoHeight());
                cVar.a(this.f36975j.getVideoSarNum(), this.f36975j.getVideoSarDen());
                cVar.setAspectRatio(this.f36950P0);
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f36947O != null) {
            IMediaPlayer iMediaPlayer = this.f36975j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f36947O.getView();
            this.f36947O.b(this.f36946N0);
            this.f36947O = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f36947O = aVar;
        SharedPreferences sharedPreferences = this.f36943M.getSharedPreferences("loginPrefs", 0);
        this.f36939K = sharedPreferences;
        int i11 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f36948O0 = i11;
        aVar.setAspectRatio(i11);
        int i12 = this.f36977k;
        if (i12 > 0 && (i10 = this.f36979l) > 0) {
            aVar.c(i12, i10);
        }
        int i13 = this.f36949P;
        if (i13 > 0 && (i9 = this.f36951Q) > 0) {
            aVar.a(i13, i9);
        }
        View view2 = this.f36947O.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f36947O.e(this.f36946N0);
        this.f36947O.setVideoRotation(this.f36985o);
    }

    public void setTitle(CharSequence charSequence) {
        this.f36976j0.b(a7.f.f12226O).e(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (S()) {
            this.f36975j.start();
            this.f36969g = 3;
        }
        this.f36971h = 3;
    }
}
