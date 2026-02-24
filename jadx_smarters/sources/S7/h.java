package s7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import java.util.ArrayList;
import q7.K;

/* JADX INFO: loaded from: classes4.dex */
public class h extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f50370a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f50371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f50372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TabLayout f50373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f50374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewPager f50375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f50376h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f50377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f50378j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Typeface f50379k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f50380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f50381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f50382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f50383o;

    public class a implements TabLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ K f50384a;

        public a(K k9) {
            this.f50384a = k9;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.g gVar) {
            h.this.f50375g.setCurrentItem(gVar.g());
            int iG = gVar.g();
            View viewE = gVar.e();
            if (iG == 0) {
                this.f50384a.r(viewE, h.this.f50379k, iG);
                return;
            }
            if (iG == 1 || iG == 2) {
                this.f50384a.t(viewE, h.this.f50379k, iG);
            } else {
                if (iG != 3) {
                    return;
                }
                this.f50384a.s(viewE, h.this.f50379k);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.g gVar) {
            int iG = gVar.g();
            View viewE = gVar.e();
            if (iG == 0) {
                this.f50384a.x(viewE, h.this.f50380l);
                return;
            }
            if (iG == 1 || iG == 2) {
                this.f50384a.w(viewE, h.this.f50380l);
            } else {
                if (iG != 3) {
                    return;
                }
                this.f50384a.y(viewE, h.this.f50380l);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.g gVar) {
        }
    }

    public interface b {
    }

    private void z() {
        this.f50377i = getContext();
        getActivity().getSharedPreferences("loginPrefs", 0);
        A();
    }

    public final void A() {
        TabLayout tabLayout;
        TabLayout.g gVarZ;
        Resources resources;
        int i9;
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.f50377i);
        if (currentAPPType.equals("m3u")) {
            tabLayout = this.f50373e;
            gVarZ = tabLayout.z();
            resources = this.f50377i.getResources();
            i9 = a7.j.f13426x;
        } else {
            TabLayout tabLayout2 = this.f50373e;
            tabLayout2.e(tabLayout2.z().o(getResources().getString(a7.j.f13267h0)));
            TabLayout tabLayout3 = this.f50373e;
            tabLayout3.e(tabLayout3.z().o(getResources().getString(a7.j.f13445y8)));
            TabLayout tabLayout4 = this.f50373e;
            tabLayout4.e(tabLayout4.z().o(getResources().getString(a7.j.f13090O6)));
            tabLayout = this.f50373e;
            gVarZ = tabLayout.z();
            resources = getResources();
            i9 = a7.j.f13109Q5;
        }
        tabLayout.e(gVarZ.o(resources.getString(i9)));
        TabLayout tabLayout5 = this.f50373e;
        tabLayout5.e(tabLayout5.z().o(getResources().getString(a7.j.f13325m8)));
        this.f50373e.setTabGravity(0);
        K k9 = new K(getChildFragmentManager(), this.f50373e.getTabCount(), getContext(), this.f50378j, currentAPPType);
        this.f50375g.setAdapter(k9);
        this.f50373e.setupWithViewPager(this.f50375g);
        for (int i10 = 0; i10 < this.f50373e.getTabCount(); i10++) {
            this.f50373e.w(i10).m(k9.q(i10));
        }
        View viewE = this.f50373e.w(0).e();
        View viewE2 = this.f50373e.w(1).e();
        k9.u(viewE, this.f50379k);
        k9.v(viewE2, this.f50379k);
        this.f50375g.setCurrentItem(0);
        this.f50375g.c(new TabLayout.h(this.f50373e));
        this.f50373e.d(new a(k9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.f50383o = (b) context;
            return;
        }
        throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f50381m = getArguments().getString("param1");
            this.f50382n = getArguments().getString("param2");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(a7.g.f12719T2, viewGroup, false);
        this.f50370a = (ImageView) viewInflate.findViewById(a7.f.f12497p5);
        this.f50371c = (TextView) viewInflate.findViewById(a7.f.mk);
        this.f50372d = viewInflate.findViewById(a7.f.Nm);
        this.f50373e = (TabLayout) viewInflate.findViewById(a7.f.Pg);
        this.f50374f = viewInflate.findViewById(a7.f.f12123D6);
        this.f50375g = (ViewPager) viewInflate.findViewById(a7.f.Wb);
        this.f50376h = (RelativeLayout) viewInflate.findViewById(a7.f.Ke);
        z();
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f50383o = null;
    }
}
