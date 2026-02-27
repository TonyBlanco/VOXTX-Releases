package androidx.media;

import M0.d;
import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseIntArray f15962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f15963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f15964d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f15965a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributesImpl.a f15966a;

        public a() {
            this.f15966a = AudioAttributesCompat.f15963c ? new AudioAttributesImplBase.a() : Build.VERSION.SDK_INT >= 26 ? new AudioAttributesImplApi26.a() : new AudioAttributesImplApi21.a();
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f15966a.build());
        }

        public a b(int i9) {
            this.f15966a.a(i9);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15962b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f15964d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f15965a = audioAttributesImpl;
    }

    public static int b(boolean z9, int i9, int i10) {
        if ((i9 & 1) == 1) {
            return z9 ? 1 : 7;
        }
        if ((i9 & 4) == 4) {
            return z9 ? 0 : 6;
        }
        switch (i10) {
            case 0:
            case 1:
            case 12:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z9 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            default:
                if (!z9) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i10 + " in audio attributes");
        }
    }

    public static String c(int i9) {
        switch (i9) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return "USAGE_GAME";
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            default:
                return "unknown usage " + i9;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat d(Object obj) {
        if (f15963c) {
            return null;
        }
        return Build.VERSION.SDK_INT >= 26 ? new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj)) : new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
    }

    public int a() {
        return this.f15965a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f15965a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f15965a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f15965a.hashCode();
    }

    public String toString() {
        return this.f15965a.toString();
    }
}
