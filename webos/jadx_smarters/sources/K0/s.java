package K0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f3569b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3568a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3570c = new ArrayList();

    public s(View view) {
        this.f3569b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f3569b == sVar.f3569b && this.f3568a.equals(sVar.f3568a);
    }

    public int hashCode() {
        return (this.f3569b.hashCode() * 31) + this.f3568a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f3569b + "\n") + "    values:";
        for (String str2 : this.f3568a.keySet()) {
            str = str + "    " + str2 + ": " + this.f3568a.get(str2) + "\n";
        }
        return str;
    }
}
