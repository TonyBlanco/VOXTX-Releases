package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.ExternalPlayerDataBase;
import com.nst.iptvsmarterstvbox.model.pojo.ExternalPlayerModelClass;
import java.util.ArrayList;
import m7.AbstractC2237a;
import m7.w;
import q7.C2618b;
import u7.C2858a;

/* JADX INFO: loaded from: classes4.dex */
public class AddedExternalPlayerActivity extends androidx.appcompat.app.b implements View.OnClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f29050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f29051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f29052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f29053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f29054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f29055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ExternalPlayerDataBase f29056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f29057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2858a f29058l;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.j(AddedExternalPlayerActivity.this.f29050d);
        }
    }

    public class b extends AsyncTask {
        public b() {
        }

        public /* synthetic */ b(AddedExternalPlayerActivity addedExternalPlayerActivity, a aVar) {
            this();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Boolean... boolArr) {
            return AddedExternalPlayerActivity.this.y1();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            AddedExternalPlayerActivity.this.f29051e.setVisibility(8);
            if (!bool.booleanValue()) {
                AddedExternalPlayerActivity.this.z1(Boolean.FALSE);
                return;
            }
            AddedExternalPlayerActivity.this.z1(Boolean.TRUE);
            AddedExternalPlayerActivity addedExternalPlayerActivity = AddedExternalPlayerActivity.this;
            addedExternalPlayerActivity.f29053g.setLayoutManager(new LinearLayoutManager(addedExternalPlayerActivity.f29050d, 1, false));
            AddedExternalPlayerActivity.this.f29053g.setAdapter(new C2618b(AddedExternalPlayerActivity.this.f29050d, AddedExternalPlayerActivity.this.f29057k, AddedExternalPlayerActivity.this));
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            super.onPreExecute();
            AddedExternalPlayerActivity.this.f29052f.setVisibility(8);
            AddedExternalPlayerActivity.this.f29053g.setVisibility(8);
            AddedExternalPlayerActivity.this.f29051e.setVisibility(0);
        }
    }

    public void A1() {
        new b(this, null).execute(new Boolean[0]);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.Y8 || id == f.wh || id == f.f12273S6 || id == f.f12567w4) {
            startActivity(new Intent(this, (Class<?>) ExternalPlayerActivity.class));
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f29050d = this;
        super.onCreate(bundle);
        C2858a c2858a = new C2858a(this.f29050d);
        this.f29058l = c2858a;
        setContentView(c2858a.A().equals(AbstractC2237a.f44453K0) ? g.f12792f : g.f12786e);
        this.f29051e = (LinearLayout) findViewById(f.B9);
        this.f29052f = (LinearLayout) findViewById(f.Y8);
        this.f29053g = (RecyclerView) findViewById(f.Cd);
        this.f29054h = (LinearLayout) findViewById(f.f12273S6);
        findViewById(f.f12567w4).setOnClickListener(this);
        findViewById(f.wh).setOnClickListener(this);
        findViewById(f.Y8).setOnClickListener(this);
        Log.e("current:", "add external player");
        this.f29054h.setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(f.Xa);
        this.f29055i = imageView;
        imageView.setOnClickListener(new a());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        w.z0(this.f29050d);
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
        A1();
    }

    public final Boolean y1() {
        ExternalPlayerDataBase externalPlayerDataBase = new ExternalPlayerDataBase(this.f29050d);
        this.f29056j = externalPlayerDataBase;
        ArrayList<ExternalPlayerModelClass> externalPlayer = externalPlayerDataBase.getExternalPlayer();
        this.f29057k = externalPlayer;
        if (externalPlayer != null && externalPlayer.size() > 0) {
            for (int i9 = 0; i9 < this.f29057k.size(); i9++) {
                String appname = ((ExternalPlayerModelClass) this.f29057k.get(i9)).getAppname();
                if (!w.l(((ExternalPlayerModelClass) this.f29057k.get(i9)).getPackagename(), this.f29050d)) {
                    this.f29056j.removePlayer(appname);
                }
            }
        }
        this.f29057k = new ArrayList();
        ArrayList<ExternalPlayerModelClass> externalPlayer2 = this.f29056j.getExternalPlayer();
        this.f29057k = externalPlayer2;
        return (externalPlayer2 == null || externalPlayer2.size() <= 0) ? Boolean.FALSE : Boolean.TRUE;
    }

    public final void z1(Boolean bool) {
        if (bool.booleanValue()) {
            this.f29054h.setVisibility(0);
            this.f29052f.setVisibility(8);
            this.f29053g.setVisibility(0);
        } else {
            this.f29052f.setVisibility(0);
            this.f29054h.setVisibility(8);
            this.f29053g.setVisibility(8);
        }
    }
}
