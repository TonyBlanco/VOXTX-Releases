package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.io.Serializable;
import okhttp3.HttpUrl;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f16437b = new c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f16438c = new d(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f16439d = new e(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final q f16440e = new f(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final q f16441f = new g(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f16442g = new h(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f16443h = new i(true);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final q f16444i = new j(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q f16445j = new k(true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q f16446k = new a(true);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final q f16447l = new b(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16448a;

    public class a extends q {
        public a(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "string";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String k(String str) {
            return str;
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    public class b extends q {
        public b(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "string[]";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    public class c extends q {
        public c(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "integer";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    public class d extends q {
        public d(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return Name.REFER;
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer k(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    public class e extends q {
        public e(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "integer[]";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    public class f extends q {
        public f(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "long";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Long k(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return Long.valueOf(str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str));
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Long l9) {
            bundle.putLong(str, l9.longValue());
        }
    }

    public class g extends q {
        public g(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "long[]";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public long[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    public class h extends q {
        public h(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "float";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float k(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Float f9) {
            bundle.putFloat(str, f9.floatValue());
        }
    }

    public class i extends q {
        public i(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "float[]";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    public class j extends q {
        public j(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "boolean";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean k(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    public class k extends q {
        public k(boolean z9) {
            super(z9);
        }

        @Override // androidx.navigation.q
        public String c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    public static final class l extends p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Class f16449n;

        public l(Class cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f16449n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.q.p, androidx.navigation.q
        public String c() {
            return this.f16449n.getName();
        }

        @Override // androidx.navigation.q.p
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Enum k(String str) {
            for (Enum r32 : (Enum[]) this.f16449n.getEnumConstants()) {
                if (r32.name().equals(str)) {
                    return r32;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.f16449n.getName() + InstructionFileId.DOT);
        }
    }

    public static final class m extends q {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class f16450m;

        public m(Class cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f16450m = Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(e9);
            }
        }

        @Override // androidx.navigation.q
        public String c() {
            return this.f16450m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || m.class != obj.getClass()) {
                return false;
            }
            return this.f16450m.equals(((m) obj).f16450m);
        }

        public int hashCode() {
            return this.f16450m.hashCode();
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Parcelable[] b(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.q
        public Parcelable[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Parcelable[] parcelableArr) {
            this.f16450m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }
    }

    public static final class n extends q {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class f16451m;

        public n(Class cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f16451m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.q
        public Object b(Bundle bundle, String str) {
            return bundle.get(str);
        }

        @Override // androidx.navigation.q
        public String c() {
            return this.f16451m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f16451m.equals(((n) obj).f16451m);
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: h */
        public Object k(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.f16451m.hashCode();
        }

        @Override // androidx.navigation.q
        public void i(Bundle bundle, String str, Object obj) {
            this.f16451m.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
    }

    public static final class o extends q {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class f16452m;

        public o(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f16452m = Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e9) {
                throw new RuntimeException(e9);
            }
        }

        @Override // androidx.navigation.q
        public String c() {
            return this.f16452m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || o.class != obj.getClass()) {
                return false;
            }
            return this.f16452m.equals(((o) obj).f16452m);
        }

        public int hashCode() {
            return this.f16452m.hashCode();
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Serializable[] b(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.q
        public Serializable[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Serializable[] serializableArr) {
            this.f16452m.cast(serializableArr);
            bundle.putSerializable(str, serializableArr);
        }
    }

    public static class p extends q {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Class f16453m;

        public p(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            if (!cls.isEnum()) {
                this.f16453m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
        }

        public p(boolean z9, Class cls) {
            super(z9);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f16453m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.q
        public String c() {
            return this.f16453m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.f16453m.equals(((p) obj).f16453m);
            }
            return false;
        }

        public int hashCode() {
            return this.f16453m.hashCode();
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public Serializable b(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.q
        public Serializable k(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.q
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(Bundle bundle, String str, Serializable serializable) {
            this.f16453m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }
    }

    public q(boolean z9) {
        this.f16448a = z9;
    }

    public static q a(String str, String str2) {
        String strSubstring;
        q qVar = f16437b;
        if (qVar.c().equals(str)) {
            return qVar;
        }
        q qVar2 = f16439d;
        if (qVar2.c().equals(str)) {
            return qVar2;
        }
        q qVar3 = f16440e;
        if (qVar3.c().equals(str)) {
            return qVar3;
        }
        q qVar4 = f16441f;
        if (qVar4.c().equals(str)) {
            return qVar4;
        }
        q qVar5 = f16444i;
        if (qVar5.c().equals(str)) {
            return qVar5;
        }
        q qVar6 = f16445j;
        if (qVar6.c().equals(str)) {
            return qVar6;
        }
        q qVar7 = f16446k;
        if (qVar7.c().equals(str)) {
            return qVar7;
        }
        q qVar8 = f16447l;
        if (qVar8.c().equals(str)) {
            return qVar8;
        }
        q qVar9 = f16442g;
        if (qVar9.c().equals(str)) {
            return qVar9;
        }
        q qVar10 = f16443h;
        if (qVar10.c().equals(str)) {
            return qVar10;
        }
        q qVar11 = f16438c;
        if (qVar11.c().equals(str)) {
            return qVar11;
        }
        if (str == null || str.isEmpty()) {
            return qVar7;
        }
        try {
            if (!str.startsWith(InstructionFileId.DOT) || str2 == null) {
                strSubstring = str;
            } else {
                strSubstring = str2 + str;
            }
            if (str.endsWith(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                Class<?> cls = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(strSubstring);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(strSubstring + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static q d(String str) {
        try {
            try {
                try {
                    try {
                        q qVar = f16437b;
                        qVar.k(str);
                        return qVar;
                    } catch (IllegalArgumentException unused) {
                        q qVar2 = f16444i;
                        qVar2.k(str);
                        return qVar2;
                    }
                } catch (IllegalArgumentException unused2) {
                    q qVar3 = f16442g;
                    qVar3.k(str);
                    return qVar3;
                }
            } catch (IllegalArgumentException unused3) {
                q qVar4 = f16440e;
                qVar4.k(str);
                return qVar4;
            }
        } catch (IllegalArgumentException unused4) {
            return f16446k;
        }
    }

    public static q e(Object obj) {
        if (obj instanceof Integer) {
            return f16437b;
        }
        if (obj instanceof int[]) {
            return f16439d;
        }
        if (obj instanceof Long) {
            return f16440e;
        }
        if (obj instanceof long[]) {
            return f16441f;
        }
        if (obj instanceof Float) {
            return f16442g;
        }
        if (obj instanceof float[]) {
            return f16443h;
        }
        if (obj instanceof Boolean) {
            return f16444i;
        }
        if (obj instanceof boolean[]) {
            return f16445j;
        }
        if ((obj instanceof String) || obj == null) {
            return f16446k;
        }
        if (obj instanceof String[]) {
            return f16447l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    public abstract Object b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.f16448a;
    }

    public Object g(Bundle bundle, String str, String str2) {
        Object objK = k(str2);
        i(bundle, str, objK);
        return objK;
    }

    /* JADX INFO: renamed from: h */
    public abstract Object k(String str);

    public abstract void i(Bundle bundle, String str, Object obj);

    public String toString() {
        return c();
    }
}
