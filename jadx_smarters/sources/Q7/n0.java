package q7;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
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
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityLayout;
import com.nst.iptvsmarterstvbox.view.activity.VodActivityNewFlowSecondSubCategories;
import java.util.ArrayList;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes4.dex */
public class n0 extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f49067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f49068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LiveStreamDBHandler f49069f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f49070g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f49071h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49072i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49073j;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f49074a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49075c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49076d;

        public a(c cVar, String str, String str2) {
            this.f49074a = cVar;
            this.f49075c = str;
            this.f49076d = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            new VodActivityLayout().I1(this.f49074a.f49085w);
            ProgressBar progressBar = this.f49074a.f49085w;
            if (progressBar != null) {
                progressBar.getIndeterminateDrawable().setColorFilter(DefaultRenderer.BACKGROUND_COLOR, PorterDuff.Mode.SRC_IN);
                this.f49074a.f49085w.setVisibility(0);
            }
            Intent intent = n0.this.f49069f.getAllMovieCategoriesHavingParentIdNotZero(this.f49075c).size() > 0 ? new Intent(n0.this.f49068e, (Class<?>) VodActivityNewFlowSecondSubCategories.class) : new Intent(n0.this.f49068e, (Class<?>) VodActivityLayout.class);
            intent.putExtra("category_id", this.f49075c);
            intent.putExtra("category_name", this.f49076d);
            n0.this.f49068e.startActivity(intent);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49078a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TextView f49079c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                n0 n0Var;
                List list;
                if (!TextUtils.isEmpty(b.this.f49078a)) {
                    if (!n0.this.f49070g.isEmpty() || n0.this.f49070g.isEmpty()) {
                        n0Var = n0.this;
                        list = n0Var.f49070g;
                    }
                    if (n0.this.f49067d != null && n0.this.f49067d.size() == 0) {
                        b.this.f49079c.setVisibility(0);
                    }
                    n0 n0Var2 = n0.this;
                    n0Var2.f49072i = n0Var2.f49073j;
                    n0.this.w();
                }
                n0Var = n0.this;
                list = n0Var.f49071h;
                n0Var.f49067d = list;
                if (n0.this.f49067d != null) {
                    b.this.f49079c.setVisibility(0);
                }
                n0 n0Var22 = n0.this;
                n0Var22.f49072i = n0Var22.f49073j;
                n0.this.w();
            }
        }

        public b(String str, TextView textView) {
            this.f49078a = str;
            this.f49079c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.f49070g = new ArrayList();
            n0.this.f49073j = this.f49078a.length();
            if (n0.this.f49070g != null) {
                n0.this.f49070g.clear();
            }
            if (TextUtils.isEmpty(this.f49078a)) {
                n0.this.f49070g.addAll(n0.this.f49071h);
            } else {
                if ((n0.this.f49067d != null && n0.this.f49067d.size() == 0) || n0.this.f49072i > n0.this.f49073j) {
                    n0 n0Var = n0.this;
                    n0Var.f49067d = n0Var.f49071h;
                }
                if (n0.this.f49067d != null) {
                    for (LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel : n0.this.f49067d) {
                        if (liveStreamCategoryIdDBModel.getLiveStreamCategoryName() != null && liveStreamCategoryIdDBModel.getLiveStreamCategoryName().toLowerCase().contains(this.f49078a.toLowerCase())) {
                            n0.this.f49070g.add(liveStreamCategoryIdDBModel);
                        }
                    }
                }
            }
            ((Activity) n0.this.f49068e).runOnUiThread(new a());
        }
    }

    public static class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImageView f49082t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f49083u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f49084v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ProgressBar f49085w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public RelativeLayout f49086x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public RelativeLayout f49087y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public TextView f49088z;

        public c(View view) {
            super(view);
            this.f49082t = (ImageView) view.findViewById(a7.f.f12417h6);
            this.f49083u = (TextView) view.findViewById(a7.f.fk);
            this.f49084v = (ImageView) view.findViewById(a7.f.f12426i5);
            this.f49085w = (ProgressBar) view.findViewById(a7.f.oc);
            this.f49086x = (RelativeLayout) view.findViewById(a7.f.ze);
            this.f49087y = (RelativeLayout) view.findViewById(a7.f.Re);
            this.f49088z = (TextView) view.findViewById(a7.f.Vl);
            J(false);
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f49089a;

        public d(View view) {
            this.f49089a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49089a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49089a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49089a, "scaleY", f9);
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
                Log.e("id is", "" + this.f49089a.getTag());
                view2 = this.f49089a;
                i9 = a7.e.f12049q2;
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
                view2 = this.f49089a;
                i9 = a7.e.f12045p2;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public n0() {
    }

    public n0(List list, Context context, LiveStreamDBHandler liveStreamDBHandler) {
        ArrayList arrayList = new ArrayList();
        this.f49070g = arrayList;
        arrayList.addAll(list);
        this.f49071h = list;
        this.f49067d = list;
        this.f49068e = context;
        this.f49069f = liveStreamDBHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public void E(c cVar, int i9) {
        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) this.f49067d.get(i9);
        String liveStreamCategoryName = liveStreamCategoryIdDBModel.getLiveStreamCategoryName();
        String liveStreamCategoryID = liveStreamCategoryIdDBModel.getLiveStreamCategoryID();
        Bundle bundle = new Bundle();
        bundle.putString("category_id", liveStreamCategoryID);
        bundle.putString("category_name", liveStreamCategoryName);
        if (liveStreamCategoryName != null && !liveStreamCategoryName.equals("") && !liveStreamCategoryName.isEmpty()) {
            cVar.f49083u.setText(liveStreamCategoryName);
        }
        int subCatMovieCount = this.f49069f.getSubCatMovieCount(liveStreamCategoryIdDBModel.getLiveStreamCategoryID(), "movie");
        if (subCatMovieCount == 0 || subCatMovieCount == -1) {
            cVar.f49088z.setText("");
        } else {
            cVar.f49088z.setText(String.valueOf(subCatMovieCount));
        }
        RelativeLayout relativeLayout = cVar.f49087y;
        relativeLayout.setOnFocusChangeListener(new d(relativeLayout));
        cVar.f49087y.setOnClickListener(new a(cVar, liveStreamCategoryID, liveStreamCategoryName));
        if (this.f49067d.size() != 0) {
            cVar.f49087y.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: B0, reason: merged with bridge method [inline-methods] */
    public c L(ViewGroup viewGroup, int i9) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12868r3, viewGroup, false));
    }

    public void F0(ProgressBar progressBar) {
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f49067d.size();
    }

    public void z0(String str, TextView textView) {
        new Thread(new b(str, textView)).start();
    }
}
