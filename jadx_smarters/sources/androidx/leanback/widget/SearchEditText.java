package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class SearchEditText extends Y {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f15542i;

    public interface a {
        void a();
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.k.f41070a);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    @Override // androidx.leanback.widget.Y
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.leanback.widget.Y
    public /* bridge */ /* synthetic */ void g(String str, String str2) {
        super.g(str, str2);
    }

    @Override // androidx.leanback.widget.Y, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i9, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyPreIme(i9, keyEvent);
        }
        a aVar = this.f15542i;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return false;
    }

    @Override // androidx.leanback.widget.Y, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.leanback.widget.Y
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(a aVar) {
        this.f15542i = aVar;
    }
}
