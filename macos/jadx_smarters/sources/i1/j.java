package i1;

import android.os.SystemClock;
import com.amazonaws.services.s3.internal.Constants;
import h1.C1846a;
import h1.InterfaceC1847b;
import h1.n;
import h1.r;
import h1.s;
import h1.t;
import h1.u;
import h1.v;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u f41826b;

        public b(String str, u uVar) {
            this.f41825a = str;
            this.f41826b = uVar;
        }
    }

    public static void a(n nVar, b bVar) throws u {
        r rVarC = nVar.C();
        int iD = nVar.D();
        try {
            rVarC.a(bVar.f41826b);
            nVar.b(String.format("%s-retry [timeout=%s]", bVar.f41825a, Integer.valueOf(iD)));
        } catch (u e9) {
            nVar.b(String.format("%s-timeout-giveup [timeout=%s]", bVar.f41825a, Integer.valueOf(iD)));
            throw e9;
        }
    }

    public static h1.k b(n nVar, long j9, List list) {
        InterfaceC1847b.a aVarS = nVar.s();
        if (aVarS == null) {
            return new h1.k(HttpStatus.SC_NOT_MODIFIED, (byte[]) null, true, j9, list);
        }
        return new h1.k(HttpStatus.SC_NOT_MODIFIED, aVarS.f41506a, true, j9, AbstractC1878e.a(list, aVarS));
    }

    public static byte[] c(InputStream inputStream, int i9, C1876c c1876c) throws Throwable {
        byte[] bArrA;
        k kVar = new k(c1876c, i9);
        try {
            bArrA = c1876c.a(1024);
            while (true) {
                try {
                    int i10 = inputStream.read(bArrA);
                    if (i10 == -1) {
                        break;
                    }
                    kVar.write(bArrA, 0, i10);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            v.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    c1876c.b(bArrA);
                    kVar.close();
                    throw th;
                }
            }
            byte[] byteArray = kVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                v.e("Error occurred when closing InputStream", new Object[0]);
            }
            c1876c.b(bArrA);
            kVar.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrA = null;
        }
    }

    public static void d(long j9, n nVar, byte[] bArr, int i9) {
        if (v.f41583b || j9 > 3000) {
            v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", nVar, Long.valueOf(j9), bArr != null ? Integer.valueOf(bArr.length) : Constants.NULL_VERSION_ID, Integer.valueOf(i9), Integer.valueOf(nVar.C().b()));
        }
    }

    public static b e(n nVar, IOException iOException, long j9, f fVar, byte[] bArr) throws h1.l, s {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new t());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + nVar.F(), iOException);
        }
        if (fVar == null) {
            if (nVar.U()) {
                return new b("connection", new h1.l());
            }
            throw new h1.l(iOException);
        }
        int iD = fVar.d();
        v.c("Unexpected response code %d for %s", Integer.valueOf(iD), nVar.F());
        if (bArr == null) {
            return new b("network", new h1.j());
        }
        h1.k kVar = new h1.k(iD, bArr, false, SystemClock.elapsedRealtime() - j9, fVar.c());
        if (iD == 401 || iD == 403) {
            return new b("auth", new C1846a(kVar));
        }
        if (iD >= 400 && iD <= 499) {
            throw new h1.d(kVar);
        }
        if (iD < 500 || iD > 599 || !nVar.V()) {
            throw new s(kVar);
        }
        return new b("server", new s(kVar));
    }
}
