package v2;

import android.util.Property;

/* JADX INFO: renamed from: v2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2872c extends Property {
    public AbstractC2872c(String str) {
        super(Integer.class, str);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void set(Object obj, Integer num) {
        b(obj, num.intValue());
    }

    public abstract void b(Object obj, int i9);
}
