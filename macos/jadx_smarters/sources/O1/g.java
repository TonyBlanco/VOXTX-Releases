package O1;

import Z1.l;
import Z1.m;
import a2.C1079a;
import a2.C1080b;
import a2.C1081c;
import a2.C1082d;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.widget.ImageView;
import androidx.fragment.app.AbstractActivityC1145e;
import b2.C1200a;
import b2.C1201b;
import b2.C1202c;
import b2.C1203d;
import b2.C1204e;
import b2.C1205f;
import b2.C1206g;
import d.AbstractC1617D;
import d2.C1655e;
import d2.C1657g;
import d2.C1659i;
import d2.C1660j;
import d2.n;
import d2.p;
import e2.AbstractC1732b;
import f2.C1764d;
import h2.C1849a;
import i2.C1879a;
import i2.C1880b;
import i2.C1882d;
import i2.InterfaceC1881c;
import j2.C2085k;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k2.C2137b;
import l2.InterfaceC2175b;
import m2.InterfaceC2221b;
import o2.C2311f;
import o2.InterfaceC2315j;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile g f5457o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f5458p = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1.c f5459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U1.c f5460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.b f5461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W1.h f5462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S1.a f5463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2311f f5464f = new C2311f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1882d f5465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l2.c f5466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1655e f5467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h2.f f5468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1659i f5469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h2.f f5470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f5471m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Y1.a f5472n;

    public g(U1.c cVar, W1.h hVar, V1.b bVar, Context context, S1.a aVar) {
        C1882d c1882d = new C1882d();
        this.f5465g = c1882d;
        this.f5460b = cVar;
        this.f5461c = bVar;
        this.f5462d = hVar;
        this.f5463e = aVar;
        this.f5459a = new Z1.c(context);
        this.f5471m = new Handler(Looper.getMainLooper());
        this.f5472n = new Y1.a(hVar, bVar, aVar);
        l2.c cVar2 = new l2.c();
        this.f5466h = cVar2;
        p pVar = new p(bVar, aVar);
        cVar2.b(InputStream.class, Bitmap.class, pVar);
        C1657g c1657g = new C1657g(bVar, aVar);
        cVar2.b(ParcelFileDescriptor.class, Bitmap.class, c1657g);
        n nVar = new n(pVar, c1657g);
        cVar2.b(Z1.g.class, Bitmap.class, nVar);
        g2.c cVar3 = new g2.c(context, bVar);
        cVar2.b(InputStream.class, g2.b.class, cVar3);
        cVar2.b(Z1.g.class, C1849a.class, new h2.g(nVar, cVar3, bVar));
        cVar2.b(InputStream.class, File.class, new C1764d());
        s(File.class, ParcelFileDescriptor.class, new C1079a.C0155a());
        s(File.class, InputStream.class, new C1202c.a());
        Class cls = Integer.TYPE;
        s(cls, ParcelFileDescriptor.class, new C1080b.a());
        s(cls, InputStream.class, new C1203d.a());
        s(Integer.class, ParcelFileDescriptor.class, new C1080b.a());
        s(Integer.class, InputStream.class, new C1203d.a());
        s(String.class, ParcelFileDescriptor.class, new C1081c.a());
        s(String.class, InputStream.class, new C1204e.a());
        s(Uri.class, ParcelFileDescriptor.class, new C1082d.a());
        s(Uri.class, InputStream.class, new C1205f.a());
        s(URL.class, InputStream.class, new C1206g.a());
        s(Z1.d.class, InputStream.class, new C1200a.C0210a());
        s(byte[].class, InputStream.class, new C1201b.a());
        c1882d.b(Bitmap.class, C1660j.class, new C1880b(context.getResources(), bVar));
        c1882d.b(C1849a.class, AbstractC1732b.class, new C1879a(new C1880b(context.getResources(), bVar)));
        C1655e c1655e = new C1655e(bVar);
        this.f5467i = c1655e;
        this.f5468j = new h2.f(bVar, c1655e);
        C1659i c1659i = new C1659i(bVar);
        this.f5469k = c1659i;
        this.f5470l = new h2.f(bVar, c1659i);
    }

    public static l b(Class cls, Context context) {
        return d(cls, ParcelFileDescriptor.class, context);
    }

    public static l d(Class cls, Class cls2, Context context) {
        if (cls != null) {
            return i(context).q().a(cls, cls2);
        }
        if (!Log.isLoggable("Glide", 3)) {
            return null;
        }
        Log.d("Glide", "Unable to load null model, setting placeholder only");
        return null;
    }

    public static l e(Class cls, Context context) {
        return d(cls, InputStream.class, context);
    }

    public static void g(InterfaceC2315j interfaceC2315j) {
        AbstractC2539h.a();
        InterfaceC2221b interfaceC2221bE = interfaceC2315j.e();
        if (interfaceC2221bE != null) {
            interfaceC2221bE.clear();
            interfaceC2315j.h(null);
        }
    }

    public static g i(Context context) {
        if (f5457o == null) {
            synchronized (g.class) {
                try {
                    if (f5457o == null) {
                        Context applicationContext = context.getApplicationContext();
                        h hVar = new h(applicationContext);
                        List listR = r(applicationContext);
                        Iterator it = listR.iterator();
                        if (it.hasNext()) {
                            AbstractC1617D.a(it.next());
                            throw null;
                        }
                        f5457o = hVar.a();
                        Iterator it2 = listR.iterator();
                        if (it2.hasNext()) {
                            AbstractC1617D.a(it2.next());
                            throw null;
                        }
                    }
                } finally {
                }
            }
        }
        return f5457o;
    }

    public static List r(Context context) {
        return f5458p ? new C2137b(context).a() : Collections.emptyList();
    }

    public static j u(Context context) {
        return C2085k.f().d(context);
    }

    public static j v(AbstractActivityC1145e abstractActivityC1145e) {
        return C2085k.f().e(abstractActivityC1145e);
    }

    public InterfaceC2175b a(Class cls, Class cls2) {
        return this.f5466h.a(cls, cls2);
    }

    public InterfaceC2315j c(ImageView imageView, Class cls) {
        return this.f5464f.a(imageView, cls);
    }

    public InterfaceC1881c f(Class cls, Class cls2) {
        return this.f5465g.a(cls, cls2);
    }

    public void h() {
        AbstractC2539h.a();
        this.f5462d.c();
        this.f5461c.c();
    }

    public C1655e j() {
        return this.f5467i;
    }

    public C1659i k() {
        return this.f5469k;
    }

    public V1.b l() {
        return this.f5461c;
    }

    public S1.a m() {
        return this.f5463e;
    }

    public h2.f n() {
        return this.f5468j;
    }

    public h2.f o() {
        return this.f5470l;
    }

    public U1.c p() {
        return this.f5460b;
    }

    public final Z1.c q() {
        return this.f5459a;
    }

    public void s(Class cls, Class cls2, m mVar) {
        m mVarF = this.f5459a.f(cls, cls2, mVar);
        if (mVarF != null) {
            mVarF.a();
        }
    }

    public void t(int i9) {
        AbstractC2539h.a();
        this.f5462d.b(i9);
        this.f5461c.b(i9);
    }
}
