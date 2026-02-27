package Q;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    public static class a {
        public static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        public static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        public static void c(AccessibilityRecord accessibilityRecord, int i9) {
            accessibilityRecord.setMaxScrollX(i9);
        }

        public static void d(AccessibilityRecord accessibilityRecord, int i9) {
            accessibilityRecord.setMaxScrollY(i9);
        }
    }

    public static class b {
        public static void a(AccessibilityRecord accessibilityRecord, View view, int i9) {
            accessibilityRecord.setSource(view, i9);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i9) {
        a.c(accessibilityRecord, i9);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i9) {
        a.d(accessibilityRecord, i9);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i9) {
        b.a(accessibilityRecord, view, i9);
    }
}
