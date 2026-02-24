package com.google.ads.interactivemedia.v3.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public class arn extends apq implements aro {
    public arn() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static aro b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof aro ? (aro) iInterfaceQueryLocalInterface : new arm(iBinder);
    }
}
