package k7;

import a7.g;
import a7.j;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import k7.b;
import l7.AbstractC2203b;
import n4.C2284p;
import o4.C2325b;
import o4.C2328e;
import p4.C2434i;

/* JADX INFO: loaded from: classes.dex */
public class c extends Fragment implements b.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i7.b f43654a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f43655c;

    public class a implements b.d {
        public a() {
        }

        @Override // k7.b.d
        public void a(View view) {
            int id = view.getId();
            if (id == a7.f.f12463m2) {
                Log.d("QueueListViewFragment", "onItemViewClicked() container " + view.getTag(j.f13089O5));
                c.this.D(view);
                return;
            }
            if (id == a7.f.xc) {
                Log.d("QueueListViewFragment", "onItemViewClicked() play-pause " + view.getTag(j.f13089O5));
                c.this.E(view);
                return;
            }
            if (id == a7.f.yc) {
                c.this.f43654a.v(view, (C2284p) view.getTag(j.f13089O5));
            } else if (id == a7.f.Dg) {
                c.this.f43654a.w(view, (C2284p) view.getTag(j.f13089O5));
            }
        }
    }

    private C2434i B() {
        C2328e c2328eC = C2325b.e(getContext()).c().c();
        if (c2328eC == null || !c2328eC.c()) {
            return null;
        }
        return c2328eC.r();
    }

    public final void D(View view) {
        C2434i c2434iB = B();
        if (c2434iB == null) {
            return;
        }
        C2284p c2284p = (C2284p) view.getTag(j.f13089O5);
        if (this.f43654a.t()) {
            Log.d("QueueListViewFragment", "Is detached: itemId = " + c2284p.K());
            c2434iB.H(AbstractC2203b.a(this.f43654a.p()), this.f43654a.q(c2284p.K()), 0, null);
            return;
        }
        if (this.f43654a.m() != c2284p.K()) {
            c2434iB.F(c2284p.K(), null);
        } else if (C2325b.e(getContext().getApplicationContext()).c().c() != null) {
            startActivity(new Intent(getActivity(), (Class<?>) ExpandedControlsActivity.class));
        }
    }

    public final void E(View view) {
        C2434i c2434iB = B();
        if (c2434iB != null) {
            c2434iB.W();
        }
    }

    @Override // k7.b.f
    public void k(RecyclerView.D d9) {
        this.f43655c.H(d9);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(g.f12725U2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) getView().findViewById(a7.f.Dd);
        this.f43654a = i7.b.n(getContext());
        b bVar = new b(getActivity(), this);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(bVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        f fVar = new f(new C2151a(bVar));
        this.f43655c = fVar;
        fVar.m(recyclerView);
        bVar.r0(new a());
    }
}
