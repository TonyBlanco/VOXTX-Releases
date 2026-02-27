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
import com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyActivity;
import com.nst.iptvsmarterstvbox.view.demo.NSTEXOPlayerSkyTvActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.activities.NSTIJKPlayerSkyTvActivity;
import java.util.ArrayList;
import java.util.List;
import m7.AbstractC2237a;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class N extends RecyclerView.g implements Filterable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f47298e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f47300g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f47301h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DatabaseHandler f47302i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f47304k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f47306m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f47307n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LiveStreamDBHandler f47308o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C2858a f47309p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f47303j = new b(this, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f47305l = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f47297d = VodAllCategoriesSingleton.getInstance().getLiveCategoriesList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f47299f = VodAllCategoriesSingleton.getInstance().getLiveCategoriesList();

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f47310a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f47311c;

        public a(int i9, f fVar) {
            this.f47310a = i9;
            this.f47311c = fVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            N n9 = N.this;
            n9.f47300g = ((LiveStreamCategoryIdDBModel) n9.f47299f.get(this.f47310a)).getLiveStreamCategoryID();
            this.f47311c.f47324v.setBackground(N.this.f47301h.getResources().getDrawable(a7.c.f11867r));
            if (N.this.f47304k.equals("mobile")) {
                if (N.this.f47301h instanceof NSTIJKPlayerSkyActivity) {
                    AsyncTask asyncTask = m7.w.f44702o;
                    if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        m7.w.f44702o.cancel(true);
                    }
                    ((NSTIJKPlayerSkyActivity) N.this.f47301h).C3(((LiveStreamCategoryIdDBModel) N.this.f47299f.get(this.f47310a)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) N.this.f47299f.get(this.f47310a)).getLiveStreamCategoryName());
                } else if (N.this.f47301h instanceof NSTEXOPlayerSkyActivity) {
                    AsyncTask asyncTask2 = m7.w.f44702o;
                    if (asyncTask2 != null && asyncTask2.getStatus().equals(AsyncTask.Status.RUNNING)) {
                        m7.w.f44702o.cancel(true);
                    }
                    ((NSTEXOPlayerSkyActivity) N.this.f47301h).e4(((LiveStreamCategoryIdDBModel) N.this.f47299f.get(this.f47310a)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) N.this.f47299f.get(this.f47310a)).getLiveStreamCategoryName());
                }
            } else if (N.this.f47301h instanceof NSTIJKPlayerSkyTvActivity) {
                AsyncTask asyncTask3 = m7.w.f44702o;
                if (asyncTask3 != null && asyncTask3.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    m7.w.f44702o.cancel(true);
                }
                ((NSTIJKPlayerSkyTvActivity) N.this.f47301h).V3(((LiveStreamCategoryIdDBModel) N.this.f47299f.get(this.f47310a)).getLiveStreamCategoryID());
            } else if (N.this.f47301h instanceof NSTEXOPlayerSkyTvActivity) {
                AsyncTask asyncTask4 = m7.w.f44702o;
                if (asyncTask4 != null && asyncTask4.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    m7.w.f44702o.cancel(true);
                }
                ((NSTEXOPlayerSkyTvActivity) N.this.f47301h).b4(((LiveStreamCategoryIdDBModel) N.this.f47299f.get(this.f47310a)).getLiveStreamCategoryID());
            }
            N.this.w();
        }
    }

    public class b extends Filter {
        public b() {
        }

        public /* synthetic */ b(N n9, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = N.this.f47297d;
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
                N.this.f47299f = (ArrayList) filterResults.values;
                N.this.w();
                if (N.this.f47299f == null || N.this.f47299f.size() != 0) {
                    if (N.this.f47304k.equals("mobile")) {
                        if (N.this.f47301h instanceof NSTIJKPlayerSkyActivity) {
                            ((NSTIJKPlayerSkyActivity) N.this.f47301h).w3();
                        } else if (N.this.f47301h instanceof NSTEXOPlayerSkyActivity) {
                            ((NSTEXOPlayerSkyActivity) N.this.f47301h).T3();
                        }
                    } else if (N.this.f47301h instanceof NSTIJKPlayerSkyTvActivity) {
                        ((NSTIJKPlayerSkyTvActivity) N.this.f47301h).P3();
                    } else if (N.this.f47301h instanceof NSTEXOPlayerSkyTvActivity) {
                        ((NSTEXOPlayerSkyTvActivity) N.this.f47301h).R3();
                    }
                } else if (N.this.f47304k.equals("mobile")) {
                    if (N.this.f47301h instanceof NSTIJKPlayerSkyActivity) {
                        ((NSTIJKPlayerSkyActivity) N.this.f47301h).H3();
                    } else if (N.this.f47301h instanceof NSTEXOPlayerSkyActivity) {
                        ((NSTEXOPlayerSkyActivity) N.this.f47301h).j4();
                    }
                } else if (N.this.f47301h instanceof NSTIJKPlayerSkyTvActivity) {
                    ((NSTIJKPlayerSkyTvActivity) N.this.f47301h).Y3();
                } else if (N.this.f47301h instanceof NSTEXOPlayerSkyTvActivity) {
                    ((NSTEXOPlayerSkyTvActivity) N.this.f47301h).e4();
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f47314a;

        public c(f fVar) {
            this.f47314a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            int favouriteCount;
            if (SharepreferenceDBHandler.getCurrentAPPType(N.this.f47301h).equals("m3u")) {
                favouriteCount = N.this.f47308o.getFavouriteCountM3U("live");
            } else if (SharepreferenceDBHandler.getCurrentAPPType(N.this.f47301h).equals("stalker_api")) {
                List<Integer> favIdsList = StalkerLiveFavIdsSingleton.getInstance().getFavIdsList();
                favouriteCount = (favIdsList == null || favIdsList.size() <= 0) ? 0 : favIdsList.size();
            } else {
                favouriteCount = N.this.f47307n.equals("true") ? N.this.f47302i.getFavouriteCount("radio_streams", SharepreferenceDBHandler.getUserID(N.this.f47301h)) : N.this.f47302i.getFavouriteCount("live", SharepreferenceDBHandler.getUserID(N.this.f47301h));
            }
            return Integer.valueOf(favouriteCount);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f47314a.f47323u.setText("0");
            } else {
                this.f47314a.f47323u.setText(String.valueOf(num));
            }
            this.f47314a.f47323u.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f47314a.f47323u.setVisibility(8);
        }
    }

    public class d extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f47316a;

        public d(f fVar) {
            this.f47316a = fVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(f... fVarArr) {
            try {
                return N.this.f47307n.equals("true") ? Integer.valueOf(N.this.f47308o.liveRecentlyWatchedCount("radio_streams")) : Integer.valueOf(N.this.f47308o.liveRecentlyWatchedCount("live"));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f47316a.f47323u.setText("0");
            } else {
                this.f47316a.f47323u.setText(String.valueOf(num));
            }
            this.f47316a.f47323u.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f47316a.f47323u.setVisibility(8);
        }
    }

    public class e implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f47318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f47319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f47320c;

        public e(View view, f fVar, int i9) {
            this.f47318a = view;
            this.f47319b = fVar;
            this.f47320c = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            f fVar;
            TextView textView;
            if (!z9 || (fVar = this.f47319b) == null || (textView = fVar.f47322t) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    public static class f extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f47322t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f47323u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f47324v;

        public f(View view) {
            super(view);
            this.f47322t = (TextView) view.findViewById(a7.f.Yh);
            this.f47323u = (TextView) view.findViewById(a7.f.Xh);
            this.f47324v = (RelativeLayout) view.findViewById(a7.f.nf);
        }
    }

    public N(Context context, String str, String str2, String str3, String str4) {
        this.f47298e = "";
        this.f47300g = "0";
        this.f47304k = "mobile";
        this.f47306m = "";
        this.f47307n = "false";
        this.f47298e = str4;
        this.f47301h = context;
        this.f47302i = new DatabaseHandler(context);
        this.f47300g = str;
        this.f47306m = str2;
        this.f47308o = new LiveStreamDBHandler(context);
        C2858a c2858a = new C2858a(context);
        this.f47309p = c2858a;
        if (c2858a.A().equals(AbstractC2237a.f44453K0)) {
            this.f47304k = "tv";
        } else {
            this.f47304k = "mobile";
        }
        this.f47307n = str3;
    }

    public final void A0(f fVar) {
        new d(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }

    public void B0(String str, String str2, String str3) {
        this.f47300g = str;
        this.f47306m = str2;
        this.f47307n = str3;
        w();
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f47303j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList = this.f47299f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public void E(f fVar, int i9) {
        RelativeLayout relativeLayout;
        Drawable drawableF;
        try {
            fVar.f47322t.setText(((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryName());
            if (((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-1")) {
                z0(fVar);
            } else if (((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-6")) {
                A0(fVar);
            } else {
                fVar.f47323u.setText(String.valueOf(((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCounter()));
            }
            fVar.f47324v.setOnClickListener(new a(i9, fVar));
            if (this.f47298e.equalsIgnoreCase("true")) {
                this.f47300g = "0";
            }
            if (this.f47300g.equals(((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryID())) {
                if (!this.f47305l) {
                    this.f47305l = true;
                    if (this.f47304k.equals("mobile")) {
                        Context context = this.f47301h;
                        if (context instanceof NSTIJKPlayerSkyActivity) {
                            ((NSTIJKPlayerSkyActivity) context).X2(i9, ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryName(), true);
                        } else if (context instanceof NSTEXOPlayerSkyActivity) {
                            ((NSTEXOPlayerSkyActivity) context).t3(i9, ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryName());
                        }
                    } else {
                        Context context2 = this.f47301h;
                        if (context2 instanceof NSTIJKPlayerSkyTvActivity) {
                            ((NSTIJKPlayerSkyTvActivity) context2).o3(i9, ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryName());
                        } else if (context2 instanceof NSTEXOPlayerSkyTvActivity) {
                            ((NSTEXOPlayerSkyTvActivity) context2).q3(i9, ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) this.f47299f.get(i9)).getLiveStreamCategoryName());
                        }
                    }
                }
                relativeLayout = fVar.f47324v;
                drawableF = this.f47301h.getResources().getDrawable(a7.c.f11867r);
            } else {
                relativeLayout = fVar.f47324v;
                drawableF = F.h.f(this.f47301h.getResources(), a7.e.f11974X0, this.f47301h.getTheme());
            }
            relativeLayout.setBackground(drawableF);
            RelativeLayout relativeLayout2 = fVar.f47324v;
            relativeLayout2.setOnFocusChangeListener(new e(relativeLayout2, fVar, i9));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public f L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (this.f47306m.equals("player")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12763a4;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12756Z3;
        }
        return new f(layoutInflaterFrom.inflate(i10, viewGroup, false));
    }

    public final void z0(f fVar) {
        new c(fVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fVar);
    }
}
