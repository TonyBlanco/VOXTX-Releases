package q7;

import android.animation.ObjectAnimator;
import android.app.Activity;
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
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.NewEPGActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: q7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2628l extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f48642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f48643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f48644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48646h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LiveStreamDBHandler f48647i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DatabaseHandler f48648j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f48650l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f48652n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f48649k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f48651m = 0;

    /* JADX INFO: renamed from: q7.l$a */
    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f48653a;

        public a(RecyclerView recyclerView) {
            this.f48653a = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            C2628l c2628l;
            int i10;
            RecyclerView.o layoutManager = this.f48653a.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i9 == 20) {
                c2628l = C2628l.this;
                i10 = 1;
            } else {
                if (i9 != 19) {
                    return false;
                }
                c2628l = C2628l.this;
                i10 = -1;
            }
            return c2628l.O0(layoutManager, i10);
        }
    }

    /* JADX INFO: renamed from: q7.l$b */
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

    /* JADX INFO: renamed from: q7.l$c */
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

    /* JADX INFO: renamed from: q7.l$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f48657a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48659d;

        public d(RecyclerView.D d9, String str, String str2) {
            this.f48657a = d9;
            this.f48658c = str;
            this.f48659d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2628l.this.f48651m = this.f48657a.p();
            Intent intent = new Intent(C2628l.this.f48642d, (Class<?>) NewEPGActivity.class);
            intent.putExtra("category_id", this.f48658c);
            intent.putExtra("category_name", this.f48659d);
            C2628l.this.f48642d.startActivity(intent);
        }
    }

    /* JADX INFO: renamed from: q7.l$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48661a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f48662c;

        /* JADX INFO: renamed from: q7.l$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C2628l c2628l;
                List list;
                if (!TextUtils.isEmpty(e.this.f48661a)) {
                    if (!C2628l.this.f48643e.isEmpty() || C2628l.this.f48643e.isEmpty()) {
                        c2628l = C2628l.this;
                        list = c2628l.f48643e;
                    }
                    if (C2628l.this.f48652n != null && C2628l.this.f48652n.size() == 0) {
                        e.this.f48662c.setVisibility(0);
                    }
                    C2628l c2628l2 = C2628l.this;
                    c2628l2.f48645g = c2628l2.f48646h;
                    C2628l.this.w();
                }
                c2628l = C2628l.this;
                list = c2628l.f48644f;
                c2628l.f48652n = list;
                if (C2628l.this.f48652n != null) {
                    e.this.f48662c.setVisibility(0);
                }
                C2628l c2628l22 = C2628l.this;
                c2628l22.f48645g = c2628l22.f48646h;
                C2628l.this.w();
            }
        }

        public e(String str, TextView textView) {
            this.f48661a = str;
            this.f48662c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2628l.this.f48643e = new ArrayList();
            C2628l.this.f48646h = this.f48661a.length();
            if (C2628l.this.f48643e != null) {
                C2628l.this.f48643e.clear();
            }
            if (TextUtils.isEmpty(this.f48661a)) {
                C2628l.this.f48643e.addAll(C2628l.this.f48644f);
            } else {
                if ((C2628l.this.f48652n != null && C2628l.this.f48652n.size() == 0) || C2628l.this.f48645g > C2628l.this.f48646h) {
                    C2628l c2628l = C2628l.this;
                    c2628l.f48652n = c2628l.f48644f;
                }
                if (C2628l.this.f48652n != null) {
                    for (int i9 = 0; i9 < C2628l.this.f48652n.size(); i9++) {
                        try {
                            C2638w c2638w = (C2638w) C2628l.this.f48652n.get(i9);
                            if (c2638w.b().toLowerCase().contains(this.f48661a.toLowerCase())) {
                                C2628l.this.f48643e.add(c2638w);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ((Activity) C2628l.this.f48642d).runOnUiThread(new a());
        }
    }

    /* JADX INFO: renamed from: q7.l$f */
    public class f extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f48665a;

        public f(g gVar) {
            this.f48665a = gVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(g... gVarArr) {
            try {
                return SharepreferenceDBHandler.getCurrentAPPType(C2628l.this.f48642d).equals("m3u") ? Integer.valueOf(C2628l.this.f48647i.getFavouriteCountM3U("live")) : Integer.valueOf(C2628l.this.f48648j.getFavouriteCount("live", SharepreferenceDBHandler.getUserID(C2628l.this.f48642d)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f48665a.f48671x.setText("0");
            } else {
                this.f48665a.f48671x.setText(String.valueOf(num));
            }
            this.f48665a.f48671x.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f48665a.f48671x.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q7.l$g */
    public static class g extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48667t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f48668u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f48669v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f48670w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f48671x;

        public g(View view) {
            super(view);
            this.f48667t = (TextView) view.findViewById(a7.f.fk);
            this.f48668u = (ProgressBar) view.findViewById(a7.f.oc);
            this.f48669v = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f48670w = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f48671x = (TextView) view.findViewById(a7.f.Vl);
            J(false);
        }
    }

    /* JADX INFO: renamed from: q7.l$h */
    public class h implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48672a;

        public h(View view) {
            this.f48672a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48672a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48672a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48672a, "scaleY", f9);
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
                Log.e("id is", "" + this.f48672a.getTag());
                view2 = this.f48672a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f48672a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public C2628l(Context context, List list) {
        this.f48650l = "";
        this.f48652n = list;
        ArrayList arrayList = new ArrayList();
        this.f48643e = arrayList;
        arrayList.addAll(list);
        this.f48644f = list;
        this.f48642d = context;
        this.f48647i = new LiveStreamDBHandler(context);
        this.f48648j = new DatabaseHandler(context);
        this.f48650l = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        String string = context.getSharedPreferences("sortepg", 0).getString("sort", "");
        if (string.equals("1")) {
            Collections.sort(list, new b());
        }
        if (string.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void D(RecyclerView recyclerView) {
        super.D(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[PHI: r0
      0x00a8: PHI (r0v10 int) = (r0v8 int), (r0v12 int) binds: [B:40:0x00c4, B:35:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(androidx.recyclerview.widget.RecyclerView.D r14, int r15) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2628l.E(androidx.recyclerview.widget.RecyclerView$D, int):void");
    }

    public void F0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }

    public final void J0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public final void K0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        if (i9 == 1) {
            return new G(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12652I1, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12826k3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (this.f48650l.equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new g(viewInflate);
    }

    public final void L0(g gVar) {
        new f(gVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, gVar);
    }

    public void N0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public final boolean O0(RecyclerView.o oVar, int i9) {
        int i10 = this.f48651m + i9;
        if (i10 < 0 || i10 >= n()) {
            return false;
        }
        x(this.f48651m);
        this.f48651m = i10;
        x(i10);
        oVar.U1(this.f48651m);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48652n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return this.f48652n.get(i9) instanceof NativeAd ? 1 : 0;
    }
}
