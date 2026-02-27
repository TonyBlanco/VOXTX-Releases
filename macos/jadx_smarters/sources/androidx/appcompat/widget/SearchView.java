package androidx.appcompat.widget;

import P.L;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import c.AbstractC1238a;
import c.AbstractC1241d;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k.C2108c;
import k.Y;
import k.d0;
import k.g0;
import k.m0;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends androidx.appcompat.widget.b implements i.c {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final o f13988t0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Rect f13989A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Rect f13990B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int[] f13991C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int[] f13992D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ImageView f13993E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Drawable f13994F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f13995G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f13996H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Intent f13997I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final Intent f13998J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final CharSequence f13999K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public m f14000L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public View.OnFocusChangeListener f14001M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public View.OnClickListener f14002N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public boolean f14003O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f14004P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public U.a f14005Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f14006R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public CharSequence f14007S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f14008T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f14009U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f14010V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f14011W;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public CharSequence f14012e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public CharSequence f14013f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f14014g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f14015h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public SearchableInfo f14016i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Bundle f14017j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Runnable f14018k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public Runnable f14019l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final WeakHashMap f14020m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final View.OnClickListener f14021n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public View.OnKeyListener f14022o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TextView.OnEditorActionListener f14023p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SearchAutoComplete f14024q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AdapterView.OnItemClickListener f14025q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f14026r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f14027r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f14028s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextWatcher f14029s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final View f14030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ImageView f14031u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ImageView f14032v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView f14033w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ImageView f14034x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final View f14035y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q f14036z;

    public static class SearchAutoComplete extends C2108c {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f14037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public SearchView f14038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f14039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Runnable f14040i;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, AbstractC1238a.f17754m);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i9) {
            super(context, attributeSet, i9);
            this.f14040i = new a();
            this.f14037f = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i9 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i9 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
            }
            if (i9 < 600) {
                return (i9 < 640 || i10 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.f13988t0.c(this);
                return;
            }
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        public boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void d() {
            if (this.f14039h) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f14039h = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f14037f <= 0 || super.enoughToFilter();
        }

        @Override // k.C2108c, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f14039h) {
                removeCallbacks(this.f14040i);
                post(this.f14040i);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z9, int i9, Rect rect) {
            super.onFocusChanged(z9, i9, rect);
            this.f14038g.Z();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i9, KeyEvent keyEvent) {
            if (i9 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f14038g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i9, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z9) {
            super.onWindowFocusChanged(z9);
            if (z9 && this.f14038g.hasFocus() && getVisibility() == 0) {
                this.f14039h = true;
                if (SearchView.M(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z9) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z9) {
                this.f14039h = false;
                removeCallbacks(this.f14040i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f14039h = true;
                    return;
                }
                this.f14039h = false;
                removeCallbacks(this.f14040i);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f14038g = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i9) {
            super.setThreshold(i9);
            this.f14037f = i9;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            SearchView.this.Y(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.f0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            U.a aVar = SearchView.this.f14005Q;
            if (aVar instanceof Y) {
                aVar.a(null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f14001M;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z9);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            SearchView.this.B();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f14031u) {
                searchView.V();
                return;
            }
            if (view == searchView.f14033w) {
                searchView.R();
                return;
            }
            if (view == searchView.f14032v) {
                searchView.W();
            } else if (view == searchView.f14034x) {
                searchView.a0();
            } else if (view == searchView.f14024q) {
                searchView.H();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i9, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f14016i0 == null) {
                return false;
            }
            if (searchView.f14024q.isPopupShowing() && SearchView.this.f14024q.getListSelection() != -1) {
                return SearchView.this.X(view, i9, keyEvent);
            }
            if (SearchView.this.f14024q.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i9 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.P(0, null, searchView2.f14024q.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
            SearchView.this.W();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            SearchView.this.S(i9, 0, null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i9, long j9) {
            SearchView.this.T(i9);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i9) {
            searchAutoComplete.setInputMethodMode(i9);
        }
    }

    public interface l {
    }

    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface n {
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f14052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f14053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f14054c;

        public o() {
            this.f14052a = null;
            this.f14053b = null;
            this.f14054c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f14052a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f14053b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f14054c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f14053b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f14052a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f14054c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class p extends V.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f14055d;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i9) {
                return new p[i9];
            }
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14055d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f14055d + "}";
        }

        @Override // V.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeValue(Boolean.valueOf(this.f14055d));
        }
    }

    public static class q extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f14056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f14057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f14058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f14059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f14060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f14061f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f14060e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f14057b = new Rect();
            this.f14059d = new Rect();
            this.f14058c = new Rect();
            a(rect, rect2);
            this.f14056a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f14057b.set(rect);
            this.f14059d.set(rect);
            Rect rect3 = this.f14059d;
            int i9 = this.f14060e;
            rect3.inset(-i9, -i9);
            this.f14058c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z9;
            float width;
            int height;
            boolean z10;
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z11 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z10 = this.f14061f;
                    if (z10 && !this.f14059d.contains(x9, y9)) {
                        z11 = z10;
                        z9 = false;
                    }
                } else {
                    if (action == 3) {
                        z10 = this.f14061f;
                        this.f14061f = false;
                    }
                    z9 = true;
                    z11 = false;
                }
                z11 = z10;
                z9 = true;
            } else {
                if (this.f14057b.contains(x9, y9)) {
                    this.f14061f = true;
                    z9 = true;
                }
                z9 = true;
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            if (!z9 || this.f14058c.contains(x9, y9)) {
                Rect rect = this.f14058c;
                width = x9 - rect.left;
                height = y9 - rect.top;
            } else {
                width = this.f14056a.getWidth() / 2;
                height = this.f14056a.getHeight() / 2;
            }
            motionEvent.setLocation(width, height);
            return this.f14056a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        f13988t0 = Build.VERSION.SDK_INT < 29 ? new o() : null;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17734K);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f13989A = new Rect();
        this.f13990B = new Rect();
        this.f13991C = new int[2];
        this.f13992D = new int[2];
        this.f14018k0 = new b();
        this.f14019l0 = new c();
        this.f14020m0 = new WeakHashMap();
        f fVar = new f();
        this.f14021n0 = fVar;
        this.f14022o0 = new g();
        h hVar = new h();
        this.f14023p0 = hVar;
        i iVar = new i();
        this.f14025q0 = iVar;
        j jVar = new j();
        this.f14027r0 = jVar;
        this.f14029s0 = new a();
        d0 d0VarV = d0.v(context, attributeSet, c.j.f18116n2, i9, 0);
        L.q0(this, context, c.j.f18116n2, attributeSet, d0VarV.r(), i9, 0);
        LayoutInflater.from(context).inflate(d0VarV.n(c.j.f18166x2, c.g.f17894r), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(c.f.f17838D);
        this.f14024q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f14026r = findViewById(c.f.f17876z);
        View viewFindViewById = findViewById(c.f.f17837C);
        this.f14028s = viewFindViewById;
        View viewFindViewById2 = findViewById(c.f.f17844J);
        this.f14030t = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(c.f.f17874x);
        this.f14031u = imageView;
        ImageView imageView2 = (ImageView) findViewById(c.f.f17835A);
        this.f14032v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(c.f.f17875y);
        this.f14033w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(c.f.f17839E);
        this.f14034x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(c.f.f17836B);
        this.f13993E = imageView5;
        L.w0(viewFindViewById, d0VarV.g(c.j.f18171y2));
        L.w0(viewFindViewById2, d0VarV.g(c.j.f17929C2));
        imageView.setImageDrawable(d0VarV.g(c.j.f17924B2));
        imageView2.setImageDrawable(d0VarV.g(c.j.f18156v2));
        imageView3.setImageDrawable(d0VarV.g(c.j.f18141s2));
        imageView4.setImageDrawable(d0VarV.g(c.j.f17939E2));
        imageView5.setImageDrawable(d0VarV.g(c.j.f17924B2));
        this.f13994F = d0VarV.g(c.j.f17919A2);
        g0.a(imageView, getResources().getString(c.h.f17910n));
        this.f13995G = d0VarV.n(c.j.f17934D2, c.g.f17893q);
        this.f13996H = d0VarV.n(c.j.f18146t2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f14029s0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f14022o0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(d0VarV.a(c.j.f18161w2, true));
        int iF = d0VarV.f(c.j.f18126p2, -1);
        if (iF != -1) {
            setMaxWidth(iF);
        }
        this.f13999K = d0VarV.p(c.j.f18151u2);
        this.f14007S = d0VarV.p(c.j.f18176z2);
        int iK = d0VarV.k(c.j.f18136r2, -1);
        if (iK != -1) {
            setImeOptions(iK);
        }
        int iK2 = d0VarV.k(c.j.f18131q2, -1);
        if (iK2 != -1) {
            setInputType(iK2);
        }
        setFocusable(d0VarV.a(c.j.f18121o2, true));
        d0VarV.w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f13997I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f13998J = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f14035y = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        k0(this.f14003O);
        g0();
    }

    public static boolean M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1241d.f17781e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(AbstractC1241d.f17782f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f14024q.setText(charSequence);
        this.f14024q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void B() {
        if (this.f14035y.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f14028s.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = m0.b(this);
            int dimensionPixelSize = this.f14003O ? resources.getDimensionPixelSize(AbstractC1241d.f17779c) + resources.getDimensionPixelSize(AbstractC1241d.f17780d) : 0;
            this.f14024q.getDropDownBackground().getPadding(rect);
            int i9 = rect.left;
            this.f14024q.setDropDownHorizontalOffset(zB ? -i9 : paddingLeft - (i9 + dimensionPixelSize));
            this.f14024q.setDropDownWidth((((this.f14035y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent C(String str, Uri uri, String str2, String str3, int i9, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f14013f0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f14017j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i9 != 0) {
            intent.putExtra("action_key", i9);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f14016i0.getSearchActivity());
        return intent;
    }

    public final Intent D(Cursor cursor, int i9, String str) {
        int position;
        String strO;
        try {
            String strO2 = Y.o(cursor, "suggest_intent_action");
            if (strO2 == null) {
                strO2 = this.f14016i0.getSuggestIntentAction();
            }
            if (strO2 == null) {
                strO2 = "android.intent.action.SEARCH";
            }
            String str2 = strO2;
            String strO3 = Y.o(cursor, "suggest_intent_data");
            if (strO3 == null) {
                strO3 = this.f14016i0.getSuggestIntentData();
            }
            if (strO3 != null && (strO = Y.o(cursor, "suggest_intent_data_id")) != null) {
                strO3 = strO3 + "/" + Uri.encode(strO);
            }
            return C(str2, strO3 == null ? null : Uri.parse(strO3), Y.o(cursor, "suggest_intent_extra_data"), Y.o(cursor, "suggest_intent_query"), i9, str);
        } catch (RuntimeException e9) {
            try {
                position = cursor.getPosition();
            } catch (RuntimeException unused) {
                position = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e9);
            return null;
        }
    }

    public final Intent E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f14017j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void G() {
        this.f14024q.dismissDropDown();
    }

    public void H() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f14024q);
            return;
        }
        o oVar = f13988t0;
        oVar.b(this.f14024q);
        oVar.a(this.f14024q);
    }

    public final void I(View view, Rect rect) {
        view.getLocationInWindow(this.f13991C);
        getLocationInWindow(this.f13992D);
        int[] iArr = this.f13991C;
        int i9 = iArr[1];
        int[] iArr2 = this.f13992D;
        int i10 = i9 - iArr2[1];
        int i11 = iArr[0] - iArr2[0];
        rect.set(i11, i10, view.getWidth() + i11, view.getHeight() + i10);
    }

    public final CharSequence J(CharSequence charSequence) {
        if (!this.f14003O || this.f13994F == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f14024q.getTextSize()) * 1.25d);
        this.f13994F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f13994F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean K() {
        SearchableInfo searchableInfo = this.f14016i0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = this.f14016i0.getVoiceSearchLaunchWebSearch() ? this.f13997I : this.f14016i0.getVoiceSearchLaunchRecognizer() ? this.f13998J : null;
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean L() {
        return this.f14004P;
    }

    public final boolean N() {
        return (this.f14006R || this.f14011W) && !L();
    }

    public final void O(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e9) {
            Log.e("SearchView", "Failed launch activity: " + intent, e9);
        }
    }

    public void P(int i9, String str, String str2) {
        getContext().startActivity(C("android.intent.action.SEARCH", null, null, str2, i9, str));
    }

    public final boolean Q(int i9, int i10, String str) {
        Cursor cursorD = this.f14005Q.d();
        if (cursorD == null || !cursorD.moveToPosition(i9)) {
            return false;
        }
        O(D(cursorD, i10, str));
        return true;
    }

    public void R() {
        if (!TextUtils.isEmpty(this.f14024q.getText())) {
            this.f14024q.setText("");
            this.f14024q.requestFocus();
            this.f14024q.setImeVisibility(true);
        } else if (this.f14003O) {
            clearFocus();
            k0(true);
        }
    }

    public boolean S(int i9, int i10, String str) {
        Q(i9, 0, null);
        this.f14024q.setImeVisibility(false);
        G();
        return true;
    }

    public boolean T(int i9) {
        c0(i9);
        return true;
    }

    public void U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void V() {
        k0(false);
        this.f14024q.requestFocus();
        this.f14024q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f14002N;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void W() {
        Editable text = this.f14024q.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.f14000L;
        if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
            if (this.f14016i0 != null) {
                P(0, null, text.toString());
            }
            this.f14024q.setImeVisibility(false);
            G();
        }
    }

    public boolean X(View view, int i9, KeyEvent keyEvent) {
        if (this.f14016i0 != null && this.f14005Q != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i9 == 66 || i9 == 84 || i9 == 61) {
                return S(this.f14024q.getListSelection(), 0, null);
            }
            if (i9 == 21 || i9 == 22) {
                this.f14024q.setSelection(i9 == 21 ? 0 : this.f14024q.length());
                this.f14024q.setListSelection(0);
                this.f14024q.clearListSelection();
                this.f14024q.b();
                return true;
            }
            if (i9 == 19) {
                this.f14024q.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void Y(CharSequence charSequence) {
        Editable text = this.f14024q.getText();
        this.f14013f0 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        j0(!zIsEmpty);
        l0(zIsEmpty);
        e0();
        i0();
        if (this.f14000L != null && !TextUtils.equals(charSequence, this.f14012e0)) {
            this.f14000L.onQueryTextChange(charSequence.toString());
        }
        this.f14012e0 = charSequence.toString();
    }

    public void Z() {
        k0(L());
        b0();
        if (this.f14024q.hasFocus()) {
            H();
        }
    }

    public void a0() {
        Intent intentE;
        SearchableInfo searchableInfo = this.f14016i0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                intentE = F(this.f13997I, searchableInfo);
            } else if (!searchableInfo.getVoiceSearchLaunchRecognizer()) {
                return;
            } else {
                intentE = E(this.f13998J, searchableInfo);
            }
            getContext().startActivity(intentE);
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // i.c
    public void b() {
        if (this.f14014g0) {
            return;
        }
        this.f14014g0 = true;
        int imeOptions = this.f14024q.getImeOptions();
        this.f14015h0 = imeOptions;
        this.f14024q.setImeOptions(imeOptions | 33554432);
        this.f14024q.setText("");
        setIconified(false);
    }

    public final void b0() {
        post(this.f14018k0);
    }

    public final void c0(int i9) {
        CharSequence charSequenceB;
        Editable text = this.f14024q.getText();
        Cursor cursorD = this.f14005Q.d();
        if (cursorD == null) {
            return;
        }
        if (!cursorD.moveToPosition(i9) || (charSequenceB = this.f14005Q.b(cursorD)) == null) {
            setQuery(text);
        } else {
            setQuery(charSequenceB);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f14009U = true;
        super.clearFocus();
        this.f14024q.clearFocus();
        this.f14024q.setImeVisibility(false);
        this.f14009U = false;
    }

    public void d0(CharSequence charSequence, boolean z9) {
        this.f14024q.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f14024q;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f14013f0 = charSequence;
        }
        if (!z9 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        W();
    }

    public final void e0() {
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f14024q.getText());
        if (!z10 && (!this.f14003O || this.f14014g0)) {
            z9 = false;
        }
        this.f14033w.setVisibility(z9 ? 0 : 8);
        Drawable drawable = this.f14033w.getDrawable();
        if (drawable != null) {
            drawable.setState(z10 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // i.c
    public void f() {
        d0("", false);
        clearFocus();
        k0(true);
        this.f14024q.setImeOptions(this.f14015h0);
        this.f14014g0 = false;
    }

    public void f0() {
        int[] iArr = this.f14024q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f14028s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f14030t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f14024q;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(J(queryHint));
    }

    public int getImeOptions() {
        return this.f14024q.getImeOptions();
    }

    public int getInputType() {
        return this.f14024q.getInputType();
    }

    public int getMaxWidth() {
        return this.f14010V;
    }

    public CharSequence getQuery() {
        return this.f14024q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f14007S;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f14016i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f13999K : getContext().getText(this.f14016i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f13996H;
    }

    public int getSuggestionRowLayout() {
        return this.f13995G;
    }

    public U.a getSuggestionsAdapter() {
        return this.f14005Q;
    }

    public final void h0() {
        this.f14024q.setThreshold(this.f14016i0.getSuggestThreshold());
        this.f14024q.setImeOptions(this.f14016i0.getImeOptions());
        int inputType = this.f14016i0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f14016i0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f14024q.setInputType(inputType);
        U.a aVar = this.f14005Q;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f14016i0.getSuggestAuthority() != null) {
            Y y9 = new Y(getContext(), this, this.f14016i0, this.f14020m0);
            this.f14005Q = y9;
            this.f14024q.setAdapter(y9);
            ((Y) this.f14005Q).x(this.f14008T ? 2 : 1);
        }
    }

    public final void i0() {
        this.f14030t.setVisibility((N() && (this.f14032v.getVisibility() == 0 || this.f14034x.getVisibility() == 0)) ? 0 : 8);
    }

    public final void j0(boolean z9) {
        this.f14032v.setVisibility((this.f14006R && N() && hasFocus() && (z9 || !this.f14011W)) ? 0 : 8);
    }

    public final void k0(boolean z9) {
        this.f14004P = z9;
        int i9 = 8;
        int i10 = z9 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f14024q.getText());
        this.f14031u.setVisibility(i10);
        j0(!zIsEmpty);
        this.f14026r.setVisibility(z9 ? 8 : 0);
        if (this.f13993E.getDrawable() != null && !this.f14003O) {
            i9 = 0;
        }
        this.f13993E.setVisibility(i9);
        e0();
        l0(zIsEmpty);
        i0();
    }

    public final void l0(boolean z9) {
        int i9 = 8;
        if (this.f14011W && !L() && z9) {
            this.f14032v.setVisibility(8);
            i9 = 0;
        }
        this.f14034x.setVisibility(i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f14018k0);
        post(this.f14019l0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        if (z9) {
            I(this.f14024q, this.f13989A);
            Rect rect = this.f13990B;
            Rect rect2 = this.f13989A;
            rect.set(rect2.left, 0, rect2.right, i12 - i10);
            q qVar = this.f14036z;
            if (qVar != null) {
                qVar.a(this.f13990B, this.f13989A);
                return;
            }
            q qVar2 = new q(this.f13990B, this.f13989A, this.f14024q);
            this.f14036z = qVar2;
            setTouchDelegate(qVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    @Override // androidx.appcompat.widget.b, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.L()
            if (r0 == 0) goto La
            super.onMeasure(r4, r5)
            return
        La:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L30
            if (r0 == 0) goto L26
            if (r0 == r2) goto L1d
            goto L3a
        L1d:
            int r0 = r3.f14010V
            if (r0 <= 0) goto L3a
        L21:
            int r4 = java.lang.Math.min(r0, r4)
            goto L3a
        L26:
            int r4 = r3.f14010V
            if (r4 <= 0) goto L2b
            goto L3a
        L2b:
            int r4 = r3.getPreferredWidth()
            goto L3a
        L30:
            int r0 = r3.f14010V
            if (r0 <= 0) goto L35
            goto L21
        L35:
            int r0 = r3.getPreferredWidth()
            goto L21
        L3a:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L4c
            if (r0 == 0) goto L47
            goto L54
        L47:
            int r5 = r3.getPreferredHeight()
            goto L54
        L4c:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L54:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        k0(pVar.f14055d);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f14055d = L();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z9) {
        super.onWindowFocusChanged(z9);
        b0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i9, Rect rect) {
        if (this.f14009U || !isFocusable()) {
            return false;
        }
        if (L()) {
            return super.requestFocus(i9, rect);
        }
        boolean zRequestFocus = this.f14024q.requestFocus(i9, rect);
        if (zRequestFocus) {
            k0(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f14017j0 = bundle;
    }

    public void setIconified(boolean z9) {
        if (z9) {
            R();
        } else {
            V();
        }
    }

    public void setIconifiedByDefault(boolean z9) {
        if (this.f14003O == z9) {
            return;
        }
        this.f14003O = z9;
        k0(z9);
        g0();
    }

    public void setImeOptions(int i9) {
        this.f14024q.setImeOptions(i9);
    }

    public void setInputType(int i9) {
        this.f14024q.setInputType(i9);
    }

    public void setMaxWidth(int i9) {
        this.f14010V = i9;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f14001M = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f14000L = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f14002N = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f14007S = charSequence;
        g0();
    }

    public void setQueryRefinementEnabled(boolean z9) {
        this.f14008T = z9;
        U.a aVar = this.f14005Q;
        if (aVar instanceof Y) {
            ((Y) aVar).x(z9 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f14016i0 = searchableInfo;
        if (searchableInfo != null) {
            h0();
            g0();
        }
        boolean zK = K();
        this.f14011W = zK;
        if (zK) {
            this.f14024q.setPrivateImeOptions("nm");
        }
        k0(L());
    }

    public void setSubmitButtonEnabled(boolean z9) {
        this.f14006R = z9;
        k0(L());
    }

    public void setSuggestionsAdapter(U.a aVar) {
        this.f14005Q = aVar;
        this.f14024q.setAdapter(aVar);
    }
}
