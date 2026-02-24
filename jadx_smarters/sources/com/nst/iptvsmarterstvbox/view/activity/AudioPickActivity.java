package com.nst.iptvsmarterstvbox.view.activity;

import a7.j;
import a7.n;
import a7.o;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
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
import com.nst.iptvsmarterstvbox.model.Myaudiofile;
import d7.InterfaceC1714b;
import e7.C1747a;
import g7.m;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m7.AbstractC2237a;
import p7.AbstractActivityC2479k;
import q7.C2620d;
import q7.C2632p;
import q7.I;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class AudioPickActivity extends AbstractActivityC2479k {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f29091A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f29093C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f29096F;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Context f29099I;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f29100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29101h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView f29103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2620d f29104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f29105l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29106m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f29108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f29109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f29110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f29111r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LinearLayout f29112s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f29113t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public RelativeLayout f29114u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RelativeLayout f29115v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ProgressBar f29116w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f29117x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f29118y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f29119z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f29102i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f29107n = new ArrayList();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f29092B = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ArrayList f29094D = new ArrayList();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public AsyncTask f29095E = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public m f29097G = new m();

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public Handler f29098H = new Handler();

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putParcelableArrayListExtra("ResultPickAudio", AudioPickActivity.this.f29107n);
            AudioPickActivity.this.setResult(-1, intent);
            AudioPickActivity.this.finish();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AudioPickActivity audioPickActivity = AudioPickActivity.this;
            audioPickActivity.f46656d.d(audioPickActivity.f29114u);
        }
    }

    public class c implements C2632p.b {
        public c() {
        }

        @Override // q7.C2632p.b
        public void a(e7.c cVar) {
            ArrayList arrayList = AudioPickActivity.this.f29094D;
            if (arrayList != null && arrayList.size() > 0) {
                AudioPickActivity.this.f29094D.clear();
                AudioPickActivity.this.f29104k.w();
            }
            AudioPickActivity.this.f29116w.setVisibility(0);
            AudioPickActivity audioPickActivity = AudioPickActivity.this;
            audioPickActivity.f46656d.d(audioPickActivity.f29114u);
            AudioPickActivity.this.f29111r.setText(cVar.c());
            AudioPickActivity.this.f29117x.clear();
            if (TextUtils.isEmpty(cVar.d())) {
                AudioPickActivity audioPickActivity2 = AudioPickActivity.this;
                audioPickActivity2.N1(audioPickActivity2.f29108o);
                AudioPickActivity.this.f29116w.setVisibility(8);
                return;
            }
            for (e7.c cVar2 : AudioPickActivity.this.f29108o) {
                if (cVar2.d().equals(cVar.d())) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(cVar2);
                    AudioPickActivity.this.N1(arrayList2);
                    return;
                }
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Intent intent = new Intent("android.provider.MediaStore.RECORD_SOUND");
            if (o.a(AudioPickActivity.this, intent)) {
                AudioPickActivity.this.startActivityForResult(intent, 769);
            } else {
                n.a(AudioPickActivity.this).c(AudioPickActivity.this.getString(j.f13012G8));
            }
        }
    }

    public class e implements InterfaceC1714b {
        public e() {
        }

        @Override // d7.InterfaceC1714b
        public void a(List list) {
            if (AudioPickActivity.this.f46657e) {
                ArrayList arrayList = new ArrayList();
                e7.c cVar = new e7.c();
                cVar.f(AudioPickActivity.this.getResources().getString(j.f13002F8));
                arrayList.add(cVar);
                arrayList.addAll(list);
                AudioPickActivity.this.f46656d.a(arrayList);
            }
            AudioPickActivity.this.f29108o = list;
            AudioPickActivity.this.N1(list);
        }
    }

    public class f implements I {
        public f() {
        }

        @Override // q7.I
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(boolean z9, C1747a c1747a) {
            if (z9) {
                AudioPickActivity.this.f29107n.add(c1747a);
                AudioPickActivity.G1(AudioPickActivity.this);
            } else {
                AudioPickActivity.this.f29107n.remove(c1747a);
                AudioPickActivity.H1(AudioPickActivity.this);
            }
            AudioPickActivity.this.f29110q.setText(AudioPickActivity.this.f29102i + "/" + AudioPickActivity.this.f29101h);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AudioPickActivity.this.f29095E = AudioPickActivity.this.new h(0).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public class h extends AsyncTask {
        public h(int i9) {
            AudioPickActivity.this.f29096F = 1;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            StringBuilder sb;
            try {
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                AudioPickActivity.this.f29094D.clear();
                for (int i9 = 0; i9 < AudioPickActivity.this.f29117x.size() && (AudioPickActivity.this.f29095E == null || !AudioPickActivity.this.f29095E.isCancelled()); i9++) {
                    C1747a c1747a = (C1747a) AudioPickActivity.this.f29117x.get(i9);
                    long length = new File(c1747a.x()).length();
                    AudioPickActivity.this.f29118y = length / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    float f9 = length / 1024;
                    if (f9 >= Constants.MB) {
                        String strValueOf = String.valueOf(Float.valueOf(decimalFormat.format(f9 / r6)).floatValue());
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
                    AudioPickActivity.this.f29119z = c1747a.x().substring(c1747a.x().lastIndexOf("/") + 1);
                    AudioPickActivity.this.f29091A = c1747a.x().substring(c1747a.x().lastIndexOf(InstructionFileId.DOT) + 1);
                    long jLastModified = new File(c1747a.x()).lastModified();
                    AudioPickActivity.this.f29093C = o.d(c1747a.O());
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(c1747a.x());
                        ByteArrayInputStream byteArrayInputStream = mediaMetadataRetriever.getEmbeddedPicture() != null ? new ByteArrayInputStream(mediaMetadataRetriever.getEmbeddedPicture()) : null;
                        mediaMetadataRetriever.release();
                        AudioPickActivity.this.f29100g = BitmapFactory.decodeStream(byteArrayInputStream);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                    AudioPickActivity audioPickActivity = AudioPickActivity.this;
                    audioPickActivity.f29094D.add(new Myaudiofile(audioPickActivity.f29119z, jLastModified, string, audioPickActivity.f29093C, audioPickActivity.f29100g));
                    if (i9 == 2 || (i9 != 0 && i9 % 50 == 0)) {
                        publishProgress(Integer.valueOf(i9));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return null;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r22) {
            super.onPostExecute(r22);
            AudioPickActivity audioPickActivity = AudioPickActivity.this;
            audioPickActivity.f29096F = 0;
            audioPickActivity.f29116w.setVisibility(8);
            AudioPickActivity.this.f29104k.s0(AudioPickActivity.this.f29094D);
            AudioPickActivity.this.f29104k.w();
            AudioPickActivity.this.f29104k.j0(AudioPickActivity.this.f29117x);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onProgressUpdate(Integer... numArr) {
            super.onProgressUpdate(numArr);
            AudioPickActivity.this.f29104k.s0(AudioPickActivity.this.f29094D);
            AudioPickActivity.this.f29104k.w();
            AudioPickActivity.this.f29104k.j0(AudioPickActivity.this.f29117x);
            AudioPickActivity.this.f29116w.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            AudioPickActivity.this.f29116w.setVisibility(0);
            if (AudioPickActivity.this.f29095E == null || !AudioPickActivity.this.f29095E.getStatus().equals(AsyncTask.Status.RUNNING)) {
                return;
            }
            AudioPickActivity.this.f29095E.cancel(true);
        }
    }

    public static /* synthetic */ int G1(AudioPickActivity audioPickActivity) {
        int i9 = audioPickActivity.f29102i;
        audioPickActivity.f29102i = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int H1(AudioPickActivity audioPickActivity) {
        int i9 = audioPickActivity.f29102i;
        audioPickActivity.f29102i = i9 - 1;
        return i9;
    }

    public final boolean K1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1747a c1747a = (C1747a) it.next();
            if (c1747a.x().equals(this.f29109p)) {
                this.f29107n.add(c1747a);
                int i9 = this.f29102i + 1;
                this.f29102i = i9;
                this.f29104k.z0(i9);
                this.f29110q.setText(this.f29102i + "/" + this.f29101h);
                return true;
            }
        }
        return false;
    }

    public final void L1() {
        TextView textView = (TextView) findViewById(a7.f.oi);
        this.f29110q = textView;
        textView.setText(this.f29102i + "/" + this.f29101h);
        this.f29103j = (RecyclerView) findViewById(a7.f.Cf);
        this.f29103j.setLayoutManager(new LinearLayoutManager(this));
        ProgressBar progressBar = (ProgressBar) findViewById(a7.f.qc);
        this.f29116w = progressBar;
        progressBar.setVisibility(0);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(a7.f.ie);
        this.f29113t = relativeLayout;
        relativeLayout.setOnClickListener(new a());
        this.f29114u = (RelativeLayout) findViewById(a7.f.Sg);
        LinearLayout linearLayout = (LinearLayout) findViewById(a7.f.f12459l8);
        this.f29112s = linearLayout;
        if (this.f46657e) {
            linearLayout.setVisibility(0);
            this.f29112s.setOnClickListener(new b());
            TextView textView2 = (TextView) findViewById(a7.f.sj);
            this.f29111r = textView2;
            textView2.setText(getResources().getString(j.f13002F8));
            this.f46656d.c(new c());
        }
        if (this.f29105l) {
            RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(a7.f.ef);
            this.f29115v = relativeLayout2;
            relativeLayout2.setVisibility(0);
            this.f29115v.setOnClickListener(new d());
        }
    }

    public final void M1() {
        AbstractC1276a.a(this, new e());
    }

    public final void N1(List list) {
        boolean z9 = false;
        this.f29116w.setVisibility(0);
        this.f29117x.clear();
        C2620d c2620d = new C2620d(this, this.f29101h);
        this.f29104k = c2620d;
        this.f29103j.setAdapter(c2620d);
        this.f29104k.k0(new f());
        boolean zK1 = this.f29106m;
        if (zK1 && !TextUtils.isEmpty(this.f29109p)) {
            File file = new File(this.f29109p);
            if (!this.f29104k.r0() && file.exists()) {
                z9 = true;
            }
            zK1 = z9;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e7.c cVar = (e7.c) it.next();
            this.f29117x.addAll(cVar.b());
            if (zK1) {
                zK1 = K1(cVar.b());
            }
        }
        Iterator it2 = this.f29107n.iterator();
        while (it2.hasNext()) {
            int iIndexOf = this.f29117x.indexOf((C1747a) it2.next());
            if (iIndexOf != -1) {
                ((C1747a) this.f29117x.get(iIndexOf)).M(true);
            }
        }
        Handler handler = this.f29098H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f29098H.postDelayed(new g(), 1000L);
        }
    }

    @Override // p7.AbstractActivityC2479k, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        if (i9 == 769 && i10 == -1) {
            if (intent.getData() != null) {
                this.f29109p = intent.getData().getPath();
            }
            M1();
        }
    }

    @Override // p7.AbstractActivityC2479k, androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29099I = this;
        super.onCreate(bundle);
        setContentView(a7.g.f12745X4);
        if (new C2858a(this.f29099I).A().equals(AbstractC2237a.f44453K0)) {
            setRequestedOrientation(0);
        } else {
            setRequestedOrientation(1);
        }
        this.f29117x = new ArrayList();
        this.f29101h = getIntent().getIntExtra("MaxNumber", 9);
        this.f29105l = getIntent().getBooleanExtra("IsNeedRecorder", false);
        this.f29106m = getIntent().getBooleanExtra("IsTakenAutoSelected", true);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AsyncTask asyncTask = this.f29095E;
        if (asyncTask != null && asyncTask.getStatus().equals(AsyncTask.Status.RUNNING)) {
            this.f29095E.cancel(true);
        }
        try {
            if (this.f29096F == 1) {
                this.f29097G.a();
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f29092B++;
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        try {
            if (this.f29096F == 1) {
                this.f29097G.c();
            }
        } catch (Exception unused) {
        }
    }

    @Override // p7.AbstractActivityC2479k
    public void u1() {
        L1();
        M1();
    }
}
