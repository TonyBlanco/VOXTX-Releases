package S4;

import android.util.Property;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class c extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Property f9414a = new c("childrenAlpha");

    public c(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f9 = (Float) viewGroup.getTag(R4.f.f8762B);
        return f9 != null ? f9 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f9) {
        float fFloatValue = f9.floatValue();
        viewGroup.setTag(R4.f.f8762B, f9);
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            viewGroup.getChildAt(i9).setAlpha(fFloatValue);
        }
    }
}
