package i1;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f41814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f41815e;

    public f(int i9, List list) {
        this(i9, list, -1, null);
    }

    public f(int i9, List list, int i10, InputStream inputStream) {
        this.f41811a = i9;
        this.f41812b = list;
        this.f41813c = i10;
        this.f41814d = inputStream;
        this.f41815e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f41814d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f41815e != null) {
            return new ByteArrayInputStream(this.f41815e);
        }
        return null;
    }

    public final int b() {
        return this.f41813c;
    }

    public final List c() {
        return Collections.unmodifiableList(this.f41812b);
    }

    public final int d() {
        return this.f41811a;
    }
}
