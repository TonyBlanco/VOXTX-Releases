package com.nytimes.android.external.cache;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a f38091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f38092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f38093d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f38094a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f38095b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f38096c;

            public a() {
            }
        }

        public b(String str) {
            a aVar = new a();
            this.f38091b = aVar;
            this.f38092c = aVar;
            this.f38093d = false;
            this.f38090a = (String) o.a(str);
        }

        public b a(String str, int i9) {
            return f(str, String.valueOf(i9));
        }

        public b b(String str, long j9) {
            return f(str, String.valueOf(j9));
        }

        public b c(String str, Object obj) {
            return f(str, obj);
        }

        public final a d() {
            a aVar = new a();
            this.f38092c.f38096c = aVar;
            this.f38092c = aVar;
            return aVar;
        }

        public final b e(Object obj) {
            d().f38095b = obj;
            return this;
        }

        public final b f(String str, Object obj) {
            a aVarD = d();
            aVarD.f38095b = obj;
            aVarD.f38094a = (String) o.a(str);
            return this;
        }

        public b g(Object obj) {
            return e(obj);
        }

        public String toString() {
            boolean z9 = this.f38093d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f38090a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f38091b.f38096c; aVar != null; aVar = aVar.f38096c) {
                Object obj = aVar.f38095b;
                if (!z9 || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f38094a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(strDeepToString.substring(1, strDeepToString.length() - 1));
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static Object a(Object obj, Object obj2) {
        return obj != null ? obj : o.a(obj2);
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
