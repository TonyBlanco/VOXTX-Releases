package androidx.work.impl.diagnostics;

import Q0.k;
import Q0.m;
import Q0.u;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17372a = k.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        k.c().a(f17372a, "Requesting diagnostics", new Throwable[0]);
        try {
            u.f(context).b(m.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e9) {
            k.c().b(f17372a, "WorkManager is not initialized", e9);
        }
    }
}
