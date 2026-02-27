package g2;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c2.C1248a;
import java.security.MessageDigest;
import java.util.UUID;
import o2.AbstractC2312g;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f41286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q1.a f41287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f41288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f41290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public O1.e f41291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f41292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41293h;

    public static class b extends AbstractC2312g {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Handler f41294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f41295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f41296f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Bitmap f41297g;

        public b(Handler handler, int i9, long j9) {
            this.f41294d = handler;
            this.f41295e = i9;
            this.f41296f = j9;
        }

        public Bitmap k() {
            return this.f41297g;
        }

        @Override // o2.InterfaceC2315j
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void b(Bitmap bitmap, n2.c cVar) {
            this.f41297g = bitmap;
            this.f41294d.sendMessageAtTime(this.f41294d.obtainMessage(1, this), this.f41296f);
        }
    }

    public interface c {
        void a(int i9);
    }

    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == 1) {
                f.this.e((b) message.obj);
                return true;
            }
            if (i9 != 2) {
                return false;
            }
            O1.g.g((b) message.obj);
            return false;
        }
    }

    public static class e implements S1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f41299a;

        public e() {
            this(UUID.randomUUID());
        }

        public e(UUID uuid) {
            this.f41299a = uuid;
        }

        @Override // S1.c
        public void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // S1.c
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return ((e) obj).f41299a.equals(this.f41299a);
            }
            return false;
        }

        @Override // S1.c
        public int hashCode() {
            return this.f41299a.hashCode();
        }
    }

    public f(Context context, c cVar, Q1.a aVar, int i9, int i10) {
        this(cVar, aVar, null, c(context, aVar, i9, i10, O1.g.i(context).l()));
    }

    public f(c cVar, Q1.a aVar, Handler handler, O1.e eVar) {
        this.f41289d = false;
        this.f41290e = false;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new d()) : handler;
        this.f41286a = cVar;
        this.f41287b = aVar;
        this.f41288c = handler;
        this.f41291f = eVar;
    }

    public static O1.e c(Context context, Q1.a aVar, int i9, int i10, V1.b bVar) {
        h hVar = new h(bVar);
        g gVar = new g();
        return O1.g.u(context).w(gVar, Q1.a.class).c(aVar).a(Bitmap.class).u(C1248a.b()).i(hVar).t(true).j(U1.b.NONE).q(i9, i10);
    }

    public void a() {
        h();
        b bVar = this.f41292g;
        if (bVar != null) {
            O1.g.g(bVar);
            this.f41292g = null;
        }
        this.f41293h = true;
    }

    public Bitmap b() {
        b bVar = this.f41292g;
        if (bVar != null) {
            return bVar.k();
        }
        return null;
    }

    public final void d() {
        if (!this.f41289d || this.f41290e) {
            return;
        }
        this.f41290e = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f41287b.h());
        this.f41287b.a();
        this.f41291f.s(new e()).m(new b(this.f41288c, this.f41287b.d(), jUptimeMillis));
    }

    public void e(b bVar) {
        if (this.f41293h) {
            this.f41288c.obtainMessage(2, bVar).sendToTarget();
            return;
        }
        b bVar2 = this.f41292g;
        this.f41292g = bVar;
        this.f41286a.a(bVar.f41295e);
        if (bVar2 != null) {
            this.f41288c.obtainMessage(2, bVar2).sendToTarget();
        }
        this.f41290e = false;
        d();
    }

    public void f(S1.g gVar) {
        if (gVar == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        this.f41291f = this.f41291f.v(gVar);
    }

    public void g() {
        if (this.f41289d) {
            return;
        }
        this.f41289d = true;
        this.f41293h = false;
        d();
    }

    public void h() {
        this.f41289d = false;
    }
}
