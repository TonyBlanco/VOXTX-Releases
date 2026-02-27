package Y6;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f10697k = "l";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Z6.g f10698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HandlerThread f10699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f10700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f10701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f10702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f10703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10704g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10705h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler.Callback f10706i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Z6.p f10707j = new b();

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == B6.k.f711e) {
                l.this.g((w) message.obj);
                return true;
            }
            if (i9 != B6.k.f715i) {
                return true;
            }
            l.this.h();
            return true;
        }
    }

    public class b implements Z6.p {
        public b() {
        }

        @Override // Z6.p
        public void a(Exception exc) {
            synchronized (l.this.f10705h) {
                try {
                    if (l.this.f10704g) {
                        l.this.f10700c.obtainMessage(B6.k.f715i).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // Z6.p
        public void b(w wVar) {
            synchronized (l.this.f10705h) {
                try {
                    if (l.this.f10704g) {
                        l.this.f10700c.obtainMessage(B6.k.f711e, wVar).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public l(Z6.g gVar, i iVar, Handler handler) {
        x.a();
        this.f10698a = gVar;
        this.f10701d = iVar;
        this.f10702e = handler;
    }

    public x6.i f(w wVar) {
        if (this.f10703f == null) {
            return null;
        }
        return wVar.a();
    }

    public final void g(w wVar) {
        Message messageObtain;
        long jCurrentTimeMillis = System.currentTimeMillis();
        wVar.d(this.f10703f);
        x6.i iVarF = f(wVar);
        x6.o oVarC = iVarF != null ? this.f10701d.c(iVarF) : null;
        if (oVarC != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Log.d(f10697k, "Found barcode in " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
            if (this.f10702e != null) {
                messageObtain = Message.obtain(this.f10702e, B6.k.f713g, new Y6.b(oVarC, wVar));
                messageObtain.setData(new Bundle());
                messageObtain.sendToTarget();
            }
        } else {
            Handler handler = this.f10702e;
            if (handler != null) {
                messageObtain = Message.obtain(handler, B6.k.f712f);
                messageObtain.sendToTarget();
            }
        }
        if (this.f10702e != null) {
            Message.obtain(this.f10702e, B6.k.f714h, Y6.b.e(this.f10701d.d(), wVar)).sendToTarget();
        }
        h();
    }

    public final void h() {
        this.f10698a.v(this.f10707j);
    }

    public void i(Rect rect) {
        this.f10703f = rect;
    }

    public void j(i iVar) {
        this.f10701d = iVar;
    }

    public void k() {
        x.a();
        HandlerThread handlerThread = new HandlerThread(f10697k);
        this.f10699b = handlerThread;
        handlerThread.start();
        this.f10700c = new Handler(this.f10699b.getLooper(), this.f10706i);
        this.f10704g = true;
        h();
    }

    public void l() {
        x.a();
        synchronized (this.f10705h) {
            this.f10704g = false;
            this.f10700c.removeCallbacksAndMessages(null);
            this.f10699b.quit();
        }
    }
}
