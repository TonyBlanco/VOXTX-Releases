package O5;

import Q5.B;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: O5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0943g implements B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6569c;

    public C0943g(String str, String str2, byte[] bArr) {
        this.f6568b = str;
        this.f6569c = str2;
        this.f6567a = bArr;
    }

    @Override // O5.B
    public B.d.b a() {
        byte[] bArrC = c();
        if (bArrC == null) {
            return null;
        }
        return B.d.b.a().b(bArrC).c(this.f6568b).a();
    }

    @Override // O5.B
    public String b() {
        return this.f6569c;
    }

    public final byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f6567a);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final boolean d() {
        byte[] bArr = this.f6567a;
        return bArr == null || bArr.length == 0;
    }

    @Override // O5.B
    public InputStream f() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f6567a);
    }
}
