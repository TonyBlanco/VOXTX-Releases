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
import android.util.Log;
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
import com.TryRoom;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdsManager;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.X;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SeriesActivityNewFlowM3U extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static ProgressBar f31753X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static int f31754Y;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f31755A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f31756B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public X f31757C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public SearchView f31758D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f31760F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f31761G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f31762H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f31763I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f31764J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f31765K;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public PopupWindow f31767M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Handler f31768N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public MenuItem f31769O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Menu f31770P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public NativeAdsManager f31773S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public List f31775U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Boolean f31776V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Boolean f31777W;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f31778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Toolbar f31779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppBarLayout f31780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f31781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f31782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f31783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f31785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f31787m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f31788n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f31789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f31790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public RelativeLayout f31791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Button f31792r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f31793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public SharedPreferences f31794t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RecyclerView.o f31795u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LiveStreamDBHandler f31799y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f31796v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f31797w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31798x = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31800z = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f31759E = new ArrayList();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f31766L = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public AsyncTask f31771Q = null;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f31772R = 0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public ArrayList f31774T = new ArrayList();

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class b implements SearchView.m {
        public b() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            SeriesActivityNewFlowM3U.this.f31784j.setVisibility(8);
            if (SeriesActivityNewFlowM3U.this.f31757C == null || (textView = SeriesActivityNewFlowM3U.this.f31784j) == null || textView.getVisibility() == 0) {
                return false;
            }
            SeriesActivityNewFlowM3U.this.f31757C.s0(str, SeriesActivityNewFlowM3U.this.f31784j);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowM3U.this.f31767M.dismiss();
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f31804a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f31805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f31806d;

        public d(RadioGroup radioGroup, View view, Activity activity) {
            this.f31804a = radioGroup;
            this.f31805c = view;
            this.f31806d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton = (RadioButton) this.f31805c.findViewById(this.f31804a.getCheckedRadioButtonId());
            SharepreferenceDBHandler.setseriesActivitynewFlowSort(radioButton.getText().toString().equals(SeriesActivityNewFlowM3U.this.getResources().getString(a7.j.f13254f7)) ? "1" : radioButton.getText().toString().equals(SeriesActivityNewFlowM3U.this.getResources().getString(a7.j.f13304k7)) ? "2" : "0", this.f31806d);
            SeriesActivityNewFlowM3U.this.f31771Q = SeriesActivityNewFlowM3U.this.new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            SeriesActivityNewFlowM3U.this.f31767M.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(SeriesActivityNewFlowM3U.this.f31793s);
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowM3U.this.onBackPressed();
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SeriesActivityNewFlowM3U.this.f31793s.startActivity(new Intent(SeriesActivityNewFlowM3U.this.f31793s, (Class<?>) NewDashboardActivity.class));
        }
    }

    public class h implements NativeAdsManager.Listener {
        public h() {
        }

        @Override // com.facebook.ads.NativeAdsManager.Listener
        public void onAdError(AdError adError) {
            Log.e("ads", "ads failed");
            SeriesActivityNewFlowM3U.this.J1();
        }

        @Override // com.facebook.ads.NativeAdsManager.Listener
        public void onAdsLoaded() {
            Log.i("fbads", "onAdsLoaded!" + SeriesActivityNewFlowM3U.this.f31773S.getUniqueNativeAdCount());
            int uniqueNativeAdCount = SeriesActivityNewFlowM3U.this.f31773S.getUniqueNativeAdCount();
            for (int i9 = 0; i9 < uniqueNativeAdCount; i9++) {
                SeriesActivityNewFlowM3U.this.E1(i9, SeriesActivityNewFlowM3U.this.f31773S.nextNativeAd());
            }
            NativeAdsManager unused = SeriesActivityNewFlowM3U.this.f31773S;
            if (0 != 0) {
                Log.e("ads", "ads loaded");
                SeriesActivityNewFlowM3U.this.J1();
            }
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(SeriesActivityNewFlowM3U.this.f31793s);
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(SeriesActivityNewFlowM3U.this.f31793s);
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

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class n implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31817a;

        public n(View view) {
            this.f31817a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31817a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31817a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31817a, "scaleY", f9);
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

    public class o extends AsyncTask {
        public o() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(SeriesActivityNewFlowM3U.this.K1());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            if (!new C2858a(SeriesActivityNewFlowM3U.this.f31793s).A().equals(AbstractC2237a.f44453K0)) {
                if (SeriesActivityNewFlowM3U.this.f31776V.booleanValue()) {
                    SeriesActivityNewFlowM3U.this.J1();
                    return;
                } else if (!w.i(SeriesActivityNewFlowM3U.this.f31793s).booleanValue()) {
                    SeriesActivityNewFlowM3U.this.M1();
                    return;
                }
            }
            SeriesActivityNewFlowM3U.this.L1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public SeriesActivityNewFlowM3U() {
        Boolean bool = Boolean.FALSE;
        this.f31776V = bool;
        this.f31777W = bool;
    }

    private void F1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList G1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f31799y.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f31793s));
        this.f31760F = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f31759E.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f31759E;
    }

    private ArrayList H1(ArrayList arrayList, ArrayList arrayList2) {
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
                        ArrayList arrayList3 = this.f31761G;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
        }
        return this.f31761G;
    }

    private void I1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d A[Catch: NullPointerException | Exception -> 0x021a, TryCatch #0 {NullPointerException | Exception -> 0x021a, blocks: (B:3:0x0007, B:5:0x001a, B:8:0x0095, B:9:0x00ae, B:11:0x00c4, B:13:0x00c8, B:15:0x00d6, B:17:0x00dc, B:19:0x00e0, B:22:0x00e8, B:24:0x00f0, B:26:0x00f4, B:29:0x00fc, B:31:0x010e, B:33:0x0120, B:35:0x0134, B:40:0x01ab, B:41:0x01b0, B:36:0x015d, B:38:0x0181, B:39:0x0183, B:42:0x01b4, B:44:0x01b8, B:46:0x01be, B:47:0x01c2, B:50:0x01c7, B:52:0x01cf, B:16:0x00d9), top: B:56:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0181 A[Catch: NullPointerException | Exception -> 0x021a, TryCatch #0 {NullPointerException | Exception -> 0x021a, blocks: (B:3:0x0007, B:5:0x001a, B:8:0x0095, B:9:0x00ae, B:11:0x00c4, B:13:0x00c8, B:15:0x00d6, B:17:0x00dc, B:19:0x00e0, B:22:0x00e8, B:24:0x00f0, B:26:0x00f4, B:29:0x00fc, B:31:0x010e, B:33:0x0120, B:35:0x0134, B:40:0x01ab, B:41:0x01b0, B:36:0x015d, B:38:0x0181, B:39:0x0183, B:42:0x01b4, B:44:0x01b8, B:46:0x01be, B:47:0x01c2, B:50:0x01c7, B:52:0x01cf, B:16:0x00d9), top: B:56:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean K1() {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.SeriesActivityNewFlowM3U.K1():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        View view;
        int i9 = 8;
        if (this.f31763I == null || this.f31772R == 0) {
            ProgressBar progressBar = this.f31778d;
            if (progressBar == null) {
                return;
            }
            progressBar.setVisibility(8);
            view = this.f31791q;
            i9 = 0;
        } else {
            this.f31757C = new X(this.f31775U, this.f31793s);
            this.f31783i.setItemAnimator(new androidx.recyclerview.widget.c());
            this.f31783i.setAdapter(this.f31757C);
            view = this.f31778d;
            if (view == null) {
                return;
            }
        }
        view.setVisibility(i9);
    }

    private void N1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f31767M = popupWindow;
            popupWindow.setContentView(viewInflate);
            byte b9 = -1;
            this.f31767M.setWidth(-1);
            this.f31767M.setHeight(-1);
            this.f31767M.setFocusable(true);
            this.f31767M.showAtLocation(viewInflate, 17, 0, 0);
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
            radioButton.setOnFocusChangeListener(new n(radioButton));
            radioButton2.setOnFocusChangeListener(new n(radioButton2));
            radioButton3.setOnFocusChangeListener(new n(radioButton3));
            radioButton4.setOnFocusChangeListener(new n(radioButton4));
            radioButton5.setOnFocusChangeListener(new n(radioButton5));
            radioButton6.setOnFocusChangeListener(new n(radioButton6));
            String str = SharepreferenceDBHandler.getseriesActivitynewFlowSort(activity);
            int iHashCode = str.hashCode();
            if (iHashCode != 49) {
                if (iHashCode == 50 && str.equals("2")) {
                    b9 = 1;
                }
            } else if (str.equals("1")) {
                b9 = 0;
            }
            if (b9 == 0) {
                radioButton3.setChecked(true);
            } else if (b9 != 1) {
                radioButton.setChecked(true);
            } else {
                radioButton4.setChecked(true);
            }
            button2.setOnClickListener(new c());
            button.setOnClickListener(new d(radioGroup, viewInflate, activity));
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void E1(int i9, NativeAd nativeAd) {
        if (nativeAd == null) {
            return;
        }
        this.f31774T.add(i9, nativeAd);
    }

    public final void J1() {
        if (this.f31774T.size() <= 0) {
            L1();
            return;
        }
        List list = this.f31775U;
        if (list != null && list.size() > 0) {
            Iterator it = this.f31775U.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof NativeAd) {
                    Log.e("ads", "ads already exists");
                    L1();
                    return;
                }
            }
            int size = this.f31775U.size() / this.f31774T.size();
            Iterator it2 = this.f31774T.iterator();
            int i9 = size;
            while (it2.hasNext()) {
                try {
                    this.f31775U.add(i9, (NativeAd) it2.next());
                    i9 += size;
                } catch (Exception unused) {
                }
            }
        }
        L1();
    }

    public final void M1() {
        Log.e("ads", "loadNativeAds");
        this.f31776V = Boolean.TRUE;
        List list = this.f31775U;
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            f31754Y = this.f31775U.size() / 10;
        } catch (Exception unused) {
            f31754Y = 0;
        }
        NativeAdsManager nativeAdsManager = new NativeAdsManager(this.f31793s, "269613774129228_336799674077304", f31754Y);
        this.f31773S = nativeAdsManager;
        nativeAdsManager.setListener(new h());
        if (f31754Y <= 0) {
            L1();
        } else {
            NativeAdsManager nativeAdsManager2 = this.f31773S;
            TryRoom.DianePie();
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
        FrameLayout frameLayout = this.f31785k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        RecyclerView recyclerView = this.f31783i;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        X x9 = this.f31757C;
        if (x9 != null && (progressBar = f31753X) != null) {
            x9.A0(progressBar);
        }
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        } else if (view.getId() == a7.f.f12211M4) {
            this.f31771Q = new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I1();
        setContentView(a7.g.f12622D1);
        this.f31778d = (ProgressBar) findViewById(a7.f.ec);
        this.f31779e = (Toolbar) findViewById(a7.f.kh);
        this.f31780f = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f31781g = (LinearLayout) findViewById(a7.f.cb);
        this.f31782h = (ProgressBar) findViewById(a7.f.oc);
        this.f31783i = (RecyclerView) findViewById(a7.f.ub);
        this.f31784j = (TextView) findViewById(a7.f.f12249Q2);
        this.f31785k = (FrameLayout) findViewById(a7.f.f12250Q3);
        this.f31786l = (TextView) findViewById(a7.f.f12435j4);
        this.f31787m = (RelativeLayout) findViewById(a7.f.Af);
        this.f31788n = (TextView) findViewById(a7.f.Jl);
        this.f31789o = (ImageView) findViewById(a7.f.Xa);
        this.f31790p = (ImageView) findViewById(a7.f.f12141F4);
        this.f31791q = (RelativeLayout) findViewById(a7.f.Oe);
        this.f31792r = (Button) findViewById(a7.f.f12523s0);
        AppBarLayout appBarLayout = this.f31780f;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        TextView textView = this.f31788n;
        if (textView != null) {
            textView.setText(getResources().getString(a7.j.f13080N6));
        }
        F1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        this.f31793s = this;
        Handler handler = new Handler();
        this.f31768N = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.f31778d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f31789o.setOnClickListener(new e());
        this.f31790p.setOnClickListener(new f());
        this.f31799y = new LiveStreamDBHandler(this.f31793s);
        this.f31783i.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f31795u = gridLayoutManager;
        this.f31783i.setLayoutManager(gridLayoutManager);
        this.f31783i.setVisibility(0);
        this.f31771Q = new o().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f31786l.setOnClickListener(new g());
        this.f31785k.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f31779e.x(a7.h.f12935r);
        this.f31770P = menu;
        this.f31769O = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f31779e.getChildCount(); i9++) {
            if (this.f31779e.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31779e.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f31771Q;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f31771Q.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f31770P;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f31769O = menuItem;
        this.f31779e.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f31793s) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new j()).g(getResources().getString(a7.j.f13231d4), new i()).n();
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f31793s.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f31793s.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f31793s.getResources().getString(a7.j.f13132S8), new k());
            c0158a.g(this.f31793s.getResources().getString(a7.j.f13231d4), new l());
            c0158a.n();
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f31793s.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f31793s.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f31793s.getResources().getString(a7.j.f13132S8), new m());
            c0158a2.g(this.f31793s.getResources().getString(a7.j.f13231d4), new a());
            c0158a2.n();
        }
        if (itemId == a7.f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f31758D = searchView;
            searchView.setQueryHint(getResources().getString(a7.j.f13000F6));
            this.f31758D.setIconifiedByDefault(false);
            this.f31758D.setOnQueryTextListener(new b());
        }
        if (itemId == a7.f.mb) {
            N1(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        I1();
        super.onResume();
        w.m(this.f31793s);
        w.z0(this.f31793s);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.f31785k;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        X x9 = this.f31757C;
        if (x9 != null) {
            x9.A0(f31753X);
            this.f31757C.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31794t = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31794t.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        I1();
    }
}
