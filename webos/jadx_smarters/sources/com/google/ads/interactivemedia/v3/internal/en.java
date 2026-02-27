package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class en {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f22790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el f22791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private em f22792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1295f f22793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f22796g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f22797h;

    public en(Context context, Handler handler, em emVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        af.s(audioManager);
        this.f22790a = audioManager;
        this.f22792c = emVar;
        this.f22791b = new el(this, handler);
        this.f22794e = 0;
    }

    public static /* bridge */ /* synthetic */ void c(en enVar, int i9) {
        if (i9 == -3 || i9 == -2) {
            if (i9 != -2) {
                enVar.h(3);
                return;
            } else {
                enVar.g(0);
                enVar.h(2);
                return;
            }
        }
        if (i9 == -1) {
            enVar.g(-1);
            enVar.f();
        } else if (i9 == 1) {
            enVar.h(1);
            enVar.g(1);
        } else {
            cd.e("AudioFocusManager", "Unknown focus change type: " + i9);
        }
    }

    private final void f() {
        if (this.f22794e == 0) {
            return;
        }
        if (cq.f22640a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f22797h;
            if (audioFocusRequest != null) {
                this.f22790a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f22790a.abandonAudioFocus(this.f22791b);
        }
        h(0);
    }

    private final void g(int i9) {
        em emVar = this.f22792c;
        if (emVar != null) {
            fy fyVar = (fy) emVar;
            boolean zQ = fyVar.f22933a.q();
            fyVar.f22933a.aq(zQ, i9, gc.ae(zQ, i9));
        }
    }

    private final void h(int i9) {
        if (this.f22794e == i9) {
            return;
        }
        this.f22794e = i9;
        float f9 = i9 == 3 ? 0.2f : 1.0f;
        if (this.f22796g == f9) {
            return;
        }
        this.f22796g = f9;
        em emVar = this.f22792c;
        if (emVar != null) {
            gc gcVar = ((fy) emVar).f22933a;
            gcVar.ao(1, 2, Float.valueOf(gcVar.f22957R * gcVar.f22986w.a()));
        }
    }

    public final float a() {
        return this.f22796g;
    }

    public final int b(boolean z9, int i9) {
        int iRequestAudioFocus;
        if (i9 == 1 || this.f22795f != 1) {
            f();
            return z9 ? 1 : -1;
        }
        if (!z9) {
            return -1;
        }
        if (this.f22794e != 1) {
            if (cq.f22640a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f22797h;
                if (audioFocusRequest == null) {
                    W.a();
                    V.a(this.f22795f);
                    af.s(null);
                    throw null;
                }
                iRequestAudioFocus = this.f22790a.requestAudioFocus(audioFocusRequest);
            } else {
                AudioManager audioManager = this.f22790a;
                el elVar = this.f22791b;
                af.s(null);
                iRequestAudioFocus = audioManager.requestAudioFocus(elVar, 3, this.f22795f);
            }
            if (iRequestAudioFocus != 1) {
                h(0);
                return -1;
            }
            h(1);
        }
        return 1;
    }

    public final void d() {
        this.f22792c = null;
        f();
    }

    public final void e(C1295f c1295f) {
        if (cq.V(null, null)) {
            return;
        }
        this.f22793d = null;
        this.f22795f = 0;
        af.v(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }
}
