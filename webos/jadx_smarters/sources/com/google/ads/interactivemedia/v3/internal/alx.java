package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsAdapter;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class alx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f20163a = new ArrayList(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TaskCompletionSource f20164b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f20165c = new TaskCompletionSource();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f20166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f20167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final alm f20168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Integer f20169g;

    public alx(Context context, ExecutorService executorService, alm almVar) {
        this.f20166d = context;
        this.f20167e = executorService;
        this.f20168f = almVar;
    }

    public static /* synthetic */ Task a(alx alxVar, Task task) {
        List list = (List) task.getResult();
        return Tasks.whenAllComplete(list).continueWith(alxVar.f20167e, new alu(list, 1));
    }

    private final void i(com.google.ads.interactivemedia.v3.impl.data.bj bjVar, Exception exc) {
        this.f20168f.b(com.google.ads.interactivemedia.v3.impl.data.bi.NATIVE_ESP, bjVar, exc);
    }

    private final void j(alt altVar) {
        this.f20163a.remove(altVar);
    }

    private static final Exception k(alt altVar, Exception exc) {
        return new Exception("Exception with SecureSignalsAdapter " + altVar.e() + ":" + altVar.f(), exc);
    }

    public final List b() {
        try {
            Task taskContinueWith = this.f20165c.getTask().continueWith(this.f20167e, new alu(this, 0)).continueWithTask(this.f20167e, new alu(this, 2)).continueWith(this.f20167e, new alu(this, 3));
            return (List) Tasks.await(this.f20169g == null ? Tasks.forResult(new ArrayList()) : Tasks.withTimeout(taskContinueWith, r1.intValue(), TimeUnit.MILLISECONDS).addOnFailureListener(new alo(this, 2)));
        } catch (InterruptedException | ExecutionException unused) {
            return new ArrayList();
        }
    }

    public final /* synthetic */ void c(Exception exc) {
        i(com.google.ads.interactivemedia.v3.impl.data.bj.COLLECT_SIGNALS, exc);
    }

    public final /* synthetic */ void d(alt altVar, Exception exc) {
        j(altVar);
        i(com.google.ads.interactivemedia.v3.impl.data.bj.COLLECT_SIGNALS, k(altVar, exc));
    }

    public final /* synthetic */ void e(alt altVar, Exception exc) {
        j(altVar);
        i(com.google.ads.interactivemedia.v3.impl.data.bj.INIT, k(altVar, exc));
    }

    public final void g() {
        this.f20164b.getTask().continueWith(this.f20167e, new alu(this, 4)).continueWithTask(this.f20167e, new alu(this, 2)).continueWith(this.f20167e, new alu(this, 3)).continueWith(this.f20167e, new alu(this, 5));
        this.f20165c.getTask();
    }

    public final void h(List list, Integer num) {
        if (num.intValue() == 0) {
            this.f20164b.trySetException(new Exception("No adapters to load"));
        } else {
            this.f20169g = num;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                alt altVar = null;
                try {
                    int i9 = 0;
                    Class<?> cls = Class.forName(str, false, alx.class.getClassLoader());
                    Class<?>[] interfaces = cls.getInterfaces();
                    String name = SecureSignalsAdapter.class.getName();
                    int length = interfaces.length;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        if (interfaces[i9].getName().equals(name)) {
                            altVar = new alt((SecureSignalsAdapter) cls.getDeclaredConstructor(null).newInstance(null), str, this.f20166d);
                            break;
                        }
                        i9++;
                    }
                } catch (Throwable unused) {
                }
                if (altVar != null) {
                    try {
                        this.f20163a.add(altVar);
                    } catch (Exception e9) {
                        i(com.google.ads.interactivemedia.v3.impl.data.bj.LOAD_ADAPTER, new Exception("Exception with SecureSignalsAdapter ".concat(String.valueOf(str)), e9));
                    }
                }
            }
            this.f20164b.trySetResult(this.f20163a);
        }
        this.f20164b.getTask();
    }
}
