package com.nst.iptvsmarterstvbox.view.demo;

import O2.InterfaceC0920t1;
import O2.V1;
import Z3.x;
import Z3.z;
import a4.AbstractC1104s;
import a4.AbstractC1106u;
import a4.AbstractC1108w;
import a7.f;
import a7.g;
import a7.j;
import a7.k;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.r;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.material.tabs.TabLayout;
import d.DialogC1642u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s5.AbstractC2743y;
import s5.c0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b extends DialogInterfaceOnCancelListenerC1144d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC2743y f34823g = AbstractC2743y.D(2, 1, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f34824a = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f34825c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f34826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DialogInterface.OnClickListener f34827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DialogInterface.OnDismissListener f34828f;

    public final class a extends r {
        public a(m mVar) {
            super(mVar, 1);
        }

        @Override // N0.a
        public int c() {
            return b.this.f34825c.size();
        }

        @Override // N0.a
        public CharSequence e(int i9) {
            return b.X(b.this.getResources(), ((Integer) b.this.f34825c.get(i9)).intValue());
        }

        @Override // androidx.fragment.app.r
        public Fragment p(int i9) {
            return (Fragment) b.this.f34824a.get(((Integer) b.this.f34825c.get(i9)).intValue());
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.demo.b$b, reason: collision with other inner class name */
    public interface InterfaceC0285b {
        void b(z zVar);
    }

    public static final class c extends Fragment implements TrackSelectionView.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f34830a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f34831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f34832d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f34833e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map f34834f;

        public c() {
            setRetainInstance(true);
        }

        @Override // com.google.android.exoplayer2.ui.TrackSelectionView.d
        public void l(boolean z9, Map map) {
            this.f34833e = z9;
            this.f34834f = map;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View viewInflate = layoutInflater.inflate(AbstractC1106u.f11710i, viewGroup, false);
            TrackSelectionView trackSelectionView = (TrackSelectionView) viewInflate.findViewById(AbstractC1104s.f11671U);
            trackSelectionView.setShowDisableOption(true);
            trackSelectionView.setAllowMultipleOverrides(this.f34832d);
            trackSelectionView.setAllowAdaptiveSelections(this.f34831c);
            trackSelectionView.d(this.f34830a, this.f34833e, this.f34834f, null, this);
            return viewInflate;
        }

        public void x(List list, boolean z9, Map map, boolean z10, boolean z11) {
            this.f34830a = list;
            this.f34833e = z9;
            this.f34831c = z10;
            this.f34832d = z11;
            this.f34834f = new HashMap(TrackSelectionView.c(map, list, z11));
        }
    }

    public b() {
        setRetainInstance(true);
    }

    public static b P(final InterfaceC0920t1 interfaceC0920t1, DialogInterface.OnDismissListener onDismissListener) {
        return S(j.f13177X7, interfaceC0920t1.p(), interfaceC0920t1.y(), true, false, new InterfaceC0285b() { // from class: r7.x
            @Override // com.nst.iptvsmarterstvbox.view.demo.b.InterfaceC0285b
            public final void b(z zVar) {
                interfaceC0920t1.i(zVar);
            }
        }, onDismissListener);
    }

    public static b S(int i9, V1 v12, final z zVar, boolean z9, boolean z10, final InterfaceC0285b interfaceC0285b, DialogInterface.OnDismissListener onDismissListener) {
        final b bVar = new b();
        bVar.Y(v12, zVar, i9, z9, z10, new DialogInterface.OnClickListener() { // from class: r7.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.nst.iptvsmarterstvbox.view.demo.b.Z(zVar, bVar, interfaceC0285b, dialogInterface, i10);
            }
        }, onDismissListener);
        return bVar;
    }

    public static String X(Resources resources, int i9) {
        int i10;
        if (i9 == 1) {
            i10 = AbstractC1108w.f11743y;
        } else if (i9 == 2) {
            i10 = AbstractC1108w.f11713A;
        } else {
            if (i9 != 3) {
                throw new IllegalArgumentException();
            }
            i10 = AbstractC1108w.f11744z;
        }
        return resources.getString(i10);
    }

    public static /* synthetic */ void Z(z zVar, b bVar, InterfaceC0285b interfaceC0285b, DialogInterface dialogInterface, int i9) {
        z.a aVarB = zVar.B();
        int i10 = 0;
        while (true) {
            AbstractC2743y abstractC2743y = f34823g;
            if (i10 >= abstractC2743y.size()) {
                interfaceC0285b.b(aVarB.B());
                return;
            }
            int iIntValue = ((Integer) abstractC2743y.get(i10)).intValue();
            aVarB.L(iIntValue, bVar.T(iIntValue));
            aVarB.C(iIntValue);
            Iterator it = bVar.W(iIntValue).values().iterator();
            while (it.hasNext()) {
                aVarB.A((x) it.next());
            }
            i10++;
        }
    }

    public static boolean b0(InterfaceC0920t1 interfaceC0920t1) {
        return c0(interfaceC0920t1.p());
    }

    public static boolean c0(V1 v12) {
        c0 it = v12.c().iterator();
        while (it.hasNext()) {
            if (f34823g.contains(Integer.valueOf(((V1.a) it.next()).e()))) {
                return true;
            }
        }
        return false;
    }

    public boolean T(int i9) {
        c cVar = (c) this.f34824a.get(i9);
        return cVar != null && cVar.f34833e;
    }

    public Map W(int i9) {
        c cVar = (c) this.f34824a.get(i9);
        return cVar == null ? Collections.emptyMap() : cVar.f34834f;
    }

    public final void Y(V1 v12, z zVar, int i9, boolean z9, boolean z10, DialogInterface.OnClickListener onClickListener, DialogInterface.OnDismissListener onDismissListener) {
        this.f34826d = i9;
        this.f34827e = onClickListener;
        this.f34828f = onDismissListener;
        int i10 = 0;
        while (true) {
            AbstractC2743y abstractC2743y = f34823g;
            if (i10 >= abstractC2743y.size()) {
                return;
            }
            Integer num = (Integer) abstractC2743y.get(i10);
            int iIntValue = num.intValue();
            ArrayList arrayList = new ArrayList();
            c0 it = v12.c().iterator();
            while (it.hasNext()) {
                V1.a aVar = (V1.a) it.next();
                if (aVar.e() == iIntValue) {
                    arrayList.add(aVar);
                }
            }
            if (!arrayList.isEmpty()) {
                c cVar = new c();
                cVar.x(arrayList, zVar.f11297A.contains(num), zVar.f11322z, z9, z10);
                this.f34824a.put(iIntValue, cVar);
                this.f34825c.add(num);
            }
            i10++;
        }
    }

    public final /* synthetic */ void lambda$onCreateView$1(View view) {
        dismiss();
    }

    public final /* synthetic */ void lambda$onCreateView$2(View view) {
        this.f34827e.onClick(getDialog(), -1);
        dismiss();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public Dialog onCreateDialog(Bundle bundle) {
        DialogC1642u dialogC1642u = new DialogC1642u(getActivity(), k.f13465j);
        dialogC1642u.setTitle(this.f34826d);
        return dialogC1642u;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(g.f12679M4, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(f.nh);
        ViewPager viewPager = (ViewPager) viewInflate.findViewById(f.oh);
        Button button = (Button) viewInflate.findViewById(f.lh);
        Button button2 = (Button) viewInflate.findViewById(f.mh);
        viewPager.setAdapter(new a(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setVisibility(this.f34824a.size() <= 1 ? 8 : 0);
        button.setOnClickListener(new View.OnClickListener() { // from class: r7.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49792a.lambda$onCreateView$1(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: r7.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49793a.lambda$onCreateView$2(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f34828f.onDismiss(dialogInterface);
    }
}
