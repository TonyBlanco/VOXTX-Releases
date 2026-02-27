package q6;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import q6.l0;

/* JADX INFO: loaded from: classes3.dex */
public class i0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f47077a;

    public interface a {
        Task a(Intent intent);
    }

    public i0(a aVar) {
        this.f47077a = aVar;
    }

    public void b(final l0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        this.f47077a.a(aVar.f47090a).addOnCompleteListener(new Executor() { // from class: q6.h0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new OnCompleteListener() { // from class: q6.g0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVar.b();
            }
        });
    }
}
