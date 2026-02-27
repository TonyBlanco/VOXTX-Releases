package q0;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: renamed from: q0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2527k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f46766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f46769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public VolumeProvider f46770f;

    /* JADX INFO: renamed from: q0.k$a */
    public class a extends VolumeProvider {
        public a(int i9, int i10, int i11, String str) {
            super(i9, i10, i11, str);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i9) {
            AbstractC2527k.this.e(i9);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i9) {
            AbstractC2527k.this.f(i9);
        }
    }

    /* JADX INFO: renamed from: q0.k$b */
    public class b extends VolumeProvider {
        public b(int i9, int i10, int i11) {
            super(i9, i10, i11);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int i9) {
            AbstractC2527k.this.e(i9);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int i9) {
            AbstractC2527k.this.f(i9);
        }
    }

    /* JADX INFO: renamed from: q0.k$c */
    public static class c {
        public static void a(VolumeProvider volumeProvider, int i9) {
            volumeProvider.setCurrentVolume(i9);
        }
    }

    /* JADX INFO: renamed from: q0.k$d */
    public static abstract class d {
        public abstract void onVolumeChanged(AbstractC2527k abstractC2527k);
    }

    public AbstractC2527k(int i9, int i10, int i11, String str) {
        this.f46765a = i9;
        this.f46766b = i10;
        this.f46768d = i11;
        this.f46767c = str;
    }

    public final int a() {
        return this.f46768d;
    }

    public final int b() {
        return this.f46766b;
    }

    public final int c() {
        return this.f46765a;
    }

    public Object d() {
        if (this.f46770f == null) {
            this.f46770f = Build.VERSION.SDK_INT >= 30 ? new a(this.f46765a, this.f46766b, this.f46768d, this.f46767c) : new b(this.f46765a, this.f46766b, this.f46768d);
        }
        return this.f46770f;
    }

    public abstract void e(int i9);

    public abstract void f(int i9);

    public void g(d dVar) {
        this.f46769e = dVar;
    }

    public final void h(int i9) {
        this.f46768d = i9;
        c.a((VolumeProvider) d(), i9);
        d dVar = this.f46769e;
        if (dVar != null) {
            dVar.onVolumeChanged(this);
        }
    }
}
