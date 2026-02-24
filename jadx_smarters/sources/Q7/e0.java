package q7;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.NativeAd;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.TVArchiveActivityLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class e0 extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f48278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f48280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f48281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f48282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LiveStreamDBHandler f48284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f48285k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f48288n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f48286l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f48287m = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f48289o = 0;

    public class a implements View.OnKeyListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f48290a;

        public a(RecyclerView recyclerView) {
            this.f48290a = recyclerView;
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            e0 e0Var;
            int i10;
            RecyclerView.o layoutManager = this.f48290a.getLayoutManager();
            if (keyEvent.getAction() != 0) {
                return false;
            }
            if (i9 == 20) {
                e0Var = e0.this;
                i10 = 1;
            } else {
                if (i9 != 19) {
                    return false;
                }
                e0Var = e0.this;
                i10 = -1;
            }
            return e0Var.K0(layoutManager, i10);
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
        public final /* synthetic */ RecyclerView.D f48294a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f48296d;

        public d(RecyclerView.D d9, String str, String str2) {
            this.f48294a = d9;
            this.f48295c = str;
            this.f48296d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e0.this.f48289o = this.f48294a.p();
            Intent intent = new Intent(e0.this.f48279e, (Class<?>) TVArchiveActivityLayout.class);
            intent.putExtra("category_id", this.f48295c);
            intent.putExtra("category_name", this.f48296d);
            e0.this.f48279e.startActivity(intent);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48298a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f48299c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e0 e0Var;
                List list;
                if (!TextUtils.isEmpty(e.this.f48298a)) {
                    if (!e0.this.f48280f.isEmpty() || e0.this.f48280f.isEmpty()) {
                        e0Var = e0.this;
                        list = e0Var.f48280f;
                    }
                    if (e0.this.f48278d != null && e0.this.f48278d.size() == 0) {
                        e.this.f48299c.setVisibility(0);
                    }
                    e0 e0Var2 = e0.this;
                    e0Var2.f48282h = e0Var2.f48283i;
                    e0.this.w();
                }
                e0Var = e0.this;
                list = e0Var.f48281g;
                e0Var.f48278d = list;
                if (e0.this.f48278d != null) {
                    e.this.f48299c.setVisibility(0);
                }
                e0 e0Var22 = e0.this;
                e0Var22.f48282h = e0Var22.f48283i;
                e0.this.w();
            }
        }

        public e(String str, TextView textView) {
            this.f48298a = str;
            this.f48299c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f48280f = new ArrayList();
            e0.this.f48283i = this.f48298a.length();
            if (e0.this.f48280f != null) {
                e0.this.f48280f.clear();
            }
            if (TextUtils.isEmpty(this.f48298a)) {
                e0.this.f48280f.addAll(e0.this.f48281g);
            } else {
                if ((e0.this.f48278d != null && e0.this.f48278d.size() == 0) || e0.this.f48282h > e0.this.f48283i) {
                    e0 e0Var = e0.this;
                    e0Var.f48278d = e0Var.f48281g;
                }
                if (e0.this.f48278d != null) {
                    for (int i9 = 0; i9 < e0.this.f48278d.size(); i9++) {
                        try {
                            C2638w c2638w = (C2638w) e0.this.f48278d.get(i9);
                            if (c2638w.b().toLowerCase().contains(this.f48298a.toLowerCase())) {
                                e0.this.f48280f.add(c2638w);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            ((Activity) e0.this.f48279e).runOnUiThread(new a());
        }
    }

    public class f implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48302a;

        public f(View view) {
            this.f48302a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48302a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48302a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48302a, "scaleY", f9);
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
                Log.e("id is", "" + this.f48302a.getTag());
                view2 = this.f48302a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f48302a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public static class g extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48304t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f48305u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f48306v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public RelativeLayout f48307w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f48308x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public TextView f48309y;

        public g(View view) {
            super(view);
            this.f48304t = (TextView) view.findViewById(a7.f.fk);
            this.f48305u = (ProgressBar) view.findViewById(a7.f.oc);
            this.f48306v = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f48308x = (RelativeLayout) view.findViewById(a7.f.Wg);
            this.f48307w = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f48309y = (TextView) view.findViewById(a7.f.Vl);
            J(false);
        }
    }

    public e0(List list, Context context) {
        this.f48288n = "";
        ArrayList arrayList = new ArrayList();
        this.f48280f = arrayList;
        arrayList.addAll(list);
        this.f48281g = list;
        this.f48278d = list;
        this.f48279e = context;
        this.f48284j = new LiveStreamDBHandler(context);
        this.f48285k = new DatabaseHandler(context);
        this.f48288n = context.getSharedPreferences("selected_language", 0).getString("selected_language", "");
        String string = context.getSharedPreferences("sortcatch", 0).getString("sort", "");
        if (string.equals("1")) {
            Collections.sort(list, new b());
        }
        if (string.equals("2")) {
            Collections.sort(list, new c());
        }
    }

    private void B0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleX", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    private void F0(float f9, RelativeLayout relativeLayout) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(relativeLayout, "scaleY", f9);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K0(RecyclerView.o oVar, int i9) {
        int i10 = this.f48289o + i9;
        if (i10 < 0 || i10 >= n()) {
            return false;
        }
        x(this.f48289o);
        this.f48289o = i10;
        x(i10);
        oVar.U1(this.f48289o);
        return true;
    }

    public void A0(String str, TextView textView) {
        new Thread(new e(str, textView)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void D(RecyclerView recyclerView) {
        super.D(recyclerView);
        recyclerView.setOnKeyListener(new a(recyclerView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void E(RecyclerView.D d9, int i9) {
        TextView textView;
        try {
            Bundle bundle = new Bundle();
            int i10 = 0;
            if (p(i9) == 1) {
                G g9 = (G) d9;
                NativeAd nativeAd = (NativeAd) this.f48278d.get(i9);
                g9.T().setText(nativeAd.getAdvertiserName());
                g9.S().setText(nativeAd.getAdSocialContext());
                g9.Q().setText(nativeAd.getAdCallToAction());
                Button buttonQ = g9.Q();
                if (!nativeAd.hasCallToAction()) {
                    i10 = 4;
                }
                buttonQ.setVisibility(i10);
                ArrayList arrayList = new ArrayList();
                arrayList.add(g9.Q());
                arrayList.add(g9.P());
                nativeAd.registerViewForInteraction(g9.P(), g9.R(), arrayList);
                return;
            }
            g gVar = (g) d9;
            C2638w c2638w = (C2638w) this.f48278d.get(i9);
            String strB = c2638w.b();
            String strA = c2638w.a();
            int iC = c2638w.c();
            bundle.putString("category_id", strA);
            bundle.putString("category_name", strB);
            String strValueOf = "";
            if (strB != null && !strB.equals("") && !strB.isEmpty()) {
                gVar.f48304t.setText(strB);
            }
            if (strA.hashCode() == 48 && strA.equals("0")) {
                ArrayList<LiveStreamsDBModel> allLiveStreamsArchive = this.f48284j.getAllLiveStreamsArchive("0");
                if (allLiveStreamsArchive != null && allLiveStreamsArchive.size() != 0) {
                    gVar.f48309y.setText(String.valueOf(allLiveStreamsArchive.size()));
                    if (new C2858a(this.f48279e).A().equals(AbstractC2237a.f44453K0) && this.f48283i == 0 && !AbstractC2237a.f44515k0.booleanValue() && i9 == this.f48289o) {
                        gVar.f48306v.requestFocus();
                        B0(1.09f, gVar.f48306v);
                        F0(1.09f, gVar.f48306v);
                        gVar.f48306v.setBackgroundResource(a7.e.f12049q2);
                    }
                    gVar.f48306v.setOnClickListener(new d(d9, strA, strB));
                    gVar.f48306v.setOnFocusChangeListener(new f(gVar.f48306v));
                    if (i9 == 0 || !this.f48286l) {
                    }
                    gVar.f48306v.requestFocus();
                    this.f48286l = false;
                    return;
                }
                textView = gVar.f48309y;
            } else {
                textView = gVar.f48309y;
                strValueOf = String.valueOf(iC);
            }
            textView.setText(strValueOf);
            if (new C2858a(this.f48279e).A().equals(AbstractC2237a.f44453K0)) {
                gVar.f48306v.requestFocus();
                B0(1.09f, gVar.f48306v);
                F0(1.09f, gVar.f48306v);
                gVar.f48306v.setBackgroundResource(a7.e.f12049q2);
            }
            gVar.f48306v.setOnClickListener(new d(d9, strA, strB));
            gVar.f48306v.setOnFocusChangeListener(new f(gVar.f48306v));
            if (i9 == 0) {
            }
        } catch (NullPointerException | Exception unused) {
        }
    }

    public void J0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public RecyclerView.D L(ViewGroup viewGroup, int i9) {
        if (i9 == 1) {
            return new G(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12652I1, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12826k3, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(a7.f.f12426i5);
        if (SharepreferenceDBHandler.getSelectedLanguage(this.f48279e).equalsIgnoreCase("Arabic")) {
            imageView.setImageResource(a7.e.f11971W0);
        }
        return new g(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48278d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int p(int i9) {
        return this.f48278d.get(i9) instanceof NativeAd ? 1 : 0;
    }
}
