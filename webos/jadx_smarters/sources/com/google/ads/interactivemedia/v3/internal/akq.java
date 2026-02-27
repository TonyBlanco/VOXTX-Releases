package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class akq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ContentProgressProvider f20042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f20043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f20044c;

    public akq() {
        this.f20044c = new ArrayList(1);
        this.f20043b = new Handler(Looper.getMainLooper());
    }

    public akq(ContentProgressProvider contentProgressProvider) {
        this();
        this.f20042a = contentProgressProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        VideoProgressUpdate videoProgressUpdateF = f();
        Iterator it = this.f20044c.iterator();
        while (it.hasNext()) {
            ((akp) it.next()).a(videoProgressUpdateF);
        }
        this.f20043b.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ako
            @Override // java.lang.Runnable
            public final void run() {
                this.f20041a.g();
            }
        }, 200L);
    }

    public final void b(akp akpVar) {
        this.f20044c.add(akpVar);
    }

    public final void c(akp akpVar) {
        this.f20044c.remove(akpVar);
    }

    public final void d() {
        e();
        g();
    }

    public final void e() {
        this.f20043b.removeCallbacksAndMessages(null);
    }

    public final VideoProgressUpdate f() {
        VideoProgressUpdate contentProgress = this.f20042a.getContentProgress();
        if (contentProgress != null) {
            return contentProgress;
        }
        Log.w("IMASDK", "ContentProgressProvider.getContentProgress() is null. Use VideoProgressUpdate.VIDEO_TIME_NOT_READY instead.");
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }
}
