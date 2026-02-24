package com.journeyapps.barcodescanner;

import B6.k;
import Y6.i;
import Y6.j;
import Y6.l;
import Y6.m;
import Y6.x;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.List;
import x6.EnumC2964e;

/* JADX INFO: loaded from: classes.dex */
public class BarcodeView extends com.journeyapps.barcodescanner.a {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public b f27958C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Y6.a f27959D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public l f27960E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public j f27961F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Handler f27962G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Handler.Callback f27963H;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == k.f713g) {
                Y6.b bVar = (Y6.b) message.obj;
                if (bVar != null && BarcodeView.this.f27959D != null && BarcodeView.this.f27958C != b.NONE) {
                    BarcodeView.this.f27959D.b(bVar);
                    if (BarcodeView.this.f27958C == b.SINGLE) {
                        BarcodeView.this.M();
                    }
                }
                return true;
            }
            if (i9 == k.f712f) {
                return true;
            }
            if (i9 != k.f714h) {
                return false;
            }
            List list = (List) message.obj;
            if (BarcodeView.this.f27959D != null && BarcodeView.this.f27958C != b.NONE) {
                BarcodeView.this.f27959D.a(list);
            }
            return true;
        }
    }

    public enum b {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27958C = b.NONE;
        this.f27959D = null;
        this.f27963H = new a();
        J();
    }

    public final i G() {
        if (this.f27961F == null) {
            this.f27961F = H();
        }
        Y6.k kVar = new Y6.k();
        HashMap map = new HashMap();
        map.put(EnumC2964e.NEED_RESULT_POINT_CALLBACK, kVar);
        i iVarA = this.f27961F.a(map);
        kVar.b(iVarA);
        return iVarA;
    }

    public j H() {
        return new m();
    }

    public void I(Y6.a aVar) {
        this.f27958C = b.SINGLE;
        this.f27959D = aVar;
        K();
    }

    public final void J() {
        this.f27961F = new m();
        this.f27962G = new Handler(this.f27963H);
    }

    public final void K() {
        L();
        if (this.f27958C == b.NONE || !t()) {
            return;
        }
        l lVar = new l(getCameraInstance(), G(), this.f27962G);
        this.f27960E = lVar;
        lVar.i(getPreviewFramingRect());
        this.f27960E.k();
    }

    public final void L() {
        l lVar = this.f27960E;
        if (lVar != null) {
            lVar.l();
            this.f27960E = null;
        }
    }

    public void M() {
        this.f27958C = b.NONE;
        this.f27959D = null;
        L();
    }

    public j getDecoderFactory() {
        return this.f27961F;
    }

    public void setDecoderFactory(j jVar) {
        x.a();
        this.f27961F = jVar;
        l lVar = this.f27960E;
        if (lVar != null) {
            lVar.j(G());
        }
    }

    @Override // com.journeyapps.barcodescanner.a
    public void u() {
        L();
        super.u();
    }

    @Override // com.journeyapps.barcodescanner.a
    public void x() {
        super.x();
        K();
    }
}
