package q0;

import android.text.TextUtils;

/* JADX INFO: renamed from: q0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2525i implements InterfaceC2519c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f46761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46763c;

    public C2525i(String str, int i9, int i10) {
        this.f46761a = str;
        this.f46762b = i9;
        this.f46763c = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2525i)) {
            return false;
        }
        C2525i c2525i = (C2525i) obj;
        return (this.f46762b < 0 || c2525i.f46762b < 0) ? TextUtils.equals(this.f46761a, c2525i.f46761a) && this.f46763c == c2525i.f46763c : TextUtils.equals(this.f46761a, c2525i.f46761a) && this.f46762b == c2525i.f46762b && this.f46763c == c2525i.f46763c;
    }

    public int hashCode() {
        return O.c.b(this.f46761a, Integer.valueOf(this.f46763c));
    }
}
