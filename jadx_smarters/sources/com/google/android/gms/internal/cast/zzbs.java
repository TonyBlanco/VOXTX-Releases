package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.ArrayList;
import java.util.List;
import n4.C2260a;
import n4.C2262b;
import n4.r;
import o4.C2328e;
import p4.C2434i;
import r4.AbstractC2660a;
import r4.C2662c;
import s4.C2711c;
import s4.C2712d;
import s4.C2714f;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbs extends AbstractC2660a implements C2434i.e {
    private final CastSeekBar zza;
    private final long zzb;
    private final C2662c zzc;

    public zzbs(CastSeekBar castSeekBar, long j9, C2662c c2662c) {
        this.zza = castSeekBar;
        this.zzb = j9;
        this.zzc = c2662c;
        castSeekBar.setEnabled(false);
        castSeekBar.d(null);
        castSeekBar.f26372e = null;
        castSeekBar.postInvalidate();
    }

    @Override // r4.AbstractC2660a
    public final C2434i getRemoteMediaClient() {
        return super.getRemoteMediaClient();
    }

    @Override // r4.AbstractC2660a
    public final void onMediaStatusUpdated() {
        zzc();
    }

    @Override // p4.C2434i.e
    public final void onProgressUpdated(long j9, long j10) {
        zzb();
        zza();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionConnected(C2328e c2328e) {
        super.onSessionConnected(c2328e);
        C2434i remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.c(this, this.zzb);
        }
        zzc();
    }

    @Override // r4.AbstractC2660a
    public final void onSessionEnded() {
        C2434i remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient != null) {
            remoteMediaClient.P(this);
        }
        super.onSessionEnded();
        zzc();
    }

    public final void zza() {
        CastSeekBar castSeekBar;
        C2434i remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.w()) {
            castSeekBar = this.zza;
            castSeekBar.f26372e = null;
        } else {
            int iD = (int) remoteMediaClient.d();
            r rVarL = remoteMediaClient.l();
            C2260a c2260aJ = rVarL != null ? rVarL.J() : null;
            int iK = c2260aJ != null ? (int) c2260aJ.K() : iD;
            if (iD < 0) {
                iD = 0;
            }
            if (iK < 0) {
                iK = 1;
            }
            castSeekBar = this.zza;
            if (iD > iK) {
                iK = iD;
            }
            castSeekBar.f26372e = new C2712d(iD, iK);
        }
        castSeekBar.postInvalidate();
    }

    public final void zzb() {
        C2434i remoteMediaClient = super.getRemoteMediaClient();
        if (remoteMediaClient == null || !remoteMediaClient.q() || remoteMediaClient.w()) {
            this.zza.setEnabled(false);
        } else {
            this.zza.setEnabled(true);
        }
        C2714f c2714f = new C2714f();
        c2714f.f49948a = this.zzc.a();
        c2714f.f49949b = this.zzc.b();
        c2714f.f49950c = (int) (-this.zzc.e());
        C2434i remoteMediaClient2 = super.getRemoteMediaClient();
        c2714f.f49951d = (remoteMediaClient2 != null && remoteMediaClient2.q() && remoteMediaClient2.r0()) ? this.zzc.d() : this.zzc.a();
        C2434i remoteMediaClient3 = super.getRemoteMediaClient();
        c2714f.f49952e = (remoteMediaClient3 != null && remoteMediaClient3.q() && remoteMediaClient3.r0()) ? this.zzc.c() : this.zzc.a();
        C2434i remoteMediaClient4 = super.getRemoteMediaClient();
        c2714f.f49953f = remoteMediaClient4 != null && remoteMediaClient4.q() && remoteMediaClient4.r0();
        this.zza.e(c2714f);
    }

    public final void zzc() {
        CastSeekBar castSeekBar;
        zzb();
        C2434i remoteMediaClient = super.getRemoteMediaClient();
        ArrayList arrayList = null;
        MediaInfo mediaInfoJ = remoteMediaClient == null ? null : remoteMediaClient.j();
        if (remoteMediaClient == null || !remoteMediaClient.q() || remoteMediaClient.t() || mediaInfoJ == null) {
            castSeekBar = this.zza;
        } else {
            castSeekBar = this.zza;
            List<C2262b> listI = mediaInfoJ.I();
            if (listI != null) {
                arrayList = new ArrayList();
                for (C2262b c2262b : listI) {
                    if (c2262b != null) {
                        long jK = c2262b.K();
                        int iB = jK == -1000 ? this.zzc.b() : Math.min((int) (jK - this.zzc.e()), this.zzc.b());
                        if (iB >= 0) {
                            arrayList.add(new C2711c(iB, (int) c2262b.I(), c2262b.M()));
                        }
                    }
                }
            }
        }
        castSeekBar.d(arrayList);
        zza();
    }
}
