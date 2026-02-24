package j2;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.AbstractActivityC1145e;
import java.util.HashMap;
import java.util.Map;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: j2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2085k implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2085k f42897f = new C2085k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile O1.j f42898a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f42899c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f42900d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f42901e = new Handler(Looper.getMainLooper(), this);

    public static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static C2085k f() {
        return f42897f;
    }

    public O1.j b(Context context, FragmentManager fragmentManager) {
        FragmentC2084j fragmentC2084jH = h(fragmentManager);
        O1.j jVarC = fragmentC2084jH.c();
        if (jVarC != null) {
            return jVarC;
        }
        O1.j jVar = new O1.j(context, fragmentC2084jH.b(), fragmentC2084jH.d());
        fragmentC2084jH.f(jVar);
        return jVar;
    }

    public O1.j c(Activity activity) {
        if (AbstractC2539h.h()) {
            return d(activity.getApplicationContext());
        }
        a(activity);
        return b(activity, activity.getFragmentManager());
    }

    public O1.j d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC2539h.i() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC1145e) {
                return e((AbstractActivityC1145e) context);
            }
            if (context instanceof Activity) {
                return c((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return d(((ContextWrapper) context).getBaseContext());
            }
        }
        return g(context);
    }

    public O1.j e(AbstractActivityC1145e abstractActivityC1145e) {
        if (AbstractC2539h.h()) {
            return d(abstractActivityC1145e.getApplicationContext());
        }
        a(abstractActivityC1145e);
        return j(abstractActivityC1145e, abstractActivityC1145e.getSupportFragmentManager());
    }

    public final O1.j g(Context context) {
        if (this.f42898a == null) {
            synchronized (this) {
                try {
                    if (this.f42898a == null) {
                        this.f42898a = new O1.j(context.getApplicationContext(), new C2076b(), new C2080f());
                    }
                } finally {
                }
            }
        }
        return this.f42898a;
    }

    public FragmentC2084j h(FragmentManager fragmentManager) {
        FragmentC2084j fragmentC2084j = (FragmentC2084j) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC2084j != null) {
            return fragmentC2084j;
        }
        FragmentC2084j fragmentC2084j2 = (FragmentC2084j) this.f42899c.get(fragmentManager);
        if (fragmentC2084j2 != null) {
            return fragmentC2084j2;
        }
        FragmentC2084j fragmentC2084j3 = new FragmentC2084j();
        this.f42899c.put(fragmentManager, fragmentC2084j3);
        fragmentManager.beginTransaction().add(fragmentC2084j3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f42901e.obtainMessage(1, fragmentManager).sendToTarget();
        return fragmentC2084j3;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        Object obj3;
        int i9 = message.what;
        boolean z9 = true;
        if (i9 == 1) {
            obj = (FragmentManager) message.obj;
            map = this.f42899c;
        } else {
            if (i9 != 2) {
                obj3 = null;
                z9 = false;
                obj2 = null;
                if (z9 && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
                }
                return z9;
            }
            obj = (androidx.fragment.app.m) message.obj;
            map = this.f42900d;
        }
        Object objRemove = map.remove(obj);
        obj2 = obj;
        obj3 = objRemove;
        if (z9) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z9;
    }

    public C2088n i(androidx.fragment.app.m mVar) {
        C2088n c2088n = (C2088n) mVar.h0("com.bumptech.glide.manager");
        if (c2088n != null) {
            return c2088n;
        }
        C2088n c2088n2 = (C2088n) this.f42900d.get(mVar);
        if (c2088n2 != null) {
            return c2088n2;
        }
        C2088n c2088n3 = new C2088n();
        this.f42900d.put(mVar, c2088n3);
        mVar.m().e(c2088n3, "com.bumptech.glide.manager").j();
        this.f42901e.obtainMessage(2, mVar).sendToTarget();
        return c2088n3;
    }

    public O1.j j(Context context, androidx.fragment.app.m mVar) {
        C2088n c2088nI = i(mVar);
        O1.j jVarA = c2088nI.A();
        if (jVarA != null) {
            return jVarA;
        }
        O1.j jVar = new O1.j(context, c2088nI.z(), c2088nI.B());
        c2088nI.E(jVar);
        return jVar;
    }
}
