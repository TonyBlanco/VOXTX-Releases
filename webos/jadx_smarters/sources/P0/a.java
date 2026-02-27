package P0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f6849c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6851b;

    /* JADX INFO: renamed from: P0.a$a, reason: collision with other inner class name */
    public static class C0081a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set f6852a = new HashSet(Arrays.asList(p.c().a()));
    }

    public static final class b extends a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // P0.a
        public boolean b() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    public static final class c extends a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // P0.a
        public boolean b() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public static final class d extends a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // P0.a
        public boolean b() {
            return false;
        }
    }

    public static final class e extends a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // P0.a
        public boolean b() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static final class f extends a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // P0.a
        public boolean b() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static final class g extends a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // P0.a
        public boolean b() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static final class h extends a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // P0.a
        public boolean b() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public a(String str, String str2) {
        this.f6850a = str;
        this.f6851b = str2;
        f6849c.add(this);
    }

    public static Set d() {
        return Collections.unmodifiableSet(f6849c);
    }

    @Override // P0.i
    public String a() {
        return this.f6850a;
    }

    public abstract boolean b();

    public boolean c() {
        return BoundaryInterfaceReflectionUtil.containsFeature(C0081a.f6852a, this.f6851b);
    }

    @Override // P0.i
    public boolean isSupported() {
        return b() || c();
    }
}
