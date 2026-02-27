package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.s;

/* JADX INFO: loaded from: classes.dex */
public class m extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f16419a;

    public m(t tVar) {
        this.f16419a = tVar;
    }

    @Override // androidx.navigation.s
    public boolean e() {
        return true;
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public l a() {
        return new l(this);
    }

    @Override // androidx.navigation.s
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k b(l lVar, Bundle bundle, p pVar, s.a aVar) {
        int iE = lVar.E();
        if (iE == 0) {
            throw new IllegalStateException("no start destination defined via app:startDestination for " + lVar.g());
        }
        k kVarB = lVar.B(iE, false);
        if (kVarB != null) {
            return this.f16419a.e(kVarB.l()).b(kVarB, kVarB.c(bundle), pVar, aVar);
        }
        throw new IllegalArgumentException("navigation destination " + lVar.D() + " is not a direct child of this NavGraph");
    }
}
