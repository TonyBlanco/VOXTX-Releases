package L;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class r implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f3867a;

    public r(Object obj) {
        this.f3867a = q.a(obj);
    }

    @Override // L.k
    public String a() {
        return this.f3867a.toLanguageTags();
    }

    @Override // L.k
    public Object b() {
        return this.f3867a;
    }

    public boolean equals(Object obj) {
        return this.f3867a.equals(((k) obj).b());
    }

    @Override // L.k
    public Locale get(int i9) {
        return this.f3867a.get(i9);
    }

    public int hashCode() {
        return this.f3867a.hashCode();
    }

    @Override // L.k
    public boolean isEmpty() {
        return this.f3867a.isEmpty();
    }

    @Override // L.k
    public int size() {
        return this.f3867a.size();
    }

    public String toString() {
        return this.f3867a.toString();
    }
}
