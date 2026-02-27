package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import d.DialogC1642u;
import e.AbstractC1726a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import t0.AbstractC2758a;
import u0.C2811K;
import u0.C2812L;

/* JADX INFO: loaded from: classes.dex */
public class a extends DialogC1642u {
    static final int MSG_UPDATE_ROUTES = 1;
    static final String TAG = "MediaRouteChooserDialog";
    private static final long UPDATE_ROUTES_DELAY_MS = 300;
    private c mAdapter;
    private boolean mAttachedToWindow;
    private final b mCallback;
    private final Handler mHandler;
    private long mLastUpdateTime;
    private ListView mListView;
    private final C2812L mRouter;
    private ArrayList<C2812L.h> mRoutes;
    private C2811K mSelector;
    private TextView mTitleView;

    /* JADX INFO: renamed from: androidx.mediarouter.app.a$a, reason: collision with other inner class name */
    public class HandlerC0184a extends Handler {
        public HandlerC0184a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            a.this.updateRoutes((List) message.obj);
        }
    }

    public final class b extends C2812L.a {
        public b() {
        }

        @Override // u0.C2812L.a
        public void onRouteAdded(C2812L c2812l, C2812L.h hVar) {
            a.this.refreshRoutes();
        }

        @Override // u0.C2812L.a
        public void onRouteChanged(C2812L c2812l, C2812L.h hVar) {
            a.this.refreshRoutes();
        }

        @Override // u0.C2812L.a
        public void onRouteRemoved(C2812L c2812l, C2812L.h hVar) {
            a.this.refreshRoutes();
        }

        @Override // u0.C2812L.a
        public void onRouteSelected(C2812L c2812l, C2812L.h hVar) {
            a.this.dismiss();
        }
    }

    public static final class c extends ArrayAdapter implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LayoutInflater f16041a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Drawable f16042c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Drawable f16043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Drawable f16044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Drawable f16045f;

        public c(Context context, List list) {
            super(context, 0, list);
            this.f16041a = LayoutInflater.from(context);
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{AbstractC2758a.f50479b, AbstractC2758a.f50486i, AbstractC2758a.f50483f, AbstractC2758a.f50482e});
            this.f16042c = AbstractC1726a.b(context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
            this.f16043d = AbstractC1726a.b(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
            this.f16044e = AbstractC1726a.b(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
            this.f16045f = AbstractC1726a.b(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        public final Drawable a(C2812L.h hVar) {
            int iF = hVar.f();
            return iF != 1 ? iF != 2 ? hVar.y() ? this.f16045f : this.f16042c : this.f16044e : this.f16043d;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        public final Drawable b(C2812L.h hVar) {
            Uri uriJ = hVar.j();
            if (uriJ != null) {
                try {
                    Drawable drawableCreateFromStream = Drawable.createFromStream(getContext().getContentResolver().openInputStream(uriJ), null);
                    if (drawableCreateFromStream != null) {
                        return drawableCreateFromStream;
                    }
                } catch (IOException e9) {
                    Log.w(a.TAG, "Failed to load " + uriJ, e9);
                }
            }
            return a(hVar);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i9, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f16041a.inflate(t0.i.f50573g, viewGroup, false);
            }
            C2812L.h hVar = (C2812L.h) getItem(i9);
            TextView textView = (TextView) view.findViewById(t0.f.f50557x);
            TextView textView2 = (TextView) view.findViewById(t0.f.f50555v);
            textView.setText(hVar.m());
            String strD = hVar.d();
            if ((hVar.c() == 2 || hVar.c() == 1) && !TextUtils.isEmpty(strD)) {
                textView.setGravity(80);
                textView2.setVisibility(0);
                textView2.setText(strD);
            } else {
                textView.setGravity(16);
                textView2.setVisibility(8);
                textView2.setText("");
            }
            view.setEnabled(hVar.x());
            ImageView imageView = (ImageView) view.findViewById(t0.f.f50556w);
            if (imageView != null) {
                imageView.setImageDrawable(b(hVar));
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i9) {
            return ((C2812L.h) getItem(i9)).x();
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i9, long j9) {
            C2812L.h hVar = (C2812L.h) getItem(i9);
            if (hVar.x()) {
                ImageView imageView = (ImageView) view.findViewById(t0.f.f50556w);
                ProgressBar progressBar = (ProgressBar) view.findViewById(t0.f.f50558y);
                if (imageView != null && progressBar != null) {
                    imageView.setVisibility(8);
                    progressBar.setVisibility(0);
                }
                hVar.I();
            }
        }
    }

    public static final class d implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f16046a = new d();

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C2812L.h hVar, C2812L.h hVar2) {
            return hVar.m().compareToIgnoreCase(hVar2.m());
        }
    }

    public a(Context context) {
        this(context, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, int i9) {
        Context contextB = i.b(context, i9, false);
        super(contextB, i.c(contextB));
        this.mSelector = C2811K.f50924c;
        this.mHandler = new HandlerC0184a();
        this.mRouter = C2812L.j(getContext());
        this.mCallback = new b();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mAttachedToWindow = true;
        this.mRouter.b(this.mSelector, this.mCallback, 1);
        refreshRoutes();
    }

    @Override // d.DialogC1642u, androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t0.i.f50572f);
        this.mRoutes = new ArrayList<>();
        this.mAdapter = new c(getContext(), this.mRoutes);
        ListView listView = (ListView) findViewById(t0.f.f50554u);
        this.mListView = listView;
        listView.setAdapter((ListAdapter) this.mAdapter);
        this.mListView.setOnItemClickListener(this.mAdapter);
        this.mListView.setEmptyView(findViewById(R.id.empty));
        this.mTitleView = (TextView) findViewById(t0.f.f50559z);
        updateLayout();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.mAttachedToWindow = false;
        this.mRouter.s(this.mCallback);
        this.mHandler.removeMessages(1);
        super.onDetachedFromWindow();
    }

    public boolean onFilterRoute(C2812L.h hVar) {
        return !hVar.w() && hVar.x() && hVar.E(this.mSelector);
    }

    public void onFilterRoutes(List<C2812L.h> list) {
        int size = list.size();
        while (true) {
            int i9 = size - 1;
            if (size <= 0) {
                return;
            }
            if (!onFilterRoute(list.get(i9))) {
                list.remove(i9);
            }
            size = i9;
        }
    }

    public void refreshRoutes() {
        if (this.mAttachedToWindow) {
            ArrayList arrayList = new ArrayList(this.mRouter.m());
            onFilterRoutes(arrayList);
            Collections.sort(arrayList, d.f16046a);
            if (SystemClock.uptimeMillis() - this.mLastUpdateTime >= UPDATE_ROUTES_DELAY_MS) {
                updateRoutes(arrayList);
                return;
            }
            this.mHandler.removeMessages(1);
            Handler handler = this.mHandler;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.mLastUpdateTime + UPDATE_ROUTES_DELAY_MS);
        }
    }

    public void setRouteSelector(C2811K c2811k) {
        if (c2811k == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.mSelector.equals(c2811k)) {
            return;
        }
        this.mSelector = c2811k;
        if (this.mAttachedToWindow) {
            this.mRouter.s(this.mCallback);
            this.mRouter.b(c2811k, this.mCallback, 1);
        }
        refreshRoutes();
    }

    @Override // d.DialogC1642u, android.app.Dialog
    public void setTitle(int i9) {
        this.mTitleView.setText(i9);
    }

    @Override // d.DialogC1642u, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.mTitleView.setText(charSequence);
    }

    public void updateLayout() {
        getWindow().setLayout(f.b(getContext()), -2);
    }

    public void updateRoutes(List<C2812L.h> list) {
        this.mLastUpdateTime = SystemClock.uptimeMillis();
        this.mRoutes.clear();
        this.mRoutes.addAll(list);
        this.mAdapter.notifyDataSetChanged();
    }
}
