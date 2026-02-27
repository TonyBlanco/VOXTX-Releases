package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f26878a;

    public /* synthetic */ s0(t0 t0Var, r0 r0Var) {
        this.f26878a = t0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 == 0) {
            synchronized (this.f26878a.f26884f) {
                try {
                    o0 o0Var = (o0) message.obj;
                    q0 q0Var = (q0) this.f26878a.f26884f.get(o0Var);
                    if (q0Var != null && q0Var.i()) {
                        if (q0Var.j()) {
                            q0Var.g("GmsClientSupervisor");
                        }
                        this.f26878a.f26884f.remove(o0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i9 != 1) {
            return false;
        }
        synchronized (this.f26878a.f26884f) {
            try {
                o0 o0Var2 = (o0) message.obj;
                q0 q0Var2 = (q0) this.f26878a.f26884f.get(o0Var2);
                if (q0Var2 != null && q0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(o0Var2), new Exception());
                    ComponentName componentNameB = q0Var2.b();
                    if (componentNameB == null) {
                        componentNameB = o0Var2.a();
                    }
                    if (componentNameB == null) {
                        String strC = o0Var2.c();
                        r.m(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    q0Var2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
