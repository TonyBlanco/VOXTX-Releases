package e7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f40458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f40459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f40460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f40461d = new ArrayList();

    public void a(Object obj) {
        this.f40461d.add(obj);
    }

    public List b() {
        return this.f40461d;
    }

    public String c() {
        return this.f40459b;
    }

    public String d() {
        return this.f40460c;
    }

    public void e(String str) {
        this.f40458a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f40460c.equals(((c) obj).f40460c);
        }
        return false;
    }

    public void f(String str) {
        this.f40459b = str;
    }

    public void g(String str) {
        this.f40460c = str;
    }

    public int hashCode() {
        return this.f40460c.hashCode();
    }
}
