package g2;

import Q1.a;
import U1.l;
import android.graphics.Bitmap;
import android.util.Log;
import c2.C1251d;
import d2.C1653c;
import java.io.IOException;
import java.io.OutputStream;
import q2.AbstractC2535d;

/* JADX INFO: loaded from: classes.dex */
public class j implements S1.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f41311d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.InterfaceC0086a f41312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f41313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f41314c;

    public static class a {
        public Q1.a a(a.InterfaceC0086a interfaceC0086a) {
            return new Q1.a(interfaceC0086a);
        }

        public R1.a b() {
            return new R1.a();
        }

        public l c(Bitmap bitmap, V1.b bVar) {
            return new C1653c(bitmap, bVar);
        }

        public Q1.d d() {
            return new Q1.d();
        }
    }

    public j(V1.b bVar) {
        this(bVar, f41311d);
    }

    public j(V1.b bVar, a aVar) {
        this.f41313b = bVar;
        this.f41312a = new C1832a(bVar);
        this.f41314c = aVar;
    }

    public final Q1.a b(byte[] bArr) {
        Q1.d dVarD = this.f41314c.d();
        dVarD.o(bArr);
        Q1.c cVarC = dVarD.c();
        Q1.a aVarA = this.f41314c.a(this.f41312a);
        aVarA.n(cVarC, bArr);
        aVarA.a();
        return aVarA;
    }

    @Override // S1.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(l lVar, OutputStream outputStream) {
        long jB = AbstractC2535d.b();
        b bVar = (b) lVar.get();
        S1.g gVarG = bVar.g();
        if (gVarG instanceof C1251d) {
            return e(bVar.d(), outputStream);
        }
        Q1.a aVarB = b(bVar.d());
        R1.a aVarB2 = this.f41314c.b();
        if (!aVarB2.h(outputStream)) {
            return false;
        }
        for (int i9 = 0; i9 < aVarB.f(); i9++) {
            l lVarD = d(aVarB.i(), gVarG, bVar);
            try {
                if (!aVarB2.a((Bitmap) lVarD.get())) {
                    return false;
                }
                aVarB2.f(aVarB.e(aVarB.d()));
                aVarB.a();
                lVarD.b();
            } finally {
                lVarD.b();
            }
        }
        boolean zD = aVarB2.d();
        if (Log.isLoggable("GifEncoder", 2)) {
            Log.v("GifEncoder", "Encoded gif with " + aVarB.f() + " frames and " + bVar.d().length + " bytes in " + AbstractC2535d.a(jB) + " ms");
        }
        return zD;
    }

    public final l d(Bitmap bitmap, S1.g gVar, b bVar) {
        l lVarC = this.f41314c.c(bitmap, this.f41313b);
        l lVarA = gVar.a(lVarC, bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight());
        if (!lVarC.equals(lVarA)) {
            lVarC.b();
        }
        return lVarA;
    }

    public final boolean e(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException e9) {
            if (Log.isLoggable("GifEncoder", 3)) {
                Log.d("GifEncoder", "Failed to write data to output stream in GifResourceEncoder", e9);
            }
            return false;
        }
    }

    @Override // S1.b
    public String getId() {
        return "";
    }
}
