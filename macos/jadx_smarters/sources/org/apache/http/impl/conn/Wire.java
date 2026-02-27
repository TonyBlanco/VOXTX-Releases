package org.apache.http.impl.conn;

import com.amplifyframework.core.model.ModelIdentifier;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.message.TokenParser;
import org.apache.http.util.Args;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
public class Wire {
    private final String id;
    private final Log log;

    public Wire(Log log) {
        this(log, "");
    }

    public Wire(Log log, String str) {
        this.log = log;
        this.id = str;
    }

    private void wire(String str, InputStream inputStream) throws IOException {
        String str2;
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i9 = inputStream.read();
            if (i9 == -1) {
                break;
            }
            if (i9 == 13) {
                str2 = "[\\r]";
            } else if (i9 == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                sb.insert(0, str);
                this.log.debug(this.id + " " + sb.toString());
                sb.setLength(0);
            } else if (i9 < 32 || i9 > 127) {
                sb.append("[0x");
                sb.append(Integer.toHexString(i9));
                str2 = "]";
            } else {
                sb.append((char) i9);
            }
            sb.append(str2);
        }
        if (sb.length() > 0) {
            sb.append(TokenParser.DQUOTE);
            sb.insert(0, TokenParser.DQUOTE);
            sb.insert(0, str);
            this.log.debug(this.id + " " + sb.toString());
        }
    }

    public boolean enabled() {
        return this.log.isDebugEnabled();
    }

    public void input(int i9) throws IOException {
        input(new byte[]{(byte) i9});
    }

    public void input(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Input");
        wire("<< ", inputStream);
    }

    public void input(String str) throws IOException {
        Args.notNull(str, "Input");
        input(str.getBytes());
    }

    public void input(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr));
    }

    public void input(byte[] bArr, int i9, int i10) throws IOException {
        Args.notNull(bArr, "Input");
        wire("<< ", new ByteArrayInputStream(bArr, i9, i10));
    }

    public void output(int i9) throws IOException {
        output(new byte[]{(byte) i9});
    }

    public void output(InputStream inputStream) throws IOException {
        Args.notNull(inputStream, "Output");
        wire(">> ", inputStream);
    }

    public void output(String str) throws IOException {
        Args.notNull(str, "Output");
        output(str.getBytes());
    }

    public void output(byte[] bArr) throws IOException {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr));
    }

    public void output(byte[] bArr, int i9, int i10) throws IOException {
        Args.notNull(bArr, "Output");
        wire(">> ", new ByteArrayInputStream(bArr, i9, i10));
    }
}
