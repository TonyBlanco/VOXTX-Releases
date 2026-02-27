package U2;

import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9690f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9691g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9692h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9693i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9694j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f9695k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9696l;

    public void a(long j9) {
        b(j9, 1);
    }

    public final void b(long j9, int i9) {
        this.f9695k += j9;
        this.f9696l += i9;
    }

    public synchronized void c() {
    }

    public String toString() {
        return k0.D("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f9685a), Integer.valueOf(this.f9686b), Integer.valueOf(this.f9687c), Integer.valueOf(this.f9688d), Integer.valueOf(this.f9689e), Integer.valueOf(this.f9690f), Integer.valueOf(this.f9691g), Integer.valueOf(this.f9692h), Integer.valueOf(this.f9693i), Integer.valueOf(this.f9694j), Long.valueOf(this.f9695k), Integer.valueOf(this.f9696l));
    }
}
