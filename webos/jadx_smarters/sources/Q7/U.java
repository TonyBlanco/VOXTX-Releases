package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.view.activity.SeriesDetailActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class U extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f47474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f47475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PopupWindow f47476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f47478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f47479i;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47480a;

        public a(int i9) {
            this.f47480a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (U.this.f47474d instanceof SeriesDetailActivity) {
                ((SeriesDetailActivity) U.this.f47474d).i2(((Integer) U.this.f47475e.get(this.f47480a)).intValue());
            }
            if (U.this.f47476f != null) {
                U.this.f47476f.dismiss();
            }
        }
    }

    public static class b extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public LinearLayout f47482t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f47483u;

        public b(View view) {
            super(view);
            this.f47482t = (LinearLayout) view.findViewById(a7.f.f12458l7);
            this.f47483u = (TextView) view.findViewById(a7.f.Ph);
            J(false);
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f47485b;

        public c(View view, int i9) {
            this.f47484a = view;
            this.f47485b = i9;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47484a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47484a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47484a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                U.this.f47478h = this.f47485b;
                f9 = z9 ? 1.1f : 1.0f;
                Log.e("id is", "" + this.f47484a.getTag());
                if (this.f47484a.getTag() == null || !this.f47484a.getTag().equals("20")) {
                    b(f9);
                    return;
                } else {
                    b(f9);
                    view2 = this.f47484a;
                    i9 = a7.e.f12010h;
                }
            } else {
                if (z9) {
                    return;
                }
                U.this.f47478h = -1;
                f9 = z9 ? 1.09f : 1.0f;
                a(z9);
                if (this.f47484a.getTag() == null || !this.f47484a.getTag().equals("20")) {
                    b(f9);
                    c(f9);
                    return;
                } else {
                    b(f9);
                    c(f9);
                    view2 = this.f47484a;
                    i9 = a7.e.f12038o;
                }
            }
            view2.setBackgroundResource(i9);
        }
    }

    public U(Context context, ArrayList arrayList, PopupWindow popupWindow, int i9, int i10) {
        this.f47475e = arrayList;
        this.f47474d = context;
        this.f47476f = popupWindow;
        this.f47477g = i9;
        this.f47478h = i10;
    }

    public int m0() {
        return this.f47478h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47475e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void E(b bVar, int i9) {
        if (this.f47474d != null) {
            if (i9 == this.f47478h) {
                bVar.f47482t.setBackgroundResource(a7.e.f12010h);
                bVar.f47482t.requestFocus();
            }
            bVar.f47483u.setText(this.f47474d.getResources().getString(a7.j.f13040J6) + " - " + this.f47475e.get(i9));
            bVar.f47482t.setOnClickListener(new a(i9));
            LinearLayout linearLayout = bVar.f47482t;
            linearLayout.setOnFocusChangeListener(new c(linearLayout, i9));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public b L(ViewGroup viewGroup, int i9) {
        b bVar = new b(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12881t4, viewGroup, false));
        this.f47479i = bVar;
        return bVar;
    }
}
