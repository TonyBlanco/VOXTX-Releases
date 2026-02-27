package P5;

import O5.AbstractC0945i;
import P5.e;
import com.amazonaws.services.s3.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class f implements P5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f7313d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f7314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f7316c;

    public class a implements e.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f7317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f7318b;

        public a(byte[] bArr, int[] iArr) {
            this.f7317a = bArr;
            this.f7318b = iArr;
        }

        @Override // P5.e.d
        public void a(InputStream inputStream, int i9) throws IOException {
            try {
                inputStream.read(this.f7317a, this.f7318b[0], i9);
                int[] iArr = this.f7318b;
                iArr[0] = iArr[0] + i9;
            } finally {
                inputStream.close();
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f7320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7321b;

        public b(byte[] bArr, int i9) {
            this.f7320a = bArr;
            this.f7321b = i9;
        }
    }

    public f(File file, int i9) {
        this.f7314a = file;
        this.f7315b = i9;
    }

    @Override // P5.a
    public void a() {
        AbstractC0945i.e(this.f7316c, "There was a problem closing the Crashlytics log file.");
        this.f7316c = null;
    }

    @Override // P5.a
    public String b() {
        byte[] bArrC = c();
        if (bArrC != null) {
            return new String(bArrC, f7313d);
        }
        return null;
    }

    @Override // P5.a
    public byte[] c() {
        b bVarG = g();
        if (bVarG == null) {
            return null;
        }
        int i9 = bVarG.f7321b;
        byte[] bArr = new byte[i9];
        System.arraycopy(bVarG.f7320a, 0, bArr, 0, i9);
        return bArr;
    }

    @Override // P5.a
    public void d() {
        a();
        this.f7314a.delete();
    }

    @Override // P5.a
    public void e(long j9, String str) {
        h();
        f(j9, str);
    }

    public final void f(long j9, String str) {
        if (this.f7316c == null) {
            return;
        }
        if (str == null) {
            str = Constants.NULL_VERSION_ID;
        }
        try {
            int i9 = this.f7315b / 4;
            if (str.length() > i9) {
                str = "..." + str.substring(str.length() - i9);
            }
            this.f7316c.g(String.format(Locale.US, "%d %s%n", Long.valueOf(j9), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f7313d));
            while (!this.f7316c.m() && this.f7316c.V() > this.f7315b) {
                this.f7316c.t();
            }
        } catch (IOException e9) {
            L5.f.f().e("There was a problem writing to the Crashlytics log.", e9);
        }
    }

    public final b g() {
        if (!this.f7314a.exists()) {
            return null;
        }
        h();
        e eVar = this.f7316c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.V()];
        try {
            this.f7316c.k(new a(bArr, iArr));
        } catch (IOException e9) {
            L5.f.f().e("A problem occurred while reading the Crashlytics log file.", e9);
        }
        return new b(bArr, iArr[0]);
    }

    public final void h() {
        if (this.f7316c == null) {
            try {
                this.f7316c = new e(this.f7314a);
            } catch (IOException e9) {
                L5.f.f().e("Could not open log file: " + this.f7314a, e9);
            }
        }
    }
}
