package v4;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f51375b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f51377d;

    public t(int i9, int i10, Bundle bundle) {
        this.f51374a = i9;
        this.f51376c = i10;
        this.f51377d = bundle;
    }

    public abstract void a(Bundle bundle);

    public abstract boolean b();

    public final void c(u uVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(uVar);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
            sb.append("Failing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f51375b.setException(uVar);
    }

    public final void d(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
            sb.append("Finishing ");
            sb.append(strValueOf);
            sb.append(" with ");
            sb.append(strValueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f51375b.setResult(obj);
    }

    public final String toString() {
        int i9 = this.f51376c;
        int i10 = this.f51374a;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i9);
        sb.append(" id=");
        sb.append(i10);
        sb.append(" oneWay=");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
