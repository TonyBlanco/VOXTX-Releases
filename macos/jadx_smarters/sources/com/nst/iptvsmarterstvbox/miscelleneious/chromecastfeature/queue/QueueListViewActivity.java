package com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature.queue;

import a7.f;
import a7.g;
import a7.h;
import a7.j;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import java.util.List;
import n4.r;
import o4.AbstractC2324a;
import o4.C2325b;
import o4.C2328e;
import o4.InterfaceC2347y;
import p4.C2434i;

/* JADX INFO: loaded from: classes.dex */
public class QueueListViewActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2434i.a f28678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2347y f28679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2325b f28680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C2434i f28681g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f28682h;

    public class b extends C2434i.a {
        public b() {
        }

        private void o() {
            View view;
            int i9;
            r rVarL = QueueListViewActivity.this.f28681g.l();
            List listA0 = rVarL == null ? null : rVarL.a0();
            if (listA0 == null || listA0.isEmpty()) {
                view = QueueListViewActivity.this.f28682h;
                i9 = 0;
            } else {
                view = QueueListViewActivity.this.f28682h;
                i9 = 8;
            }
            view.setVisibility(i9);
        }

        @Override // p4.C2434i.a
        public void e() {
            o();
        }

        @Override // p4.C2434i.a
        public void g() {
            o();
        }
    }

    public class c implements InterfaceC2347y {
        public c() {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSessionEnded(C2328e c2328e, int i9) {
            if (QueueListViewActivity.this.f28681g != null) {
                QueueListViewActivity.this.f28681g.N(QueueListViewActivity.this.f28678d);
            }
            QueueListViewActivity.this.f28681g = null;
            QueueListViewActivity.this.f28682h.setVisibility(0);
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSessionEnding(C2328e c2328e) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSessionResumeFailed(C2328e c2328e, int i9) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSessionResumed(C2328e c2328e, boolean z9) {
            QueueListViewActivity queueListViewActivity = QueueListViewActivity.this;
            queueListViewActivity.f28681g = queueListViewActivity.z1();
            if (QueueListViewActivity.this.f28681g != null) {
                QueueListViewActivity.this.f28681g.N(QueueListViewActivity.this.f28678d);
            }
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSessionResuming(C2328e c2328e, String str) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onSessionStartFailed(C2328e c2328e, int i9) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void onSessionStarted(C2328e c2328e, String str) {
            QueueListViewActivity queueListViewActivity = QueueListViewActivity.this;
            queueListViewActivity.f28681g = queueListViewActivity.z1();
            if (QueueListViewActivity.this.f28681g != null) {
                QueueListViewActivity.this.f28681g.N(QueueListViewActivity.this.f28678d);
            }
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onSessionStarting(C2328e c2328e) {
        }

        @Override // o4.InterfaceC2347y
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void onSessionSuspended(C2328e c2328e, int i9) {
            if (QueueListViewActivity.this.f28681g != null) {
                QueueListViewActivity.this.f28681g.X(QueueListViewActivity.this.f28678d);
            }
            QueueListViewActivity.this.f28681g = null;
        }
    }

    public QueueListViewActivity() {
        this.f28678d = new b();
        this.f28679e = new c();
    }

    public final void A1() {
        Toolbar toolbar = (Toolbar) findViewById(f.kh);
        toolbar.setTitle(j.f13079N5);
        r1(toolbar);
        i1().t(true);
    }

    @Override // androidx.appcompat.app.b, D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f28680f.f(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12797f4);
        Log.d("QueueListViewActivity", "onCreate() was called");
        i7.b.n(this);
        C2325b.e(this).c().c();
        if (bundle == null) {
            getSupportFragmentManager().m().c(f.f12463m2, new k7.c(), "list view").i();
        }
        A1();
        this.f28682h = findViewById(f.f12239P2);
        this.f28680f = C2325b.e(this);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(h.f12940w, menu);
        AbstractC2324a.a(getApplicationContext(), menu, f.eb);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == f.f12369d) {
            i7.b.n(getApplicationContext()).x();
            return true;
        }
        if (itemId != 16908332) {
            return true;
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        C2434i c2434i = this.f28681g;
        if (c2434i != null) {
            c2434i.X(this.f28678d);
        }
        this.f28680f.c().e(this.f28679e, C2328e.class);
        super.onPause();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        this.f28680f.c().a(this.f28679e, C2328e.class);
        if (this.f28681g == null) {
            this.f28681g = z1();
        }
        C2434i c2434i = this.f28681g;
        if (c2434i != null) {
            c2434i.N(this.f28678d);
            r rVarL = this.f28681g.l();
            List listA0 = rVarL == null ? null : rVarL.a0();
            if (listA0 != null && !listA0.isEmpty()) {
                this.f28682h.setVisibility(8);
            }
        }
        super.onResume();
    }

    public final C2434i z1() {
        C2328e c2328eC = this.f28680f.c().c();
        if (c2328eC == null || !c2328eC.c()) {
            return null;
        }
        return c2328eC.r();
    }
}
