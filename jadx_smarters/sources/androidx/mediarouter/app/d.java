package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d;
import u0.C2811K;

/* JADX INFO: loaded from: classes.dex */
public class d extends DialogInterfaceOnCancelListenerC1144d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16146a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Dialog f16147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2811K f16148d;

    public d() {
        setCancelable(true);
    }

    private void A() {
        if (this.f16148d == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.f16148d = C2811K.d(arguments.getBundle("selector"));
            }
            if (this.f16148d == null) {
                this.f16148d = C2811K.f50924c;
            }
        }
    }

    public c B(Context context, Bundle bundle) {
        return new c(context);
    }

    public h D(Context context) {
        return new h(context);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Dialog dialog = this.f16147c;
        if (dialog != null) {
            if (this.f16146a) {
                ((h) dialog).updateLayout();
            } else {
                ((c) dialog).updateLayout();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f16146a) {
            h hVarD = D(getContext());
            this.f16147c = hVarD;
            hVarD.setRouteSelector(this.f16148d);
        } else {
            this.f16147c = B(getContext(), bundle);
        }
        return this.f16147c;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1144d, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f16147c;
        if (dialog == null || this.f16146a) {
            return;
        }
        ((c) dialog).l(false);
    }

    public void setRouteSelector(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        A();
        if (this.f16148d.equals(c2811k)) {
            return;
        }
        this.f16148d = c2811k;
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBundle("selector", c2811k.a());
        setArguments(arguments);
        Dialog dialog = this.f16147c;
        if (dialog == null || !this.f16146a) {
            return;
        }
        ((h) dialog).setRouteSelector(c2811k);
    }

    public void setUseDynamicGroup(boolean z9) {
        if (this.f16147c != null) {
            throw new IllegalStateException("This must be called before creating dialog");
        }
        this.f16146a = z9;
    }
}
