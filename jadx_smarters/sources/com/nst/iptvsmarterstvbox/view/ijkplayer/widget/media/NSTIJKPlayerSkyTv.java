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
import android.os.AsyncTask;
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
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
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
import x7.C2966a;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerSkyTv extends FrameLayout implements MediaController.MediaPlayerControl, z7.n {

    /* JADX INFO: renamed from: S1, reason: collision with root package name */
    public static LiveStreamDBHandler f37202S1;

    /* JADX INFO: renamed from: T1, reason: collision with root package name */
    public static String f37203T1;

    /* JADX INFO: renamed from: U1, reason: collision with root package name */
    public static final int[] f37204U1 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f37205A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public SharedPreferences f37206A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public LinearLayout f37207A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f37208B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public SharedPreferences f37209B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f37210B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f37211C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences f37212C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f37213C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Handler f37214D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences f37215D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f37216D1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Handler f37217E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public SharedPreferences.Editor f37218E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37219E1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f37220F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public SharedPreferences.Editor f37221F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37222F1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f37223G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public SharedPreferences.Editor f37224G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37225G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f37226H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public boolean f37227H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37228H1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f37229I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f37230I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f37231I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f37232J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public SharedPreferences f37233J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public IMediaPlayer.OnSeekCompleteListener f37234J1;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f37235K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public n7.l f37236K0;

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public IMediaPlayer.OnTimedTextListener f37237K1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences.Editor f37238L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f37239L0;

    /* JADX INFO: renamed from: L1, reason: collision with root package name */
    public a.InterfaceC0291a f37240L1;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f37241M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public TextView f37242M0;

    /* JADX INFO: renamed from: M1, reason: collision with root package name */
    public int f37243M1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Context f37244N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public TextView f37245N0;

    /* JADX INFO: renamed from: N1, reason: collision with root package name */
    public int f37246N1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public C2858a f37247O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public TextView f37248O0;

    /* JADX INFO: renamed from: O1, reason: collision with root package name */
    public List f37249O1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a f37250P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public RadioGroup f37251P0;

    /* JADX INFO: renamed from: P1, reason: collision with root package name */
    public int f37252P1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f37253Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public RadioGroup f37254Q0;

    /* JADX INFO: renamed from: Q1, reason: collision with root package name */
    public int f37255Q1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f37256R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public RadioGroup f37257R0;

    /* JADX INFO: renamed from: R1, reason: collision with root package name */
    public boolean f37258R1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f37259S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public SharedPreferences.Editor f37260S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f37261T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public TextView f37262T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f37263U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public FrameLayout f37264U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f37265V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public androidx.appcompat.app.a f37266V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f37267W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public SeekBar f37268W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public SeekBar f37269X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public LinearLayout f37270Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public Handler f37271Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37272a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Runnable f37273a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public Animation f37274b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f37275c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public Animation f37276c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37277d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public LinearLayout f37278d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f37279e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f37280e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public LinearLayout f37281e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37282f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public Activity f37283f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f37284f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37285g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public NSTIJKPlayerSkyTv f37286g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public TextView f37287g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37288h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public AudioManager f37289h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public TextView f37290h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.b f37291i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f37292i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public LinearLayout f37293i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IMediaPlayer f37294j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f37295j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public Animation f37296j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37297k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public GestureDetector f37298k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public Animation f37299k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37300l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f37301l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public RelativeLayout f37302l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37303m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public View f37304m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public Animation f37305m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37306n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public y f37307n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Animation f37308n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37309o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Button f37310o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Animation f37311o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37312p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Boolean f37313p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public Animation f37314p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37315q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Boolean f37316q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public SharedPreferences f37317q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37318r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Boolean f37319r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public RelativeLayout f37320r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37321s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Boolean f37322s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public boolean f37323s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37324t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Boolean f37325t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public boolean f37326t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f37327u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Boolean f37328u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public String f37329u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37330v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f37331v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public String f37332v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f37333w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public StringBuilder f37334w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public Handler f37335w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37336x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Formatter f37337x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public Context f37338x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f37339y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f37340y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public LinearLayout f37341y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f37342z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f37343z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public LinearLayout f37344z1;

    public class a implements IMediaPlayer.OnErrorListener {
        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i9, int i10) {
            Log.d(NSTIJKPlayerSkyTv.this.f37272a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerSkyTv.this.f37285g = -1;
            NSTIJKPlayerSkyTv.this.f37288h = -1;
            NSTIJKPlayerSkyTv.D(NSTIJKPlayerSkyTv.this);
            NSTIJKPlayerSkyTv.this.A1(-1);
            if (NSTIJKPlayerSkyTv.this.f37321s != null) {
                NSTIJKPlayerSkyTv.this.f37321s.onError(NSTIJKPlayerSkyTv.this.f37294j, i9, i10);
            }
            return true;
        }
    }

    public class b implements IMediaPlayer.OnBufferingUpdateListener {
        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            MyApplication.F("mCurrentBufferPercentage" + NSTIJKPlayerSkyTv.this.f37318r);
            NSTIJKPlayerSkyTv.this.f37318r = i9;
        }
    }

    public class c implements IMediaPlayer.OnSeekCompleteListener {
        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSkyTv.this.f37265V = System.currentTimeMillis();
        }
    }

    public class d implements IMediaPlayer.OnTimedTextListener {
        public d() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            TextView textView;
            if (ijkTimedText == null) {
                NSTIJKPlayerSkyTv.this.f37267W.setVisibility(8);
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
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.f37233J0 = nSTIJKPlayerSkyTv.f37244N.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerSkyTv.this.f37267W.setTextSize(2, Float.parseFloat(NSTIJKPlayerSkyTv.this.f37233J0.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0)));
            } catch (Exception unused2) {
            }
            if (NSTIJKPlayerSkyTv.this.getShowOrHideSubtitles().equals("visible")) {
                NSTIJKPlayerSkyTv.this.f37267W.setVisibility(0);
            } else {
                NSTIJKPlayerSkyTv.this.f37267W.setVisibility(8);
            }
            if (sb.length() > 0) {
                textView = NSTIJKPlayerSkyTv.this.f37267W;
                strReplace = sb.toString();
            } else {
                textView = NSTIJKPlayerSkyTv.this.f37267W;
            }
            textView.setText(strReplace);
        }
    }

    public class e implements a.InterfaceC0291a {
        public e() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            if (aVarA != nSTIJKPlayerSkyTv.f37250P) {
                Log.e(nSTIJKPlayerSkyTv.f37272a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSkyTv.f37303m = i10;
            NSTIJKPlayerSkyTv.this.f37306n = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerSkyTv.this.f37288h == 3;
            if (!NSTIJKPlayerSkyTv.this.f37250P.d() || (NSTIJKPlayerSkyTv.this.f37297k == i10 && NSTIJKPlayerSkyTv.this.f37300l == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerSkyTv.this.f37294j != null && z10 && z9) {
                if (NSTIJKPlayerSkyTv.this.f37327u != 0) {
                    NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                    nSTIJKPlayerSkyTv2.seekTo(nSTIJKPlayerSkyTv2.f37327u);
                }
                NSTIJKPlayerSkyTv.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            if (aVarA != nSTIJKPlayerSkyTv.f37250P) {
                Log.e(nSTIJKPlayerSkyTv.f37272a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            nSTIJKPlayerSkyTv.f37291i = bVar;
            if (NSTIJKPlayerSkyTv.this.f37294j == null) {
                NSTIJKPlayerSkyTv.this.q1();
            } else {
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                nSTIJKPlayerSkyTv2.e1(nSTIJKPlayerSkyTv2.f37294j, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVarA = bVar.a();
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            if (aVarA != nSTIJKPlayerSkyTv.f37250P) {
                Log.e(nSTIJKPlayerSkyTv.f37272a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                nSTIJKPlayerSkyTv.f37291i = null;
                NSTIJKPlayerSkyTv.this.s1();
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f37350a;

        public f(LinearLayout linearLayout) {
            this.f37350a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37350a.setVisibility(8);
            if (NSTIJKPlayerSkyTv.this.f37270Y0.getVisibility() != 0 || NSTIJKPlayerSkyTv.this.f37293i1 == null) {
                return;
            }
            NSTIJKPlayerSkyTv.this.f37293i1.setVisibility(0);
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerSkyTv.this.E1();
        }
    }

    public class h implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37353a;

        public h(int i9) {
            this.f37353a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.f37224G0 = nSTIJKPlayerSkyTv.f37215D0.edit();
            if (i9 == 111 || i9 == 11111111) {
                NSTIJKPlayerSkyTv.this.f37224G0.putInt("currentVideoTrack", -1);
                NSTIJKPlayerSkyTv.this.h1(this.f37353a);
            } else {
                NSTIJKPlayerSkyTv.this.f37224G0.putInt("currentVideoTrack", i9);
                NSTIJKPlayerSkyTv.this.u1(i9);
            }
            NSTIJKPlayerSkyTv.this.f37224G0.apply();
        }
    }

    public class i implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37355a;

        public i(int i9) {
            this.f37355a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.f37221F0 = nSTIJKPlayerSkyTv.f37212C0.edit();
            if (i9 == 1111 || i9 == 1111111) {
                NSTIJKPlayerSkyTv.this.f37221F0.putInt("currentAudioTrack", -1);
                NSTIJKPlayerSkyTv.this.h1(this.f37355a);
            } else {
                NSTIJKPlayerSkyTv.this.f37221F0.putInt("currentAudioTrack", i9);
                int currentPosition = (int) NSTIJKPlayerSkyTv.this.f37294j.getCurrentPosition();
                NSTIJKPlayerSkyTv.this.u1(i9);
                NSTIJKPlayerSkyTv.this.f37294j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerSkyTv.this.f37221F0.apply();
        }
    }

    public class j implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37357a;

        public j(int i9) {
            this.f37357a = i9;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.f37218E0 = nSTIJKPlayerSkyTv.f37209B0.edit();
            if (i9 == 11111 || i9 == 111111) {
                TextView textView = NSTIJKPlayerSkyTv.this.f37267W;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                NSTIJKPlayerSkyTv.this.f37218E0.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerSkyTv.this.h1(this.f37357a);
            } else {
                TextView textView2 = NSTIJKPlayerSkyTv.this.f37267W;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                NSTIJKPlayerSkyTv.this.f37218E0.putInt("currentSubtitleTrack", i9);
                NSTIJKPlayerSkyTv.this.u1(i9);
            }
            NSTIJKPlayerSkyTv.this.f37218E0.apply();
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
            NSTIJKPlayerSkyTv.this.f37295j0 = i9;
            int i11 = (int) ((NSTIJKPlayerSkyTv.this.f37295j0 / 255.0f) * 100.0f);
            if (i11 < 20) {
                textView = NSTIJKPlayerSkyTv.this.f37287g1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i10 = a7.e.f12015i0;
            } else if (i11 < 30) {
                textView = NSTIJKPlayerSkyTv.this.f37287g1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i10 = a7.e.f12019j0;
            } else if (i11 < 40) {
                textView = NSTIJKPlayerSkyTv.this.f37287g1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i10 = a7.e.f12023k0;
            } else if (i11 < 50) {
                textView = NSTIJKPlayerSkyTv.this.f37287g1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i10 = a7.e.f12027l0;
            } else if (i11 < 60) {
                textView = NSTIJKPlayerSkyTv.this.f37287g1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i10 = a7.e.f12031m0;
            } else if (i11 < 70) {
                textView = NSTIJKPlayerSkyTv.this.f37287g1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i10 = a7.e.f12035n0;
            } else {
                textView = NSTIJKPlayerSkyTv.this.f37287g1;
                resources = NSTIJKPlayerSkyTv.this.getResources();
                i10 = a7.e.f12039o0;
            }
            textView.setBackground(resources.getDrawable(i10));
            WindowManager.LayoutParams attributes = NSTIJKPlayerSkyTv.this.f37283f0.getWindow().getAttributes();
            attributes.screenBrightness = NSTIJKPlayerSkyTv.this.f37295j0 / 255.0f;
            NSTIJKPlayerSkyTv.this.f37247O.R((int) NSTIJKPlayerSkyTv.this.f37295j0);
            NSTIJKPlayerSkyTv.this.f37283f0.getWindow().setAttributes(attributes);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSkyTv.this.C1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSkyTv.this.C1();
            NSTIJKPlayerSkyTv.this.d1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv;
            String str;
            switch (i9) {
                case 0:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "10";
                    break;
                case 1:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "12";
                    break;
                case 2:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "14";
                    break;
                case 3:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "16";
                    break;
                case 4:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "18";
                    break;
                case 5:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "20";
                    break;
                case 6:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "22";
                    break;
                case 7:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "24";
                    break;
                case 8:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "26";
                    break;
                case 9:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "28";
                    break;
                case 10:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "30";
                    break;
                case 11:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "32";
                    break;
                case 12:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "34";
                    break;
                case 13:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "36";
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "38";
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
                    str = "40";
                    break;
                default:
                    return;
            }
            nSTIJKPlayerSkyTv.F1(str);
            NSTIJKPlayerSkyTv.this.f37262T0.setText(str);
            dialogInterface.cancel();
        }
    }

    public class m implements DialogInterface.OnDismissListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
        }
    }

    public class n implements SeekBar.OnSeekBarChangeListener {
        public n() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            TextView textView;
            Resources resources;
            int i10;
            if (NSTIJKPlayerSkyTv.this.f37289h0 != null) {
                try {
                    NSTIJKPlayerSkyTv.this.f37289h0.setStreamVolume(3, i9, 0);
                    int streamVolume = (int) ((NSTIJKPlayerSkyTv.this.f37289h0.getStreamVolume(3) / NSTIJKPlayerSkyTv.this.f37292i0) * 100.0f);
                    if (streamVolume == 0 || streamVolume < 0) {
                        textView = NSTIJKPlayerSkyTv.this.f37290h1;
                        resources = NSTIJKPlayerSkyTv.this.getResources();
                        i10 = a7.e.f12071w0;
                    } else if (streamVolume < 40) {
                        textView = NSTIJKPlayerSkyTv.this.f37290h1;
                        resources = NSTIJKPlayerSkyTv.this.getResources();
                        i10 = a7.e.f12059t0;
                    } else if (streamVolume < 80) {
                        textView = NSTIJKPlayerSkyTv.this.f37290h1;
                        resources = NSTIJKPlayerSkyTv.this.getResources();
                        i10 = a7.e.f12063u0;
                    } else if (streamVolume < 100) {
                        textView = NSTIJKPlayerSkyTv.this.f37290h1;
                        resources = NSTIJKPlayerSkyTv.this.getResources();
                        i10 = a7.e.f12067v0;
                    } else {
                        textView = NSTIJKPlayerSkyTv.this.f37290h1;
                        resources = NSTIJKPlayerSkyTv.this.getResources();
                        i10 = a7.e.f12067v0;
                    }
                    textView.setBackground(resources.getDrawable(i10));
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSkyTv.this.C1();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerSkyTv.this.C1();
            NSTIJKPlayerSkyTv.this.d1(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        }
    }

    public class o implements View.OnTouchListener {
        public o() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return (((LinearLayout) NSTIJKPlayerSkyTv.this.f37283f0.findViewById(a7.f.f12155G8)).getVisibility() == 0 || motionEvent == null || !NSTIJKPlayerSkyTv.this.f37298k0.onTouchEvent(motionEvent)) ? false : true;
        }
    }

    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            nSTIJKPlayerSkyTv.f37226H++;
            m7.w.P0(nSTIJKPlayerSkyTv.f37283f0, NSTIJKPlayerSkyTv.this.f37283f0.getResources().getString(a7.j.f13262g5) + " (" + NSTIJKPlayerSkyTv.this.f37226H + "/" + NSTIJKPlayerSkyTv.this.f37229I + ")");
            NSTIJKPlayerSkyTv.this.q1();
            NSTIJKPlayerSkyTv.this.start();
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerSkyTv.this.k1();
        }
    }

    public class r implements IMediaPlayer.OnVideoSizeChangedListener {
        public r() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerSkyTv.this.f37297k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSkyTv.this.f37300l = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerSkyTv.this.f37253Q = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerSkyTv.this.f37256R = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerSkyTv.this.f37297k == 0 || NSTIJKPlayerSkyTv.this.f37300l == 0) {
                return;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = nSTIJKPlayerSkyTv.f37250P;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerSkyTv.f37297k, NSTIJKPlayerSkyTv.this.f37300l);
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                nSTIJKPlayerSkyTv2.f37250P.a(nSTIJKPlayerSkyTv2.f37253Q, NSTIJKPlayerSkyTv.this.f37256R);
            }
            NSTIJKPlayerSkyTv.this.requestLayout();
        }
    }

    public class s implements IMediaPlayer.OnPreparedListener {
        public s() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSkyTv.this.f37261T = System.currentTimeMillis();
            NSTIJKPlayerSkyTv.this.f37285g = 2;
            if (NSTIJKPlayerSkyTv.this.f37307n0.b(a7.f.f12086A) != null) {
                NSTIJKPlayerSkyTv.this.f37307n0.b(a7.f.f12086A).a();
            }
            if (NSTIJKPlayerSkyTv.this.f37315q != null) {
                NSTIJKPlayerSkyTv.this.f37315q.onPrepared(NSTIJKPlayerSkyTv.this.f37294j);
            }
            NSTIJKPlayerSkyTv.D(NSTIJKPlayerSkyTv.this);
            NSTIJKPlayerSkyTv.this.f37297k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerSkyTv.this.f37300l = iMediaPlayer.getVideoHeight();
            int i9 = NSTIJKPlayerSkyTv.this.f37327u;
            if (i9 != 0) {
                NSTIJKPlayerSkyTv.this.seekTo(i9);
            }
            if (NSTIJKPlayerSkyTv.this.f37297k == 0 || NSTIJKPlayerSkyTv.this.f37300l == 0) {
                if (NSTIJKPlayerSkyTv.this.f37288h == 3) {
                    NSTIJKPlayerSkyTv.this.start();
                    return;
                }
                return;
            }
            NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv = NSTIJKPlayerSkyTv.this;
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = nSTIJKPlayerSkyTv.f37250P;
            if (aVar != null) {
                aVar.c(nSTIJKPlayerSkyTv.f37297k, NSTIJKPlayerSkyTv.this.f37300l);
                NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv2 = NSTIJKPlayerSkyTv.this;
                nSTIJKPlayerSkyTv2.f37250P.a(nSTIJKPlayerSkyTv2.f37253Q, NSTIJKPlayerSkyTv.this.f37256R);
                if (!NSTIJKPlayerSkyTv.this.f37250P.d() || (NSTIJKPlayerSkyTv.this.f37303m == NSTIJKPlayerSkyTv.this.f37297k && NSTIJKPlayerSkyTv.this.f37306n == NSTIJKPlayerSkyTv.this.f37300l)) {
                    if (NSTIJKPlayerSkyTv.this.f37288h == 3) {
                        NSTIJKPlayerSkyTv.this.start();
                    } else {
                        if (NSTIJKPlayerSkyTv.this.isPlaying()) {
                            return;
                        }
                        if (i9 == 0 && NSTIJKPlayerSkyTv.this.getCurrentPosition() <= 0) {
                            return;
                        }
                    }
                    NSTIJKPlayerSkyTv.D(NSTIJKPlayerSkyTv.this);
                }
            }
        }
    }

    public class t implements IMediaPlayer.OnCompletionListener {
        public t() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerSkyTv.this.f37285g = 5;
            NSTIJKPlayerSkyTv.this.f37288h = 5;
            NSTIJKPlayerSkyTv.D(NSTIJKPlayerSkyTv.this);
            NSTIJKPlayerSkyTv.this.C1();
            NSTIJKPlayerSkyTv.this.y1();
            NSTIJKPlayerSkyTv.this.d1(5000);
            if (NSTIJKPlayerSkyTv.this.f37312p != null) {
                NSTIJKPlayerSkyTv.this.f37312p.onCompletion(NSTIJKPlayerSkyTv.this.f37294j);
            }
        }
    }

    public class u implements IMediaPlayer.OnInfoListener {
        public u() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, int i9, int i10) {
            String str;
            String str2;
            if (NSTIJKPlayerSkyTv.this.f37324t != null) {
                NSTIJKPlayerSkyTv.this.f37324t.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerSkyTv.this.A1(2);
                str = NSTIJKPlayerSkyTv.this.f37272a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerSkyTv.this.A1(1);
                str = NSTIJKPlayerSkyTv.this.f37272a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerSkyTv.this.f37272a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerSkyTv.this.f37309o = i10;
                        Log.d(NSTIJKPlayerSkyTv.this.f37272a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar = NSTIJKPlayerSkyTv.this.f37250P;
                        if (aVar != null) {
                            aVar.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerSkyTv.this.f37272a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerSkyTv.this.A1(1);
                                str = NSTIJKPlayerSkyTv.this.f37272a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerSkyTv.this.A1(6);
                                str = NSTIJKPlayerSkyTv.this.f37272a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerSkyTv.this.f37272a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerSkyTv.this.f37272a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerSkyTv.this.f37272a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerSkyTv.this.f37272a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerSkyTv.this.f37272a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerSkyTv.this.f37272a;
                str2 = "MEDIA_INFO_SUBTITLE_TIMED_OUT:";
            }
            Log.d(str, str2);
            return true;
        }
    }

    public static abstract class v {
    }

    public class w implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37370a;

        public w(View view) {
            this.f37370a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37370a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37370a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (!z9) {
                if (z9) {
                    return;
                }
                View view2 = this.f37370a;
                if (view2 != null && view2.getTag() != null && this.f37370a.getTag().equals("1") && NSTIJKPlayerSkyTv.this.f37310o0 != null) {
                    NSTIJKPlayerSkyTv.this.f37310o0.setBackgroundResource(a7.e.f12038o);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f37370a;
            if (view3 != null && view3.getTag() != null && this.f37370a.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerSkyTv.this.getResources().getDrawable(a7.e.f11931K1));
                return;
            }
            float f9 = z9 ? 1.12f : 1.0f;
            a(f9);
            b(f9);
            View view4 = this.f37370a;
            if (view4 == null || view4.getTag() == null || !this.f37370a.getTag().equals("1") || NSTIJKPlayerSkyTv.this.f37310o0 == null) {
                return;
            }
            NSTIJKPlayerSkyTv.this.f37310o0.setBackgroundResource(a7.e.f12010h);
        }
    }

    public class x extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37372a;

        public x() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f37372a = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            NSTIJKPlayerSkyTv.this.H1();
            return true;
        }
    }

    public class y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f37374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f37375b;

        public y(Activity activity) {
            this.f37374a = activity;
        }

        public y a() {
            View view = this.f37375b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public y b(int i9) {
            this.f37375b = this.f37374a.findViewById(i9);
            return this;
        }

        public y c() {
            View view = this.f37375b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public y d(CharSequence charSequence) {
            View view = this.f37375b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public y e() {
            View view = this.f37375b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    public static class z extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f37377a;

        public z(Context context) {
            this.f37377a = context;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            LiveStreamDBHandler liveStreamDBHandler;
            String strG;
            String str;
            try {
                LiveStreamDBHandler liveStreamDBHandler2 = NSTIJKPlayerSkyTv.f37202S1;
                if (liveStreamDBHandler2 != null) {
                    liveStreamDBHandler2.deleteLiveRecentlyWatched(C2966a.f().g());
                    if (NSTIJKPlayerSkyTv.f37203T1.equalsIgnoreCase("true")) {
                        liveStreamDBHandler = NSTIJKPlayerSkyTv.f37202S1;
                        strG = C2966a.f().g();
                        str = "radio_streams";
                    } else {
                        liveStreamDBHandler = NSTIJKPlayerSkyTv.f37202S1;
                        strG = C2966a.f().g();
                        str = "live";
                    }
                    liveStreamDBHandler.addLiveRecentlyWatched(strG, str);
                    NSTIJKPlayerSkyTv.f37202S1.deleteExtraLiveRecentlyWatched();
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            try {
                if (bool.booleanValue()) {
                    Context context = this.f37377a;
                    if (context instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) context).b4(2);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public NSTIJKPlayerSkyTv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37272a = "NSTIJKPlayerSkyTv";
        this.f37282f = 0;
        this.f37285g = 0;
        this.f37288h = 0;
        this.f37291i = null;
        this.f37294j = null;
        this.f37330v = true;
        this.f37333w = true;
        this.f37336x = true;
        this.f37339y = -1;
        this.f37342z = -1L;
        this.f37205A = true;
        this.f37208B = false;
        this.f37211C = 7000;
        this.f37220F = 0;
        this.f37226H = 0;
        this.f37229I = 5;
        this.f37232J = false;
        this.f37259S = 0L;
        this.f37261T = 0L;
        this.f37263U = 0L;
        this.f37265V = 0L;
        this.f37280e0 = "visible";
        this.f37295j0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f37313p0 = bool;
        this.f37316q0 = bool;
        this.f37319r0 = bool;
        this.f37322s0 = bool;
        this.f37325t0 = bool;
        this.f37328u0 = bool;
        this.f37331v0 = false;
        this.f37340y0 = false;
        this.f37343z0 = false;
        this.f37227H0 = false;
        this.f37230I0 = false;
        this.f37239L0 = false;
        this.f37284f1 = 0;
        this.f37326t1 = false;
        this.f37210B1 = new k();
        this.f37213C1 = new n();
        this.f37216D1 = new r();
        this.f37219E1 = new s();
        this.f37222F1 = new t();
        this.f37225G1 = new u();
        this.f37228H1 = new a();
        this.f37231I1 = new b();
        this.f37234J1 = new c();
        this.f37237K1 = new d();
        this.f37240L1 = new e();
        this.f37243M1 = 4;
        this.f37246N1 = f37204U1[0];
        this.f37249O1 = new ArrayList();
        this.f37252P1 = 0;
        this.f37255Q1 = 0;
        this.f37258R1 = false;
        n1(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0184 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A1(int r15) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.A1(int):void");
    }

    public static /* synthetic */ InterfaceC2938b D(NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv) {
        nSTIJKPlayerSkyTv.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void E1() {
        int i9;
        CharSequence[] charSequenceArr = {"10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40"};
        a.C0158a c0158a = new a.C0158a(getContext());
        c0158a.setTitle(getResources().getString(a7.j.f13121R7));
        String string = this.f37233J0.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
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
        c0158a.l(charSequenceArr, i9, new l());
        androidx.appcompat.app.a aVarCreate = c0158a.create();
        this.f37266V0 = aVarCreate;
        aVarCreate.setOnDismissListener(new m());
        this.f37266V0.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1(String str) {
        try {
            SharedPreferences sharedPreferences = this.f37283f0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f37233J0 = sharedPreferences;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            this.f37260S0 = editorEdit;
            if (editorEdit != null) {
                editorEdit.putString("pref.using_sub_font_size", str);
                this.f37260S0.apply();
            }
        } catch (Exception unused) {
        }
    }

    private void I1() {
        View viewFindViewById = this.f37283f0.findViewById(a7.f.f12491p);
        this.f37304m0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.f37304m0.setOnTouchListener(new o());
    }

    private void J1() {
        y yVar;
        int i9;
        try {
            IMediaPlayer iMediaPlayer = this.f37294j;
            if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
                this.f37307n0.b(a7.f.f12162H5).a();
                yVar = this.f37307n0;
                i9 = a7.f.f12172I5;
            } else {
                this.f37307n0.b(a7.f.f12172I5).a();
                yVar = this.f37307n0;
                i9 = a7.f.f12162H5;
            }
            yVar.b(i9).e();
        } catch (Exception unused) {
        }
    }

    private void c1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e1(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    private String f1(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
    }

    private void l1() {
        boolean zP = this.f37247O.p();
        this.f37258R1 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f37294j = AbstractServiceC2895a.a();
        }
    }

    private void m1() {
        this.f37249O1.clear();
        if (this.f37247O.s()) {
            this.f37249O1.add(1);
        }
        if (this.f37247O.t()) {
            this.f37249O1.add(2);
        }
        if (this.f37247O.r()) {
            this.f37249O1.add(0);
        }
        if (this.f37249O1.isEmpty()) {
            this.f37249O1.add(1);
        }
        int iIntValue = ((Integer) this.f37249O1.get(this.f37252P1)).intValue();
        this.f37255Q1 = iIntValue;
        setRender(iIntValue);
    }

    private void n1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f37244N = applicationContext;
        this.f37247O = new C2858a(applicationContext);
        this.f37236K0 = new n7.l(this, this.f37244N);
        l1();
        m1();
        this.f37297k = 0;
        this.f37300l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f37285g = 0;
        this.f37288h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f37233J0 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
        TextView textView = new TextView(context);
        this.f37267W = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception unused) {
        }
        this.f37267W.setTextColor(context.getResources().getColor(a7.c.f11849G));
        this.f37267W.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f37267W, layoutParams);
    }

    private boolean p1() {
        int i9;
        return (this.f37294j == null || (i9 = this.f37285g) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    private void w1(Uri uri, Map map, boolean z9, String str) {
        this.f37275c = uri;
        this.f37277d = str;
        this.f37279e = map;
        this.f37327u = 0;
        this.f37223G = z9;
        this.f37220F = this.f37220F;
        D1();
        q1();
        requestLayout();
        invalidate();
    }

    public void B1() {
        AbstractServiceC2895a.d(null);
    }

    public void C1() {
        Handler handler = this.f37271Z0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void D1() {
        IMediaPlayer iMediaPlayer = this.f37294j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f37294j.release();
            this.f37294j = null;
            this.f37285g = 0;
            this.f37288h = 0;
            ((AudioManager) this.f37244N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // z7.n
    public void E0(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int G1() {
        /*
            r6 = this;
            int r0 = r6.f37243M1
            r1 = 1
            int r0 = r0 + r1
            r6.f37243M1 = r0
            android.app.Activity r0 = r6.f37283f0
            java.lang.String r2 = "loginPrefs"
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r3)
            r6.f37235K = r0
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r6.f37238L = r0
            int r0 = r6.f37243M1
            int[] r2 = com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.f37204U1
            int r4 = r2.length
            int r0 = r0 % r4
            r6.f37243M1 = r0
            r0 = r2[r0]
            r6.f37246N1 = r0
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r0 = r6.f37250P
            if (r0 == 0) goto Lb1
            android.app.Activity r0 = r6.f37283f0
            int r2 = a7.f.f12319X6
            android.view.View r0 = r0.findViewById(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.app.Activity r2 = r6.f37283f0
            int r4 = a7.f.f12471n
            android.view.View r2 = r2.findViewById(r4)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a r4 = r6.f37250P
            int r5 = r6.f37246N1
            r4.setAspectRatio(r5)
            int r4 = r6.f37243M1
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
            android.content.SharedPreferences$Editor r1 = r6.f37238L
            java.lang.String r2 = "aspect_ratio"
            int r4 = r6.f37243M1
            r1.putInt(r2, r4)
            android.content.SharedPreferences$Editor r1 = r6.f37238L
            r1.apply()
            r0.setVisibility(r3)
            android.widget.LinearLayout r1 = r6.f37293i1
            if (r1 == 0) goto L9f
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L9f
            android.widget.LinearLayout r1 = r6.f37293i1
            r2 = 8
            r1.setVisibility(r2)
        L9f:
            android.os.Handler r1 = r6.f37217E
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            android.os.Handler r1 = r6.f37217E
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$f r2 = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv$f
            r2.<init>(r0)
            r3 = 3000(0xbb8, double:1.482E-320)
            r1.postDelayed(r2, r3)
        Lb1:
            int r0 = r6.f37246N1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.G1():int");
    }

    public void H1() {
        RelativeLayout relativeLayout;
        SeekBar seekBar = this.f37269X0;
        if (seekBar != null) {
            seekBar.setProgress(this.f37289h0.getStreamVolume(3));
        }
        C1();
        if (this.f37302l1.getVisibility() == 0) {
            this.f37302l1.startAnimation(this.f37305m1);
            relativeLayout = this.f37302l1;
        } else {
            if (this.f37320r1.getVisibility() != 0) {
                if (this.f37270Y0.getVisibility() == 0) {
                    k1();
                    return;
                } else {
                    y1();
                    d1(5000);
                    return;
                }
            }
            this.f37320r1.startAnimation(this.f37314p1);
            relativeLayout = this.f37320r1;
        }
        relativeLayout.setVisibility(8);
    }

    @Override // z7.n
    public void K(VodInfoCallback vodInfoCallback) {
    }

    @Override // z7.b
    public void a() {
    }

    @Override // z7.b
    public void b() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f37330v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f37333w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f37336x;
    }

    @Override // z7.b
    public void d(String str) {
    }

    public void d1(int i9) {
        q qVar = new q();
        this.f37273a1 = qVar;
        this.f37271Z0.postDelayed(qVar, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[PHI: r2
      0x0052: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:10:0x002e, B:16:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tv.danmaku.ijk.media.player.IMediaPlayer g1(int r10) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSkyTv.g1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f37294j != null) {
            return this.f37318r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (p1()) {
            return (int) this.f37294j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentWindowIndex() {
        return this.f37220F;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (p1()) {
            return (int) this.f37294j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f37223G);
    }

    public int getNewSeekPosition() {
        return (int) this.f37342z;
    }

    public boolean getPlayerIsPrepared() {
        return this.f37239L0;
    }

    public String getShowOrHideSubtitles() {
        return this.f37280e0;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f37294j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h1(int i9) {
        AbstractC2941e.b(this.f37294j, i9);
    }

    public void i1() {
        AbstractServiceC2895a.d(this.f37294j);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return p1() && (iMediaPlayer = this.f37294j) != null && iMediaPlayer.isPlaying();
    }

    public void j1(Boolean bool) {
        this.f37223G = bool.booleanValue();
    }

    public void k1() {
        if (this.f37270Y0.getVisibility() == 0) {
            this.f37270Y0.startAnimation(this.f37276c1);
            this.f37341y1.startAnimation(this.f37276c1);
            this.f37344z1.startAnimation(this.f37276c1);
            this.f37207A1.startAnimation(this.f37276c1);
            if (this.f37278d1.getVisibility() == 0) {
                this.f37278d1.startAnimation(this.f37276c1);
            }
            if (this.f37293i1.getVisibility() == 0) {
                this.f37293i1.startAnimation(this.f37276c1);
            }
            if (this.f37281e1.getVisibility() == 0) {
                this.f37281e1.startAnimation(this.f37276c1);
            }
            this.f37270Y0.setVisibility(8);
            if (this.f37278d1.getVisibility() == 0) {
                this.f37278d1.setVisibility(8);
            }
            if (this.f37293i1.getVisibility() == 0) {
                this.f37293i1.setVisibility(8);
            }
            if (this.f37281e1.getVisibility() == 0) {
                this.f37281e1.setVisibility(8);
            }
            this.f37341y1.setVisibility(8);
            this.f37344z1.setVisibility(8);
            this.f37207A1.setVisibility(8);
        }
    }

    public boolean o1() {
        return this.f37258R1;
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
        if (p1() && (iMediaPlayer = this.f37294j) != null && iMediaPlayer.isPlaying()) {
            this.f37294j.pause();
            this.f37285g = 4;
        }
        this.f37288h = 4;
    }

    public void q1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f37275c == null || this.f37291i == null) {
            return;
        }
        r1(false);
        try {
            ((AudioManager) this.f37244N.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            this.f37294j = g1(this.f37247O.x());
            getContext();
            this.f37294j.setOnPreparedListener(this.f37219E1);
            this.f37294j.setOnVideoSizeChangedListener(this.f37216D1);
            this.f37294j.setOnCompletionListener(this.f37222F1);
            this.f37294j.setOnErrorListener(this.f37228H1);
            this.f37294j.setOnInfoListener(this.f37225G1);
            this.f37294j.setOnBufferingUpdateListener(this.f37231I1);
            this.f37294j.setOnSeekCompleteListener(this.f37234J1);
            this.f37294j.setOnTimedTextListener(this.f37237K1);
            this.f37318r = 0;
            String scheme = this.f37275c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f37247O.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f37294j.setDataSource(new C2937a(new File(this.f37275c.toString())));
            } else {
                this.f37294j.setDataSource(this.f37244N, this.f37275c, this.f37279e);
            }
            e1(this.f37294j, this.f37291i);
            this.f37294j.setAudioStreamType(3);
            this.f37294j.setScreenOnWhilePlaying(true);
            this.f37259S = System.currentTimeMillis();
            this.f37294j.prepareAsync();
            this.f37301l0 = this.f37283f0.getResources().getDisplayMetrics().widthPixels;
            AudioManager audioManager = (AudioManager) this.f37283f0.getSystemService("audio");
            this.f37289h0 = audioManager;
            this.f37292i0 = audioManager.getStreamMaxVolume(3);
            int streamVolume = this.f37289h0.getStreamVolume(3);
            this.f37269X0.setMax(this.f37289h0.getStreamMaxVolume(3));
            this.f37269X0.setProgress(streamVolume);
            this.f37298k0 = new GestureDetector(this.f37283f0, new x());
            I1();
            this.f37334w0 = new StringBuilder();
            this.f37337x0 = new Formatter(this.f37334w0, Locale.getDefault());
            this.f37285g = 1;
        } catch (IOException e9) {
            Log.w(this.f37272a, "Unable to open content: " + this.f37275c, e9);
            this.f37285g = -1;
            this.f37288h = -1;
            onErrorListener = this.f37228H1;
            onErrorListener.onError(this.f37294j, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f37272a, "Unable to open content: " + this.f37275c, e10);
            this.f37285g = -1;
            this.f37288h = -1;
            onErrorListener = this.f37228H1;
            onErrorListener.onError(this.f37294j, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f37272a, "Unable to open content: " + this.f37275c, e11);
            this.f37285g = -1;
            this.f37288h = -1;
            onErrorListener = this.f37228H1;
            onErrorListener.onError(this.f37294j, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f37272a, "Unable to open content: " + this.f37275c, e12);
            this.f37285g = -1;
            this.f37288h = -1;
            onErrorListener = this.f37228H1;
            onErrorListener.onError(this.f37294j, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r1(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f37294j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f37294j.release();
            this.f37294j = null;
            this.f37285g = 0;
            if (z9) {
                this.f37288h = 0;
            }
            ((AudioManager) this.f37244N.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void s1() {
        IMediaPlayer iMediaPlayer = this.f37294j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (p1()) {
            this.f37263U = System.currentTimeMillis();
            this.f37294j.seekTo(i9);
            i9 = 0;
        }
        this.f37327u = i9;
    }

    public void setAdjustViewBounds(boolean z9) {
        if (this.f37323s1 == z9) {
            return;
        }
        this.f37323s1 = z9;
        if (z9) {
            setBackground(null);
        } else {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        requestLayout();
    }

    public void setContext(Context context) {
        this.f37338x1 = context;
    }

    public void setCurrentChannelLogo(String str) {
        this.f37332v1 = str;
    }

    public void setCurrentEpgChannelID(String str) {
        this.f37329u1 = str;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f37220F = i9;
    }

    public void setEPGHandler(Handler handler) {
        this.f37335w1 = handler;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setLiveStreamDBHandler(LiveStreamDBHandler liveStreamDBHandler) {
        f37202S1 = liveStreamDBHandler;
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        c1();
    }

    public void setMovieListener(v vVar) {
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f37312p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f37321s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f37324t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f37315q = onPreparedListener;
    }

    public void setRender(int i9) {
        com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f37272a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c cVar = new com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.c(getContext());
            bVar = cVar;
            if (this.f37294j != null) {
                cVar.getSurfaceHolder().b(this.f37294j);
                cVar.c(this.f37294j.getVideoWidth(), this.f37294j.getVideoHeight());
                cVar.a(this.f37294j.getVideoSarNum(), this.f37294j.getVideoSarDen());
                cVar.setAspectRatio(this.f37246N1);
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a aVar) {
        int i9;
        int i10;
        if (this.f37250P != null) {
            IMediaPlayer iMediaPlayer = this.f37294j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f37250P.getView();
            this.f37250P.b(this.f37240L1);
            this.f37250P = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f37250P = aVar;
        SharedPreferences sharedPreferences = this.f37244N.getSharedPreferences("loginPrefs", 0);
        this.f37235K = sharedPreferences;
        int i11 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f37243M1 = i11;
        aVar.setAspectRatio(i11);
        int i12 = this.f37297k;
        if (i12 > 0 && (i10 = this.f37300l) > 0) {
            aVar.c(i12, i10);
        }
        int i13 = this.f37253Q;
        if (i13 > 0 && (i9 = this.f37256R) > 0) {
            aVar.a(i13, i9);
        }
        View view2 = this.f37250P.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f37250P.e(this.f37240L1);
        this.f37250P.setVideoRotation(this.f37309o);
    }

    public void setShowOrHideSubtitles(String str) {
        this.f37280e0 = str;
    }

    public void setTitle(CharSequence charSequence) {
        this.f37307n0.b(a7.f.lj).d(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (p1()) {
            this.f37294j.start();
            this.f37285g = 3;
        }
        this.f37288h = 3;
    }

    public void t1() {
        Handler handler = this.f37214D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void u1(int i9) {
        AbstractC2941e.e(this.f37294j, i9);
    }

    public void v1(Activity activity, NSTIJKPlayerSkyTv nSTIJKPlayerSkyTv, RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, SeekBar seekBar, SeekBar seekBar2, LinearLayout linearLayout, Animation animation, Animation animation2, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView5, LinearLayout linearLayout4, Animation animation3, Animation animation4, TextView textView6, RelativeLayout relativeLayout, Animation animation5, Animation animation6, Animation animation7, RelativeLayout relativeLayout2, Animation animation8, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, FrameLayout frameLayout, String str) {
        this.f37283f0 = activity;
        f37203T1 = str;
        this.f37286g0 = nSTIJKPlayerSkyTv;
        this.f37214D = new Handler();
        this.f37217E = new Handler();
        this.f37251P0 = radioGroup;
        this.f37254Q0 = radioGroup2;
        this.f37257R0 = radioGroup3;
        this.f37248O0 = textView;
        this.f37245N0 = textView2;
        this.f37242M0 = textView3;
        this.f37262T0 = textView4;
        this.f37268W0 = seekBar;
        this.f37269X0 = seekBar2;
        this.f37270Y0 = linearLayout;
        this.f37271Z0 = new Handler();
        this.f37274b1 = animation;
        this.f37276c1 = animation2;
        this.f37278d1 = linearLayout2;
        this.f37281e1 = linearLayout3;
        this.f37268W0.setOnSeekBarChangeListener(this.f37210B1);
        this.f37269X0.setOnSeekBarChangeListener(this.f37213C1);
        this.f37287g1 = textView5;
        seekBar.setKeyProgressIncrement(1);
        float f9 = this.f37283f0.getWindow().getAttributes().screenBrightness;
        this.f37295j0 = f9;
        if (f9 == -1.0f) {
            this.f37295j0 = this.f37247O != null ? r3.o() : AbstractC2237a.f44451J0;
        }
        seekBar.setProgress((int) this.f37295j0);
        this.f37293i1 = linearLayout4;
        this.f37296j1 = animation3;
        this.f37299k1 = animation4;
        this.f37290h1 = textView6;
        this.f37302l1 = relativeLayout;
        this.f37305m1 = animation5;
        this.f37308n1 = animation6;
        this.f37311o1 = animation7;
        this.f37320r1 = relativeLayout2;
        this.f37314p1 = animation8;
        this.f37207A1 = linearLayout7;
        this.f37344z1 = linearLayout6;
        this.f37341y1 = linearLayout5;
        this.f37307n0 = new y(activity);
        this.f37264U0 = frameLayout;
    }

    public void x1(Uri uri, boolean z9, String str) {
        w1(uri, null, z9, str);
    }

    public void y1() {
        if (NSTIJKPlayerSkyTvActivity.f35626G5 && this.f37270Y0.getVisibility() == 8) {
            this.f37270Y0.startAnimation(this.f37274b1);
            this.f37270Y0.setVisibility(0);
            if (this.f37278d1.getVisibility() == 8) {
                this.f37278d1.startAnimation(this.f37274b1);
                this.f37278d1.setVisibility(0);
            }
            if (this.f37293i1.getVisibility() == 8 && !NSTIJKPlayerSkyTvActivity.r3()) {
                this.f37293i1.startAnimation(this.f37274b1);
                this.f37293i1.setVisibility(0);
            }
            if (this.f37281e1.getVisibility() == 8) {
                this.f37281e1.startAnimation(this.f37274b1);
                this.f37281e1.setVisibility(0);
            }
            this.f37341y1.startAnimation(this.f37274b1);
            this.f37341y1.setVisibility(0);
            this.f37344z1.startAnimation(this.f37274b1);
            this.f37344z1.setVisibility(0);
            this.f37207A1.startAnimation(this.f37274b1);
            this.f37207A1.setVisibility(0);
        }
    }

    public void z1(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        TextView textView5;
        int i9;
        ITrackInfo[] iTrackInfoArr;
        int i10;
        if (this.f37294j == null) {
            return;
        }
        radioGroup.removeAllViews();
        radioGroup2.removeAllViews();
        radioGroup3.removeAllViews();
        try {
            SharedPreferences sharedPreferences = this.f37283f0.getSharedPreferences("pref.using_sub_font_size", 0);
            this.f37233J0 = sharedPreferences;
            textView4.setText(sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0));
            frameLayout.setOnClickListener(new g());
        } catch (Exception unused) {
        }
        Boolean bool = Boolean.FALSE;
        this.f37328u0 = bool;
        this.f37325t0 = bool;
        this.f37322s0 = bool;
        this.f37316q0 = bool;
        this.f37313p0 = bool;
        this.f37319r0 = bool;
        int iD = AbstractC2941e.d(this.f37294j, 1);
        int iD2 = AbstractC2941e.d(this.f37294j, 2);
        int iD3 = AbstractC2941e.d(this.f37294j, 3);
        ITrackInfo[] trackInfo = this.f37294j.getTrackInfo();
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
                        this.f37322s0 = bool2;
                        if (!this.f37313p0.booleanValue()) {
                            this.f37313p0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f37283f0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton.setTextSize(13.0f);
                            radioButton.setId(11111111);
                            radioButton.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37244N, a7.c.f11849G)));
                            radioButton.setPadding(0, 0, 16, 0);
                            radioButton.setOnFocusChangeListener(new w(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f37283f0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        if (i13 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i13);
                        }
                        radioButton2.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton2.setTextSize(13.0f);
                        radioButton2.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37244N, a7.c.f11849G)));
                        radioButton2.setPadding(0, 0, 16, 0);
                        radioButton2.setOnFocusChangeListener(new w(radioButton2));
                        if (i13 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new h(iD));
                        i11++;
                        i12 = i13;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f37325t0 = bool3;
                        if (!this.f37316q0.booleanValue()) {
                            this.f37316q0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f37283f0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton3.setTextSize(13.0f);
                            radioButton3.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37244N, a7.c.f11849G)));
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(0, 0, 16, 0);
                            radioButton3.setOnFocusChangeListener(new w(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f37283f0);
                        radioButton4.setText(i13 + ", " + iTrackInfo.getInfoInline() + ", " + f1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton4.setTextSize(13.0f);
                        radioButton4.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37244N, a7.c.f11849G)));
                        if (i13 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i13);
                        }
                        radioButton4.setPadding(0, 0, 16, 0);
                        radioButton4.setOnFocusChangeListener(new w(radioButton4));
                        if (i13 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new i(iD2));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f37328u0 = bool4;
                        if (!this.f37319r0.booleanValue()) {
                            this.f37319r0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f37283f0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(a7.c.f11849G));
                            radioButton5.setTextSize(13.0f);
                            radioButton5.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37244N, a7.c.f11849G)));
                            radioButton5.setId(111111);
                            radioButton5.setPadding(0, 0, 16, 0);
                            radioButton5.setOnFocusChangeListener(new w(radioButton5));
                            if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f37283f0);
                        radioButton6.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(a7.c.f11849G));
                        radioButton6.setTextSize(13.0f);
                        radioButton6.setButtonTintList(ColorStateList.valueOf(E.b.getColor(this.f37244N, a7.c.f11849G)));
                        if (i13 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i13);
                        }
                        radioButton6.setPadding(0, 0, 16, 0);
                        radioButton6.setOnFocusChangeListener(new w(radioButton6));
                        if (i13 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new j(iD3));
                    }
                } else {
                    iTrackInfoArr = trackInfo;
                    i10 = length;
                }
                i11++;
                i12 = i13;
                trackInfo = iTrackInfoArr;
            }
            if (this.f37322s0.booleanValue()) {
                i9 = 0;
                textView.setVisibility(8);
            } else {
                i9 = 0;
                textView.setVisibility(0);
            }
            if (this.f37325t0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(i9);
            }
            if (this.f37328u0.booleanValue()) {
                textView3.setVisibility(8);
                return;
            }
            textView5 = textView3;
        }
        textView5.setVisibility(i9);
    }
}
