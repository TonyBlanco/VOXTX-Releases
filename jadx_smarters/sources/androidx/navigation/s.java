package androidx.navigation;

import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    public interface a {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface b {
        String value();
    }

    public abstract k a();

    public abstract k b(k kVar, Bundle bundle, p pVar, a aVar);

    public void c(Bundle bundle) {
    }

    public Bundle d() {
        return null;
    }

    public abstract boolean e();
}
