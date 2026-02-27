package d4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d4.InterfaceC1705w;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class X implements InterfaceC1705w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f39740b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f39741a;

    public static final class b implements InterfaceC1705w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f39742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public X f39743b;

        public b() {
        }

        @Override // d4.InterfaceC1705w.a
        public void a() {
            ((Message) AbstractC1684a.e(this.f39742a)).sendToTarget();
            b();
        }

        public final void b() {
            this.f39742a = null;
            this.f39743b = null;
            X.o(this);
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) AbstractC1684a.e(this.f39742a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, X x9) {
            this.f39742a = message;
            this.f39743b = x9;
            return this;
        }
    }

    public X(Handler handler) {
        this.f39741a = handler;
    }

    public static b n() {
        b bVar;
        List list = f39740b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : (b) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public static void o(b bVar) {
        List list = f39740b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d4.InterfaceC1705w
    public InterfaceC1705w.a a(int i9) {
        return n().d(this.f39741a.obtainMessage(i9), this);
    }

    @Override // d4.InterfaceC1705w
    public boolean b(int i9) {
        return this.f39741a.hasMessages(i9);
    }

    @Override // d4.InterfaceC1705w
    public InterfaceC1705w.a c(int i9, int i10, int i11, Object obj) {
        return n().d(this.f39741a.obtainMessage(i9, i10, i11, obj), this);
    }

    @Override // d4.InterfaceC1705w
    public InterfaceC1705w.a d(int i9, Object obj) {
        return n().d(this.f39741a.obtainMessage(i9, obj), this);
    }

    @Override // d4.InterfaceC1705w
    public void e(Object obj) {
        this.f39741a.removeCallbacksAndMessages(obj);
    }

    @Override // d4.InterfaceC1705w
    public Looper f() {
        return this.f39741a.getLooper();
    }

    @Override // d4.InterfaceC1705w
    public InterfaceC1705w.a g(int i9, int i10, int i11) {
        return n().d(this.f39741a.obtainMessage(i9, i10, i11), this);
    }

    @Override // d4.InterfaceC1705w
    public boolean h(InterfaceC1705w.a aVar) {
        return ((b) aVar).c(this.f39741a);
    }

    @Override // d4.InterfaceC1705w
    public boolean i(Runnable runnable) {
        return this.f39741a.post(runnable);
    }

    @Override // d4.InterfaceC1705w
    public boolean j(int i9) {
        return this.f39741a.sendEmptyMessage(i9);
    }

    @Override // d4.InterfaceC1705w
    public boolean k(int i9, long j9) {
        return this.f39741a.sendEmptyMessageAtTime(i9, j9);
    }

    @Override // d4.InterfaceC1705w
    public void l(int i9) {
        this.f39741a.removeMessages(i9);
    }
}
