package J3;

import java.util.Collections;
import java.util.List;
import z3.InterfaceC3023C;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h implements InterfaceC3023C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3193c;

    public h(String str, List list, boolean z9) {
        this.f3191a = str;
        this.f3192b = Collections.unmodifiableList(list);
        this.f3193c = z9;
    }
}
