package j$.time.format;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f[] f42054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f42055b;

    e(List list, boolean z9) {
        this((f[]) list.toArray(new f[list.size()]), z9);
    }

    e(f[] fVarArr, boolean z9) {
        this.f42054a = fVarArr;
        this.f42055b = z9;
    }

    public final e a() {
        return !this.f42055b ? this : new e(this.f42054a, false);
    }

    @Override // j$.time.format.f
    public final boolean i(p pVar, StringBuilder sb) {
        int length = sb.length();
        boolean z9 = this.f42055b;
        if (z9) {
            pVar.g();
        }
        try {
            for (f fVar : this.f42054a) {
                if (!fVar.i(pVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z9) {
                pVar.a();
            }
            return true;
        } finally {
            if (z9) {
                pVar.a();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.f42054a;
        if (fVarArr != null) {
            boolean z9 = this.f42055b;
            sb.append(z9 ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z9 ? "]" : ")");
        }
        return sb.toString();
    }
}
