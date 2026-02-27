package com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media;

import android.view.SurfaceHolder;
import android.view.View;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.view.ijkplayer.widget.media.a$a, reason: collision with other inner class name */
    public interface InterfaceC0291a {
        void a(b bVar, int i9, int i10, int i11);

        void b(b bVar, int i9, int i10);

        void c(b bVar);
    }

    public interface b {
        a a();

        void b(IMediaPlayer iMediaPlayer);

        SurfaceHolder c();
    }

    void a(int i9, int i10);

    void b(InterfaceC0291a interfaceC0291a);

    void c(int i9, int i10);

    boolean d();

    void e(InterfaceC0291a interfaceC0291a);

    View getView();

    void setAspectRatio(int i9);

    void setVideoRotation(int i9);
}
