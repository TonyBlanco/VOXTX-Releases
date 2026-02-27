package f7;

import android.content.Context;
import android.provider.MediaStore;
import o0.AbstractC2302b;
import org.achartengine.ChartFactory;

/* JADX INFO: renamed from: f7.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1784c extends AbstractC2302b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f40859w = {"_id", ChartFactory.TITLE, "_data", "_size", "bucket_id", "bucket_display_name", "date_added", "orientation"};

    public C1784c(Context context) {
        super(context);
        L(f40859w);
        P(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        O("date_added DESC");
        M("mime_type=? or mime_type=? or mime_type=? or mime_type=?");
        N(new String[]{"image/jpeg", "image/png", "image/jpg", "image/gif"});
    }
}
