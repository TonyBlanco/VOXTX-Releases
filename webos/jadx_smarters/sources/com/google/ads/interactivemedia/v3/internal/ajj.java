package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ajj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f19944a = new ArrayList(1);

    public final void a(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f19944a.add(adErrorListener);
    }

    public final void b() {
        this.f19944a.clear();
    }

    public final void c(AdErrorEvent adErrorEvent) {
        Iterator it = this.f19944a.iterator();
        while (it.hasNext()) {
            ((AdErrorEvent.AdErrorListener) it.next()).onAdError(adErrorEvent);
        }
    }

    public final void d(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f19944a.remove(adErrorListener);
    }

    public final String toString() {
        return "ErrorListenerSupport [errorListeners=" + this.f19944a.toString() + "]";
    }
}
