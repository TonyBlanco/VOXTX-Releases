package k;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.internal.ws.WebSocketProtocol;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f43138a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f43139b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f43140c = new Rect();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final boolean f43141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f43142b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Field f43143c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Field f43144d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Field f43145e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Field f43146f;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L46 java.lang.ClassNotFoundException -> L4a java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L46 java.lang.ClassNotFoundException -> L4a java.lang.NoSuchMethodException -> L4e
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L3a java.lang.ClassNotFoundException -> L3e java.lang.NoSuchMethodException -> L42
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L30 java.lang.ClassNotFoundException -> L34 java.lang.NoSuchMethodException -> L37
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L2b
                r8 = 1
                goto L54
            L2b:
                goto L52
            L2d:
                r7 = r1
                goto L52
            L30:
                r6 = r1
            L32:
                r7 = r6
                goto L52
            L34:
                r6 = r1
                goto L32
            L37:
                r6 = r1
                goto L32
            L3a:
                r5 = r1
            L3c:
                r6 = r5
                goto L32
            L3e:
                r5 = r1
            L40:
                r6 = r5
                goto L32
            L42:
                r5 = r1
            L44:
                r6 = r5
                goto L32
            L46:
                r4 = r1
                r5 = r4
                goto L3c
            L4a:
                r4 = r1
                r5 = r4
                goto L40
            L4e:
                r4 = r1
                r5 = r4
                goto L44
            L52:
                r3 = r1
                r8 = 0
            L54:
                if (r8 == 0) goto L63
                k.M.a.f43142b = r4
                k.M.a.f43143c = r5
                k.M.a.f43144d = r6
                k.M.a.f43145e = r7
                k.M.a.f43146f = r3
                k.M.a.f43141a = r0
                goto L6f
            L63:
                k.M.a.f43142b = r1
                k.M.a.f43143c = r1
                k.M.a.f43144d = r1
                k.M.a.f43145e = r1
                k.M.a.f43146f = r1
                k.M.a.f43141a = r2
            L6f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k.M.a.<clinit>():void");
        }

        public static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f43141a) {
                try {
                    Object objInvoke = f43142b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f43143c.getInt(objInvoke), f43144d.getInt(objInvoke), f43145e.getInt(objInvoke), f43146f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return M.f43140c;
        }
    }

    public static class b {
        public static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i9 = Build.VERSION.SDK_INT;
        if (!(i9 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) && (i9 < 29 || i9 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            return;
        }
        c(drawable);
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f43138a);
        } else {
            drawable.setState(f43139b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(H.a.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i9, PorterDuff.Mode mode) {
        if (i9 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i9 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i9 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i9) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
