package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f41712f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f41714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f41715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f41716d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f41717e;

    public static class a {
        public static Context a(d dVar, Configuration configuration) {
            return dVar.createConfigurationContext(configuration);
        }
    }

    public d(Context context, int i9) {
        super(context);
        this.f41713a = i9;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f41714b = theme;
    }

    public static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f41712f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f41712f = configuration2;
        }
        return configuration.equals(f41712f);
    }

    public void a(Configuration configuration) {
        if (this.f41717e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f41716d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f41716d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final Resources b() {
        if (this.f41717e == null) {
            Configuration configuration = this.f41716d;
            this.f41717e = (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) ? super.getResources() : a.a(this, this.f41716d).getResources();
        }
        return this.f41717e;
    }

    public int c() {
        return this.f41713a;
    }

    public final void d() {
        boolean z9 = this.f41714b == null;
        if (z9) {
            this.f41714b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f41714b.setTo(theme);
            }
        }
        f(this.f41714b, this.f41713a, z9);
    }

    public void f(Resources.Theme theme, int i9, boolean z9) {
        theme.applyStyle(i9, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f41715c == null) {
            this.f41715c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f41715c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f41714b;
        if (theme != null) {
            return theme;
        }
        if (this.f41713a == 0) {
            this.f41713a = c.i.f17915e;
        }
        d();
        return this.f41714b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i9) {
        if (this.f41713a != i9) {
            this.f41713a = i9;
            d();
        }
    }
}
