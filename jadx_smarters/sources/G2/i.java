package g2;

import Q1.a;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import c2.C1251d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import okhttp3.internal.http2.Http2;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public class i implements S1.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f41302f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f41303g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f41305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.b f41306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f41307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1832a f41308e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue f41309a = AbstractC2539h.c(0);

        public synchronized Q1.a a(a.InterfaceC0086a interfaceC0086a) {
            Q1.a aVar;
            aVar = (Q1.a) this.f41309a.poll();
            if (aVar == null) {
                aVar = new Q1.a(interfaceC0086a);
            }
            return aVar;
        }

        public synchronized void b(Q1.a aVar) {
            aVar.b();
            this.f41309a.offer(aVar);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Queue f41310a = AbstractC2539h.c(0);

        public synchronized Q1.d a(byte[] bArr) {
            Q1.d dVar;
            try {
                dVar = (Q1.d) this.f41310a.poll();
                if (dVar == null) {
                    dVar = new Q1.d();
                }
            } catch (Throwable th) {
                throw th;
            }
            return dVar.o(bArr);
        }

        public synchronized void b(Q1.d dVar) {
            dVar.a();
            this.f41310a.offer(dVar);
        }
    }

    public i(Context context, V1.b bVar) {
        this(context, bVar, f41302f, f41303g);
    }

    public i(Context context, V1.b bVar, b bVar2, a aVar) {
        this.f41304a = context.getApplicationContext();
        this.f41306c = bVar;
        this.f41307d = aVar;
        this.f41308e = new C1832a(bVar);
        this.f41305b = bVar2;
    }

    public static byte[] e(InputStream inputStream) {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        } catch (IOException e9) {
            Log.w("GifResourceDecoder", "Error reading data from stream", e9);
        }
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i9);
            return byteArrayOutputStream.toByteArray();
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @Override // S1.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d a(InputStream inputStream, int i9, int i10) {
        byte[] bArrE = e(inputStream);
        Q1.d dVarA = this.f41305b.a(bArrE);
        Q1.a aVarA = this.f41307d.a(this.f41308e);
        try {
            return c(bArrE, i9, i10, dVarA, aVarA);
        } finally {
            this.f41305b.b(dVarA);
            this.f41307d.b(aVarA);
        }
    }

    public final d c(byte[] bArr, int i9, int i10, Q1.d dVar, Q1.a aVar) {
        Bitmap bitmapD;
        Q1.c cVarC = dVar.c();
        if (cVarC.a() <= 0 || cVarC.b() != 0 || (bitmapD = d(aVar, cVarC, bArr)) == null) {
            return null;
        }
        return new d(new g2.b(this.f41304a, this.f41308e, this.f41306c, C1251d.b(), i9, i10, cVarC, bArr, bitmapD));
    }

    public final Bitmap d(Q1.a aVar, Q1.c cVar, byte[] bArr) {
        aVar.n(cVar, bArr);
        aVar.a();
        return aVar.i();
    }

    @Override // S1.e
    public String getId() {
        return "";
    }
}
