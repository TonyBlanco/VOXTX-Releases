package O5;

import java.io.File;

/* JADX INFO: renamed from: O5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0938b extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q5.B f6557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f6559c;

    public C0938b(Q5.B b9, String str, File file) {
        if (b9 == null) {
            throw new NullPointerException("Null report");
        }
        this.f6557a = b9;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f6558b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f6559c = file;
    }

    @Override // O5.r
    public Q5.B b() {
        return this.f6557a;
    }

    @Override // O5.r
    public File c() {
        return this.f6559c;
    }

    @Override // O5.r
    public String d() {
        return this.f6558b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f6557a.equals(rVar.b()) && this.f6558b.equals(rVar.d()) && this.f6559c.equals(rVar.c());
    }

    public int hashCode() {
        return ((((this.f6557a.hashCode() ^ 1000003) * 1000003) ^ this.f6558b.hashCode()) * 1000003) ^ this.f6559c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f6557a + ", sessionId=" + this.f6558b + ", reportFile=" + this.f6559c + "}";
    }
}
