package T1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9504b;

    public b(byte[] bArr, String str) {
        this.f9503a = bArr;
        this.f9504b = str;
    }

    @Override // T1.c
    public void a() {
    }

    @Override // T1.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InputStream b(O1.i iVar) {
        return new ByteArrayInputStream(this.f9503a);
    }

    @Override // T1.c
    public void cancel() {
    }

    @Override // T1.c
    public String getId() {
        return this.f9504b;
    }
}
