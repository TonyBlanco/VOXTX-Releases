package D;

import P.AbstractC0975q;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1186p;
import d.AbstractC1617D;

/* JADX INFO: renamed from: D.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0525h extends Activity implements InterfaceC1186p, AbstractC0975q.a {
    private s.i mExtraDataMap = new s.i();
    private androidx.lifecycle.q mLifecycleRegistry = new androidx.lifecycle.q(this);

    /* JADX INFO: renamed from: D.h$a */
    public static class a {
    }

    public static boolean Z0(String[] strArr) {
        if (strArr != null && strArr.length > 0) {
            String str = strArr[0];
            str.hashCode();
            switch (str) {
                case "--translation":
                    return Build.VERSION.SDK_INT >= 31;
                case "--contentcapture":
                    return Build.VERSION.SDK_INT >= 29;
                case "--autofill":
                    return Build.VERSION.SDK_INT >= 26;
            }
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0975q.d(decorView, keyEvent)) {
            return AbstractC0975q.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0975q.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends a> T getExtraData(Class<T> cls) {
        AbstractC1617D.a(this.mExtraDataMap.get(cls));
        return null;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.z.g(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.j(AbstractC1180j.c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(a aVar) {
        throw null;
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !Z0(strArr);
    }

    @Override // P.AbstractC0975q.a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
