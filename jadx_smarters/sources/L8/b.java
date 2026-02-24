package L8;

import G8.C0587o;
import G8.InterfaceC0585n;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import k8.j;
import k8.k;
import k8.q;
import kotlin.jvm.internal.m;
import o8.InterfaceC2372d;
import p8.AbstractC2511b;
import p8.AbstractC2512c;
import q8.AbstractC2649h;
import w8.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    public static final class a implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0585n f4116a;

        public a(InterfaceC0585n interfaceC0585n) {
            this.f4116a = interfaceC0585n;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                InterfaceC0585n interfaceC0585n = this.f4116a;
                j.a aVar = j.f43666c;
                interfaceC0585n.resumeWith(j.b(k.a(exception)));
            } else {
                if (task.isCanceled()) {
                    InterfaceC0585n.a.a(this.f4116a, null, 1, null);
                    return;
                }
                InterfaceC0585n interfaceC0585n2 = this.f4116a;
                j.a aVar2 = j.f43666c;
                interfaceC0585n2.resumeWith(j.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: renamed from: L8.b$b, reason: collision with other inner class name */
    public static final class C0066b extends m implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CancellationTokenSource f4117a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0066b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f4117a = cancellationTokenSource;
        }

        public final void a(Throwable th) {
            this.f4117a.cancel();
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f43674a;
        }
    }

    public static final Object a(Task task, InterfaceC2372d interfaceC2372d) {
        return b(task, null, interfaceC2372d);
    }

    public static final Object b(Task task, CancellationTokenSource cancellationTokenSource, InterfaceC2372d interfaceC2372d) throws Exception {
        if (!task.isComplete()) {
            C0587o c0587o = new C0587o(AbstractC2511b.c(interfaceC2372d), 1);
            c0587o.v();
            task.addOnCompleteListener(L8.a.f4115a, new a(c0587o));
            if (cancellationTokenSource != null) {
                c0587o.x(new C0066b(cancellationTokenSource));
            }
            Object objR = c0587o.r();
            if (objR == AbstractC2512c.d()) {
                AbstractC2649h.c(interfaceC2372d);
            }
            return objR;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
