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
import androidx.core.content.FileProvider;
import java.io.File;
import m7.w;

/* JADX INFO: loaded from: classes4.dex */
public class PlayRecordingExternalPlayerActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f31354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31355f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31356g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31357h = "";

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            try {
                try {
                    PlayRecordingExternalPlayerActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + PlayRecordingExternalPlayerActivity.this.f31355f)));
                } catch (ActivityNotFoundException unused) {
                    PlayRecordingExternalPlayerActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + PlayRecordingExternalPlayerActivity.this.f31355f)));
                }
            } catch (ActivityNotFoundException e9) {
                w.P0(PlayRecordingExternalPlayerActivity.this.f31354e, String.valueOf(e9));
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            PlayRecordingExternalPlayerActivity.this.finish();
        }
    }

    private boolean w1(String str) {
        Context context = this.f31354e;
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo(str, 1);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    private void x1() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(E.b.getColor(this, c.f11860k));
    }

    private void y1() {
        this.f31354e = this;
        this.f31355f = getIntent().getStringExtra("packagename");
        this.f31356g = this.f31355f + ".ActivityScreen";
        this.f31357h = getIntent().getStringExtra("app_name");
        this.f31353d = getIntent().getStringExtra("url");
        if (w1(this.f31355f)) {
            if (this.f31354e == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f31355f);
                intent.setDataAndType(Uri.parse("file://" + this.f31353d), "video/*");
                intent.addFlags(1);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                finish();
                return;
            } catch (ActivityNotFoundException | Exception unused) {
            } catch (Exception unused2) {
                File file = new File(this.f31353d);
                Uri uriF = FileProvider.f(this.f31354e, this.f31354e.getApplicationContext().getPackageName() + ".provider", file);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(this.f31355f);
                intent2.setDataAndType(uriF, "video/*");
                intent2.addFlags(1);
                startActivity(intent2);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                finish();
                return;
            }
        }
        z1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x1();
        y1();
        getWindow().setFlags(1024, 1024);
    }

    public void z1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getResources().getString(j.f13320m3));
        builder.setMessage(this.f31357h + " " + getResources().getString(j.f13416w));
        builder.setPositiveButton(getResources().getString(j.f13449z2), new a());
        builder.setNegativeButton(getResources().getString(j.f13247f0), new b());
        builder.setCancelable(false);
        builder.create().show();
    }
}
