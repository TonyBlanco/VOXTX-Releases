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
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerEPGActivity;
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
public class NSTIJKPlayerEPG extends FrameLayout implements MediaController.MediaPlayerControl, z7.n {

    /* JADX INFO: renamed from: W1, reason: collision with root package name */
    public static final int[] f36214W1 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f36215A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public SharedPreferences f36216A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public String f36217A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f36218B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SharedPreferences f36219B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public Handler f36220B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f36221C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences f36222C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public Context f36223C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Handler f36224D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences f36225D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public LiveStreamDBHandler f36226D1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Handler f36227E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public SharedPreferences.Editor f36228E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public String f36229E1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f36230F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public SharedPreferences.Editor f36231F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f36232F1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f36233G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public SharedPreferences.Editor f36234G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f36235G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f36236H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f36237H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f36238H1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f36239I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f36240I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36241I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f36242J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public SharedPreferences f36243J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36244J1;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f36245K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public n7.l f36246K0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36247K1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences.Editor f36248L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f36249L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36250L1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f36251M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public TextView f36252M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f36253M1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Context f36254N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public TextView f36255N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public IMediaPlayer.OnSeekCompleteListener f36256N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C2858a f36257O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f36258O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public IMediaPlayer.OnTimedTextListener f36259O1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f36260P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public RadioGroup f36261P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public a.InterfaceC0291a f36262P1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f36263Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public RadioGroup f36264Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public int f36265Q1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f36266R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public RadioGroup f36267R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public int f36268R1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f36269S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public SharedPreferences.Editor f36270S0;

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public List f36271S1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f36272T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public TextView f36273T0;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public int f36274T1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f36275U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public FrameLayout f36276U0;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public int f36277U1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f36278V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public androidx.appcompat.app.a f36279V0;

    /* JADX INFO: renamed from: V1, reason: collision with root package name */
    public boolean f36280V1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f36281W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public SeekBar f36282W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public SeekBar f36283X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public LinearLayout f36284Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Handler f36285Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36286a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Runnable f36287a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Handler f36288b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f36289c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Runnable f36290c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f36291d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public Animation f36292d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f36293e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f36294e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Animation f36295e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36296f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Activity f36297f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public ImageView f36298f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36299g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public NSTIJKPlayerEPG f36300g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public ImageView f36301g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36302h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AudioManager f36303h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public LinearLayout f36304h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.b f36305i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f36306i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public LinearLayout f36307i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IMediaPlayer f36308j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f36309j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public int f36310j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f36311k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public GestureDetector f36312k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public TextView f36313k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f36314l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f36315l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f36316l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f36317m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public View f36318m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public LinearLayout f36319m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f36320n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public z f36321n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Animation f36322n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f36323o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Button f36324o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Animation f36325o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f36326p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Boolean f36327p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public RelativeLayout f36328p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f36329q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Boolean f36330q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public Animation f36331q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f36332r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Boolean f36333r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public LinearLayout f36334r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f36335s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Boolean f36336s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public Animation f36337s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f36338t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Boolean f36339t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public Animation f36340t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f36341u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Boolean f36342u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public Animation f36343u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f36344v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f36345v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public SharedPreferences f36346v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f36347w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public StringBuilder f36348w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public RelativeLayout f36349w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f36350x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Formatter f36351x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f36352x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f36353y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f36354y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public boolean f36355y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f36356z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f36357z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public String f36358z1;

