package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.commons.codec.binary.BaseNCodec;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;
import org.joda.time.DateTimeConstants;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParserException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import u.C2800a;
import v.AbstractC2859a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f14367d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static SparseIntArray f14368e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap f14369a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14370b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f14371c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f14373b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0164c f14374c = new C0164c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f14375d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final e f14376e = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap f14377f = new HashMap();

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f14375d;
            bVar.f14307d = bVar2.f14419h;
            bVar.f14309e = bVar2.f14421i;
            bVar.f14311f = bVar2.f14423j;
            bVar.f14313g = bVar2.f14425k;
            bVar.f14315h = bVar2.f14426l;
            bVar.f14317i = bVar2.f14427m;
            bVar.f14319j = bVar2.f14428n;
            bVar.f14321k = bVar2.f14429o;
            bVar.f14323l = bVar2.f14430p;
            bVar.f14331p = bVar2.f14431q;
            bVar.f14332q = bVar2.f14432r;
            bVar.f14333r = bVar2.f14433s;
            bVar.f14334s = bVar2.f14434t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f14382D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f14383E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f14384F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f14385G;
            bVar.f14339x = bVar2.f14393O;
            bVar.f14340y = bVar2.f14392N;
            bVar.f14336u = bVar2.f14389K;
            bVar.f14338w = bVar2.f14391M;
            bVar.f14341z = bVar2.f14435u;
            bVar.f14275A = bVar2.f14436v;
            bVar.f14325m = bVar2.f14438x;
            bVar.f14327n = bVar2.f14439y;
            bVar.f14329o = bVar2.f14440z;
            bVar.f14276B = bVar2.f14437w;
            bVar.f14291Q = bVar2.f14379A;
            bVar.f14292R = bVar2.f14380B;
            bVar.f14280F = bVar2.f14394P;
            bVar.f14279E = bVar2.f14395Q;
            bVar.f14282H = bVar2.f14397S;
            bVar.f14281G = bVar2.f14396R;
            bVar.f14294T = bVar2.f14420h0;
            bVar.f14295U = bVar2.f14422i0;
            bVar.f14283I = bVar2.f14398T;
            bVar.f14284J = bVar2.f14399U;
            bVar.f14287M = bVar2.f14400V;
            bVar.f14288N = bVar2.f14401W;
            bVar.f14285K = bVar2.f14402X;
            bVar.f14286L = bVar2.f14403Y;
            bVar.f14289O = bVar2.f14404Z;
            bVar.f14290P = bVar2.f14406a0;
            bVar.f14293S = bVar2.f14381C;
            bVar.f14305c = bVar2.f14417g;
            bVar.f14301a = bVar2.f14413e;
            bVar.f14303b = bVar2.f14415f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f14409c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f14411d;
            String str = bVar2.f14418g0;
            if (str != null) {
                bVar.f14296V = str;
            }
            bVar.setMarginStart(bVar2.f14387I);
            bVar.setMarginEnd(this.f14375d.f14386H);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f14375d.a(this.f14375d);
            aVar.f14374c.a(this.f14374c);
            aVar.f14373b.a(this.f14373b);
            aVar.f14376e.a(this.f14376e);
            aVar.f14372a = this.f14372a;
            return aVar;
        }

        public final void d(int i9, ConstraintLayout.b bVar) {
            this.f14372a = i9;
            b bVar2 = this.f14375d;
            bVar2.f14419h = bVar.f14307d;
            bVar2.f14421i = bVar.f14309e;
            bVar2.f14423j = bVar.f14311f;
            bVar2.f14425k = bVar.f14313g;
            bVar2.f14426l = bVar.f14315h;
            bVar2.f14427m = bVar.f14317i;
            bVar2.f14428n = bVar.f14319j;
            bVar2.f14429o = bVar.f14321k;
            bVar2.f14430p = bVar.f14323l;
            bVar2.f14431q = bVar.f14331p;
            bVar2.f14432r = bVar.f14332q;
            bVar2.f14433s = bVar.f14333r;
            bVar2.f14434t = bVar.f14334s;
            bVar2.f14435u = bVar.f14341z;
            bVar2.f14436v = bVar.f14275A;
            bVar2.f14437w = bVar.f14276B;
            bVar2.f14438x = bVar.f14325m;
            bVar2.f14439y = bVar.f14327n;
            bVar2.f14440z = bVar.f14329o;
            bVar2.f14379A = bVar.f14291Q;
            bVar2.f14380B = bVar.f14292R;
            bVar2.f14381C = bVar.f14293S;
            bVar2.f14417g = bVar.f14305c;
            bVar2.f14413e = bVar.f14301a;
            bVar2.f14415f = bVar.f14303b;
            bVar2.f14409c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f14411d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f14382D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f14383E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f14384F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f14385G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f14394P = bVar.f14280F;
            bVar2.f14395Q = bVar.f14279E;
            bVar2.f14397S = bVar.f14282H;
            bVar2.f14396R = bVar.f14281G;
            bVar2.f14420h0 = bVar.f14294T;
            bVar2.f14422i0 = bVar.f14295U;
            bVar2.f14398T = bVar.f14283I;
            bVar2.f14399U = bVar.f14284J;
            bVar2.f14400V = bVar.f14287M;
            bVar2.f14401W = bVar.f14288N;
            bVar2.f14402X = bVar.f14285K;
            bVar2.f14403Y = bVar.f14286L;
            bVar2.f14404Z = bVar.f14289O;
            bVar2.f14406a0 = bVar.f14290P;
            bVar2.f14418g0 = bVar.f14296V;
            bVar2.f14389K = bVar.f14336u;
            bVar2.f14391M = bVar.f14338w;
            bVar2.f14388J = bVar.f14335t;
            bVar2.f14390L = bVar.f14337v;
            bVar2.f14393O = bVar.f14339x;
            bVar2.f14392N = bVar.f14340y;
            bVar2.f14386H = bVar.getMarginEnd();
            this.f14375d.f14387I = bVar.getMarginStart();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public static SparseIntArray f14378k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14409c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14411d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f14414e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public String f14416f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public String f14418g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14405a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14407b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14413e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14415f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f14417g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14419h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f14421i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f14423j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f14425k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f14426l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f14427m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f14428n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f14429o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f14430p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f14431q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f14432r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f14433s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14434t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f14435u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f14436v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f14437w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f14438x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f14439y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f14440z = 0.0f;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f14379A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f14380B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f14381C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f14382D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f14383E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f14384F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f14385G = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f14386H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f14387I = -1;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f14388J = -1;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f14389K = -1;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f14390L = -1;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f14391M = -1;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f14392N = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f14393O = -1;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f14394P = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f14395Q = -1.0f;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f14396R = 0;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f14397S = 0;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f14398T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f14399U = 0;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f14400V = -1;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f14401W = -1;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f14402X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f14403Y = -1;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public float f14404Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f14406a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f14408b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f14410c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f14412d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f14420h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f14422i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f14424j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14378k0 = sparseIntArray;
            sparseIntArray.append(z.d.f52443q3, 24);
            f14378k0.append(z.d.f52449r3, 25);
            f14378k0.append(z.d.f52461t3, 28);
            f14378k0.append(z.d.f52467u3, 29);
            f14378k0.append(z.d.f52497z3, 35);
            f14378k0.append(z.d.f52491y3, 34);
            f14378k0.append(z.d.f52353b3, 4);
            f14378k0.append(z.d.f52347a3, 3);
            f14378k0.append(z.d.f52336Y2, 1);
            f14378k0.append(z.d.f52220E3, 6);
            f14378k0.append(z.d.f52226F3, 7);
            f14378k0.append(z.d.f52395i3, 17);
            f14378k0.append(z.d.f52401j3, 18);
            f14378k0.append(z.d.f52407k3, 19);
            f14378k0.append(z.d.f52249J2, 26);
            f14378k0.append(z.d.f52473v3, 31);
            f14378k0.append(z.d.f52479w3, 32);
            f14378k0.append(z.d.f52389h3, 10);
            f14378k0.append(z.d.f52383g3, 9);
            f14378k0.append(z.d.f52244I3, 13);
            f14378k0.append(z.d.f52262L3, 16);
            f14378k0.append(z.d.f52250J3, 14);
            f14378k0.append(z.d.f52232G3, 11);
            f14378k0.append(z.d.f52256K3, 15);
            f14378k0.append(z.d.f52238H3, 12);
            f14378k0.append(z.d.f52208C3, 38);
            f14378k0.append(z.d.f52431o3, 37);
            f14378k0.append(z.d.f52425n3, 39);
            f14378k0.append(z.d.f52202B3, 40);
            f14378k0.append(z.d.f52419m3, 20);
            f14378k0.append(z.d.f52196A3, 36);
            f14378k0.append(z.d.f52377f3, 5);
            f14378k0.append(z.d.f52437p3, 76);
            f14378k0.append(z.d.f52485x3, 76);
            f14378k0.append(z.d.f52455s3, 76);
            f14378k0.append(z.d.f52341Z2, 76);
            f14378k0.append(z.d.f52331X2, 76);
            f14378k0.append(z.d.f52267M2, 23);
            f14378k0.append(z.d.f52279O2, 27);
            f14378k0.append(z.d.f52291Q2, 30);
            f14378k0.append(z.d.f52297R2, 8);
            f14378k0.append(z.d.f52273N2, 33);
            f14378k0.append(z.d.f52285P2, 2);
            f14378k0.append(z.d.f52255K2, 22);
            f14378k0.append(z.d.f52261L2, 21);
            f14378k0.append(z.d.f52359c3, 61);
            f14378k0.append(z.d.f52371e3, 62);
            f14378k0.append(z.d.f52365d3, 63);
            f14378k0.append(z.d.f52214D3, 69);
            f14378k0.append(z.d.f52413l3, 70);
            f14378k0.append(z.d.f52321V2, 71);
            f14378k0.append(z.d.f52309T2, 72);
            f14378k0.append(z.d.f52315U2, 73);
            f14378k0.append(z.d.f52326W2, 74);
            f14378k0.append(z.d.f52303S2, 75);
        }

        public void a(b bVar) {
            this.f14405a = bVar.f14405a;
            this.f14409c = bVar.f14409c;
            this.f14407b = bVar.f14407b;
            this.f14411d = bVar.f14411d;
            this.f14413e = bVar.f14413e;
            this.f14415f = bVar.f14415f;
            this.f14417g = bVar.f14417g;
            this.f14419h = bVar.f14419h;
            this.f14421i = bVar.f14421i;
            this.f14423j = bVar.f14423j;
            this.f14425k = bVar.f14425k;
            this.f14426l = bVar.f14426l;
            this.f14427m = bVar.f14427m;
            this.f14428n = bVar.f14428n;
            this.f14429o = bVar.f14429o;
            this.f14430p = bVar.f14430p;
            this.f14431q = bVar.f14431q;
            this.f14432r = bVar.f14432r;
            this.f14433s = bVar.f14433s;
            this.f14434t = bVar.f14434t;
            this.f14435u = bVar.f14435u;
            this.f14436v = bVar.f14436v;
            this.f14437w = bVar.f14437w;
            this.f14438x = bVar.f14438x;
            this.f14439y = bVar.f14439y;
            this.f14440z = bVar.f14440z;
            this.f14379A = bVar.f14379A;
            this.f14380B = bVar.f14380B;
            this.f14381C = bVar.f14381C;
            this.f14382D = bVar.f14382D;
            this.f14383E = bVar.f14383E;
            this.f14384F = bVar.f14384F;
            this.f14385G = bVar.f14385G;
            this.f14386H = bVar.f14386H;
            this.f14387I = bVar.f14387I;
            this.f14388J = bVar.f14388J;
            this.f14389K = bVar.f14389K;
            this.f14390L = bVar.f14390L;
            this.f14391M = bVar.f14391M;
            this.f14392N = bVar.f14392N;
            this.f14393O = bVar.f14393O;
            this.f14394P = bVar.f14394P;
            this.f14395Q = bVar.f14395Q;
            this.f14396R = bVar.f14396R;
            this.f14397S = bVar.f14397S;
            this.f14398T = bVar.f14398T;
            this.f14399U = bVar.f14399U;
            this.f14400V = bVar.f14400V;
            this.f14401W = bVar.f14401W;
            this.f14402X = bVar.f14402X;
            this.f14403Y = bVar.f14403Y;
            this.f14404Z = bVar.f14404Z;
            this.f14406a0 = bVar.f14406a0;
            this.f14408b0 = bVar.f14408b0;
            this.f14410c0 = bVar.f14410c0;
            this.f14412d0 = bVar.f14412d0;
            this.f14418g0 = bVar.f14418g0;
            int[] iArr = bVar.f14414e0;
            if (iArr != null) {
                this.f14414e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f14414e0 = null;
            }
            this.f14416f0 = bVar.f14416f0;
            this.f14420h0 = bVar.f14420h0;
            this.f14422i0 = bVar.f14422i0;
            this.f14424j0 = bVar.f14424j0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f52243I2);
            this.f14407b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                int i10 = f14378k0.get(index);
                if (i10 == 80) {
                    this.f14420h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f14420h0);
                } else if (i10 != 81) {
                    switch (i10) {
                        case 1:
                            this.f14430p = c.n(typedArrayObtainStyledAttributes, index, this.f14430p);
                            break;
                        case 2:
                            this.f14385G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14385G);
                            break;
                        case 3:
                            this.f14429o = c.n(typedArrayObtainStyledAttributes, index, this.f14429o);
                            break;
                        case 4:
                            this.f14428n = c.n(typedArrayObtainStyledAttributes, index, this.f14428n);
                            break;
                        case 5:
                            this.f14437w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f14379A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14379A);
                            break;
                        case 7:
                            this.f14380B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14380B);
                            break;
                        case 8:
                            this.f14386H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14386H);
                            break;
                        case 9:
                            this.f14434t = c.n(typedArrayObtainStyledAttributes, index, this.f14434t);
                            break;
                        case 10:
                            this.f14433s = c.n(typedArrayObtainStyledAttributes, index, this.f14433s);
                            break;
                        case 11:
                            this.f14391M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14391M);
                            break;
                        case 12:
                            this.f14392N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14392N);
                            break;
                        case 13:
                            this.f14388J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14388J);
                            break;
                        case UrlRequest.Status.READING_RESPONSE /* 14 */:
                            this.f14390L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14390L);
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                            this.f14393O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14393O);
                            break;
                        case 16:
                            this.f14389K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14389K);
                            break;
                        case LangUtils.HASH_SEED /* 17 */:
                            this.f14413e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14413e);
                            break;
                        case 18:
                            this.f14415f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f14415f);
                            break;
                        case 19:
                            this.f14417g = typedArrayObtainStyledAttributes.getFloat(index, this.f14417g);
                            break;
                        case 20:
                            this.f14435u = typedArrayObtainStyledAttributes.getFloat(index, this.f14435u);
                            break;
                        case 21:
                            this.f14411d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f14411d);
                            break;
                        case 22:
                            this.f14409c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f14409c);
                            break;
                        case 23:
                            this.f14382D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14382D);
                            break;
                        case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                            this.f14419h = c.n(typedArrayObtainStyledAttributes, index, this.f14419h);
                            break;
                        case 25:
                            this.f14421i = c.n(typedArrayObtainStyledAttributes, index, this.f14421i);
                            break;
                        case 26:
                            this.f14381C = typedArrayObtainStyledAttributes.getInt(index, this.f14381C);
                            break;
                        case 27:
                            this.f14383E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14383E);
                            break;
                        case 28:
                            this.f14423j = c.n(typedArrayObtainStyledAttributes, index, this.f14423j);
                            break;
                        case 29:
                            this.f14425k = c.n(typedArrayObtainStyledAttributes, index, this.f14425k);
                            break;
                        case 30:
                            this.f14387I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14387I);
                            break;
                        case 31:
                            this.f14431q = c.n(typedArrayObtainStyledAttributes, index, this.f14431q);
                            break;
                        case 32:
                            this.f14432r = c.n(typedArrayObtainStyledAttributes, index, this.f14432r);
                            break;
                        case 33:
                            this.f14384F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14384F);
                            break;
                        case 34:
                            this.f14427m = c.n(typedArrayObtainStyledAttributes, index, this.f14427m);
                            break;
                        case 35:
                            this.f14426l = c.n(typedArrayObtainStyledAttributes, index, this.f14426l);
                            break;
                        case 36:
                            this.f14436v = typedArrayObtainStyledAttributes.getFloat(index, this.f14436v);
                            break;
                        case LangUtils.HASH_OFFSET /* 37 */:
                            this.f14395Q = typedArrayObtainStyledAttributes.getFloat(index, this.f14395Q);
                            break;
                        case 38:
                            this.f14394P = typedArrayObtainStyledAttributes.getFloat(index, this.f14394P);
                            break;
                        case 39:
                            this.f14396R = typedArrayObtainStyledAttributes.getInt(index, this.f14396R);
                            break;
                        case 40:
                            this.f14397S = typedArrayObtainStyledAttributes.getInt(index, this.f14397S);
                            break;
                        default:
                            switch (i10) {
                                case 54:
                                    this.f14398T = typedArrayObtainStyledAttributes.getInt(index, this.f14398T);
                                    break;
                                case 55:
                                    this.f14399U = typedArrayObtainStyledAttributes.getInt(index, this.f14399U);
                                    break;
                                case 56:
                                    this.f14400V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14400V);
                                    break;
                                case 57:
                                    this.f14401W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14401W);
                                    break;
                                case 58:
                                    this.f14402X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14402X);
                                    break;
                                case 59:
                                    this.f14403Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14403Y);
                                    break;
                                default:
                                    switch (i10) {
                                        case 61:
                                            this.f14438x = c.n(typedArrayObtainStyledAttributes, index, this.f14438x);
                                            break;
                                        case 62:
                                            this.f14439y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14439y);
                                            break;
                                        case 63:
                                            this.f14440z = typedArrayObtainStyledAttributes.getFloat(index, this.f14440z);
                                            break;
                                        default:
                                            switch (i10) {
                                                case 69:
                                                    this.f14404Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f14406a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.f14408b0 = typedArrayObtainStyledAttributes.getInt(index, this.f14408b0);
                                                    continue;
                                                case 73:
                                                    this.f14410c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f14410c0);
                                                    continue;
                                                case 74:
                                                    this.f14416f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f14424j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f14424j0);
                                                    continue;
                                                case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                                                    this.f14418g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb.append(str);
                                            sb.append(Integer.toHexString(index));
                                            sb.append("   ");
                                            sb.append(f14378k0.get(index));
                                            Log.w("ConstraintSet", sb.toString());
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f14422i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f14422i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.c$c, reason: collision with other inner class name */
    public static class C0164c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static SparseIntArray f14441h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14442a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14443b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f14444c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f14445d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f14446e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f14447f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f14448g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14441h = sparseIntArray;
            sparseIntArray.append(z.d.f52327W3, 1);
            f14441h.append(z.d.f52337Y3, 2);
            f14441h.append(z.d.f52342Z3, 3);
            f14441h.append(z.d.f52322V3, 4);
            f14441h.append(z.d.f52316U3, 5);
            f14441h.append(z.d.f52332X3, 6);
        }

        public void a(C0164c c0164c) {
            this.f14442a = c0164c.f14442a;
            this.f14443b = c0164c.f14443b;
            this.f14444c = c0164c.f14444c;
            this.f14445d = c0164c.f14445d;
            this.f14446e = c0164c.f14446e;
            this.f14448g = c0164c.f14448g;
            this.f14447f = c0164c.f14447f;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f52310T3);
            this.f14442a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                switch (f14441h.get(index)) {
                    case 1:
                        this.f14448g = typedArrayObtainStyledAttributes.getFloat(index, this.f14448g);
                        break;
                    case 2:
                        this.f14445d = typedArrayObtainStyledAttributes.getInt(index, this.f14445d);
                        break;
                    case 3:
                        this.f14444c = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : C2800a.f50876c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f14446e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f14443b = c.n(typedArrayObtainStyledAttributes, index, this.f14443b);
                        break;
                    case 6:
                        this.f14447f = typedArrayObtainStyledAttributes.getFloat(index, this.f14447f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14449a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14450b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f14451c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14452d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f14453e = Float.NaN;

        public void a(d dVar) {
            this.f14449a = dVar.f14449a;
            this.f14450b = dVar.f14450b;
            this.f14452d = dVar.f14452d;
            this.f14453e = dVar.f14453e;
            this.f14451c = dVar.f14451c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f52396i4);
            this.f14449a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == z.d.f52408k4) {
                    this.f14452d = typedArrayObtainStyledAttributes.getFloat(index, this.f14452d);
                } else if (index == z.d.f52402j4) {
                    this.f14450b = typedArrayObtainStyledAttributes.getInt(index, this.f14450b);
                    this.f14450b = c.f14367d[this.f14450b];
                } else if (index == z.d.f52420m4) {
                    this.f14451c = typedArrayObtainStyledAttributes.getInt(index, this.f14451c);
                } else if (index == z.d.f52414l4) {
                    this.f14453e = typedArrayObtainStyledAttributes.getFloat(index, this.f14453e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static SparseIntArray f14454n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14455a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f14456b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14457c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14458d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f14459e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f14460f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f14461g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f14462h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f14463i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f14464j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f14465k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f14466l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f14467m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f14454n = sparseIntArray;
            sparseIntArray.append(z.d.f52233G4, 1);
            f14454n.append(z.d.f52239H4, 2);
            f14454n.append(z.d.f52245I4, 3);
            f14454n.append(z.d.f52221E4, 4);
            f14454n.append(z.d.f52227F4, 5);
            f14454n.append(z.d.f52197A4, 6);
            f14454n.append(z.d.f52203B4, 7);
            f14454n.append(z.d.f52209C4, 8);
            f14454n.append(z.d.f52215D4, 9);
            f14454n.append(z.d.f52251J4, 10);
            f14454n.append(z.d.f52257K4, 11);
        }

        public void a(e eVar) {
            this.f14455a = eVar.f14455a;
            this.f14456b = eVar.f14456b;
            this.f14457c = eVar.f14457c;
            this.f14458d = eVar.f14458d;
            this.f14459e = eVar.f14459e;
            this.f14460f = eVar.f14460f;
            this.f14461g = eVar.f14461g;
            this.f14462h = eVar.f14462h;
            this.f14463i = eVar.f14463i;
            this.f14464j = eVar.f14464j;
            this.f14465k = eVar.f14465k;
            this.f14466l = eVar.f14466l;
            this.f14467m = eVar.f14467m;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f52498z4);
            this.f14455a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                switch (f14454n.get(index)) {
                    case 1:
                        this.f14456b = typedArrayObtainStyledAttributes.getFloat(index, this.f14456b);
                        break;
                    case 2:
                        this.f14457c = typedArrayObtainStyledAttributes.getFloat(index, this.f14457c);
                        break;
                    case 3:
                        this.f14458d = typedArrayObtainStyledAttributes.getFloat(index, this.f14458d);
                        break;
                    case 4:
                        this.f14459e = typedArrayObtainStyledAttributes.getFloat(index, this.f14459e);
                        break;
                    case 5:
                        this.f14460f = typedArrayObtainStyledAttributes.getFloat(index, this.f14460f);
                        break;
                    case 6:
                        this.f14461g = typedArrayObtainStyledAttributes.getDimension(index, this.f14461g);
                        break;
                    case 7:
                        this.f14462h = typedArrayObtainStyledAttributes.getDimension(index, this.f14462h);
                        break;
                    case 8:
                        this.f14463i = typedArrayObtainStyledAttributes.getDimension(index, this.f14463i);
                        break;
                    case 9:
                        this.f14464j = typedArrayObtainStyledAttributes.getDimension(index, this.f14464j);
                        break;
                    case 10:
                        this.f14465k = typedArrayObtainStyledAttributes.getDimension(index, this.f14465k);
                        break;
                    case 11:
                        this.f14466l = true;
                        this.f14467m = typedArrayObtainStyledAttributes.getDimension(index, this.f14467m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f14368e = sparseIntArray;
        sparseIntArray.append(z.d.f52464u0, 25);
        f14368e.append(z.d.f52470v0, 26);
        f14368e.append(z.d.f52482x0, 29);
        f14368e.append(z.d.f52488y0, 30);
        f14368e.append(z.d.f52217E0, 36);
        f14368e.append(z.d.f52211D0, 35);
        f14368e.append(z.d.f52356c0, 4);
        f14368e.append(z.d.f52350b0, 3);
        f14368e.append(z.d.f52338Z, 1);
        f14368e.append(z.d.f52265M0, 6);
        f14368e.append(z.d.f52271N0, 7);
        f14368e.append(z.d.f52398j0, 17);
        f14368e.append(z.d.f52404k0, 18);
        f14368e.append(z.d.f52410l0, 19);
        f14368e.append(z.d.f52451s, 27);
        f14368e.append(z.d.f52494z0, 32);
        f14368e.append(z.d.f52193A0, 33);
        f14368e.append(z.d.f52392i0, 10);
        f14368e.append(z.d.f52386h0, 9);
        f14368e.append(z.d.f52289Q0, 13);
        f14368e.append(z.d.f52307T0, 16);
        f14368e.append(z.d.f52295R0, 14);
        f14368e.append(z.d.f52277O0, 11);
        f14368e.append(z.d.f52301S0, 15);
        f14368e.append(z.d.f52283P0, 12);
        f14368e.append(z.d.f52235H0, 40);
        f14368e.append(z.d.f52452s0, 39);
        f14368e.append(z.d.f52446r0, 41);
        f14368e.append(z.d.f52229G0, 42);
        f14368e.append(z.d.f52440q0, 20);
        f14368e.append(z.d.f52223F0, 37);
        f14368e.append(z.d.f52380g0, 5);
        f14368e.append(z.d.f52458t0, 82);
        f14368e.append(z.d.f52205C0, 82);
        f14368e.append(z.d.f52476w0, 82);
        f14368e.append(z.d.f52344a0, 82);
        f14368e.append(z.d.f52333Y, 82);
        f14368e.append(z.d.f52481x, 24);
        f14368e.append(z.d.f52493z, 28);
        f14368e.append(z.d.f52258L, 31);
        f14368e.append(z.d.f52264M, 8);
        f14368e.append(z.d.f52487y, 34);
        f14368e.append(z.d.f52192A, 2);
        f14368e.append(z.d.f52469v, 23);
        f14368e.append(z.d.f52475w, 21);
        f14368e.append(z.d.f52463u, 22);
        f14368e.append(z.d.f52198B, 43);
        f14368e.append(z.d.f52276O, 44);
        f14368e.append(z.d.f52246J, 45);
        f14368e.append(z.d.f52252K, 46);
        f14368e.append(z.d.f52240I, 60);
        f14368e.append(z.d.f52228G, 47);
        f14368e.append(z.d.f52234H, 48);
        f14368e.append(z.d.f52204C, 49);
        f14368e.append(z.d.f52210D, 50);
        f14368e.append(z.d.f52216E, 51);
        f14368e.append(z.d.f52222F, 52);
        f14368e.append(z.d.f52270N, 53);
        f14368e.append(z.d.f52241I0, 54);
        f14368e.append(z.d.f52416m0, 55);
        f14368e.append(z.d.f52247J0, 56);
        f14368e.append(z.d.f52422n0, 57);
        f14368e.append(z.d.f52253K0, 58);
        f14368e.append(z.d.f52428o0, 59);
        f14368e.append(z.d.f52362d0, 61);
        f14368e.append(z.d.f52374f0, 62);
        f14368e.append(z.d.f52368e0, 63);
        f14368e.append(z.d.f52282P, 64);
        f14368e.append(z.d.f52329X0, 65);
        f14368e.append(z.d.f52318V, 66);
        f14368e.append(z.d.f52334Y0, 67);
        f14368e.append(z.d.f52319V0, 79);
        f14368e.append(z.d.f52457t, 38);
        f14368e.append(z.d.f52313U0, 68);
        f14368e.append(z.d.f52259L0, 69);
        f14368e.append(z.d.f52434p0, 70);
        f14368e.append(z.d.f52306T, 71);
        f14368e.append(z.d.f52294R, 72);
        f14368e.append(z.d.f52300S, 73);
        f14368e.append(z.d.f52312U, 74);
        f14368e.append(z.d.f52288Q, 75);
        f14368e.append(z.d.f52324W0, 76);
        f14368e.append(z.d.f52199B0, 77);
        f14368e.append(z.d.f52339Z0, 78);
        f14368e.append(z.d.f52328X, 80);
        f14368e.append(z.d.f52323W, 81);
    }

    public static int n(TypedArray typedArray, int i9, int i10) {
        int resourceId = typedArray.getResourceId(i9, i10);
        return resourceId == -1 ? typedArray.getInt(i9, -1) : resourceId;
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void d(ConstraintLayout constraintLayout, boolean z9) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f14371c.keySet());
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = constraintLayout.getChildAt(i9);
            int id = childAt.getId();
            if (!this.f14371c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + AbstractC2859a.a(childAt));
            } else {
                if (this.f14370b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f14371c.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f14371c.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            aVar.f14375d.f14412d0 = 1;
                        }
                        int i10 = aVar.f14375d.f14412d0;
                        if (i10 != -1 && i10 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f14375d.f14408b0);
                            barrier.setMargin(aVar.f14375d.f14410c0);
                            barrier.setAllowsGoneWidget(aVar.f14375d.f14424j0);
                            b bVar = aVar.f14375d;
                            int[] iArr = bVar.f14414e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f14416f0;
                                if (str != null) {
                                    bVar.f14414e0 = i(barrier, str);
                                    barrier.setReferencedIds(aVar.f14375d.f14414e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z9) {
                            androidx.constraintlayout.widget.a.c(childAt, aVar.f14377f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f14373b;
                        if (dVar.f14451c == 0) {
                            childAt.setVisibility(dVar.f14450b);
                        }
                        childAt.setAlpha(aVar.f14373b.f14452d);
                        childAt.setRotation(aVar.f14376e.f14456b);
                        childAt.setRotationX(aVar.f14376e.f14457c);
                        childAt.setRotationY(aVar.f14376e.f14458d);
                        childAt.setScaleX(aVar.f14376e.f14459e);
                        childAt.setScaleY(aVar.f14376e.f14460f);
                        if (!Float.isNaN(aVar.f14376e.f14461g)) {
                            childAt.setPivotX(aVar.f14376e.f14461g);
                        }
                        if (!Float.isNaN(aVar.f14376e.f14462h)) {
                            childAt.setPivotY(aVar.f14376e.f14462h);
                        }
                        childAt.setTranslationX(aVar.f14376e.f14463i);
                        childAt.setTranslationY(aVar.f14376e.f14464j);
                        childAt.setTranslationZ(aVar.f14376e.f14465k);
                        e eVar = aVar.f14376e;
                        if (eVar.f14466l) {
                            childAt.setElevation(eVar.f14467m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.f14371c.get(num);
            int i11 = aVar2.f14375d.f14412d0;
            if (i11 != -1 && i11 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f14375d;
                int[] iArr2 = bVar3.f14414e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f14416f0;
                    if (str2 != null) {
                        bVar3.f14414e0 = i(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f14375d.f14414e0);
                    }
                }
                barrier2.setType(aVar2.f14375d.f14408b0);
                barrier2.setMargin(aVar2.f14375d.f14410c0);
                ConstraintLayout.b bVarD = constraintLayout.generateDefaultLayoutParams();
                barrier2.k();
                aVar2.b(bVarD);
                constraintLayout.addView(barrier2, bVarD);
            }
            if (aVar2.f14375d.f14405a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b bVarD2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.b(bVarD2);
                constraintLayout.addView(guideline, bVarD2);
            }
        }
    }

    public void e(int i9, int i10) {
        if (this.f14371c.containsKey(Integer.valueOf(i9))) {
            a aVar = (a) this.f14371c.get(Integer.valueOf(i9));
            switch (i10) {
                case 1:
                    b bVar = aVar.f14375d;
                    bVar.f14421i = -1;
                    bVar.f14419h = -1;
                    bVar.f14382D = -1;
                    bVar.f14388J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f14375d;
                    bVar2.f14425k = -1;
                    bVar2.f14423j = -1;
                    bVar2.f14383E = -1;
                    bVar2.f14390L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f14375d;
                    bVar3.f14427m = -1;
                    bVar3.f14426l = -1;
                    bVar3.f14384F = -1;
                    bVar3.f14389K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f14375d;
                    bVar4.f14428n = -1;
                    bVar4.f14429o = -1;
                    bVar4.f14385G = -1;
                    bVar4.f14391M = -1;
                    return;
                case 5:
                    aVar.f14375d.f14430p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f14375d;
                    bVar5.f14431q = -1;
                    bVar5.f14432r = -1;
                    bVar5.f14387I = -1;
                    bVar5.f14393O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f14375d;
                    bVar6.f14433s = -1;
                    bVar6.f14434t = -1;
                    bVar6.f14386H = -1;
                    bVar6.f14392N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void f(Context context, int i9) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i9, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f14371c.clear();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = constraintLayout.getChildAt(i9);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f14370b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f14371c.containsKey(Integer.valueOf(id))) {
                this.f14371c.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f14371c.get(Integer.valueOf(id));
            aVar.f14377f = androidx.constraintlayout.widget.a.a(this.f14369a, childAt);
            aVar.d(id, bVar);
            aVar.f14373b.f14450b = childAt.getVisibility();
            aVar.f14373b.f14452d = childAt.getAlpha();
            aVar.f14376e.f14456b = childAt.getRotation();
            aVar.f14376e.f14457c = childAt.getRotationX();
            aVar.f14376e.f14458d = childAt.getRotationY();
            aVar.f14376e.f14459e = childAt.getScaleX();
            aVar.f14376e.f14460f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                e eVar = aVar.f14376e;
                eVar.f14461g = pivotX;
                eVar.f14462h = pivotY;
            }
            aVar.f14376e.f14463i = childAt.getTranslationX();
            aVar.f14376e.f14464j = childAt.getTranslationY();
            aVar.f14376e.f14465k = childAt.getTranslationZ();
            e eVar2 = aVar.f14376e;
            if (eVar2.f14466l) {
                eVar2.f14467m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                aVar.f14375d.f14424j0 = barrier.l();
                aVar.f14375d.f14414e0 = barrier.getReferencedIds();
                aVar.f14375d.f14408b0 = barrier.getType();
                aVar.f14375d.f14410c0 = barrier.getMargin();
            }
        }
    }

    public void h(int i9, int i10, int i11, float f9) {
        b bVar = k(i9).f14375d;
        bVar.f14438x = i10;
        bVar.f14439y = i11;
        bVar.f14440z = f9;
    }

    public final int[] i(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i9 = 0;
        int i10 = 0;
        while (i9 < strArrSplit.length) {
            String strTrim = strArrSplit[i9].trim();
            try {
                iIntValue = z.c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, Name.MARK, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i10] = iIntValue;
            i9++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public final a j(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z.d.f52445r);
        o(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public final a k(int i9) {
        if (!this.f14371c.containsKey(Integer.valueOf(i9))) {
            this.f14371c.put(Integer.valueOf(i9), new a());
        }
        return (a) this.f14371c.get(Integer.valueOf(i9));
    }

    public void l(Context context, int i9) {
        XmlResourceParser xml = context.getResources().getXml(i9);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarJ = j(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarJ.f14375d.f14405a = true;
                    }
                    this.f14371c.put(Integer.valueOf(aVarJ.f14372a), aVarJ);
                }
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.m(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void o(Context context, a aVar, TypedArray typedArray) {
        C0164c c0164c;
        String string;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = typedArray.getIndex(i9);
            if (index != z.d.f52457t && z.d.f52258L != index && z.d.f52264M != index) {
                aVar.f14374c.f14442a = true;
                aVar.f14375d.f14407b = true;
                aVar.f14373b.f14449a = true;
                aVar.f14376e.f14455a = true;
            }
            switch (f14368e.get(index)) {
                case 1:
                    b bVar = aVar.f14375d;
                    bVar.f14430p = n(typedArray, index, bVar.f14430p);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.f14375d;
                    bVar2.f14385G = typedArray.getDimensionPixelSize(index, bVar2.f14385G);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.f14375d;
                    bVar3.f14429o = n(typedArray, index, bVar3.f14429o);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.f14375d;
                    bVar4.f14428n = n(typedArray, index, bVar4.f14428n);
                    continue;
                    break;
                case 5:
                    aVar.f14375d.f14437w = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.f14375d;
                    bVar5.f14379A = typedArray.getDimensionPixelOffset(index, bVar5.f14379A);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.f14375d;
                    bVar6.f14380B = typedArray.getDimensionPixelOffset(index, bVar6.f14380B);
                    continue;
                    break;
                case 8:
                    b bVar7 = aVar.f14375d;
                    bVar7.f14386H = typedArray.getDimensionPixelSize(index, bVar7.f14386H);
                    continue;
                    break;
                case 9:
                    b bVar8 = aVar.f14375d;
                    bVar8.f14434t = n(typedArray, index, bVar8.f14434t);
                    continue;
                    break;
                case 10:
                    b bVar9 = aVar.f14375d;
                    bVar9.f14433s = n(typedArray, index, bVar9.f14433s);
                    continue;
                    break;
                case 11:
                    b bVar10 = aVar.f14375d;
                    bVar10.f14391M = typedArray.getDimensionPixelSize(index, bVar10.f14391M);
                    continue;
                    break;
                case 12:
                    b bVar11 = aVar.f14375d;
                    bVar11.f14392N = typedArray.getDimensionPixelSize(index, bVar11.f14392N);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.f14375d;
                    bVar12.f14388J = typedArray.getDimensionPixelSize(index, bVar12.f14388J);
                    continue;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    b bVar13 = aVar.f14375d;
                    bVar13.f14390L = typedArray.getDimensionPixelSize(index, bVar13.f14390L);
                    continue;
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    b bVar14 = aVar.f14375d;
                    bVar14.f14393O = typedArray.getDimensionPixelSize(index, bVar14.f14393O);
                    continue;
                    break;
                case 16:
                    b bVar15 = aVar.f14375d;
                    bVar15.f14389K = typedArray.getDimensionPixelSize(index, bVar15.f14389K);
                    continue;
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    b bVar16 = aVar.f14375d;
                    bVar16.f14413e = typedArray.getDimensionPixelOffset(index, bVar16.f14413e);
                    continue;
                    break;
                case 18:
                    b bVar17 = aVar.f14375d;
                    bVar17.f14415f = typedArray.getDimensionPixelOffset(index, bVar17.f14415f);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.f14375d;
                    bVar18.f14417g = typedArray.getFloat(index, bVar18.f14417g);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.f14375d;
                    bVar19.f14435u = typedArray.getFloat(index, bVar19.f14435u);
                    continue;
                    break;
                case 21:
                    b bVar20 = aVar.f14375d;
                    bVar20.f14411d = typedArray.getLayoutDimension(index, bVar20.f14411d);
                    continue;
                    break;
                case 22:
                    d dVar = aVar.f14373b;
                    dVar.f14450b = typedArray.getInt(index, dVar.f14450b);
                    d dVar2 = aVar.f14373b;
                    dVar2.f14450b = f14367d[dVar2.f14450b];
                    continue;
                    break;
                case 23:
                    b bVar21 = aVar.f14375d;
                    bVar21.f14409c = typedArray.getLayoutDimension(index, bVar21.f14409c);
                    continue;
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    b bVar22 = aVar.f14375d;
                    bVar22.f14382D = typedArray.getDimensionPixelSize(index, bVar22.f14382D);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.f14375d;
                    bVar23.f14419h = n(typedArray, index, bVar23.f14419h);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.f14375d;
                    bVar24.f14421i = n(typedArray, index, bVar24.f14421i);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.f14375d;
                    bVar25.f14381C = typedArray.getInt(index, bVar25.f14381C);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.f14375d;
                    bVar26.f14383E = typedArray.getDimensionPixelSize(index, bVar26.f14383E);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.f14375d;
                    bVar27.f14423j = n(typedArray, index, bVar27.f14423j);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.f14375d;
                    bVar28.f14425k = n(typedArray, index, bVar28.f14425k);
                    continue;
                    break;
                case 31:
                    b bVar29 = aVar.f14375d;
                    bVar29.f14387I = typedArray.getDimensionPixelSize(index, bVar29.f14387I);
                    continue;
                    break;
                case 32:
                    b bVar30 = aVar.f14375d;
                    bVar30.f14431q = n(typedArray, index, bVar30.f14431q);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.f14375d;
                    bVar31.f14432r = n(typedArray, index, bVar31.f14432r);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.f14375d;
                    bVar32.f14384F = typedArray.getDimensionPixelSize(index, bVar32.f14384F);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.f14375d;
                    bVar33.f14427m = n(typedArray, index, bVar33.f14427m);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.f14375d;
                    bVar34.f14426l = n(typedArray, index, bVar34.f14426l);
                    continue;
                    break;
                case LangUtils.HASH_OFFSET /* 37 */:
                    b bVar35 = aVar.f14375d;
                    bVar35.f14436v = typedArray.getFloat(index, bVar35.f14436v);
                    continue;
                    break;
                case 38:
                    aVar.f14372a = typedArray.getResourceId(index, aVar.f14372a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.f14375d;
                    bVar36.f14395Q = typedArray.getFloat(index, bVar36.f14395Q);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.f14375d;
                    bVar37.f14394P = typedArray.getFloat(index, bVar37.f14394P);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.f14375d;
                    bVar38.f14396R = typedArray.getInt(index, bVar38.f14396R);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.f14375d;
                    bVar39.f14397S = typedArray.getInt(index, bVar39.f14397S);
                    continue;
                    break;
                case 43:
                    d dVar3 = aVar.f14373b;
                    dVar3.f14452d = typedArray.getFloat(index, dVar3.f14452d);
                    continue;
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_CAVLC_444 /* 44 */:
                    e eVar = aVar.f14376e;
                    eVar.f14466l = true;
                    eVar.f14467m = typedArray.getDimension(index, eVar.f14467m);
                    continue;
                    break;
                case 45:
                    e eVar2 = aVar.f14376e;
                    eVar2.f14457c = typedArray.getFloat(index, eVar2.f14457c);
                    continue;
                    break;
                case 46:
                    e eVar3 = aVar.f14376e;
                    eVar3.f14458d = typedArray.getFloat(index, eVar3.f14458d);
                    continue;
                    break;
                case 47:
                    e eVar4 = aVar.f14376e;
                    eVar4.f14459e = typedArray.getFloat(index, eVar4.f14459e);
                    continue;
                    break;
                case 48:
                    e eVar5 = aVar.f14376e;
                    eVar5.f14460f = typedArray.getFloat(index, eVar5.f14460f);
                    continue;
                    break;
                case 49:
                    e eVar6 = aVar.f14376e;
                    eVar6.f14461g = typedArray.getDimension(index, eVar6.f14461g);
                    continue;
                    break;
                case 50:
                    e eVar7 = aVar.f14376e;
                    eVar7.f14462h = typedArray.getDimension(index, eVar7.f14462h);
                    continue;
                    break;
                case 51:
                    e eVar8 = aVar.f14376e;
                    eVar8.f14463i = typedArray.getDimension(index, eVar8.f14463i);
                    continue;
                    break;
                case 52:
                    e eVar9 = aVar.f14376e;
                    eVar9.f14464j = typedArray.getDimension(index, eVar9.f14464j);
                    continue;
                    break;
                case 53:
                    e eVar10 = aVar.f14376e;
                    eVar10.f14465k = typedArray.getDimension(index, eVar10.f14465k);
                    continue;
                    break;
                case 54:
                    b bVar40 = aVar.f14375d;
                    bVar40.f14398T = typedArray.getInt(index, bVar40.f14398T);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.f14375d;
                    bVar41.f14399U = typedArray.getInt(index, bVar41.f14399U);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.f14375d;
                    bVar42.f14400V = typedArray.getDimensionPixelSize(index, bVar42.f14400V);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.f14375d;
                    bVar43.f14401W = typedArray.getDimensionPixelSize(index, bVar43.f14401W);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.f14375d;
                    bVar44.f14402X = typedArray.getDimensionPixelSize(index, bVar44.f14402X);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.f14375d;
                    bVar45.f14403Y = typedArray.getDimensionPixelSize(index, bVar45.f14403Y);
                    continue;
                    break;
                case 60:
                    e eVar11 = aVar.f14376e;
                    eVar11.f14456b = typedArray.getFloat(index, eVar11.f14456b);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.f14375d;
                    bVar46.f14438x = n(typedArray, index, bVar46.f14438x);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.f14375d;
                    bVar47.f14439y = typedArray.getDimensionPixelSize(index, bVar47.f14439y);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.f14375d;
                    bVar48.f14440z = typedArray.getFloat(index, bVar48.f14440z);
                    continue;
                    break;
                case 64:
                    C0164c c0164c2 = aVar.f14374c;
                    c0164c2.f14443b = n(typedArray, index, c0164c2.f14443b);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0164c = aVar.f14374c;
                        string = typedArray.getString(index);
                    } else {
                        c0164c = aVar.f14374c;
                        string = C2800a.f50876c[typedArray.getInteger(index, 0)];
                    }
                    c0164c.f14444c = string;
                    continue;
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_BASELINE /* 66 */:
                    aVar.f14374c.f14446e = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    C0164c c0164c3 = aVar.f14374c;
                    c0164c3.f14448g = typedArray.getFloat(index, c0164c3.f14448g);
                    continue;
                    break;
                case 68:
                    d dVar4 = aVar.f14373b;
                    dVar4.f14453e = typedArray.getFloat(index, dVar4.f14453e);
                    continue;
                    break;
                case 69:
                    aVar.f14375d.f14404Z = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f14375d.f14406a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.f14375d;
                    bVar49.f14408b0 = typedArray.getInt(index, bVar49.f14408b0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.f14375d;
                    bVar50.f14410c0 = typedArray.getDimensionPixelSize(index, bVar50.f14410c0);
                    continue;
                    break;
                case 74:
                    aVar.f14375d.f14416f0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.f14375d;
                    bVar51.f14424j0 = typedArray.getBoolean(index, bVar51.f14424j0);
                    continue;
                    break;
                case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                    C0164c c0164c4 = aVar.f14374c;
                    c0164c4.f14445d = typedArray.getInt(index, c0164c4.f14445d);
                    continue;
                    break;
                case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                    aVar.f14375d.f14418g0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    d dVar5 = aVar.f14373b;
                    dVar5.f14451c = typedArray.getInt(index, dVar5.f14451c);
                    continue;
                    break;
                case 79:
                    C0164c c0164c5 = aVar.f14374c;
                    c0164c5.f14447f = typedArray.getFloat(index, c0164c5.f14447f);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.f14375d;
                    bVar52.f14420h0 = typedArray.getBoolean(index, bVar52.f14420h0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.f14375d;
                    bVar53.f14422i0 = typedArray.getBoolean(index, bVar53.f14422i0);
                    continue;
                    break;
                case 82:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f14368e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }
}
