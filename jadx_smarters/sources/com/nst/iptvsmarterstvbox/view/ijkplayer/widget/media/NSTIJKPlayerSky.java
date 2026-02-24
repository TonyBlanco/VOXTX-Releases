package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m7.AbstractC2237a;
import okhttp3.internal.ws.WebSocketProtocol;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.http.protocol.HttpRequestExecutor;
import org.chromium.net.UrlRequest;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;
import u7.C2858a;
import v7.AbstractServiceC2895a;
import w7.AbstractC2941e;
import w7.C2937a;
import w7.InterfaceC2938b;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerSky extends FrameLayout implements MediaController.MediaPlayerControl, z7.n {

    /* JADX INFO: renamed from: Y1, reason: collision with root package name */
    public static final int[] f37022Y1 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f37023A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public SharedPreferences f37024A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public String f37025A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f37026B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SharedPreferences f37027B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public String f37028B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f37029C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences f37030C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public Handler f37031C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Handler f37032D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences f37033D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public Context f37034D1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Handler f37035E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public SharedPreferences.Editor f37036E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public LiveStreamDBHandler f37037E1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f37038F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public SharedPreferences.Editor f37039F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public String f37040F1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f37041G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public SharedPreferences.Editor f37042G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public w f37043G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f37044H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f37045H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f37046H1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f37047I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f37048I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f37049I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f37050J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public SharedPreferences f37051J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f37052J1;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f37053K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public n7.l f37054K0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37055K1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences.Editor f37056L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f37057L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37058L1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f37059M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public TextView f37060M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37061M1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Context f37062N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public TextView f37063N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37064N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C2858a f37065O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f37066O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f37067O1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f37068P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public RadioGroup f37069P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public IMediaPlayer.OnSeekCompleteListener f37070P1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f37071Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public RadioGroup f37072Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public IMediaPlayer.OnTimedTextListener f37073Q1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f37074R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public RadioGroup f37075R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public a.InterfaceC0291a f37076R1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f37077S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public SharedPreferences.Editor f37078S0;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public int f37079S1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f37080T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public TextView f37081T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public int f37082T1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f37083U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public FrameLayout f37084U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public List f37085U1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f37086V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public androidx.appcompat.app.a f37087V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public int f37088V1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f37089W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public SeekBar f37090W0;

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public int f37091W1;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public SeekBar f37092X0;

    /* JADX INFO: renamed from: X1, reason: collision with root package name */
    public boolean f37093X1;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public LinearLayout f37094Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Handler f37095Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37096a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Runnable f37097a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Handler f37098b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f37099c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Runnable f37100c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37101d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public Animation f37102d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f37103e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f37104e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Animation f37105e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37106f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Activity f37107f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public ImageView f37108f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37109g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public NSTIJKPlayerSky f37110g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public ImageView f37111g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37112h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AudioManager f37113h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public LinearLayout f37114h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.b f37115i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f37116i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public LinearLayout f37117i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IMediaPlayer f37118j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f37119j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f37120j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37121k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public GestureDetector f37122k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public TextView f37123k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37124l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f37125l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f37126l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37127m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public View f37128m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public LinearLayout f37129m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37130n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public z f37131n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Animation f37132n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37133o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Button f37134o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Animation f37135o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37136p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Boolean f37137p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public RelativeLayout f37138p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37139q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Boolean f37140q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public Animation f37141q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37142r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Boolean f37143r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public LinearLayout f37144r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37145s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Boolean f37146s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public Animation f37147s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37148t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Boolean f37149t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public Animation f37150t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f37151u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Boolean f37152u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public Animation f37153u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37154v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f37155v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public SharedPreferences f37156v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f37157w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public StringBuilder f37158w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public RelativeLayout f37159w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37160x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Formatter f37161x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f37162x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f37163y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f37164y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f37165y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f37166z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f37167z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public String f37168z1;

    public class a implements IMediaPlayer.OnInfoListener {
        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i9, int i10) {
            String str;
            String str2;
            if (NSTIJKPlayerSky.this.f37148t != null) {
                NSTIJKPlayerSky.this.f37148t.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerSky.this.D1(2);
                str = NSTIJKPlayerSky.this.f37096a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerSky.this.D1(1);
                str = NSTIJKPlayerSky.this.f37096a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerSky.this.f37096a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerSky.this.f37133o = i10;
                        Log.d(NSTIJKPlayerSky.this.f37096a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = NSTIJKPlayerSky.this.f37068P;
                        if (aVar != null) {
                            aVar.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerSky.this.f37096a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSky.this.D1(1);
                                str = NSTIJKPlayerSky.this.f37096a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSky.this.D1(6);
                                str = NSTIJKPlayerSky.this.f37096a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSky.this.f37096a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerSky.this.f37096a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSky.this.f37096a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSky.this.f37096a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSky.this.f37096a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSky.this.f37096a;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public class b implements IMediaPlayer.OnErrorListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i9, int i10) {
            Log.d(NSTIJKPlayerSky.this.f37096a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerSky.this.f37109g = -1;
            NSTIJKPlayerSky.this.f37112h = -1;
            NSTIJKPlayerSky.A(NSTIJKPlayerSky.this);
            NSTIJKPlayerSky.this.D1(-1);
            if (NSTIJKPlayerSky.this.f37145s != null) {
                NSTIJKPlayerSky.this.f37145s.onError(NSTIJKPlayerSky.this.f37118j, i9, i10);
            }
            return true;
        }
    }

    public class c implements IMediaPlayer.OnBufferingUpdateListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerSky.this.f37142r = i9;
        }
    }

    public class d implements IMediaPlayer.OnSeekCompleteListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSky.this.f37086V = System.currentTimeMillis();
        }
    }

    public class e implements IMediaPlayer.OnTimedTextListener {
        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                NSTIJKPlayerSky.this.f37089W.setVisibility(8);
                return;
            }
            String strReplace = ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", "").replace("{\\c}", "");
            StringBuilder sb = new StringBuilder();
            try {
                if (strReplace.contains("{")) {
                    for (String strSubstring : strReplace.split("\\{")) {
                        if (strSubstring.contains("}")) {
                            strSubstring = strSubstring.substring(strSubstring.lastIndexOf("}") + 1);
                        }
                        sb.append(strSubstring);
                    }
                }
            } catch (Exception unused) {
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.f37051J0 = nSTIJKPlayerSky.f37062N.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerSky.this.f37089W.setTextSize(2, Float.parseFloat(NSTIJKPlayerSky.this.f37051J0.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0)));
            } catch (Exception unused2) {
            }
            if (NSTIJKPlayerSky.this.getShowOrHideSubtitles().equals("visible")) {
                NSTIJKPlayerSky.this.f37089W.setVisibility(0);
            } else {
                NSTIJKPlayerSky.this.f37089W.setVisibility(8);
            }
            if (sb.length() > 0) {
                textView = NSTIJKPlayerSky.this.f37089W;
                strReplace = sb.toString();
            } else {
                textView = NSTIJKPlayerSky.this.f37089W;
            }
            textView.setText(strReplace);
        }
    }

    public class f implements a.InterfaceC0291a {
        public f() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            if (aVarA != nSTIJKPlayerSky.f37068P) {
                Log.e(nSTIJKPlayerSky.f37096a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSky.f37127m = i10;
            NSTIJKPlayerSky.this.f37130n = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerSky.this.f37112h == 3;
            if (!NSTIJKPlayerSky.this.f37068P.d() || (NSTIJKPlayerSky.this.f37121k == i10 && NSTIJKPlayerSky.this.f37124l == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerSky.this.f37118j != null && z10 && z9) {
                if (NSTIJKPlayerSky.this.f37151u != 0) {
                    NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                    nSTIJKPlayerSky2.seekTo(nSTIJKPlayerSky2.f37151u);
                }
                NSTIJKPlayerSky.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            if (aVarA != nSTIJKPlayerSky.f37068P) {
                Log.e(nSTIJKPlayerSky.f37096a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSky.f37115i = bVar;
            if (NSTIJKPlayerSky.this.f37118j == null) {
                NSTIJKPlayerSky.this.q1();
            } else {
                NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                nSTIJKPlayerSky2.d1(nSTIJKPlayerSky2.f37118j, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            if (aVarA != nSTIJKPlayerSky.f37068P) {
                Log.e(nSTIJKPlayerSky.f37096a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerSky.f37115i = null;
                NSTIJKPlayerSky.this.s1();
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f37175a;

        public g(LinearLayout linearLayout) {
            this.f37175a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37175a.setVisibility(8);
            if (NSTIJKPlayerSky.this.f37094Y0.getVisibility() != 0 || NSTIJKPlayerSky.this.f37129m1 == null) {
                return;
            }
            NSTIJKPlayerSky.this.f37129m1.setVisibility(0);
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSky.this.I1();
        }
    }

    public class i implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37178a;

        public i(int i9) {
            this.f37178a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.f37042G0 = nSTIJKPlayerSky.f37033D0.edit();
            if (i9 == 111 || i9 == 11111111) {
                NSTIJKPlayerSky.this.f37042G0.putInt("currentVideoTrack", -1);
                NSTIJKPlayerSky.this.g1(this.f37178a);
            } else {
                NSTIJKPlayerSky.this.f37042G0.putInt("currentVideoTrack", i9);
                NSTIJKPlayerSky.this.w1(i9);
            }
            NSTIJKPlayerSky.this.f37042G0.apply();
        }
    }

    public class j implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37180a;

        public j(int i9) {
            this.f37180a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.f37039F0 = nSTIJKPlayerSky.f37030C0.edit();
            if (i9 == 1111 || i9 == 1111111) {
                NSTIJKPlayerSky.this.f37039F0.putInt("currentAudioTrack", -1);
                NSTIJKPlayerSky.this.g1(this.f37180a);
            } else {
                NSTIJKPlayerSky.this.f37039F0.putInt("currentAudioTrack", i9);
                int currentPosition = (int) NSTIJKPlayerSky.this.f37118j.getCurrentPosition();
                NSTIJKPlayerSky.this.w1(i9);
                NSTIJKPlayerSky.this.f37118j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerSky.this.f37039F0.apply();
        }
    }

    public class k implements SeekBar.OnSeekBarChangeListener {
        public k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            NSTIJKPlayerSky.this.f37119j0 = i9;
            int i11 = (int) ((NSTIJKPlayerSky.this.f37119j0 / 255.0f) * 100.0f);
            if (i11 < 20) {
                textView = NSTIJKPlayerSky.this.f37123k1;
                resources = NSTIJKPlayerSky.this.getResources();
                i10 = a7.e.f12015i0;
            } else if (i11 < 30) {
                textView = NSTIJKPlayerSky.this.f37123k1;
                resources = NSTIJKPlayerSky.this.getResources();
                i10 = a7.e.f12019j0;
            } else if (i11 < 40) {
                textView = NSTIJKPlayerSky.this.f37123k1;
                resources = NSTIJKPlayerSky.this.getResources();
                i10 = a7.e.f12023k0;
            } else if (i11 < 50) {
                textView = NSTIJKPlayerSky.this.f37123k1;
                resources = NSTIJKPlayerSky.this.getResources();
                i10 = a7.e.f12027l0;
            } else if (i11 < 60) {
                textView = NSTIJKPlayerSky.this.f37123k1;
                resources = NSTIJKPlayerSky.this.getResources();
                i10 = a7.e.f12031m0;
            } else if (i11 < 70) {
                textView = NSTIJKPlayerSky.this.f37123k1;
                resources = NSTIJKPlayerSky.this.getResources();
                i10 = a7.e.f12035n0;
            } else {
                textView = NSTIJKPlayerSky.this.f37123k1;
                resources = NSTIJKPlayerSky.this.getResources();
                i10 = a7.e.f12039o0;
            }
            textView.setBackground(resources.getDrawable(i10));
            WindowManager.LayoutParams attributes = NSTIJKPlayerSky.this.f37107f0.getWindow().getAttributes();
            attributes.screenBrightness = NSTIJKPlayerSky.this.f37119j0 / 255.0f;
            NSTIJKPlayerSky.this.f37065O.R((int) NSTIJKPlayerSky.this.f37119j0);
            NSTIJKPlayerSky.this.f37107f0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSky.this.F1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSky.this.F1();
            NSTIJKPlayerSky.this.b1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class l implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37183a;

        public l(int i9) {
            this.f37183a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.f37036E0 = nSTIJKPlayerSky.f37027B0.edit();
            if (i9 == 11111 || i9 == 111111) {
                TextView textView = NSTIJKPlayerSky.this.f37089W;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerSky.this.f37036E0.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerSky.this.g1(this.f37183a);
            } else {
                TextView textView2 = NSTIJKPlayerSky.this.f37089W;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                NSTIJKPlayerSky.this.f37036E0.putInt("currentSubtitleTrack", i9);
                NSTIJKPlayerSky.this.w1(i9);
            }
            NSTIJKPlayerSky.this.f37036E0.apply();
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            NSTIJKPlayerSky nSTIJKPlayerSky;
            String str;
            switch (i9) {
                case 0:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "36";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "38";
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    nSTIJKPlayerSky = NSTIJKPlayerSky.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerSky.J1(str);
            NSTIJKPlayerSky.this.f37081T0.setText(str);
            dialogInterface.cancel();
        }
    }

    public class n implements DialogInterface.OnDismissListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class o implements SeekBar.OnSeekBarChangeListener {
        public o() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            if (NSTIJKPlayerSky.this.f37113h0 != null) {
                try {
                    NSTIJKPlayerSky.this.f37113h0.setStreamVolume(3, i9, 0);
                    int streamVolume = (int) ((NSTIJKPlayerSky.this.f37113h0.getStreamVolume(3) / NSTIJKPlayerSky.this.f37116i0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = NSTIJKPlayerSky.this.f37126l1;
                        resources = NSTIJKPlayerSky.this.getResources();
                        i10 = a7.e.f12071w0;
                    } else if (streamVolume < 40) {
                        textView = NSTIJKPlayerSky.this.f37126l1;
                        resources = NSTIJKPlayerSky.this.getResources();
                        i10 = a7.e.f12059t0;
                    } else if (streamVolume < 80) {
                        textView = NSTIJKPlayerSky.this.f37126l1;
                        resources = NSTIJKPlayerSky.this.getResources();
                        i10 = a7.e.f12063u0;
                    } else if (streamVolume < 100) {
                        textView = NSTIJKPlayerSky.this.f37126l1;
                        resources = NSTIJKPlayerSky.this.getResources();
                        i10 = a7.e.f12067v0;
                    } else {
                        textView = NSTIJKPlayerSky.this.f37126l1;
                        resources = NSTIJKPlayerSky.this.getResources();
                        i10 = a7.e.f12067v0;
                    }
                    textView.setBackground(resources.getDrawable(i10));
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSky.this.F1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSky.this.F1();
            NSTIJKPlayerSky.this.b1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class p implements View.OnTouchListener {
        public p() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (((LinearLayout) NSTIJKPlayerSky.this.f37107f0.findViewById(a7.f.f12145F8)).getVisibility() == 0 || motionEvent == null || !NSTIJKPlayerSky.this.f37122k0.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            nSTIJKPlayerSky.f37044H++;
            m7.w.P0(nSTIJKPlayerSky.f37107f0, NSTIJKPlayerSky.this.f37107f0.getResources().getString(a7.j.f13262g5) + " (" + NSTIJKPlayerSky.this.f37044H + "/" + NSTIJKPlayerSky.this.f37047I + ")");
            NSTIJKPlayerSky.this.q1();
            NSTIJKPlayerSky.this.start();
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSky.this.k1();
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSky.this.j1();
        }
    }

    public class t implements IMediaPlayer.OnVideoSizeChangedListener {
        public t() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerSky.this.f37121k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSky.this.f37124l = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSky.this.f37071Q = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSky.this.f37074R = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSky.this.f37121k == 0 || NSTIJKPlayerSky.this.f37124l == 0) {
                return;
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = nSTIJKPlayerSky.f37068P;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerSky.f37121k, NSTIJKPlayerSky.this.f37124l);
                NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                nSTIJKPlayerSky2.f37068P.a(nSTIJKPlayerSky2.f37071Q, NSTIJKPlayerSky.this.f37074R);
            }
            NSTIJKPlayerSky.this.requestLayout();
        }
    }

    public class u implements IMediaPlayer.OnPreparedListener {
        public u() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSky.this.f37080T = System.currentTimeMillis();
            NSTIJKPlayerSky.this.f37109g = 2;
            if (NSTIJKPlayerSky.this.f37131n0.b(a7.f.f12086A) != null) {
                NSTIJKPlayerSky.this.f37131n0.b(a7.f.f12086A).a();
            }
            if (NSTIJKPlayerSky.this.f37139q != null) {
                NSTIJKPlayerSky.this.f37139q.onPrepared(NSTIJKPlayerSky.this.f37118j);
            }
            NSTIJKPlayerSky.A(NSTIJKPlayerSky.this);
            NSTIJKPlayerSky.this.f37121k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSky.this.f37124l = iMediaPlayer.getVideoHeight();
            int i9 = NSTIJKPlayerSky.this.f37151u;
            if (i9 != 0) {
                NSTIJKPlayerSky.this.seekTo(i9);
            }
            if (NSTIJKPlayerSky.this.f37121k == 0 || NSTIJKPlayerSky.this.f37124l == 0) {
                if (NSTIJKPlayerSky.this.f37112h == 3) {
                    NSTIJKPlayerSky.this.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerSky nSTIJKPlayerSky = NSTIJKPlayerSky.this;
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = nSTIJKPlayerSky.f37068P;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerSky.f37121k, NSTIJKPlayerSky.this.f37124l);
                NSTIJKPlayerSky nSTIJKPlayerSky2 = NSTIJKPlayerSky.this;
                nSTIJKPlayerSky2.f37068P.a(nSTIJKPlayerSky2.f37071Q, NSTIJKPlayerSky.this.f37074R);
                if (!NSTIJKPlayerSky.this.f37068P.d() || (NSTIJKPlayerSky.this.f37127m == NSTIJKPlayerSky.this.f37121k && NSTIJKPlayerSky.this.f37130n == NSTIJKPlayerSky.this.f37124l)) {
                    if (NSTIJKPlayerSky.this.f37112h == 3) {
                        NSTIJKPlayerSky.this.start();
                    } else {
                        if (NSTIJKPlayerSky.this.isPlaying()) {
                            return;
                        }
                        if (i9 == 0 && NSTIJKPlayerSky.this.getCurrentPosition() <= 0) {
                            return;
                        }
                    }
                    NSTIJKPlayerSky.A(NSTIJKPlayerSky.this);
                }
            }
        }
    }

    public class v implements IMediaPlayer.OnCompletionListener {
        public v() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSky.this.f37109g = 5;
            NSTIJKPlayerSky.this.f37112h = 5;
            NSTIJKPlayerSky.A(NSTIJKPlayerSky.this);
            NSTIJKPlayerSky.this.F1();
            NSTIJKPlayerSky.this.A1();
            NSTIJKPlayerSky.this.b1(5000);
            if (NSTIJKPlayerSky.this.f37136p != null) {
                NSTIJKPlayerSky.this.f37136p.onCompletion(NSTIJKPlayerSky.this.f37118j);
            }
        }
    }

    public static abstract class w {
        public abstract void a();

        public abstract void b();
    }

    public class x implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37195a;

        public x(View view) {
            this.f37195a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37195a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37195a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (!z9) {
                if (z9) {
                    return;
                }
                View view2 = this.f37195a;
                if (view2 != null && view2.getTag() != null && this.f37195a.getTag().equals("1") && NSTIJKPlayerSky.this.f37134o0 != null) {
                    NSTIJKPlayerSky.this.f37134o0.setBackgroundResource(a7.e.f12038o);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f37195a;
            if (view3 != null && view3.getTag() != null && this.f37195a.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerSky.this.getResources().getDrawable(a7.e.f11931K1));
                return;
            }
            float f9 = z9 ? 1.12f : 1.0f;
            a(f9);
            b(f9);
            View view4 = this.f37195a;
            if (view4 == null || view4.getTag() == null || !this.f37195a.getTag().equals("1") || NSTIJKPlayerSky.this.f37134o0 == null) {
                return;
            }
            NSTIJKPlayerSky.this.f37134o0.setBackgroundResource(a7.e.f12010h);
        }
    }

    public class y extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37197a;

        public y() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f37197a = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            NSTIJKPlayerSky.this.L1();
            return true;
        }
    }

    public class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f37199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f37200b;

        public z(Activity activity) {
            this.f37199a = activity;
        }

        public z a() {
            View view = this.f37200b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public z b(int i9) {
            this.f37200b = this.f37199a.findViewById(i9);
            return this;
        }

        public z c() {
            View view = this.f37200b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public z d(CharSequence charSequence) {
            View view = this.f37200b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public z e() {
            View view = this.f37200b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerSky(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37096a = "NSTIJKPlayerSky";
        this.f37106f = 0;
        this.f37109g = 0;
        this.f37112h = 0;
        this.f37115i = null;
        this.f37118j = null;
        this.f37154v = true;
        this.f37157w = true;
        this.f37160x = true;
        this.f37163y = -1;
        this.f37166z = -1L;
        this.f37023A = true;
        this.f37026B = false;
        this.f37029C = 7000;
        this.f37038F = 0;
        this.f37044H = 0;
        this.f37047I = 5;
        this.f37050J = false;
        this.f37077S = 0L;
        this.f37080T = 0L;
        this.f37083U = 0L;
        this.f37086V = 0L;
        this.f37104e0 = "visible";
        this.f37119j0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f37137p0 = bool;
        this.f37140q0 = bool;
        this.f37143r0 = bool;
        this.f37146s0 = bool;
        this.f37149t0 = bool;
        this.f37152u0 = bool;
        this.f37155v0 = false;
        this.f37164y0 = false;
        this.f37167z0 = false;
        this.f37045H0 = false;
        this.f37048I0 = false;
        this.f37057L0 = false;
        this.f37120j1 = 0;
        this.f37165y1 = false;
        this.f37046H1 = new k();
        this.f37049I1 = new o();
        this.f37052J1 = new t();
        this.f37055K1 = new u();
        this.f37058L1 = new v();
        this.f37061M1 = new a();
        this.f37064N1 = new b();
        this.f37067O1 = new c();
        this.f37070P1 = new d();
        this.f37073Q1 = new e();
        this.f37076R1 = new f();
        this.f37079S1 = 4;
        this.f37082T1 = f37022Y1[0];
        this.f37085U1 = new ArrayList();
        this.f37088V1 = 0;
        this.f37091W1 = 0;
        this.f37093X1 = false;
        n1(context);
    }

    public static /* synthetic */ InterfaceC2938b A(NSTIJKPlayerSky nSTIJKPlayerSky) {
        nSTIJKPlayerSky.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D1(int r15) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.D1(int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void I1() {
        int i9;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        a.C0158a c0158a = new a.C0158a(this.f37034D1);
        c0158a.setTitle(getResources().getString(a7.j.f13121R7));
        String string = this.f37051J0.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
        string.hashCode();
        byte b9 = -1;
        switch (string.hashCode()) {
            case 1567:
                if (string.equals("10")) {
                    b9 = 0;
                }
                break;
            case 1569:
                if (string.equals("12")) {
                    b9 = 1;
                }
                break;
            case 1571:
                if (string.equals("14")) {
                    b9 = 2;
                }
                break;
            case 1573:
                if (string.equals("16")) {
                    b9 = 3;
                }
                break;
            case 1575:
                if (string.equals("18")) {
                    b9 = 4;
                }
                break;
            case 1598:
                if (string.equals("20")) {
                    b9 = 5;
                }
                break;
            case 1600:
                if (string.equals("22")) {
                    b9 = 6;
                }
                break;
            case 1602:
                if (string.equals("24")) {
                    b9 = 7;
                }
                break;
            case 1604:
                if (string.equals("26")) {
                    b9 = 8;
                }
                break;
            case 1606:
                if (string.equals("28")) {
                    b9 = 9;
                }
                break;
            case 1629:
                if (string.equals("30")) {
                    b9 = 10;
                }
                break;
            case 1631:
                if (string.equals("32")) {
                    b9 = 11;
                }
                break;
            case 1633:
                if (string.equals("34")) {
                    b9 = 12;
                }
                break;
            case 1635:
                if (string.equals("36")) {
                    b9 = 13;
                }
                break;
            case 1637:
                if (string.equals("38")) {
                    b9 = 14;
                }
                break;
            case 1660:
                if (string.equals("40")) {
                    b9 = 15;
                }
                break;
        }
        switch (b9) {
            case 0:
            default:
                i9 = 0;
                break;
            case 1:
                i9 = 1;
                break;
            case 2:
                i9 = 2;
                break;
            case 3:
                i9 = 3;
                break;
            case 4:
                i9 = 4;
                break;
            case 5:
                i9 = 5;
                break;
            case 6:
                i9 = 6;
                break;
            case 7:
                i9 = 7;
                break;
            case 8:
                i9 = 8;
                break;
            case 9:
                i9 = 9;
                break;
            case 10:
                i9 = 10;
                break;
            case 11:
                i9 = 11;
                break;
            case 12:
                i9 = 12;
                break;
            case 13:
                i9 = 13;
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                i9 = 14;
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                i9 = 15;
                break;
        }
        c0158a.l(charSequenceArr, i9, new m());
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f37087V0 = aVarCreate;
        aVarCreate.setOnDismissListener(new n());
        this.f37087V0.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1(String str) {
        try {
            SharedPreferences sharedPreferences = this.f37107f0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f37051J0 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f37078S0 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.f37078S0.apply();
            }
        } catch (Exception unused) {
        }
    }

    private void M1() {
        View viewFindViewById = this.f37107f0.findViewById(a7.f.f12491p);
        this.f37128m0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.f37128m0.setOnTouchListener(new p());
    }

    private void O1() {
        try {
            IMediaPlayer iMediaPlayer = this.f37118j;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.f37131n0.b(a7.f.f12162H5).a();
                this.f37131n0.b(a7.f.f12172I5).e();
                w wVar = this.f37043G1;
                if (wVar != null) {
                    wVar.b();
                }
            } else {
                this.f37131n0.b(a7.f.f12172I5).a();
                this.f37131n0.b(a7.f.f12162H5).e();
                w wVar2 = this.f37043G1;
                if (wVar2 != null) {
                    wVar2.a();
                }
            }
        } catch (Exception unused) {
        }
    }

    private void a1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    private String e1(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
    }

    private void l1() {
        boolean zP = this.f37065O.p();
        this.f37093X1 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f37118j = AbstractServiceC2895a.a();
        }
    }

    private void m1() {
        this.f37085U1.clear();
        if (this.f37065O.s()) {
            this.f37085U1.add(1);
        }
        if (this.f37065O.t()) {
            this.f37085U1.add(2);
        }
        if (this.f37065O.r()) {
            this.f37085U1.add(0);
        }
        if (this.f37085U1.isEmpty()) {
            this.f37085U1.add(1);
        }
        int iIntValue = ((Integer) this.f37085U1.get(this.f37088V1)).intValue();
        this.f37091W1 = iIntValue;
        setRender(iIntValue);
    }

    private void n1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f37062N = applicationContext;
        this.f37065O = new C2858a(applicationContext);
        this.f37054K0 = new n7.l(this, this.f37062N);
        l1();
        m1();
        this.f37121k = 0;
        this.f37124l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f37109g = 0;
        this.f37112h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f37051J0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
        TextView textView = new TextView(context);
        this.f37089W = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception unused) {
        }
        this.f37089W.setTextColor(context.getResources().getColor(a7.c.f11849G));
        this.f37089W.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f37089W, layoutParams);
    }

    private boolean p1() {
        int i9;
        return (this.f37118j == null || (i9 = this.f37109g) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    private void y1(Uri uri, Map map, boolean z9, String str) {
        this.f37099c = uri;
        this.f37101d = str;
        this.f37103e = map;
        this.f37151u = 0;
        this.f37041G = z9;
        this.f37038F = this.f37038F;
        H1();
        q1();
        requestLayout();
        invalidate();
    }

    public void A1() {
        if (!NSTIJKPlayerSkyActivity.f35209c6 && NSTIJKPlayerSkyActivity.f35205Y5 && this.f37094Y0.getVisibility() == 8) {
            N1();
            this.f37094Y0.startAnimation(this.f37102d1);
            this.f37094Y0.setVisibility(0);
            if (this.f37114h1.getVisibility() == 8) {
                this.f37114h1.startAnimation(this.f37102d1);
                this.f37114h1.setVisibility(0);
            }
            if (this.f37108f1.getVisibility() == 8) {
                this.f37108f1.startAnimation(this.f37102d1);
                this.f37108f1.setVisibility(0);
            }
            if (this.f37129m1.getVisibility() == 8 && !NSTIJKPlayerSkyActivity.a3()) {
                this.f37129m1.startAnimation(this.f37102d1);
                this.f37129m1.setVisibility(0);
            }
            if (this.f37111g1.getVisibility() == 8) {
                this.f37111g1.startAnimation(this.f37102d1);
                this.f37111g1.setVisibility(0);
            }
            if (this.f37117i1.getVisibility() == 8) {
                this.f37117i1.startAnimation(this.f37102d1);
                this.f37117i1.setVisibility(0);
            }
        }
    }

    public void B1() {
        if (this.f37094Y0.getVisibility() == 8) {
            this.f37144r1.startAnimation(this.f37147s1);
            this.f37144r1.setVisibility(0);
        }
    }

    public void C1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        TextView textView5;
        int i9;
        ITrackInfo[] iTrackInfoArr;
        int i10;
        if (this.f37118j == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f37107f0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f37051J0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0));
            frameLayout.setOnClickListener(new h());
        } catch (Exception unused) {
        }
        Boolean bool = Boolean.FALSE;
        this.f37152u0 = bool;
        this.f37149t0 = bool;
        this.f37146s0 = bool;
        this.f37140q0 = bool;
        this.f37137p0 = bool;
        this.f37143r0 = bool;
        int iD = AbstractC2941e.d(this.f37118j, 1);
        int iD2 = AbstractC2941e.d(this.f37118j, 2);
        int iD3 = AbstractC2941e.d(this.f37118j, 3);
        ITrackInfo[] trackInfo = this.f37118j.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            textView5 = textView3;
            i9 = 0;
            textView.setVisibility(0);
            textView2.setVisibility(0);
        } else {
            int i11 = 0;
            int i12 = -1;
            for (int length = trackInfo.length; i11 < length; length = i10) {
                ITrackInfo iTrackInfo = trackInfo[i11];
                int i13 = i12 + 1;
                int trackType = iTrackInfo.getTrackType();
                IMediaFormat format = iTrackInfo.getFormat();
                if (format != null && (format instanceof IjkMediaFormat)) {
                    iTrackInfoArr = trackInfo;
                    i10 = length;
                    if (trackType == 1) {
                        Boolean bool2 = Boolean.TRUE;
                        this.f37146s0 = bool2;
                        if (!this.f37137p0.booleanValue()) {
                            this.f37137p0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f37107f0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37062N, a7.c.f11849G)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new x(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f37107f0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        if (i13 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i13);
                        }
                        radioButton2.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37062N, a7.c.f11849G)));
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new x(radioButton2));
                        if (i13 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new i(iD));
                        i11++;
                        i12 = i13;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f37149t0 = bool3;
                        if (!this.f37140q0.booleanValue()) {
                            this.f37140q0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f37107f0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37062N, a7.c.f11849G)));
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new x(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f37107f0);
                        radioButton4.setText(i13 + ", " + iTrackInfo.getInfoInline() + ", " + e1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37062N, a7.c.f11849G)));
                        if (i13 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i13);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new x(radioButton4));
                        if (i13 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new j(iD2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f37152u0 = bool4;
                        if (!this.f37143r0.booleanValue()) {
                            this.f37143r0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f37107f0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37062N, a7.c.f11849G)));
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new x(radioButton5));
                            if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f37107f0);
                        radioButton6.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37062N, a7.c.f11849G)));
                        if (i13 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i13);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new x(radioButton6));
                        if (i13 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new l(iD3));
                    }
                } else {
                    iTrackInfoArr = trackInfo;
                    i10 = length;
                }
                i11++;
                i12 = i13;
                trackInfo = iTrackInfoArr;
            }
            if (this.f37146s0.booleanValue()) {
                i9 = 0;
                textView.setVisibility(8);
            } else {
                i9 = 0;
                textView.setVisibility(0);
            }
            if (this.f37149t0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(i9);
            }
            if (this.f37152u0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
            textView5 = textView3;
        }
        textView5.setVisibility(i9);
    }

    @Override // z7.n
    public void E0(String str) {
    }

    public void E1() {
        AbstractServiceC2895a.d(null);
    }

    public void F1() {
        Handler handler;
        if (NSTIJKPlayerSkyActivity.f35209c6 || (handler = this.f37095Z0) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void G1() {
        Handler handler = this.f37098b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void H1() {
        IMediaPlayer iMediaPlayer = this.f37118j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f37118j.release();
            this.f37118j = null;
            this.f37109g = 0;
            this.f37112h = 0;
            ((AudioManager) this.f37062N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // z7.n
    public void K(VodInfoCallback vodInfoCallback) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int K1() {
        /*
            r6 = this;
            int r0 = r6.f37079S1
            r1 = 1
            int r0 = r0 + r1
            r6.f37079S1 = r0
            android.app.Activity r0 = r6.f37107f0
            java.lang.String r2 = "loginPrefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r6.f37053K = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f37056L = r0
            int r0 = r6.f37079S1
            int[] r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.f37022Y1
            int r4 = r2.length
            int r0 = r0 % r4
            r6.f37079S1 = r0
            r0 = r2[r0]
            r6.f37082T1 = r0
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r0 = r6.f37068P
            if (r0 == 0) goto Lb1
            android.app.Activity r0 = r6.f37107f0
            int r2 = a7.f.f12319X6
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.app.Activity r2 = r6.f37107f0
            int r4 = a7.f.f12471n
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r4 = r6.f37068P
            int r5 = r6.f37082T1
            r4.setAspectRatio(r5)
            int r4 = r6.f37079S1
            if (r4 != 0) goto L54
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13289j2
        L4c:
            java.lang.String r1 = r1.getString(r4)
        L50:
            r2.setText(r1)
            goto L7d
        L54:
            if (r4 != r1) goto L5d
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13279i2
            goto L4c
        L5d:
            r1 = 2
            if (r4 != r1) goto L67
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13112Q8
            goto L4c
        L67:
            r1 = 3
            if (r4 != r1) goto L71
            android.content.res.Resources r1 = r6.getResources()
            int r4 = a7.j.f13290j3
            goto L4c
        L71:
            r1 = 4
            if (r4 != r1) goto L77
            java.lang.String r1 = "16:9"
            goto L50
        L77:
            r1 = 5
            if (r4 != r1) goto L7d
            java.lang.String r1 = "4:3"
            goto L50
        L7d:
            android.content.SharedPreferences$Editor r1 = r6.f37056L
            java.lang.String r2 = "aspect_ratio"
            int r4 = r6.f37079S1
            r1.putInt(r2, r4)
            android.content.SharedPreferences$Editor r1 = r6.f37056L
            r1.apply()
            r0.setVisibility(r3)
            android.widget.LinearLayout r1 = r6.f37129m1
            if (r1 == 0) goto L9f
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L9f
            android.widget.LinearLayout r1 = r6.f37129m1
            r2 = 8
            r1.setVisibility(r2)
        L9f:
            android.os.Handler r1 = r6.f37035E
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.f37035E
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$g r2 = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky$g
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
        Lb1:
            int r0 = r6.f37082T1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.K1():int");
    }

    public void L1() {
        RelativeLayout relativeLayout;
        if (NSTIJKPlayerSkyActivity.f35209c6) {
            G1();
            if (this.f37144r1.getVisibility() == 0) {
                k1();
                return;
            } else {
                B1();
                c1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                return;
            }
        }
        SeekBar seekBar = this.f37092X0;
        if (seekBar != null) {
            seekBar.setProgress(this.f37113h0.getStreamVolume(3));
        }
        F1();
        if (this.f37138p1.getVisibility() == 0) {
            this.f37138p1.startAnimation(this.f37141q1);
            relativeLayout = this.f37138p1;
        } else {
            if (this.f37159w1.getVisibility() != 0) {
                if (this.f37094Y0.getVisibility() == 0) {
                    j1();
                    return;
                } else {
                    A1();
                    b1(5000);
                    return;
                }
            }
            this.f37159w1.startAnimation(this.f37153u1);
            relativeLayout = this.f37159w1;
        }
        relativeLayout.setVisibility(8);
    }

    public void N1() {
        ProgressBar progressBar = (ProgressBar) this.f37107f0.findViewById(a7.f.Nc);
        TextView textView = (TextView) this.f37107f0.findViewById(a7.f.ti);
        TextView textView2 = (TextView) this.f37107f0.findViewById(a7.f.vi);
        TextView textView3 = (TextView) this.f37107f0.findViewById(a7.f.qk);
        TextView textView4 = (TextView) this.f37107f0.findViewById(a7.f.rk);
        ImageView imageView = (ImageView) this.f37107f0.findViewById(a7.f.f12241P4);
        LinearLayout linearLayout = (LinearLayout) this.f37107f0.findViewById(a7.f.f12293U7);
        LinearLayout linearLayout2 = (LinearLayout) this.f37107f0.findViewById(a7.f.f12302V7);
        LinearLayout linearLayout3 = (LinearLayout) this.f37107f0.findViewById(a7.f.f12311W7);
        LinearLayout linearLayout4 = (LinearLayout) this.f37107f0.findViewById(a7.f.f12320X7);
        LinearLayout linearLayout5 = (LinearLayout) this.f37107f0.findViewById(a7.f.Z8);
        LinearLayout linearLayout6 = (LinearLayout) this.f37107f0.findViewById(a7.f.f12329Y7);
        TextView textView5 = (TextView) this.f37107f0.findViewById(a7.f.Ui);
        TextView textView6 = (TextView) this.f37107f0.findViewById(a7.f.Xi);
        TextView textView7 = (TextView) this.f37107f0.findViewById(a7.f.aj);
        TextView textView8 = (TextView) this.f37107f0.findViewById(a7.f.dj);
        TextView textView9 = (TextView) this.f37107f0.findViewById(a7.f.Wi);
        TextView textView10 = (TextView) this.f37107f0.findViewById(a7.f.Zi);
        TextView textView11 = (TextView) this.f37107f0.findViewById(a7.f.cj);
        TextView textView12 = (TextView) this.f37107f0.findViewById(a7.f.fj);
        Handler handler = this.f37031C1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        new NSTIJKPlayerSkyActivity().j4(this.f37168z1, this.f37028B1, this.f37037E1, this.f37034D1, progressBar, textView, textView2, textView3, textView4, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, this.f37025A1);
    }

    @Override // z7.b
    public void a() {
    }

    @Override // z7.b
    public void b() {
    }

    public void b1(int i9) {
        if (NSTIJKPlayerSkyActivity.f35209c6) {
            return;
        }
        s sVar = new s();
        this.f37097a1 = sVar;
        this.f37095Z0.postDelayed(sVar, i9);
    }

    public void c1(int i9) {
        r rVar = new r();
        this.f37100c1 = rVar;
        this.f37098b1.postDelayed(rVar, i9);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f37154v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f37157w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f37160x;
    }

    @Override // z7.b
    public void d(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[PHI: r2
      0x0052: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:10:0x002e, B:16:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer f1(int r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSky.f1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void g1(int i9) {
        AbstractC2941e.b(this.f37118j, i9);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f37118j != null) {
            return this.f37142r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (p1()) {
            return (int) this.f37118j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f37038F;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (p1()) {
            return (int) this.f37118j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f37041G);
    }

    public int getNewSeekPosition() {
        return (int) this.f37166z;
    }

    public boolean getPlayerIsPrepared() {
        return this.f37057L0;
    }

    public String getShowOrHideSubtitles() {
        return this.f37104e0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f37118j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h1() {
        AbstractServiceC2895a.d(this.f37118j);
    }

    public void i1(Boolean bool) {
        this.f37041G = bool.booleanValue();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return p1() && (iMediaPlayer = this.f37118j) != null && iMediaPlayer.isPlaying();
    }

    public void j1() {
        if (NSTIJKPlayerSkyActivity.f35209c6 || this.f37094Y0.getVisibility() != 0) {
            return;
        }
        this.f37094Y0.startAnimation(this.f37105e1);
        if (this.f37114h1.getVisibility() == 0) {
            this.f37114h1.startAnimation(this.f37105e1);
        }
        if (this.f37108f1.getVisibility() == 0) {
            this.f37108f1.startAnimation(this.f37105e1);
        }
        if (this.f37129m1.getVisibility() == 0) {
            this.f37129m1.startAnimation(this.f37105e1);
        }
        if (this.f37111g1.getVisibility() == 0) {
            this.f37111g1.startAnimation(this.f37105e1);
        }
        if (this.f37117i1.getVisibility() == 0) {
            this.f37117i1.startAnimation(this.f37105e1);
        }
        this.f37094Y0.setVisibility(8);
        if (this.f37114h1.getVisibility() == 0) {
            this.f37114h1.setVisibility(8);
        }
        if (this.f37108f1.getVisibility() == 0) {
            this.f37108f1.setVisibility(8);
        }
        if (this.f37129m1.getVisibility() == 0) {
            this.f37129m1.setVisibility(8);
        }
        if (this.f37111g1.getVisibility() == 0) {
            this.f37111g1.setVisibility(8);
        }
        if (this.f37117i1.getVisibility() == 0) {
            this.f37117i1.setVisibility(8);
        }
    }

    public void k1() {
        if (this.f37144r1.getVisibility() == 0) {
            this.f37144r1.startAnimation(this.f37150t1);
            this.f37144r1.setVisibility(8);
        }
    }

    public boolean o1() {
        return this.f37093X1;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 4 || i9 == 24 || i9 == 25 || i9 == 164 || i9 == 82 || i9 != 5) {
        }
        p1();
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (p1() && (iMediaPlayer = this.f37118j) != null && iMediaPlayer.isPlaying()) {
            this.f37118j.pause();
            this.f37109g = 4;
        }
        this.f37112h = 4;
    }

    public void q1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f37099c == null || this.f37115i == null) {
            return;
        }
        r1(false);
        try {
            ((AudioManager) this.f37062N.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            this.f37118j = f1(this.f37065O.x());
            getContext();
            this.f37118j.setOnPreparedListener(this.f37055K1);
            this.f37118j.setOnVideoSizeChangedListener(this.f37052J1);
            this.f37118j.setOnCompletionListener(this.f37058L1);
            this.f37118j.setOnErrorListener(this.f37064N1);
            this.f37118j.setOnInfoListener(this.f37061M1);
            this.f37118j.setOnBufferingUpdateListener(this.f37067O1);
            this.f37118j.setOnSeekCompleteListener(this.f37070P1);
            this.f37118j.setOnTimedTextListener(this.f37073Q1);
            this.f37142r = 0;
            String scheme = this.f37099c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f37065O.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f37118j.setDataSource(new C2937a(new File(this.f37099c.toString())));
            } else {
                this.f37118j.setDataSource(this.f37062N, this.f37099c, this.f37103e);
            }
            d1(this.f37118j, this.f37115i);
            this.f37118j.setAudioStreamType(3);
            this.f37118j.setScreenOnWhilePlaying(true);
            this.f37077S = System.currentTimeMillis();
            this.f37118j.prepareAsync();
            this.f37125l0 = this.f37107f0.getResources().getDisplayMetrics().widthPixels;
            AudioManager audioManager = (AudioManager) this.f37107f0.getSystemService("audio");
            this.f37113h0 = audioManager;
            this.f37116i0 = audioManager.getStreamMaxVolume(3);
            int streamVolume = this.f37113h0.getStreamVolume(3);
            this.f37092X0.setMax(this.f37113h0.getStreamMaxVolume(3));
            this.f37092X0.setProgress(streamVolume);
            this.f37122k0 = new GestureDetector(this.f37107f0, new y());
            M1();
            this.f37158w0 = new StringBuilder();
            this.f37161x0 = new Formatter(this.f37158w0, Locale.getDefault());
            this.f37109g = 1;
        } catch (IOException e9) {
            Log.w(this.f37096a, "Unable to open content: " + this.f37099c, e9);
            this.f37109g = -1;
            this.f37112h = -1;
            onErrorListener = this.f37064N1;
            onErrorListener.onError(this.f37118j, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f37096a, "Unable to open content: " + this.f37099c, e10);
            this.f37109g = -1;
            this.f37112h = -1;
            onErrorListener = this.f37064N1;
            onErrorListener.onError(this.f37118j, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f37096a, "Unable to open content: " + this.f37099c, e11);
            this.f37109g = -1;
            this.f37112h = -1;
            onErrorListener = this.f37064N1;
            onErrorListener.onError(this.f37118j, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f37096a, "Unable to open content: " + this.f37099c, e12);
            this.f37109g = -1;
            this.f37112h = -1;
            onErrorListener = this.f37064N1;
            onErrorListener.onError(this.f37118j, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r1(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f37118j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f37118j.release();
            this.f37118j = null;
            this.f37109g = 0;
            if (z9) {
                this.f37112h = 0;
            }
            ((AudioManager) this.f37062N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void s1() {
        IMediaPlayer iMediaPlayer = this.f37118j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (p1()) {
            this.f37083U = System.currentTimeMillis();
            this.f37118j.seekTo(i9);
            i9 = 0;
        }
        this.f37151u = i9;
    }

    public void setAdjustViewBounds(boolean z9) {
        if (this.f37162x1 == z9) {
            return;
        }
        this.f37162x1 = z9;
        if (z9) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.f37034D1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.f37028B1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.f37168z1 = str;
    }

    public void setCurrentStreamID(String str) {
        this.f37025A1 = str;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f37038F = i9;
    }

    public void setEPGHandler(Handler handler) {
        this.f37031C1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f37037E1 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        a1();
    }

    public void setMovieListener(w wVar) {
        this.f37043G1 = wVar;
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f37136p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f37145s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f37148t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f37139q = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f37096a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f37118j != null) {
                cVar.getSurfaceHolder().b(this.f37118j);
                cVar.c(this.f37118j.getVideoWidth(), this.f37118j.getVideoHeight());
                cVar.a(this.f37118j.getVideoSarNum(), this.f37118j.getVideoSarDen());
                cVar.setAspectRatio(this.f37082T1);
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f37068P != null) {
            IMediaPlayer iMediaPlayer = this.f37118j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f37068P.getView();
            this.f37068P.b(this.f37076R1);
            this.f37068P = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f37068P = aVar;
        SharedPreferences sharedPreferences = this.f37062N.getSharedPreferences("loginPrefs", 0);
        this.f37053K = sharedPreferences;
        int i11 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f37079S1 = i11;
        aVar.setAspectRatio(i11);
        int i12 = this.f37121k;
        if (i12 > 0 && (i10 = this.f37124l) > 0) {
            aVar.c(i12, i10);
        }
        int i13 = this.f37071Q;
        if (i13 > 0 && (i9 = this.f37074R) > 0) {
            aVar.a(i13, i9);
        }
        View view2 = this.f37068P.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f37068P.e(this.f37076R1);
        this.f37068P.setVideoRotation(this.f37133o);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f37104e0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.f37131n0.b(a7.f.lj).d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (p1()) {
            this.f37118j.start();
            this.f37109g = 3;
        }
        this.f37112h = 3;
    }

    public void t1() {
        Handler handler = this.f37032D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public int u1() {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = this.f37068P;
        if (aVar == null || aVar.getView() == null || this.f37068P.getView().getHeight() == 0) {
            return 0;
        }
        return this.f37068P.getView().getHeight();
    }

    public int v1() {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = this.f37068P;
        if (aVar == null || aVar.getView() == null || this.f37068P.getView().getWidth() == 0) {
            return 0;
        }
        return this.f37068P.getView().getWidth();
    }

    public void w1(int i9) {
        AbstractC2941e.e(this.f37118j, i9);
    }

    public void x1(Activity activity, NSTIJKPlayerSky nSTIJKPlayerSky, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, LinearLayout linearLayout5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, FrameLayout frameLayout, String str) {
        this.f37107f0 = activity;
        this.f37040F1 = str;
        this.f37110g0 = nSTIJKPlayerSky;
        this.f37032D = new Handler();
        this.f37035E = new Handler();
        this.f37069P0 = radioGroup;
        this.f37072Q0 = radioGroup2;
        this.f37075R0 = radioGroup3;
        this.f37066O0 = textView;
        this.f37063N0 = textView2;
        this.f37060M0 = textView3;
        this.f37081T0 = textView4;
        this.f37090W0 = seekBar;
        this.f37092X0 = seekBar2;
        this.f37094Y0 = linearLayout;
        this.f37095Z0 = new Handler();
        this.f37098b1 = new Handler();
        this.f37102d1 = animation;
        this.f37105e1 = animation2;
        this.f37108f1 = imageView;
        this.f37111g1 = imageView2;
        this.f37114h1 = linearLayout2;
        this.f37117i1 = linearLayout3;
        this.f37090W0.setOnSeekBarChangeListener(this.f37046H1);
        this.f37092X0.setOnSeekBarChangeListener(this.f37049I1);
        this.f37123k1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f9 = this.f37107f0.getWindow().getAttributes().screenBrightness;
        this.f37119j0 = f9;
        if (f9 == -1.0f) {
            this.f37119j0 = this.f37065O != null ? r3.o() : AbstractC2237a.f44451J0;
        }
        seekBar.setProgress((int) this.f37119j0);
        this.f37129m1 = linearLayout4;
        this.f37132n1 = animation3;
        this.f37135o1 = animation4;
        this.f37126l1 = textView6;
        this.f37138p1 = relativeLayout;
        this.f37141q1 = animation5;
        this.f37144r1 = linearLayout5;
        this.f37147s1 = animation6;
        this.f37150t1 = animation7;
        this.f37159w1 = relativeLayout2;
        this.f37153u1 = animation8;
        this.f37084U0 = frameLayout;
        this.f37131n0 = new z(activity);
    }

    public void z1(Uri uri, boolean z9, String str) {
        y1(uri, null, z9, str);
    }
}
