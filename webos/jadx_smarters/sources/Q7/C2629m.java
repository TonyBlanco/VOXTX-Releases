package q7;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.EPGSourcesModel;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.EPGSettingsActivity;
import java.util.ArrayList;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: renamed from: q7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2629m extends RecyclerView.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LiveStreamDBHandler f48694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f48695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f48696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f48697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2858a f48698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f48699i;

    /* JADX INFO: renamed from: q7.m$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f48700a;

        public a(int i9) {
            this.f48700a = i9;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2629m.this.f48695e instanceof EPGSettingsActivity) {
                ((EPGSettingsActivity) C2629m.this.f48695e).L1((EPGSourcesModel) C2629m.this.f48696f.get(this.f48700a));
            }
        }
    }

    /* JADX INFO: renamed from: q7.m$b */
    public static class b extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public LinearLayout f48702A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public TextView f48703B;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48704t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48705u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ImageView f48706v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public LinearLayout f48707w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public LinearLayout f48708x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public LinearLayout f48709y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public TextView f48710z;

        public b(View view) {
            super(view);
            this.f48704t = (TextView) view.findViewById(a7.f.Ml);
            this.f48705u = (TextView) view.findViewById(a7.f.Nl);
            this.f48706v = (ImageView) view.findViewById(a7.f.f12251Q4);
            this.f48707w = (LinearLayout) view.findViewById(a7.f.f12165H8);
            this.f48708x = (LinearLayout) view.findViewById(a7.f.Aa);
            this.f48709y = (LinearLayout) view.findViewById(a7.f.ia);
            this.f48710z = (TextView) view.findViewById(a7.f.Rl);
            this.f48702A = (LinearLayout) view.findViewById(a7.f.ka);
            this.f48703B = (TextView) view.findViewById(a7.f.Lj);
            J(false);
        }
    }

    public C2629m(Context context, ArrayList arrayList) {
        this.f48699i = "mobile";
        ArrayList arrayList2 = new ArrayList();
        this.f48696f = arrayList2;
        arrayList2.addAll(arrayList);
        this.f48695e = context;
        this.f48694d = new LiveStreamDBHandler(context);
        C2858a c2858a = new C2858a(context);
        this.f48698h = c2858a;
        if (c2858a.A().equals(AbstractC2237a.f44453K0)) {
            this.f48699i = "tv";
        } else {
            this.f48699i = "mobile";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void E(b bVar, int i9) {
        TextView textView;
        Resources resources;
        int i10;
        if (this.f48695e != null) {
            int idAuto = ((EPGSourcesModel) this.f48696f.get(i9)).getIdAuto();
            bVar.f48707w.setBackground(this.f48695e.getResources().getDrawable(a7.e.f12080y1));
            if (((EPGSourcesModel) this.f48696f.get(i9)).getDefault_source().equals("1")) {
                String name = ((EPGSourcesModel) this.f48696f.get(i9)).getName();
                if (((EPGSourcesModel) this.f48696f.get(i9)).getSource_type().equals("panel")) {
                    if (AbstractC2237a.f44538t.booleanValue()) {
                        bVar.f48704t.setText(name + " - " + this.f48695e.getResources().getString(a7.j.f13419w2) + " " + this.f48695e.getResources().getString(a7.j.f13004G0));
                    } else {
                        bVar.f48704t.setText(this.f48695e.getResources().getString(a7.j.f13419w2) + " " + this.f48695e.getResources().getString(a7.j.f13004G0));
                    }
                    bVar.f48705u.setVisibility(8);
                } else {
                    bVar.f48704t.setText(name + " " + this.f48695e.getResources().getString(a7.j.f13004G0));
                    bVar.f48705u.setVisibility(0);
                }
                bVar.f48706v.setVisibility(0);
                bVar.f48706v.setImageResource(a7.e.f12007g0);
                Context context = this.f48695e;
                if (context instanceof EPGSettingsActivity) {
                    ((EPGSettingsActivity) context).T1(name);
                }
            } else {
                String name2 = ((EPGSourcesModel) this.f48696f.get(i9)).getName();
                bVar.f48706v.setImageResource(a7.e.f11949P);
                bVar.f48706v.setVisibility(8);
                bVar.f48708x.setVisibility(8);
                bVar.f48709y.setVisibility(8);
                bVar.f48702A.setVisibility(8);
                bVar.f48703B.setVisibility(8);
                if (((EPGSourcesModel) this.f48696f.get(i9)).getSource_type().equals("panel")) {
                    if (AbstractC2237a.f44538t.booleanValue()) {
                        bVar.f48704t.setText(name2 + " - " + this.f48695e.getResources().getString(a7.j.f13419w2));
                    } else {
                        bVar.f48704t.setText(this.f48695e.getResources().getString(a7.j.f13419w2));
                    }
                    bVar.f48705u.setVisibility(8);
                } else {
                    bVar.f48704t.setText(name2);
                    bVar.f48705u.setVisibility(0);
                }
            }
            ImportStatusModel importStatusModel = this.f48694d.getdateDBStatus("epg", String.valueOf(idAuto));
            if (importStatusModel != null) {
                if (importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("3")) {
                    if (importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("1")) {
                        if ((importStatusModel.getStatus() != null && importStatusModel.getStatus().equals("0")) || importStatusModel.getStatus() == null || !importStatusModel.getStatus().equals("2")) {
                            bVar.f48708x.setVisibility(8);
                            bVar.f48709y.setVisibility(0);
                            textView = bVar.f48710z;
                            resources = this.f48695e.getResources();
                            i10 = a7.j.f13008G4;
                        }
                        textView.setText(resources.getString(i10));
                        bVar.f48710z.setTextColor(this.f48695e.getResources().getColor(a7.c.f11874y));
                        bVar.f48702A.setVisibility(0);
                        bVar.f48703B.setVisibility(8);
                    } else {
                        bVar.f48708x.setVisibility(8);
                        bVar.f48709y.setVisibility(0);
                        bVar.f48710z.setText(this.f48695e.getResources().getString(a7.j.f13258g1));
                        bVar.f48710z.setTextColor(this.f48695e.getResources().getColor(a7.c.f11866q));
                        long jCurrentTimeMillis = (importStatusModel.getTime() == null || importStatusModel.getTime().equals("")) ? 0L : System.currentTimeMillis() - Long.parseLong(importStatusModel.getTime());
                        bVar.f48703B.setText(this.f48695e.getResources().getString(a7.j.f13126S2) + " " + m7.w.R0(jCurrentTimeMillis));
                        bVar.f48703B.setVisibility(0);
                        bVar.f48702A.setVisibility(0);
                    }
                } else if (System.currentTimeMillis() - Long.parseLong(importStatusModel.getTime()) <= 600000) {
                    bVar.f48708x.setVisibility(0);
                    bVar.f48709y.setVisibility(8);
                    bVar.f48702A.setVisibility(0);
                    bVar.f48703B.setVisibility(8);
                }
                bVar.f48708x.setVisibility(8);
                bVar.f48709y.setVisibility(0);
                textView = bVar.f48710z;
                resources = this.f48695e.getResources();
                i10 = a7.j.f12984E0;
                textView.setText(resources.getString(i10));
                bVar.f48710z.setTextColor(this.f48695e.getResources().getColor(a7.c.f11874y));
                bVar.f48702A.setVisibility(0);
                bVar.f48703B.setVisibility(8);
            }
            bVar.f48705u.setText(((EPGSourcesModel) this.f48696f.get(i9)).getEpgurl());
            bVar.f48707w.setOnClickListener(new a(i9));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public b L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (this.f48699i.equals(AbstractC2237a.f44453K0)) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12629E2;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12623D2;
        }
        b bVar = new b(layoutInflaterFrom.inflate(i10, viewGroup, false));
        this.f48697g = bVar;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        return this.f48696f.size();
    }
}
