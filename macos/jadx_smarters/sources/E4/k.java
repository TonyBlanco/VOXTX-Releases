package e4;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.exoplayer2.decoder.VideoDecoderOutputBuffer;
import d4.AbstractC1684a;
import d4.AbstractC1704v;
import d4.C1703u;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends GLSurfaceView implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f40345c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f40346a;

    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final float[] f40347l = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final float[] f40348m = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final float[] f40349n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String[] f40350o = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final FloatBuffer f40351p = AbstractC1704v.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final GLSurfaceView f40352a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f40353c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f40354d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f40355e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f40356f = new int[3];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicReference f40357g = new AtomicReference();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final FloatBuffer[] f40358h = new FloatBuffer[3];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public C1703u f40359i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f40360j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public VideoDecoderOutputBuffer f40361k;

        public a(GLSurfaceView gLSurfaceView) {
            this.f40352a = gLSurfaceView;
            for (int i9 = 0; i9 < 3; i9++) {
                int[] iArr = this.f40355e;
                this.f40356f[i9] = -1;
                iArr[i9] = -1;
            }
        }

        public void a(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = (VideoDecoderOutputBuffer) this.f40357g.getAndSet(videoDecoderOutputBuffer);
            if (videoDecoderOutputBuffer2 != null) {
                videoDecoderOutputBuffer2.release();
            }
            this.f40352a.requestRender();
        }

        public final void b() {
            try {
                GLES20.glGenTextures(3, this.f40353c, 0);
                for (int i9 = 0; i9 < 3; i9++) {
                    GLES20.glUniform1i(this.f40359i.j(f40350o[i9]), i9);
                    GLES20.glActiveTexture(33984 + i9);
                    AbstractC1704v.a(3553, this.f40353c[i9]);
                }
                AbstractC1704v.b();
            } catch (AbstractC1704v.a e9) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e9);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.f40357g.getAndSet(null);
            if (videoDecoderOutputBuffer == null && this.f40361k == null) {
                return;
            }
            if (videoDecoderOutputBuffer != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.f40361k;
                if (videoDecoderOutputBuffer2 != null) {
                    videoDecoderOutputBuffer2.release();
                }
                this.f40361k = videoDecoderOutputBuffer;
            }
            VideoDecoderOutputBuffer videoDecoderOutputBuffer3 = (VideoDecoderOutputBuffer) AbstractC1684a.e(this.f40361k);
            float[] fArr = f40348m;
            int i9 = videoDecoderOutputBuffer3.colorspace;
            if (i9 == 1) {
                fArr = f40347l;
            } else if (i9 == 3) {
                fArr = f40349n;
            }
            GLES20.glUniformMatrix3fv(this.f40360j, 1, false, fArr, 0);
            int[] iArr = (int[]) AbstractC1684a.e(videoDecoderOutputBuffer3.yuvStrides);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) AbstractC1684a.e(videoDecoderOutputBuffer3.yuvPlanes);
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = videoDecoderOutputBuffer3.height;
                if (i10 != 0) {
                    i11 = (i11 + 1) / 2;
                }
                int i12 = i11;
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, this.f40353c[i10]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i10], i12, 0, 6409, 5121, byteBufferArr[i10]);
            }
            int i13 = videoDecoderOutputBuffer3.width;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f40355e[i15] != iArr2[i15] || this.f40356f[i15] != iArr[i15]) {
                    AbstractC1684a.g(iArr[i15] != 0);
                    float f9 = iArr2[i15] / iArr[i15];
                    this.f40358h[i15] = AbstractC1704v.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f9, 0.0f, f9, 1.0f});
                    GLES20.glVertexAttribPointer(this.f40354d[i15], 2, 5126, false, 0, (Buffer) this.f40358h[i15]);
                    this.f40355e[i15] = iArr2[i15];
                    this.f40356f[i15] = iArr[i15];
                }
            }
            GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                AbstractC1704v.b();
            } catch (AbstractC1704v.a e9) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e9);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i9, int i10) {
            GLES20.glViewport(0, 0, i9, i10);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C1703u c1703u = new C1703u("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f40359i = c1703u;
                GLES20.glVertexAttribPointer(c1703u.e("in_pos"), 2, 5126, false, 0, (Buffer) f40351p);
                this.f40354d[0] = this.f40359i.e("in_tc_y");
                this.f40354d[1] = this.f40359i.e("in_tc_u");
                this.f40354d[2] = this.f40359i.e("in_tc_v");
                this.f40360j = this.f40359i.j("mColorConversion");
                AbstractC1704v.b();
                b();
                AbstractC1704v.b();
            } catch (AbstractC1704v.a e9) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e9);
            }
        }
    }

    public k(Context context) {
        this(context, null);
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f40346a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public l getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // e4.l
    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        this.f40346a.a(videoDecoderOutputBuffer);
    }
}
