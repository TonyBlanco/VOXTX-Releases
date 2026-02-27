package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import o7.C2368a;

/* JADX INFO: loaded from: classes4.dex */
public class c0 extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f48194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f48196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f48197g;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48198a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2368a f48199c;

        public a(int i9, C2368a c2368a) {
            this.f48198a = i9;
            this.f48199c = c2368a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c0 c0Var = c0.this;
            c0Var.f48194d = ((C2368a) c0Var.f48196f.get(this.f48198a)).c();
            if (c0.this.f48197g != null) {
                c0.this.f48197g.a(this.f48198a, this.f48199c);
            }
        }
    }

    public interface b {
        void a(int i9, C2368a c2368a);
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinearLayout f48201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f48202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48203c;

        public c(LinearLayout linearLayout, d dVar, int i9) {
            this.f48201a = linearLayout;
            this.f48202b = dVar;
            this.f48203c = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            LinearLayout linearLayout;
            int i9;
            if (z9) {
                d dVar = this.f48202b;
                if (dVar == null || (linearLayout = dVar.f48207v) == null) {
                    return;
                } else {
                    i9 = a7.c.f11848F;
                }
            } else {
                if (z9) {
                    return;
                }
                linearLayout = this.f48202b.f48207v;
                i9 = a7.c.f11857h;
            }
            linearLayout.setBackgroundResource(i9);
        }
    }

    public class d extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48205t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48206u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public LinearLayout f48207v;

        public d(View view) {
            super(view);
            this.f48205t = (TextView) view.findViewById(a7.f.vb);
            this.f48206u = (TextView) view.findViewById(a7.f.f12447k6);
            this.f48207v = (LinearLayout) view.findViewById(a7.f.f12178J1);
        }
    }

    public c0(Context context, List list) {
        this.f48195e = context;
        this.f48196f = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void E(d dVar, int i9) {
        C2368a c2368a = (C2368a) this.f48196f.get(i9);
        dVar.f48206u.setText(c2368a.b());
        dVar.f48207v.setOnClickListener(new a(i9, c2368a));
        LinearLayout linearLayout = dVar.f48207v;
        linearLayout.setOnFocusChangeListener(new c(linearLayout, dVar, i9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public d L(ViewGroup viewGroup, int i9) {
        return new d(LayoutInflater.from(this.f48195e).inflate(a7.g.f12886u3, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48196f.size();
    }

    public void n0(b bVar) {
        this.f48197g = bVar;
    }
}
