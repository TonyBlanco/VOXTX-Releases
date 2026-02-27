package com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.SBPAnnouncementsAdapter;
import com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton;
import java.util.Calendar;
import java.util.List;
import m7.w;

/* JADX INFO: loaded from: classes.dex */
public class SBPAnnouncementsActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f28722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ProgressBar f28723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f28724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f28725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f28727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecyclerView.o f28728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SBPAnnouncementsAdapter f28729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f28730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Thread f28731m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f28732n;

    public class CountDownRunner implements Runnable {
        public CountDownRunner() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    SBPAnnouncementsActivity.this.w1();
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                } catch (Exception unused2) {
                }
            }
        }
    }

    public class OnFocusChangeAccountListener implements View.OnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f28736a;

        public final void a(boolean z9) {
            if (z9) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28736a, "alpha", z9 ? 0.6f : 0.5f);
                objectAnimatorOfFloat.setDuration(150L);
                objectAnimatorOfFloat.start();
            }
        }

        public final void b(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28736a, "scaleX", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        public final void c(float f9) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28736a, "scaleY", f9);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.start();
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            float f9;
            if (z9) {
                f9 = z9 ? 1.23f : 1.0f;
                b(f9);
                c(f9);
            } else {
                if (z9) {
                    return;
                }
                f9 = z9 ? 1.09f : 1.0f;
                b(f9);
                c(f9);
                a(z9);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            int r3 = a7.g.f12804h
            r2.setContentView(r3)
            r2.f28730l = r2
            m7.w.Y(r2)
            int r3 = a7.f.ub
            android.view.View r3 = r2.findViewById(r3)
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r2.f28722d = r3
            int r3 = a7.f.oc
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ProgressBar r3 = (android.widget.ProgressBar) r3
            r2.f28723e = r3
            int r3 = a7.f.Qb
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f28724f = r3
            int r3 = a7.f.f12129E2
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f28725g = r3
            int r3 = a7.f.gh
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.f28726h = r3
            int r3 = a7.f.Xa
            android.view.View r3 = r2.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2.f28727i = r3
            com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton r3 = com.nst.iptvsmarterstvbox.sbpfunction.singletonpushnotification.AnnouncementsSBPSingleton.b()
            java.util.List r3 = r3.a()
            r2.f28732n = r3
            r0 = 8
            if (r3 == 0) goto L8a
            int r3 = r3.size()
            if (r3 <= 0) goto L8a
            androidx.recyclerview.widget.RecyclerView r3 = r2.f28722d
            r1 = 1
            r3.setHasFixedSize(r1)
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager
            r3.<init>(r2)
            r2.f28728j = r3
            androidx.recyclerview.widget.RecyclerView r1 = r2.f28722d
            r1.setLayoutManager(r3)
            com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.SBPAnnouncementsAdapter r3 = new com.nst.iptvsmarterstvbox.sbpfunction.adapterpushnotification.SBPAnnouncementsAdapter
            java.util.List r1 = r2.f28732n
            r3.<init>(r1, r2)
            r2.f28729k = r3
            androidx.recyclerview.widget.RecyclerView r1 = r2.f28722d
            r1.setAdapter(r3)
            android.widget.ProgressBar r3 = r2.f28723e
            if (r3 == 0) goto L84
            r3.setVisibility(r0)
        L84:
            android.widget.TextView r3 = r2.f28724f
        L86:
            r3.setVisibility(r0)
            goto L9a
        L8a:
            android.widget.ProgressBar r3 = r2.f28723e
            if (r3 == 0) goto L9a
            r3.setVisibility(r0)
            android.widget.TextView r3 = r2.f28724f
            r0 = 0
            r3.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r3 = r2.f28722d
            goto L86
        L9a:
            java.lang.Thread r3 = r2.f28731m
            if (r3 == 0) goto La5
            boolean r3 = r3.isAlive()
            if (r3 == 0) goto La5
            goto Lb4
        La5:
            com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.SBPAnnouncementsActivity$CountDownRunner r3 = new com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.SBPAnnouncementsActivity$CountDownRunner
            r3.<init>()
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3)
            r2.f28731m = r0
            r0.start()
        Lb4:
            android.widget.ImageView r3 = r2.f28727i
            com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.SBPAnnouncementsActivity$1 r0 = new com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.SBPAnnouncementsActivity$1
            r0.<init>()
            r3.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.SBPAnnouncementsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        try {
            Thread thread = this.f28731m;
            if (thread == null || !thread.isAlive()) {
                return;
            }
            this.f28731m.interrupt();
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        Thread thread = this.f28731m;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new CountDownRunner());
            this.f28731m = thread2;
            thread2.start();
        }
        x1();
        overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public void w1() {
        runOnUiThread(new Runnable() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.SBPAnnouncementsActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String string = Calendar.getInstance().getTime().toString();
                    String strR = w.R(SBPAnnouncementsActivity.this.f28730l);
                    String strA = w.A(string);
                    if (SBPAnnouncementsActivity.this.f28726h != null) {
                        SBPAnnouncementsActivity.this.f28726h.setText(strR);
                    }
                    if (SBPAnnouncementsActivity.this.f28725g != null) {
                        SBPAnnouncementsActivity.this.f28725g.setText(strA);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public void x1() {
        if (SharepreferenceDBHandler.getAnnouncementsList(this.f28730l) == null || SharepreferenceDBHandler.getAnnouncementsList(this.f28730l).size() <= 0) {
            AnnouncementsSBPSingleton.b().c(null);
            ProgressBar progressBar = this.f28723e;
            if (progressBar != null) {
                progressBar.setVisibility(8);
                this.f28724f.setVisibility(0);
                this.f28722d.setVisibility(0);
            }
            SBPAnnouncementsAdapter sBPAnnouncementsAdapter = this.f28729k;
            if (sBPAnnouncementsAdapter != null) {
                sBPAnnouncementsAdapter.q0();
                return;
            }
            return;
        }
        AnnouncementsSBPSingleton.b().c(SharepreferenceDBHandler.getAnnouncementsList(this.f28730l));
        SBPAnnouncementsAdapter sBPAnnouncementsAdapter2 = this.f28729k;
        if (sBPAnnouncementsAdapter2 != null) {
            sBPAnnouncementsAdapter2.q0();
        } else {
            this.f28732n = AnnouncementsSBPSingleton.b().a();
            this.f28722d.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f28730l);
            this.f28728j = linearLayoutManager;
            this.f28722d.setLayoutManager(linearLayoutManager);
            SBPAnnouncementsAdapter sBPAnnouncementsAdapter3 = new SBPAnnouncementsAdapter(this.f28732n, this);
            this.f28729k = sBPAnnouncementsAdapter3;
            this.f28722d.setAdapter(sBPAnnouncementsAdapter3);
        }
        ProgressBar progressBar2 = this.f28723e;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        this.f28724f.setVisibility(8);
    }
}
