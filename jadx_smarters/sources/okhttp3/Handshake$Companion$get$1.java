package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Handshake$Companion$get$1 extends m implements w8.a {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Handshake$Companion$get$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // w8.a
    @NotNull
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
