package com.nst.iptvsmarterstvbox.view.ijkplayer.activities;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatImageView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.PlayerSelectedSinglton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerVOD;
import d4.k0;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m7.AbstractC2237a;
import m7.w;
import p7.C2509z0;
import t2.C2766a;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import u7.C2858a;
import w7.AbstractC2941e;
import w7.C2939c;
import x7.C2966a;
import y7.AbstractC2992a;

/* JADX INFO: loaded from: classes4.dex */
public class NSTIJKPlayerVODActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static String f36072j1 = null;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static boolean f36073k1 = true;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static boolean f36074l1 = true;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static String f36075m1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public DateFormat f36076A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public LinearLayout f36077A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LiveStreamDBHandler f36078B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public TextView f36079B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f36080C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public SharedPreferences f36081C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public SharedPreferences.Editor f36083D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public SharedPreferences f36084E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f36086F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public String f36087F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences f36088G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public String f36089G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences f36090H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public RecentWatchDBHandler f36091H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f36092I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public String f36093I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences f36094J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public ImageView f36095J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public SharedPreferences f36096K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public TextView f36097K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences f36098L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public Button f36099L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SharedPreferences f36100M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public Button f36101M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f36102N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public androidx.appcompat.app.a f36103N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public AppCompatImageView f36104O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public AppCompatImageView f36106P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public NSTIJKPlayerVOD f36107P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList f36108Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public SharedPreferences f36109Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public ArrayList f36110R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public Button f36111R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public Spinner f36113S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public SharedPreferences f36115T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public RelativeLayout f36116U;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public SharedPreferences.Editor f36117U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f36118V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public RelativeLayout f36119V0;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public SharedPreferences.Editor f36120W;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public List f36121W0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public SharedPreferences.Editor f36122X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f36124Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f36126Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2766a f36131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f36133e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public TextView f36134e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public SeriesRecentWatchDatabase f36135e1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f36136f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public TextView f36137f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextView f36140g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public C2858a f36141g1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f36142h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f36143h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f36145i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Handler f36146i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public C2509z0 f36147i1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f36148j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Handler f36149j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f36150k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public PopupWindow f36151k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f36152l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public SharedPreferences.Editor f36153l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f36154m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public SharedPreferences.Editor f36155m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f36156n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public SharedPreferences.Editor f36157n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f36158o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f36159o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f36160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f36162q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f36164r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SimpleDateFormat f36166s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public SharedPreferences.Editor f36167s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f36168t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public String f36169t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f36170u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f36172v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public View f36173v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SeekBar f36174w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public View f36175w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Date f36176x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public Handler f36177x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f36178y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public Handler f36179y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ProgressBar f36180z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f36139g = false;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f36082D = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f36112S = false;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f36114T = false;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f36161p0 = "";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f36163q0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f36165r0 = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f36171u0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f36181z0 = 0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f36085E0 = -1;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public Boolean f36105O0 = Boolean.TRUE;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public String f36123X0 = "";

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public String f36125Y0 = "";

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public String f36127Z0 = "";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public String f36128a1 = "";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public String f36129b1 = "";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public String f36130c1 = "";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f36132d1 = 0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f36138f1 = 4;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public String f36144h1 = "";

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            NSTIJKPlayerVODActivity.this.b2();
        }
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            String string = NSTIJKPlayerVODActivity.this.f36113S0.getItemAtPosition(i9).toString();
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
            nSTIJKPlayerVODActivity.f36115T0 = nSTIJKPlayerVODActivity.getSharedPreferences("pref.using_sub_font_size", 0);
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity2 = NSTIJKPlayerVODActivity.this;
            nSTIJKPlayerVODActivity2.f36117U0 = nSTIJKPlayerVODActivity2.f36115T0.edit();
            if (NSTIJKPlayerVODActivity.this.f36117U0 != null) {
                NSTIJKPlayerVODActivity.this.f36117U0.putString("pref.using_sub_font_size", string);
                NSTIJKPlayerVODActivity.this.f36117U0.apply();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NSTIJKPlayerVODActivity.this.f36107P0 != null) {
                NSTIJKPlayerVODActivity.this.f36107P0.I1();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVODActivity.this.f36103N0.setCancelable(true);
            NSTIJKPlayerVODActivity.this.onBackPressed();
            NSTIJKPlayerVODActivity.this.onBackPressed();
            NSTIJKPlayerVODActivity.this.f36103N0.dismiss();
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f36187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f36188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ NSTIJKPlayerVODActivity f36189e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f36190f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f36191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f36192h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f36193i;

        public e(ArrayList arrayList, int i9, String str, NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i10, String str2, String str3, int i11) {
            this.f36186a = arrayList;
            this.f36187c = i9;
            this.f36188d = str;
            this.f36189e = nSTIJKPlayerVODActivity;
            this.f36190f = i10;
            this.f36191g = str2;
            this.f36192h = str3;
            this.f36193i = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String name = ((LiveStreamsDBModel) this.f36186a.get(this.f36187c)).getName();
            new LiveStreamsDBModel();
            ArrayList arrayListZ1 = NSTIJKPlayerVODActivity.this.f36087F0.equals("m3u") ? NSTIJKPlayerVODActivity.this.Z1(String.valueOf(Uri.parse(this.f36188d)), SharepreferenceDBHandler.getUserID(this.f36189e)) : NSTIJKPlayerVODActivity.this.Y1(this.f36190f, SharepreferenceDBHandler.getUserID(this.f36189e));
            long movieElapsedTime = 0;
            if (arrayListZ1 != null) {
                try {
                    if (arrayListZ1.size() > 0) {
                        movieElapsedTime = ((LiveStreamsDBModel) arrayListZ1.get(0)).getMovieElapsedTime();
                    }
                } catch (Exception unused) {
                }
            }
            long j9 = movieElapsedTime;
            if (NSTIJKPlayerVODActivity.this.f36107P0 != null && NSTIJKPlayerVODActivity.this.f36105O0.booleanValue()) {
                NSTIJKPlayerVODActivity.this.o2();
                String strValueOf = String.valueOf(Uri.parse(NSTIJKPlayerVODActivity.this.f36136f + this.f36190f + InstructionFileId.DOT + this.f36191g));
                NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.f36107P0;
                NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
                nSTIJKPlayerVOD.d2(strValueOf, nSTIJKPlayerVODActivity.f36112S, name, 0L, this.f36190f, this.f36192h, nSTIJKPlayerVODActivity.f36110R, this.f36187c, this.f36193i, NSTIJKPlayerVODActivity.this.f36087F0, "nst");
                C2966a.f().G(this.f36190f);
                C2966a.f().t(this.f36186a);
                C2966a.f().w(this.f36187c);
                NSTIJKPlayerVODActivity.this.f36107P0.setCurrentPositionSeekbar((int) j9);
                NSTIJKPlayerVODActivity.this.f36107P0.setProgress(true);
                if (NSTIJKPlayerVODActivity.this.f36107P0 != null) {
                    NSTIJKPlayerVODActivity.this.f36107P0.f37501I = 0;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37507K = false;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37524S0 = true;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37607z0 = false;
                    NSTIJKPlayerVODActivity.this.f36107P0.start();
                }
            }
            NSTIJKPlayerVODActivity.this.f36103N0.dismiss();
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36195a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f36196c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f36197d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f36198e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f36199f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f36200g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f36201h;

        public f(int i9, String str, String str2, String str3, int i10, int i11, ArrayList arrayList) {
            this.f36195a = i9;
            this.f36196c = str;
            this.f36197d = str2;
            this.f36198e = str3;
            this.f36199f = i10;
            this.f36200g = i11;
            this.f36201h = arrayList;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NSTIJKPlayerVODActivity.this.o2();
            String strValueOf = String.valueOf(Uri.parse(NSTIJKPlayerVODActivity.this.f36136f + this.f36195a + InstructionFileId.DOT + this.f36196c));
            NSTIJKPlayerVOD nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.f36107P0;
            NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
            nSTIJKPlayerVOD.d2(strValueOf, nSTIJKPlayerVODActivity.f36112S, this.f36197d, 0L, this.f36195a, this.f36198e, nSTIJKPlayerVODActivity.f36110R, this.f36199f, this.f36200g, NSTIJKPlayerVODActivity.this.f36087F0, "nst");
            if (NSTIJKPlayerVODActivity.this.f36107P0 != null) {
                C2966a.f().G(this.f36195a);
                C2966a.f().t(this.f36201h);
                C2966a.f().w(this.f36199f);
                if (NSTIJKPlayerVODActivity.this.f36107P0 != null) {
                    NSTIJKPlayerVODActivity.this.f36107P0.f37514N0 = true;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37502I0 = true;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37510L0 = 0L;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37524S0 = true;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37607z0 = false;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37501I = 0;
                    NSTIJKPlayerVODActivity.this.f36107P0.f37507K = false;
                    NSTIJKPlayerVODActivity.this.f36107P0.start();
                }
            }
            NSTIJKPlayerVODActivity.this.f36103N0.dismiss();
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVODActivity.this.c2();
            if (AbstractC2237a.f44434B.booleanValue()) {
                NSTIJKPlayerVODActivity.this.findViewById(a7.f.Sm).setVisibility(0);
            }
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36204a;

        public h(int i9) {
            this.f36204a = i9;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity.h.run():void");
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f36206a;

        public i(int i9) {
            this.f36206a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strValueOf;
            NSTIJKPlayerVOD nSTIJKPlayerVOD;
            boolean z9;
            String str;
            int i9;
            String str2;
            ArrayList arrayList;
            int i10;
            int i11;
            String str3;
            String str4;
            long j9;
            NSTIJKPlayerVODActivity.this.o2();
            if (!NSTIJKPlayerVODActivity.this.f36087F0.equals("m3u") || NSTIJKPlayerVODActivity.this.f36123X0.equals("recording")) {
                if (NSTIJKPlayerVODActivity.this.f36123X0.equals("recording")) {
                    nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.f36107P0;
                    NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity = NSTIJKPlayerVODActivity.this;
                    strValueOf = nSTIJKPlayerVODActivity.f36136f;
                    z9 = nSTIJKPlayerVODActivity.f36112S;
                    str = nSTIJKPlayerVODActivity.f36127Z0;
                    str3 = nSTIJKPlayerVODActivity.f36087F0;
                    str4 = "nst";
                    j9 = 0;
                    i9 = 0;
                    str2 = "";
                    arrayList = null;
                    i10 = 0;
                    i11 = 0;
                } else {
                    strValueOf = String.valueOf(Uri.parse(NSTIJKPlayerVODActivity.this.f36136f + NSTIJKPlayerVODActivity.this.f36132d1 + InstructionFileId.DOT + NSTIJKPlayerVODActivity.this.f36130c1));
                    nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.f36107P0;
                    NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity2 = NSTIJKPlayerVODActivity.this;
                    z9 = nSTIJKPlayerVODActivity2.f36112S;
                    str = nSTIJKPlayerVODActivity2.f36127Z0;
                    i9 = nSTIJKPlayerVODActivity2.f36132d1;
                    str2 = nSTIJKPlayerVODActivity2.f36129b1;
                    arrayList = nSTIJKPlayerVODActivity2.f36110R;
                    i10 = this.f36206a;
                    i11 = NSTIJKPlayerVODActivity.this.f36171u0;
                    str3 = NSTIJKPlayerVODActivity.this.f36087F0;
                    str4 = "nst";
                    j9 = 0;
                }
                nSTIJKPlayerVOD.d2(strValueOf, z9, str, j9, i9, str2, arrayList, i10, i11, str3, str4);
            } else {
                NSTIJKPlayerVOD nSTIJKPlayerVOD2 = NSTIJKPlayerVODActivity.this.f36107P0;
                String str5 = NSTIJKPlayerVODActivity.this.f36089G0;
                NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity3 = NSTIJKPlayerVODActivity.this;
                nSTIJKPlayerVOD2.d2(str5, nSTIJKPlayerVODActivity3.f36112S, nSTIJKPlayerVODActivity3.f36127Z0, 0L, 0, "", null, this.f36206a, 0, nSTIJKPlayerVODActivity3.f36087F0, "nst");
                C2966a.f().r("m3u");
            }
            NSTIJKPlayerVODActivity.this.f36107P0.f37501I = 0;
            NSTIJKPlayerVODActivity.this.f36107P0.f37507K = false;
            NSTIJKPlayerVODActivity.this.f36107P0.f37524S0 = false;
            NSTIJKPlayerVODActivity.this.f36107P0.setProgress(false);
            NSTIJKPlayerVODActivity.this.f36107P0.start();
            if (NSTIJKPlayerVODActivity.this.f36123X0.equals("movies")) {
                C2966a.f().G(w.q0(((LiveStreamsDBModel) NSTIJKPlayerVODActivity.this.f36108Q.get(this.f36206a)).getStreamId()));
                C2966a.f().t(NSTIJKPlayerVODActivity.this.f36108Q);
            } else if (NSTIJKPlayerVODActivity.this.f36123X0.equals("series")) {
                C2966a.f().x(NSTIJKPlayerVODActivity.this.f36144h1);
                EpisodesUsingSinglton.getInstance().setEpisodeList(NSTIJKPlayerVODActivity.this.f36121W0);
                C2966a.f().G(w.q0(((GetEpisdoeDetailsCallback) NSTIJKPlayerVODActivity.this.f36121W0.get(this.f36206a)).getId()));
                C2966a.f().v(NSTIJKPlayerVODActivity.this.f36121W0);
            }
            C2966a.f().w(this.f36206a);
            NSTIJKPlayerVODActivity.this.f36107P0.setProgress(false);
        }
    }

    public class j implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerVODActivity.this.f36181z0 = 0;
                NSTIJKPlayerVODActivity.this.f36077A0.setVisibility(8);
            }
        }

        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVODActivity.this.f36107P0.seekTo(NSTIJKPlayerVODActivity.this.f36107P0.getCurrentPosition() + NSTIJKPlayerVODActivity.this.f36181z0);
            NSTIJKPlayerVODActivity.this.f36177x0.removeCallbacksAndMessages(null);
            NSTIJKPlayerVODActivity.this.f36177x0.postDelayed(new a(), 3000L);
        }
    }

    public class k implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                NSTIJKPlayerVODActivity.this.f36181z0 = 0;
                NSTIJKPlayerVODActivity.this.f36077A0.setVisibility(8);
            }
        }

        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NSTIJKPlayerVOD nSTIJKPlayerVOD;
            int currentPosition;
            if (NSTIJKPlayerVODActivity.this.f36107P0.getCurrentPosition() + NSTIJKPlayerVODActivity.this.f36181z0 > 0) {
                nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.f36107P0;
                currentPosition = NSTIJKPlayerVODActivity.this.f36107P0.getCurrentPosition() + NSTIJKPlayerVODActivity.this.f36181z0;
            } else {
                nSTIJKPlayerVOD = NSTIJKPlayerVODActivity.this.f36107P0;
                currentPosition = 0;
            }
            nSTIJKPlayerVOD.seekTo(currentPosition);
            NSTIJKPlayerVODActivity.this.f36177x0.removeCallbacksAndMessages(null);
            NSTIJKPlayerVODActivity.this.f36177x0.postDelayed(new a(), 3000L);
        }
    }

    public class l implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f36212a;

        public l(View view) {
            this.f36212a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36212a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36212a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f36212a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            float f10;
            if (!z9) {
                if (z9) {
                    return;
                }
                if (this.f36212a.getTag().equals("15")) {
                    f10 = z9 ? 1.04f : 1.0f;
                    b(f10);
                    c(f10);
                } else {
                    f9 = z9 ? 1.02f : 1.0f;
                    b(f9);
                    c(f9);
                }
                a(z9);
                View view2 = this.f36212a;
                if (view2 != null && view2.getTag() != null && this.f36212a.getTag().equals("1") && NSTIJKPlayerVODActivity.this.f36111R0 != null) {
                    NSTIJKPlayerVODActivity.this.f36111R0.setBackgroundResource(a7.e.f12038o);
                }
                View view3 = this.f36212a;
                if (view3 != null && view3.getTag() != null && this.f36212a.getTag().equals("9")) {
                    NSTIJKPlayerVODActivity.this.f36099L0.setBackgroundResource(a7.e.f12038o);
                }
                View view4 = this.f36212a;
                if (view4 != null && view4.getTag() != null && this.f36212a.getTag().equals("8")) {
                    NSTIJKPlayerVODActivity.this.f36101M0.setBackgroundResource(a7.e.f12038o);
                }
                View view5 = this.f36212a;
                if (view5 == null || view5.getTag() == null || !this.f36212a.getTag().equals("15")) {
                    return;
                }
                NSTIJKPlayerVODActivity.this.f36095J0.setImageDrawable(NSTIJKPlayerVODActivity.this.getResources().getDrawable(a7.e.f11894B0));
                return;
            }
            Log.e("id is", "" + this.f36212a.getTag());
            View view6 = this.f36212a;
            if (view6 != null && view6.getTag() != null && this.f36212a.getTag().equals("2")) {
                view.setBackground(NSTIJKPlayerVODActivity.this.getResources().getDrawable(a7.e.f11923I1));
                return;
            }
            View view7 = this.f36212a;
            if (view7 == null || !view7.getTag().equals("15")) {
                f9 = z9 ? 1.02f : 1.0f;
                b(f9);
                c(f9);
            } else {
                f10 = z9 ? 1.04f : 1.0f;
                b(f10);
                c(f10);
            }
            View view8 = this.f36212a;
            if (view8 != null && view8.getTag() != null && this.f36212a.getTag().equals("1") && NSTIJKPlayerVODActivity.this.f36111R0 != null) {
                NSTIJKPlayerVODActivity.this.f36111R0.setBackgroundResource(a7.e.f12010h);
            }
            View view9 = this.f36212a;
            if (view9 != null && view9.getTag() != null && this.f36212a.getTag().equals("9")) {
                NSTIJKPlayerVODActivity.this.f36099L0.setBackgroundResource(a7.e.f12010h);
            }
            View view10 = this.f36212a;
            if (view10 != null && view10.getTag() != null && this.f36212a.getTag().equals("8")) {
                NSTIJKPlayerVODActivity.this.f36101M0.setBackgroundResource(a7.e.f12024k1);
            }
            View view11 = this.f36212a;
            if (view11 == null || view11.getTag() == null || !this.f36212a.getTag().equals("15")) {
                return;
            }
            NSTIJKPlayerVODActivity.this.f36095J0.setImageDrawable(NSTIJKPlayerVODActivity.this.getResources().getDrawable(a7.e.f11898C0));
            NSTIJKPlayerVODActivity.this.f36099L0.setBackgroundResource(a7.e.f12038o);
            NSTIJKPlayerVODActivity.this.f36101M0.setBackgroundResource(a7.e.f12038o);
        }
    }

    public static long T1(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String V1(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList Y1(int i9, int i10) {
        return this.f36091H0.getStreamStatus(String.valueOf(i9), i10);
    }

    public static String a2(String str) {
        Matcher matcher = Pattern.compile("(?:youtube(?:-nocookie)?\\.com\\/(?:[^\\/\\n\\s]+\\/\\S+\\/|(?:v|e(?:mbed)?)\\/|\\S*?[?&]v=)|youtu\\.be\\/)([a-zA-Z0-9_-]{11})", 2).matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2() {
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.setSystemUiVisibility(4871);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0151, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x015e, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x016b, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x014d, code lost:
    
        r18 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0273 A[PHI: r22
      0x0273: PHI (r22v4 java.lang.String) = 
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v3 java.lang.String)
      (r22v5 java.lang.String)
     binds: [B:70:0x0297, B:72:0x029d, B:74:0x02a5, B:76:0x02af, B:67:0x0292, B:57:0x0271] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014f A[PHI: r18
      0x014f: PHI (r18v6 java.lang.String) = (r18v1 java.lang.String), (r18v2 java.lang.String), (r18v3 java.lang.String), (r18v7 java.lang.String) binds: [B:19:0x0173, B:15:0x0166, B:11:0x0159, B:8:0x014d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d2() {
        /*
            Method dump skipped, instruction units count: 2258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity.d2():void");
    }

    private void f2() {
        int iD;
        iD = C2966a.f().d();
        String str = this.f36123X0;
        str.hashCode();
        switch (str) {
            case "movies":
                if (iD == this.f36108Q.size() - 1) {
                    C2966a.f().w(0);
                    return;
                }
                break;
            case "series":
                if (iD == this.f36121W0.size() - 1) {
                    C2966a.f().w(0);
                    return;
                }
                break;
            case "recording":
                if (iD == this.f36080C.size() - 1) {
                    C2966a.f().w(0);
                    return;
                }
                break;
        }
        C2966a.f().w(iD + 1);
    }

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private void i2(ArrayList arrayList, int i9) {
        boolean z9;
        ?? r13;
        String strValueOf;
        NSTIJKPlayerVOD nSTIJKPlayerVOD;
        boolean z10;
        String str;
        long j9;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        String str2;
        String str3;
        String str4;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        int iW1 = W1(arrayList, i9);
        String name = ((LiveStreamsDBModel) arrayList.get(iW1)).getName();
        String num = ((LiveStreamsDBModel) arrayList.get(iW1)).getNum();
        String strS0 = w.S0(AbstractC2992a.a() + AbstractC2992a.b());
        String streamType = ((LiveStreamsDBModel) arrayList.get(iW1)).getStreamType();
        int iQ0 = w.q0(((LiveStreamsDBModel) arrayList.get(iW1)).getStreamId());
        String contaiinerExtension = ((LiveStreamsDBModel) arrayList.get(iW1)).getContaiinerExtension();
        C2966a.f().w(iW1);
        if (this.f36123X0.equals("movies")) {
            this.f36089G0 = ((LiveStreamsDBModel) arrayList.get(iW1)).getUrl();
            SharedPreferences.Editor editor = this.f36120W;
            if (editor != null) {
                editor.putString("currentlyPlayingVideo", String.valueOf(((LiveStreamsDBModel) this.f36108Q.get(iW1)).getStreamId()));
                this.f36120W.apply();
            }
        }
        SharedPreferences.Editor editor2 = this.f36122X;
        if (editor2 != null) {
            editor2.putString("currentlyPlayingVideoPosition", String.valueOf(iW1));
            this.f36122X.apply();
        }
        SimpleDateFormat simpleDateFormat = this.f36166s;
        if (T1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f36133e))), this.f36076A.format(this.f36176x)) >= C2939c.p() && (str3 = this.f36169t0) != null && this.f36093I0 != null && (!f36075m1.equals(str3) || (this.f36169t0 != null && (str4 = this.f36093I0) != null && !f36072j1.equals(str4)))) {
            this.f36105O0 = Boolean.FALSE;
            this.f36131d.b(a7.f.f12146G).e();
            this.f36131d.b(a7.f.f12186K).c(strS0 + this.f36143h0 + this.f36159o0);
        }
        this.f36118V = iQ0;
        int iR0 = w.r0(num);
        this.f36107P0.setTitle(iR0 + " - " + name);
        this.f36131d.b(a7.f.f12226O).c(iR0 + " - " + name);
        if (this.f36107P0.getFullScreenValue().booleanValue()) {
            this.f36112S = this.f36107P0.getFullScreenValue().booleanValue();
        } else {
            this.f36112S = false;
        }
        this.f36107P0.W1();
        NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f36107P0;
        nSTIJKPlayerVOD2.f37501I = 0;
        nSTIJKPlayerVOD2.f37507K = false;
        nSTIJKPlayerVOD2.f37502I0 = true;
        int iT2 = this.f36087F0.equals("m3u") ? t2(String.valueOf(Uri.parse(this.f36089G0)), SharepreferenceDBHandler.getUserID(this.f36133e)) : s2(iQ0, SharepreferenceDBHandler.getUserID(this.f36133e));
        this.f36109Q0 = this.f36133e.getSharedPreferences("loginPrefs", 0);
        if (!f36073k1) {
            iT2 = 0;
        }
        if (iT2 == 0) {
            if (this.f36105O0.booleanValue()) {
                o2();
                if (this.f36087F0.equals("m3u")) {
                    nSTIJKPlayerVOD = this.f36107P0;
                    strValueOf = this.f36089G0;
                    z10 = this.f36112S;
                    str = "nst";
                    j9 = 0;
                    i10 = 0;
                    streamType = "";
                    arrayList2 = null;
                    i11 = 0;
                    i12 = 0;
                    str2 = this.f36087F0;
                } else {
                    strValueOf = String.valueOf(Uri.parse(this.f36136f + iQ0 + InstructionFileId.DOT + contaiinerExtension));
                    nSTIJKPlayerVOD = this.f36107P0;
                    z10 = this.f36112S;
                    str = "nst";
                    j9 = 0;
                    i10 = iQ0;
                    arrayList2 = this.f36110R;
                    i11 = iW1;
                    i12 = iR0;
                    str2 = this.f36087F0;
                }
                nSTIJKPlayerVOD.d2(strValueOf, z10, name, j9, i10, streamType, arrayList2, i11, i12, str2, str);
                C2966a.f().G(iQ0);
                C2966a.f().t(arrayList);
                C2966a.f().w(iW1);
                NSTIJKPlayerVOD nSTIJKPlayerVOD3 = this.f36107P0;
                if (nSTIJKPlayerVOD3 != null) {
                    nSTIJKPlayerVOD3.f37501I = 0;
                    nSTIJKPlayerVOD3.f37507K = false;
                    nSTIJKPlayerVOD3.f37524S0 = true;
                    nSTIJKPlayerVOD3.f37607z0 = false;
                    nSTIJKPlayerVOD3.start();
                }
                c2();
            }
        } else if (iT2 > 0) {
            if (isFinishing() || !this.f36105O0.booleanValue()) {
                z9 = true;
                r13 = 0;
            } else {
                this.f36081C0 = getSharedPreferences("currentSeekTime", 0);
                c2();
                z9 = true;
                r13 = 0;
                h2(this, iQ0, contaiinerExtension, name, iR0, streamType, arrayList, iW1, this.f36089G0);
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD4 = this.f36107P0;
            if (nSTIJKPlayerVOD4 != null) {
                nSTIJKPlayerVOD4.f37501I = r13;
                nSTIJKPlayerVOD4.f37507K = r13;
                nSTIJKPlayerVOD4.f37524S0 = z9;
                nSTIJKPlayerVOD4.f37607z0 = r13;
                nSTIJKPlayerVOD4.start();
            }
        }
        c2();
    }

    private void j2(ArrayList arrayList, int i9) {
        String str;
        String str2;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        String name = ((File) arrayList.get(i9)).getName();
        String strS0 = w.S0(w7.k.a() + w7.k.i());
        SimpleDateFormat simpleDateFormat = this.f36166s;
        if (T1(simpleDateFormat, simpleDateFormat.format(new Date(AbstractC2941e.a(this.f36133e))), this.f36076A.format(this.f36176x)) >= C2939c.p() && (str = this.f36169t0) != null && this.f36093I0 != null && (!f36075m1.equals(str) || (this.f36169t0 != null && (str2 = this.f36093I0) != null && !f36072j1.equals(str2)))) {
            this.f36105O0 = Boolean.FALSE;
            this.f36131d.b(a7.f.f12146G).e();
            this.f36131d.b(a7.f.f12186K).c(strS0 + this.f36143h0 + this.f36159o0);
        }
        if (this.f36105O0.booleanValue()) {
            C2966a.f().w(i9);
            this.f36107P0.setTitle(name);
            if (this.f36107P0.getFullScreenValue().booleanValue()) {
                this.f36112S = this.f36107P0.getFullScreenValue().booleanValue();
            } else {
                this.f36112S = false;
            }
            this.f36107P0.W1();
            o2();
            this.f36107P0.d2(this.f36136f, this.f36112S, name, 0L, 0, "", null, 0, 0, this.f36087F0, "nst");
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.f37501I = 0;
                nSTIJKPlayerVOD.f37507K = false;
                nSTIJKPlayerVOD.f37524S0 = true;
                nSTIJKPlayerVOD.f37607z0 = false;
                nSTIJKPlayerVOD.start();
            }
        }
        c2();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0303  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k2(java.util.List r32, int r33) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity.k2(java.util.List, int):void");
    }

    private void n2() {
        int iD;
        iD = C2966a.f().d();
        String str = this.f36123X0;
        str.hashCode();
        switch (str) {
            case "movies":
                if (iD == 0) {
                    C2966a.f().w(this.f36108Q.size() - 1);
                    return;
                }
                break;
            case "series":
                if (iD == 0) {
                    C2966a.f().w(this.f36121W0.size() - 1);
                    return;
                }
                break;
            case "recording":
                if (iD == 0) {
                    C2966a.f().w(this.f36080C.size() - 1);
                    return;
                }
                break;
        }
        C2966a.f().w(iD - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o2() {
        try {
            if (this.f36107P0 != null) {
                this.f36081C0 = this.f36133e.getSharedPreferences("currentSeekTime", 0);
                long currentPosition = this.f36107P0.getCurrentPosition();
                SharedPreferences sharedPreferences = this.f36133e.getSharedPreferences("currentSeekTime", 0);
                this.f36081C0 = sharedPreferences;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                this.f36083D0 = editorEdit;
                editorEdit.putString("currentSeekTime", String.valueOf(currentPosition));
                this.f36083D0.apply();
                NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
                if (nSTIJKPlayerVOD != null && currentPosition != -1 && currentPosition != 0) {
                    nSTIJKPlayerVOD.setCurrentPositionSeekbar(nSTIJKPlayerVOD.getCurrentPosition());
                    this.f36107P0.setProgress(true);
                    this.f36107P0.V1(true);
                }
                if (this.f36123X0.equals("movies")) {
                    if (!this.f36087F0.equals("m3u") && this.f36107P0 != null && C2966a.f().k() != -1 && currentPosition != -1 && currentPosition != 0) {
                        if (C2966a.f().h() == C2966a.f().k()) {
                            u2(C2966a.f().k(), 0L);
                            C2966a.f().C(0);
                        } else {
                            u2(C2966a.f().k(), currentPosition);
                        }
                    }
                } else if (this.f36123X0.equals("series") && ((this.f36107P0 == null || C2966a.f().a() == null || !this.f36087F0.equals("m3u")) && C2966a.f() != null && C2966a.f().e() != null && currentPosition != -1 && currentPosition != 0)) {
                    if (C2966a.f().h() == Integer.parseInt(C2966a.f().e())) {
                        this.f36147i1.j(C2966a.f().e(), 0L);
                        C2966a.f().C(0);
                    } else {
                        this.f36147i1.j(C2966a.f().e(), currentPosition);
                    }
                }
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD2 = this.f36107P0;
            if (nSTIJKPlayerVOD2 != null) {
                if (nSTIJKPlayerVOD2.N1()) {
                    this.f36107P0.D1();
                } else {
                    this.f36107P0.n2();
                    this.f36107P0.T1(true);
                    this.f36107P0.m2();
                }
                IjkMediaPlayer.native_profileEnd();
            }
        } catch (Exception unused) {
        }
    }

    private int s2(int i9, int i10) {
        return this.f36091H0.isStreamAvailable(String.valueOf(i9), i10);
    }

    private int t2(String str, int i9) {
        return this.f36078B.isStreamAvailable(str, i9);
    }

    public void S1() {
        File[] fileArrO = w.O(this.f36133e);
        for (File file : fileArrO) {
            if (file.toString().endsWith(".ts")) {
                Arrays.asList(file);
            }
        }
        if (fileArrO.length > 0) {
            for (File file2 : fileArrO) {
                if (file2.toString().endsWith(".ts")) {
                    this.f36082D.addAll(Arrays.asList(file2));
                }
            }
            Collections.reverse(this.f36082D);
            this.f36080C = this.f36082D;
        }
    }

    public void U1() {
        TextView textView;
        this.f36107P0.I1();
        NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
        if (nSTIJKPlayerVOD != null && (textView = nSTIJKPlayerVOD.f37547f0) != null) {
            textView.setVisibility(0);
        }
        this.f36116U.setVisibility(8);
        this.f36107P0.E1(Boolean.valueOf(this.f36112S));
        r2();
        p2();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            String str = this.f36123X0;
            if (str == null || str.equals("")) {
                return;
            }
            if (!this.f36123X0.equals("devicedata") && !this.f36123X0.equals("loadurl")) {
                return;
            }
        }
        d2();
    }

    public int W1(ArrayList arrayList, int i9) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (w.r0(((LiveStreamsDBModel) arrayList.get(i10)).getNum()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    public int X1(List list, int i9) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (w.r0(((GetEpisdoeDetailsCallback) list.get(i10)).getId()) == i9) {
                return i10;
            }
        }
        return 0;
    }

    public final ArrayList Z1(String str, int i9) {
        return this.f36078B.getStreamStatus(str, i9);
    }

    public void c2() {
        findViewById(a7.f.f12236P).setVisibility(8);
        findViewById(a7.f.f12484o2).setVisibility(8);
        findViewById(a7.f.S9).setVisibility(8);
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(a7.f.Sm).setVisibility(0);
        }
    }

    public void e2() {
        r2();
        q2();
        p2();
    }

    public void g2() {
        c2();
        this.f36168t.setVisibility(0);
        this.f36170u.setText(getResources().getString(a7.j.f13261g4));
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(a7.f.Sm).setVisibility(8);
        }
    }

    public final void h2(NSTIJKPlayerVODActivity nSTIJKPlayerVODActivity, int i9, String str, String str2, int i10, String str3, ArrayList arrayList, int i11, String str4) {
        String name = ((LiveStreamsDBModel) arrayList.get(i11)).getName();
        a.C0158a c0158a = new a.C0158a(this, a7.k.f13461f);
        c0158a.h(new c());
        View viewInflate = LayoutInflater.from(this).inflate(a7.g.f12862q3, (ViewGroup) null);
        this.f36097K0 = (TextView) viewInflate.findViewById(a7.f.jk);
        this.f36099L0 = (Button) viewInflate.findViewById(a7.f.f12087A0);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12221N4);
        this.f36095J0 = imageView;
        imageView.setOnClickListener(new d());
        this.f36101M0 = (Button) viewInflate.findViewById(a7.f.f12187K0);
        TextView textView = this.f36097K0;
        if (textView != null) {
            textView.setText(i10 + "-" + str2);
        }
        Button button = this.f36099L0;
        if (button != null) {
            button.setOnFocusChangeListener(new l(button));
        }
        Button button2 = this.f36101M0;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new l(button2));
        }
        ImageView imageView2 = this.f36095J0;
        if (imageView2 != null) {
            imageView2.setOnFocusChangeListener(new l(imageView2));
        }
        this.f36099L0.requestFocus();
        this.f36099L0.setOnClickListener(new e(arrayList, i11, str4, nSTIJKPlayerVODActivity, i9, str, str3, i10));
        this.f36101M0.setOnClickListener(new f(i9, str, name, str3, i11, i10, arrayList));
        c0158a.setView(viewInflate);
        this.f36103N0 = c0158a.create();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(this.f36103N0.getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        this.f36103N0.show();
        this.f36103N0.getWindow().setAttributes(layoutParams);
        this.f36103N0.setCancelable(false);
        this.f36103N0.show();
    }

    public final void l2() {
        this.f36145i.setVisibility(8);
        this.f36142h.setVisibility(0);
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(a7.f.Sm).setVisibility(0);
        }
    }

    public final void m2() {
        this.f36142h.setVisibility(8);
        this.f36145i.setVisibility(0);
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(a7.f.Sm).setVisibility(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (findViewById(a7.f.f12236P).getVisibility() == 0) {
            c2();
            return;
        }
        String str = this.f36125Y0;
        if (str != null && !str.equals("")) {
            this.f36107P0.n2();
            this.f36107P0.T1(true);
            this.f36107P0.m2();
        }
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity.onClick(android.view.View):void");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f36133e = getApplicationContext();
        PlayerSelectedSinglton.getInstance().setPlayerType("vod");
        try {
            IjkMediaPlayer.loadLibrariesOnce(null);
            IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        this.f36123X0 = getIntent().getStringExtra("type");
        Intent intent = getIntent();
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            intent.getData();
            intent.getType();
            this.f36125Y0 = intent.getDataString();
            setContentView(a7.g.f12726U3);
        }
        String str = this.f36123X0;
        if (str != null && !str.equals("") && (this.f36123X0.equals("devicedata") || this.f36123X0.equals("loadurl"))) {
            setRequestedOrientation(new C2858a(this.f36133e).A().equals(AbstractC2237a.f44453K0) ? 0 : 4);
        }
        String str2 = this.f36123X0;
        if (str2 != null && !str2.equals("")) {
            setContentView((this.f36123X0.equals("devicedata") || this.f36123X0.equals("loadurl")) ? a7.g.f12726U3 : a7.g.f12720T3);
        }
        d2();
        w.I0(this.f36133e);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        Button button;
        super.onDestroy();
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
            if (nSTIJKPlayerVOD != null && (button = nSTIJKPlayerVOD.f37584r1) != null) {
                button.performClick();
            }
        } catch (Exception e9) {
            Log.e("fsgd", "fdfh", e9);
        }
        try {
            o2();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        String str;
        int i10;
        String str2;
        keyEvent.getRepeatCount();
        keyEvent.getAction();
        RelativeLayout relativeLayout = this.f36119V0;
        if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
            return super.onKeyDown(i9, keyEvent);
        }
        if (i9 == 19) {
            str = this.f36125Y0;
            if ((str == null && !str.equals("")) || this.f36123X0.equals("devicedata") || this.f36123X0.equals("ofd") || this.f36123X0.equals("loadurl") || this.f36123X0.equals("catch_up")) {
                return false;
            }
            e2();
            i10 = a7.f.f12100B3;
        } else if (i9 == 20) {
            str2 = this.f36125Y0;
            if ((str2 == null && !str2.equals("")) || this.f36123X0.equals("devicedata") || this.f36123X0.equals("ofd") || this.f36123X0.equals("loadurl") || this.f36123X0.equals("catch_up")) {
                return false;
            }
            e2();
            i10 = a7.f.f12130E3;
        } else if (i9 == 89) {
            e2();
            i10 = a7.f.f12140F3;
        } else {
            if (i9 != 90) {
                if (i9 != 166) {
                    if (i9 != 167) {
                        if (i9 != 274) {
                            if (i9 != 275) {
                                return super.onKeyDown(i9, keyEvent);
                            }
                            e2();
                            i10 = a7.f.f12140F3;
                        }
                    }
                    str2 = this.f36125Y0;
                    if (str2 == null) {
                    }
                    e2();
                    i10 = a7.f.f12130E3;
                }
                str = this.f36125Y0;
                if (str == null) {
                }
                e2();
                i10 = a7.f.f12100B3;
            }
            e2();
            i10 = a7.f.f12586y3;
        }
        findViewById(i10).performClick();
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008a, code lost:
    
        if (r5.f36123X0.equals("loadurl") == false) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074  */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyUp(int r6, android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerVODActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        NSTIJKPlayerVOD nSTIJKPlayerVOD;
        super.onPause();
        String action = getIntent().getAction();
        if (k0.f39777a <= 23) {
            o2();
        }
        if (!"android.intent.action.VIEW".equals(action) || (nSTIJKPlayerVOD = this.f36107P0) == null) {
            return;
        }
        if (nSTIJKPlayerVOD.N1()) {
            this.f36107P0.D1();
        } else {
            this.f36107P0.pause();
        }
        IjkMediaPlayer.native_profileEnd();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f36133e);
        NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
        if (nSTIJKPlayerVOD != null) {
            nSTIJKPlayerVOD.I1();
            if (this.f36139g) {
                f36073k1 = false;
                this.f36139g = false;
                ArrayList arrayList = this.f36108Q;
                if (arrayList == null || arrayList.size() == 0) {
                    g2();
                } else {
                    i2(this.f36108Q, this.f36171u0);
                }
            }
            U1();
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        Button button;
        super.onStop();
        try {
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
            if (nSTIJKPlayerVOD != null && (button = nSTIJKPlayerVOD.f37584r1) != null) {
                button.performClick();
                this.f36139g = false;
            }
        } catch (Exception e9) {
            Log.e("fsgd", "fdfh", e9);
        }
        try {
            o2();
        } catch (Exception unused) {
        }
    }

    public final void p2() {
        this.f36149j0.postDelayed(new g(), 7000L);
    }

    public void q2() {
        findViewById(a7.f.f12236P).setVisibility(0);
        findViewById(a7.f.f12484o2).setVisibility(0);
        findViewById(a7.f.S9).setVisibility(0);
        if (AbstractC2237a.f44434B.booleanValue()) {
            findViewById(a7.f.Sm).setVisibility(0);
        }
    }

    public final void r2() {
        Handler handler = this.f36149j0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void toggleView(View view) {
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    public final void u1(Context context) {
        if (this.f36107P0 != null) {
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a7.g.f12637F4, (RadioGroup) findViewById(a7.f.Kg));
            PopupWindow popupWindow = new PopupWindow(context);
            this.f36151k0 = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f36151k0.setWidth(-1);
            this.f36151k0.setHeight(-1);
            this.f36151k0.setFocusable(true);
            this.f36151k0.setOnDismissListener(new a());
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kg);
            RadioGroup radioGroup2 = (RadioGroup) viewInflate.findViewById(a7.f.f12321Y);
            RadioGroup radioGroup3 = (RadioGroup) viewInflate.findViewById(a7.f.Gm);
            this.f36134e0 = (TextView) viewInflate.findViewById(a7.f.uk);
            this.f36137f0 = (TextView) viewInflate.findViewById(a7.f.Ak);
            this.f36140g0 = (TextView) viewInflate.findViewById(a7.f.Ck);
            Spinner spinner = (Spinner) viewInflate.findViewById(a7.f.Ig);
            this.f36113S0 = spinner;
            try {
                ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
                SharedPreferences sharedPreferences = context.getSharedPreferences("pref.using_sub_font_size", 0);
                this.f36115T0 = sharedPreferences;
                this.f36113S0.setSelection(arrayAdapter.getPosition(sharedPreferences.getString("pref.using_sub_font_size", AbstractC2237a.f44547x0)));
            } catch (Exception unused) {
            }
            Spinner spinner2 = this.f36113S0;
            if (spinner2 != null) {
                spinner2.setOnItemSelectedListener(new b());
            }
            NSTIJKPlayerVOD nSTIJKPlayerVOD = this.f36107P0;
            if (nSTIJKPlayerVOD != null) {
                nSTIJKPlayerVOD.k2(radioGroup3, radioGroup2, radioGroup, this.f36151k0, this.f36140g0, this.f36134e0, this.f36137f0);
            }
            this.f36151k0.showAtLocation(viewInflate, 1, 0, 0);
        }
    }

    public final void u2(int i9, long j9) {
        RecentWatchDBHandler recentWatchDBHandler = this.f36091H0;
        if (recentWatchDBHandler != null) {
            recentWatchDBHandler.updateResumePlayerStatus(String.valueOf(i9), "movie", false, j9);
        }
    }
}
