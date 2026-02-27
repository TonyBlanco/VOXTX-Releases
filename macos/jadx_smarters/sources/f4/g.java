package f4;

import android.opengl.GLES20;
import android.util.Log;
import d4.AbstractC1704v;
import d4.C1703u;
import f4.e;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f40632j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f40633k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f40634l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f40635m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float[] f40636n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f40638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f40639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1703u f40640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f40642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f40644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f40645i;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f40646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f40647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f40648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f40649d;

        public a(e.b bVar) {
            this.f40646a = bVar.a();
            this.f40647b = AbstractC1704v.e(bVar.f40630c);
            this.f40648c = AbstractC1704v.e(bVar.f40631d);
            int i9 = bVar.f40629b;
            this.f40649d = i9 != 1 ? i9 != 2 ? 4 : 6 : 5;
        }
    }

    public static boolean c(e eVar) {
        e.a aVar = eVar.f40623a;
        e.a aVar2 = eVar.f40624b;
        return aVar.b() == 1 && aVar.a(0).f40628a == 0 && aVar2.b() == 1 && aVar2.a(0).f40628a == 0;
    }

    public void a(int i9, float[] fArr, boolean z9) {
        a aVar = z9 ? this.f40639c : this.f40638b;
        if (aVar == null) {
            return;
        }
        int i10 = this.f40637a;
        GLES20.glUniformMatrix3fv(this.f40642f, 1, false, i10 == 1 ? z9 ? f40634l : f40633k : i10 == 2 ? z9 ? f40636n : f40635m : f40632j, 0);
        GLES20.glUniformMatrix4fv(this.f40641e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i9);
        GLES20.glUniform1i(this.f40645i, 0);
        try {
            AbstractC1704v.b();
        } catch (AbstractC1704v.a e9) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e9);
        }
        GLES20.glVertexAttribPointer(this.f40643g, 3, 5126, false, 12, (Buffer) aVar.f40647b);
        try {
            AbstractC1704v.b();
        } catch (AbstractC1704v.a e10) {
            Log.e("ProjectionRenderer", "Failed to load position data", e10);
        }
        GLES20.glVertexAttribPointer(this.f40644h, 2, 5126, false, 8, (Buffer) aVar.f40648c);
        try {
            AbstractC1704v.b();
        } catch (AbstractC1704v.a e11) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e11);
        }
        GLES20.glDrawArrays(aVar.f40649d, 0, aVar.f40646a);
        try {
            AbstractC1704v.b();
        } catch (AbstractC1704v.a e12) {
            Log.e("ProjectionRenderer", "Failed to render", e12);
        }
    }

    public void b() {
        try {
            C1703u c1703u = new C1703u("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f40640d = c1703u;
            this.f40641e = c1703u.j("uMvpMatrix");
            this.f40642f = this.f40640d.j("uTexMatrix");
            this.f40643g = this.f40640d.e("aPosition");
            this.f40644h = this.f40640d.e("aTexCoords");
            this.f40645i = this.f40640d.j("uTexture");
        } catch (AbstractC1704v.a e9) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e9);
        }
    }

    public void d(e eVar) {
        if (c(eVar)) {
            this.f40637a = eVar.f40625c;
            a aVar = new a(eVar.f40623a.a(0));
            this.f40638b = aVar;
            if (!eVar.f40626d) {
                aVar = new a(eVar.f40624b.a(0));
            }
            this.f40639c = aVar;
        }
    }
}
