package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import com.squareup.picasso.j;
import com.squareup.picasso.r;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import d.AbstractC1617D;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.squareup.picasso.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class RunnableC1609c implements Runnable {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object f39052u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final ThreadLocal f39053v = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicInteger f39054w = new AtomicInteger();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final y f39055x = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39056a = f39054w.incrementAndGet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f39057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f39058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1610d f39059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A f39060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f39061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f39062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f39063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y f39065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC1607a f39066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f39067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f39068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Future f39069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public t.e f39070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Exception f39071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f39072r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f39073s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t.f f39074t;

    /* JADX INFO: renamed from: com.squareup.picasso.c$a */
    public static class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$b */
    public static class b extends y {
        @Override // com.squareup.picasso.y
        public boolean c(w wVar) {
            return true;
        }

        @Override // com.squareup.picasso.y
        public y.a f(w wVar, int i9) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* JADX INFO: renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    public static class RunnableC0307c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RuntimeException f39075a;

        public RunnableC0307c(E e9, RuntimeException runtimeException) {
            this.f39075a = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            new StringBuilder().append("Transformation ");
            throw null;
        }
    }

    public RunnableC1609c(t tVar, i iVar, InterfaceC1610d interfaceC1610d, A a9, AbstractC1607a abstractC1607a, y yVar) {
        this.f39057c = tVar;
        this.f39058d = iVar;
        this.f39059e = interfaceC1610d;
        this.f39060f = a9;
        this.f39066l = abstractC1607a;
        this.f39061g = abstractC1607a.d();
        this.f39062h = abstractC1607a.i();
        this.f39074t = abstractC1607a.h();
        this.f39063i = abstractC1607a.e();
        this.f39064j = abstractC1607a.f();
        this.f39065k = yVar;
        this.f39073s = yVar.e();
    }

    public static Bitmap a(List list, Bitmap bitmap) {
        if (list.size() <= 0) {
            return bitmap;
        }
        AbstractC1617D.a(list.get(0));
        try {
            throw null;
        } catch (RuntimeException e9) {
            t.f39125p.post(new RunnableC0307c(null, e9));
            return null;
        }
    }

    public static Bitmap e(InputStream inputStream, w wVar) throws IOException {
        n nVar = new n(inputStream);
        long jC = nVar.c(65536);
        BitmapFactory.Options optionsD = y.d(wVar);
        boolean zG = y.g(optionsD);
        boolean zT = G.t(nVar);
        nVar.a(jC);
        if (zT) {
            byte[] bArrX = G.x(nVar);
            if (zG) {
                BitmapFactory.decodeByteArray(bArrX, 0, bArrX.length, optionsD);
                y.b(wVar.f39174h, wVar.f39175i, optionsD, wVar);
            }
            return BitmapFactory.decodeByteArray(bArrX, 0, bArrX.length, optionsD);
        }
        if (zG) {
            BitmapFactory.decodeStream(nVar, null, optionsD);
            y.b(wVar.f39174h, wVar.f39175i, optionsD, wVar);
            nVar.a(jC);
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(nVar, null, optionsD);
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    public static RunnableC1609c g(t tVar, i iVar, InterfaceC1610d interfaceC1610d, A a9, AbstractC1607a abstractC1607a) {
        w wVarI = abstractC1607a.i();
        List listI = tVar.i();
        int size = listI.size();
        for (int i9 = 0; i9 < size; i9++) {
            y yVar = (y) listI.get(i9);
            if (yVar.c(wVarI)) {
                return new RunnableC1609c(tVar, iVar, interfaceC1610d, a9, abstractC1607a, yVar);
            }
        }
        return new RunnableC1609c(tVar, iVar, interfaceC1610d, a9, abstractC1607a, f39055x);
    }

    public static boolean t(boolean z9, int i9, int i10, int i11, int i12) {
        return !z9 || i9 > i11 || i10 > i12;
    }

    public static Bitmap w(w wVar, Bitmap bitmap, int i9) {
        int i10;
        int i11;
        int i12;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int iCeil;
        int i13;
        int i14;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        boolean z9 = wVar.f39178l;
        Matrix matrix = new Matrix();
        int i15 = 0;
        if (wVar.e()) {
            int i16 = wVar.f39174h;
            int i17 = wVar.f39175i;
            float f14 = wVar.f39179m;
            if (f14 != 0.0f) {
                if (wVar.f39182p) {
                    matrix.setRotate(f14, wVar.f39180n, wVar.f39181o);
                } else {
                    matrix.setRotate(f14);
                }
            }
            if (wVar.f39176j) {
                float f15 = i16;
                float f16 = f15 / width;
                float f17 = i17;
                float f18 = f17 / height;
                if (f16 > f18) {
                    iCeil = (int) Math.ceil(r10 * (f18 / f16));
                    i14 = (height - iCeil) / 2;
                    f18 = f17 / iCeil;
                    f13 = f16;
                    i13 = width;
                } else {
                    int iCeil2 = (int) Math.ceil(r6 * (f16 / f18));
                    f13 = f15 / iCeil2;
                    iCeil = height;
                    i15 = (width - iCeil2) / 2;
                    i13 = iCeil2;
                    i14 = 0;
                }
                if (t(z9, width, height, i16, i17)) {
                    matrix.preScale(f13, f18);
                }
                i12 = i14;
                i10 = i13;
                i11 = iCeil;
            } else {
                if (wVar.f39177k) {
                    float f19 = i16 / width;
                    float f20 = i17 / height;
                    if (f19 >= f20) {
                        f19 = f20;
                    }
                    if (t(z9, width, height, i16, i17)) {
                        matrix.preScale(f19, f19);
                    }
                } else if ((i16 != 0 || i17 != 0) && (i16 != width || i17 != height)) {
                    if (i16 != 0) {
                        f9 = i16;
                        f10 = width;
                    } else {
                        f9 = i17;
                        f10 = height;
                    }
                    float f21 = f9 / f10;
                    if (i17 != 0) {
                        f11 = i17;
                        f12 = height;
                    } else {
                        f11 = i16;
                        f12 = width;
                    }
                    float f22 = f11 / f12;
                    if (t(z9, width, height, i16, i17)) {
                        matrix.preScale(f21, f22);
                    }
                }
                i10 = width;
                i11 = height;
                i12 = 0;
            }
        } else {
            i10 = width;
            i11 = height;
            i12 = 0;
        }
        if (i9 != 0) {
            matrix.preRotate(i9);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, i15, i12, i10, i11, matrix, true);
        if (bitmapCreateBitmap == bitmap) {
            return bitmap;
        }
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    public static void x(w wVar) {
        String strA = wVar.a();
        StringBuilder sb = (StringBuilder) f39053v.get();
        sb.ensureCapacity(strA.length() + 8);
        sb.replace(8, sb.length(), strA);
        Thread.currentThread().setName(sb.toString());
    }

    public void b(AbstractC1607a abstractC1607a) {
        String strD;
        String strM;
        boolean z9 = this.f39057c.f39140n;
        w wVar = abstractC1607a.f39038b;
        if (this.f39066l != null) {
            if (this.f39067m == null) {
                this.f39067m = new ArrayList(3);
            }
            this.f39067m.add(abstractC1607a);
            if (z9) {
                G.v("Hunter", "joined", wVar.d(), G.m(this, "to "));
            }
            t.f fVarH = abstractC1607a.h();
            if (fVarH.ordinal() > this.f39074t.ordinal()) {
                this.f39074t = fVarH;
                return;
            }
            return;
        }
        this.f39066l = abstractC1607a;
        if (z9) {
            List list = this.f39067m;
            if (list == null || list.isEmpty()) {
                strD = wVar.d();
                strM = "to empty hunter";
            } else {
                strD = wVar.d();
                strM = G.m(this, "to ");
            }
            G.v("Hunter", "joined", strD, strM);
        }
    }

    public boolean c() {
        Future future;
        if (this.f39066l != null) {
            return false;
        }
        List list = this.f39067m;
        return (list == null || list.isEmpty()) && (future = this.f39069o) != null && future.cancel(false);
    }

    public final t.f d() {
        t.f fVarH = t.f.LOW;
        List list = this.f39067m;
        boolean z9 = (list == null || list.isEmpty()) ? false : true;
        AbstractC1607a abstractC1607a = this.f39066l;
        if (abstractC1607a == null && !z9) {
            return fVarH;
        }
        if (abstractC1607a != null) {
            fVarH = abstractC1607a.h();
        }
        if (z9) {
            int size = this.f39067m.size();
            for (int i9 = 0; i9 < size; i9++) {
                t.f fVarH2 = ((AbstractC1607a) this.f39067m.get(i9)).h();
                if (fVarH2.ordinal() > fVarH.ordinal()) {
                    fVarH = fVarH2;
                }
            }
        }
        return fVarH;
    }

    public void f(AbstractC1607a abstractC1607a) {
        boolean zRemove;
        if (this.f39066l == abstractC1607a) {
            this.f39066l = null;
            zRemove = true;
        } else {
            List list = this.f39067m;
            zRemove = list != null ? list.remove(abstractC1607a) : false;
        }
        if (zRemove && abstractC1607a.h() == this.f39074t) {
            this.f39074t = d();
        }
        if (this.f39057c.f39140n) {
            G.v("Hunter", "removed", abstractC1607a.f39038b.d(), G.m(this, "from "));
        }
    }

    public AbstractC1607a h() {
        return this.f39066l;
    }

    public List i() {
        return this.f39067m;
    }

    public w j() {
        return this.f39062h;
    }

    public Exception k() {
        return this.f39071q;
    }

    public String l() {
        return this.f39061g;
    }

    public t.e m() {
        return this.f39070p;
    }

    public int n() {
        return this.f39063i;
    }

    public t o() {
        return this.f39057c;
    }

    public t.f p() {
        return this.f39074t;
    }

    public Bitmap q() {
        return this.f39068n;
    }

    public Bitmap r() {
        Bitmap bitmapW;
        if (p.shouldReadFromMemoryCache(this.f39063i)) {
            bitmapW = this.f39059e.get(this.f39061g);
            if (bitmapW != null) {
                this.f39060f.d();
                this.f39070p = t.e.MEMORY;
                if (this.f39057c.f39140n) {
                    G.v("Hunter", "decoded", this.f39062h.d(), "from cache");
                }
                return bitmapW;
            }
        } else {
            bitmapW = null;
        }
        w wVar = this.f39062h;
        wVar.f39169c = this.f39073s == 0 ? q.OFFLINE.index : this.f39064j;
        y.a aVarF = this.f39065k.f(wVar, this.f39064j);
        if (aVarF != null) {
            this.f39070p = aVarF.c();
            this.f39072r = aVarF.b();
            bitmapW = aVarF.a();
            if (bitmapW == null) {
                InputStream inputStreamD = aVarF.d();
                try {
                    Bitmap bitmapE = e(inputStreamD, this.f39062h);
                    G.e(inputStreamD);
                    bitmapW = bitmapE;
                } catch (Throwable th) {
                    G.e(inputStreamD);
                    throw th;
                }
            }
        }
        if (bitmapW != null) {
            if (this.f39057c.f39140n) {
                G.u("Hunter", "decoded", this.f39062h.d());
            }
            this.f39060f.b(bitmapW);
            if (this.f39062h.f() || this.f39072r != 0) {
                synchronized (f39052u) {
                    try {
                        if (this.f39062h.e() || this.f39072r != 0) {
                            bitmapW = w(this.f39062h, bitmapW, this.f39072r);
                            if (this.f39057c.f39140n) {
                                G.u("Hunter", "transformed", this.f39062h.d());
                            }
                        }
                        if (this.f39062h.b()) {
                            bitmapW = a(this.f39062h.f39173g, bitmapW);
                            if (this.f39057c.f39140n) {
                                G.v("Hunter", "transformed", this.f39062h.d(), "from custom transformations");
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (bitmapW != null) {
                    this.f39060f.c(bitmapW);
                }
            }
        }
        return bitmapW;
    }

    @Override // java.lang.Runnable
    public void run() {
        i iVar;
        i iVar2;
        try {
            try {
                try {
                    try {
                        x(this.f39062h);
                        if (this.f39057c.f39140n) {
                            G.u("Hunter", "executing", G.l(this));
                        }
                        Bitmap bitmapR = r();
                        this.f39068n = bitmapR;
                        if (bitmapR == null) {
                            this.f39058d.e(this);
                        } else {
                            this.f39058d.d(this);
                        }
                    } catch (IOException e9) {
                        this.f39071q = e9;
                        iVar2 = this.f39058d;
                        iVar2.g(this);
                        Thread.currentThread().setName("Picasso-Idle");
                    }
                } catch (j.b e10) {
                    if (!e10.f39106a || e10.f39107c != 504) {
                        this.f39071q = e10;
                    }
                    iVar = this.f39058d;
                    iVar.e(this);
                    Thread.currentThread().setName("Picasso-Idle");
                } catch (Exception e11) {
                    this.f39071q = e11;
                    iVar = this.f39058d;
                    iVar.e(this);
                    Thread.currentThread().setName("Picasso-Idle");
                }
            } catch (r.a e12) {
                this.f39071q = e12;
                iVar2 = this.f39058d;
                iVar2.g(this);
                Thread.currentThread().setName("Picasso-Idle");
            } catch (OutOfMemoryError e13) {
                StringWriter stringWriter = new StringWriter();
                this.f39060f.a().a(new PrintWriter(stringWriter));
                this.f39071q = new RuntimeException(stringWriter.toString(), e13);
                iVar = this.f39058d;
                iVar.e(this);
                Thread.currentThread().setName("Picasso-Idle");
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    public boolean s() {
        Future future = this.f39069o;
        return future != null && future.isCancelled();
    }

    public boolean u(boolean z9, NetworkInfo networkInfo) {
        int i9 = this.f39073s;
        if (i9 <= 0) {
            return false;
        }
        this.f39073s = i9 - 1;
        return this.f39065k.h(z9, networkInfo);
    }

    public boolean v() {
        return this.f39065k.i();
    }
}
