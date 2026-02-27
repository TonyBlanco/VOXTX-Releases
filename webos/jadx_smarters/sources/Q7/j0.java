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
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSubCategories;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class j0 extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f48582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LiveStreamDBHandler f48584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f48585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f48586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f48588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f48589k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48590l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RecentWatchDBHandler f48591m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f48592n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48593o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f48594p;

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f48595a;

        public a(RecyclerView recyclerView) {
            this.f48595a = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            j0 j0Var;
            int i10;
            RecyclerView.o layoutManager = this.f48595a.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i9 == 20) {
                j0Var = j0.this;
                i10 = 1;
            } else {
                if (i9 != 19) {
                    return false;
                }
                j0Var = j0.this;
                i10 = -1;
            }
            return j0Var.J0(layoutManager, i10);
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
        public final /* synthetic */ RecyclerView.D f48599a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48601d;

        public d(RecyclerView.D d9, String str, String str2) {
            this.f48599a = d9;
            this.f48600c = str;
            this.f48601d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0.this.f48594p = this.f48599a.p();
            Intent intent = new Intent(j0.this.f48583e, (Class<?>) VodActivityNewFlowSubCategories.class);
            intent.putExtra("category_id", this.f48600c);
            intent.putExtra("category_name", this.f48601d);
            j0.this.f48583e.startActivity(intent);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48603a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f48604c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j0 j0Var;
                List list;
                if (!TextUtils.isEmpty(e.this.f48603a)) {
                    if (!j0.this.f48585g.isEmpty() || j0.this.f48585g.isEmpty()) {
                        j0Var = j0.this;
                        list = j0Var.f48585g;
                    }
                    if (j0.this.f48582d != null && j0.this.f48582d.size() == 0) {
                        e.this.f48604c.setVisibility(0);
                        e eVar = e.this;
                        eVar.f48604c.setText(j0.this.f48583e.getResources().getString(a7.j.f13441y4));
                    }
                    j0 j0Var2 = j0.this;
                    j0Var2.f48587i = j0Var2.f48588j;
                    j0Var2.w();
                }
                j0Var = j0.this;
                list = j0Var.f48586h;
                j0Var.f48582d = list;
                if (j0.this.f48582d != null) {
                    e.this.f48604c.setVisibility(0);
                    e eVar2 = e.this;
                    eVar2.f48604c.setText(j0.this.f48583e.getResources().getString(a7.j.f13441y4));
                }
                j0 j0Var22 = j0.this;
                j0Var22.f48587i = j0Var22.f48588j;
                j0Var22.w();
            }
        }

        public e(String str, TextView textView) {
            this.f48603a = str;
            this.f48604c = textView;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r4 = this;
                q7.j0 r0 = q7.j0.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                q7.j0.n0(r0, r1)
                q7.j0 r0 = q7.j0.this
                java.lang.String r1 = r4.f48603a
                int r1 = r1.length()
                r0.f48588j = r1
                q7.j0 r0 = q7.j0.this
                java.util.List r0 = q7.j0.m0(r0)
                if (r0 == 0) goto L25
                q7.j0 r0 = q7.j0.this
                java.util.List r0 = q7.j0.m0(r0)
                r0.clear()
            L25:
                java.lang.String r0 = r4.f48603a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L3d
                q7.j0 r0 = q7.j0.this
                java.util.List r0 = q7.j0.m0(r0)
                q7.j0 r1 = q7.j0.this
                java.util.List r1 = q7.j0.p0(r1)
                r0.addAll(r1)
                goto La3
            L3d:
                q7.j0 r0 = q7.j0.this
                java.util.List r0 = q7.j0.q0(r0)
                if (r0 == 0) goto L51
                q7.j0 r0 = q7.j0.this
                java.util.List r0 = q7.j0.q0(r0)
                int r0 = r0.size()
                if (r0 == 0) goto L59
            L51:
                q7.j0 r0 = q7.j0.this
                int r1 = r0.f48587i
                int r0 = r0.f48588j
                if (r1 <= r0) goto L62
            L59:
                q7.j0 r0 = q7.j0.this
                java.util.List r1 = q7.j0.p0(r0)
                q7.j0.r0(r0, r1)
            L62:
                q7.j0 r0 = q7.j0.this
                java.util.List r0 = q7.j0.q0(r0)
                if (r0 == 0) goto La3
                r0 = 0
            L6b:
                q7.j0 r1 = q7.j0.this
                java.util.List r1 = q7.j0.q0(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto La3
                q7.j0 r1 = q7.j0.this     // Catch: java.lang.Exception -> La0
                java.util.List r1 = q7.j0.q0(r1)     // Catch: java.lang.Exception -> La0
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> La0
                q7.w r1 = (q7.C2638w) r1     // Catch: java.lang.Exception -> La0
                java.lang.String r2 = r1.b()     // Catch: java.lang.Exception -> La0
                java.lang.String r2 = r2.toLowerCase()     // Catch: java.lang.Exception -> La0
                java.lang.String r3 = r4.f48603a     // Catch: java.lang.Exception -> La0
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> La0
                boolean r2 = r2.contains(r3)     // Catch: java.lang.Exception -> La0
                if (r2 == 0) goto La0
                q7.j0 r2 = q7.j0.this     // Catch: java.lang.Exception -> La0
                java.util.List r2 = q7.j0.m0(r2)     // Catch: java.lang.Exception -> La0
                r2.add(r1)     // Catch: java.lang.Exception -> La0
            La0:
                int r0 = r0 + 1
                goto L6b
            La3:
                q7.j0 r0 = q7.j0.this
                android.content.Context r0 = q7.j0.l0(r0)
                android.app.Activity r0 = (android.app.Activity) r0
                q7.j0$e$a r1 = new q7.j0$e$a
                r1.<init>()
                r0.runOnUiThread(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q7.j0.e.run():void");
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48607a;

        public f(View view) {
            this.f48607a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48607a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48607a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48607a, "scaleY", f9);
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
                Log.e("id is", "" + this.f48607a.getTag());
                view2 = this.f48607a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(false);
                view2 = this.f48607a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public class g extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f48609a;

        public g(h hVar) {
            this.f48609a = hVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(h... hVarArr) {
            try {
                return SharepreferenceDBHandler.getCurrentAPPType(j0.this.f48583e).equals("m3u") ? Integer.valueOf(j0.this.f48584f.getFavouriteCountM3U("movie")) : Integer.valueOf(j0.this.f48589k.getFavouriteCount("vod", SharepreferenceDBHandler.getUserID(j0.this.f48583e)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f48609a.f48617z.setText("0");
            } else {
                this.f48609a.f48617z.setText(String.valueOf(num));
            }
            this.f48609a.f48617z.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f48609a.f48617z.setVisibility(8);
        }
    }

    public static class h extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImageView f48611t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48612u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f48613v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ProgressBar f48614w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f48615x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public RelativeLayout f48616y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public TextView f48617z;

        public h(View view) {
            super(view);
            this.f48611t = (ImageView) view.findViewById(a7.f.f12417h6);
            this.f48612u = (TextView) view.findViewById(a7.f.fk);
            this.f48613v = (ImageView) view.findViewById(a7.f.f12426i5);
            this.f48614w = (ProgressBar) view.findViewById(a7.f.oc);
            this.f48615x = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f48616y = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f48617z = (TextView) view.findViewById(a7.f.Vl);
            J(false);
        }
    }

    public j0() {
        this.f48590l = -1;
        this.f48592n = "";
        this.f48593o = 0;
        this.f48594p = 0;
    }

    public j0(List list, Context context) {
        this.f48590l = -1;
        this.f48592n = "";
        this.f48593o = 0;
        this.f48594p = 0;
        ArrayList arrayList = new ArrayList();
        this.f48585g = arrayList;
        arrayList.addAll(list);
        this.f48586h = list;
        this.f48582d = list;
        this.f48583e = context;
        this.f48584f = new LiveStreamDBHandler(context);
        this.f48589k = new DatabaseHandler(context);
        this.f48590l = SharepreferenceDBHandler.getUserID(context);
        this.f48591m = new RecentWatchDBHandler(context);
        String vodActivitynewFlowSort = SharepreferenceDBHandler.getVodActivitynewFlowSort(context);
        if (vodActivitynewFlowSort.equals("1")) {
            Collections.sort(list, new b());
        }
        if (vodActivitynewFlowSort.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    private void A0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J0(RecyclerView.o oVar, int i9) {
        int i10 = this.f48594p + i9;
        if (i10 < 0 || i10 >= n()) {
            return false;
        }
        x(this.f48594p);
        this.f48594p = i10;
        x(i10);
        oVar.U1(this.f48594p);
        return true;
    }

    private void z0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void B0(h hVar) {
        new g(hVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, hVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void D(RecyclerView recyclerView) {
        super.D(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0133, code lost:
    
        if (r1 != (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
    
        if (r1 != (-1)) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r17, int r18) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.j0.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    public void F0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        if (i9 == 1) {
            return new G(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12652I1, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12868r3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (this.f48592n.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new h(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48582d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return this.f48582d.get(i9) instanceof NativeAd ? 1 : 0;
    }

    public void x0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }
}
