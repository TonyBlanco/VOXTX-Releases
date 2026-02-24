package com.pierfrancescosoffritti.youtubeplayer.player;

import W7.c;
import W7.f;
import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1185o;
import androidx.lifecycle.w;
import b8.AbstractC1237c;
import b8.C1236b;
import b8.InterfaceC1235a;

/* JADX INFO: loaded from: classes4.dex */
public class YouTubePlayerView extends FrameLayout implements C1236b.a, InterfaceC1185o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W7.b f38975a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y7.a f38976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1236b f38977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X7.b f38978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final X7.a f38979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1235a f38980g;

    public class a implements InterfaceC1235a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f38981a;

        /* JADX INFO: renamed from: com.pierfrancescosoffritti.youtubeplayer.player.YouTubePlayerView$a$a, reason: collision with other inner class name */
        public class C0304a implements f {
            public C0304a() {
            }

            @Override // W7.f
            public void a(c cVar) {
                a.this.f38981a.a(cVar);
            }
        }

        public a(f fVar) {
            this.f38981a = fVar;
        }

        @Override // b8.InterfaceC1235a
        public void call() {
            YouTubePlayerView.this.f38975a.h(new C0304a());
        }
    }

    public class b extends W7.a {
        public b() {
        }

        @Override // W7.a, W7.g
        public void l() {
            YouTubePlayerView.this.f38980g = null;
        }
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        W7.b bVar = new W7.b(context);
        this.f38975a = bVar;
        addView(bVar, new FrameLayout.LayoutParams(-1, -1));
        this.f38976c = new Y7.a(this, bVar);
        this.f38978e = new X7.b();
        this.f38977d = new C1236b(this);
        X7.a aVar = new X7.a();
        this.f38979f = aVar;
        aVar.a(this.f38976c);
        l(bVar);
    }

    @Override // b8.C1236b.a
    public void c() {
    }

    @Override // b8.C1236b.a
    public void e() {
        InterfaceC1235a interfaceC1235a = this.f38980g;
        if (interfaceC1235a != null) {
            interfaceC1235a.call();
        } else {
            this.f38978e.a(this.f38975a);
        }
    }

    public Y7.b getPlayerUIController() {
        Y7.a aVar = this.f38976c;
        if (aVar != null) {
            return aVar;
        }
        throw new RuntimeException("You have inflated a custom player UI. You must manage it with your own controller.");
    }

    public final void l(c cVar) {
        Y7.a aVar = this.f38976c;
        if (aVar != null) {
            cVar.b(aVar);
        }
        cVar.b(this.f38978e);
        cVar.b(new b());
    }

    public void m(f fVar, boolean z9) {
        if (z9) {
            getContext().registerReceiver(this.f38977d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        this.f38980g = new a(fVar);
        if (AbstractC1237c.b(getContext())) {
            this.f38980g.call();
        }
    }

    public void n() {
        this.f38979f.d(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        if (getLayoutParams().height == -2) {
            i10 = View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i9) * 9) / 16, 1073741824);
        }
        super.onMeasure(i9, i10);
    }

    @w(AbstractC1180j.b.ON_STOP)
    public void onStop() {
        this.f38975a.pause();
    }

    @w(AbstractC1180j.b.ON_DESTROY)
    public void release() {
        this.f38975a.destroy();
        try {
            getContext().unregisterReceiver(this.f38977d);
        } catch (Exception unused) {
        }
    }
}
