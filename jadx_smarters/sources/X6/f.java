package X6;

import V6.h;
import V6.j;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f10475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V6.f f10476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f10477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10478d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f10479e;

    public static boolean b(int i9) {
        return i9 >= 0 && i9 < 8;
    }

    public b a() {
        return this.f10479e;
    }

    public void c(V6.f fVar) {
        this.f10476b = fVar;
    }

    public void d(int i9) {
        this.f10478d = i9;
    }

    public void e(b bVar) {
        this.f10479e = bVar;
    }

    public void f(h hVar) {
        this.f10475a = hVar;
    }

    public void g(j jVar) {
        this.f10477c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f10475a);
        sb.append("\n ecLevel: ");
        sb.append(this.f10476b);
        sb.append("\n version: ");
        sb.append(this.f10477c);
        sb.append("\n maskPattern: ");
        sb.append(this.f10478d);
        if (this.f10479e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f10479e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
