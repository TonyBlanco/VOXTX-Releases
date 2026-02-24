package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.F1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f38742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f38743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f38745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Field f38746f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PurchasingService.registerListener(j2.this.f38741a, j2.this.f38743c);
        }
    }

    public class b implements PurchasingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PurchasingListener f38748a;

        public b() {
        }

        public /* synthetic */ b(j2 j2Var, a aVar) {
            this();
        }
    }

    public j2(Context context) {
        this.f38742b = false;
        this.f38744d = false;
        this.f38741a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            a aVar = null;
            try {
                this.f38745e = cls.getMethod("d", null).invoke(null, null);
            } catch (NullPointerException unused) {
                this.f38745e = cls.getMethod("e", null).invoke(null, null);
                this.f38744d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f38746f = declaredField;
            declaredField.setAccessible(true);
            b bVar = new b(this, aVar);
            this.f38743c = bVar;
            bVar.f38748a = (PurchasingListener) this.f38746f.get(this.f38745e);
            this.f38742b = true;
            e();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e9) {
            d(e9);
        }
    }

    public static void d(Exception exc) {
        F1.b(F1.v.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    public void c() {
        if (this.f38742b) {
            try {
                PurchasingListener purchasingListener = (PurchasingListener) this.f38746f.get(this.f38745e);
                b bVar = this.f38743c;
                if (purchasingListener != bVar) {
                    bVar.f38748a = purchasingListener;
                    e();
                }
            } catch (IllegalAccessException e9) {
                e9.printStackTrace();
            }
        }
    }

    public final void e() {
        if (this.f38744d) {
            OSUtils.S(new a());
        } else {
            PurchasingService.registerListener(this.f38741a, this.f38743c);
        }
    }
}
