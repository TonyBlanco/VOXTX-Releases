package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
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
import tv.danmaku.ijk.media.player.ISurfaceTextureHost;
import w7.C2940d;

/* JADX INFO: loaded from: classes4.dex */
public class c extends TextureView implements com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C2940d f37666a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f37667c;

    public static final class a implements a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f37668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SurfaceTexture f37669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ISurfaceTextureHost f37670c;

        public a(c cVar, SurfaceTexture surfaceTexture, ISurfaceTextureHost iSurfaceTextureHost) {
            this.f37668a = cVar;
            this.f37669b = surfaceTexture;
            this.f37670c = iSurfaceTextureHost;
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.b
        public com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a a() {
            return this.f37668a;
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.b
        public void b(IMediaPlayer iMediaPlayer) {
            if (iMediaPlayer == null) {
                return;
            }
            if (!(iMediaPlayer instanceof ISurfaceTextureHolder)) {
                iMediaPlayer.setSurface(d());
                return;
            }
            ISurfaceTextureHolder iSurfaceTextureHolder = (ISurfaceTextureHolder) iMediaPlayer;
            this.f37668a.f37667c.e(false);
            SurfaceTexture surfaceTexture = iSurfaceTextureHolder.getSurfaceTexture();
            if (surfaceTexture != null) {
                this.f37668a.setSurfaceTexture(surfaceTexture);
            } else {
                iSurfaceTextureHolder.setSurfaceTexture(this.f37669b);
                iSurfaceTextureHolder.setSurfaceTextureHost(this.f37668a.f37667c);
            }
        }

        @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a.b
        public SurfaceHolder c() {
            return null;
        }

        public Surface d() {
            if (this.f37669b == null) {
                return null;
            }
            return new Surface(this.f37669b);
        }
    }

    public static final class b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SurfaceTexture f37671a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f37672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f37673d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f37674e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public WeakReference f37678i;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f37675f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f37676g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f37677h = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Map f37679j = new ConcurrentHashMap();

        public b(c cVar) {
            this.f37678i = new WeakReference(cVar);
        }

        public void b(a.InterfaceC0291a interfaceC0291a) {
            a aVar;
            this.f37679j.put(interfaceC0291a, interfaceC0291a);
            if (this.f37671a != null) {
                aVar = new a((c) this.f37678i.get(), this.f37671a, this);
                interfaceC0291a.b(aVar, this.f37673d, this.f37674e);
            } else {
                aVar = null;
            }
            if (this.f37672c) {
                if (aVar == null) {
                    aVar = new a((c) this.f37678i.get(), this.f37671a, this);
                }
                interfaceC0291a.a(aVar, 0, this.f37673d, this.f37674e);
            }
        }

        public void c() {
            Log.d("TextureRenderView", "didDetachFromWindow()");
            this.f37677h = true;
        }

        public void d(a.InterfaceC0291a interfaceC0291a) {
            this.f37679j.remove(interfaceC0291a);
        }

        public void e(boolean z9) {
            this.f37675f = z9;
        }

        public void f() {
            Log.d("TextureRenderView", "willDetachFromWindow()");
            this.f37676g = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
            this.f37671a = surfaceTexture;
            this.f37672c = false;
            this.f37673d = 0;
            this.f37674e = 0;
            a aVar = new a((c) this.f37678i.get(), surfaceTexture, this);
            Iterator it = this.f37679j.keySet().iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0291a) it.next()).b(aVar, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f37671a = surfaceTexture;
            this.f37672c = false;
            this.f37673d = 0;
            this.f37674e = 0;
            a aVar = new a((c) this.f37678i.get(), surfaceTexture, this);
            Iterator it = this.f37679j.keySet().iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0291a) it.next()).c(aVar);
            }
            Log.d("TextureRenderView", "onSurfaceTextureDestroyed: destroy: " + this.f37675f);
            return this.f37675f;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
            this.f37671a = surfaceTexture;
            this.f37672c = true;
            this.f37673d = i9;
            this.f37674e = i10;
            a aVar = new a((c) this.f37678i.get(), surfaceTexture, this);
            Iterator it = this.f37679j.keySet().iterator();
            while (it.hasNext()) {
                ((a.InterfaceC0291a) it.next()).a(aVar, 0, i9, i10);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // tv.danmaku.ijk.media.player.ISurfaceTextureHost
        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            String str;
            String str2;
            String str3;
            if (surfaceTexture == null) {
                str = "releaseSurfaceTexture: null";
            } else {
                if (this.f37677h) {
                    if (surfaceTexture != this.f37671a) {
                        str3 = "releaseSurfaceTexture: didDetachFromWindow(): release different SurfaceTexture";
                    } else if (this.f37675f) {
                        str = "releaseSurfaceTexture: didDetachFromWindow(): already released by TextureView";
                    } else {
                        str3 = "releaseSurfaceTexture: didDetachFromWindow(): release detached SurfaceTexture";
                    }
                    Log.d("TextureRenderView", str3);
                    surfaceTexture.release();
                    return;
                }
                if (this.f37676g) {
                    if (surfaceTexture != this.f37671a) {
                        str3 = "releaseSurfaceTexture: willDetachFromWindow(): release different SurfaceTexture";
                        Log.d("TextureRenderView", str3);
                        surfaceTexture.release();
                        return;
                    } else {
                        if (!this.f37675f) {
                            str2 = "releaseSurfaceTexture: willDetachFromWindow(): re-attach SurfaceTexture to TextureView";
                            Log.d("TextureRenderView", str2);
                            e(true);
                            return;
                        }
                        str = "releaseSurfaceTexture: willDetachFromWindow(): will released by TextureView";
                    }
                } else if (surfaceTexture != this.f37671a) {
                    str3 = "releaseSurfaceTexture: alive: release different SurfaceTexture";
                    Log.d("TextureRenderView", str3);
                    surfaceTexture.release();
                    return;
                } else {
                    if (!this.f37675f) {
                        str2 = "releaseSurfaceTexture: alive: re-attach SurfaceTexture to TextureView";
                        Log.d("TextureRenderView", str2);
                        e(true);
                        return;
                    }
                    str = "releaseSurfaceTexture: alive: will released by TextureView";
                }
            }
            Log.d("TextureRenderView", str);
        }
    }

    public c(Context context) {
        super(context);
        g(context);
    }

    private void g(Context context) {
        this.f37666a = new C2940d(this);
        b bVar = new b(this);
        this.f37667c = bVar;
        setSurfaceTextureListener(bVar);
    }

    public static String h() {
        return "W91ciBUViBTZXJ2aWNlIFByb3ZpZGVyIGhhcyBub3QgcHJvdmlkZWQgeW91ciB0aGUgb3JpZ2luYWwgYXBwLg==";
    }

    public static String i() {
        return "W";
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void a(int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        this.f37666a.g(i9, i10);
        requestLayout();
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void b(a.InterfaceC0291a interfaceC0291a) {
        this.f37667c.d(interfaceC0291a);
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void c(int i9, int i10) {
        if (i9 <= 0 || i10 <= 0) {
            return;
        }
        this.f37666a.h(i9, i10);
        requestLayout();
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public boolean d() {
        return false;
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void e(a.InterfaceC0291a interfaceC0291a) {
        this.f37667c.b(interfaceC0291a);
    }

    public a.b getSurfaceHolder() {
        return new a(this, this.f37667c.f37671a, this.f37667c);
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f37667c.f();
        super.onDetachedFromWindow();
        this.f37667c.c();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(c.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(c.class.getName());
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        this.f37666a.a(i9, i10);
        setMeasuredDimension(this.f37666a.c(), this.f37666a.b());
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void setAspectRatio(int i9) {
        this.f37666a.e(i9);
        requestLayout();
    }

    @Override // com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a
    public void setVideoRotation(int i9) {
        this.f37666a.f(i9);
        setRotation(i9);
    }
}
