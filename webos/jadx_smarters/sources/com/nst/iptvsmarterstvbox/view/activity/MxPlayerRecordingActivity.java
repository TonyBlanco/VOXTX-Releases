package com.nst.iptvsmarterstvbox.view.activity;

import a7.c;
import a7.j;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import m7.w;

/* JADX INFO: loaded from: classes4.dex */
public class MxPlayerRecordingActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f30995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f30996f;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            try {
                try {
                    MxPlayerRecordingActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.mxtech.videoplayer.ad")));
                } catch (ActivityNotFoundException e9) {
                    w.P0(MxPlayerRecordingActivity.this.f30996f, String.valueOf(e9));
                }
            } catch (ActivityNotFoundException unused) {
                MxPlayerRecordingActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=com.mxtech.videoplayer.ad")));
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            MxPlayerRecordingActivity.this.finish();
        }
    }

    private void w1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, c.f11860k));
    }

    private void x1() {
        this.f30996f = this;
        String stringExtra = getIntent().getStringExtra("VIDEO_PATH");
        this.f30994d = stringExtra;
        this.f30995e = Uri.parse(stringExtra);
        try {
            if (!v1("com.mxtech.videoplayer.pro")) {
                Intent intent = new Intent();
                intent.setClassName("com.mxtech.videoplayer.ad", "com.mxtech.videoplayer.ad.ActivityScreen");
                intent.putExtra("package", getPackageName());
                intent.setDataAndType(this.f30995e, "application/x-mpegURL");
                startActivity(intent);
            } else {
                if (this.f30996f == null) {
                    return;
                }
                Intent intent2 = new Intent();
                intent2.setClassName("com.mxtech.videoplayer.pro", "com.mxtech.videoplayer.pro.ActivityScreen");
                intent2.putExtra("package", getPackageName());
                intent2.setDataAndType(this.f30995e, "application/x-mpegURL");
                intent2.setPackage("com.mxtech.videoplayer.pro");
                startActivity(intent2);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
            }
            finish();
        } catch (ActivityNotFoundException unused) {
            y1();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w1();
        x1();
        getWindow().setFlags(1024, 1024);
    }

    public final boolean v1(String str) {
        Context context = this.f30996f;
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    public void y1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(j.f13320m3));
        builder.setMessage(getResources().getString(j.f13406v));
        builder.setPositiveButton(getResources().getString(j.f13449z2), new a());
        builder.setNegativeButton(getResources().getString(j.f13247f0), new b());
        builder.setCancelable(false);
        builder.create().show();
    }
}
