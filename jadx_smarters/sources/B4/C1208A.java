package b4;

import O2.C0897l1;
import b4.C;
import b4.F;
import b4.G;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: b4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1208A implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17471a;

    public C1208A() {
        this(-1);
    }

    public C1208A(int i9) {
        this.f17471a = i9;
    }

    @Override // b4.F
    public F.b a(F.a aVar, F.c cVar) {
        if (!e(cVar.f17496c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new F.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new F.b(2, 60000L);
        }
        return null;
    }

    @Override // b4.F
    public int b(int i9) {
        int i10 = this.f17471a;
        return i10 == -1 ? i9 == 7 ? 6 : 3 : i10;
    }

    @Override // b4.F
    public long c(F.c cVar) {
        IOException iOException = cVar.f17496c;
        if ((iOException instanceof C0897l1) || (iOException instanceof FileNotFoundException) || (iOException instanceof C.a) || (iOException instanceof G.h) || C1225p.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.f17497d - 1) * 1000, 5000);
    }

    @Override // b4.F
    public /* synthetic */ void d(long j9) {
        E.a(this, j9);
    }

    public boolean e(IOException iOException) {
        if (!(iOException instanceof C.e)) {
            return false;
        }
        int i9 = ((C.e) iOException).f17480e;
        return i9 == 403 || i9 == 404 || i9 == 410 || i9 == 416 || i9 == 500 || i9 == 503;
    }
}
