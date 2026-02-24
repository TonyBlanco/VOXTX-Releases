package C2;

import java.util.Set;
import z2.C3014b;
import z2.InterfaceC3017e;
import z2.InterfaceC3018f;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements InterfaceC3019g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f1020c;

    public q(Set set, p pVar, t tVar) {
        this.f1018a = set;
        this.f1019b = pVar;
        this.f1020c = tVar;
    }

    @Override // z2.InterfaceC3019g
    public InterfaceC3018f a(String str, Class cls, C3014b c3014b, InterfaceC3017e interfaceC3017e) {
        if (this.f1018a.contains(c3014b)) {
            return new s(this.f1019b, str, c3014b, interfaceC3017e, this.f1020c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c3014b, this.f1018a));
    }
}
