package q7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.pojo.TMDBCastsPojo;
import com.nst.iptvsmarterstvbox.view.activity.ViewDetailsCastActivity;
import com.squareup.picasso.InterfaceC1611e;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: renamed from: q7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2622f extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f48310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f48311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48312f;

    /* JADX INFO: renamed from: q7.f$a */
    public class a implements InterfaceC1611e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f48313a;

        public a(d dVar) {
            this.f48313a = dVar;
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void a() {
            this.f48313a.f48320u.setImageDrawable(C2622f.this.f48310d.getResources().getDrawable(a7.e.f11895B1, null));
        }

        @Override // com.squareup.picasso.InterfaceC1611e
        public void onSuccess() {
        }
    }

    /* JADX INFO: renamed from: q7.f$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48315a;

        public b(int i9) {
            this.f48315a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            try {
                string = ((TMDBCastsPojo) C2622f.this.f48311e.get(this.f48315a)).getId().toString();
            } catch (Exception unused) {
                string = "0";
            }
            if (string.equals("0")) {
                return;
            }
            C2622f.this.p0(string, ((TMDBCastsPojo) C2622f.this.f48311e.get(this.f48315a)).getName(), ((TMDBCastsPojo) C2622f.this.f48311e.get(this.f48315a)).getProfilePath());
        }
    }

    /* JADX INFO: renamed from: q7.f$c */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48317a;

        public c(int i9) {
            this.f48317a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String string;
            try {
                string = ((TMDBCastsPojo) C2622f.this.f48311e.get(this.f48317a)).getId().toString();
            } catch (Exception unused) {
                string = "0";
            }
            if (string.equals("0")) {
                return;
            }
            C2622f.this.p0(string, ((TMDBCastsPojo) C2622f.this.f48311e.get(this.f48317a)).getName(), ((TMDBCastsPojo) C2622f.this.f48311e.get(this.f48317a)).getProfilePath());
        }
    }

    /* JADX INFO: renamed from: q7.f$d */
    public static class d extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public RelativeLayout f48319t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ImageView f48320u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f48321v;

        public d(View view) {
            super(view);
            this.f48319t = (RelativeLayout) view.findViewById(a7.f.Ge);
            this.f48320u = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f48321v = (TextView) view.findViewById(a7.f.Uh);
            J(false);
        }
    }

    /* JADX INFO: renamed from: q7.f$e */
    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48322a;

        public e(View view) {
            this.f48322a = view;
        }

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48322a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48322a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f48322a, "scaleY", f9);
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
                Log.e("id is", "" + this.f48322a.getTag());
                if (this.f48322a.getTag() != null && this.f48322a.getTag().equals("1")) {
                    b(f9);
                    view2 = this.f48322a;
                    i9 = a7.e.f12010h;
                } else {
                    if (this.f48322a.getTag() == null || !this.f48322a.getTag().equals("2")) {
                        return;
                    }
                    b(f9);
                    view2 = this.f48322a;
                    i9 = a7.e.f12024k1;
                }
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                a(z9);
                if ((this.f48322a.getTag() == null || !this.f48322a.getTag().equals("1")) && (this.f48322a.getTag() == null || !this.f48322a.getTag().equals("2"))) {
                    return;
                }
                b(f9);
                c(f9);
                view2 = this.f48322a;
                i9 = a7.e.f12038o;
            }
            view2.setBackgroundResource(i9);
        }
    }

    public C2622f(List list, Context context, boolean z9, String str) {
        this.f48311e = list;
        this.f48310d = context;
        this.f48312f = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void E(d dVar, int i9) {
        if (this.f48310d != null) {
            String str = "https://image.tmdb.org/t/p/w500/" + ((TMDBCastsPojo) this.f48311e.get(i9)).getProfilePath();
            dVar.f48320u.setImageDrawable(null);
            if (str.equals("")) {
                dVar.f48320u.setImageDrawable(this.f48310d.getResources().getDrawable(a7.e.f11895B1, null));
            } else {
                com.squareup.picasso.t.q(this.f48310d).l(str).h(dVar.f48320u, new a(dVar));
            }
            dVar.f48321v.setText(((TMDBCastsPojo) this.f48311e.get(i9)).getName());
            dVar.f48321v.setVisibility(0);
            dVar.f48320u.setOnClickListener(new b(i9));
            dVar.f48319t.setOnClickListener(new c(i9));
            RelativeLayout relativeLayout = dVar.f48319t;
            relativeLayout.setOnFocusChangeListener(new e(relativeLayout));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48311e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public d L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (new C2858a(this.f48310d).A().equals(AbstractC2237a.f44453K0)) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12718T1;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12712S1;
        }
        return new d(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void p0(String str, String str2, String str3) {
        if (this.f48310d == null) {
            Log.e("Null hai context", ">>>>>>>>>>>True its Null");
            return;
        }
        Intent intent = new Intent(this.f48310d, (Class<?>) ViewDetailsCastActivity.class);
        intent.putExtra("castID", str);
        intent.putExtra("castName", str2);
        intent.putExtra("profilePath", str3);
        intent.putExtra("streamBackdrop", this.f48312f);
        this.f48310d.startActivity(intent);
    }
}
