package androidx.work.impl.background.systemalarm;

import Q0.k;
import a1.n;
import android.content.Intent;
import androidx.lifecycle.r;
import androidx.work.impl.background.systemalarm.d;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends r implements d.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17331e = k.f("SystemAlarmService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f17332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17333d;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void b() {
        this.f17333d = true;
        k.c().a(f17331e, "All commands completed in dispatcher", new Throwable[0]);
        n.a();
        stopSelf();
    }

    public final void e() {
        d dVar = new d(this);
        this.f17332c = dVar;
        dVar.m(this);
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f17333d = false;
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f17333d = true;
        this.f17332c.j();
    }

    @Override // androidx.lifecycle.r, android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        super.onStartCommand(intent, i9, i10);
        if (this.f17333d) {
            k.c().d(f17331e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f17332c.j();
            e();
            this.f17333d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f17332c.a(intent, i10);
        return 3;
    }
}
