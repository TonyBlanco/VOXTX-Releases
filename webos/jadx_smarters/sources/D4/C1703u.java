package d4;

import android.opengl.GLES20;
import d4.AbstractC1704v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: d4.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1703u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a[] f39817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b[] f39818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f39819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f39820e;

    /* JADX INFO: renamed from: d4.u$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39823c;

        public a(String str, int i9, int i10) {
            this.f39821a = str;
            this.f39822b = i9;
            this.f39823c = i10;
        }

        public static a a(int i9, int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i9, 35722, iArr, 0);
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveAttrib(i9, i10, i11, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, C1703u.h(bArr));
            return new a(str, i10, C1703u.f(i9, str));
        }
    }

    /* JADX INFO: renamed from: d4.u$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f39825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f39826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f39827d = new float[16];

        public b(String str, int i9, int i10) {
            this.f39824a = str;
            this.f39825b = i9;
            this.f39826c = i10;
        }

        public static b a(int i9, int i10) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i9, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i11 = iArr[0];
            byte[] bArr = new byte[i11];
            GLES20.glGetActiveUniform(i9, i10, i11, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, C1703u.h(bArr));
            return new b(str, C1703u.i(i9, str), iArr2[0]);
        }
    }

    public C1703u(String str, String str2) throws AbstractC1704v.a {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f39816a = iGlCreateProgram;
        AbstractC1704v.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        AbstractC1704v.c(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f39819d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f39817b = new a[iArr2[0]];
        for (int i9 = 0; i9 < iArr2[0]; i9++) {
            a aVarA = a.a(this.f39816a, i9);
            this.f39817b[i9] = aVarA;
            this.f39819d.put(aVarA.f39821a, aVarA);
        }
        this.f39820e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f39816a, 35718, iArr3, 0);
        this.f39818c = new b[iArr3[0]];
        for (int i10 = 0; i10 < iArr3[0]; i10++) {
            b bVarA = b.a(this.f39816a, i10);
            this.f39818c[i10] = bVarA;
            this.f39820e.put(bVarA.f39824a, bVarA);
        }
        AbstractC1704v.b();
    }

    public static void d(int i9, int i10, String str) throws AbstractC1704v.a {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC1704v.c(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: " + str);
        GLES20.glAttachShader(i9, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC1704v.b();
    }

    public static int f(int i9, String str) {
        return GLES20.glGetAttribLocation(i9, str);
    }

    public static int h(byte[] bArr) {
        for (int i9 = 0; i9 < bArr.length; i9++) {
            if (bArr[i9] == 0) {
                return i9;
            }
        }
        return bArr.length;
    }

    public static int i(int i9, String str) {
        return GLES20.glGetUniformLocation(i9, str);
    }

    public int e(String str) throws AbstractC1704v.a {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        AbstractC1704v.b();
        return iG;
    }

    public final int g(String str) {
        return f(this.f39816a, str);
    }

    public int j(String str) {
        return i(this.f39816a, str);
    }
}
