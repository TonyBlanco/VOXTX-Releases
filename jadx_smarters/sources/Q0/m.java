package Q0;

import Q0.v;
import android.os.Build;
import androidx.work.OverwritingInputMerger;

/* JADX INFO: loaded from: classes.dex */
public final class m extends v {

    public static final class a extends v.a {
        public a(Class cls) {
            super(cls);
            this.f7473c.f10814d = OverwritingInputMerger.class.getName();
        }

        @Override // Q0.v.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public m c() {
            if (this.f7471a && Build.VERSION.SDK_INT >= 23 && this.f7473c.f10820j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new m(this);
        }

        @Override // Q0.v.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }

    public m(a aVar) {
        super(aVar.f7472b, aVar.f7473c, aVar.f7474d);
    }

    public static m d(Class cls) {
        return (m) new a(cls).b();
    }
}
