package x0;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.k;
import androidx.navigation.l;
import java.util.Set;

/* JADX INFO: renamed from: x0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2947c {

    /* JADX INFO: renamed from: x0.c$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NavController f51869a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2946b f51870c;

        public a(NavController navController, C2946b c2946b) {
            this.f51869a = navController;
            this.f51870c = c2946b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2947c.c(this.f51869a, this.f51870c);
        }
    }

    public static k a(l lVar) {
        k kVarA = lVar;
        while (kVarA instanceof l) {
            l lVar2 = (l) kVarA;
            kVarA = lVar2.A(lVar2.E());
        }
        return kVarA;
    }

    public static boolean b(k kVar, Set set) {
        while (!set.contains(Integer.valueOf(kVar.i()))) {
            kVar = kVar.n();
            if (kVar == null) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(NavController navController, C2946b c2946b) {
        c2946b.b();
        navController.h();
        c2946b.c();
        if (navController.s()) {
            return true;
        }
        c2946b.a();
        return false;
    }

    public static void d(Toolbar toolbar, NavController navController, C2946b c2946b) {
        navController.a(new C2949e(toolbar, c2946b));
        toolbar.setNavigationOnClickListener(new a(navController, c2946b));
    }
}
