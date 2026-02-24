package com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification;

import a7.f;
import a7.g;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.nst.iptvsmarterstvbox.miscelleneious.MyApplication;
import e2.AbstractC1732b;
import m2.InterfaceC2223d;
import o2.InterfaceC2315j;
import org.achartengine.ChartFactory;

/* JADX INFO: loaded from: classes.dex */
public class NotificationPanelActivtiy extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f28712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f28714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f28715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f28716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ImageView f28717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f28718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RelativeLayout f28719l;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12799g0);
        if (i1() != null) {
            i1().l();
        }
        this.f28714g = (ImageView) findViewById(f.f12487o5);
        this.f28718k = (ImageView) findViewById(f.f12405g4);
        this.f28719l = (RelativeLayout) findViewById(f.f12591y8);
        this.f28715h = (TextView) findViewById(f.fm);
        this.f28716i = (TextView) findViewById(f.Di);
        ImageView imageView = (ImageView) findViewById(f.f12141F4);
        this.f28717j = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.NotificationPanelActivtiy.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NotificationPanelActivtiy.this.onBackPressed();
            }
        });
        u1(getIntent());
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        u1(intent);
        super.onNewIntent(intent);
    }

    public final void u1(Intent intent) {
        if (intent.getStringExtra("image") == null || intent.getStringExtra("image").isEmpty()) {
            this.f28714g.setVisibility(8);
            this.f28719l.setVisibility(8);
            this.f28718k.setVisibility(8);
        } else {
            this.f28713f = intent.getStringExtra("image");
            this.f28714g.setVisibility(0);
            this.f28719l.setVisibility(0);
            O1.g.v(this).q(this.f28713f).C(new InterfaceC2223d() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.NotificationPanelActivtiy.2
                @Override // m2.InterfaceC2223d
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public boolean a(Exception exc, String str, InterfaceC2315j interfaceC2315j, boolean z9) {
                    NotificationPanelActivtiy.this.f28718k.setVisibility(8);
                    return false;
                }

                @Override // m2.InterfaceC2223d
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public boolean b(AbstractC1732b abstractC1732b, String str, InterfaceC2315j interfaceC2315j, boolean z9, boolean z10) {
                    NotificationPanelActivtiy.this.f28718k.setVisibility(8);
                    NotificationPanelActivtiy.this.f28714g.setVisibility(0);
                    return false;
                }
            }).l(this.f28714g);
        }
        if (intent.getStringExtra(ChartFactory.TITLE) == null || intent.getStringExtra(ChartFactory.TITLE).isEmpty()) {
            this.f28715h.setVisibility(8);
        } else {
            this.f28711d = intent.getStringExtra(ChartFactory.TITLE);
            this.f28715h.setVisibility(0);
            this.f28715h.setText(this.f28711d);
        }
        if (intent.getStringExtra("custombody") == null || intent.getStringExtra("custombody").isEmpty()) {
            this.f28716i.setVisibility(8);
            return;
        }
        this.f28712e = intent.getStringExtra("custombody");
        this.f28716i.setVisibility(0);
        this.f28716i.setText(MyApplication.p().o(this.f28712e));
        this.f28716i.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
