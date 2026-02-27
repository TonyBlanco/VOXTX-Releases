package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes3.dex */
public final class qs implements re {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final atq f24281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final atq f24282c;

    public qs(final int i9) {
        final int i10 = 1;
        atq atqVar = new atq() { // from class: com.google.ads.interactivemedia.v3.internal.qr
            @Override // com.google.ads.interactivemedia.v3.internal.atq
            public final Object a() {
                return i10 != 0 ? new HandlerThread(qt.s(i9, "ExoPlayer:MediaCodecAsyncAdapter:")) : new HandlerThread(qt.s(i9, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        final int i11 = 0;
        atq atqVar2 = new atq() { // from class: com.google.ads.interactivemedia.v3.internal.qr
            @Override // com.google.ads.interactivemedia.v3.internal.atq
            public final Object a() {
                return i11 != 0 ? new HandlerThread(qt.s(i9, "ExoPlayer:MediaCodecAsyncAdapter:")) : new HandlerThread(qt.s(i9, "ExoPlayer:MediaCodecQueueingThread:"));
            }
        };
        this.f24281b = atqVar;
        this.f24282c = atqVar2;
    }

    public final qt a(rd rdVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = rdVar.f24358a.f24365a;
        qt qtVar = null;
        try {
            af.o("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                qt qtVar2 = new qt(mediaCodecCreateByCodecName, (HandlerThread) this.f24281b.a(), (HandlerThread) this.f24282c.a());
                try {
                    af.p();
                    qt.o(qtVar2, rdVar.f24359b, rdVar.f24361d, rdVar.f24362e);
                    return qtVar2;
                } catch (Exception e9) {
                    e = e9;
                    qtVar = qtVar2;
                    if (qtVar != null) {
                        qtVar.i();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Exception e11) {
            e = e11;
            mediaCodecCreateByCodecName = null;
        }
    }
}
