package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.SystemClock;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class ps implements qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ pv f24126a;

    public /* synthetic */ ps(pv pvVar) {
        this.f24126a = pvVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qm
    public final void j() {
        this.f24126a.f24143d.remove(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.qm
    public final boolean s(Uri uri, bdz bdzVar, boolean z9) {
        pu puVar;
        if (this.f24126a.f24150k == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            qg qgVar = this.f24126a.f24148i;
            int i9 = cq.f22640a;
            List list = qgVar.f24212c;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                pu puVar2 = (pu) this.f24126a.f24142c.get(((qf) list.get(i11)).f24204a);
                if (puVar2 != null && jElapsedRealtime < puVar2.f24137i) {
                    i10++;
                }
            }
            wv wvVarD = ws.d(new wu(1, 0, this.f24126a.f24148i.f24212c.size(), i10), bdzVar);
            if (wvVarD != null && wvVarD.f25018a == 2 && (puVar = (pu) this.f24126a.f24142c.get(uri)) != null) {
                pu.n(puVar, wvVarD.f25019b);
            }
        }
        return false;
    }
}
