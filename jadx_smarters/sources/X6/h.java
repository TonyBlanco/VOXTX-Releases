package x6;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f51963c;

    public h(i iVar) {
        super(iVar.d(), iVar.a());
        this.f51963c = iVar;
    }

    @Override // x6.i
    public byte[] b() {
        byte[] bArrB = this.f51963c.b();
        int iD = d() * a();
        byte[] bArr = new byte[iD];
        for (int i9 = 0; i9 < iD; i9++) {
            bArr[i9] = (byte) (255 - (bArrB[i9] & 255));
        }
        return bArr;
    }

    @Override // x6.i
    public byte[] c(int i9, byte[] bArr) {
        byte[] bArrC = this.f51963c.c(i9, bArr);
        int iD = d();
        for (int i10 = 0; i10 < iD; i10++) {
            bArrC[i10] = (byte) (255 - (bArrC[i10] & 255));
        }
        return bArrC;
    }

    @Override // x6.i
    public i e() {
        return this.f51963c;
    }

    @Override // x6.i
    public boolean f() {
        return this.f51963c.f();
    }

    @Override // x6.i
    public i g() {
        return new h(this.f51963c.g());
    }
}
