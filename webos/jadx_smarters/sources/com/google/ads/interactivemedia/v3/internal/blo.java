package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class blo {
    public static bjy a(boh bohVar) throws bkc {
        boolean z9;
        try {
            try {
                bohVar.r();
                try {
                    return (bjy) bnw.f21776T.read(bohVar);
                } catch (EOFException e9) {
                    e = e9;
                    z9 = false;
                    if (z9) {
                        return bka.f21595a;
                    }
                    throw new bkf(e);
                }
            } catch (EOFException e10) {
                e = e10;
                z9 = true;
            }
        } catch (bok e11) {
            throw new bkf(e11);
        } catch (IOException e12) {
            throw new bjz(e12);
        } catch (NumberFormatException e13) {
            throw new bkf(e13);
        }
    }

    public static void b(bjy bjyVar, boj bojVar) throws IOException {
        bnw.f21776T.write(bojVar, bjyVar);
    }

    public static boolean c(AccessibleObject accessibleObject, Object obj) {
        return bln.f21668b.a(accessibleObject, obj);
    }

    public static int d(List list, Class cls) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iA = ((bkh) it.next()).a();
            if (iA != 2) {
                return iA;
            }
        }
        return 1;
    }

    public static RuntimeException e(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson ${project.version}). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    public static String f(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e9) {
            StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
            sb.append('#');
            sb.append(constructor.getDeclaringClass().getSimpleName());
            sb.append('(');
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                sb.append(parameterTypes[i9].getSimpleName());
            }
            sb.append(')');
            return "Failed making constructor '" + sb.toString() + "' accessible; either change its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e9.getMessage();
        }
    }
}
