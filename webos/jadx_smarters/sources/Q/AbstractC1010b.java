package Q;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: Q.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1010b {

    /* JADX INFO: renamed from: Q.b$a */
    public static class a {
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        public static void b(AccessibilityEvent accessibilityEvent, int i9) {
            accessibilityEvent.setContentChangeTypes(i9);
        }
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i9) {
        a.b(accessibilityEvent, i9);
    }
}
