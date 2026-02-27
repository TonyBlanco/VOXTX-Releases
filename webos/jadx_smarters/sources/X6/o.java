package x6;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f51978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q[] f51980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC2960a f51981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f51982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51983g;

    public o(String str, byte[] bArr, int i9, q[] qVarArr, EnumC2960a enumC2960a, long j9) {
        this.f51977a = str;
        this.f51978b = bArr;
        this.f51979c = i9;
        this.f51980d = qVarArr;
        this.f51981e = enumC2960a;
        this.f51982f = null;
        this.f51983g = j9;
    }

    public o(String str, byte[] bArr, q[] qVarArr, EnumC2960a enumC2960a) {
        this(str, bArr, qVarArr, enumC2960a, System.currentTimeMillis());
    }

    public o(String str, byte[] bArr, q[] qVarArr, EnumC2960a enumC2960a, long j9) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, qVarArr, enumC2960a, j9);
    }

    public void a(q[] qVarArr) {
        q[] qVarArr2 = this.f51980d;
        if (qVarArr2 == null) {
            this.f51980d = qVarArr;
            return;
        }
        if (qVarArr == null || qVarArr.length <= 0) {
            return;
        }
        q[] qVarArr3 = new q[qVarArr2.length + qVarArr.length];
        System.arraycopy(qVarArr2, 0, qVarArr3, 0, qVarArr2.length);
        System.arraycopy(qVarArr, 0, qVarArr3, qVarArr2.length, qVarArr.length);
        this.f51980d = qVarArr3;
    }

    public EnumC2960a b() {
        return this.f51981e;
    }

    public byte[] c() {
        return this.f51978b;
    }

    public Map d() {
        return this.f51982f;
    }

    public q[] e() {
        return this.f51980d;
    }

    public String f() {
        return this.f51977a;
    }

    public void g(Map map) {
        if (map != null) {
            Map map2 = this.f51982f;
            if (map2 == null) {
                this.f51982f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(p pVar, Object obj) {
        if (this.f51982f == null) {
            this.f51982f = new EnumMap(p.class);
        }
        this.f51982f.put(pVar, obj);
    }

    public String toString() {
        return this.f51977a;
    }
}
