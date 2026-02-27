package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f14622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f14624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14625d;

    public c0(O o9, String str, Object[] objArr) {
        char cCharAt;
        this.f14622a = o9;
        this.f14623b = str;
        this.f14624c = objArr;
        int iCharAt = str.charAt(0);
        if (iCharAt >= 55296) {
            int i9 = iCharAt & 8191;
            int i10 = 13;
            int i11 = 1;
            while (true) {
                int i12 = i11 + 1;
                cCharAt = str.charAt(i11);
                if (cCharAt < 55296) {
                    break;
                }
                i9 |= (cCharAt & 8191) << i10;
                i10 += 13;
                i11 = i12;
            }
            iCharAt = i9 | (cCharAt << i10);
        }
        this.f14625d = iCharAt;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public boolean a() {
        return (this.f14625d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public O b() {
        return this.f14622a;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public Z c() {
        return (this.f14625d & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
    }

    public Object[] d() {
        return this.f14624c;
    }

    public String e() {
        return this.f14623b;
    }
}
