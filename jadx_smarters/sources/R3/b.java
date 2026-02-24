package R3;

import P3.b;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import d4.AbstractC1681B;
import d4.L;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;
import org.apache.http.util.LangUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f8594h = {0, 7, 8, 15};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f8595i = {0, 119, -120, -1};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f8596j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f8597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f8598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Canvas f8599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0114b f8600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f8601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f8602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Bitmap f8603g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8604a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f8605b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f8606c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f8607d;

        public a(int i9, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f8604a = i9;
            this.f8605b = iArr;
            this.f8606c = iArr2;
            this.f8607d = iArr3;
        }
    }

    /* JADX INFO: renamed from: R3.b$b, reason: collision with other inner class name */
    public static final class C0114b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8611d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8613f;

        public C0114b(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f8608a = i9;
            this.f8609b = i10;
            this.f8610c = i11;
            this.f8611d = i12;
            this.f8612e = i13;
            this.f8613f = i14;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f8616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f8617d;

        public c(int i9, boolean z9, byte[] bArr, byte[] bArr2) {
            this.f8614a = i9;
            this.f8615b = z9;
            this.f8616c = bArr;
            this.f8617d = bArr2;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f8621d;

        public d(int i9, int i10, int i11, SparseArray sparseArray) {
            this.f8618a = i9;
            this.f8619b = i10;
            this.f8620c = i11;
            this.f8621d = sparseArray;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8623b;

        public e(int i9, int i10) {
            this.f8622a = i9;
            this.f8623b = i10;
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f8632i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f8633j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final SparseArray f8634k;

        public f(int i9, boolean z9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray sparseArray) {
            this.f8624a = i9;
            this.f8625b = z9;
            this.f8626c = i10;
            this.f8627d = i11;
            this.f8628e = i12;
            this.f8629f = i13;
            this.f8630g = i14;
            this.f8631h = i15;
            this.f8632i = i16;
            this.f8633j = i17;
            this.f8634k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f8634k;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                this.f8634k.put(sparseArray.keyAt(i9), (g) sparseArray.valueAt(i9));
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8640f;

        public g(int i9, int i10, int i11, int i12, int i13, int i14) {
            this.f8635a = i9;
            this.f8636b = i10;
            this.f8637c = i11;
            this.f8638d = i12;
            this.f8639e = i13;
            this.f8640f = i14;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8641a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8642b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SparseArray f8643c = new SparseArray();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final SparseArray f8644d = new SparseArray();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final SparseArray f8645e = new SparseArray();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final SparseArray f8646f = new SparseArray();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final SparseArray f8647g = new SparseArray();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public C0114b f8648h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public d f8649i;

        public h(int i9, int i10) {
            this.f8641a = i9;
            this.f8642b = i10;
        }

        public void a() {
            this.f8643c.clear();
            this.f8644d.clear();
            this.f8645e.clear();
            this.f8646f.clear();
            this.f8647g.clear();
            this.f8648h = null;
            this.f8649i = null;
        }
    }

    public b(int i9, int i10) {
        Paint paint = new Paint();
        this.f8597a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f8598b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f8599c = new Canvas();
        this.f8600d = new C0114b(719, 575, 0, 719, 0, 575);
        this.f8601e = new a(0, c(), d(), e());
        this.f8602f = new h(i9, i10);
    }

    public static byte[] a(int i9, int i10, L l9) {
        byte[] bArr = new byte[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bArr[i11] = (byte) l9.h(i10);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, DefaultRenderer.BACKGROUND_COLOR, -8421505};
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i9 = 1; i9 < 16; i9++) {
            if (i9 < 8) {
                iArr[i9] = f(255, (i9 & 1) != 0 ? 255 : 0, (i9 & 2) != 0 ? 255 : 0, (i9 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i9] = f(255, (i9 & 1) != 0 ? 127 : 0, (i9 & 2) != 0 ? 127 : 0, (i9 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[JceEncryptionConstants.SYMMETRIC_KEY_LENGTH];
        iArr[0] = 0;
        for (int i9 = 0; i9 < 256; i9++) {
            if (i9 < 8) {
                iArr[i9] = f(63, (i9 & 1) != 0 ? 255 : 0, (i9 & 2) != 0 ? 255 : 0, (i9 & 4) == 0 ? 0 : 255);
            } else {
                int i10 = i9 & 136;
                if (i10 == 0) {
                    iArr[i9] = f(255, ((i9 & 1) != 0 ? 85 : 0) + ((i9 & 16) != 0 ? 170 : 0), ((i9 & 2) != 0 ? 85 : 0) + ((i9 & 32) != 0 ? 170 : 0), ((i9 & 4) == 0 ? 0 : 85) + ((i9 & 64) == 0 ? 0 : 170));
                } else if (i10 == 8) {
                    iArr[i9] = f(127, ((i9 & 1) != 0 ? 85 : 0) + ((i9 & 16) != 0 ? 170 : 0), ((i9 & 2) != 0 ? 85 : 0) + ((i9 & 32) != 0 ? 170 : 0), ((i9 & 4) == 0 ? 0 : 85) + ((i9 & 64) == 0 ? 0 : 170));
                } else if (i10 == 128) {
                    iArr[i9] = f(255, ((i9 & 1) != 0 ? 43 : 0) + 127 + ((i9 & 16) != 0 ? 85 : 0), ((i9 & 2) != 0 ? 43 : 0) + 127 + ((i9 & 32) != 0 ? 85 : 0), ((i9 & 4) == 0 ? 0 : 43) + 127 + ((i9 & 64) == 0 ? 0 : 85));
                } else if (i10 == 136) {
                    iArr[i9] = f(255, ((i9 & 1) != 0 ? 43 : 0) + ((i9 & 16) != 0 ? 85 : 0), ((i9 & 2) != 0 ? 43 : 0) + ((i9 & 32) != 0 ? 85 : 0), ((i9 & 4) == 0 ? 0 : 43) + ((i9 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i9, int i10, int i11, int i12) {
        return (i9 << 24) | (i10 << 16) | (i11 << 8) | i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[LOOP:0: B:3:0x0009->B:33:0x007b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int g(d4.L r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L59
        L14:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.h(r6)
            int r4 = r4 + r6
        L20:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L59
        L28:
            boolean r4 = r13.g()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.h(r3)
            if (r4 == 0) goto L56
            if (r4 == r5) goto L52
            if (r4 == r3) goto L4a
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L59
        L41:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 29
            goto L20
        L4a:
            r4 = 4
            int r4 = r13.h(r4)
            int r4 = r4 + 12
            goto L20
        L52:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L59
        L56:
            r4 = 0
            r11 = 1
            goto L3f
        L59:
            if (r12 == 0) goto L77
            if (r8 == 0) goto L77
            if (r15 == 0) goto L61
            r4 = r15[r4]
        L61:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L77:
            int r10 = r10 + r12
            if (r11 == 0) goto L7b
            return r10
        L7b:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.g(d4.L, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087 A[LOOP:0: B:3:0x0009->B:36:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(d4.L r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.h(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L65
        L14:
            boolean r4 = r13.g()
            r6 = 3
            if (r4 != 0) goto L2b
            int r3 = r13.h(r6)
            if (r3 == 0) goto L27
            int r3 = r3 + 2
            r11 = r2
            r12 = r3
            r4 = 0
            goto L65
        L27:
            r4 = 0
            r11 = 1
        L29:
            r12 = 0
            goto L65
        L2b:
            boolean r4 = r13.g()
            r7 = 2
            if (r4 != 0) goto L3f
            int r4 = r13.h(r7)
            int r4 = r4 + r3
        L37:
            int r3 = r13.h(r3)
            r11 = r2
            r12 = r4
            r4 = r3
            goto L65
        L3f:
            int r4 = r13.h(r7)
            if (r4 == 0) goto L62
            if (r4 == r5) goto L5e
            if (r4 == r7) goto L57
            if (r4 == r6) goto L4e
            r11 = r2
            r4 = 0
            goto L29
        L4e:
            r4 = 8
            int r4 = r13.h(r4)
            int r4 = r4 + 25
            goto L37
        L57:
            int r4 = r13.h(r3)
            int r4 = r4 + 9
            goto L37
        L5e:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L65
        L62:
            r11 = r2
            r4 = 0
            goto L12
        L65:
            if (r12 == 0) goto L83
            if (r8 == 0) goto L83
            if (r15 == 0) goto L6d
            r4 = r15[r4]
        L6d:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L83:
            int r10 = r10 + r12
            if (r11 == 0) goto L87
            return r10
        L87:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.b.h(d4.L, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int i(L l9, int[] iArr, byte[] bArr, int i9, int i10, Paint paint, Canvas canvas) {
        boolean z9;
        int iH;
        int i11 = i9;
        boolean z10 = false;
        while (true) {
            int iH2 = l9.h(8);
            if (iH2 != 0) {
                z9 = z10;
                iH = 1;
            } else if (l9.g()) {
                z9 = z10;
                iH = l9.h(7);
                iH2 = l9.h(8);
            } else {
                int iH3 = l9.h(7);
                if (iH3 != 0) {
                    z9 = z10;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    iH2 = 0;
                    z9 = true;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i11, i10, i11 + iH, i10 + 1, paint);
            }
            i11 += iH;
            if (z9) {
                return i11;
            }
            z10 = z9;
        }
    }

    public static void j(byte[] bArr, int[] iArr, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        L l9 = new L(bArr);
        int iG = i10;
        int i12 = i11;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (l9.b() != 0) {
            int iH = l9.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        if (i9 == 3) {
                            bArr3 = bArrA == null ? f8595i : bArrA;
                        } else if (i9 != 2) {
                            bArr2 = null;
                            iG = g(l9, iArr, bArr2, iG, i12, paint, canvas);
                        } else {
                            bArr3 = bArrA3 == null ? f8594h : bArrA3;
                        }
                        bArr2 = bArr3;
                        iG = g(l9, iArr, bArr2, iG, i12, paint, canvas);
                        break;
                    case LangUtils.HASH_SEED /* 17 */:
                        iG = h(l9, iArr, i9 == 3 ? bArrA2 == null ? f8596j : bArrA2 : null, iG, i12, paint, canvas);
                        break;
                    case 18:
                        iG = i(l9, iArr, null, iG, i12, paint, canvas);
                        continue;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA3 = a(4, 4, l9);
                                break;
                            case 33:
                                bArrA = a(4, 8, l9);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, l9);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                l9.c();
            } else {
                i12 += 2;
                iG = i10;
            }
        }
    }

    public static void k(c cVar, a aVar, int i9, int i10, int i11, Paint paint, Canvas canvas) {
        int[] iArr = i9 == 3 ? aVar.f8607d : i9 == 2 ? aVar.f8606c : aVar.f8605b;
        j(cVar.f8616c, iArr, i9, i10, i11, paint, canvas);
        j(cVar.f8617d, iArr, i9, i10, i11 + 1, paint, canvas);
    }

    public static a l(L l9, int i9) {
        int iH;
        int i10;
        int iH2;
        int iH3;
        int iH4;
        int i11 = 8;
        int iH5 = l9.h(8);
        l9.r(8);
        int i12 = 2;
        int i13 = i9 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i13 > 0) {
            int iH6 = l9.h(i11);
            int iH7 = l9.h(i11);
            int[] iArr = (iH7 & 128) != 0 ? iArrC : (iH7 & 64) != 0 ? iArrD : iArrE;
            if ((iH7 & 1) != 0) {
                iH3 = l9.h(i11);
                iH4 = l9.h(i11);
                iH = l9.h(i11);
                iH2 = l9.h(i11);
                i10 = i13 - 6;
            } else {
                int iH8 = l9.h(6) << i12;
                int iH9 = l9.h(4) << 4;
                iH = l9.h(4) << 4;
                i10 = i13 - 4;
                iH2 = l9.h(i12) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH4 = 0;
                iH = 0;
                iH2 = 255;
            }
            double d9 = iH3;
            double d10 = iH4 - 128;
            double d11 = iH - 128;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), k0.r((int) (d9 + (1.402d * d10)), 0, 255), k0.r((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), k0.r((int) (d9 + (d11 * 1.772d)), 0, 255));
            i13 = i10;
            iH5 = iH5;
            i11 = 8;
            i12 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    public static C0114b m(L l9) {
        int i9;
        int iH;
        int i10;
        int i11;
        l9.r(4);
        boolean zG = l9.g();
        l9.r(3);
        int iH2 = l9.h(16);
        int iH3 = l9.h(16);
        if (zG) {
            int iH4 = l9.h(16);
            int iH5 = l9.h(16);
            int iH6 = l9.h(16);
            iH = l9.h(16);
            i9 = iH5;
            i11 = iH6;
            i10 = iH4;
        } else {
            i9 = iH2;
            iH = iH3;
            i10 = 0;
            i11 = 0;
        }
        return new C0114b(iH2, iH3, i10, i9, i11, iH);
    }

    public static c n(L l9) {
        byte[] bArr;
        int iH = l9.h(16);
        l9.r(4);
        int iH2 = l9.h(2);
        boolean zG = l9.g();
        l9.r(1);
        byte[] bArr2 = k0.f39782f;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = l9.h(16);
                int iH4 = l9.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    l9.k(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    l9.k(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        l9.r(l9.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    public static d o(L l9, int i9) {
        int iH = l9.h(8);
        int iH2 = l9.h(4);
        int iH3 = l9.h(2);
        l9.r(2);
        int i10 = i9 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i10 > 0) {
            int iH4 = l9.h(8);
            l9.r(8);
            i10 -= 6;
            sparseArray.put(iH4, new e(l9.h(16), l9.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    public static f p(L l9, int i9) {
        int iH;
        int iH2;
        int iH3 = l9.h(8);
        l9.r(4);
        boolean zG = l9.g();
        l9.r(3);
        int i10 = 16;
        int iH4 = l9.h(16);
        int iH5 = l9.h(16);
        int iH6 = l9.h(3);
        int iH7 = l9.h(3);
        int i11 = 2;
        l9.r(2);
        int iH8 = l9.h(8);
        int iH9 = l9.h(8);
        int iH10 = l9.h(4);
        int iH11 = l9.h(2);
        l9.r(2);
        int i12 = i9 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int iH12 = l9.h(i10);
            int iH13 = l9.h(i11);
            int iH14 = l9.h(i11);
            int iH15 = l9.h(12);
            int i13 = iH11;
            l9.r(4);
            int iH16 = l9.h(12);
            int i14 = i12 - 6;
            if (iH13 == 1 || iH13 == 2) {
                i12 -= 8;
                iH2 = l9.h(8);
                iH = l9.h(8);
            } else {
                i12 = i14;
                iH2 = 0;
                iH = 0;
            }
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            iH11 = i13;
            i11 = 2;
            i10 = 16;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    public static void q(L l9, h hVar) {
        f fVar;
        SparseArray sparseArray;
        a aVar;
        int i9;
        Object obj;
        c cVar;
        int iH = l9.h(8);
        int iH2 = l9.h(16);
        int iH3 = l9.h(16);
        int iD = l9.d() + iH3;
        if (iH3 * 8 > l9.b()) {
            AbstractC1681B.j("DvbParser", "Data field length exceeds limit");
            l9.r(l9.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.f8641a) {
                    d dVar = hVar.f8649i;
                    d dVarO = o(l9, iH3);
                    if (dVarO.f8620c != 0) {
                        hVar.f8649i = dVarO;
                        hVar.f8643c.clear();
                        hVar.f8644d.clear();
                        hVar.f8645e.clear();
                    } else if (dVar != null && dVar.f8619b != dVarO.f8619b) {
                        hVar.f8649i = dVarO;
                    }
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                d dVar2 = hVar.f8649i;
                if (iH2 == hVar.f8641a && dVar2 != null) {
                    f fVarP = p(l9, iH3);
                    if (dVar2.f8620c == 0 && (fVar = (f) hVar.f8643c.get(fVarP.f8624a)) != null) {
                        fVarP.a(fVar);
                    }
                    hVar.f8643c.put(fVarP.f8624a, fVarP);
                }
                break;
            case 18:
                if (iH2 == hVar.f8641a) {
                    a aVarL = l(l9, iH3);
                    sparseArray = hVar.f8644d;
                    aVar = aVarL;
                } else if (iH2 == hVar.f8642b) {
                    a aVarL2 = l(l9, iH3);
                    sparseArray = hVar.f8646f;
                    aVar = aVarL2;
                }
                i9 = aVar.f8604a;
                obj = aVar;
                sparseArray.put(i9, obj);
                break;
            case 19:
                if (iH2 == hVar.f8641a) {
                    c cVarN = n(l9);
                    sparseArray = hVar.f8645e;
                    cVar = cVarN;
                } else if (iH2 == hVar.f8642b) {
                    c cVarN2 = n(l9);
                    sparseArray = hVar.f8647g;
                    cVar = cVarN2;
                }
                i9 = cVar.f8614a;
                obj = cVar;
                sparseArray.put(i9, obj);
                break;
            case 20:
                if (iH2 == hVar.f8641a) {
                    hVar.f8648h = m(l9);
                }
                break;
        }
        l9.s(iD - l9.d());
    }

    public List b(byte[] bArr, int i9) {
        int i10;
        SparseArray sparseArray;
        L l9 = new L(bArr, i9);
        while (l9.b() >= 48 && l9.h(8) == 15) {
            q(l9, this.f8602f);
        }
        h hVar = this.f8602f;
        d dVar = hVar.f8649i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        C0114b c0114b = hVar.f8648h;
        if (c0114b == null) {
            c0114b = this.f8600d;
        }
        Bitmap bitmap = this.f8603g;
        if (bitmap == null || c0114b.f8608a + 1 != bitmap.getWidth() || c0114b.f8609b + 1 != this.f8603g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0114b.f8608a + 1, c0114b.f8609b + 1, Bitmap.Config.ARGB_8888);
            this.f8603g = bitmapCreateBitmap;
            this.f8599c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f8621d;
        for (int i11 = 0; i11 < sparseArray2.size(); i11++) {
            this.f8599c.save();
            e eVar = (e) sparseArray2.valueAt(i11);
            f fVar = (f) this.f8602f.f8643c.get(sparseArray2.keyAt(i11));
            int i12 = eVar.f8622a + c0114b.f8610c;
            int i13 = eVar.f8623b + c0114b.f8612e;
            this.f8599c.clipRect(i12, i13, Math.min(fVar.f8626c + i12, c0114b.f8611d), Math.min(fVar.f8627d + i13, c0114b.f8613f));
            a aVar = (a) this.f8602f.f8644d.get(fVar.f8630g);
            if (aVar == null && (aVar = (a) this.f8602f.f8646f.get(fVar.f8630g)) == null) {
                aVar = this.f8601e;
            }
            SparseArray sparseArray3 = fVar.f8634k;
            int i14 = 0;
            while (i14 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i14);
                g gVar = (g) sparseArray3.valueAt(i14);
                c cVar = (c) this.f8602f.f8645e.get(iKeyAt);
                c cVar2 = cVar == null ? (c) this.f8602f.f8647g.get(iKeyAt) : cVar;
                if (cVar2 != null) {
                    i10 = i14;
                    sparseArray = sparseArray3;
                    k(cVar2, aVar, fVar.f8629f, gVar.f8637c + i12, i13 + gVar.f8638d, cVar2.f8615b ? null : this.f8597a, this.f8599c);
                } else {
                    i10 = i14;
                    sparseArray = sparseArray3;
                }
                i14 = i10 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f8625b) {
                int i15 = fVar.f8629f;
                this.f8598b.setColor(i15 == 3 ? aVar.f8607d[fVar.f8631h] : i15 == 2 ? aVar.f8606c[fVar.f8632i] : aVar.f8605b[fVar.f8633j]);
                this.f8599c.drawRect(i12, i13, fVar.f8626c + i12, fVar.f8627d + i13, this.f8598b);
            }
            arrayList.add(new b.C0083b().f(Bitmap.createBitmap(this.f8603g, i12, i13, fVar.f8626c, fVar.f8627d)).k(i12 / c0114b.f8608a).l(0).h(i13 / c0114b.f8609b, 0).i(0).n(fVar.f8626c / c0114b.f8608a).g(fVar.f8627d / c0114b.f8609b).a());
            this.f8599c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f8599c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void r() {
        this.f8602f.a();
    }
}
