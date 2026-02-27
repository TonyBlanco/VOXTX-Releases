package s4;

import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC1238a;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.internal.cast.zzcq;
import com.google.android.gms.internal.cast.zzct;
import com.google.android.gms.internal.cast.zzcu;
import com.google.android.gms.internal.cast.zzcv;
import com.google.android.gms.internal.cast.zzcw;
import com.google.android.gms.internal.cast.zzln;
import com.google.android.gms.internal.cast.zzr;
import d.AbstractC1622a;
import java.util.Timer;
import n4.AbstractC2268e;
import n4.C2260a;
import n4.C2281m;
import o4.AbstractC2336m;
import o4.AbstractC2339p;
import o4.AbstractC2340q;
import o4.AbstractC2341s;
import o4.AbstractC2342t;
import o4.AbstractC2343u;
import o4.AbstractC2344v;
import o4.C2325b;
import o4.C2328e;
import o4.C2346x;
import o4.InterfaceC2347y;
import p4.C2427b;
import p4.C2434i;
import q4.C2547b;
import q4.x;
import r4.C2661b;

/* JADX INFO: renamed from: s4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC2709a extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ImageView f49900A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ImageView f49901B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f49902C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f49904E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public View f49905F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ImageView f49906G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f49907H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public TextView f49908I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public TextView f49909J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f49910K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public C2547b f49911L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public C2661b f49912M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C2346x f49913N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public AbstractC2268e.d f49914O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f49915P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f49916Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Timer f49917R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f49918S;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f49921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f49922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f49923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49924i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49925j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f49926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f49927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f49928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f49930o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f49931p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f49932q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f49933r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f49934s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49935t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f49936u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f49937v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f49938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f49939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SeekBar f49940y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CastSeekBar f49941z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2347y f49919d = new s(this, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2434i.b f49920e = new q(this, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ImageView[] f49903D = new ImageView[4];

    public final C2434i D1() {
        C2328e c2328eC = this.f49913N.c();
        if (c2328eC == null || !c2328eC.c()) {
            return null;
        }
        return c2328eC.r();
    }

    public final void E1(String str) {
        this.f49911L.d(Uri.parse(str));
        this.f49905F.setVisibility(8);
    }

    public final void F1(View view, int i9, int i10, C2661b c2661b) {
        ImageView imageView = (ImageView) view.findViewById(i9);
        if (i10 == AbstractC2340q.f45978s) {
            imageView.setVisibility(4);
            return;
        }
        if (i10 == AbstractC2340q.f45981v) {
            imageView.setBackgroundResource(this.f49921f);
            Drawable drawableB = t.b(this, this.f49935t, this.f49923h);
            Drawable drawableB2 = t.b(this, this.f49935t, this.f49922g);
            Drawable drawableB3 = t.b(this, this.f49935t, this.f49924i);
            imageView.setImageDrawable(drawableB2);
            c2661b.i(imageView, drawableB2, drawableB, drawableB3, null, false);
            return;
        }
        if (i10 == AbstractC2340q.f45984y) {
            imageView.setBackgroundResource(this.f49921f);
            imageView.setImageDrawable(t.b(this, this.f49935t, this.f49925j));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46018t));
            c2661b.v(imageView, 0);
            return;
        }
        if (i10 == AbstractC2340q.f45983x) {
            imageView.setBackgroundResource(this.f49921f);
            imageView.setImageDrawable(t.b(this, this.f49935t, this.f49926k));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46017s));
            c2661b.u(imageView, 0);
            return;
        }
        if (i10 == AbstractC2340q.f45982w) {
            imageView.setBackgroundResource(this.f49921f);
            imageView.setImageDrawable(t.b(this, this.f49935t, this.f49927l));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46016r));
            c2661b.t(imageView, 30000L);
            return;
        }
        if (i10 == AbstractC2340q.f45979t) {
            imageView.setBackgroundResource(this.f49921f);
            imageView.setImageDrawable(t.b(this, this.f49935t, this.f49928m));
            imageView.setContentDescription(getResources().getString(AbstractC2342t.f46009k));
            c2661b.q(imageView, 30000L);
            return;
        }
        if (i10 == AbstractC2340q.f45980u) {
            imageView.setBackgroundResource(this.f49921f);
            imageView.setImageDrawable(t.b(this, this.f49935t, this.f49929n));
            c2661b.h(imageView);
        } else if (i10 == AbstractC2340q.f45976q) {
            imageView.setBackgroundResource(this.f49921f);
            imageView.setImageDrawable(t.b(this, this.f49935t, this.f49930o));
            c2661b.p(imageView);
        }
    }

    public final void G1(C2434i c2434i) {
        n4.r rVarL;
        if (this.f49915P || (rVarL = c2434i.l()) == null || c2434i.r()) {
            return;
        }
        this.f49909J.setVisibility(8);
        this.f49910K.setVisibility(8);
        C2260a c2260aJ = rVarL.J();
        if (c2260aJ == null || c2260aJ.R() == -1) {
            return;
        }
        if (!this.f49916Q) {
            l lVar = new l(this, c2434i);
            Timer timer = new Timer();
            this.f49917R = timer;
            timer.scheduleAtFixedRate(lVar, 0L, 500L);
            this.f49916Q = true;
        }
        if (c2260aJ.R() - c2434i.d() > 0.0f) {
            this.f49910K.setVisibility(0);
            this.f49910K.setText(getResources().getString(AbstractC2342t.f46006h, Integer.valueOf((int) Math.ceil(r11 / 1000.0f))));
            this.f49909J.setClickable(false);
        } else {
            if (this.f49916Q) {
                this.f49917R.cancel();
                this.f49916Q = false;
            }
            this.f49909J.setVisibility(0);
            this.f49909J.setClickable(true);
        }
    }

    public final void H1() {
        CastDevice castDeviceQ;
        C2328e c2328eC = this.f49913N.c();
        if (c2328eC != null && (castDeviceQ = c2328eC.q()) != null) {
            String strJ = castDeviceQ.J();
            if (!TextUtils.isEmpty(strJ)) {
                this.f49939x.setText(getResources().getString(AbstractC2342t.f46000b, strJ));
                return;
            }
        }
        this.f49939x.setText("");
    }

    public final void I1() {
        MediaInfo mediaInfoJ;
        C2281m c2281mQ;
        AbstractC1622a abstractC1622aI1;
        C2434i c2434iD1 = D1();
        if (c2434iD1 == null || !c2434iD1.q() || (mediaInfoJ = c2434iD1.j()) == null || (c2281mQ = mediaInfoJ.Q()) == null || (abstractC1622aI1 = i1()) == null) {
            return;
        }
        abstractC1622aI1.x(c2281mQ.J("com.google.android.gms.cast.metadata.TITLE"));
        String strE = x.e(c2281mQ);
        if (strE != null) {
            abstractC1622aI1.w(strE);
        }
    }

    public final void J1() {
        n4.r rVarL;
        String string;
        Drawable drawable;
        Bitmap bitmap;
        Bitmap bitmapA;
        C2434i c2434iD1 = D1();
        if (c2434iD1 == null || (rVarL = c2434iD1.l()) == null) {
            return;
        }
        String strN = null;
        if (!rVarL.h0()) {
            this.f49910K.setVisibility(8);
            this.f49909J.setVisibility(8);
            this.f49904E.setVisibility(8);
            this.f49901B.setVisibility(8);
            this.f49901B.setImageBitmap(null);
            return;
        }
        if (this.f49901B.getVisibility() == 8 && (drawable = this.f49900A.getDrawable()) != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && (bitmapA = t.a(this, bitmap, 0.25f, 7.5f)) != null) {
            this.f49901B.setImageBitmap(bitmapA);
            this.f49901B.setVisibility(0);
        }
        C2260a c2260aJ = rVarL.J();
        if (c2260aJ != null) {
            String strP = c2260aJ.P();
            strN = c2260aJ.N();
            string = strP;
        } else {
            string = null;
        }
        if (!TextUtils.isEmpty(strN)) {
            E1(strN);
        } else if (TextUtils.isEmpty(this.f49918S)) {
            this.f49907H.setVisibility(0);
            this.f49905F.setVisibility(0);
            this.f49906G.setVisibility(8);
        } else {
            E1(this.f49918S);
        }
        TextView textView = this.f49908I;
        if (TextUtils.isEmpty(string)) {
            string = getResources().getString(AbstractC2342t.f45999a);
        }
        textView.setText(string);
        if (C4.m.g()) {
            this.f49908I.setTextAppearance(this.f49936u);
        } else {
            this.f49908I.setTextAppearance(this, this.f49936u);
        }
        this.f49904E.setVisibility(0);
        G1(c2434iD1);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2346x c2346xC = C2325b.e(this).c();
        this.f49913N = c2346xC;
        if (c2346xC.c() == null) {
            finish();
        }
        C2661b c2661b = new C2661b(this);
        this.f49912M = c2661b;
        c2661b.S(this.f49920e);
        setContentView(AbstractC2341s.f45988b);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(new int[]{AbstractC1238a.f17736M});
        this.f49921f = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        n nVar = null;
        TypedArray typedArrayObtainStyledAttributes2 = obtainStyledAttributes(null, AbstractC2344v.f46049b, AbstractC2336m.f45890a, AbstractC2343u.f46025a);
        this.f49935t = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46057j, 0);
        this.f49922g = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46066s, 0);
        this.f49923h = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46065r, 0);
        this.f49924i = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46027A, 0);
        this.f49925j = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46073z, 0);
        this.f49926k = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46072y, 0);
        this.f49927l = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46067t, 0);
        this.f49928m = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46062o, 0);
        this.f49929n = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46064q, 0);
        this.f49930o = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46058k, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46059l, 0);
        if (resourceId != 0) {
            TypedArray typedArrayObtainTypedArray = getResources().obtainTypedArray(resourceId);
            com.google.android.gms.common.internal.r.a(typedArrayObtainTypedArray.length() == 4);
            this.f49902C = new int[typedArrayObtainTypedArray.length()];
            for (int i9 = 0; i9 < typedArrayObtainTypedArray.length(); i9++) {
                this.f49902C[i9] = typedArrayObtainTypedArray.getResourceId(i9, 0);
            }
            typedArrayObtainTypedArray.recycle();
        } else {
            int i10 = AbstractC2340q.f45978s;
            this.f49902C = new int[]{i10, i10, i10, i10};
        }
        this.f49934s = typedArrayObtainStyledAttributes2.getColor(AbstractC2344v.f46061n, 0);
        this.f49931p = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46054g, 0));
        this.f49932q = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46053f, 0));
        this.f49933r = getResources().getColor(typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46056i, 0));
        this.f49936u = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46055h, 0);
        this.f49937v = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46051d, 0);
        this.f49938w = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46052e, 0);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(AbstractC2344v.f46060m, 0);
        if (resourceId2 != 0) {
            this.f49918S = getApplicationContext().getResources().getString(resourceId2);
        }
        typedArrayObtainStyledAttributes2.recycle();
        View viewFindViewById = findViewById(AbstractC2340q.f45940N);
        C2661b c2661b2 = this.f49912M;
        this.f49900A = (ImageView) viewFindViewById.findViewById(AbstractC2340q.f45968i);
        this.f49901B = (ImageView) viewFindViewById.findViewById(AbstractC2340q.f45970k);
        View viewFindViewById2 = viewFindViewById.findViewById(AbstractC2340q.f45969j);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        c2661b2.U(this.f49900A, new C2427b(4, displayMetrics.widthPixels, displayMetrics.heightPixels), viewFindViewById2, new o(this, nVar));
        this.f49939x = (TextView) viewFindViewById.findViewById(AbstractC2340q.f45951Y);
        ProgressBar progressBar = (ProgressBar) viewFindViewById.findViewById(AbstractC2340q.f45946T);
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        int i11 = this.f49934s;
        if (i11 != 0) {
            indeterminateDrawable.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
        }
        c2661b2.s(progressBar);
        TextView textView = (TextView) viewFindViewById.findViewById(AbstractC2340q.f45950X);
        TextView textView2 = (TextView) viewFindViewById.findViewById(AbstractC2340q.f45939M);
        this.f49940y = (SeekBar) viewFindViewById.findViewById(AbstractC2340q.f45949W);
        CastSeekBar castSeekBar = (CastSeekBar) viewFindViewById.findViewById(AbstractC2340q.f45936J);
        this.f49941z = castSeekBar;
        c2661b2.l(castSeekBar, 1000L);
        c2661b2.w(textView, new zzcv(textView, c2661b2.T()));
        c2661b2.w(textView2, new zzct(textView2, c2661b2.T()));
        View viewFindViewById3 = viewFindViewById.findViewById(AbstractC2340q.f45945S);
        c2661b2.w(viewFindViewById3, new zzcu(viewFindViewById3, c2661b2.T()));
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById.findViewById(AbstractC2340q.f45966g0);
        zzcq zzcwVar = new zzcw(relativeLayout, this.f49941z, c2661b2.T());
        c2661b2.w(relativeLayout, zzcwVar);
        c2661b2.Y(zzcwVar);
        this.f49903D[0] = (ImageView) viewFindViewById.findViewById(AbstractC2340q.f45971l);
        this.f49903D[1] = (ImageView) viewFindViewById.findViewById(AbstractC2340q.f45972m);
        this.f49903D[2] = (ImageView) viewFindViewById.findViewById(AbstractC2340q.f45973n);
        this.f49903D[3] = (ImageView) viewFindViewById.findViewById(AbstractC2340q.f45974o);
        F1(viewFindViewById, AbstractC2340q.f45971l, this.f49902C[0], c2661b2);
        F1(viewFindViewById, AbstractC2340q.f45972m, this.f49902C[1], c2661b2);
        F1(viewFindViewById, AbstractC2340q.f45975p, AbstractC2340q.f45981v, c2661b2);
        F1(viewFindViewById, AbstractC2340q.f45973n, this.f49902C[2], c2661b2);
        F1(viewFindViewById, AbstractC2340q.f45974o, this.f49902C[3], c2661b2);
        View viewFindViewById4 = findViewById(AbstractC2340q.f45955b);
        this.f49904E = viewFindViewById4;
        this.f49906G = (ImageView) viewFindViewById4.findViewById(AbstractC2340q.f45957c);
        this.f49905F = this.f49904E.findViewById(AbstractC2340q.f45953a);
        TextView textView3 = (TextView) this.f49904E.findViewById(AbstractC2340q.f45961e);
        this.f49908I = textView3;
        textView3.setTextColor(this.f49933r);
        this.f49908I.setBackgroundColor(this.f49931p);
        this.f49907H = (TextView) this.f49904E.findViewById(AbstractC2340q.f45959d);
        this.f49910K = (TextView) findViewById(AbstractC2340q.f45965g);
        TextView textView4 = (TextView) findViewById(AbstractC2340q.f45963f);
        this.f49909J = textView4;
        textView4.setOnClickListener(new j(this));
        r1((Toolbar) findViewById(AbstractC2340q.f45962e0));
        AbstractC1622a abstractC1622aI1 = i1();
        if (abstractC1622aI1 != null) {
            abstractC1622aI1.t(true);
            abstractC1622aI1.u(AbstractC2339p.f45924o);
        }
        H1();
        I1();
        if (this.f49907H != null && this.f49938w != 0) {
            if (C4.m.g()) {
                this.f49907H.setTextAppearance(this.f49937v);
            } else {
                this.f49907H.setTextAppearance(getApplicationContext(), this.f49937v);
            }
            this.f49907H.setTextColor(this.f49932q);
            this.f49907H.setText(this.f49938w);
        }
        C2547b c2547b = new C2547b(getApplicationContext(), new C2427b(-1, this.f49906G.getWidth(), this.f49906G.getHeight()));
        this.f49911L = c2547b;
        c2547b.c(new i(this));
        zzr.zzd(zzln.CAF_EXPANDED_CONTROLLER);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        this.f49911L.a();
        C2661b c2661b = this.f49912M;
        if (c2661b != null) {
            c2661b.S(null);
            this.f49912M.y();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        C2346x c2346x = this.f49913N;
        if (c2346x == null) {
            return;
        }
        C2328e c2328eC = c2346x.c();
        AbstractC2268e.d dVar = this.f49914O;
        if (dVar != null && c2328eC != null) {
            c2328eC.t(dVar);
            this.f49914O = null;
        }
        this.f49913N.e(this.f49919d, C2328e.class);
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        C2346x c2346x = this.f49913N;
        if (c2346x == null) {
            return;
        }
        c2346x.a(this.f49919d, C2328e.class);
        C2328e c2328eC = this.f49913N.c();
        if (c2328eC == null || !(c2328eC.c() || c2328eC.d())) {
            finish();
        } else {
            m mVar = new m(this);
            this.f49914O = mVar;
            c2328eC.p(mVar);
        }
        C2434i c2434iD1 = D1();
        boolean z9 = true;
        if (c2434iD1 != null && c2434iD1.q()) {
            z9 = false;
        }
        this.f49915P = z9;
        H1();
        J1();
        super.onResume();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        if (z9) {
            int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
            int i9 = systemUiVisibility ^ 2;
            if (C4.m.b()) {
                i9 = systemUiVisibility ^ 6;
            }
            if (C4.m.d()) {
                i9 ^= 4096;
            }
            getWindow().getDecorView().setSystemUiVisibility(i9);
            setImmersive(true);
        }
    }
}
