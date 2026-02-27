package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26816a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1404c f26817c;

    public f0(AbstractC1404c abstractC1404c, int i9) {
        this.f26817c = abstractC1404c;
        this.f26816a = i9;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        AbstractC1404c abstractC1404c = this.f26817c;
        if (iBinder == null) {
            AbstractC1404c.zzk(abstractC1404c, 16);
            return;
        }
        synchronized (abstractC1404c.zzq) {
            try {
                AbstractC1404c abstractC1404c2 = this.f26817c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC1404c2.zzr = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1415n)) ? new V(iBinder) : (InterfaceC1415n) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f26817c.zzl(0, null, this.f26816a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f26817c.zzq) {
            this.f26817c.zzr = null;
        }
        AbstractC1404c abstractC1404c = this.f26817c;
        int i9 = this.f26816a;
        Handler handler = abstractC1404c.zzb;
        handler.sendMessage(handler.obtainMessage(6, i9, 1));
    }
}
