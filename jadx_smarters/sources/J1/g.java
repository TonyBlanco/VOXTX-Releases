package J1;

import com.amazonaws.services.s3.internal.Constants;
import java.io.IOException;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f3012m = new String[128];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final BufferedSink f3013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f3014k = ":";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f3015l;

    static {
        for (int i9 = 0; i9 <= 31; i9++) {
            f3012m[i9] = String.format("\\u%04x", Integer.valueOf(i9));
        }
        String[] strArr = f3012m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public g(BufferedSink bufferedSink) {
        if (bufferedSink == null) {
            throw new NullPointerException("sink == null");
        }
        this.f3013j = bufferedSink;
        k(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void T(okio.BufferedSink r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = J1.g.f3012m
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.writeUtf8(r8, r4, r3)
        L2e:
            r7.writeUtf8(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.writeUtf8(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.g.T(okio.BufferedSink, java.lang.String):void");
    }

    public final void V() throws IOException {
        if (this.f3015l != null) {
            r();
            T(this.f3013j, this.f3015l);
            this.f3015l = null;
        }
    }

    @Override // J1.h
    public h a() throws IOException {
        V();
        return w(1, "[");
    }

    @Override // J1.h
    public h c() throws IOException {
        V();
        return w(3, "{");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f3013j.close();
        int i9 = this.f3016a;
        if (i9 > 1 || (i9 == 1 && this.f3017c[i9 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f3016a = 0;
    }

    @Override // J1.h
    public h d() {
        return t(1, 2, "]");
    }

    @Override // J1.h
    public h e() {
        this.f3023i = false;
        return t(3, 5, "}");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f3016a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f3013j.flush();
    }

    @Override // J1.h
    public h g(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        int i9 = this.f3016a;
        if (i9 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (this.f3015l != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f3015l = str;
        this.f3018d[i9 - 1] = str;
        this.f3023i = false;
        return this;
    }

    @Override // J1.h
    public h h() throws IOException {
        if (this.f3015l != null) {
            if (!this.f3022h) {
                this.f3015l = null;
                return this;
            }
            V();
        }
        s();
        this.f3013j.writeUtf8(Constants.NULL_VERSION_ID);
        int[] iArr = this.f3019e;
        int i9 = this.f3016a - 1;
        iArr[i9] = iArr[i9] + 1;
        return this;
    }

    @Override // J1.h
    public h n(Boolean bool) {
        return bool == null ? h() : q(bool.booleanValue());
    }

    @Override // J1.h
    public h o(Number number) throws IOException {
        if (number == null) {
            return h();
        }
        String string = number.toString();
        if (!this.f3021g && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f3023i) {
            return g(string);
        }
        V();
        s();
        this.f3013j.writeUtf8(string);
        int[] iArr = this.f3019e;
        int i9 = this.f3016a - 1;
        iArr[i9] = iArr[i9] + 1;
        return this;
    }

    @Override // J1.h
    public h p(String str) throws IOException {
        if (str == null) {
            return h();
        }
        if (this.f3023i) {
            return g(str);
        }
        V();
        s();
        T(this.f3013j, str);
        int[] iArr = this.f3019e;
        int i9 = this.f3016a - 1;
        iArr[i9] = iArr[i9] + 1;
        return this;
    }

    @Override // J1.h
    public h q(boolean z9) throws IOException {
        V();
        s();
        this.f3013j.writeUtf8(z9 ? "true" : "false");
        int[] iArr = this.f3019e;
        int i9 = this.f3016a - 1;
        iArr[i9] = iArr[i9] + 1;
        return this;
    }

    public final void r() throws IOException {
        int iJ = j();
        if (iJ == 5) {
            this.f3013j.writeByte(44);
        } else if (iJ != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        v();
        l(4);
    }

    public final void s() throws IOException {
        int iJ = j();
        if (iJ == 1) {
            l(2);
        } else {
            if (iJ != 2) {
                if (iJ == 4) {
                    this.f3013j.writeUtf8(this.f3014k);
                    l(5);
                    return;
                }
                if (iJ != 6) {
                    if (iJ != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f3021g) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                l(7);
                return;
            }
            this.f3013j.writeByte(44);
        }
        v();
    }

    public final h t(int i9, int i10, String str) throws IOException {
        int iJ = j();
        if (iJ != i10 && iJ != i9) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f3015l != null) {
            throw new IllegalStateException("Dangling name: " + this.f3015l);
        }
        int i11 = this.f3016a;
        int i12 = i11 - 1;
        this.f3016a = i12;
        this.f3018d[i12] = null;
        int[] iArr = this.f3019e;
        int i13 = i11 - 2;
        iArr[i13] = iArr[i13] + 1;
        if (iJ == i10) {
            v();
        }
        this.f3013j.writeUtf8(str);
        return this;
    }

    public final void v() throws IOException {
        if (this.f3020f == null) {
            return;
        }
        this.f3013j.writeByte(10);
        int i9 = this.f3016a;
        for (int i10 = 1; i10 < i9; i10++) {
            this.f3013j.writeUtf8(this.f3020f);
        }
    }

    public final h w(int i9, String str) throws IOException {
        s();
        k(i9);
        this.f3019e[this.f3016a - 1] = 0;
        this.f3013j.writeUtf8(str);
        return this;
    }
}
