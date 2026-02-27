package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import b7.AbstractC1232b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.OpensubtitleActivity;
import com.nst.iptvsmarterstvbox.model.MultiUserDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import com.nst.iptvsmarterstvbox.sbpfunction.callbackclientreport.ClientFeedbackCallback;
import com.nst.iptvsmarterstvbox.vpn.activities.ProfileActivity;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SettingsActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public static SharedPreferences f32324Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static C2858a f32325a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static PopupWindow f32326b1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LinearLayout f32327A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public SharedPreferences.Editor f32328A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CardView f32329B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public String f32330B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public CardView f32331C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public String f32332C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public CardView f32333D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public FrameLayout f32334D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public LinearLayout f32335E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public LinearLayout f32336E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public LinearLayout f32337F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public Spinner f32338F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public LinearLayout f32339G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public Button f32340G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ImageView f32341H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public Button f32342H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CardView f32343I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public LinearLayout f32344I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public LinearLayout f32345J;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public LinearLayout f32346J0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public CardView f32347K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public CardView f32348K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public LinearLayout f32349L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public ImageView f32350L0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ImageView f32351M;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public ImageView f32352M0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public CardView f32353N;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public ImageView f32354N0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public LinearLayout f32355O;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public FrameLayout f32356O0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public ImageView f32357P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ImageView f32358P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Context f32359Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public ImageView f32360Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SharedPreferences f32361R;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public ImageView f32362R0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public LiveStreamDBHandler f32363S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public ImageView f32364S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public FrameLayout f32366T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public FrameLayout f32368U0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public PopupWindow f32369V;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public FrameLayout f32370V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public FrameLayout f32372W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public FrameLayout f32374X0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Button f32375Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public TextView f32376Y0;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f32377Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f32378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CardView f32379e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CardView f32380e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f32381f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public LinearLayout f32382f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CardView f32383g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ImageView f32384g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f32385h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ImageView f32386h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CardView f32387i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ImageView f32388i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f32389j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ImageView f32390j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CardView f32391k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ImageView f32392k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f32393l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ImageView f32394l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CardView f32395m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ImageView f32396m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f32397n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ImageView f32398n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CardView f32399o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ImageView f32400o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f32401p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ImageView f32402p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CardView f32403q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ImageView f32404q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f32405r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public ImageView f32406r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CardView f32407s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ImageView f32408s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LinearLayout f32409t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ImageView f32410t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CardView f32411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f32413v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public EditText f32414v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f32415w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public String f32416w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f32417x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public ProgressDialog f32418x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f32419y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f32420y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CardView f32421z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f32422z0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32365T = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f32367U = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f32371W = "";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f32373X = "";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Thread f32412u0 = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.this.f32369V.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32424a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SettingsActivity f32425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ EditText f32426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String[] f32427e;

        public b(String str, SettingsActivity settingsActivity, EditText editText, String[] strArr) {
            this.f32424a = str;
            this.f32425c = settingsActivity;
            this.f32426d = editText;
            this.f32427e = strArr;
        }

        public final boolean a(String str) {
            this.f32427e[0] = String.valueOf(this.f32426d.getText());
            String str2 = this.f32427e[0];
            return (str2 == null || str2.equals("") || this.f32427e[0].isEmpty() || str == null || str.isEmpty() || str.equals("") || !this.f32427e[0].equals(str)) ? false : true;
        }

        public final boolean b() {
            this.f32427e[0] = String.valueOf(this.f32426d.getText());
            String[] strArr = this.f32427e;
            if (strArr == null || !strArr[0].equals("")) {
                String[] strArr2 = this.f32427e;
                return (strArr2 == null || strArr2[0].equals("")) ? false : true;
            }
            Toast.makeText(this.f32425c, SettingsActivity.this.getResources().getString(a7.j.f13408v1), 1).show();
            return false;
        }

        public final void c(boolean z9) {
            if (z9) {
                SettingsActivity.this.f32369V.dismiss();
                d();
            } else {
                SettingsActivity settingsActivity = this.f32425c;
                if (settingsActivity != null) {
                    Toast.makeText(settingsActivity, SettingsActivity.this.getResources().getString(a7.j.f13147U4), 1).show();
                }
                this.f32426d.getText().clear();
            }
        }

        public final void d() {
            SettingsActivity.this.startActivity(new Intent(SettingsActivity.this, (Class<?>) ParentalControlActivitity.class));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b()) {
                c(a(this.f32424a));
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.this.f32369V.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String[] f32430a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditText f32431c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String[] f32432d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditText f32433e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Activity f32434f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f32435g;

        public d(String[] strArr, EditText editText, String[] strArr2, EditText editText2, Activity activity, String str) {
            this.f32430a = strArr;
            this.f32431c = editText;
            this.f32432d = strArr2;
            this.f32433e = editText2;
            this.f32434f = activity;
            this.f32435g = str;
        }

        public final boolean a() {
            String[] strArr;
            this.f32430a[0] = String.valueOf(this.f32431c.getText());
            this.f32432d[0] = String.valueOf(this.f32433e.getText());
            String[] strArr2 = this.f32430a;
            return (strArr2 == null || strArr2[0].equals("") || (strArr = this.f32432d) == null || strArr[0].equals("") || !this.f32430a[0].equals(this.f32432d[0])) ? false : true;
        }

        public final boolean b() {
            String[] strArr;
            Activity activity;
            Resources resources;
            int i9;
            this.f32430a[0] = String.valueOf(this.f32431c.getText());
            this.f32432d[0] = String.valueOf(this.f32433e.getText());
            String[] strArr2 = this.f32430a;
            if (strArr2 == null || !strArr2[0].equals("")) {
                String[] strArr3 = this.f32430a;
                if (strArr3 == null || strArr3[0].equals("") || (strArr = this.f32432d) == null || !strArr[0].equals("")) {
                    String[] strArr4 = this.f32430a;
                    return (strArr4 == null || this.f32432d == null || strArr4[0].equals("") || this.f32432d[0].equals("")) ? false : true;
                }
                activity = this.f32434f;
                resources = SettingsActivity.this.getResources();
                i9 = a7.j.f13138T4;
            } else {
                activity = this.f32434f;
                resources = SettingsActivity.this.getResources();
                i9 = a7.j.f13408v1;
            }
            Toast.makeText(activity, resources.getString(i9), 1).show();
            return false;
        }

        public final void c(boolean z9) {
            if (!z9) {
                Activity activity = this.f32434f;
                if (activity != null) {
                    Toast.makeText(activity, SettingsActivity.this.getResources().getString(a7.j.f13156V4), 1).show();
                }
                this.f32431c.getText().clear();
                this.f32433e.getText().clear();
                return;
            }
            PasswordDBModel passwordDBModel = new PasswordDBModel();
            passwordDBModel.setUserPassword(String.valueOf(this.f32430a[0]));
            passwordDBModel.setUserDetail(this.f32435g);
            passwordDBModel.setUserId(SharepreferenceDBHandler.getUserID(this.f32434f));
            if (SettingsActivity.this.f32363S != null) {
                SettingsActivity.this.f32363S.addPassword(passwordDBModel);
                SettingsActivity.this.f32369V.dismiss();
                d();
            }
        }

        public final void d() {
            SettingsActivity.this.startActivity(new Intent(this.f32434f, (Class<?>) ParentalControlActivitity.class));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (b()) {
                c(a());
            }
        }
    }

    public class e implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f32437a;

        public e(TextView textView) {
            this.f32437a = textView;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            SettingsActivity.this.f32332C0 = String.valueOf(adapterView.getItemAtPosition(i9));
            this.f32437a.setText(SettingsActivity.this.f32332C0);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SettingsActivity.this.i2()) {
                SettingsActivity.this.Y2();
                SettingsActivity.this.g2();
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.f32326b1.dismiss();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.f32326b1.dismiss();
        }
    }

    public class i implements Callback {
        public i() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Toast.makeText(SettingsActivity.this, "Something went wrong", 1).show();
            SettingsActivity.this.Z2();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            Toast toastMakeText;
            if (response == null || response.body() == null || !response.isSuccessful() || ((ClientFeedbackCallback) response.body()).a() == null) {
                SettingsActivity.this.Z2();
                Toast.makeText(SettingsActivity.this, "Something went wrong", 0).show();
                return;
            }
            if (((ClientFeedbackCallback) response.body()).a().equalsIgnoreCase("success")) {
                SettingsActivity settingsActivity = SettingsActivity.this;
                toastMakeText = Toast.makeText(settingsActivity, settingsActivity.getResources().getString(a7.j.f13229d2), 0);
            } else if (!((ClientFeedbackCallback) response.body()).a().equalsIgnoreCase("error")) {
                return;
            } else {
                toastMakeText = Toast.makeText(SettingsActivity.this, "Something went wrong", 0);
            }
            toastMakeText.show();
            SettingsActivity.f32326b1.dismiss();
            SettingsActivity.this.Z2();
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SettingsActivity.this.f32359Q);
        }
    }

    public class k implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f32444a;

        public k(View view) {
            this.f32444a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            View view3;
            Resources resources;
            int i9;
            View view4;
            View view5;
            if (z9) {
                View view6 = this.f32444a;
                if ((view6 == null || view6.getTag() == null || !this.f32444a.getTag().equals("spinnerOne")) && ((view4 = this.f32444a) == null || view4.getTag() == null || !this.f32444a.getTag().equals("ll_feedback"))) {
                    View view7 = this.f32444a;
                    if ((view7 == null || view7.getTag() == null || !this.f32444a.getTag().equals("8")) && ((view5 = this.f32444a) == null || view5.getTag() == null || !this.f32444a.getTag().equals("9"))) {
                        return;
                    }
                    resources = SettingsActivity.this.getResources();
                    i9 = a7.e.f12010h;
                } else {
                    resources = SettingsActivity.this.getResources();
                    i9 = a7.e.f12077x2;
                }
            } else {
                View view8 = this.f32444a;
                if ((view8 == null || view8.getTag() == null || !this.f32444a.getTag().equals("spinnerOne")) && ((view2 = this.f32444a) == null || view2.getTag() == null || !this.f32444a.getTag().equals("ll_feedback"))) {
                    View view9 = this.f32444a;
                    if ((view9 == null || view9.getTag() == null || !this.f32444a.getTag().equals("8")) && ((view3 = this.f32444a) == null || view3.getTag() == null || !this.f32444a.getTag().equals("9"))) {
                        return;
                    }
                    resources = SettingsActivity.this.getResources();
                    i9 = a7.e.f12038o;
                } else {
                    resources = SettingsActivity.this.getResources();
                    i9 = a7.e.f12073w2;
                }
            }
            view.setBackground(resources.getDrawable(i9));
        }
    }

    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SettingsActivity.this.onBackPressed();
        }
    }

    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(SettingsActivity.this.f32359Q);
                String strA = w.A(string);
                TextView textView = SettingsActivity.this.f32415w;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = SettingsActivity.this.f32413v;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(SettingsActivity.this.f32359Q);
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(SettingsActivity.this.f32359Q);
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class r implements DialogInterface.OnClickListener {
        public r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class s implements DialogInterface.OnClickListener {
        public s() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    SettingsActivity.this.k2();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class u implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f32455a;

        public u(View view) {
            this.f32455a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32455a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32455a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f32455a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            Object obj;
            float f9;
            ImageView imageView;
            int i9;
            View view2;
            View view3;
            if (z9) {
                float f10 = z9 ? 1.12f : 1.0f;
                b(f10);
                c(f10);
                View view4 = this.f32455a;
                if (view4 != null && view4.getTag() != null && this.f32455a.getTag().equals("2")) {
                    SettingsActivity.this.f32385h.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32396m0.setImageResource(a7.e.f11975X1);
                }
                View view5 = this.f32455a;
                if (view5 != null && view5.getTag() != null && this.f32455a.getTag().equals("3")) {
                    SettingsActivity.this.f32389j.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32388i0.setImageResource(a7.e.f11957R1);
                }
                if (!SharepreferenceDBHandler.getCurrentAPPType(SettingsActivity.this.f32359Q).equals("m3u") && (view3 = this.f32455a) != null && view3.getTag() != null && this.f32455a.getTag().equals("5")) {
                    SettingsActivity.this.f32393l.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32390j0.setImageResource(a7.e.f12013h2);
                }
                View view6 = this.f32455a;
                if (view6 != null && view6.getTag() != null && this.f32455a.getTag().equals("6")) {
                    SettingsActivity.this.f32397n.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32394l0.setImageResource(a7.e.f12029l2);
                }
                View view7 = this.f32455a;
                if (view7 != null && view7.getTag() != null && this.f32455a.getTag().equals("8")) {
                    SettingsActivity.this.f32375Y.setBackgroundResource(a7.e.f12010h);
                }
                View view8 = this.f32455a;
                if (view8 != null && view8.getTag() != null && this.f32455a.getTag().equals("9")) {
                    SettingsActivity.this.f32377Z.setBackgroundResource(a7.e.f12024k1);
                }
                View view9 = this.f32455a;
                if (view9 != null && view9.getTag() != null && this.f32455a.getTag().equals("10")) {
                    SettingsActivity.this.f32401p.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32392k0.setImageResource(a7.e.f11947O1);
                }
                View view10 = this.f32455a;
                if (view10 != null && view10.getTag() != null && this.f32455a.getTag().equals("11")) {
                    SettingsActivity.this.f32405r.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32386h0.setImageResource(a7.e.f11997d2);
                }
                View view11 = this.f32455a;
                if (view11 != null && view11.getTag() != null && this.f32455a.getTag().equals("12")) {
                    SettingsActivity.this.f32381f.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32398n0.setImageResource(a7.e.f11981Z1);
                }
                View view12 = this.f32455a;
                if (view12 != null && view12.getTag() != null && this.f32455a.getTag().equals("13")) {
                    SettingsActivity.this.f32419y.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32400o0.setImageResource(a7.e.f11989b2);
                }
                View view13 = this.f32455a;
                if (view13 != null && view13.getTag() != null && this.f32455a.getTag().equals("14")) {
                    SettingsActivity.this.f32335E.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32410t0.setImageResource(a7.e.f11896B2);
                }
                View view14 = this.f32455a;
                if (view14 != null && view14.getTag() != null && this.f32455a.getTag().equals("15")) {
                    SettingsActivity.this.f32327A.setBackgroundResource(a7.e.f11951P1);
                }
                View view15 = this.f32455a;
                if (view15 != null && view15.getTag() != null && this.f32455a.getTag().equals("16")) {
                    SettingsActivity.this.f32345J.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32402p0.setImageResource(a7.e.f11963T1);
                }
                View view16 = this.f32455a;
                if (view16 != null && view16.getTag() != null && this.f32455a.getTag().equals("17")) {
                    SettingsActivity.this.f32382f0.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32408s0.setImageResource(a7.e.f12037n2);
                }
                View view17 = this.f32455a;
                if (view17 != null && view17.getTag() != null && this.f32455a.getTag().equals("27")) {
                    SettingsActivity.this.f32344I0.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32350L0.setImageResource(a7.e.f11976Y);
                }
                View view18 = this.f32455a;
                if (view18 != null && view18.getTag() != null && this.f32455a.getTag().equals("18")) {
                    SettingsActivity.this.f32409t.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32404q0.setImageResource(a7.e.f11969V1);
                }
                View view19 = this.f32455a;
                if (view19 != null && view19.getTag() != null && this.f32455a.getTag().equals("19")) {
                    SettingsActivity.this.f32337F.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32406r0.setImageResource(a7.e.f12005f2);
                }
                View view20 = this.f32455a;
                if (view20 != null && view20.getTag() != null && this.f32455a.getTag().equals("115")) {
                    SettingsActivity.this.f32339G.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32341H.setImageResource(a7.e.f12005f2);
                }
                View view21 = this.f32455a;
                if (view21 != null && view21.getTag() != null && this.f32455a.getTag().equals("20")) {
                    SettingsActivity.this.f32349L.setBackgroundResource(a7.e.f11951P1);
                    SettingsActivity.this.f32351M.setImageResource(a7.e.f12021j2);
                }
                View view22 = this.f32455a;
                if (view22 == null || view22.getTag() == null || !this.f32455a.getTag().equals("21")) {
                    return;
                }
                SettingsActivity.this.f32355O.setBackgroundResource(a7.e.f11951P1);
                imageView = SettingsActivity.this.f32357P;
                i9 = a7.e.f12018j;
            } else {
                if (z9) {
                    return;
                }
                if (z9) {
                    obj = "15";
                    f9 = 1.09f;
                } else {
                    obj = "15";
                    f9 = 1.0f;
                }
                b(f9);
                c(f9);
                a(z9);
                View view23 = this.f32455a;
                if (view23 != null && view23.getTag() != null && this.f32455a.getTag().equals("2")) {
                    SettingsActivity.this.f32385h.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32396m0.setImageResource(a7.e.f11972W1);
                }
                View view24 = this.f32455a;
                if (view24 != null && view24.getTag() != null && this.f32455a.getTag().equals("3")) {
                    SettingsActivity.this.f32389j.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32388i0.setImageResource(a7.e.f11954Q1);
                }
                if (!SharepreferenceDBHandler.getCurrentAPPType(SettingsActivity.this.f32359Q).equals("m3u") && (view2 = this.f32455a) != null && view2.getTag() != null && this.f32455a.getTag().equals("5")) {
                    SettingsActivity.this.f32393l.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32390j0.setImageResource(a7.e.f12009g2);
                }
                View view25 = this.f32455a;
                if (view25 != null && view25.getTag() != null && this.f32455a.getTag().equals("27")) {
                    SettingsActivity.this.f32344I0.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32350L0.setImageResource(a7.e.f11973X);
                }
                View view26 = this.f32455a;
                if (view26 != null && view26.getTag() != null && this.f32455a.getTag().equals("6")) {
                    SettingsActivity.this.f32397n.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32394l0.setImageResource(a7.e.f12025k2);
                }
                View view27 = this.f32455a;
                if (view27 != null && view27.getTag() != null && this.f32455a.getTag().equals("8")) {
                    SettingsActivity.this.f32375Y.setBackgroundResource(a7.e.f12038o);
                }
                View view28 = this.f32455a;
                if (view28 != null && view28.getTag() != null && this.f32455a.getTag().equals("9")) {
                    SettingsActivity.this.f32377Z.setBackgroundResource(a7.e.f12038o);
                }
                View view29 = this.f32455a;
                if (view29 != null && view29.getTag() != null && this.f32455a.getTag().equals("10")) {
                    SettingsActivity.this.f32401p.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32392k0.setImageResource(a7.e.f11943N1);
                }
                View view30 = this.f32455a;
                if (view30 != null && view30.getTag() != null && this.f32455a.getTag().equals("11")) {
                    SettingsActivity.this.f32405r.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32386h0.setImageResource(a7.e.f11993c2);
                }
                View view31 = this.f32455a;
                if (view31 != null && view31.getTag() != null && this.f32455a.getTag().equals("12")) {
                    SettingsActivity.this.f32381f.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32398n0.setImageResource(a7.e.f11978Y1);
                }
                View view32 = this.f32455a;
                if (view32 != null && view32.getTag() != null && this.f32455a.getTag().equals("13")) {
                    SettingsActivity.this.f32419y.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32400o0.setImageResource(a7.e.f11985a2);
                }
                View view33 = this.f32455a;
                if (view33 != null && view33.getTag() != null && this.f32455a.getTag().equals("14")) {
                    SettingsActivity.this.f32335E.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32410t0.setImageResource(a7.e.f11979Z);
                }
                View view34 = this.f32455a;
                if (view34 != null && view34.getTag() != null && this.f32455a.getTag().equals(obj)) {
                    SettingsActivity.this.f32327A.setBackgroundResource(a7.e.f12084z1);
                }
                View view35 = this.f32455a;
                if (view35 != null && view35.getTag() != null && this.f32455a.getTag().equals("16")) {
                    SettingsActivity.this.f32345J.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32402p0.setImageResource(a7.e.f11960S1);
                }
                View view36 = this.f32455a;
                if (view36 != null && view36.getTag() != null && this.f32455a.getTag().equals("17")) {
                    SettingsActivity.this.f32382f0.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32408s0.setImageResource(a7.e.f12033m2);
                }
                View view37 = this.f32455a;
                if (view37 != null && view37.getTag() != null && this.f32455a.getTag().equals("18")) {
                    SettingsActivity.this.f32409t.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32404q0.setImageResource(a7.e.f11966U1);
                }
                View view38 = this.f32455a;
                if (view38 != null && view38.getTag() != null && this.f32455a.getTag().equals("19")) {
                    SettingsActivity.this.f32337F.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32406r0.setImageResource(a7.e.f12001e2);
                }
                View view39 = this.f32455a;
                if (view39 != null && view39.getTag() != null && this.f32455a.getTag().equals("115")) {
                    SettingsActivity.this.f32339G.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32341H.setImageResource(a7.e.f12001e2);
                }
                View view40 = this.f32455a;
                if (view40 != null && view40.getTag() != null && this.f32455a.getTag().equals("20")) {
                    SettingsActivity.this.f32349L.setBackgroundResource(a7.e.f12084z1);
                    SettingsActivity.this.f32351M.setImageResource(a7.e.f12017i2);
                }
                View view41 = this.f32455a;
                if (view41 == null || view41.getTag() == null || !this.f32455a.getTag().equals("21")) {
                    return;
                }
                SettingsActivity.this.f32355O.setBackgroundResource(a7.e.f12084z1);
                imageView = SettingsActivity.this.f32357P;
                i9 = a7.e.f12014i;
            }
            imageView.setImageResource(i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B2(View view) {
        startActivity(new Intent(this, (Class<?>) ScreenTypeSettingsActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M2(View view) {
        startActivity(new Intent(this, (Class<?>) ScreenTypeSettingsActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S2(View view) {
        startActivity(new Intent(this, (Class<?>) BackupAndRestoreActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T2(View view) {
        startActivity(new Intent(this, (Class<?>) BackupAndRestoreActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    private void h2() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void j2() {
        if (AbstractC2237a.f44526o.booleanValue() && AbstractC2237a.f44475V0.booleanValue() && (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals(""))) {
            d3(true);
        } else {
            d3(false);
        }
    }

    public static String l2() {
        try {
        } catch (Exception unused) {
        }
        for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
            if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                byte[] hardwareAddress = networkInterface.getHardwareAddress();
                if (hardwareAddress == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                for (byte b9 : hardwareAddress) {
                    sb.append(String.format("%02X:", Byte.valueOf(b9)));
                }
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                return sb.toString();
            }
            return "";
        }
        return "";
    }

    private void o2() {
        this.f32359Q = this;
        this.f32363S = new LiveStreamDBHandler(this.f32359Q);
        this.f32361R = getSharedPreferences("loginPrefs", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
            try {
                new w.j(this, this.f32359Q, f32325a1).show();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            intent = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
            startActivity(intent);
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
            try {
                new w.j(this, this.f32359Q, f32325a1).show();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            intent = new Intent(this, (Class<?>) AddedExternalPlayerActivity.class);
            startActivity(intent);
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
    }

    public final /* synthetic */ void A2(View view) {
        startActivity(new Intent(this, (Class<?>) AutomationActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public final /* synthetic */ void C2(View view) {
        startActivity(new Intent(this, (Class<?>) GeneralSettingsActivity.class));
    }

    public final /* synthetic */ void D2(View view) {
        startActivity(new Intent(this, (Class<?>) GeneralSettingsActivity.class));
    }

    public final /* synthetic */ void E2(View view) {
        startActivity(new Intent(this, (Class<?>) CheckAppupdateActivity.class));
    }

    public final /* synthetic */ void F2(View view) {
        startActivity(new Intent(this, (Class<?>) CheckAppupdateActivity.class));
    }

    public final /* synthetic */ void G2(View view) {
        startActivity(new Intent(this, (Class<?>) OpensubtitleActivity.class));
    }

    public final /* synthetic */ void H2(View view) {
        startActivity(new Intent(this, (Class<?>) OpensubtitleActivity.class));
    }

    public final /* synthetic */ void I2(View view) {
        Intent intent = new Intent(this, (Class<?>) ProfileActivity.class);
        intent.putExtra("typeid", "settings");
        startActivity(intent);
    }

    public final /* synthetic */ void J2(View view) {
        Intent intent = new Intent(this, (Class<?>) ProfileActivity.class);
        intent.putExtra("typeid", "settings");
        startActivity(intent);
    }

    public final /* synthetic */ void K2(View view) {
        c3(this.f32359Q);
    }

    public final /* synthetic */ void L2(View view) {
        c3(this.f32359Q);
    }

    public final /* synthetic */ void N2(View view) {
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        } else {
            startActivity(new Intent(this, (Class<?>) MultiSettingActivity.class));
        }
    }

    public final /* synthetic */ void O2(View view) {
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        } else {
            startActivity(new Intent(this, (Class<?>) MultiSettingActivity.class));
        }
    }

    public final /* synthetic */ void P2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue() || !AbstractC2237a.f44475V0.booleanValue()) {
            intent = new Intent(this, (Class<?>) SpeedTestActivity.class);
        } else {
            if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
                try {
                    new w.j(this, this.f32359Q, f32325a1).show();
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            intent = new Intent(this, (Class<?>) SpeedTestActivity.class);
        }
        startActivity(intent);
    }

    public final /* synthetic */ void Q2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue() || !AbstractC2237a.f44475V0.booleanValue()) {
            intent = new Intent(this, (Class<?>) SpeedTestActivity.class);
        } else {
            if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
                try {
                    new w.j(this, this.f32359Q, f32325a1).show();
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            intent = new Intent(this, (Class<?>) SpeedTestActivity.class);
        }
        startActivity(intent);
    }

    public final /* synthetic */ void R2(View view) {
        ArrayList<MultiUserDBModel> userDetails = new MultiUserDBHandler(this.f32359Q).getUserDetails(SharepreferenceDBHandler.getUserID(this.f32359Q));
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("m3u") && userDetails != null && userDetails.size() > 0 && userDetails.get(0).getM3uType().equalsIgnoreCase(TransferTable.COLUMN_FILE)) {
            Toast.makeText(getApplicationContext(), "Coming Soon", 0).show();
        } else {
            Intent intent = new Intent(this, (Class<?>) ActivateOnTVActivity.class);
            startActivity(intent);
        }
    }

    public final /* synthetic */ void U2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue() || !AbstractC2237a.f44475V0.booleanValue()) {
            intent = new Intent(this, (Class<?>) PlayerSelectionActivity.class);
        } else {
            if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
                try {
                    new w.j(this, this.f32359Q, f32325a1).show();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            intent = new Intent(this, (Class<?>) PlayerSelectionActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public final /* synthetic */ void V2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue() || !AbstractC2237a.f44475V0.booleanValue()) {
            intent = new Intent(this, (Class<?>) PlayerSelectionActivity.class);
        } else {
            if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
                try {
                    new w.j(this, this.f32359Q, f32325a1).show();
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            intent = new Intent(this, (Class<?>) PlayerSelectionActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public final /* synthetic */ void W2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue() || !AbstractC2237a.f44475V0.booleanValue()) {
            intent = new Intent(this, (Class<?>) PlayerSettingsActivity.class);
        } else {
            if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
                try {
                    new w.j(this, this.f32359Q, f32325a1).show();
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            intent = new Intent(this, (Class<?>) PlayerSettingsActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public final /* synthetic */ void X2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue() || !AbstractC2237a.f44475V0.booleanValue()) {
            intent = new Intent(this, (Class<?>) PlayerSettingsActivity.class);
        } else {
            if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
                try {
                    new w.j(this, this.f32359Q, f32325a1).show();
                    return;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return;
                }
            }
            intent = new Intent(this, (Class<?>) PlayerSettingsActivity.class);
        }
        startActivity(intent);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public void Y2() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f32418x0 = progressDialog;
        progressDialog.setMessage("Please wait.....");
        this.f32418x0.show();
        this.f32418x0.setCancelable(false);
    }

    public void Z2() {
        this.f32418x0.dismiss();
    }

    public final void a3(SettingsActivity settingsActivity, int i9, String str, String str2, String str3) {
        View viewInflate = ((LayoutInflater) settingsActivity.getSystemService("layout_inflater")).inflate(f32325a1.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12721T4 : a7.g.f12715S4, (RelativeLayout) settingsActivity.findViewById(a7.f.We));
        PopupWindow popupWindow = new PopupWindow(settingsActivity);
        this.f32369V = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f32369V.setWidth(-1);
        this.f32369V.setHeight(-1);
        this.f32369V.setFocusable(true);
        this.f32369V.showAtLocation(viewInflate, 17, 0, 0);
        this.f32375Y = (Button) viewInflate.findViewById(a7.f.f12157H0);
        this.f32377Z = (Button) viewInflate.findViewById(a7.f.f12482o0);
        Button button = this.f32375Y;
        if (button != null) {
            button.setOnFocusChangeListener(new u(button));
        }
        Button button2 = this.f32377Z;
        if (button2 != null) {
            button2.setOnFocusChangeListener(new u(button2));
        }
        EditText editText = (EditText) viewInflate.findViewById(a7.f.f12434j3);
        editText.requestFocus();
        this.f32377Z.setOnClickListener(new a());
        this.f32375Y.setOnClickListener(new b(str3, settingsActivity, editText, new String[1]));
    }

    public void b3() {
        this.f32343I.setOnClickListener(new View.OnClickListener() { // from class: p7.A0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46575a.p2(view);
            }
        });
        this.f32345J.setOnClickListener(new View.OnClickListener() { // from class: p7.C0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46581a.q2(view);
            }
        });
        this.f32349L.setOnClickListener(new View.OnClickListener() { // from class: p7.O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46602a.B2(view);
            }
        });
        this.f32347K.setOnClickListener(new View.OnClickListener() { // from class: p7.U0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46616a.M2(view);
            }
        });
        this.f32355O.setOnClickListener(new View.OnClickListener() { // from class: p7.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46618a.S2(view);
            }
        });
        this.f32353N.setOnClickListener(new View.OnClickListener() { // from class: p7.X0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46622a.T2(view);
            }
        });
        this.f32346J0.setOnClickListener(new View.OnClickListener() { // from class: p7.Y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46623a.U2(view);
            }
        });
        this.f32379e.setOnClickListener(new View.OnClickListener() { // from class: p7.Z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46626a.V2(view);
            }
        });
        this.f32419y.setOnClickListener(new View.OnClickListener() { // from class: p7.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46630a.W2(view);
            }
        });
        this.f32383g.setOnClickListener(new View.OnClickListener() { // from class: p7.b1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46633a.X2(view);
            }
        });
        this.f32385h.setOnClickListener(new View.OnClickListener() { // from class: p7.L0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46594a.r2(view);
            }
        });
        this.f32387i.setOnClickListener(new View.OnClickListener() { // from class: p7.W0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46621a.s2(view);
            }
        });
        this.f32389j.setOnClickListener(new View.OnClickListener() { // from class: p7.c1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46637a.t2(view);
            }
        });
        this.f32391k.setOnClickListener(new View.OnClickListener() { // from class: p7.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46642a.u2(view);
            }
        });
        this.f32393l.setOnClickListener(new View.OnClickListener() { // from class: p7.e1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46645a.v2(view);
            }
        });
        this.f32395m.setOnClickListener(new View.OnClickListener() { // from class: p7.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46647a.w2(view);
            }
        });
        this.f32397n.setOnClickListener(new View.OnClickListener() { // from class: p7.g1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46649a.x2(view);
            }
        });
        this.f32399o.setOnClickListener(new View.OnClickListener() { // from class: p7.h1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46651a.y2(view);
            }
        });
        this.f32401p.setOnClickListener(new View.OnClickListener() { // from class: p7.i1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46653a.z2(view);
            }
        });
        this.f32403q.setOnClickListener(new View.OnClickListener() { // from class: p7.B0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46578a.A2(view);
            }
        });
        this.f32405r.setOnClickListener(new View.OnClickListener() { // from class: p7.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46583a.C2(view);
            }
        });
        this.f32411u.setOnClickListener(new View.OnClickListener() { // from class: p7.E0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46584a.D2(view);
            }
        });
        this.f32327A.setOnClickListener(new View.OnClickListener() { // from class: p7.F0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46585a.E2(view);
            }
        });
        this.f32421z.setOnClickListener(new View.OnClickListener() { // from class: p7.G0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46586a.F2(view);
            }
        });
        this.f32335E.setOnClickListener(new View.OnClickListener() { // from class: p7.H0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46587a.G2(view);
            }
        });
        this.f32329B.setOnClickListener(new View.OnClickListener() { // from class: p7.I0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46588a.H2(view);
            }
        });
        this.f32382f0.setOnClickListener(new View.OnClickListener() { // from class: p7.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46590a.I2(view);
            }
        });
        this.f32380e0.setOnClickListener(new View.OnClickListener() { // from class: p7.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46592a.J2(view);
            }
        });
        this.f32344I0.setOnClickListener(new View.OnClickListener() { // from class: p7.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46597a.K2(view);
            }
        });
        this.f32348K0.setOnClickListener(new View.OnClickListener() { // from class: p7.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46599a.L2(view);
            }
        });
        this.f32407s.setOnClickListener(new View.OnClickListener() { // from class: p7.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46604a.N2(view);
            }
        });
        this.f32409t.setOnClickListener(new View.OnClickListener() { // from class: p7.Q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46607a.O2(view);
            }
        });
        this.f32337F.setOnClickListener(new View.OnClickListener() { // from class: p7.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46608a.P2(view);
            }
        });
        this.f32331C.setOnClickListener(new View.OnClickListener() { // from class: p7.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46610a.Q2(view);
            }
        });
        this.f32339G.setOnClickListener(new View.OnClickListener() { // from class: p7.T0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f46613a.R2(view);
            }
        });
    }

    public void c3(Context context) {
        if (context != null) {
            View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a7.g.f12659J2, (ViewGroup) null);
            PopupWindow popupWindow = new PopupWindow(context);
            f32326b1 = popupWindow;
            popupWindow.setContentView(viewInflate);
            f32326b1.setWidth(-1);
            f32326b1.setHeight(-1);
            f32326b1.setFocusable(true);
            f32326b1.setBackgroundDrawable(new BitmapDrawable());
            f32326b1.showAtLocation(viewInflate, 17, 0, 0);
            this.f32336E0 = (LinearLayout) viewInflate.findViewById(a7.f.f12429i8);
            this.f32334D0 = (FrameLayout) viewInflate.findViewById(a7.f.ha);
            this.f32338F0 = (Spinner) viewInflate.findViewById(a7.f.Bg);
            this.f32340G0 = (Button) viewInflate.findViewById(a7.f.Eg);
            this.f32342H0 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            this.f32414v0 = (EditText) viewInflate.findViewById(a7.f.f12180J3);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this, a7.g.f12631E4, new String[]{"Live", "Movies", "Series"});
            arrayAdapter.setDropDownViewResource(a7.g.f12631E4);
            this.f32338F0.setAdapter((SpinnerAdapter) arrayAdapter);
            this.f32338F0.setSelection(0);
            this.f32338F0.setOnItemSelectedListener(new e((TextView) findViewById(a7.f.Zg)));
            this.f32340G0.setOnClickListener(new f());
            this.f32342H0.setOnClickListener(new g());
            ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12281T4);
            this.f32414v0.requestFocus();
            if (imageView != null) {
                imageView.setOnFocusChangeListener(new w.k((View) imageView, (Activity) this));
            }
            Spinner spinner = this.f32338F0;
            if (spinner != null) {
                spinner.setOnFocusChangeListener(new w.k((View) spinner, (Activity) this));
            }
            LinearLayout linearLayout = this.f32336E0;
            if (linearLayout != null) {
                linearLayout.setOnFocusChangeListener(new w.k((View) linearLayout, (Activity) this));
            }
            Button button = this.f32340G0;
            if (button != null) {
                button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            }
            imageView.setOnClickListener(new h());
            Spinner spinner2 = this.f32338F0;
            spinner2.setOnFocusChangeListener(new k(spinner2));
            LinearLayout linearLayout2 = this.f32336E0;
            linearLayout2.setOnFocusChangeListener(new k(linearLayout2));
            Button button2 = this.f32340G0;
            button2.setOnFocusChangeListener(new k(button2));
            Button button3 = this.f32342H0;
            button3.setOnFocusChangeListener(new k(button3));
            this.f32340G0.setNextFocusRightId(a7.f.f12482o0);
            this.f32342H0.setNextFocusLeftId(a7.f.Eg);
            this.f32342H0.setNextFocusUpId(a7.f.f12180J3);
            this.f32340G0.setNextFocusUpId(a7.f.f12180J3);
            this.f32336E0.setNextFocusDownId(a7.f.Eg);
        }
    }

    public final void d3(boolean z9) {
        ImageView imageView;
        int i9;
        if (z9) {
            imageView = this.f32352M0;
            i9 = 0;
        } else {
            imageView = this.f32352M0;
            i9 = 8;
        }
        imageView.setVisibility(i9);
        this.f32354N0.setVisibility(i9);
        this.f32362R0.setVisibility(i9);
        this.f32358P0.setVisibility(i9);
        this.f32360Q0.setVisibility(i9);
        this.f32364S0.setVisibility(i9);
        this.f32366T0.setVisibility(i9);
        this.f32356O0.setVisibility(i9);
        this.f32368U0.setVisibility(i9);
        this.f32370V0.setVisibility(i9);
        this.f32372W0.setVisibility(i9);
        this.f32374X0.setVisibility(i9);
    }

    public final void e3(Activity activity, int i9, String str) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(f32325a1.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12709R4 : a7.g.f12703Q4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f32369V = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f32369V.setWidth(-1);
            this.f32369V.setHeight(-1);
            this.f32369V.setFocusable(true);
            this.f32369V.showAtLocation(viewInflate, 17, 0, 0);
            this.f32375Y = (Button) viewInflate.findViewById(a7.f.f12157H0);
            this.f32377Z = (Button) viewInflate.findViewById(a7.f.f12482o0);
            Button button = this.f32375Y;
            if (button != null) {
                button.setOnFocusChangeListener(new u(button));
            }
            Button button2 = this.f32377Z;
            if (button2 != null) {
                button2.setOnFocusChangeListener(new u(button2));
            }
            EditText editText = (EditText) viewInflate.findViewById(a7.f.Jk);
            EditText editText2 = (EditText) viewInflate.findViewById(a7.f.ni);
            if (activity.getSharedPreferences("selected_language", 0).getString("selected_language", "English").equalsIgnoreCase("Arabic")) {
                editText.setGravity(21);
                editText2.setGravity(21);
            }
            this.f32377Z.setOnClickListener(new c());
            this.f32375Y.setOnClickListener(new d(new String[1], editText, new String[1], editText2, activity, str));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void g2() {
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32361R = sharedPreferences;
        this.f32420y0 = sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
        this.f32422z0 = this.f32361R.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "");
        this.f32328A0 = this.f32361R.edit();
        this.f32416w0 = this.f32414v0.getText().toString().trim();
        String str = new SimpleDateFormat("yyyy-MM").format(new Date());
        String strO0 = w.o0(AbstractC2237a.f44469S0 + "*Njh0&$@HAH828283636JSJSHS*" + AbstractC1232b.f17695b + "*" + str);
        Retrofit retrofitE0 = w.E0(this.f32359Q);
        if (retrofitE0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitE0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", AbstractC2237a.f44469S0);
            jsonObject.addProperty("s", AbstractC2237a.f44471T0);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str);
            jsonObject.addProperty("sc", strO0);
            jsonObject.addProperty("action", "addclientfeedback");
            jsonObject.addProperty("feedback", this.f32416w0);
            jsonObject.addProperty(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, this.f32420y0);
            jsonObject.addProperty("macaddress", this.f32330B0);
            retrofitPost.clientsFeedbackRequest(jsonObject).enqueue(new i());
        }
    }

    public boolean i2() {
        if (this.f32414v0.getText().toString().trim().length() != 0) {
            return true;
        }
        Toast.makeText(this, "Please enter feedback", 0).show();
        return false;
    }

    public void k2() {
        runOnUiThread(new m());
    }

    public void m2() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public final void n2() {
        this.f32344I0 = (LinearLayout) findViewById(a7.f.f12439j8);
        this.f32348K0 = (CardView) findViewById(a7.f.f12128E1);
        this.f32350L0 = (ImageView) findViewById(a7.f.f12416h5);
        this.f32352M0 = (ImageView) findViewById(a7.f.Pa);
        this.f32354N0 = (ImageView) findViewById(a7.f.Ta);
        this.f32356O0 = (FrameLayout) findViewById(a7.f.f12395f4);
        this.f32358P0 = (ImageView) findViewById(a7.f.Qa);
        this.f32360Q0 = (ImageView) findViewById(a7.f.Ra);
        this.f32362R0 = (ImageView) findViewById(a7.f.Oa);
        this.f32364S0 = (ImageView) findViewById(a7.f.Sa);
        this.f32366T0 = (FrameLayout) findViewById(a7.f.f12344a4);
        this.f32368U0 = (FrameLayout) findViewById(a7.f.f12364c4);
        this.f32370V0 = (FrameLayout) findViewById(a7.f.f12374d4);
        this.f32372W0 = (FrameLayout) findViewById(a7.f.f12334Z3);
        this.f32374X0 = (FrameLayout) findViewById(a7.f.f12385e4);
        this.f32376Y0 = (TextView) findViewById(a7.f.Fm);
        this.f32380e0 = (CardView) findViewById(a7.f.f12119D2);
        this.f32382f0 = (LinearLayout) findViewById(a7.f.Fa);
        this.f32384g0 = (ImageView) findViewById(a7.f.f12141F4);
        this.f32386h0 = (ImageView) findViewById(a7.f.f12446k5);
        this.f32388i0 = (ImageView) findViewById(a7.f.f12375d5);
        this.f32390j0 = (ImageView) findViewById(a7.f.f12387e6);
        this.f32392k0 = (ImageView) findViewById(a7.f.f12121D4);
        this.f32394l0 = (ImageView) findViewById(a7.f.f12407g6);
        this.f32396m0 = (ImageView) findViewById(a7.f.f12152G5);
        this.f32398n0 = (ImageView) findViewById(a7.f.f12262R5);
        this.f32400o0 = (ImageView) findViewById(a7.f.f12272S5);
        this.f32402p0 = (ImageView) findViewById(a7.f.f12386e5);
        this.f32404q0 = (ImageView) findViewById(a7.f.f12122D5);
        this.f32406r0 = (ImageView) findViewById(a7.f.f12366c6);
        this.f32408s0 = (ImageView) findViewById(a7.f.f12437j6);
        this.f32410t0 = (ImageView) findViewById(a7.f.f12537t4);
        this.f32378d = (Toolbar) findViewById(a7.f.kh);
        this.f32346J0 = (LinearLayout) findViewById(a7.f.bf);
        this.f32379e = (CardView) findViewById(a7.f.f12089A2);
        this.f32381f = (LinearLayout) findViewById(a7.f.u9);
        this.f32383g = (CardView) findViewById(a7.f.f12099B2);
        this.f32385h = (LinearLayout) findViewById(a7.f.Se);
        this.f32387i = (CardView) findViewById(a7.f.Te);
        this.f32389j = (LinearLayout) findViewById(a7.f.le);
        this.f32391k = (CardView) findViewById(a7.f.f12470me);
        this.f32393l = (LinearLayout) findViewById(a7.f.of);
        this.f32395m = (CardView) findViewById(a7.f.pf);
        this.f32397n = (LinearLayout) findViewById(a7.f.tf);
        this.f32399o = (CardView) findViewById(a7.f.uf);
        this.f32401p = (LinearLayout) findViewById(a7.f.Td);
        this.f32403q = (CardView) findViewById(a7.f.Ud);
        this.f32405r = (LinearLayout) findViewById(a7.f.qe);
        this.f32407s = (CardView) findViewById(a7.f.tb);
        this.f32409t = (LinearLayout) findViewById(a7.f.sb);
        this.f32411u = (CardView) findViewById(a7.f.re);
        this.f32413v = (TextView) findViewById(a7.f.f12129E2);
        this.f32415w = (TextView) findViewById(a7.f.gh);
        this.f32417x = (ImageView) findViewById(a7.f.Xa);
        this.f32419y = (LinearLayout) findViewById(a7.f.cf);
        this.f32421z = (CardView) findViewById(a7.f.f12108C1);
        this.f32327A = (LinearLayout) findViewById(a7.f.f12310W6);
        this.f32329B = (CardView) findViewById(a7.f.f12098B1);
        this.f32331C = (CardView) findViewById(a7.f.Ag);
        this.f32333D = (CardView) findViewById(a7.f.th);
        this.f32335E = (LinearLayout) findViewById(a7.f.f12213M6);
        this.f32337F = (LinearLayout) findViewById(a7.f.zg);
        this.f32339G = (LinearLayout) findViewById(a7.f.f12410h);
        this.f32341H = (ImageView) findViewById(a7.f.f12547u4);
        this.f32343I = (CardView) findViewById(a7.f.f12595z2);
        this.f32345J = (LinearLayout) findViewById(a7.f.f12419h8);
        this.f32347K = (CardView) findViewById(a7.f.f12168I1);
        this.f32349L = (LinearLayout) findViewById(a7.f.N9);
        this.f32351M = (ImageView) findViewById(a7.f.f12346a6);
        this.f32353N = (CardView) findViewById(a7.f.f12118D1);
        this.f32355O = (LinearLayout) findViewById(a7.f.f12388e7);
        this.f32357P = (ImageView) findViewById(a7.f.f12191K4);
        b3();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f32359Q = this;
        m2();
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f32359Q);
        f32325a1 = c2858a;
        String strA = c2858a.A();
        String strL2 = l2();
        this.f32330B0 = strL2;
        if (strL2.equals("") || this.f32330B0.isEmpty()) {
            this.f32330B0 = w.I(this.f32359Q);
        }
        setContentView(SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("m3u") ? strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12723U0 : a7.g.f12717T0 : strA.equals(AbstractC2237a.f44453K0) ? a7.g.f12729V0 : a7.g.f12711S0);
        n2();
        AbstractC2237a.f44490c = false;
        AbstractC2237a.f44493d = true;
        j2();
        SharepreferenceDBHandler.setTypeLogin("settings", this.f32359Q);
        if (strA.equals(AbstractC2237a.f44453K0)) {
            this.f32333D.setVisibility(4);
        }
        TextView textView = this.f32376Y0;
        if (textView != null) {
            textView.setText("v5.0");
            this.f32376Y0.setAlpha(0.4f);
        }
        CardView cardView = this.f32343I;
        if (cardView != null) {
            cardView.setOnFocusChangeListener(new u(cardView));
        }
        CardView cardView2 = this.f32347K;
        if (cardView2 != null) {
            cardView2.setOnFocusChangeListener(new u(cardView2));
        }
        CardView cardView3 = this.f32348K0;
        if (cardView3 != null) {
            cardView3.setOnFocusChangeListener(new u(cardView3));
        }
        CardView cardView4 = this.f32353N;
        if (cardView4 != null) {
            cardView4.setOnFocusChangeListener(new u(cardView4));
        }
        CardView cardView5 = this.f32407s;
        if (cardView5 != null) {
            cardView5.setOnFocusChangeListener(new u(cardView5));
        }
        CardView cardView6 = this.f32331C;
        if (cardView6 != null) {
            cardView6.setOnFocusChangeListener(new u(cardView6));
        }
        CardView cardView7 = this.f32333D;
        if (cardView7 != null) {
            cardView7.setOnFocusChangeListener(new u(cardView7));
        }
        CardView cardView8 = this.f32379e;
        if (cardView8 != null) {
            cardView8.setOnFocusChangeListener(new u(cardView8));
        }
        CardView cardView9 = this.f32387i;
        if (cardView9 != null) {
            cardView9.setOnFocusChangeListener(new u(cardView9));
        }
        CardView cardView10 = this.f32391k;
        if (cardView10 != null) {
            cardView10.setOnFocusChangeListener(new u(cardView10));
        }
        CardView cardView11 = this.f32395m;
        if (cardView11 != null) {
            cardView11.setOnFocusChangeListener(new u(cardView11));
        }
        CardView cardView12 = this.f32399o;
        if (cardView12 != null) {
            cardView12.setOnFocusChangeListener(new u(cardView12));
        }
        CardView cardView13 = this.f32403q;
        if (cardView13 != null) {
            cardView13.setOnFocusChangeListener(new u(cardView13));
        }
        CardView cardView14 = this.f32411u;
        if (cardView14 != null) {
            cardView14.setOnFocusChangeListener(new u(cardView14));
            if (strA.equals(AbstractC2237a.f44453K0)) {
                this.f32411u.requestFocus();
                this.f32411u.setFocusableInTouchMode(true);
            }
            this.f32411u.requestFocus();
        }
        CardView cardView15 = this.f32380e0;
        cardView15.setOnFocusChangeListener(new u(cardView15));
        CardView cardView16 = this.f32348K0;
        cardView16.setOnFocusChangeListener(new u(cardView16));
        CardView cardView17 = this.f32383g;
        if (cardView17 != null) {
            cardView17.setOnFocusChangeListener(new u(cardView17));
        }
        Boolean bool = AbstractC2237a.f44475V0;
        if (bool.booleanValue()) {
            this.f32421z.setVisibility(0);
        }
        CardView cardView18 = this.f32421z;
        cardView18.setOnFocusChangeListener(new u(cardView18));
        CardView cardView19 = this.f32329B;
        cardView19.setOnFocusChangeListener(new u(cardView19));
        if (bool.booleanValue()) {
            boolean isAppExistOnPlayStore = SharepreferenceDBHandler.getIsAppExistOnPlayStore(this.f32359Q);
            if (!isAppExistOnPlayStore) {
                new m7.b(this).execute(new Void[0]);
            }
            if (isAppExistOnPlayStore) {
                this.f32329B.setVisibility(0);
                this.f32421z.setVisibility(0);
                CardView cardView20 = this.f32421z;
                cardView20.setOnFocusChangeListener(new u(cardView20));
                CardView cardView21 = this.f32329B;
                cardView21.setOnFocusChangeListener(new u(cardView21));
            }
        }
        this.f32417x.setOnClickListener(new j());
        this.f32384g0.setOnClickListener(new l());
        getWindow().setFlags(1024, 1024);
        h2();
        r1((Toolbar) findViewById(a7.f.kh));
        o2();
        Thread thread = this.f32412u0;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new t());
            this.f32412u0 = thread2;
            thread2.start();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f32378d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f32378d.getChildCount(); i9++) {
            if (this.f32378d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f32378d.getChildAt(i9).getLayoutParams()).f39307a = 16;
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
        if (itemId == a7.f.f12380e && (context = this.f32359Q) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new o()).g(getResources().getString(a7.j.f13231d4), new n()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f32359Q.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f32359Q.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f32359Q.getResources().getString(a7.j.f13132S8), new p());
            c0158a.g(this.f32359Q.getResources().getString(a7.j.f13231d4), new q());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f32359Q.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f32359Q.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f32359Q.getResources().getString(a7.j.f13132S8), new r());
            c0158a2.g(this.f32359Q.getResources().getString(a7.j.f13231d4), new s());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f32412u0;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f32412u0.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        CardView cardView;
        m2();
        super.onResume();
        j2();
        Thread thread = this.f32412u0;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new t());
            this.f32412u0 = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        w.m(this.f32359Q);
        w.z0(this.f32359Q);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f32361R = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f32361R.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else {
            SharedPreferences sharedPreferences2 = getSharedPreferences("selectedPlayer", 0);
            this.f32361R = sharedPreferences2;
            if (!sharedPreferences2.getString("selectedPlayer", getResources().getString(a7.j.f13389t2)).equals(getResources().getString(a7.j.f13389t2)) ? (cardView = this.f32383g) != null : (cardView = this.f32383g) != null) {
                cardView.setVisibility(0);
            }
        }
        SharedPreferences sharedPreferences3 = getSharedPreferences("timeFormat", 0);
        f32324Z0 = sharedPreferences3;
        sharedPreferences3.getString("timeFormat", AbstractC2237a.f44441E0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        m2();
    }

    public final /* synthetic */ void r2(View view) {
        String string;
        String str;
        String str2;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                string = getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f32359Q);
                this.f32363S = liveStreamDBHandler;
                ArrayList<PasswordDBModel> allPassword = liveStreamDBHandler.getAllPassword(SharepreferenceDBHandler.getUserID(this.f32359Q));
                if (allPassword != null) {
                    String userDetail = "";
                    String userPassword = userDetail;
                    for (PasswordDBModel passwordDBModel : allPassword) {
                        if (passwordDBModel.getUserDetail().equals(string) && !passwordDBModel.getUserPassword().isEmpty()) {
                            userDetail = passwordDBModel.getUserDetail();
                            userPassword = passwordDBModel.getUserPassword();
                        }
                    }
                    str = userDetail;
                    str2 = userPassword;
                } else {
                    str = "";
                    str2 = str;
                }
                if (str == null || str.equals("") || str.isEmpty()) {
                    if (string.isEmpty() || string.equals("")) {
                        return;
                    }
                    e3(this, 100, string);
                    return;
                }
                a3(this, 100, string, str, str2);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                string = getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(this.f32359Q);
                this.f32363S = liveStreamDBHandler2;
                ArrayList<PasswordDBModel> allPassword2 = liveStreamDBHandler2.getAllPassword(SharepreferenceDBHandler.getUserID(this.f32359Q));
                if (allPassword2 != null) {
                    String userDetail2 = "";
                    String userPassword2 = userDetail2;
                    for (PasswordDBModel passwordDBModel2 : allPassword2) {
                        if (passwordDBModel2.getUserDetail().equals(string) && !passwordDBModel2.getUserPassword().isEmpty()) {
                            userDetail2 = passwordDBModel2.getUserDetail();
                            userPassword2 = passwordDBModel2.getUserPassword();
                        }
                    }
                    str = userDetail2;
                    str2 = userPassword2;
                } else {
                    str = "";
                    str2 = str;
                }
                if (str == null || str.equals("") || str.isEmpty()) {
                    if (string.isEmpty() || string.equals("")) {
                        return;
                    }
                    e3(this, 100, string);
                    return;
                }
                a3(this, 100, string, str, str2);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
            try {
                new w.j(this, this.f32359Q, f32325a1).show();
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            string = getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            LiveStreamDBHandler liveStreamDBHandler3 = new LiveStreamDBHandler(this.f32359Q);
            this.f32363S = liveStreamDBHandler3;
            ArrayList<PasswordDBModel> allPassword3 = liveStreamDBHandler3.getAllPassword(SharepreferenceDBHandler.getUserID(this.f32359Q));
            if (allPassword3 != null) {
                String userDetail3 = "";
                String userPassword3 = userDetail3;
                for (PasswordDBModel passwordDBModel3 : allPassword3) {
                    if (passwordDBModel3.getUserDetail().equals(string) && !passwordDBModel3.getUserPassword().isEmpty()) {
                        userDetail3 = passwordDBModel3.getUserDetail();
                        userPassword3 = passwordDBModel3.getUserPassword();
                    }
                }
                str = userDetail3;
                str2 = userPassword3;
            } else {
                str = "";
                str2 = str;
            }
            if (str == null || str.equals("") || str.isEmpty()) {
                if (string.isEmpty() || string.equals("")) {
                    return;
                }
                e3(this, 100, string);
                return;
            }
            a3(this, 100, string, str, str2);
            return;
        }
        Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
    }

    public final /* synthetic */ void s2(View view) {
        String string;
        String str;
        String str2;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                string = getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(this.f32359Q);
                this.f32363S = liveStreamDBHandler;
                ArrayList<PasswordDBModel> allPassword = liveStreamDBHandler.getAllPassword(SharepreferenceDBHandler.getUserID(this.f32359Q));
                if (allPassword != null) {
                    String userDetail = "";
                    String userPassword = userDetail;
                    for (PasswordDBModel passwordDBModel : allPassword) {
                        if (passwordDBModel.getUserDetail().equals(string) && !passwordDBModel.getUserPassword().isEmpty()) {
                            userDetail = passwordDBModel.getUserDetail();
                            userPassword = passwordDBModel.getUserPassword();
                        }
                    }
                    str = userDetail;
                    str2 = userPassword;
                } else {
                    str = "";
                    str2 = str;
                }
                if (str == null || str.equals("") || str.isEmpty()) {
                    if (string.isEmpty() || string.equals("")) {
                        return;
                    }
                    e3(this, 100, string);
                    return;
                }
                a3(this, 100, string, str, str2);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                string = getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
                LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(this.f32359Q);
                this.f32363S = liveStreamDBHandler2;
                ArrayList<PasswordDBModel> allPassword2 = liveStreamDBHandler2.getAllPassword(SharepreferenceDBHandler.getUserID(this.f32359Q));
                if (allPassword2 != null) {
                    String userDetail2 = "";
                    String userPassword2 = userDetail2;
                    for (PasswordDBModel passwordDBModel2 : allPassword2) {
                        if (passwordDBModel2.getUserDetail().equals(string) && !passwordDBModel2.getUserPassword().isEmpty()) {
                            userDetail2 = passwordDBModel2.getUserDetail();
                            userPassword2 = passwordDBModel2.getUserPassword();
                        }
                    }
                    str = userDetail2;
                    str2 = userPassword2;
                } else {
                    str = "";
                    str2 = str;
                }
                if (str == null || str.equals("") || str.isEmpty()) {
                    if (string.isEmpty() || string.equals("")) {
                        return;
                    }
                    e3(this, 100, string);
                    return;
                }
                a3(this, 100, string, str, str2);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
            try {
                new w.j(this, this.f32359Q, f32325a1).show();
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            string = getSharedPreferences("loginPrefs", 0).getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "");
            LiveStreamDBHandler liveStreamDBHandler3 = new LiveStreamDBHandler(this.f32359Q);
            this.f32363S = liveStreamDBHandler3;
            ArrayList<PasswordDBModel> allPassword3 = liveStreamDBHandler3.getAllPassword(SharepreferenceDBHandler.getUserID(this.f32359Q));
            if (allPassword3 != null) {
                String userDetail3 = "";
                String userPassword3 = userDetail3;
                for (PasswordDBModel passwordDBModel3 : allPassword3) {
                    if (passwordDBModel3.getUserDetail().equals(string) && !passwordDBModel3.getUserPassword().isEmpty()) {
                        userDetail3 = passwordDBModel3.getUserDetail();
                        userPassword3 = passwordDBModel3.getUserPassword();
                    }
                }
                str = userDetail3;
                str2 = userPassword3;
            } else {
                str = "";
                str2 = str;
            }
            if (str == null || str.equals("") || str.isEmpty()) {
                if (string.isEmpty() || string.equals("")) {
                    return;
                }
                e3(this, 100, string);
                return;
            }
            a3(this, 100, string, str, str2);
            return;
        }
        Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
    }

    public final /* synthetic */ void t2(View view) {
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        } else {
            startActivity(new Intent(this, (Class<?>) EPGSettingsActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    public final /* synthetic */ void u2(View view) {
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        } else {
            startActivity(new Intent(this, (Class<?>) EPGSettingsActivity.class));
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        }
    }

    public final /* synthetic */ void v2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) StreamFormatActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) StreamFormatActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
            try {
                new w.j(this, this.f32359Q, f32325a1).show();
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            intent = new Intent(this, (Class<?>) StreamFormatActivity.class);
            startActivity(intent);
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
    }

    public final /* synthetic */ void w2(View view) {
        Intent intent;
        if (!AbstractC2237a.f44526o.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) StreamFormatActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (!AbstractC2237a.f44475V0.booleanValue()) {
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
                intent = new Intent(this, (Class<?>) StreamFormatActivity.class);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                return;
            }
            Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
        }
        if (f32325a1.k() == null || f32325a1.n() == null || f32325a1.l() == 0 || f32325a1.k().equals("") || f32325a1.n().equals("")) {
            try {
                new w.j(this, this.f32359Q, f32325a1).show();
                return;
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.f32359Q).equals("stalker_api")) {
            intent = new Intent(this, (Class<?>) StreamFormatActivity.class);
            startActivity(intent);
            overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            return;
        }
        Toast.makeText(this.f32359Q, "This feature has been disabled.", 1).show();
    }

    public final /* synthetic */ void x2(View view) {
        startActivity(new Intent(this, (Class<?>) TimeFormatActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public final /* synthetic */ void y2(View view) {
        startActivity(new Intent(this, (Class<?>) TimeFormatActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    public final /* synthetic */ void z2(View view) {
        startActivity(new Intent(this, (Class<?>) AutomationActivity.class));
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }
}
