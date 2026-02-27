package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: renamed from: q7.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2639x extends RecyclerView.g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public GridLayoutManager f49517A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f49518B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f49519C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public z7.h f49520D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public PopupWindow f49521E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public ArrayList f49522F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f49523G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public ArrayList f49525I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f49526J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f49527K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public DatabaseHandler f49528L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f49529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f49530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f49531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f49532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LiveStreamDBHandler f49533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatabaseHandler f49534i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f49539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ProgressBar f49540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RelativeLayout f49541p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AppBarLayout f49543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PopupWindow f49544s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f49546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f49547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f49548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f49549x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C2640y f49551z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f49535j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f49536k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AsyncTask f49537l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f49538m = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public AsyncTask f49542q = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AsyncTask f49545t = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f49550y = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f49524H = new ArrayList();

    /* JADX INFO: renamed from: q7.x$a */
    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f49552a;

        public a(RecyclerView recyclerView) {
            this.f49552a = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            C2639x c2639x;
            int i10;
            RecyclerView.o layoutManager = this.f49552a.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i9 == 20) {
                c2639x = C2639x.this;
                i10 = 1;
            } else {
                if (i9 != 19) {
                    return false;
                }
                c2639x = C2639x.this;
                i10 = -1;
            }
            return c2639x.e1(layoutManager, i10);
        }
    }

    /* JADX INFO: renamed from: q7.x$b */
    public class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel, LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2) {
            return liveStreamCategoryIdDBModel.getLiveStreamCategoryName().compareTo(liveStreamCategoryIdDBModel2.getLiveStreamCategoryName());
        }
    }

    /* JADX INFO: renamed from: q7.x$c */
    public class c implements Comparator {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel, LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2) {
            return liveStreamCategoryIdDBModel2.getLiveStreamCategoryName().compareTo(liveStreamCategoryIdDBModel.getLiveStreamCategoryName());
        }
    }

    /* JADX INFO: renamed from: q7.x$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f49556a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49557c;

        public d(h hVar, String str) {
            this.f49556a = hVar;
            this.f49557c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2639x.this.f49538m = this.f49556a.p();
            C2639x c2639x = C2639x.this;
            c2639x.K0(c2639x.f49530e, view, this.f49557c);
        }
    }

    /* JADX INFO: renamed from: q7.x$e */
    public class e implements PopupWindow.OnDismissListener {
        public e() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
        }
    }

    /* JADX INFO: renamed from: q7.x$f */
    public class f extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f49560a;

        public f(h hVar) {
            this.f49560a = hVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(h... hVarArr) {
            try {
                return SharepreferenceDBHandler.getCurrentAPPType(C2639x.this.f49530e).equals("m3u") ? Integer.valueOf(C2639x.this.f49533h.getFavouriteCountM3U("live")) : Integer.valueOf(C2639x.this.f49534i.getFavouriteCount("live", SharepreferenceDBHandler.getUserID(C2639x.this.f49530e)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f49560a.f49568y.setText("0");
            } else {
                this.f49560a.f49568y.setText(String.valueOf(num));
            }
            this.f49560a.f49568y.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f49560a.f49568y.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q7.x$g */
    public class g extends AsyncTask {
        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.String doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                r0 = 0
                r6 = r6[r0]     // Catch: java.lang.Exception -> L54
                int r1 = r6.hashCode()     // Catch: java.lang.Exception -> L54
                r2 = -74797390(0xfffffffffb8aaeb2, float:-1.4401604E36)
                r3 = 2
                r4 = 1
                if (r1 == r2) goto L2c
                r2 = 47612238(0x2d6814e, float:3.1518691E-37)
                if (r1 == r2) goto L22
                r2 = 613425326(0x249020ae, float:6.2505407E-17)
                if (r1 == r2) goto L19
                goto L36
            L19:
                java.lang.String r1 = "all_channels"
                boolean r6 = r6.equals(r1)     // Catch: java.lang.Exception -> L54
                if (r6 == 0) goto L36
                goto L37
            L22:
                java.lang.String r0 = "all_channels_with_cat"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L54
                if (r6 == 0) goto L36
                r0 = 1
                goto L37
            L2c:
                java.lang.String r0 = "get_fav"
                boolean r6 = r6.equals(r0)     // Catch: java.lang.Exception -> L54
                if (r6 == 0) goto L36
                r0 = 2
                goto L37
            L36:
                r0 = -1
            L37:
                if (r0 == 0) goto L4d
                if (r0 == r4) goto L46
                if (r0 == r3) goto L3f
                r6 = 0
                return r6
            L3f:
                q7.x r6 = q7.C2639x.this     // Catch: java.lang.Exception -> L54
                java.lang.String r6 = r6.O0()     // Catch: java.lang.Exception -> L54
                return r6
            L46:
                q7.x r6 = q7.C2639x.this     // Catch: java.lang.Exception -> L54
                java.lang.String r6 = q7.C2639x.r0(r6)     // Catch: java.lang.Exception -> L54
                return r6
            L4d:
                q7.x r6 = q7.C2639x.this     // Catch: java.lang.Exception -> L54
                java.lang.String r6 = q7.C2639x.q0(r6)     // Catch: java.lang.Exception -> L54
                return r6
            L54:
                java.lang.String r6 = "error"
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.C2639x.g.doInBackground(java.lang.String[]):java.lang.String");
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            try {
                if (C2639x.this.f49546u == null || C2639x.this.f49546u.size() == 0) {
                    ProgressBar progressBar = C2639x.this.f49540o;
                    if (progressBar != null) {
                        progressBar.setVisibility(4);
                        C2639x.this.f49519C.setVisibility(0);
                    }
                } else {
                    C2639x c2639x = C2639x.this;
                    c2639x.d1(c2639x.f49546u);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    /* JADX INFO: renamed from: q7.x$h */
    public static class h extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49563t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f49564u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f49565v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f49566w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f49567x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public TextView f49568y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public ImageView f49569z;

        public h(View view) {
            super(view);
            this.f49563t = (TextView) view.findViewById(a7.f.fk);
            this.f49564u = (ProgressBar) view.findViewById(a7.f.oc);
            this.f49565v = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f49566w = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f49567x = (RelativeLayout) view.findViewById(a7.f.Wg);
            this.f49568y = (TextView) view.findViewById(a7.f.Vl);
            this.f49569z = (ImageView) view.findViewById(a7.f.f12426i5);
            J(false);
        }
    }

    /* JADX INFO: renamed from: q7.x$i */
    public class i implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f49570a;

        public i(View view) {
            this.f49570a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49570a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49570a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49570a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            View view2;
            int i9;
            if (z9) {
                b(1.09f);
                c(1.09f);
                Log.e("id is", "" + this.f49570a.getTag());
                view2 = this.f49570a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(false);
                view2 = this.f49570a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public C2639x(List list, Context context, z7.h hVar, PopupWindow popupWindow, int i9) {
        ArrayList arrayList = new ArrayList();
        this.f49531f = arrayList;
        arrayList.addAll(list);
        this.f49532g = list;
        this.f49529d = list;
        this.f49530e = context;
        this.f49533h = new LiveStreamDBHandler(context);
        this.f49534i = new DatabaseHandler(context);
        this.f49546u = new ArrayList();
        this.f49547v = new ArrayList();
        this.f49548w = new ArrayList();
        this.f49549x = new ArrayList();
        this.f49520D = hVar;
        this.f49521E = popupWindow;
        this.f49528L = new DatabaseHandler(context);
        String liveActivitynewFlowSort = SharepreferenceDBHandler.getLiveActivitynewFlowSort(context);
        if (liveActivitynewFlowSort.equals("1")) {
            Collections.sort(list, new b());
        }
        if (liveActivitynewFlowSort.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A0() {
        try {
            ArrayList arrayList = this.f49546u;
            if (arrayList != null && this.f49547v != null) {
                arrayList.clear();
                this.f49547v.clear();
            }
            int parentalStatusCount = this.f49533h.getParentalStatusCount(SharepreferenceDBHandler.getUserID(this.f49530e));
            ArrayList<LiveStreamsDBModel> allLiveStreasWithCategoryId = this.f49533h.getAllLiveStreasWithCategoryId("0", "live");
            this.f49523G = allLiveStreasWithCategoryId;
            if (parentalStatusCount <= 0 || allLiveStreasWithCategoryId == null) {
                this.f49546u = allLiveStreasWithCategoryId;
                return "all_channels";
            }
            ArrayList arrayList2 = this.f49524H;
            if (arrayList2 != null) {
                this.f49548w = R0(allLiveStreasWithCategoryId, arrayList2);
            }
            this.f49546u = this.f49548w;
            return "all_channels";
        } catch (Exception unused) {
            return "all_channels";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String F0() {
        try {
            ArrayList arrayList = this.f49546u;
            if (arrayList != null && this.f49547v != null) {
                arrayList.clear();
                this.f49547v.clear();
            }
            LiveStreamDBHandler liveStreamDBHandler = this.f49533h;
            if (liveStreamDBHandler != null) {
                this.f49549x = liveStreamDBHandler.getAllLiveStreasWithCategoryId(this.f49550y, "live");
            }
            this.f49546u = this.f49549x;
            return "all_channels_with_cat";
        } catch (Exception unused) {
            return "all_channels_with_cat";
        }
    }

    private void L0() {
        AsyncTask asyncTask = this.f49545t;
        if (asyncTask == null || !asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            SharepreferenceDBHandler.setAsyncTaskStatus(0, this.f49530e);
        } else {
            SharepreferenceDBHandler.setAsyncTaskStatus(1, this.f49530e);
            this.f49545t.cancel(true);
        }
    }

    private ArrayList Q0() {
        ArrayList<PasswordStatusDBModel> allPasswordStatus = this.f49533h.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(this.f49530e));
        this.f49525I = allPasswordStatus;
        if (allPasswordStatus != null) {
            for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                    this.f49524H.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                }
            }
        }
        return this.f49524H;
    }

    private ArrayList R0(ArrayList arrayList, ArrayList arrayList2) {
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        this.f49547v.add(liveStreamsDBModel);
                        break;
                    }
                    if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                        break;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return this.f49547v;
    }

    private ArrayList S0(ArrayList arrayList, ArrayList arrayList2) {
        try {
            this.f49527K = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteDBModel favouriteDBModel = (FavouriteDBModel) it.next();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        this.f49527K.add(favouriteDBModel);
                        break;
                    }
                    if (favouriteDBModel.getCategoryID().equals((String) it2.next())) {
                        break;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return this.f49527K;
    }

    private ArrayList W0(ArrayList arrayList, ArrayList arrayList2) {
        this.f49526J = new ArrayList();
        if (arrayList == null) {
            return null;
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FavouriteM3UModel favouriteM3UModel = (FavouriteM3UModel) it.next();
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            this.f49526J.add(favouriteM3UModel);
                            break;
                        }
                        if (favouriteM3UModel.getCategoryID().equals((String) it2.next())) {
                            break;
                        }
                    }
                }
            }
            return this.f49526J;
        } catch (Exception unused) {
            return null;
        }
    }

    private void a1(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    private void b1(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1(ArrayList arrayList) {
        this.f49551z = new C2640y(arrayList, this.f49530e, this.f49544s, this.f49520D, this.f49521E);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f49530e, 1);
        this.f49517A = gridLayoutManager;
        this.f49539n.setLayoutManager(gridLayoutManager);
        this.f49539n.setItemAnimator(new androidx.recyclerview.widget.c());
        this.f49539n.setAdapter(this.f49551z);
        ProgressBar progressBar = this.f49540o;
        if (progressBar != null) {
            progressBar.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e1(RecyclerView.o oVar, int i9) {
        int i10 = this.f49538m + i9;
        if (i10 < 0 || i10 >= n()) {
            return false;
        }
        x(this.f49538m);
        this.f49538m = i10;
        x(i10);
        oVar.U1(this.f49538m);
        return true;
    }

    public void B0() {
        L0();
        this.f49545t = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels_with_cat");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void D(RecyclerView recyclerView) {
        super.D(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    public void J0() {
        L0();
        this.f49545t = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "get_fav");
    }

    public final void K0(Context context, View view, String str) {
        this.f49550y = str;
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a7.g.f12724U1, (LinearLayout) view.findViewById(a7.f.M9));
        this.f49540o = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        this.f49539n = (RecyclerView) viewInflate.findViewById(a7.f.ub);
        this.f49541p = (RelativeLayout) viewInflate.findViewById(a7.f.Oe);
        this.f49543r = (AppBarLayout) viewInflate.findViewById(a7.f.f12303W);
        this.f49518B = (TextView) viewInflate.findViewById(a7.f.Jl);
        this.f49519C = (TextView) viewInflate.findViewById(a7.f.Qb);
        this.f49518B.setText(context.getResources().getString(a7.j.f13136T2));
        PopupWindow popupWindow = new PopupWindow(context);
        this.f49544s = popupWindow;
        popupWindow.setContentView(viewInflate);
        this.f49544s.setWidth(-1);
        this.f49544s.setHeight(-1);
        this.f49544s.setFocusable(true);
        this.f49544s.setOnDismissListener(new e());
        ProgressBar progressBar = this.f49540o;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        AppBarLayout appBarLayout = this.f49543r;
        if (appBarLayout != null) {
            appBarLayout.setBackground(context.getResources().getDrawable(a7.c.f11845C));
        }
        this.f49524H = Q0();
        String str2 = this.f49550y;
        if (str2 == null || str2.equals("") || !this.f49550y.equals("0")) {
            String str3 = this.f49550y;
            if (str3 == null || str3.equals("") || !this.f49550y.equals("-1")) {
                B0();
            } else {
                J0();
            }
        } else {
            z0();
        }
        this.f49544s.showAtLocation(viewInflate, 1, 0, 0);
    }

    public void N0() {
        String categoryID;
        String strValueOf;
        String timestamp;
        try {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f49530e).equals("m3u")) {
                new ArrayList();
                LiveStreamDBHandler liveStreamDBHandler = this.f49533h;
                if (liveStreamDBHandler != null) {
                    ArrayList<FavouriteM3UModel> favouriteM3U = liveStreamDBHandler.getFavouriteM3U("live");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = this.f49524H;
                    if (arrayList2 != null && arrayList2.size() > 0 && favouriteM3U != null && favouriteM3U.size() > 0) {
                        favouriteM3U = W0(favouriteM3U, this.f49524H);
                    }
                    if (favouriteM3U == null || favouriteM3U.size() <= 0) {
                        return;
                    }
                    for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                        ArrayList<LiveStreamsDBModel> m3UFavouriteRow = this.f49533h.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                        if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                            arrayList.add(m3UFavouriteRow.get(0));
                        }
                    }
                    if (arrayList.size() != 0) {
                        this.f49522F = arrayList;
                        return;
                    }
                    return;
                }
                return;
            }
            new ArrayList();
            DatabaseHandler databaseHandler = this.f49528L;
            if (databaseHandler != null) {
                ArrayList<FavouriteDBModel> allFavourites = databaseHandler.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f49530e));
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = this.f49524H;
                if (arrayList4 != null && arrayList4.size() > 0 && allFavourites != null && allFavourites.size() > 0) {
                    allFavourites = S0(allFavourites, this.f49524H);
                }
                if (allFavourites == null || allFavourites.size() <= 0) {
                    return;
                }
                for (FavouriteDBModel favouriteDBModel : allFavourites) {
                    LiveStreamDBHandler liveStreamDBHandler2 = new LiveStreamDBHandler(this.f49530e);
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f49530e).equalsIgnoreCase("onestream_api")) {
                        categoryID = favouriteDBModel.getCategoryID();
                        strValueOf = String.valueOf(favouriteDBModel.getStreamIDOneStream());
                        timestamp = favouriteDBModel.getTimestamp();
                    } else {
                        categoryID = favouriteDBModel.getCategoryID();
                        strValueOf = String.valueOf(favouriteDBModel.getStreamID());
                        timestamp = favouriteDBModel.getTimestamp();
                    }
                    LiveStreamsDBModel liveStreamFavouriteRow = liveStreamDBHandler2.getLiveStreamFavouriteRow(categoryID, strValueOf, timestamp, "live");
                    if (liveStreamFavouriteRow != null) {
                        arrayList3.add(liveStreamFavouriteRow);
                    }
                }
                if (arrayList3.size() != 0) {
                    this.f49522F = arrayList3;
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public String O0() {
        try {
            ArrayList arrayList = this.f49546u;
            if (arrayList != null && this.f49547v != null) {
                arrayList.clear();
                this.f49547v.clear();
            }
            this.f49522F = new ArrayList();
            N0();
            this.f49546u = this.f49522F;
            return "get_fav";
        } catch (Exception unused) {
            return "get_fav";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public void E(h hVar, int i9) {
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) this.f49529d.get(i9);
        String liveStreamCategoryName = liveStreamCategoryIdDBModel.getLiveStreamCategoryName();
        String liveStreamCategoryID = liveStreamCategoryIdDBModel.getLiveStreamCategoryID();
        Bundle bundle = new Bundle();
        bundle.putString("category_id", liveStreamCategoryID);
        bundle.putString("category_name", liveStreamCategoryName);
        if (liveStreamCategoryName != null && !liveStreamCategoryName.equals("") && !liveStreamCategoryName.isEmpty()) {
            hVar.f49563t.setText(liveStreamCategoryName);
        }
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f49530e).equals("m3u")) {
            if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equals("-1")) {
                c1(hVar);
            } else {
                hVar.f49568y.setText(String.valueOf(liveStreamCategoryIdDBModel.getLiveStreamCounter()));
            }
            if (liveStreamCategoryID.equals("0")) {
                this.f49536k = liveStreamCategoryIdDBModel.getLiveStreamCounter();
            }
        } else {
            if (liveStreamCategoryIdDBModel.getLiveStreamCategoryID().equals("-1")) {
                c1(hVar);
            } else {
                hVar.f49568y.setText(String.valueOf(liveStreamCategoryIdDBModel.getLiveStreamCounter()));
            }
            if (liveStreamCategoryID.equals("0")) {
                int streamsCount = this.f49533h.getStreamsCount("live");
                if (streamsCount == 0 || streamsCount == -1) {
                    hVar.f49568y.setText("");
                } else {
                    hVar.f49568y.setText(String.valueOf(streamsCount));
                }
            }
        }
        if (new C2858a(this.f49530e).A().equals(AbstractC2237a.f44453K0) && i9 == this.f49538m) {
            hVar.f49565v.requestFocus();
            a1(1.09f, hVar.f49565v);
            b1(1.09f, hVar.f49565v);
            hVar.f49565v.setBackgroundResource(a7.e.f12049q2);
        }
        hVar.f49565v.setOnClickListener(new d(hVar, liveStreamCategoryID));
        RelativeLayout relativeLayout = hVar.f49565v;
        relativeLayout.setOnFocusChangeListener(new i(relativeLayout));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public h L(ViewGroup viewGroup, int i9) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12826k3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (SharepreferenceDBHandler.getSelectedLanguage(this.f49530e).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new h(viewInflate);
    }

    public final void c1(h hVar) {
        new f(hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f49529d.size();
    }

    public void z0() {
        L0();
        this.f49545t = new g().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, "all_channels");
    }
}
