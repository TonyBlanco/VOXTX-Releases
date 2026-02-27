package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class a extends Drawable implements Animatable, MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f46704a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f46705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f46706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f46707e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Paint f46708f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap f46709g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GifInfoHandle f46710h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentLinkedQueue f46711i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f46712j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuffColorFilter f46713k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f46714l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f46715m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f46716n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i f46717o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f46718p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ScheduledFuture f46719q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f46720r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f46721s;

    /* JADX INFO: renamed from: pl.droidsonroids.gif.a$a, reason: collision with other inner class name */
    public class C0413a extends j {
        public C0413a(a aVar) {
            super(aVar);
        }

        @Override // pl.droidsonroids.gif.j
        public void a() {
            if (a.this.f46710h.r()) {
                a.this.start();
            }
        }
    }

    public class b extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f46723c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, int i9) {
            super(aVar);
            this.f46723c = i9;
        }

        @Override // pl.droidsonroids.gif.j
        public void a() {
            a aVar = a.this;
            aVar.f46710h.v(this.f46723c, aVar.f46709g);
            this.f46738a.f46716n.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    public a(ContentResolver contentResolver, Uri uri) {
        this(GifInfoHandle.o(contentResolver, uri), null, null, true);
    }

    public a(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public a(AssetManager assetManager, String str) {
        this(assetManager.openFd(str));
    }

    public a(Resources resources, int i9) {
        this(resources.openRawResourceFd(i9));
        float fB = e.b(resources, i9);
        this.f46721s = (int) (this.f46710h.e() * fB);
        this.f46720r = (int) (this.f46710h.k() * fB);
    }

    public a(GifInfoHandle gifInfoHandle, a aVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z9) {
        this.f46705c = true;
        this.f46706d = Long.MIN_VALUE;
        this.f46707e = new Rect();
        this.f46708f = new Paint(6);
        this.f46711i = new ConcurrentLinkedQueue();
        i iVar = new i(this);
        this.f46717o = iVar;
        this.f46715m = z9;
        this.f46704a = scheduledThreadPoolExecutor == null ? c.a() : scheduledThreadPoolExecutor;
        this.f46710h = gifInfoHandle;
        Bitmap bitmap = null;
        if (aVar != null) {
            synchronized (aVar.f46710h) {
                try {
                    if (!aVar.f46710h.m() && aVar.f46710h.e() >= gifInfoHandle.e() && aVar.f46710h.k() >= gifInfoHandle.k()) {
                        aVar.i();
                        bitmap = aVar.f46709g;
                        bitmap.eraseColor(0);
                    }
                } finally {
                }
            }
        }
        if (bitmap == null) {
            this.f46709g = Bitmap.createBitmap(gifInfoHandle.k(), gifInfoHandle.e(), Bitmap.Config.ARGB_8888);
        } else {
            this.f46709g = bitmap;
        }
        this.f46709g.setHasAlpha(!gifInfoHandle.l());
        this.f46718p = new Rect(0, 0, gifInfoHandle.k(), gifInfoHandle.e());
        this.f46716n = new f(this);
        iVar.a();
        this.f46720r = gifInfoHandle.k();
        this.f46721s = gifInfoHandle.e();
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.f46719q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f46716n.removeMessages(-1);
    }

    public int b() {
        return this.f46710h.a();
    }

    public int c() {
        int iB = this.f46710h.b();
        return (iB == 0 || iB < this.f46710h.f()) ? iB : iB - 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return d() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return d() > 1;
    }

    public int d() {
        return this.f46710h.i();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z9;
        if (this.f46713k == null || this.f46708f.getColorFilter() != null) {
            z9 = false;
        } else {
            this.f46708f.setColorFilter(this.f46713k);
            z9 = true;
        }
        canvas.drawBitmap(this.f46709g, this.f46718p, this.f46707e, this.f46708f);
        if (z9) {
            this.f46708f.setColorFilter(null);
        }
    }

    public boolean e() {
        return this.f46710h.m();
    }

    public void f() {
        this.f46704a.execute(new C0413a(this));
    }

    public final void g() {
        if (this.f46715m && this.f46705c) {
            long j9 = this.f46706d;
            if (j9 != Long.MIN_VALUE) {
                long jMax = Math.max(0L, j9 - SystemClock.uptimeMillis());
                this.f46706d = Long.MIN_VALUE;
                this.f46704a.remove(this.f46717o);
                this.f46719q = this.f46704a.schedule(this.f46717o, jMax, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f46708f.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f46708f.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f46710h.c();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f46710h.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f46721s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f46720r;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f46710h.l() || this.f46708f.getAlpha() < 255) ? -2 : -1;
    }

    public void h(int i9) {
        this.f46710h.w(i9);
    }

    public final void i() {
        this.f46705c = false;
        this.f46716n.removeMessages(-1);
        this.f46710h.p();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        g();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f46705c;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f46705c;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.f46712j) != null && colorStateList.isStateful());
    }

    public void j(long j9) {
        if (this.f46715m) {
            this.f46706d = 0L;
            this.f46716n.sendEmptyMessageAtTime(-1, 0L);
        } else {
            a();
            this.f46719q = this.f46704a.schedule(this.f46717o, Math.max(j9, 0L), TimeUnit.MILLISECONDS);
        }
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f46707e.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f46712j;
        if (colorStateList == null || (mode = this.f46714l) == null) {
            return false;
        }
        this.f46713k = k(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f46704a.execute(new b(this, i9));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f46708f.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f46708f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z9) {
        this.f46708f.setDither(z9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z9) {
        this.f46708f.setFilterBitmap(z9);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f46712j = colorStateList;
        this.f46713k = k(colorStateList, this.f46714l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f46714l = mode;
        this.f46713k = k(this.f46712j, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (!this.f46715m) {
            if (z9) {
                if (z10) {
                    f();
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            try {
                if (this.f46705c) {
                    return;
                }
                this.f46705c = true;
                j(this.f46710h.s());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            try {
                if (this.f46705c) {
                    this.f46705c = false;
                    a();
                    this.f46710h.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f46710h.k()), Integer.valueOf(this.f46710h.e()), Integer.valueOf(this.f46710h.i()), Integer.valueOf(this.f46710h.g()));
    }
}
