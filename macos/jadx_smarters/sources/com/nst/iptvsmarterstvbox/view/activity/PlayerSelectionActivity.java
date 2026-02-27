package com.nst.iptvsmarterstvbox.view.activity;

import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import m7.AbstractC2237a;
import m7.w;
import org.apache.http.client.config.CookieSpecs;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class PlayerSelectionActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public LiveStreamDBHandler f31360A;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ExternalPlayerDataBase f31365F;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C2858a f31376Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Toolbar f31378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AppBarLayout f31379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f31380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f31381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f31382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f31383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f31385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f31386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RelativeLayout f31387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Spinner f31388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Spinner f31389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Spinner f31390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Spinner f31391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Spinner f31392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Spinner f31393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f31394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Button f31395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Button f31396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LinearLayout f31397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public LinearLayout f31398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Context f31399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f31400z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31361B = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31362C = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f31363D = "";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f31364E = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f31366G = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f31367H = new ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f31368I = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f31369J = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f31370K = 0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f31371L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f31372M = 0;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f31373N = 0;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f31374O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f31375P = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Thread f31377R = null;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f31401a;

        public a(PopupWindow popupWindow) {
            this.f31401a = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerSelectionActivity.this.Z1();
            PopupWindow popupWindow = this.f31401a;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f31401a.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(PlayerSelectionActivity.this.f31399y);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(PlayerSelectionActivity.this.f31399y);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
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

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(PlayerSelectionActivity.this.f31399y);
        }
    }

    public class i implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f31410a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f31411c;

        public i(LinkedHashMap linkedHashMap, List list) {
            this.f31410a = linkedHashMap;
            this.f31411c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            new SharepreferenceDBHandler();
            if (PlayerSelectionActivity.this.f31375P == i9) {
                String ePGPlayerPKGName = SharepreferenceDBHandler.getEPGPlayerPKGName(PlayerSelectionActivity.this.f31399y);
                String ePGPlayerAppName = SharepreferenceDBHandler.getEPGPlayerAppName(PlayerSelectionActivity.this.f31399y);
                if (ePGPlayerPKGName == null || ePGPlayerPKGName.isEmpty() || ePGPlayerPKGName.equals("")) {
                    return;
                }
                int iT1 = PlayerSelectionActivity.this.T1(this.f31411c, ePGPlayerPKGName, ePGPlayerAppName, this.f31410a);
                if (this.f31411c.toString().contains(ePGPlayerAppName)) {
                    Log.i("calledPart", "ifCalled");
                    PlayerSelectionActivity.this.f31393s.setSelection(iT1);
                    return;
                } else {
                    Log.i("calledPart", "elseCalled");
                    PlayerSelectionActivity.this.b2();
                    return;
                }
            }
            PlayerSelectionActivity.this.f31375P = i9;
            PlayerSelectionActivity.this.f31393s.setSelection(i9);
            if (this.f31410a.containsKey(this.f31411c.get(i9))) {
                String str = (String) this.f31410a.get(this.f31411c.get(i9));
                String str2 = (String) PlayerSelectionActivity.U1(this.f31410a, str);
                if (str == null || str.isEmpty() || str.equals("") || PlayerSelectionActivity.this.f31399y == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.setEPGPlayer(str, str2, PlayerSelectionActivity.this.f31399y);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f31413a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f31414c;

        public j(LinkedHashMap linkedHashMap, List list) {
            this.f31413a = linkedHashMap;
            this.f31414c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            new SharepreferenceDBHandler();
            if (PlayerSelectionActivity.this.f31374O == i9) {
                String recordingsPlayerPkgName = SharepreferenceDBHandler.getRecordingsPlayerPkgName(PlayerSelectionActivity.this.f31399y);
                String recordingsPlayerAppName = SharepreferenceDBHandler.getRecordingsPlayerAppName(PlayerSelectionActivity.this.f31399y);
                if (recordingsPlayerPkgName == null || recordingsPlayerPkgName.isEmpty() || recordingsPlayerPkgName.equals("")) {
                    return;
                }
                int iT1 = PlayerSelectionActivity.this.T1(this.f31414c, recordingsPlayerPkgName, recordingsPlayerAppName, this.f31413a);
                if (this.f31414c.toString().contains(recordingsPlayerAppName)) {
                    Log.i("calledPart", "ifCalled");
                    PlayerSelectionActivity.this.f31392r.setSelection(iT1);
                    return;
                } else {
                    Log.i("calledPart", "elseCalled");
                    PlayerSelectionActivity.this.e2();
                    return;
                }
            }
            PlayerSelectionActivity.this.f31374O = i9;
            PlayerSelectionActivity.this.f31392r.setSelection(i9);
            if (this.f31413a.containsKey(this.f31414c.get(i9))) {
                String str = (String) this.f31413a.get(this.f31414c.get(i9));
                String str2 = (String) PlayerSelectionActivity.U1(this.f31413a, str);
                if (str == null || str.isEmpty() || str.equals("") || PlayerSelectionActivity.this.f31399y == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.setRecordingsPlayer(str, str2, PlayerSelectionActivity.this.f31399y);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class k implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f31416a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f31417c;

        public k(LinkedHashMap linkedHashMap, List list) {
            this.f31416a = linkedHashMap;
            this.f31417c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            new SharepreferenceDBHandler();
            if (PlayerSelectionActivity.this.f31373N == i9) {
                String catchUpPlayerPkgName = SharepreferenceDBHandler.getCatchUpPlayerPkgName(PlayerSelectionActivity.this.f31399y);
                String catchUpPlayerAppName = SharepreferenceDBHandler.getCatchUpPlayerAppName(PlayerSelectionActivity.this.f31399y);
                if (catchUpPlayerPkgName == null || catchUpPlayerPkgName.isEmpty() || catchUpPlayerPkgName.equals("")) {
                    return;
                }
                int iT1 = PlayerSelectionActivity.this.T1(this.f31417c, catchUpPlayerPkgName, catchUpPlayerAppName, this.f31416a);
                if (this.f31417c.toString().contains(catchUpPlayerAppName)) {
                    Log.i("calledPart", "ifCalled");
                    PlayerSelectionActivity.this.f31391q.setSelection(iT1);
                    return;
                } else {
                    Log.i("calledPart", "elseCalled");
                    PlayerSelectionActivity.this.W1();
                    return;
                }
            }
            PlayerSelectionActivity.this.f31373N = i9;
            PlayerSelectionActivity.this.f31391q.setSelection(i9);
            if (this.f31416a.containsKey(this.f31417c.get(i9))) {
                String str = (String) this.f31416a.get(this.f31417c.get(i9));
                String str2 = (String) PlayerSelectionActivity.U1(this.f31416a, str);
                if (str == null || str.isEmpty() || str.equals("") || PlayerSelectionActivity.this.f31399y == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.setCatchUpPlayer(str, str2, PlayerSelectionActivity.this.f31399y);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class l implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f31419a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f31420c;

        public l(LinkedHashMap linkedHashMap, List list) {
            this.f31419a = linkedHashMap;
            this.f31420c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            new SharepreferenceDBHandler();
            if (PlayerSelectionActivity.this.f31372M == i9) {
                String seriesPlayerPkgName = SharepreferenceDBHandler.getSeriesPlayerPkgName(PlayerSelectionActivity.this.f31399y);
                String seriesPlayerAppName = SharepreferenceDBHandler.getSeriesPlayerAppName(PlayerSelectionActivity.this.f31399y);
                if (seriesPlayerPkgName == null || seriesPlayerPkgName.isEmpty() || seriesPlayerPkgName.equals("")) {
                    return;
                }
                int iT1 = PlayerSelectionActivity.this.T1(this.f31420c, seriesPlayerPkgName, seriesPlayerAppName, this.f31419a);
                if (this.f31420c.toString().contains(seriesPlayerAppName)) {
                    Log.i("calledPart", "ifCalled");
                    PlayerSelectionActivity.this.f31390p.setSelection(iT1);
                    return;
                } else {
                    Log.i("calledPart", "elseCalled");
                    PlayerSelectionActivity.this.g2();
                    return;
                }
            }
            PlayerSelectionActivity.this.f31372M = i9;
            PlayerSelectionActivity.this.f31390p.setSelection(i9);
            if (this.f31419a.containsKey(this.f31420c.get(i9))) {
                String str = (String) this.f31419a.get(this.f31420c.get(i9));
                String str2 = (String) PlayerSelectionActivity.U1(this.f31419a, str);
                if (str == null || str.isEmpty() || str.equals("") || PlayerSelectionActivity.this.f31399y == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.setSeriesPlayer(str, str2, PlayerSelectionActivity.this.f31399y);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class m implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f31422a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f31423c;

        public m(LinkedHashMap linkedHashMap, List list) {
            this.f31422a = linkedHashMap;
            this.f31423c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            String vODPlayerPkgName;
            String vODPlayerAppName;
            StringBuilder sb;
            new SharepreferenceDBHandler();
            if (PlayerSelectionActivity.this.f31371L != i9) {
                PlayerSelectionActivity.this.f31371L = i9;
                PlayerSelectionActivity.this.f31389o.setSelection(i9);
                if (!this.f31422a.containsKey(this.f31423c.get(i9))) {
                    return;
                }
                vODPlayerPkgName = (String) this.f31422a.get(this.f31423c.get(i9));
                vODPlayerAppName = (String) PlayerSelectionActivity.U1(this.f31422a, vODPlayerPkgName);
                if (vODPlayerPkgName == null || vODPlayerPkgName.isEmpty() || vODPlayerPkgName.equals("") || PlayerSelectionActivity.this.f31399y == null || vODPlayerAppName == null || vODPlayerAppName.isEmpty() || vODPlayerAppName.equals("")) {
                    return;
                }
                Log.i("listIS", this.f31423c.toString());
                SharepreferenceDBHandler.setVODPlayer(vODPlayerPkgName, vODPlayerAppName, PlayerSelectionActivity.this.f31399y);
                sb = new StringBuilder();
            } else {
                vODPlayerPkgName = SharepreferenceDBHandler.getVODPlayerPkgName(PlayerSelectionActivity.this.f31399y);
                vODPlayerAppName = SharepreferenceDBHandler.getVODPlayerAppName(PlayerSelectionActivity.this.f31399y);
                if (vODPlayerPkgName == null || vODPlayerPkgName.isEmpty() || vODPlayerPkgName.equals("")) {
                    return;
                }
                int iT1 = PlayerSelectionActivity.this.T1(this.f31423c, vODPlayerPkgName, vODPlayerAppName, this.f31422a);
                if (this.f31423c.toString().contains(vODPlayerAppName)) {
                    Log.i("calledPart", "ifCalled");
                    PlayerSelectionActivity.this.f31389o.setSelection(iT1);
                } else {
                    Log.i("calledPart", "elseCalled");
                    PlayerSelectionActivity.this.a2();
                }
                sb = new StringBuilder();
            }
            sb.append(vODPlayerPkgName);
            sb.append(":");
            sb.append(vODPlayerAppName);
            Log.i("dataISSelected", sb.toString());
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class n implements AdapterView.OnItemSelectedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f31425a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f31426c;

        public n(LinkedHashMap linkedHashMap, List list) {
            this.f31425a = linkedHashMap;
            this.f31426c = list;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            new SharepreferenceDBHandler();
            if (PlayerSelectionActivity.this.f31370K == i9) {
                String livePlayerPkgName = SharepreferenceDBHandler.getLivePlayerPkgName(PlayerSelectionActivity.this.f31399y);
                String livePlayerAppName = SharepreferenceDBHandler.getLivePlayerAppName(PlayerSelectionActivity.this.f31399y);
                if (livePlayerPkgName == null || livePlayerPkgName.isEmpty() || livePlayerPkgName.equals("")) {
                    return;
                }
                int iT1 = PlayerSelectionActivity.this.T1(this.f31426c, livePlayerPkgName, livePlayerAppName, this.f31425a);
                if (this.f31426c.toString().contains(livePlayerAppName)) {
                    PlayerSelectionActivity.this.f31388n.setSelection(iT1);
                    return;
                } else {
                    PlayerSelectionActivity.this.Y1();
                    return;
                }
            }
            PlayerSelectionActivity.this.f31370K = i9;
            PlayerSelectionActivity.this.f31388n.setSelection(i9);
            if (this.f31425a.containsKey(this.f31426c.get(i9))) {
                String str = (String) this.f31425a.get(this.f31426c.get(i9));
                String str2 = (String) PlayerSelectionActivity.U1(this.f31425a, str);
                if (str == null || str.isEmpty() || str.equals("") || PlayerSelectionActivity.this.f31399y == null || str2 == null || str2.isEmpty() || str2.equals("")) {
                    return;
                }
                SharepreferenceDBHandler.setLivePlayer(str, str2, PlayerSelectionActivity.this.f31399y);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String string = Calendar.getInstance().getTime().toString();
                String strR = w.R(PlayerSelectionActivity.this.f31399y);
                String strA = w.A(string);
                TextView textView = PlayerSelectionActivity.this.f31381g;
                if (textView != null) {
                    textView.setText(strR);
                }
                TextView textView2 = PlayerSelectionActivity.this.f31380f;
                if (textView2 != null) {
                    textView2.setText(strA);
                }
            } catch (Exception unused) {
            }
        }
    }

    public class p implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PopupWindow f31429a;

        public p(PopupWindow popupWindow) {
            this.f31429a = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PopupWindow popupWindow = this.f31429a;
            if (popupWindow == null || !popupWindow.isShowing()) {
                return;
            }
            this.f31429a.dismiss();
        }
    }

    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    PlayerSelectionActivity.this.R1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class r implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31432a;

        public r(View view) {
            this.f31432a = view;
        }

        public final void a(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31432a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31432a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.05f : 1.0f;
                Log.e("id is", "" + this.f31432a.getTag());
                if (this.f31432a.getTag().equals("1")) {
                    a(f9);
                    b(f9);
                    view2 = this.f31432a;
                    i9 = a7.e.f12010h;
                } else if (!this.f31432a.getTag().equals("2")) {
                    a(1.12f);
                    b(1.12f);
                    return;
                } else {
                    a(f9);
                    b(f9);
                    view2 = this.f31432a;
                    i9 = a7.e.f12024k1;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(f9);
                b(f9);
                if (!this.f31432a.getTag().equals("1") && !this.f31432a.getTag().equals("2")) {
                    return;
                }
                view2 = this.f31432a;
                i9 = a7.e.f12038o;
            }
            view2.setBackgroundResource(i9);
        }
    }

    private void Q1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void S1() {
        Button button = this.f31395u;
        if (button != null) {
            button.setOnFocusChangeListener(new r(button));
        }
        Button button2 = this.f31396v;
        button2.setOnFocusChangeListener(new r(button2));
        this.f31396v.requestFocus();
        this.f31396v.requestFocusFromTouch();
    }

    public static Object U1(Map map, Object obj) {
        for (Map.Entry entry : map.entrySet()) {
            if (Objects.equals(obj, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    private void V1() {
        ArrayList arrayList = this.f31366G;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.f31368I;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.f31399y = this;
        this.f31360A = new LiveStreamDBHandler(this.f31399y);
        if (this.f31399y != null) {
            this.f31365F = new ExternalPlayerDataBase(this.f31399y);
            ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
            externalPlayerModelClass.setAppicon("");
            externalPlayerModelClass.setAppname("Built-in Player (Hardware/Software Decoder)");
            externalPlayerModelClass.setPackagename(CookieSpecs.DEFAULT);
            this.f31366G.add(externalPlayerModelClass);
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f31399y).equals("stalker_api")) {
                ArrayList<ExternalPlayerModelClass> externalPlayer = this.f31365F.getExternalPlayer();
                this.f31367H = externalPlayer;
                this.f31366G.addAll(1, externalPlayer);
            }
        }
        if (this.f31399y != null) {
            this.f31365F = new ExternalPlayerDataBase(this.f31399y);
            ExternalPlayerModelClass externalPlayerModelClass2 = new ExternalPlayerModelClass();
            externalPlayerModelClass2.setAppicon("");
            externalPlayerModelClass2.setAppname("Built-in Player (Native)");
            externalPlayerModelClass2.setPackagename("default_native");
            this.f31368I.add(externalPlayerModelClass2);
            this.f31365F = new ExternalPlayerDataBase(this.f31399y);
            ExternalPlayerModelClass externalPlayerModelClass3 = new ExternalPlayerModelClass();
            externalPlayerModelClass3.setAppicon("");
            externalPlayerModelClass3.setAppname("Built-in Player (Hardware/Software Decoder)");
            externalPlayerModelClass3.setPackagename(CookieSpecs.DEFAULT);
            this.f31368I.add(externalPlayerModelClass3);
            if (!SharepreferenceDBHandler.getCurrentAPPType(this.f31399y).equals("stalker_api")) {
                ArrayList<ExternalPlayerModelClass> externalPlayer2 = this.f31365F.getExternalPlayer();
                this.f31369J = externalPlayer2;
                this.f31368I.addAll(2, externalPlayer2);
            }
        }
        SharedPreferences sharedPreferences = getSharedPreferences("selectedPlayer", 0);
        this.f31400z = sharedPreferences;
        sharedPreferences.getString("selectedPlayer", "");
    }

    public final void P1() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ExternalPlayerModelClass externalPlayerModelClass : this.f31368I) {
            arrayList.add(externalPlayerModelClass.getAppname());
            linkedHashMap.put(externalPlayerModelClass.getAppname(), externalPlayerModelClass.getPackagename());
        }
        d2(this.f31368I, linkedHashMap, arrayList);
        ArrayList arrayList2 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (ExternalPlayerModelClass externalPlayerModelClass2 : this.f31366G) {
            arrayList2.add(externalPlayerModelClass2.getAppname());
            linkedHashMap2.put(externalPlayerModelClass2.getAppname(), externalPlayerModelClass2.getPackagename());
        }
        i2(this.f31368I, linkedHashMap, arrayList);
        h2(this.f31368I, linkedHashMap, arrayList);
        X1(this.f31366G, linkedHashMap2, arrayList2);
        f2(this.f31366G, linkedHashMap2, arrayList2);
        c2(this.f31366G, linkedHashMap2, arrayList2);
    }

    public void R1() {
        runOnUiThread(new o());
    }

    public final int T1(List list, String str, String str2, LinkedHashMap linkedHashMap) {
        Iterator it = linkedHashMap.entrySet().iterator();
        int i9 = 0;
        while (it.hasNext()) {
            if (((String) ((Map.Entry) it.next()).getValue()).toString().equals(str)) {
                return i9;
            }
            i9++;
        }
        return 0;
    }

    public final void W1() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.setCatchUpPlayer(CookieSpecs.DEFAULT, "Default Player", this.f31399y);
        this.f31391q.setSelection(0);
    }

    public final void X1(ArrayList arrayList, LinkedHashMap linkedHashMap, List list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f31391q.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f31391q.setOnItemSelectedListener(new k(linkedHashMap, list));
    }

    public final void Y1() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.setLivePlayer(CookieSpecs.DEFAULT, "Default Player", this.f31399y);
        this.f31388n.setSelection(1);
    }

    public final void Z1() {
        Y1();
        a2();
        g2();
        W1();
        e2();
        b2();
    }

    public final void a2() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.setVODPlayer(CookieSpecs.DEFAULT, "Default Player", this.f31399y);
        this.f31389o.setSelection(1);
    }

    public final void b2() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.setEPGPlayer(CookieSpecs.DEFAULT, "Default Player", this.f31399y);
        this.f31393s.setSelection(0);
    }

    public final void c2(ArrayList arrayList, LinkedHashMap linkedHashMap, List list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f31393s.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f31393s.setOnItemSelectedListener(new i(linkedHashMap, list));
    }

    public final void d2(ArrayList arrayList, LinkedHashMap linkedHashMap, List list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f31388n.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f31388n.setOnItemSelectedListener(new n(linkedHashMap, list));
    }

    public final void e2() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.setRecordingsPlayer(CookieSpecs.DEFAULT, "Default Player", this.f31399y);
        this.f31392r.setSelection(0);
    }

    public final void f2(ArrayList arrayList, LinkedHashMap linkedHashMap, List list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f31392r.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f31392r.setOnItemSelectedListener(new j(linkedHashMap, list));
    }

    public final void g2() {
        new SharepreferenceDBHandler();
        SharepreferenceDBHandler.setSeriesPlayer(CookieSpecs.DEFAULT, "Default Player", this.f31399y);
        this.f31390p.setSelection(1);
    }

    public final void h2(ArrayList arrayList, LinkedHashMap linkedHashMap, List list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f31390p.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f31390p.setOnItemSelectedListener(new l(linkedHashMap, list));
    }

    public final void i2(ArrayList arrayList, LinkedHashMap linkedHashMap, List list) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.simple_list_item_1, list);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.f31389o.setAdapter((SpinnerAdapter) arrayAdapter);
        this.f31389o.setOnItemSelectedListener(new m(linkedHashMap, list));
    }

    public final void j2() {
        try {
            View viewInflate = ((LayoutInflater) this.f31399y.getSystemService("layout_inflater")).inflate(a7.g.f12777c4, (RelativeLayout) findViewById(a7.f.Re));
            PopupWindow popupWindow = new PopupWindow(this.f31399y);
            popupWindow.setContentView(viewInflate);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12412h1);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12544u1);
            button2.setText(getResources().getString(a7.j.T8));
            ((TextView) viewInflate.findViewById(a7.f.Di)).setText(getResources().getString(a7.j.f13043K));
            button.setOnFocusChangeListener(new w.k((View) button, (Activity) this));
            button2.setOnFocusChangeListener(new w.k((View) button2, (Activity) this));
            button.setOnClickListener(new p(popupWindow));
            button2.setOnClickListener(new a(popupWindow));
        } catch (NullPointerException | Exception unused) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        int id = view.getId();
        if (id == a7.f.Bj) {
            intent = new Intent(this, (Class<?>) NewDashboardActivity.class);
        } else {
            if (id != a7.f.wh && id != a7.f.f12273S6 && id != a7.f.f12567w4) {
                if (id != a7.f.vl && id != a7.f.K9 && id != a7.f.f12336Z5) {
                    if (id == a7.f.f12267S0) {
                        onBackPressed();
                        return;
                    } else if (id != a7.f.f12473n1) {
                        return;
                    }
                }
                j2();
                return;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f31399y).equals("stalker_api")) {
                return;
            } else {
                intent = new Intent(this, (Class<?>) ExternalPlayerActivity.class);
            }
        }
        startActivity(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i9;
        LinearLayout linearLayout;
        this.f31399y = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f31399y);
        this.f31376Q = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? a7.g.f12847o0 : a7.g.f12841n0);
        w.Y(this);
        this.f31378d = (Toolbar) findViewById(a7.f.kh);
        this.f31379e = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f31380f = (TextView) findViewById(a7.f.f12129E2);
        this.f31381g = (TextView) findViewById(a7.f.gh);
        this.f31382h = (ImageView) findViewById(a7.f.Xa);
        this.f31383i = (TextView) findViewById(a7.f.Yf);
        this.f31384j = (TextView) findViewById(a7.f.ah);
        this.f31385k = (TextView) findViewById(a7.f.Zf);
        this.f31386l = (TextView) findViewById(a7.f.dh);
        this.f31387m = (RelativeLayout) findViewById(a7.f.kf);
        this.f31388n = (Spinner) findViewById(a7.f.qg);
        this.f31389o = (Spinner) findViewById(a7.f.ug);
        this.f31390p = (Spinner) findViewById(a7.f.tg);
        this.f31391q = (Spinner) findViewById(a7.f.ng);
        this.f31392r = (Spinner) findViewById(a7.f.sg);
        this.f31393s = (Spinner) findViewById(a7.f.pg);
        this.f31394t = (ImageView) findViewById(a7.f.f12567w4);
        this.f31395u = (Button) findViewById(a7.f.f12267S0);
        this.f31396v = (Button) findViewById(a7.f.f12473n1);
        this.f31397w = (LinearLayout) findViewById(a7.f.f12530s7);
        this.f31398x = (LinearLayout) findViewById(a7.f.X9);
        this.f31396v.setOnClickListener(this);
        this.f31395u.setOnClickListener(this);
        this.f31394t.setOnClickListener(this);
        S1();
        Q1();
        r1((Toolbar) findViewById(a7.f.kh));
        getWindow().setFlags(1024, 1024);
        Thread thread = this.f31377R;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new q());
            this.f31377R = thread2;
            thread2.start();
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f31399y).equals("m3u")) {
            linearLayout = this.f31397w;
            i9 = 8;
        } else {
            i9 = 0;
            this.f31397w.setVisibility(0);
            linearLayout = this.f31398x;
        }
        linearLayout.setVisibility(i9);
        this.f31382h.setOnClickListener(new h());
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f31378d.x(a7.h.f12939v);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f31378d.getChildCount(); i9++) {
            if (this.f31378d.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31378d.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
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
        if (itemId == a7.f.f12380e && (context = this.f31399y) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new c()).g(getResources().getString(a7.j.f13231d4), new b()).n();
        }
        if (itemId == a7.f.fb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f31399y.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f31399y.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f31399y.getResources().getString(a7.j.f13132S8), new d());
            c0158a.g(this.f31399y.getResources().getString(a7.j.f13231d4), new e());
            c0158a.n();
        }
        if (itemId == a7.f.hb) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f31399y.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f31399y.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f31399y.getResources().getString(a7.j.f13132S8), new f());
            c0158a2.g(this.f31399y.getResources().getString(a7.j.f13231d4), new g());
            c0158a2.n();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f31377R;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f31377R.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f31377R;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new q());
            this.f31377R = thread2;
            thread2.start();
        }
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        V1();
        P1();
        w.m(this.f31399y);
        w.z0(this.f31399y);
        getWindow().setFlags(1024, 1024);
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31400z = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31400z.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f31370K = 0;
        this.f31371L = 0;
        this.f31372M = 0;
        this.f31373N = 0;
        this.f31374O = 0;
        this.f31375P = 0;
    }
}
