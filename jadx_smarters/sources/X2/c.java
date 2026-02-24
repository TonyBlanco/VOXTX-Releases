package X2;

import android.content.Context;
import d4.AbstractC1681B;
import d4.k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10445a;

        public a(boolean z9) {
            this.f10445a = z9;
        }

        public static int b(String str, String str2) {
            if (str != null && str2 != null) {
                String[] strArrI1 = k0.i1(str, "\\.");
                String[] strArrI12 = k0.i1(str2, "\\.");
                int iMin = Math.min(strArrI1.length, strArrI12.length);
                for (int i9 = 0; i9 < iMin; i9++) {
                    if (!strArrI1[i9].equals(strArrI12[i9])) {
                        try {
                            return Integer.parseInt(strArrI1[i9]) - Integer.parseInt(strArrI12[i9]);
                        } catch (NumberFormatException unused) {
                            return 0;
                        }
                    }
                }
            }
            return 0;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(CronetProvider cronetProvider, CronetProvider cronetProvider2) {
            int iC = c(cronetProvider) - c(cronetProvider2);
            return iC != 0 ? iC : -b(cronetProvider.getVersion(), cronetProvider2.getVersion());
        }

        public final int c(CronetProvider cronetProvider) {
            String name = cronetProvider.getName();
            if (CronetProvider.PROVIDER_NAME_APP_PACKAGED.equals(name)) {
                return 1;
            }
            if ("Google-Play-Services-Cronet-Provider".equals(name)) {
                return this.f10445a ? 0 : 2;
            }
            return 3;
        }
    }

    public static CronetEngine a(Context context) {
        return b(context, null, false);
    }

    public static CronetEngine b(Context context, String str, boolean z9) {
        String str2;
        ArrayList arrayList = new ArrayList(CronetProvider.getAllProviders(context));
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!((CronetProvider) arrayList.get(size)).isEnabled() || CronetProvider.PROVIDER_NAME_FALLBACK.equals(((CronetProvider) arrayList.get(size)).getName())) {
                arrayList.remove(size);
            }
        }
        Collections.sort(arrayList, new a(z9));
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            String name = ((CronetProvider) arrayList.get(i9)).getName();
            try {
                CronetEngine.Builder builderCreateBuilder = ((CronetProvider) arrayList.get(i9)).createBuilder();
                if (str != null) {
                    builderCreateBuilder.setUserAgent(str);
                }
                CronetEngine cronetEngineBuild = builderCreateBuilder.build();
                AbstractC1681B.b("CronetUtil", "CronetEngine built using " + name);
                return cronetEngineBuild;
            } catch (SecurityException unused) {
                str2 = "Failed to build CronetEngine. Please check that the process has android.permission.ACCESS_NETWORK_STATE.";
                AbstractC1681B.j("CronetUtil", str2);
            } catch (UnsatisfiedLinkError unused2) {
                str2 = "Failed to link Cronet binaries. Please check that native Cronet binaries arebundled into your app.";
                AbstractC1681B.j("CronetUtil", str2);
            }
        }
        AbstractC1681B.j("CronetUtil", "CronetEngine could not be built.");
        return null;
    }
}
