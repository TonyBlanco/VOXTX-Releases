package v2;

import android.util.Property;

/* JADX INFO: renamed from: v2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2871b extends Property {
    public AbstractC2871b(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(Object obj, Float f9) {
        b(obj, f9.floatValue());
    }

    public abstract void b(Object obj, float f9);
}
