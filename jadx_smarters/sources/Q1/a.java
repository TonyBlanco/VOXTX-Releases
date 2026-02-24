package Q1;

import android.graphics.Bitmap;
import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f7477q = "a";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Bitmap.Config f7478r = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f7479a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer f7481c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public short[] f7483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f7484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f7485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f7486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f7487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7488j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f7489k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC0086a f7491m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f7492n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7494p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f7480b = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7482d = new byte[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f7490l = new c();

    /* JADX INFO: renamed from: Q1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0086a {
        void a(Bitmap bitmap);

        Bitmap b(int i9, int i10, Bitmap.Config config);
    }

    public a(InterfaceC0086a interfaceC0086a) {
        this.f7491m = interfaceC0086a;
    }

    public static void m(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
    }

    public void a() {
        this.f7488j = (this.f7488j + 1) % this.f7490l.f7508c;
    }

    public void b() {
        this.f7490l = null;
        this.f7489k = null;
        this.f7486h = null;
        this.f7487i = null;
        Bitmap bitmap = this.f7492n;
        if (bitmap != null) {
            this.f7491m.a(bitmap);
        }
        this.f7492n = null;
        this.f7481c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132 A[PHI: r3
      0x0132: PHI (r3v12 int) = (r3v7 int), (r3v14 int) binds: [B:52:0x011a, B:54:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v26, types: [short] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Q1.b r28) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.a.c(Q1.b):void");
    }

    public int d() {
        return this.f7488j;
    }

    public int e(int i9) {
        if (i9 >= 0) {
            c cVar = this.f7490l;
            if (i9 < cVar.f7508c) {
                return ((b) cVar.f7510e.get(i9)).f7503i;
            }
        }
        return -1;
    }

    public int f() {
        return this.f7490l.f7508c;
    }

    public final Bitmap g() {
        InterfaceC0086a interfaceC0086a = this.f7491m;
        c cVar = this.f7490l;
        int i9 = cVar.f7511f;
        int i10 = cVar.f7512g;
        Bitmap.Config config = f7478r;
        Bitmap bitmapB = interfaceC0086a.b(i9, i10, config);
        if (bitmapB == null) {
            c cVar2 = this.f7490l;
            bitmapB = Bitmap.createBitmap(cVar2.f7511f, cVar2.f7512g, config);
        }
        m(bitmapB);
        return bitmapB;
    }

    public int h() {
        int i9;
        if (this.f7490l.f7508c <= 0 || (i9 = this.f7488j) < 0) {
            return -1;
        }
        return e(i9);
    }

    public synchronized Bitmap i() {
        try {
            if (this.f7490l.f7508c <= 0 || this.f7488j < 0) {
                String str = f7477q;
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "unable to decode frame, frameCount=" + this.f7490l.f7508c + " framePointer=" + this.f7488j);
                }
                this.f7494p = 1;
            }
            int i9 = this.f7494p;
            if (i9 != 1 && i9 != 2) {
                this.f7494p = 0;
                b bVar = (b) this.f7490l.f7510e.get(this.f7488j);
                int i10 = this.f7488j - 1;
                b bVar2 = i10 >= 0 ? (b) this.f7490l.f7510e.get(i10) : null;
                int[] iArr = bVar.f7505k;
                if (iArr == null) {
                    iArr = this.f7490l.f7506a;
                }
                this.f7479a = iArr;
                if (iArr == null) {
                    String str2 = f7477q;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No Valid Color Table");
                    }
                    this.f7494p = 1;
                    return null;
                }
                if (bVar.f7500f) {
                    System.arraycopy(iArr, 0, this.f7480b, 0, iArr.length);
                    int[] iArr2 = this.f7480b;
                    this.f7479a = iArr2;
                    iArr2[bVar.f7502h] = 0;
                }
                return o(bVar, bVar2);
            }
            String str3 = f7477q;
            if (Log.isLoggable(str3, 3)) {
                Log.d(str3, "Unable to decode frame, status=" + this.f7494p);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int j() {
        int i9 = this.f7490l.f7518m;
        if (i9 == -1) {
            return 1;
        }
        if (i9 == 0) {
            return 0;
        }
        return i9 + 1;
    }

    public final int k() {
        try {
            return this.f7481c.get() & 255;
        } catch (Exception unused) {
            this.f7494p = 1;
            return 0;
        }
    }

    public final int l() {
        int iK = k();
        int i9 = 0;
        if (iK > 0) {
            while (i9 < iK) {
                int i10 = iK - i9;
                try {
                    this.f7481c.get(this.f7482d, i9, i10);
                    i9 += i10;
                } catch (Exception e9) {
                    Log.w(f7477q, "Error Reading Block", e9);
                    this.f7494p = 1;
                }
            }
        }
        return i9;
    }

    public void n(c cVar, byte[] bArr) {
        this.f7490l = cVar;
        this.f7489k = bArr;
        this.f7494p = 0;
        this.f7488j = -1;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.f7481c = byteBufferWrap;
        byteBufferWrap.rewind();
        this.f7481c.order(ByteOrder.LITTLE_ENDIAN);
        this.f7493o = false;
        Iterator it = cVar.f7510e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((b) it.next()).f7501g == 3) {
                this.f7493o = true;
                break;
            }
        }
        int i9 = cVar.f7511f;
        int i10 = cVar.f7512g;
        this.f7486h = new byte[i9 * i10];
        this.f7487i = new int[i9 * i10];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap o(Q1.b r17, Q1.b r18) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.a.o(Q1.b, Q1.b):android.graphics.Bitmap");
    }
}
