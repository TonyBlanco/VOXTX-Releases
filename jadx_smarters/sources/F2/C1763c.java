package f2;

import S1.e;
import U1.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: f2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1763c implements e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40556c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f40557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f40558b;

    /* JADX INFO: renamed from: f2.c$a */
    public static class a {
        public InputStream a(File file) {
            return new FileInputStream(file);
        }
    }

    public C1763c(e eVar) {
        this(eVar, f40556c);
    }

    public C1763c(e eVar, a aVar) {
        this.f40557a = eVar;
        this.f40558b = aVar;
    }

    @Override // S1.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l a(File file, int i9, int i10) {
        InputStream inputStreamA = null;
        try {
            inputStreamA = this.f40558b.a(file);
            l lVarA = this.f40557a.a(inputStreamA, i9, i10);
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (IOException unused) {
                }
            }
            return lVarA;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // S1.e
    public String getId() {
        return "";
    }
}
