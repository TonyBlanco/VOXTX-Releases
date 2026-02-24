package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class SocketAsyncTimeout extends AsyncTimeout {
    private final Socket socket;

    public SocketAsyncTimeout(@NotNull Socket socket) {
        l.e(socket, "socket");
        this.socket = socket;
    }

    @Override // okio.AsyncTimeout
    @NotNull
    public IOException newTimeoutException(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // okio.AsyncTimeout
    public void timedOut() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Throwable th;
        try {
            this.socket.close();
        } catch (AssertionError e9) {
            if (!Okio.isAndroidGetsocknameError(e9)) {
                throw e9;
            }
            Logger logger2 = Okio__JvmOkioKt.logger;
            level = Level.WARNING;
            sb = new StringBuilder();
            th = e9;
            logger = logger2;
            sb.append("Failed to close timed out socket ");
            sb.append(this.socket);
            logger.log(level, sb.toString(), th);
        } catch (Exception e10) {
            Logger logger3 = Okio__JvmOkioKt.logger;
            level = Level.WARNING;
            sb = new StringBuilder();
            th = e10;
            logger = logger3;
            sb.append("Failed to close timed out socket ");
            sb.append(this.socket);
            logger.log(level, sb.toString(), th);
        }
    }
}
