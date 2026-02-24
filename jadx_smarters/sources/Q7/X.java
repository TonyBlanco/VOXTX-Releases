package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.NativeAd;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SeriesActivitNewFlowSubCat;
import com.nst.iptvsmarterstvbox.view.activity.SeriesActivityNewFlowSubCategoriesM3U;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class X extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f47734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f47735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LiveStreamDBHandler f47736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f47737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f47738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f47740j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f47741k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SeriesRecentWatchDatabase f47744n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f47742l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f47743m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f47745o = 0;

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f47746a;

        public a(RecyclerView recyclerView) {
            this.f47746a = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            X x9;
            int i10;
            RecyclerView.o layoutManager = this.f47746a.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i9 == 20) {
                x9 = X.this;
                i10 = 1;
            } else {
                if (i9 != 19) {
                    return false;
                }
                x9 = X.this;
                i10 = -1;
            }
            return x9.B0(layoutManager, i10);
        }
    }

    public class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            try {
                return ((C2638w) obj).b().compareTo(((C2638w) obj2).b());
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public class c implements Comparator {
        public c() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            try {
                return ((C2638w) obj2).b().compareTo(((C2638w) obj).b());
            } catch (Exception unused) {
                return -1;
            }
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f47750a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f47751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f47752d;

        public d(RecyclerView.D d9, String str, String str2) {
            this.f47750a = d9;
            this.f47751c = str;
            this.f47752d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            X.this.f47745o = this.f47750a.p();
            Intent intent = SharepreferenceDBHandler.getCurrentAPPType(X.this.f47735e).equals("m3u") ? new Intent(X.this.f47735e, (Class<?>) SeriesActivityNewFlowSubCategoriesM3U.class) : new Intent(X.this.f47735e, (Class<?>) SeriesActivitNewFlowSubCat.class);
            intent.putExtra("category_id", this.f47751c);
            intent.putExtra("category_name", this.f47752d);
            X.this.f47735e.startActivity(intent);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f47754a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f47755c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                X x9;
                List list;
                if (!TextUtils.isEmpty(e.this.f47754a)) {
                    if (!X.this.f47737g.isEmpty() || X.this.f47737g.isEmpty()) {
                        x9 = X.this;
                        list = x9.f47737g;
                    }
                    if (X.this.f47734d != null && X.this.f47734d.size() == 0) {
                        e.this.f47755c.setVisibility(0);
                        e eVar = e.this;
                        eVar.f47755c.setText(X.this.f47735e.getResources().getString(a7.j.f13441y4));
                    }
                    X x10 = X.this;
                    x10.f47739i = x10.f47740j;
                    x10.w();
                }
                x9 = X.this;
                list = x9.f47738h;
                x9.f47734d = list;
                if (X.this.f47734d != null) {
                    e.this.f47755c.setVisibility(0);
                    e eVar2 = e.this;
                    eVar2.f47755c.setText(X.this.f47735e.getResources().getString(a7.j.f13441y4));
                }
                X x102 = X.this;
                x102.f47739i = x102.f47740j;
                x102.w();
            }
        }

        public e(String str, TextView textView) {
            this.f47754a = str;
            this.f47755c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                q7.X r0 = q7.X.this
                java.lang.String r1 = r4.f47754a
                int r1 = r1.length()
                r0.f47740j = r1
                q7.X r0 = q7.X.this
                java.util.List r0 = q7.X.m0(r0)
                if (r0 == 0) goto L1b
                q7.X r0 = q7.X.this
                java.util.List r0 = q7.X.m0(r0)
                r0.clear()
            L1b:
                java.lang.String r0 = r4.f47754a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L33
                q7.X r0 = q7.X.this
                java.util.List r0 = q7.X.m0(r0)
                q7.X r1 = q7.X.this
                java.util.List r1 = q7.X.n0(r1)
                r0.addAll(r1)
                goto L99
            L33:
                q7.X r0 = q7.X.this
                java.util.List r0 = q7.X.p0(r0)
                if (r0 == 0) goto L47
                q7.X r0 = q7.X.this
                java.util.List r0 = q7.X.p0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L4f
            L47:
                q7.X r0 = q7.X.this
                int r1 = r0.f47739i
                int r0 = r0.f47740j
                if (r1 <= r0) goto L58
            L4f:
                q7.X r0 = q7.X.this
                java.util.List r1 = q7.X.n0(r0)
                q7.X.q0(r0, r1)
            L58:
                q7.X r0 = q7.X.this
                java.util.List r0 = q7.X.p0(r0)
                if (r0 == 0) goto L99
                r0 = 0
            L61:
                q7.X r1 = q7.X.this
                java.util.List r1 = q7.X.p0(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L99
                q7.X r1 = q7.X.this     // Catch: java.lang.Exception -> L96
                java.util.List r1 = q7.X.p0(r1)     // Catch: java.lang.Exception -> L96
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L96
                q7.w r1 = (q7.C2638w) r1     // Catch: java.lang.Exception -> L96
                java.lang.String r2 = r1.b()     // Catch: java.lang.Exception -> L96
                java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> L96
                java.lang.String r3 = r4.f47754a     // Catch: java.lang.Exception -> L96
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> L96
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> L96
                if (r2 == 0) goto L96
                q7.X r2 = q7.X.this     // Catch: java.lang.Exception -> L96
                java.util.List r2 = q7.X.m0(r2)     // Catch: java.lang.Exception -> L96
                r2.add(r1)     // Catch: java.lang.Exception -> L96
            L96:
                int r0 = r0 + 1
                goto L61
            L99:
                q7.X r0 = q7.X.this
                android.content.Context r0 = q7.X.l0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                q7.X$e$a r1 = new q7.X$e$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.X.e.run():void");
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47758a;

        public f(View view) {
            this.f47758a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47758a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47758a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47758a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                Log.e("id is", "" + this.f47758a.getTag());
                view2 = this.f47758a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f47758a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class g extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f47760a;

        public g(h hVar) {
            this.f47760a = hVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(h... hVarArr) {
            try {
                return Integer.valueOf(X.this.f47736f.getFavouriteCountM3U("series"));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f47760a.f47768y.setText("0");
            } else {
                this.f47760a.f47768y.setText(String.valueOf(num));
            }
            this.f47760a.f47768y.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f47760a.f47768y.setVisibility(8);
        }
    }

    public static class h extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ImageView f47762A;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47763t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f47764u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f47765v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f47766w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f47767x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public TextView f47768y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public ImageView f47769z;

        public h(View view) {
            super(view);
            this.f47763t = (TextView) view.findViewById(a7.f.fk);
            this.f47764u = (ProgressBar) view.findViewById(a7.f.oc);
            this.f47765v = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f47767x = (RelativeLayout) view.findViewById(a7.f.Wg);
            this.f47766w = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f47768y = (TextView) view.findViewById(a7.f.Vl);
            this.f47762A = (ImageView) view.findViewById(a7.f.f12426i5);
            this.f47769z = (ImageView) view.findViewById(a7.f.f12417h6);
            J(false);
        }
    }

    public X(List list, Context context) {
        ArrayList arrayList = new ArrayList();
        this.f47737g = arrayList;
        arrayList.addAll(list);
        this.f47738h = list;
        this.f47734d = list;
        this.f47735e = context;
        this.f47736f = new LiveStreamDBHandler(context);
        this.f47741k = new DatabaseHandler(context);
        this.f47744n = new SeriesRecentWatchDatabase(context);
        String str = SharepreferenceDBHandler.getseriesActivitynewFlowSort(context);
        if (str.equals("1")) {
            Collections.sort(list, new b());
        }
        if (str.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B0(RecyclerView.o oVar, int i9) {
        int i10 = this.f47745o + i9;
        if (i10 < 0 || i10 >= n()) {
            return false;
        }
        x(this.f47745o);
        this.f47745o = i10;
        x(i10);
        oVar.U1(this.f47745o);
        return true;
    }

    private void t0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    private void x0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public void A0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void D(RecyclerView recyclerView) {
        super.D(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        if (r4 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        if (r4 != (-1)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r1 = r0.f47768y;
        r4 = java.lang.String.valueOf(r4);
     */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r9, int r10) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.X.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        if (i9 == 1) {
            return new G(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12652I1, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12868r3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (SharepreferenceDBHandler.getSelectedLanguage(this.f47735e).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new h(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47734d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return this.f47734d.get(i9) instanceof NativeAd ? 1 : 0;
    }

    public void s0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }

    public final void z0(h hVar) {
        new g(hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, hVar);
    }
}
