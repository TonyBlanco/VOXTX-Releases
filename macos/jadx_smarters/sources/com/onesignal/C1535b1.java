package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.onesignal.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1535b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f38669b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38670c;

    /* JADX INFO: renamed from: com.onesignal.b1$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f38671a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f38672c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f38673d;

        public a(Method method, Object obj, Object obj2) {
            this.f38671a = method;
            this.f38672c = obj;
            this.f38673d = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f38671a.invoke(this.f38672c, this.f38673d);
            } catch (IllegalAccessException | InvocationTargetException e9) {
                e9.printStackTrace();
            }
        }
    }

    public C1535b1(String str, boolean z9) {
        this.f38668a = str;
        this.f38670c = z9;
    }

    public void a(Object obj) {
        this.f38669b.add(new WeakReference(obj));
    }

    public void b(Object obj) {
        this.f38669b.add(obj);
    }

    public boolean c(Object obj) {
        boolean z9 = false;
        for (Object obj2 : this.f38669b) {
            if (obj2 instanceof WeakReference) {
                obj2 = ((WeakReference) obj2).get();
            }
            if (obj2 != null) {
                try {
                    Method declaredMethod = obj2.getClass().getDeclaredMethod(this.f38668a, obj.getClass());
                    declaredMethod.setAccessible(true);
                    if (this.f38670c) {
                        r.f38815a.b(new a(declaredMethod, obj2, obj));
                    } else {
                        try {
                            declaredMethod.invoke(obj2, obj);
                        } catch (IllegalAccessException | InvocationTargetException e9) {
                            e9.printStackTrace();
                        }
                    }
                    z9 = true;
                } catch (NoSuchMethodException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return z9;
    }
}
