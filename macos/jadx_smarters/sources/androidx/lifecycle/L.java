package androidx.lifecycle;

import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static final AbstractC2215a a(N owner) {
        kotlin.jvm.internal.l.e(owner, "owner");
        if (!(owner instanceof InterfaceC1179i)) {
            return AbstractC2215a.C0379a.f44278b;
        }
        AbstractC2215a defaultViewModelCreationExtras = ((InterfaceC1179i) owner).getDefaultViewModelCreationExtras();
        kotlin.jvm.internal.l.d(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return defaultViewModelCreationExtras;
    }
}
