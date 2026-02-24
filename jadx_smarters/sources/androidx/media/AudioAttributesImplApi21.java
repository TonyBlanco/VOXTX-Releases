package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f15967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15968b;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f15969a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(int i9) {
            this.f15969a.setLegacyStreamType(i9);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi21(this.f15969a.build());
        }
    }

    public AudioAttributesImplApi21() {
        this.f15968b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i9) {
        this.f15967a = audioAttributes;
        this.f15968b = i9;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i9 = this.f15968b;
        return i9 != -1 ? i9 : AudioAttributesCompat.b(false, b(), c());
    }

    public int b() {
        return this.f15967a.getFlags();
    }

    public int c() {
        return this.f15967a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f15967a.equals(((AudioAttributesImplApi21) obj).f15967a);
        }
        return false;
    }

    public int hashCode() {
        return this.f15967a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f15967a;
    }
}
