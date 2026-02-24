package M;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f4150b;

        public a(int i9, b[] bVarArr) {
            this.f4149a = i9;
            this.f4150b = bVarArr;
        }

        public static a a(int i9, b[] bVarArr) {
            return new a(i9, bVarArr);
        }

        public b[] b() {
            return this.f4150b;
        }

        public int c() {
            return this.f4149a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f4151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f4152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f4154d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f4155e;

        public b(Uri uri, int i9, int i10, boolean z9, int i11) {
            this.f4151a = (Uri) O.h.f(uri);
            this.f4152b = i9;
            this.f4153c = i10;
            this.f4154d = z9;
            this.f4155e = i11;
        }

        public static b a(Uri uri, int i9, int i10, boolean z9, int i11) {
            return new b(uri, i9, i10, z9, i11);
        }

        public int b() {
            return this.f4155e;
        }

        public int c() {
            return this.f4152b;
        }

        public Uri d() {
            return this.f4151a;
        }

        public int e() {
            return this.f4153c;
        }

        public boolean f() {
            return this.f4154d;
        }
    }

    public static class c {
        public abstract void a(int i9);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return G.f.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i9, boolean z9, int i10, Handler handler, c cVar) {
        M.a aVar = new M.a(cVar, handler);
        return z9 ? f.e(context, eVar, aVar, i9, i10) : f.d(context, eVar, i9, null, aVar);
    }
}
