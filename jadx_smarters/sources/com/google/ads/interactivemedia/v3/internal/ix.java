package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes3.dex */
final class ix {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AudioAttributes f23323a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i9, int i10) {
        for (int i11 = 8; i11 > 0; i11--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i10).setChannelMask(cq.f(i11)).build(), f23323a)) {
                return i11;
            }
        }
        return 0;
    }

    public static int[] b() {
        avk avkVarJ = avo.j();
        axq axqVarListIterator = iy.f23325b.keySet().listIterator();
        while (axqVarListIterator.hasNext()) {
            Integer num = (Integer) axqVarListIterator.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f23323a)) {
                avkVarJ.g(num);
            }
        }
        avkVarJ.g(2);
        return axy.c(avkVarJ.f());
    }
}
