package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.EPGSourcesModel;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import m7.AbstractC2237a;
import m7.w;
import q7.C2629m;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class EPGSettingsActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public RelativeLayout f29294A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public RelativeLayout f29295B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f29296C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ImageView f29297D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public FrameLayout f29298E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Context f29299F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public SharedPreferences f29300G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public SharedPreferences.Editor f29301H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public SharedPreferences f29302I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SharedPreferences.Editor f29303J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public LiveStreamDBHandler f29304K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public C2629m f29309P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ArrayList f29310Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C2858a f29311R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ProgressDialog f29312S;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f29314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f29315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f29317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RadioGroup f29318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RadioButton f29319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RadioButton f29320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Spinner f29321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f29322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f29323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f29324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f29325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Button f29326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Button f29327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f29328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f29329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f29330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f29331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f29332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f29333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public RecyclerView f29334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f29335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f29336z;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29305L = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f29306M = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f29307N = "";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f29308O = "";

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Thread f29313T = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(EPGSettingsActivity.this.f29299F);
                String strA = w.A(string);
                TextView textView = EPGSettingsActivity.this.f29323m;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = EPGSettingsActivity.this.f29322l;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(EPGSettingsActivity.this.f29299F);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPGSettingsActivity.this.onBackPressed();
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(EPGSettingsActivity.this.f29299F);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(EPGSettingsActivity.this.f29299F);
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    EPGSettingsActivity.this.K1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class k extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f29347a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public EditText f29350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Context f29351f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LiveStreamDBHandler f29352g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f29353h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LinearLayout f29354i;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f29356a;

            public a(View view) {
                this.f29356a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f29356a;
                    if (view2 == null || view2.getTag() == null || !this.f29356a.getTag().equals("1")) {
                        View view3 = this.f29356a;
                        if (view3 == null || view3.getTag() == null || !this.f29356a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = k.this.f29354i;
                        }
                    } else {
                        linearLayout = k.this.f29353h;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f29356a;
                    if (view4 == null || view4.getTag() == null || !this.f29356a.getTag().equals("1")) {
                        View view5 = this.f29356a;
                        if (view5 == null || view5.getTag() == null || !this.f29356a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = k.this.f29354i;
                        }
                    } else {
                        linearLayout = k.this.f29353h;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public k(Activity activity, Context context, LiveStreamDBHandler liveStreamDBHandler) {
            super(activity);
            this.f29347a = activity;
            this.f29351f = context;
            this.f29352g = liveStreamDBHandler;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Context context;
            String string;
            int id = view.getId();
            if (id != a7.f.f12493p1) {
                if (id == a7.f.f12313X0) {
                    dismiss();
                    return;
                }
                return;
            }
            try {
                String strTrim = this.f29350e.getText().toString().trim();
                try {
                    URI uri = new URI(this.f29350e.getText().toString().trim());
                    strTrim = uri.getHost() == null ? this.f29350e.getText().toString().trim() : uri.getHost();
                } catch (Exception unused) {
                }
                String strTrim2 = String.valueOf(this.f29350e.getText()).trim();
                if (strTrim == null || strTrim.equals("") || strTrim.isEmpty()) {
                    context = this.f29351f;
                    string = context.getResources().getString(a7.j.f13428x1);
                } else if (strTrim2 == null || strTrim2.equals("") || strTrim2.isEmpty()) {
                    context = this.f29351f;
                    string = context.getResources().getString(a7.j.f13438y1);
                } else {
                    if (this.f29352g.checkIfEPGSourceAlreadyExists(strTrim2) == 0) {
                        this.f29352g.addEPGSource(strTrim, "custom", strTrim2, "0");
                        Context context2 = this.f29351f;
                        Toast.makeText(context2, context2.getResources().getString(a7.j.f13302k5), 0).show();
                        EPGSettingsActivity.this.R1();
                        dismiss();
                        return;
                    }
                    context = this.f29351f;
                    string = context.getResources().getString(a7.j.f13314l7);
                }
                Toast.makeText(context, string, 0).show();
            } catch (Exception unused2) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.f29311R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12676M1 : a7.g.f12670L1);
            this.f29348c = (TextView) findViewById(a7.f.f12493p1);
            this.f29349d = (TextView) findViewById(a7.f.f12313X0);
            this.f29353h = (LinearLayout) findViewById(a7.f.V8);
            this.f29354i = (LinearLayout) findViewById(a7.f.Ia);
            this.f29350e = (EditText) findViewById(a7.f.f12536t3);
            this.f29348c.setOnClickListener(this);
            this.f29349d.setOnClickListener(this);
            TextView textView = this.f29348c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f29349d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class l extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f29358a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public SwitchCompat f29361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f29362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public EditText f29363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public EditText f29364h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Context f29365i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LiveStreamDBHandler f29366j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public EPGSourcesModel f29367k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f29368l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f29369m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f29370n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f29371o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public LinearLayout f29372p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public LinearLayout f29373q;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                l.this.f29366j.updateImportStatus("epg", "3", String.valueOf(l.this.f29370n));
                EPGSettingsActivity.this.R1();
                if (EPGSettingsActivity.this.f29309P != null) {
                    EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                    ePGSettingsActivity.Q1(ePGSettingsActivity.f29309P, l.this.f29370n);
                }
            }
        }

        public class b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f29376a;

            public b(View view) {
                this.f29376a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f29376a;
                    if (view2 == null || view2.getTag() == null || !this.f29376a.getTag().equals("1")) {
                        View view3 = this.f29376a;
                        if (view3 == null || view3.getTag() == null || !this.f29376a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = l.this.f29373q;
                        }
                    } else {
                        linearLayout = l.this.f29372p;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f29376a;
                    if (view4 == null || view4.getTag() == null || !this.f29376a.getTag().equals("1")) {
                        View view5 = this.f29376a;
                        if (view5 == null || view5.getTag() == null || !this.f29376a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = l.this.f29373q;
                        }
                    } else {
                        linearLayout = l.this.f29372p;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public l(Activity activity, Context context, LiveStreamDBHandler liveStreamDBHandler, EPGSourcesModel ePGSourcesModel) {
            super(activity);
            this.f29368l = false;
            this.f29358a = activity;
            this.f29365i = context;
            this.f29366j = liveStreamDBHandler;
            this.f29367k = ePGSourcesModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x01b5 A[Catch: Exception -> 0x01f3, TryCatch #0 {Exception -> 0x01f3, blocks: (B:4:0x0008, B:7:0x002b, B:9:0x0031, B:11:0x0037, B:14:0x004d, B:16:0x0053, B:19:0x005b, B:24:0x006a, B:27:0x0074, B:29:0x007c, B:31:0x00b0, B:33:0x00b4, B:37:0x00ef, B:39:0x00f3, B:41:0x00f9, B:43:0x0103, B:44:0x0108, B:46:0x010e, B:48:0x0120, B:50:0x0126, B:52:0x012c, B:53:0x0159, B:55:0x015f, B:61:0x017b, B:63:0x017f, B:64:0x0181, B:66:0x0189, B:67:0x0196, B:69:0x01a1, B:71:0x01ba, B:68:0x019e, B:57:0x016b, B:59:0x0171, B:70:0x01b5, B:34:0x00be, B:36:0x00d2, B:72:0x01be), top: B:82:0x0008 }] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r12) {
            /*
                Method dump skipped, instruction units count: 500
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.l.onClick(android.view.View):void");
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.f29311R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12915z2 : a7.g.f12909y2);
            this.f29359c = (TextView) findViewById(a7.f.f12493p1);
            this.f29360d = (TextView) findViewById(a7.f.f12313X0);
            this.f29372p = (LinearLayout) findViewById(a7.f.V8);
            this.f29373q = (LinearLayout) findViewById(a7.f.Ia);
            this.f29362f = (LinearLayout) findViewById(a7.f.f12124D7);
            this.f29361e = (SwitchCompat) findViewById(a7.f.Ng);
            this.f29363g = (EditText) findViewById(a7.f.f12526s3);
            this.f29364h = (EditText) findViewById(a7.f.f12536t3);
            this.f29363g.setText(this.f29367k.getName());
            this.f29364h.setText(this.f29367k.getEpgurl());
            this.f29369m = this.f29367k.getSource_type();
            this.f29370n = this.f29367k.getIdAuto();
            this.f29371o = this.f29367k.getEpgurl().trim();
            this.f29359c.setOnClickListener(this);
            this.f29360d.setOnClickListener(this);
            this.f29362f.setOnClickListener(this);
            if (this.f29367k.getDefault_source().equals("1")) {
                this.f29361e.setChecked(true);
                this.f29368l = true;
            } else {
                this.f29361e.setChecked(false);
                this.f29368l = false;
            }
            if (this.f29367k.getSource_type().equals("panel")) {
                this.f29363g.setEnabled(false);
                if (AbstractC2237a.f44538t.booleanValue()) {
                    this.f29363g.setVisibility(0);
                } else {
                    this.f29363g.setVisibility(8);
                }
                this.f29364h.setEnabled(false);
                this.f29362f.setVisibility(8);
                this.f29364h.setVisibility(8);
                ArrayList<EPGSourcesModel> ePGSources = this.f29366j.getEPGSources();
                if (ePGSources == null || ePGSources.size() <= 1) {
                    this.f29361e.setEnabled(false);
                } else {
                    this.f29361e.setEnabled(true);
                }
            }
            TextView textView = this.f29359c;
            textView.setOnFocusChangeListener(new b(textView));
            TextView textView2 = this.f29360d;
            textView2.setOnFocusChangeListener(new b(textView2));
        }
    }

    public class m extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f29378a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f29380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Activity f29381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f29382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public TextView f29383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TextView f29384h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public TextView f29385i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public LinearLayout f29386j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public LinearLayout f29387k;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f29389a;

            public a(View view) {
                this.f29389a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f29389a;
                    if (view2 == null || view2.getTag() == null || !this.f29389a.getTag().equals("1")) {
                        View view3 = this.f29389a;
                        if (view3 == null || view3.getTag() == null || !this.f29389a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = m.this.f29387k;
                        }
                    } else {
                        linearLayout = m.this.f29386j;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f29389a;
                    if (view4 == null || view4.getTag() == null || !this.f29389a.getTag().equals("1")) {
                        View view5 = this.f29389a;
                        if (view5 == null || view5.getTag() == null || !this.f29389a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = m.this.f29387k;
                        }
                    } else {
                        linearLayout = m.this.f29386j;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public m(Activity activity, l lVar, int i9, boolean z9) {
            super(activity);
            this.f29381e = activity;
            this.f29378a = lVar;
            this.f29379c = i9;
            this.f29380d = z9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getId() != a7.f.f12544u1) {
                if (view.getId() == a7.f.f12412h1) {
                    dismiss();
                    return;
                }
                return;
            }
            EPGSettingsActivity.this.f29304K.deleteEPGSource(this.f29379c);
            EPGSettingsActivity.this.f29304K.deleteImportStatusForUser(SharepreferenceDBHandler.getUserID(EPGSettingsActivity.this.f29299F), String.valueOf(this.f29379c), SharepreferenceDBHandler.getCurrentAPPType(EPGSettingsActivity.this.f29299F));
            EPGSettingsActivity.this.f29304K.makeEmptyEPGWithSourceRef(String.valueOf(this.f29379c));
            if (this.f29380d) {
                EPGSettingsActivity.this.f29304K.updatePanelEPGSourceToDefault();
            }
            Toast.makeText(EPGSettingsActivity.this.f29299F, EPGSettingsActivity.this.f29299F.getResources().getString(a7.j.f13324m7), 0).show();
            EPGSettingsActivity.this.R1();
            dismiss();
            this.f29378a.dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.f29311R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12768b2 : a7.g.f12761a2);
            this.f29382f = (TextView) findViewById(a7.f.f12544u1);
            this.f29383g = (TextView) findViewById(a7.f.f12412h1);
            this.f29386j = (LinearLayout) findViewById(a7.f.V8);
            this.f29387k = (LinearLayout) findViewById(a7.f.Ia);
            this.f29385i = (TextView) findViewById(a7.f.fm);
            this.f29384h = (TextView) findViewById(a7.f.um);
            this.f29385i.setText(EPGSettingsActivity.this.f29299F.getResources().getString(a7.j.f13044K0));
            this.f29384h.setText(EPGSettingsActivity.this.f29299F.getResources().getString(a7.j.f13072M8));
            this.f29382f.setOnClickListener(this);
            this.f29383g.setOnClickListener(this);
            TextView textView = this.f29382f;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f29383g;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class n extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f29391a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f29392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f29393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public TextView f29394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public TextView f29395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public LinearLayout f29396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public LinearLayout f29397h;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f29399a;

            public a(String str) {
                this.f29399a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                EPGSettingsActivity.this.f29304K.updateImportStatus("epg", "3", this.f29399a);
                EPGSettingsActivity.this.R1();
                if (EPGSettingsActivity.this.f29309P != null) {
                    EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                    ePGSettingsActivity.Q1(ePGSettingsActivity.f29309P, w.r0(this.f29399a));
                }
            }
        }

        public class b implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f29401a;

            public b(View view) {
                this.f29401a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f29401a;
                    if (view2 == null || view2.getTag() == null || !this.f29401a.getTag().equals("1")) {
                        View view3 = this.f29401a;
                        if (view3 == null || view3.getTag() == null || !this.f29401a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = n.this.f29397h;
                        }
                    } else {
                        linearLayout = n.this.f29396g;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f29401a;
                    if (view4 == null || view4.getTag() == null || !this.f29401a.getTag().equals("1")) {
                        View view5 = this.f29401a;
                        if (view5 == null || view5.getTag() == null || !this.f29401a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = n.this.f29397h;
                        }
                    } else {
                        linearLayout = n.this.f29396g;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        public n(Activity activity) {
            super(activity);
            this.f29391a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EPGSettingsActivity ePGSettingsActivity;
            if (view.getId() != a7.f.f12544u1) {
                if (view.getId() == a7.f.f12412h1) {
                    dismiss();
                    return;
                }
                return;
            }
            try {
                if (AbstractC2237a.f44449I0) {
                    AbstractC2237a.f44449I0 = false;
                }
                ArrayList<EPGSourcesModel> activeEPGSource = EPGSettingsActivity.this.f29304K.getActiveEPGSource();
                String strValueOf = (activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto());
                ImportStatusModel importStatusModel = EPGSettingsActivity.this.f29304K.getdateDBStatus("epg", strValueOf);
                if (importStatusModel.getStatus() == null && importStatusModel.getTime() == null && importStatusModel.getType() == null) {
                    ImportStatusModel importStatusModel2 = new ImportStatusModel();
                    importStatusModel2.setType("epg");
                    importStatusModel2.setStatus("0");
                    importStatusModel2.setDate("");
                    importStatusModel2.setTime("");
                    importStatusModel2.setSourceRef(strValueOf);
                    ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
                    arrayList.add(0, importStatusModel2);
                    EPGSettingsActivity.this.f29304K.importDataStatusArrayList(arrayList, SharepreferenceDBHandler.getCurrentAPPType(EPGSettingsActivity.this.f29299F));
                }
                if (EPGSettingsActivity.this.f29312S == null) {
                    EPGSettingsActivity ePGSettingsActivity2 = EPGSettingsActivity.this;
                    ePGSettingsActivity2.f29312S = EPGSettingsActivity.J1(ePGSettingsActivity2.f29299F);
                    ePGSettingsActivity = EPGSettingsActivity.this;
                } else {
                    ePGSettingsActivity = EPGSettingsActivity.this;
                }
                ePGSettingsActivity.f29312S.show();
                new Handler(Looper.getMainLooper()).postDelayed(new a(strValueOf), 1000L);
                dismiss();
            } catch (Exception unused) {
            }
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(EPGSettingsActivity.this.f29311R.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12768b2 : a7.g.f12761a2);
            this.f29392c = (TextView) findViewById(a7.f.f12544u1);
            this.f29393d = (TextView) findViewById(a7.f.f12412h1);
            this.f29396g = (LinearLayout) findViewById(a7.f.V8);
            this.f29397h = (LinearLayout) findViewById(a7.f.Ia);
            this.f29395f = (TextView) findViewById(a7.f.fm);
            this.f29394e = (TextView) findViewById(a7.f.um);
            this.f29395f.setText(EPGSettingsActivity.this.f29299F.getResources().getString(a7.j.f13193Z5));
            this.f29394e.setText(EPGSettingsActivity.this.f29299F.getResources().getString(a7.j.f13203a6));
            this.f29392c.setOnClickListener(this);
            this.f29393d.setOnClickListener(this);
            TextView textView = this.f29392c;
            textView.setOnFocusChangeListener(new b(textView));
            TextView textView2 = this.f29393d;
            textView2.setOnFocusChangeListener(new b(textView2));
        }
    }

    public class o extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f29403a = "0";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f29404b;

        public o(Context context) {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                publishProgress(0);
                ArrayList<EPGSourcesModel> ePGSources = EPGSettingsActivity.this.f29304K.getEPGSources();
                this.f29404b = ePGSources;
                if (ePGSources == null || ePGSources.size() <= 0) {
                    return Boolean.FALSE;
                }
                ArrayList<EPGSourcesModel> activeEPGSource = EPGSettingsActivity.this.f29304K.getActiveEPGSource();
                if (activeEPGSource != null && activeEPGSource.size() > 0) {
                    this.f29403a = String.valueOf(activeEPGSource.get(0).getIdAuto());
                }
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    EPGSettingsActivity.this.f29331u.setVisibility(0);
                    EPGSettingsActivity.this.f29295B.setVisibility(0);
                    EPGSettingsActivity.this.f29296C.setVisibility(0);
                    EPGSettingsActivity.this.f29335y.setVisibility(8);
                    EPGSettingsActivity.this.f29334x.setVisibility(0);
                    EPGSettingsActivity.this.f29334x.setLayoutManager(new LinearLayoutManager(EPGSettingsActivity.this.f29299F, 1, false));
                    EPGSettingsActivity.this.f29334x.setItemAnimator(new androidx.recyclerview.widget.c());
                    EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                    ePGSettingsActivity.f29309P = new C2629m(ePGSettingsActivity.f29299F, this.f29404b);
                    EPGSettingsActivity ePGSettingsActivity2 = EPGSettingsActivity.this;
                    ePGSettingsActivity2.f29334x.setAdapter(ePGSettingsActivity2.f29309P);
                    EPGSettingsActivity.this.S1(this.f29403a);
                } else {
                    EPGSettingsActivity.this.f29331u.setVisibility(8);
                    EPGSettingsActivity.this.f29295B.setVisibility(8);
                    EPGSettingsActivity.this.f29335y.setVisibility(0);
                    EPGSettingsActivity.this.f29334x.setVisibility(8);
                    EPGSettingsActivity.this.f29296C.setVisibility(8);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onCancelled() {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class p implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f29406a;

        public p(View view) {
            this.f29406a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29406a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29406a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            Button button;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                Log.e("id is", "" + this.f29406a.getTag());
                if (!this.f29406a.getTag().equals("1") && !this.f29406a.getTag().equals("2")) {
                    if (this.f29406a.getTag().equals("bt_epg_sources")) {
                        button = EPGSettingsActivity.this.f29325o;
                    } else if (this.f29406a.getTag().equals("bt_epg_timeline")) {
                        button = EPGSettingsActivity.this.f29326p;
                    } else {
                        if (!this.f29406a.getTag().equals("bt_epg_timeshift")) {
                            if (this.f29406a.getTag().equals("rb_withepg") || this.f29406a.getTag().equals("rb_allchannels")) {
                                this.f29406a.setBackground(EPGSettingsActivity.this.getResources().getDrawable(a7.e.f11931K1));
                                return;
                            } else {
                                a(1.05f);
                                b(1.05f);
                                return;
                            }
                        }
                        button = EPGSettingsActivity.this.f29327q;
                    }
                    button.performClick();
                    return;
                }
                a(f9);
                b(f9);
                view2 = this.f29406a;
                i9 = a7.e.f12024k1;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                if (!this.f29406a.getTag().equals("1") && !this.f29406a.getTag().equals("2")) {
                    return;
                }
                view2 = this.f29406a;
                i9 = a7.e.f12038o;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class q extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2629m f29408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public B7.d f29409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f29410c;

        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public volatile boolean f29412a = true;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Context f29413b;

            public a(Context context) {
                this.f29413b = context;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                if (EPGSettingsActivity.this.f29304K != null) {
                    EPGSettingsActivity.this.f29304K.addEPGTesting2(EPGSettingsActivity.this.f29310Q);
                    EPGSettingsActivity.this.f29310Q.clear();
                    EPGSettingsActivity.this.f29304K.updateImportStatus("epg", "1", q.this.f29410c);
                }
                return Boolean.TRUE;
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                EPGSettingsActivity ePGSettingsActivity = EPGSettingsActivity.this;
                ePGSettingsActivity.f29300G = ePGSettingsActivity.getSharedPreferences("loginPrefs", 0);
                try {
                    EPGSettingsActivity.this.R1();
                } catch (Exception unused) {
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onCancelled() {
                this.f29412a = false;
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public q(C2629m c2629m, int i9) {
            this.f29410c = "0";
            this.f29408a = c2629m;
            this.f29410c = String.valueOf(i9);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            if (!this.f29410c.equals("0") && EPGSettingsActivity.this.f29304K != null) {
                EPGSettingsActivity.this.f29304K.makeEmptyEPGWithSourceRef(this.f29410c);
            }
            Log.e("honey", "epg 1");
            this.f29409b = new B7.d();
            Log.e("honey", "epg 2");
            this.f29409b.a(EPGSettingsActivity.this.f29299F);
            Log.e("honey", "epg 3");
            EPGSettingsActivity.this.f29310Q = this.f29409b.b();
            Log.e("honey", "epg 4");
            if (EPGSettingsActivity.this.f29310Q != null && EPGSettingsActivity.this.f29310Q.size() > 0) {
                Log.e("honey", "size:" + EPGSettingsActivity.this.f29310Q.size());
            } else {
                if (EPGSettingsActivity.this.f29304K.getEPGCountWithSourceRef(this.f29410c) == 0) {
                    return Boolean.FALSE;
                }
                EPGSettingsActivity.this.f29304K.updateImportStatus("epg", "1", this.f29410c);
            }
            return Boolean.TRUE;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPostExecute(java.lang.Boolean r4) {
            /*
                r3 = this;
                boolean r4 = r4.booleanValue()
                java.lang.String r0 = "epg"
                if (r4 == 0) goto L58
                r4 = 0
                m7.AbstractC2237a.f44449I0 = r4
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                java.util.ArrayList r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.z1(r1)
                if (r1 == 0) goto L4a
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                java.util.ArrayList r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.z1(r1)
                int r1 = r1.size()
                if (r1 <= 0) goto L4a
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity$q$a r1 = new com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity$q$a     // Catch: java.lang.Exception -> L35
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r2 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L35
                android.content.Context r2 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.u1(r2)     // Catch: java.lang.Exception -> L35
                r1.<init>(r2)     // Catch: java.lang.Exception -> L35
                java.util.concurrent.Executor r2 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Exception -> L35
                java.lang.String[] r4 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L35
                android.os.AsyncTask r4 = r1.executeOnExecutor(r2, r4)     // Catch: java.lang.Exception -> L35
                m7.w.f44705r = r4     // Catch: java.lang.Exception -> L35
                goto L68
            L35:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.v1(r4)     // Catch: java.lang.Exception -> L48
                java.lang.String r1 = "0"
                java.lang.String r2 = r3.f29410c     // Catch: java.lang.Exception -> L48
                r4.updateImportStatus(r0, r1, r2)     // Catch: java.lang.Exception -> L48
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
            L44:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.G1(r4)     // Catch: java.lang.Exception -> L48
                goto L68
            L48:
                goto L68
            L4a:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r0 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                java.lang.String r1 = "loginPrefs"
                android.content.SharedPreferences r4 = r0.getSharedPreferences(r1, r4)
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.B1(r0, r4)
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                goto L44
            L58:
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.v1(r4)     // Catch: java.lang.Exception -> L48
                java.lang.String r1 = "2"
                java.lang.String r2 = r3.f29410c     // Catch: java.lang.Exception -> L48
                r4.updateImportStatus(r0, r1, r2)     // Catch: java.lang.Exception -> L48
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r4 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this     // Catch: java.lang.Exception -> L48
                goto L44
            L68:
                java.io.File r4 = new java.io.File
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.this
                android.content.Context r1 = com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.u1(r1)
                java.io.File r1 = r1.getFilesDir()
                r0.append(r1)
                java.lang.String r1 = "/epgZip.xml"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                java.io.File r0 = new java.io.File
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r0.<init>(r4)
                boolean r4 = r0.exists()
                if (r4 == 0) goto L9a
                r0.delete()
            L9a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity.q.onPostExecute(java.lang.Boolean):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            EPGSettingsActivity.this.N1();
        }
    }

    private void H1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public static ProgressDialog J1(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        try {
            progressDialog.show();
        } catch (Exception unused) {
        }
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setContentView(a7.g.f12791e4);
        return progressDialog;
    }

    private void M1() {
        Button button = this.f29316f;
        if (button != null) {
            button.setOnFocusChangeListener(new p(button));
        }
        Button button2 = this.f29317g;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new p(button2));
        }
        Button button3 = this.f29325o;
        button3.setOnFocusChangeListener(new p(button3));
        Button button4 = this.f29326p;
        button4.setOnFocusChangeListener(new p(button4));
        Button button5 = this.f29327q;
        button5.setOnFocusChangeListener(new p(button5));
        RadioButton radioButton = this.f29319i;
        if (radioButton != null) {
            radioButton.setOnFocusChangeListener(new p(radioButton));
        }
        RadioButton radioButton2 = this.f29320j;
        if (radioButton2 != null) {
            radioButton2.setOnFocusChangeListener(new p(radioButton2));
        }
        Spinner spinner = this.f29321k;
        if (spinner != null) {
            spinner.setOnFocusChangeListener(new p(spinner));
        }
    }

    private void P1() {
        TextView textView;
        Resources resources;
        int i9;
        this.f29304K = new LiveStreamDBHandler(this.f29299F);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f29300G = sharedPreferences;
        String string = sharedPreferences.getString("selectedEPGShift", AbstractC2237a.f44437C0);
        int iN = w.N(string);
        if (string.equals("")) {
            this.f29333w.setText("0");
        } else {
            this.f29333w.setText(string);
        }
        this.f29321k.setSelection(iN);
        SharedPreferences sharedPreferences2 = getSharedPreferences("epgchannelupdate", 0);
        this.f29302I = sharedPreferences2;
        if (sharedPreferences2.getString("epgchannelupdate", "").equals("all")) {
            this.f29320j.setChecked(true);
            textView = this.f29332v;
            resources = this.f29299F.getResources();
            i9 = a7.j.f13446z;
        } else {
            this.f29319i.setChecked(true);
            textView = this.f29332v;
            resources = this.f29299F.getResources();
            i9 = a7.j.f12975D1;
        }
        textView.setText(resources.getString(i9));
        R1();
        this.f29336z.setOnClickListener(new b());
        this.f29324n.setOnClickListener(new c());
    }

    public final void I1() {
        FrameLayout frameLayout;
        int i9 = 8;
        if (AbstractC2237a.f44475V0.booleanValue() && (this.f29311R.k() == null || this.f29311R.n() == null || this.f29311R.l() == 0 || this.f29311R.k().equals("") || this.f29311R.n().equals(""))) {
            frameLayout = this.f29298E;
            i9 = 0;
        } else {
            frameLayout = this.f29298E;
        }
        frameLayout.setVisibility(i9);
        this.f29297D.setVisibility(i9);
    }

    public void K1() {
        runOnUiThread(new a());
    }

    public void L1(EPGSourcesModel ePGSourcesModel) {
        new l(this, this.f29299F, this.f29304K, ePGSourcesModel).show();
    }

    public void N1() {
        try {
            ProgressDialog progressDialog = this.f29312S;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            Log.e("honey", "hideProgressDialog");
            this.f29312S.dismiss();
        } catch (Exception unused) {
        }
    }

    public void O1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void Q1(C2629m c2629m, int i9) {
        new q(c2629m, i9).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void R1() {
        if (this.f29334x != null) {
            new o(this.f29299F).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    public final void S1(String str) {
        try {
            this.f29296C.setText(getResources().getString(a7.j.f12985E1, String.valueOf(this.f29304K.getTotalNumberOFChannelsWithEPG(str))));
        } catch (Exception unused) {
        }
    }

    public void T1(String str) {
        this.f29331u.setText(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007e -> B:76:0x0205). Please report as a decompilation issue!!! */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        TextView textView;
        Resources resources;
        int i9;
        Resources resources2;
        int i10;
        Toast toastMakeText;
        Dialog nVar;
        int id = view.getId();
        if (id == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        if (id == a7.f.f12301V6) {
            try {
                if (!AbstractC2237a.f44526o.booleanValue()) {
                    new k(this, this.f29299F, this.f29304K).show();
                } else if (!AbstractC2237a.f44475V0.booleanValue()) {
                    nVar = new k(this, this.f29299F, this.f29304K);
                } else if (this.f29311R.k() == null || this.f29311R.n() == null || this.f29311R.l() == 0 || this.f29311R.k().equals("") || this.f29311R.n().equals("")) {
                    new w.j(this, this.f29299F, this.f29311R).show();
                } else {
                    nVar = new k(this, this.f29299F, this.f29304K);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            return;
        }
        if (id == a7.f.G9) {
            ArrayList<EPGSourcesModel> activeEPGSource = this.f29304K.getActiveEPGSource();
            if (((activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto())).equals("0")) {
                toastMakeText = Toast.makeText(this, getResources().getString(a7.j.f13070M6), 1);
            } else {
                nVar = new n(this);
            }
        } else {
            if (id == a7.f.f12137F0) {
                SharedPreferences.Editor editorEdit = this.f29300G.edit();
                this.f29301H = editorEdit;
                if (editorEdit != null) {
                    editorEdit.putString("selectedEPGShift", String.valueOf(this.f29321k.getSelectedItem()));
                    this.f29301H.apply();
                    this.f29333w.setText(String.valueOf(this.f29321k.getSelectedItem()));
                    resources2 = getResources();
                    i10 = a7.j.f13302k5;
                }
                resources2 = getResources();
                i10 = a7.j.f13292j5;
            } else {
                if (id != a7.f.f12147G0) {
                    if (id == a7.f.f12492p0) {
                        this.f29328r.setVisibility(0);
                        this.f29325o.setBackgroundResource(a7.e.f12042p);
                        this.f29326p.setBackgroundResource(a7.e.f12038o);
                        this.f29327q.setBackgroundResource(a7.e.f12038o);
                        linearLayout2 = this.f29329s;
                    } else {
                        if (id != a7.f.f12503q0) {
                            if (id != a7.f.f12513r0) {
                                if (id == a7.f.f12267S0) {
                                    finish();
                                    return;
                                }
                                return;
                            }
                            this.f29330t.setVisibility(0);
                            this.f29327q.setBackgroundResource(a7.e.f12042p);
                            this.f29325o.setBackgroundResource(a7.e.f12038o);
                            this.f29326p.setBackgroundResource(a7.e.f12038o);
                            this.f29328r.setVisibility(8);
                            linearLayout = this.f29329s;
                            linearLayout.setVisibility(8);
                            return;
                        }
                        this.f29329s.setVisibility(0);
                        this.f29326p.setBackgroundResource(a7.e.f12042p);
                        this.f29325o.setBackgroundResource(a7.e.f12038o);
                        this.f29327q.setBackgroundResource(a7.e.f12038o);
                        linearLayout2 = this.f29328r;
                    }
                    linearLayout2.setVisibility(8);
                    linearLayout = this.f29330t;
                    linearLayout.setVisibility(8);
                    return;
                }
                RadioButton radioButton = (RadioButton) findViewById(this.f29318h.getCheckedRadioButtonId());
                SharedPreferences sharedPreferences = getSharedPreferences("epgchannelupdate", 0);
                this.f29302I = sharedPreferences;
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                this.f29303J = editorEdit2;
                if (editorEdit2 != null) {
                    if (radioButton.getText().toString().equals(getResources().getString(a7.j.f13436y))) {
                        this.f29303J.putString("epgchannelupdate", "all");
                        textView = this.f29332v;
                        resources = getResources();
                        i9 = a7.j.f13446z;
                    } else {
                        this.f29303J.putString("epgchannelupdate", "withepg");
                        textView = this.f29332v;
                        resources = getResources();
                        i9 = a7.j.f12975D1;
                    }
                    textView.setText(resources.getString(i9));
                    this.f29303J.apply();
                    resources2 = getResources();
                    i10 = a7.j.f13302k5;
                }
                resources2 = getResources();
                i10 = a7.j.f13292j5;
            }
            toastMakeText = Toast.makeText(this, resources2.getString(i10), 0);
        }
        toastMakeText.show();
        return;
        nVar.show();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29299F = this;
        O1();
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f29299F);
        this.f29311R = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12900x : a7.g.f12894w);
        this.f29314d = (Toolbar) findViewById(a7.f.kh);
        this.f29315e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f29316f = (Button) findViewById(a7.f.f12137F0);
        this.f29317g = (Button) findViewById(a7.f.f12147G0);
        this.f29318h = (RadioGroup) findViewById(a7.f.Kd);
        this.f29319i = (RadioButton) findViewById(a7.f.yd);
        this.f29320j = (RadioButton) findViewById(a7.f.ed);
        this.f29321k = (Spinner) findViewById(a7.f.Cg);
        this.f29322l = (TextView) findViewById(a7.f.f12129E2);
        this.f29323m = (TextView) findViewById(a7.f.gh);
        this.f29324n = (ImageView) findViewById(a7.f.f12141F4);
        this.f29325o = (Button) findViewById(a7.f.f12492p0);
        this.f29326p = (Button) findViewById(a7.f.f12503q0);
        this.f29327q = (Button) findViewById(a7.f.f12513r0);
        this.f29328r = (LinearLayout) findViewById(a7.f.f12338Z7);
        this.f29329s = (LinearLayout) findViewById(a7.f.f12348a8);
        this.f29330t = (LinearLayout) findViewById(a7.f.f12358b8);
        this.f29331u = (TextView) findViewById(a7.f.hj);
        this.f29332v = (TextView) findViewById(a7.f.ij);
        this.f29333w = (TextView) findViewById(a7.f.jj);
        this.f29334x = (RecyclerView) findViewById(a7.f.Ef);
        this.f29335y = (TextView) findViewById(a7.f.zk);
        this.f29336z = (ImageView) findViewById(a7.f.Xa);
        this.f29294A = (RelativeLayout) findViewById(a7.f.f12301V6);
        this.f29295B = (RelativeLayout) findViewById(a7.f.G9);
        this.f29296C = (TextView) findViewById(a7.f.gj);
        this.f29297D = (ImageView) findViewById(a7.f.f12297V2);
        this.f29298E = (FrameLayout) findViewById(a7.f.f12279T2);
        this.f29325o.setOnClickListener(this);
        this.f29326p.setOnClickListener(this);
        this.f29319i.setOnClickListener(this);
        this.f29320j.setOnClickListener(this);
        this.f29317g.setOnClickListener(this);
        this.f29316f.setOnClickListener(this);
        this.f29327q.setOnClickListener(this);
        this.f29295B.setOnClickListener(this);
        this.f29294A.setOnClickListener(this);
        if (AbstractC2237a.f44526o.booleanValue()) {
            I1();
        } else {
            this.f29298E.setVisibility(8);
            this.f29297D.setVisibility(8);
        }
        M1();
        H1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        P1();
        Thread thread = this.f29313T;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.f29313T = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f29314d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f29314d.getChildCount(); i9++) {
            if (this.f29314d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f29314d.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12380e && (context = this.f29299F) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new e()).g(getResources().getString(a7.j.f13231d4), new d()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f29299F.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f29299F.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f29299F.getResources().getString(a7.j.f13132S8), new f());
            c0158a.g(this.f29299F.getResources().getString(a7.j.f13231d4), new g());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f29299F.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f29299F.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f29299F.getResources().getString(a7.j.f13132S8), new h());
            c0158a2.g(this.f29299F.getResources().getString(a7.j.f13231d4), new i());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29313T;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29313T.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        O1();
        super.onResume();
        Thread thread = this.f29313T;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.f29313T = thread2;
            thread2.start();
        }
        w.m(this.f29299F);
        w.z0(this.f29299F);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f29300G = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f29300G.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        O1();
    }
}
