package p4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import com.google.android.gms.internal.cast.zzfh;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: p4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2433h extends AbstractC2985a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f46463A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f46464B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f46465C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f46466D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f46467E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f46468F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f46469G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f46470H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f46471I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f46472J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final X f46473K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f46474L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f46475M;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f46476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f46477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f46478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f46479i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f46480j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f46481k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f46482l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f46483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f46484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f46485o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f46486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f46487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f46488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f46489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f46490t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f46491u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f46492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f46493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f46494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f46495y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f46496z;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final zzfh f46461N = zzfh.zzk(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f46462O = {0, 1};
    public static final Parcelable.Creator<C2433h> CREATOR = new C2437l();

    /* JADX INFO: renamed from: p4.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f46497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f46498b = C2433h.f46461N;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int[] f46499c = C2433h.f46462O;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46500d = c("smallIconDrawableResId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46501e = c("stopLiveStreamDrawableResId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f46502f = c("pauseDrawableResId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f46503g = c("playDrawableResId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f46504h = c("skipNextDrawableResId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f46505i = c("skipPrevDrawableResId");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f46506j = c("forwardDrawableResId");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f46507k = c("forward10DrawableResId");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f46508l = c("forward30DrawableResId");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f46509m = c("rewindDrawableResId");

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f46510n = c("rewind10DrawableResId");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f46511o = c("rewind30DrawableResId");

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f46512p = c("disconnectDrawableResId");

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f46513q = 10000;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f46514r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f46515s;

        public static int c(String str) {
            try {
                Map map = ResourceProvider.f26368a;
                Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        }

        public C2433h a() {
            return new C2433h(this.f46498b, this.f46499c, this.f46513q, this.f46497a, this.f46500d, this.f46501e, this.f46502f, this.f46503g, this.f46504h, this.f46505i, this.f46506j, this.f46507k, this.f46508l, this.f46509m, this.f46510n, this.f46511o, this.f46512p, c("notificationImageSizeDimenResId"), c("castingToDeviceStringResId"), c("stopLiveStreamStringResId"), c("pauseStringResId"), c("playStringResId"), c("skipNextStringResId"), c("skipPrevStringResId"), c("forwardStringResId"), c("forward10StringResId"), c("forward30StringResId"), c("rewindStringResId"), c("rewind10StringResId"), c("rewind30StringResId"), c("disconnectStringResId"), null, this.f46514r, this.f46515s);
        }

        public a b(String str) {
            this.f46497a = str;
            return this;
        }
    }

    public C2433h(List list, int[] iArr, long j9, String str, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, IBinder iBinder, boolean z9, boolean z10) {
        this.f46476f = new ArrayList(list);
        this.f46477g = Arrays.copyOf(iArr, iArr.length);
        this.f46478h = j9;
        this.f46479i = str;
        this.f46480j = i9;
        this.f46481k = i10;
        this.f46482l = i11;
        this.f46483m = i12;
        this.f46484n = i13;
        this.f46485o = i14;
        this.f46486p = i15;
        this.f46487q = i16;
        this.f46488r = i17;
        this.f46489s = i18;
        this.f46490t = i19;
        this.f46491u = i20;
        this.f46492v = i21;
        this.f46493w = i22;
        this.f46494x = i23;
        this.f46495y = i24;
        this.f46496z = i25;
        this.f46463A = i26;
        this.f46464B = i27;
        this.f46465C = i28;
        this.f46466D = i29;
        this.f46467E = i30;
        this.f46468F = i31;
        this.f46469G = i32;
        this.f46470H = i33;
        this.f46471I = i34;
        this.f46472J = i35;
        this.f46474L = z9;
        this.f46475M = z10;
        if (iBinder == null) {
            this.f46473K = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
            this.f46473K = iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new W(iBinder);
        }
    }

    public List H() {
        return this.f46476f;
    }

    public int I() {
        return this.f46494x;
    }

    public int[] J() {
        int[] iArr = this.f46477g;
        return Arrays.copyOf(iArr, iArr.length);
    }

    public int K() {
        return this.f46492v;
    }

    public int L() {
        return this.f46487q;
    }

    public int M() {
        return this.f46488r;
    }

    public int N() {
        return this.f46486p;
    }

    public int O() {
        return this.f46482l;
    }

    public int P() {
        return this.f46483m;
    }

    public int Q() {
        return this.f46490t;
    }

    public int R() {
        return this.f46491u;
    }

    public int S() {
        return this.f46489s;
    }

    public int T() {
        return this.f46484n;
    }

    public int U() {
        return this.f46485o;
    }

    public long V() {
        return this.f46478h;
    }

    public int W() {
        return this.f46480j;
    }

    public int X() {
        return this.f46481k;
    }

    public int Y() {
        return this.f46495y;
    }

    public String Z() {
        return this.f46479i;
    }

    public final int a0() {
        return this.f46472J;
    }

    public final int b0() {
        return this.f46467E;
    }

    public final int c0() {
        return this.f46468F;
    }

    public final int d0() {
        return this.f46466D;
    }

    public final int e0() {
        return this.f46493w;
    }

    public final int f0() {
        return this.f46496z;
    }

    public final int g0() {
        return this.f46463A;
    }

    public final int h0() {
        return this.f46470H;
    }

    public final int i0() {
        return this.f46471I;
    }

    public final int j0() {
        return this.f46469G;
    }

    public final int k0() {
        return this.f46464B;
    }

    public final int l0() {
        return this.f46465C;
    }

    public final X m0() {
        return this.f46473K;
    }

    public final boolean o0() {
        return this.f46475M;
    }

    public final boolean p0() {
        return this.f46474L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.v(parcel, 2, H(), false);
        y4.c.m(parcel, 3, J(), false);
        y4.c.o(parcel, 4, V());
        y4.c.t(parcel, 5, Z(), false);
        y4.c.l(parcel, 6, W());
        y4.c.l(parcel, 7, X());
        y4.c.l(parcel, 8, O());
        y4.c.l(parcel, 9, P());
        y4.c.l(parcel, 10, T());
        y4.c.l(parcel, 11, U());
        y4.c.l(parcel, 12, N());
        y4.c.l(parcel, 13, L());
        y4.c.l(parcel, 14, M());
        y4.c.l(parcel, 15, S());
        y4.c.l(parcel, 16, Q());
        y4.c.l(parcel, 17, R());
        y4.c.l(parcel, 18, K());
        y4.c.l(parcel, 19, this.f46493w);
        y4.c.l(parcel, 20, I());
        y4.c.l(parcel, 21, Y());
        y4.c.l(parcel, 22, this.f46496z);
        y4.c.l(parcel, 23, this.f46463A);
        y4.c.l(parcel, 24, this.f46464B);
        y4.c.l(parcel, 25, this.f46465C);
        y4.c.l(parcel, 26, this.f46466D);
        y4.c.l(parcel, 27, this.f46467E);
        y4.c.l(parcel, 28, this.f46468F);
        y4.c.l(parcel, 29, this.f46469G);
        y4.c.l(parcel, 30, this.f46470H);
        y4.c.l(parcel, 31, this.f46471I);
        y4.c.l(parcel, 32, this.f46472J);
        X x9 = this.f46473K;
        y4.c.k(parcel, 33, x9 == null ? null : x9.asBinder(), false);
        y4.c.c(parcel, 34, this.f46474L);
        y4.c.c(parcel, 35, this.f46475M);
        y4.c.b(parcel, iA);
    }
}
