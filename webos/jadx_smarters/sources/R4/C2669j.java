package r4;

import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import s4.AbstractC2713e;

/* JADX INFO: renamed from: r4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2669j extends AbstractC2713e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2661b f49713a;

    public C2669j(C2661b c2661b) {
        this.f49713a = c2661b;
    }

    @Override // s4.AbstractC2713e
    public final void a(CastSeekBar castSeekBar, int i9, boolean z9) {
        this.f49713a.V(castSeekBar, i9, z9);
    }

    @Override // s4.AbstractC2713e
    public final void b(CastSeekBar castSeekBar) {
        this.f49713a.W(castSeekBar);
    }

    @Override // s4.AbstractC2713e
    public final void c(CastSeekBar castSeekBar) {
        this.f49713a.X(castSeekBar);
    }
}
