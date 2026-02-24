package f6;

import f6.InterfaceC1780d;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements c6.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f40836f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c6.d f40837g = c6.d.a("key").b(C1777a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c6.d f40838h = c6.d.a("value").b(C1777a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c6.e f40839i = new c6.e() { // from class: f6.e
        @Override // c6.b
        public final void encode(Object obj, Object obj2) {
            f.r((Map.Entry) obj, (c6.f) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f40840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f40841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f40842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c6.e f40843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f40844e = new i(this);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40845a;

        static {
            int[] iArr = new int[InterfaceC1780d.a.values().length];
            f40845a = iArr;
            try {
                iArr[InterfaceC1780d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40845a[InterfaceC1780d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40845a[InterfaceC1780d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(OutputStream outputStream, Map map, Map map2, c6.e eVar) {
        this.f40840a = outputStream;
        this.f40841b = map;
        this.f40842c = map2;
        this.f40843d = eVar;
    }

    public static ByteBuffer k(int i9) {
        return ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static InterfaceC1780d p(c6.d dVar) {
        InterfaceC1780d interfaceC1780d = (InterfaceC1780d) dVar.c(InterfaceC1780d.class);
        if (interfaceC1780d != null) {
            return interfaceC1780d;
        }
        throw new c6.c("Field has no @Protobuf config");
    }

    public static int q(c6.d dVar) {
        InterfaceC1780d interfaceC1780d = (InterfaceC1780d) dVar.c(InterfaceC1780d.class);
        if (interfaceC1780d != null) {
            return interfaceC1780d.tag();
        }
        throw new c6.c("Field has no @Protobuf config");
    }

    public static /* synthetic */ void r(Map.Entry entry, c6.f fVar) {
        fVar.add(f40837g, entry.getKey());
        fVar.add(f40838h, entry.getValue());
    }

    @Override // c6.f
    public c6.f add(c6.d dVar, double d9) {
        return b(dVar, d9, true);
    }

    @Override // c6.f
    public c6.f add(c6.d dVar, Object obj) {
        return d(dVar, obj, true);
    }

    public c6.f b(c6.d dVar, double d9, boolean z9) throws IOException {
        if (z9 && d9 == 0.0d) {
            return this;
        }
        s((q(dVar) << 3) | 1);
        this.f40840a.write(k(8).putDouble(d9).array());
        return this;
    }

    public c6.f c(c6.d dVar, float f9, boolean z9) throws IOException {
        if (z9 && f9 == 0.0f) {
            return this;
        }
        s((q(dVar) << 3) | 5);
        this.f40840a.write(k(4).putFloat(f9).array());
        return this;
    }

    public c6.f d(c6.d dVar, Object obj, boolean z9) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z9 && charSequence.length() == 0) {
                return this;
            }
            s((q(dVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f40836f);
            s(bytes.length);
            this.f40840a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d(dVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m(f40839i, dVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return b(dVar, ((Double) obj).doubleValue(), z9);
        }
        if (obj instanceof Float) {
            return c(dVar, ((Float) obj).floatValue(), z9);
        }
        if (obj instanceof Number) {
            return h(dVar, ((Number) obj).longValue(), z9);
        }
        if (obj instanceof Boolean) {
            return j(dVar, ((Boolean) obj).booleanValue(), z9);
        }
        if (!(obj instanceof byte[])) {
            c6.e eVar = (c6.e) this.f40841b.get(obj.getClass());
            if (eVar != null) {
                return m(eVar, dVar, obj, z9);
            }
            c6.g gVar = (c6.g) this.f40842c.get(obj.getClass());
            return gVar != null ? n(gVar, dVar, obj, z9) : obj instanceof InterfaceC1779c ? add(dVar, ((InterfaceC1779c) obj).getNumber()) : obj instanceof Enum ? add(dVar, ((Enum) obj).ordinal()) : m(this.f40843d, dVar, obj, z9);
        }
        byte[] bArr = (byte[]) obj;
        if (z9 && bArr.length == 0) {
            return this;
        }
        s((q(dVar) << 3) | 2);
        s(bArr.length);
        this.f40840a.write(bArr);
        return this;
    }

    @Override // c6.f
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f add(c6.d dVar, int i9) {
        return f(dVar, i9, true);
    }

    public f f(c6.d dVar, int i9, boolean z9) throws IOException {
        if (z9 && i9 == 0) {
            return this;
        }
        InterfaceC1780d interfaceC1780dP = p(dVar);
        int i10 = a.f40845a[interfaceC1780dP.intEncoding().ordinal()];
        if (i10 == 1) {
            s(interfaceC1780dP.tag() << 3);
            s(i9);
        } else if (i10 == 2) {
            s(interfaceC1780dP.tag() << 3);
            s((i9 << 1) ^ (i9 >> 31));
        } else if (i10 == 3) {
            s((interfaceC1780dP.tag() << 3) | 5);
            this.f40840a.write(k(4).putInt(i9).array());
        }
        return this;
    }

    @Override // c6.f
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public f add(c6.d dVar, long j9) {
        return h(dVar, j9, true);
    }

    public f h(c6.d dVar, long j9, boolean z9) throws IOException {
        if (z9 && j9 == 0) {
            return this;
        }
        InterfaceC1780d interfaceC1780dP = p(dVar);
        int i9 = a.f40845a[interfaceC1780dP.intEncoding().ordinal()];
        if (i9 == 1) {
            s(interfaceC1780dP.tag() << 3);
            t(j9);
        } else if (i9 == 2) {
            s(interfaceC1780dP.tag() << 3);
            t((j9 >> 63) ^ (j9 << 1));
        } else if (i9 == 3) {
            s((interfaceC1780dP.tag() << 3) | 1);
            this.f40840a.write(k(8).putLong(j9).array());
        }
        return this;
    }

    @Override // c6.f
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f add(c6.d dVar, boolean z9) {
        return j(dVar, z9, true);
    }

    public f j(c6.d dVar, boolean z9, boolean z10) {
        return f(dVar, z9 ? 1 : 0, z10);
    }

    public final long l(c6.e eVar, Object obj) throws IOException {
        C1778b c1778b = new C1778b();
        try {
            OutputStream outputStream = this.f40840a;
            this.f40840a = c1778b;
            try {
                eVar.encode(obj, this);
                this.f40840a = outputStream;
                long jA = c1778b.a();
                c1778b.close();
                return jA;
            } catch (Throwable th) {
                this.f40840a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1778b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final f m(c6.e eVar, c6.d dVar, Object obj, boolean z9) throws IOException {
        long jL = l(eVar, obj);
        if (z9 && jL == 0) {
            return this;
        }
        s((q(dVar) << 3) | 2);
        t(jL);
        eVar.encode(obj, this);
        return this;
    }

    public final f n(c6.g gVar, c6.d dVar, Object obj, boolean z9) {
        this.f40844e.b(dVar, z9);
        gVar.encode(obj, this.f40844e);
        return this;
    }

    public f o(Object obj) {
        if (obj == null) {
            return this;
        }
        c6.e eVar = (c6.e) this.f40841b.get(obj.getClass());
        if (eVar != null) {
            eVar.encode(obj, this);
            return this;
        }
        throw new c6.c("No encoder for " + obj.getClass());
    }

    public final void s(int i9) throws IOException {
        while (true) {
            long j9 = i9 & (-128);
            OutputStream outputStream = this.f40840a;
            if (j9 == 0) {
                outputStream.write(i9 & 127);
                return;
            } else {
                outputStream.write((i9 & 127) | 128);
                i9 >>>= 7;
            }
        }
    }

    public final void t(long j9) throws IOException {
        while (true) {
            long j10 = (-128) & j9;
            OutputStream outputStream = this.f40840a;
            if (j10 == 0) {
                outputStream.write(((int) j9) & 127);
                return;
            } else {
                outputStream.write((((int) j9) & 127) | 128);
                j9 >>>= 7;
            }
        }
    }
}
