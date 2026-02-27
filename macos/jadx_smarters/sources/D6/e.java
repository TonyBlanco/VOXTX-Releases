package D6;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f1468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f1470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f1471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f1473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1474j;

    public e(byte[] bArr, String str, List list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public e(byte[] bArr, String str, List list, String str2, int i9, int i10) {
        this.f1465a = bArr;
        this.f1466b = bArr == null ? 0 : bArr.length * 8;
        this.f1467c = str;
        this.f1468d = list;
        this.f1469e = str2;
        this.f1473i = i10;
        this.f1474j = i9;
    }

    public List a() {
        return this.f1468d;
    }

    public String b() {
        return this.f1469e;
    }

    public int c() {
        return this.f1466b;
    }

    public Object d() {
        return this.f1472h;
    }

    public byte[] e() {
        return this.f1465a;
    }

    public int f() {
        return this.f1473i;
    }

    public int g() {
        return this.f1474j;
    }

    public String h() {
        return this.f1467c;
    }

    public boolean i() {
        return this.f1473i >= 0 && this.f1474j >= 0;
    }

    public void j(Integer num) {
        this.f1471g = num;
    }

    public void k(Integer num) {
        this.f1470f = num;
    }

    public void l(int i9) {
        this.f1466b = i9;
    }

    public void m(Object obj) {
        this.f1472h = obj;
    }
}
