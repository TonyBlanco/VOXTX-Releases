package Q0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f7456c;

    public e(int i9, Notification notification, int i10) {
        this.f7454a = i9;
        this.f7456c = notification;
        this.f7455b = i10;
    }

    public int a() {
        return this.f7455b;
    }

    public Notification b() {
        return this.f7456c;
    }

    public int c() {
        return this.f7454a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f7454a == eVar.f7454a && this.f7455b == eVar.f7455b) {
            return this.f7456c.equals(eVar.f7456c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f7454a * 31) + this.f7455b) * 31) + this.f7456c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f7454a + ", mForegroundServiceType=" + this.f7455b + ", mNotification=" + this.f7456c + '}';
    }
}
