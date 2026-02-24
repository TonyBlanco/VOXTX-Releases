package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.DialogC1642u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import t0.j;
import u0.C2811K;
import u0.C2812L;

/* JADX INFO: loaded from: classes.dex */
public class g extends DialogC1642u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2812L f16149a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f16150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f16151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2811K f16152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f16153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageButton f16154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f16155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f16156i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16157j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2812L.h f16158k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f16159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Handler f16161n;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            g.this.updateRoutes((List) message.obj);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.dismiss();
        }
    }

    public final class c extends C2812L.a {
        public c() {
        }

        @Override // u0.C2812L.a
        public void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
            g.this.refreshRoutes();
        }

        @Override // u0.C2812L.a
        public void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
            g.this.refreshRoutes();
        }

        @Override // u0.C2812L.a
        public void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
            g.this.refreshRoutes();
        }

        @Override // u0.C2812L.a
        public void onRouteSelected(C2812L c2812l, C2812L.h hVar) {
            g.this.dismiss();
        }
    }

    public final class d extends RecyclerView.g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f16165d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final LayoutInflater f16166e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Drawable f16167f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Drawable f16168g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Drawable f16169h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Drawable f16170i;

        public class a extends RecyclerView.D {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public TextView f16172t;

            public a(View view) {
                super(view);
                this.f16172t = (TextView) view.findViewById(t0.f.f50523P);
            }

            public void P(b bVar) {
                this.f16172t.setText(bVar.a().toString());
            }
        }

        public class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f16174a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f16175b;

            public b(Object obj) {
                int i9;
                this.f16174a = obj;
                if (obj instanceof String) {
                    i9 = 1;
                } else {
                    if (!(obj instanceof C2812L.h)) {
                        this.f16175b = 0;
                        Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
                        return;
                    }
                    i9 = 2;
                }
                this.f16175b = i9;
            }

            public Object a() {
                return this.f16174a;
            }

            public int b() {
                return this.f16175b;
            }
        }

        public class c extends RecyclerView.D {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final View f16177t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final ImageView f16178u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final ProgressBar f16179v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final TextView f16180w;

            public class a implements View.OnClickListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ C2812L.h f16182a;

                public a(C2812L.h hVar) {
                    this.f16182a = hVar;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    g gVar = g.this;
                    C2812L.h hVar = this.f16182a;
                    gVar.f16158k = hVar;
                    hVar.I();
                    c.this.f16178u.setVisibility(4);
                    c.this.f16179v.setVisibility(0);
                }
            }

            public c(View view) {
                super(view);
                this.f16177t = view;
                this.f16178u = (ImageView) view.findViewById(t0.f.f50525R);
                ProgressBar progressBar = (ProgressBar) view.findViewById(t0.f.f50527T);
                this.f16179v = progressBar;
                this.f16180w = (TextView) view.findViewById(t0.f.f50526S);
                i.t(g.this.f16151d, progressBar);
            }

            public void P(b bVar) {
                C2812L.h hVar = (C2812L.h) bVar.a();
                this.f16177t.setVisibility(0);
                this.f16179v.setVisibility(4);
                this.f16177t.setOnClickListener(new a(hVar));
                this.f16180w.setText(hVar.m());
                this.f16178u.setImageDrawable(d.this.k0(hVar));
            }
        }

        public d() {
            this.f16166e = LayoutInflater.from(g.this.f16151d);
            this.f16167f = i.g(g.this.f16151d);
            this.f16168g = i.q(g.this.f16151d);
            this.f16169h = i.m(g.this.f16151d);
            this.f16170i = i.n(g.this.f16151d);
            m0();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public void E(RecyclerView.D d9, int i9) {
            int iP = p(i9);
            b bVarL0 = l0(i9);
            if (iP == 1) {
                ((a) d9).P(bVarL0);
            } else if (iP != 2) {
                Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            } else {
                ((c) d9).P(bVarL0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public RecyclerView.D L(ViewGroup viewGroup, int i9) {
            if (i9 == 1) {
                return new a(this.f16166e.inflate(t0.i.f50577k, viewGroup, false));
            }
            if (i9 == 2) {
                return new c(this.f16166e.inflate(t0.i.f50578l, viewGroup, false));
            }
            Log.w("RecyclerAdapter", "Cannot create ViewHolder because of wrong view type");
            return null;
        }

        public final Drawable j0(C2812L.h hVar) {
            int iF = hVar.f();
            return iF != 1 ? iF != 2 ? hVar.y() ? this.f16170i : this.f16167f : this.f16169h : this.f16168g;
        }

        public Drawable k0(C2812L.h hVar) {
            Uri uriJ = hVar.j();
            if (uriJ != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(g.this.f16151d.getContentResolver().openInputStream(uriJ), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e9) {
                    Log.w("RecyclerAdapter", "Failed to load " + uriJ, e9);
                }
            }
            return j0(hVar);
        }

        public b l0(int i9) {
            return (b) this.f16165d.get(i9);
        }

        public void m0() {
            this.f16165d.clear();
            this.f16165d.add(new b(g.this.f16151d.getString(j.f50583e)));
            Iterator it = g.this.f16153f.iterator();
            while (it.hasNext()) {
                this.f16165d.add(new b((C2812L.h) it.next()));
            }
            w();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int n() {
            return this.f16165d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int p(int i9) {
            return ((b) this.f16165d.get(i9)).b();
        }
    }

    public static final class e implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f16184a = new e();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2812L.h hVar, C2812L.h hVar2) {
            return hVar.m().compareToIgnoreCase(hVar2.m());
        }
    }

    public g(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context, int i9) {
        Context contextB = i.b(context, i9, false);
        super(contextB, i.c(contextB));
        this.f16152e = C2811K.f50924c;
        this.f16161n = new a();
        Context context2 = getContext();
        this.f16149a = C2812L.j(context2);
        this.f16150c = new c();
        this.f16151d = context2;
        this.f16159l = context2.getResources().getInteger(t0.g.f50564e);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16157j = true;
        this.f16149a.b(this.f16152e, this.f16150c, 1);
        refreshRoutes();
    }

    @Override // d.DialogC1642u, androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t0.i.f50576j);
        i.s(this.f16151d, this);
        this.f16153f = new ArrayList();
        ImageButton imageButton = (ImageButton) findViewById(t0.f.f50522O);
        this.f16154g = imageButton;
        imageButton.setOnClickListener(new b());
        this.f16155h = new d();
        RecyclerView recyclerView = (RecyclerView) findViewById(t0.f.f50524Q);
        this.f16156i = recyclerView;
        recyclerView.setAdapter(this.f16155h);
        this.f16156i.setLayoutManager(new LinearLayoutManager(this.f16151d));
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16157j = false;
        this.f16149a.s(this.f16150c);
        this.f16161n.removeMessages(1);
    }

    public boolean onFilterRoute(C2812L.h hVar) {
        return !hVar.w() && hVar.x() && hVar.E(this.f16152e);
    }

    public void onFilterRoutes(List list) {
        int size = list.size();
        while (true) {
            int i9 = size - 1;
            if (size <= 0) {
                return;
            }
            if (!onFilterRoute((C2812L.h) list.get(i9))) {
                list.remove(i9);
            }
            size = i9;
        }
    }

    public void refreshRoutes() {
        if (this.f16158k == null && this.f16157j) {
            ArrayList arrayList = new ArrayList(this.f16149a.m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, e.f16184a);
            if (SystemClock.uptimeMillis() - this.f16160m >= this.f16159l) {
                updateRoutes(arrayList);
                return;
            }
            this.f16161n.removeMessages(1);
            Handler handler = this.f16161n;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.f16160m + this.f16159l);
        }
    }

    public void setRouteSelector(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f16152e.equals(c2811k)) {
            return;
        }
        this.f16152e = c2811k;
        if (this.f16157j) {
            this.f16149a.s(this.f16150c);
            this.f16149a.b(c2811k, this.f16150c, 1);
        }
        refreshRoutes();
    }

    public void updateLayout() {
        getWindow().setLayout(f.c(this.f16151d), f.a(this.f16151d));
    }

    public void updateRoutes(List list) {
        this.f16160m = SystemClock.uptimeMillis();
        this.f16153f.clear();
        this.f16153f.addAll(list);
        this.f16155h.m0();
    }
}
