package q7;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class r extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f49168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f49169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f49170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f49171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LiveStreamDBHandler f49174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f49175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f49176l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f49177m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AsyncTask f49178n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f49179o = 0;

    public class a implements Comparator {
        public a() {
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

    public class b implements Comparator {
        public b() {
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

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f49182a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49184d;

        public c(g gVar, String str, String str2) {
            this.f49182a = gVar;
            this.f49183c = str;
            this.f49184d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            r.this.f49179o = this.f49182a.p();
            m7.w.x0(r.this.f49169e, "Built-in Player ( Default )", -1, "live", 0, "", "", "", this.f49183c, "", this.f49184d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49186a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f49187c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                r rVar;
                List list;
                if (!TextUtils.isEmpty(d.this.f49186a)) {
                    if (!r.this.f49170f.isEmpty() || r.this.f49170f.isEmpty()) {
                        rVar = r.this;
                        list = rVar.f49170f;
                    }
                    if (r.this.f49168d != null && r.this.f49168d.size() == 0) {
                        d.this.f49187c.setVisibility(0);
                    }
                    r rVar2 = r.this;
                    rVar2.f49172h = rVar2.f49173i;
                    r.this.w();
                }
                rVar = r.this;
                list = rVar.f49171g;
                rVar.f49168d = list;
                if (r.this.f49168d != null) {
                    d.this.f49187c.setVisibility(0);
                }
                r rVar22 = r.this;
                rVar22.f49172h = rVar22.f49173i;
                r.this.w();
            }
        }

        public d(String str, TextView textView) {
            this.f49186a = str;
            this.f49187c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.this.f49170f = new ArrayList();
            r.this.f49173i = this.f49186a.length();
            if (r.this.f49170f != null) {
                r.this.f49170f.clear();
            }
            if (TextUtils.isEmpty(this.f49186a)) {
                r.this.f49170f.addAll(r.this.f49171g);
            } else {
                if ((r.this.f49168d != null && r.this.f49168d.size() == 0) || r.this.f49172h > r.this.f49173i) {
                    r rVar = r.this;
                    rVar.f49168d = rVar.f49171g;
                }
                if (r.this.f49168d != null) {
                    for (int i9 = 0; i9 < r.this.f49168d.size(); i9++) {
                        try {
                            C2638w c2638w = (C2638w) r.this.f49168d.get(i9);
                            if (c2638w.b().toLowerCase().contains(this.f49186a.toLowerCase())) {
                                r.this.f49170f.add(c2638w);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ((Activity) r.this.f49169e).runOnUiThread(new a());
        }
    }

    public class e extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f49190a;

        public e(g gVar) {
            this.f49190a = gVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(g... gVarArr) {
            try {
                return SharepreferenceDBHandler.getCurrentAPPType(r.this.f49169e).equals("m3u") ? Integer.valueOf(r.this.f49174j.getFavouriteCountM3U("live")) : Integer.valueOf(r.this.f49175k.getFavouriteCount("live", SharepreferenceDBHandler.getUserID(r.this.f49169e)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f49190a.f49199y.setText("0");
            } else {
                this.f49190a.f49199y.setText(String.valueOf(num));
            }
            this.f49190a.f49199y.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f49190a.f49199y.setVisibility(8);
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f49192a;

        public f(View view) {
            this.f49192a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49192a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49192a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49192a, "scaleY", f9);
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
                Log.e("id is", "" + this.f49192a.getTag());
                view2 = this.f49192a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                b(1.0f);
                c(1.0f);
                a(false);
                view2 = this.f49192a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public static class g extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49194t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f49195u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f49196v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f49197w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f49198x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public TextView f49199y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public ImageView f49200z;

        public g(View view) {
            super(view);
            this.f49194t = (TextView) view.findViewById(a7.f.fk);
            this.f49195u = (ProgressBar) view.findViewById(a7.f.oc);
            this.f49196v = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f49198x = (RelativeLayout) view.findViewById(a7.f.Wg);
            this.f49197w = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f49199y = (TextView) view.findViewById(a7.f.Vl);
            this.f49200z = (ImageView) view.findViewById(a7.f.f12426i5);
            J(false);
        }
    }

    public r(List list, Context context) {
        ArrayList arrayList = new ArrayList();
        this.f49170f = arrayList;
        arrayList.addAll(list);
        this.f49171g = list;
        this.f49168d = list;
        this.f49169e = context;
        this.f49174j = new LiveStreamDBHandler(context);
        this.f49175k = new DatabaseHandler(context);
        String liveActivitynewFlowSort = SharepreferenceDBHandler.getLiveActivitynewFlowSort(context);
        if (liveActivitynewFlowSort.equals("1")) {
            Collections.sort(list, new a());
        }
        if (liveActivitynewFlowSort.equals("2")) {
            Collections.sort(list, new b());
        }
    }

    private void F0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    private void J0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    public void B0(String str, TextView textView) {
        new Thread(new d(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void E(RecyclerView.D d9, int i9) {
        try {
            if (p(i9) == 1) {
                G g9 = (G) d9;
                NativeAd nativeAd = (NativeAd) this.f49168d.get(i9);
                g9.T().setText(nativeAd.getAdvertiserName());
                g9.S().setText(nativeAd.getAdSocialContext());
                g9.Q().setText(nativeAd.getAdCallToAction());
                g9.Q().setVisibility(nativeAd.hasCallToAction() ? 0 : 4);
                ArrayList arrayList = new ArrayList();
                arrayList.add(g9.Q());
                arrayList.add(g9.P());
                nativeAd.registerViewForInteraction(g9.P(), g9.R(), arrayList);
                return;
            }
            g gVar = (g) d9;
            C2638w c2638w = (C2638w) this.f49168d.get(i9);
            String strB = c2638w.b();
            String strA = c2638w.a();
            int iC = c2638w.c();
            if (strB != null && !strB.equals("") && !strB.isEmpty()) {
                gVar.f49194t.setText(strB);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f49169e).equals("m3u")) {
                if (strA.equals("-1")) {
                    K0(gVar);
                } else {
                    gVar.f49199y.setText(String.valueOf(iC));
                }
                if (strA.equals("0")) {
                    this.f49177m = iC;
                }
            } else {
                if (strA.equals("-1")) {
                    K0(gVar);
                } else {
                    gVar.f49199y.setText(String.valueOf(iC));
                }
                if (strA.equals("0")) {
                    int streamsCount = this.f49174j.getStreamsCount("live");
                    if (streamsCount == 0 || streamsCount == -1) {
                        gVar.f49199y.setText("");
                    } else {
                        gVar.f49199y.setText(String.valueOf(streamsCount));
                    }
                }
            }
            if (new C2858a(this.f49169e).A().equals(AbstractC2237a.f44453K0) && this.f49173i == 0 && !AbstractC2237a.f44515k0.booleanValue() && i9 == this.f49179o) {
                gVar.f49196v.requestFocus();
                F0(1.09f, gVar.f49196v);
                J0(1.09f, gVar.f49196v);
                gVar.f49196v.setBackgroundResource(a7.e.f12049q2);
            }
            gVar.f49196v.setOnClickListener(new c(gVar, strA, strB));
            gVar.f49196v.setOnFocusChangeListener(new f(gVar.f49196v));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public final void K0(g gVar) {
        new e(gVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        if (i9 == 1) {
            return new G(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12652I1, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12826k3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (SharepreferenceDBHandler.getSelectedLanguage(this.f49169e).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new g(viewInflate);
    }

    public void L0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        List list = this.f49168d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return this.f49168d.get(i9) instanceof NativeAd ? 1 : 0;
    }
}
