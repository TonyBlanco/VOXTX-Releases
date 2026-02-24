package com.journeyapps.barcodescanner;

import B6.k;
import B6.l;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public class CaptureActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f27965a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DecoratedBarcodeView f27966c;

    public DecoratedBarcodeView a() {
        setContentView(l.f720b);
        return (DecoratedBarcodeView) findViewById(k.f707a);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27966c = a();
        b bVar = new b(this, this.f27966c);
        this.f27965a = bVar;
        bVar.p(getIntent(), bundle);
        this.f27965a.l();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f27965a.u();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        return this.f27966c.onKeyDown(i9, keyEvent) || super.onKeyDown(i9, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f27965a.v();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        this.f27965a.w(i9, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f27965a.x();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f27965a.y(bundle);
    }
}
