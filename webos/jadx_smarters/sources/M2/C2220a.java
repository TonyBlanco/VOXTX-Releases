package m2;

import O1.i;
import S1.g;
import U1.c;
import U1.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import i2.InterfaceC1881c;
import java.util.Queue;
import o2.InterfaceC2313h;
import o2.InterfaceC2315j;
import q2.AbstractC2535d;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2220a implements InterfaceC2221b, InterfaceC2313h, InterfaceC2224e {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Queue f44288D = AbstractC2539h.c(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c.C0123c f44289A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f44290B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public EnumC0380a f44291C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44292a = String.valueOf(hashCode());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public S1.c f44293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Drawable f44294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f44298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f44299h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public l2.f f44300i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC2222c f44301j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f44302k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Class f44303l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44304m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f44305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC2315j f44306o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC2223d f44307p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f44308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public U1.c f44309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n2.d f44310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f44311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f44312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public U1.b f44313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f44314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f44315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f44316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l f44317z;

    /* JADX INFO: renamed from: m2.a$a, reason: collision with other inner class name */
    public enum EnumC0380a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    public static void k(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    public static C2220a t(l2.f fVar, Object obj, S1.c cVar, Context context, i iVar, InterfaceC2315j interfaceC2315j, float f9, Drawable drawable, int i9, Drawable drawable2, int i10, Drawable drawable3, int i11, InterfaceC2223d interfaceC2223d, InterfaceC2222c interfaceC2222c, U1.c cVar2, g gVar, Class cls, boolean z9, n2.d dVar, int i12, int i13, U1.b bVar) {
        C2220a c2220a = (C2220a) f44288D.poll();
        if (c2220a == null) {
            c2220a = new C2220a();
        }
        c2220a.o(fVar, obj, cVar, context, iVar, interfaceC2315j, f9, drawable, i9, drawable2, i10, drawable3, i11, interfaceC2223d, interfaceC2222c, cVar2, gVar, cls, z9, dVar, i12, i13, bVar);
        return c2220a;
    }

    @Override // m2.InterfaceC2224e
    public void a(Exception exc) {
        if (Log.isLoggable("GenericRequest", 3)) {
            Log.d("GenericRequest", "load failed", exc);
        }
        this.f44291C = EnumC0380a.FAILED;
        InterfaceC2223d interfaceC2223d = this.f44307p;
        if (interfaceC2223d == null || !interfaceC2223d.a(exc, this.f44302k, this.f44306o, q())) {
            w(exc);
        }
    }

    @Override // m2.InterfaceC2221b
    public void b() {
        this.f44300i = null;
        this.f44302k = null;
        this.f44298g = null;
        this.f44306o = null;
        this.f44314w = null;
        this.f44315x = null;
        this.f44294c = null;
        this.f44307p = null;
        this.f44301j = null;
        this.f44299h = null;
        this.f44310s = null;
        this.f44316y = false;
        this.f44289A = null;
        f44288D.offer(this);
    }

    @Override // m2.InterfaceC2221b
    public void clear() {
        AbstractC2539h.a();
        EnumC0380a enumC0380a = this.f44291C;
        EnumC0380a enumC0380a2 = EnumC0380a.CLEARED;
        if (enumC0380a == enumC0380a2) {
            return;
        }
        j();
        l lVar = this.f44317z;
        if (lVar != null) {
            v(lVar);
        }
        if (h()) {
            this.f44306o.f(n());
        }
        this.f44291C = enumC0380a2;
    }

    @Override // m2.InterfaceC2221b
    public boolean d() {
        return isComplete();
    }

    @Override // o2.InterfaceC2313h
    public void e(int i9, int i10) {
        if (Log.isLoggable("GenericRequest", 2)) {
            r("Got onSizeReady in " + AbstractC2535d.a(this.f44290B));
        }
        if (this.f44291C != EnumC0380a.WAITING_FOR_SIZE) {
            return;
        }
        this.f44291C = EnumC0380a.RUNNING;
        int iRound = Math.round(this.f44308q * i9);
        int iRound2 = Math.round(this.f44308q * i10);
        T1.c cVarA = this.f44300i.h().a(this.f44302k, iRound, iRound2);
        if (cVarA == null) {
            a(new Exception("Failed to load model: '" + this.f44302k + "'"));
            return;
        }
        InterfaceC1881c interfaceC1881cD = this.f44300i.d();
        if (Log.isLoggable("GenericRequest", 2)) {
            r("finished setup for calling load in " + AbstractC2535d.a(this.f44290B));
        }
        this.f44316y = true;
        this.f44289A = this.f44309r.g(this.f44293b, iRound, iRound2, cVarA, this.f44300i, this.f44299h, interfaceC1881cD, this.f44305n, this.f44304m, this.f44313v, this);
        this.f44316y = this.f44317z != null;
        if (Log.isLoggable("GenericRequest", 2)) {
            r("finished onSizeReady in " + AbstractC2535d.a(this.f44290B));
        }
    }

    @Override // m2.InterfaceC2224e
    public void f(l lVar) {
        if (lVar == null) {
            a(new Exception("Expected to receive a Resource<R> with an object of " + this.f44303l + " inside, but instead got null."));
            return;
        }
        Object obj = lVar.get();
        if (obj != null && this.f44303l.isAssignableFrom(obj.getClass())) {
            if (i()) {
                u(lVar, obj);
                return;
            } else {
                v(lVar);
                this.f44291C = EnumC0380a.COMPLETE;
                return;
            }
        }
        v(lVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Expected to receive an object of ");
        sb.append(this.f44303l);
        sb.append(" but instead got ");
        sb.append(obj != null ? obj.getClass() : "");
        sb.append("{");
        sb.append(obj);
        sb.append("}");
        sb.append(" inside Resource{");
        sb.append(lVar);
        sb.append("}.");
        sb.append(obj == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "");
        a(new Exception(sb.toString()));
    }

    @Override // m2.InterfaceC2221b
    public void g() {
        this.f44290B = AbstractC2535d.b();
        if (this.f44302k == null) {
            a(null);
            return;
        }
        this.f44291C = EnumC0380a.WAITING_FOR_SIZE;
        if (AbstractC2539h.k(this.f44311t, this.f44312u)) {
            e(this.f44311t, this.f44312u);
        } else {
            this.f44306o.i(this);
        }
        if (!isComplete() && !p() && h()) {
            this.f44306o.d(n());
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            r("finished run method in " + AbstractC2535d.a(this.f44290B));
        }
    }

    public final boolean h() {
        InterfaceC2222c interfaceC2222c = this.f44301j;
        return interfaceC2222c == null || interfaceC2222c.f(this);
    }

    public final boolean i() {
        InterfaceC2222c interfaceC2222c = this.f44301j;
        return interfaceC2222c == null || interfaceC2222c.c(this);
    }

    @Override // m2.InterfaceC2221b
    public boolean isCancelled() {
        EnumC0380a enumC0380a = this.f44291C;
        return enumC0380a == EnumC0380a.CANCELLED || enumC0380a == EnumC0380a.CLEARED;
    }

    @Override // m2.InterfaceC2221b
    public boolean isComplete() {
        return this.f44291C == EnumC0380a.COMPLETE;
    }

    @Override // m2.InterfaceC2221b
    public boolean isRunning() {
        EnumC0380a enumC0380a = this.f44291C;
        return enumC0380a == EnumC0380a.RUNNING || enumC0380a == EnumC0380a.WAITING_FOR_SIZE;
    }

    public void j() {
        this.f44291C = EnumC0380a.CANCELLED;
        c.C0123c c0123c = this.f44289A;
        if (c0123c != null) {
            c0123c.a();
            this.f44289A = null;
        }
    }

    public final Drawable l() {
        if (this.f44315x == null && this.f44297f > 0) {
            this.f44315x = this.f44298g.getResources().getDrawable(this.f44297f);
        }
        return this.f44315x;
    }

    public final Drawable m() {
        if (this.f44294c == null && this.f44295d > 0) {
            this.f44294c = this.f44298g.getResources().getDrawable(this.f44295d);
        }
        return this.f44294c;
    }

    public final Drawable n() {
        if (this.f44314w == null && this.f44296e > 0) {
            this.f44314w = this.f44298g.getResources().getDrawable(this.f44296e);
        }
        return this.f44314w;
    }

    public final void o(l2.f fVar, Object obj, S1.c cVar, Context context, i iVar, InterfaceC2315j interfaceC2315j, float f9, Drawable drawable, int i9, Drawable drawable2, int i10, Drawable drawable3, int i11, InterfaceC2223d interfaceC2223d, InterfaceC2222c interfaceC2222c, U1.c cVar2, g gVar, Class cls, boolean z9, n2.d dVar, int i12, int i13, U1.b bVar) {
        Object objF;
        String str;
        String str2;
        this.f44300i = fVar;
        this.f44302k = obj;
        this.f44293b = cVar;
        this.f44294c = drawable3;
        this.f44295d = i11;
        this.f44298g = context.getApplicationContext();
        this.f44305n = iVar;
        this.f44306o = interfaceC2315j;
        this.f44308q = f9;
        this.f44314w = drawable;
        this.f44296e = i9;
        this.f44315x = drawable2;
        this.f44297f = i10;
        this.f44307p = interfaceC2223d;
        this.f44301j = interfaceC2222c;
        this.f44309r = cVar2;
        this.f44299h = gVar;
        this.f44303l = cls;
        this.f44304m = z9;
        this.f44310s = dVar;
        this.f44311t = i12;
        this.f44312u = i13;
        this.f44313v = bVar;
        this.f44291C = EnumC0380a.PENDING;
        if (obj != null) {
            k("ModelLoader", fVar.h(), "try .using(ModelLoader)");
            k("Transcoder", fVar.d(), "try .as*(Class).transcode(ResourceTranscoder)");
            k("Transformation", gVar, "try .transform(UnitTransformation.get())");
            if (bVar.cacheSource()) {
                objF = fVar.b();
                str = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
                str2 = "SourceEncoder";
            } else {
                objF = fVar.f();
                str = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
                str2 = "SourceDecoder";
            }
            k(str2, objF, str);
            if (bVar.cacheSource() || bVar.cacheResult()) {
                k("CacheDecoder", fVar.g(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (bVar.cacheResult()) {
                k("Encoder", fVar.e(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    public boolean p() {
        return this.f44291C == EnumC0380a.FAILED;
    }

    @Override // m2.InterfaceC2221b
    public void pause() {
        clear();
        this.f44291C = EnumC0380a.PAUSED;
    }

    public final boolean q() {
        InterfaceC2222c interfaceC2222c = this.f44301j;
        return interfaceC2222c == null || !interfaceC2222c.a();
    }

    public final void r(String str) {
        Log.v("GenericRequest", str + " this: " + this.f44292a);
    }

    public final void s() {
        InterfaceC2222c interfaceC2222c = this.f44301j;
        if (interfaceC2222c != null) {
            interfaceC2222c.e(this);
        }
    }

    public final void u(l lVar, Object obj) {
        boolean zQ = q();
        this.f44291C = EnumC0380a.COMPLETE;
        this.f44317z = lVar;
        InterfaceC2223d interfaceC2223d = this.f44307p;
        if (interfaceC2223d == null || !interfaceC2223d.b(obj, this.f44302k, this.f44306o, this.f44316y, zQ)) {
            this.f44306o.b(obj, this.f44310s.a(this.f44316y, zQ));
        }
        s();
        if (Log.isLoggable("GenericRequest", 2)) {
            r("Resource ready in " + AbstractC2535d.a(this.f44290B) + " size: " + (((double) lVar.getSize()) * 9.5367431640625E-7d) + " fromCache: " + this.f44316y);
        }
    }

    public final void v(l lVar) {
        this.f44309r.k(lVar);
        this.f44317z = null;
    }

    public final void w(Exception exc) {
        if (h()) {
            Drawable drawableM = this.f44302k == null ? m() : null;
            if (drawableM == null) {
                drawableM = l();
            }
            if (drawableM == null) {
                drawableM = n();
            }
            this.f44306o.g(exc, drawableM);
        }
    }
}
