package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.RelativeLayout;
import com.google.android.gms.cast.framework.internal.featurehighlight.HelpTextView;
import com.google.android.gms.cast.framework.internal.featurehighlight.h;
import o4.AbstractC2330g;
import o4.AbstractC2341s;
import o4.InterfaceC2331h;

/* JADX INFO: loaded from: classes3.dex */
public final class zzar extends RelativeLayout {
    private final boolean zza;
    private Activity zzb;
    private InterfaceC2331h zzc;
    private View zzd;
    private String zze;
    private boolean zzf;
    private int zzg;

    public zzar(AbstractC2330g abstractC2330g) {
        throw null;
    }

    public static /* bridge */ /* synthetic */ InterfaceC2331h zza(zzar zzarVar) {
        zzarVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        removeAllViews();
        this.zzb = null;
        this.zzd = null;
        this.zze = null;
        this.zzg = 0;
        this.zzf = false;
    }

    public final void remove() {
        Activity activity;
        if (!this.zzf || (activity = this.zzb) == null) {
            return;
        }
        ((ViewGroup) activity.getWindow().getDecorView()).removeView(this);
        zzd();
    }

    public final void show() {
        View view;
        Activity activity = this.zzb;
        if (activity == null || (view = this.zzd) == null || this.zzf) {
            return;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        if (this.zza && PreferenceManager.getDefaultSharedPreferences(activity).getBoolean("googlecast-introOverlayShown", false)) {
            zzd();
            return;
        }
        h hVar = new h(activity);
        int i9 = this.zzg;
        if (i9 != 0) {
            hVar.j(i9);
        }
        addView(hVar);
        HelpTextView helpTextView = (HelpTextView) activity.getLayoutInflater().inflate(AbstractC2341s.f45989c, (ViewGroup) hVar, false);
        helpTextView.setText(this.zze, null);
        hVar.n(helpTextView);
        hVar.i(view, null, true, new zzaq(this, activity, hVar));
        this.zzf = true;
        ((ViewGroup) activity.getWindow().getDecorView()).addView(this);
        hVar.l(null);
    }
}
