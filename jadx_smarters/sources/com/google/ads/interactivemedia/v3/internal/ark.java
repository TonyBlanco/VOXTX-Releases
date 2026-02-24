package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.AbstractC1409h;
import com.google.android.gms.common.internal.C1406e;
import org.apache.http.HttpStatus;
import w4.C2916d;

/* JADX INFO: loaded from: classes3.dex */
public final class ark extends AbstractC1409h {
    public ark(Context context, Looper looper, C1406e c1406e, GoogleApiClient.b bVar, GoogleApiClient.c cVar) {
        super(context, looper, HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION, c1406e, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return aqz.b(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final C2916d[] getApiFeatures() {
        return ate.f20679c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return 17108000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.signalsdk.ISignalSdkService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.SDK_SIGNAL";
    }
}
