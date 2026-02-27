package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SearchOrbView;
import g0.AbstractC1797b;
import g0.AbstractC1798c;
import g0.AbstractC1801f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends RelativeLayout {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f15499C = "SearchBar";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AudioManager f15500A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public l f15501B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f15502a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SearchEditText f15503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpeechOrbView f15504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f15505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f15506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f15507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f15509i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Handler f15510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InputMethodManager f15511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f15512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f15513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f15514n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f15515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f15516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f15517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15520t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SpeechRecognizer f15521u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15522v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SoundPool f15523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SparseIntArray f15524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f15525y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Context f15526z;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15527a;

        public a(int i9) {
            this.f15527a = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar.this.f15523w.play(SearchBar.this.f15524x.get(this.f15527a), 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            SearchBar searchBar = SearchBar.this;
            if (z9) {
                searchBar.h();
            } else {
                searchBar.a();
            }
            SearchBar.this.n(z9);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar searchBar = SearchBar.this;
            searchBar.setSearchQueryInternal(searchBar.f15503c.getText().toString());
        }
    }

    public class d implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f15531a;

        public d(Runnable runnable) {
            this.f15531a = runnable;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            SearchBar searchBar = SearchBar.this;
            if (searchBar.f15525y) {
                return;
            }
            searchBar.f15510j.removeCallbacks(this.f15531a);
            SearchBar.this.f15510j.post(this.f15531a);
        }
    }

    public class e implements SearchEditText.a {
        public e() {
        }

        @Override // androidx.leanback.widget.SearchEditText.a
        public void a() {
            SearchBar searchBar = SearchBar.this;
            k kVar = searchBar.f15502a;
            if (kVar != null) {
                kVar.b(searchBar.f15506f);
            }
        }
    }

    public class f implements TextView.OnEditorActionListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar.this.k();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f15502a.b(searchBar.f15506f);
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f15512l = true;
                searchBar.f15504d.requestFocus();
            }
        }

        public f() {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        @Override // android.widget.TextView.OnEditorActionListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onEditorAction(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
            /*
                r3 = this;
                r4 = 3
                r0 = 500(0x1f4, double:2.47E-321)
                r6 = 1
                if (r4 == r5) goto L8
                if (r5 != 0) goto L1e
            L8:
                androidx.leanback.widget.SearchBar r4 = androidx.leanback.widget.SearchBar.this
                androidx.leanback.widget.SearchBar$k r2 = r4.f15502a
                if (r2 == 0) goto L1e
                r4.a()
                androidx.leanback.widget.SearchBar r4 = androidx.leanback.widget.SearchBar.this
                android.os.Handler r4 = r4.f15510j
                androidx.leanback.widget.SearchBar$f$a r5 = new androidx.leanback.widget.SearchBar$f$a
                r5.<init>()
            L1a:
                r4.postDelayed(r5, r0)
                goto L46
            L1e:
                if (r6 != r5) goto L33
                androidx.leanback.widget.SearchBar r4 = androidx.leanback.widget.SearchBar.this
                androidx.leanback.widget.SearchBar$k r2 = r4.f15502a
                if (r2 == 0) goto L33
                r4.a()
                androidx.leanback.widget.SearchBar r4 = androidx.leanback.widget.SearchBar.this
                android.os.Handler r4 = r4.f15510j
                androidx.leanback.widget.SearchBar$f$b r5 = new androidx.leanback.widget.SearchBar$f$b
                r5.<init>()
                goto L1a
            L33:
                r4 = 2
                if (r4 != r5) goto L45
                androidx.leanback.widget.SearchBar r4 = androidx.leanback.widget.SearchBar.this
                r4.a()
                androidx.leanback.widget.SearchBar r4 = androidx.leanback.widget.SearchBar.this
                android.os.Handler r4 = r4.f15510j
                androidx.leanback.widget.SearchBar$f$c r5 = new androidx.leanback.widget.SearchBar$f$c
                r5.<init>()
                goto L1a
            L45:
                r6 = 0
            L46:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.SearchBar.f.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchBar.this.l();
        }
    }

    public class h implements View.OnFocusChangeListener {
        public h() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z9) {
            SearchBar searchBar = SearchBar.this;
            if (z9) {
                searchBar.a();
                SearchBar searchBar2 = SearchBar.this;
                if (searchBar2.f15512l) {
                    searchBar2.i();
                    SearchBar.this.f15512l = false;
                }
            } else {
                searchBar.j();
            }
            SearchBar.this.n(z9);
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchBar.this.f15503c.requestFocusFromTouch();
            SearchBar.this.f15503c.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, SearchBar.this.f15503c.getWidth(), SearchBar.this.f15503c.getHeight(), 0));
            SearchBar.this.f15503c.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, SearchBar.this.f15503c.getWidth(), SearchBar.this.f15503c.getHeight(), 0));
        }
    }

    public class j implements RecognitionListener {
        public j() {
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onError(int i9) {
            String str;
            String str2;
            switch (i9) {
                case 1:
                    str = SearchBar.f15499C;
                    str2 = "recognizer network timeout";
                    Log.w(str, str2);
                    break;
                case 2:
                    str = SearchBar.f15499C;
                    str2 = "recognizer network error";
                    Log.w(str, str2);
                    break;
                case 3:
                    str = SearchBar.f15499C;
                    str2 = "recognizer audio error";
                    Log.w(str, str2);
                    break;
                case 4:
                    str = SearchBar.f15499C;
                    str2 = "recognizer server error";
                    Log.w(str, str2);
                    break;
                case 5:
                    str = SearchBar.f15499C;
                    str2 = "recognizer client error";
                    Log.w(str, str2);
                    break;
                case 6:
                    str = SearchBar.f15499C;
                    str2 = "recognizer speech timeout";
                    Log.w(str, str2);
                    break;
                case 7:
                    str = SearchBar.f15499C;
                    str2 = "recognizer no match";
                    Log.w(str, str2);
                    break;
                case 8:
                    str = SearchBar.f15499C;
                    str2 = "recognizer busy";
                    Log.w(str, str2);
                    break;
                case 9:
                    str = SearchBar.f15499C;
                    str2 = "recognizer insufficient permissions";
                    Log.w(str, str2);
                    break;
                default:
                    Log.d(SearchBar.f15499C, "recognizer other error");
                    break;
            }
            SearchBar.this.j();
            SearchBar.this.e();
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i9, Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList == null || stringArrayList.size() == 0) {
                return;
            }
            SearchBar.this.f15503c.g(stringArrayList.get(0), stringArrayList.size() > 1 ? stringArrayList.get(1) : null);
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) {
            SearchBar.this.f15504d.f();
            SearchBar.this.f();
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null) {
                SearchBar.this.f15506f = stringArrayList.get(0);
                SearchBar searchBar = SearchBar.this;
                searchBar.f15503c.setText(searchBar.f15506f);
                SearchBar.this.k();
            }
            SearchBar.this.j();
            SearchBar.this.g();
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f9) {
            SearchBar.this.f15504d.setSoundLevel(f9 < 0.0f ? 0 : (int) (f9 * 10.0f));
        }
    }

    public interface k {
        void a(String str);

        void b(String str);

        void c(String str);
    }

    public interface l {
        void a();
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15510j = new Handler();
        this.f15512l = false;
        this.f15524x = new SparseIntArray();
        this.f15525y = false;
        this.f15526z = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(g0.h.f41057j, (ViewGroup) this, true);
        this.f15520t = getResources().getDimensionPixelSize(AbstractC1798c.f40993u);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f15520t);
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f15506f = "";
        this.f15511k = (InputMethodManager) context.getSystemService("input_method");
        this.f15515o = resources.getColor(AbstractC1797b.f40967i);
        this.f15514n = resources.getColor(AbstractC1797b.f40966h);
        this.f15519s = resources.getInteger(g0.g.f41044b);
        this.f15518r = resources.getInteger(g0.g.f41045c);
        this.f15517q = resources.getColor(AbstractC1797b.f40965g);
        this.f15516p = resources.getColor(AbstractC1797b.f40964f);
        this.f15500A = (AudioManager) context.getSystemService("audio");
    }

    public void a() {
        this.f15511k.hideSoftInputFromWindow(this.f15503c.getWindowToken(), 0);
    }

    public final boolean b() {
        return this.f15504d.isFocused();
    }

    public final void c(Context context) {
        int[] iArr = {g0.i.f41062a, g0.i.f41064c, g0.i.f41063b, g0.i.f41065d};
        for (int i9 = 0; i9 < 4; i9++) {
            int i10 = iArr[i9];
            this.f15524x.put(i10, this.f15523w.load(context, i10, 1));
        }
    }

    public final void d(int i9) {
        this.f15510j.post(new a(i9));
    }

    public void e() {
        d(g0.i.f41062a);
    }

    public void f() {
        d(g0.i.f41064c);
    }

    public void g() {
        d(g0.i.f41065d);
    }

    public Drawable getBadgeDrawable() {
        return this.f15509i;
    }

    public CharSequence getHint() {
        return this.f15507g;
    }

    public String getTitle() {
        return this.f15508h;
    }

    public void h() {
        this.f15510j.post(new i());
    }

    public void i() {
        l lVar;
        if (this.f15525y) {
            return;
        }
        if (!hasFocus()) {
            requestFocus();
        }
        if (this.f15521u == null) {
            return;
        }
        if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            if (Build.VERSION.SDK_INT < 23 || (lVar = this.f15501B) == null) {
                throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
            }
            lVar.a();
            return;
        }
        this.f15525y = true;
        this.f15503c.setText("");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        this.f15521u.setRecognitionListener(new j());
        this.f15522v = true;
        this.f15521u.startListening(intent);
    }

    public void j() {
        if (this.f15525y) {
            this.f15503c.setText(this.f15506f);
            this.f15503c.setHint(this.f15507g);
            this.f15525y = false;
            if (this.f15521u == null) {
                return;
            }
            this.f15504d.g();
            if (this.f15522v) {
                this.f15521u.cancel();
                this.f15522v = false;
            }
            this.f15521u.setRecognitionListener(null);
        }
    }

    public void k() {
        k kVar;
        if (TextUtils.isEmpty(this.f15506f) || (kVar = this.f15502a) == null) {
            return;
        }
        kVar.c(this.f15506f);
    }

    public void l() {
        if (this.f15525y) {
            j();
        } else {
            i();
        }
    }

    public final void m() {
        String string = getResources().getString(g0.j.f41066a);
        if (!TextUtils.isEmpty(this.f15508h)) {
            string = b() ? getResources().getString(g0.j.f41069d, this.f15508h) : getResources().getString(g0.j.f41068c, this.f15508h);
        } else if (b()) {
            string = getResources().getString(g0.j.f41067b);
        }
        this.f15507g = string;
        SearchEditText searchEditText = this.f15503c;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    public void n(boolean z9) {
        SearchEditText searchEditText;
        int i9;
        SearchEditText searchEditText2;
        int i10;
        if (z9) {
            this.f15513m.setAlpha(this.f15519s);
            if (b()) {
                searchEditText2 = this.f15503c;
                i10 = this.f15517q;
            } else {
                searchEditText2 = this.f15503c;
                i10 = this.f15515o;
            }
            searchEditText2.setTextColor(i10);
            searchEditText = this.f15503c;
            i9 = this.f15517q;
        } else {
            this.f15513m.setAlpha(this.f15518r);
            this.f15503c.setTextColor(this.f15514n);
            searchEditText = this.f15503c;
            i9 = this.f15516p;
        }
        searchEditText.setHintTextColor(i9);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15523w = new SoundPool(2, 1, 0);
        c(this.f15526z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        j();
        this.f15523w.release();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f15513m = ((RelativeLayout) findViewById(AbstractC1801f.f41031o)).getBackground();
        this.f15503c = (SearchEditText) findViewById(AbstractC1801f.f41033q);
        ImageView imageView = (ImageView) findViewById(AbstractC1801f.f41030n);
        this.f15505e = imageView;
        Drawable drawable = this.f15509i;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f15503c.setOnFocusChangeListener(new b());
        this.f15503c.addTextChangedListener(new d(new c()));
        this.f15503c.setOnKeyboardDismissListener(new e());
        this.f15503c.setOnEditorActionListener(new f());
        this.f15503c.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(AbstractC1801f.f41032p);
        this.f15504d = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new g());
        this.f15504d.setOnFocusChangeListener(new h());
        n(hasFocus());
        m();
    }

    public void setBadgeDrawable(Drawable drawable) {
        ImageView imageView;
        int i9;
        this.f15509i = drawable;
        ImageView imageView2 = this.f15505e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
            if (drawable != null) {
                imageView = this.f15505e;
                i9 = 0;
            } else {
                imageView = this.f15505e;
                i9 = 8;
            }
            imageView.setVisibility(i9);
        }
    }

    @Override // android.view.View
    public void setNextFocusDownId(int i9) {
        this.f15504d.setNextFocusDownId(i9);
        this.f15503c.setNextFocusDownId(i9);
    }

    public void setPermissionListener(l lVar) {
        this.f15501B = lVar;
    }

    public void setSearchAffordanceColors(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.f15504d;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(cVar);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.c cVar) {
        SpeechOrbView speechOrbView = this.f15504d;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(cVar);
        }
    }

    public void setSearchBarListener(k kVar) {
        this.f15502a = kVar;
    }

    public void setSearchQuery(String str) {
        j();
        this.f15503c.setText(str);
        setSearchQueryInternal(str);
    }

    public void setSearchQueryInternal(String str) {
        if (TextUtils.equals(this.f15506f, str)) {
            return;
        }
        this.f15506f = str;
        k kVar = this.f15502a;
        if (kVar != null) {
            kVar.a(str);
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(U u9) {
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        j();
        SpeechRecognizer speechRecognizer2 = this.f15521u;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f15522v) {
                this.f15521u.cancel();
                this.f15522v = false;
            }
        }
        this.f15521u = speechRecognizer;
    }

    public void setTitle(String str) {
        this.f15508h = str;
        m();
    }
}
