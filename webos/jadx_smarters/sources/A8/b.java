package a8;

import V7.c;
import V7.d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.AbstractC1617D;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f13480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f13481e;

    public class a extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final View f13482t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final TextView f13483u;

        public a(View view) {
            super(view);
            this.f13482t = view;
            this.f13483u = (TextView) view.findViewById(c.f10146m);
        }
    }

    public b(Context context, List list) {
        this.f13480d = context;
        this.f13481e = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void E(a aVar, int i9) {
        View view = aVar.f13482t;
        AbstractC1617D.a(this.f13481e.get(i9));
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public a L(ViewGroup viewGroup, int i9) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(d.f10152b, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f13481e.size();
    }
}
