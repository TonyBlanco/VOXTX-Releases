package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import z0.AbstractC2997c;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final Context f16485P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final ArrayAdapter f16486Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Spinner f16487R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f16488S;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            if (i9 >= 0) {
                String string = DropDownPreference.this.P()[i9].toString();
                if (string.equals(DropDownPreference.this.Q()) || !DropDownPreference.this.a(string)) {
                    return;
                }
                DropDownPreference.this.S(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2997c.f52501c);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        this.f16488S = new a();
        this.f16485P = context;
        this.f16486Q = T();
        U();
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void A() {
        this.f16487R.performClick();
    }

    public ArrayAdapter T() {
        return new ArrayAdapter(this.f16485P, R.layout.simple_spinner_dropdown_item);
    }

    public final void U() {
        this.f16486Q.clear();
        if (N() != null) {
            for (CharSequence charSequence : N()) {
                this.f16486Q.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void y() {
        super.y();
        ArrayAdapter arrayAdapter = this.f16486Q;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
