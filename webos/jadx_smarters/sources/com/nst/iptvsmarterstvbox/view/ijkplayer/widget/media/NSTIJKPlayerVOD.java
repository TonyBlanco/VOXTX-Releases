package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PlayerResumeDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import m7.AbstractC2237a;
import mbanje.kurt.fabbutton.FabButton;
import o2.AbstractC2312g;
import org.joda.time.DateTimeConstants;
import p7.C2509z0;
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
public class NSTIJKPlayerVOD extends FrameLayout implements MediaController.MediaPlayerControl, z7.n {

    /* JADX INFO: renamed from: K1, reason: collision with root package name */
    public static final int[] f37476K1 = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f37477A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public TextView f37478A0;

    /* JADX INFO: renamed from: A1, reason: collision with root package name */
    public IMediaPlayer.OnBufferingUpdateListener f37479A1;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f37480B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public StringBuilder f37481B0;

    /* JADX INFO: renamed from: B1, reason: collision with root package name */
    public IMediaPlayer.OnSeekCompleteListener f37482B1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f37483C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public Formatter f37484C0;

    /* JADX INFO: renamed from: C1, reason: collision with root package name */
    public IMediaPlayer.OnTimedTextListener f37485C1;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f37486D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences f37487D0;

    /* JADX INFO: renamed from: D1, reason: collision with root package name */
    public a.InterfaceC0291a f37488D1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Handler f37489E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public SharedPreferences.Editor f37490E0;

    /* JADX INFO: renamed from: E1, reason: collision with root package name */
    public int f37491E1;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Handler f37492F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public RecentWatchDBHandler f37493F0;

    /* JADX INFO: renamed from: F1, reason: collision with root package name */
    public int f37494F1;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f37495G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public LiveStreamDBHandler f37496G0;

    /* JADX INFO: renamed from: G1, reason: collision with root package name */
    public List f37497G1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f37498H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public PlayerResumeDBHandler f37499H0;

    /* JADX INFO: renamed from: H1, reason: collision with root package name */
    public int f37500H1;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f37501I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public boolean f37502I0;

    /* JADX INFO: renamed from: I1, reason: collision with root package name */
    public int f37503I1;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f37504J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f37505J0;

    /* JADX INFO: renamed from: J1, reason: collision with root package name */
    public boolean f37506J1;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f37507K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f37508K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences f37509L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public long f37510L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences.Editor f37511M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f37512M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SharedPreferences f37513N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public boolean f37514N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SharedPreferences f37515O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public String f37516O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Context f37517P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public String f37518P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C2858a f37519Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public String f37520Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public a f37521R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public ArrayList f37522R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f37523S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f37524S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f37525T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f37526T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public long f37527U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public SharedPreferences f37528U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f37529V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public SharedPreferences f37530V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f37531W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public SharedPreferences f37532W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public SharedPreferences f37533X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public SharedPreferences.Editor f37534Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public SharedPreferences.Editor f37535Z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37536a;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public SharedPreferences.Editor f37537a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f37538b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f37539c;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public boolean f37540c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f37541d;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public boolean f37542d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f37543e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f37544e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public boolean f37545e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f37546f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f37547f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public boolean f37548f1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f37549g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Activity f37550g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public SeriesRecentWatchDatabase f37551g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f37552h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public NSTIJKPlayerVOD f37553h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public boolean f37554h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a.b f37555i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public AudioManager f37556i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public C2509z0 f37557i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public IMediaPlayer f37558j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f37559j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public SharedPreferences f37560j1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f37561k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f37562k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public n7.l f37563k1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37564l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public GestureDetector f37565l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public RelativeLayout f37566l1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f37567m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f37568m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public FabButton f37569m1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f37570n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public View f37571n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public int f37572n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f37573o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C f37574o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Runnable f37575o1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37576p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public androidx.appcompat.app.a f37577p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public Handler f37578p1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37579q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Button f37580q0;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public PopupWindow f37581q1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37582r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Boolean f37583r0;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public Button f37584r1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37585s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Boolean f37586s0;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f37587s1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37588t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Boolean f37589t0;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public Handler f37590t1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f37591u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Boolean f37592u0;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public IMediaPlayer.OnVideoSizeChangedListener f37593u1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37594v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Boolean f37595v0;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public IMediaPlayer.OnPreparedListener f37596v1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f37597w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public Boolean f37598w0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public IMediaPlayer.OnCompletionListener f37599w1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37600x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public SeekBar f37601x0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public final View.OnClickListener f37602x1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f37603y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f37604y0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public IMediaPlayer.OnInfoListener f37605y1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f37606z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f37607z0;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public IMediaPlayer.OnErrorListener f37608z1;

    public class A implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37609a;

