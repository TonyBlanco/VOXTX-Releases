package O5;

import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: O5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0952p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T5.f f6652b;

    public C0952p(String str, T5.f fVar) {
        this.f6651a = str;
        this.f6652b = fVar;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e9) {
            L5.f.f().e("Error creating marker: " + this.f6651a, e9);
            return false;
        }
    }

    public final File b() {
        return this.f6652b.e(this.f6651a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
