package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.ISurfaceTextureHolder;
import w7.C2940d;

/* JADX INFO: loaded from: classes4.dex */
public class b extends SurfaceView implements com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2940d f37655a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SurfaceHolderCallbackC0292b f37656c;

    public static final class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f37657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SurfaceHolder f37658b;

        public a(b bVar, SurfaceHolder surfaceHolder) {
            this.f37657a = bVar;
            this.f37658b = surfaceHolder;
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.b
        public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a a() {
            return this.f37657a;
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.b
        public void b(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer != null) {
                if (iMediaPlayer instanceof ISurfaceTextureHolder) {
                    ((ISurfaceTextureHolder) iMediaPlayer).setSurfaceTexture(null);
                }
                iMediaPlayer.setDisplay(this.f37658b);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.b
        public SurfaceHolder c() {
            return this.f37658b;
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.b$b, reason: collision with other inner class name */
    public static final class SurfaceHolderCallbackC0292b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SurfaceHolder f37659a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f37660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f37663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public WeakReference f37664g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Map f37665h = new ConcurrentHashMap();

        public SurfaceHolderCallbackC0292b(b bVar) {
            this.f37664g = new WeakReference(bVar);
        }

        public void a(a.InterfaceC0291a interfaceC0291a) {
            a aVar;
            this.f37665h.put(interfaceC0291a, interfaceC0291a);
            if (this.f37659a != null) {
                aVar = new a((b) this.f37664g.get(), this.f37659a);
                interfaceC0291a.b(aVar, this.f37662e, this.f37663f);
            } else {
                aVar = null;
            }
            if (this.f37660c) {
                if (aVar == null) {
                    aVar = new a((b) this.f37664g.get(), this.f37659a);
                }
                interfaceC0291a.a(aVar, this.f37661d, this.f37662e, this.f37663f);
            }
        }

        public void b(a.InterfaceC0291a interfaceC0291a) {
            this.f37665h.remove(interfaceC0291a);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
            this.f37659a = surfaceHolder;
            this.f37660c = true;
            this.f37661d = i9;
            this.f37662e = i10;
            this.f37663f = i11;
            a aVar = new a((b) this.f37664g.get(), this.f37659a);
            Iterator it = this.f37665h.keySet().iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0291a) it.next()).a(aVar, i9, i10, i11);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f37659a = surfaceHolder;
            this.f37660c = false;
            this.f37661d = 0;
            this.f37662e = 0;
            this.f37663f = 0;
            a aVar = new a((b) this.f37664g.get(), this.f37659a);
            Iterator it = this.f37665h.keySet().iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0291a) it.next()).b(aVar, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f37659a = null;
            this.f37660c = false;
            this.f37661d = 0;
            this.f37662e = 0;
            this.f37663f = 0;
            a aVar = new a((b) this.f37664g.get(), this.f37659a);
            Iterator it = this.f37665h.keySet().iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0291a) it.next()).c(aVar);
            }
        }
    }

    public b(Context context) {
        super(context);
        g(context);
    }

    public static String f() {
        return "U";
    }

    public static String h() {
        return "3VjaCBraW5kIG9mIGFwcHMgY291bGQgc2VuZCB0aGUgZGF0YSB0byBsZWdhbCBhdXRob3JpdGllcy4=";
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void a(int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        this.f37655a.g(i9, i10);
        requestLayout();
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void b(a.InterfaceC0291a interfaceC0291a) {
        this.f37656c.b(interfaceC0291a);
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void c(int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        this.f37655a.h(i9, i10);
        getHolder().setFixedSize(i9, i10);
        requestLayout();
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public boolean d() {
        return true;
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void e(a.InterfaceC0291a interfaceC0291a) {
        this.f37656c.a(interfaceC0291a);
    }

    public final void g(Context context) {
        this.f37655a = new C2940d(this);
        this.f37656c = new SurfaceHolderCallbackC0292b(this);
        getHolder().addCallback(this.f37656c);
        getHolder().setType(0);
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(b.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(b.class.getName());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i9, int i10) {
        this.f37655a.a(i9, i10);
        setMeasuredDimension(this.f37655a.c(), this.f37655a.b());
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void setAspectRatio(int i9) {
        this.f37655a.e(i9);
        requestLayout();
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void setVideoRotation(int i9) {
        Log.e("", "SurfaceView doesn't support rotation (" + i9 + ")!\n");
    }
}
