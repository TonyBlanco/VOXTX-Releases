package s7;

import D.AbstractC0519b;
import a7.k;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.google.android.exoplayer2.ui.PlayerView;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.PlayerSelectedSinglton;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DatabaseUpdatedStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.PasswordStatusDBModel;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import com.nst.iptvsmarterstvbox.view.activity.NewDashboardActivity;
import com.nst.iptvsmarterstvbox.view.activity.SettingsActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSmallEPG;
import com.nst.iptvsmarterstvbox.view.utility.epg.EPG;
import d4.AbstractC1681B;
import g7.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import m7.w;
import org.apache.commons.codec.language.bm.Rule;
import org.joda.time.LocalDateTime;
import org.json.JSONException;
import org.json.JSONObject;
import s5.I;
import u7.C2858a;

/* JADX INFO: renamed from: s7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2748a extends Fragment {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final int[] f50173W = {0, 1, 2, 3, 4, 5};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static C2858a f50174X;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SharedPreferences f50175A;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Toolbar f50179E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public TextView f50180F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public TextView f50181G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f50182H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Handler f50183I;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public SharedPreferences f50186L;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public SharedPreferences f50190P;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public SharedPreferences f50193S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f50194T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f50195U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f50197a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProgressBar f50198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f50199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f50200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RelativeLayout f50201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f50202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f50203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f50204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public PlayerView f50205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f50206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EPG f50207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f50208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ProgressBar f50209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LinearLayout f50210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f50211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f50212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public NSTIJKPlayerSmallEPG f50213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f50214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f50215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public DatabaseHandler f50216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LiveStreamDBHandler f50217v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SharedPreferences f50220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SharedPreferences f50221z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public LiveStreamsDBModel f50218w = new LiveStreamsDBModel();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f50219x = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50176B = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public DatabaseUpdatedStatusDBModel f50177C = new DatabaseUpdatedStatusDBModel();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f50178D = new ArrayList();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f50184J = 0;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f50185K = false;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f50187M = "0";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f50188N = Rule.ALL;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public AsyncTask f50189O = null;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f50191Q = 4;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f50192R = f50173W[0];

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public m f50196V = new m();

    /* JADX INFO: renamed from: s7.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0446a implements View.OnClickListener {
        public ViewOnClickListenerC0446a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2748a.this.E();
        }
    }

    /* JADX INFO: renamed from: s7.a$b */
    public class b extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public EPG f50223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f50224b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f50226d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList f50228f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList f50229g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ArrayList f50230h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList f50231i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ArrayList f50232j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f50234l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ RelativeLayout f50235m;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f50225c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ArrayList f50227e = new ArrayList();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Map f50233k = I.h();

        public b(EPG epg, int i9, String str, RelativeLayout relativeLayout) {
            this.f50234l = str;
            this.f50235m = relativeLayout;
            this.f50224b = 0;
            this.f50224b = i9;
            this.f50223a = epg;
            epg.f37737S0 = 1;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            String string = C2748a.this.f50197a.getSharedPreferences("epgchannelupdate", 0).getString("epgchannelupdate", "");
            this.f50226d = C2748a.this.f50197a.getSharedPreferences("auto_start", 0).getBoolean("full_epg", false);
            try {
                if (string.equals("all")) {
                    h(this.f50234l);
                } else {
                    g(this.f50234l);
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            return Boolean.TRUE;
        }

        public ArrayList b() {
            String categoryID;
            String strValueOf;
            Context context = C2748a.this.f50197a;
            if (context == null) {
                return null;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(context).equals("m3u")) {
                C2748a.this.f50217v = new LiveStreamDBHandler(C2748a.this.f50197a);
                ArrayList<FavouriteM3UModel> favouriteM3U = C2748a.this.f50217v.getFavouriteM3U("live");
                ArrayList arrayList = new ArrayList();
                for (FavouriteM3UModel favouriteM3UModel : favouriteM3U) {
                    ArrayList<LiveStreamsDBModel> m3UFavouriteRow = C2748a.this.f50217v.getM3UFavouriteRow(favouriteM3UModel.getCategoryID(), favouriteM3UModel.getUrl(), favouriteM3UModel.getTimestamp());
                    if (m3UFavouriteRow != null && m3UFavouriteRow.size() > 0) {
                        arrayList.add(m3UFavouriteRow.get(0));
                    }
                }
                if (arrayList.size() != 0) {
                    return arrayList;
                }
                return null;
            }
            C2748a.this.f50216u = new DatabaseHandler(C2748a.this.f50197a);
            C2748a c2748a = C2748a.this;
            ArrayList<FavouriteDBModel> allFavourites = c2748a.f50216u.getAllFavourites("live", SharepreferenceDBHandler.getUserID(c2748a.f50197a));
            ArrayList arrayList2 = new ArrayList();
            for (FavouriteDBModel favouriteDBModel : allFavourites) {
                LiveStreamDBHandler liveStreamDBHandler = new LiveStreamDBHandler(C2748a.this.f50197a);
                if (SharepreferenceDBHandler.getCurrentAPPType(C2748a.this.f50197a).equals("onestream_api")) {
                    categoryID = favouriteDBModel.getCategoryID();
                    strValueOf = favouriteDBModel.getStreamIDOneStream();
                } else {
                    categoryID = favouriteDBModel.getCategoryID();
                    strValueOf = String.valueOf(favouriteDBModel.getStreamID());
                }
                LiveStreamsDBModel liveStreamFavouriteRow = liveStreamDBHandler.getLiveStreamFavouriteRow(categoryID, strValueOf, favouriteDBModel.getTimestamp(), "");
                if (liveStreamFavouriteRow != null) {
                    arrayList2.add(liveStreamFavouriteRow);
                }
            }
            if (arrayList2.size() != 0) {
                return arrayList2;
            }
            return null;
        }

        public final ArrayList c() {
            C2748a c2748a = C2748a.this;
            ArrayList<PasswordStatusDBModel> allPasswordStatus = c2748a.f50217v.getAllPasswordStatus(SharepreferenceDBHandler.getUserID(c2748a.f50197a));
            this.f50228f = allPasswordStatus;
            if (allPasswordStatus != null) {
                for (PasswordStatusDBModel passwordStatusDBModel : allPasswordStatus) {
                    if (passwordStatusDBModel.getPasswordStatus().equals("1")) {
                        this.f50227e.add(passwordStatusDBModel.getPasswordStatusCategoryId());
                    }
                }
            }
            return this.f50227e;
        }

        public final ArrayList d(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null) {
                return null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LiveStreamsDBModel liveStreamsDBModel = (LiveStreamsDBModel) it.next();
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (liveStreamsDBModel.getCategoryId().equals((String) it2.next())) {
                                break;
                            }
                        } else {
                            ArrayList arrayList3 = this.f50229g;
                            if (arrayList3 != null) {
                                arrayList3.add(liveStreamsDBModel);
                            }
                        }
                    }
                }
            }
            return this.f50229g;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            Map map;
            EPG epg;
            if (C2748a.this.f50202g == null || (map = this.f50233k) == null || map.size() <= 0 || (epg = this.f50223a) == null) {
                LinearLayout linearLayout = C2748a.this.f50202g;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    C2748a.this.f50199d.setVisibility(0);
                    C2748a c2748a = C2748a.this;
                    c2748a.f50199d.setText(c2748a.getResources().getString(a7.j.f13271h4));
                }
            } else {
                epg.f37737S0 = 0;
                epg.d0();
                C2748a.this.f50202g.setVisibility(0);
                try {
                    this.f50223a.setEPGData(new E7.a(this.f50233k));
                    EPG epg2 = this.f50223a;
                    epg2.k0(null, false, this.f50235m, epg2);
                } catch (Exception unused) {
                }
            }
            ProgressBar progressBar = C2748a.this.f50198c;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            EPG epg;
            Map map = this.f50233k;
            if (map == null || map.size() <= 0) {
                return;
            }
            ProgressBar progressBar = C2748a.this.f50198c;
            if (progressBar != null) {
                progressBar.setVisibility(4);
            }
            if (C2748a.this.f50202g == null || (epg = this.f50223a) == null) {
                return;
            }
            epg.d0();
            C2748a.this.f50202g.setVisibility(0);
            try {
                this.f50223a.setEPGData(new E7.a(this.f50233k));
                EPG epg2 = this.f50223a;
                epg2.k0(null, false, this.f50235m, epg2);
            } catch (Exception unused) {
            }
        }

        public final void g(String str) {
            if (this.f50226d) {
                i(str);
            } else {
                j(str);
            }
        }

        public final void h(String str) throws JSONException {
            if (this.f50226d) {
                k(str);
            } else {
                l(str);
            }
        }

        public final void i(String str) {
            D7.a aVar;
            D7.a aVar2;
            m mVar;
            D7.b bVar;
            C2748a.this.f50217v = new LiveStreamDBHandler(C2748a.this.f50197a);
            try {
                ArrayList<LiveStreamsDBModel> arrayListB = str.equals("-1") ? b() : new LiveStreamDBHandler(C2748a.this.f50197a).getAllLiveStreasWithSkyId(str, "live");
                this.f50228f = new ArrayList();
                this.f50229g = new ArrayList();
                this.f50230h = new ArrayList();
                this.f50231i = new ArrayList();
                this.f50232j = new ArrayList();
                C2748a c2748a = C2748a.this;
                if (c2748a.f50217v.getParentalStatusCount(SharepreferenceDBHandler.getUserID(c2748a.f50197a)) > 0 && arrayListB != null) {
                    ArrayList arrayListC = c();
                    this.f50227e = arrayListC;
                    if (arrayListC != null) {
                        this.f50230h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f50230h;
                }
                this.f50231i = arrayListB;
                if (this.f50231i != null) {
                    int i9 = -1;
                    D7.a aVar3 = null;
                    D7.a aVar4 = null;
                    D7.a aVar5 = null;
                    int i10 = 0;
                    D7.b bVar2 = null;
                    for (int i11 = 0; i11 < this.f50231i.size(); i11++) {
                        m mVar2 = C2748a.this.f50196V;
                        if (mVar2 != null) {
                            mVar2.e();
                        }
                        if ((C2748a.this.f50189O != null && C2748a.this.f50189O.isCancelled()) || ((mVar = C2748a.this.f50196V) != null && mVar.b())) {
                            break;
                        }
                        String name = ((LiveStreamsDBModel) this.f50231i.get(i11)).getName();
                        String epgChannelId = ((LiveStreamsDBModel) this.f50231i.get(i11)).getEpgChannelId();
                        String streamIcon = ((LiveStreamsDBModel) this.f50231i.get(i11)).getStreamIcon();
                        String streamId = ((LiveStreamsDBModel) this.f50231i.get(i11)).getStreamId();
                        String num = ((LiveStreamsDBModel) this.f50231i.get(i11)).getNum();
                        String epgChannelId2 = ((LiveStreamsDBModel) this.f50231i.get(i11)).getEpgChannelId();
                        String url = ((LiveStreamsDBModel) this.f50231i.get(i11)).getUrl();
                        String categoryId = ((LiveStreamsDBModel) this.f50231i.get(i11)).getCategoryId();
                        if (!epgChannelId.equals("")) {
                            int i12 = i9 + 1;
                            ArrayList<XMLTVProgrammePojo> epg = C2748a.this.f50217v.getEPG(epgChannelId);
                            if (epg == null || epg.size() == 0) {
                                aVar4 = aVar4;
                            } else {
                                ArrayList<XMLTVProgrammePojo> arrayList = epg;
                                D7.a aVar6 = aVar4;
                                D7.a aVar7 = new D7.a(streamIcon, name, i10, streamId, num, epgChannelId2, categoryId, url, str);
                                i10++;
                                if (aVar5 == null) {
                                    aVar5 = aVar7;
                                }
                                if (aVar6 != null) {
                                    aVar7.o(aVar6);
                                    aVar6.n(aVar7);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                this.f50233k.put(aVar7, arrayList2);
                                D7.b bVar3 = bVar2;
                                int i13 = 0;
                                Long l9 = null;
                                while (i13 < arrayList.size() && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                    ArrayList<XMLTVProgrammePojo> arrayList3 = arrayList;
                                    String start = arrayList3.get(i13).getStart();
                                    String stop = arrayList3.get(i13).getStop();
                                    String title = arrayList3.get(i13).getTitle();
                                    String desc = arrayList3.get(i13).getDesc();
                                    long jX = w.x(start, C2748a.this.f50197a);
                                    Long lValueOf = Long.valueOf(jX);
                                    long jX2 = w.x(stop, C2748a.this.f50197a);
                                    Long lValueOf2 = Long.valueOf(jX2);
                                    if (l9 != null && lValueOf.equals(l9)) {
                                        bVar = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                        if (bVar3 != null) {
                                            bVar.k(bVar3);
                                            bVar3.j(bVar);
                                        }
                                        aVar7.a(bVar);
                                    } else if (l9 != null) {
                                        D7.b bVar4 = new D7.b(aVar7, l9.longValue(), jX, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                        if (bVar3 != null) {
                                            bVar4.k(bVar3);
                                            bVar3.j(bVar4);
                                        }
                                        aVar7.a(bVar4);
                                        arrayList2.add(bVar4);
                                        bVar = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                        bVar.k(bVar4);
                                        bVar4.j(bVar);
                                        aVar7.a(bVar);
                                    } else {
                                        bVar = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                        if (bVar3 != null) {
                                            bVar.k(bVar3);
                                            bVar3.j(bVar);
                                        }
                                        aVar7.a(bVar);
                                    }
                                    arrayList2.add(bVar);
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    if (i13 == arrayList3.size() - 1 && jX2 < jCurrentTimeMillis) {
                                        D7.b bVar5 = new D7.b(aVar7, jX2, jX2 + jCurrentTimeMillis + Long.parseLong("7200000"), C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                        bVar5.k(bVar);
                                        bVar.j(bVar5);
                                        aVar7.a(bVar5);
                                        arrayList2.add(bVar5);
                                        bVar = bVar5;
                                    }
                                    if (i13 != 0 || jX <= jCurrentTimeMillis) {
                                        bVar3 = bVar;
                                    } else {
                                        bVar3 = new D7.b(aVar7, jCurrentTimeMillis - Long.parseLong("86400000"), jX, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                        bVar3.k(bVar);
                                        bVar.j(bVar3);
                                        aVar7.a(bVar3);
                                        arrayList2.add(bVar3);
                                    }
                                    i13++;
                                    arrayList = arrayList3;
                                    l9 = lValueOf2;
                                }
                                bVar2 = bVar3;
                                aVar3 = aVar7;
                                aVar4 = aVar3;
                            }
                            i9 = i12;
                        }
                        if (i9 == 10 || (i9 != 0 && i9 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i9));
                        }
                    }
                    aVar2 = aVar3;
                    aVar = aVar5;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar2.n(aVar);
                }
                if (aVar != null) {
                    aVar.o(aVar2);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }

        public final void j(String str) {
            D7.a aVar;
            D7.a aVar2;
            m mVar;
            int i9;
            ArrayList<XMLTVProgrammePojo> epg;
            D7.b bVar;
            ArrayList arrayList;
            D7.b bVar2;
            int i10;
            C2748a.this.f50217v = new LiveStreamDBHandler(C2748a.this.f50197a);
            try {
                ArrayList<LiveStreamsDBModel> arrayListB = str.equals("-1") ? b() : new LiveStreamDBHandler(C2748a.this.f50197a).getAllLiveStreasWithSkyId(str, "live");
                this.f50228f = new ArrayList();
                this.f50229g = new ArrayList();
                this.f50230h = new ArrayList();
                this.f50231i = new ArrayList();
                this.f50232j = new ArrayList();
                C2748a c2748a = C2748a.this;
                if (c2748a.f50217v.getParentalStatusCount(SharepreferenceDBHandler.getUserID(c2748a.f50197a)) > 0 && arrayListB != null) {
                    ArrayList arrayListC = c();
                    this.f50227e = arrayListC;
                    if (arrayListC != null) {
                        this.f50230h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f50230h;
                }
                this.f50231i = arrayListB;
                if (this.f50231i != null) {
                    int i11 = -1;
                    D7.a aVar3 = null;
                    D7.a aVar4 = null;
                    int i12 = 0;
                    D7.a aVar5 = null;
                    int i13 = 0;
                    D7.b bVar3 = null;
                    while (i12 < this.f50231i.size()) {
                        m mVar2 = C2748a.this.f50196V;
                        if (mVar2 != null) {
                            mVar2.e();
                        }
                        if ((C2748a.this.f50189O != null && C2748a.this.f50189O.isCancelled()) || ((mVar = C2748a.this.f50196V) != null && mVar.b())) {
                            break;
                        }
                        String name = ((LiveStreamsDBModel) this.f50231i.get(i12)).getName();
                        String epgChannelId = ((LiveStreamsDBModel) this.f50231i.get(i12)).getEpgChannelId();
                        String streamIcon = ((LiveStreamsDBModel) this.f50231i.get(i12)).getStreamIcon();
                        String streamId = ((LiveStreamsDBModel) this.f50231i.get(i12)).getStreamId();
                        String num = ((LiveStreamsDBModel) this.f50231i.get(i12)).getNum();
                        String epgChannelId2 = ((LiveStreamsDBModel) this.f50231i.get(i12)).getEpgChannelId();
                        String url = ((LiveStreamsDBModel) this.f50231i.get(i12)).getUrl();
                        String categoryId = ((LiveStreamsDBModel) this.f50231i.get(i12)).getCategoryId();
                        if (epgChannelId.equals("") || (epg = C2748a.this.f50217v.getEPG(epgChannelId)) == null || epg.size() == 0) {
                            aVar4 = aVar4;
                        } else {
                            int i14 = i11 + 1;
                            D7.a aVar6 = aVar4;
                            D7.a aVar7 = new D7.a(streamIcon, name, i13, streamId, num, epgChannelId2, categoryId, url, str);
                            i13++;
                            if (aVar5 == null) {
                                aVar5 = aVar7;
                            }
                            if (aVar6 != null) {
                                aVar7.o(aVar6);
                                aVar6.n(aVar7);
                            }
                            ArrayList arrayList2 = new ArrayList();
                            this.f50233k.put(aVar7, arrayList2);
                            D7.b bVar4 = bVar3;
                            int i15 = 0;
                            boolean z9 = false;
                            Long l9 = null;
                            while (true) {
                                if (i15 >= epg.size()) {
                                    bVar = bVar4;
                                    break;
                                }
                                String start = epg.get(i15).getStart();
                                String stop = epg.get(i15).getStop();
                                String title = epg.get(i15).getTitle();
                                String desc = epg.get(i15).getDesc();
                                ArrayList<XMLTVProgrammePojo> arrayList3 = epg;
                                long jX = w.x(start, C2748a.this.f50197a);
                                Long lValueOf = Long.valueOf(jX);
                                ArrayList arrayList4 = arrayList2;
                                D7.b bVar5 = bVar4;
                                long jX2 = w.x(stop, C2748a.this.f50197a);
                                Long lValueOf2 = Long.valueOf(jX2);
                                if (C2748a.this.f50189O != null && C2748a.this.f50189O.isCancelled()) {
                                    bVar = bVar5;
                                    break;
                                }
                                if (w.b0(jX, jX2, C2748a.this.f50197a) || z9) {
                                    long millis = LocalDateTime.now().toDateTime().getMillis() + w.S(C2748a.this.f50197a);
                                    if (jX > millis + 12600000) {
                                        arrayList = arrayList4;
                                        bVar2 = bVar5;
                                    } else if (l9 == null || !lValueOf.equals(l9)) {
                                        arrayList = arrayList4;
                                        if (l9 != null) {
                                            D7.b bVar6 = new D7.b(aVar7, l9.longValue(), jX, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                            if (bVar5 != null) {
                                                bVar6.k(bVar5);
                                                bVar5.j(bVar6);
                                            }
                                            aVar7.a(bVar6);
                                            arrayList.add(bVar6);
                                            bVar2 = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                            bVar2.k(bVar6);
                                            bVar6.j(bVar2);
                                            aVar7.a(bVar2);
                                        } else {
                                            bVar2 = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                            if (bVar5 != null) {
                                                bVar2.k(bVar5);
                                                bVar5.j(bVar2);
                                            }
                                            aVar7.a(bVar2);
                                        }
                                        arrayList.add(bVar2);
                                    } else {
                                        D7.b bVar7 = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                        if (bVar5 != null) {
                                            bVar7.k(bVar5);
                                            bVar5.j(bVar7);
                                        }
                                        aVar7.a(bVar7);
                                        arrayList = arrayList4;
                                        arrayList.add(bVar7);
                                        bVar2 = bVar7;
                                    }
                                    if (i15 == arrayList3.size() - 1 && jX2 < millis) {
                                        long j9 = Long.parseLong("3600000") + jX2;
                                        long j10 = jX2;
                                        int i16 = 0;
                                        for (int i17 = 3; i16 < i17 && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled()); i17 = 3) {
                                            D7.b bVar8 = new D7.b(aVar7, j10, j9, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                            if (bVar2 != null) {
                                                bVar8.k(bVar2);
                                                bVar2.j(bVar8);
                                            }
                                            aVar7.a(bVar8);
                                            arrayList.add(bVar8);
                                            i16++;
                                            bVar2 = bVar8;
                                            j10 = j9;
                                            j9 = Long.parseLong("3600000") + j9;
                                        }
                                    }
                                    if (i15 == 0 && jX > millis) {
                                        long j11 = millis;
                                        int i18 = 0;
                                        while (i18 < 3 && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                            D7.b bVar9 = new D7.b(aVar7, j11, jX, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                            if (bVar2 != null) {
                                                bVar9.k(bVar2);
                                                bVar2.j(bVar9);
                                            }
                                            aVar7.a(bVar9);
                                            arrayList.add(bVar9);
                                            i18++;
                                            bVar2 = bVar9;
                                            j11 = jX;
                                            jX = Long.parseLong("3600000") + jX;
                                        }
                                    }
                                    bVar4 = bVar2;
                                    l9 = lValueOf2;
                                    i10 = 1;
                                    z9 = true;
                                } else {
                                    bVar4 = bVar5;
                                    arrayList = arrayList4;
                                    i10 = 1;
                                }
                                i15 += i10;
                                arrayList2 = arrayList;
                                epg = arrayList3;
                            }
                            bVar3 = bVar;
                            aVar3 = aVar7;
                            aVar4 = aVar3;
                            i11 = i14;
                        }
                        if (i11 == 10 || (i11 != 0 && i11 % 50 == 0)) {
                            i9 = 1;
                            publishProgress(Integer.valueOf(i11));
                        } else {
                            i9 = 1;
                        }
                        i12 += i9;
                    }
                    aVar2 = aVar3;
                    aVar = aVar5;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar2.n(aVar);
                }
                if (aVar != null) {
                    aVar.o(aVar2);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }

        public final void k(String str) throws JSONException {
            D7.a aVar;
            D7.a aVar2;
            m mVar;
            String string;
            Object obj;
            String str2;
            D7.a aVar3;
            int i9;
            JSONObject jSONObject;
            String str3;
            String str4;
            String str5;
            String str6;
            int i10;
            D7.b bVar;
            D7.b bVar2;
            C2748a.this.f50217v = new LiveStreamDBHandler(C2748a.this.f50197a);
            try {
                ArrayList<LiveStreamsDBModel> arrayListB = str.equals("-1") ? b() : new LiveStreamDBHandler(C2748a.this.f50197a).getAllLiveStreasWithSkyId(str, "live");
                this.f50228f = new ArrayList();
                this.f50229g = new ArrayList();
                this.f50230h = new ArrayList();
                this.f50231i = new ArrayList();
                this.f50232j = new ArrayList();
                C2748a c2748a = C2748a.this;
                if (c2748a.f50217v.getParentalStatusCount(SharepreferenceDBHandler.getUserID(c2748a.f50197a)) > 0 && arrayListB != null) {
                    ArrayList arrayListC = c();
                    this.f50227e = arrayListC;
                    if (arrayListC != null) {
                        this.f50230h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f50230h;
                }
                this.f50231i = arrayListB;
                if (this.f50231i != null) {
                    aVar = null;
                    D7.a aVar4 = null;
                    D7.a aVar5 = null;
                    D7.b bVar3 = null;
                    int i11 = 0;
                    int i12 = -1;
                    while (i11 < this.f50231i.size()) {
                        m mVar2 = C2748a.this.f50196V;
                        if (mVar2 != null) {
                            mVar2.e();
                        }
                        if ((C2748a.this.f50189O != null && C2748a.this.f50189O.isCancelled()) || ((mVar = C2748a.this.f50196V) != null && mVar.b())) {
                            break;
                        }
                        String name = ((LiveStreamsDBModel) this.f50231i.get(i11)).getName();
                        String epgChannelId = ((LiveStreamsDBModel) this.f50231i.get(i11)).getEpgChannelId();
                        String streamIcon = ((LiveStreamsDBModel) this.f50231i.get(i11)).getStreamIcon();
                        String streamId = ((LiveStreamsDBModel) this.f50231i.get(i11)).getStreamId();
                        String num = ((LiveStreamsDBModel) this.f50231i.get(i11)).getNum();
                        String epgChannelId2 = ((LiveStreamsDBModel) this.f50231i.get(i11)).getEpgChannelId();
                        String url = ((LiveStreamsDBModel) this.f50231i.get(i11)).getUrl();
                        String categoryId = ((LiveStreamsDBModel) this.f50231i.get(i11)).getCategoryId();
                        if (SharepreferenceDBHandler.getCurrentAPPType(C2748a.this.f50197a).equals("onestream_api")) {
                            try {
                                jSONObject = new JSONObject(url);
                                String str7 = C2748a.this.f50195U;
                                str3 = "m3u8";
                                str4 = "ts";
                                if (str7 == null || str7.isEmpty() || !C2748a.this.f50195U.equals(".ts")) {
                                    str5 = "";
                                    string = str5;
                                } else {
                                    Iterator<String> itKeys = jSONObject.keys();
                                    while (true) {
                                        if (!itKeys.hasNext()) {
                                            str6 = "";
                                            break;
                                        } else if (itKeys.next().equals("ts")) {
                                            str6 = "ts";
                                            break;
                                        }
                                    }
                                    if (str6.equals("")) {
                                        while (true) {
                                            if (!itKeys.hasNext()) {
                                                break;
                                            } else if (itKeys.next().equals("m3u8")) {
                                                str6 = "m3u8";
                                                break;
                                            }
                                        }
                                    }
                                    String str8 = str6;
                                    string = jSONObject.getString(str6);
                                    str5 = str8;
                                }
                            } catch (Exception e9) {
                                e = e9;
                                string = "";
                            }
                            try {
                                String str9 = C2748a.this.f50195U;
                                if (str9 != null && !str9.isEmpty()) {
                                    String str10 = str5;
                                    if (C2748a.this.f50195U.equals(".m3u8")) {
                                        Iterator<String> itKeys2 = jSONObject.keys();
                                        while (true) {
                                            if (!itKeys2.hasNext()) {
                                                str3 = str10;
                                                break;
                                            } else if (itKeys2.next().equals("m3u8")) {
                                                break;
                                            }
                                        }
                                        if (str3.equals("")) {
                                            while (itKeys2.hasNext()) {
                                                if (itKeys2.next().equals("ts")) {
                                                    break;
                                                }
                                            }
                                            str4 = str3;
                                            string = jSONObject.getString(str4);
                                        } else {
                                            str4 = str3;
                                            string = jSONObject.getString(str4);
                                        }
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                                AbstractC1681B.d("exce", String.valueOf(e));
                            }
                            obj = "";
                            str2 = epgChannelId;
                            aVar3 = aVar4;
                            String str11 = string;
                            i9 = i11;
                            aVar4 = new D7.a(streamIcon, name, i11, streamId, num, epgChannelId2, categoryId, str11, str);
                        } else {
                            obj = "";
                            str2 = epgChannelId;
                            aVar3 = aVar4;
                            i9 = i11;
                            aVar4 = new D7.a(streamIcon, name, i9, streamId, num, epgChannelId2, categoryId, url, str);
                        }
                        if (aVar5 == null) {
                            aVar5 = aVar4;
                        }
                        if (aVar3 != null) {
                            aVar4.o(aVar3);
                            aVar3.n(aVar4);
                        }
                        ArrayList arrayList = new ArrayList();
                        this.f50233k.put(aVar4, arrayList);
                        if (str2.equals(obj)) {
                            i10 = i9;
                            long jCurrentTimeMillis = System.currentTimeMillis() - Long.parseLong("86400000");
                            long j9 = Long.parseLong("7200000") + jCurrentTimeMillis;
                            long j10 = jCurrentTimeMillis;
                            bVar = bVar3;
                            int i13 = 0;
                            while (i13 < 50 && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                D7.b bVar4 = new D7.b(aVar4, j10, j9, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                if (bVar != null) {
                                    bVar4.k(bVar);
                                    bVar.j(bVar4);
                                }
                                aVar4.a(bVar4);
                                arrayList.add(bVar4);
                                i13++;
                                j10 = j9;
                                bVar = bVar4;
                                j9 = Long.parseLong("7200000") + j9;
                            }
                        } else {
                            i12++;
                            ArrayList<XMLTVProgrammePojo> epg = C2748a.this.f50217v.getEPG(str2);
                            if (epg == null || epg.size() == 0) {
                                i10 = i9;
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - Long.parseLong("86400000");
                                long j11 = Long.parseLong("7200000") + jCurrentTimeMillis2;
                                long j12 = jCurrentTimeMillis2;
                                bVar = bVar3;
                                int i14 = 0;
                                while (i14 < 50 && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                    D7.b bVar5 = new D7.b(aVar4, j12, j11, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                    if (bVar != null) {
                                        bVar5.k(bVar);
                                        bVar.j(bVar5);
                                    }
                                    aVar4.a(bVar5);
                                    arrayList.add(bVar5);
                                    i14++;
                                    j12 = j11;
                                    bVar = bVar5;
                                    j11 = Long.parseLong("7200000") + j11;
                                }
                            } else {
                                Long l9 = null;
                                bVar = bVar3;
                                int i15 = 0;
                                while (i15 < epg.size() && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                    String start = epg.get(i15).getStart();
                                    String stop = epg.get(i15).getStop();
                                    String title = epg.get(i15).getTitle();
                                    String desc = epg.get(i15).getDesc();
                                    long jX = w.x(start, C2748a.this.f50197a);
                                    Long lValueOf = Long.valueOf(jX);
                                    int i16 = i9;
                                    long jX2 = w.x(stop, C2748a.this.f50197a);
                                    Long lValueOf2 = Long.valueOf(jX2);
                                    if (l9 != null && lValueOf.equals(l9)) {
                                        bVar2 = new D7.b(aVar4, jX, jX2, title, streamIcon, desc);
                                        if (bVar != null) {
                                            bVar2.k(bVar);
                                            bVar.j(bVar2);
                                        }
                                        aVar4.a(bVar2);
                                    } else if (l9 != null) {
                                        D7.b bVar6 = new D7.b(aVar4, l9.longValue(), jX, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                        if (bVar != null) {
                                            bVar6.k(bVar);
                                            bVar.j(bVar6);
                                        }
                                        aVar4.a(bVar6);
                                        arrayList.add(bVar6);
                                        bVar2 = new D7.b(aVar4, jX, jX2, title, streamIcon, desc);
                                        bVar2.k(bVar6);
                                        bVar6.j(bVar2);
                                        aVar4.a(bVar2);
                                    } else {
                                        bVar2 = new D7.b(aVar4, jX, jX2, title, streamIcon, desc);
                                        if (bVar != null) {
                                            bVar2.k(bVar);
                                            bVar.j(bVar2);
                                        }
                                        aVar4.a(bVar2);
                                    }
                                    arrayList.add(bVar2);
                                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                                    if (i15 == epg.size() - 1 && jX2 < jCurrentTimeMillis3) {
                                        D7.b bVar7 = new D7.b(aVar4, jX2, jX2 + jCurrentTimeMillis3 + Long.parseLong("7200000"), C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                        bVar7.k(bVar2);
                                        bVar2.j(bVar7);
                                        aVar4.a(bVar7);
                                        arrayList.add(bVar7);
                                        bVar2 = bVar7;
                                    }
                                    if (i15 != 0 || jX <= jCurrentTimeMillis3) {
                                        bVar = bVar2;
                                    } else {
                                        bVar = new D7.b(aVar4, jCurrentTimeMillis3 - Long.parseLong("86400000"), jX, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                        bVar.k(bVar2);
                                        bVar2.j(bVar);
                                        aVar4.a(bVar);
                                        arrayList.add(bVar);
                                    }
                                    i15++;
                                    l9 = lValueOf2;
                                    i9 = i16;
                                }
                                i10 = i9;
                            }
                        }
                        bVar3 = bVar;
                        int i17 = i12;
                        if (i17 == 10 || (i17 != 0 && i17 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i17));
                            i11 = i10 + 1;
                            i12 = i17;
                            aVar = aVar4;
                        }
                        i11 = i10 + 1;
                        i12 = i17;
                        aVar = aVar4;
                    }
                    aVar2 = aVar5;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar != null) {
                    aVar.n(aVar2);
                }
                if (aVar2 != null) {
                    aVar2.o(aVar);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }

        public final void l(String str) {
            D7.a aVar;
            D7.a aVar2;
            m mVar;
            D7.b bVar;
            D7.b bVar2;
            C2748a.this.f50217v = new LiveStreamDBHandler(C2748a.this.f50197a);
            try {
                ArrayList<LiveStreamsDBModel> arrayListB = str.equals("-1") ? b() : new LiveStreamDBHandler(C2748a.this.f50197a).getAllLiveStreasWithSkyId(str, "live");
                this.f50228f = new ArrayList();
                this.f50229g = new ArrayList();
                this.f50230h = new ArrayList();
                this.f50231i = new ArrayList();
                this.f50232j = new ArrayList();
                C2748a c2748a = C2748a.this;
                if (c2748a.f50217v.getParentalStatusCount(SharepreferenceDBHandler.getUserID(c2748a.f50197a)) > 0 && arrayListB != null) {
                    ArrayList arrayListC = c();
                    this.f50227e = arrayListC;
                    if (arrayListC != null) {
                        this.f50230h = d(arrayListB, arrayListC);
                    }
                    arrayListB = this.f50230h;
                }
                this.f50231i = arrayListB;
                if (this.f50231i != null) {
                    D7.a aVar3 = null;
                    D7.a aVar4 = null;
                    int i9 = 0;
                    int i10 = -1;
                    D7.a aVar5 = null;
                    D7.b bVar3 = null;
                    while (i9 < this.f50231i.size()) {
                        m mVar2 = C2748a.this.f50196V;
                        if (mVar2 != null) {
                            mVar2.e();
                        }
                        if ((C2748a.this.f50189O != null && C2748a.this.f50189O.isCancelled()) || ((mVar = C2748a.this.f50196V) != null && mVar.b())) {
                            break;
                        }
                        String name = ((LiveStreamsDBModel) this.f50231i.get(i9)).getName();
                        String epgChannelId = ((LiveStreamsDBModel) this.f50231i.get(i9)).getEpgChannelId();
                        String streamIcon = ((LiveStreamsDBModel) this.f50231i.get(i9)).getStreamIcon();
                        D7.a aVar6 = aVar4;
                        int i11 = i9;
                        D7.a aVar7 = new D7.a(streamIcon, name, i9, ((LiveStreamsDBModel) this.f50231i.get(i9)).getStreamId(), ((LiveStreamsDBModel) this.f50231i.get(i9)).getNum(), ((LiveStreamsDBModel) this.f50231i.get(i9)).getEpgChannelId(), ((LiveStreamsDBModel) this.f50231i.get(i9)).getCategoryId(), ((LiveStreamsDBModel) this.f50231i.get(i9)).getUrl(), str);
                        if (aVar5 == null) {
                            aVar5 = aVar7;
                        }
                        if (aVar6 != null) {
                            aVar7.o(aVar6);
                            aVar6.n(aVar7);
                        }
                        ArrayList arrayList = new ArrayList();
                        this.f50233k.put(aVar7, arrayList);
                        if (epgChannelId == null || epgChannelId.equals("")) {
                            long millis = LocalDateTime.now().toDateTime().getMillis();
                            long j9 = Long.parseLong("3600000") + millis;
                            long j10 = millis;
                            D7.b bVar4 = bVar3;
                            int i12 = 0;
                            while (i12 < 3 && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                D7.b bVar5 = new D7.b(aVar7, j10, j9, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                if (bVar4 != null) {
                                    bVar5.k(bVar4);
                                    bVar4.j(bVar5);
                                }
                                aVar7.a(bVar5);
                                arrayList.add(bVar5);
                                i12++;
                                bVar4 = bVar5;
                                j10 = j9;
                                j9 = Long.parseLong("3600000") + j9;
                            }
                            bVar3 = bVar4;
                        } else {
                            i10++;
                            ArrayList<XMLTVProgrammePojo> epg = C2748a.this.f50217v.getEPG(epgChannelId);
                            if (epg == null || epg.size() == 0) {
                                long millis2 = LocalDateTime.now().toDateTime().getMillis();
                                long j11 = Long.parseLong("3600000") + millis2;
                                long j12 = millis2;
                                D7.b bVar6 = bVar3;
                                int i13 = 0;
                                while (i13 < 3 && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                    D7.b bVar7 = new D7.b(aVar7, j12, j11, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                    if (bVar6 != null) {
                                        bVar7.k(bVar6);
                                        bVar6.j(bVar7);
                                    }
                                    aVar7.a(bVar7);
                                    arrayList.add(bVar7);
                                    i13++;
                                    bVar6 = bVar7;
                                    j12 = j11;
                                    j11 = Long.parseLong("3600000") + j11;
                                }
                                bVar = bVar6;
                            } else {
                                bVar = bVar3;
                                boolean z9 = false;
                                int i14 = 0;
                                Long l9 = null;
                                while (i14 < epg.size() && (C2748a.this.f50189O == null || !C2748a.this.f50189O.isCancelled())) {
                                    String start = epg.get(i14).getStart();
                                    String stop = epg.get(i14).getStop();
                                    String title = epg.get(i14).getTitle();
                                    String desc = epg.get(i14).getDesc();
                                    long jX = w.x(start, C2748a.this.f50197a);
                                    Long lValueOf = Long.valueOf(jX);
                                    ArrayList<XMLTVProgrammePojo> arrayList2 = epg;
                                    int i15 = i14;
                                    long jX2 = w.x(stop, C2748a.this.f50197a);
                                    Long lValueOf2 = Long.valueOf(jX2);
                                    if (w.b0(jX, jX2, C2748a.this.f50197a) || z9) {
                                        if (jX <= LocalDateTime.now().toDateTime().getMillis() + w.S(C2748a.this.f50197a) + 12600000) {
                                            if (l9 != null && lValueOf.equals(l9)) {
                                                bVar2 = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                                if (bVar != null) {
                                                    bVar2.k(bVar);
                                                    bVar.j(bVar2);
                                                }
                                                aVar7.a(bVar2);
                                            } else if (l9 != null) {
                                                D7.b bVar8 = new D7.b(aVar7, l9.longValue(), jX, C2748a.this.f50197a.getResources().getString(a7.j.f13351p4), streamIcon, "");
                                                if (bVar != null) {
                                                    bVar8.k(bVar);
                                                    bVar.j(bVar8);
                                                }
                                                aVar7.a(bVar8);
                                                arrayList.add(bVar8);
                                                D7.b bVar9 = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                                bVar9.k(bVar8);
                                                bVar8.j(bVar9);
                                                aVar7.a(bVar9);
                                                arrayList.add(bVar9);
                                                bVar2 = bVar9;
                                                l9 = lValueOf2;
                                                bVar = bVar2;
                                            } else {
                                                bVar2 = new D7.b(aVar7, jX, jX2, title, streamIcon, desc);
                                                if (bVar != null) {
                                                    bVar2.k(bVar);
                                                    bVar.j(bVar2);
                                                }
                                                aVar7.a(bVar2);
                                            }
                                            arrayList.add(bVar2);
                                            l9 = lValueOf2;
                                            bVar = bVar2;
                                        }
                                        z9 = true;
                                    }
                                    i14 = i15 + 1;
                                    epg = arrayList2;
                                }
                            }
                            bVar3 = bVar;
                        }
                        if (i10 == 10 || (i10 != 0 && i10 % 50 == 0)) {
                            publishProgress(Integer.valueOf(i10));
                        }
                        i9 = i11 + 1;
                        aVar3 = aVar7;
                        aVar4 = aVar3;
                    }
                    aVar2 = aVar3;
                    aVar = aVar5;
                } else {
                    aVar = null;
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    aVar2.n(aVar);
                }
                if (aVar != null) {
                    aVar.o(aVar2);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th.getMessage(), th);
            }
        }
    }

    /* JADX INFO: renamed from: s7.a$c */
    public class c implements View.OnKeyListener {
        public c() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            EPG epg;
            if (keyEvent.getAction() == 1) {
                return false;
            }
            if ((i9 == 20 || i9 == 19 || i9 == 22 || i9 == 21 || i9 == 23 || i9 == 66) && (epg = C2748a.this.f50207l) != null) {
                return epg.onKeyDown(i9, keyEvent);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: s7.a$d */
    public class d implements C7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f50238a;

        public d(String str) {
            this.f50238a = str;
        }

        @Override // C7.a
        public void a(int i9, int i10, D7.b bVar) {
            String str;
            int i11;
            String strL = "";
            try {
                strL = bVar.a().l();
                str = strL;
                i11 = Integer.parseInt(bVar.a().l());
            } catch (NumberFormatException unused) {
                str = strL;
                i11 = -1;
            }
            String strG = bVar.a().g();
            String strI = bVar.a().i();
            String strD = bVar.a().d();
            String strF = bVar.a().f();
            String strB = bVar.a().b();
            String strJ = bVar.a().j();
            String strM = bVar.a().m();
            C2748a.this.f50207l.q0(bVar, true);
            EPG epg = C2748a.this.f50207l;
            if (epg != null) {
                epg.H();
            }
            C2748a c2748a = C2748a.this;
            EPG epg2 = c2748a.f50207l;
            if (epg2 != null) {
                epg2.a(c2748a.getContext(), this.f50238a, i11, strI, strG, strD, strF, strJ, strM, strB, str);
            }
        }

        @Override // C7.a
        public void b(int i9, D7.a aVar) {
            String strL;
            String str;
            int i10;
            try {
                strL = aVar.l();
                try {
                    str = strL;
                    i10 = Integer.parseInt(aVar.l());
                } catch (NumberFormatException unused) {
                    str = strL;
                    i10 = -1;
                }
            } catch (NumberFormatException unused2) {
                strL = "";
            }
            String strG = aVar.g();
            String strI = aVar.i();
            String strD = aVar.d();
            String strF = aVar.f();
            String strB = aVar.b();
            String strM = aVar.m();
            String strJ = aVar.j();
            EPG epg = C2748a.this.f50207l;
            if (epg != null) {
                epg.H();
            }
            C2748a c2748a = C2748a.this;
            EPG epg2 = c2748a.f50207l;
            if (epg2 != null) {
                epg2.a(c2748a.getContext(), this.f50238a, i10, strI, strG, strD, strF, strJ, strM, strB, str);
            }
        }

        @Override // C7.a
        public void c() {
            C2748a.this.f50207l.p0();
        }
    }

    /* JADX INFO: renamed from: s7.a$e */
    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: renamed from: s7.a$f */
    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            w.n0(C2748a.this.f50197a);
        }
    }

    private void B() {
        View view;
        this.f50197a = getContext();
        this.f50217v = new LiveStreamDBHandler(this.f50197a);
        if (this.f50197a != null) {
            J(false);
            if (!this.f50187M.equals("-1")) {
                if ((SharepreferenceDBHandler.getCurrentAPPType(this.f50197a).equals("m3u") ? this.f50217v.getAvailableCountM3U(this.f50187M, "live") : this.f50217v.getLiveStreamsCount(this.f50187M)) == 0 && !this.f50187M.equals("0")) {
                    ProgressBar progressBar = this.f50198c;
                    if (progressBar != null) {
                        progressBar.setVisibility(4);
                    }
                    view = this.f50208m;
                    if (view == null) {
                        return;
                    }
                    view.setVisibility(0);
                    return;
                }
                L(this.f50187M, this.f50201f, a7.f.f12269S2);
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f50197a).equals("m3u")) {
                ArrayList arrayListA = A();
                if (arrayListA == null || arrayListA.size() == 0) {
                    ProgressBar progressBar2 = this.f50198c;
                    if (progressBar2 != null) {
                        progressBar2.setVisibility(4);
                    }
                    TextView textView = this.f50208m;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    view = this.f50215t;
                    if (view == null) {
                        return;
                    }
                    view.setVisibility(0);
                    return;
                }
                L(this.f50187M, this.f50201f, a7.f.f12269S2);
            }
            ArrayList arrayListZ = z();
            if (arrayListZ == null || arrayListZ.size() == 0) {
                ProgressBar progressBar3 = this.f50198c;
                if (progressBar3 != null) {
                    progressBar3.setVisibility(4);
                }
                TextView textView2 = this.f50208m;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                view = this.f50215t;
                if (view == null) {
                    return;
                }
                view.setVisibility(0);
                return;
            }
            L(this.f50187M, this.f50201f, a7.f.f12269S2);
        }
    }

    public static C2748a D(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_ID", str);
        bundle.putString("ACTIVE_LIVE_STREAM_CATEGORY_NAME", str2);
        C2748a c2748a = new C2748a();
        c2748a.setArguments(bundle);
        return c2748a;
    }

    private void P() {
        this.f50179E = (Toolbar) getActivity().findViewById(a7.f.kh);
    }

    public ArrayList A() {
        LiveStreamDBHandler liveStreamDBHandler;
        ArrayList<FavouriteM3UModel> favouriteM3U;
        if (this.f50197a == null || (liveStreamDBHandler = this.f50217v) == null || (favouriteM3U = liveStreamDBHandler.getFavouriteM3U("live")) == null || favouriteM3U.size() == 0) {
            return null;
        }
        return favouriteM3U;
    }

    public void E() {
        J((this.f50207l == null || this.f50207l.getSelectedEvent() == null) ? false : true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(boolean r20) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C2748a.J(boolean):void");
    }

    public final void L(String str, RelativeLayout relativeLayout, int i9) {
        this.f50189O = new b(this.f50207l, 0, str, relativeLayout).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = getContext();
        this.f50197a = context;
        f50174X = new C2858a(context);
        SharedPreferences sharedPreferences = this.f50197a.getSharedPreferences("loginPrefs", 0);
        this.f50193S = sharedPreferences;
        this.f50191Q = sharedPreferences.getInt("aspect_ratio", this.f50191Q);
        Context context2 = this.f50197a;
        if (context2 != null) {
            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("openedVideo", 0);
            this.f50186L = sharedPreferences2;
            SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
            this.f50190P = this.f50197a.getSharedPreferences("epgSyncStopped", 0);
            editorEdit.putInt("openedVideoID", 0);
            editorEdit.putString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", "");
            editorEdit.apply();
        }
        if (getArguments() != null) {
            this.f50187M = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_ID");
            this.f50188N = getArguments().getString("ACTIVE_LIVE_STREAM_CATEGORY_NAME");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.f50197a == null || this.f50179E == null) {
            return;
        }
        TypedValue typedValue = new TypedValue();
        if (this.f50197a.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            TypedValue.complexToDimensionPixelSize(typedValue.data, this.f50197a.getResources().getDisplayMetrics());
        }
        for (int i9 = 0; i9 < this.f50179E.getChildCount(); i9++) {
            if (this.f50179E.getChildAt(i9) instanceof ActionMenuView) {
                ((Toolbar.g) this.f50179E.getChildAt(i9).getLayoutParams()).f39307a = 16;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i9;
        if (f50174X.x() == 3) {
            PlayerSelectedSinglton.getInstance().setPlayerType("epg");
            i9 = a7.g.f12689O2;
        } else {
            i9 = a7.g.f12695P2;
        }
        View viewInflate = layoutInflater.inflate(i9, viewGroup, false);
        this.f50198c = (ProgressBar) viewInflate.findViewById(a7.f.ec);
        this.f50199d = (TextView) viewInflate.findViewById(a7.f.wk);
        this.f50200e = (TextView) viewInflate.findViewById(a7.f.lm);
        this.f50201f = (RelativeLayout) viewInflate.findViewById(a7.f.Me);
        this.f50202g = (LinearLayout) viewInflate.findViewById(a7.f.f12378d8);
        this.f50203h = (TextView) viewInflate.findViewById(a7.f.f12585y2);
        this.f50204i = (TextView) viewInflate.findViewById(a7.f.f12565w2);
        this.f50205j = (PlayerView) viewInflate.findViewById(a7.f.Bc);
        this.f50206k = (TextView) viewInflate.findViewById(a7.f.f12575x2);
        this.f50207l = (EPG) viewInflate.findViewById(a7.f.f12269S2);
        this.f50208m = (TextView) viewInflate.findViewById(a7.f.sk);
        this.f50209n = (ProgressBar) viewInflate.findViewById(a7.f.f12086A);
        this.f50210o = (LinearLayout) viewInflate.findViewById(a7.f.f12146G);
        this.f50211p = (TextView) viewInflate.findViewById(a7.f.f12186K);
        this.f50212q = (TextView) viewInflate.findViewById(a7.f.Zh);
        this.f50213r = (NSTIJKPlayerSmallEPG) viewInflate.findViewById(a7.f.Im);
        this.f50214s = (LinearLayout) viewInflate.findViewById(a7.f.f12491p);
        this.f50215t = (RelativeLayout) viewInflate.findViewById(a7.f.Od);
        this.f50214s.setOnClickListener(new ViewOnClickListenerC0446a());
        AbstractC0519b.d(getActivity());
        setHasOptionsMenu(true);
        try {
            P();
        } catch (Exception unused) {
        }
        B();
        this.f50204i.setSelected(true);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        EPG epg = this.f50207l;
        if (epg != null) {
            epg.H();
            this.f50207l.I();
            this.f50207l.f37746X0 = true;
        }
        AsyncTask asyncTask = this.f50189O;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.f50189O.cancel(true);
        }
        EPG epg2 = this.f50207l;
        if (epg2 != null && epg2.f37737S0 == 1) {
            this.f50196V.a();
        }
        SharedPreferences sharedPreferences = this.f50197a.getSharedPreferences("openedVideo", 0);
        this.f50186L = sharedPreferences;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.clear();
        editorEdit.apply();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Context context;
        int itemId = menuItem.getItemId();
        if (itemId == a7.f.Gb) {
            startActivity(new Intent(this.f50197a, (Class<?>) NewDashboardActivity.class));
        }
        if (itemId == a7.f.Mb) {
            startActivity(new Intent(this.f50197a, (Class<?>) SettingsActivity.class));
        }
        if (itemId != a7.f.f12390f || (context = this.f50197a) == null) {
            return false;
        }
        new a.C0158a(context, k.f13456a).setTitle(getResources().getString(a7.j.f13250f3)).f(getResources().getString(a7.j.f13240e3)).j(getResources().getString(a7.j.f13132S8), new f()).g(getResources().getString(a7.j.f13231d4), new e()).n();
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        EPG epg = this.f50207l;
        if (epg != null) {
            epg.H();
            this.f50207l.I();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPrepareOptionsMenu(Menu menu) {
        menu.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        m mVar;
        SharedPreferences sharedPreferences = this.f50197a.getSharedPreferences("openedVideo", 0);
        this.f50186L = sharedPreferences;
        int i9 = sharedPreferences.getInt("openedVideoID", 0);
        String string = this.f50186L.getString("LOGIN_PREF_OPENED_VIDEO_URL_M3U", "");
        if (i9 != 0) {
            this.f50186L.edit().apply();
            if (this.f50207l != null) {
                if (f50174X.x() == 3) {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f50197a).equals("m3u") || SharepreferenceDBHandler.getCurrentAPPType(this.f50197a).equals("onestream_api")) {
                        this.f50207l.f37743V0 = Uri.parse(string);
                    } else {
                        this.f50207l.f37743V0 = Uri.parse(this.f50194T + i9 + this.f50195U);
                    }
                    EPG epg = this.f50207l;
                    epg.f37746X0 = false;
                    epg.f37711F0 = 0;
                    epg.f37717I0 = false;
                } else {
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.f50197a).equals("m3u") || SharepreferenceDBHandler.getCurrentAPPType(this.f50197a).equals("onestream_api")) {
                        this.f50213r.b0(Uri.parse(string), true, "");
                    } else {
                        this.f50213r.b0(Uri.parse(this.f50194T + i9 + this.f50195U), true, "");
                    }
                    NSTIJKPlayerSmallEPG nSTIJKPlayerSmallEPG = this.f50213r;
                    nSTIJKPlayerSmallEPG.f37397J = 0;
                    nSTIJKPlayerSmallEPG.f37401L = false;
                    nSTIJKPlayerSmallEPG.start();
                }
            }
        }
        EPG epg2 = this.f50207l;
        if (epg2 != null && epg2.f37737S0 == 1 && (mVar = this.f50196V) != null) {
            mVar.d();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        EPG epg = this.f50207l;
        if (epg != null) {
            epg.H();
            this.f50207l.I();
        }
        try {
            EPG epg2 = this.f50207l;
            if (epg2 != null && epg2.f37737S0 == 1) {
                this.f50196V.c();
            }
        } catch (Exception unused) {
        }
        super.onStop();
        this.f50183I.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getView() != null) {
            getView().setOnKeyListener(new c());
        }
    }

    public ArrayList z() {
        if (this.f50197a == null) {
            return null;
        }
        DatabaseHandler databaseHandler = new DatabaseHandler(this.f50197a);
        this.f50216u = databaseHandler;
        ArrayList<FavouriteDBModel> allFavourites = databaseHandler.getAllFavourites("live", SharepreferenceDBHandler.getUserID(this.f50197a));
        if (allFavourites == null || allFavourites.size() == 0) {
            return null;
        }
        return allFavourites;
    }
}
