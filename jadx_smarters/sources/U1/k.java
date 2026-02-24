package U1;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class k implements S1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S1.c f9669b;

    public k(String str, S1.c cVar) {
        this.f9668a = str;
        this.f9669b = cVar;
    }

    @Override // S1.c
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f9668a.getBytes("UTF-8"));
        this.f9669b.a(messageDigest);
    }

    @Override // S1.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f9668a.equals(kVar.f9668a) && this.f9669b.equals(kVar.f9669b);
    }

    @Override // S1.c
    public int hashCode() {
        return (this.f9668a.hashCode() * 31) + this.f9669b.hashCode();
    }
}
