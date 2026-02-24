package q6;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: q6.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2596n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f47093c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static l0 f47094d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f47096b = ExecutorC2595m.f47092a;

    public C2596n(Context context) {
        this.f47095a = context;
    }

    public static Task a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).continueWith(ExecutorC2595m.f47092a, new Continuation() { // from class: q6.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C2596n.c(task);
            }
        });
    }

    public static l0 b(Context context, String str) {
        l0 l0Var;
        synchronized (f47093c) {
            try {
                if (f47094d == null) {
                    f47094d = new l0(context, "com.google.firebase.MESSAGING_EVENT");
                }
                l0Var = f47094d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return l0Var;
    }

    public static /* synthetic */ Integer c(Task task) {
        return -1;
    }

    public static /* synthetic */ Integer e(Task task) {
        return 403;
    }

    public static /* synthetic */ Task f(Context context, Intent intent, Task task) {
        return (C4.m.i() && ((Integer) task.getResult()).intValue() == 402) ? a(context, intent).continueWith(ExecutorC2595m.f47092a, new Continuation() { // from class: q6.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return C2596n.e(task2);
            }
        }) : task;
    }

    public Task g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f47095a, intent);
    }

    public Task h(final Context context, final Intent intent) {
        boolean z9 = false;
        if (C4.m.i() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z9 = true;
        }
        return (z9 && (intent.getFlags() & 268435456) == 0) ? a(context, intent) : Tasks.call(this.f47096b, new Callable() { // from class: q6.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(W.b().g(context, intent));
            }
        }).continueWithTask(this.f47096b, new Continuation() { // from class: q6.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return C2596n.f(context, intent, task);
            }
        });
    }
}
