package x;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends e implements h {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public e[] f51858w0 = new e[4];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f51859x0 = 0;

    @Override // x.h
    public void a(f fVar) {
    }

    @Override // x.h
    public void b(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i9 = this.f51859x0 + 1;
        e[] eVarArr = this.f51858w0;
        if (i9 > eVarArr.length) {
            this.f51858w0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f51858w0;
        int i10 = this.f51859x0;
        eVarArr2[i10] = eVar;
        this.f51859x0 = i10 + 1;
    }

    @Override // x.h
    public void c() {
        this.f51859x0 = 0;
        Arrays.fill(this.f51858w0, (Object) null);
    }
}
