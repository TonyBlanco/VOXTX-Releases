package k7;

import P.AbstractC0982y;
import a7.j;
import a7.k;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.toolbox.NetworkImageView;
import i7.b;
import k7.C2151a;
import l7.C2202a;
import n4.C2281m;
import n4.C2284p;
import o4.C2325b;
import o4.C2328e;
import p4.C2434i;
import x4.C2957a;

/* JADX INFO: loaded from: classes.dex */
public class b extends RecyclerView.g implements C2151a.InterfaceC0364a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f43629j = a7.e.f12051r0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f43630k = a7.e.f12075x0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f43631l = a7.e.f11910F0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f43632m = a7.e.f11914G0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i7.b f43633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f43634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f43635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View.OnClickListener f43636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f43637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.android.volley.toolbox.a f43638i;

    public class a implements b.d {
        public a() {
        }

        @Override // i7.b.d
        public void a() {
            b.this.w();
        }
    }

    /* JADX INFO: renamed from: k7.b$b, reason: collision with other inner class name */
    public class ViewOnClickListenerC0365b implements View.OnClickListener {
        public ViewOnClickListenerC0365b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getTag(j.f13089O5) != null) {
                Log.d("QueueListAdapter", String.valueOf(((C2284p) view.getTag(j.f13089O5)).K()));
            }
            b.this.q0(view);
        }
    }

    public class c implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f43641a;

        public c(g gVar) {
            this.f43641a = gVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AbstractC0982y.a(motionEvent) != 0) {
                return false;
            }
            b.this.f43635f.k(this.f43641a);
            return false;
        }
    }

    public interface d {
        void a(View view);
    }

    public interface e {
        void a();

        void b();
    }

    public interface f {
        void k(RecyclerView.D d9);
    }

    public static class g extends RecyclerView.D implements e {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public ViewGroup f43643A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public ImageView f43644B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public TextView f43645C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public TextView f43646D;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Context f43647t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final ImageButton f43648u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public View f43649v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public View f43650w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public ImageButton f43651x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public ImageButton f43652y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public NetworkImageView f43653z;

        public g(View view) {
            super(view);
            this.f43647t = view.getContext();
            this.f43643A = (ViewGroup) view.findViewById(a7.f.f12463m2);
            this.f43644B = (ImageView) view.findViewById(a7.f.f12219N2);
            this.f43645C = (TextView) view.findViewById(a7.f.bh);
            this.f43646D = (TextView) view.findViewById(a7.f.ch);
            this.f43653z = (NetworkImageView) view.findViewById(a7.f.f12486o4);
            this.f43648u = (ImageButton) view.findViewById(a7.f.xc);
            this.f43649v = view.findViewById(a7.f.f12484o2);
            this.f43650w = view.findViewById(a7.f.f12535t2);
            this.f43651x = (ImageButton) view.findViewById(a7.f.yc);
            this.f43652y = (ImageButton) view.findViewById(a7.f.Dg);
        }

        public final void T(int i9) {
            int i10 = a7.e.f12022k;
            this.f43645C.setTextAppearance(this.f43647t, k.f13459d);
            this.f43646D.setTextAppearance(this.f43647t, k.f13458c);
            if (i9 == 0) {
                i10 = a7.e.f12022k;
                this.f43649v.setVisibility(0);
                this.f43648u.setVisibility(0);
            } else {
                if (i9 == 1) {
                    this.f43649v.setVisibility(0);
                    this.f43648u.setVisibility(8);
                    this.f43650w.setVisibility(0);
                    this.f43644B.setImageResource(b.f43632m);
                    i10 = a7.e.f12026l;
                    this.f43645C.setTextAppearance(this.f43647t, k.f13464i);
                    TextView textView = this.f43645C;
                    textView.setTextAppearance(textView.getContext(), k.f13460e);
                    this.f43646D.setTextAppearance(this.f43647t, k.f13458c);
                    this.f43643A.setBackgroundResource(i10);
                }
                this.f43649v.setVisibility(8);
                this.f43648u.setVisibility(8);
            }
            this.f43650w.setVisibility(8);
            this.f43644B.setImageResource(b.f43631l);
            this.f43643A.setBackgroundResource(i10);
        }

        @Override // k7.b.e
        public void a() {
            this.f16733a.setBackgroundColor(0);
        }

        @Override // k7.b.e
        public void b() {
        }
    }

    public b(Context context, f fVar) {
        this.f43634e = context.getApplicationContext();
        this.f43635f = fVar;
        i7.b bVarN = i7.b.n(context);
        this.f43633d = bVarN;
        bVarN.z(new a());
        this.f43636g = new ViewOnClickListenerC0365b();
        c0(true);
    }

    @Override // k7.C2151a.InterfaceC0364a
    public void f(int i9) {
        this.f43633d.y(i9);
    }

    @Override // k7.C2151a.InterfaceC0364a
    public boolean h(int i9, int i10) {
        if (i9 == i10) {
            return false;
        }
        this.f43633d.u(i9, i10);
        z(i9, i10);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return i7.b.n(this.f43634e).k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void E(g gVar, int i9) {
        try {
            Log.d("QueueListAdapter", "[upcoming] onBindViewHolder() for position: " + i9);
            C2284p c2284pO = this.f43633d.o(i9);
            gVar.f43643A.setTag(j.f13089O5, c2284pO);
            gVar.f43648u.setTag(j.f13089O5, c2284pO);
            gVar.f43651x.setTag(j.f13089O5, c2284pO);
            gVar.f43652y.setTag(j.f13089O5, c2284pO);
            gVar.f43643A.setOnClickListener(this.f43636g);
            gVar.f43648u.setOnClickListener(this.f43636g);
            gVar.f43651x.setOnClickListener(this.f43636g);
            gVar.f43652y.setOnClickListener(this.f43636g);
            C2281m c2281mQ = c2284pO.L().Q();
            gVar.f43645C.setText(c2281mQ.J("com.google.android.gms.cast.metadata.TITLE"));
            gVar.f43646D.setText(c2281mQ.J("com.google.android.gms.cast.metadata.SUBTITLE"));
            if (!c2281mQ.H().isEmpty()) {
                String string = ((C2957a) c2281mQ.H().get(0)).H().toString();
                com.android.volley.toolbox.a aVarA = C2202a.b(this.f43634e).a();
                this.f43638i = aVarA;
                aVarA.e(string, com.android.volley.toolbox.a.i(gVar.f43653z, 0, 0));
                gVar.f43653z.i(string, this.f43638i);
            }
            gVar.f43644B.setOnTouchListener(new c(gVar));
            if (c2284pO == this.f43633d.l()) {
                gVar.T(0);
                s0(gVar.f43648u);
            } else if (c2284pO == this.f43633d.s()) {
                gVar.T(1);
            } else {
                gVar.T(2);
                gVar.f43648u.setVisibility(8);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long o(int i9) {
        return this.f43633d.o(i9).K();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public g L(ViewGroup viewGroup, int i9) {
        return new g(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12803g4, viewGroup, false));
    }

    public final void q0(View view) {
        d dVar = this.f43637h;
        if (dVar != null) {
            dVar.a(view);
        }
    }

    public void r0(d dVar) {
        this.f43637h = dVar;
    }

    public final void s0(ImageButton imageButton) {
        int i9;
        C2328e c2328eC = C2325b.e(this.f43634e).c().c();
        C2434i c2434iR = c2328eC == null ? null : c2328eC.r();
        if (c2434iR == null) {
            imageButton.setVisibility(8);
            return;
        }
        int iN = c2434iR.n();
        if (iN == 2) {
            i9 = f43630k;
        } else {
            if (iN != 3) {
                imageButton.setVisibility(8);
                return;
            }
            i9 = f43629j;
        }
        imageButton.setImageResource(i9);
    }
}
