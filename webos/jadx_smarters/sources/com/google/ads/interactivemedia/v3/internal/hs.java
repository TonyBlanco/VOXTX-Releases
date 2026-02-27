package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class hs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f23185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f23186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hp f23187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f23188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private hr f23189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23192h;

    public hs(Context context, Handler handler, hp hpVar) {
        Context applicationContext = context.getApplicationContext();
        this.f23185a = applicationContext;
        this.f23186b = handler;
        this.f23187c = hpVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        af.t(audioManager);
        this.f23188d = audioManager;
        this.f23190f = 3;
        this.f23191g = g(audioManager, 3);
        this.f23192h = i(audioManager, this.f23190f);
        hr hrVar = new hr(this);
        try {
            cq.au(applicationContext, hrVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f23189e = hrVar;
        } catch (RuntimeException e9) {
            cd.f("StreamVolumeManager", "Error registering stream volume receiver", e9);
        }
    }

    private static int g(AudioManager audioManager, int i9) {
        try {
            return audioManager.getStreamVolume(i9);
        } catch (RuntimeException e9) {
            cd.f("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i9, e9);
            return audioManager.getStreamMaxVolume(i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        final int iG = g(this.f23188d, this.f23190f);
        final boolean zI = i(this.f23188d, this.f23190f);
        if (this.f23191g == iG && this.f23192h == zI) {
            return;
        }
        this.f23191g = iG;
        this.f23192h = zI;
        ((fy) this.f23187c).f22933a.f22974k.g(30, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.fv
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj) {
                ((ax) obj).c(iG, zI);
            }
        });
    }

    private static boolean i(AudioManager audioManager, int i9) {
        return cq.f22640a >= 23 ? audioManager.isStreamMute(i9) : g(audioManager, i9) == 0;
    }

    public final int a() {
        return this.f23188d.getStreamMaxVolume(this.f23190f);
    }

    public final int b() {
        if (cq.f22640a >= 28) {
            return this.f23188d.getStreamMinVolume(this.f23190f);
        }
        return 0;
    }

    public final void e() {
        hr hrVar = this.f23189e;
        if (hrVar != null) {
            try {
                this.f23185a.unregisterReceiver(hrVar);
            } catch (RuntimeException e9) {
                cd.f("StreamVolumeManager", "Error unregistering stream volume receiver", e9);
            }
            this.f23189e = null;
        }
    }

    public final void f(int i9) {
        if (this.f23190f == 3) {
            return;
        }
        this.f23190f = 3;
        h();
        fy fyVar = (fy) this.f23187c;
        C1313l c1313lAj = gc.aj(fyVar.f22933a.f22987x);
        if (c1313lAj.equals(fyVar.f22933a.f22961V)) {
            return;
        }
        fyVar.f22933a.f22961V = c1313lAj;
        fyVar.f22933a.f22974k.g(29, new fw(c1313lAj, 0));
    }
}
