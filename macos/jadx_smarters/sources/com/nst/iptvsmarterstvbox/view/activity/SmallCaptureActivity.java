package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;

/* JADX INFO: loaded from: classes4.dex */
public class SmallCaptureActivity extends CaptureActivity {
    @Override // com.journeyapps.barcodescanner.CaptureActivity
    public DecoratedBarcodeView a() {
        setContentView(g.f12706R1);
        return (DecoratedBarcodeView) findViewById(f.Ym);
    }
}
