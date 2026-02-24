package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l8.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcd implements zzby {

    @NotNull
    public static final zzcd zza = new zzcd();

    private zzcd() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length < 2) {
            throw new zzt(4, 3, null);
        }
        Class<?> cls = objArr[0];
        if (true != (cls instanceof Object)) {
            cls = null;
        }
        if (cls == null) {
            throw new zzt(4, 5, null);
        }
        Class<?> cls2 = cls instanceof Class ? cls : cls.getClass();
        Object obj = objArr[1];
        if (true != (obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        String strZza = zzbx.zza(this, str, zzblVar.zza());
        if (l.a(strZza, "forName")) {
            throw new zzt(6, 48, null);
        }
        List listN = h.n(objArr, 2);
        ArrayList arrayList = new ArrayList(l8.l.o(listN, 10));
        Iterator it = listN.iterator();
        while (it.hasNext()) {
            arrayList.add(zzbk.zza(it.next()));
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            zzblVar.zzc().zzf(i9, cls2.getMethod(strZza, (Class[]) Arrays.copyOf(clsArr, clsArr.length)));
        } catch (Exception e9) {
            throw new zzt(6, 13, e9);
        }
    }
}
