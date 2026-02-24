package q1;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import p1.InterfaceC2388b;
import r1.C2655a;

/* JADX INFO: loaded from: classes.dex */
public class f extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseBody f46793a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BufferedSource f46794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HandlerC2529b f46795d;

    public class a extends ForwardingSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f46796a;

        public a(Source source) {
            super(source);
        }

        @Override // okio.ForwardingSource, okio.Source
        public long read(Buffer buffer, long j9) throws IOException {
            long j10 = super.read(buffer, j9);
            this.f46796a += j10 != -1 ? j10 : 0L;
            if (f.this.f46795d != null) {
                f.this.f46795d.obtainMessage(1, new C2655a(this.f46796a, f.this.f46793a.contentLength())).sendToTarget();
            }
            return j10;
        }
    }

    public f(ResponseBody responseBody, InterfaceC2388b interfaceC2388b) {
        this.f46793a = responseBody;
        if (interfaceC2388b != null) {
            this.f46795d = new HandlerC2529b(interfaceC2388b);
        }
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f46793a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f46793a.contentType();
    }

    public final Source d(Source source) {
        return new a(source);
    }

    @Override // okhttp3.ResponseBody
    public BufferedSource source() {
        if (this.f46794c == null) {
            this.f46794c = Okio.buffer(d(this.f46793a.source()));
        }
        return this.f46794c;
    }
}
