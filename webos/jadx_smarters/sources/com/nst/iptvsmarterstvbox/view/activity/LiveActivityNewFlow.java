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
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.r;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class LiveActivityNewFlow extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static ProgressBar f30360Z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public LiveStreamDBHandler f30362B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f30363C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f30364D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f30365E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f30366F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f30367G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f30368H;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public PopupWindow f30373M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public SearchView f30375O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public Handler f30376P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public MenuItem f30378R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Menu f30379S;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public List f30383W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public Boolean f30384X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Boolean f30385Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f30386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Toolbar f30387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppBarLayout f30388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f30389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RecyclerView f30390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30391i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public FrameLayout f30392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f30393k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f30394l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f30395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f30396n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Button f30397o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f30398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f30399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SharedPreferences f30400r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public GridLayoutManager f30401s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f30402t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f30403u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f30404v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f30405w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f30406x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f30407y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f30408z = 20;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ArrayList f30361A = new ArrayList();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f30369I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f30370J = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f30371K = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f30372L = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ArrayList f30374N = new ArrayList();

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f30377Q = -1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public AsyncTask f30380T = null;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f30381U = 0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ArrayList f30382V = new ArrayList();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LiveActivityNewFlow.this.f30373M.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RadioGroup f30410a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f30411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Activity f30412d;

        public b(RadioGroup radioGroup, View view, Activity activity) {
            this.f30410a = radioGroup;
            this.f30411c = view;
            this.f30412d = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            RadioButton radioButton = (RadioButton) this.f30411c.findViewById(this.f30410a.getCheckedRadioButtonId());
            SharepreferenceDBHandler.setLiveActivitynewFlowSort(radioButton.getText().toString().equals(LiveActivityNewFlow.this.getResources().getString(a7.j.f13254f7)) ? "1" : radioButton.getText().toString().equals(LiveActivityNewFlow.this.getResources().getString(a7.j.f13304k7)) ? "2" : "0", this.f30412d);
            LiveActivityNewFlow.this.f30380T = LiveActivityNewFlow.this.new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            LiveActivityNewFlow.this.f30373M.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(LiveActivityNewFlow.this.f30399q);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(LiveActivityNewFlow.this.f30399q);
        }
    }

    public class g implements SearchView.m {
        public g() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            AbstractC2237a.f44515k0 = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            LiveActivityNewFlow.this.f30395m.setVisibility(8);
            LiveActivityNewFlow liveActivityNewFlow = LiveActivityNewFlow.this;
            if (liveActivityNewFlow.f30402t == null || (textView = liveActivityNewFlow.f30394l) == null || textView.getVisibility() == 0) {
                return false;
            }
            LiveActivityNewFlow liveActivityNewFlow2 = LiveActivityNewFlow.this;
            liveActivityNewFlow2.f30402t.B0(str, liveActivityNewFlow2.f30395m);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.m0(LiveActivityNewFlow.this.f30399q);
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

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
        }
    }

    public class k implements DialogInterface.OnClickListener {
        public k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class l extends AsyncTask {
        public l() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(LiveActivityNewFlow.this.C1());
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            LiveActivityNewFlow.this.D1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class m implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f30424a;

        public m(View view) {
            this.f30424a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30424a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30424a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f30424a, "scaleY", f9);
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

    public LiveActivityNewFlow() {
        Boolean bool = Boolean.FALSE;
        this.f30384X = bool;
        this.f30385Y = bool;
    }

    private void z1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    public final ArrayList A1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f30362B.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f30399q));
        this.f30363C = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f30361A.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f30361A;
    }

    public final ArrayList B1(ArrayList arrayList, ArrayList arrayList2) {
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
                        ArrayList arrayList3 = this.f30364D;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
        }
        return this.f30364D;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0107 A[Catch: NullPointerException | Exception -> 0x034e, NullPointerException | Exception -> 0x034e, TryCatch #0 {NullPointerException | Exception -> 0x034e, blocks: (B:3:0x0009, B:5:0x000e, B:8:0x008d, B:8:0x008d, B:11:0x0099, B:11:0x0099, B:12:0x00ad, B:12:0x00ad, B:17:0x00d4, B:17:0x00d4, B:19:0x00e2, B:19:0x00e2, B:21:0x00e6, B:21:0x00e6, B:23:0x00f8, B:23:0x00f8, B:24:0x0100, B:24:0x0100, B:26:0x0104, B:26:0x0104, B:28:0x0114, B:28:0x0114, B:30:0x0120, B:30:0x0120, B:32:0x012e, B:32:0x012e, B:35:0x0136, B:35:0x0136, B:37:0x013e, B:37:0x013e, B:39:0x0142, B:39:0x0142, B:42:0x014a, B:42:0x014a, B:44:0x015c, B:44:0x015c, B:46:0x016e, B:46:0x016e, B:48:0x0182, B:48:0x0182, B:53:0x01f9, B:53:0x01f9, B:54:0x01fe, B:54:0x01fe, B:49:0x01ab, B:49:0x01ab, B:51:0x01cf, B:51:0x01cf, B:52:0x01d1, B:52:0x01d1, B:55:0x0202, B:55:0x0202, B:57:0x0206, B:57:0x0206, B:59:0x020c, B:59:0x020c, B:90:0x02f6, B:90:0x02f6, B:93:0x02fb, B:93:0x02fb, B:95:0x0303, B:95:0x0303, B:60:0x0212, B:60:0x0212, B:62:0x0216, B:62:0x0216, B:65:0x021e, B:65:0x021e, B:67:0x0226, B:67:0x0226, B:69:0x022a, B:69:0x022a, B:72:0x0232, B:72:0x0232, B:74:0x0244, B:74:0x0244, B:76:0x0256, B:76:0x0256, B:78:0x026a, B:78:0x026a, B:83:0x02e1, B:83:0x02e1, B:84:0x02e6, B:84:0x02e6, B:79:0x0293, B:79:0x0293, B:81:0x02b7, B:81:0x02b7, B:82:0x02b9, B:82:0x02b9, B:85:0x02ea, B:85:0x02ea, B:87:0x02ee, B:87:0x02ee, B:27:0x0107, B:27:0x0107, B:13:0x00b5, B:13:0x00b5, B:16:0x00c1, B:16:0x00c1), top: B:99:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120 A[Catch: NullPointerException | Exception -> 0x034e, NullPointerException | Exception -> 0x034e, TryCatch #0 {NullPointerException | Exception -> 0x034e, blocks: (B:3:0x0009, B:5:0x000e, B:8:0x008d, B:8:0x008d, B:11:0x0099, B:11:0x0099, B:12:0x00ad, B:12:0x00ad, B:17:0x00d4, B:17:0x00d4, B:19:0x00e2, B:19:0x00e2, B:21:0x00e6, B:21:0x00e6, B:23:0x00f8, B:23:0x00f8, B:24:0x0100, B:24:0x0100, B:26:0x0104, B:26:0x0104, B:28:0x0114, B:28:0x0114, B:30:0x0120, B:30:0x0120, B:32:0x012e, B:32:0x012e, B:35:0x0136, B:35:0x0136, B:37:0x013e, B:37:0x013e, B:39:0x0142, B:39:0x0142, B:42:0x014a, B:42:0x014a, B:44:0x015c, B:44:0x015c, B:46:0x016e, B:46:0x016e, B:48:0x0182, B:48:0x0182, B:53:0x01f9, B:53:0x01f9, B:54:0x01fe, B:54:0x01fe, B:49:0x01ab, B:49:0x01ab, B:51:0x01cf, B:51:0x01cf, B:52:0x01d1, B:52:0x01d1, B:55:0x0202, B:55:0x0202, B:57:0x0206, B:57:0x0206, B:59:0x020c, B:59:0x020c, B:90:0x02f6, B:90:0x02f6, B:93:0x02fb, B:93:0x02fb, B:95:0x0303, B:95:0x0303, B:60:0x0212, B:60:0x0212, B:62:0x0216, B:62:0x0216, B:65:0x021e, B:65:0x021e, B:67:0x0226, B:67:0x0226, B:69:0x022a, B:69:0x022a, B:72:0x0232, B:72:0x0232, B:74:0x0244, B:74:0x0244, B:76:0x0256, B:76:0x0256, B:78:0x026a, B:78:0x026a, B:83:0x02e1, B:83:0x02e1, B:84:0x02e6, B:84:0x02e6, B:79:0x0293, B:79:0x0293, B:81:0x02b7, B:81:0x02b7, B:82:0x02b9, B:82:0x02b9, B:85:0x02ea, B:85:0x02ea, B:87:0x02ee, B:87:0x02ee, B:27:0x0107, B:27:0x0107, B:13:0x00b5, B:13:0x00b5, B:16:0x00c1, B:16:0x00c1), top: B:99:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0212 A[Catch: NullPointerException | Exception -> 0x034e, NullPointerException | Exception -> 0x034e, TryCatch #0 {NullPointerException | Exception -> 0x034e, blocks: (B:3:0x0009, B:5:0x000e, B:8:0x008d, B:8:0x008d, B:11:0x0099, B:11:0x0099, B:12:0x00ad, B:12:0x00ad, B:17:0x00d4, B:17:0x00d4, B:19:0x00e2, B:19:0x00e2, B:21:0x00e6, B:21:0x00e6, B:23:0x00f8, B:23:0x00f8, B:24:0x0100, B:24:0x0100, B:26:0x0104, B:26:0x0104, B:28:0x0114, B:28:0x0114, B:30:0x0120, B:30:0x0120, B:32:0x012e, B:32:0x012e, B:35:0x0136, B:35:0x0136, B:37:0x013e, B:37:0x013e, B:39:0x0142, B:39:0x0142, B:42:0x014a, B:42:0x014a, B:44:0x015c, B:44:0x015c, B:46:0x016e, B:46:0x016e, B:48:0x0182, B:48:0x0182, B:53:0x01f9, B:53:0x01f9, B:54:0x01fe, B:54:0x01fe, B:49:0x01ab, B:49:0x01ab, B:51:0x01cf, B:51:0x01cf, B:52:0x01d1, B:52:0x01d1, B:55:0x0202, B:55:0x0202, B:57:0x0206, B:57:0x0206, B:59:0x020c, B:59:0x020c, B:90:0x02f6, B:90:0x02f6, B:93:0x02fb, B:93:0x02fb, B:95:0x0303, B:95:0x0303, B:60:0x0212, B:60:0x0212, B:62:0x0216, B:62:0x0216, B:65:0x021e, B:65:0x021e, B:67:0x0226, B:67:0x0226, B:69:0x022a, B:69:0x022a, B:72:0x0232, B:72:0x0232, B:74:0x0244, B:74:0x0244, B:76:0x0256, B:76:0x0256, B:78:0x026a, B:78:0x026a, B:83:0x02e1, B:83:0x02e1, B:84:0x02e6, B:84:0x02e6, B:79:0x0293, B:79:0x0293, B:81:0x02b7, B:81:0x02b7, B:82:0x02b9, B:82:0x02b9, B:85:0x02ea, B:85:0x02ea, B:87:0x02ee, B:87:0x02ee, B:27:0x0107, B:27:0x0107, B:13:0x00b5, B:13:0x00b5, B:16:0x00c1, B:16:0x00c1), top: B:99:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C1() {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.LiveActivityNewFlow.C1():boolean");
    }

    public final void D1() {
        List list;
        View view;
        List list2;
        int i9 = 8;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f30399q).equals("m3u")) {
            if (this.f30366F == null || this.f30381U == 0 || (list2 = this.f30383W) == null) {
                ProgressBar progressBar = this.f30386d;
                if (progressBar == null) {
                    return;
                }
                progressBar.setVisibility(8);
                view = this.f30396n;
                i9 = 0;
            } else {
                this.f30402t = new r(list2, this.f30399q);
                this.f30401s = new C2858a(this.f30399q).A().equals(AbstractC2237a.f44453K0) ? new GridLayoutManager(this.f30399q, 2) : new GridLayoutManager(this.f30399q, 2);
                this.f30390h.setLayoutManager(this.f30401s);
                this.f30390h.setItemAnimator(new androidx.recyclerview.widget.c());
                this.f30390h.setAdapter(this.f30402t);
                view = this.f30386d;
                if (view == null) {
                    return;
                }
            }
        } else {
            if (this.f30366F == null || (list = this.f30383W) == null) {
                return;
            }
            this.f30402t = new r(list, this.f30399q);
            this.f30401s = new C2858a(this.f30399q).A().equals(AbstractC2237a.f44453K0) ? new GridLayoutManager(this.f30399q, 2) : new GridLayoutManager(this.f30399q, 2);
            this.f30390h.setLayoutManager(this.f30401s);
            this.f30390h.setItemAnimator(new androidx.recyclerview.widget.c());
            this.f30390h.setAdapter(this.f30402t);
            view = this.f30386d;
            if (view == null) {
                return;
            }
        }
        view.setVisibility(i9);
    }

    public final void E1(Activity activity) {
        try {
            View viewInflate = ((LayoutInflater) activity.getSystemService("layout_inflater")).inflate(a7.g.f12619C4, (RelativeLayout) activity.findViewById(a7.f.Ve));
            PopupWindow popupWindow = new PopupWindow(activity);
            this.f30373M = popupWindow;
            popupWindow.setContentView(viewInflate);
            this.f30373M.setWidth(-1);
            this.f30373M.setHeight(-1);
            this.f30373M.setFocusable(true);
            this.f30373M.showAtLocation(viewInflate, 17, 0, 0);
            Button button = (Button) viewInflate.findViewById(a7.f.f12157H0);
            Button button2 = (Button) viewInflate.findViewById(a7.f.f12482o0);
            RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) viewInflate.findViewById(a7.f.rd);
            radioButton.requestFocus();
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
            String liveActivitynewFlowSort = SharepreferenceDBHandler.getLiveActivitynewFlowSort(activity);
            if (liveActivitynewFlowSort.equals("1")) {
                radioButton3.setChecked(true);
            } else if (liveActivitynewFlowSort.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            button2.setOnClickListener(new a());
            button.setOnClickListener(new b(radioGroup, viewInflate, activity));
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
        RecyclerView recyclerView = this.f30390h;
        if (recyclerView != null) {
            recyclerView.setClickable(true);
        }
        r rVar = this.f30402t;
        if (rVar != null && (progressBar = f30360Z) != null) {
            rVar.L0(progressBar);
            this.f30402t.w();
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
            this.f30380T = new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else if (id == a7.f.Xa) {
            w.j(this.f30399q);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(a7.g.f12704R);
        this.f30386d = (ProgressBar) findViewById(a7.f.ec);
        this.f30387e = (Toolbar) findViewById(a7.f.kh);
        this.f30388f = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f30389g = (ProgressBar) findViewById(a7.f.oc);
        this.f30390h = (RecyclerView) findViewById(a7.f.ub);
        this.f30391i = (TextView) findViewById(a7.f.f12249Q2);
        this.f30392j = (FrameLayout) findViewById(a7.f.f12250Q3);
        this.f30393k = (ImageView) findViewById(a7.f.f12211M4);
        this.f30394l = (TextView) findViewById(a7.f.sk);
        this.f30395m = (TextView) findViewById(a7.f.wk);
        this.f30396n = (RelativeLayout) findViewById(a7.f.Oe);
        this.f30397o = (Button) findViewById(a7.f.f12523s0);
        this.f30398p = (ImageView) findViewById(a7.f.Xa);
        AbstractC2237a.f44515k0 = Boolean.FALSE;
        AppBarLayout appBarLayout = this.f30388f;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        z1();
        r1((Toolbar) findViewById(a7.f.kh));
        this.f30399q = this;
        Handler handler = new Handler();
        this.f30376P = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.f30386d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f30398p.setOnClickListener(new c());
        this.f30380T = new l().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f30392j.setVisibility(8);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f30387e.x(a7.h.f12935r);
        this.f30379S = menu;
        this.f30378R = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f30387e.getChildCount(); i9++) {
            if (this.f30387e.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f30387e.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f30380T;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f30380T.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f30379S;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f30378R = menuItem;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f30399q) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new f()).g(getResources().getString(a7.j.f13231d4), new e()).n();
        }
        if (itemId == a7.f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f30375O = searchView;
            searchView.setQueryHint(getResources().getString(a7.j.f12980D6));
            this.f30375O.setIconifiedByDefault(false);
            this.f30375O.setOnQueryTextListener(new g());
            return true;
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f30399q.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f30399q.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f30399q.getResources().getString(a7.j.f13132S8), new h());
            c0158a.g(this.f30399q.getResources().getString(a7.j.f13231d4), new i());
            c0158a.n();
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f30399q.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f30399q.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f30399q.getResources().getString(a7.j.f13132S8), new j());
            c0158a2.g(this.f30399q.getResources().getString(a7.j.f13231d4), new k());
            c0158a2.n();
        }
        if (itemId == a7.f.mb) {
            this.f30395m.setVisibility(8);
            E1(this);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f30399q);
        w.z0(this.f30399q);
        getWindow().setFlags(1024, 1024);
        FrameLayout frameLayout = this.f30392j;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        r rVar = this.f30402t;
        if (rVar != null) {
            rVar.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f30400r = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f30400r.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        }
    }
}
