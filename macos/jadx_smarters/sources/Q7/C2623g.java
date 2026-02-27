package q7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.pojo.BillingDeviceInfo;
import com.nst.iptvsmarterstvbox.view.activity.APPInPurchaseActivity;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: renamed from: q7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2623g extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f48330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48333g;

    /* JADX INFO: renamed from: q7.g$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48334a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f48335c;

        public a(int i9, c cVar) {
            this.f48334a = i9;
            this.f48335c = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2623g.this.f48333g = this.f48334a;
            ((APPInPurchaseActivity) C2623g.this.f48331e).F(((BillingDeviceInfo) C2623g.this.f48330d.get(this.f48334a)).getDevicename(), ((BillingDeviceInfo) C2623g.this.f48330d.get(this.f48334a)).getMac());
            C2623g.this.w();
            this.f48335c.f48343v.setImageResource(a7.e.f12007g0);
        }
    }

    /* JADX INFO: renamed from: q7.g$b */
    public class b implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f48338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48339c;

        public b(View view, c cVar, int i9) {
            this.f48337a = view;
            this.f48338b = cVar;
            this.f48339c = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
        }
    }

    /* JADX INFO: renamed from: q7.g$c */
    public static class c extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48341t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public RelativeLayout f48342u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f48343v;

        public c(View view) {
            super(view);
            this.f48341t = (TextView) view.findViewById(a7.f.Yh);
            this.f48342u = (RelativeLayout) view.findViewById(a7.f.nf);
            this.f48343v = (ImageView) view.findViewById(a7.f.f12251Q4);
        }
    }

    public C2623g(Context context, List list) {
        this.f48332f = "mobile";
        this.f48331e = context;
        ArrayList arrayList = new ArrayList();
        this.f48330d = arrayList;
        arrayList.addAll(list);
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f48332f = "tv";
        } else {
            this.f48332f = "mobile";
        }
        this.f48333g = -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void E(c cVar, int i9) {
        try {
            cVar.f48341t.setText(((BillingDeviceInfo) this.f48330d.get(i9)).getDevicename());
            if (this.f48333g == i9) {
                cVar.f48343v.setImageResource(a7.e.f12007g0);
                cVar.f48342u.requestFocus();
            } else {
                cVar.f48343v.setImageResource(a7.e.f11952Q);
            }
            RelativeLayout relativeLayout = cVar.f48342u;
            relativeLayout.setOnFocusChangeListener(new b(relativeLayout, cVar, i9));
            cVar.f48342u.setOnClickListener(new a(i9, cVar));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        List list = this.f48330d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public c L(ViewGroup viewGroup, int i9) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12880t3, viewGroup, false));
    }
}
