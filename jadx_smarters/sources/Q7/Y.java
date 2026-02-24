package q7;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.SeriesAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SeriesRecentWatchDatabase;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SeriesAllDataSingleActivity;
import java.util.ArrayList;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class Y extends RecyclerView.g implements Filterable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f47772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f47773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DatabaseHandler f47774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SeriesRecentWatchDatabase f47775i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LiveStreamDBHandler f47778l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f47776j = new b(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f47770d = SeriesAllCategoriesSingleton.getInstance().getSeriesCategoriesList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f47771e = SeriesAllCategoriesSingleton.getInstance().getSeriesCategoriesList();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47779a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f47780c;

        public a(int i9, e eVar) {
            this.f47779a = i9;
            this.f47780c = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((SeriesAllDataSingleActivity) Y.this.f47773g).x2();
            Y y9 = Y.this;
            y9.f47772f = ((LiveStreamCategoryIdDBModel) y9.f47771e.get(this.f47779a)).getLiveStreamCategoryID();
            this.f47780c.f47791v.setBackground(Y.this.f47773g.getResources().getDrawable(a7.c.f11867r));
            if (Y.this.f47773g instanceof SeriesAllDataSingleActivity) {
                AsyncTask asyncTask = m7.w.f44700m;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    m7.w.f44700m.cancel(true);
                }
                ((SeriesAllDataSingleActivity) Y.this.f47773g).r2(((LiveStreamCategoryIdDBModel) Y.this.f47771e.get(this.f47779a)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) Y.this.f47771e.get(this.f47779a)).getLiveStreamCategoryName());
            }
            Y.this.w();
            if (SharepreferenceDBHandler.getCurrentAPPType(Y.this.f47773g).equals("stalker_api")) {
                this.f47780c.f47790u.setVisibility(8);
                AbstractC2237a.f44457M0 = "-1";
            }
        }
    }

    public class b extends Filter {
        public b() {
        }

        public /* synthetic */ b(Y y9, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = Y.this.f47770d;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i9 = 0; i9 < size; i9++) {
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = (LiveStreamCategoryIdDBModel) arrayList.get(i9);
                if (liveStreamCategoryIdDBModel.getLiveStreamCategoryName().toLowerCase().contains(lowerCase) || liveStreamCategoryIdDBModel.getLiveStreamCategoryName().contains(lowerCase)) {
                    arrayList2.add(liveStreamCategoryIdDBModel);
                }
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            try {
                Y.this.f47771e = (ArrayList) filterResults.values;
                Y.this.w();
                if (Y.this.f47771e == null || Y.this.f47771e.size() != 0) {
                    ((SeriesAllDataSingleActivity) Y.this.f47773g).e2();
                } else {
                    ((SeriesAllDataSingleActivity) Y.this.f47773g).s2();
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f47784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47785c;

        public c(View view, e eVar, int i9) {
            this.f47783a = view;
            this.f47784b = eVar;
            this.f47785c = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            e eVar;
            TextView textView;
            if (!z9 || (eVar = this.f47784b) == null || (textView = eVar.f47789t) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    public class d extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f47787a;

        public d(e eVar) {
            this.f47787a = eVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(e... eVarArr) {
            try {
                return SharepreferenceDBHandler.getCurrentAPPType(Y.this.f47773g).equals("m3u") ? Integer.valueOf(Y.this.f47778l.getFavouriteCountM3U("series")) : Integer.valueOf(Y.this.f47774h.getFavouriteCount("series", SharepreferenceDBHandler.getUserID(Y.this.f47773g)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f47787a.f47790u.setText("0");
            } else {
                this.f47787a.f47790u.setText(String.valueOf(num));
            }
            this.f47787a.f47790u.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f47787a.f47790u.setVisibility(8);
        }
    }

    public static class e extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47789t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f47790u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f47791v;

        public e(View view) {
            super(view);
            this.f47789t = (TextView) view.findViewById(a7.f.Yh);
            this.f47790u = (TextView) view.findViewById(a7.f.Xh);
            this.f47791v = (RelativeLayout) view.findViewById(a7.f.nf);
        }
    }

    public Y(Context context, String str) {
        this.f47777k = "mobile";
        this.f47773g = context;
        this.f47774h = new DatabaseHandler(context);
        this.f47778l = new LiveStreamDBHandler(context);
        this.f47775i = new SeriesRecentWatchDatabase(context);
        this.f47772f = str;
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f47777k = "tv";
        } else {
            this.f47777k = "mobile";
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f47776j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList = this.f47771e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void E(e eVar, int i9) {
        String strValueOf;
        TextView textView;
        RelativeLayout relativeLayout;
        Drawable drawableF;
        try {
            eVar.f47789t.setText(((LiveStreamCategoryIdDBModel) this.f47771e.get(i9)).getLiveStreamCategoryName());
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f47773g).equals("stalker_api")) {
                eVar.f47790u.setVisibility(8);
            } else if (((LiveStreamCategoryIdDBModel) this.f47771e.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-1")) {
                t0(eVar);
            } else if (((LiveStreamCategoryIdDBModel) this.f47771e.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-4")) {
                int seriesRecentwatchmCount = this.f47775i.getSeriesRecentwatchmCount();
                if (seriesRecentwatchmCount == 0 || seriesRecentwatchmCount == -1) {
                    eVar.f47790u.setText("0");
                } else {
                    textView = eVar.f47790u;
                    strValueOf = String.valueOf(seriesRecentwatchmCount);
                    textView.setText(strValueOf);
                }
            } else if (this.f47771e.get(i9) != null) {
                strValueOf = String.valueOf(((LiveStreamCategoryIdDBModel) this.f47771e.get(i9)).getLiveStreamCounter());
                textView = eVar.f47790u;
                textView.setText(strValueOf);
            }
            eVar.f47791v.setOnClickListener(new a(i9, eVar));
            if (this.f47772f.equals(((LiveStreamCategoryIdDBModel) this.f47771e.get(i9)).getLiveStreamCategoryID())) {
                if (!AbstractC2237a.f44457M0.equals("-1")) {
                    eVar.f47790u.setVisibility(0);
                    eVar.f47790u.setText(AbstractC2237a.f44457M0);
                }
                if (!((SeriesAllDataSingleActivity) this.f47773g).R1()) {
                    eVar.f47791v.setBackground(this.f47773g.getResources().getDrawable(a7.c.f11867r));
                    if (!((SeriesAllDataSingleActivity) this.f47773g).n2()) {
                        eVar.f47791v.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = eVar.f47791v;
                    relativeLayout2.setOnFocusChangeListener(new c(relativeLayout2, eVar, i9));
                }
                relativeLayout = eVar.f47791v;
                drawableF = this.f47773g.getResources().getDrawable(a7.c.f11867r);
            } else {
                relativeLayout = eVar.f47791v;
                drawableF = F.h.f(this.f47773g.getResources(), a7.e.f11974X0, this.f47773g.getTheme());
            }
            relativeLayout.setBackground(drawableF);
            RelativeLayout relativeLayout22 = eVar.f47791v;
            relativeLayout22.setOnFocusChangeListener(new c(relativeLayout22, eVar, i9));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public e L(ViewGroup viewGroup, int i9) {
        return new e(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12905x4, viewGroup, false));
    }

    public final void t0(e eVar) {
        new d(eVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, eVar);
    }

    public void x0(String str) {
        this.f47772f = str;
    }
}
