package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdp implements Iterable {
    private final zzde zza = zzde.zza();

    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z9 = true;
        while (it.hasNext()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(it.next());
            z9 = false;
        }
        sb.append(']');
        return sb.toString();
    }
}
