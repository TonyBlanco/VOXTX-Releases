package androidx.preference;

import F.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import z0.AbstractC2997c;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public CharSequence f16479E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public CharSequence f16480F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Drawable f16481G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f16482H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f16483I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f16484J;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, AbstractC2997c.f52500b, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52585i, i9, i10);
        String strO = k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52605s, AbstractC3001g.f52587j);
        this.f16479E = strO;
        if (strO == null) {
            this.f16479E = u();
        }
        this.f16480F = k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52603r, AbstractC3001g.f52589k);
        this.f16481G = k.c(typedArrayObtainStyledAttributes, AbstractC3001g.f52599p, AbstractC3001g.f52591l);
        this.f16482H = k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52609u, AbstractC3001g.f52593m);
        this.f16483I = k.o(typedArrayObtainStyledAttributes, AbstractC3001g.f52607t, AbstractC3001g.f52595n);
        this.f16484J = k.n(typedArrayObtainStyledAttributes, AbstractC3001g.f52601q, AbstractC3001g.f52597o, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void A() {
        r();
        throw null;
    }
}
