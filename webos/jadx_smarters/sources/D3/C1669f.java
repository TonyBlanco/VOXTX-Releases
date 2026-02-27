package d3;

import android.net.Uri;
import d4.AbstractC1706x;
import d4.Z;
import e3.C1734b;
import f3.C1766b;
import h3.C1854c;
import i3.C1884a;
import j3.C2093e;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.C2143f;
import l3.C2182g;
import l3.C2186k;
import n3.C2246A;
import n3.C2249b;
import n3.C2252e;
import n3.C2255h;
import n3.C2257j;
import n3.H;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: d3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1669f implements InterfaceC1678o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f39580o = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f39581p = new a(new a.InterfaceC0313a() { // from class: d3.d
        @Override // d3.C1669f.a.InterfaceC0313a
        public final Constructor a() {
            return C1669f.f();
        }
    });

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f39582q = new a(new a.InterfaceC0313a() { // from class: d3.e
        @Override // d3.C1669f.a.InterfaceC0313a
        public final Constructor a() {
            return C1669f.g();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f39586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39591j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f39593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC2743y f39594m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f39592k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39595n = 112800;

    /* JADX INFO: renamed from: d3.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0313a f39596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f39597b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Constructor f39598c;

        /* JADX INFO: renamed from: d3.f$a$a, reason: collision with other inner class name */
        public interface InterfaceC0313a {
            Constructor a();
        }

        public a(InterfaceC0313a interfaceC0313a) {
            this.f39596a = interfaceC0313a;
        }

        public InterfaceC1672i a(Object... objArr) {
            Constructor constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return (InterfaceC1672i) constructorB.newInstance(objArr);
            } catch (Exception e9) {
                throw new IllegalStateException("Unexpected error creating extractor", e9);
            }
        }

        public final Constructor b() {
            synchronized (this.f39597b) {
                if (this.f39597b.get()) {
                    return this.f39598c;
                }
                try {
                    return this.f39596a.a();
                } catch (ClassNotFoundException unused) {
                    this.f39597b.set(true);
                    return this.f39598c;
                } catch (Exception e9) {
                    throw new RuntimeException("Error instantiating extension", e9);
                }
            }
        }
    }

    public static Constructor f() {
        Boolean bool = Boolean.TRUE;
        AbstractC1706x abstractC1706x = com.google.android.exoplayer2.ext.flac.h.f25360a;
        if (!bool.equals(com.google.android.exoplayer2.ext.flac.h.class.getMethod("isAvailable", null).invoke(null, null))) {
            return null;
        }
        InterfaceC1678o interfaceC1678o = com.google.android.exoplayer2.ext.flac.g.f25347k;
        return com.google.android.exoplayer2.ext.flac.g.class.asSubclass(InterfaceC1672i.class).getConstructor(Integer.TYPE);
    }

    public static Constructor g() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(InterfaceC1672i.class).getConstructor(null);
    }

    @Override // d3.InterfaceC1678o
    public synchronized InterfaceC1672i[] a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f39580o;
            arrayList = new ArrayList(iArr.length);
            int iB = d4.r.b(map);
            if (iB != -1) {
                e(iB, arrayList);
            }
            int iC = d4.r.c(uri);
            if (iC != -1 && iC != iB) {
                e(iC, arrayList);
            }
            for (int i9 : iArr) {
                if (i9 != iB && i9 != iC) {
                    e(i9, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC1672i[]) arrayList.toArray(new InterfaceC1672i[arrayList.size()]);
    }

    @Override // d3.InterfaceC1678o
    public synchronized InterfaceC1672i[] b() {
        return a(Uri.EMPTY, new HashMap());
    }

    public final void e(int i9, List list) {
        InterfaceC1672i c2249b;
        switch (i9) {
            case 0:
                c2249b = new C2249b();
                break;
            case 1:
                c2249b = new C2252e();
                break;
            case 2:
                c2249b = new C2255h((this.f39584c ? 2 : 0) | this.f39585d | (this.f39583b ? 1 : 0));
                break;
            case 3:
                c2249b = new C1734b((this.f39584c ? 2 : 0) | this.f39586e | (this.f39583b ? 1 : 0));
                break;
            case 4:
                c2249b = f39581p.a(Integer.valueOf(this.f39587f));
                if (c2249b == null) {
                    c2249b = new g3.c(this.f39587f);
                }
                break;
            case 5:
                c2249b = new C1854c();
                break;
            case 6:
                c2249b = new C2093e(this.f39588g);
                break;
            case 7:
                c2249b = new C2143f((this.f39584c ? 2 : 0) | this.f39591j | (this.f39583b ? 1 : 0));
                break;
            case 8:
                list.add(new C2182g(this.f39590i));
                c2249b = new C2186k(this.f39589h);
                break;
            case 9:
                c2249b = new m3.d();
                break;
            case 10:
                c2249b = new C2246A();
                break;
            case 11:
                if (this.f39594m == null) {
                    this.f39594m = AbstractC2743y.z();
                }
                c2249b = new H(this.f39592k, new Z(0L), new C2257j(this.f39593l, this.f39594m), this.f39595n);
                break;
            case 12:
                c2249b = new o3.b();
                break;
            case 13:
            default:
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                c2249b = new C1884a();
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                c2249b = f39582q.a(new Object[0]);
                if (c2249b == null) {
                    return;
                }
                break;
            case 16:
                c2249b = new C1766b();
                break;
        }
        list.add(c2249b);
    }
}
