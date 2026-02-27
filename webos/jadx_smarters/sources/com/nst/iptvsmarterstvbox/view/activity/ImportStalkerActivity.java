package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.j;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nst.iptvsmarterstvbox.model.MultiUserDBModel;
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
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.view.utility.LoadingGearSpinner;
import java.util.ArrayList;
import m7.w;
import n7.e;
import q7.C2635t;
import q7.Z;
import q7.m0;
import z7.g;

/* JADX INFO: loaded from: classes4.dex */
public class ImportStalkerActivity extends androidx.appcompat.app.b implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f30336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f30337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f30338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f30339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f30340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f30342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f30343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LoadingGearSpinner f30344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LiveStreamDBHandler f30345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SharedPreferences f30346n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MultiUserDBHandler f30348p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e f30351s;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A7.a f30347o = new A7.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f30349q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f30350r = "";

    public class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StalkerGetGenresCallback f30352a;

        public a(Context context, StalkerGetGenresCallback stalkerGetGenresCallback) {
            this.f30352a = stalkerGetGenresCallback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            LiveStreamDBHandler liveStreamDBHandler = ImportStalkerActivity.this.f30345m;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.makeEmptyLiveCategoryStalker();
            }
            publishProgress(0);
            LiveStreamDBHandler liveStreamDBHandler2 = ImportStalkerActivity.this.f30345m;
            return liveStreamDBHandler2 != null ? Boolean.valueOf(liveStreamDBHandler2.addStalkerLiveCategories(this.f30352a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                ImportStalkerActivity importStalkerActivity = ImportStalkerActivity.this;
                if (importStalkerActivity.f30336d != null) {
                    e eVar = importStalkerActivity.f30351s;
                    ImportStalkerActivity importStalkerActivity2 = ImportStalkerActivity.this;
                    eVar.g(importStalkerActivity2.f30349q, importStalkerActivity2.f30350r);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class b extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StalkerGetAllChannelsCallback f30354a;

        public b(Context context, StalkerGetAllChannelsCallback stalkerGetAllChannelsCallback) {
            this.f30354a = stalkerGetAllChannelsCallback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            LiveStreamDBHandler liveStreamDBHandler = ImportStalkerActivity.this.f30345m;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.makeEmptyLiveStreamsStalker();
            }
            publishProgress(0);
            LiveStreamDBHandler liveStreamDBHandler2 = ImportStalkerActivity.this.f30345m;
            if (liveStreamDBHandler2 == null) {
                return Boolean.FALSE;
            }
            try {
                liveStreamDBHandler2.addStalkerAllChannels(this.f30354a.getJs().getData());
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                ImportStalkerActivity importStalkerActivity = ImportStalkerActivity.this;
                if (importStalkerActivity.f30336d != null) {
                    e eVar = importStalkerActivity.f30351s;
                    ImportStalkerActivity importStalkerActivity2 = ImportStalkerActivity.this;
                    eVar.p(importStalkerActivity2.f30349q, importStalkerActivity2.f30350r);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class c extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StalkerGetVodCategoriesCallback f30356a;

        public c(Context context, StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
            this.f30356a = stalkerGetVodCategoriesCallback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            LiveStreamDBHandler liveStreamDBHandler = ImportStalkerActivity.this.f30345m;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.makeEmptyMovieCategoryStalker();
            }
            publishProgress(0);
            LiveStreamDBHandler liveStreamDBHandler2 = ImportStalkerActivity.this.f30345m;
            return liveStreamDBHandler2 != null ? Boolean.valueOf(liveStreamDBHandler2.addStalkerMoviesCategories(this.f30356a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            try {
                ImportStalkerActivity importStalkerActivity = ImportStalkerActivity.this;
                if (importStalkerActivity.f30336d != null) {
                    e eVar = importStalkerActivity.f30351s;
                    ImportStalkerActivity importStalkerActivity2 = ImportStalkerActivity.this;
                    eVar.l(importStalkerActivity2.f30349q, importStalkerActivity2.f30350r);
                }
            } catch (Exception unused) {
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    public class d extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ StalkerGetSeriesCategoriesCallback f30358a;

        public d(Context context, StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
            this.f30358a = stalkerGetSeriesCategoriesCallback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            LiveStreamDBHandler liveStreamDBHandler = ImportStalkerActivity.this.f30345m;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.makeEmptySeriesCategoriesStalker();
            }
            publishProgress(0);
            LiveStreamDBHandler liveStreamDBHandler2 = ImportStalkerActivity.this.f30345m;
            return liveStreamDBHandler2 != null ? Boolean.valueOf(liveStreamDBHandler2.addSeriesCategoriesStalker(this.f30358a)) : Boolean.FALSE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            ImportStalkerActivity.this.x1();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
        }
    }

    private void w1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void z1() {
        if (this.f30336d != null) {
            this.f30346n = getSharedPreferences("loginPrefs", 0);
            ArrayList<MultiUserDBModel> userDetailsStalkerAPI = this.f30348p.getUserDetailsStalkerAPI(SharepreferenceDBHandler.getUserID(this.f30336d));
            if (userDetailsStalkerAPI == null || userDetailsStalkerAPI.size() <= 0) {
                Context context = this.f30336d;
                w.P0(context, context.getResources().getString(j.f13385s8));
                startActivity(new Intent(this.f30336d, (Class<?>) NewDashboardActivity.class));
                finish();
                return;
            }
            this.f30349q = userDetailsStalkerAPI.get(0).getMacAddress();
            String stalkerToken = SharepreferenceDBHandler.getStalkerToken(this.f30336d);
            this.f30350r = stalkerToken;
            try {
                this.f30351s.h(this.f30349q, stalkerToken);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    @Override // z7.g
    public void F(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
        try {
            LiveStreamDBHandler liveStreamDBHandler = this.f30345m;
            if (liveStreamDBHandler != null) {
                liveStreamDBHandler.updateImportStatus("all_stalker", "1");
            }
            if (stalkerGetSeriesCategoriesCallback == null || stalkerGetSeriesCategoriesCallback.getJs() == null || stalkerGetSeriesCategoriesCallback.getJs().size() <= 0) {
                x1();
            } else {
                new d(this.f30336d, stalkerGetSeriesCategoriesCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        } catch (Exception unused) {
            x1();
        }
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

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:8:0x0022, B:10:0x0026), top: B:14:0x0002 }] */
    @Override // z7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f0(com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L22
            java.util.List r0 = r3.getJs()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L22
            java.util.List r0 = r3.getJs()     // Catch: java.lang.Exception -> L2f
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2f
            if (r0 <= 0) goto L22
            com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity$a r0 = new com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity$a     // Catch: java.lang.Exception -> L2f
            android.content.Context r1 = r2.f30336d     // Catch: java.lang.Exception -> L2f
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L2f
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Exception -> L2f
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L2f
            r0.executeOnExecutor(r3, r1)     // Catch: java.lang.Exception -> L2f
            goto L2f
        L22:
            android.content.Context r3 = r2.f30336d     // Catch: java.lang.Exception -> L2f
            if (r3 == 0) goto L2f
            n7.e r3 = r2.f30351s     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = r2.f30349q     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r2.f30350r     // Catch: java.lang.Exception -> L2f
            r3.g(r0, r1)     // Catch: java.lang.Exception -> L2f
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity.f0(com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:9:0x0020, B:10:0x0030, B:12:0x0034), top: B:16:0x0002 }] */
    @Override // z7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L30
            com.nst.iptvsmarterstvbox.model.pojo.StalkerGetAllChannelsPojo r0 = r3.getJs()     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L30
            com.nst.iptvsmarterstvbox.model.pojo.StalkerGetAllChannelsPojo r0 = r3.getJs()     // Catch: java.lang.Exception -> L3d
            java.util.List r0 = r0.getData()     // Catch: java.lang.Exception -> L3d
            if (r0 == 0) goto L30
            com.nst.iptvsmarterstvbox.model.pojo.StalkerGetAllChannelsPojo r0 = r3.getJs()     // Catch: java.lang.Exception -> L3d
            java.util.List r0 = r0.getData()     // Catch: java.lang.Exception -> L3d
            int r0 = r0.size()     // Catch: java.lang.Exception -> L3d
            if (r0 <= 0) goto L30
            com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity$b r0 = new com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity$b     // Catch: java.lang.Exception -> L3d
            android.content.Context r1 = r2.f30336d     // Catch: java.lang.Exception -> L3d
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L3d
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Exception -> L3d
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L3d
            r0.executeOnExecutor(r3, r1)     // Catch: java.lang.Exception -> L3d
            goto L3d
        L30:
            android.content.Context r3 = r2.f30336d     // Catch: java.lang.Exception -> L3d
            if (r3 == 0) goto L3d
            n7.e r3 = r2.f30351s     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = r2.f30349q     // Catch: java.lang.Exception -> L3d
            java.lang.String r1 = r2.f30350r     // Catch: java.lang.Exception -> L3d
            r3.p(r0, r1)     // Catch: java.lang.Exception -> L3d
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity.i(com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[Catch: Exception -> 0x002f, TryCatch #0 {Exception -> 0x002f, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0012, B:8:0x0022, B:10:0x0026), top: B:14:0x0002 }] */
    @Override // z7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L22
            java.util.List r0 = r3.getJs()     // Catch: java.lang.Exception -> L2f
            if (r0 == 0) goto L22
            java.util.List r0 = r3.getJs()     // Catch: java.lang.Exception -> L2f
            int r0 = r0.size()     // Catch: java.lang.Exception -> L2f
            if (r0 <= 0) goto L22
            com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity$c r0 = new com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity$c     // Catch: java.lang.Exception -> L2f
            android.content.Context r1 = r2.f30336d     // Catch: java.lang.Exception -> L2f
            r0.<init>(r1, r3)     // Catch: java.lang.Exception -> L2f
            java.util.concurrent.Executor r3 = android.os.AsyncTask.THREAD_POOL_EXECUTOR     // Catch: java.lang.Exception -> L2f
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L2f
            r0.executeOnExecutor(r3, r1)     // Catch: java.lang.Exception -> L2f
            goto L2f
        L22:
            android.content.Context r3 = r2.f30336d     // Catch: java.lang.Exception -> L2f
            if (r3 == 0) goto L2f
            n7.e r3 = r2.f30351s     // Catch: java.lang.Exception -> L2f
            java.lang.String r0 = r2.f30349q     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = r2.f30350r     // Catch: java.lang.Exception -> L2f
            r3.l(r0, r1)     // Catch: java.lang.Exception -> L2f
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ImportStalkerActivity.j(com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback):void");
    }

    @Override // z7.g
    public void o0(String str) {
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a7.g.f12674M);
        this.f30337e = (TextView) findViewById(f.Il);
        this.f30338f = (TextView) findViewById(f.Dj);
        this.f30339g = (ProgressBar) findViewById(f.Nc);
        this.f30340h = (TextView) findViewById(f.Mk);
        this.f30341i = (TextView) findViewById(f.pi);
        this.f30342j = (LinearLayout) findViewById(f.ve);
        this.f30343k = (RelativeLayout) findViewById(f.ue);
        this.f30344l = (LoadingGearSpinner) findViewById(f.f12436j5);
        w1();
        getWindow().setFlags(1024, 1024);
        this.f30336d = this;
        this.f30351s = new e(this, this);
        this.f30345m = new LiveStreamDBHandler(this.f30336d);
        this.f30348p = new MultiUserDBHandler(this.f30336d);
        if (this.f30345m.getImportTableCount("stalker_api") == 0) {
            ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
            ImportStatusModel importStatusModel = new ImportStatusModel();
            importStatusModel.setType("all_stalker");
            importStatusModel.setStatus("0");
            importStatusModel.setDate("");
            arrayList.add(0, importStatusModel);
            this.f30345m.importDataStatusArrayList(arrayList, "stalker_api");
        }
        y1();
        z1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f30336d);
        w.z0(this.f30336d);
        getWindow().setFlags(1024, 1024);
    }

    @Override // z7.g
    public void q(StalkerGetVODByCatCallback stalkerGetVODByCatCallback) {
    }

    @Override // z7.g
    public void v0(String str) {
    }

    public final void x1() {
        try {
            startActivity(new Intent(this.f30336d, (Class<?>) NewDashboardActivity.class));
            finish();
        } catch (Exception unused) {
        }
    }

    @Override // z7.g
    public void y0(String str) {
    }

    public void y1() {
    }
}
