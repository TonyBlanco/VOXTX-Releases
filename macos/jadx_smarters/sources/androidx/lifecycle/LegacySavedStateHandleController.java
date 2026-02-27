package androidx.lifecycle;

import F0.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1180j;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class LegacySavedStateHandleController {

    public static final class a implements c.a {
        @Override // F0.c.a
        public void a(F0.e eVar) {
            if (!(eVar instanceof N)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            M viewModelStore = ((N) eVar).getViewModelStore();
            F0.c savedStateRegistry = eVar.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                LegacySavedStateHandleController.a(viewModelStore.b((String) it.next()), savedStateRegistry, eVar.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.i(a.class);
        }
    }

    public static void a(I i9, F0.c cVar, AbstractC1180j abstractC1180j) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) i9.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.c(cVar, abstractC1180j);
        c(cVar, abstractC1180j);
    }

    public static SavedStateHandleController b(F0.c cVar, AbstractC1180j abstractC1180j, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, B.c(cVar.b(str), bundle));
        savedStateHandleController.c(cVar, abstractC1180j);
        c(cVar, abstractC1180j);
        return savedStateHandleController;
    }

    public static void c(final F0.c cVar, final AbstractC1180j abstractC1180j) {
        AbstractC1180j.c cVarB = abstractC1180j.b();
        if (cVarB == AbstractC1180j.c.INITIALIZED || cVarB.isAtLeast(AbstractC1180j.c.STARTED)) {
            cVar.i(a.class);
        } else {
            abstractC1180j.a(new InterfaceC1184n() { // from class: androidx.lifecycle.LegacySavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC1184n
                public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
                    if (bVar == AbstractC1180j.b.ON_START) {
                        abstractC1180j.c(this);
                        cVar.i(a.class);
                    }
                }
            });
        }
    }
}
