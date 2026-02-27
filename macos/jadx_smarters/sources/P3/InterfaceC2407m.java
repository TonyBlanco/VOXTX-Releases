package p3;

import O2.C0936z0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: p3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC2407m {

    /* JADX INFO: renamed from: p3.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t f46291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f46292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0936z0 f46293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f46294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f46295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f46296f;

        public a(t tVar, MediaFormat mediaFormat, C0936z0 c0936z0, Surface surface, MediaCrypto mediaCrypto, int i9) {
            this.f46291a = tVar;
            this.f46292b = mediaFormat;
            this.f46293c = c0936z0;
            this.f46294d = surface;
            this.f46295e = mediaCrypto;
            this.f46296f = i9;
        }

        public static a a(t tVar, MediaFormat mediaFormat, C0936z0 c0936z0, MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, c0936z0, null, mediaCrypto, 0);
        }

        public static a b(t tVar, MediaFormat mediaFormat, C0936z0 c0936z0, Surface surface, MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, c0936z0, surface, mediaCrypto, 0);
        }
    }

    /* JADX INFO: renamed from: p3.m$b */
    public interface b {
        InterfaceC2407m a(a aVar);
    }

    /* JADX INFO: renamed from: p3.m$c */
    public interface c {
        void a(InterfaceC2407m interfaceC2407m, long j9, long j10);
    }

    void a(c cVar, Handler handler);

    MediaFormat b();

    void c(int i9, int i10, U2.c cVar, long j9, int i11);

    void d(int i9);

    ByteBuffer e(int i9);

    void f(Surface surface);

    void flush();

    void g(int i9, int i10, int i11, long j9, int i12);

    boolean h();

    void i(Bundle bundle);

    void j(int i9, long j9);

    int k();

    int l(MediaCodec.BufferInfo bufferInfo);

    void m(int i9, boolean z9);

    ByteBuffer n(int i9);

    void release();
}
