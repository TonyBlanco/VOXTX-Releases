package X7;

import W7.e;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10480a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10481b = new HashSet();

    public boolean a(e eVar) {
        return this.f10481b.add(eVar);
    }

    public void b(View view) {
        if (this.f10480a) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        view.setLayoutParams(layoutParams);
        this.f10480a = true;
        Iterator it = this.f10481b.iterator();
        while (it.hasNext()) {
            ((e) it.next()).g();
        }
    }

    public void c(View view) {
        if (this.f10480a) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -1;
            view.setLayoutParams(layoutParams);
            this.f10480a = false;
            Iterator it = this.f10481b.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d();
            }
        }
    }

    public void d(View view) {
        if (this.f10480a) {
            c(view);
        } else {
            b(view);
        }
    }
}
