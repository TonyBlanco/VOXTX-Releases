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
public class PlayExternalPlayerActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31346d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f31347e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f31348f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f31349g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f31350h = "";

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            try {
                try {
                    PlayExternalPlayerActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + PlayExternalPlayerActivity.this.f31348f)));
                } catch (ActivityNotFoundException unused) {
                    PlayExternalPlayerActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + PlayExternalPlayerActivity.this.f31348f)));
                }
            } catch (ActivityNotFoundException e9) {
                w.P0(PlayExternalPlayerActivity.this.f31347e, String.valueOf(e9));
            }
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i9) {
            PlayExternalPlayerActivity.this.finish();
        }
    }

    private boolean w1(String str) {
        Context context = this.f31347e;
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
        this.f31347e = this;
        this.f31348f = getIntent().getStringExtra("packagename");
        this.f31349g = this.f31348f + ".ActivityScreen";
        this.f31350h = getIntent().getStringExtra("app_name");
        this.f31346d = getIntent().getStringExtra("url");
        if (w1(this.f31348f)) {
            if (this.f31347e == null) {
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage(this.f31348f);
                intent.setDataAndType(Uri.parse(this.f31346d), "video/*");
                intent.addFlags(1);
                startActivity(intent);
                overridePendingTransition(a7.b.f11828f, a7.b.f11826d);
                finish();
                return;
            } catch (ActivityNotFoundException | Exception unused) {
            } catch (Exception unused2) {
                File file = new File(this.f31346d);
                Uri uriF = FileProvider.f(this.f31347e, this.f31347e.getApplicationContext().getPackageName() + ".provider", file);
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setPackage(this.f31348f);
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
        builder.setMessage(this.f31350h + " " + getResources().getString(j.f13416w));
        builder.setPositiveButton(getResources().getString(j.f13449z2), new a());
        builder.setNegativeButton(getResources().getString(j.f13247f0), new b());
        builder.setCancelable(false);
        builder.create().show();
    }
}