        public A(View view) {
            this.f37609a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37609a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f37609a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (!z9) {
                if (z9) {
                    return;
                }
                View view2 = this.f37609a;
                if (view2 != null && view2.getTag() != null && this.f37609a.getTag().equals("1") && NSTIJKPlayerVOD.this.f37580q0 != null) {
                    NSTIJKPlayerVOD.this.f37580q0.setBackgroundResource(a7.e.f12038o);
                }
                a(1.0f);
                b(1.0f);
                return;
            }
            View view3 = this.f37609a;
            if (view3 != null && view3.getTag() != null && this.f37609a.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerVOD.this.getResources().getDrawable(a7.e.f11923I1));
                return;
            }
            float f9 = z9 ? 1.12f : 1.0f;
            a(f9);
            b(f9);
            View view4 = this.f37609a;
            if (view4 == null || view4.getTag() == null || !this.f37609a.getTag().equals("1") || NSTIJKPlayerVOD.this.f37580q0 == null) {
                return;
            }
            NSTIJKPlayerVOD.this.f37580q0.setBackgroundResource(a7.e.f12010h);
        }
    }

    public class B extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37611a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f37612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f37613d;

        public B() {
        }

        public void a(boolean z9) {
            if (z9 || NSTIJKPlayerVOD.this.f37477A) {
                NSTIJKPlayerVOD.this.h2(false);
                NSTIJKPlayerVOD.this.f37574o0.b(a7.f.f12236P).a();
                NSTIJKPlayerVOD.this.f37574o0.b(a7.f.f12484o2).a();
                NSTIJKPlayerVOD.this.f37574o0.b(a7.f.f12592z).d();
                NSTIJKPlayerVOD.this.f37574o0.b(a7.f.S9).a();
                NSTIJKPlayerVOD.this.J1();
            }
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            this.f37611a = true;
            return super.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f9, float f10) {
            if (motionEvent == null || motionEvent2 == null) {
                return Boolean.parseBoolean(null);
            }
            float x9 = motionEvent.getX();
            float y9 = motionEvent.getY() - motionEvent2.getY();
            motionEvent2.getX();
            if (this.f37611a) {
                this.f37613d = Math.abs(f9) >= Math.abs(f10);
                this.f37612c = x9 > ((float) NSTIJKPlayerVOD.this.f37568m0) * 0.5f;
                this.f37611a = false;
            }
            if (!this.f37613d) {
                float height = y9 / NSTIJKPlayerVOD.this.f37553h0.getHeight();
                if (this.f37612c) {
                    NSTIJKPlayerVOD.this.Q1(height);
                } else {
                    NSTIJKPlayerVOD.this.P1(height);
                }
            }
            return super.onScroll(motionEvent, motionEvent2, f9, f10);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (NSTIJKPlayerVOD.this.f37477A) {
                a(false);
            } else {
                LinearLayout linearLayout = (LinearLayout) NSTIJKPlayerVOD.this.f37550g0.findViewById(a7.f.f12236P);
                LinearLayout linearLayout2 = (LinearLayout) NSTIJKPlayerVOD.this.f37550g0.findViewById(a7.f.f12484o2);
                LinearLayout linearLayout3 = (LinearLayout) NSTIJKPlayerVOD.this.f37550g0.findViewById(a7.f.S9);
                if (linearLayout.getVisibility() == 0) {
                    linearLayout.setVisibility(8);
                    linearLayout2.setVisibility(8);
                    linearLayout3.setVisibility(8);
                    return true;
                }
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                nSTIJKPlayerVOD.g2(nSTIJKPlayerVOD.f37486D);
            }
            return true;
        }
    }

    public class C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f37615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f37616b;

        public C(Activity activity) {
            this.f37615a = activity;
        }

        public C a() {
            View view = this.f37616b;
            if (view != null) {
                view.setVisibility(8);
            }
            return this;
        }

        public C b(int i9) {
            this.f37616b = this.f37615a.findViewById(i9);
            return this;
        }

        public C c(int i9) {
            View view = this.f37616b;
            if (view instanceof ImageView) {
                ((ImageView) view).setImageResource(i9);
            }
            return this;
        }

        public C d() {
            View view = this.f37616b;
            if (view != null) {
                view.setVisibility(4);
            }
            return this;
        }

        public C e() {
            View view = this.f37616b;
            if (view != null) {
                view.requestFocus();
            }
            return this;
        }

        public C f(CharSequence charSequence) {
            View view = this.f37616b;
            if (view != null && (view instanceof TextView)) {
                ((TextView) view).setText(charSequence);
            }
            return this;
        }

        public C g(int i9) {
            View view = this.f37616b;
            if (view != null) {
                view.setVisibility(i9);
            }
            return this;
        }

        public C h() {
            View view = this.f37616b;
            if (view != null) {
                view.setVisibility(0);
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$a, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1515a implements View.OnClickListener {
        public ViewOnClickListenerC1515a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVOD.this.H1();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$b, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1516b implements View.OnClickListener {
        public ViewOnClickListenerC1516b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVOD.this.S1();
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD$c, reason: case insensitive filesystem */
    public class ViewOnClickListenerC1517c implements View.OnClickListener {
        public ViewOnClickListenerC1517c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVOD.this.S1();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() == M8.c.f5225b || view.getId() == a7.f.f12164H7) {
                NSTIJKPlayerVOD.this.S1();
            } else if (view.getId() == a7.f.f12088A1) {
                NSTIJKPlayerVOD.this.H1();
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVOD.J0(NSTIJKPlayerVOD.this, 1);
            NSTIJKPlayerVOD.this.f37569m1.setProgress(NSTIJKPlayerVOD.this.f37572n1);
            if (NSTIJKPlayerVOD.this.f37572n1 <= 140) {
                NSTIJKPlayerVOD.this.f37578p1.postDelayed(NSTIJKPlayerVOD.this.f37575o1, 70L);
            }
            if (NSTIJKPlayerVOD.this.f37572n1 == 120) {
                NSTIJKPlayerVOD.this.S1();
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
            if (NSTIJKPlayerVOD.this.f37588t != null) {
                NSTIJKPlayerVOD.this.f37588t.onInfo(iMediaPlayer, i9, i10);
            }
            if (i9 == 3) {
                NSTIJKPlayerVOD.this.l2(2);
                str = NSTIJKPlayerVOD.this.f37536a;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START:";
            } else if (i9 == 10005) {
                NSTIJKPlayerVOD.this.l2(1);
                str = NSTIJKPlayerVOD.this.f37536a;
                str2 = "MEDIA_INFO_OPEN_INPUT:";
            } else if (i9 == 901) {
                str = NSTIJKPlayerVOD.this.f37536a;
                str2 = "MEDIA_INFO_UNSUPPORTED_SUBTITLE:";
            } else {
                if (i9 != 902) {
                    if (i9 == 10001) {
                        NSTIJKPlayerVOD.this.f37573o = i10;
                        Log.d(NSTIJKPlayerVOD.this.f37536a, "MEDIA_INFO_VIDEO_ROTATION_CHANGED: " + i10);
                        if (NSTIJKPlayerVOD.this.f37521R != null) {
                            NSTIJKPlayerVOD.this.f37521R.setVideoRotation(i10);
                        }
                    } else if (i9 != 10002) {
                        switch (i9) {
                            case 700:
                                str = NSTIJKPlayerVOD.this.f37536a;
                                str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_START /* 701 */:
                                NSTIJKPlayerVOD.this.l2(1);
                                str = NSTIJKPlayerVOD.this.f37536a;
                                str2 = "MEDIA_INFO_BUFFERING_START:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_BUFFERING_END /* 702 */:
                                NSTIJKPlayerVOD.this.l2(6);
                                str = NSTIJKPlayerVOD.this.f37536a;
                                str2 = "MEDIA_INFO_BUFFERING_END:";
                                break;
                            case IMediaPlayer.MEDIA_INFO_NETWORK_BANDWIDTH /* 703 */:
                                str = NSTIJKPlayerVOD.this.f37536a;
                                str2 = "MEDIA_INFO_NETWORK_BANDWIDTH: " + i10;
                                break;
                            default:
                                switch (i9) {
                                    case 800:
                                        str = NSTIJKPlayerVOD.this.f37536a;
                                        str2 = "MEDIA_INFO_BAD_INTERLEAVING:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE /* 801 */:
                                        str = NSTIJKPlayerVOD.this.f37536a;
                                        str2 = "MEDIA_INFO_NOT_SEEKABLE:";
                                        break;
                                    case IMediaPlayer.MEDIA_INFO_METADATA_UPDATE /* 802 */:
                                        str = NSTIJKPlayerVOD.this.f37536a;
                                        str2 = "MEDIA_INFO_METADATA_UPDATE:";
                                        break;
                                }
                                break;
                        }
                    } else {
                        str = NSTIJKPlayerVOD.this.f37536a;
                        str2 = "MEDIA_INFO_AUDIO_RENDERING_START:";
                    }
                    return true;
                }
                str = NSTIJKPlayerVOD.this.f37536a;
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
            Log.d(NSTIJKPlayerVOD.this.f37536a, "Error: " + i9 + "," + i10);
            NSTIJKPlayerVOD.this.f37549g = -1;
            NSTIJKPlayerVOD.this.f37552h = -1;
            NSTIJKPlayerVOD.c0(NSTIJKPlayerVOD.this);
            NSTIJKPlayerVOD.this.l2(-1);
            if (NSTIJKPlayerVOD.this.f37585s != null) {
                NSTIJKPlayerVOD.this.f37585s.onError(NSTIJKPlayerVOD.this.f37558j, i9, i10);
            }
            return true;
        }
    }

    public class h implements IMediaPlayer.OnBufferingUpdateListener {
        public h() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int i9) {
            NSTIJKPlayerVOD.this.f37582r = i9;
        }
    }

    public class i implements IMediaPlayer.OnSeekCompleteListener {
        public i() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerVOD.this.f37544e0 = System.currentTimeMillis();
        }
    }

    public class j implements IMediaPlayer.OnTimedTextListener {
        public j() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener
        public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
            if (ijkTimedText == null) {
                NSTIJKPlayerVOD.this.f37547f0.setVisibility(8);
                return;
            }
            String strReplace = ijkTimedText.getText().replace("{\\b1}", "").replace("{\\b0}", "").replace("{\\i1}", "").replace("{\\i0}", "").replace("{\\c}", "");
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.f37560j1 = nSTIJKPlayerVOD.f37517P.getSharedPreferences("pref.using_sub_font_size", 0);
            try {
                NSTIJKPlayerVOD.this.f37547f0.setTextSize(2, Float.parseFloat(NSTIJKPlayerVOD.this.f37560j1.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0)));
            } catch (Exception unused) {
            }
            NSTIJKPlayerVOD.this.f37547f0.setVisibility(0);
            NSTIJKPlayerVOD.this.f37547f0.setText(strReplace);
        }
    }

    public class k extends AbstractC2312g {
        public k() {
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
            RelativeLayout relativeLayout = NSTIJKPlayerVOD.this.f37566l1;
            if (relativeLayout != null) {
                relativeLayout.setBackground(bitmapDrawable);
            }
        }
    }

    public class l implements a.InterfaceC0291a {
        public l() {
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void a(a.b bVar, int i9, int i10, int i11) {
            if (bVar.a() != NSTIJKPlayerVOD.this.f37521R) {
                Log.e(NSTIJKPlayerVOD.this.f37536a, "onSurfaceChanged: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerVOD.this.f37567m = i10;
            NSTIJKPlayerVOD.this.f37570n = i11;
            boolean z9 = false;
            boolean z10 = NSTIJKPlayerVOD.this.f37552h == 3;
            if (!NSTIJKPlayerVOD.this.f37521R.d() || (NSTIJKPlayerVOD.this.f37561k == i10 && NSTIJKPlayerVOD.this.f37564l == i11)) {
                z9 = true;
            }
            if (NSTIJKPlayerVOD.this.f37558j != null && z10 && z9) {
                if (NSTIJKPlayerVOD.this.f37591u != 0) {
                    NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                    nSTIJKPlayerVOD.seekTo(nSTIJKPlayerVOD.f37591u);
                }
                NSTIJKPlayerVOD.this.start();
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void b(a.b bVar, int i9, int i10) {
            if (bVar.a() != NSTIJKPlayerVOD.this.f37521R) {
                Log.e(NSTIJKPlayerVOD.this.f37536a, "onSurfaceCreated: unmatched render callback\n");
                return;
            }
            NSTIJKPlayerVOD.this.f37555i = bVar;
            if (NSTIJKPlayerVOD.this.f37558j == null) {
                NSTIJKPlayerVOD.this.R1();
            } else {
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                nSTIJKPlayerVOD.v1(nSTIJKPlayerVOD.f37558j, bVar);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.InterfaceC0291a
        public void c(a.b bVar) {
            if (bVar.a() != NSTIJKPlayerVOD.this.f37521R) {
                Log.e(NSTIJKPlayerVOD.this.f37536a, "onSurfaceDestroyed: unmatched render callback\n");
            } else {
                NSTIJKPlayerVOD.this.f37555i = null;
                NSTIJKPlayerVOD.this.U1();
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinearLayout f37630a;

        public m(LinearLayout linearLayout) {
            this.f37630a = linearLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37630a.setVisibility(8);
        }
    }

    public class n implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37632a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f37633c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n.this.f37633c.dismiss();
            }
        }

        public n(int i9, PopupWindow popupWindow) {
            this.f37632a = i9;
            this.f37633c = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.f37537a1 = nSTIJKPlayerVOD.f37533X0.edit();
            if (i9 == 111 || i9 == 11111111) {
                NSTIJKPlayerVOD.this.f37537a1.putInt("currentVideoTrack", -1);
                NSTIJKPlayerVOD.this.B1(this.f37632a);
            } else {
                NSTIJKPlayerVOD.this.f37537a1.putInt("currentVideoTrack", i9);
                NSTIJKPlayerVOD.this.X1(i9);
                int currentPosition = NSTIJKPlayerVOD.this.f37553h0.getCurrentPosition();
                if (currentPosition != 0) {
                    NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
                    nSTIJKPlayerVOD2.f37487D0 = nSTIJKPlayerVOD2.f37550g0.getSharedPreferences("currentSeekTime", 0);
                    NSTIJKPlayerVOD nSTIJKPlayerVOD3 = NSTIJKPlayerVOD.this;
                    nSTIJKPlayerVOD3.f37490E0 = nSTIJKPlayerVOD3.f37487D0.edit();
                    NSTIJKPlayerVOD.this.f37490E0.putString("currentSeekTime", String.valueOf(currentPosition));
                    NSTIJKPlayerVOD.this.f37490E0.apply();
                }
                NSTIJKPlayerVOD.this.R1();
                NSTIJKPlayerVOD.this.start();
                NSTIJKPlayerVOD.this.setCurrentPositionSeekbar(currentPosition);
                NSTIJKPlayerVOD.this.setProgress(true);
            }
            NSTIJKPlayerVOD.this.f37537a1.apply();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class o implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37636a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f37637c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f37637c.dismiss();
            }
        }

        public o(int i9, PopupWindow popupWindow) {
            this.f37636a = i9;
            this.f37637c = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.f37535Z0 = nSTIJKPlayerVOD.f37532W0.edit();
            if (i9 == 1111 || i9 == 1111111) {
                NSTIJKPlayerVOD.this.f37535Z0.putInt("currentAudioTrack", -1);
                NSTIJKPlayerVOD.this.B1(this.f37636a);
            } else {
                NSTIJKPlayerVOD.this.f37535Z0.putInt("currentAudioTrack", i9);
                int currentPosition = (int) NSTIJKPlayerVOD.this.f37558j.getCurrentPosition();
                NSTIJKPlayerVOD.this.X1(i9);
                NSTIJKPlayerVOD.this.f37558j.seekTo(Long.parseLong(String.valueOf(currentPosition)));
            }
            NSTIJKPlayerVOD.this.f37535Z0.apply();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class p implements RadioGroup.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f37640a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f37641c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.f37641c.dismiss();
            }
        }

        public p(int i9, PopupWindow popupWindow) {
            this.f37640a = i9;
            this.f37641c = popupWindow;
        }

        @Override // android.widget.RadioGroup.OnCheckedChangeListener
        public void onCheckedChanged(RadioGroup radioGroup, int i9) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.f37534Y0 = nSTIJKPlayerVOD.f37530V0.edit();
            if (i9 == 11111 || i9 == 111111) {
                NSTIJKPlayerVOD.this.f37534Y0.putInt("currentSubtitleTrack", -1);
                NSTIJKPlayerVOD.this.B1(this.f37640a);
            } else {
                NSTIJKPlayerVOD.this.f37534Y0.putInt("currentSubtitleTrack", i9);
                NSTIJKPlayerVOD.this.X1(i9);
            }
            NSTIJKPlayerVOD.this.f37534Y0.apply();
            new Handler().postDelayed(new a(), 500L);
        }
    }

    public class q implements DialogInterface.OnDismissListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NSTIJKPlayerVOD.this.f37553h0 != null) {
                NSTIJKPlayerVOD.this.f37553h0.I1();
            }
        }
    }

    public class r implements DialogInterface.OnShowListener {
        public r() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            Button button;
            Resources resources;
            int i9;
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.f37580q0 = nSTIJKPlayerVOD.f37577p0.e(-2);
            NSTIJKPlayerVOD.this.f37580q0.setTag("1");
            Button button2 = NSTIJKPlayerVOD.this.f37580q0;
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
            button2.setOnFocusChangeListener(nSTIJKPlayerVOD2.new A(nSTIJKPlayerVOD2.f37580q0));
            NSTIJKPlayerVOD.this.f37580q0.setTextColor(NSTIJKPlayerVOD.this.f37550g0.getResources().getColor(a7.c.f11849G));
            NSTIJKPlayerVOD.this.f37580q0.setTextSize(16.0f);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) NSTIJKPlayerVOD.this.f37580q0.getLayoutParams();
            marginLayoutParams.setMargins(0, 10, 50, 10);
            if (NSTIJKPlayerVOD.this.f37519Q.A().equals(AbstractC2237a.f44453K0)) {
                button = NSTIJKPlayerVOD.this.f37580q0;
                resources = NSTIJKPlayerVOD.this.f37550g0.getResources();
                i9 = a7.e.f12038o;
            } else {
                button = NSTIJKPlayerVOD.this.f37580q0;
                resources = NSTIJKPlayerVOD.this.f37550g0.getResources();
                i9 = a7.e.f12010h;
            }
            button.setBackground(resources.getDrawable(i9));
            marginLayoutParams.width = 240;
            marginLayoutParams.height = 135;
        }
    }

    public class s implements SeekBar.OnSeekBarChangeListener {
        public s() {
        }

        public final String a(long j9) {
            int i9 = (int) (j9 / 1000);
            int i10 = i9 % 60;
            int i11 = (i9 / 60) % 60;
            int i12 = i9 / 3600;
            return i12 > 0 ? String.format("%02d:%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11), Integer.valueOf(i10)) : String.format("%02d:%02d", Integer.valueOf(i11), Integer.valueOf(i10));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            if (z9 && NSTIJKPlayerVOD.this.f37558j != null) {
                NSTIJKPlayerVOD.this.f37574o0.b(a7.f.f12146G).a();
                int duration = (int) (((double) NSTIJKPlayerVOD.this.f37553h0.getDuration()) * ((((double) i9) * 1.0d) / 1000.0d));
                a(duration);
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                if (nSTIJKPlayerVOD.f37548f1) {
                    nSTIJKPlayerVOD.f37553h0.seekTo(duration);
                }
                TextView textView = NSTIJKPlayerVOD.this.f37478A0;
                StringBuilder sb = new StringBuilder();
                NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
                sb.append(nSTIJKPlayerVOD2.p2(nSTIJKPlayerVOD2.f37553h0.getCurrentPosition()));
                sb.append("/");
                NSTIJKPlayerVOD nSTIJKPlayerVOD3 = NSTIJKPlayerVOD.this;
                sb.append(nSTIJKPlayerVOD3.p2(nSTIJKPlayerVOD3.f37553h0.getDuration()));
                textView.setText(sb.toString());
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.f37545e1 = true;
            nSTIJKPlayerVOD.g2(DateTimeConstants.MILLIS_PER_HOUR);
            NSTIJKPlayerVOD.this.f37590t1.removeMessages(1);
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
            if (nSTIJKPlayerVOD2.f37548f1) {
                nSTIJKPlayerVOD2.f37556i0.setStreamMute(3, true);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            if (NSTIJKPlayerVOD.this.f37558j == null) {
                return;
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            if (!nSTIJKPlayerVOD.f37548f1) {
                nSTIJKPlayerVOD.f37553h0.seekTo((int) (((double) NSTIJKPlayerVOD.this.f37553h0.getDuration()) * ((((double) seekBar.getProgress()) * 1.0d) / 1000.0d)));
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD2.g2(nSTIJKPlayerVOD2.f37486D);
            NSTIJKPlayerVOD.this.f37590t1.removeMessages(1);
            NSTIJKPlayerVOD.this.f37556i0.setStreamMute(3, false);
            NSTIJKPlayerVOD nSTIJKPlayerVOD3 = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD3.f37545e1 = false;
            nSTIJKPlayerVOD3.f37590t1.sendEmptyMessageDelayed(1, 1000L);
        }
    }

    public class t implements View.OnTouchListener {
        public t() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent == null) {
                return false;
            }
            if (NSTIJKPlayerVOD.this.f37565l0.onTouchEvent(motionEvent)) {
                return true;
            }
            if ((motionEvent.getAction() & 255) != 1) {
                return false;
            }
            NSTIJKPlayerVOD.this.C1();
            return false;
        }
    }

    public class u extends Handler {
        public u(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                NSTIJKPlayerVOD.this.b2();
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
                if (nSTIJKPlayerVOD.f37545e1 || !nSTIJKPlayerVOD.f37477A) {
                    return;
                }
                NSTIJKPlayerVOD.this.f37590t1.sendMessageDelayed(NSTIJKPlayerVOD.this.f37590t1.obtainMessage(1), 300L);
                NSTIJKPlayerVOD.this.s2();
                return;
            }
            if (i9 == 2) {
                NSTIJKPlayerVOD.this.F1(false);
                return;
            }
            if (i9 == 3) {
                if (NSTIJKPlayerVOD.this.f37606z >= 0) {
                    NSTIJKPlayerVOD.this.f37553h0.seekTo((int) NSTIJKPlayerVOD.this.f37606z);
                    NSTIJKPlayerVOD.this.f37606z = -1L;
                    return;
                }
                return;
            }
            if (i9 != 4) {
                return;
            }
            NSTIJKPlayerVOD.this.f37574o0.b(a7.f.f12285U).a();
            NSTIJKPlayerVOD.this.f37574o0.b(a7.f.f12552v).a();
            NSTIJKPlayerVOD.this.f37574o0.b(a7.f.f12582y).a();
        }
    }

    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Activity activity;
            StringBuilder sb;
            Resources resources;
            int i9;
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVOD.this;
            nSTIJKPlayerVOD.f37501I++;
            nSTIJKPlayerVOD.G1();
            if (NSTIJKPlayerVOD.this.f37518P0.equals("dfo") || NSTIJKPlayerVOD.this.f37518P0.equals("devicedata")) {
                activity = NSTIJKPlayerVOD.this.f37550g0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerVOD.this.f37550g0.getResources();
                i9 = a7.j.f13207b0;
            } else {
                activity = NSTIJKPlayerVOD.this.f37550g0;
                sb = new StringBuilder();
                resources = NSTIJKPlayerVOD.this.f37550g0.getResources();
                i9 = a7.j.f13262g5;
            }
            sb.append(resources.getString(i9));
            sb.append(" (");
            sb.append(NSTIJKPlayerVOD.this.f37501I);
            sb.append("/");
            sb.append(NSTIJKPlayerVOD.this.f37504J);
            sb.append(")");
            m7.w.P0(activity, sb.toString());
            NSTIJKPlayerVOD.this.R1();
            NSTIJKPlayerVOD.this.start();
        }
    }

    public class w implements IMediaPlayer.OnVideoSizeChangedListener {
        public w() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i9, int i10, int i11, int i12) {
            NSTIJKPlayerVOD.this.f37561k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerVOD.this.f37564l = iMediaPlayer.getVideoHeight();
            NSTIJKPlayerVOD.this.f37523S = iMediaPlayer.getVideoSarNum();
            NSTIJKPlayerVOD.this.f37525T = iMediaPlayer.getVideoSarDen();
            if (NSTIJKPlayerVOD.this.f37561k == 0 || NSTIJKPlayerVOD.this.f37564l == 0) {
                return;
            }
            if (NSTIJKPlayerVOD.this.f37521R != null) {
                NSTIJKPlayerVOD.this.f37521R.c(NSTIJKPlayerVOD.this.f37561k, NSTIJKPlayerVOD.this.f37564l);
                NSTIJKPlayerVOD.this.f37521R.a(NSTIJKPlayerVOD.this.f37523S, NSTIJKPlayerVOD.this.f37525T);
            }
            NSTIJKPlayerVOD.this.requestLayout();
        }
    }

    public class x implements IMediaPlayer.OnPreparedListener {
        public x() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            NSTIJKPlayerVOD.this.f37529V = System.currentTimeMillis();
            NSTIJKPlayerVOD.this.f37549g = 2;
            if (NSTIJKPlayerVOD.this.f37579q != null) {
                NSTIJKPlayerVOD.this.f37579q.onPrepared(NSTIJKPlayerVOD.this.f37558j);
            }
            NSTIJKPlayerVOD.c0(NSTIJKPlayerVOD.this);
            NSTIJKPlayerVOD.this.f37561k = iMediaPlayer.getVideoWidth();
            NSTIJKPlayerVOD.this.f37564l = iMediaPlayer.getVideoHeight();
            int i9 = NSTIJKPlayerVOD.this.f37591u;
            if (i9 != 0) {
                NSTIJKPlayerVOD.this.seekTo(i9);
            }
            if (NSTIJKPlayerVOD.this.f37561k == 0 || NSTIJKPlayerVOD.this.f37564l == 0) {
                if (NSTIJKPlayerVOD.this.f37552h == 3) {
                    NSTIJKPlayerVOD.this.start();
                    return;
                }
                return;
            }
            if (NSTIJKPlayerVOD.this.f37521R != null) {
                NSTIJKPlayerVOD.this.f37521R.c(NSTIJKPlayerVOD.this.f37561k, NSTIJKPlayerVOD.this.f37564l);
                NSTIJKPlayerVOD.this.f37521R.a(NSTIJKPlayerVOD.this.f37523S, NSTIJKPlayerVOD.this.f37525T);
                if (!NSTIJKPlayerVOD.this.f37521R.d() || (NSTIJKPlayerVOD.this.f37567m == NSTIJKPlayerVOD.this.f37561k && NSTIJKPlayerVOD.this.f37570n == NSTIJKPlayerVOD.this.f37564l)) {
                    if (NSTIJKPlayerVOD.this.f37552h == 3) {
                        NSTIJKPlayerVOD.this.start();
                    } else {
                        if (NSTIJKPlayerVOD.this.isPlaying()) {
                            return;
                        }
                        if (i9 == 0 && NSTIJKPlayerVOD.this.getCurrentPosition() <= 0) {
                            return;
                        }
                    }
                    NSTIJKPlayerVOD.c0(NSTIJKPlayerVOD.this);
                }
            }
        }
    }

    public class y implements IMediaPlayer.OnCompletionListener {

        public class a extends AbstractC2312g {
            public a() {
            }

            @Override // o2.InterfaceC2315j
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public void b(Bitmap bitmap, n2.c cVar) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                RelativeLayout relativeLayout = NSTIJKPlayerVOD.this.f37566l1;
                if (relativeLayout != null) {
                    relativeLayout.setBackground(bitmapDrawable);
                }
            }
        }

        public y() {
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer r6) {
            /*
                Method dump skipped, instruction units count: 439
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.y.onCompletion(tv.danmaku.ijk.media.player.IMediaPlayer):void");
        }
    }

    public class z implements PopupWindow.OnDismissListener {
        public z() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NSTIJKPlayerVOD.this.f37578p1 != null && NSTIJKPlayerVOD.this.f37575o1 != null) {
                NSTIJKPlayerVOD.this.f37578p1.removeCallbacks(NSTIJKPlayerVOD.this.f37575o1);
            }
            NSTIJKPlayerVOD.this.f37584r1.performClick();
            NSTIJKPlayerVOD.this.I1();
        }
    }

    public NSTIJKPlayerVOD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37536a = "NSTIJKPlayerVOD";
        this.f37546f = 0;
        this.f37549g = 0;
        this.f37552h = 0;
        this.f37555i = null;
        this.f37558j = null;
        this.f37594v = true;
        this.f37597w = true;
        this.f37600x = true;
        this.f37603y = -1;
        this.f37606z = -1L;
        this.f37480B = true;
        this.f37483C = false;
        this.f37486D = 7000;
        this.f37495G = 0;
        this.f37501I = 0;
        this.f37504J = 5;
        this.f37507K = false;
        this.f37527U = 0L;
        this.f37529V = 0L;
        this.f37531W = 0L;
        this.f37544e0 = 0L;
        this.f37562k0 = -1.0f;
        Boolean bool = Boolean.FALSE;
        this.f37583r0 = bool;
        this.f37586s0 = bool;
        this.f37589t0 = bool;
        this.f37592u0 = bool;
        this.f37595v0 = bool;
        this.f37598w0 = bool;
        this.f37604y0 = false;
        this.f37607z0 = false;
        this.f37502I0 = false;
        this.f37514N0 = false;
        this.f37524S0 = false;
        this.f37526T0 = false;
        this.f37540c1 = false;
        this.f37542d1 = false;
        this.f37554h1 = false;
        this.f37572n1 = 0;
        this.f37587s1 = new s();
        this.f37590t1 = new u(Looper.getMainLooper());
        this.f37593u1 = new w();
        this.f37596v1 = new x();
        this.f37599w1 = new y();
        this.f37602x1 = new d();
        this.f37605y1 = new f();
        this.f37608z1 = new g();
        this.f37479A1 = new h();
        this.f37482B1 = new i();
        this.f37485C1 = new j();
        this.f37488D1 = new l();
        this.f37491E1 = 4;
        this.f37494F1 = f37476K1[0];
        this.f37497G1 = new ArrayList();
        this.f37500H1 = 0;
        this.f37503I1 = 0;
        this.f37506J1 = false;
        M1(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1() {
        this.f37574o0.b(a7.f.f12086A).a();
        this.f37574o0.b(a7.f.f12146G).a();
        h2(false);
        J1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H1() {
        Runnable runnable;
        Handler handler = this.f37578p1;
        if (handler != null && (runnable = this.f37575o1) != null) {
            handler.removeCallbacks(runnable);
        }
        PopupWindow popupWindow = this.f37581q1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        g2(this.f37486D);
    }

    public static /* synthetic */ int J0(NSTIJKPlayerVOD nSTIJKPlayerVOD, int i9) {
        int i10 = nSTIJKPlayerVOD.f37572n1 + i9;
        nSTIJKPlayerVOD.f37572n1 = i10;
        return i10;
    }

    private void K1() {
        boolean zP = this.f37519Q.p();
        this.f37506J1 = zP;
        if (zP) {
            AbstractServiceC2895a.b(getContext());
            this.f37558j = AbstractServiceC2895a.a();
        }
    }

    private void L1() {
        this.f37497G1.clear();
        if (this.f37519Q.s()) {
            this.f37497G1.add(1);
        }
        if (this.f37519Q.t()) {
            this.f37497G1.add(2);
        }
        if (this.f37519Q.r()) {
            this.f37497G1.add(0);
        }
        if (this.f37497G1.isEmpty()) {
            this.f37497G1.add(1);
        }
        int iIntValue = ((Integer) this.f37497G1.get(this.f37500H1)).intValue();
        this.f37503I1 = iIntValue;
        setRender(iIntValue);
    }

    private void M1(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f37517P = applicationContext;
        this.f37519Q = new C2858a(applicationContext);
        this.f37563k1 = new n7.l(this, this.f37517P);
        K1();
        L1();
        this.f37561k = 0;
        this.f37564l = 0;
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f37549g = 0;
        this.f37552h = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
        this.f37560j1 = sharedPreferences;
        String string = sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0);
        TextView textView = new TextView(context);
        this.f37547f0 = textView;
        try {
            textView.setTextSize(2, Float.parseFloat(string));
        } catch (Exception unused) {
        }
        this.f37547f0.setTextColor(context.getResources().getColor(a7.c.f11849G));
        this.f37547f0.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMargins(0, 0, 0, 40);
        addView(this.f37547f0, layoutParams);
    }

    private boolean O1() {
        int i9;
        return (this.f37558j == null || (i9 = this.f37549g) == -1 || i9 == 0 || i9 == 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S1() {
        H1();
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f37550g0.findViewById(a7.f.f12100B3);
        if (appCompatImageView != null) {
            appCompatImageView.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b2() {
        int currentPosition;
        if (this.f37545e1) {
            return 0;
        }
        if (this.f37540c1) {
            F1(true);
            this.f37540c1 = false;
            return 0;
        }
        if (this.f37553h0.getProgress()) {
            this.f37553h0.setProgress(false);
            currentPosition = this.f37553h0.getCurrentPositionSeekbar();
            this.f37553h0.seekTo(currentPosition);
        } else {
            currentPosition = this.f37553h0.getCurrentPosition();
        }
        int duration = this.f37553h0.getDuration();
        SeekBar seekBar = this.f37601x0;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((((long) currentPosition) * 1000) / ((long) duration)));
            }
            this.f37601x0.setSecondaryProgress(this.f37553h0.getBufferPercentage() * 10);
        }
        if (duration == 0) {
            this.f37478A0.setText("Live");
        } else {
            this.f37478A0.setText(p2(currentPosition) + "/" + p2(duration));
        }
        return currentPosition;
    }

    public static /* synthetic */ InterfaceC2938b c0(NSTIJKPlayerVOD nSTIJKPlayerVOD) {
        nSTIJKPlayerVOD.getClass();
        return null;
    }

    private void c2(Context context, ArrayList arrayList, int i9) {
        if (this.f37493F0.getRecentwatchmoviesCount(SharepreferenceDBHandler.getUserID(context)) >= 100) {
            new ArrayList();
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = this.f37493F0.getAllLiveStreasWithCategoryId("movie", SharepreferenceDBHandler.getUserID(context), "getOnedata");
            if (allLiveStreasWithCategoryId.isEmpty()) {
                this.f37493F0.deleteRecentwatch(Integer.parseInt(allLiveStreasWithCategoryId.get(0).getStreamId()), "movie");
            }
        }
        Z1(context, arrayList, i9);
    }

    private void getRunnable() {
        boolean[] zArr = {false};
        e eVar = new e();
        this.f37575o1 = eVar;
        if (zArr[0]) {
            return;
        }
        eVar.run();
    }

    private void j2(String str) {
        this.f37574o0.b(a7.f.Im).a();
        this.f37574o0.b(a7.f.f12146G).h();
        this.f37574o0.b(a7.f.f12186K).f(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l2(int r9) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.l2(int):void");
    }

    private int o2(int i9, int i10) {
        return this.f37493F0.isStreamAvailable(String.valueOf(i9), i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String p2(int i9) {
        int i10 = i9 / 1000;
        int i11 = i10 % 60;
        int i12 = (i10 / 60) % 60;
        int i13 = i10 / 3600;
        this.f37481B0.setLength(0);
        return (i13 > 0 ? this.f37484C0.format("%d:%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12), Integer.valueOf(i11)) : this.f37484C0.format("%02d:%02d", Integer.valueOf(i12), Integer.valueOf(i11))).toString();
    }

    private void r2() {
        View viewFindViewById = this.f37550g0.findViewById(a7.f.f12491p);
        this.f37571n0 = viewFindViewById;
        viewFindViewById.setClickable(true);
        this.f37571n0.setOnTouchListener(new t());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s2() {
        C c9;
        int i9;
        IMediaPlayer iMediaPlayer = this.f37558j;
        if (iMediaPlayer == null || !iMediaPlayer.isPlaying()) {
            this.f37574o0.b(a7.f.f12110C3).a();
            c9 = this.f37574o0;
            i9 = a7.f.f12120D3;
        } else {
            this.f37574o0.b(a7.f.f12120D3).a();
            c9 = this.f37574o0;
            i9 = a7.f.f12110C3;
        }
        c9.b(i9).h();
    }

    private void u1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1(IMediaPlayer iMediaPlayer, a.b bVar) {
        if (iMediaPlayer == null) {
            return;
        }
        if (bVar == null) {
            iMediaPlayer.setDisplay(null);
        } else {
            bVar.b(iMediaPlayer);
        }
    }

    private String w1(String str) {
        return TextUtils.isEmpty(str) ? "und" : str;
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
    public tv.danmaku.ijk.media.player.IMediaPlayer A1(int r10) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.A1(int):tv.danmaku.ijk.media.player.IMediaPlayer");
    }

    public void B1(int i9) {
        AbstractC2941e.b(this.f37558j, i9);
    }

    public final void C1() {
        this.f37603y = -1;
        this.f37562k0 = -1.0f;
        if (this.f37606z >= 0) {
            this.f37590t1.removeMessages(3);
            this.f37590t1.sendEmptyMessage(3);
        }
        this.f37590t1.removeMessages(4);
        this.f37590t1.sendEmptyMessageDelayed(4, 500L);
    }

    public void D1() {
        AbstractServiceC2895a.d(this.f37558j);
    }

    @Override // z7.n
    public void E0(String str) {
    }

    public void E1(Boolean bool) {
        this.f37498H = bool.booleanValue();
    }

    public void F1(boolean z9) {
        if (z9 || this.f37477A) {
            this.f37590t1.removeMessages(1);
            h2(false);
            this.f37574o0.b(a7.f.f12236P).a();
            this.f37574o0.b(a7.f.f12484o2).a();
            this.f37574o0.b(a7.f.f12592z).d();
            this.f37574o0.b(a7.f.S9).a();
            this.f37477A = false;
            J1();
        }
    }

    public void I1() {
        this.f37553h0.setSystemUiVisibility(4871);
    }

    public void J1() {
        this.f37574o0.b(a7.f.f12236P).a();
        this.f37574o0.b(a7.f.f12484o2).a();
        this.f37574o0.b(a7.f.S9).a();
        this.f37477A = false;
        this.f37489E.removeCallbacksAndMessages(null);
    }

    @Override // z7.n
    public void K(VodInfoCallback vodInfoCallback) {
        List<String> backdropPath = vodInfoCallback.getInfo().getBackdropPath();
        if (backdropPath == null || backdropPath.size() <= 0) {
            return;
        }
        try {
            O1.g.u(this.f37517P.getApplicationContext()).q(backdropPath.get(new Random().nextInt(backdropPath.size()))).I().m(new k());
        } catch (Exception unused) {
        }
    }

    public boolean N1() {
        return this.f37506J1;
    }

    public final void P1(float f9) {
        Activity activity = this.f37550g0;
        if (activity != null) {
            if (this.f37562k0 < 0.0f) {
                float f10 = activity.getWindow().getAttributes().screenBrightness;
                this.f37562k0 = f10;
                if (f10 <= 0.0f) {
                    this.f37562k0 = 0.5f;
                } else if (f10 < 0.01f) {
                    this.f37562k0 = 0.01f;
                }
            }
            Log.d(getClass().getSimpleName(), "brightness:" + this.f37562k0 + ",percent:" + f9);
            this.f37574o0.b(a7.f.f12285U).a();
            this.f37574o0.b(a7.f.f12552v).h();
            WindowManager.LayoutParams attributes = this.f37550g0.getWindow().getAttributes();
            float f11 = this.f37562k0 + f9;
            attributes.screenBrightness = f11;
            if (f11 > 1.0f) {
                attributes.screenBrightness = 1.0f;
            } else if (f11 < 0.01f) {
                attributes.screenBrightness = 0.01f;
            }
            this.f37574o0.b(a7.f.f12542u).f(((int) (attributes.screenBrightness * 100.0f)) + "%");
            this.f37550g0.getWindow().setAttributes(attributes);
        }
    }

    public final void Q1(float f9) {
        try {
            AudioManager audioManager = this.f37556i0;
            if (audioManager != null) {
                if (this.f37603y == -1) {
                    int streamVolume = audioManager.getStreamVolume(3);
                    this.f37603y = streamVolume;
                    if (streamVolume < 0) {
                        this.f37603y = 0;
                    }
                }
                F1(true);
                int i9 = this.f37559j0;
                int i10 = ((int) (f9 * i9)) + this.f37603y;
                if (i10 <= i9) {
                    i9 = i10 < 0 ? 0 : i10;
                }
                this.f37556i0.setStreamVolume(3, i9, 0);
                int i11 = (int) (((((double) i9) * 1.0d) / ((double) this.f37559j0)) * 100.0d);
                String str = i11 + "%";
                if (i11 == 0) {
                    str = "off";
                }
                this.f37574o0.b(a7.f.f12294V).c(i11 == 0 ? a7.e.f11926J0 : a7.e.f11930K0);
                this.f37574o0.b(a7.f.f12552v).a();
                this.f37574o0.b(a7.f.f12285U).h();
                this.f37574o0.b(a7.f.f12276T).f(str).h();
            }
        } catch (Exception unused) {
        }
    }

    public void R1() {
        IMediaPlayer.OnErrorListener onErrorListener;
        if (this.f37539c == null || this.f37555i == null) {
            return;
        }
        T1(false);
        try {
            ((AudioManager) this.f37517P.getSystemService("audio")).requestAudioFocus(null, 3, 1);
        } catch (Exception unused) {
        }
        try {
            this.f37558j = A1(this.f37519Q.x());
            getContext();
            this.f37558j.setOnPreparedListener(this.f37596v1);
            this.f37558j.setOnVideoSizeChangedListener(this.f37593u1);
            this.f37558j.setOnCompletionListener(this.f37599w1);
            this.f37558j.setOnErrorListener(this.f37608z1);
            this.f37558j.setOnInfoListener(this.f37605y1);
            this.f37558j.setOnBufferingUpdateListener(this.f37479A1);
            this.f37558j.setOnSeekCompleteListener(this.f37482B1);
            this.f37558j.setOnTimedTextListener(this.f37485C1);
            this.f37582r = 0;
            String scheme = this.f37539c.getScheme();
            if (Build.VERSION.SDK_INT >= 23 && this.f37519Q.F() && (TextUtils.isEmpty(scheme) || scheme.equalsIgnoreCase(TransferTable.COLUMN_FILE))) {
                this.f37558j.setDataSource(new C2937a(new File(this.f37539c.toString())));
            } else {
                this.f37558j.setDataSource(this.f37517P, this.f37539c, this.f37543e);
            }
            v1(this.f37558j, this.f37555i);
            this.f37558j.setAudioStreamType(3);
            this.f37558j.setScreenOnWhilePlaying(true);
            this.f37527U = System.currentTimeMillis();
            this.f37558j.prepareAsync();
            this.f37568m0 = this.f37550g0.getResources().getDisplayMetrics().widthPixels;
            AudioManager audioManager = (AudioManager) this.f37550g0.getSystemService("audio");
            this.f37556i0 = audioManager;
            this.f37559j0 = audioManager.getStreamMaxVolume(3);
            this.f37565l0 = new GestureDetector(this.f37550g0, new B());
            r2();
            SeekBar seekBar = this.f37601x0;
            if (seekBar != null) {
                seekBar.setOnSeekBarChangeListener(this.f37587s1);
                this.f37601x0.setMax(1000);
            }
            this.f37481B0 = new StringBuilder();
            this.f37484C0 = new Formatter(this.f37481B0, Locale.getDefault());
            this.f37549g = 1;
        } catch (IOException e9) {
            Log.w(this.f37536a, "Unable to open content: " + this.f37539c, e9);
            this.f37549g = -1;
            this.f37552h = -1;
            onErrorListener = this.f37608z1;
            onErrorListener.onError(this.f37558j, 1, 0);
        } catch (IllegalArgumentException e10) {
            Log.w(this.f37536a, "Unable to open content: " + this.f37539c, e10);
            this.f37549g = -1;
            this.f37552h = -1;
            onErrorListener = this.f37608z1;
            onErrorListener.onError(this.f37558j, 1, 0);
        } catch (NullPointerException e11) {
            Log.w(this.f37536a, "Unable to open content: " + this.f37539c, e11);
            this.f37549g = -1;
            this.f37552h = -1;
            onErrorListener = this.f37608z1;
            onErrorListener.onError(this.f37558j, 1, 0);
        } catch (Exception e12) {
            Log.w(this.f37536a, "Unable to open content: " + this.f37539c, e12);
            this.f37549g = -1;
            this.f37552h = -1;
            onErrorListener = this.f37608z1;
            onErrorListener.onError(this.f37558j, 1, 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void T1(boolean z9) {
        IMediaPlayer iMediaPlayer = this.f37558j;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.f37558j.release();
            this.f37558j = null;
            this.f37549g = 0;
            if (z9) {
                this.f37552h = 0;
            }
            ((AudioManager) this.f37517P.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    public void U1() {
        IMediaPlayer iMediaPlayer = this.f37558j;
        if (iMediaPlayer != null) {
            iMediaPlayer.setDisplay(null);
        }
    }

    public void V1(boolean z9) {
        this.f37540c1 = z9;
    }

    public void W1() {
        Handler handler = this.f37489E;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void X1(int i9) {
        AbstractC2941e.e(this.f37558j, i9);
    }

    public void Y1(Activity activity, NSTIJKPlayerVOD nSTIJKPlayerVOD, SeekBar seekBar, TextView textView) {
        this.f37550g0 = activity;
        this.f37553h0 = nSTIJKPlayerVOD;
        this.f37489E = new Handler();
        this.f37601x0 = seekBar;
        this.f37478A0 = textView;
        this.f37492F = new Handler();
        this.f37493F0 = new RecentWatchDBHandler(activity);
        this.f37496G0 = new LiveStreamDBHandler(activity);
        this.f37574o0 = new C(activity);
    }

    public void Z1(Context context, ArrayList arrayList, int i9) {
        String num = ((LiveStreamsDBModel) arrayList.get(i9)).getNum();
        String name = ((LiveStreamsDBModel) arrayList.get(i9)).getName();
        String streamType = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamType();
        String streamId = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamId();
        String streamIcon = ((LiveStreamsDBModel) arrayList.get(i9)).getStreamIcon();
        String epgChannelId = ((LiveStreamsDBModel) arrayList.get(i9)).getEpgChannelId();
        String added = ((LiveStreamsDBModel) arrayList.get(i9)).getAdded();
        String categoryId = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryId();
        String customSid = ((LiveStreamsDBModel) arrayList.get(i9)).getCustomSid();
        ((LiveStreamsDBModel) arrayList.get(i9)).getTvArchive();
        String directSource = ((LiveStreamsDBModel) arrayList.get(i9)).getDirectSource();
        String tvArchiveDuration = ((LiveStreamsDBModel) arrayList.get(i9)).getTvArchiveDuration();
        String typeName = ((LiveStreamsDBModel) arrayList.get(i9)).getTypeName();
        String categoryName = ((LiveStreamsDBModel) arrayList.get(i9)).getCategoryName();
        String seriesNo = ((LiveStreamsDBModel) arrayList.get(i9)).getSeriesNo();
        String live = ((LiveStreamsDBModel) arrayList.get(i9)).getLive();
        String contaiinerExtension = ((LiveStreamsDBModel) arrayList.get(i9)).getContaiinerExtension();
        String ratingFromTen = ((LiveStreamsDBModel) arrayList.get(i9)).getRatingFromTen();
        String ratingFromFive = ((LiveStreamsDBModel) arrayList.get(i9)).getRatingFromFive();
        PanelAvailableChannelsPojo panelAvailableChannelsPojo = new PanelAvailableChannelsPojo();
        panelAvailableChannelsPojo.setNum(Integer.valueOf(num));
        panelAvailableChannelsPojo.setName(name);
        panelAvailableChannelsPojo.setStreamType(streamType);
        panelAvailableChannelsPojo.setStreamId(streamId);
        panelAvailableChannelsPojo.setStreamIcon(streamIcon);
        panelAvailableChannelsPojo.setEpgChannelId(epgChannelId);
        panelAvailableChannelsPojo.setAdded(added);
        panelAvailableChannelsPojo.setCategoryId(categoryId);
        panelAvailableChannelsPojo.setCustomSid(customSid);
        panelAvailableChannelsPojo.setTvArchive(0);
        panelAvailableChannelsPojo.setDirectSource(directSource);
        panelAvailableChannelsPojo.setTvArchiveDuration(tvArchiveDuration);
        panelAvailableChannelsPojo.setTypeName(typeName);
        panelAvailableChannelsPojo.setCategoryName(categoryName);
        panelAvailableChannelsPojo.setSeriesNo(seriesNo);
        panelAvailableChannelsPojo.setLive(live);
        panelAvailableChannelsPojo.setContainerExtension(contaiinerExtension);
        panelAvailableChannelsPojo.setUserIdReferred(SharepreferenceDBHandler.getUserID(context));
        panelAvailableChannelsPojo.setMovieElapsedTime(0L);
        panelAvailableChannelsPojo.setMovieDuration(0L);
        panelAvailableChannelsPojo.setRatingFromTen(ratingFromTen);
        panelAvailableChannelsPojo.setRatingFromFive(ratingFromFive);
        this.f37493F0.addAllAvailableChannel(panelAvailableChannelsPojo);
    }

    @Override // z7.b
    public void a() {
    }

    public void a2() {
        int iO2;
        Context context = getContext();
        if (C2966a.f() == null || (iO2 = o2(C2966a.f().k(), SharepreferenceDBHandler.getUserID(context))) > 0 || iO2 != 0 || this.f37518P0.equals("dfo") || this.f37518P0.equals("devicedata")) {
            return;
        }
        c2(context, C2966a.f().c(), C2966a.f().d());
    }

    @Override // z7.b
    public void b() {
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f37594v;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f37597w;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f37600x;
    }

    @Override // z7.b
    public void d(String str) {
    }

    public void d2(String str, boolean z9, String str2, long j9, int i9, String str3, ArrayList arrayList, int i10, int i11, String str4, String str5) {
        this.f37518P0 = str5;
        f2(Uri.parse(str), z9, str2, j9, i9, str3, arrayList, i10, i11, str4);
    }

    public final void e2(Uri uri, Map map, boolean z9, String str, long j9, int i9, String str2, ArrayList arrayList, int i10, int i11, String str3) {
        this.f37539c = uri;
        this.f37541d = str;
        this.f37543e = map;
        this.f37591u = 0;
        this.f37498H = z9;
        this.f37520Q0 = str2;
        this.f37510L0 = j9;
        this.f37505J0 = i9;
        this.f37512M0 = i11;
        this.f37522R0 = arrayList;
        this.f37499H0 = new PlayerResumeDBHandler(this.f37550g0);
        this.f37493F0 = new RecentWatchDBHandler(this.f37550g0);
        this.f37551g1 = new SeriesRecentWatchDatabase(this.f37550g0);
        this.f37557i1 = new C2509z0(this.f37550g0);
        this.f37496G0 = new LiveStreamDBHandler(this.f37550g0);
        this.f37508K0 = SharepreferenceDBHandler.getUserID(this.f37550g0);
        this.f37495G = i10;
        this.f37516O0 = str3;
        n2();
        R1();
        requestLayout();
        invalidate();
    }

    public void f(Context context, String str) {
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a7.g.f12694P1, (ViewGroup) null);
        PopupWindow popupWindow = new PopupWindow(context);
        this.f37581q1 = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f37581q1.setWidth(-1);
        this.f37581q1.setHeight(-1);
        this.f37581q1.setFocusable(true);
        this.f37581q1.setOutsideTouchable(false);
        ((TextView) viewInflate.findViewById(a7.f.nj)).setText(str);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(a7.f.f12164H7);
        linearLayout.requestFocus();
        this.f37569m1 = (FabButton) viewInflate.findViewById(a7.f.f12169I2);
        this.f37584r1 = (Button) viewInflate.findViewById(a7.f.f12088A1);
        this.f37566l1 = (RelativeLayout) viewInflate.findViewById(a7.f.Ne);
        this.f37578p1 = new Handler();
        this.f37569m1.e(false);
        this.f37572n1 = 0;
        this.f37569m1.d(true);
        this.f37569m1.setProgress(this.f37572n1);
        getRunnable();
        this.f37581q1.setOnDismissListener(new z());
        this.f37584r1.setOnClickListener(new ViewOnClickListenerC1515a());
        this.f37569m1.setOnClickListener(new ViewOnClickListenerC1516b());
        linearLayout.setOnClickListener(new ViewOnClickListenerC1517c());
        this.f37581q1.showAtLocation(viewInflate, 1, 0, 0);
    }

    public void f2(Uri uri, boolean z9, String str, long j9, int i9, String str2, ArrayList arrayList, int i10, int i11, String str3) {
        e2(uri, null, z9, str, j9, i9, str2, arrayList, i10, i11, str3);
    }

    public void g2(int i9) {
        if (!this.f37477A) {
            this.f37574o0.b(a7.f.f12236P).h();
            this.f37574o0.b(a7.f.f12484o2).h();
            this.f37574o0.b(a7.f.S9).h();
            h2(true);
            this.f37477A = true;
        }
        s2();
        this.f37590t1.sendEmptyMessage(1);
        this.f37590t1.removeMessages(2);
        if (i9 != 0) {
            this.f37590t1.sendMessageDelayed(this.f37489E.obtainMessage(2), i9);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f37558j != null) {
            return this.f37582r;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (O1()) {
            return (int) this.f37558j.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPositionSeekbar() {
        return this.f37538b1;
    }

    public int getCurrentWindowIndex() {
        return this.f37495G;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (O1()) {
            return (int) this.f37558j.getDuration();
        }
        return -1;
    }

    public Boolean getFullScreenValue() {
        return Boolean.valueOf(this.f37498H);
    }

    public boolean getProgress() {
        return this.f37542d1;
    }

    public ITrackInfo[] getTrackInfo() {
        IMediaPlayer iMediaPlayer = this.f37558j;
        if (iMediaPlayer == null) {
            return null;
        }
        return iMediaPlayer.getTrackInfo();
    }

    public void h2(boolean z9) {
        this.f37574o0.b(a7.f.f12562w).g(z9 ? 0 : 8);
        this.f37574o0.b(a7.f.f12572x).g(z9 ? 0 : 8);
        this.f37574o0.b(a7.f.f12136F).g(z9 ? 0 : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i2() {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD.i2():void");
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        IMediaPlayer iMediaPlayer;
        return O1() && (iMediaPlayer = this.f37558j) != null && iMediaPlayer.isPlaying();
    }

    public void k2(RadioGroup radioGroup, RadioGroup radioGroup2, RadioGroup radioGroup3, PopupWindow popupWindow, TextView textView, TextView textView2, TextView textView3) {
        TextView textView4;
        int i9;
        int i10;
        IMediaPlayer iMediaPlayer = this.f37558j;
        if (iMediaPlayer == null) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        this.f37598w0 = bool;
        this.f37595v0 = bool;
        this.f37592u0 = bool;
        this.f37586s0 = bool;
        this.f37583r0 = bool;
        this.f37589t0 = bool;
        int iD = AbstractC2941e.d(iMediaPlayer, 1);
        int iD2 = AbstractC2941e.d(this.f37558j, 2);
        int iD3 = AbstractC2941e.d(this.f37558j, 3);
        ITrackInfo[] trackInfo = this.f37558j.getTrackInfo();
        if (trackInfo == null || trackInfo.length <= 0) {
            textView4 = textView3;
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
                ITrackInfo[] iTrackInfoArr = trackInfo;
                IMediaFormat format = iTrackInfo.getFormat();
                if (format != null && (format instanceof IjkMediaFormat)) {
                    i10 = length;
                    if (trackType == 1) {
                        Boolean bool2 = Boolean.TRUE;
                        this.f37592u0 = bool2;
                        if (!this.f37583r0.booleanValue()) {
                            this.f37583r0 = bool2;
                            RadioButton radioButton = new RadioButton(this.f37550g0);
                            radioButton.setText("Disable");
                            radioButton.setTextColor(getResources().getColor(a7.c.f11855f));
                            radioButton.setTextSize(18.0f);
                            radioButton.setId(11111111);
                            radioButton.setPadding(10, 10, 15, 10);
                            radioButton.setOnFocusChangeListener(new A(radioButton));
                            if (iD == -1) {
                                radioButton.setChecked(true);
                                radioGroup.setOnCheckedChangeListener(null);
                            }
                            radioButton.setTag("2");
                            radioGroup.addView(radioButton);
                        }
                        RadioButton radioButton2 = new RadioButton(this.f37550g0);
                        iTrackInfo.getInfoInline();
                        radioButton2.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        if (i13 == -1) {
                            radioButton2.setId(111);
                        } else {
                            radioButton2.setId(i13);
                        }
                        radioButton2.setTextColor(getResources().getColor(a7.c.f11855f));
                        radioButton2.setTextSize(18.0f);
                        radioButton2.setPadding(10, 10, 15, 10);
                        radioButton2.setOnFocusChangeListener(new A(radioButton2));
                        if (i13 == iD) {
                            radioButton2.setChecked(true);
                            radioGroup.setOnCheckedChangeListener(null);
                        }
                        radioButton2.setTag("2");
                        radioGroup.addView(radioButton2);
                        radioGroup.setOnCheckedChangeListener(new n(iD, popupWindow));
                        i11++;
                        i12 = i13;
                        trackInfo = iTrackInfoArr;
                    } else if (trackType == 2) {
                        Boolean bool3 = Boolean.TRUE;
                        this.f37595v0 = bool3;
                        if (!this.f37586s0.booleanValue()) {
                            this.f37586s0 = bool3;
                            RadioButton radioButton3 = new RadioButton(this.f37550g0);
                            radioButton3.setText("Disable");
                            radioButton3.setTextColor(getResources().getColor(a7.c.f11855f));
                            radioButton3.setTextSize(18.0f);
                            radioButton3.setId(1111111);
                            radioButton3.setPadding(10, 10, 15, 10);
                            radioButton3.setOnFocusChangeListener(new A(radioButton3));
                            if (iD2 == -1) {
                                radioButton3.setChecked(true);
                                radioGroup2.setOnCheckedChangeListener(null);
                            }
                            radioButton3.setTag("2");
                            radioGroup2.addView(radioButton3);
                        }
                        RadioButton radioButton4 = new RadioButton(this.f37550g0);
                        radioButton4.setText(i13 + ", " + iTrackInfo.getInfoInline() + ", " + w1(iTrackInfo.getLanguage()));
                        radioButton4.setTextColor(getResources().getColor(a7.c.f11855f));
                        radioButton4.setTextSize(18.0f);
                        if (i13 == -1) {
                            radioButton4.setId(1111);
                        } else {
                            radioButton4.setId(i13);
                        }
                        radioButton4.setPadding(10, 10, 15, 10);
                        radioButton4.setOnFocusChangeListener(new A(radioButton4));
                        if (i13 == iD2) {
                            radioButton4.setChecked(true);
                            radioGroup2.setOnCheckedChangeListener(null);
                        }
                        radioButton4.setTag("2");
                        radioGroup2.addView(radioButton4);
                        radioGroup2.setOnCheckedChangeListener(new o(iD2, popupWindow));
                    } else if (trackType == 3) {
                        Boolean bool4 = Boolean.TRUE;
                        this.f37598w0 = bool4;
                        if (!this.f37589t0.booleanValue()) {
                            this.f37589t0 = bool4;
                            RadioButton radioButton5 = new RadioButton(this.f37550g0);
                            radioButton5.setText("Disable");
                            radioButton5.setTextColor(getResources().getColor(a7.c.f11855f));
                            radioButton5.setTextSize(18.0f);
                            radioButton5.setId(111111);
                            radioButton5.setPadding(10, 10, 15, 10);
                            radioButton5.setOnFocusChangeListener(new A(radioButton5));
                            if (iD3 == -1) {
                                radioButton5.setChecked(true);
                                radioGroup3.setOnCheckedChangeListener(null);
                            }
                            radioButton5.setTag("2");
                            radioGroup3.addView(radioButton5);
                        }
                        RadioButton radioButton6 = new RadioButton(this.f37550g0);
                        radioButton6.setText(i13 + ", " + iTrackInfo.getInfoInline());
                        radioButton6.setTextColor(getResources().getColor(a7.c.f11855f));
                        radioButton6.setTextSize(18.0f);
                        if (i13 == -1) {
                            radioButton6.setId(11111);
                        } else {
                            radioButton6.setId(i13);
                        }
                        radioButton6.setPadding(10, 10, 15, 10);
                        radioButton6.setOnFocusChangeListener(new A(radioButton6));
                        if (i13 == iD3) {
                            radioButton6.setChecked(true);
                            radioGroup3.setOnCheckedChangeListener(null);
                        }
                        radioButton6.setTag("2");
                        radioGroup3.addView(radioButton6);
                        radioGroup3.setOnCheckedChangeListener(new p(iD3, popupWindow));
                    }
                } else {
                    i10 = length;
                }
                i11++;
                i12 = i13;
                trackInfo = iTrackInfoArr;
            }
            if (this.f37592u0.booleanValue()) {
                i9 = 0;
                textView.setVisibility(8);
            } else {
                i9 = 0;
                textView.setVisibility(0);
            }
            if (this.f37595v0.booleanValue()) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(i9);
            }
            textView4 = textView3;
            if (this.f37598w0.booleanValue()) {
                textView4.setVisibility(8);
                return;
            }
        }
        textView4.setVisibility(i9);
    }

    public void m2() {
        AbstractServiceC2895a.d(null);
    }

    public void n2() {
        IMediaPlayer iMediaPlayer = this.f37558j;
        if (iMediaPlayer != null) {
            iMediaPlayer.stop();
            this.f37558j.release();
            this.f37558j = null;
            this.f37549g = 0;
            this.f37552h = 0;
            ((AudioManager) this.f37517P.getSystemService("audio")).abandonAudioFocus(null);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 4 || i9 == 24 || i9 == 25 || i9 == 164 || i9 == 82 || i9 != 5) {
        }
        O1();
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        IMediaPlayer iMediaPlayer;
        if (O1() && (iMediaPlayer = this.f37558j) != null && iMediaPlayer.isPlaying()) {
            this.f37558j.pause();
            this.f37549g = 4;
        }
        this.f37552h = 4;
    }

    public int q2() {
        String string;
        Resources resources;
        int i9;
        this.f37491E1++;
        SharedPreferences sharedPreferences = this.f37550g0.getSharedPreferences("loginPrefs", 0);
        this.f37509L = sharedPreferences;
        this.f37511M = sharedPreferences.edit();
        int i10 = this.f37491E1;
        int[] iArr = f37476K1;
        int length = i10 % iArr.length;
        this.f37491E1 = length;
        this.f37494F1 = iArr[length];
        if (this.f37521R != null) {
            LinearLayout linearLayout = (LinearLayout) this.f37550g0.findViewById(a7.f.f12319X6);
            TextView textView = (TextView) this.f37550g0.findViewById(a7.f.f12471n);
            this.f37521R.setAspectRatio(this.f37494F1);
            int i11 = this.f37491E1;
            if (i11 == 0) {
                resources = getResources();
                i9 = a7.j.f13289j2;
            } else if (i11 == 1) {
                resources = getResources();
                i9 = a7.j.f13279i2;
            } else if (i11 == 2) {
                resources = getResources();
                i9 = a7.j.f13112Q8;
            } else if (i11 == 3) {
                resources = getResources();
                i9 = a7.j.f13290j3;
            } else {
                if (i11 == 4) {
                    string = "16:9";
                } else {
                    if (i11 == 5) {
                        string = "4:3";
                    }
                    this.f37511M.putInt("aspect_ratio", this.f37491E1);
                    this.f37511M.apply();
                    linearLayout.setVisibility(0);
                    this.f37492F.removeCallbacksAndMessages(null);
                    this.f37492F.postDelayed(new m(linearLayout), 3000L);
                }
                textView.setText(string);
                this.f37511M.putInt("aspect_ratio", this.f37491E1);
                this.f37511M.apply();
                linearLayout.setVisibility(0);
                this.f37492F.removeCallbacksAndMessages(null);
                this.f37492F.postDelayed(new m(linearLayout), 3000L);
            }
            string = resources.getString(i9);
            textView.setText(string);
            this.f37511M.putInt("aspect_ratio", this.f37491E1);
            this.f37511M.apply();
            linearLayout.setVisibility(0);
            this.f37492F.removeCallbacksAndMessages(null);
            this.f37492F.postDelayed(new m(linearLayout), 3000L);
        }
        return this.f37494F1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (O1()) {
            this.f37531W = System.currentTimeMillis();
            this.f37558j.seekTo(i9);
            i9 = 0;
        }
        this.f37591u = i9;
    }

    public void setCurrentPositionSeekbar(int i9) {
        this.f37538b1 = i9;
    }

    public void setCurrentWindowIndex(int i9) {
        this.f37495G = i9;
    }

    public void setHudView(TableLayout tableLayout) {
    }

    public void setListData(String str) {
        f(this.f37550g0, str);
    }

    public void setMediaController(InterfaceC2938b interfaceC2938b) {
        u1();
    }

    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.f37576p = onCompletionListener;
    }

    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.f37585s = onErrorListener;
    }

    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.f37588t = onInfoListener;
    }

    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.f37579q = onPreparedListener;
    }

    public void setProgress(boolean z9) {
        this.f37542d1 = z9;
    }

    public void setRender(int i9) {
        a bVar;
        if (i9 == 0) {
            bVar = null;
        } else if (i9 == 1) {
            bVar = new b(getContext());
        } else {
            if (i9 != 2) {
                Log.e(this.f37536a, String.format(Locale.getDefault(), "invalid render %d\n", Integer.valueOf(i9)));
                return;
            }
            c cVar = new c(getContext());
            bVar = cVar;
            if (this.f37558j != null) {
                cVar.getSurfaceHolder().b(this.f37558j);
                cVar.c(this.f37558j.getVideoWidth(), this.f37558j.getVideoHeight());
                cVar.a(this.f37558j.getVideoSarNum(), this.f37558j.getVideoSarDen());
                cVar.setAspectRatio(this.f37494F1);
                bVar = cVar;
            }
        }
        setRenderView(bVar);
    }

    public void setRenderView(a aVar) {
        int i9;
        int i10;
        if (this.f37521R != null) {
            IMediaPlayer iMediaPlayer = this.f37558j;
            if (iMediaPlayer != null) {
                iMediaPlayer.setDisplay(null);
            }
            View view = this.f37521R.getView();
            this.f37521R.b(this.f37488D1);
            this.f37521R = null;
            removeView(view);
        }
        if (aVar == null) {
            return;
        }
        this.f37521R = aVar;
        SharedPreferences sharedPreferences = this.f37517P.getSharedPreferences("loginPrefs", 0);
        this.f37509L = sharedPreferences;
        int i11 = sharedPreferences.getInt("aspect_ratio", 4);
        this.f37491E1 = i11;
        aVar.setAspectRatio(i11);
        int i12 = this.f37561k;
        if (i12 > 0 && (i10 = this.f37564l) > 0) {
            aVar.c(i12, i10);
        }
        int i13 = this.f37523S;
        if (i13 > 0 && (i9 = this.f37525T) > 0) {
            aVar.a(i13, i9);
        }
        View view2 = this.f37521R.getView();
        view2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        addView(view2);
        this.f37521R.e(this.f37488D1);
        this.f37521R.setVideoRotation(this.f37573o);
    }

    public void setTitle(CharSequence charSequence) {
        this.f37574o0.b(a7.f.f12226O).f(charSequence);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        if (O1()) {
            this.f37558j.start();
            this.f37549g = 3;
        }
        this.f37552h = 3;
    }

    public final String x1(int i9, int i10, int i11, int i12) {
        StringBuilder sb = new StringBuilder();
        sb.append(i9);
        sb.append(" x ");
        sb.append(i10);
        if (i11 > 1 || i12 > 1) {
            sb.append("[");
            sb.append(i11);
            sb.append(":");
            sb.append(i12);
            sb.append("]");
        }
        return sb.toString();
    }

    public final String y1(long j9) {
        long j10 = j9 / 1000;
        long j11 = j10 / 3600;
        long j12 = (j10 % 3600) / 60;
        long j13 = j10 % 60;
        return j9 <= 0 ? "--:--" : j11 >= 100 ? String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)) : j11 > 0 ? String.format(Locale.US, "%02d:%02d:%02d", Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)) : String.format(Locale.US, "%02d:%02d", Long.valueOf(j12), Long.valueOf(j13));
    }

    public final String z1(int i9) {
        return getContext().getString(i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? a7.j.f13266h : a7.j.f13236e : a7.j.f13246f : a7.j.f13256g : a7.j.f13226d : a7.j.f13276i);
    }
}
