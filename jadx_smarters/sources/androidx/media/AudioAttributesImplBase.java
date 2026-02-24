package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15973d;

    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15974a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15975b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15976c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15977d = -1;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public final a b(int i9) {
            int i10 = 1;
            switch (i9) {
                case 0:
                case 10:
                    this.f15975b = i10;
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case 8:
                case 9:
                    this.f15975b = 4;
                    break;
                case 3:
                    i10 = 2;
                    this.f15975b = i10;
                    break;
                case 6:
                    this.f15975b = 1;
                    this.f15976c |= 4;
                    break;
                case 7:
                    this.f15976c = 1 | this.f15976c;
                    this.f15975b = 4;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i9 + " for AudioAttributesCompat");
                    break;
            }
            this.f15974a = AudioAttributesImplBase.e(i9);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.f15975b, this.f15976c, this.f15974a, this.f15977d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(int i9) {
            if (i9 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f15977d = i9;
            return b(i9);
        }
    }

    public AudioAttributesImplBase() {
        this.f15970a = 0;
        this.f15971b = 0;
        this.f15972c = 0;
        this.f15973d = -1;
    }

    public AudioAttributesImplBase(int i9, int i10, int i11, int i12) {
        this.f15971b = i9;
        this.f15972c = i10;
        this.f15970a = i11;
        this.f15973d = i12;
    }

    public static int e(int i9) {
        switch (i9) {
        }
        return 2;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i9 = this.f15973d;
        return i9 != -1 ? i9 : AudioAttributesCompat.b(false, this.f15972c, this.f15970a);
    }

    public int b() {
        return this.f15971b;
    }

    public int c() {
        int i9 = this.f15972c;
        int iA = a();
        if (iA == 6) {
            i9 |= 4;
        } else if (iA == 7) {
            i9 |= 1;
        }
        return i9 & 273;
    }

    public int d() {
        return this.f15970a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f15971b == audioAttributesImplBase.b() && this.f15972c == audioAttributesImplBase.c() && this.f15970a == audioAttributesImplBase.d() && this.f15973d == audioAttributesImplBase.f15973d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15971b), Integer.valueOf(this.f15972c), Integer.valueOf(this.f15970a), Integer.valueOf(this.f15973d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f15973d != -1) {
            sb.append(" stream=");
            sb.append(this.f15973d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.c(this.f15970a));
        sb.append(" content=");
        sb.append(this.f15971b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f15972c).toUpperCase());
        return sb.toString();
    }
}
