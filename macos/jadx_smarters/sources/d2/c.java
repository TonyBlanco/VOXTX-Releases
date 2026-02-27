package D2;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M2.a f1333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M2.a f1334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1335d;

    public c(Context context, M2.a aVar, M2.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f1332a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f1333b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f1334c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f1335d = str;
    }

    @Override // D2.h
    public Context b() {
        return this.f1332a;
    }

    @Override // D2.h
    public String c() {
        return this.f1335d;
    }

    @Override // D2.h
    public M2.a d() {
        return this.f1334c;
    }

    @Override // D2.h
    public M2.a e() {
        return this.f1333b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f1332a.equals(hVar.b()) && this.f1333b.equals(hVar.e()) && this.f1334c.equals(hVar.d()) && this.f1335d.equals(hVar.c());
    }

    public int hashCode() {
        return ((((((this.f1332a.hashCode() ^ 1000003) * 1000003) ^ this.f1333b.hashCode()) * 1000003) ^ this.f1334c.hashCode()) * 1000003) ^ this.f1335d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f1332a + ", wallClock=" + this.f1333b + ", monotonicClock=" + this.f1334c + ", backendName=" + this.f1335d + "}";
    }
}
