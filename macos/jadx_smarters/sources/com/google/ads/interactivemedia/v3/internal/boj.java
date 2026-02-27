package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class boj implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f21840a = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f21841b = new String[128];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f21842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Writer f21843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f21844e = new int[32];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21845f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f21846g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21847h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21848i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f21849j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21850k;

    static {
        for (int i9 = 0; i9 <= 31; i9++) {
            f21841b[i9] = String.format("\\u%04x", Integer.valueOf(i9));
        }
        String[] strArr = f21841b;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f21842c = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public boj(Writer writer) {
        u(6);
        this.f21846g = ":";
        this.f21850k = true;
        bpd.v(writer, "out == null");
        this.f21843d = writer;
    }

    private final int a() {
        int i9 = this.f21845f;
        if (i9 != 0) {
            return this.f21844e[i9 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private final void t() throws IOException {
        int iA = a();
        if (iA == 1) {
            v(2);
            return;
        }
        if (iA == 2) {
            this.f21843d.append(',');
            return;
        }
        if (iA == 4) {
            this.f21843d.append((CharSequence) this.f21846g);
            v(5);
            return;
        }
        if (iA != 6) {
            if (iA != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.f21847h) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        v(7);
    }

    private final void u(int i9) {
        int i10 = this.f21845f;
        int[] iArr = this.f21844e;
        if (i10 == iArr.length) {
            this.f21844e = Arrays.copyOf(iArr, i10 + i10);
        }
        int[] iArr2 = this.f21844e;
        int i11 = this.f21845f;
        this.f21845f = i11 + 1;
        iArr2[i11] = i9;
    }

    private final void v(int i9) {
        this.f21844e[this.f21845f - 1] = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f21848i
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.boj.f21842c
            goto L9
        L7:
            java.lang.String[] r0 = com.google.ads.interactivemedia.v3.internal.boj.f21841b
        L9:
            java.io.Writer r1 = r8.f21843d
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f21843d
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f21843d
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f21843d
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f21843d
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.boj.w(java.lang.String):void");
    }

    private final void x() throws IOException {
        if (this.f21849j != null) {
            int iA = a();
            if (iA == 5) {
                this.f21843d.write(44);
            } else if (iA != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            v(4);
            w(this.f21849j);
            this.f21849j = null;
        }
    }

    private final void y(int i9, int i10, char c9) throws IOException {
        int iA = a();
        if (iA != i10 && iA != i9) {
            throw new IllegalStateException("Nesting problem.");
        }
        String str = this.f21849j;
        if (str != null) {
            throw new IllegalStateException("Dangling name: ".concat(str));
        }
        this.f21845f--;
        this.f21843d.write(c9);
    }

    private final void z(int i9, char c9) throws IOException {
        t();
        u(i9);
        this.f21843d.write(c9);
    }

    public void b() throws IOException {
        x();
        z(1, '[');
    }

    public void c() throws IOException {
        x();
        z(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21843d.close();
        int i9 = this.f21845f;
        if (i9 > 1 || (i9 == 1 && this.f21844e[0] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f21845f = 0;
    }

    public void d() throws IOException {
        y(1, 2, ']');
    }

    public void e() throws IOException {
        y(3, 5, '}');
    }

    public void f(String str) throws IOException {
        bpd.v(str, "name == null");
        if (this.f21849j != null) {
            throw new IllegalStateException();
        }
        if (this.f21845f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21849j = str;
    }

    public void flush() throws IOException {
        if (this.f21845f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f21843d.flush();
    }

    public void g() throws IOException {
        if (this.f21849j != null) {
            if (!this.f21850k) {
                this.f21849j = null;
                return;
            }
            x();
        }
        t();
        this.f21843d.write(Constants.NULL_VERSION_ID);
    }

    public void h(double d9) throws IOException {
        x();
        if (this.f21847h || !(Double.isNaN(d9) || Double.isInfinite(d9))) {
            t();
            this.f21843d.append((CharSequence) Double.toString(d9));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d9);
        }
    }

    public void i(long j9) throws IOException {
        x();
        t();
        this.f21843d.write(Long.toString(j9));
    }

    public void j(Boolean bool) throws IOException {
        if (bool == null) {
            g();
            return;
        }
        x();
        t();
        this.f21843d.write(true != bool.booleanValue() ? "false" : "true");
    }

    public void k(Number number) throws IOException {
        if (number == null) {
            g();
            return;
        }
        x();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f21840a.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        } else if (!this.f21847h) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        t();
        this.f21843d.append((CharSequence) string);
    }

    public void l(String str) throws IOException {
        if (str == null) {
            g();
            return;
        }
        x();
        t();
        w(str);
    }

    public void m(boolean z9) throws IOException {
        x();
        t();
        this.f21843d.write(true != z9 ? "false" : "true");
    }

    public final void n(boolean z9) {
        this.f21848i = z9;
    }

    public final void o(boolean z9) {
        this.f21847h = z9;
    }

    public final void p(boolean z9) {
        this.f21850k = z9;
    }

    public final boolean q() {
        return this.f21850k;
    }

    public final boolean r() {
        return this.f21848i;
    }

    public final boolean s() {
        return this.f21847h;
    }
}
