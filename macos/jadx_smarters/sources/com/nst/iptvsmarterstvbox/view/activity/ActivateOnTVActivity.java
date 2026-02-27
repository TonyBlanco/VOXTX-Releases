package com.nst.iptvsmarterstvbox.view.activity;

import Y6.s;
import Y6.t;
import Y6.u;
import android.R;
import android.animation.ObjectAnimator;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import b7.AbstractC1232b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.Constants;
import com.chaos.view.PinView;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.MultiUserDBModel;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.MobileCodeActiveCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeGenerateCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeVerifyCallBack;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import m7.AbstractC2237a;
import m7.w;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class ActivateOnTVActivity extends androidx.appcompat.app.b implements View.OnClickListener, FirebasePresenter.OnTvCodeProcessListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f29018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f29019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Button f29020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f29021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f29022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f29023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public EditText f29024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PinView f29025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f29026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f29027m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f29028n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Context f29029o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SharedPreferences f29030p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C2858a f29031q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public FirebasePresenter f29033s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29034t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ProgressDialog f29035u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Thread f29032r = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f29036v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.activity.result.c f29037w = registerForActivityResult(new s(), new androidx.activity.result.b() { // from class: p7.a
        @Override // androidx.activity.result.b
        public final void a(Object obj) {
            this.f46627a.H1((Y6.t) obj);
        }
    });

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Log.e("TAG", editable.toString());
            ActivateOnTVActivity.this.f29036v = editable.toString();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            Log.d("TAG", "onTextChanged() called with: s = [" + ((Object) charSequence) + "], start = [" + i9 + "], before = [" + i10 + "], count = [" + i11 + "]");
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(ActivateOnTVActivity.this.f29029o);
                String strA = w.A(string);
                TextView textView = ActivateOnTVActivity.this.f29022h;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = ActivateOnTVActivity.this.f29021g;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(ActivateOnTVActivity.this.f29029o);
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
            w.n0(ActivateOnTVActivity.this.f29029o);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(ActivateOnTVActivity.this.f29029o);
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
                    ActivateOnTVActivity.this.y1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f29048a;

        public k(View view) {
            this.f29048a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29048a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29048a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            View view3;
            int i9;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                View view4 = this.f29048a;
                if (view4 == null || view4.getTag() == null || !this.f29048a.getTag().equals("1")) {
                    View view5 = this.f29048a;
                    if (view5 == null || view5.getTag() == null || !this.f29048a.getTag().equals("2")) {
                        View view6 = this.f29048a;
                        if (view6 == null || view6.getTag() == null) {
                            return;
                        }
                        this.f29048a.setBackground(ActivateOnTVActivity.this.getResources().getDrawable(a7.e.f11931K1));
                        return;
                    }
                    a(f9);
                    b(f9);
                    view3 = this.f29048a;
                    i9 = a7.e.f12024k1;
                } else {
                    a(f9);
                    b(f9);
                    view3 = this.f29048a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                View view7 = this.f29048a;
                if ((view7 == null || view7.getTag() == null || !this.f29048a.getTag().equals("1")) && ((view2 = this.f29048a) == null || view2.getTag() == null || !this.f29048a.getTag().equals("2"))) {
                    return;
                }
                view3 = this.f29048a;
                i9 = a7.e.f12038o;
            }
            view3.setBackgroundResource(i9);
        }
    }

    private void F1() {
        try {
            ProgressDialog progressDialog = this.f29035u;
            if (progressDialog == null || !progressDialog.isShowing()) {
                return;
            }
            Log.e("honey", "hideProgressDialog");
            this.f29035u.dismiss();
        } catch (Exception unused) {
        }
    }

    private void G1() {
        this.f29029o = this;
    }

    private void x1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void z1() {
        Button button = this.f29020f;
        if (button != null) {
            button.setOnFocusChangeListener(new k(button));
            this.f29020f.requestFocus();
            this.f29020f.requestFocusFromTouch();
        }
    }

    public String A1() {
        return (this.f29029o == null || !AbstractC2237a.f44536s.booleanValue()) ? "" : this.f29029o.getSharedPreferences("loginprefsmultiuser", 0).getString("name", "");
    }

    public final String B1() {
        Context context = this.f29029o;
        if (context == null) {
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        this.f29030p = sharedPreferences;
        return sharedPreferences.getString("serverM3UUrl", "");
    }

    public String C1() {
        Context context = this.f29029o;
        if (context == null) {
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefsserverurl", 0);
        this.f29030p = sharedPreferences;
        return sharedPreferences.getString(AbstractC2237a.f44454L, "");
    }

    public String D1() {
        Context context = this.f29029o;
        if (context == null) {
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        this.f29030p = sharedPreferences;
        return sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
    }

    public String E1() {
        Context context = this.f29029o;
        if (context == null) {
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("loginPrefs", 0);
        this.f29030p = sharedPreferences;
        return sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
    }

    public final /* synthetic */ void H1(t tVar) {
        String str;
        if (tVar.a() != null) {
            String strA = tVar.a();
            this.f29036v = strA;
            this.f29025k.setText(strA);
            this.f29020f.performClick();
            return;
        }
        Intent intentB = tVar.b();
        if (intentB == null) {
            str = "Cancelled";
        } else if (!intentB.hasExtra("MISSING_CAMERA_PERMISSION")) {
            return;
        } else {
            str = "Cancelled due to missing camera permission";
        }
        Toast.makeText(this, str, 1).show();
    }

    public final void I1() {
        try {
            ProgressDialog progressDialog = new ProgressDialog(this.f29029o);
            this.f29035u = progressDialog;
            progressDialog.setCanceledOnTouchOutside(false);
            this.f29035u.setMessage(this.f29029o.getResources().getString(a7.j.f13392t5));
            this.f29035u.show();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void O0(TVCodeVerifyCallBack tVCodeVerifyCallBack) {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void S0(MobileCodeActiveCallBack mobileCodeActiveCallBack) {
        try {
            F1();
            if (mobileCodeActiveCallBack == null || mobileCodeActiveCallBack.getResult() == null || mobileCodeActiveCallBack.getSc() == null) {
                return;
            }
            if (!mobileCodeActiveCallBack.getResult().equals("success")) {
                if (mobileCodeActiveCallBack.getResult().equals("error")) {
                    ((mobileCodeActiveCallBack.getMessage() == null || mobileCodeActiveCallBack.getMessage().length() <= 0) ? Toast.makeText(this, getResources().getString(a7.j.f13244e7), 0) : Toast.makeText(this, mobileCodeActiveCallBack.getMessage(), 1)).show();
                    return;
                }
                return;
            }
            if (mobileCodeActiveCallBack.getSc().equalsIgnoreCase(w.o0(AbstractC2237a.f44469S0 + "*JNHGHG34534543HSDHSHSSH*&^klih*" + AbstractC1232b.f17695b + "*" + new SimpleDateFormat("yyyy-MM").format(new Date())))) {
                Toast.makeText(this, getResources().getString(a7.j.f13210b3), 1).show();
                finish();
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void W0() {
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void n0() {
        try {
            F1();
            Toast.makeText(this, getResources().getString(a7.j.f12956B2), 0).show();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        J6.b bVarB = J6.a.b(i9, i10, intent);
        if (bVarB == null) {
            super.onActivityResult(i9, i10, intent);
        } else {
            if (bVarB.a() == null) {
                return;
            }
            String strA = bVarB.a();
            this.f29036v = strA;
            this.f29025k.setText(strA);
            this.f29020f.performClick();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        if (id != a7.f.f12227O0) {
            if (id == a7.f.f12443k2 || id == a7.f.f12217N0) {
                this.f29037w.a(new u().f(ToolbarCaptureActivity.class));
                return;
            }
            return;
        }
        try {
            String str = this.f29036v;
            if (str != null) {
                if (str.length() == 6) {
                    String str2 = new SimpleDateFormat("yyyy-MM").format(new Date());
                    v1();
                    String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str2);
                    I1();
                    this.f29033s.k(AbstractC2237a.f44469S0, AbstractC2237a.f44471T0, str2, strO0, str, D1(), E1(), A1(), C1(), SharepreferenceDBHandler.getCurrentAPPType(this.f29029o), B1(), 0, "", "");
                } else {
                    Toast.makeText(getApplicationContext(), "Please input code that is displaying on your TV.", 1).show();
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        ArrayList<MultiUserDBModel> userDetails;
        this.f29029o = this;
        super.onCreate(bundle);
        this.f29031q = new C2858a(this.f29029o);
        this.f29033s = new FirebasePresenter(this.f29029o, this);
        this.f29031q.A();
        setContentView(a7.g.f12772c);
        w.Y(this);
        this.f29018d = (Toolbar) findViewById(a7.f.kh);
        this.f29019e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f29020f = (Button) findViewById(a7.f.f12227O0);
        this.f29021g = (TextView) findViewById(a7.f.f12129E2);
        this.f29022h = (TextView) findViewById(a7.f.gh);
        this.f29023i = (ImageView) findViewById(a7.f.Xa);
        this.f29024j = (EditText) findViewById(a7.f.f12343a3);
        this.f29025k = (PinView) findViewById(a7.f.f12200L3);
        this.f29026l = (TextView) findViewById(a7.f.f12259R2);
        this.f29027m = (TextView) findViewById(a7.f.f12443k2);
        this.f29028n = (LinearLayout) findViewById(a7.f.f12217N0);
        this.f29020f.setOnClickListener(this);
        this.f29027m.setOnClickListener(this);
        z1();
        x1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        G1();
        Thread thread = this.f29032r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.f29032r = thread2;
            thread2.start();
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f29029o) != null && SharepreferenceDBHandler.getCurrentAPPType(this.f29029o).equalsIgnoreCase("m3u") && (userDetails = new MultiUserDBHandler(this.f29029o).getUserDetails(SharepreferenceDBHandler.getUserID(this.f29029o))) != null && userDetails.size() > 0 && userDetails.get(0).getM3uType().equalsIgnoreCase(TransferTable.COLUMN_FILE)) {
            this.f29026l.setText(a7.j.f13347p0);
            this.f29025k.setVisibility(8);
            this.f29020f.setVisibility(8);
        }
        ((InputMethodManager) getSystemService("input_method")).toggleSoftInput(2, 1);
        this.f29025k.addTextChangedListener(new a());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f29018d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f29018d.getChildCount(); i9++) {
            if (this.f29018d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f29018d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f29029o) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new e()).g(getResources().getString(a7.j.f13231d4), new d()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f29029o.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f29029o.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f29029o.getResources().getString(a7.j.f13132S8), new f());
            c0158a.g(this.f29029o.getResources().getString(a7.j.f13231d4), new g());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f29029o.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f29029o.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f29029o.getResources().getString(a7.j.f13132S8), new h());
            c0158a2.g(this.f29029o.getResources().getString(a7.j.f13231d4), new i());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f29032r;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f29032r.interrupt();
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f29032r;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new j());
            this.f29032r = thread2;
            thread2.start();
        }
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f29030p = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f29030p.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void t0() {
    }

    public void v1() {
        int iNextInt = new Random().nextInt(8378600) + Constants.MAXIMUM_UPLOAD_PARTS;
        this.f29034t = iNextInt;
        AbstractC1232b.f17695b = String.valueOf(iNextInt);
    }

    @Override // com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.OnTvCodeProcessListener
    public void x(TVCodeGenerateCallBack tVCodeGenerateCallBack) {
    }

    public void y1() {
        runOnUiThread(new b());
        this.f29023i.setOnClickListener(new c());
    }
}
