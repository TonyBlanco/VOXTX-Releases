package p3;

import android.media.MediaCodec;
import d4.k0;

/* JADX INFO: renamed from: p3.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2408n extends U2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f46297a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46298c;

    public C2408n(Throwable th, t tVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        sb.append(tVar == null ? null : tVar.f46299a);
        super(sb.toString(), th);
        this.f46297a = tVar;
        this.f46298c = k0.f39777a >= 21 ? a(th) : null;
    }

    public static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
