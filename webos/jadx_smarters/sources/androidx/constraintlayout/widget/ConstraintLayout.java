package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import x.e;
import x.f;
import x.g;
import y.C2968b;
import z.AbstractC2994b;
import z.C2993a;
import z.d;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SparseArray f14251a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f14252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f14253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.constraintlayout.widget.c f14260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2993a f14261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap f14263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14266q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SparseArray f14270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f14271v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14272w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14273x;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14274a;

        static {
            int[] iArr = new int[e.b.values().length];
            f14274a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14274a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14274a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14274a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public float f14275A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public String f14276B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public float f14277C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f14278D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f14279E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f14280F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f14281G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f14282H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f14283I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f14284J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f14285K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f14286L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f14287M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f14288N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f14289O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f14290P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f14291Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f14292R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f14293S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f14294T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f14295U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public String f14296V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f14297W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f14298X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public boolean f14299Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public boolean f14300Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14301a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f14302a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14303b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f14304b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14305c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f14306c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14307d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f14308d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14309e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int f14310e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14311f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public int f14312f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14313g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f14314g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14315h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f14316h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14317i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f14318i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14319j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public float f14320j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f14321k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f14322k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f14323l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f14324l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f14325m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public float f14326m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f14327n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public e f14328n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f14329o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f14330o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f14331p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f14332q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f14333r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f14334s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14335t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f14336u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f14337v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f14338w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f14339x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f14340y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f14341z;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f14342a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f14342a = sparseIntArray;
                sparseIntArray.append(d.f52254K1, 8);
                sparseIntArray.append(d.f52260L1, 9);
                sparseIntArray.append(d.f52272N1, 10);
                sparseIntArray.append(d.f52278O1, 11);
                sparseIntArray.append(d.f52314U1, 12);
                sparseIntArray.append(d.f52308T1, 13);
                sparseIntArray.append(d.f52453s1, 14);
                sparseIntArray.append(d.f52447r1, 15);
                sparseIntArray.append(d.f52435p1, 16);
                sparseIntArray.append(d.f52459t1, 2);
                sparseIntArray.append(d.f52471v1, 3);
                sparseIntArray.append(d.f52465u1, 4);
                sparseIntArray.append(d.f52358c2, 49);
                sparseIntArray.append(d.f52364d2, 50);
                sparseIntArray.append(d.f52495z1, 5);
                sparseIntArray.append(d.f52194A1, 6);
                sparseIntArray.append(d.f52200B1, 7);
                sparseIntArray.append(d.f52351b1, 1);
                sparseIntArray.append(d.f52284P1, 17);
                sparseIntArray.append(d.f52290Q1, 18);
                sparseIntArray.append(d.f52489y1, 19);
                sparseIntArray.append(d.f52483x1, 20);
                sparseIntArray.append(d.f52382g2, 21);
                sparseIntArray.append(d.f52400j2, 22);
                sparseIntArray.append(d.f52388h2, 23);
                sparseIntArray.append(d.f52370e2, 24);
                sparseIntArray.append(d.f52394i2, 25);
                sparseIntArray.append(d.f52376f2, 26);
                sparseIntArray.append(d.f52230G1, 29);
                sparseIntArray.append(d.f52320V1, 30);
                sparseIntArray.append(d.f52477w1, 44);
                sparseIntArray.append(d.f52242I1, 45);
                sparseIntArray.append(d.f52330X1, 46);
                sparseIntArray.append(d.f52236H1, 47);
                sparseIntArray.append(d.f52325W1, 48);
                sparseIntArray.append(d.f52423n1, 27);
                sparseIntArray.append(d.f52417m1, 28);
                sparseIntArray.append(d.f52335Y1, 31);
                sparseIntArray.append(d.f52206C1, 32);
                sparseIntArray.append(d.f52346a2, 33);
                sparseIntArray.append(d.f52340Z1, 34);
                sparseIntArray.append(d.f52352b2, 35);
                sparseIntArray.append(d.f52218E1, 36);
                sparseIntArray.append(d.f52212D1, 37);
                sparseIntArray.append(d.f52224F1, 38);
                sparseIntArray.append(d.f52248J1, 39);
                sparseIntArray.append(d.f52302S1, 40);
                sparseIntArray.append(d.f52266M1, 41);
                sparseIntArray.append(d.f52441q1, 42);
                sparseIntArray.append(d.f52429o1, 43);
                sparseIntArray.append(d.f52296R1, 51);
            }
        }

        public b(int i9, int i10) {
            super(i9, i10);
            this.f14301a = -1;
            this.f14303b = -1;
            this.f14305c = -1.0f;
            this.f14307d = -1;
            this.f14309e = -1;
            this.f14311f = -1;
            this.f14313g = -1;
            this.f14315h = -1;
            this.f14317i = -1;
            this.f14319j = -1;
            this.f14321k = -1;
            this.f14323l = -1;
            this.f14325m = -1;
            this.f14327n = 0;
            this.f14329o = 0.0f;
            this.f14331p = -1;
            this.f14332q = -1;
            this.f14333r = -1;
            this.f14334s = -1;
            this.f14335t = -1;
            this.f14336u = -1;
            this.f14337v = -1;
            this.f14338w = -1;
            this.f14339x = -1;
            this.f14340y = -1;
            this.f14341z = 0.5f;
            this.f14275A = 0.5f;
            this.f14276B = null;
            this.f14277C = 0.0f;
            this.f14278D = 1;
            this.f14279E = -1.0f;
            this.f14280F = -1.0f;
            this.f14281G = 0;
            this.f14282H = 0;
            this.f14283I = 0;
            this.f14284J = 0;
            this.f14285K = 0;
            this.f14286L = 0;
            this.f14287M = 0;
            this.f14288N = 0;
            this.f14289O = 1.0f;
            this.f14290P = 1.0f;
            this.f14291Q = -1;
            this.f14292R = -1;
            this.f14293S = -1;
            this.f14294T = false;
            this.f14295U = false;
            this.f14296V = null;
            this.f14297W = true;
            this.f14298X = true;
            this.f14299Y = false;
            this.f14300Z = false;
            this.f14302a0 = false;
            this.f14304b0 = false;
            this.f14306c0 = false;
            this.f14308d0 = -1;
            this.f14310e0 = -1;
            this.f14312f0 = -1;
            this.f14314g0 = -1;
            this.f14316h0 = -1;
            this.f14318i0 = -1;
            this.f14320j0 = 0.5f;
            this.f14328n0 = new e();
            this.f14330o0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            int i9;
            float fAbs;
            super(context, attributeSet);
            this.f14301a = -1;
            this.f14303b = -1;
            this.f14305c = -1.0f;
            this.f14307d = -1;
            this.f14309e = -1;
            this.f14311f = -1;
            this.f14313g = -1;
            this.f14315h = -1;
            this.f14317i = -1;
            this.f14319j = -1;
            this.f14321k = -1;
            this.f14323l = -1;
            this.f14325m = -1;
            this.f14327n = 0;
            this.f14329o = 0.0f;
            this.f14331p = -1;
            this.f14332q = -1;
            this.f14333r = -1;
            this.f14334s = -1;
            this.f14335t = -1;
            this.f14336u = -1;
            this.f14337v = -1;
            this.f14338w = -1;
            this.f14339x = -1;
            this.f14340y = -1;
            this.f14341z = 0.5f;
            this.f14275A = 0.5f;
            this.f14276B = null;
            this.f14277C = 0.0f;
            this.f14278D = 1;
            this.f14279E = -1.0f;
            this.f14280F = -1.0f;
            this.f14281G = 0;
            this.f14282H = 0;
            this.f14283I = 0;
            this.f14284J = 0;
            this.f14285K = 0;
            this.f14286L = 0;
            this.f14287M = 0;
            this.f14288N = 0;
            this.f14289O = 1.0f;
            this.f14290P = 1.0f;
            this.f14291Q = -1;
            this.f14292R = -1;
            this.f14293S = -1;
            this.f14294T = false;
            this.f14295U = false;
            this.f14296V = null;
            this.f14297W = true;
            this.f14298X = true;
            this.f14299Y = false;
            this.f14300Z = false;
            this.f14302a0 = false;
            this.f14304b0 = false;
            this.f14306c0 = false;
            this.f14308d0 = -1;
            this.f14310e0 = -1;
            this.f14312f0 = -1;
            this.f14314g0 = -1;
            this.f14316h0 = -1;
            this.f14318i0 = -1;
            this.f14320j0 = 0.5f;
            this.f14328n0 = new e();
            this.f14330o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f52345a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f14342a.get(index);
                switch (i11) {
                    case 1:
                        this.f14293S = typedArrayObtainStyledAttributes.getInt(index, this.f14293S);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f14325m);
                        this.f14325m = resourceId;
                        if (resourceId == -1) {
                            this.f14325m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.f14327n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14327n);
                        continue;
                        break;
                    case 4:
                        float f9 = typedArrayObtainStyledAttributes.getFloat(index, this.f14329o) % 360.0f;
                        this.f14329o = f9;
                        if (f9 < 0.0f) {
                            this.f14329o = (360.0f - f9) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f14301a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14301a);
                        continue;
                        break;
                    case 6:
                        this.f14303b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14303b);
                        continue;
                        break;
                    case 7:
                        this.f14305c = typedArrayObtainStyledAttributes.getFloat(index, this.f14305c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14307d);
                        this.f14307d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f14307d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14309e);
                        this.f14309e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f14309e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14311f);
                        this.f14311f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f14311f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14313g);
                        this.f14313g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f14313g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14315h);
                        this.f14315h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f14315h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14317i);
                        this.f14317i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f14317i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14319j);
                        this.f14319j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f14319j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14321k);
                        this.f14321k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f14321k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14323l);
                        this.f14323l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f14323l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14331p);
                        this.f14331p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f14331p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14332q);
                        this.f14332q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f14332q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14333r);
                        this.f14333r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f14333r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f14334s);
                        this.f14334s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f14334s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.f14335t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14335t);
                        continue;
                        break;
                    case 22:
                        this.f14336u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14336u);
                        continue;
                        break;
                    case 23:
                        this.f14337v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14337v);
                        continue;
                        break;
                    case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                        this.f14338w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14338w);
                        continue;
                        break;
                    case 25:
                        this.f14339x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14339x);
                        continue;
                        break;
                    case 26:
                        this.f14340y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14340y);
                        continue;
                        break;
                    case 27:
                        this.f14294T = typedArrayObtainStyledAttributes.getBoolean(index, this.f14294T);
                        continue;
                        break;
                    case 28:
                        this.f14295U = typedArrayObtainStyledAttributes.getBoolean(index, this.f14295U);
                        continue;
                        break;
                    case 29:
                        this.f14341z = typedArrayObtainStyledAttributes.getFloat(index, this.f14341z);
                        continue;
                        break;
                    case 30:
                        this.f14275A = typedArrayObtainStyledAttributes.getFloat(index, this.f14275A);
                        continue;
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f14283I = i12;
                        if (i12 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f14284J = i13;
                        if (i13 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                        }
                        break;
                    case 33:
                        try {
                            this.f14285K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14285K);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f14285K) == -2) {
                                this.f14285K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f14287M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14287M);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f14287M) == -2) {
                                this.f14287M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f14289O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f14289O));
                        this.f14283I = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.f14286L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14286L);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f14286L) == -2) {
                                this.f14286L = -2;
                            }
                        }
                        break;
                    case LangUtils.HASH_OFFSET /* 37 */:
                        try {
                            this.f14288N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14288N);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f14288N) == -2) {
                                this.f14288N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f14290P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f14290P));
                        this.f14284J = 2;
                        continue;
                        break;
                    default:
                        switch (i11) {
                            case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f14276B = string;
                                this.f14277C = Float.NaN;
                                this.f14278D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f14276B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i9 = 0;
                                    } else {
                                        String strSubstring = this.f14276B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f14278D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f14278D = 1;
                                        }
                                        i9 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f14276B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f14276B.substring(i9);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                            this.f14277C = fAbs;
                                        }
                                    } else {
                                        String strSubstring3 = this.f14276B.substring(i9, iIndexOf2);
                                        String strSubstring4 = this.f14276B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f10 = Float.parseFloat(strSubstring3);
                                                float f11 = Float.parseFloat(strSubstring4);
                                                if (f10 > 0.0f && f11 > 0.0f) {
                                                    fAbs = this.f14278D == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                                                    this.f14277C = fAbs;
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f14279E = typedArrayObtainStyledAttributes.getFloat(index, this.f14279E);
                                break;
                            case 46:
                                this.f14280F = typedArrayObtainStyledAttributes.getFloat(index, this.f14280F);
                                break;
                            case 47:
                                this.f14281G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f14282H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f14291Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14291Q);
                                break;
                            case 50:
                                this.f14292R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14292R);
                                break;
                            case 51:
                                this.f14296V = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f14301a = -1;
            this.f14303b = -1;
            this.f14305c = -1.0f;
            this.f14307d = -1;
            this.f14309e = -1;
            this.f14311f = -1;
            this.f14313g = -1;
            this.f14315h = -1;
            this.f14317i = -1;
            this.f14319j = -1;
            this.f14321k = -1;
            this.f14323l = -1;
            this.f14325m = -1;
            this.f14327n = 0;
            this.f14329o = 0.0f;
            this.f14331p = -1;
            this.f14332q = -1;
            this.f14333r = -1;
            this.f14334s = -1;
            this.f14335t = -1;
            this.f14336u = -1;
            this.f14337v = -1;
            this.f14338w = -1;
            this.f14339x = -1;
            this.f14340y = -1;
            this.f14341z = 0.5f;
            this.f14275A = 0.5f;
            this.f14276B = null;
            this.f14277C = 0.0f;
            this.f14278D = 1;
            this.f14279E = -1.0f;
            this.f14280F = -1.0f;
            this.f14281G = 0;
            this.f14282H = 0;
            this.f14283I = 0;
            this.f14284J = 0;
            this.f14285K = 0;
            this.f14286L = 0;
            this.f14287M = 0;
            this.f14288N = 0;
            this.f14289O = 1.0f;
            this.f14290P = 1.0f;
            this.f14291Q = -1;
            this.f14292R = -1;
            this.f14293S = -1;
            this.f14294T = false;
            this.f14295U = false;
            this.f14296V = null;
            this.f14297W = true;
            this.f14298X = true;
            this.f14299Y = false;
            this.f14300Z = false;
            this.f14302a0 = false;
            this.f14304b0 = false;
            this.f14306c0 = false;
            this.f14308d0 = -1;
            this.f14310e0 = -1;
            this.f14312f0 = -1;
            this.f14314g0 = -1;
            this.f14316h0 = -1;
            this.f14318i0 = -1;
            this.f14320j0 = 0.5f;
            this.f14328n0 = new e();
            this.f14330o0 = false;
        }

        public void a() {
            this.f14300Z = false;
            this.f14297W = true;
            this.f14298X = true;
            int i9 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i9 == -2 && this.f14294T) {
                this.f14297W = false;
                if (this.f14283I == 0) {
                    this.f14283I = 1;
                }
            }
            int i10 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i10 == -2 && this.f14295U) {
                this.f14298X = false;
                if (this.f14284J == 0) {
                    this.f14284J = 1;
                }
            }
            if (i9 == 0 || i9 == -1) {
                this.f14297W = false;
                if (i9 == 0 && this.f14283I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f14294T = true;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f14298X = false;
                if (i10 == 0 && this.f14284J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f14295U = true;
                }
            }
            if (this.f14305c == -1.0f && this.f14301a == -1 && this.f14303b == -1) {
                return;
            }
            this.f14300Z = true;
            this.f14297W = true;
            this.f14298X = true;
            if (!(this.f14328n0 instanceof g)) {
                this.f14328n0 = new g();
            }
            ((g) this.f14328n0).N0(this.f14293S);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instruction units count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }
    }

    public class c implements C2968b.InterfaceC0481b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ConstraintLayout f14343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14349g;

        public c(ConstraintLayout constraintLayout) {
            this.f14343a = constraintLayout;
        }

        @Override // y.C2968b.InterfaceC0481b
        public final void a() {
            int childCount = this.f14343a.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.f14343a.getChildAt(i9);
            }
            int size = this.f14343a.f14252c.size();
            if (size > 0) {
                for (int i10 = 0; i10 < size; i10++) {
                    ((androidx.constraintlayout.widget.b) this.f14343a.f14252c.get(i10)).h(this.f14343a);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x016b A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x019c  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01a8  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x01bf  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x01c9  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x01d1  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x01d6  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:150:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:154:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:158:0x0231  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:162:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:164:0x023d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
        @Override // y.C2968b.InterfaceC0481b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(x.e r20, y.C2968b.a r21) {
            /*
                Method dump skipped, instruction units count: 594
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.b(x.e, y.b$a):void");
        }

        public void c(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f14344b = i11;
            this.f14345c = i12;
            this.f14346d = i13;
            this.f14347e = i14;
            this.f14348f = i9;
            this.f14349g = i10;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14251a = new SparseArray();
        this.f14252c = new ArrayList(4);
        this.f14253d = new f();
        this.f14254e = 0;
        this.f14255f = 0;
        this.f14256g = a.e.API_PRIORITY_OTHER;
        this.f14257h = a.e.API_PRIORITY_OTHER;
        this.f14258i = true;
        this.f14259j = 263;
        this.f14260k = null;
        this.f14261l = null;
        this.f14262m = -1;
        this.f14263n = new HashMap();
        this.f14264o = -1;
        this.f14265p = -1;
        this.f14266q = -1;
        this.f14267r = -1;
        this.f14268s = 0;
        this.f14269t = 0;
        this.f14270u = new SparseArray();
        this.f14271v = new c(this);
        this.f14272w = 0;
        this.f14273x = 0;
        j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f14251a = new SparseArray();
        this.f14252c = new ArrayList(4);
        this.f14253d = new f();
        this.f14254e = 0;
        this.f14255f = 0;
        this.f14256g = a.e.API_PRIORITY_OTHER;
        this.f14257h = a.e.API_PRIORITY_OTHER;
        this.f14258i = true;
        this.f14259j = 263;
        this.f14260k = null;
        this.f14261l = null;
        this.f14262m = -1;
        this.f14263n = new HashMap();
        this.f14264o = -1;
        this.f14265p = -1;
        this.f14266q = -1;
        this.f14267r = -1;
        this.f14268s = 0;
        this.f14269t = 0;
        this.f14270u = new SparseArray();
        this.f14271v = new c(this);
        this.f14272w = 0;
        this.f14273x = 0;
        j(attributeSet, i9, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i9, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(boolean r19, android.view.View r20, x.e r21, androidx.constraintlayout.widget.ConstraintLayout.b r22, android.util.SparseArray r23) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, x.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f14252c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((androidx.constraintlayout.widget.b) this.f14252c.get(i9)).i(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        int i12 = Integer.parseInt(strArrSplit[1]);
                        int i13 = Integer.parseInt(strArrSplit[2]);
                        int i14 = (int) ((i11 / 1080.0f) * width);
                        int i15 = (int) ((i12 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f9 = i14;
                        float f10 = i15;
                        float f11 = i14 + ((int) ((i13 / 1080.0f) * width));
                        canvas.drawLine(f9, f10, f11, f10, paint);
                        float f12 = i15 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f11, f10, f11, f12, paint);
                        canvas.drawLine(f11, f12, f9, f12, paint);
                        canvas.drawLine(f9, f12, f9, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f9, f10, f11, f12, paint);
                        canvas.drawLine(f9, f12, f11, f10, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i9, Object obj) {
        if (i9 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f14263n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f14263n.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final e g(int i9) {
        if (i9 == 0) {
            return this.f14253d;
        }
        View viewFindViewById = (View) this.f14251a.get(i9);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i9)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f14253d;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f14328n0;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f14257h;
    }

    public int getMaxWidth() {
        return this.f14256g;
    }

    public int getMinHeight() {
        return this.f14255f;
    }

    public int getMinWidth() {
        return this.f14254e;
    }

    public int getOptimizationLevel() {
        return this.f14253d.R0();
    }

    public View h(int i9) {
        return (View) this.f14251a.get(i9);
    }

    public final e i(View view) {
        if (view == this) {
            return this.f14253d;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f14328n0;
    }

    public final void j(AttributeSet attributeSet, int i9, int i10) {
        this.f14253d.Z(this);
        this.f14253d.a1(this.f14271v);
        this.f14251a.put(getId(), this);
        this.f14260k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f52345a1, i9, i10);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == d.f52369e1) {
                    this.f14254e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14254e);
                } else if (index == d.f52375f1) {
                    this.f14255f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14255f);
                } else if (index == d.f52357c1) {
                    this.f14256g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14256g);
                } else if (index == d.f52363d1) {
                    this.f14257h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14257h);
                } else if (index == d.f52406k2) {
                    this.f14259j = typedArrayObtainStyledAttributes.getInt(index, this.f14259j);
                } else if (index == d.f52411l1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f14261l = null;
                        }
                    }
                } else if (index == d.f52399j1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                        this.f14260k = cVar;
                        cVar.l(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f14260k = null;
                    }
                    this.f14262m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f14253d.b1(this.f14259j);
    }

    public boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void l() {
        this.f14258i = true;
        this.f14264o = -1;
        this.f14265p = -1;
        this.f14266q = -1;
        this.f14267r = -1;
        this.f14268s = 0;
        this.f14269t = 0;
    }

    public void m(int i9) {
        this.f14261l = new C2993a(getContext(), this, i9);
    }

    public void n(int i9, int i10, int i11, int i12, boolean z9, boolean z10) {
        c cVar = this.f14271v;
        int i13 = cVar.f14347e;
        int iResolveSizeAndState = View.resolveSizeAndState(i11 + cVar.f14346d, i9, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i12 + i13, i10, 0) & 16777215;
        int iMin = Math.min(this.f14256g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f14257h, iResolveSizeAndState2);
        if (z9) {
            iMin |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        if (z10) {
            iMin2 |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f14264o = iMin;
        this.f14265p = iMin2;
    }

    public void o(f fVar, int i9, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i12 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f14271v.c(i10, i11, iMax, iMax2, paddingWidth, i12);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        int iMax5 = (iMax3 > 0 || iMax4 > 0) ? k() ? iMax4 : iMax3 : Math.max(0, getPaddingLeft());
        int i13 = size - paddingWidth;
        int i14 = size2 - i12;
        r(fVar, mode, i13, mode2, i14);
        fVar.X0(i9, mode, i13, mode2, i14, this.f14264o, this.f14265p, iMax5, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            b bVar = (b) childAt.getLayoutParams();
            e eVar = bVar.f14328n0;
            if ((childAt.getVisibility() != 8 || bVar.f14300Z || bVar.f14302a0 || bVar.f14306c0 || zIsInEditMode) && !bVar.f14304b0) {
                int iO = eVar.O();
                int iP = eVar.P();
                childAt.layout(iO, iP, eVar.N() + iO, eVar.t() + iP);
            }
        }
        int size = this.f14252c.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                ((androidx.constraintlayout.widget.b) this.f14252c.get(i14)).g(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        this.f14272w = i9;
        this.f14273x = i10;
        this.f14253d.c1(k());
        if (this.f14258i) {
            this.f14258i = false;
            if (s()) {
                this.f14253d.e1();
            }
        }
        o(this.f14253d, this.f14259j, i9, i10);
        n(i9, i10, this.f14253d.N(), this.f14253d.t(), this.f14253d.W0(), this.f14253d.U0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e eVarI = i(view);
        if ((view instanceof Guideline) && !(eVarI instanceof g)) {
            b bVar = (b) view.getLayoutParams();
            g gVar = new g();
            bVar.f14328n0 = gVar;
            bVar.f14300Z = true;
            gVar.N0(bVar.f14293S);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.k();
            ((b) view.getLayoutParams()).f14302a0 = true;
            if (!this.f14252c.contains(bVar2)) {
                this.f14252c.add(bVar2);
            }
        }
        this.f14251a.put(view.getId(), view);
        this.f14258i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f14251a.remove(view.getId());
        this.f14253d.H0(i(view));
        this.f14252c.remove(view);
        this.f14258i = true;
    }

    public final void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            e eVarI = i(getChildAt(i9));
            if (eVarI != null) {
                eVarI.W();
            }
        }
        if (zIsInEditMode) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f14262m != -1) {
            for (int i11 = 0; i11 < childCount; i11++) {
                getChildAt(i11).getId();
            }
        }
        androidx.constraintlayout.widget.c cVar = this.f14260k;
        if (cVar != null) {
            cVar.d(this, true);
        }
        this.f14253d.I0();
        int size = this.f14252c.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((androidx.constraintlayout.widget.b) this.f14252c.get(i12)).j(this);
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            getChildAt(i13);
        }
        this.f14270u.clear();
        this.f14270u.put(0, this.f14253d);
        this.f14270u.put(getId(), this.f14253d);
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt2 = getChildAt(i14);
            this.f14270u.put(childAt2.getId(), i(childAt2));
        }
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt3 = getChildAt(i15);
            e eVarI2 = i(childAt3);
            if (eVarI2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f14253d.b(eVarI2);
                c(zIsInEditMode, childAt3, eVarI2, bVar, this.f14270u);
            }
        }
    }

    public void q(int i9, Object obj, Object obj2) {
        if (i9 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f14263n == null) {
                this.f14263n = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f14263n.put(strSubstring, num);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r9
      0x0027: PHI (r9v2 x.e$b) = (r9v1 x.e$b), (r9v8 x.e$b) binds: [B:13:0x0030, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047 A[PHI: r2
      0x0047: PHI (r2v2 x.e$b) = (r2v1 x.e$b), (r2v4 x.e$b) binds: [B:24:0x0050, B:21:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(x.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f14271v
            int r1 = r0.f14347e
            int r0 = r0.f14346d
            x.e$b r2 = x.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L33
        L1a:
            int r9 = r7.f14256g
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L33
        L23:
            x.e$b r9 = x.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
        L27:
            int r10 = r7.f14254e
            int r10 = java.lang.Math.max(r6, r10)
            goto L33
        L2e:
            x.e$b r9 = x.e.b.WRAP_CONTENT
            if (r3 != 0) goto L33
            goto L27
        L33:
            if (r11 == r5) goto L4e
            if (r11 == 0) goto L43
            if (r11 == r4) goto L3b
        L39:
            r12 = 0
            goto L53
        L3b:
            int r11 = r7.f14257h
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L53
        L43:
            x.e$b r2 = x.e.b.WRAP_CONTENT
            if (r3 != 0) goto L39
        L47:
            int r11 = r7.f14255f
            int r12 = java.lang.Math.max(r6, r11)
            goto L53
        L4e:
            x.e$b r2 = x.e.b.WRAP_CONTENT
            if (r3 != 0) goto L53
            goto L47
        L53:
            int r11 = r8.N()
            if (r10 != r11) goto L5f
            int r11 = r8.t()
            if (r12 == r11) goto L62
        L5f:
            r8.T0()
        L62:
            r8.B0(r6)
            r8.C0(r6)
            int r11 = r7.f14256g
            int r11 = r11 - r0
            r8.o0(r11)
            int r11 = r7.f14257h
            int r11 = r11 - r1
            r8.n0(r11)
            r8.q0(r6)
            r8.p0(r6)
            r8.i0(r9)
            r8.A0(r10)
            r8.w0(r2)
            r8.e0(r12)
            int r9 = r7.f14254e
            int r9 = r9 - r0
            r8.q0(r9)
            int r9 = r7.f14255f
            int r9 = r9 - r1
            r8.p0(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r(x.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z9 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= childCount) {
                break;
            }
            if (getChildAt(i9).isLayoutRequested()) {
                z9 = true;
                break;
            }
            i9++;
        }
        if (z9) {
            p();
        }
        return z9;
    }

    public void setConstraintSet(androidx.constraintlayout.widget.c cVar) {
        this.f14260k = cVar;
    }

    @Override // android.view.View
    public void setId(int i9) {
        this.f14251a.remove(getId());
        super.setId(i9);
        this.f14251a.put(getId(), this);
    }

    public void setMaxHeight(int i9) {
        if (i9 == this.f14257h) {
            return;
        }
        this.f14257h = i9;
        requestLayout();
    }

    public void setMaxWidth(int i9) {
        if (i9 == this.f14256g) {
            return;
        }
        this.f14256g = i9;
        requestLayout();
    }

    public void setMinHeight(int i9) {
        if (i9 == this.f14255f) {
            return;
        }
        this.f14255f = i9;
        requestLayout();
    }

    public void setMinWidth(int i9) {
        if (i9 == this.f14254e) {
            return;
        }
        this.f14254e = i9;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC2994b abstractC2994b) {
        C2993a c2993a = this.f14261l;
        if (c2993a != null) {
            c2993a.c(abstractC2994b);
        }
    }

    public void setOptimizationLevel(int i9) {
        this.f14259j = i9;
        this.f14253d.b1(i9);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
