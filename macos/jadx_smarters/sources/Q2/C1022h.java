package Q2;

import O2.C0936z0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import d4.AbstractC1684a;
import java.util.Arrays;
import s5.AbstractC2717A;
import s5.AbstractC2719C;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: Q2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1022h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1022h f7852c = new C1022h(new int[]{2}, 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC2743y f7853d = AbstractC2743y.D(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC2717A f7854e = new AbstractC2717A.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f7855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7856b;

    /* JADX INFO: renamed from: Q2.h$a */
    public static final class a {
        private static final AbstractC2719C a() {
            AbstractC2719C.a aVarI = new AbstractC2719C.a().i(8, 7);
            int i9 = d4.k0.f39777a;
            if (i9 >= 31) {
                aVarI.i(26, 27);
            }
            if (i9 >= 33) {
                aVarI.a(30);
            }
            return aVarI.l();
        }

        public static final boolean b(Context context) {
            AudioDeviceInfo[] devices = ((AudioManager) AbstractC1684a.e((AudioManager) context.getSystemService("audio"))).getDevices(2);
            AbstractC2719C abstractC2719CA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC2719CA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: Q2.h$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AudioAttributes f7857a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

        public static AbstractC2743y a() {
            AbstractC2743y.a aVarP = AbstractC2743y.p();
            s5.c0 it = C1022h.f7854e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (d4.k0.f39777a >= 34 || iIntValue != 30) {
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f7857a)) {
                        aVarP.a(num);
                    }
                }
            }
            aVarP.a(2);
            return aVarP.k();
        }

        public static int b(int i9, int i10) {
            for (int i11 = 10; i11 > 0; i11--) {
                if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i10).setChannelMask(d4.k0.I(i11)).build(), f7857a)) {
                    return i11;
                }
            }
            return 0;
        }
    }

    public C1022h(int[] iArr, int i9) {
        if (iArr != null) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7855a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f7855a = new int[0];
        }
        this.f7856b = i9;
    }

    public static boolean b() {
        if (d4.k0.f39777a >= 17) {
            String str = d4.k0.f39779c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static C1022h c(Context context) {
        return d(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public static C1022h d(Context context, Intent intent) {
        int i9 = d4.k0.f39777a;
        if (i9 >= 23 && a.b(context)) {
            return f7852c;
        }
        AbstractC2719C.a aVar = new AbstractC2719C.a();
        if (b() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f7853d);
        }
        if (i9 >= 29 && (d4.k0.I0(context) || d4.k0.B0(context))) {
            aVar.j(b.a());
            return new C1022h(w5.f.l(aVar.l()), 10);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            AbstractC2719C abstractC2719CL = aVar.l();
            return !abstractC2719CL.isEmpty() ? new C1022h(w5.f.l(abstractC2719CL), 10) : f7852c;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(w5.f.c(intArrayExtra));
        }
        return new C1022h(w5.f.l(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10));
    }

    public static int e(int i9) {
        int i10 = d4.k0.f39777a;
        if (i10 <= 28) {
            if (i9 == 7) {
                i9 = 8;
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                i9 = 6;
            }
        }
        if (i10 <= 26 && "fugu".equals(d4.k0.f39778b) && i9 == 1) {
            i9 = 2;
        }
        return d4.k0.I(i9);
    }

    public static Uri g() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public static int h(int i9, int i10) {
        return d4.k0.f39777a >= 29 ? b.b(i9, i10) : ((Integer) AbstractC1684a.e((Integer) f7854e.getOrDefault(Integer.valueOf(i9), 0))).intValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1022h)) {
            return false;
        }
        C1022h c1022h = (C1022h) obj;
        return Arrays.equals(this.f7855a, c1022h.f7855a) && this.f7856b == c1022h.f7856b;
    }

    public Pair f(C0936z0 c0936z0) {
        int iF = d4.F.f((String) AbstractC1684a.e(c0936z0.f6467m), c0936z0.f6464j);
        if (!f7854e.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !j(18)) {
            iF = 6;
        } else if ((iF == 8 && !j(8)) || (iF == 30 && !j(30))) {
            iF = 7;
        }
        if (!j(iF)) {
            return null;
        }
        int iH = c0936z0.f6480z;
        if (iH == -1 || iF == 18) {
            int i9 = c0936z0.f6447A;
            if (i9 == -1) {
                i9 = 48000;
            }
            iH = h(iF, i9);
        } else if (c0936z0.f6467m.equals("audio/vnd.dts.uhd;profile=p2")) {
            if (iH > 10) {
                return null;
            }
        } else if (iH > this.f7856b) {
            return null;
        }
        int iE = e(iH);
        if (iE == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(iE));
    }

    public int hashCode() {
        return this.f7856b + (Arrays.hashCode(this.f7855a) * 31);
    }

    public boolean i(C0936z0 c0936z0) {
        return f(c0936z0) != null;
    }

    public boolean j(int i9) {
        return Arrays.binarySearch(this.f7855a, i9) >= 0;
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7856b + ", supportedEncodings=" + Arrays.toString(this.f7855a) + "]";
    }
}
