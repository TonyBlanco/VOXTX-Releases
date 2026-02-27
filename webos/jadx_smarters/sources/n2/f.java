package n2;

import android.view.View;
import android.view.animation.Animation;
import n2.c;

/* JADX INFO: loaded from: classes.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f44896a;

    public interface a {
        Animation build();
    }

    public f(a aVar) {
        this.f44896a = aVar;
    }

    @Override // n2.c
    public boolean a(Object obj, c.a aVar) {
        View view = aVar.getView();
        if (view == null) {
            return false;
        }
        view.clearAnimation();
        view.startAnimation(this.f44896a.build());
        return false;
    }
}
