package com.nst.iptvsmarterstvbox.view.activity;

import P.AbstractC0980w;
import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.j0;

/* JADX INFO: loaded from: classes4.dex */
public class VodActivityNewFlow extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static ProgressBar f33253W;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f33254A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public j0 f33255B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SearchView f33256C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f33258E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f33259F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f33260G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f33261H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f33262I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public PopupWindow f33264K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Handler f33265L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public MenuItem f33266M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Menu f33267N;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public ImageView f33270Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SeriesRecentWatchDatabase f33271R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public List f33273T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Boolean f33274U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Boolean f33275V;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f33276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Toolbar f33277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppBarLayout f33278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f33279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f33280h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f33281i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f33282j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f33283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f33284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f33285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f33286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f33287o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f33288p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f33289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences f33290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RecyclerView.o f33291s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LiveStreamDBHandler f33295w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayList f33297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ArrayList f33298z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f33292t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f33293u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33294v = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f33296x = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f33257D = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f33263J = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public AsyncTask f33268O = null;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f33269P = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ArrayList f33272S = new ArrayList();

    public class a implements SearchView.m {
        public a() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            AbstractC2237a.f44515k0 = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            VodActivityNewFlow.this.f33282j.setVisibility(8);
            if (VodActivityNewFlow.this.f33255B == null || (textView = VodActivityNewFlow.this.f33282j) == null || textView.getVisibility() == 0) {
                return false;
            }
            VodActivityNewFlow.this.f33255B.x0(str, VodActivityNewFlow.this.f33282j);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlow.this.f33264K.dismiss();
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f33301a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f33302c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f33303d;

        public c(RadioGroup radioGroup, View view, Activity activity) {
            this.f33301a = radioGroup;
            this.f33302c = view;
            this.f33303d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton = (RadioButton) this.f33302c.findViewById(this.f33301a.getCheckedRadioButtonId());
            SharepreferenceDBHandler.setVodActivitynewFlowSort(radioButton.getText().toString().equals(VodActivityNewFlow.this.getResources().getString(a7.j.f13254f7)) ? "1" : radioButton.getText().toString().equals(VodActivityNewFlow.this.getResources().getString(a7.j.f13304k7)) ? "2" : "0", this.f33303d);
            VodActivityNewFlow.this.f33268O = VodActivityNewFlow.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            VodActivityNewFlow.this.f33264K.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlow.this.f33289q.startActivity(new Intent(VodActivityNewFlow.this.f33289q, (Class<?>) NewDashboardActivity.class));
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(VodActivityNewFlow.this.f33289q);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VodActivityNewFlow.this.onBackPressed();
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(VodActivityNewFlow.this.f33289q);
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(VodActivityNewFlow.this.f33289q);
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class m implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f33314a;

        public m(View view) {
            this.f33314a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33314a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33314a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f33314a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            if (z9) {
                b(1.15f);
                c(1.15f);
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(z9);
            }
        }
    }

    public class n extends AsyncTask {
        public n() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(VodActivityNewFlow.this.F1());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            VodActivityNewFlow.this.G1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public VodActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f33274U = bool;
        this.f33275V = bool;
    }

    private void A1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList B1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f33295w.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f33289q));
        this.f33258E = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f33257D.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f33257D;
    }

    private ArrayList C1(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) it.next();
            if (arrayList2 != null) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    } else {
                        ArrayList arrayList3 = this.f33259F;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
        }
        return this.f33259F;
    }

    private void D1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    private void E1() {
        this.f33270Q = (ImageView) findViewById(a7.f.Xa);
        this.f33276d = (ProgressBar) findViewById(a7.f.ec);
        this.f33277e = (Toolbar) findViewById(a7.f.kh);
        this.f33278f = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f33279g = (LinearLayout) findViewById(a7.f.cb);
        this.f33280h = (ProgressBar) findViewById(a7.f.oc);
        this.f33281i = (RecyclerView) findViewById(a7.f.ub);
        this.f33282j = (TextView) findViewById(a7.f.f12249Q2);
        this.f33283k = (FrameLayout) findViewById(a7.f.f12250Q3);
        this.f33284l = (TextView) findViewById(a7.f.f12435j4);
        this.f33285m = (RelativeLayout) findViewById(a7.f.Af);
        this.f33286n = (RelativeLayout) findViewById(a7.f.Oe);
        this.f33287o = (Button) findViewById(a7.f.f12523s0);
        this.f33288p = (ImageView) findViewById(a7.f.f12141F4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0107 A[Catch: NullPointerException | Exception -> 0x0376, NullPointerException | Exception -> 0x0376, TryCatch #0 {NullPointerException | Exception -> 0x0376, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0091, B:9:0x0091, B:10:0x00a1, B:10:0x00a1, B:13:0x00b1, B:13:0x00b1, B:16:0x00bd, B:16:0x00bd, B:17:0x00cf, B:17:0x00cf, B:22:0x00f4, B:22:0x00f4, B:26:0x010b, B:26:0x010b, B:28:0x011b, B:28:0x011b, B:30:0x011f, B:30:0x011f, B:32:0x012d, B:32:0x012d, B:34:0x0133, B:34:0x0133, B:36:0x013f, B:36:0x013f, B:38:0x0143, B:38:0x0143, B:41:0x014b, B:41:0x014b, B:43:0x0153, B:43:0x0153, B:45:0x0157, B:45:0x0157, B:48:0x015f, B:48:0x015f, B:50:0x0171, B:50:0x0171, B:52:0x0183, B:52:0x0183, B:54:0x0195, B:54:0x0195, B:56:0x01a9, B:56:0x01a9, B:61:0x0220, B:61:0x0220, B:62:0x0225, B:62:0x0225, B:57:0x01d2, B:57:0x01d2, B:59:0x01f6, B:59:0x01f6, B:60:0x01f8, B:60:0x01f8, B:63:0x0229, B:63:0x0229, B:65:0x022d, B:65:0x022d, B:67:0x0233, B:67:0x0233, B:99:0x031e, B:99:0x031e, B:102:0x0323, B:102:0x0323, B:104:0x032b, B:104:0x032b, B:68:0x0239, B:68:0x0239, B:70:0x023d, B:70:0x023d, B:73:0x0245, B:73:0x0245, B:75:0x024d, B:75:0x024d, B:77:0x0251, B:77:0x0251, B:80:0x0259, B:80:0x0259, B:82:0x026b, B:82:0x026b, B:84:0x027d, B:84:0x027d, B:86:0x028f, B:86:0x028f, B:88:0x02a1, B:88:0x02a1, B:90:0x02b5, B:90:0x02b5, B:92:0x030c, B:92:0x030c, B:93:0x030e, B:93:0x030e, B:91:0x02e1, B:91:0x02e1, B:94:0x0312, B:94:0x0312, B:96:0x0316, B:96:0x0316, B:33:0x0130, B:33:0x0130, B:25:0x0107, B:25:0x0107, B:18:0x00d7, B:18:0x00d7, B:21:0x00e3, B:21:0x00e3), top: B:108:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130 A[Catch: NullPointerException | Exception -> 0x0376, NullPointerException | Exception -> 0x0376, TryCatch #0 {NullPointerException | Exception -> 0x0376, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0091, B:9:0x0091, B:10:0x00a1, B:10:0x00a1, B:13:0x00b1, B:13:0x00b1, B:16:0x00bd, B:16:0x00bd, B:17:0x00cf, B:17:0x00cf, B:22:0x00f4, B:22:0x00f4, B:26:0x010b, B:26:0x010b, B:28:0x011b, B:28:0x011b, B:30:0x011f, B:30:0x011f, B:32:0x012d, B:32:0x012d, B:34:0x0133, B:34:0x0133, B:36:0x013f, B:36:0x013f, B:38:0x0143, B:38:0x0143, B:41:0x014b, B:41:0x014b, B:43:0x0153, B:43:0x0153, B:45:0x0157, B:45:0x0157, B:48:0x015f, B:48:0x015f, B:50:0x0171, B:50:0x0171, B:52:0x0183, B:52:0x0183, B:54:0x0195, B:54:0x0195, B:56:0x01a9, B:56:0x01a9, B:61:0x0220, B:61:0x0220, B:62:0x0225, B:62:0x0225, B:57:0x01d2, B:57:0x01d2, B:59:0x01f6, B:59:0x01f6, B:60:0x01f8, B:60:0x01f8, B:63:0x0229, B:63:0x0229, B:65:0x022d, B:65:0x022d, B:67:0x0233, B:67:0x0233, B:99:0x031e, B:99:0x031e, B:102:0x0323, B:102:0x0323, B:104:0x032b, B:104:0x032b, B:68:0x0239, B:68:0x0239, B:70:0x023d, B:70:0x023d, B:73:0x0245, B:73:0x0245, B:75:0x024d, B:75:0x024d, B:77:0x0251, B:77:0x0251, B:80:0x0259, B:80:0x0259, B:82:0x026b, B:82:0x026b, B:84:0x027d, B:84:0x027d, B:86:0x028f, B:86:0x028f, B:88:0x02a1, B:88:0x02a1, B:90:0x02b5, B:90:0x02b5, B:92:0x030c, B:92:0x030c, B:93:0x030e, B:93:0x030e, B:91:0x02e1, B:91:0x02e1, B:94:0x0312, B:94:0x0312, B:96:0x0316, B:96:0x0316, B:33:0x0130, B:33:0x0130, B:25:0x0107, B:25:0x0107, B:18:0x00d7, B:18:0x00d7, B:21:0x00e3, B:21:0x00e3), top: B:108:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013f A[Catch: NullPointerException | Exception -> 0x0376, NullPointerException | Exception -> 0x0376, TryCatch #0 {NullPointerException | Exception -> 0x0376, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0091, B:9:0x0091, B:10:0x00a1, B:10:0x00a1, B:13:0x00b1, B:13:0x00b1, B:16:0x00bd, B:16:0x00bd, B:17:0x00cf, B:17:0x00cf, B:22:0x00f4, B:22:0x00f4, B:26:0x010b, B:26:0x010b, B:28:0x011b, B:28:0x011b, B:30:0x011f, B:30:0x011f, B:32:0x012d, B:32:0x012d, B:34:0x0133, B:34:0x0133, B:36:0x013f, B:36:0x013f, B:38:0x0143, B:38:0x0143, B:41:0x014b, B:41:0x014b, B:43:0x0153, B:43:0x0153, B:45:0x0157, B:45:0x0157, B:48:0x015f, B:48:0x015f, B:50:0x0171, B:50:0x0171, B:52:0x0183, B:52:0x0183, B:54:0x0195, B:54:0x0195, B:56:0x01a9, B:56:0x01a9, B:61:0x0220, B:61:0x0220, B:62:0x0225, B:62:0x0225, B:57:0x01d2, B:57:0x01d2, B:59:0x01f6, B:59:0x01f6, B:60:0x01f8, B:60:0x01f8, B:63:0x0229, B:63:0x0229, B:65:0x022d, B:65:0x022d, B:67:0x0233, B:67:0x0233, B:99:0x031e, B:99:0x031e, B:102:0x0323, B:102:0x0323, B:104:0x032b, B:104:0x032b, B:68:0x0239, B:68:0x0239, B:70:0x023d, B:70:0x023d, B:73:0x0245, B:73:0x0245, B:75:0x024d, B:75:0x024d, B:77:0x0251, B:77:0x0251, B:80:0x0259, B:80:0x0259, B:82:0x026b, B:82:0x026b, B:84:0x027d, B:84:0x027d, B:86:0x028f, B:86:0x028f, B:88:0x02a1, B:88:0x02a1, B:90:0x02b5, B:90:0x02b5, B:92:0x030c, B:92:0x030c, B:93:0x030e, B:93:0x030e, B:91:0x02e1, B:91:0x02e1, B:94:0x0312, B:94:0x0312, B:96:0x0316, B:96:0x0316, B:33:0x0130, B:33:0x0130, B:25:0x0107, B:25:0x0107, B:18:0x00d7, B:18:0x00d7, B:21:0x00e3, B:21:0x00e3), top: B:108:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0239 A[Catch: NullPointerException | Exception -> 0x0376, NullPointerException | Exception -> 0x0376, TryCatch #0 {NullPointerException | Exception -> 0x0376, blocks: (B:3:0x0007, B:5:0x000c, B:9:0x0091, B:9:0x0091, B:10:0x00a1, B:10:0x00a1, B:13:0x00b1, B:13:0x00b1, B:16:0x00bd, B:16:0x00bd, B:17:0x00cf, B:17:0x00cf, B:22:0x00f4, B:22:0x00f4, B:26:0x010b, B:26:0x010b, B:28:0x011b, B:28:0x011b, B:30:0x011f, B:30:0x011f, B:32:0x012d, B:32:0x012d, B:34:0x0133, B:34:0x0133, B:36:0x013f, B:36:0x013f, B:38:0x0143, B:38:0x0143, B:41:0x014b, B:41:0x014b, B:43:0x0153, B:43:0x0153, B:45:0x0157, B:45:0x0157, B:48:0x015f, B:48:0x015f, B:50:0x0171, B:50:0x0171, B:52:0x0183, B:52:0x0183, B:54:0x0195, B:54:0x0195, B:56:0x01a9, B:56:0x01a9, B:61:0x0220, B:61:0x0220, B:62:0x0225, B:62:0x0225, B:57:0x01d2, B:57:0x01d2, B:59:0x01f6, B:59:0x01f6, B:60:0x01f8, B:60:0x01f8, B:63:0x0229, B:63:0x0229, B:65:0x022d, B:65:0x022d, B:67:0x0233, B:67:0x0233, B:99:0x031e, B:99:0x031e, B:102:0x0323, B:102:0x0323, B:104:0x032b, B:104:0x032b, B:68:0x0239, B:68:0x0239, B:70:0x023d, B:70:0x023d, B:73:0x0245, B:73:0x0245, B:75:0x024d, B:75:0x024d, B:77:0x0251, B:77:0x0251, B:80:0x0259, B:80:0x0259, B:82:0x026b, B:82:0x026b, B:84:0x027d, B:84:0x027d, B:86:0x028f, B:86:0x028f, B:88:0x02a1, B:88:0x02a1, B:90:0x02b5, B:90:0x02b5, B:92:0x030c, B:92:0x030c, B:93:0x030e, B:93:0x030e, B:91:0x02e1, B:91:0x02e1, B:94:0x0312, B:94:0x0312, B:96:0x0316, B:96:0x0316, B:33:0x0130, B:33:0x0130, B:25:0x0107, B:25:0x0107, B:18:0x00d7, B:18:0x00d7, B:21:0x00e3, B:21:0x00e3), top: B:108:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean F1() {
        /*
            Method dump skipped, instruction units count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlow.F1():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G1() {
        View view;
        int i9 = 8;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f33289q).equals("m3u")) {
            if (this.f33261H == null || this.f33269P == 0) {
                ProgressBar progressBar = this.f33276d;
                if (progressBar == null) {
                    return;
                }
                progressBar.setVisibility(8);
                view = this.f33286n;
                i9 = 0;
            } else {
                this.f33255B = new j0(this.f33273T, this.f33289q);
                this.f33281i.setItemAnimator(new androidx.recyclerview.widget.c());
                this.f33281i.setAdapter(this.f33255B);
                view = this.f33276d;
                if (view == null) {
                    return;
                }
            }
        } else {
            if (this.f33261H == null) {
                return;
            }
            this.f33255B = new j0(this.f33273T, this.f33289q);
            this.f33281i.setItemAnimator(new androidx.recyclerview.widget.c());
            this.f33281i.setAdapter(this.f33255B);
            view = this.f33276d;
            if (view == null) {
                return;
            }
        }
        view.setVisibility(i9);
    }

    private void H1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f33264K = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f33264K.setWidth(-1);
            this.f33264K.setHeight(-1);
            this.f33264K.setFocusable(true);
            this.f33264K.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) viewInflate.findViewById(a7.f.md);
            radioButton2.setVisibility(8);
            RadioButton radioButton3 = (RadioButton) viewInflate.findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) viewInflate.findViewById(a7.f.zd);
            RadioButton radioButton5 = (RadioButton) viewInflate.findViewById(a7.f.gd);
            radioButton5.setVisibility(8);
            RadioButton radioButton6 = (RadioButton) viewInflate.findViewById(a7.f.hd);
            radioButton6.setVisibility(8);
            radioButton.setOnFocusChangeListener(new m(radioButton));
            radioButton2.setOnFocusChangeListener(new m(radioButton2));
            radioButton3.setOnFocusChangeListener(new m(radioButton3));
            radioButton4.setOnFocusChangeListener(new m(radioButton4));
            radioButton5.setOnFocusChangeListener(new m(radioButton5));
            radioButton6.setOnFocusChangeListener(new m(radioButton6));
            String vodActivitynewFlowSort = SharepreferenceDBHandler.getVodActivitynewFlowSort(activity);
            if (vodActivitynewFlowSort.equals("1")) {
                radioButton3.setChecked(true);
            } else if (vodActivitynewFlowSort.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new b());
            button.setOnClickListener(new c(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ProgressBar progressBar;
        FrameLayout frameLayout = this.f33283k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.f33281i;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        j0 j0Var = this.f33255B;
        if (j0Var != null && (progressBar = f33253W) != null) {
            j0Var.F0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        } else if (id == a7.f.f12211M4) {
            this.f33268O = new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D1();
        setContentView(a7.g.f12622D1);
        E1();
        this.f33289q = this;
        AppBarLayout appBarLayout = this.f33278f;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        AbstractC2237a.f44515k0 = Boolean.FALSE;
        A1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        Handler handler = new Handler();
        this.f33265L = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.f33276d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f33297y = new ArrayList();
        this.f33298z = new ArrayList();
        this.f33295w = new LiveStreamDBHandler(this.f33289q);
        this.f33281i.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f33291s = gridLayoutManager;
        this.f33281i.setLayoutManager(gridLayoutManager);
        this.f33281i.setVisibility(0);
        this.f33268O = new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f33284l.setOnClickListener(new d());
        this.f33283k.setVisibility(8);
        this.f33270Q.setOnClickListener(new e());
        this.f33288p.setOnClickListener(new f());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f33277e.x(a7.h.f12935r);
        this.f33267N = menu;
        this.f33266M = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f33277e.getChildCount(); i9++) {
            if (this.f33277e.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f33277e.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f33268O;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f33268O.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f33267N;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f33266M = menuItem;
        this.f33277e.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f33289q) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new h()).g(getResources().getString(a7.j.f13231d4), new g()).n();
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f33289q.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f33289q.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f33289q.getResources().getString(a7.j.f13132S8), new i());
            c0158a.g(this.f33289q.getResources().getString(a7.j.f13231d4), new j());
            c0158a.n();
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f33289q.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f33289q.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f33289q.getResources().getString(a7.j.f13132S8), new k());
            c0158a2.g(this.f33289q.getResources().getString(a7.j.f13231d4), new l());
            c0158a2.n();
        }
        if (itemId == a7.f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f33256C = searchView;
            searchView.setQueryHint(getResources().getString(a7.j.f13030I6));
            this.f33256C.setIconifiedByDefault(false);
            this.f33256C.setOnQueryTextListener(new a());
        }
        if (itemId == a7.f.mb) {
            H1(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        D1();
        super.onResume();
        w.m(this.f33289q);
        w.z0(this.f33289q);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.f33283k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        j0 j0Var = this.f33255B;
        if (j0Var != null) {
            j0Var.F0(f33253W);
            this.f33255B.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f33290r = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f33290r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        D1();
    }
}
