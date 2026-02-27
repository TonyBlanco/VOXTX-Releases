package D;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1204a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f1205c;

    public static class a {
        public static PendingIntent a(Context context, int i9, Intent[] intentArr, int i10, Bundle bundle) {
            return PendingIntent.getActivities(context, i9, intentArr, i10, bundle);
        }
    }

    public interface b {
        Intent v();
    }

    public P(Context context) {
        this.f1205c = context;
    }

    public static P e(Context context) {
        return new P(context);
    }

    public P a(Intent intent) {
        this.f1204a.add(intent);
        return this;
    }

    public P b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f1205c.getPackageManager());
        }
        if (component != null) {
            d(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public P c(Activity activity) {
        Intent intentV = activity instanceof b ? ((b) activity).v() : null;
        if (intentV == null) {
            intentV = AbstractC0527j.a(activity);
        }
        if (intentV != null) {
            ComponentName component = intentV.getComponent();
            if (component == null) {
                component = intentV.resolveActivity(this.f1205c.getPackageManager());
            }
            d(component);
            a(intentV);
        }
        return this;
    }

    public P d(ComponentName componentName) {
        int size = this.f1204a.size();
        try {
            Context context = this.f1205c;
            while (true) {
                Intent intentB = AbstractC0527j.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f1204a.add(size, intentB);
                context = this.f1205c;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e9) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e9);
        }
    }

    public Intent g(int i9) {
        return (Intent) this.f1204a.get(i9);
    }

    public int i() {
        return this.f1204a.size();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f1204a.iterator();
    }

    public PendingIntent j(int i9, int i10) {
        return l(i9, i10, null);
    }

    public PendingIntent l(int i9, int i10, Bundle bundle) {
        if (this.f1204a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        Intent[] intentArr = (Intent[]) this.f1204a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        return a.a(this.f1205c, i9, intentArr, i10, bundle);
    }

    public void n() {
        o(null);
    }

    public void o(Bundle bundle) {
        if (this.f1204a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1204a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (E.b.startActivities(this.f1205c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1205c.startActivity(intent);
    }
}
