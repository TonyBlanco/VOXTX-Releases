package M4;

import s.C2701g;

/* JADX INFO: loaded from: classes3.dex */
public final class Z1 extends C2701g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0722c2 f4567a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z1(C0722c2 c0722c2, int i9) {
        super(20);
        this.f4567a = c0722c2;
    }

    @Override // s.C2701g
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        com.google.android.gms.common.internal.r.g(str);
        return C0722c2.s(this.f4567a, str);
    }
}
