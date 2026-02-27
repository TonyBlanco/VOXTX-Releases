package androidx.activity.result;

import D.AbstractC0521d;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import b.AbstractC1191a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f13526a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13527b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f13528c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f13529d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f13530e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Map f13531f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f13532g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f13533h = new Bundle();

    public class a extends androidx.activity.result.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1191a f13539b;

        public a(String str, AbstractC1191a abstractC1191a) {
            this.f13538a = str;
            this.f13539b = abstractC1191a;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, AbstractC0521d abstractC0521d) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f13528c.get(this.f13538a);
            if (num != null) {
                ActivityResultRegistry.this.f13530e.add(this.f13538a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f13539b, obj, abstractC0521d);
                    return;
                } catch (Exception e9) {
                    ActivityResultRegistry.this.f13530e.remove(this.f13538a);
                    throw e9;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f13539b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f13538a);
        }
    }

    public class b extends androidx.activity.result.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f13541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1191a f13542b;

        public b(String str, AbstractC1191a abstractC1191a) {
            this.f13541a = str;
            this.f13542b = abstractC1191a;
        }

        @Override // androidx.activity.result.c
        public void b(Object obj, AbstractC0521d abstractC0521d) throws Exception {
            Integer num = (Integer) ActivityResultRegistry.this.f13528c.get(this.f13541a);
            if (num != null) {
                ActivityResultRegistry.this.f13530e.add(this.f13541a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f13542b, obj, abstractC0521d);
                    return;
                } catch (Exception e9) {
                    ActivityResultRegistry.this.f13530e.remove(this.f13541a);
                    throw e9;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f13542b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.c
        public void c() {
            ActivityResultRegistry.this.l(this.f13541a);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.activity.result.b f13544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC1191a f13545b;

        public c(androidx.activity.result.b bVar, AbstractC1191a abstractC1191a) {
            this.f13544a = bVar;
            this.f13545b = abstractC1191a;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1180j f13546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f13547b = new ArrayList();

        public d(AbstractC1180j abstractC1180j) {
            this.f13546a = abstractC1180j;
        }

        public void a(InterfaceC1184n interfaceC1184n) {
            this.f13546a.a(interfaceC1184n);
            this.f13547b.add(interfaceC1184n);
        }

        public void b() {
            Iterator it = this.f13547b.iterator();
            while (it.hasNext()) {
                this.f13546a.c((InterfaceC1184n) it.next());
            }
            this.f13547b.clear();
        }
    }

    public final void a(int i9, String str) {
        this.f13527b.put(Integer.valueOf(i9), str);
        this.f13528c.put(str, Integer.valueOf(i9));
    }

    public final boolean b(int i9, int i10, Intent intent) {
        String str = (String) this.f13527b.get(Integer.valueOf(i9));
        if (str == null) {
            return false;
        }
        d(str, i10, intent, (c) this.f13531f.get(str));
        return true;
    }

    public final boolean c(int i9, Object obj) {
        androidx.activity.result.b bVar;
        String str = (String) this.f13527b.get(Integer.valueOf(i9));
        if (str == null) {
            return false;
        }
        c cVar = (c) this.f13531f.get(str);
        if (cVar == null || (bVar = cVar.f13544a) == null) {
            this.f13533h.remove(str);
            this.f13532g.put(str, obj);
            return true;
        }
        if (!this.f13530e.remove(str)) {
            return true;
        }
        bVar.a(obj);
        return true;
    }

    public final void d(String str, int i9, Intent intent, c cVar) {
        if (cVar == null || cVar.f13544a == null || !this.f13530e.contains(str)) {
            this.f13532g.remove(str);
            this.f13533h.putParcelable(str, new androidx.activity.result.a(i9, intent));
        } else {
            cVar.f13544a.a(cVar.f13545b.c(i9, intent));
            this.f13530e.remove(str);
        }
    }

    public final int e() {
        int iNextInt = this.f13526a.nextInt(2147418112);
        while (true) {
            int i9 = iNextInt + 65536;
            if (!this.f13527b.containsKey(Integer.valueOf(i9))) {
                return i9;
            }
            iNextInt = this.f13526a.nextInt(2147418112);
        }
    }

    public abstract void f(int i9, AbstractC1191a abstractC1191a, Object obj, AbstractC0521d abstractC0521d);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f13530e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f13526a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f13533h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i9 = 0; i9 < stringArrayList.size(); i9++) {
            String str = stringArrayList.get(i9);
            if (this.f13528c.containsKey(str)) {
                Integer num = (Integer) this.f13528c.remove(str);
                if (!this.f13533h.containsKey(str)) {
                    this.f13527b.remove(num);
                }
            }
            a(integerArrayList.get(i9).intValue(), stringArrayList.get(i9));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f13528c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f13528c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f13530e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f13533h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f13526a);
    }

    public final androidx.activity.result.c i(final String str, InterfaceC1186p interfaceC1186p, final AbstractC1191a abstractC1191a, final androidx.activity.result.b bVar) {
        AbstractC1180j lifecycle = interfaceC1186p.getLifecycle();
        if (lifecycle.b().isAtLeast(AbstractC1180j.c.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC1186p + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        d dVar = (d) this.f13529d.get(str);
        if (dVar == null) {
            dVar = new d(lifecycle);
        }
        dVar.a(new InterfaceC1184n() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.InterfaceC1184n
            public void b(InterfaceC1186p interfaceC1186p2, AbstractC1180j.b bVar2) {
                if (!AbstractC1180j.b.ON_START.equals(bVar2)) {
                    if (AbstractC1180j.b.ON_STOP.equals(bVar2)) {
                        ActivityResultRegistry.this.f13531f.remove(str);
                        return;
                    } else {
                        if (AbstractC1180j.b.ON_DESTROY.equals(bVar2)) {
                            ActivityResultRegistry.this.l(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f13531f.put(str, new c(bVar, abstractC1191a));
                if (ActivityResultRegistry.this.f13532g.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f13532g.get(str);
                    ActivityResultRegistry.this.f13532g.remove(str);
                    bVar.a(obj);
                }
                androidx.activity.result.a aVar = (androidx.activity.result.a) ActivityResultRegistry.this.f13533h.getParcelable(str);
                if (aVar != null) {
                    ActivityResultRegistry.this.f13533h.remove(str);
                    bVar.a(abstractC1191a.c(aVar.c(), aVar.a()));
                }
            }
        });
        this.f13529d.put(str, dVar);
        return new a(str, abstractC1191a);
    }

    public final androidx.activity.result.c j(String str, AbstractC1191a abstractC1191a, androidx.activity.result.b bVar) {
        k(str);
        this.f13531f.put(str, new c(bVar, abstractC1191a));
        if (this.f13532g.containsKey(str)) {
            Object obj = this.f13532g.get(str);
            this.f13532g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar = (androidx.activity.result.a) this.f13533h.getParcelable(str);
        if (aVar != null) {
            this.f13533h.remove(str);
            bVar.a(abstractC1191a.c(aVar.c(), aVar.a()));
        }
        return new b(str, abstractC1191a);
    }

    public final void k(String str) {
        if (((Integer) this.f13528c.get(str)) != null) {
            return;
        }
        a(e(), str);
    }

    public final void l(String str) {
        Integer num;
        if (!this.f13530e.contains(str) && (num = (Integer) this.f13528c.remove(str)) != null) {
            this.f13527b.remove(num);
        }
        this.f13531f.remove(str);
        if (this.f13532g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f13532g.get(str));
            this.f13532g.remove(str);
        }
        if (this.f13533h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f13533h.getParcelable(str));
            this.f13533h.remove(str);
        }
        d dVar = (d) this.f13529d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f13529d.remove(str);
        }
    }
}
