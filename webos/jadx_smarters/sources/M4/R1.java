package M4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* JADX INFO: loaded from: classes3.dex */
public final class R1 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4440a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S1 f4441c;

    public R1(S1 s12, String str) {
        this.f4441c = s12;
        this.f4440a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f4441c.f4459a.d().w().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            zzbr zzbrVarZzb = zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                this.f4441c.f4459a.d().w().a("Install Referrer Service implementation was not found");
            } else {
                this.f4441c.f4459a.d().v().a("Install Referrer Service connected");
                this.f4441c.f4459a.f().z(new Q1(this, zzbrVarZzb, this));
            }
        } catch (RuntimeException e9) {
            this.f4441c.f4459a.d().w().b("Exception occurred while calling Install Referrer API", e9);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4441c.f4459a.d().v().a("Install Referrer Service disconnected");
    }
}
