package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Hide;

/* JADX INFO: loaded from: classes3.dex */
@Hide
public class aqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected apx f20504a;

    @Deprecated
    public final Uri a(Uri uri, Context context) throws aqb, RemoteException {
        aro aroVarD = this.f20504a.d(arp.c(uri), arp.c(context));
        if (aroVarD != null) {
            return (Uri) arp.d(aroVarD);
        }
        throw new aqb();
    }

    @Deprecated
    public final String b(Context context) throws RemoteException {
        return this.f20504a.g(arp.c(context), null);
    }

    @Deprecated
    public final boolean c(Uri uri) throws RemoteException {
        return this.f20504a.q(arp.c(uri));
    }
}
