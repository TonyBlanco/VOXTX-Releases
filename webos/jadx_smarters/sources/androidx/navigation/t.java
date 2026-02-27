package androidx.navigation;

import androidx.navigation.s;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f16454b = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16455a = new HashMap();

    public static String c(Class cls) {
        HashMap map = f16454b;
        String strValue = (String) map.get(cls);
        if (strValue == null) {
            s.b bVar = (s.b) cls.getAnnotation(s.b.class);
            strValue = bVar != null ? bVar.value() : null;
            if (!g(strValue)) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for " + cls.getSimpleName());
            }
            map.put(cls, strValue);
        }
        return strValue;
    }

    public static boolean g(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final s a(s sVar) {
        return b(c(sVar.getClass()), sVar);
    }

    public s b(String str, s sVar) {
        if (g(str)) {
            return (s) this.f16455a.put(str, sVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final s d(Class cls) {
        return e(c(cls));
    }

    public s e(String str) {
        if (!g(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        s sVar = (s) this.f16455a.get(str);
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
    }

    public Map f() {
        return this.f16455a;
    }
}
