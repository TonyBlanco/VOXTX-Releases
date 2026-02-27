package q8;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: q8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2648g {
    public static final void a(int i9, int i10) {
        if (i10 <= i9) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i9 + ", got " + i10 + ". Please update the Kotlin standard library.").toString());
    }

    public static final InterfaceC2647f b(AbstractC2642a abstractC2642a) {
        return (InterfaceC2647f) abstractC2642a.getClass().getAnnotation(InterfaceC2647f.class);
    }

    public static final int c(AbstractC2642a abstractC2642a) {
        try {
            Field declaredField = abstractC2642a.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC2642a);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final StackTraceElement d(AbstractC2642a abstractC2642a) {
        String strC;
        kotlin.jvm.internal.l.e(abstractC2642a, "<this>");
        InterfaceC2647f interfaceC2647fB = b(abstractC2642a);
        if (interfaceC2647fB == null) {
            return null;
        }
        a(1, interfaceC2647fB.v());
        int iC = c(abstractC2642a);
        int i9 = iC < 0 ? -1 : interfaceC2647fB.l()[iC];
        String strB = C2650i.f49608a.b(abstractC2642a);
        if (strB == null) {
            strC = interfaceC2647fB.c();
        } else {
            strC = strB + '/' + interfaceC2647fB.c();
        }
        return new StackTraceElement(strC, interfaceC2647fB.m(), interfaceC2647fB.f(), i9);
    }
}
