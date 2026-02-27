package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1133s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1133s f14755d = new C1133s(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f14756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14758c;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f14760b;

        static {
            int[] iArr = new int[r0.b.values().length];
            f14760b = iArr;
            try {
                iArr[r0.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14760b[r0.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14760b[r0.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14760b[r0.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14760b[r0.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14760b[r0.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14760b[r0.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14760b[r0.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14760b[r0.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14760b[r0.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14760b[r0.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14760b[r0.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14760b[r0.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14760b[r0.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14760b[r0.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14760b[r0.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14760b[r0.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14760b[r0.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r0.c.values().length];
            f14759a = iArr2;
            try {
                iArr2[r0.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14759a[r0.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14759a[r0.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f14759a[r0.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f14759a[r0.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f14759a[r0.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f14759a[r0.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f14759a[r0.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f14759a[r0.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        int getNumber();

        boolean isPacked();

        boolean k();

        r0.b m();
    }

    public C1133s() {
        this.f14756a = h0.s(16);
    }

    public C1133s(h0 h0Var) {
        this.f14756a = h0Var;
        o();
    }

    public C1133s(boolean z9) {
        this(h0.s(0));
        o();
    }

    public static int b(r0.b bVar, int i9, Object obj) {
        int iP = AbstractC1125j.P(i9);
        if (bVar == r0.b.GROUP) {
            iP *= 2;
        }
        return iP + c(bVar, obj);
    }

    public static int c(r0.b bVar, Object obj) {
        switch (a.f14760b[bVar.ordinal()]) {
            case 1:
                return AbstractC1125j.i(((Double) obj).doubleValue());
            case 2:
                return AbstractC1125j.q(((Float) obj).floatValue());
            case 3:
                return AbstractC1125j.x(((Long) obj).longValue());
            case 4:
                return AbstractC1125j.T(((Long) obj).longValue());
            case 5:
                return AbstractC1125j.v(((Integer) obj).intValue());
            case 6:
                return AbstractC1125j.o(((Long) obj).longValue());
            case 7:
                return AbstractC1125j.m(((Integer) obj).intValue());
            case 8:
                return AbstractC1125j.d(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC1125j.s((O) obj);
            case 10:
                return AbstractC1125j.A((O) obj);
            case 11:
                return obj instanceof AbstractC1122g ? AbstractC1125j.g((AbstractC1122g) obj) : AbstractC1125j.O((String) obj);
            case 12:
                return obj instanceof AbstractC1122g ? AbstractC1125j.g((AbstractC1122g) obj) : AbstractC1125j.e((byte[]) obj);
            case 13:
                return AbstractC1125j.R(((Integer) obj).intValue());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return AbstractC1125j.G(((Integer) obj).intValue());
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return AbstractC1125j.I(((Long) obj).longValue());
            case 16:
                return AbstractC1125j.K(((Integer) obj).intValue());
            case LangUtils.HASH_SEED /* 17 */:
                return AbstractC1125j.M(((Long) obj).longValue());
            case 18:
                return AbstractC1125j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b bVarM = bVar.m();
        int number = bVar.getNumber();
        if (!bVar.k()) {
            return b(bVarM, number, obj);
        }
        int iB = 0;
        List list = (List) obj;
        if (bVar.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iB += c(bVarM, it.next());
            }
            return AbstractC1125j.P(number) + iB + AbstractC1125j.E(iB);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iB += b(bVarM, number, it2.next());
        }
        return iB;
    }

    public static int i(r0.b bVar, boolean z9) {
        if (z9) {
            return 2;
        }
        return bVar.getWireType();
    }

    public static boolean l(Map.Entry entry) {
        AbstractC1617D.a(entry.getKey());
        throw null;
    }

    public static boolean m(r0.b bVar, Object obj) {
        AbstractC1139y.a(obj);
        switch (a.f14759a[bVar.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC1122g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case 9:
                return obj instanceof O;
            default:
                return false;
        }
    }

    public static C1133s r() {
        return new C1133s();
    }

    public static void u(AbstractC1125j abstractC1125j, r0.b bVar, int i9, Object obj) {
        if (bVar == r0.b.GROUP) {
            abstractC1125j.r0(i9, (O) obj);
        } else {
            abstractC1125j.N0(i9, i(bVar, false));
            v(abstractC1125j, bVar, obj);
        }
    }

    public static void v(AbstractC1125j abstractC1125j, r0.b bVar, Object obj) {
        switch (a.f14760b[bVar.ordinal()]) {
            case 1:
                abstractC1125j.i0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC1125j.q0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC1125j.y0(((Long) obj).longValue());
                return;
            case 4:
                abstractC1125j.R0(((Long) obj).longValue());
                return;
            case 5:
                abstractC1125j.w0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC1125j.o0(((Long) obj).longValue());
                return;
            case 7:
                abstractC1125j.m0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC1125j.c0(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC1125j.t0((O) obj);
                return;
            case 10:
                abstractC1125j.A0((O) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC1122g)) {
                    abstractC1125j.M0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC1122g)) {
                    abstractC1125j.d0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC1125j.P0(((Integer) obj).intValue());
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                abstractC1125j.E0(((Integer) obj).intValue());
                return;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                abstractC1125j.G0(((Long) obj).longValue());
                return;
            case 16:
                abstractC1125j.I0(((Integer) obj).intValue());
                return;
            case LangUtils.HASH_SEED /* 17 */:
                abstractC1125j.K0(((Long) obj).longValue());
                return;
            case 18:
                abstractC1125j.k0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC1125j.g0((AbstractC1122g) obj);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C1133s clone() {
        C1133s c1133sR = r();
        for (int i9 = 0; i9 < this.f14756a.m(); i9++) {
            Map.Entry entryK = this.f14756a.k(i9);
            AbstractC1617D.a(entryK.getKey());
            c1133sR.s(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f14756a.o()) {
            AbstractC1617D.a(entry.getKey());
            c1133sR.s(null, entry.getValue());
        }
        c1133sR.f14758c = this.f14758c;
        return c1133sR;
    }

    public Iterator e() {
        return this.f14758c ? new B(this.f14756a.i().iterator()) : this.f14756a.i().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1133s) {
            return this.f14756a.equals(((C1133s) obj).f14756a);
        }
        return false;
    }

    public int f() {
        int iG = 0;
        for (int i9 = 0; i9 < this.f14756a.m(); i9++) {
            iG += g(this.f14756a.k(i9));
        }
        Iterator it = this.f14756a.o().iterator();
        while (it.hasNext()) {
            iG += g((Map.Entry) it.next());
        }
        return iG;
    }

    public final int g(Map.Entry entry) {
        AbstractC1617D.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int iD = 0;
        for (int i9 = 0; i9 < this.f14756a.m(); i9++) {
            Map.Entry entryK = this.f14756a.k(i9);
            AbstractC1617D.a(entryK.getKey());
            iD += d(null, entryK.getValue());
        }
        for (Map.Entry entry : this.f14756a.o()) {
            AbstractC1617D.a(entry.getKey());
            iD += d(null, entry.getValue());
        }
        return iD;
    }

    public int hashCode() {
        return this.f14756a.hashCode();
    }

    public boolean j() {
        return this.f14756a.isEmpty();
    }

    public boolean k() {
        for (int i9 = 0; i9 < this.f14756a.m(); i9++) {
            if (!l(this.f14756a.k(i9))) {
                return false;
            }
        }
        Iterator it = this.f14756a.o().iterator();
        while (it.hasNext()) {
            if (!l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return this.f14758c ? new B(this.f14756a.entrySet().iterator()) : this.f14756a.entrySet().iterator();
    }

    public void o() {
        if (this.f14757b) {
            return;
        }
        this.f14756a.r();
        this.f14757b = true;
    }

    public void p(C1133s c1133s) {
        for (int i9 = 0; i9 < c1133s.f14756a.m(); i9++) {
            q(c1133s.f14756a.k(i9));
        }
        Iterator it = c1133s.f14756a.o().iterator();
        while (it.hasNext()) {
            q((Map.Entry) it.next());
        }
    }

    public final void q(Map.Entry entry) {
        AbstractC1617D.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.k()) {
            t(bVar.m(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                t(bVar.m(), it.next());
            }
            obj = arrayList;
        }
        this.f14756a.t(bVar, obj);
    }

    public final void t(r0.b bVar, Object obj) {
        if (!m(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }
}
