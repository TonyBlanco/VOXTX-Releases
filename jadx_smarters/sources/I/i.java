package i;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f41781a;

    public static class a {
        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i9) {
            return callback.onWindowStartingActionMode(callback2, i9);
        }
    }

    public static class b {
        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i9) {
            callback.onProvideKeyboardShortcuts(list, menu, i9);
        }
    }

    public static class c {
        public static void a(Window.Callback callback, boolean z9) {
            callback.onPointerCaptureChanged(z9);
        }
    }

    public i(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f41781a = callback;
    }

    public final Window.Callback a() {
        return this.f41781a;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f41781a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f41781a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f41781a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f41781a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f41781a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f41781a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f41781a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f41781a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f41781a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i9, Menu menu) {
        return this.f41781a.onCreatePanelMenu(i9, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i9) {
        return this.f41781a.onCreatePanelView(i9);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f41781a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        return this.f41781a.onMenuItemSelected(i9, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i9, Menu menu) {
        return this.f41781a.onMenuOpened(i9, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i9, Menu menu) {
        this.f41781a.onPanelClosed(i9, menu);
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z9) {
        c.a(this.f41781a, z9);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i9, View view, Menu menu) {
        return this.f41781a.onPreparePanel(i9, view, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i9) {
        b.a(this.f41781a, list, menu, i9);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f41781a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f41781a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f41781a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z9) {
        this.f41781a.onWindowFocusChanged(z9);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f41781a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i9) {
        return a.b(this.f41781a, callback, i9);
    }
}
