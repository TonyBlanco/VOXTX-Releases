package Q0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f7451a = new HashSet();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f7452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7453b;

        public a(Uri uri, boolean z9) {
            this.f7452a = uri;
            this.f7453b = z9;
        }

        public Uri a() {
            return this.f7452a;
        }

        public boolean b() {
            return this.f7453b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7453b == aVar.f7453b && this.f7452a.equals(aVar.f7452a);
        }

        public int hashCode() {
            return (this.f7452a.hashCode() * 31) + (this.f7453b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z9) {
        this.f7451a.add(new a(uri, z9));
    }

    public Set b() {
        return this.f7451a;
    }

    public int c() {
        return this.f7451a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f7451a.equals(((c) obj).f7451a);
    }

    public int hashCode() {
        return this.f7451a.hashCode();
    }
}
