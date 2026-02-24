package P5;

import O5.C0947k;
import com.google.ads.interactivemedia.v3.internal.z1;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f7323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0947k f7324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f7326d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7327e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicMarkableReference f7328f = new AtomicMarkableReference(null, false);

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f7329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f7330b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f7331c;

        public a(boolean z9) {
            this.f7331c = z9;
            this.f7329a = new AtomicMarkableReference(new b(64, z9 ? Segment.SIZE : 1024), false);
        }

        public Map b() {
            return ((b) this.f7329a.getReference()).a();
        }

        public final /* synthetic */ Void c() throws Throwable {
            this.f7330b.set(null);
            e();
            return null;
        }

        public final void d() {
            Callable callable = new Callable() { // from class: P5.g
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f7322a.c();
                }
            };
            if (z1.a(this.f7330b, null, callable)) {
                h.this.f7324b.g(callable);
            }
        }

        public final void e() throws Throwable {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.f7329a.isMarked()) {
                        mapA = ((b) this.f7329a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f7329a;
                        atomicMarkableReference.set((b) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                h.this.f7323a.k(h.this.f7325c, mapA, this.f7331c);
            }
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((b) this.f7329a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f7329a;
                    atomicMarkableReference.set((b) atomicMarkableReference.getReference(), true);
                    d();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public h(String str, T5.f fVar, C0947k c0947k) {
        this.f7325c = str;
        this.f7323a = new d(fVar);
        this.f7324b = c0947k;
    }

    public static h f(String str, T5.f fVar, C0947k c0947k) {
        d dVar = new d(fVar);
        h hVar = new h(str, fVar, c0947k);
        ((b) hVar.f7326d.f7329a.getReference()).e(dVar.g(str, false));
        ((b) hVar.f7327e.f7329a.getReference()).e(dVar.g(str, true));
        hVar.f7328f.set(dVar.h(str), false);
        return hVar;
    }

    public static String g(String str, T5.f fVar) {
        return new d(fVar).h(str);
    }

    public Map d() {
        return this.f7326d.b();
    }

    public Map e() {
        return this.f7327e.b();
    }

    public boolean h(String str, String str2) {
        return this.f7327e.f(str, str2);
    }
}
