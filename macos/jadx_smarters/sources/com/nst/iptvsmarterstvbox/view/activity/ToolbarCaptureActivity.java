package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.b;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/* JADX INFO: loaded from: classes4.dex */
public class ToolbarCaptureActivity extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.journeyapps.barcodescanner.b f32844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DecoratedBarcodeView f32845e;

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12700Q1);
        this.f32845e = (DecoratedBarcodeView) findViewById(f.Ym);
        com.journeyapps.barcodescanner.b bVar = new com.journeyapps.barcodescanner.b(this, this.f32845e);
        this.f32844d = bVar;
        bVar.p(getIntent(), bundle);
        this.f32844d.l();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f32844d.u();
    }

    @Override // androidx.appcompat.app.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        return this.f32845e.onKeyDown(i9, keyEvent) || super.onKeyDown(i9, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f32844d.v();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f32844d.x();
    }

    @Override // androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f32844d.y(bundle);
    }

    @Override // androidx.appcompat.app.b
    public boolean p1() {
        onBackPressed();
        return true;
    }
}
