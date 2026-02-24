package com.nst.iptvsmarterstvbox.view.fragment;

import D.AbstractC0519b;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1145e;
import androidx.leanback.widget.AbstractC1169y;
import androidx.leanback.widget.C;
import androidx.leanback.widget.C1146a;
import androidx.leanback.widget.C1166v;
import androidx.leanback.widget.E;
import androidx.leanback.widget.J;
import androidx.leanback.widget.M;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SearchActivity;
import com.nst.iptvsmarterstvbox.view.fragment.a;
import d.AbstractC1617D;
import g0.AbstractC1801f;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import m7.w;
import org.joda.time.LocalDateTime;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SearchFragment extends com.nst.iptvsmarterstvbox.view.fragment.a implements a.i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public C1146a f34835A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f34836B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public LiveStreamDBHandler f34838D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Context f34839E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f34843z = new Handler();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f34837C = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f34840F = false;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public ArrayList f34841G = new ArrayList();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f34842H = 1;

    public class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList doInBackground(String... strArr) {
            return SearchFragment.this.x0();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0041, B:10:0x004f, B:12:0x005d, B:16:0x0081, B:18:0x0089, B:15:0x006b), top: B:22:0x0005 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPostExecute(java.util.ArrayList r3) {
            /*
                r2 = this;
                super.onPostExecute(r3)
                if (r3 == 0) goto L6b
                int r0 = r3.size()     // Catch: java.lang.Exception -> L69
                if (r0 <= 0) goto L6b
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                r1 = 1
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.p0(r0, r1)     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L69
                r0.x1()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L69
                r1 = 0
                r0.S1(r3, r1)     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                r3.c2()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                boolean r3 = r3.q1()     // Catch: java.lang.Exception -> L69
                if (r3 != 0) goto L81
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                boolean r3 = r3.r1()     // Catch: java.lang.Exception -> L69
                if (r3 != 0) goto L81
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                boolean r3 = r3.s1()     // Catch: java.lang.Exception -> L69
                if (r3 != 0) goto L81
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                r3.b2()     // Catch: java.lang.Exception -> L69
                goto L81
            L69:
                r3 = move-exception
                goto L9c
            L6b:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                r3.z1()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                r3.y1()     // Catch: java.lang.Exception -> L69
            L81:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                boolean r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.n0(r3)     // Catch: java.lang.Exception -> L69
                if (r3 != 0) goto L9f
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.t0(r3)     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L69
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L69
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L69
                java.lang.String r0 = "No Record Found"
                r3.a2(r0)     // Catch: java.lang.Exception -> L69
                goto L9f
            L9c:
                r3.printStackTrace()
            L9f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.b.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class c extends AsyncTask {
        public c() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList doInBackground(String... strArr) {
            return SearchFragment.this.z0();
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e3 -> B:61:0x00e6). Please report as a decompilation issue!!! */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPostExecute(java.util.ArrayList r10) {
            /*
                Method dump skipped, instruction units count: 425
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.c.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class d extends AsyncTask {
        public d() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList doInBackground(String... strArr) {
            return SearchFragment.this.A0();
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[Catch: Exception -> 0x0049, TRY_LEAVE, TryCatch #0 {Exception -> 0x0049, blocks: (B:4:0x0005, B:6:0x000b, B:9:0x004b), top: B:15:0x0005 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPostExecute(java.util.ArrayList r3) {
            /*
                r2 = this;
                super.onPostExecute(r3)
                if (r3 == 0) goto L4b
                int r0 = r3.size()     // Catch: java.lang.Exception -> L49
                if (r0 <= 0) goto L4b
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                r1 = 1
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.p0(r0, r1)     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L49
                r0.x1()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L49
                r0.y1()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                androidx.fragment.app.e r0 = r0.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r0     // Catch: java.lang.Exception -> L49
                r0.V1(r3)     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L49
                r3.e2()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L49
                r3.d2()     // Catch: java.lang.Exception -> L49
                goto L65
            L49:
                r3 = move-exception
                goto L62
            L4b:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L49
                r3.B1()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this     // Catch: java.lang.Exception -> L49
                androidx.fragment.app.e r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivity r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivity) r3     // Catch: java.lang.Exception -> L49
                r3.A1()     // Catch: java.lang.Exception -> L49
                goto L65
            L62:
                r3.printStackTrace()
            L65:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment$c r3 = new com.nst.iptvsmarterstvbox.view.fragment.SearchFragment$c
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this
                r1 = 0
                r3.<init>()
                java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragment r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.this
                java.lang.String r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.q0(r1)
                java.lang.String[] r1 = new java.lang.String[]{r1}
                android.os.AsyncTask r3 = r3.executeOnExecutor(r0, r1)
                m7.w.f44703p = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragment.d.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public final class e implements C {
        public e() {
        }

        @Override // androidx.leanback.widget.InterfaceC1148c
        public /* bridge */ /* synthetic */ void a(E.a aVar, Object obj, M.b bVar, Object obj2) {
            AbstractC1617D.a(obj2);
            b(aVar, obj, bVar, null);
        }

        public void b(E.a aVar, Object obj, M.b bVar, J j9) {
        }
    }

    public final ArrayList A0() {
        return this.f34838D.getSearchRecordsSeries(this.f34836B);
    }

    public final boolean B0(String str) {
        AbstractActivityC1145e activity = getActivity();
        this.f34839E = activity;
        return activity.getPackageManager().checkPermission(str, this.f34839E.getPackageName()) == 0;
    }

    public boolean D0() {
        return this.f34835A.i() > 0 && this.f34837C;
    }

    public final void F0() {
        ((SearchActivity) getActivity()).u1();
        ((SearchActivity) getActivity()).w1();
        ((SearchActivity) getActivity()).B1();
        ((SearchActivity) getActivity()).z1();
        ((SearchActivity) getActivity()).t1();
        ((SearchActivity) getActivity()).v1();
        ((SearchActivity) getActivity()).A1();
        ((SearchActivity) getActivity()).y1();
    }

    public final void J0(String str) {
        AsyncTask asyncTask = w.f44703p;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            w.f44703p.cancel(true);
        }
        this.f34840F = false;
        if (TextUtils.isEmpty(str) || str.equals("nil")) {
            F0();
            ((SearchActivity) getActivity()).a2("Search any Channel, Movies and Series");
        } else {
            this.f34836B = str;
            w.f44703p = new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    @Override // com.nst.iptvsmarterstvbox.view.fragment.a.i
    public AbstractC1169y n() {
        return this.f34835A;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i9, int i10, Intent intent) {
        if (i9 != 16) {
            return;
        }
        if (i10 == -1) {
            W(intent, true);
        } else {
            if (D0()) {
                return;
            }
            Log.v("SearchFragment", "Voice search canceled");
            getView().findViewById(AbstractC1801f.f41032p).requestFocus();
        }
    }

    @Override // com.nst.iptvsmarterstvbox.view.fragment.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34835A = new C1146a(new C1166v());
        this.f34839E = getActivity();
        this.f34838D = new LiveStreamDBHandler(this.f34839E);
        E.d.b(this.f34839E, "android.permission.RECORD_AUDIO");
        if (getActivity() != null) {
            AbstractC0519b.h(getActivity(), new String[]{"android.permission.RECORD_AUDIO"}, 1);
        }
        Z(this);
        T(new e());
        Log.d("SearchFragment", "User is initiating a search. Do we have RECORD_AUDIO permission? " + B0("android.permission.RECORD_AUDIO"));
        Log.d("SearchFragment", !B0("android.permission.RECORD_AUDIO") ? "Does not have RECORD_AUDIO, using SpeechRecognitionCallback" : "We DO have RECORD_AUDIO");
    }

    @Override // com.nst.iptvsmarterstvbox.view.fragment.a, androidx.fragment.app.Fragment
    public void onPause() {
        Handler handler = this.f34843z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onPause();
    }

    @Override // com.nst.iptvsmarterstvbox.view.fragment.a.i
    public boolean onQueryTextChange(String str) {
        Log.i("SearchFragment", String.format("Search text changed: %s", str));
        if (!str.equals(this.f34836B)) {
            J0(str);
        }
        return true;
    }

    @Override // com.nst.iptvsmarterstvbox.view.fragment.a.i
    public boolean onQueryTextSubmit(String str) {
        Log.i("SearchFragment", String.format("Search text submitted: %s", str));
        if (!str.equals(this.f34836B)) {
            J0(str);
        }
        return true;
    }

    public final ArrayList x0() {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(new C2858a(this.f34839E).C()));
            return this.f34838D.getEPGSearch(this.f34836B, simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + w.S(this.f34839E))));
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public final ArrayList z0() {
        return this.f34838D.getSearchRecords(this.f34836B);
    }
}
