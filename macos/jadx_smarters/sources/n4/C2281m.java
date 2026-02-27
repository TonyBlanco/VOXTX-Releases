package n4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.achartengine.ChartFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.AbstractC2774a;
import u4.AbstractC2854b;
import x4.C2957a;
import y4.AbstractC2985a;

/* JADX INFO: renamed from: n4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2281m extends AbstractC2985a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final j0 f45447k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f45448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f45449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f45450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f45451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f45446j = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<C2281m> CREATOR = new k0();

    /* JADX INFO: renamed from: n4.m$a */
    public class a {
        public a() {
        }
    }

    static {
        j0 j0Var = new j0();
        j0Var.b("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        j0Var.b("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        j0Var.b("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        j0Var.b("com.google.android.gms.cast.metadata.TITLE", ChartFactory.TITLE, 1);
        j0Var.b("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        j0Var.b("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        j0Var.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        j0Var.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        j0Var.b("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        j0Var.b("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        j0Var.b("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        j0Var.b("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        j0Var.b("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        j0Var.b("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        j0Var.b("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        j0Var.b("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        j0Var.b("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        j0Var.b("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        j0Var.b("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        j0Var.b("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        j0Var.b("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        j0Var.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        j0Var.b("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        j0Var.b("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        j0Var.b("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        j0Var.b("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        j0Var.b("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        j0Var.b("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f45447k = j0Var;
    }

    public C2281m() {
        this(0);
    }

    public C2281m(int i9) {
        this(new ArrayList(), new Bundle(), i9);
    }

    public C2281m(List list, Bundle bundle, int i9) {
        this.f45451i = new a();
        this.f45448f = list;
        this.f45449g = bundle;
        this.f45450h = i9;
    }

    public static void N(String str, int i9) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        int iA = f45447k.a(str);
        if (iA == i9 || iA == 0) {
            return;
        }
        throw new IllegalArgumentException("Value for " + str + " must be a " + f45446j[i9]);
    }

    public List H() {
        return this.f45448f;
    }

    public int I() {
        return this.f45450h;
    }

    public String J(String str) {
        N(str, 1);
        return this.f45449g.getString(str);
    }

    public long K(String str) {
        N(str, 5);
        return this.f45449g.getLong(str);
    }

    public boolean L() {
        List list = this.f45448f;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void M(String str, String str2) {
        N(str, 1);
        this.f45449g.putString(str, str2);
    }

    public final JSONObject O() {
        j0 j0Var;
        String strC;
        double dB;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("metadataType", this.f45450h);
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayB = AbstractC2854b.b(this.f45448f);
        if (jSONArrayB.length() != 0) {
            try {
                jSONObject.put("images", jSONArrayB);
            } catch (JSONException unused2) {
            }
        }
        ArrayList<String> arrayList = new ArrayList();
        int i9 = this.f45450h;
        if (i9 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i9 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i9 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        try {
            for (String str : arrayList) {
                if (str != null && this.f45449g.containsKey(str) && (strC = (j0Var = f45447k).c(str)) != null) {
                    int iA = j0Var.a(str);
                    if (iA != 1) {
                        if (iA != 2) {
                            if (iA == 3) {
                                dB = this.f45449g.getDouble(str);
                            } else if (iA != 4) {
                                if (iA == 5) {
                                    dB = AbstractC2774a.b(this.f45449g.getLong(str));
                                }
                            }
                            jSONObject.put(strC, dB);
                        } else {
                            jSONObject.put(strC, this.f45449g.getInt(str));
                        }
                    }
                    jSONObject.put(strC, this.f45449g.getString(str));
                }
            }
            for (String str2 : this.f45449g.keySet()) {
                if (!str2.startsWith("com.google.")) {
                    Object obj = this.f45449g.get(str2);
                    if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double)) {
                        jSONObject.put(str2, obj);
                    }
                }
            }
        } catch (JSONException unused3) {
        }
        return jSONObject;
    }

    public final void P(JSONObject jSONObject) {
        String str;
        Bundle bundle;
        clear();
        this.f45450h = 0;
        try {
            this.f45450h = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            AbstractC2854b.c(this.f45448f, jSONArrayOptJSONArray);
        }
        ArrayList arrayList = new ArrayList();
        int i9 = this.f45450h;
        if (i9 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i9 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i9 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i9 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet = new HashSet(arrayList);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && !"metadataType".equals(next)) {
                    j0 j0Var = f45447k;
                    String strD = j0Var.d(next);
                    if (strD == null) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            this.f45449g.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            this.f45449g.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            this.f45449g.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet.contains(strD)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                int iA = j0Var.a(strD);
                                if (iA != 1) {
                                    if (iA != 2) {
                                        if (iA == 3) {
                                            double dOptDouble = jSONObject.optDouble(next);
                                            if (!Double.isNaN(dOptDouble)) {
                                                this.f45449g.putDouble(strD, dOptDouble);
                                            }
                                        } else if (iA != 4) {
                                            if (iA == 5) {
                                                this.f45449g.putLong(strD, AbstractC2774a.e(jSONObject.optLong(next)));
                                            }
                                        } else if (obj2 instanceof String) {
                                            str = (String) obj2;
                                            if (AbstractC2854b.a(str) != null) {
                                                bundle = this.f45449g;
                                                bundle.putString(strD, str);
                                            }
                                        }
                                    } else if (obj2 instanceof Integer) {
                                        this.f45449g.putInt(strD, ((Integer) obj2).intValue());
                                    }
                                } else if (obj2 instanceof String) {
                                    bundle = this.f45449g;
                                    str = (String) obj2;
                                    bundle.putString(strD, str);
                                }
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                }
            }
        } catch (JSONException unused3) {
        }
    }

    public final boolean Q(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !Q((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public void c(C2957a c2957a) {
        this.f45448f.add(c2957a);
    }

    public void clear() {
        this.f45449g.clear();
        this.f45448f.clear();
    }

    public boolean e(String str) {
        return this.f45449g.containsKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2281m)) {
            return false;
        }
        C2281m c2281m = (C2281m) obj;
        return Q(this.f45449g, c2281m.f45449g) && this.f45448f.equals(c2281m.f45448f);
    }

    public int hashCode() {
        Bundle bundle = this.f45449g;
        int iHashCode = 17;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = this.f45449g.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (iHashCode * 31) + this.f45448f.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        int iA = y4.c.a(parcel);
        y4.c.x(parcel, 2, H(), false);
        y4.c.e(parcel, 3, this.f45449g, false);
        y4.c.l(parcel, 4, I());
        y4.c.b(parcel, iA);
    }
}
