package com.journeyapps.barcodescanner;

import B6.f;
import B6.g;
import B6.k;
import B6.l;
import B6.o;
import Y6.m;
import Z6.i;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x6.j;
import x6.q;

/* JADX INFO: loaded from: classes.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BarcodeView f27967a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewfinderView f27968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f27969d;

    public interface a {
    }

    public class b implements Y6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Y6.a f27970a;

        public b(Y6.a aVar) {
            this.f27970a = aVar;
        }

        @Override // Y6.a
        public void a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f27968c.a((q) it.next());
            }
            this.f27970a.a(list);
        }

        @Override // Y6.a
        public void b(Y6.b bVar) {
            this.f27970a.b(bVar);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    public void b(Y6.a aVar) {
        this.f27967a.I(new b(aVar));
    }

    public final void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f736l);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o.f737m, l.f719a);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(k.f708b);
        this.f27967a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.q(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(k.f718l);
        this.f27968c = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.f27967a);
        this.f27969d = (TextView) findViewById(k.f717k);
    }

    public void d(Intent intent) {
        int intExtra;
        Set setA = f.a(intent);
        Map mapA = g.a(intent);
        i iVar = new i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            iVar.i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            i();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new j().e(mapA);
        this.f27967a.setCameraSettings(iVar);
        this.f27967a.setDecoderFactory(new m(setA, mapA, stringExtra2, intExtra2));
    }

    public void e() {
        this.f27967a.u();
    }

    public void f() {
        this.f27967a.v();
    }

    public void g() {
        this.f27967a.y();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(k.f708b);
    }

    public i getCameraSettings() {
        return this.f27967a.getCameraSettings();
    }

    public Y6.j getDecoderFactory() {
        return this.f27967a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f27969d;
    }

    public ViewfinderView getViewFinder() {
        return this.f27968c;
    }

    public void h() {
        this.f27967a.setTorch(false);
    }

    public void i() {
        this.f27967a.setTorch(true);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (i9 == 24) {
            i();
            return true;
        }
        if (i9 == 25) {
            h();
            return true;
        }
        if (i9 == 27 || i9 == 80) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    public void setCameraSettings(i iVar) {
        this.f27967a.setCameraSettings(iVar);
    }

    public void setDecoderFactory(Y6.j jVar) {
        this.f27967a.setDecoderFactory(jVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f27969d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
    }
}
