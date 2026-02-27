package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.J;
import java.lang.reflect.Constructor;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public final class F extends J.d implements J.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f15847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J.b f15848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f15849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC1180j f15850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F0.c f15851e;

    public F(Application application, F0.e owner, Bundle bundle) {
        kotlin.jvm.internal.l.e(owner, "owner");
        this.f15851e = owner.getSavedStateRegistry();
        this.f15850d = owner.getLifecycle();
        this.f15849c = bundle;
        this.f15847a = application;
        this.f15848b = application != null ? J.a.f15866e.a(application) : new J.a();
    }

    @Override // androidx.lifecycle.J.b
    public I a(Class modelClass, AbstractC2215a extras) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        kotlin.jvm.internal.l.e(extras, "extras");
        String str = (String) extras.a(J.c.f15873c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(C.f15836a) == null || extras.a(C.f15837b) == null) {
            if (this.f15850d != null) {
                return d(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(J.a.f15868g);
        boolean zIsAssignableFrom = AbstractC1171a.class.isAssignableFrom(modelClass);
        Constructor constructorC = G.c(modelClass, (!zIsAssignableFrom || application == null) ? G.f15856b : G.f15855a);
        return constructorC == null ? this.f15848b.a(modelClass, extras) : (!zIsAssignableFrom || application == null) ? G.d(modelClass, constructorC, C.b(extras)) : G.d(modelClass, constructorC, application, C.b(extras));
    }

    @Override // androidx.lifecycle.J.b
    public I b(Class modelClass) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return d(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.J.d
    public void c(I viewModel) {
        kotlin.jvm.internal.l.e(viewModel, "viewModel");
        AbstractC1180j abstractC1180j = this.f15850d;
        if (abstractC1180j != null) {
            LegacySavedStateHandleController.a(viewModel, this.f15851e, abstractC1180j);
        }
    }

    public final I d(String key, Class modelClass) {
        I iD;
        Application application;
        kotlin.jvm.internal.l.e(key, "key");
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        if (this.f15850d == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC1171a.class.isAssignableFrom(modelClass);
        Constructor constructorC = G.c(modelClass, (!zIsAssignableFrom || this.f15847a == null) ? G.f15856b : G.f15855a);
        if (constructorC == null) {
            return this.f15847a != null ? this.f15848b.b(modelClass) : J.c.f15871a.a().b(modelClass);
        }
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(this.f15851e, this.f15850d, key, this.f15849c);
        if (!zIsAssignableFrom || (application = this.f15847a) == null) {
            B bE = savedStateHandleControllerB.e();
            kotlin.jvm.internal.l.d(bE, "controller.handle");
            iD = G.d(modelClass, constructorC, bE);
        } else {
            kotlin.jvm.internal.l.b(application);
            B bE2 = savedStateHandleControllerB.e();
            kotlin.jvm.internal.l.d(bE2, "controller.handle");
            iD = G.d(modelClass, constructorC, application, bE2);
        }
        iD.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return iD;
    }
}
