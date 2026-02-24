package com.google.android.recaptcha.internal;

import E8.n;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l8.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdb {

    @NotNull
    public static final zzdb zza = new zzdb();

    @NotNull
    private static final List zzb = zzc(k.h("www.recaptcha.net", "TryRoom"));

    private zzdb() {
    }

    public static final boolean zza(@NotNull Uri uri) {
        return !TextUtils.isEmpty(uri.toString()) && l.a(ClientConstants.DOMAIN_SCHEME, uri.getScheme()) && !TextUtils.isEmpty(uri.getHost()) && zzb(uri.toString());
    }

    private static final boolean zzb(String str) {
        List list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (n.B(str, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    private static final List zzc(List list) {
        ArrayList arrayList = new ArrayList(l8.l.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
