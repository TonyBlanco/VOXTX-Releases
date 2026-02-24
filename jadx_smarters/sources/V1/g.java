package V1;

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public class g implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Bitmap.Config[] f9864d = {Bitmap.Config.ARGB_8888, null};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Bitmap.Config[] f9865e = {Bitmap.Config.RGB_565};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Bitmap.Config[] f9866f = {Bitmap.Config.ARGB_4444};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Bitmap.Config[] f9867g = {Bitmap.Config.ALPHA_8};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f9868a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.c f9869b = new V1.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9870c = new HashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9871a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f9871a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9871a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9871a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9871a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f9872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f9874c;

        public b(c cVar) {
            this.f9872a = cVar;
        }

        @Override // V1.f
        public void a() {
            this.f9872a.c(this);
        }

        public void c(int i9, Bitmap.Config config) {
            this.f9873b = i9;
            this.f9874c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f9873b != bVar.f9873b) {
                return false;
            }
            Bitmap.Config config = this.f9874c;
            Bitmap.Config config2 = bVar.f9874c;
            if (config == null) {
                if (config2 != null) {
                    return false;
                }
            } else if (!config.equals(config2)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i9 = this.f9873b * 31;
            Bitmap.Config config = this.f9874c;
            return i9 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return g.i(this.f9873b, this.f9874c);
        }
    }

    public static class c extends V1.a {
        @Override // V1.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i9, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.c(i9, config);
            return bVar;
        }
    }

    public static String i(int i9, Bitmap.Config config) {
        return "[" + i9 + "](" + config + ")";
    }

    public static Bitmap.Config[] j(Bitmap.Config config) {
        int i9 = a.f9871a[config.ordinal()];
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? new Bitmap.Config[]{config} : f9867g : f9866f : f9865e : f9864d;
    }

    @Override // V1.e
    public void a(Bitmap bitmap) {
        b bVarE = this.f9868a.e(AbstractC2539h.e(bitmap), bitmap.getConfig());
        this.f9869b.d(bVarE, bitmap);
        NavigableMap navigableMapK = k(bitmap.getConfig());
        Integer num = (Integer) navigableMapK.get(Integer.valueOf(bVarE.f9873b));
        navigableMapK.put(Integer.valueOf(bVarE.f9873b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // V1.e
    public String b(Bitmap bitmap) {
        return i(AbstractC2539h.e(bitmap), bitmap.getConfig());
    }

    @Override // V1.e
    public String c(int i9, int i10, Bitmap.Config config) {
        return i(AbstractC2539h.d(i9, i10, config), config);
    }

    @Override // V1.e
    public Bitmap d(int i9, int i10, Bitmap.Config config) {
        int iD = AbstractC2539h.d(i9, i10, config);
        Bitmap bitmap = (Bitmap) this.f9869b.a(h(this.f9868a.e(iD, config), iD, config));
        if (bitmap != null) {
            g(Integer.valueOf(AbstractC2539h.e(bitmap)), bitmap.getConfig());
            bitmap.reconfigure(i9, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return bitmap;
    }

    @Override // V1.e
    public int e(Bitmap bitmap) {
        return AbstractC2539h.e(bitmap);
    }

    public final void g(Integer num, Bitmap.Config config) {
        NavigableMap navigableMapK = k(config);
        Integer num2 = (Integer) navigableMapK.get(num);
        if (num2.intValue() == 1) {
            navigableMapK.remove(num);
        } else {
            navigableMapK.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final b h(b bVar, int i9, Bitmap.Config config) {
        for (Bitmap.Config config2 : j(config)) {
            Integer num = (Integer) k(config2).ceilingKey(Integer.valueOf(i9));
            if (num != null && num.intValue() <= i9 * 8) {
                if (num.intValue() == i9) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVar;
                        }
                    } else if (config2.equals(config)) {
                        return bVar;
                    }
                }
                this.f9868a.c(bVar);
                return this.f9868a.e(num.intValue(), config2);
            }
        }
        return bVar;
    }

    public final NavigableMap k(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f9870c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f9870c.put(config, treeMap);
        return treeMap;
    }

    @Override // V1.e
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f9869b.f();
        if (bitmap != null) {
            g(Integer.valueOf(AbstractC2539h.e(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f9869b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f9870c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f9870c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
