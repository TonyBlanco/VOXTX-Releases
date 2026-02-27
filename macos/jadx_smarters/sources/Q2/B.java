package Q2;

import O2.C0917s1;
import O2.C0936z0;
import P2.v0;
import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface B {

    public static final class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0936z0 f7523a;

        public a(String str, C0936z0 c0936z0) {
            super(str);
            this.f7523a = c0936z0;
        }

        public a(Throwable th, C0936z0 c0936z0) {
            super(th);
            this.f7523a = c0936z0;
        }
    }

    public static final class b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7524a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f7525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0936z0 f7526d;

        public b(int i9, int i10, int i11, int i12, C0936z0 c0936z0, boolean z9, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i9);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i10);
            sb.append(", ");
            sb.append(i11);
            sb.append(", ");
            sb.append(i12);
            sb.append(")");
            sb.append(" ");
            sb.append(c0936z0);
            sb.append(z9 ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.f7524a = i9;
            this.f7525c = z9;
            this.f7526d = c0936z0;
        }
    }

    public interface c {
        void a(boolean z9);

        void b(Exception exc);

        void c(long j9);

        void d();

        void e(int i9, long j9, long j10);

        void f();

        void g();

        void h();
    }

    public static final class d extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7527a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f7528c;

        public d(long j9, long j10) {
            super("Unexpected audio track timestamp discontinuity: expected " + j10 + ", got " + j9);
            this.f7527a = j9;
            this.f7528c = j10;
        }
    }

    public static final class e extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7529a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f7530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0936z0 f7531d;

        public e(int i9, C0936z0 c0936z0, boolean z9) {
            super("AudioTrack write failed: " + i9);
            this.f7530c = z9;
            this.f7529a = i9;
            this.f7531d = c0936z0;
        }
    }

    boolean a(C0936z0 c0936z0);

    void b(C0917s1 c0917s1);

    C0917s1 c();

    boolean d();

    void e(AudioDeviceInfo audioDeviceInfo);

    boolean f();

    void flush();

    void g(int i9);

    void h();

    void i(v0 v0Var);

    int j(C0936z0 c0936z0);

    void k(c cVar);

    boolean l(ByteBuffer byteBuffer, long j9, int i9);

    void m(F f9);

    void n();

    void o();

    long p(boolean z9);

    void pause();

    void play();

    void q(long j9);

    void r();

    void release();

    void reset();

    void s();

    void setVolume(float f9);

    void t(C1019e c1019e);

    void u(C0936z0 c0936z0, int i9, int[] iArr);

    void v(boolean z9);
}
