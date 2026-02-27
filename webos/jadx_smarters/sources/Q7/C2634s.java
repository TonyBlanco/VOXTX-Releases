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
import com.nst.iptvsmarterstvbox.model.StalkerLiveFavIdsSingleton;
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.LiveAllDataSingleActivity;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: renamed from: q7.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2634s extends RecyclerView.g implements Filterable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f49203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f49204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DatabaseHandler f49205h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f49207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f49208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LiveStreamDBHandler f49209l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f49206i = new b(this, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f49201d = VodAllCategoriesSingleton.getInstance().getLiveCategoriesList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f49202e = VodAllCategoriesSingleton.getInstance().getLiveCategoriesList();

    /* JADX INFO: renamed from: q7.s$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f49210a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f49211c;

        public a(int i9, f fVar) {
            this.f49210a = i9;
            this.f49211c = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((LiveAllDataSingleActivity) C2634s.this.f49204g).n2();
            C2634s c2634s = C2634s.this;
            c2634s.f49203f = ((LiveStreamCategoryIdDBModel) c2634s.f49202e.get(this.f49210a)).getLiveStreamCategoryID();
            this.f49211c.f49224v.setBackground(C2634s.this.f49204g.getResources().getDrawable(a7.c.f11867r));
            if (C2634s.this.f49204g instanceof LiveAllDataSingleActivity) {
                AsyncTask asyncTask = m7.w.f44702o;
                if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    m7.w.f44702o.cancel(true);
                }
                ((LiveAllDataSingleActivity) C2634s.this.f49204g).h2(((LiveStreamCategoryIdDBModel) C2634s.this.f49202e.get(this.f49210a)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) C2634s.this.f49202e.get(this.f49210a)).getLiveStreamCategoryName());
            }
            C2634s.this.w();
        }
    }

    /* JADX INFO: renamed from: q7.s$b */
    public class b extends Filter {
        public b() {
        }

        public /* synthetic */ b(C2634s c2634s, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = C2634s.this.f49201d;
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
                C2634s.this.f49202e = (ArrayList) filterResults.values;
                C2634s.this.w();
                if (C2634s.this.f49202e == null || C2634s.this.f49202e.size() != 0) {
                    ((LiveAllDataSingleActivity) C2634s.this.f49204g).W1();
                } else {
                    ((LiveAllDataSingleActivity) C2634s.this.f49204g).i2();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.s$c */
    public class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f49214a;

        public c(f fVar) {
            this.f49214a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            int favouriteCount;
            if (SharepreferenceDBHandler.getCurrentAPPType(C2634s.this.f49204g).equals("m3u")) {
                favouriteCount = C2634s.this.f49209l.getFavouriteCountM3U("live");
            } else if (SharepreferenceDBHandler.getCurrentAPPType(C2634s.this.f49204g).equals("stalker_api")) {
                List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
                favouriteCount = (favIdsList == null || favIdsList.size() <= 0) ? 0 : favIdsList.size();
            } else {
                favouriteCount = C2634s.this.f49208k.equals("true") ? C2634s.this.f49205h.getFavouriteCount("radio_streams", SharepreferenceDBHandler.getUserID(C2634s.this.f49204g)) : C2634s.this.f49205h.getFavouriteCount("live", SharepreferenceDBHandler.getUserID(C2634s.this.f49204g));
            }
            return Integer.valueOf(favouriteCount);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f49214a.f49223u.setText("0");
            } else {
                this.f49214a.f49223u.setText(String.valueOf(num));
            }
            this.f49214a.f49223u.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f49214a.f49223u.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q7.s$d */
    public class d extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f49216a;

        public d(f fVar) {
            this.f49216a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            try {
                return C2634s.this.f49208k.equals("true") ? Integer.valueOf(C2634s.this.f49209l.liveRecentlyWatchedCount("radio_streams")) : Integer.valueOf(C2634s.this.f49209l.liveRecentlyWatchedCount("live"));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f49216a.f49223u.setText("0");
            } else {
                this.f49216a.f49223u.setText(String.valueOf(num));
            }
            this.f49216a.f49223u.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f49216a.f49223u.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: q7.s$e */
    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f49218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f49219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f49220c;

        public e(View view, f fVar, int i9) {
            this.f49218a = view;
            this.f49219b = fVar;
            this.f49220c = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            f fVar;
            TextView textView;
            if (!z9 || (fVar = this.f49219b) == null || (textView = fVar.f49222t) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    /* JADX INFO: renamed from: q7.s$f */
    public static class f extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f49222t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f49223u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f49224v;

        public f(View view) {
            super(view);
            this.f49222t = (TextView) view.findViewById(a7.f.Yh);
            this.f49223u = (TextView) view.findViewById(a7.f.Xh);
            this.f49224v = (RelativeLayout) view.findViewById(a7.f.nf);
        }
    }

    public C2634s(Context context, String str, String str2) {
        this.f49207j = "mobile";
        this.f49208k = "false";
        this.f49204g = context;
        this.f49205h = new DatabaseHandler(context);
        this.f49209l = new LiveStreamDBHandler(context);
        this.f49203f = str2;
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f49207j = "tv";
        } else {
            this.f49207j = "mobile";
        }
        this.f49208k = str;
    }

    public void A0(String str) {
        this.f49203f = str;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f49206i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList = this.f49202e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void E(f fVar, int i9) {
        RelativeLayout relativeLayout;
        Drawable drawableF;
        try {
            fVar.f49222t.setText(((LiveStreamCategoryIdDBModel) this.f49202e.get(i9)).getLiveStreamCategoryName());
            if (((LiveStreamCategoryIdDBModel) this.f49202e.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-1")) {
                x0(fVar);
            } else if (((LiveStreamCategoryIdDBModel) this.f49202e.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-6")) {
                z0(fVar);
            } else {
                fVar.f49223u.setVisibility(0);
                fVar.f49223u.setText(String.valueOf(((LiveStreamCategoryIdDBModel) this.f49202e.get(i9)).getLiveStreamCounter()));
            }
            fVar.f49224v.setOnClickListener(new a(i9, fVar));
            if (!this.f49203f.equals(((LiveStreamCategoryIdDBModel) this.f49202e.get(i9)).getLiveStreamCategoryID())) {
                relativeLayout = fVar.f49224v;
                drawableF = F.h.f(this.f49204g.getResources(), a7.e.f11974X0, this.f49204g.getTheme());
            } else {
                if (!((LiveAllDataSingleActivity) this.f49204g).I1()) {
                    fVar.f49224v.setBackground(this.f49204g.getResources().getDrawable(a7.c.f11867r));
                    if (!((LiveAllDataSingleActivity) this.f49204g).d2()) {
                        fVar.f49224v.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = fVar.f49224v;
                    relativeLayout2.setOnFocusChangeListener(new e(relativeLayout2, fVar, i9));
                }
                relativeLayout = fVar.f49224v;
                drawableF = this.f49204g.getResources().getDrawable(a7.c.f11867r);
            }
            relativeLayout.setBackground(drawableF);
            RelativeLayout relativeLayout22 = fVar.f49224v;
            relativeLayout22.setOnFocusChangeListener(new e(relativeLayout22, fVar, i9));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public f L(ViewGroup viewGroup, int i9) {
        return new f(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12905x4, viewGroup, false));
    }

    public final void x0(f fVar) {
        new c(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    public final void z0(f fVar) {
        new d(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }
}
