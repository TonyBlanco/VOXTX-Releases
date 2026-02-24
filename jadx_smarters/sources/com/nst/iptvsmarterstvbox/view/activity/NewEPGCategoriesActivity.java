package com.nst.iptvsmarterstvbox.view.activity;

import P.AbstractC0980w;
import android.R;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.EPGSourcesModel;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.Listsingleton;
import com.squareup.picasso.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import m7.w;
import q7.C2628l;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class NewEPGCategoriesActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static ProgressBar f31243f0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LiveStreamDBHandler f31247D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayList f31248E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f31249F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f31250G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f31251H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f31252I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f31253J;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SearchView f31259P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public SharedPreferences f31260Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public SharedPreferences.Editor f31261R;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public MenuItem f31263T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Menu f31264U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public List f31267X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Boolean f31268Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Boolean f31269Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f31270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewPager f31271e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C2858a f31272e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Toolbar f31273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppBarLayout f31274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f31275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f31276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f31277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f31278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f31279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f31280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f31281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f31282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f31283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LinearLayout f31284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f31285r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SharedPreferences f31286s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f31287t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public GridLayoutManager f31288u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C2628l f31289v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f31290w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f31291x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f31292y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f31293z = 1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31244A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f31245B = 20;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f31246C = new ArrayList();

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f31254K = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f31255L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31256M = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f31257N = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public ArrayList f31258O = new ArrayList();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f31262S = -1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public AsyncTask f31265V = null;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public ArrayList f31266W = new ArrayList();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f31294a;

        public a(Dialog dialog) {
            this.f31294a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f31294a.dismiss();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Dialog f31296a;

        public b(Dialog dialog) {
            this.f31296a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f31296a.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(NewEPGCategoriesActivity.this.f31285r);
        }
    }

    public class d extends Dialog implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f31299a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f31300c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f31301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinearLayout f31302e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public LinearLayout f31303f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public RadioGroup f31304g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Activity f31305h;

        public class a implements View.OnFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public View f31307a;

            public a(View view) {
                this.f31307a = view;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z9) {
                LinearLayout linearLayout;
                int i9;
                if (z9) {
                    View view2 = this.f31307a;
                    if (view2 == null || view2.getTag() == null || !this.f31307a.getTag().equals("1")) {
                        View view3 = this.f31307a;
                        if (view3 == null || view3.getTag() == null || !this.f31307a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f31303f;
                        }
                    } else {
                        linearLayout = d.this.f31302e;
                    }
                    i9 = a7.e.f12042p;
                } else {
                    View view4 = this.f31307a;
                    if (view4 == null || view4.getTag() == null || !this.f31307a.getTag().equals("1")) {
                        View view5 = this.f31307a;
                        if (view5 == null || view5.getTag() == null || !this.f31307a.getTag().equals("2")) {
                            return;
                        } else {
                            linearLayout = d.this.f31303f;
                        }
                    } else {
                        linearLayout = d.this.f31302e;
                    }
                    i9 = a7.e.f12038o;
                }
                linearLayout.setBackgroundResource(i9);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity, Activity activity2) {
            super(activity);
            this.f31305h = activity2;
            this.f31299a = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewEPGCategoriesActivity newEPGCategoriesActivity;
            if (view.getId() == a7.f.f12544u1) {
                try {
                    RadioButton radioButton = (RadioButton) findViewById(this.f31304g.getCheckedRadioButtonId());
                    if (radioButton.getText().toString().equals(this.f31305h.getResources().getString(a7.j.f13254f7))) {
                        NewEPGCategoriesActivity.this.f31261R.putString("sort", "1");
                        newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
                    } else if (radioButton.getText().toString().equals(this.f31305h.getResources().getString(a7.j.f13304k7))) {
                        NewEPGCategoriesActivity.this.f31261R.putString("sort", "2");
                        newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
                    } else {
                        NewEPGCategoriesActivity.this.f31261R.putString("sort", "0");
                        newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
                    }
                    newEPGCategoriesActivity.f31261R.commit();
                    NewEPGCategoriesActivity.this.f31265V = NewEPGCategoriesActivity.this.new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                    dismiss();
                } catch (Exception unused) {
                }
            } else if (view.getId() == a7.f.f12412h1) {
                dismiss();
            }
            dismiss();
        }

        @Override // android.app.Dialog
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            setContentView(a7.g.f12916z3);
            this.f31300c = (TextView) findViewById(a7.f.f12544u1);
            this.f31301d = (TextView) findViewById(a7.f.f12412h1);
            this.f31301d = (TextView) findViewById(a7.f.f12412h1);
            this.f31302e = (LinearLayout) findViewById(a7.f.V8);
            this.f31303f = (LinearLayout) findViewById(a7.f.Ia);
            this.f31304g = (RadioGroup) findViewById(a7.f.Kd);
            RadioButton radioButton = (RadioButton) findViewById(a7.f.rd);
            RadioButton radioButton2 = (RadioButton) findViewById(a7.f.md);
            RadioButton radioButton3 = (RadioButton) findViewById(a7.f.fd);
            RadioButton radioButton4 = (RadioButton) findViewById(a7.f.zd);
            RadioButton radioButton5 = (RadioButton) findViewById(a7.f.gd);
            RadioButton radioButton6 = (RadioButton) findViewById(a7.f.hd);
            ((RadioButton) findViewById(a7.f.td)).setVisibility(8);
            radioButton5.setVisibility(8);
            radioButton6.setVisibility(8);
            radioButton2.setVisibility(8);
            radioButton3.setOnFocusChangeListener(NewEPGCategoriesActivity.this.new o(radioButton3));
            radioButton4.setOnFocusChangeListener(NewEPGCategoriesActivity.this.new o(radioButton4));
            String string = NewEPGCategoriesActivity.this.f31260Q.getString("sort", "");
            string.hashCode();
            if (string.equals("1")) {
                radioButton3.setChecked(true);
            } else if (string.equals("2")) {
                radioButton4.setChecked(true);
            } else {
                radioButton.setChecked(true);
            }
            this.f31300c.setOnClickListener(this);
            this.f31301d.setOnClickListener(this);
            TextView textView = this.f31300c;
            textView.setOnFocusChangeListener(new a(textView));
            TextView textView2 = this.f31301d;
            textView2.setOnFocusChangeListener(new a(textView2));
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f31309a;

        public e(View view) {
            this.f31309a = view;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            Resources resources;
            int i9;
            if (z9) {
                View view2 = this.f31309a;
                if (view2 == null || view2.getTag() == null || !this.f31309a.getTag().equals("iv_cross")) {
                    return;
                }
                resources = NewEPGCategoriesActivity.this.getResources();
                i9 = a7.e.f11937M;
            } else {
                View view3 = this.f31309a;
                if (view3 == null || view3.getTag() == null || !this.f31309a.getTag().equals("iv_cross")) {
                    return;
                }
                resources = NewEPGCategoriesActivity.this.getResources();
                i9 = a7.e.f11933L;
            }
            view.setBackground(resources.getDrawable(i9));
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NewEPGCategoriesActivity.this.onBackPressed();
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
            w.n0(NewEPGCategoriesActivity.this.f31285r);
        }
    }

    public class i implements SearchView.m {
        public i() {
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextChange(String str) {
            TextView textView;
            AbstractC2237a.f44515k0 = str.length() > 0 ? Boolean.FALSE : Boolean.TRUE;
            NewEPGCategoriesActivity.this.f31281n.setVisibility(8);
            NewEPGCategoriesActivity newEPGCategoriesActivity = NewEPGCategoriesActivity.this;
            if (newEPGCategoriesActivity.f31289v == null || (textView = newEPGCategoriesActivity.f31280m) == null || textView.getVisibility() == 0) {
                return false;
            }
            NewEPGCategoriesActivity newEPGCategoriesActivity2 = NewEPGCategoriesActivity.this;
            newEPGCategoriesActivity2.f31289v.F0(str, newEPGCategoriesActivity2.f31281n);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.m
        public boolean onQueryTextSubmit(String str) {
            return false;
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            ImportStatusModel importStatusModel;
            Context applicationContext;
            String str;
            LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(NewEPGCategoriesActivity.this.f31285r);
            new C2858a(NewEPGCategoriesActivity.this.f31285r);
            ArrayList<EPGSourcesModel> activeEPGSource = liveStreamDBHandler.getActiveEPGSource();
            String strValueOf = (activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto());
            if (!strValueOf.equals("0") && (importStatusModel = liveStreamDBHandler.getdateDBStatus("epg", strValueOf)) != null) {
                if (importStatusModel.getStatus() == null || !importStatusModel.getStatus().equalsIgnoreCase("3")) {
                    w.a0(liveStreamDBHandler, strValueOf, NewEPGCategoriesActivity.this.f31285r);
                    applicationContext = NewEPGCategoriesActivity.this.getApplicationContext();
                    str = "Updating EPG in background.";
                } else {
                    applicationContext = NewEPGCategoriesActivity.this.getApplicationContext();
                    str = "EPG Update in progress.";
                }
                Toast.makeText(applicationContext, str, 0).show();
            }
            dialogInterface.dismiss();
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

    public class l implements DialogInterface.OnClickListener {
        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.cancel();
        }
    }

    public class n extends AsyncTask {
        public n() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return Boolean.valueOf(NewEPGCategoriesActivity.this.F1());
            } catch (Exception e9) {
                e9.printStackTrace();
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            NewEPGCategoriesActivity.this.H1();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class o implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f31320a;

        public o(View view) {
            this.f31320a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31320a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31320a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f31320a, "scaleY", f9);
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

    public NewEPGCategoriesActivity() {
        Boolean bool = Boolean.FALSE;
        this.f31268Y = bool;
        this.f31269Z = bool;
    }

    private void A1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private ArrayList C1() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f31247D.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f31285r));
        this.f31248E = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f31246C.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f31246C;
    }

    private ArrayList D1(ArrayList arrayList, ArrayList arrayList2) {
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
                        ArrayList arrayList3 = this.f31249F;
                        if (arrayList3 != null) {
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
        }
        return this.f31249F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean F1() {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.NewEPGCategoriesActivity.F1():boolean");
    }

    private void G1() {
        List listA = Listsingleton.b().a();
        Dialog dialog = new Dialog(this, a7.k.f13462g);
        dialog.requestWindowFeature(1);
        dialog.setContentView(a7.g.f12682N1);
        dialog.getWindow().setBackgroundDrawable(null);
        dialog.getWindow().setLayout(-1, -2);
        dialog.setCancelable(false);
        ImageView imageView = (ImageView) dialog.findViewById(a7.f.f12201L4);
        ImageView imageView2 = (ImageView) dialog.findViewById(a7.f.f12308W4);
        this.f31284q = (LinearLayout) dialog.findViewById(a7.f.f12114C7);
        imageView2.setOnClickListener(new a(dialog));
        this.f31284q.setOnClickListener(new b(dialog));
        imageView2.setOnFocusChangeListener(new w.k((View) imageView2, (Activity) this));
        imageView2.setOnFocusChangeListener(new e(imageView2));
        imageView2.setNextFocusUpId(a7.f.f12308W4);
        imageView2.setNextFocusDownId(a7.f.f12308W4);
        imageView2.setNextFocusRightId(a7.f.f12308W4);
        imageView2.setNextFocusLeftId(a7.f.f12308W4);
        imageView2.requestFocus();
        if (listA != null) {
            try {
                if (listA.size() > 0) {
                    if (listA.size() > AbstractC2237a.f44516k1) {
                        t.q(this.f31285r).l((String) listA.get(AbstractC2237a.f44516k1)).g(imageView);
                        AbstractC2237a.f44516k1++;
                    } else {
                        t.q(this.f31285r).l((String) listA.get(0)).g(imageView);
                        AbstractC2237a.f44516k1 = 1;
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        dialog.show();
        imageView2.requestFocus();
        dialog.getWindow().setBackgroundDrawableResource(a7.c.f11875z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H1() {
        List list;
        if (this.f31251H == null || (list = this.f31267X) == null) {
            return;
        }
        this.f31289v = new C2628l(this.f31285r, list);
        this.f31288u = new C2858a(this.f31285r).A().equals(AbstractC2237a.f44453K0) ? new GridLayoutManager(this.f31285r, 2) : new GridLayoutManager(this.f31285r, 2);
        this.f31276i.setLayoutManager(this.f31288u);
        this.f31276i.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f31276i.setAdapter(this.f31289v);
        ProgressBar progressBar = this.f31270d;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    private void I1(Activity activity) {
        new d((NewEPGCategoriesActivity) activity, activity).show();
    }

    public void B1() {
        if (Listsingleton.b().a() == null || Listsingleton.b().a().size() <= 0) {
            return;
        }
        AbstractC2237a.f44510i1 = true;
        G1();
    }

    public void E1() {
        try {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        } catch (Exception unused) {
        }
    }

    public void b() {
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        return keyCode == 82 ? keyEvent.getAction() == 0 ? onKeyDown(keyCode, keyEvent) : onKeyUp(keyCode, keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.f31276i.setClickable(true);
        C2628l c2628l = this.f31289v;
        if (c2628l != null) {
            c2628l.N0(f31243f0);
            this.f31289v.w();
        }
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == a7.f.Bj) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
        } else if (view.getId() == a7.f.f12211M4) {
            this.f31265V = new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f31285r = this;
        super.onCreate(bundle);
        E1();
        setContentView(a7.g.f12888v);
        this.f31270d = (ProgressBar) findViewById(a7.f.ec);
        this.f31271e = (ViewPager) findViewById(a7.f.Om);
        this.f31273f = (Toolbar) findViewById(a7.f.kh);
        this.f31274g = (AppBarLayout) findViewById(a7.f.f12303W);
        this.f31275h = (ProgressBar) findViewById(a7.f.oc);
        this.f31276i = (RecyclerView) findViewById(a7.f.ub);
        this.f31277j = (TextView) findViewById(a7.f.f12249Q2);
        this.f31278k = (FrameLayout) findViewById(a7.f.f12250Q3);
        this.f31279l = (ImageView) findViewById(a7.f.f12211M4);
        this.f31280m = (TextView) findViewById(a7.f.sk);
        this.f31281n = (TextView) findViewById(a7.f.wk);
        this.f31282o = (ImageView) findViewById(a7.f.Xa);
        this.f31283p = (ImageView) findViewById(a7.f.f12141F4);
        AbstractC2237a.f44515k0 = Boolean.FALSE;
        AppBarLayout appBarLayout = this.f31274g;
        if (appBarLayout != null) {
            appBarLayout.setBackground(getResources().getDrawable(a7.e.f12034n));
        }
        A1();
        r1((Toolbar) findViewById(a7.f.kh));
        this.f31272e0 = new C2858a(this.f31285r);
        this.f31247D = new LiveStreamDBHandler(this.f31285r);
        SharedPreferences sharedPreferences = getSharedPreferences("sortepg", 0);
        this.f31260Q = sharedPreferences;
        this.f31261R = sharedPreferences.edit();
        if (this.f31260Q.getString("sort", "").equals("")) {
            this.f31261R.putString("sort", "0");
            this.f31261R.commit();
        }
        Handler handler = new Handler();
        this.f31287t = handler;
        handler.removeCallbacksAndMessages(null);
        ProgressBar progressBar = this.f31270d;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        this.f31265V = new n().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        this.f31278k.setVisibility(8);
        this.f31282o.setOnClickListener(new c());
        this.f31283p.setOnClickListener(new f());
        w.Z(this.f31285r);
        if (AbstractC2237a.f44475V0.booleanValue() && AbstractC2237a.f44498e1.equalsIgnoreCase("1")) {
            if (SharepreferenceDBHandler.getEventAdsView(this) < AbstractC2237a.f44501f1) {
                SharepreferenceDBHandler.setEventAdsView(SharepreferenceDBHandler.getEventAdsView(this) + 1, this);
            } else {
                SharepreferenceDBHandler.setEventAdsView(0, this);
                B1();
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.f31273f.x(a7.h.f12935r);
        this.f31264U = menu;
        this.f31263T = menu.getItem(2).getSubMenu().findItem(a7.f.f12239P2);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f31285r).equals("api") || SharepreferenceDBHandler.getCurrentAPPType(this.f31285r).equals("m3u")) {
            menu.getItem(2).getSubMenu().findItem(a7.f.gb).setVisible(false);
        }
        TypedValue typedValue = new TypedValue();
        if (getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f31273f.getChildCount(); i9++) {
            if (this.f31273f.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f31273f.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
        return true;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f31265V;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            return;
        }
        this.f31265V.cancel(true);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i9, KeyEvent keyEvent) {
        if (i9 != 82) {
            return super.onKeyUp(i9, keyEvent);
        }
        Menu menu = this.f31264U;
        if (menu == null) {
            return true;
        }
        menu.performIdentifierAction(a7.f.f12239P2, 0);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        this.f31263T = menuItem;
        this.f31273f.e();
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this, (Class<?>) NewDashboardActivity.class));
            finish();
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this, (Class<?>) SettingsActivity.class));
        }
        if (itemId == a7.f.f12390f && (context = this.f31285r) != null) {
            new a.C0158a(context, a7.k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new h()).g(getResources().getString(a7.j.f13231d4), new g()).n();
        }
        if (itemId == a7.f.f12400g) {
            SearchView searchView = (SearchView) AbstractC0980w.b(menuItem);
            this.f31259P = searchView;
            searchView.setQueryHint(getResources().getString(a7.j.f12960B6));
            this.f31259P.setIconifiedByDefault(false);
            this.f31259P.setOnQueryTextListener(new i());
            return true;
        }
        if (itemId == a7.f.gb) {
            a.C0158a c0158a = new a.C0158a(this);
            c0158a.setTitle(this.f31285r.getResources().getString(a7.j.f13397u0));
            c0158a.f(this.f31285r.getResources().getString(a7.j.f13134T0));
            c0158a.d(a7.e.f12056s1);
            c0158a.j(this.f31285r.getResources().getString(a7.j.f13132S8), new j());
            c0158a.g(this.f31285r.getResources().getString(a7.j.f13231d4), new k());
            c0158a.n();
        }
        if (itemId == a7.f.ib) {
            a.C0158a c0158a2 = new a.C0158a(this);
            c0158a2.setTitle(this.f31285r.getResources().getString(a7.j.f13397u0));
            c0158a2.f(this.f31285r.getResources().getString(a7.j.f13134T0));
            c0158a2.d(a7.e.f12056s1);
            c0158a2.j(this.f31285r.getResources().getString(a7.j.f13132S8), new l());
            c0158a2.g(this.f31285r.getResources().getString(a7.j.f13231d4), new m());
            c0158a2.n();
        }
        if (itemId == a7.f.mb) {
            I1(this);
            b();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        E1();
        super.onResume();
        w.m(this.f31285r);
        w.z0(this.f31285r);
        getWindow().setFlags(1024, 1024);
        this.f31278k.setVisibility(8);
        C2628l c2628l = this.f31289v;
        if (c2628l != null) {
            c2628l.N0(f31243f0);
            this.f31289v.w();
        }
        SharedPreferences sharedPreferences = getSharedPreferences("loginPrefs", 0);
        this.f31286s = sharedPreferences;
        if (sharedPreferences.getString(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, "").equals("") && this.f31286s.getString(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, "").equals("")) {
            startActivity(new Intent(this, (Class<?>) LoginActivity.class));
        } else if (this.f31285r != null) {
            b();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        E1();
    }
}
