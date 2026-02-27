package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBPersonProfilePojo;
import com.squareup.picasso.InterfaceC1611e;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class M extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f47288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f47289e;

    public class a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f47290a;

        public a(c cVar) {
            this.f47290a = cVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            this.f47290a.f47294u.setImageDrawable(M.this.f47288d.getResources().getDrawable(a7.e.f11895B1, null));
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public static class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public RelativeLayout f47293t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ImageView f47294u;

        public c(View view) {
            super(view);
            this.f47293t = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f47294u = (ImageView) view.findViewById(a7.f.f12102B5);
            J(false);
        }
    }

    public class d implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47295a;

        public d(View view) {
            this.f47295a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47295a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47295a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f47295a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            if (z9) {
                f9 = z9 ? 1.1f : 1.0f;
                Log.e("id is", "" + this.f47295a.getTag());
                if (this.f47295a.getTag() != null && this.f47295a.getTag().equals("1")) {
                    b(f9);
                    view2 = this.f47295a;
                    i9 = a7.e.f12010h;
                } else {
                    if (this.f47295a.getTag() == null || !this.f47295a.getTag().equals("2")) {
                        return;
                    }
                    b(f9);
                    view2 = this.f47295a;
                    i9 = a7.e.f12024k1;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(z9);
                if ((this.f47295a.getTag() == null || !this.f47295a.getTag().equals("1")) && (this.f47295a.getTag() == null || !this.f47295a.getTag().equals("2"))) {
                    return;
                }
                b(f9);
                c(f9);
                view2 = this.f47295a;
                i9 = a7.e.f12038o;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public M(List list, Context context, boolean z9) {
        this.f47289e = list;
        this.f47288d = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void E(c cVar, int i9) {
        if (this.f47288d != null) {
            String str = "https://image.tmdb.org/t/p/w500/" + ((TMDBPersonProfilePojo) this.f47289e.get(i9)).getFilePath();
            cVar.f47294u.setImageDrawable(null);
            if (str.equals("")) {
                cVar.f47294u.setImageDrawable(this.f47288d.getResources().getDrawable(a7.e.f11895B1, null));
            } else {
                com.squareup.picasso.t.q(this.f47288d).l(str).h(cVar.f47294u, new a(cVar));
            }
            cVar.f47294u.setOnClickListener(new b());
            RelativeLayout relativeLayout = cVar.f47293t;
            relativeLayout.setOnFocusChangeListener(new d(relativeLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public c L(ViewGroup viewGroup, int i9) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12712S1, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f47289e.size();
    }
}
