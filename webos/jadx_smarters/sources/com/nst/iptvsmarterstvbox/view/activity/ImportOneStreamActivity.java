package com.nst.iptvsmarterstvbox.view.activity;

import a7.g;
import a7.j;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.nst.iptvsmarterstvbox.model.OneStreamLiveStreamDataModel;
import com.nst.iptvsmarterstvbox.model.OneStreamMovieStreamDataModel;
import com.nst.iptvsmarterstvbox.model.database.ImportStatusModel;
import com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler;
import com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.pojo.LiveDataModel;
import com.nst.iptvsmarterstvbox.view.utility.LoadingGearSpinner;
import j1.AbstractC2074a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m1.C2219a;
import m7.AbstractC2237a;
import m7.w;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.InterfaceC2389c;

/* JADX INFO: loaded from: classes4.dex */
public class ImportOneStreamActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f30299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ProgressBar f30302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f30303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f30304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f30305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f30306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LoadingGearSpinner f30307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LiveStreamDBHandler f30308q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MultiUserDBHandler f30310s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f30315x;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f30295d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f30296e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f30297f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f30298g = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A7.a f30309r = new A7.a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f30311t = "";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f30312u = "";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f30313v = "";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f30314w = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f30316y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f30317z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f30282A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f30283B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f30284C = "";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f30285D = "";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f30286E = "";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f30287F = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f30288G = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f30289H = "";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f30290I = "";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f30291J = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f30292K = "";

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public String f30293L = "";

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f30294M = "";

    public class a implements InterfaceC2389c {

        /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.activity.ImportOneStreamActivity$a$a, reason: collision with other inner class name */
        public class AsyncTaskC0273a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ProgressDialog f30319a;

            public AsyncTaskC0273a(Context context) {
                this.f30319a = new ProgressDialog(ImportOneStreamActivity.this);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                LiveStreamDBHandler liveStreamDBHandler = ImportOneStreamActivity.this.f30308q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.makeEmptyOneStreamSeriesCategories();
                }
                publishProgress(0);
                ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                LiveStreamDBHandler liveStreamDBHandler2 = importOneStreamActivity.f30308q;
                if (liveStreamDBHandler2 == null) {
                    return Boolean.FALSE;
                }
                try {
                    liveStreamDBHandler2.addonestreamSeriesCategories(importOneStreamActivity.f30298g);
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                ImportOneStreamActivity.this.I1();
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public a() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            String string;
            String string2;
            String string3;
            try {
                Log.e("Categories For series", String.valueOf(jSONObject));
                if (jSONObject != null) {
                    try {
                        jSONObject2 = new JSONObject(String.valueOf(jSONObject));
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        jSONObject2 = null;
                    }
                    try {
                        JSONArray jSONArray = jSONObject2.getJSONArray("content");
                        if (jSONArray != null) {
                            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                try {
                                    jSONObject3 = jSONArray.getJSONObject(i9);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                    jSONObject3 = null;
                                }
                                if (jSONObject3 != null) {
                                    try {
                                        string = jSONObject3.getString("category_id");
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        string = null;
                                    }
                                    try {
                                        string2 = jSONObject3.getString("category_name");
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                        string2 = null;
                                    }
                                    try {
                                        string3 = jSONObject3.getString("parent_id");
                                    } catch (Exception e13) {
                                        e13.printStackTrace();
                                        string3 = null;
                                    }
                                    ImportOneStreamActivity.this.f30298g.add(new LiveDataModel(string, string2, string3));
                                }
                            }
                        }
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                }
                if (ImportOneStreamActivity.this.f30298g == null || ImportOneStreamActivity.this.f30298g.size() <= 0) {
                    ImportOneStreamActivity.this.I1();
                } else {
                    new AsyncTaskC0273a(ImportOneStreamActivity.this.f30299h).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                }
            } catch (Exception e15) {
                e15.printStackTrace();
                ImportOneStreamActivity.this.I1();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            ImportOneStreamActivity.this.I1();
            Log.e("HONEY", "series category" + String.valueOf(c2219a));
            Toast.makeText(ImportOneStreamActivity.this.getApplicationContext(), ImportOneStreamActivity.this.getResources().getString(j.f12976D2), 0).show();
        }
    }

    public class b implements InterfaceC2389c {

        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ProgressDialog f30322a;

            public a(Context context) {
                this.f30322a = new ProgressDialog(ImportOneStreamActivity.this);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                LiveStreamDBHandler liveStreamDBHandler = ImportOneStreamActivity.this.f30308q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.makeEmptyONESTREAMMovieCategory();
                }
                publishProgress(0);
                ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                LiveStreamDBHandler liveStreamDBHandler2 = importOneStreamActivity.f30308q;
                if (liveStreamDBHandler2 == null) {
                    return Boolean.FALSE;
                }
                try {
                    liveStreamDBHandler2.addOnestreamMovieCategories(importOneStreamActivity.f30298g);
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                ImportOneStreamActivity.this.K1();
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public b() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            String string;
            String string2;
            try {
                Log.e("Categories For Live", String.valueOf(jSONObject));
                if (jSONObject != null) {
                    try {
                        JSONArray jSONArray = new JSONObject(String.valueOf(jSONObject)).getJSONArray("content");
                        if (jSONArray != null) {
                            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                String string3 = null;
                                try {
                                    jSONObject2 = jSONArray.getJSONObject(i9);
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                    jSONObject2 = null;
                                }
                                if (jSONObject2 != null) {
                                    try {
                                        string = jSONObject2.getString("category_id");
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                        string = null;
                                    }
                                    try {
                                        string2 = jSONObject2.getString("category_name");
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        string2 = null;
                                    }
                                    try {
                                        string3 = jSONObject2.getString("parent_id");
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                    ImportOneStreamActivity.this.f30298g.add(new LiveDataModel(string, string2, string3));
                                }
                            }
                        }
                    } catch (Exception e13) {
                        e13.printStackTrace();
                        if (ImportOneStreamActivity.this.f30298g != null) {
                        }
                        ImportOneStreamActivity.this.K1();
                    }
                }
            } catch (Exception e14) {
                e14.printStackTrace();
            }
            if (ImportOneStreamActivity.this.f30298g != null || ImportOneStreamActivity.this.f30298g.size() <= 0) {
                ImportOneStreamActivity.this.K1();
            } else {
                new a(ImportOneStreamActivity.this.f30299h).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            ImportOneStreamActivity.this.K1();
            Log.e("HONEY", "error in vod data " + c2219a);
        }
    }

    public class c implements InterfaceC2389c {

        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ProgressDialog f30325a;

            public a(Context context) {
                this.f30325a = new ProgressDialog(ImportOneStreamActivity.this);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                publishProgress(0);
                ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                LiveStreamDBHandler liveStreamDBHandler = importOneStreamActivity.f30308q;
                if (liveStreamDBHandler == null) {
                    return Boolean.FALSE;
                }
                try {
                    liveStreamDBHandler.addAllAvailableONESTREAMMovies(importOneStreamActivity.f30296e);
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                ImportOneStreamActivity.this.H1();
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public c() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) throws JSONException {
            JSONArray jSONArray;
            JSONObject jSONObject2;
            JSONArray jSONArray2;
            try {
                Log.e("Categories For Movie Streams", String.valueOf(jSONObject));
                if (jSONObject != null) {
                    try {
                        jSONArray = new JSONObject(String.valueOf(jSONObject)).getJSONArray("content");
                    } catch (Exception e9) {
                        e9.printStackTrace();
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                            try {
                                jSONObject2 = jSONArray.getJSONObject(i9);
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                jSONObject2 = null;
                            }
                            if (jSONObject2 != null) {
                                try {
                                    ImportOneStreamActivity.this.f30316y = jSONObject2.getString("num");
                                } catch (Exception e11) {
                                    e11.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30317z = jSONObject2.getString("name");
                                } catch (Exception e12) {
                                    e12.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30282A = jSONObject2.getString("stream_type");
                                } catch (Exception e13) {
                                    e13.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30283B = jSONObject2.getString("stream_id");
                                } catch (Exception e14) {
                                    e14.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30284C = jSONObject2.getString("stream_icon");
                                } catch (Exception e15) {
                                    e15.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30292K = jSONObject2.getString("rating");
                                } catch (Exception e16) {
                                    e16.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30293L = jSONObject2.getString("rating_5based");
                                } catch (Exception e17) {
                                    e17.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30294M = jSONObject2.getString("added");
                                } catch (Exception e18) {
                                    e18.printStackTrace();
                                }
                                try {
                                    ImportOneStreamActivity.this.f30287F = jSONObject2.getString("is_adult");
                                } catch (Exception e19) {
                                    e19.printStackTrace();
                                }
                                try {
                                    JSONObject jSONObject3 = jSONObject2.getJSONObject("links");
                                    Iterator<String> itKeys = jSONObject3.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        ImportOneStreamActivity.this.f30288G = (String) jSONObject3.get(next);
                                        Log.e("key", next);
                                    }
                                } catch (Exception e20) {
                                    e20.printStackTrace();
                                }
                                try {
                                    jSONArray2 = jSONObject2.getJSONArray("categories");
                                } catch (Exception e21) {
                                    e21.printStackTrace();
                                    jSONArray2 = null;
                                }
                                if (jSONArray2 != null && jSONArray2.length() > 0) {
                                    try {
                                        ImportOneStreamActivity.this.f30314w = jSONArray2.getString(0);
                                    } catch (Exception e22) {
                                        e22.printStackTrace();
                                    }
                                }
                                ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                                ImportOneStreamActivity.this.f30296e.add(new OneStreamMovieStreamDataModel(importOneStreamActivity.f30316y, importOneStreamActivity.f30317z, importOneStreamActivity.f30282A, importOneStreamActivity.f30283B, importOneStreamActivity.f30284C, importOneStreamActivity.f30292K, importOneStreamActivity.f30293L, importOneStreamActivity.f30294M, importOneStreamActivity.f30287F, importOneStreamActivity.f30314w, importOneStreamActivity.f30288G));
                            }
                        }
                    }
                }
            } catch (Exception e23) {
                e23.printStackTrace();
            }
            if (ImportOneStreamActivity.this.f30298g == null || ImportOneStreamActivity.this.f30298g.size() <= 0) {
                ImportOneStreamActivity.this.H1();
            } else {
                new a(ImportOneStreamActivity.this.f30299h).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            ImportOneStreamActivity.this.H1();
            Log.e("HONEY", "Categories For vod" + String.valueOf(c2219a));
        }
    }

    public class d implements InterfaceC2389c {

        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ProgressDialog f30328a;

            public a(Context context) {
                this.f30328a = new ProgressDialog(ImportOneStreamActivity.this);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                LiveStreamDBHandler liveStreamDBHandler = ImportOneStreamActivity.this.f30308q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.makeEmptyLiveCategoryOneStream();
                }
                publishProgress(0);
                ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                LiveStreamDBHandler liveStreamDBHandler2 = importOneStreamActivity.f30308q;
                if (liveStreamDBHandler2 == null) {
                    return Boolean.FALSE;
                }
                try {
                    liveStreamDBHandler2.addOneStreamLiveCategories(importOneStreamActivity.f30298g);
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                ImportOneStreamActivity.this.G1();
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public d() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) {
            JSONObject jSONObject2;
            String string;
            String string2;
            String string3;
            try {
                Log.e("Categories For Live", String.valueOf(jSONObject));
                if (jSONObject != null) {
                    try {
                        JSONArray jSONArray = new JSONObject(String.valueOf(jSONObject)).getJSONArray("content");
                        if (jSONArray != null) {
                            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                                try {
                                    try {
                                        jSONObject2 = jSONArray.getJSONObject(i9);
                                    } catch (Exception e9) {
                                        e9.printStackTrace();
                                        jSONObject2 = null;
                                    }
                                    if (jSONObject2 != null) {
                                        try {
                                            string = jSONObject2.getString("category_id");
                                        } catch (Exception e10) {
                                            e10.printStackTrace();
                                            string = "";
                                        }
                                        try {
                                            string2 = jSONObject2.getString("category_name");
                                        } catch (Exception e11) {
                                            e11.printStackTrace();
                                            string2 = "";
                                        }
                                        try {
                                            string3 = jSONObject2.getString("parent_id");
                                        } catch (Exception e12) {
                                            e12.printStackTrace();
                                            string3 = "";
                                        }
                                        ImportOneStreamActivity.this.f30298g.add(new LiveDataModel(string, string2, string3));
                                    }
                                } catch (Exception e13) {
                                    Log.e("exception", String.valueOf(e13));
                                    if (ImportOneStreamActivity.this.f30298g != null) {
                                    }
                                    ImportOneStreamActivity.this.G1();
                                }
                            }
                        }
                    } catch (Exception e14) {
                        Log.e("exception", String.valueOf(e14));
                    }
                }
                if (ImportOneStreamActivity.this.f30298g != null || ImportOneStreamActivity.this.f30298g.size() <= 0) {
                    ImportOneStreamActivity.this.G1();
                } else {
                    new a(ImportOneStreamActivity.this.f30299h).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
                }
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            ImportOneStreamActivity.this.G1();
            Log.e("Categories For Live", String.valueOf(c2219a));
        }
    }

    public class e implements InterfaceC2389c {

        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ProgressDialog f30331a;

            public a(Context context) {
                this.f30331a = new ProgressDialog(ImportOneStreamActivity.this);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                LiveStreamDBHandler liveStreamDBHandler = ImportOneStreamActivity.this.f30308q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.makeEmptyLiveStreamsOneStream();
                }
                publishProgress(0);
                ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                LiveStreamDBHandler liveStreamDBHandler2 = importOneStreamActivity.f30308q;
                if (liveStreamDBHandler2 == null) {
                    return Boolean.FALSE;
                }
                try {
                    liveStreamDBHandler2.addOneStreamAllChannels(importOneStreamActivity.f30295d);
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                ImportOneStreamActivity.this.J1();
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public e() {
        }

        @Override // p1.InterfaceC2389c
        public void a(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2;
            JSONArray jSONArray;
            int i9 = 0;
            try {
                Log.e("Categories For Live Streams", String.valueOf(jSONObject));
                LiveStreamDBHandler liveStreamDBHandler = ImportOneStreamActivity.this.f30308q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.makeEmptyLiveStreamsOneStream();
                }
                if (jSONObject != null) {
                    try {
                        JSONArray jSONArray2 = new JSONObject(String.valueOf(jSONObject)).getJSONArray("content");
                        if (jSONArray2 != null) {
                            int i10 = 0;
                            while (i10 < jSONArray2.length()) {
                                JSONArray jSONArray3 = null;
                                try {
                                    jSONObject2 = jSONArray2.getJSONObject(i10);
                                } catch (Exception e9) {
                                    e9.printStackTrace();
                                    jSONObject2 = null;
                                }
                                if (jSONObject2 != null) {
                                    try {
                                        jSONObject2 = jSONArray2.getJSONObject(i10);
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30316y = jSONObject2.getString("num");
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30317z = jSONObject2.getString("name");
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30282A = jSONObject2.getString("stream_type");
                                    } catch (Exception e13) {
                                        e13.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30283B = jSONObject2.getString("stream_id");
                                    } catch (Exception e14) {
                                        e14.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30284C = jSONObject2.getString("stream_icon");
                                    } catch (Exception e15) {
                                        e15.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30285D = jSONObject2.getString("epg_channel_id");
                                    } catch (Exception e16) {
                                        e16.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30286E = jSONObject2.getString("created_at");
                                    } catch (Exception e17) {
                                        e17.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30287F = jSONObject2.getString("is_adult");
                                    } catch (Exception e18) {
                                        e18.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30288G = jSONObject2.getString("links");
                                    } catch (Exception e19) {
                                        e19.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30289H = jSONObject2.getString("tv_archive_id");
                                    } catch (Exception e20) {
                                        e20.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30290I = jSONObject2.getString("tv_archive");
                                    } catch (Exception e21) {
                                        e21.printStackTrace();
                                    }
                                    try {
                                        ImportOneStreamActivity.this.f30291J = jSONObject2.getString("tv_archive_duration");
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        jSONArray3 = jSONObject2.getJSONArray("categories");
                                    } catch (Exception e22) {
                                        e22.printStackTrace();
                                    }
                                    if (jSONArray3 != null && jSONArray3.length() > 0) {
                                        try {
                                            ImportOneStreamActivity.this.f30314w = jSONArray3.getString(i9);
                                        } catch (Exception e23) {
                                            e23.printStackTrace();
                                        }
                                    }
                                    ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                                    jSONArray = jSONArray2;
                                    ImportOneStreamActivity.this.f30295d.add(new OneStreamLiveStreamDataModel(importOneStreamActivity.f30316y, importOneStreamActivity.f30317z, importOneStreamActivity.f30282A, importOneStreamActivity.f30283B, importOneStreamActivity.f30284C, importOneStreamActivity.f30285D, importOneStreamActivity.f30286E, importOneStreamActivity.f30287F, importOneStreamActivity.f30314w, importOneStreamActivity.f30288G, importOneStreamActivity.f30290I, importOneStreamActivity.f30289H, importOneStreamActivity.f30291J));
                                } else {
                                    jSONArray = jSONArray2;
                                }
                                i10++;
                                jSONArray2 = jSONArray;
                                i9 = 0;
                            }
                        }
                    } catch (Exception e24) {
                        e24.printStackTrace();
                        if (ImportOneStreamActivity.this.f30295d != null) {
                        }
                        ImportOneStreamActivity.this.J1();
                    }
                }
            } catch (Exception e25) {
                e25.printStackTrace();
            }
            if (ImportOneStreamActivity.this.f30295d != null || ImportOneStreamActivity.this.f30295d.size() <= 0) {
                ImportOneStreamActivity.this.J1();
            } else {
                new a(ImportOneStreamActivity.this.f30299h).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            }
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            ImportOneStreamActivity.this.J1();
            Log.e("HONEY", "Categories For Live streams" + c2219a);
        }
    }

    public class f implements InterfaceC2389c {

        public class a extends AsyncTask {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public ProgressDialog f30334a;

            public a(Context context) {
                this.f30334a = new ProgressDialog(ImportOneStreamActivity.this);
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean doInBackground(String... strArr) {
                LiveStreamDBHandler liveStreamDBHandler = ImportOneStreamActivity.this.f30308q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.makeEmptyOneStreamSeriesStreams();
                }
                publishProgress(0);
                ImportOneStreamActivity importOneStreamActivity = ImportOneStreamActivity.this;
                LiveStreamDBHandler liveStreamDBHandler2 = importOneStreamActivity.f30308q;
                if (liveStreamDBHandler2 == null) {
                    return Boolean.FALSE;
                }
                try {
                    liveStreamDBHandler2.addAllOneStreamSeriesStreams(importOneStreamActivity.f30297f);
                    return Boolean.TRUE;
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(Boolean bool) {
                LiveStreamDBHandler liveStreamDBHandler = ImportOneStreamActivity.this.f30308q;
                if (liveStreamDBHandler != null) {
                    liveStreamDBHandler.updateImportStatus("onestream_api", "1");
                }
                ImportOneStreamActivity.this.startActivity(new Intent(ImportOneStreamActivity.this.getApplicationContext(), (Class<?>) NewDashboardActivity.class));
                ImportOneStreamActivity.this.finish();
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onProgressUpdate(Integer... numArr) {
            }

            @Override // android.os.AsyncTask
            public void onPreExecute() {
            }
        }

        public f() {
        }

        /* JADX WARN: Removed duplicated region for block: B:118:0x0167 A[Catch: Exception -> 0x0018, TryCatch #6 {Exception -> 0x0018, blocks: (B:4:0x0005, B:6:0x0014, B:115:0x015c, B:116:0x015f, B:118:0x0167, B:120:0x0173, B:10:0x001b, B:112:0x0157), top: B:136:0x0005, inners: #14 }] */
        /* JADX WARN: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // p1.InterfaceC2389c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(org.json.JSONObject r25) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.view.activity.ImportOneStreamActivity.f.a(org.json.JSONObject):void");
        }

        @Override // p1.InterfaceC2389c
        public void b(C2219a c2219a) {
            Log.e("HONEY", "ERROE series streams" + String.valueOf(c2219a));
        }
    }

    private void D1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, a7.c.f11860k));
    }

    private void L1() {
        this.f30315x = this.f30299h.getSharedPreferences("loginPrefsserverurl", 0).getString(AbstractC2237a.f44454L, "");
        this.f30313v = SharepreferenceDBHandler.getOneStreamToken(this.f30299h);
        String str = this.f30315x;
        AbstractC2237a.f44482Z = str;
        Log.e("Server url", str);
        F1();
    }

    public void E1() {
    }

    public final void F1() {
        List list = this.f30298g;
        if (list != null) {
            list.clear();
        }
        AbstractC2074a.a(AbstractC2237a.f44482Z + "play/b2c/v1/categories/live?token=" + SharepreferenceDBHandler.getOneStreamToken(this.f30299h)).s(k1.e.MEDIUM).q().o(new d());
    }

    public final void G1() {
        List list = this.f30295d;
        if (list != null) {
            list.clear();
        }
        AbstractC2074a.a(AbstractC2237a.f44482Z + "play/b2c/v1/content/live?token=" + this.f30313v + "&category_id=all").s(k1.e.MEDIUM).q().o(new e());
    }

    public final void H1() {
        List list = this.f30298g;
        if (list != null) {
            list.clear();
        }
        AbstractC2074a.a(AbstractC2237a.f44482Z + "play/b2c/v1/categories/series?token=" + this.f30313v).s(k1.e.MEDIUM).q().o(new a());
    }

    public final void I1() {
        List list = this.f30297f;
        if (list != null) {
            list.clear();
        }
        AbstractC2074a.a(AbstractC2237a.f44482Z + "play/b2c/v1/content/series?token=" + this.f30313v + "&category_id=all").s(k1.e.MEDIUM).q().o(new f());
    }

    public final void J1() {
        List list = this.f30298g;
        if (list != null) {
            list.clear();
        }
        AbstractC2074a.a(AbstractC2237a.f44482Z + "play/b2c/v1/categories/vod?token=" + this.f30313v).s(k1.e.MEDIUM).q().o(new b());
    }

    public final void K1() {
        List list = this.f30296e;
        if (list != null) {
            list.clear();
        }
        AbstractC2074a.a(AbstractC2237a.f44482Z + "play/b2c/v1/content/vod?token=" + this.f30313v + "&category_id=all").s(k1.e.MEDIUM).q().o(new c());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12674M);
        this.f30300i = (TextView) findViewById(a7.f.Il);
        this.f30301j = (TextView) findViewById(a7.f.Dj);
        this.f30302k = (ProgressBar) findViewById(a7.f.Nc);
        this.f30303l = (TextView) findViewById(a7.f.Mk);
        this.f30304m = (TextView) findViewById(a7.f.pi);
        this.f30305n = (LinearLayout) findViewById(a7.f.ve);
        this.f30306o = (RelativeLayout) findViewById(a7.f.ue);
        this.f30307p = (LoadingGearSpinner) findViewById(a7.f.f12436j5);
        D1();
        getWindow().setFlags(1024, 1024);
        this.f30299h = this;
        this.f30308q = new LiveStreamDBHandler(this.f30299h);
        this.f30310s = new MultiUserDBHandler(this.f30299h);
        if (this.f30308q.getImportTableCount("onestream_api") == 0) {
            ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
            ImportStatusModel importStatusModel = new ImportStatusModel();
            importStatusModel.setType("onestream_api");
            importStatusModel.setStatus("0");
            importStatusModel.setDate("");
            arrayList.add(0, importStatusModel);
            this.f30308q.importDataStatusArrayList(arrayList, "onestream_api");
        }
        E1();
        L1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.m(this.f30299h);
        w.z0(this.f30299h);
        getWindow().setFlags(1024, 1024);
    }
}
