package s3;

import d4.AbstractC1684a;
import d4.M;
import java.nio.ByteBuffer;
import java.util.Arrays;
import q3.C2540a;
import q3.C2544e;
import q3.h;

/* JADX INFO: renamed from: s3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2708b extends h {
    @Override // q3.h
    public C2540a b(C2544e c2544e, ByteBuffer byteBuffer) {
        return new C2540a(c(new M(byteBuffer.array(), byteBuffer.limit())));
    }

    public C2707a c(M m9) {
        return new C2707a((String) AbstractC1684a.e(m9.B()), (String) AbstractC1684a.e(m9.B()), m9.A(), m9.A(), Arrays.copyOfRange(m9.e(), m9.f(), m9.g()));
    }
}
