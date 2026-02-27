package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import u0.C2811K;

/* JADX INFO: loaded from: classes.dex */
public class b extends DialogInterfaceOnCancelListenerC1144d {
    private static final String ARGUMENT_SELECTOR = "selector";
    private Dialog mDialog;
    private C2811K mSelector;
    private boolean mUseDynamicGroup = false;

    public b() {
        setCancelable(true);
    }

    public final void A() {
        if (this.mSelector == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.mSelector = C2811K.d(arguments.getBundle(ARGUMENT_SELECTOR));
            }
            if (this.mSelector == null) {
                this.mSelector = C2811K.f50924c;
            }
        }
    }

    public C2811K getRouteSelector() {
        A();
        return this.mSelector;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.mDialog;
        if (dialog == null) {
            return;
        }
        if (this.mUseDynamicGroup) {
            ((g) dialog).updateLayout();
        } else {
            ((a) dialog).updateLayout();
        }
    }

    public a onCreateChooserDialog(Context context, Bundle bundle) {
        return new a(context);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.mUseDynamicGroup) {
            g gVarOnCreateDynamicChooserDialog = onCreateDynamicChooserDialog(getContext());
            this.mDialog = gVarOnCreateDynamicChooserDialog;
            gVarOnCreateDynamicChooserDialog.setRouteSelector(getRouteSelector());
        } else {
            a aVarOnCreateChooserDialog = onCreateChooserDialog(getContext(), bundle);
            this.mDialog = aVarOnCreateChooserDialog;
            aVarOnCreateChooserDialog.setRouteSelector(getRouteSelector());
        }
        return this.mDialog;
    }

    public g onCreateDynamicChooserDialog(Context context) {
        return new g(context);
    }

    public void setRouteSelector(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        A();
        if (this.mSelector.equals(c2811k)) {
            return;
        }
        this.mSelector = c2811k;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle(ARGUMENT_SELECTOR, c2811k.a());
        setArguments(arguments);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            if (this.mUseDynamicGroup) {
                ((g) dialog).setRouteSelector(c2811k);
            } else {
                ((a) dialog).setRouteSelector(c2811k);
            }
        }
    }

    public void setUseDynamicGroup(boolean z9) {
        if (this.mDialog != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.mUseDynamicGroup = z9;
    }
}
