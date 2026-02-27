package androidx.media;

import M0.b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f15970a = bVar.p(audioAttributesImplBase.f15970a, 1);
        audioAttributesImplBase.f15971b = bVar.p(audioAttributesImplBase.f15971b, 2);
        audioAttributesImplBase.f15972c = bVar.p(audioAttributesImplBase.f15972c, 3);
        audioAttributesImplBase.f15973d = bVar.p(audioAttributesImplBase.f15973d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.x(false, false);
        bVar.F(audioAttributesImplBase.f15970a, 1);
        bVar.F(audioAttributesImplBase.f15971b, 2);
        bVar.F(audioAttributesImplBase.f15972c, 3);
        bVar.F(audioAttributesImplBase.f15973d, 4);
    }
}
