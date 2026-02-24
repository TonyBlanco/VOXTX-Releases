package com.journeyapps.barcodescanner;

import B6.e;
import B6.h;
import B6.n;
import D.AbstractC0519b;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.journeyapps.barcodescanner.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x6.p;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f28019o = "b";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f28020p = 250;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f28021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DecoratedBarcodeView f28022b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f28028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f28029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f28030j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a.f f28033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f28034n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28023c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28024d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28025e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f28026f = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28027g = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f28031k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Y6.a f28032l = new a();

    public class a implements Y6.a {
        public a() {
        }

        @Override // Y6.a
        public void a(List list) {
        }

        @Override // Y6.a
        public void b(final Y6.b bVar) {
            b.this.f28022b.e();
            b.this.f28029i.f();
            b.this.f28030j.post(new Runnable() { // from class: Y6.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10692a.d(bVar);
                }
            });
        }

        public final /* synthetic */ void d(Y6.b bVar) {
            b.this.B(bVar);
        }
    }

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.b$b, reason: collision with other inner class name */
    public class C0270b implements a.f {
        public C0270b() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b() {
            if (b.this.f28031k) {
                Log.d(b.f28019o, "Camera closed; finishing activity");
                b.this.n();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c(Exception exc) {
            b bVar = b.this;
            bVar.m(bVar.f28021a.getString(n.f724c));
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
        }
    }

    public b(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        C0270b c0270b = new C0270b();
        this.f28033m = c0270b;
        this.f28034n = false;
        this.f28021a = activity;
        this.f28022b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(c0270b);
        this.f28030j = new Handler();
        this.f28028h = new h(activity, new Runnable() { // from class: Y6.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f10688a.s();
            }
        });
        this.f28029i = new e(activity);
    }

    public static Intent A(Y6.b bVar, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", bVar.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", bVar.a().toString());
        byte[] bArrC = bVar.c();
        if (bArrC != null && bArrC.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", bArrC);
        }
        Map mapD = bVar.d();
        if (mapD != null) {
            p pVar = p.UPC_EAN_EXTENSION;
            if (mapD.containsKey(pVar)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", mapD.get(pVar).toString());
            }
            Number number = (Number) mapD.get(p.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) mapD.get(p.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable iterable = (Iterable) mapD.get(p.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i9, (byte[]) it.next());
                    i9++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    public void B(Y6.b bVar) {
        this.f28021a.setResult(-1, A(bVar, o(bVar)));
        k();
    }

    public void C() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f28021a.setResult(0, intent);
        k();
    }

    public final void D() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f28021a.setResult(0, intent);
    }

    public void E(boolean z9, String str) {
        this.f28025e = z9;
        if (str == null) {
            str = "";
        }
        this.f28026f = str;
    }

    public void k() {
        if (this.f28022b.getBarcodeView().s()) {
            n();
        } else {
            this.f28031k = true;
        }
        this.f28022b.e();
        this.f28028h.d();
    }

    public void l() {
        this.f28022b.b(this.f28032l);
    }

    public void m(String str) {
        if (this.f28021a.isFinishing() || this.f28027g || this.f28031k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f28021a.getString(n.f724c);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f28021a);
        builder.setTitle(this.f28021a.getString(n.f722a));
        builder.setMessage(str);
        builder.setPositiveButton(n.f723b, new DialogInterface.OnClickListener() { // from class: Y6.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i9) {
                this.f10690a.q(dialogInterface, i9);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: Y6.g
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f10691a.r(dialogInterface);
            }
        });
        builder.show();
    }

    public final void n() {
        this.f28021a.finish();
    }

    public final String o(Y6.b bVar) {
        if (this.f28024d) {
            Bitmap bitmapB = bVar.b();
            try {
                File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", this.f28021a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                bitmapB.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return fileCreateTempFile.getAbsolutePath();
            } catch (IOException e9) {
                Log.w(f28019o, "Unable to create temporary file and store bitmap! " + e9);
            }
        }
        return null;
    }

    public void p(Intent intent, Bundle bundle) {
        this.f28021a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f28023c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                t();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f28022b.d(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f28029i.g(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                E(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f28030j.postDelayed(new Runnable() { // from class: Y6.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10689a.C();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f28024d = true;
            }
        }
    }

    public final /* synthetic */ void q(DialogInterface dialogInterface, int i9) {
        n();
    }

    public final /* synthetic */ void r(DialogInterface dialogInterface) {
        n();
    }

    public final /* synthetic */ void s() {
        Log.d(f28019o, "Finishing due to inactivity");
        n();
    }

    public void t() {
        if (this.f28023c == -1) {
            int rotation = this.f28021a.getWindowManager().getDefaultDisplay().getRotation();
            int i9 = this.f28021a.getResources().getConfiguration().orientation;
            int i10 = 0;
            if (i9 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i10 = 8;
                }
            } else if (i9 == 1) {
                i10 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f28023c = i10;
        }
        this.f28021a.setRequestedOrientation(this.f28023c);
    }

    public void u() {
        this.f28027g = true;
        this.f28028h.d();
        this.f28030j.removeCallbacksAndMessages(null);
    }

    public void v() {
        this.f28028h.d();
        this.f28022b.f();
    }

    public void w(int i9, String[] strArr, int[] iArr) {
        if (i9 == f28020p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f28022b.g();
                return;
            }
            D();
            if (this.f28025e) {
                m(this.f28026f);
            } else {
                k();
            }
        }
    }

    public void x() {
        if (Build.VERSION.SDK_INT >= 23) {
            z();
        } else {
            this.f28022b.g();
        }
        this.f28028h.h();
    }

    public void y(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f28023c);
    }

    public final void z() {
        if (E.b.checkSelfPermission(this.f28021a, "android.permission.CAMERA") == 0) {
            this.f28022b.g();
        } else {
            if (this.f28034n) {
                return;
            }
            AbstractC0519b.h(this.f28021a, new String[]{"android.permission.CAMERA"}, f28020p);
            this.f28034n = true;
        }
    }
}
