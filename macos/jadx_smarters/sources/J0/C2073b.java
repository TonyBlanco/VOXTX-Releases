package j0;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2073b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f42879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence[] f42880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f42881e;

    public int a() {
        return (this.f42879c - this.f42878b) + 1;
    }

    public int b() {
        return this.f42877a;
    }

    public CharSequence c(int i9) {
        CharSequence[] charSequenceArr = this.f42880d;
        return charSequenceArr == null ? String.format(this.f42881e, Integer.valueOf(i9)) : charSequenceArr[i9];
    }

    public int d() {
        return this.f42879c;
    }

    public int e() {
        return this.f42878b;
    }

    public void f(int i9) {
        this.f42877a = i9;
    }

    public void g(String str) {
        this.f42881e = str;
    }

    public void h(int i9) {
        this.f42879c = i9;
    }

    public void i(int i9) {
        this.f42878b = i9;
    }

    public void j(CharSequence[] charSequenceArr) {
        this.f42880d = charSequenceArr;
    }
}
