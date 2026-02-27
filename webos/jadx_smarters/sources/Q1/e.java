package q1;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;
import r1.C2655a;

/* JADX INFO: loaded from: classes.dex */
public class e extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestBody f46787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BufferedSink f46788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f46789c;

    public class a extends ForwardingSink {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f46790a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f46791c;

        public a(Sink sink) {
            super(sink);
            this.f46790a = 0L;
            this.f46791c = 0L;
        }

        @Override // okio.ForwardingSink, okio.Sink
        public void write(Buffer buffer, long j9) throws IOException {
            super.write(buffer, j9);
            if (this.f46791c == 0) {
                this.f46791c = e.this.contentLength();
            }
            this.f46790a += j9;
            if (e.this.f46789c != null) {
                e.this.f46789c.obtainMessage(1, new C2655a(this.f46790a, this.f46791c)).sendToTarget();
            }
        }
    }

    public e(RequestBody requestBody, p1.f fVar) {
        this.f46787a = requestBody;
        if (fVar != null) {
            this.f46789c = new g(fVar);
        }
    }

    public final Sink b(Sink sink) {
        return new a(sink);
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.f46787a.contentLength();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f46787a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        if (this.f46788b == null) {
            this.f46788b = Okio.buffer(b(bufferedSink));
        }
        this.f46787a.writeTo(this.f46788b);
        this.f46788b.flush();
    }
}
