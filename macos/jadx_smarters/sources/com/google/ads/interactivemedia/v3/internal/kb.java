package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
final class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1333s f23424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f23431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jb[] f23432i;

    public kb(C1333s c1333s, int i9, int i10, int i11, int i12, int i13, int i14, int i15, jb[] jbVarArr) {
        this.f23424a = c1333s;
        this.f23425b = i9;
        this.f23426c = i10;
        this.f23427d = i11;
        this.f23428e = i12;
        this.f23429f = i13;
        this.f23430g = i14;
        this.f23431h = i15;
        this.f23432i = jbVarArr;
    }

    private static AudioAttributes d(C1295f c1295f, boolean z9) {
        return z9 ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : c1295f.a().f22760a;
    }

    public final long a(long j9) {
        return (j9 * 1000000) / ((long) this.f23428e);
    }

    public final AudioTrack b(boolean z9, C1295f c1295f, int i9) throws jl {
        AudioTrack audioTrack;
        try {
            int i10 = cq.f22640a;
            if (i10 >= 29) {
                AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(this.f23428e).setChannelMask(this.f23429f).setEncoding(this.f23430g).build();
                AudioAttributes audioAttributesD = d(c1295f, z9);
                AbstractC1321n1.a();
                audioTrack = AbstractC1318m1.a().setAudioAttributes(audioAttributesD).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(this.f23431h).setSessionId(i9).setOffloadedPlayback(this.f23426c == 1).build();
            } else if (i10 >= 21) {
                audioTrack = new AudioTrack(d(c1295f, z9), new AudioFormat.Builder().setSampleRate(this.f23428e).setChannelMask(this.f23429f).setEncoding(this.f23430g).build(), this.f23431h, 1, i9);
            } else {
                int i11 = c1295f.f22873c;
                audioTrack = i9 == 0 ? new AudioTrack(3, this.f23428e, this.f23429f, this.f23430g, this.f23431h, 1) : new AudioTrack(3, this.f23428e, this.f23429f, this.f23430g, this.f23431h, 1, i9);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new jl(state, this.f23428e, this.f23429f, this.f23431h, this.f23424a, c(), null);
        } catch (IllegalArgumentException e9) {
            e = e9;
            throw new jl(0, this.f23428e, this.f23429f, this.f23431h, this.f23424a, c(), e);
        } catch (UnsupportedOperationException e10) {
            e = e10;
            throw new jl(0, this.f23428e, this.f23429f, this.f23431h, this.f23424a, c(), e);
        }
    }

    public final boolean c() {
        return this.f23426c == 1;
    }
}
