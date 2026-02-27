package d;

import P.L;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.C2108c;
import k.C2110e;
import k.C2111f;
import k.C2115j;
import k.C2119n;
import k.C2121p;
import k.C2123s;
import k.C2125u;
import k.C2127w;
import k.a0;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: d.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1644w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f39420b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f39421c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f39422d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f39423e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f39424f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f39425g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final s.i f39426h = new s.i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f39427a = new Object[2];

    /* JADX INFO: renamed from: d.w$a */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f39428a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f39429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f39430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Context f39431e;

        public a(View view, String str) {
            this.f39428a = view;
            this.f39429c = str;
        }

        public final void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f39429c, View.class)) != null) {
                        this.f39430d = method;
                        this.f39431e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f39428a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f39428a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f39429c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f39428a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f39430d == null) {
                a(this.f39428a.getContext());
            }
            try {
                this.f39430d.invoke(this.f39431e, view);
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e9);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException("Could not execute method for android:onClick", e10);
            }
        }
    }

    public static Context u(Context context, AttributeSet attributeSet, boolean z9, boolean z10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.f18005R3, 0, 0);
        int resourceId = z9 ? typedArrayObtainStyledAttributes.getResourceId(c.j.f18010S3, 0) : 0;
        if (z10 && resourceId == 0 && (resourceId = typedArrayObtainStyledAttributes.getResourceId(c.j.f18015T3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof i.d) && ((i.d) context).c() == resourceId) ? context : new i.d(context, resourceId) : context;
    }

    public final void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f39422d);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            L.t0(view, typedArrayObtainStyledAttributes.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f39423e);
        if (typedArrayObtainStyledAttributes2.hasValue(0)) {
            L.v0(view, typedArrayObtainStyledAttributes2.getString(0));
        }
        typedArrayObtainStyledAttributes2.recycle();
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f39424f);
        if (typedArrayObtainStyledAttributes3.hasValue(0)) {
            L.H0(view, typedArrayObtainStyledAttributes3.getBoolean(0, false));
        }
        typedArrayObtainStyledAttributes3.recycle();
    }

    public final void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && L.R(view)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f39421c);
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public C2108c c(Context context, AttributeSet attributeSet) {
        return new C2108c(context, attributeSet);
    }

    public C2110e d(Context context, AttributeSet attributeSet) {
        return new C2110e(context, attributeSet);
    }

    public AppCompatCheckBox e(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public C2111f f(Context context, AttributeSet attributeSet) {
        return new C2111f(context, attributeSet);
    }

    public C2115j g(Context context, AttributeSet attributeSet) {
        return new C2115j(context, attributeSet);
    }

    public C2119n h(Context context, AttributeSet attributeSet) {
        return new C2119n(context, attributeSet);
    }

    public AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    public C2121p j(Context context, AttributeSet attributeSet) {
        return new C2121p(context, attributeSet);
    }

    public AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public C2123s l(Context context, AttributeSet attributeSet) {
        return new C2123s(context, attributeSet);
    }

    public C2125u m(Context context, AttributeSet attributeSet) {
        return new C2125u(context, attributeSet);
    }

    public C2127w n(Context context, AttributeSet attributeSet) {
        return new C2127w(context, attributeSet);
    }

    public AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public k.F p(Context context, AttributeSet attributeSet) {
        return new k.F(context, attributeSet);
    }

    public View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z9, boolean z10, boolean z11, boolean z12) {
        Context context2;
        View viewL;
        context2 = (!z9 || view == null) ? context : view.getContext();
        if (z10 || z11) {
            context2 = u(context2, attributeSet, z10, z11);
        }
        if (z12) {
            context2 = a0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                viewL = l(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckedTextView":
                viewL = f(context2, attributeSet);
                v(viewL, str);
                break;
            case "MultiAutoCompleteTextView":
                viewL = j(context2, attributeSet);
                v(viewL, str);
                break;
            case "TextView":
                viewL = o(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageButton":
                viewL = h(context2, attributeSet);
                v(viewL, str);
                break;
            case "SeekBar":
                viewL = m(context2, attributeSet);
                v(viewL, str);
                break;
            case "Spinner":
                viewL = n(context2, attributeSet);
                v(viewL, str);
                break;
            case "RadioButton":
                viewL = k(context2, attributeSet);
                v(viewL, str);
                break;
            case "ToggleButton":
                viewL = p(context2, attributeSet);
                v(viewL, str);
                break;
            case "ImageView":
                viewL = i(context2, attributeSet);
                v(viewL, str);
                break;
            case "AutoCompleteTextView":
                viewL = c(context2, attributeSet);
                v(viewL, str);
                break;
            case "CheckBox":
                viewL = e(context2, attributeSet);
                v(viewL, str);
                break;
            case "EditText":
                viewL = g(context2, attributeSet);
                v(viewL, str);
                break;
            case "Button":
                viewL = d(context2, attributeSet);
                v(viewL, str);
                break;
            default:
                viewL = q(context2, str, attributeSet);
                break;
        }
        if (viewL == null && context != context2) {
            viewL = t(context2, str, attributeSet);
        }
        if (viewL != null) {
            b(viewL, attributeSet);
            a(context2, viewL, attributeSet);
        }
        return viewL;
    }

    public final View s(Context context, String str, String str2) {
        String str3;
        s.i iVar = f39426h;
        Constructor constructor = (Constructor) iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f39420b);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f39427a);
    }

    public final View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Name.LABEL);
        }
        try {
            Object[] objArr = this.f39427a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i9 = 0;
            while (true) {
                String[] strArr = f39425g;
                if (i9 >= strArr.length) {
                    return null;
                }
                View viewS = s(context, str, strArr[i9]);
                if (viewS != null) {
                    return viewS;
                }
                i9++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f39427a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    public final void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