    public class a implements IMediaPlayer.OnInfoListener {
        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i9, int i10) {
            String str;
            String str2;
            if (NSTIJKPlayerEPG.this.f36338t != null) {
                NSTIJKPlayerEPG.this.f36338t.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerEPG.this.A1(2);
                str = NSTIJKPlayerEPG.this.f36286a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerEPG.this.A1(1);
                str = NSTIJKPlayerEPG.this.f36286a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerEPG.this.f36286a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerEPG.this.f36323o = i10;
                        Log.d(NSTIJKPlayerEPG.this.f36286a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = NSTIJKPlayerEPG.this.f36260P;
                        if (aVar != null) {
                            aVar.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerEPG.this.f36286a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerEPG.this.A1(1);
                                str = NSTIJKPlayerEPG.this.f36286a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerEPG.this.A1(6);
                                str = NSTIJKPlayerEPG.this.f36286a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerEPG.this.f36286a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerEPG.this.f36286a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerEPG.this.f36286a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerEPG.this.f36286a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerEPG.this.f36286a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerEPG.this.f36286a;
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
            Log.d(NSTIJKPlayerEPG.this.f36286a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerEPG.this.f36299g = -1;
            NSTIJKPlayerEPG.this.f36302h = -1;
            NSTIJKPlayerEPG.z(NSTIJKPlayerEPG.this);
            NSTIJKPlayerEPG.this.A1(-1);
            if (NSTIJKPlayerEPG.this.f36335s != null) {
                NSTIJKPlayerEPG.this.f36335s.onError(NSTIJKPlayerEPG.this.f36308j, i9, i10);
            }
            return true;
        }
    }

    public class c implements IMediaPlayer.OnBufferingUpdateListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerEPG.this.f36332r = i9;
        }
    }

    public class d implements IMediaPlayer.OnSeekCompleteListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerEPG.this.f36278V = System.currentTimeMillis();
        }
    }

    public class e implements IMediaPlayer.OnTimedTextListener {
        public e() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                NSTIJKPlayerEPG.this.f36281W.setVisibility(8);
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
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            nSTIJKPlayerEPG.f36243J0 = nSTIJKPlayerEPG.f36254N.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerEPG.this.f36281W.setTextSize(2, Float.parseFloat(NSTIJKPlayerEPG.this.f36243J0.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0)));
            } catch (Exception unused2) {
            }
            if (NSTIJKPlayerEPG.this.getShowOrHideSubtitles().equals("visible")) {
                NSTIJKPlayerEPG.this.f36281W.setVisibility(0);
            } else {
                NSTIJKPlayerEPG.this.f36281W.setVisibility(8);
            }
            if (sb.length() > 0) {
                textView = NSTIJKPlayerEPG.this.f36281W;
                strReplace = sb.toString();
            } else {
                textView = NSTIJKPlayerEPG.this.f36281W;
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
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            if (aVarA != nSTIJKPlayerEPG.f36260P) {
                Log.e(nSTIJKPlayerEPG.f36286a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEPG.f36317m = i10;
            NSTIJKPlayerEPG.this.f36320n = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerEPG.this.f36302h == 3;
            if (!NSTIJKPlayerEPG.this.f36260P.d() || (NSTIJKPlayerEPG.this.f36311k == i10 && NSTIJKPlayerEPG.this.f36314l == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerEPG.this.f36308j != null && z10 && z9) {
                if (NSTIJKPlayerEPG.this.f36341u != 0) {
                    NSTIJKPlayerEPG nSTIJKPlayerEPG2 = NSTIJKPlayerEPG.this;
                    nSTIJKPlayerEPG2.seekTo(nSTIJKPlayerEPG2.f36341u);
                }
                NSTIJKPlayerEPG.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            if (aVarA != nSTIJKPlayerEPG.f36260P) {
                Log.e(nSTIJKPlayerEPG.f36286a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerEPG.f36305i = bVar;
            if (NSTIJKPlayerEPG.this.f36308j == null) {
                NSTIJKPlayerEPG.this.p1();
            } else {
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = NSTIJKPlayerEPG.this;
                nSTIJKPlayerEPG2.c1(nSTIJKPlayerEPG2.f36308j, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            if (aVarA != nSTIJKPlayerEPG.f36260P) {
                Log.e(nSTIJKPlayerEPG.f36286a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerEPG.f36305i = null;
                NSTIJKPlayerEPG.this.r1();
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f36365a;

        public g(LinearLayout linearLayout) {
            this.f36365a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36365a.setVisibility(8);
            if (NSTIJKPlayerEPG.this.f36284Y0.getVisibility() != 0 || NSTIJKPlayerEPG.this.f36319m1 == null) {
                return;
            }
            NSTIJKPlayerEPG.this.f36319m1.setVisibility(0);
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerEPG.this.F1();
        }
    }

    public class i implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36368a;

        public i(int i9) {
            this.f36368a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            nSTIJKPlayerEPG.f36234G0 = nSTIJKPlayerEPG.f36225D0.edit();
            if (i9 == 111 || i9 == 11111111) {
                NSTIJKPlayerEPG.this.f36234G0.putInt("currentVideoTrack", -1);
                NSTIJKPlayerEPG.this.f1(this.f36368a);
            } else {
                NSTIJKPlayerEPG.this.f36234G0.putInt("currentVideoTrack", i9);
                NSTIJKPlayerEPG.this.t1(i9);
            }
            NSTIJKPlayerEPG.this.f36234G0.apply();
        }
    }

    public class j implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36370a;

        public j(int i9) {
            this.f36370a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            nSTIJKPlayerEPG.f36231F0 = nSTIJKPlayerEPG.f36222C0.edit();
            if (i9 == 1111 || i9 == 1111111) {
                NSTIJKPlayerEPG.this.f36231F0.putInt("currentAudioTrack", -1);
                NSTIJKPlayerEPG.this.f1(this.f36370a);
            } else {
                NSTIJKPlayerEPG.this.f36231F0.putInt("currentAudioTrack", i9);
                int currentPosition = (int) NSTIJKPlayerEPG.this.f36308j.getCurrentPosition();
                NSTIJKPlayerEPG.this.t1(i9);
                NSTIJKPlayerEPG.this.f36308j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerEPG.this.f36231F0.apply();
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
            NSTIJKPlayerEPG.this.f36309j0 = i9;
            int i11 = (int) ((NSTIJKPlayerEPG.this.f36309j0 / 255.0f) * 100.0f);
            if (i11 < 20) {
                textView = NSTIJKPlayerEPG.this.f36313k1;
                resources = NSTIJKPlayerEPG.this.getResources();
                i10 = a7.e.f12015i0;
            } else if (i11 < 30) {
                textView = NSTIJKPlayerEPG.this.f36313k1;
                resources = NSTIJKPlayerEPG.this.getResources();
                i10 = a7.e.f12019j0;
            } else if (i11 < 40) {
                textView = NSTIJKPlayerEPG.this.f36313k1;
                resources = NSTIJKPlayerEPG.this.getResources();
                i10 = a7.e.f12023k0;
            } else if (i11 < 50) {
                textView = NSTIJKPlayerEPG.this.f36313k1;
                resources = NSTIJKPlayerEPG.this.getResources();
                i10 = a7.e.f12027l0;
            } else if (i11 < 60) {
                textView = NSTIJKPlayerEPG.this.f36313k1;
                resources = NSTIJKPlayerEPG.this.getResources();
                i10 = a7.e.f12031m0;
            } else if (i11 < 70) {
                textView = NSTIJKPlayerEPG.this.f36313k1;
                resources = NSTIJKPlayerEPG.this.getResources();
                i10 = a7.e.f12035n0;
            } else {
                textView = NSTIJKPlayerEPG.this.f36313k1;
                resources = NSTIJKPlayerEPG.this.getResources();
                i10 = a7.e.f12039o0;
            }
            textView.setBackground(resources.getDrawable(i10));
            WindowManager.LayoutParams attributes = NSTIJKPlayerEPG.this.f36297f0.getWindow().getAttributes();
            attributes.screenBrightness = NSTIJKPlayerEPG.this.f36309j0 / 255.0f;
            NSTIJKPlayerEPG.this.f36257O.R((int) NSTIJKPlayerEPG.this.f36309j0);
            NSTIJKPlayerEPG.this.f36297f0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEPG.this.C1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEPG.this.C1();
            NSTIJKPlayerEPG.this.a1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class l implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36373a;

        public l(int i9) {
            this.f36373a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            nSTIJKPlayerEPG.f36228E0 = nSTIJKPlayerEPG.f36219B0.edit();
            if (i9 == 11111 || i9 == 111111) {
                TextView textView = NSTIJKPlayerEPG.this.f36281W;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerEPG.this.f36228E0.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerEPG.this.f1(this.f36373a);
            } else {
                TextView textView2 = NSTIJKPlayerEPG.this.f36281W;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                NSTIJKPlayerEPG.this.f36228E0.putInt("currentSubtitleTrack", i9);
                NSTIJKPlayerEPG.this.t1(i9);
            }
            NSTIJKPlayerEPG.this.f36228E0.apply();
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            NSTIJKPlayerEPG nSTIJKPlayerEPG;
            String str;
            switch (i9) {
                case 0:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "36";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "38";
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerEPG.G1(str);
            NSTIJKPlayerEPG.this.f36273T0.setText(str);
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
            if (NSTIJKPlayerEPG.this.f36303h0 != null) {
                try {
                    NSTIJKPlayerEPG.this.f36303h0.setStreamVolume(3, i9, 0);
                    int streamVolume = (int) ((NSTIJKPlayerEPG.this.f36303h0.getStreamVolume(3) / NSTIJKPlayerEPG.this.f36306i0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = NSTIJKPlayerEPG.this.f36316l1;
                        resources = NSTIJKPlayerEPG.this.getResources();
                        i10 = a7.e.f12071w0;
                    } else if (streamVolume < 40) {
                        textView = NSTIJKPlayerEPG.this.f36316l1;
                        resources = NSTIJKPlayerEPG.this.getResources();
                        i10 = a7.e.f12059t0;
                    } else if (streamVolume < 80) {
                        textView = NSTIJKPlayerEPG.this.f36316l1;
                        resources = NSTIJKPlayerEPG.this.getResources();
                        i10 = a7.e.f12063u0;
                    } else if (streamVolume < 100) {
                        textView = NSTIJKPlayerEPG.this.f36316l1;
                        resources = NSTIJKPlayerEPG.this.getResources();
                        i10 = a7.e.f12067v0;
                    } else {
                        textView = NSTIJKPlayerEPG.this.f36316l1;
                        resources = NSTIJKPlayerEPG.this.getResources();
                        i10 = a7.e.f12067v0;
                    }
                    textView.setBackground(resources.getDrawable(i10));
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEPG.this.C1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerEPG.this.C1();
            NSTIJKPlayerEPG.this.a1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class p implements View.OnTouchListener {
        public p() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return motionEvent != null && NSTIJKPlayerEPG.this.f36312k0.onTouchEvent(motionEvent);
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            nSTIJKPlayerEPG.f36236H++;
            m7.w.P0(nSTIJKPlayerEPG.f36297f0, NSTIJKPlayerEPG.this.f36297f0.getResources().getString(a7.j.f13262g5) + " (" + NSTIJKPlayerEPG.this.f36236H + "/" + NSTIJKPlayerEPG.this.f36239I + ")");
            NSTIJKPlayerEPG.this.p1();
            NSTIJKPlayerEPG.this.start();
        }
    }

    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPG.this.j1();
        }
    }

    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerEPG.this.i1();
        }
    }

    public class t implements IMediaPlayer.OnVideoSizeChangedListener {
        public t() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerEPG.this.f36311k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerEPG.this.f36314l = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerEPG.this.f36263Q = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerEPG.this.f36266R = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerEPG.this.f36311k == 0 || NSTIJKPlayerEPG.this.f36314l == 0) {
                return;
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = nSTIJKPlayerEPG.f36260P;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerEPG.f36311k, NSTIJKPlayerEPG.this.f36314l);
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = NSTIJKPlayerEPG.this;
                nSTIJKPlayerEPG2.f36260P.a(nSTIJKPlayerEPG2.f36263Q, NSTIJKPlayerEPG.this.f36266R);
            }
            NSTIJKPlayerEPG.this.requestLayout();
        }
    }

    public class u implements IMediaPlayer.OnPreparedListener {
        public u() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerEPG.this.f36272T = System.currentTimeMillis();
            NSTIJKPlayerEPG.this.f36299g = 2;
            if (NSTIJKPlayerEPG.this.f36329q != null) {
                NSTIJKPlayerEPG.this.f36329q.onPrepared(NSTIJKPlayerEPG.this.f36308j);
            }
            NSTIJKPlayerEPG.z(NSTIJKPlayerEPG.this);
            NSTIJKPlayerEPG.this.f36311k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerEPG.this.f36314l = iMediaPlayer.getVideoHeight();
            int i9 = NSTIJKPlayerEPG.this.f36341u;
            if (i9 != 0) {
                NSTIJKPlayerEPG.this.seekTo(i9);
            }
            if (NSTIJKPlayerEPG.this.f36311k == 0 || NSTIJKPlayerEPG.this.f36314l == 0) {
                if (NSTIJKPlayerEPG.this.f36302h == 3) {
                    NSTIJKPlayerEPG.this.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerEPG nSTIJKPlayerEPG = NSTIJKPlayerEPG.this;
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = nSTIJKPlayerEPG.f36260P;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerEPG.f36311k, NSTIJKPlayerEPG.this.f36314l);
                NSTIJKPlayerEPG nSTIJKPlayerEPG2 = NSTIJKPlayerEPG.this;
                nSTIJKPlayerEPG2.f36260P.a(nSTIJKPlayerEPG2.f36263Q, NSTIJKPlayerEPG.this.f36266R);
                if (!NSTIJKPlayerEPG.this.f36260P.d() || (NSTIJKPlayerEPG.this.f36317m == NSTIJKPlayerEPG.this.f36311k && NSTIJKPlayerEPG.this.f36320n == NSTIJKPlayerEPG.this.f36314l)) {
                    if (NSTIJKPlayerEPG.this.f36302h == 3) {
                        NSTIJKPlayerEPG.this.start();
                    } else {
                        if (NSTIJKPlayerEPG.this.isPlaying()) {
                            return;
                        }
                        if (i9 == 0 && NSTIJKPlayerEPG.this.getCurrentPosition() <= 0) {
                            return;
                        }
                    }
                    NSTIJKPlayerEPG.z(NSTIJKPlayerEPG.this);
                }
            }
        }
    }

    public class v implements IMediaPlayer.OnCompletionListener {
        public v() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerEPG.this.f36299g = 5;
            NSTIJKPlayerEPG.this.f36302h = 5;
            NSTIJKPlayerEPG.z(NSTIJKPlayerEPG.this);
            NSTIJKPlayerEPG.this.C1();
            NSTIJKPlayerEPG.this.x1();
            NSTIJKPlayerEPG.this.a1(5000);
            if (NSTIJKPlayerEPG.this.f36326p != null) {
                NSTIJKPlayerEPG.this.f36326p.onCompletion(NSTIJKPlayerEPG.this.f36308j);
            }
        }
    }

    public static abstract class w {
    }

    public class x implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f36385a;

        public x(View view) {
            this.f36385a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36385a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36385a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (!z9) {
                if (z9) {
                    return;
                }
                View view2 = this.f36385a;
                if (view2 != null && view2.getTag() != null && this.f36385a.getTag().equals("1") && NSTIJKPlayerEPG.this.f36324o0 != null) {
                    NSTIJKPlayerEPG.this.f36324o0.setBackgroundResource(a7.e.f12038o);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f36385a;
            if (view3 != null && view3.getTag() != null && this.f36385a.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerEPG.this.getResources().getDrawable(a7.e.f11931K1));
                return;
            }
            float f9 = z9 ? 1.12f : 1.0f;
            a(f9);
            b(f9);
            View view4 = this.f36385a;
            if (view4 == null || view4.getTag() == null || !this.f36385a.getTag().equals("1") || NSTIJKPlayerEPG.this.f36324o0 == null) {
                return;
            }
            NSTIJKPlayerEPG.this.f36324o0.setBackgroundResource(a7.e.f12010h);
        }
    }

    public class y extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f36387a;

        public y() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f36387a = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            NSTIJKPlayerEPG.this.I1();
            return true;
        }
    }

    public class z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f36389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f36390b;

        public z(Activity activity) {
            this.f36389a = activity;
        }

        public z a() {
            View view = this.f36390b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public z b(int i9) {
            this.f36390b = this.f36389a.findViewById(i9);
            return this;
        }

        public z c() {
            View view = this.f36390b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public z d(CharSequence charSequence) {
            View view = this.f36390b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public z e() {
            View view = this.f36390b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public NSTIJKPlayerEPG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36286a = "NSTIJKPlayerEPG";
        this.f36296f = 0;
        this.f36299g = 0;
        this.f36302h = 0;
        this.f36305i = null;
        this.f36308j = null;
        this.f36344v = true;
        this.f36347w = true;
        this.f36350x = true;
        this.f36353y = -1;
        this.f36356z = -1L;
        this.f36215A = true;
        this.f36218B = false;
        this.f36221C = 7000;
        this.f36230F = 0;
        this.f36236H = 0;
        this.f36239I = 5;
        this.f36242J = false;
        this.f36269S = 0L;
        this.f36272T = 0L;
        this.f36275U = 0L;
        this.f36278V = 0L;
        this.f36294e0 = "visible";
        this.f36309j0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f36327p0 = bool;
        this.f36330q0 = bool;
        this.f36333r0 = bool;
        this.f36336s0 = bool;
        this.f36339t0 = bool;
        this.f36342u0 = bool;
        this.f36345v0 = false;
        this.f36354y0 = false;
        this.f36357z0 = false;
        this.f36237H0 = false;
        this.f36240I0 = false;
        this.f36249L0 = false;
        this.f36310j1 = 0;
        this.f36355y1 = false;
        this.f36229E1 = "";
        this.f36232F1 = new k();
        this.f36235G1 = new o();
        this.f36238H1 = new t();
        this.f36241I1 = new u();
        this.f36244J1 = new v();
        this.f36247K1 = new a();
        this.f36250L1 = new b();
        this.f36253M1 = new c();
        this.f36256N1 = new d();
        this.f36259O1 = new e();
        this.f36262P1 = new f();
        this.f36265Q1 = 4;
        this.f36268R1 = f36214W1[0];
        this.f36271S1 = new ArrayList();
        this.f36274T1 = 0;
        this.f36277U1 = 0;
        this.f36280V1 = false;
        m1(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void F1() {
        int i9;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        a.C0158a c0158a = new a.C0158a(this.f36223C1);
        c0158a.setTitle(getResources().getString(a7.j.f13121R7));
        String string = this.f36243J0.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
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
        try {
            androidx.appcompat.app.a aVarCreate = c0158a.create();
            this.f36279V0 = aVarCreate;
            aVarCreate.setOnDismissListener(new n());
            this.f36279V0.show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1(String str) {
        try {
            SharedPreferences sharedPreferences = this.f36297f0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f36243J0 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f36270S0 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.f36270S0.apply();
            }
        } catch (Exception unused) {
        }
    }

    private void J1() {
        View viewFindViewById = this.f36297f0.findViewById(a7.f.f12491p);
        this.f36318m0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.f36318m0.setOnTouchListener(new p());
    }

    public static /* synthetic */ InterfaceC2938b z(NSTIJKPlayerEPG nSTIJKPlayerEPG) {
        nSTIJKPlayerEPG.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1(int r15) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG.A1(int):void");
    }

    public void B1() {
        AbstractServiceC2895a.d(null);
    }

    public void C1() {
        Handler handler;
        if (NSTIJKPlayerEPGActivity.f34898B2 || (handler = this.f36285Z0) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    public void D1() {
        Handler handler = this.f36288b1;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // z7.n
    public void E0(String str) {
    }

    public void E1() {
        IMediaPlayer iMediaPlayer = this.f36308j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f36308j.release();
            this.f36308j = null;
            this.f36299g = 0;
            this.f36302h = 0;
            ((AudioManager) this.f36254N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int H1() {
        /*
            r6 = this;
            int r0 = r6.f36265Q1
            r1 = 1
            int r0 = r0 + r1
            r6.f36265Q1 = r0
            android.app.Activity r0 = r6.f36297f0
            java.lang.String r2 = "loginPrefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r6.f36245K = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f36248L = r0
            int r0 = r6.f36265Q1
            int[] r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG.f36214W1
            int r4 = r2.length
            int r0 = r0 % r4
            r6.f36265Q1 = r0
            r0 = r2[r0]
            r6.f36268R1 = r0
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r0 = r6.f36260P
            if (r0 == 0) goto Lb1
            android.app.Activity r0 = r6.f36297f0
            int r2 = a7.f.f12319X6
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.app.Activity r2 = r6.f36297f0
            int r4 = a7.f.f12471n
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r4 = r6.f36260P
            int r5 = r6.f36268R1
            r4.setAspectRatio(r5)
            int r4 = r6.f36265Q1
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
            android.content.SharedPreferences$Editor r1 = r6.f36248L
            java.lang.String r2 = "aspect_ratio"
            int r4 = r6.f36265Q1
            r1.putInt(r2, r4)
            android.content.SharedPreferences$Editor r1 = r6.f36248L
            r1.apply()
            r0.setVisibility(r3)
            android.widget.LinearLayout r1 = r6.f36319m1
            if (r1 == 0) goto L9f
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L9f
            android.widget.LinearLayout r1 = r6.f36319m1
            r2 = 8
            r1.setVisibility(r2)
        L9f:
            android.os.Handler r1 = r6.f36227E
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.f36227E
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$g r2 = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG$g
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
        Lb1:
            int r0 = r6.f36268R1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG.H1():int");
    }

    public void I1() {
        RelativeLayout relativeLayout;
        if (NSTIJKPlayerEPGActivity.f34898B2) {
            D1();
            if (this.f36334r1.getVisibility() == 0) {
                j1();
                return;
            } else {
                y1();
                b1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
                return;
            }
        }
        SeekBar seekBar = this.f36283X0;
        if (seekBar != null) {
            seekBar.setProgress(this.f36303h0.getStreamVolume(3));
        }
        C1();
        if (this.f36328p1.getVisibility() == 0) {
            this.f36328p1.startAnimation(this.f36331q1);
            relativeLayout = this.f36328p1;
        } else {
            if (this.f36349w1.getVisibility() != 0) {
                if (this.f36284Y0.getVisibility() == 0) {
                    i1();
                    return;
                } else {
                    x1();
                    a1(5000);
                    return;
                }
            }
            this.f36349w1.startAnimation(this.f36343u1);
            relativeLayout = this.f36349w1;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // z7.n
    public void K(VodInfoCallback vodInfoCallback) {
    }

    public final void K1() {
        z zVar;
        int i9;
        try {
            IMediaPlayer iMediaPlayer = this.f36308j;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.f36321n0.b(a7.f.f12162H5).a();
                zVar = this.f36321n0;
                i9 = a7.f.f12172I5;
            } else {
                this.f36321n0.b(a7.f.f12172I5).a();
                zVar = this.f36321n0;
                i9 = a7.f.f12162H5;
            }
            zVar.b(i9).e();
        } catch (Exception unused) {
        }
    }

    public final void Z0() {
    }

    @Override // z7.b
    public void a() {
    }

    public void a1(int i9) {
        if (NSTIJKPlayerEPGActivity.f34898B2) {
            return;
        }
        s sVar = new s();
        this.f36287a1 = sVar;
        this.f36285Z0.postDelayed(sVar, i9);
    }

    @Override // z7.b
    public void b() {
    }

    public void b1(int i9) {
        r rVar = new r();
        this.f36290c1 = rVar;
        this.f36288b1.postDelayed(rVar, i9);
    }

    public final void c1(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f36344v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f36347w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f36350x;
    }

    @Override // z7.b
    public void d(String str) {
    }

    public final String d1(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[PHI: r2
      0x0052: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:10:0x002e, B:16:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer e1(int r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerEPG.e1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void f1(int i9) {
        AbstractC2941e.b(this.f36308j, i9);
    }

    public void g1() {
        AbstractServiceC2895a.d(this.f36308j);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f36308j != null) {
            return this.f36332r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (o1()) {
            return (int) this.f36308j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f36230F;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (o1()) {
            return (int) this.f36308j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f36233G);
    }

    public int getNewSeekPosition() {
        return (int) this.f36356z;
    }

    public boolean getPlayerIsPrepared() {
        return this.f36249L0;
    }

    public String getShowOrHideSubtitles() {
        return this.f36294e0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f36308j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h1(Boolean bool) {
        this.f36233G = bool.booleanValue();
    }

    public void i1() {
        if (NSTIJKPlayerEPGActivity.f34898B2 || this.f36284Y0.getVisibility() != 0) {
            return;
        }
        this.f36284Y0.startAnimation(this.f36295e1);
        if (this.f36304h1.getVisibility() == 0) {
            this.f36304h1.startAnimation(this.f36295e1);
        }
        if (this.f36319m1.getVisibility() == 0) {
            this.f36319m1.startAnimation(this.f36295e1);
        }
        if (this.f36307i1.getVisibility() == 0) {
            this.f36307i1.startAnimation(this.f36295e1);
        }
        this.f36284Y0.setVisibility(8);
        if (this.f36304h1.getVisibility() == 0) {
            this.f36304h1.setVisibility(8);
        }
        if (this.f36319m1.getVisibility() == 0) {
            this.f36319m1.setVisibility(8);
        }
        if (this.f36307i1.getVisibility() == 0) {
            this.f36307i1.setVisibility(8);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return o1() && (iMediaPlayer = this.f36308j) != null && iMediaPlayer.isPlaying();
    }

    public void j1() {
        if (this.f36334r1.getVisibility() == 0) {
            this.f36334r1.startAnimation(this.f36340t1);
            this.f36334r1.setVisibility(8);
        }
    }

    public final void k1() {
        boolean zP = this.f36257O.p();
        this.f36280V1 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f36308j = AbstractServiceC2895a.a();
        }
    }

    public final void l1() {
        this.f36271S1.clear();
        if (this.f36257O.s()) {
            this.f36271S1.add(1);
        }
        if (this.f36257O.t()) {
            this.f36271S1.add(2);
        }
        if (this.f36257O.r()) {
            this.f36271S1.add(0);
        }
        if (this.f36271S1.isEmpty()) {
            this.f36271S1.add(1);
        }
        int iIntValue = ((Integer) this.f36271S1.get(this.f36274T1)).intValue();
        this.f36277U1 = iIntValue;
        setRender(iIntValue);
    }

    public final void m1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f36254N = applicationContext;
        this.f36257O = new C2858a(applicationContext);
        this.f36246K0 = new n7.l(this, this.f36254N);
        k1();
        l1();
        this.f36311k = 0;
        this.f36314l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f36299g = 0;
        this.f36302h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f36243J0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
        TextView textView = new TextView(context);
        this.f36281W = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception unused) {
        }
        this.f36281W.setTextColor(context.getResources().getColor(a7.c.f11849G));
        this.f36281W.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f36281W, layoutParams);
    }

    public boolean n1() {
        return this.f36280V1;
    }

    public final boolean o1() {
        int i9;
        return (this.f36308j == null || (i9 = this.f36299g) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 4 || i9 == 24 || i9 == 25 || i9 == 164 || i9 == 82 || i9 != 5) {
        }
        o1();
        return super.onKeyDown(i9, keyEvent);
    }

    public void p1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f36289c == null || this.f36305i == null) {
            return;
        }
        q1(false);
        try {
            ((AudioManager) this.f36254N.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            this.f36308j = e1(this.f36257O.x());
            getContext();
            this.f36308j.setOnPreparedListener(this.f36241I1);
            this.f36308j.setOnVideoSizeChangedListener(this.f36238H1);
            this.f36308j.setOnCompletionListener(this.f36244J1);
            this.f36308j.setOnErrorListener(this.f36250L1);
            this.f36308j.setOnInfoListener(this.f36247K1);
            this.f36308j.setOnBufferingUpdateListener(this.f36253M1);
            this.f36308j.setOnSeekCompleteListener(this.f36256N1);
            this.f36308j.setOnTimedTextListener(this.f36259O1);
            this.f36332r = 0;
            String scheme = this.f36289c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f36257O.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f36308j.setDataSource(new C2937a(new File(this.f36289c.toString())));
            } else {
                this.f36308j.setDataSource(this.f36254N, this.f36289c, this.f36293e);
            }
            c1(this.f36308j, this.f36305i);
            this.f36308j.setAudioStreamType(3);
            this.f36308j.setScreenOnWhilePlaying(true);
            this.f36269S = System.currentTimeMillis();
            this.f36308j.prepareAsync();
            this.f36315l0 = this.f36297f0.getResources().getDisplayMetrics().widthPixels;
            AudioManager audioManager = (AudioManager) this.f36297f0.getSystemService("audio");
            this.f36303h0 = audioManager;
            this.f36306i0 = audioManager.getStreamMaxVolume(3);
            int streamVolume = this.f36303h0.getStreamVolume(3);
            this.f36283X0.setMax(this.f36303h0.getStreamMaxVolume(3));
            this.f36283X0.setProgress(streamVolume);
            this.f36312k0 = new GestureDetector(this.f36297f0, new y());
            J1();
            this.f36348w0 = new StringBuilder();
            this.f36351x0 = new Formatter(this.f36348w0, Locale.getDefault());
            this.f36299g = 1;
        } catch (IOException e9) {
            Log.w(this.f36286a, "Unable to open content: " + this.f36289c, e9);
            this.f36299g = -1;
            this.f36302h = -1;
            onErrorListener = this.f36250L1;
            onErrorListener.onError(this.f36308j, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f36286a, "Unable to open content: " + this.f36289c, e10);
            this.f36299g = -1;
            this.f36302h = -1;
            onErrorListener = this.f36250L1;
            onErrorListener.onError(this.f36308j, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f36286a, "Unable to open content: " + this.f36289c, e11);
            this.f36299g = -1;
            this.f36302h = -1;
            onErrorListener = this.f36250L1;
            onErrorListener.onError(this.f36308j, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f36286a, "Unable to open content: " + this.f36289c, e12);
            this.f36299g = -1;
            this.f36302h = -1;
            onErrorListener = this.f36250L1;
            onErrorListener.onError(this.f36308j, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (o1() && (iMediaPlayer = this.f36308j) != null && iMediaPlayer.isPlaying()) {
            this.f36308j.pause();
            this.f36299g = 4;
        }
        this.f36302h = 4;
    }

    public void q1(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f36308j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f36308j.release();
            this.f36308j = null;
            this.f36299g = 0;
            if (z9) {
                this.f36302h = 0;
            }
            ((AudioManager) this.f36254N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void r1() {
        IMediaPlayer iMediaPlayer = this.f36308j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void s1() {
        Handler handler = this.f36224D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (o1()) {
            this.f36275U = System.currentTimeMillis();
            this.f36308j.seekTo(i9);
            i9 = 0;
        }
        this.f36341u = i9;
    }

    public void setAdjustViewBounds(boolean z9) {
        if (this.f36352x1 == z9) {
            return;
        }
        this.f36352x1 = z9;
        if (z9) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.f36223C1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.f36217A1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.f36358z1 = str;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f36230F = i9;
    }

    public void setEPGHandler(Handler handler) {
        this.f36220B1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        this.f36226D1 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        Z0();
    }

    public void setMovieListener(w wVar) {
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f36326p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f36335s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f36338t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f36329q = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f36286a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f36308j != null) {
                cVar.getSurfaceHolder().b(this.f36308j);
                cVar.c(this.f36308j.getVideoWidth(), this.f36308j.getVideoHeight());
                cVar.a(this.f36308j.getVideoSarNum(), this.f36308j.getVideoSarDen());
                cVar.setAspectRatio(this.f36268R1);
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f36260P != null) {
            IMediaPlayer iMediaPlayer = this.f36308j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f36260P.getView();
            this.f36260P.b(this.f36262P1);
            this.f36260P = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f36260P = aVar;
        SharedPreferences sharedPreferences = this.f36254N.getSharedPreferences("loginPrefs", 0);
        this.f36245K = sharedPreferences;
        int i11 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f36265Q1 = i11;
        aVar.setAspectRatio(i11);
        int i12 = this.f36311k;
        if (i12 > 0 && (i10 = this.f36314l) > 0) {
            aVar.c(i12, i10);
        }
        int i13 = this.f36263Q;
        if (i13 > 0 && (i9 = this.f36266R) > 0) {
            aVar.a(i13, i9);
        }
        View view2 = this.f36260P.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f36260P.e(this.f36262P1);
        this.f36260P.setVideoRotation(this.f36323o);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f36294e0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.f36321n0.b(a7.f.lj).d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (o1()) {
            this.f36308j.start();
            this.f36299g = 3;
        }
        this.f36302h = 3;
    }

    public void t1(int i9) {
        AbstractC2941e.e(this.f36308j, i9);
    }

    public void u1(Activity activity, NSTIJKPlayerEPG nSTIJKPlayerEPG, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, LinearLayout linearLayout5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, String str, FrameLayout frameLayout) {
        this.f36297f0 = activity;
        this.f36300g0 = nSTIJKPlayerEPG;
        this.f36224D = new Handler();
        this.f36227E = new Handler();
        this.f36261P0 = radioGroup;
        this.f36264Q0 = radioGroup2;
        this.f36267R0 = radioGroup3;
        this.f36258O0 = textView;
        this.f36255N0 = textView2;
        this.f36252M0 = textView3;
        this.f36273T0 = textView4;
        this.f36282W0 = seekBar;
        this.f36283X0 = seekBar2;
        this.f36284Y0 = linearLayout;
        this.f36285Z0 = new Handler();
        this.f36288b1 = new Handler();
        this.f36292d1 = animation;
        this.f36295e1 = animation2;
        this.f36298f1 = imageView;
        this.f36301g1 = imageView2;
        this.f36304h1 = linearLayout2;
        this.f36307i1 = linearLayout3;
        this.f36282W0.setOnSeekBarChangeListener(this.f36232F1);
        this.f36283X0.setOnSeekBarChangeListener(this.f36235G1);
        this.f36313k1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f9 = this.f36297f0.getWindow().getAttributes().screenBrightness;
        this.f36309j0 = f9;
        if (f9 == -1.0f) {
            this.f36309j0 = this.f36257O != null ? r3.o() : AbstractC2237a.f44451J0;
        }
        seekBar.setProgress((int) this.f36309j0);
        this.f36319m1 = linearLayout4;
        this.f36322n1 = animation3;
        this.f36325o1 = animation4;
        this.f36316l1 = textView6;
        this.f36328p1 = relativeLayout;
        this.f36331q1 = animation5;
        this.f36334r1 = linearLayout5;
        this.f36337s1 = animation6;
        this.f36340t1 = animation7;
        this.f36349w1 = relativeLayout2;
        this.f36343u1 = animation8;
        this.f36229E1 = str;
        this.f36276U0 = frameLayout;
        this.f36321n0 = new z(activity);
    }

    public final void v1(Uri uri, Map map, boolean z9, String str) {
        this.f36289c = uri;
        this.f36291d = str;
        this.f36293e = map;
        this.f36341u = 0;
        this.f36233G = z9;
        this.f36230F = this.f36230F;
        E1();
        p1();
        requestLayout();
        invalidate();
    }

    public void w1(Uri uri, boolean z9, String str) {
        v1(uri, null, z9, str);
    }

    public void x1() {
        if (NSTIJKPlayerEPGActivity.f34898B2 || this.f36284Y0.getVisibility() != 8) {
            return;
        }
        this.f36284Y0.startAnimation(this.f36292d1);
        this.f36284Y0.setVisibility(0);
        if (this.f36304h1.getVisibility() == 8) {
            this.f36304h1.startAnimation(this.f36292d1);
            this.f36304h1.setVisibility(0);
        }
        if (this.f36319m1.getVisibility() == 8 && !NSTIJKPlayerEPGActivity.J1()) {
            this.f36319m1.startAnimation(this.f36292d1);
            this.f36319m1.setVisibility(0);
        }
        if (this.f36307i1.getVisibility() == 8) {
            this.f36307i1.startAnimation(this.f36292d1);
            this.f36307i1.setVisibility(0);
        }
    }

    public void y1() {
        if (this.f36284Y0.getVisibility() == 8) {
            this.f36334r1.startAnimation(this.f36337s1);
            this.f36334r1.setVisibility(0);
        }
    }

    public void z1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        TextView textView5;
        int i9;
        ITrackInfo[] iTrackInfoArr;
        int i10;
        if (this.f36308j == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f36297f0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f36243J0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0));
            frameLayout.setOnClickListener(new h());
        } catch (Exception unused) {
        }
        Boolean bool = Boolean.FALSE;
        this.f36342u0 = bool;
        this.f36339t0 = bool;
        this.f36336s0 = bool;
        this.f36330q0 = bool;
        this.f36327p0 = bool;
        this.f36333r0 = bool;
        int iD = AbstractC2941e.d(this.f36308j, 1);
        int iD2 = AbstractC2941e.d(this.f36308j, 2);
        int iD3 = AbstractC2941e.d(this.f36308j, 3);
        ITrackInfo[] trackInfo = this.f36308j.getTrackInfo();
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
                        this.f36336s0 = bool2;
                        if (!this.f36327p0.booleanValue()) {
                            this.f36327p0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f36297f0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36254N, a7.c.f11849G)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new x(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f36297f0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        if (i13 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i13);
                        }
                        radioButton2.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36254N, a7.c.f11849G)));
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
                        this.f36339t0 = bool3;
                        if (!this.f36330q0.booleanValue()) {
                            this.f36330q0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f36297f0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36254N, a7.c.f11849G)));
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
                        RadioButton radioButton4 = new RadioButton(this.f36297f0);
                        radioButton4.setText(i13 + ", " + iTrackInfo.getInfoInline() + ", " + d1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36254N, a7.c.f11849G)));
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
                        this.f36342u0 = bool4;
                        if (!this.f36333r0.booleanValue()) {
                            this.f36333r0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f36297f0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36254N, a7.c.f11849G)));
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
                        RadioButton radioButton6 = new RadioButton(this.f36297f0);
                        radioButton6.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f36254N, a7.c.f11849G)));
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
            if (this.f36336s0.booleanValue()) {
                i9 = 0;
                textView.setVisibility(8);
            } else {
                i9 = 0;
                textView.setVisibility(0);
            }
            if (this.f36339t0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(i9);
            }
            if (this.f36342u0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
            textView5 = textView3;
        }
        textView5.setVisibility(i9);
    }
}
