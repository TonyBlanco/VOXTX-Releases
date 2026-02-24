package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.AbstractC1607a;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Handler f39125p = new a(Looper.getMainLooper());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile t f39126q = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f39127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f39128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f39129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f39130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f39131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f39132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1610d f39133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final A f39134h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f39135i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f39136j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ReferenceQueue f39137k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bitmap.Config f39138l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39139m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f39140n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39141o;

    public static class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 3) {
                AbstractC1607a abstractC1607a = (AbstractC1607a) message.obj;
                if (abstractC1607a.g().f39140n) {
                    G.v("Main", "canceled", abstractC1607a.f39038b.d(), "target got garbage collected");
                }
                abstractC1607a.f39037a.b(abstractC1607a.k());
                return;
            }
            int i10 = 0;
            if (i9 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i10 < size) {
                    RunnableC1609c runnableC1609c = (RunnableC1609c) list.get(i10);
                    runnableC1609c.f39057c.e(runnableC1609c);
                    i10++;
                }
                return;
            }
            if (i9 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i10 < size2) {
                AbstractC1607a abstractC1607a2 = (AbstractC1607a) list2.get(i10);
                abstractC1607a2.f39037a.n(abstractC1607a2);
                i10++;
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f39142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public j f39143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ExecutorService f39144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC1610d f39145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f39146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g f39147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List f39148g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Bitmap.Config f39149h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f39150i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f39151j;

        public b(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.f39142a = context.getApplicationContext();
        }

        public t a() {
            Context context = this.f39142a;
            if (this.f39143b == null) {
                this.f39143b = G.g(context);
            }
            if (this.f39145d == null) {
                this.f39145d = new m(context);
            }
            if (this.f39144c == null) {
                this.f39144c = new v();
            }
            if (this.f39147f == null) {
                this.f39147f = g.f39156a;
            }
            A a9 = new A(this.f39145d);
            return new t(context, new i(context, this.f39144c, t.f39125p, this.f39143b, this.f39145d, a9), this.f39145d, this.f39146e, this.f39147f, this.f39148g, a9, this.f39149h, this.f39150i, this.f39151j);
        }

        public b b(j jVar) {
            if (jVar == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.f39143b != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.f39143b = jVar;
            return this;
        }

        public b c(d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.f39146e != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.f39146e = dVar;
            return this;
        }
    }

    public static class c extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReferenceQueue f39152a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f39153c;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f39154a;

            public a(Exception exc) {
                this.f39154a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new RuntimeException(this.f39154a);
            }
        }

        public c(ReferenceQueue referenceQueue, Handler handler) {
            this.f39152a = referenceQueue;
            this.f39153c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC1607a.C0306a c0306a = (AbstractC1607a.C0306a) this.f39152a.remove(1000L);
                    Message messageObtainMessage = this.f39153c.obtainMessage();
                    if (c0306a != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c0306a.f39049a;
                        this.f39153c.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e9) {
                    this.f39153c.post(new a(e9));
                    return;
                }
            }
        }
    }

    public interface d {
        void a(t tVar, Uri uri, Exception exc);
    }

    public enum e {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        final int debugColor;

        e(int i9) {
            this.debugColor = i9;
        }
    }

    public enum f {
        LOW,
        NORMAL,
        HIGH
    }

    public interface g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f39156a = new a();

        public static class a implements g {
            @Override // com.squareup.picasso.t.g
            public w a(w wVar) {
                return wVar;
            }
        }

        w a(w wVar);
    }

    public t(Context context, i iVar, InterfaceC1610d interfaceC1610d, d dVar, g gVar, List list, A a9, Bitmap.Config config, boolean z9, boolean z10) {
        this.f39131e = context;
        this.f39132f = iVar;
        this.f39133g = interfaceC1610d;
        this.f39127a = dVar;
        this.f39128b = gVar;
        this.f39138l = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new z(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C1612f(context));
        arrayList.add(new o(context));
        arrayList.add(new C1613g(context));
        arrayList.add(new C1608b(context));
        arrayList.add(new k(context));
        arrayList.add(new r(iVar.f39085d, a9));
        this.f39130d = Collections.unmodifiableList(arrayList);
        this.f39134h = a9;
        this.f39135i = new WeakHashMap();
        this.f39136j = new WeakHashMap();
        this.f39139m = z9;
        this.f39140n = z10;
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.f39137k = referenceQueue;
        c cVar = new c(referenceQueue, f39125p);
        this.f39129c = cVar;
        cVar.start();
    }

    public static t q(Context context) {
        if (f39126q == null) {
            synchronized (t.class) {
                try {
                    if (f39126q == null) {
                        f39126q = new b(context).a();
                    }
                } finally {
                }
            }
        }
        return f39126q;
    }

    public final void b(Object obj) {
        G.c();
        AbstractC1607a abstractC1607a = (AbstractC1607a) this.f39135i.remove(obj);
        if (abstractC1607a != null) {
            abstractC1607a.a();
            this.f39132f.c(abstractC1607a);
        }
        if (obj instanceof ImageView) {
            h hVar = (h) this.f39136j.remove((ImageView) obj);
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    public void c(ImageView imageView) {
        b(imageView);
    }

    public void d(C c9) {
        b(c9);
    }

    public void e(RunnableC1609c runnableC1609c) {
        AbstractC1607a abstractC1607aH = runnableC1609c.h();
        List listI = runnableC1609c.i();
        boolean z9 = (listI == null || listI.isEmpty()) ? false : true;
        if (abstractC1607aH != null || z9) {
            Uri uri = runnableC1609c.j().f39170d;
            Exception excK = runnableC1609c.k();
            Bitmap bitmapQ = runnableC1609c.q();
            e eVarM = runnableC1609c.m();
            if (abstractC1607aH != null) {
                g(bitmapQ, eVarM, abstractC1607aH);
            }
            if (z9) {
                int size = listI.size();
                for (int i9 = 0; i9 < size; i9++) {
                    g(bitmapQ, eVarM, (AbstractC1607a) listI.get(i9));
                }
            }
            d dVar = this.f39127a;
            if (dVar == null || excK == null) {
                return;
            }
            dVar.a(this, uri, excK);
        }
    }

    public void f(ImageView imageView, h hVar) {
        this.f39136j.put(imageView, hVar);
    }

    public final void g(Bitmap bitmap, e eVar, AbstractC1607a abstractC1607a) {
        if (abstractC1607a.l()) {
            return;
        }
        if (!abstractC1607a.m()) {
            this.f39135i.remove(abstractC1607a.k());
        }
        if (bitmap == null) {
            abstractC1607a.c();
            if (this.f39140n) {
                G.u("Main", "errored", abstractC1607a.f39038b.d());
                return;
            }
            return;
        }
        if (eVar == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        abstractC1607a.b(bitmap, eVar);
        if (this.f39140n) {
            G.v("Main", "completed", abstractC1607a.f39038b.d(), "from " + eVar);
        }
    }

    public void h(AbstractC1607a abstractC1607a) {
        Object objK = abstractC1607a.k();
        if (objK != null && this.f39135i.get(objK) != abstractC1607a) {
            b(objK);
            this.f39135i.put(objK, abstractC1607a);
        }
        o(abstractC1607a);
    }

    public List i() {
        return this.f39130d;
    }

    public x j(int i9) {
        if (i9 != 0) {
            return new x(this, null, i9);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    public x k(Uri uri) {
        return new x(this, uri, 0);
    }

    public x l(String str) {
        if (str == null) {
            return new x(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return k(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public Bitmap m(String str) {
        Bitmap bitmap = this.f39133g.get(str);
        A a9 = this.f39134h;
        if (bitmap != null) {
            a9.d();
        } else {
            a9.e();
        }
        return bitmap;
    }

    public void n(AbstractC1607a abstractC1607a) {
        Bitmap bitmapM = p.shouldReadFromMemoryCache(abstractC1607a.f39041e) ? m(abstractC1607a.d()) : null;
        if (bitmapM == null) {
            h(abstractC1607a);
            if (this.f39140n) {
                G.u("Main", "resumed", abstractC1607a.f39038b.d());
                return;
            }
            return;
        }
        e eVar = e.MEMORY;
        g(bitmapM, eVar, abstractC1607a);
        if (this.f39140n) {
            G.v("Main", "completed", abstractC1607a.f39038b.d(), "from " + eVar);
        }
    }

    public void o(AbstractC1607a abstractC1607a) {
        this.f39132f.h(abstractC1607a);
    }

    public w p(w wVar) {
        w wVarA = this.f39128b.a(wVar);
        if (wVarA != null) {
            return wVarA;
        }
        throw new IllegalStateException("Request transformer " + this.f39128b.getClass().getCanonicalName() + " returned null for " + wVar);
    }
}
