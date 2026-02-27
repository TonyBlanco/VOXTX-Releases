package e6;

import android.util.Base64;
import android.util.JsonWriter;
import c6.g;
import c6.h;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements c6.f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f40442a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f40443b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JsonWriter f40444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f40445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f40446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c6.e f40447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f40448g;

    public e(Writer writer, Map map, Map map2, c6.e eVar, boolean z9) {
        this.f40444c = new JsonWriter(writer);
        this.f40445d = map;
        this.f40446e = map2;
        this.f40447f = eVar;
        this.f40448g = z9;
    }

    public e a(double d9) throws IOException {
        r();
        this.f40444c.value(d9);
        return this;
    }

    @Override // c6.f
    public c6.f add(c6.d dVar, double d9) {
        return f(dVar.b(), d9);
    }

    @Override // c6.f
    public c6.f add(c6.d dVar, int i9) {
        return g(dVar.b(), i9);
    }

    @Override // c6.f
    public c6.f add(c6.d dVar, long j9) {
        return h(dVar.b(), j9);
    }

    @Override // c6.f
    public c6.f add(c6.d dVar, Object obj) {
        return i(dVar.b(), obj);
    }

    @Override // c6.f
    public c6.f add(c6.d dVar, boolean z9) {
        return j(dVar.b(), z9);
    }

    public e b(int i9) throws IOException {
        r();
        this.f40444c.value(i9);
        return this;
    }

    public e c(long j9) throws IOException {
        r();
        this.f40444c.value(j9);
        return this;
    }

    public e d(Object obj, boolean z9) {
        int i9 = 0;
        if (z9 && m(obj)) {
            throw new c6.c(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f40444c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f40444c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f40444c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    d(it.next(), false);
                }
                this.f40444c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f40444c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e9) {
                        throw new c6.c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e9);
                    }
                }
                this.f40444c.endObject();
                return this;
            }
            c6.e eVar = (c6.e) this.f40445d.get(obj.getClass());
            if (eVar != null) {
                return o(eVar, obj, z9);
            }
            g gVar = (g) this.f40446e.get(obj.getClass());
            if (gVar != null) {
                gVar.encode(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return o(this.f40447f, obj, z9);
            }
            if (obj instanceof f) {
                b(((f) obj).getNumber());
            } else {
                add(((Enum) obj).name());
            }
            return this;
        }
        if (obj instanceof byte[]) {
            return l((byte[]) obj);
        }
        this.f40444c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i9 < length) {
                this.f40444c.value(r7[i9]);
                i9++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i9 < length2) {
                c(jArr[i9]);
                i9++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i9 < length3) {
                this.f40444c.value(dArr[i9]);
                i9++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i9 < length4) {
                this.f40444c.value(zArr[i9]);
                i9++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                d(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                d(obj2, false);
            }
        }
        this.f40444c.endArray();
        return this;
    }

    @Override // c6.h
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public e add(String str) throws IOException {
        r();
        this.f40444c.value(str);
        return this;
    }

    public e f(String str, double d9) throws IOException {
        r();
        this.f40444c.name(str);
        return a(d9);
    }

    public e g(String str, int i9) throws IOException {
        r();
        this.f40444c.name(str);
        return b(i9);
    }

    public e h(String str, long j9) throws IOException {
        r();
        this.f40444c.name(str);
        return c(j9);
    }

    public e i(String str, Object obj) {
        return this.f40448g ? q(str, obj) : p(str, obj);
    }

    public e j(String str, boolean z9) throws IOException {
        r();
        this.f40444c.name(str);
        return add(z9);
    }

    @Override // c6.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e add(boolean z9) throws IOException {
        r();
        this.f40444c.value(z9);
        return this;
    }

    public e l(byte[] bArr) throws IOException {
        r();
        if (bArr == null) {
            this.f40444c.nullValue();
        } else {
            this.f40444c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    public final boolean m(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    public void n() {
        r();
        this.f40444c.flush();
    }

    public e o(c6.e eVar, Object obj, boolean z9) throws IOException {
        if (!z9) {
            this.f40444c.beginObject();
        }
        eVar.encode(obj, this);
        if (!z9) {
            this.f40444c.endObject();
        }
        return this;
    }

    public final e p(String str, Object obj) throws IOException {
        r();
        this.f40444c.name(str);
        if (obj != null) {
            return d(obj, false);
        }
        this.f40444c.nullValue();
        return this;
    }

    public final e q(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        r();
        this.f40444c.name(str);
        return d(obj, false);
    }

    public final void r() throws IOException {
        if (!this.f40443b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f40442a;
        if (eVar != null) {
            eVar.r();
            this.f40442a.f40443b = false;
            this.f40442a = null;
            this.f40444c.endObject();
        }
    }
}
