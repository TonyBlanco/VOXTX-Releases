package u0;

import android.content.Context;
import java.lang.ref.WeakReference;
import u0.d0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f51101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f51102c;

    public static class a extends l0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f51103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f51104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f51105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f51106g;

        /* JADX INFO: renamed from: u0.l0$a$a, reason: collision with other inner class name */
        public static final class C0463a implements d0.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WeakReference f51107a;

            public C0463a(a aVar) {
                this.f51107a = new WeakReference(aVar);
            }

            @Override // u0.d0.e
            public void a(Object obj, int i9) {
                c cVar;
                a aVar = (a) this.f51107a.get();
                if (aVar == null || (cVar = aVar.f51102c) == null) {
                    return;
                }
                cVar.b(i9);
            }

            @Override // u0.d0.e
            public void d(Object obj, int i9) {
                c cVar;
                a aVar = (a) this.f51107a.get();
                if (aVar == null || (cVar = aVar.f51102c) == null) {
                    return;
                }
                cVar.a(i9);
            }
        }

        public a(Context context, Object obj) {
            super(context, obj);
            Object objE = d0.e(context);
            this.f51103d = objE;
            Object objB = d0.b(objE, "", false);
            this.f51104e = objB;
            this.f51105f = d0.c(objE, objB);
        }

        @Override // u0.l0
        public void c(b bVar) {
            d0.d.e(this.f51105f, bVar.f51108a);
            d0.d.h(this.f51105f, bVar.f51109b);
            d0.d.g(this.f51105f, bVar.f51110c);
            d0.d.b(this.f51105f, bVar.f51111d);
            d0.d.c(this.f51105f, bVar.f51112e);
            if (this.f51106g) {
                return;
            }
            this.f51106g = true;
            d0.d.f(this.f51105f, d0.d(new C0463a(this)));
            d0.d.d(this.f51105f, this.f51101b);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51110c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51111d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f51112e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f51113f;
    }

    public interface c {
        void a(int i9);

        void b(int i9);
    }

    public l0(Context context, Object obj) {
        this.f51100a = context;
        this.f51101b = obj;
    }

    public static l0 b(Context context, Object obj) {
        return new a(context, obj);
    }

    public Object a() {
        return this.f51101b;
    }

    public abstract void c(b bVar);

    public void d(c cVar) {
        this.f51102c = cVar;
    }
}
