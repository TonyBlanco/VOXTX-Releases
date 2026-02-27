package Q;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: Q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1011c {

    /* JADX INFO: renamed from: Q.c$a */
    public static class a {
        public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0084c(bVar));
        }

        public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0084c(bVar));
        }
    }

    /* JADX INFO: renamed from: Q.c$b */
    public interface b {
        void onTouchExplorationStateChanged(boolean z9);
    }

    /* JADX INFO: renamed from: Q.c$c, reason: collision with other inner class name */
    public static final class AccessibilityManagerTouchExplorationStateChangeListenerC0084c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f7433a;

        public AccessibilityManagerTouchExplorationStateChangeListenerC0084c(b bVar) {
            this.f7433a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0084c) {
                return this.f7433a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0084c) obj).f7433a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7433a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z9) {
            this.f7433a.onTouchExplorationStateChanged(z9);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
