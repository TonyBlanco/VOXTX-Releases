package com.nst.iptvsmarterstvbox.view.fragment;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.leanback.widget.AbstractC1169y;
import androidx.leanback.widget.C;
import androidx.leanback.widget.D;
import androidx.leanback.widget.E;
import androidx.leanback.widget.J;
import androidx.leanback.widget.M;
import androidx.leanback.widget.SearchBar;
import androidx.leanback.widget.VerticalGridView;
import d.AbstractC1617D;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f34864w = "a";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f34865x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f34866y;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.leanback.app.b f34872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SearchBar f34873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i f34874i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public D f34876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C f34877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC1169y f34878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f34879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f34880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f34881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SpeechRecognizer f34882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f34883r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f34885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f34886u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1169y.b f34867a = new C0286a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f34868c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f34869d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f34870e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f34871f = new d();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f34875j = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f34884s = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SearchBar.l f34887v = new e();

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.fragment.a$a, reason: collision with other inner class name */
    public class C0286a extends AbstractC1169y.b {
        public C0286a() {
        }

        @Override // androidx.leanback.widget.AbstractC1169y.b
        public void a() {
            a aVar = a.this;
            aVar.f34868c.removeCallbacks(aVar.f34869d);
            a aVar2 = a.this;
            aVar2.f34868c.post(aVar2.f34869d);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.leanback.app.b bVar = a.this.f34872g;
            if (bVar != null) {
                AbstractC1169y abstractC1169yZ = bVar.z();
                a aVar = a.this;
                if (abstractC1169yZ != aVar.f34878m && (aVar.f34872g.z() != null || a.this.f34878m.i() != 0)) {
                    a aVar2 = a.this;
                    aVar2.f34872g.P(aVar2.f34878m);
                    a.this.f34872g.T(0);
                }
            }
            a.this.l0();
            a aVar3 = a.this;
            int i9 = aVar3.f34883r | 1;
            aVar3.f34883r = i9;
            if ((i9 & 2) != 0) {
                aVar3.j0();
            }
            a.this.k0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC1169y abstractC1169y;
            a aVar = a.this;
            if (aVar.f34872g == null) {
                return;
            }
            AbstractC1169y abstractC1169yN = aVar.f34874i.n();
            a aVar2 = a.this;
            AbstractC1169y abstractC1169y2 = aVar2.f34878m;
            if (abstractC1169yN != abstractC1169y2) {
                boolean z9 = abstractC1169y2 == null;
                aVar2.J();
                a aVar3 = a.this;
                aVar3.f34878m = abstractC1169yN;
                if (abstractC1169yN != null) {
                    abstractC1169yN.g(aVar3.f34867a);
                }
                if (!z9 || ((abstractC1169y = a.this.f34878m) != null && abstractC1169y.i() != 0)) {
                    a aVar4 = a.this;
                    aVar4.f34872g.P(aVar4.f34878m);
                }
                a.this.z();
            }
            a.this.k0();
            a aVar5 = a.this;
            if (!aVar5.f34884s) {
                aVar5.j0();
                return;
            }
            aVar5.f34868c.removeCallbacks(aVar5.f34871f);
            a aVar6 = a.this;
            aVar6.f34868c.postDelayed(aVar6.f34871f, 300L);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f34884s = false;
            aVar.f34873h.i();
        }
    }

    public class e implements SearchBar.l {
        public e() {
        }

        @Override // androidx.leanback.widget.SearchBar.l
        public void a() {
            a.this.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 0);
        }
    }

    public class f implements SearchBar.k {
        public f() {
        }

        @Override // androidx.leanback.widget.SearchBar.k
        public void a(String str) {
            a aVar = a.this;
            if (aVar.f34874i != null) {
                aVar.P(str);
            } else {
                aVar.f34875j = str;
            }
        }

        @Override // androidx.leanback.widget.SearchBar.k
        public void b(String str) {
            a.this.D();
        }

        @Override // androidx.leanback.widget.SearchBar.k
        public void c(String str) {
            a.this.i0(str);
        }
    }

    public class g implements D {
        public g() {
        }

        @Override // androidx.leanback.widget.InterfaceC1149d
        public /* bridge */ /* synthetic */ void a(E.a aVar, Object obj, M.b bVar, Object obj2) {
            AbstractC1617D.a(obj2);
            b(aVar, obj, bVar, null);
        }

        public void b(E.a aVar, Object obj, M.b bVar, J j9) {
            a.this.l0();
            D d9 = a.this.f34876k;
            if (d9 != null) {
                d9.a(aVar, obj, bVar, j9);
            }
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f34895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f34896b;

        public h(String str, boolean z9) {
            this.f34895a = str;
            this.f34896b = z9;
        }
    }

    public interface i {
        AbstractC1169y n();

        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    static {
        String canonicalName = a.class.getCanonicalName();
        f34865x = canonicalName + ".query";
        f34866y = canonicalName + ".title";
    }

    public final void A() {
        androidx.leanback.app.b bVar = this.f34872g;
        if (bVar == null || bVar.E() == null || this.f34878m.i() == 0 || !this.f34872g.E().requestFocus()) {
            return;
        }
        this.f34883r &= -2;
    }

    public final void B() {
        this.f34868c.removeCallbacks(this.f34870e);
        this.f34868c.post(this.f34870e);
    }

    public void D() {
        this.f34883r |= 2;
        A();
    }

    public final void E(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String str = f34865x;
        if (bundle.containsKey(str)) {
            X(bundle.getString(str));
        }
        String str2 = f34866y;
        if (bundle.containsKey(str2)) {
            b0(bundle.getString(str2));
        }
    }

    public void J() {
        AbstractC1169y abstractC1169y = this.f34878m;
        if (abstractC1169y != null) {
            abstractC1169y.j(this.f34867a);
            this.f34878m = null;
        }
    }

    public final void L() {
        try {
            if (this.f34882q != null) {
                this.f34873h.setSpeechRecognizer(null);
                this.f34882q.destroy();
                this.f34882q = null;
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            Log.e(f34864w, e9.getMessage());
        }
    }

    public void P(String str) {
        if (this.f34874i.onQueryTextChange(str)) {
            this.f34883r &= -3;
        }
    }

    public void S(Drawable drawable) {
        this.f34880o = drawable;
        SearchBar searchBar = this.f34873h;
        if (searchBar != null) {
            searchBar.setBadgeDrawable(drawable);
        }
    }

    public void T(C c9) {
        if (c9 != this.f34877l) {
            this.f34877l = c9;
            androidx.leanback.app.b bVar = this.f34872g;
            if (bVar != null) {
                bVar.i0(c9);
            }
        }
    }

    public void W(Intent intent, boolean z9) {
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        Y(stringArrayListExtra.get(0), z9);
    }

    public final void X(String str) {
        this.f34873h.setSearchQuery(str);
    }

    public void Y(String str, boolean z9) {
        if (str == null) {
            return;
        }
        this.f34881p = new h(str, z9);
        x();
        if (this.f34884s) {
            this.f34884s = false;
            this.f34868c.removeCallbacks(this.f34871f);
        }
    }

    public void Z(i iVar) {
        if (this.f34874i != iVar) {
            this.f34874i = iVar;
            B();
        }
    }

    public void b0(String str) {
        this.f34879n = str;
        SearchBar searchBar = this.f34873h;
        if (searchBar != null) {
            searchBar.setTitle(str);
        }
    }

    public void c0() {
        if (this.f34885t) {
            this.f34886u = true;
        } else {
            this.f34873h.i();
        }
    }

    public void i0(String str) {
        D();
        i iVar = this.f34874i;
        if (iVar != null) {
            iVar.onQueryTextSubmit(str);
        }
    }

    public void j0() {
        androidx.leanback.app.b bVar;
        AbstractC1169y abstractC1169y = this.f34878m;
        if (abstractC1169y == null || abstractC1169y.i() <= 0 || (bVar = this.f34872g) == null || bVar.z() != this.f34878m) {
            this.f34873h.requestFocus();
        } else {
            A();
        }
    }

    public void k0() {
        AbstractC1169y abstractC1169y;
        androidx.leanback.app.b bVar;
        if (this.f34873h == null || (abstractC1169y = this.f34878m) == null) {
            return;
        }
        this.f34873h.setNextFocusDownId((abstractC1169y.i() == 0 || (bVar = this.f34872g) == null || bVar.E() == null) ? 0 : this.f34872g.E().getId());
    }

    public void l0() {
        AbstractC1169y abstractC1169y;
        androidx.leanback.app.b bVar = this.f34872g;
        this.f34873h.setVisibility(((bVar != null ? bVar.D() : -1) <= 0 || (abstractC1169y = this.f34878m) == null || abstractC1169y.i() == 0) ? 0 : 8);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        if (this.f34884s) {
            this.f34884s = bundle == null;
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(a7.g.f12874s3, viewGroup, false);
        SearchBar searchBar = (SearchBar) ((FrameLayout) viewInflate.findViewById(a7.f.f12093A6)).findViewById(a7.f.f12599z6);
        this.f34873h = searchBar;
        searchBar.setSearchBarListener(new f());
        this.f34873h.setSpeechRecognitionCallback(null);
        this.f34873h.setPermissionListener(this.f34887v);
        x();
        E(getArguments());
        Drawable drawable = this.f34880o;
        if (drawable != null) {
            S(drawable);
        }
        String str = this.f34879n;
        if (str != null) {
            b0(str);
        }
        if (getChildFragmentManager().g0(a7.f.f12589y6) == null) {
            this.f34872g = new androidx.leanback.app.b();
            getChildFragmentManager().m().q(a7.f.f12589y6, this.f34872g).i();
        } else {
            this.f34872g = (androidx.leanback.app.b) getChildFragmentManager().g0(a7.f.f12589y6);
        }
        this.f34872g.j0(new g());
        this.f34872g.i0(this.f34877l);
        this.f34872g.c0(true);
        if (this.f34874i != null) {
            B();
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        J();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        L();
        this.f34885t = true;
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        if (i9 == 0 && strArr.length > 0 && strArr[0].equals("android.permission.RECORD_AUDIO") && iArr[0] == 0) {
            c0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f34885t = false;
        if (this.f34882q == null) {
            SpeechRecognizer speechRecognizerCreateSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(getContext());
            this.f34882q = speechRecognizerCreateSpeechRecognizer;
            this.f34873h.setSpeechRecognizer(speechRecognizerCreateSpeechRecognizer);
        }
        if (!this.f34886u) {
            this.f34873h.j();
        } else {
            this.f34886u = false;
            this.f34873h.i();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        VerticalGridView verticalGridViewE = this.f34872g.E();
        int dimensionPixelSize = getResources().getDimensionPixelSize(a7.d.f11888m);
        verticalGridViewE.setItemAlignmentOffset(0);
        verticalGridViewE.setItemAlignmentOffsetPercent(-1.0f);
        verticalGridViewE.setWindowAlignmentOffset(dimensionPixelSize);
        verticalGridViewE.setWindowAlignmentOffsetPercent(-1.0f);
        verticalGridViewE.setWindowAlignment(0);
        verticalGridViewE.setFocusable(false);
        verticalGridViewE.setFocusableInTouchMode(false);
    }

    public final void x() {
        SearchBar searchBar;
        h hVar = this.f34881p;
        if (hVar == null || (searchBar = this.f34873h) == null) {
            return;
        }
        searchBar.setSearchQuery(hVar.f34895a);
        h hVar2 = this.f34881p;
        if (hVar2.f34896b) {
            i0(hVar2.f34895a);
        }
        this.f34881p = null;
    }

    public void z() {
        String str = this.f34875j;
        if (str == null || this.f34878m == null) {
            return;
        }
        this.f34875j = null;
        P(str);
    }
}
