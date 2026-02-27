package androidx.mediarouter.app;

import P.AbstractC0960b;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import u0.C2811K;
import u0.C2812L;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteActionProvider extends AbstractC0960b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2812L f15978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f15979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2811K f15980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f15981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaRouteButton f15982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15983i;

    public static final class a extends C2812L.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f15984a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.f15984a = new WeakReference(mediaRouteActionProvider);
        }

        public final void a(C2812L c2812l) {
            MediaRouteActionProvider mediaRouteActionProvider = (MediaRouteActionProvider) this.f15984a.get();
            if (mediaRouteActionProvider != null) {
                mediaRouteActionProvider.n();
            } else {
                c2812l.s(this);
            }
        }

        @Override // u0.C2812L.a
        public void onProviderAdded(C2812L c2812l, C2812L.g gVar) {
            a(c2812l);
        }

        @Override // u0.C2812L.a
        public void onProviderChanged(C2812L c2812l, C2812L.g gVar) {
            a(c2812l);
        }

        @Override // u0.C2812L.a
        public void onProviderRemoved(C2812L c2812l, C2812L.g gVar) {
            a(c2812l);
        }

        @Override // u0.C2812L.a
        public void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
            a(c2812l);
        }

        @Override // u0.C2812L.a
        public void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
            a(c2812l);
        }

        @Override // u0.C2812L.a
        public void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
            a(c2812l);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.f15980f = C2811K.f50924c;
        this.f15981g = e.getDefault();
        this.f15978d = C2812L.j(context);
        this.f15979e = new a(this);
    }

    @Override // P.AbstractC0960b
    public boolean c() {
        return this.f15983i || this.f15978d.q(this.f15980f, 1);
    }

    @Override // P.AbstractC0960b
    public View d() {
        if (this.f15982h != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        MediaRouteButton mediaRouteButtonM = m();
        this.f15982h = mediaRouteButtonM;
        mediaRouteButtonM.setCheatSheetEnabled(true);
        this.f15982h.setRouteSelector(this.f15980f);
        this.f15982h.setAlwaysVisible(this.f15983i);
        this.f15982h.setDialogFactory(this.f15981g);
        this.f15982h.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f15982h;
    }

    @Override // P.AbstractC0960b
    public boolean f() {
        MediaRouteButton mediaRouteButton = this.f15982h;
        if (mediaRouteButton != null) {
            return mediaRouteButton.d();
        }
        return false;
    }

    @Override // P.AbstractC0960b
    public boolean h() {
        return true;
    }

    public MediaRouteButton m() {
        return new MediaRouteButton(a());
    }

    public void n() {
        i();
    }

    public void o(boolean z9) {
        if (this.f15983i != z9) {
            this.f15983i = z9;
            i();
            MediaRouteButton mediaRouteButton = this.f15982h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setAlwaysVisible(this.f15983i);
            }
        }
    }

    public void p(e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("factory must not be null");
        }
        if (this.f15981g != eVar) {
            this.f15981g = eVar;
            MediaRouteButton mediaRouteButton = this.f15982h;
            if (mediaRouteButton != null) {
                mediaRouteButton.setDialogFactory(eVar);
            }
        }
    }

    public void q(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f15980f.equals(c2811k)) {
            return;
        }
        if (!this.f15980f.f()) {
            this.f15978d.s(this.f15979e);
        }
        if (!c2811k.f()) {
            this.f15978d.a(c2811k, this.f15979e);
        }
        this.f15980f = c2811k;
        n();
        MediaRouteButton mediaRouteButton = this.f15982h;
        if (mediaRouteButton != null) {
            mediaRouteButton.setRouteSelector(c2811k);
        }
    }
}
