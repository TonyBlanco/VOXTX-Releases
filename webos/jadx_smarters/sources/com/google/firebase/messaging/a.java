package com.google.firebase.messaging;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import s.C2695a;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f27949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f27950b = new C2695a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    public interface InterfaceC0268a {
        Task start();
    }

    public a(Executor executor) {
        this.f27949a = executor;
    }

    public synchronized Task a(final String str, InterfaceC0268a interfaceC0268a) {
        try {
            Task task = (Task) this.f27950b.get(str);
            if (task != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String strValueOf = String.valueOf(str);
                    Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Joining ongoing request for: ".concat(strValueOf) : new String("Joining ongoing request for: "));
                }
                return task;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf2 = String.valueOf(str);
                Log.d("FirebaseMessaging", strValueOf2.length() != 0 ? "Making new request for: ".concat(strValueOf2) : new String("Making new request for: "));
            }
            Task taskContinueWithTask = interfaceC0268a.start().continueWithTask(this.f27949a, new Continuation() { // from class: q6.U
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    this.f46998a.b(str, task2);
                    return task2;
                }
            });
            this.f27950b.put(str, taskContinueWithTask);
            return taskContinueWithTask;
        } catch (Throwable th) {
            throw th;
        }
    }

    public /* synthetic */ Task b(String str, Task task) {
        synchronized (this) {
            this.f27950b.remove(str);
        }
        return task;
    }
}
