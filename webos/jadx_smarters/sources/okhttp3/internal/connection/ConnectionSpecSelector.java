package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import okhttp3.ConnectionSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ConnectionSpecSelector {
    private final List<ConnectionSpec> connectionSpecs;
    private boolean isFallback;
    private boolean isFallbackPossible;
    private int nextModeIndex;

    public ConnectionSpecSelector(@NotNull List<ConnectionSpec> connectionSpecs) {
        l.e(connectionSpecs, "connectionSpecs");
        this.connectionSpecs = connectionSpecs;
    }

    private final boolean isFallbackPossible(SSLSocket sSLSocket) {
        int size = this.connectionSpecs.size();
        for (int i9 = this.nextModeIndex; i9 < size; i9++) {
            if (this.connectionSpecs.get(i9).isCompatible(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final ConnectionSpec configureSecureSocket(@NotNull SSLSocket sslSocket) throws IOException, CloneNotSupportedException {
        ConnectionSpec connectionSpec;
        l.e(sslSocket, "sslSocket");
        int i9 = this.nextModeIndex;
        int size = this.connectionSpecs.size();
        while (true) {
            if (i9 >= size) {
                connectionSpec = null;
                break;
            }
            connectionSpec = this.connectionSpecs.get(i9);
            i9++;
            if (connectionSpec.isCompatible(sslSocket)) {
                this.nextModeIndex = i9;
                break;
            }
        }
        if (connectionSpec != null) {
            this.isFallbackPossible = isFallbackPossible(sslSocket);
            connectionSpec.apply$okhttp(sslSocket, this.isFallback);
            return connectionSpec;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to find acceptable protocols. isFallback=");
        sb.append(this.isFallback);
        sb.append(',');
        sb.append(" modes=");
        sb.append(this.connectionSpecs);
        sb.append(',');
        sb.append(" supported protocols=");
        String[] enabledProtocols = sslSocket.getEnabledProtocols();
        l.b(enabledProtocols);
        String string = Arrays.toString(enabledProtocols);
        l.d(string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    public final boolean connectionFailed(@NotNull IOException e9) {
        l.e(e9, "e");
        this.isFallback = true;
        return (!this.isFallbackPossible || (e9 instanceof ProtocolException) || (e9 instanceof InterruptedIOException) || ((e9 instanceof SSLHandshakeException) && (e9.getCause() instanceof CertificateException)) || (e9 instanceof SSLPeerUnverifiedException) || !(e9 instanceof SSLException)) ? false : true;
    }
}
