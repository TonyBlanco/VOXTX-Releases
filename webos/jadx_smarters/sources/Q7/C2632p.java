package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: q7.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2632p extends AbstractC2621e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f49102g;

    /* JADX INFO: renamed from: q7.p$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f49103a;

        public a(c cVar) {
            this.f49103a = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2632p.this.f49102g != null) {
                C2632p.this.f49102g.a((e7.c) C2632p.this.f48276e.get(this.f49103a.m()));
            }
        }
    }

    /* JADX INFO: renamed from: q7.p$b */
    public interface b {
        void a(e7.c cVar);
    }

    /* JADX INFO: renamed from: q7.p$c */
    public class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49105t;

        public c(View view) {
            super(view);
            this.f49105t = (TextView) view.findViewById(a7.f.uj);
        }
    }

    public C2632p(Context context, ArrayList arrayList) {
        super(context, arrayList);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void E(c cVar, int i9) {
        cVar.f49105t.setText(((e7.c) this.f48276e.get(i9)).c());
        cVar.f16733a.setOnClickListener(new a(cVar));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48276e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public c L(ViewGroup viewGroup, int i9) {
        return new c(LayoutInflater.from(this.f48275d).inflate(a7.g.f12771b5, viewGroup, false));
    }

    public void p0(b bVar) {
        this.f49102g = bVar;
    }
}
