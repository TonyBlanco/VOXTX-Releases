package G;

import android.graphics.Path;
import android.util.Log;
import com.amplifyframework.core.model.ModelIdentifier;
import java.util.ArrayList;
import org.apache.commons.codec.binary.BaseNCodec;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2110b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public char f2111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float[] f2112b;

        public b(char c9, float[] fArr) {
            this.f2111a = c9;
            this.f2112b = fArr;
        }

        public b(b bVar) {
            this.f2111a = bVar.f2111a;
            float[] fArr = bVar.f2112b;
            this.f2112b = e.c(fArr, 0, fArr.length);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void a(Path path, float[] fArr, char c9, char c10, float[] fArr2) {
            int i9;
            int i10;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            char c11 = c10;
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr[2];
            float f20 = fArr[3];
            float f21 = fArr[4];
            float f22 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i9 = 7;
                    break;
                case 'C':
                case 'c':
                    i9 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i9 = 1;
                    break;
                case BaseNCodec.MIME_CHUNK_SIZE /* 76 */:
                case IjkMediaMeta.FF_PROFILE_H264_MAIN /* 77 */:
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i9 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i9 = 4;
                    break;
                case 'Z':
                case IjkMediaMeta.FF_PROFILE_H264_HIGH_422 /* 122 */:
                    path.close();
                    path.moveTo(f21, f22);
                    f17 = f21;
                    f19 = f17;
                    f18 = f22;
                    f20 = f18;
                    i9 = 2;
                    break;
            }
            float f23 = f17;
            float f24 = f18;
            float f25 = f21;
            float f26 = f22;
            int i11 = 0;
            char c12 = c9;
            while (i11 < fArr2.length) {
                if (c11 != 'A') {
                    if (c11 == 'C') {
                        i10 = i11;
                        int i12 = i10 + 2;
                        int i13 = i10 + 3;
                        int i14 = i10 + 4;
                        int i15 = i10 + 5;
                        path.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i12], fArr2[i13], fArr2[i14], fArr2[i15]);
                        f23 = fArr2[i14];
                        float f27 = fArr2[i15];
                        float f28 = fArr2[i12];
                        float f29 = fArr2[i13];
                        f24 = f27;
                        f20 = f29;
                        f19 = f28;
                    } else if (c11 == 'H') {
                        i10 = i11;
                        path.lineTo(fArr2[i10], f24);
                        f23 = fArr2[i10];
                    } else if (c11 == 'Q') {
                        i10 = i11;
                        int i16 = i10 + 1;
                        int i17 = i10 + 2;
                        int i18 = i10 + 3;
                        path.quadTo(fArr2[i10], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f30 = fArr2[i10];
                        float f31 = fArr2[i16];
                        f23 = fArr2[i17];
                        f24 = fArr2[i18];
                        f19 = f30;
                        f20 = f31;
                    } else if (c11 == 'V') {
                        i10 = i11;
                        path.lineTo(f23, fArr2[i10]);
                        f24 = fArr2[i10];
                    } else if (c11 != 'a') {
                        if (c11 != 'c') {
                            if (c11 == 'h') {
                                path.rLineTo(fArr2[i11], 0.0f);
                                f23 += fArr2[i11];
                            } else if (c11 != 'q') {
                                if (c11 == 'v') {
                                    path.rLineTo(0.0f, fArr2[i11]);
                                    f12 = fArr2[i11];
                                } else if (c11 == 'L') {
                                    int i19 = i11 + 1;
                                    path.lineTo(fArr2[i11], fArr2[i19]);
                                    f23 = fArr2[i11];
                                    f24 = fArr2[i19];
                                } else if (c11 == 'M') {
                                    f23 = fArr2[i11];
                                    f24 = fArr2[i11 + 1];
                                    if (i11 > 0) {
                                        path.lineTo(f23, f24);
                                    } else {
                                        path.moveTo(f23, f24);
                                        i10 = i11;
                                        f26 = f24;
                                        f25 = f23;
                                    }
                                } else if (c11 == 'S') {
                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                        f23 = (f23 * 2.0f) - f19;
                                        f24 = (f24 * 2.0f) - f20;
                                    }
                                    float f32 = f24;
                                    float f33 = f23;
                                    int i20 = i11 + 1;
                                    int i21 = i11 + 2;
                                    int i22 = i11 + 3;
                                    path.cubicTo(f33, f32, fArr2[i11], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f9 = fArr2[i11];
                                    f10 = fArr2[i20];
                                    f23 = fArr2[i21];
                                    f24 = fArr2[i22];
                                    f19 = f9;
                                    f20 = f10;
                                } else if (c11 == 'T') {
                                    if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                        f23 = (f23 * 2.0f) - f19;
                                        f24 = (f24 * 2.0f) - f20;
                                    }
                                    int i23 = i11 + 1;
                                    path.quadTo(f23, f24, fArr2[i11], fArr2[i23]);
                                    i10 = i11;
                                    f20 = f24;
                                    f19 = f23;
                                    f23 = fArr2[i11];
                                    f24 = fArr2[i23];
                                } else if (c11 == 'l') {
                                    int i24 = i11 + 1;
                                    path.rLineTo(fArr2[i11], fArr2[i24]);
                                    f23 += fArr2[i11];
                                    f12 = fArr2[i24];
                                } else if (c11 == 'm') {
                                    float f34 = fArr2[i11];
                                    f23 += f34;
                                    float f35 = fArr2[i11 + 1];
                                    f24 += f35;
                                    if (i11 > 0) {
                                        path.rLineTo(f34, f35);
                                    } else {
                                        path.rMoveTo(f34, f35);
                                        i10 = i11;
                                        f26 = f24;
                                        f25 = f23;
                                    }
                                } else if (c11 == 's') {
                                    if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                        float f36 = f23 - f19;
                                        f13 = f24 - f20;
                                        f14 = f36;
                                    } else {
                                        f14 = 0.0f;
                                        f13 = 0.0f;
                                    }
                                    int i25 = i11 + 1;
                                    int i26 = i11 + 2;
                                    int i27 = i11 + 3;
                                    path.rCubicTo(f14, f13, fArr2[i11], fArr2[i25], fArr2[i26], fArr2[i27]);
                                    f9 = fArr2[i11] + f23;
                                    f10 = fArr2[i25] + f24;
                                    f23 += fArr2[i26];
                                    f11 = fArr2[i27];
                                } else if (c11 == 't') {
                                    if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                        f15 = f23 - f19;
                                        f16 = f24 - f20;
                                    } else {
                                        f16 = 0.0f;
                                        f15 = 0.0f;
                                    }
                                    int i28 = i11 + 1;
                                    path.rQuadTo(f15, f16, fArr2[i11], fArr2[i28]);
                                    float f37 = f15 + f23;
                                    float f38 = f16 + f24;
                                    f23 += fArr2[i11];
                                    f24 += fArr2[i28];
                                    f20 = f38;
                                    f19 = f37;
                                }
                                f24 += f12;
                            } else {
                                int i29 = i11 + 1;
                                int i30 = i11 + 2;
                                int i31 = i11 + 3;
                                path.rQuadTo(fArr2[i11], fArr2[i29], fArr2[i30], fArr2[i31]);
                                f9 = fArr2[i11] + f23;
                                f10 = fArr2[i29] + f24;
                                f23 += fArr2[i30];
                                f11 = fArr2[i31];
                            }
                            i10 = i11;
                        } else {
                            int i32 = i11 + 2;
                            int i33 = i11 + 3;
                            int i34 = i11 + 4;
                            int i35 = i11 + 5;
                            path.rCubicTo(fArr2[i11], fArr2[i11 + 1], fArr2[i32], fArr2[i33], fArr2[i34], fArr2[i35]);
                            f9 = fArr2[i32] + f23;
                            f10 = fArr2[i33] + f24;
                            f23 += fArr2[i34];
                            f11 = fArr2[i35];
                        }
                        f24 += f11;
                        f19 = f9;
                        f20 = f10;
                        i10 = i11;
                    } else {
                        int i36 = i11 + 5;
                        int i37 = i11 + 6;
                        i10 = i11;
                        c(path, f23, f24, fArr2[i36] + f23, fArr2[i37] + f24, fArr2[i11], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                        f23 += fArr2[i36];
                        f24 += fArr2[i37];
                    }
                    i11 = i10 + i9;
                    c12 = c10;
                    c11 = c12;
                } else {
                    i10 = i11;
                    int i38 = i10 + 5;
                    int i39 = i10 + 6;
                    c(path, f23, f24, fArr2[i38], fArr2[i39], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != 0.0f, fArr2[i10 + 4] != 0.0f);
                    f23 = fArr2[i38];
                    f24 = fArr2[i39];
                }
                f20 = f24;
                f19 = f23;
                i11 = i10 + i9;
                c12 = c10;
                c11 = c12;
            }
            fArr[0] = f23;
            fArr[1] = f24;
            fArr[2] = f19;
            fArr[3] = f20;
            fArr[4] = f25;
            fArr[5] = f26;
        }

        public static void b(Path path, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
            double d18 = d11;
            int iCeil = (int) Math.ceil(Math.abs((d17 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d15);
            double dSin = Math.sin(d15);
            double dCos2 = Math.cos(d16);
            double dSin2 = Math.sin(d16);
            double d19 = -d18;
            double d20 = d19 * dCos;
            double d21 = d12 * dSin;
            double d22 = (d20 * dSin2) - (d21 * dCos2);
            double d23 = d19 * dSin;
            double d24 = d12 * dCos;
            double d25 = (dSin2 * d23) + (dCos2 * d24);
            double d26 = d17 / ((double) iCeil);
            double d27 = d16;
            double d28 = d25;
            double d29 = d22;
            int i9 = 0;
            double d30 = d13;
            double d31 = d14;
            while (i9 < iCeil) {
                double d32 = d27 + d26;
                double dSin3 = Math.sin(d32);
                double dCos3 = Math.cos(d32);
                double d33 = (d9 + ((d18 * dCos) * dCos3)) - (d21 * dSin3);
                double d34 = d10 + (d18 * dSin * dCos3) + (d24 * dSin3);
                double d35 = (d20 * dSin3) - (d21 * dCos3);
                double d36 = (dSin3 * d23) + (dCos3 * d24);
                double d37 = d32 - d27;
                double dTan = Math.tan(d37 / 2.0d);
                double dSin4 = (Math.sin(d37) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d38 = d30 + (d29 * dSin4);
                double d39 = dCos;
                double d40 = dSin;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d38, (float) (d31 + (d28 * dSin4)), (float) (d33 - (dSin4 * d35)), (float) (d34 - (dSin4 * d36)), (float) d33, (float) d34);
                i9++;
                d26 = d26;
                dSin = d40;
                d30 = d33;
                d23 = d23;
                dCos = d39;
                d27 = d32;
                d28 = d36;
                d29 = d35;
                iCeil = iCeil;
                d31 = d34;
                d18 = d11;
            }
        }

        public static void c(Path path, float f9, float f10, float f11, float f12, float f13, float f14, float f15, boolean z9, boolean z10) {
            double d9;
            double d10;
            double radians = Math.toRadians(f15);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d11 = f9;
            double d12 = d11 * dCos;
            double d13 = f10;
            double d14 = f13;
            double d15 = (d12 + (d13 * dSin)) / d14;
            double d16 = (((double) (-f9)) * dSin) + (d13 * dCos);
            double d17 = f14;
            double d18 = d16 / d17;
            double d19 = f12;
            double d20 = ((((double) f11) * dCos) + (d19 * dSin)) / d14;
            double d21 = ((((double) (-f11)) * dSin) + (d19 * dCos)) / d17;
            double d22 = d15 - d20;
            double d23 = d18 - d21;
            double d24 = (d15 + d20) / 2.0d;
            double d25 = (d18 + d21) / 2.0d;
            double d26 = (d22 * d22) + (d23 * d23);
            if (d26 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d27 = (1.0d / d26) - 0.25d;
            if (d27 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d26);
                float fSqrt = (float) (Math.sqrt(d26) / 1.99999d);
                c(path, f9, f10, f11, f12, f13 * fSqrt, f14 * fSqrt, f15, z9, z10);
                return;
            }
            double dSqrt = Math.sqrt(d27);
            double d28 = d22 * dSqrt;
            double d29 = dSqrt * d23;
            if (z9 == z10) {
                d9 = d24 - d29;
                d10 = d25 + d28;
            } else {
                d9 = d24 + d29;
                d10 = d25 - d28;
            }
            double dAtan2 = Math.atan2(d18 - d10, d15 - d9);
            double dAtan22 = Math.atan2(d21 - d10, d20 - d9) - dAtan2;
            if (z10 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d30 = d9 * d14;
            double d31 = d10 * d17;
            b(path, (d30 * dCos) - (d31 * dSin), (d30 * dSin) + (d31 * dCos), d14, d17, d11, d13, radians, dAtan2, dAtan22);
        }

        public static void e(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c9 = 'm';
            for (int i9 = 0; i9 < bVarArr.length; i9++) {
                b bVar = bVarArr[i9];
                a(path, fArr, c9, bVar.f2111a, bVar.f2112b);
                c9 = bVarArr[i9].f2111a;
            }
        }

        public void d(b bVar, b bVar2, float f9) {
            this.f2111a = bVar.f2111a;
            int i9 = 0;
            while (true) {
                float[] fArr = bVar.f2112b;
                if (i9 >= fArr.length) {
                    return;
                }
                this.f2112b[i9] = (fArr[i9] * (1.0f - f9)) + (bVar2.f2112b[i9] * f9);
                i9++;
            }
        }
    }

    public static void a(ArrayList arrayList, char c9, float[] fArr) {
        arrayList.add(new b(c9, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i9 = 0; i9 < bVarArr.length; i9++) {
            b bVar = bVarArr[i9];
            char c9 = bVar.f2111a;
            b bVar2 = bVarArr2[i9];
            if (c9 != bVar2.f2111a || bVar.f2112b.length != bVar2.f2112b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] c(float[] fArr, int i9, int i10) {
        if (i9 > i10) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i9 < 0 || i9 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i11 = i10 - i9;
        int iMin = Math.min(i11, length - i9);
        float[] fArr2 = new float[i11];
        System.arraycopy(fArr, i9, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i9 = 1;
        int i10 = 0;
        while (i9 < str.length()) {
            int i11 = i(str, i9);
            String strTrim = str.substring(i10, i11).trim();
            if (strTrim.length() > 0) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i10 = i11;
            i9 = i11 + 1;
        }
        if (i9 - i10 == 1 && i10 < str.length()) {
            a(arrayList, str.charAt(i10), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    public static Path e(String str) {
        Path path = new Path();
        b[] bVarArrD = d(str);
        if (bVarArrD == null) {
            return null;
        }
        try {
            b.e(bVarArrD, path);
            return path;
        } catch (RuntimeException e9) {
            throw new RuntimeException("Error in parsing " + str, e9);
        }
    }

    public static b[] f(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i9 = 0; i9 < bVarArr.length; i9++) {
            bVarArr2[i9] = new b(bVarArr[i9]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037 A[LOOP:0: B:3:0x0007->B:24:0x0037, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.lang.String r8, int r9, G.e.a r10) {
        /*
            r0 = 0
            r10.f2110b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3a
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L34
        L27:
            r10.f2110b = r7
        L29:
            r2 = 0
            r4 = 1
            goto L34
        L2c:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            goto L27
        L31:
            r2 = 0
            goto L34
        L33:
            r2 = 1
        L34:
            if (r4 == 0) goto L37
            goto L3a
        L37:
            int r1 = r1 + 1
            goto L7
        L3a:
            r10.f2109a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G.e.g(java.lang.String, int, G.e$a):void");
    }

    public static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i9 = 1;
            int i10 = 0;
            while (i9 < length) {
                g(str, i9, aVar);
                int i11 = aVar.f2109a;
                if (i9 < i11) {
                    fArr[i10] = Float.parseFloat(str.substring(i9, i11));
                    i10++;
                }
                i9 = aVar.f2110b ? i11 : i11 + 1;
            }
            return c(fArr, 0, i10);
        } catch (NumberFormatException e9) {
            throw new RuntimeException("error in parsing \"" + str + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, e9);
        }
    }

    public static int i(String str, int i9) {
        while (i9 < str.length()) {
            char cCharAt = str.charAt(i9);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i9;
            }
            i9++;
        }
        return i9;
    }

    public static void j(b[] bVarArr, b[] bVarArr2) {
        for (int i9 = 0; i9 < bVarArr2.length; i9++) {
            bVarArr[i9].f2111a = bVarArr2[i9].f2111a;
            int i10 = 0;
            while (true) {
                float[] fArr = bVarArr2[i9].f2112b;
                if (i10 < fArr.length) {
                    bVarArr[i9].f2112b[i10] = fArr[i10];
                    i10++;
                }
            }
        }
    }
}
