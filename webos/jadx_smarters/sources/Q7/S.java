package q7;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.SearchActivity;
import com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK;
import com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import i7.AbstractC1902a;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import m7.AbstractC2237a;
import n4.C2281m;
import o4.C2325b;
import o4.C2328e;
import u7.C2858a;
import x4.C2957a;

/* JADX INFO: loaded from: classes4.dex */
public class S extends RecyclerView.g {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static SharedPreferences f47402B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static int f47403C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f47405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f47406e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DatabaseHandler f47408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Animation f47409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f47410i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProgressDialog f47412k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C2328e f47415n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Handler f47417p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LiveStreamDBHandler f47419r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f47422u;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SimpleDateFormat f47427z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f47407f = Boolean.FALSE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f47411j = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f47413l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47414m = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f47416o = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f47420s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f47423v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f47424w = "";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f47425x = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f47426y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f47404A = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f47418q = new ArrayList();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f47421t = new ArrayList();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47428a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f47430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f47431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f47432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f47433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ c f47434h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f47435i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f47436j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f47437k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f47438l;

        public a(int i9, String str, int i10, String str2, String str3, String str4, c cVar, String str5, String str6, String str7, int i11) {
            this.f47428a = i9;
            this.f47429c = str;
            this.f47430d = i10;
            this.f47431e = str2;
            this.f47432f = str3;
            this.f47433g = str4;
            this.f47434h = cVar;
            this.f47435i = str5;
            this.f47436j = str6;
            this.f47437k = str7;
            this.f47438l = i11;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f47428a != S.this.f47404A) {
                S.this.f47404A = this.f47428a;
                this.f47434h.f47446y.setBackground(S.this.f47406e.getResources().getDrawable(a7.c.f11867r));
                if (Build.VERSION.SDK_INT >= 23) {
                    ((SearchActivity) S.this.f47406e).P1(this.f47431e, this.f47435i, this.f47436j, this.f47437k, this.f47438l);
                } else {
                    ((SearchActivityLowerSDK) S.this.f47406e).w(this.f47431e, this.f47435i, this.f47436j, this.f47437k, this.f47438l);
                }
                S.this.w();
                return;
            }
            try {
                S s9 = S.this;
                s9.f47415n = C2325b.e(s9.f47406e).c().c();
            } catch (Exception unused) {
            }
            if (S.this.f47415n == null || !S.this.f47415n.c()) {
                S.this.N0(this.f47430d, this.f47433g, this.f47429c);
                return;
            }
            if (S.this.f47415n != null && S.this.f47415n.r() != null && S.this.f47415n.r().j() != null && S.this.f47415n.r().j().J() != null) {
                S s10 = S.this;
                s10.f47416o = s10.f47415n.r().j().J();
            }
            String strU = SharepreferenceDBHandler.getCurrentAPPType(S.this.f47406e).equals("m3u") ? this.f47429c : m7.w.U(S.this.f47406e, this.f47430d, "m3u8", "live");
            if (S.this.f47416o.contains(String.valueOf(strU))) {
                S.this.f47406e.startActivity(new Intent(S.this.f47406e, (Class<?>) ExpandedControlsActivity.class));
                return;
            }
            C2281m c2281m = new C2281m(1);
            c2281m.M("com.google.android.gms.cast.metadata.TITLE", this.f47431e);
            c2281m.c(new C2957a(Uri.parse(this.f47432f)));
            S s11 = S.this;
            AbstractC1902a.b(s11.f47417p, s11.f47415n.r(), strU, c2281m, S.this.f47406e);
        }
    }

    public class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(String... strArr) {
            try {
                return S.this.B0(strArr[1]);
            } catch (Exception unused) {
                return "error";
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            S.this.J0();
            S.this.j0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public static class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47441t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f47442u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f47443v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public LinearLayout f47444w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ProgressBar f47445x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public LinearLayout f47446y;

        public c(View view) {
            super(view);
            this.f47441t = (TextView) view.findViewById(a7.f.gl);
            this.f47442u = (TextView) view.findViewById(a7.f.cl);
            this.f47443v = (TextView) view.findViewById(a7.f.el);
            this.f47444w = (LinearLayout) view.findViewById(a7.f.l9);
            this.f47445x = (ProgressBar) view.findViewById(a7.f.pc);
            this.f47446y = (LinearLayout) view.findViewById(a7.f.f12165H8);
        }
    }

    public class d extends AsyncTask {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            try {
                return S.this.K0();
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            S.this.O0();
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            S.this.Q0();
            super.onPreExecute();
        }
    }

    public S(Context context, ArrayList arrayList) {
        this.f47410i = "mobile";
        this.f47406e = context;
        this.f47405d = arrayList;
        this.f47408g = new DatabaseHandler(context);
        this.f47409h = AnimationUtils.loadAnimation(context, a7.b.f11823a);
        this.f47419r = new LiveStreamDBHandler(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("timeFormat", 0);
        f47402B = sharedPreferences;
        this.f47427z = new SimpleDateFormat(sharedPreferences.getString("timeFormat", AbstractC2237a.f44441E0), Locale.US);
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f47410i = "tv";
        } else {
            this.f47410i = "mobile";
        }
        this.f47417p = new Handler(Looper.getMainLooper());
        if (this.f47410i.equals("mobile")) {
            try {
                this.f47415n = C2325b.e(context).c().c();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J0() {
        ProgressDialog progressDialog = this.f47412k;
        if (progressDialog == null || !progressDialog.isShowing()) {
            return;
        }
        this.f47412k.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean K0() {
        try {
            if (this.f47406e != null) {
                ArrayList arrayList = this.f47418q;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.f47418q = this.f47419r.getAllliveCategories();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                int streamsCount = this.f47419r.getStreamsCount("live");
                liveStreamCategoryIdDBModel.setLiveStreamCategoryID("0");
                liveStreamCategoryIdDBModel.setLiveStreamCategoryName(this.f47406e.getResources().getString(a7.j.f13426x));
                liveStreamCategoryIdDBModel.setLiveStreamCounter(streamsCount);
                liveStreamCategoryIdDBModel2.setLiveStreamCategoryID("-1");
                liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(this.f47406e.getResources().getString(a7.j.f13209b2));
                this.f47420s = SharepreferenceDBHandler.getCurrentAPPType(this.f47406e).equals("m3u") ? this.f47419r.getUncatCountM3UByType("live") : this.f47419r.getUncatCount("-2", "live");
                int i9 = this.f47420s;
                if (i9 != 0 && i9 > 0) {
                    liveStreamCategoryIdDBModel3.setLiveStreamCategoryID("-2");
                    liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(this.f47406e.getResources().getString(a7.j.f13215b8));
                    liveStreamCategoryIdDBModel3.setLiveStreamCounter(this.f47420s);
                    ArrayList arrayList2 = this.f47418q;
                    arrayList2.add(arrayList2.size(), liveStreamCategoryIdDBModel3);
                }
                this.f47418q.add(0, liveStreamCategoryIdDBModel);
                this.f47418q.add(1, liveStreamCategoryIdDBModel2);
            }
            return Boolean.TRUE;
        } catch (NullPointerException unused) {
            return Boolean.FALSE;
        } catch (Exception unused2) {
            return Boolean.FALSE;
        }
    }

    private void L0() {
        new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0() {
        ArrayList arrayList = this.f47418q;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = this.f47421t;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ArrayList arrayList3 = new ArrayList();
        this.f47421t = arrayList3;
        arrayList3.addAll(this.f47418q);
        int i9 = 0;
        while (true) {
            if (i9 >= this.f47418q.size()) {
                break;
            }
            if (this.f47423v.equals(String.valueOf(((LiveStreamCategoryIdDBModel) this.f47418q.get(i9)).getLiveStreamCategoryID()))) {
                this.f47424w = ((LiveStreamCategoryIdDBModel) this.f47418q.get(i9)).getLiveStreamCategoryName();
                break;
            }
            i9++;
        }
        ArrayList arrayList4 = this.f47421t;
        if (arrayList4 == null || arrayList4.size() <= 0) {
            return;
        }
        VodAllCategoriesSingleton.getInstance().setLiveCategoriesList(this.f47421t);
        m7.w.f44702o = new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_all", this.f47423v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0() {
        ProgressDialog progressDialog = new ProgressDialog(this.f47406e);
        this.f47412k = progressDialog;
        progressDialog.setCanceledOnTouchOutside(false);
        this.f47412k.setMessage(this.f47406e.getResources().getString(a7.j.f13392t5));
        this.f47412k.show();
    }

    public String B0(String str) {
        try {
            this.f47422u = this.f47419r.getAllLiveStreasWithCategoryId(str, "live");
            return "get_all";
        } catch (Exception unused) {
            return "get_all";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void E(RecyclerView.D d9, int i9) {
        int i10;
        String str;
        String str2;
        TextView textView;
        String str3;
        String str4;
        int i11;
        int i12;
        LinearLayout linearLayout;
        p(i9);
        this.f47406e.getSharedPreferences("showhidemoviename", 0).getInt("livestream", 1);
        c cVar = (c) d9;
        try {
            ArrayList arrayList = this.f47405d;
            if (arrayList != null && arrayList.size() > 0 && this.f47406e != null) {
                XMLTVProgrammePojo xMLTVProgrammePojo = (XMLTVProgrammePojo) this.f47405d.get(i9);
                String title = xMLTVProgrammePojo.getLiveName() != null ? xMLTVProgrammePojo.getTitle() : "";
                String desc = xMLTVProgrammePojo.getDesc() != null ? xMLTVProgrammePojo.getDesc() : "";
                String liveCategoryId = xMLTVProgrammePojo.getLiveCategoryId() != null ? xMLTVProgrammePojo.getLiveCategoryId() : "";
                String url = xMLTVProgrammePojo.getUrl() != null ? xMLTVProgrammePojo.getUrl() : "";
                String liveLogo = xMLTVProgrammePojo.getLiveLogo() != null ? xMLTVProgrammePojo.getLiveLogo() : "";
                if (xMLTVProgrammePojo.getLiveStreamID() != null) {
                    try {
                        i10 = Integer.parseInt(xMLTVProgrammePojo.getLiveStreamID());
                    } catch (NumberFormatException unused) {
                        i10 = 0;
                    }
                } else {
                    i10 = -1;
                }
                String strReplace = title.trim().replace("'", " ");
                cVar.f47441t.setText(strReplace);
                String start = xMLTVProgrammePojo.getStart();
                String stop = xMLTVProgrammePojo.getStop();
                long jX = m7.w.x(start, this.f47406e);
                Long lValueOf = Long.valueOf(jX);
                long jX2 = m7.w.x(stop, this.f47406e);
                Long lValueOf2 = Long.valueOf(jX2);
                if (m7.w.b0(jX, jX2, this.f47406e)) {
                    int iM = m7.w.M(jX, jX2, this.f47406e);
                    if (iM != 0) {
                        iM = 100 - iM;
                        if (iM != 0) {
                            String str5 = this.f47427z.format(lValueOf);
                            String str6 = " - " + this.f47427z.format(lValueOf2);
                            cVar.f47442u.setText(str5);
                            cVar.f47443v.setText(str6);
                            cVar.f47445x.setProgress(iM);
                            cVar.f47444w.setVisibility(0);
                            i11 = iM;
                            str3 = str6;
                            str4 = str5;
                        } else {
                            linearLayout = cVar.f47444w;
                            i12 = 8;
                        }
                    } else {
                        i12 = 8;
                        linearLayout = cVar.f47444w;
                    }
                    linearLayout.setVisibility(i12);
                    str4 = "";
                    str3 = str4;
                    i11 = iM;
                } else {
                    cVar.f47444w.setVisibility(8);
                    Date date = new Date();
                    Locale locale = Locale.US;
                    String str7 = new SimpleDateFormat("dd", locale).format(date);
                    String str8 = new SimpleDateFormat("dd", locale).format(lValueOf);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM dd", locale);
                    if (str7.equals(str8)) {
                        str = this.f47427z.format(lValueOf);
                        str2 = " - " + this.f47427z.format(lValueOf2);
                        cVar.f47442u.setText(str);
                        textView = cVar.f47443v;
                    } else {
                        str = simpleDateFormat.format(lValueOf) + ", " + this.f47427z.format(lValueOf);
                        str2 = " - " + this.f47427z.format(lValueOf2);
                        cVar.f47442u.setText(str);
                        textView = cVar.f47443v;
                    }
                    textView.setText(str2);
                    str3 = str2;
                    str4 = str;
                    i11 = 0;
                }
                String str9 = str3;
                try {
                    cVar.f47446y.setOnClickListener(new a(i9, url, i10, strReplace, liveLogo, liveCategoryId, cVar, desc, str4, str3, i11));
                    try {
                        if (this.f47404A == i9) {
                            cVar.f47446y.setBackground(this.f47406e.getResources().getDrawable(a7.c.f11867r));
                            cVar.f47446y.requestFocus();
                        } else {
                            cVar.f47446y.setBackground(this.f47406e.getResources().getDrawable(a7.e.f11974X0));
                        }
                        if (i9 != f47403C || this.f47413l) {
                            return;
                        }
                        this.f47413l = true;
                        cVar.f47446y.setBackground(this.f47406e.getResources().getDrawable(a7.c.f11867r));
                        if (Build.VERSION.SDK_INT >= 23) {
                            ((SearchActivity) this.f47406e).P1(strReplace, desc, str4, str9, i11);
                        } else {
                            ((SearchActivityLowerSDK) this.f47406e).w(strReplace, desc, str4, str9, i11);
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                }
            }
        } catch (Exception unused4) {
        }
    }

    public int F0(String str, String str2) {
        ArrayList arrayList = this.f47422u;
        if (arrayList != null && arrayList.size() > 0) {
            if (str2.equals("m3u")) {
                for (int i9 = 0; i9 < this.f47422u.size(); i9++) {
                    if (((LiveStreamsDBModel) this.f47422u.get(i9)).getUrl().equals(str)) {
                        return i9;
                    }
                }
            } else {
                for (int i10 = 0; i10 < this.f47422u.size(); i10++) {
                    if (((LiveStreamsDBModel) this.f47422u.get(i10)).getStreamId().equals(str)) {
                        return i10;
                    }
                }
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (this.f47410i.equals("tv")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12839m4;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12833l4;
        }
        return new c(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void N0(int i9, String str, String str2) {
        this.f47423v = str;
        this.f47426y = i9;
        this.f47425x = str2;
        L0();
    }

    public void j0() {
        try {
            int iF0 = SharepreferenceDBHandler.getCurrentAPPType(this.f47406e).equals("m3u") ? F0(this.f47425x, "m3u") : F0(String.valueOf(this.f47426y), "api");
            if (!this.f47410i.equals("tv")) {
                ArrayList arrayList = this.f47422u;
                if (arrayList == null || arrayList.size() <= 0) {
                    VodAllCategoriesSingleton.getInstance().setLiveList(null);
                    return;
                } else {
                    VodAllCategoriesSingleton.getInstance().setLiveList(this.f47422u);
                    m7.w.x0(this.f47406e, "Built-in Player ( Default )", this.f47426y, "live", iF0, "", "", "", this.f47423v, this.f47425x, this.f47424w);
                    return;
                }
            }
            String livePlayerPkgName = SharepreferenceDBHandler.getLivePlayerPkgName(this.f47406e);
            Intent intent = (livePlayerPkgName == null || !livePlayerPkgName.equalsIgnoreCase("default_native")) ? new Intent(this.f47406e, (Class<?>) NSTIJKPlayerSkyTvActivity.class) : new Intent(this.f47406e, (Class<?>) NSTEXOPlayerSkyTvActivity.class);
            intent.putExtra("OPENED_STREAM_ID", this.f47426y);
            intent.putExtra("VIDEO_NUM", iF0);
            intent.putExtra("OPENED_CAT_ID", this.f47423v);
            intent.putExtra("VIDEO_URL", this.f47425x);
            intent.putExtra("OPENED_CAT_NAME", this.f47424w);
            intent.putExtra("FROM_SEARCH", "true");
            this.f47406e.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList = this.f47405d;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return this.f47405d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return 0;
    }
}
