package s4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import okio.Segment;

/* JADX INFO: renamed from: s4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2716h extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CastSeekBar f49954a;

    public /* synthetic */ C2716h(CastSeekBar castSeekBar, AbstractC2715g abstractC2715g) {
        this.f49954a = castSeekBar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.f49954a.f26369a.f49949b);
        accessibilityEvent.setCurrentItemIndex(this.f49954a.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (C4.m.b() && view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(Segment.SIZE);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i9, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        if (super.performAccessibilityAction(view, i9, bundle)) {
            return true;
        }
        if (C4.m.b() && (i9 == 4096 || i9 == 8192)) {
            this.f49954a.i();
            CastSeekBar castSeekBar = this.f49954a;
            int i10 = castSeekBar.f26369a.f49949b / 20;
            if (i9 == 8192) {
                i10 = -i10;
            }
            castSeekBar.h(castSeekBar.getProgress() + i10);
            this.f49954a.j();
        }
        return false;
    }
}
