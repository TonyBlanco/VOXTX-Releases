package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HandlerThread f39001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1610d f39002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f39003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f39005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f39006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f39007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f39008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f39009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f39010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f39011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39014n;

    public static class a extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final A f39015a;

        /* JADX INFO: renamed from: com.squareup.picasso.A$a$a, reason: collision with other inner class name */
        public class RunnableC0305a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Message f39016a;

            public RunnableC0305a(Message message) {
                this.f39016a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f39016a.what);
            }
        }

        public a(Looper looper, A a9) {
            super(looper);
            this.f39015a = a9;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 0) {
                this.f39015a.j();
                return;
            }
            if (i9 == 1) {
                this.f39015a.k();
                return;
            }
            if (i9 == 2) {
                this.f39015a.h(message.arg1);
                return;
            }
            if (i9 == 3) {
                this.f39015a.i(message.arg1);
            } else if (i9 != 4) {
                t.f39125p.post(new RunnableC0305a(message));
            } else {
                this.f39015a.l((Long) message.obj);
            }
        }
    }

    public A(InterfaceC1610d interfaceC1610d) {
        this.f39002b = interfaceC1610d;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.f39001a = handlerThread;
        handlerThread.start();
        G.j(handlerThread.getLooper());
        this.f39003c = new a(handlerThread.getLooper(), this);
    }

    public static long g(int i9, long j9) {
        return j9 / ((long) i9);
    }

    public B a() {
        return new B(this.f39002b.a(), this.f39002b.size(), this.f39004d, this.f39005e, this.f39006f, this.f39007g, this.f39008h, this.f39009i, this.f39010j, this.f39011k, this.f39012l, this.f39013m, this.f39014n, System.currentTimeMillis());
    }

    public void b(Bitmap bitmap) {
        m(bitmap, 2);
    }

    public void c(Bitmap bitmap) {
        m(bitmap, 3);
    }

    public void d() {
        this.f39003c.sendEmptyMessage(0);
    }

    public void e() {
        this.f39003c.sendEmptyMessage(1);
    }

    public void f(long j9) {
        Handler handler = this.f39003c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j9)));
    }

    public void h(long j9) {
        int i9 = this.f39013m + 1;
        this.f39013m = i9;
        long j10 = this.f39007g + j9;
        this.f39007g = j10;
        this.f39010j = g(i9, j10);
    }

    public void i(long j9) {
        this.f39014n++;
        long j10 = this.f39008h + j9;
        this.f39008h = j10;
        this.f39011k = g(this.f39013m, j10);
    }

    public void j() {
        this.f39004d++;
    }

    public void k() {
        this.f39005e++;
    }

    public void l(Long l9) {
        this.f39012l++;
        long jLongValue = this.f39006f + l9.longValue();
        this.f39006f = jLongValue;
        this.f39009i = g(this.f39012l, jLongValue);
    }

    public final void m(Bitmap bitmap, int i9) {
        int iK = G.k(bitmap);
        Handler handler = this.f39003c;
        handler.sendMessage(handler.obtainMessage(i9, iK, 0));
    }
}
