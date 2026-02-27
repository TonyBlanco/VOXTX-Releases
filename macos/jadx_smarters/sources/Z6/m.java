package Z6;

import Y6.v;
import android.graphics.Rect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v f11421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11423c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q f11424d = new n();

    public m(int i9, v vVar) {
        this.f11422b = i9;
        this.f11421a = vVar;
    }

    public v a(List list, boolean z9) {
        return this.f11424d.b(list, b(z9));
    }

    public v b(boolean z9) {
        v vVar = this.f11421a;
        if (vVar == null) {
            return null;
        }
        return z9 ? vVar.b() : vVar;
    }

    public int c() {
        return this.f11422b;
    }

    public Rect d(v vVar) {
        return this.f11424d.d(vVar, this.f11421a);
    }

    public void e(q qVar) {
        this.f11424d = qVar;
    }
}
