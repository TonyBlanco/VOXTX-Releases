package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1186p;
import androidx.lifecycle.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Dialog implements InterfaceC1186p, l {

    @Nullable
    private q _lifecycleRegistry;

    @NotNull
    private final OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, int i9) {
        super(context, i9);
        kotlin.jvm.internal.l.e(context, "context");
        this.onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.f
            @Override // java.lang.Runnable
            public final void run() {
                g.c(this.f13518a);
            }
        });
    }

    public static final void c(g this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        super.onBackPressed();
    }

    public final q b() {
        q qVar = this._lifecycleRegistry;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        this._lifecycleRegistry = qVar2;
        return qVar2;
    }

    @Override // androidx.lifecycle.InterfaceC1186p
    @NotNull
    public final AbstractC1180j getLifecycle() {
        return b();
    }

    @Override // androidx.activity.l
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.f();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            this.onBackPressedDispatcher.g(getOnBackInvokedDispatcher());
        }
        b().h(AbstractC1180j.b.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().h(AbstractC1180j.b.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().h(AbstractC1180j.b.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }
}
