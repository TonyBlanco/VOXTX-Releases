package androidx.preference;

import F.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.List;
import s.i;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final i f16531E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Handler f16532F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final List f16533G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f16534H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f16535I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f16536J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f16537K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final Runnable f16538L;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f16531E.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16531E = new i();
        this.f16532F = new Handler(Looper.getMainLooper());
        this.f16534H = true;
        this.f16535I = 0;
        this.f16536J = false;
        this.f16537K = a.e.API_PRIORITY_OTHER;
        this.f16538L = new a();
        this.f16533G = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52612v0, i9, i10);
        int i11 = AbstractC3001g.f52616x0;
        this.f16534H = k.b(typedArrayObtainStyledAttributes, i11, i11, true);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC3001g.f52614w0)) {
            int i12 = AbstractC3001g.f52614w0;
            O(k.d(typedArrayObtainStyledAttributes, i12, i12, a.e.API_PRIORITY_OTHER));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public Preference M(int i9) {
        return (Preference) this.f16533G.get(i9);
    }

    public int N() {
        return this.f16533G.size();
    }

    public void O(int i9) {
        if (i9 != Integer.MAX_VALUE && !v()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f16537K = i9;
    }

    @Override // androidx.preference.Preference
    public void z(boolean z9) {
        super.z(z9);
        int iN = N();
        for (int i9 = 0; i9 < iN; i9++) {
            M(i9).D(this, z9);
        }
    }
}
