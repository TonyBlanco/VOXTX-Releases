package T1;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class h extends a {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // T1.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // T1.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InputStream d(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
