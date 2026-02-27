package i1;

import android.os.SystemClock;
import h1.n;
import h1.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: i1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1875b implements h1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f41787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1874a f41788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1876c f41789c;

    public C1875b(AbstractC1874a abstractC1874a) {
        this(abstractC1874a, new C1876c(4096));
    }

    public C1875b(AbstractC1874a abstractC1874a, C1876c c1876c) {
        this.f41788b = abstractC1874a;
        this.f41787a = abstractC1874a;
        this.f41789c = c1876c;
    }

    @Override // h1.h
    public h1.k a(n nVar) throws u {
        IOException iOException;
        f fVar;
        byte[] bArr;
        f fVarA;
        int iD;
        List listC;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                fVarA = this.f41788b.a(nVar, AbstractC1878e.c(nVar.s()));
                try {
                    iD = fVarA.d();
                    listC = fVarA.c();
                    break;
                } catch (IOException e9) {
                    bArr = null;
                    fVar = fVarA;
                    iOException = e9;
                }
            } catch (IOException e10) {
                iOException = e10;
                fVar = null;
                bArr = null;
            }
            j.a(nVar, j.e(nVar, iOException, jElapsedRealtime, fVar, bArr));
        }
        if (iD == 304) {
            return j.b(nVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
        }
        InputStream inputStreamA = fVarA.a();
        byte[] bArrC = inputStreamA != null ? j.c(inputStreamA, fVarA.b(), this.f41789c) : new byte[0];
        j.d(SystemClock.elapsedRealtime() - jElapsedRealtime, nVar, bArrC, iD);
        if (iD < 200 || iD > 299) {
            throw new IOException();
        }
        return new h1.k(iD, bArrC, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
    }
}
