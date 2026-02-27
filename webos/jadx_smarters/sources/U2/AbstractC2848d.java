package u2;

import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;
import x2.f;
import y2.C2983a;
import y2.g;
import y2.h;
import y2.i;
import y2.j;
import y2.k;
import y2.l;
import y2.m;
import y2.n;
import y2.o;

/* JADX INFO: renamed from: u2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2848d {

    /* JADX INFO: renamed from: u2.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51196a;

        static {
            int[] iArr = new int[EnumC2849e.values().length];
            f51196a = iArr;
            try {
                iArr[EnumC2849e.ROTATING_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51196a[EnumC2849e.DOUBLE_BOUNCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51196a[EnumC2849e.WAVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51196a[EnumC2849e.WANDERING_CUBES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51196a[EnumC2849e.PULSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51196a[EnumC2849e.CHASING_DOTS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51196a[EnumC2849e.THREE_BOUNCE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51196a[EnumC2849e.CIRCLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f51196a[EnumC2849e.CUBE_GRID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f51196a[EnumC2849e.FADING_CIRCLE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f51196a[EnumC2849e.FOLDING_CUBE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f51196a[EnumC2849e.ROTATING_CIRCLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f51196a[EnumC2849e.MULTIPLE_PULSE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f51196a[EnumC2849e.PULSE_RING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f51196a[EnumC2849e.MULTIPLE_PULSE_RING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static f a(EnumC2849e enumC2849e) {
        switch (a.f51196a[enumC2849e.ordinal()]) {
            case 1:
                return new l();
            case 2:
                return new y2.d();
            case 3:
                return new o();
            case 4:
                return new n();
            case 5:
                return new i();
            case 6:
                return new C2983a();
            case 7:
                return new m();
            case 8:
                return new y2.b();
            case 9:
                return new y2.c();
            case 10:
                return new y2.e();
            case 11:
                return new y2.f();
            case 12:
                return new k();
            case 13:
                return new g();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new j();
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return new h();
            default:
                return null;
        }
    }
}
