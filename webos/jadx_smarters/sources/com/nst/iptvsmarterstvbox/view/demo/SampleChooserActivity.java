package com.nst.iptvsmarterstvbox.view.demo;

import O2.H0;
import O2.R0;
import a7.g;
import a7.h;
import android.R;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import b4.C1226q;
import b4.C1227s;
import b4.InterfaceC1224o;
import b4.r;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.nst.iptvsmarterstvbox.view.demo.a;
import d4.AbstractC1681B;
import d4.k0;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import org.apache.http.HttpHost;
import r5.j;
import r5.m;
import r7.AbstractC2683b;
import r7.AbstractC2688g;
import r7.AbstractServiceC2682a;
import s5.AbstractC2717A;
import s5.AbstractC2743y;
import z3.AbstractServiceC3053x;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class SampleChooserActivity extends androidx.appcompat.app.b implements a.c, ExpandableListView.OnChildClickListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String[] f34786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.nst.iptvsmarterstvbox.view.demo.a f34788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f34789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MenuItem f34790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExpandableListView f34791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public H0 f34792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f34793k;

    public static class b {
        public static String a() {
            return "android.permission.POST_NOTIFICATIONS";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f34795b = new ArrayList();

        public c(String str) {
            this.f34794a = str;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f34796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f34797b;

        public d(String str, List list) {
            m.d(!list.isEmpty());
            this.f34796a = str;
            this.f34797b = Collections.unmodifiableList(new ArrayList(list));
        }
    }

    public final class e extends BaseExpandableListAdapter implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f34798a = Collections.emptyList();

        public e() {
        }

        @Override // android.widget.ExpandableListAdapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d getChild(int i9, int i10) {
            return (d) getGroup(i9).f34795b.get(i10);
        }

        @Override // android.widget.ExpandableListAdapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c getGroup(int i9) {
            return (c) this.f34798a.get(i9);
        }

        public final void c(View view, d dVar) {
            view.setTag(dVar);
            ((TextView) view.findViewById(a7.f.If)).setText(dVar.f34796a);
            boolean z9 = SampleChooserActivity.this.y1(dVar) == 0;
            boolean z10 = z9 && SampleChooserActivity.this.f34788f.g((H0) dVar.f34797b.get(0));
            ImageButton imageButton = (ImageButton) view.findViewById(a7.f.f12209M2);
            imageButton.setTag(dVar);
            imageButton.setColorFilter(z9 ? z10 ? -12409355 : -4342339 : -10066330);
            imageButton.setImageResource(z10 ? a7.e.f12043p0 : a7.e.f11906E0);
        }

        public void d(List list) {
            this.f34798a = list;
            notifyDataSetChanged();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getChildId(int i9, int i10) {
            return i10;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getChildView(int i9, int i10, boolean z9, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = SampleChooserActivity.this.getLayoutInflater().inflate(g.f12851o4, viewGroup, false);
                View viewFindViewById = view.findViewById(a7.f.f12209M2);
                viewFindViewById.setOnClickListener(this);
                viewFindViewById.setFocusable(false);
            }
            c(view, getChild(i9, i10));
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public int getChildrenCount(int i9) {
            return getGroup(i9).f34795b.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public int getGroupCount() {
            return this.f34798a.size();
        }

        @Override // android.widget.ExpandableListAdapter
        public long getGroupId(int i9) {
            return i9;
        }

        @Override // android.widget.ExpandableListAdapter
        public View getGroupView(int i9, boolean z9, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = SampleChooserActivity.this.getLayoutInflater().inflate(R.layout.simple_expandable_list_item_1, viewGroup, false);
            }
            ((TextView) view).setText(getGroup(i9).f34794a);
            return view;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean hasStableIds() {
            return false;
        }

        @Override // android.widget.ExpandableListAdapter
        public boolean isChildSelectable(int i9, int i10) {
            return true;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SampleChooserActivity.this.E1((d) view.getTag());
        }
    }

    public final class f extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34800a;

        public f() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List doInBackground(String... strArr) {
            ArrayList arrayList = new ArrayList();
            InterfaceC1224o interfaceC1224oA = AbstractC2683b.d(SampleChooserActivity.this.getApplicationContext()).a();
            for (String str : strArr) {
                try {
                    try {
                        f(new JsonReader(new InputStreamReader(new C1226q(interfaceC1224oA, new C1227s(Uri.parse(str))), "UTF-8")), arrayList);
                    } catch (Exception e9) {
                        AbstractC1681B.e("SampleChooserActivity", "Error loading sample list: " + str, e9);
                        this.f34800a = true;
                    }
                } finally {
                    r.a(interfaceC1224oA);
                }
            }
            return arrayList;
        }

        public final c b(String str, List list) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                if (j.a(str, ((c) list.get(i9)).f34794a)) {
                    return (c) list.get(i9);
                }
            }
            c cVar = new c(str);
            list.add(cVar);
            return cVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(List list) {
            SampleChooserActivity.this.D1(list, this.f34800a);
        }

        public final d d(JsonReader jsonReader, boolean z9) throws IOException {
            String strNextName;
            String str;
            Uri uri;
            String str2;
            AbstractC2717A abstractC2717AK = AbstractC2717A.k();
            H0.d.a aVar = new H0.d.a();
            H0.c cVar = new H0.c();
            jsonReader.beginObject();
            String strNextString = null;
            ArrayList arrayList = null;
            String strNextString2 = null;
            Uri uri2 = null;
            String strNextString3 = null;
            UUID uuidY = null;
            String strNextString4 = null;
            boolean zNextBoolean = false;
            boolean zNextBoolean2 = false;
            boolean zNextBoolean3 = false;
            Uri uri3 = null;
            String strNextString5 = null;
            while (jsonReader.hasNext()) {
                strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "subtitle_uri":
                        uri3 = Uri.parse(jsonReader.nextString());
                        break;
                    case "subtitle_mime_type":
                        strNextString = jsonReader.nextString();
                        break;
                    case "ad_tag_uri":
                        str = strNextString;
                        uri = uri3;
                        cVar.b(new H0.b.a(Uri.parse(jsonReader.nextString())).c());
                        strNextString = str;
                        uri3 = uri;
                        break;
                    case "extension":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "drm_license_uri":
                    case "drm_license_url":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "uri":
                        uri2 = Uri.parse(jsonReader.nextString());
                        break;
                    case "name":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "drm_force_default_license_uri":
                        zNextBoolean3 = jsonReader.nextBoolean();
                        break;
                    case "drm_scheme":
                        uuidY = k0.Y(jsonReader.nextString());
                        break;
                    case "drm_key_request_properties":
                        str = strNextString;
                        uri = uri3;
                        HashMap map = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            map.put(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        abstractC2717AK = AbstractC2717A.d(map);
                        strNextString = str;
                        uri3 = uri;
                        break;
                    case "subtitle_language":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "clip_start_position_ms":
                        str = strNextString;
                        uri = uri3;
                        aVar.k(jsonReader.nextLong());
                        strNextString = str;
                        uri3 = uri;
                        break;
                    case "drm_session_for_clear_content":
                        str2 = strNextString;
                        zNextBoolean = jsonReader.nextBoolean();
                        strNextString = str2;
                        break;
                    case "drm_multi_session":
                        str2 = strNextString;
                        zNextBoolean2 = jsonReader.nextBoolean();
                        strNextString = str2;
                        break;
                    case "playlist":
                        String str3 = strNextString;
                        boolean z10 = true;
                        m.q(!z9, "Invalid nesting of playlists");
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(d(jsonReader, z10));
                            str3 = str3;
                            uri3 = uri3;
                            z10 = true;
                        }
                        str2 = str3;
                        jsonReader.endArray();
                        strNextString = str2;
                        break;
                    case "clip_end_position_ms":
                        aVar.h(jsonReader.nextLong());
                        str = strNextString;
                        uri = uri3;
                        strNextString = str;
                        uri3 = uri;
                        break;
                    default:
                        throw new IOException("Unsupported attribute name: " + strNextName, null);
                }
            }
            String str4 = strNextString;
            Uri uri4 = uri3;
            jsonReader.endObject();
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    arrayList2.addAll(((d) arrayList.get(i9)).f34797b);
                }
                return new d(strNextString3, arrayList2);
            }
            cVar.m(uri2).h(new R0.b().m0(strNextString3).H()).i(k0.H(TextUtils.isEmpty(strNextString2) ? k0.w0(uri2) : k0.x0(strNextString2))).c(aVar.f());
            if (uuidY != null) {
                cVar.e(new H0.f.a(uuidY).p(strNextString4).n(abstractC2717AK).k(zNextBoolean).q(zNextBoolean2).j(zNextBoolean3).i());
            } else {
                m.q(strNextString4 == null, "drm_uuid is required if drm_license_uri is set.");
                m.q(abstractC2717AK.isEmpty(), "drm_uuid is required if drm_key_request_properties is set.");
                m.q(!zNextBoolean, "drm_uuid is required if drm_session_for_clear_content is set.");
                m.q(!zNextBoolean2, "drm_uuid is required if drm_multi_session is set.");
                m.q(true ^ zNextBoolean3, "drm_uuid is required if drm_force_default_license_uri is set.");
            }
            if (uri4 != null) {
                cVar.k(AbstractC2743y.A(new H0.k.a(uri4).n((String) m.l(str4, "subtitle_mime_type is required if subtitle_uri is set.")).m(strNextString5).i()));
            }
            return new d(strNextString3, Collections.singletonList(cVar.a()));
        }

        public final void e(JsonReader jsonReader, List list) throws IOException {
            String strNextName;
            ArrayList arrayList = new ArrayList();
            jsonReader.beginObject();
            String strNextString = "";
            while (jsonReader.hasNext()) {
                strNextName = jsonReader.nextName();
                strNextName.hashCode();
                switch (strNextName) {
                    case "_comment":
                        jsonReader.nextString();
                        break;
                    case "name":
                        strNextString = jsonReader.nextString();
                        break;
                    case "samples":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(d(jsonReader, false));
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        throw new IOException("Unsupported name: " + strNextName, null);
                }
            }
            jsonReader.endObject();
            b(strNextString, list).f34795b.addAll(arrayList);
        }

        public final void f(JsonReader jsonReader, List list) throws IOException {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                e(jsonReader, list);
            }
            jsonReader.endArray();
        }
    }

    public static boolean B1(MenuItem menuItem) {
        return menuItem != null && menuItem.isChecked();
    }

    public final void A1(int[] iArr) {
        if (!this.f34793k && (iArr.length == 0 || iArr[0] != 0)) {
            this.f34793k = true;
        }
        H0 h02 = this.f34792j;
        if (h02 != null) {
            G1(h02);
            this.f34792j = null;
        }
    }

    public final void C1() {
        m.k(this.f34786d);
        int i9 = 0;
        while (true) {
            String[] strArr = this.f34786d;
            if (i9 >= strArr.length) {
                new f().execute(this.f34786d);
                return;
            } else if (k0.O0(this, Uri.parse(strArr[i9]))) {
                return;
            } else {
                i9++;
            }
        }
    }

    public final void D1(List list, boolean z9) {
        if (z9) {
            Toast.makeText(getApplicationContext(), a7.j.f13413v6, 1).show();
        }
        this.f34789g.d(list);
        SharedPreferences preferences = getPreferences(0);
        int i9 = preferences.getInt("sample_chooser_group_position", -1);
        int i10 = preferences.getInt("sample_chooser_child_position", -1);
        if (i9 == -1 || i10 == -1 || i9 >= list.size() || i10 >= ((c) list.get(i9)).f34795b.size()) {
            return;
        }
        this.f34791i.expandGroup(i9);
        this.f34791i.setSelectedChild(i9, i10, true);
    }

    public final void E1(d dVar) {
        int iY1 = y1(dVar);
        if (iY1 != 0) {
            Toast.makeText(getApplicationContext(), iY1, 1).show();
            return;
        }
        if (this.f34793k || Build.VERSION.SDK_INT < 33 || checkSelfPermission(b.a()) == 0) {
            G1((H0) dVar.f34797b.get(0));
        } else {
            this.f34792j = (H0) dVar.f34797b.get(0);
            requestPermissions(new String[]{b.a()}, 100);
        }
    }

    public final void F1() {
        try {
            AbstractServiceC3053x.A(this, AbstractServiceC2682a.class);
        } catch (IllegalStateException unused) {
            AbstractServiceC3053x.B(this, AbstractServiceC2682a.class);
        }
    }

    public final void G1(H0 h02) {
        this.f34788f.j(getSupportFragmentManager(), h02, AbstractC2683b.b(this, B1(this.f34790h)));
    }

    @Override // com.nst.iptvsmarterstvbox.view.demo.a.c
    public void Y0() {
        this.f34789g.notifyDataSetChanged();
    }

    @Override // android.widget.ExpandableListView.OnChildClickListener
    public boolean onChildClick(ExpandableListView expandableListView, View view, int i9, int i10, long j9) {
        SharedPreferences.Editor editorEdit = getPreferences(0).edit();
        editorEdit.putInt("sample_chooser_group_position", i9);
        editorEdit.putInt("sample_chooser_child_position", i10);
        editorEdit.apply();
        d dVar = (d) view.getTag();
        Intent intent = new Intent(this, (Class<?>) PlayerActivity.class);
        intent.putExtra("prefer_extension_decoders", B1(this.f34790h));
        AbstractC2688g.d(dVar.f34797b, intent);
        startActivity(intent);
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12845n4);
        this.f34789g = new e();
        ExpandableListView expandableListView = (ExpandableListView) findViewById(a7.f.Hf);
        this.f34791i = expandableListView;
        expandableListView.setAdapter(this.f34789g);
        this.f34791i.setOnChildClickListener(this);
        String dataString = getIntent().getDataString();
        if (dataString != null) {
            this.f34786d = new String[]{dataString};
        } else {
            ArrayList arrayList = new ArrayList();
            try {
                for (String str : getAssets().list("")) {
                    if (str.endsWith(".exolist.json")) {
                        arrayList.add("asset:///" + str);
                    }
                }
            } catch (IOException unused) {
                Toast.makeText(getApplicationContext(), a7.j.f13413v6, 1).show();
            }
            String[] strArr = new String[arrayList.size()];
            this.f34786d = strArr;
            arrayList.toArray(strArr);
            Arrays.sort(this.f34786d);
        }
        this.f34787e = AbstractC2683b.h();
        this.f34788f = AbstractC2683b.f(this);
        C1();
        F1();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(h.f12941x, menu);
        MenuItem menuItemFindItem = menu.findItem(a7.f.Jc);
        this.f34790h = menuItemFindItem;
        menuItemFindItem.setVisible(this.f34787e);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.setChecked(!menuItem.isChecked());
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i9, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i9, strArr, iArr);
        if (i9 == 100) {
            A1(iArr);
        } else {
            z1(iArr);
        }
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f34788f.e(this);
        this.f34789g.notifyDataSetChanged();
    }

    @Override // androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        this.f34788f.i(this);
        super.onStop();
    }

    public final int y1(d dVar) {
        if (dVar.f34797b.size() > 1) {
            return a7.j.f13198a1;
        }
        H0.h hVar = (H0.h) m.k(((H0) dVar.f34797b.get(0)).f5528c);
        if (hVar.f5628e != null) {
            return a7.j.f13152V0;
        }
        String scheme = hVar.f5625a.getScheme();
        if (HttpHost.DEFAULT_SCHEME_NAME.equals(scheme) || ClientConstants.DOMAIN_SCHEME.equals(scheme)) {
            return 0;
        }
        return a7.j.f13208b1;
    }

    public final void z1(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            C1();
        } else {
            Toast.makeText(getApplicationContext(), a7.j.f13413v6, 1).show();
            finish();
        }
    }
}
