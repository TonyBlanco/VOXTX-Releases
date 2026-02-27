package com.nst.iptvsmarterstvbox.view.fragment;

import a7.f;
import a7.g;
import android.app.Fragment;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.leanback.widget.C1146a;
import androidx.leanback.widget.C1166v;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import m7.w;
import org.joda.time.LocalDateTime;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class SearchFragmentLowerSDK extends Fragment implements Filterable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1146a f34849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34850d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LiveStreamDBHandler f34853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f34854h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public EditText f34858l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f34848a = new Handler();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34851e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f34852f = new e(this, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f34855i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f34856j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f34857k = 1;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            SearchFragmentLowerSDK.this.f34852f.filter(charSequence.toString());
        }
    }

    public class b extends AsyncTask {
        public b() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList doInBackground(String... strArr) {
            return SearchFragmentLowerSDK.this.j();
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: Exception -> 0x0099, TryCatch #0 {Exception -> 0x0099, blocks: (B:4:0x0005, B:6:0x000b, B:8:0x0041, B:10:0x004f, B:12:0x005d, B:14:0x007f, B:16:0x0087, B:13:0x0069), top: B:19:0x0005 }] */
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
                if (r3 == 0) goto L69
                int r0 = r3.size()     // Catch: java.lang.Exception -> L99
                if (r0 <= 0) goto L69
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                r1 = 1
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.e(r0, r1)     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> L99
                r0.i()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> L99
                r1 = 0
                r0.z(r3, r1)     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.J()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.b()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.c()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                boolean r3 = r3.d()     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L7f
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.I()     // Catch: java.lang.Exception -> L99
                goto L7f
            L69:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.k()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                r3.j()     // Catch: java.lang.Exception -> L99
            L7f:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                boolean r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.d(r3)     // Catch: java.lang.Exception -> L99
                if (r3 != 0) goto L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.i(r3)     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L99
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L99
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L99
                java.lang.String r0 = "No Record Found"
                r3.H(r0)     // Catch: java.lang.Exception -> L99
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.b.onPostExecute(java.util.ArrayList):void");
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
            return SearchFragmentLowerSDK.this.k();
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x014d A[Catch: Exception -> 0x0175, TRY_LEAVE, TryCatch #2 {Exception -> 0x0175, blocks: (B:37:0x00dd, B:39:0x00e3, B:40:0x0136, B:41:0x0147, B:42:0x014d), top: B:54:0x0003 }] */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onPostExecute(java.util.ArrayList r10) {
            /*
                Method dump skipped, instruction units count: 399
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.c.onPostExecute(java.util.ArrayList):void");
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
            return SearchFragmentLowerSDK.this.l();
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
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                r1 = 1
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.e(r0, r1)     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> L49
                r0.i()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> L49
                r0.j()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                android.app.Activity r0 = r0.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r0 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r0     // Catch: java.lang.Exception -> L49
                r0.C(r3)     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L49
                r3.L()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L49
                r3.K()     // Catch: java.lang.Exception -> L49
                goto L7c
            L49:
                r3 = move-exception
                goto L62
            L4b:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L49
                r3.m()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r3 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this     // Catch: java.lang.Exception -> L49
                android.app.Activity r3 = r3.getActivity()     // Catch: java.lang.Exception -> L49
                com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK r3 = (com.nst.iptvsmarterstvbox.view.activity.SearchActivityLowerSDK) r3     // Catch: java.lang.Exception -> L49
                r3.l()     // Catch: java.lang.Exception -> L49
                goto L7c
            L62:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "onPostExecute: "
                r0.append(r1)
                java.lang.String r3 = r3.getMessage()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                java.lang.String r0 = "SearchFragmentLowerSDK"
                android.util.Log.e(r0, r3)
            L7c:
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK$c r3 = new com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK$c
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r0 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this
                r3.<init>()
                java.util.concurrent.Executor r0 = android.os.AsyncTask.THREAD_POOL_EXECUTOR
                com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.this
                java.lang.String r1 = com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.f(r1)
                java.lang.String[] r1 = new java.lang.String[]{r1}
                android.os.AsyncTask r3 = r3.executeOnExecutor(r0, r1)
                m7.w.f44703p = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.fragment.SearchFragmentLowerSDK.d.onPostExecute(java.util.ArrayList):void");
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
        }
    }

    public class e extends Filter {
        public e() {
        }

        public /* synthetic */ e(SearchFragmentLowerSDK searchFragmentLowerSDK, a aVar) {
            this();
        }

        @Override // android.widget.Filter
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            SearchFragmentLowerSDK.this.n(charSequence.toString().toLowerCase());
            return new Filter.FilterResults();
        }

        @Override // android.widget.Filter
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        }
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        return this.f34852f;
    }

    public final ArrayList j() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone(new C2858a(this.f34854h).C()));
        return this.f34853g.getEPGSearch(this.f34850d, simpleDateFormat.format(Long.valueOf(LocalDateTime.now().toDateTime().getMillis() + w.S(this.f34854h))));
    }

    public final ArrayList k() {
        return this.f34853g.getSearchRecords(this.f34850d);
    }

    public final ArrayList l() {
        return this.f34853g.getSearchRecordsSeries(this.f34850d);
    }

    public final void m() {
        ((SearchActivityLowerSDK) getActivity()).f();
        ((SearchActivityLowerSDK) getActivity()).h();
        ((SearchActivityLowerSDK) getActivity()).m();
        ((SearchActivityLowerSDK) getActivity()).k();
        ((SearchActivityLowerSDK) getActivity()).e();
        ((SearchActivityLowerSDK) getActivity()).g();
        ((SearchActivityLowerSDK) getActivity()).l();
        ((SearchActivityLowerSDK) getActivity()).j();
    }

    public final void n(String str) {
        AsyncTask asyncTask = w.f44703p;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            w.f44703p.cancel(true);
        }
        this.f34855i = false;
        if (!TextUtils.isEmpty(str) && !str.equals("nil")) {
            this.f34850d = str;
            w.f44703p = new d().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        } else {
            Log.e("SearchFragmentLowerSDK", "loadQuery: hide all tabs");
            m();
            ((SearchActivityLowerSDK) getActivity()).H("Search any Channel, Movies and Series");
        }
    }

    public final void o() {
        EditText editText = this.f34858l;
        if (editText != null) {
            editText.addTextChangedListener(new a());
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34849c = new C1146a(new C1166v());
        this.f34854h = getActivity();
        this.f34853g = new LiveStreamDBHandler(this.f34854h);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setHasOptionsMenu(false);
        View viewInflate = layoutInflater.inflate(g.f12731V2, viewGroup, false);
        this.f34858l = (EditText) viewInflate.findViewById(f.f12454l3);
        o();
        return viewInflate;
    }
}
