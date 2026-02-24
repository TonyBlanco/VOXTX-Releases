package q7;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.ExpandedControlsActivity;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import com.nst.iptvsmarterstvbox.model.EpisodesUsingSinglton;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerCreatePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerDeletePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerShortEPGCallback;
import com.nst.iptvsmarterstvbox.model.database.DatabaseHandler;
import com.nst.iptvsmarterstvbox.model.database.DownloadedDBHandler;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import com.nst.iptvsmarterstvbox.view.activity.DownloadedMovies;
import com.nst.iptvsmarterstvbox.view.activity.ExoPlayerMoviesSeries;
import com.nst.iptvsmarterstvbox.view.activity.HoneyPlayer;
import com.nst.iptvsmarterstvbox.view.activity.PlayExternalPlayerActivity;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.NSTIJKPlayerSeriesThumbnail;
import com.nst.iptvsmarterstvbox.view.services.VideoDownloadService;
import i7.AbstractC1902a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k.U;
import m7.AbstractC2237a;
import o4.C2328e;
import p4.C2434i;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import w7.C2937a;
import z3.AbstractServiceC3053x;
import z3.C3052w;

/* JADX INFO: renamed from: q7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2630n extends RecyclerView.g implements z7.j {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static String f48926T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static String f48927U;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f48928A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f48929B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f48930C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f48931D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f48932E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public SharedPreferences f48933F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f48934G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f48935H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f48936I;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public NSTIJKPlayerSeriesThumbnail f48938K;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f48941N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public String f48942O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public n7.g f48943P;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public DownloadedDBHandler f48947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f48948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public RecyclerView f48949f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f48951h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SharedPreferences f48953j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DatabaseHandler f48954k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LiveStreamDBHandler f48955l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f48956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f48957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Date f48958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public DateFormat f48960q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public SimpleDateFormat f48961r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f48964u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C2328e f48966w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public androidx.appcompat.app.a f48968y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f48969z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48950g = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f48962s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f48963t = "mp4";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f48965v = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Handler f48937J = new Handler();

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f48939L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f48940M = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f48944Q = "";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C2434i.a f48945R = new c();

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public BroadcastReceiver f48946S = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f48952i = EpisodesUsingSinglton.getInstance().getCurrentSeasonEpisodeList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f48967x = m7.w.S0(C2937a.a());

    /* JADX INFO: renamed from: q7.n$a */
    public class a implements U.c {
        public a() {
        }

        @Override // k.U.c
        public void a(k.U u9) {
        }
    }

    /* JADX INFO: renamed from: q7.n$b */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String stringExtra = intent.getStringExtra("status");
                int i9 = 0;
                if (stringExtra.equals("completed")) {
                    int intExtra = intent.getIntExtra("percent", 0);
                    String stringExtra2 = intent.getStringExtra("url");
                    Log.i("getPercent", "percent:" + intExtra);
                    C2630n c2630n = C2630n.this;
                    c2630n.f48948e = c2630n.f48947d.getDownloadedData();
                    while (i9 < C2630n.this.f48948e.size()) {
                        if (((DownloadedDataModel) C2630n.this.f48948e.get(i9)).getMovieURL().equals(stringExtra2)) {
                            ((DownloadedDataModel) C2630n.this.f48948e.get(i9)).setMovieState("Completed");
                            ((DownloadedDataModel) C2630n.this.f48948e.get(i9)).setMoviePercentage(intExtra);
                        } else {
                            i9++;
                        }
                    }
                    return;
                }
                if (!stringExtra.equals("downloading")) {
                    if (stringExtra.equals("failed")) {
                        int intExtra2 = intent.getIntExtra("percent", 0);
                        String stringExtra3 = intent.getStringExtra("url");
                        Log.i("getPercent", "percent:" + intExtra2);
                        C2630n c2630n2 = C2630n.this;
                        c2630n2.f48948e = c2630n2.f48947d.getDownloadedData();
                        while (i9 < C2630n.this.f48948e.size()) {
                            if (((DownloadedDataModel) C2630n.this.f48948e.get(i9)).getMovieURL().equals(stringExtra3)) {
                                ((DownloadedDataModel) C2630n.this.f48948e.get(i9)).setMovieState("Failed");
                                ((DownloadedDataModel) C2630n.this.f48948e.get(i9)).setMoviePercentage(intExtra2);
                            } else {
                                i9++;
                            }
                        }
                        return;
                    }
                    return;
                }
                int intExtra3 = intent.getIntExtra("percent", 0);
                String stringExtra4 = intent.getStringExtra("url");
                Log.i("getPercent", "percent:" + intExtra3 + "changedPercentage:");
                if (intExtra3 != 0) {
                    for (int i10 = 0; i10 < C2630n.this.f48948e.size(); i10++) {
                        if (((DownloadedDataModel) C2630n.this.f48948e.get(i10)).getMovieURL().equals(stringExtra4)) {
                            if (((DownloadedDataModel) C2630n.this.f48948e.get(i10)).getMovieState().equals("Waiting")) {
                                C2630n c2630n3 = C2630n.this;
                                c2630n3.f48948e = c2630n3.f48947d.getDownloadedData();
                                C2630n.this.w();
                                Log.i("methodCalled", "waiting");
                                return;
                            }
                            ((DownloadedDataModel) C2630n.this.f48948e.get(i10)).setMoviePercentage(intExtra3);
                            int childCount = C2630n.this.f48949f.getChildCount();
                            while (i9 < childCount) {
                                l lVar = new l(C2630n.this.f48949f.getChildAt(i9));
                                if (lVar.f49052v.getText().toString().equals("Downloading..")) {
                                    lVar.f49051u.setProgress(intExtra3);
                                    Log.i("posIS", "pos:" + i9);
                                    return;
                                }
                                i9++;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
                C2630n.this.w();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.n$c */
    public class c extends C2434i.a {
        public c() {
        }

        @Override // p4.C2434i.a
        public void g() {
            int iN;
            try {
                if (C2630n.this.f48966w == null || (iN = C2630n.this.f48966w.r().n()) == C2630n.this.f48940M) {
                    return;
                }
                if (iN == 2 || iN == 3) {
                    C2630n.this.w();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.n$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48973a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48975d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48976e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48977f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48978g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48979h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48980i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48981j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48982k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48983l;

        public d(String str, int i9, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f48973a = str;
            this.f48974c = i9;
            this.f48975d = i10;
            this.f48976e = i11;
            this.f48977f = str2;
            this.f48978g = str3;
            this.f48979h = str4;
            this.f48980i = str5;
            this.f48981j = str6;
            this.f48982k = str7;
            this.f48983l = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("stalker_api")) {
                try {
                    m7.w.N0(C2630n.this.f48951h);
                    C2630n.this.f48943P.c(SharepreferenceDBHandler.getLoggedInMacAddress(C2630n.this.f48951h), SharepreferenceDBHandler.getStalkerToken(C2630n.this.f48951h), this.f48973a, String.valueOf(this.f48974c), view, "vod", this.f48975d, this.f48976e, this.f48977f, this.f48978g, this.f48979h, this.f48980i, this.f48981j, "", 0, "", "");
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            Log.i("urlIsHere", "url:" + this.f48982k);
            C2630n.this.W0(this.f48975d, this.f48976e, this.f48977f, this.f48978g, this.f48979h, this.f48980i, this.f48981j, view, this.f48983l, this.f48982k);
        }
    }

    /* JADX INFO: renamed from: q7.n$e */
    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48985a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f48988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f48989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f48990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f48991h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f48992i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48993j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48994k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48995l;

        public e(String str, int i9, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f48985a = str;
            this.f48986c = i9;
            this.f48987d = i10;
            this.f48988e = i11;
            this.f48989f = str2;
            this.f48990g = str3;
            this.f48991h = str4;
            this.f48992i = str5;
            this.f48993j = str6;
            this.f48994k = str7;
            this.f48995l = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("stalker_api")) {
                try {
                    m7.w.N0(C2630n.this.f48951h);
                    C2630n.this.f48943P.c(SharepreferenceDBHandler.getLoggedInMacAddress(C2630n.this.f48951h), SharepreferenceDBHandler.getStalkerToken(C2630n.this.f48951h), this.f48985a, String.valueOf(this.f48986c), view, "vod", this.f48987d, this.f48988e, this.f48989f, this.f48990g, this.f48991h, this.f48992i, this.f48993j, "", 0, "", "");
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            Log.i("urlIsHere", "url:" + this.f48994k);
            C2630n.this.W0(this.f48987d, this.f48988e, this.f48989f, this.f48990g, this.f48991h, this.f48992i, this.f48993j, view, this.f48995l, this.f48994k);
        }
    }

    /* JADX INFO: renamed from: q7.n$f */
    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f48997a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f48998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f48999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f49000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49002g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f49003h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f49004i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f49005j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f49006k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f49007l;

        public f(String str, int i9, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
            this.f48997a = str;
            this.f48998c = i9;
            this.f48999d = i10;
            this.f49000e = i11;
            this.f49001f = str2;
            this.f49002g = str3;
            this.f49003h = str4;
            this.f49004i = str5;
            this.f49005j = str6;
            this.f49006k = str7;
            this.f49007l = str8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("stalker_api")) {
                try {
                    m7.w.N0(C2630n.this.f48951h);
                    C2630n.this.f48943P.c(SharepreferenceDBHandler.getLoggedInMacAddress(C2630n.this.f48951h), SharepreferenceDBHandler.getStalkerToken(C2630n.this.f48951h), this.f48997a, String.valueOf(this.f48998c), view, "vod", this.f48999d, this.f49000e, this.f49001f, this.f49002g, this.f49003h, this.f49004i, this.f49005j, "", 0, "", "");
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            Log.i("urlIsHere", "url:" + this.f49006k);
            C2630n.this.W0(this.f48999d, this.f49000e, this.f49001f, this.f49002g, this.f49003h, this.f49004i, this.f49005j, view, this.f49007l, this.f49006k);
        }
    }

    /* JADX INFO: renamed from: q7.n$g */
    public class g implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f49009a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f49011d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49012e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49013f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f49014g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f49015h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ l f49016i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f49017j;

        public g(int i9, String str, int i10, String str2, String str3, String str4, String str5, l lVar, String str6) {
            this.f49009a = i9;
            this.f49010c = str;
            this.f49011d = i10;
            this.f49012e = str2;
            this.f49013f = str3;
            this.f49014g = str4;
            this.f49015h = str5;
            this.f49016i = lVar;
            this.f49017j = str6;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2630n c2630n;
            l lVar;
            String strValueOf;
            boolean z9;
            boolean z10;
            int moviePercentage;
            int idAuto;
            String strU = SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api") ? m7.w.U(C2630n.this.f48951h, this.f49009a, this.f49010c, "series") : ((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getLinks();
            Log.i("urlISHERE", "urlIS:" + ((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getLinks());
            Log.i("clickedDownload", "listPosition:" + this.f49011d + "\nfinalStreamID:" + this.f49009a + "\nfinalContainerExtension:" + this.f49010c + "\nfinalName:" + this.f49012e + "\nStreamIcon:" + this.f49013f + "\nfinalSeasonNumber:" + this.f49014g + "\nfinalElapsed_time:" + this.f49015h + "\nurl:" + strU);
            if (((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getDuration() != null) {
                try {
                    Log.i("duration", "hours:" + ((int) (m7.w.r0(((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getDurationSec()) / 3600.0f)) + "\nminutes:" + Math.round((m7.w.r0(((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getDurationSec()) % 3600.0f) / 60.0f) + "\nduration:" + ((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getDurationSec() + "\nposition" + this.f49011d);
                } catch (Exception unused) {
                }
            }
            String strTrim = this.f49016i.f49052v.getText().toString().trim();
            if (strTrim.equalsIgnoreCase(C2630n.this.f48951h.getResources().getString(a7.j.f13268h1).concat("..")) || strTrim.equalsIgnoreCase("Waiting..")) {
                if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api")) {
                    c2630n = C2630n.this;
                    lVar = this.f49016i;
                    strValueOf = String.valueOf(this.f49009a);
                } else {
                    c2630n = C2630n.this;
                    lVar = this.f49016i;
                    strValueOf = this.f49017j;
                }
                c2630n.a1(view, lVar, strValueOf, strU);
                return;
            }
            if (this.f49016i.f49052v.getText().toString().equals(C2630n.this.f48951h.getResources().getString(a7.j.f13258g1))) {
                Toast.makeText(C2630n.this.f48951h, "Already Downloaded", 1).show();
                return;
            }
            Toast.makeText(C2630n.this.f48951h, "Downloading Started", 1).show();
            this.f49016i.f49051u.setVisibility(0);
            this.f49016i.f49052v.setText(C2630n.this.f48951h.getResources().getString(a7.j.f13268h1).concat(".."));
            AbstractServiceC3053x.x(C2630n.this.f48951h, VideoDownloadService.class, (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api") ? new C3052w.b(String.valueOf(this.f49009a), Uri.parse(strU)) : new C3052w.b(String.valueOf(this.f49017j), Uri.parse(strU))).a(), true);
            try {
                DownloadedDBHandler downloadedDBHandler = new DownloadedDBHandler(C2630n.this.f48951h);
                ArrayList<DownloadedDataModel> downloadedData = downloadedDBHandler.getDownloadedData();
                if (downloadedData.size() <= 0) {
                    ArrayList<DownloadedDataModel> arrayList = new ArrayList<>();
                    DownloadedDataModel downloadedDataModel = new DownloadedDataModel();
                    downloadedDataModel.setMovieName(this.f49012e);
                    downloadedDataModel.setMovieExtension(this.f49010c);
                    downloadedDataModel.setMovieStreamID(SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api") ? String.valueOf(this.f49009a) : this.f49017j);
                    downloadedDataModel.setMovieDuration(((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getDurationSec());
                    downloadedDataModel.setMovieNum(String.valueOf(this.f49011d));
                    downloadedDataModel.setMovieImage(this.f49013f);
                    downloadedDataModel.setMovieURL(strU);
                    downloadedDataModel.setMovieState("Downloading");
                    downloadedDataModel.setMoviePercentage(0);
                    if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api")) {
                        downloadedDataModel.setMovieType("TYPE_API");
                    } else {
                        downloadedDataModel.setMovieType("SINGLE_STREAM");
                    }
                    arrayList.add(downloadedDataModel);
                    downloadedDBHandler.addDownloadedData(arrayList);
                    return;
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api")) {
                    z9 = false;
                    z10 = false;
                    moviePercentage = 0;
                    idAuto = 0;
                    for (int i9 = 0; i9 < downloadedData.size(); i9++) {
                        if (downloadedData.get(i9).getMovieStreamID().equals(String.valueOf(this.f49009a))) {
                            idAuto = downloadedData.get(i9).getIdAuto();
                            moviePercentage = downloadedData.get(i9).getMoviePercentage();
                            z9 = true;
                        }
                        if (downloadedData.get(i9).getMovieState().equals("Downloading")) {
                            z10 = true;
                        }
                    }
                } else {
                    z9 = false;
                    z10 = false;
                    moviePercentage = 0;
                    idAuto = 0;
                    for (int i10 = 0; i10 < downloadedData.size(); i10++) {
                        if (downloadedData.get(i10).getMovieStreamID().equals(String.valueOf(this.f49017j))) {
                            idAuto = downloadedData.get(i10).getIdAuto();
                            moviePercentage = downloadedData.get(i10).getMoviePercentage();
                            z9 = true;
                        }
                        if (downloadedData.get(i10).getMovieState().equals("Downloading")) {
                            z10 = true;
                        }
                    }
                }
                if (z9) {
                    ArrayList<DownloadedDataModel> arrayList2 = new ArrayList<>();
                    DownloadedDataModel downloadedDataModel2 = new DownloadedDataModel();
                    if (z10) {
                        downloadedDataModel2.setMovieState("Waiting");
                    } else {
                        downloadedDataModel2.setMovieState("Downloading");
                    }
                    downloadedDataModel2.setMoviePercentage(moviePercentage);
                    arrayList2.add(downloadedDataModel2);
                    downloadedDBHandler.updateDownloadedData(arrayList2, idAuto);
                } else {
                    ArrayList<DownloadedDataModel> arrayList3 = new ArrayList<>();
                    DownloadedDataModel downloadedDataModel3 = new DownloadedDataModel();
                    downloadedDataModel3.setMovieName(this.f49012e);
                    downloadedDataModel3.setMovieExtension(this.f49010c);
                    downloadedDataModel3.setMovieStreamID(SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api") ? String.valueOf(this.f49009a) : this.f49017j);
                    downloadedDataModel3.setMovieDuration(((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49011d)).getDurationSec());
                    downloadedDataModel3.setMovieNum(String.valueOf(this.f49011d));
                    downloadedDataModel3.setMovieImage(this.f49013f);
                    downloadedDataModel3.setMovieURL(strU);
                    if (z10) {
                        downloadedDataModel3.setMovieState("Waiting");
                    } else {
                        downloadedDataModel3.setMovieState("Downloading");
                    }
                    downloadedDataModel3.setMoviePercentage(0);
                    if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("api")) {
                        downloadedDataModel3.setMovieType("TYPE_API");
                    } else {
                        downloadedDataModel3.setMovieType("SINGLE_STREAM");
                    }
                    arrayList3.add(downloadedDataModel3);
                    downloadedDBHandler.addDownloadedData(arrayList3);
                }
                if (z10) {
                    this.f49016i.f49052v.setText("Waiting..");
                }
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.n$h */
    public class h implements PopupMenu.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f49019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f49020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49021c;

        public h(l lVar, String str, String str2) {
            this.f49019a = lVar;
            this.f49020b = str;
            this.f49021c = str2;
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getTitle().toString().equalsIgnoreCase("Cancel Downloading")) {
                C2630n c2630n = C2630n.this;
                c2630n.Z0(c2630n.f48951h, this.f49019a, this.f49020b, this.f49021c);
            } else if (menuItem.getTitle().toString().equalsIgnoreCase("Pause Downloading")) {
                int i9 = 0;
                Toast.makeText(C2630n.this.f48951h, "Downloading Paused", 0).show();
                AbstractServiceC3053x.z(C2630n.this.f48951h, VideoDownloadService.class, String.valueOf(this.f49020b), 1001, true);
                this.f49019a.f49052v.setText(C2630n.this.f48951h.getResources().getString(a7.j.f13212b5));
                C2630n c2630n2 = C2630n.this;
                c2630n2.f48948e = c2630n2.f48947d.getDownloadedData();
                if (C2630n.this.f48948e.size() > 0) {
                    while (true) {
                        if (i9 >= C2630n.this.f48948e.size()) {
                            break;
                        }
                        if (((DownloadedDataModel) C2630n.this.f48948e.get(i9)).getMovieStreamID().equals(this.f49020b)) {
                            int idAuto = ((DownloadedDataModel) C2630n.this.f48948e.get(i9)).getIdAuto();
                            ArrayList<DownloadedDataModel> arrayList = new ArrayList<>();
                            DownloadedDataModel downloadedDataModel = new DownloadedDataModel();
                            downloadedDataModel.setMovieState("Paused");
                            downloadedDataModel.setMoviePercentage(((DownloadedDataModel) C2630n.this.f48948e.get(i9)).getMoviePercentage());
                            arrayList.add(downloadedDataModel);
                            C2630n.this.f48947d.updateDownloadedData(arrayList, idAuto);
                            break;
                        }
                        i9++;
                    }
                }
            } else {
                C2630n.this.f48951h.startActivity(new Intent(C2630n.this.f48951h, (Class<?>) DownloadedMovies.class));
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: q7.n$i */
    public class i implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f49023a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f49025d;

        public i(Context context, String str, l lVar) {
            this.f49023a = context;
            this.f49024c = str;
            this.f49025d = lVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            Toast.makeText(this.f49023a, "Downloading Cancelled", 1).show();
            AbstractServiceC3053x.y(this.f49023a, VideoDownloadService.class, String.valueOf(this.f49024c), true);
            this.f49025d.f49052v.setText(C2630n.this.f48951h.getResources().getString(a7.j.f13143U0));
            this.f49025d.f49051u.setVisibility(8);
            this.f49025d.f49051u.setProgress(0);
            C2630n.this.f48968y.dismiss();
            try {
                C2630n c2630n = C2630n.this;
                c2630n.f48948e = c2630n.f48947d.getDownloadedData();
                if (C2630n.this.f48948e.size() > 0) {
                    for (int i10 = 0; i10 < C2630n.this.f48948e.size(); i10++) {
                        if (((DownloadedDataModel) C2630n.this.f48948e.get(i10)).getMovieStreamID().equals(this.f49024c)) {
                            C2630n.this.f48947d.deleteDownloadedData(((DownloadedDataModel) C2630n.this.f48948e.get(i10)).getIdAuto());
                            return;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q7.n$j */
    public class j implements DialogInterface.OnClickListener {
        public j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            C2630n.this.f48968y.dismiss();
        }
    }

    /* JADX INFO: renamed from: q7.n$k */
    public class k implements U.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f49028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f49029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f49030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f49031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49033f;

        public k(ArrayList arrayList, int i9, String str, String str2, String str3, String str4) {
            this.f49028a = arrayList;
            this.f49029b = i9;
            this.f49030c = str;
            this.f49031d = str2;
            this.f49032e = str3;
            this.f49033f = str4;
        }

        @Override // k.U.d
        public boolean onMenuItemClick(MenuItem menuItem) {
            Context context;
            String str;
            int i9;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            try {
                ArrayList arrayList = this.f49028a;
                if (arrayList != null && arrayList.size() > 0) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= this.f49028a.size()) {
                            break;
                        }
                        if (menuItem.getItemId() != i10) {
                            i10++;
                        } else if (menuItem.getItemId() == 0) {
                            if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("onestream_api")) {
                                context = C2630n.this.f48951h;
                                str = C2630n.this.f48930C;
                                i9 = this.f49029b;
                                str2 = "series";
                                str3 = this.f49030c;
                                str4 = "0";
                                str5 = this.f49031d;
                                str6 = this.f49032e;
                                str7 = this.f49033f;
                            } else {
                                context = C2630n.this.f48951h;
                                str = C2630n.this.f48930C;
                                i9 = this.f49029b;
                                str2 = "series";
                                str3 = this.f49030c;
                                str4 = "0";
                                str5 = this.f49031d;
                                str6 = "";
                                str7 = "";
                            }
                            m7.w.v0(context, str, i9, str2, str3, str4, str5, null, str6, str7, "");
                        } else {
                            String strU = SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("onestream_api") ? this.f49032e : m7.w.U(C2630n.this.f48951h, this.f49029b, this.f49030c, "series");
                            Intent intent = new Intent(C2630n.this.f48951h, (Class<?>) PlayExternalPlayerActivity.class);
                            intent.putExtra("url", strU);
                            intent.putExtra("app_name", ((ExternalPlayerModelClass) this.f49028a.get(i10)).getAppname());
                            intent.putExtra("packagename", ((ExternalPlayerModelClass) this.f49028a.get(i10)).getPackagename());
                            C2630n.this.f48951h.startActivity(intent);
                        }
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: q7.n$l */
    public static class l extends RecyclerView.D {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public RatingBar f49035A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public LinearLayout f49036B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public ImageView f49037C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public LinearLayout f49038D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public LinearLayout f49039E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public ProgressBar f49040F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public LinearLayout f49041G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public LinearLayout f49042H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public NSTIJKPlayerSeriesThumbnail f49043I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public LinearLayout f49044J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public ImageView f49045K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public LinearLayout f49046L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public LinearLayout f49047M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public LinearLayout f49048N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public LinearLayout f49049O;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ImageView f49050t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public ProgressBar f49051u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public TextView f49052v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public LinearLayout f49053w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public TextView f49054x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public TextView f49055y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public TextView f49056z;

        public l(View view) {
            super(view);
            this.f49050t = (ImageView) view.findViewById(a7.f.f12527s4);
            this.f49051u = (ProgressBar) view.findViewById(a7.f.Pc);
            this.f49052v = (TextView) view.findViewById(a7.f.Ki);
            this.f49053w = (LinearLayout) view.findViewById(a7.f.f12264R7);
            this.f49054x = (TextView) view.findViewById(a7.f.lk);
            this.f49055y = (TextView) view.findViewById(a7.f.mj);
            this.f49056z = (TextView) view.findViewById(a7.f.kj);
            this.f49035A = (RatingBar) view.findViewById(a7.f.bd);
            this.f49036B = (LinearLayout) view.findViewById(a7.f.Ge);
            this.f49037C = (ImageView) view.findViewById(a7.f.f12102B5);
            this.f49038D = (LinearLayout) view.findViewById(a7.f.f12178J1);
            this.f49039E = (LinearLayout) view.findViewById(a7.f.f12571w8);
            this.f49040F = (ProgressBar) view.findViewById(a7.f.pc);
            this.f49041G = (LinearLayout) view.findViewById(a7.f.l9);
            this.f49042H = (LinearLayout) view.findViewById(a7.f.f12389e8);
            this.f49043I = (NSTIJKPlayerSeriesThumbnail) view.findViewById(a7.f.Im);
            this.f49044J = (LinearLayout) view.findViewById(a7.f.Ca);
            this.f49045K = (ImageView) view.findViewById(a7.f.f12202L5);
            this.f49046L = (LinearLayout) view.findViewById(a7.f.e9);
            this.f49047M = (LinearLayout) view.findViewById(a7.f.d9);
            this.f49048N = (LinearLayout) view.findViewById(a7.f.c9);
            this.f49049O = (LinearLayout) view.findViewById(a7.f.f12448k7);
            J(false);
        }
    }

    /* JADX INFO: renamed from: q7.n$m */
    public class m implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f49057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f49058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f49059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f49060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f49061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f49062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f49063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f49064h;

        /* JADX INFO: renamed from: q7.n$m$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (m.this.f49059c != null && m.this.f49059c.f49044J != null) {
                    m.this.f49059c.f49044J.setVisibility(4);
                }
                if (m.this.f49059c == null || m.this.f49059c.f49043I == null) {
                    return;
                }
                m.this.f49059c.f49043I.setVisibility(0);
                m.this.f49059c.f49043I.Y((Activity) C2630n.this.f48951h, m.this.f49059c.f49043I);
                C2630n.this.f48936I = C2630n.this.f48931D + ":" + C2630n.this.f48932E + "/series/" + C2630n.this.f48934G + "/" + C2630n.this.f48935H + "/";
                if (SharepreferenceDBHandler.getCurrentAPPType(C2630n.this.f48951h).equals("onestream_api")) {
                    try {
                        if (m.this.f49062f != null) {
                            m.this.f49059c.f49043I.a0(Uri.parse(m.this.f49062f), true, "");
                        }
                    } catch (Exception unused) {
                    }
                } else {
                    m.this.f49059c.f49043I.a0(Uri.parse(C2630n.this.f48936I + m.this.f49060d + InstructionFileId.DOT + m.this.f49061e), true, "");
                }
                m.this.f49059c.f49043I.f36933H = 0;
                m.this.f49059c.f49043I.f36937J = false;
                m.this.f49059c.f49043I.M(m.this.f49059c.f49043I, m.this.f49059c.f49039E, m.this.f49059c.f49044J, m.this.f49059c.f49037C, m.this.f49059c.f49041G, m.this.f49059c.f49042H, m.this.f49059c.f49040F, ((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(m.this.f49064h)).getEpisode_watched_percentage());
                m.this.f49059c.f49043I.start();
                m mVar = m.this;
                C2630n.this.f48938K = mVar.f49059c.f49043I;
            }
        }

        public m(View view, LinearLayout linearLayout, l lVar, int i9, String str, int i10, String str2, String str3) {
            this.f49057a = view;
            this.f49058b = linearLayout;
            this.f49059c = lVar;
            this.f49060d = i9;
            this.f49061e = str;
            this.f49064h = i10;
            this.f49063g = str2;
            this.f49062f = str3;
        }

        public final void f(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49057a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void g(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49057a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void h(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f49057a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            View view2;
            int i9;
            ImageView imageView;
            NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail;
            LinearLayout linearLayout;
            TextView textView;
            ImageView imageView2;
            NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail2;
            ImageView imageView3;
            TextView textView2;
            try {
                if (z9) {
                    f9 = z9 ? 1.1f : 1.0f;
                    View view3 = this.f49057a;
                    if (view3 == null || view3.getTag() == null || !this.f49057a.getTag().equals("1")) {
                        View view4 = this.f49057a;
                        if (view4 == null || view4.getTag() == null || !this.f49057a.getTag().equals("2")) {
                            View view5 = this.f49057a;
                            if (view5 != null && view5.getTag() != null && this.f49057a.getTag().equals("20")) {
                                View view6 = this.f49058b;
                                if (view6 != null) {
                                    view6.setVisibility(0);
                                }
                                l lVar = this.f49059c;
                                if (lVar != null && (textView2 = lVar.f49054x) != null) {
                                    textView2.setTextColor(C2630n.this.f48951h.getResources().getColor(a7.c.f11873x));
                                }
                                l lVar2 = this.f49059c;
                                if (lVar2 != null && (imageView3 = lVar2.f49045K) != null) {
                                    imageView3.setVisibility(0);
                                }
                                C2630n.this.f48937J.removeCallbacksAndMessages(null);
                                C2630n.this.f48937J.postDelayed(new a(), 5000L);
                                return;
                            }
                            View view7 = this.f49057a;
                            if (view7 == null || view7.getTag() == null || !this.f49057a.getTag().equals("101")) {
                                g(f9);
                                return;
                            } else {
                                g(f9);
                                view2 = this.f49059c.f49053w;
                                i9 = a7.e.f12042p;
                            }
                        } else {
                            g(f9);
                            view2 = this.f49057a;
                            i9 = a7.e.f12024k1;
                        }
                    } else {
                        g(f9);
                        view2 = this.f49057a;
                        i9 = a7.e.f12010h;
                    }
                } else {
                    if (z9) {
                        return;
                    }
                    f9 = z9 ? 1.09f : 1.0f;
                    C2630n.this.f48937J.removeCallbacksAndMessages(null);
                    l lVar3 = this.f49059c;
                    if (lVar3 != null && (nSTIJKPlayerSeriesThumbnail2 = lVar3.f49043I) != null) {
                        try {
                            if (nSTIJKPlayerSeriesThumbnail2.R()) {
                                this.f49059c.f49043I.K();
                            } else {
                                this.f49059c.f49043I.e0();
                                this.f49059c.f49043I.V(true);
                                this.f49059c.f49043I.d0();
                            }
                            IjkMediaPlayer.native_profileEnd();
                        } catch (Exception unused) {
                        }
                    }
                    l lVar4 = this.f49059c;
                    if (lVar4 != null && (imageView2 = lVar4.f49045K) != null) {
                        imageView2.setVisibility(8);
                    }
                    View view8 = this.f49058b;
                    if (view8 != null) {
                        view8.setVisibility(8);
                    }
                    l lVar5 = this.f49059c;
                    if (lVar5 != null && (textView = lVar5.f49054x) != null) {
                        textView.setTextColor(-1);
                    }
                    l lVar6 = this.f49059c;
                    if (lVar6 != null && (linearLayout = lVar6.f49044J) != null) {
                        linearLayout.setVisibility(8);
                    }
                    l lVar7 = this.f49059c;
                    if (lVar7 != null && (nSTIJKPlayerSeriesThumbnail = lVar7.f49043I) != null) {
                        nSTIJKPlayerSeriesThumbnail.setVisibility(8);
                    }
                    l lVar8 = this.f49059c;
                    if (lVar8 != null && (imageView = lVar8.f49037C) != null) {
                        imageView.setVisibility(0);
                    }
                    if (this.f49059c != null && C2630n.this.f48952i != null && C2630n.this.f48952i.size() > 0) {
                        try {
                            if (C2630n.this.f48952i.get(this.f49064h) == null || ((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49064h)).getEpisode_watched_percentage() == 0) {
                                this.f49059c.f49041G.setVisibility(8);
                            } else {
                                this.f49059c.f49041G.setVisibility(0);
                                this.f49059c.f49040F.setProgress(((GetEpisdoeDetailsCallback) C2630n.this.f48952i.get(this.f49064h)).getEpisode_watched_percentage());
                            }
                        } catch (Exception unused2) {
                            this.f49059c.f49041G.setVisibility(8);
                        }
                    }
                    f(z9);
                    View view9 = this.f49057a;
                    if (view9 == null || view9.getTag() == null || !this.f49057a.getTag().equals("1")) {
                        View view10 = this.f49057a;
                        if (view10 == null || view10.getTag() == null || !this.f49057a.getTag().equals("2")) {
                            View view11 = this.f49057a;
                            if (view11 == null || view11.getTag() == null || !this.f49057a.getTag().equals("101")) {
                                g(f9);
                                h(f9);
                                return;
                            } else {
                                g(f9);
                                h(f9);
                                view2 = this.f49059c.f49053w;
                                i9 = a7.e.f11891A1;
                            }
                        } else {
                            g(f9);
                            h(f9);
                            view2 = this.f49057a;
                        }
                    } else {
                        g(f9);
                        h(f9);
                        view2 = this.f49057a;
                    }
                    i9 = a7.e.f12038o;
                }
                view2.setBackgroundResource(i9);
            } catch (Exception unused3) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2630n(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.util.List r11, java.lang.String r12, java.lang.String r13, androidx.recyclerview.widget.RecyclerView r14) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2630n.<init>(android.content.Context, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, androidx.recyclerview.widget.RecyclerView):void");
    }

    public static long Q0(SimpleDateFormat simpleDateFormat, String str, String str2) {
        try {
            return TimeUnit.DAYS.convert(simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime(), TimeUnit.MILLISECONDS);
        } catch (Exception e9) {
            e9.printStackTrace();
            return 0L;
        }
    }

    public static String R0(Context context) {
        return String.valueOf(context.getApplicationInfo().loadLabel(context.getPackageManager()));
    }

    @Override // z7.j
    public void D0(String str) {
    }

    @Override // z7.j
    public void M0(String str) {
        try {
            m7.w.X();
        } catch (Exception unused) {
        }
    }

    @Override // z7.j
    public void P(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0567, code lost:
    
        r30.f49051u.setProgress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x05db, code lost:
    
        r30.f49052v.setLayoutParams(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f9, code lost:
    
        if (r0 != 4) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0452 A[Catch: Exception -> 0x07b0, TryCatch #0 {Exception -> 0x07b0, blocks: (B:107:0x041b, B:109:0x0429, B:112:0x043a, B:113:0x043e, B:120:0x0461, B:122:0x04b9, B:182:0x07a1, B:184:0x07a5, B:186:0x07a9, B:114:0x0443, B:116:0x0452, B:117:0x0455), top: B:190:0x041b }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0455 A[Catch: Exception -> 0x07b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x07b0, blocks: (B:107:0x041b, B:109:0x0429, B:112:0x043a, B:113:0x043e, B:120:0x0461, B:122:0x04b9, B:182:0x07a1, B:184:0x07a5, B:186:0x07a9, B:114:0x0443, B:116:0x0452, B:117:0x0455), top: B:190:0x041b }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0461 A[Catch: Exception -> 0x07b0, TRY_ENTER, TryCatch #0 {Exception -> 0x07b0, blocks: (B:107:0x041b, B:109:0x0429, B:112:0x043a, B:113:0x043e, B:120:0x0461, B:122:0x04b9, B:182:0x07a1, B:184:0x07a5, B:186:0x07a9, B:114:0x0443, B:116:0x0452, B:117:0x0455), top: B:190:0x041b }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x04c4 A[Catch: Exception -> 0x07a1, TryCatch #6 {Exception -> 0x07a1, blocks: (B:123:0x04bc, B:125:0x04c4, B:127:0x04d0, B:129:0x04e9, B:133:0x0506, B:135:0x050e, B:137:0x0520, B:139:0x0541, B:140:0x0567, B:141:0x056e, B:143:0x0580, B:144:0x05a3, B:146:0x05b5, B:147:0x05db, B:148:0x05e2, B:150:0x05f4, B:151:0x0614, B:152:0x061d, B:154:0x062f, B:155:0x0645, B:156:0x064c, B:158:0x0652, B:160:0x065a, B:162:0x066c, B:164:0x068d, B:165:0x06b5, B:167:0x06c7, B:168:0x06eb, B:170:0x06fd, B:171:0x0725, B:173:0x0737, B:174:0x0759, B:176:0x076b, B:177:0x0783, B:128:0x04dd, B:178:0x078a), top: B:203:0x04bc }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x078a A[Catch: Exception -> 0x07a1, TRY_LEAVE, TryCatch #6 {Exception -> 0x07a1, blocks: (B:123:0x04bc, B:125:0x04c4, B:127:0x04d0, B:129:0x04e9, B:133:0x0506, B:135:0x050e, B:137:0x0520, B:139:0x0541, B:140:0x0567, B:141:0x056e, B:143:0x0580, B:144:0x05a3, B:146:0x05b5, B:147:0x05db, B:148:0x05e2, B:150:0x05f4, B:151:0x0614, B:152:0x061d, B:154:0x062f, B:155:0x0645, B:156:0x064c, B:158:0x0652, B:160:0x065a, B:162:0x066c, B:164:0x068d, B:165:0x06b5, B:167:0x06c7, B:168:0x06eb, B:170:0x06fd, B:171:0x0725, B:173:0x0737, B:174:0x0759, B:176:0x076b, B:177:0x0783, B:128:0x04dd, B:178:0x078a), top: B:203:0x04bc }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x079e  */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(q7.C2630n.l r30, int r31) {
        /*
            Method dump skipped, instruction units count: 1969
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C2630n.E(q7.n$l, int):void");
    }

    @Override // z7.j
    public void T0(StalkerDeletePlayerLinkCallback stalkerDeletePlayerLinkCallback) {
    }

    public final void W0(int i9, int i10, String str, String str2, String str3, String str4, String str5, View view, String str6, String str7) {
        Context context;
        String str8;
        String str9;
        String strValueOf;
        String str10;
        String str11;
        List list;
        int i11;
        String str12;
        String str13;
        String str14;
        Log.e("listpos", i9 + "cjec" + (this.f48952i.size() - 1));
        try {
            Handler handler = this.f48937J;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            AbstractC2237a.f44530p0 = true;
            AbstractC2237a.f44527o0 = i9;
            b1();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.f48951h).equals("stalker_api")) {
                String str15 = this.f48941N;
                if (str15 == null || !str15.equals("from_player")) {
                    m7.w.v0(this.f48951h, this.f48930C, i10, "series", str, String.valueOf(i9), str2, null, this.f48944Q, "", "");
                    return;
                }
                Context context2 = this.f48951h;
                if (context2 instanceof HoneyPlayer) {
                    ((HoneyPlayer) context2).r2(this.f48930C, i10, str2, "series", str6, this.f48944Q);
                    return;
                }
                return;
            }
            C2328e c2328e = this.f48966w;
            if (c2328e != null && c2328e.c()) {
                if (this.f48957n.booleanValue()) {
                    String str16 = this.f48951h.getResources().getString(a7.j.f13040J6) + " - " + str4;
                    String strU = m7.w.U(this.f48951h, i10, str, "series");
                    C2328e c2328e2 = this.f48966w;
                    if (c2328e2 != null && c2328e2.r() != null && this.f48966w.r().j() != null && this.f48966w.r().j().J() != null) {
                        this.f48939L = this.f48966w.r().j().J();
                    }
                    if (this.f48939L.equals(strU)) {
                        this.f48951h.startActivity(new Intent(this.f48951h, (Class<?>) ExpandedControlsActivity.class));
                        return;
                    } else {
                        AbstractC1902a.c(m7.w.r0(str5), true, AbstractC1902a.a(str2, str16, "", 0, strU, "videos/mp4", str3, "", null), this.f48966w, this.f48951h);
                        return;
                    }
                }
                return;
            }
            if (this.f48957n.booleanValue()) {
                if (this.f48941N.equals("from_player")) {
                    Context context3 = this.f48951h;
                    if (context3 instanceof HoneyPlayer) {
                        ((HoneyPlayer) context3).r2(this.f48930C, i10, str2, "series", str6, str7);
                        return;
                    } else {
                        if (context3 instanceof ExoPlayerMoviesSeries) {
                            ((ExoPlayerMoviesSeries) context3).k3(this.f48930C, i10, str2, "series", str6, str7);
                            return;
                        }
                        return;
                    }
                }
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                k.U u9 = new k.U(this.f48951h, view);
                u9.c().inflate(a7.h.f12930m, u9.b());
                ArrayList<ExternalPlayerModelClass> externalPlayer = new ExternalPlayerDataBase(this.f48951h).getExternalPlayer();
                if (externalPlayer != null && externalPlayer.size() > 0) {
                    u9.b().add(0, 0, 0, this.f48951h.getResources().getString(a7.j.f13155V3));
                    ExternalPlayerModelClass externalPlayerModelClass = new ExternalPlayerModelClass();
                    externalPlayerModelClass.setId(0);
                    externalPlayerModelClass.setAppname(this.f48951h.getResources().getString(a7.j.f13272h5));
                    arrayList.add(externalPlayerModelClass);
                    int i12 = 0;
                    while (i12 < externalPlayer.size()) {
                        int i13 = i12 + 1;
                        u9.b().add(0, i13, 0, this.f48951h.getResources().getString(a7.j.f13272h5) + " " + externalPlayer.get(i12).getAppname());
                        arrayList.add(externalPlayer.get(i12));
                        i12 = i13;
                    }
                    u9.f(new k(arrayList, i10, str, str2, str7, str6));
                    u9.e(new a());
                    u9.g();
                    return;
                }
                if (SharepreferenceDBHandler.getCurrentAPPType(this.f48951h).equals("onestream_api")) {
                    Log.i("urlIS", "url:" + str7);
                    context = this.f48951h;
                    str8 = this.f48930C;
                    str9 = "series";
                    strValueOf = String.valueOf(i9);
                    str11 = "";
                    list = null;
                    i11 = i10;
                    str12 = str;
                    str13 = str2;
                    str14 = str7;
                    str10 = str6;
                } else {
                    context = this.f48951h;
                    str8 = this.f48930C;
                    str9 = "series";
                    strValueOf = String.valueOf(i9);
                    str10 = "";
                    str11 = "";
                    list = null;
                    i11 = i10;
                    str12 = str;
                    str13 = str2;
                    str14 = this.f48944Q;
                }
                m7.w.v0(context, str8, i11, str9, str12, strValueOf, str13, list, str14, str10, str11);
            }
        } catch (Exception unused) {
        }
    }

    @Override // z7.j
    public void X(StalkerShortEPGCallback stalkerShortEPGCallback) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public l L(ViewGroup viewGroup, int i9) {
        LayoutInflater layoutInflaterFrom;
        int i10;
        if (this.f48942O.equals("mobile")) {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12635F2;
        } else {
            layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            i10 = a7.g.f12641G2;
        }
        l lVar = new l(layoutInflaterFrom.inflate(i10, viewGroup, false));
        this.f48956m = lVar;
        return lVar;
    }

    public final void Z0(Context context, l lVar, String str, String str2) {
        if (context != null) {
            a.C0158a c0158a = new a.C0158a(context);
            c0158a.setTitle("Are you sure want to cancel the downloading?");
            c0158a.j("Yes", new i(context, str, lVar));
            c0158a.g("No", new j());
            androidx.appcompat.app.a aVarCreate = c0158a.create();
            this.f48968y = aVarCreate;
            aVarCreate.show();
        }
    }

    public final void a1(View view, l lVar, String str, String str2) {
        PopupMenu popupMenu = new PopupMenu(this.f48951h, view);
        popupMenu.getMenuInflater().inflate(a7.h.f12920c, popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new h(lVar, str, str2));
    }

    public void b1() {
        NSTIJKPlayerSeriesThumbnail nSTIJKPlayerSeriesThumbnail = this.f48938K;
        if (nSTIJKPlayerSeriesThumbnail != null) {
            try {
                if (nSTIJKPlayerSeriesThumbnail.R()) {
                    this.f48938K.K();
                } else {
                    this.f48938K.e0();
                    this.f48938K.V(true);
                    this.f48938K.d0();
                }
                IjkMediaPlayer.native_profileEnd();
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int n() {
        try {
            List list = this.f48952i;
            if (list != null) {
                return list.size();
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // z7.j
    public void u(StalkerCreatePlayerLinkCallback stalkerCreatePlayerLinkCallback, View view, int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8) {
        try {
            m7.w.X();
            if (stalkerCreatePlayerLinkCallback != null && stalkerCreatePlayerLinkCallback.getJs() != null && stalkerCreatePlayerLinkCallback.getJs().getCmd() != null && stalkerCreatePlayerLinkCallback.getJs().getId() != null) {
                try {
                    this.f48944Q = stalkerCreatePlayerLinkCallback.getJs().getCmd();
                    W0(i9, i10, str, str2, str3, str4, str5, view, "", "");
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }
}
