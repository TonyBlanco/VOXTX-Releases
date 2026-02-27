package k;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import c.AbstractC1238a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class Y extends U.c implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final SearchView f43253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SearchableInfo f43254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f43255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final WeakHashMap f43256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f43257q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f43258r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f43259s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f43260t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f43261u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f43262v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f43263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f43264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f43265y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f43266z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f43267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f43268b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f43269c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f43270d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f43271e;

        public a(View view) {
            this.f43267a = (TextView) view.findViewById(R.id.text1);
            this.f43268b = (TextView) view.findViewById(R.id.text2);
            this.f43269c = (ImageView) view.findViewById(R.id.icon1);
            this.f43270d = (ImageView) view.findViewById(R.id.icon2);
            this.f43271e = (ImageView) view.findViewById(c.f.f17867q);
        }
    }

    public Y(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f43258r = false;
        this.f43259s = 1;
        this.f43261u = -1;
        this.f43262v = -1;
        this.f43263w = -1;
        this.f43264x = -1;
        this.f43265y = -1;
        this.f43266z = -1;
        this.f43253m = searchView;
        this.f43254n = searchableInfo;
        this.f43257q = searchView.getSuggestionCommitIconResId();
        this.f43255o = context;
        this.f43256p = weakHashMap;
    }

    public static String o(Cursor cursor, String str) {
        return w(cursor, cursor.getColumnIndex(str));
    }

    public static String w(Cursor cursor, int i9) {
        if (i9 == -1) {
            return null;
        }
        try {
            return cursor.getString(i9);
        } catch (Exception e9) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e9);
            return null;
        }
    }

    public final void A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f43256p.put(str, drawable.getConstantState());
        }
    }

    public final void B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // U.a, U.b.a
    public void a(Cursor cursor) {
        if (this.f43258r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f43261u = cursor.getColumnIndex("suggest_text_1");
                this.f43262v = cursor.getColumnIndex("suggest_text_2");
                this.f43263w = cursor.getColumnIndex("suggest_text_2_url");
                this.f43264x = cursor.getColumnIndex("suggest_icon_1");
                this.f43265y = cursor.getColumnIndex("suggest_icon_2");
                this.f43266z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e9) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e9);
        }
    }

    @Override // U.a, U.b.a
    public CharSequence b(Cursor cursor) {
        String strO;
        String strO2;
        if (cursor == null) {
            return null;
        }
        String strO3 = o(cursor, "suggest_intent_query");
        if (strO3 != null) {
            return strO3;
        }
        if (this.f43254n.shouldRewriteQueryFromData() && (strO2 = o(cursor, "suggest_intent_data")) != null) {
            return strO2;
        }
        if (!this.f43254n.shouldRewriteQueryFromText() || (strO = o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strO;
    }

    @Override // U.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f43253m.getVisibility() == 0 && this.f43253m.getWindowVisibility() == 0) {
            try {
                Cursor cursorV = v(this.f43254n, string, 50);
                if (cursorV != null) {
                    cursorV.getCount();
                    return cursorV;
                }
            } catch (RuntimeException e9) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e9);
            }
        }
        return null;
    }

    @Override // U.a
    public void e(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i9 = this.f43266z;
        int i10 = i9 != -1 ? cursor.getInt(i9) : 0;
        if (aVar.f43267a != null) {
            z(aVar.f43267a, w(cursor, this.f43261u));
        }
        if (aVar.f43268b != null) {
            String strW = w(cursor, this.f43263w);
            CharSequence charSequenceL = strW != null ? l(strW) : w(cursor, this.f43262v);
            if (TextUtils.isEmpty(charSequenceL)) {
                TextView textView = aVar.f43267a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f43267a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f43267a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f43267a.setMaxLines(1);
                }
            }
            z(aVar.f43268b, charSequenceL);
        }
        ImageView imageView = aVar.f43269c;
        if (imageView != null) {
            y(imageView, t(cursor), 4);
        }
        ImageView imageView2 = aVar.f43270d;
        if (imageView2 != null) {
            y(imageView2, u(cursor), 8);
        }
        int i11 = this.f43259s;
        if (i11 != 2 && (i11 != 1 || (i10 & 1) == 0)) {
            aVar.f43271e.setVisibility(8);
            return;
        }
        aVar.f43271e.setVisibility(0);
        aVar.f43271e.setTag(aVar.f43267a.getText());
        aVar.f43271e.setOnClickListener(this);
    }

    @Override // U.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i9, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i9, view, viewGroup);
        } catch (RuntimeException e9) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e9);
            View viewG = g(this.f43255o, d(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f43267a.setText(e9.toString());
            }
            return viewG;
        }
    }

    @Override // U.a, android.widget.Adapter
    public View getView(int i9, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i9, view, viewGroup);
        } catch (RuntimeException e9) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e9);
            View viewH = h(this.f43255o, d(), viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).f43267a.setText(e9.toString());
            }
            return viewH;
        }
    }

    @Override // U.c, U.a
    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewH = super.h(context, cursor, viewGroup);
        viewH.setTag(new a(viewH));
        ((ImageView) viewH.findViewById(c.f.f17867q)).setImageResource(this.f43257q);
        return viewH;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public final Drawable k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f43256p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public final CharSequence l(CharSequence charSequence) {
        if (this.f43260t == null) {
            TypedValue typedValue = new TypedValue();
            this.f43255o.getTheme().resolveAttribute(AbstractC1238a.f17739P, typedValue, true);
            this.f43260t = this.f43255o.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f43260t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable m(ComponentName componentName) {
        String string;
        ActivityInfo activityInfo;
        int iconResource;
        PackageManager packageManager = this.f43255o.getPackageManager();
        try {
            activityInfo = packageManager.getActivityInfo(componentName, 128);
            iconResource = activityInfo.getIconResource();
        } catch (PackageManager.NameNotFoundException e9) {
            string = e9.toString();
        }
        if (iconResource == 0) {
            return null;
        }
        Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
        if (drawable != null) {
            return drawable;
        }
        string = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
        Log.w("SuggestionsAdapter", string);
        return null;
    }

    public final Drawable n(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f43256p.containsKey(strFlattenToShortString)) {
            Drawable drawableM = m(componentName);
            this.f43256p.put(strFlattenToShortString, drawableM != null ? drawableM.getConstantState() : null);
            return drawableM;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f43256p.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f43255o.getResources());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        B(d());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        B(d());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f43253m.U((CharSequence) tag);
        }
    }

    public final Drawable p() {
        Drawable drawableN = n(this.f43254n.getSearchActivity());
        return drawableN != null ? drawableN : this.f43255o.getPackageManager().getDefaultActivityIcon();
    }

    public final Drawable q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f43255o.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                return Drawable.createFromStream(inputStreamOpenInputStream, null);
            } finally {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e9) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e9);
                }
            }
        } catch (FileNotFoundException e10) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e10.getMessage());
        return null;
    }

    public Drawable r(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f43255o.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    public final Drawable s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i9 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f43255o.getPackageName() + "/" + i9;
            Drawable drawableK = k(str2);
            if (drawableK != null) {
                return drawableK;
            }
            Drawable drawable = E.b.getDrawable(this.f43255o, i9);
            A(str2, drawable);
            return drawable;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableK2 = k(str);
            if (drawableK2 != null) {
                return drawableK2;
            }
            Drawable drawableQ = q(Uri.parse(str));
            A(str, drawableQ);
            return drawableQ;
        }
    }

    public final Drawable t(Cursor cursor) {
        int i9 = this.f43264x;
        if (i9 == -1) {
            return null;
        }
        Drawable drawableS = s(cursor.getString(i9));
        return drawableS != null ? drawableS : p();
    }

    public final Drawable u(Cursor cursor) {
        int i9 = this.f43265y;
        if (i9 == -1) {
            return null;
        }
        return s(cursor.getString(i9));
    }

    public Cursor v(SearchableInfo searchableInfo, String str, int i9) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i9 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i9));
        }
        return this.f43255o.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void x(int i9) {
        this.f43259s = i9;
    }

    public final void y(ImageView imageView, Drawable drawable, int i9) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i9);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
