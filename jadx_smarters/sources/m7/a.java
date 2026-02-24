package M7;

import com.onesignal.F1;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F1.v f5218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5219b;

    public a(F1.v level, String entry) {
        l.e(level, "level");
        l.e(entry, "entry");
        this.f5218a = level;
        this.f5219b = entry;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5218a == aVar.f5218a && l.a(this.f5219b, aVar.f5219b);
    }

    public int hashCode() {
        return (this.f5218a.hashCode() * 31) + this.f5219b.hashCode();
    }

    public String toString() {
        return "OneSignalLogEvent(level=" + this.f5218a + ", entry=" + this.f5219b + ')';
    }
}
