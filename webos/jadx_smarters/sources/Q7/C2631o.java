package q7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: renamed from: q7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2631o extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f49091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f49092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PackageManager f49093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f49094g;

    /* JADX INFO: renamed from: q7.o$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f49095a;

        public a(int i9) {
            this.f49095a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2631o c2631o = C2631o.this;
            c2631o.f49094g.s0(view, ((ApplicationInfo) c2631o.f49092e.get(this.f49095a)).loadLabel(C2631o.this.f49093f).toString(), ((ApplicationInfo) C2631o.this.f49092e.get(this.f49095a)).packageName);
        }
    }

    /* JADX INFO: renamed from: q7.o$b */
    public interface b {
        void s0(View view, String str, String str2);
    }

    /* JADX INFO: renamed from: q7.o$c */
    public class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49097t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f49098u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f49099v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public LinearLayout f49100w;

        public c(View view) {
            super(view);
            this.f49097t = (TextView) view.findViewById(a7.f.Gk);
            this.f49098u = (TextView) view.findViewById(a7.f.Dh);
            this.f49099v = (ImageView) view.findViewById(a7.f.f12597z4);
            this.f49100w = (LinearLayout) view.findViewById(a7.f.g9);
        }
    }

    public C2631o(Context context, List list, b bVar) {
        this.f49091d = context;
        this.f49092e = list;
        this.f49093f = context.getPackageManager();
        this.f49094g = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void E(c cVar, int i9) {
        cVar.f49098u.setText(((ApplicationInfo) this.f49092e.get(i9)).loadLabel(this.f49093f));
        cVar.f49097t.setText(((ApplicationInfo) this.f49092e.get(i9)).packageName);
        cVar.f49099v.setImageDrawable(((ApplicationInfo) this.f49092e.get(i9)).loadIcon(this.f49093f));
        cVar.f49100w.setOnClickListener(new a(i9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public c L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (new C2858a(this.f49091d).A().equals(AbstractC2237a.f44453K0)) {
            layoutInflaterFrom = LayoutInflater.from(this.f49091d);
            i10 = a7.g.f12795f2;
        } else {
            layoutInflaterFrom = LayoutInflater.from(this.f49091d);
            i10 = a7.g.f12789e2;
        }
        return new c(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f49092e.size();
    }
}
