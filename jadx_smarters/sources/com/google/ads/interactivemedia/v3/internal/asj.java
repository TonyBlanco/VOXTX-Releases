package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC1404c;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public final class asj extends aqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20626a;

    public asj(Context context, Looper looper, AbstractC1404c.a aVar, AbstractC1404c.b bVar, int i9) {
        super(context, looper, aVar, bVar);
        this.f20626a = i9;
    }

    public final aso a() throws DeadObjectException {
        return (aso) super.getService();
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof aso ? (aso) iInterfaceQueryLocalInterface : new asn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final int getMinApkVersion() {
        return this.f20626a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }
}
