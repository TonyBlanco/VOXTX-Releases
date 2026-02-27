package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import z0.AbstractC2997c;
import z0.AbstractC3001g;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f16541E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f16542F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f16543G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f16544H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f16545I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public SeekBar f16546J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TextView f16547K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f16548L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f16549M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f16550N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f16551O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final View.OnKeyListener f16552P;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i9, boolean z9) {
            if (z9) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f16550N || !seekBarPreference.f16545I) {
                    seekBarPreference.P(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.Q(i9 + seekBarPreference2.f16542F);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f16545I = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f16545I = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f16542F != seekBarPreference.f16541E) {
                seekBarPreference.P(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f16548L && (i9 == 21 || i9 == 22)) || i9 == 23 || i9 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f16546J;
            if (seekBar != null) {
                return seekBar.onKeyDown(i9, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2997c.f52506h);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16551O = new a();
        this.f16552P = new b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3001g.f52517C0, i9, i10);
        this.f16542F = typedArrayObtainStyledAttributes.getInt(AbstractC3001g.f52523F0, 0);
        M(typedArrayObtainStyledAttributes.getInt(AbstractC3001g.f52519D0, 100));
        N(typedArrayObtainStyledAttributes.getInt(AbstractC3001g.f52525G0, 0));
        this.f16548L = typedArrayObtainStyledAttributes.getBoolean(AbstractC3001g.f52521E0, true);
        this.f16549M = typedArrayObtainStyledAttributes.getBoolean(AbstractC3001g.f52527H0, false);
        this.f16550N = typedArrayObtainStyledAttributes.getBoolean(AbstractC3001g.f52529I0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object C(TypedArray typedArray, int i9) {
        return Integer.valueOf(typedArray.getInt(i9, 0));
    }

    public final void M(int i9) {
        int i10 = this.f16542F;
        if (i9 < i10) {
            i9 = i10;
        }
        if (i9 != this.f16543G) {
            this.f16543G = i9;
            y();
        }
    }

    public final void N(int i9) {
        if (i9 != this.f16544H) {
            this.f16544H = Math.min(this.f16543G - this.f16542F, Math.abs(i9));
            y();
        }
    }

    public final void O(int i9, boolean z9) {
        int i10 = this.f16542F;
        if (i9 < i10) {
            i9 = i10;
        }
        int i11 = this.f16543G;
        if (i9 > i11) {
            i9 = i11;
        }
        if (i9 != this.f16541E) {
            this.f16541E = i9;
            Q(i9);
            H(i9);
            if (z9) {
                y();
            }
        }
    }

    public void P(SeekBar seekBar) {
        int progress = this.f16542F + seekBar.getProgress();
        if (progress != this.f16541E) {
            if (a(Integer.valueOf(progress))) {
                O(progress, false);
            } else {
                seekBar.setProgress(this.f16541E - this.f16542F);
                Q(this.f16541E);
            }
        }
    }

    public void Q(int i9) {
        TextView textView = this.f16547K;
        if (textView != null) {
            textView.setText(String.valueOf(i9));
        }
    }
}
