package com.nst.iptvsmarterstvbox.view.activity;

import a7.j;
import a7.o;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c7.AbstractC1276a;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.model.Mylist;
import d4.AbstractC1681B;
import d7.InterfaceC1714b;
import g7.m;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import p7.AbstractActivityC2479k;
import q7.C2632p;
import q7.I;
import q7.h0;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class VideoPickActivity extends AbstractActivityC2479k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f32846A;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f32850E;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Context f32853H;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32854g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView f32856i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h0 f32857j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32858k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f32859l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f32861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ProgressBar f32862o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f32863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f32864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LinearLayout f32865r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RelativeLayout f32866s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f32867t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public List f32868u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f32869v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f32870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f32871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f32872y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f32873z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32855h = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f32860m = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f32847B = new ArrayList();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f32848C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public AsyncTask f32849D = null;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public m f32851F = new m();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Handler f32852G = new Handler();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("ResultPickVideo", VideoPickActivity.this.f32860m);
            VideoPickActivity.this.setResult(-1, intent);
            VideoPickActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoPickActivity videoPickActivity = VideoPickActivity.this;
            videoPickActivity.f46656d.d(videoPickActivity.f32867t);
        }
    }

    public class c implements C2632p.b {
        public c() {
        }

        @Override // q7.C2632p.b
        public void a(e7.c cVar) {
            if (VideoPickActivity.this.f32857j != null) {
                if (VideoPickActivity.this.f32849D != null && VideoPickActivity.this.f32849D.getStatus().equals(AsyncTask.Status.RUNNING)) {
                    VideoPickActivity.this.f32849D.cancel(true);
                }
                VideoPickActivity.this.f32847B.clear();
                VideoPickActivity.this.f32856i.setAdapter(null);
                VideoPickActivity.this.f32857j.w();
            }
            VideoPickActivity videoPickActivity = VideoPickActivity.this;
            videoPickActivity.f46656d.d(videoPickActivity.f32867t);
            VideoPickActivity.this.f32864q.setText(cVar.c());
            VideoPickActivity.this.f32868u.clear();
            if (TextUtils.isEmpty(cVar.d())) {
                VideoPickActivity videoPickActivity2 = VideoPickActivity.this;
                videoPickActivity2.O1(videoPickActivity2.f32861n);
                return;
            }
            for (e7.c cVar2 : VideoPickActivity.this.f32861n) {
                if (cVar2.d().equals(cVar.d())) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(cVar2);
                    VideoPickActivity.this.O1(arrayList);
                    return;
                }
            }
        }
    }

    public class d implements InterfaceC1714b {
        public d() {
        }

        @Override // d7.InterfaceC1714b
        public void a(List list) {
            VideoPickActivity.this.f32862o.setVisibility(8);
            if (VideoPickActivity.this.f46657e) {
                ArrayList arrayList = new ArrayList();
                e7.c cVar = new e7.c();
                cVar.f(VideoPickActivity.this.getResources().getString(j.f13002F8));
                arrayList.add(cVar);
                arrayList.addAll(list);
                VideoPickActivity.this.f46656d.a(arrayList);
            }
            VideoPickActivity.this.f32861n = list;
            VideoPickActivity.this.O1(list);
        }
    }

    public class e implements I {
        public e() {
        }

        @Override // q7.I
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean z9, e7.f fVar) {
            if (z9) {
                VideoPickActivity.this.f32860m.add(fVar);
                VideoPickActivity.J1(VideoPickActivity.this);
            } else {
                VideoPickActivity.this.f32860m.remove(fVar);
                VideoPickActivity.K1(VideoPickActivity.this);
            }
            VideoPickActivity.this.f32863p.setText(VideoPickActivity.this.f32855h + "/" + VideoPickActivity.this.f32854g);
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoPickActivity.this.f32849D = VideoPickActivity.this.new g(0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        }
    }

    public class g extends AsyncTask {
        public g(int i9) {
            VideoPickActivity.this.f32850E = 1;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(String... strArr) {
            m mVar;
            StringBuilder sb;
            int i9 = 0;
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                VideoPickActivity.this.f32847B.clear();
                int i10 = 0;
                while (i10 < VideoPickActivity.this.f32868u.size()) {
                    m mVar2 = VideoPickActivity.this.f32851F;
                    if (mVar2 != null) {
                        try {
                            mVar2.e();
                        } catch (InterruptedException e9) {
                            e9.printStackTrace();
                        }
                    }
                    if ((VideoPickActivity.this.f32849D != null && VideoPickActivity.this.f32849D.isCancelled()) || ((mVar = VideoPickActivity.this.f32851F) != null && mVar.b())) {
                        AbstractC1681B.b("hgsdfhg", "hgshf");
                        break;
                    }
                    e7.f fVar = (e7.f) VideoPickActivity.this.f32868u.get(i10);
                    long length = new File(fVar.x()).length();
                    VideoPickActivity.this.f32869v = length / 1024;
                    float f9 = length / 1024;
                    if (f9 >= Constants.MB) {
                        String strValueOf = String.valueOf(Float.valueOf(decimalFormat.format(f9 / r8)).floatValue());
                        sb = new StringBuilder();
                        sb.append(strValueOf);
                        sb.append(" GB");
                    } else if (f9 >= 1024) {
                        String strValueOf2 = String.valueOf(Float.valueOf(decimalFormat.format(f9 / 1024.0f)).floatValue());
                        sb = new StringBuilder();
                        sb.append(strValueOf2);
                        sb.append(" MB");
                    } else {
                        String strValueOf3 = String.valueOf(f9);
                        sb = new StringBuilder();
                        sb.append(strValueOf3);
                        sb.append(" KB");
                    }
                    String string = sb.toString();
                    VideoPickActivity.this.f32870w = fVar.x().substring(fVar.x().lastIndexOf("/") + 1);
                    VideoPickActivity.this.f32871x = fVar.x().substring(fVar.x().lastIndexOf(InstructionFileId.DOT) + 1);
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(fVar.x());
                    Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                    try {
                        VideoPickActivity.this.f32872y = frameAtTime.getWidth();
                        VideoPickActivity.this.f32873z = frameAtTime.getHeight();
                    } catch (Exception unused) {
                        VideoPickActivity videoPickActivity = VideoPickActivity.this;
                        videoPickActivity.f32872y = i9;
                        videoPickActivity.f32873z = i9;
                    }
                    long jLastModified = new File(fVar.x()).lastModified();
                    VideoPickActivity.this.f32846A = o.d(fVar.O());
                    VideoPickActivity videoPickActivity2 = VideoPickActivity.this;
                    videoPickActivity2.f32847B.add(new Mylist(videoPickActivity2.f32870w, jLastModified, string, videoPickActivity2.f32872y, videoPickActivity2.f32873z, videoPickActivity2.f32846A, videoPickActivity2.f32871x));
                    if (i10 == 10 || (i10 != 0 && i10 % 10 == 0)) {
                        publishProgress(Integer.valueOf(i10));
                    }
                    i10++;
                    i9 = 0;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            VideoPickActivity videoPickActivity = VideoPickActivity.this;
            videoPickActivity.f32850E = 0;
            videoPickActivity.f32862o.setVisibility(8);
            VideoPickActivity.this.f32857j.q0(VideoPickActivity.this.f32847B);
            VideoPickActivity.this.f32857j.w();
            VideoPickActivity.this.f32857j.j0(VideoPickActivity.this.f32868u);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            VideoPickActivity.this.f32862o.setVisibility(8);
            VideoPickActivity.this.f32857j.q0(VideoPickActivity.this.f32847B);
            VideoPickActivity.this.f32857j.w();
            VideoPickActivity.this.f32857j.j0(VideoPickActivity.this.f32868u);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            VideoPickActivity.this.f32862o.setVisibility(0);
            if (VideoPickActivity.this.f32849D == null || !VideoPickActivity.this.f32849D.getStatus().equals(AsyncTask.Status.RUNNING)) {
                return;
            }
            VideoPickActivity.this.f32849D.cancel(true);
        }
    }

    public static /* synthetic */ int J1(VideoPickActivity videoPickActivity) {
        int i9 = videoPickActivity.f32855h;
        videoPickActivity.f32855h = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int K1(VideoPickActivity videoPickActivity) {
        int i9 = videoPickActivity.f32855h;
        videoPickActivity.f32855h = i9 - 1;
        return i9;
    }

    private boolean L1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e7.f fVar = (e7.f) it.next();
            if (fVar.x().equals(this.f32857j.f48383j)) {
                this.f32860m.add(fVar);
                int i9 = this.f32855h + 1;
                this.f32855h = i9;
                this.f32857j.t0(i9);
                this.f32863p.setText(this.f32855h + "/" + this.f32854g);
                return true;
            }
        }
        return false;
    }

    private void M1() {
        TextView textView = (TextView) findViewById(a7.f.oi);
        this.f32863p = textView;
        textView.setText(this.f32855h + "/" + this.f32854g);
        this.f32856i.setLayoutManager(new LinearLayoutManager(this));
        this.f32862o = (ProgressBar) findViewById(a7.f.qc);
        if (new File(getExternalCacheDir().getAbsolutePath() + File.separator + "FilePick").exists()) {
            this.f32862o.setVisibility(8);
        } else {
            this.f32862o.setVisibility(0);
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(a7.f.ie);
        this.f32866s = relativeLayout;
        relativeLayout.setOnClickListener(new a());
        this.f32867t = (RelativeLayout) findViewById(a7.f.Sg);
        LinearLayout linearLayout = (LinearLayout) findViewById(a7.f.f12459l8);
        this.f32865r = linearLayout;
        if (this.f46657e) {
            linearLayout.setVisibility(0);
            this.f32865r.setOnClickListener(new b());
            TextView textView2 = (TextView) findViewById(a7.f.sj);
            this.f32864q = textView2;
            textView2.setText(getResources().getString(j.f13002F8));
            try {
                this.f46656d.c(new c());
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    private void N1() {
        AbstractC1276a.b(this, new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O1(List list) {
        boolean zL1 = this.f32859l;
        h0 h0Var = new h0(this, this.f32858k, this.f32854g);
        this.f32857j = h0Var;
        this.f32856i.setAdapter(h0Var);
        if (zL1 && !TextUtils.isEmpty(this.f32857j.f48383j)) {
            zL1 = !this.f32857j.p0() && new File(this.f32857j.f48383j).exists();
        }
        this.f32868u.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e7.c cVar = (e7.c) it.next();
            this.f32868u.addAll(cVar.b());
            if (zL1) {
                zL1 = L1(cVar.b());
            }
        }
        Iterator it2 = this.f32860m.iterator();
        while (it2.hasNext()) {
            int iIndexOf = this.f32868u.indexOf((e7.f) it2.next());
            if (iIndexOf != -1) {
                ((e7.f) this.f32868u.get(iIndexOf)).M(true);
            }
        }
        this.f32857j.k0(new e());
        Handler handler = this.f32852G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f32852G.postDelayed(new f(), 1000L);
        }
    }

    @Override // p7.AbstractActivityC2479k, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f32853H = this;
        super.onCreate(bundle);
        setContentView(a7.g.f12751Y4);
        if (new C2858a(this.f32853H).A().equals(AbstractC2237a.f44453K0)) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
        this.f32868u = new ArrayList();
        this.f32854g = getIntent().getIntExtra("MaxNumber", 9);
        this.f32858k = getIntent().getBooleanExtra("IsNeedCamera", false);
        this.f32859l = getIntent().getBooleanExtra("IsTakenAutoSelected", true);
        RecyclerView recyclerView = (RecyclerView) findViewById(a7.f.Gf);
        this.f32856i = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f32849D;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.f32849D.cancel(true);
        }
        try {
            if (this.f32850E == 1) {
                this.f32851F.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f32848C++;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        try {
            if (this.f32850E == 1) {
                this.f32851F.d();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            if (this.f32850E == 1) {
                this.f32851F.c();
            }
        } catch (Exception unused) {
        }
    }

    @Override // p7.AbstractActivityC2479k
    public void u1() {
        M1();
        N1();
    }
}
