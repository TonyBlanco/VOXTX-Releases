package K0;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
public class O implements P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowId f3445a;

    public O(View view) {
        this.f3445a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof O) && ((O) obj).f3445a.equals(this.f3445a);
    }

    public int hashCode() {
        return this.f3445a.hashCode();
    }
}
