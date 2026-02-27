package V1;

import android.graphics.Bitmap;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d implements V1.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Bitmap.Config f9853k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f9855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f9857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9863j;

    public interface b {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    public static class c implements b {
        public c() {
        }

        @Override // V1.d.b
        public void a(Bitmap bitmap) {
        }

        @Override // V1.d.b
        public void b(Bitmap bitmap) {
        }
    }

    public d(int i9) {
        this(i9, j(), i());
    }

    public d(int i9, e eVar, Set set) {
        this.f9856c = i9;
        this.f9858e = i9;
        this.f9854a = eVar;
        this.f9855b = set;
        this.f9857d = new c();
    }

    public static Set i() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        return Collections.unmodifiableSet(hashSet);
    }

    public static e j() {
        return new g();
    }

    @Override // V1.b
    public synchronized boolean a(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isMutable() && this.f9854a.e(bitmap) <= this.f9858e && this.f9855b.contains(bitmap.getConfig())) {
                int iE = this.f9854a.e(bitmap);
                this.f9854a.a(bitmap);
                this.f9857d.b(bitmap);
                this.f9862i++;
                this.f9859f += iE;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f9854a.b(bitmap));
                }
                f();
                h();
                return true;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f9854a.b(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f9855b.contains(bitmap.getConfig()));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // V1.b
    public void b(int i9) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i9);
        }
        if (i9 >= 60) {
            c();
        } else if (i9 >= 40) {
            k(this.f9858e / 2);
        }
    }

    @Override // V1.b
    public void c() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        k(0);
    }

    @Override // V1.b
    public synchronized Bitmap d(int i9, int i10, Bitmap.Config config) {
        Bitmap bitmapE;
        bitmapE = e(i9, i10, config);
        if (bitmapE != null) {
            bitmapE.eraseColor(0);
        }
        return bitmapE;
    }

    @Override // V1.b
    public synchronized Bitmap e(int i9, int i10, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            bitmapD = this.f9854a.d(i9, i10, config != null ? config : f9853k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f9854a.c(i9, i10, config));
                }
                this.f9861h++;
            } else {
                this.f9860g++;
                this.f9859f -= this.f9854a.e(bitmapD);
                this.f9857d.a(bitmapD);
                bitmapD.setHasAlpha(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f9854a.c(i9, i10, config));
            }
            f();
        } catch (Throwable th) {
            throw th;
        }
        return bitmapD;
    }

    public final void f() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            g();
        }
    }

    public final void g() {
        Log.v("LruBitmapPool", "Hits=" + this.f9860g + ", misses=" + this.f9861h + ", puts=" + this.f9862i + ", evictions=" + this.f9863j + ", currentSize=" + this.f9859f + ", maxSize=" + this.f9858e + "\nStrategy=" + this.f9854a);
    }

    public final void h() {
        k(this.f9858e);
    }

    public final synchronized void k(int i9) {
        while (this.f9859f > i9) {
            try {
                Bitmap bitmapRemoveLast = this.f9854a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        g();
                    }
                    this.f9859f = 0;
                    return;
                }
                this.f9857d.a(bitmapRemoveLast);
                this.f9859f -= this.f9854a.e(bitmapRemoveLast);
                bitmapRemoveLast.recycle();
                this.f9863j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f9854a.b(bitmapRemoveLast));
                }
                f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
