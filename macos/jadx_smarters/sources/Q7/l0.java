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
import com.nst.iptvsmarterstvbox.model.VodAllCategoriesSingleton;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.VodAllDataSingleActivity;
import java.util.ArrayList;
import m7.AbstractC2237a;
import q7.C2635t;
import q7.Z;
import q7.m0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class l0 extends RecyclerView.g implements Filterable, z7.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f48677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DatabaseHandler f48678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecentWatchDBHandler f48679i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f48681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LiveStreamDBHandler f48682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n7.e f48683m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f48680j = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f48674d = VodAllCategoriesSingleton.getInstance().getVodCategoriesList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f48675e = VodAllCategoriesSingleton.getInstance().getVodCategoriesList();

    public class b extends Filter {
        public b() {
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            String lowerCase = charSequence.toString().toLowerCase();
            Filter.FilterResults filterResults = new Filter.FilterResults();
            ArrayList arrayList = l0.this.f48674d;
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
                l0.this.f48675e = (ArrayList) filterResults.values;
                l0.this.w();
                if (l0.this.f48675e == null || l0.this.f48675e.size() != 0) {
                    ((VodAllDataSingleActivity) l0.this.f48677g).e2();
                } else {
                    ((VodAllDataSingleActivity) l0.this.f48677g).u2();
                }
            } catch (Exception unused) {
            }
        }
    }

    public class c implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f48685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f48686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f48687c;

        public c(View view, d dVar, int i9) {
            this.f48685a = view;
            this.f48686b = dVar;
            this.f48687c = i9;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            d dVar;
            TextView textView;
            AbstractC2237a.f44484a = this.f48687c;
            if (!z9 || (dVar = this.f48686b) == null || (textView = dVar.f48689t) == null) {
                return;
            }
            textView.setTextColor(-1);
        }
    }

    public static class d extends RecyclerView.D {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public TextView f48689t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public TextView f48690u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public RelativeLayout f48691v;

        public d(View view) {
            super(view);
            this.f48689t = (TextView) view.findViewById(a7.f.Yh);
            this.f48690u = (TextView) view.findViewById(a7.f.Xh);
            this.f48691v = (RelativeLayout) view.findViewById(a7.f.nf);
        }
    }

    public class e extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f48692a;

        public e(d dVar) {
            this.f48692a = dVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(d... dVarArr) {
            try {
                return SharepreferenceDBHandler.getCurrentAPPType(l0.this.f48677g).equals("m3u") ? Integer.valueOf(l0.this.f48682l.getFavouriteCountM3U("movie")) : Integer.valueOf(l0.this.f48678h.getFavouriteCount("vod", SharepreferenceDBHandler.getUserID(l0.this.f48677g)));
            } catch (Exception unused) {
                return 0;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            super.onPostExecute(num);
            if (num.intValue() == 0 || num.intValue() == -1) {
                this.f48692a.f48690u.setText("0");
            } else {
                this.f48692a.f48690u.setText(String.valueOf(num));
            }
            this.f48692a.f48690u.setVisibility(0);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            this.f48692a.f48690u.setVisibility(8);
        }
    }

    public l0(Context context, String str) {
        this.f48681k = "mobile";
        this.f48677g = context;
        this.f48678h = new DatabaseHandler(context);
        this.f48682l = new LiveStreamDBHandler(context);
        this.f48679i = new RecentWatchDBHandler(context);
        this.f48676f = str;
        this.f48683m = new n7.e(this, context);
        if (new C2858a(context).A().equals(AbstractC2237a.f44453K0)) {
            this.f48681k = "tv";
        } else {
            this.f48681k = "mobile";
        }
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
    }

    @Override // z7.g
    public void G(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, Z.E e9, int i9) {
    }

    @Override // z7.g
    public void G0(StalkerTokenCallback stalkerTokenCallback) {
    }

    @Override // z7.g
    public void H(String str) {
    }

    @Override // z7.g
    public void I(m0.x xVar, int i9) {
    }

    @Override // z7.g
    public void M(StalkerGetAdCallback stalkerGetAdCallback, int i9) {
    }

    @Override // z7.g
    public void O(Z.E e9, int i9) {
    }

    @Override // z7.g
    public void P0(String str) {
    }

    @Override // z7.g
    public void U(StalkerLiveFavIdsCallback stalkerLiveFavIdsCallback) {
    }

    @Override // z7.g
    public void V(StalkerProfilesCallback stalkerProfilesCallback) {
    }

    @Override // z7.g
    public void V0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, m0.x xVar, int i9) {
    }

    @Override // z7.g
    public void c(String str) {
    }

    @Override // z7.g
    public void d0(StalkerSetLiveFavCallback stalkerSetLiveFavCallback, C2635t.o oVar, String str, String str2) {
    }

    @Override // z7.g
    public void e(String str) {
    }

    @Override // z7.g
    public void e0(String str) {
    }

    @Override // z7.g
    public void f0(StalkerGetGenresCallback stalkerGetGenresCallback) {
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f48680j;
    }

    @Override // z7.g
    public void i(StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
    }

    @Override // z7.g
    public void j(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        ArrayList arrayList = this.f48675e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // z7.g
    public void o0(String str) {
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    public final /* synthetic */ void r0(int i9, d dVar, View view) {
        ((VodAllDataSingleActivity) this.f48677g).z2();
        this.f48676f = ((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCategoryID();
        dVar.f48691v.setBackground(this.f48677g.getResources().getDrawable(a7.c.f11867r));
        if (this.f48677g instanceof VodAllDataSingleActivity) {
            AsyncTask asyncTask = m7.w.f44701n;
            if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
                m7.w.f44701n.cancel(true);
            }
            ((VodAllDataSingleActivity) this.f48677g).E2(i9);
            ((VodAllDataSingleActivity) this.f48677g).t2(((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCategoryID(), ((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCategoryName());
        }
        w();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.f48677g).equals("stalker_api")) {
            dVar.f48690u.setVisibility(8);
            AbstractC2237a.f44457M0 = "-1";
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void E(final d dVar, final int i9) {
        String strValueOf;
        TextView textView;
        RelativeLayout relativeLayout;
        Drawable drawableF;
        try {
            dVar.f48689t.setText(((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCategoryName());
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f48677g).equals("stalker_api")) {
                dVar.f48690u.setVisibility(8);
            } else if (((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-1")) {
                x0(dVar);
            } else {
                if (((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCategoryID().equalsIgnoreCase("-4")) {
                    int vodRecentwatchmCount = this.f48679i.getVodRecentwatchmCount();
                    if (vodRecentwatchmCount == 0 || vodRecentwatchmCount == -1) {
                        dVar.f48690u.setText("0");
                    } else {
                        textView = dVar.f48690u;
                        strValueOf = String.valueOf(vodRecentwatchmCount);
                    }
                } else {
                    strValueOf = String.valueOf(((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCounter());
                    textView = dVar.f48690u;
                }
                textView.setText(strValueOf);
            }
            dVar.f48691v.setOnClickListener(new View.OnClickListener() { // from class: q7.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f48639a.r0(i9, dVar, view);
                }
            });
            if (this.f48676f.equals(((LiveStreamCategoryIdDBModel) this.f48675e.get(i9)).getLiveStreamCategoryID())) {
                if (!AbstractC2237a.f44457M0.equals("-1")) {
                    dVar.f48690u.setVisibility(0);
                    dVar.f48690u.setText(AbstractC2237a.f44457M0);
                }
                if (!((VodAllDataSingleActivity) this.f48677g).S1()) {
                    dVar.f48691v.setBackground(this.f48677g.getResources().getDrawable(a7.c.f11867r));
                    if (!((VodAllDataSingleActivity) this.f48677g).p2()) {
                        dVar.f48691v.requestFocus();
                    }
                    RelativeLayout relativeLayout2 = dVar.f48691v;
                    relativeLayout2.setOnFocusChangeListener(new c(relativeLayout2, dVar, i9));
                }
                relativeLayout = dVar.f48691v;
                drawableF = this.f48677g.getResources().getDrawable(a7.c.f11867r);
            } else {
                relativeLayout = dVar.f48691v;
                drawableF = F.h.f(this.f48677g.getResources(), a7.e.f11974X0, this.f48677g.getTheme());
            }
            relativeLayout.setBackground(drawableF);
            RelativeLayout relativeLayout22 = dVar.f48691v;
            relativeLayout22.setOnFocusChangeListener(new c(relativeLayout22, dVar, i9));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public d L(ViewGroup viewGroup, int i9) {
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(a7.g.f12905x4, viewGroup, false));
    }

    @Override // z7.g
    public void v0(String str) {
    }

    public final void x0(d dVar) {
        new e(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, dVar);
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public void z0(String str) {
        this.f48676f = str;
    }
}
