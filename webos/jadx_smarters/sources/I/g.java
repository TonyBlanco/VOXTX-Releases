package i;

import P.AbstractC0960b;
import P.AbstractC0980w;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.M;
import k.d0;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class[] f41731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class[] f41732f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f41733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f41734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f41735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f41736d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class[] f41737c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f41738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f41739b;

        public a(Object obj, String str) {
            this.f41738a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f41739b = cls.getMethod(str, f41737c);
            } catch (Exception e9) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e9);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f41739b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f41739b.invoke(this.f41738a, menuItem)).booleanValue();
                }
                this.f41739b.invoke(this.f41738a, menuItem);
                return true;
            } catch (Exception e9) {
                throw new RuntimeException(e9);
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public AbstractC0960b f41740A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CharSequence f41741B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public CharSequence f41742C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public ColorStateList f41743D = null;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public PorterDuff.Mode f41744E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Menu f41746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f41748c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f41749d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f41750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f41751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f41752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f41753h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f41754i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f41755j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f41756k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f41757l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f41758m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f41759n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f41760o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f41761p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f41762q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f41763r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f41764s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f41765t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f41766u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f41767v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f41768w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f41769x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f41770y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f41771z;

        public b(Menu menu) {
            this.f41746a = menu;
            h();
        }

        public void a() {
            this.f41753h = true;
            i(this.f41746a.add(this.f41747b, this.f41754i, this.f41755j, this.f41756k));
        }

        public SubMenu b() {
            this.f41753h = true;
            SubMenu subMenuAddSubMenu = this.f41746a.addSubMenu(this.f41747b, this.f41754i, this.f41755j, this.f41756k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f41753h;
        }

        public final Object e(String str, Class[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f41735c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e9) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e9);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f41735c.obtainStyledAttributes(attributeSet, j.f18160w1);
            this.f41747b = typedArrayObtainStyledAttributes.getResourceId(j.f18170y1, 0);
            this.f41748c = typedArrayObtainStyledAttributes.getInt(j.f17918A1, 0);
            this.f41749d = typedArrayObtainStyledAttributes.getInt(j.f17923B1, 0);
            this.f41750e = typedArrayObtainStyledAttributes.getInt(j.f17928C1, 0);
            this.f41751f = typedArrayObtainStyledAttributes.getBoolean(j.f18175z1, true);
            this.f41752g = typedArrayObtainStyledAttributes.getBoolean(j.f18165x1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            d0 d0VarU = d0.u(g.this.f41735c, attributeSet, j.f17933D1);
            this.f41754i = d0VarU.n(j.f17948G1, 0);
            this.f41755j = (d0VarU.k(j.f17963J1, this.f41748c) & (-65536)) | (d0VarU.k(j.f17968K1, this.f41749d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f41756k = d0VarU.p(j.f17973L1);
            this.f41757l = d0VarU.p(j.f17978M1);
            this.f41758m = d0VarU.n(j.f17938E1, 0);
            this.f41759n = c(d0VarU.o(j.f17983N1));
            this.f41760o = d0VarU.k(j.f18018U1, 4096);
            this.f41761p = c(d0VarU.o(j.f17988O1));
            this.f41762q = d0VarU.k(j.f18038Y1, 4096);
            this.f41763r = d0VarU.s(j.f17993P1) ? d0VarU.a(j.f17993P1, false) : this.f41750e;
            this.f41764s = d0VarU.a(j.f17953H1, false);
            this.f41765t = d0VarU.a(j.f17958I1, this.f41751f);
            this.f41766u = d0VarU.a(j.f17943F1, this.f41752g);
            this.f41767v = d0VarU.k(j.f18043Z1, -1);
            this.f41771z = d0VarU.o(j.f17998Q1);
            this.f41768w = d0VarU.n(j.f18003R1, 0);
            this.f41769x = d0VarU.o(j.f18013T1);
            String strO = d0VarU.o(j.f18008S1);
            this.f41770y = strO;
            boolean z9 = strO != null;
            if (z9 && this.f41768w == 0 && this.f41769x == null) {
                this.f41740A = (AbstractC0960b) e(strO, g.f41732f, g.this.f41734b);
            } else {
                if (z9) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f41740A = null;
            }
            this.f41741B = d0VarU.p(j.f18023V1);
            this.f41742C = d0VarU.p(j.f18049a2);
            if (d0VarU.s(j.f18033X1)) {
                this.f41744E = M.e(d0VarU.k(j.f18033X1, -1), this.f41744E);
            } else {
                this.f41744E = null;
            }
            if (d0VarU.s(j.f18028W1)) {
                this.f41743D = d0VarU.c(j.f18028W1);
            } else {
                this.f41743D = null;
            }
            d0VarU.w();
            this.f41753h = false;
        }

        public void h() {
            this.f41747b = 0;
            this.f41748c = 0;
            this.f41749d = 0;
            this.f41750e = 0;
            this.f41751f = true;
            this.f41752g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z9 = false;
            menuItem.setChecked(this.f41764s).setVisible(this.f41765t).setEnabled(this.f41766u).setCheckable(this.f41763r >= 1).setTitleCondensed(this.f41757l).setIcon(this.f41758m);
            int i9 = this.f41767v;
            if (i9 >= 0) {
                menuItem.setShowAsAction(i9);
            }
            if (this.f41771z != null) {
                if (g.this.f41735c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f41771z));
            }
            if (this.f41763r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof j.c) {
                    ((j.c) menuItem).h(true);
                }
            }
            String str = this.f41769x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f41731e, g.this.f41733a));
                z9 = true;
            }
            int i10 = this.f41768w;
            if (i10 > 0) {
                if (z9) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i10);
                }
            }
            AbstractC0960b abstractC0960b = this.f41740A;
            if (abstractC0960b != null) {
                AbstractC0980w.c(menuItem, abstractC0960b);
            }
            AbstractC0980w.e(menuItem, this.f41741B);
            AbstractC0980w.i(menuItem, this.f41742C);
            AbstractC0980w.d(menuItem, this.f41759n, this.f41760o);
            AbstractC0980w.h(menuItem, this.f41761p, this.f41762q);
            PorterDuff.Mode mode = this.f41744E;
            if (mode != null) {
                AbstractC0980w.g(menuItem, mode);
            }
            ColorStateList colorStateList = this.f41743D;
            if (colorStateList != null) {
                AbstractC0980w.f(menuItem, colorStateList);
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        f41731e = clsArr;
        f41732f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f41735c = context;
        Object[] objArr = {context};
        this.f41733a = objArr;
        this.f41734b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f41736d == null) {
            this.f41736d = a(this.f41735c);
        }
        return this.f41736d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z9 = false;
        boolean z10 = false;
        while (!z9) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z10 && name2.equals(str)) {
                        str = null;
                        z10 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            AbstractC0960b abstractC0960b = bVar.f41740A;
                            if (abstractC0960b == null || !abstractC0960b.b()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z9 = true;
                    }
                }
            } else if (!z10) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z10 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i9, Menu menu) {
        if (!(menu instanceof I.a)) {
            super.inflate(i9, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f41735c.getResources().getLayout(i9);
                    c(layout, Xml.asAttributeSet(layout), menu);
                } catch (IOException e9) {
                    throw new InflateException("Error inflating menu XML", e9);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } finally {
            if (layout != null) {
                layout.close();
            }
        }
    }
}
