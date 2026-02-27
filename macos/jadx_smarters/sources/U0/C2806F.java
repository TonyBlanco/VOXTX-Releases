package u0;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: u0.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2806F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f50879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f50880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f50881c;

    /* JADX INFO: renamed from: u0.F$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f50882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f50883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList f50884c;

        public a(String str, String str2) {
            this.f50882a = new Bundle();
            m(str);
            n(str2);
        }

        public a(C2806F c2806f) {
            if (c2806f == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            this.f50882a = new Bundle(c2806f.f50879a);
            if (!c2806f.j().isEmpty()) {
                this.f50883b = new ArrayList(c2806f.j());
            }
            if (c2806f.f().isEmpty()) {
                return;
            }
            this.f50884c = new ArrayList(c2806f.f50881c);
        }

        public a a(IntentFilter intentFilter) {
            if (intentFilter == null) {
                throw new IllegalArgumentException("filter must not be null");
            }
            if (this.f50884c == null) {
                this.f50884c = new ArrayList();
            }
            if (!this.f50884c.contains(intentFilter)) {
                this.f50884c.add(intentFilter);
            }
            return this;
        }

        public a b(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("filters must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    IntentFilter intentFilter = (IntentFilter) it.next();
                    if (intentFilter != null) {
                        a(intentFilter);
                    }
                }
            }
            return this;
        }

        public a c(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (this.f50883b == null) {
                this.f50883b = new ArrayList();
            }
            if (!this.f50883b.contains(str)) {
                this.f50883b.add(str);
            }
            return this;
        }

        public a d(Collection collection) {
            if (collection == null) {
                throw new IllegalArgumentException("groupMemberIds must not be null");
            }
            if (!collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c((String) it.next());
                }
            }
            return this;
        }

        public C2806F e() {
            ArrayList<? extends Parcelable> arrayList = this.f50884c;
            if (arrayList != null) {
                this.f50882a.putParcelableArrayList("controlFilters", arrayList);
            }
            ArrayList<String> arrayList2 = this.f50883b;
            if (arrayList2 != null) {
                this.f50882a.putStringArrayList("groupMemberIds", arrayList2);
            }
            return new C2806F(this.f50882a);
        }

        public a f(boolean z9) {
            this.f50882a.putBoolean("canDisconnect", z9);
            return this;
        }

        public a g(int i9) {
            this.f50882a.putInt("connectionState", i9);
            return this;
        }

        public a h(String str) {
            this.f50882a.putString("status", str);
            return this;
        }

        public a i(int i9) {
            this.f50882a.putInt("deviceType", i9);
            return this;
        }

        public a j(boolean z9) {
            this.f50882a.putBoolean("enabled", z9);
            return this;
        }

        public a k(Bundle bundle) {
            if (bundle == null) {
                this.f50882a.putBundle("extras", null);
            } else {
                this.f50882a.putBundle("extras", new Bundle(bundle));
            }
            return this;
        }

        public a l(Uri uri) {
            if (uri == null) {
                throw new IllegalArgumentException("iconUri must not be null");
            }
            this.f50882a.putString("iconUri", uri.toString());
            return this;
        }

        public a m(String str) {
            if (str == null) {
                throw new NullPointerException("id must not be null");
            }
            this.f50882a.putString(Name.MARK, str);
            return this;
        }

        public a n(String str) {
            if (str == null) {
                throw new NullPointerException("name must not be null");
            }
            this.f50882a.putString("name", str);
            return this;
        }

        public a o(int i9) {
            this.f50882a.putInt("playbackStream", i9);
            return this;
        }

        public a p(int i9) {
            this.f50882a.putInt("playbackType", i9);
            return this;
        }

        public a q(int i9) {
            this.f50882a.putInt("presentationDisplayId", i9);
            return this;
        }

        public a r(int i9) {
            this.f50882a.putInt("volume", i9);
            return this;
        }

        public a s(int i9) {
            this.f50882a.putInt("volumeHandling", i9);
            return this;
        }

        public a t(int i9) {
            this.f50882a.putInt("volumeMax", i9);
            return this;
        }
    }

    public C2806F(Bundle bundle) {
        this.f50879a = bundle;
    }

    public static C2806F d(Bundle bundle) {
        if (bundle != null) {
            return new C2806F(bundle);
        }
        return null;
    }

    public boolean a() {
        return this.f50879a.getBoolean("canDisconnect", false);
    }

    public void b() {
        if (this.f50881c == null) {
            ArrayList parcelableArrayList = this.f50879a.getParcelableArrayList("controlFilters");
            this.f50881c = parcelableArrayList;
            if (parcelableArrayList == null) {
                this.f50881c = Collections.emptyList();
            }
        }
    }

    public void c() {
        if (this.f50880b == null) {
            ArrayList<String> stringArrayList = this.f50879a.getStringArrayList("groupMemberIds");
            this.f50880b = stringArrayList;
            if (stringArrayList == null) {
                this.f50880b = Collections.emptyList();
            }
        }
    }

    public int e() {
        return this.f50879a.getInt("connectionState", 0);
    }

    public List f() {
        b();
        return this.f50881c;
    }

    public String g() {
        return this.f50879a.getString("status");
    }

    public int h() {
        return this.f50879a.getInt("deviceType");
    }

    public Bundle i() {
        return this.f50879a.getBundle("extras");
    }

    public List j() {
        c();
        return this.f50880b;
    }

    public Uri k() {
        String string = this.f50879a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse(string);
    }

    public String l() {
        return this.f50879a.getString(Name.MARK);
    }

    public int m() {
        return this.f50879a.getInt("maxClientVersion", a.e.API_PRIORITY_OTHER);
    }

    public int n() {
        return this.f50879a.getInt("minClientVersion", 1);
    }

    public String o() {
        return this.f50879a.getString("name");
    }

    public int p() {
        return this.f50879a.getInt("playbackStream", -1);
    }

    public int q() {
        return this.f50879a.getInt("playbackType", 1);
    }

    public int r() {
        return this.f50879a.getInt("presentationDisplayId", -1);
    }

    public IntentSender s() {
        return (IntentSender) this.f50879a.getParcelable("settingsIntent");
    }

    public int t() {
        return this.f50879a.getInt("volume");
    }

    public String toString() {
        return "MediaRouteDescriptor{ id=" + l() + ", groupMemberIds=" + j() + ", name=" + o() + ", description=" + g() + ", iconUri=" + k() + ", isEnabled=" + w() + ", connectionState=" + e() + ", controlFilters=" + Arrays.toString(f().toArray()) + ", playbackType=" + q() + ", playbackStream=" + p() + ", deviceType=" + h() + ", volume=" + t() + ", volumeMax=" + v() + ", volumeHandling=" + u() + ", presentationDisplayId=" + r() + ", extras=" + i() + ", isValid=" + x() + ", minClientVersion=" + n() + ", maxClientVersion=" + m() + " }";
    }

    public int u() {
        return this.f50879a.getInt("volumeHandling", 0);
    }

    public int v() {
        return this.f50879a.getInt("volumeMax");
    }

    public boolean w() {
        return this.f50879a.getBoolean("enabled", true);
    }

    public boolean x() {
        b();
        return (TextUtils.isEmpty(l()) || TextUtils.isEmpty(o()) || this.f50881c.contains(null)) ? false : true;
    }
}
