package F2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f1908c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1910b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1911a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f1912b = new ArrayList();

        public d a() {
            return new d(this.f1911a, Collections.unmodifiableList(this.f1912b));
        }

        public a b(List list) {
            this.f1912b = list;
            return this;
        }

        public a c(String str) {
            this.f1911a = str;
            return this;
        }
    }

    public d(String str, List list) {
        this.f1909a = str;
        this.f1910b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f1910b;
    }

    public String b() {
        return this.f1909a;
    }
}
