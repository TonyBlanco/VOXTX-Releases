package f7;

import android.content.Context;
import android.provider.MediaStore;
import o0.AbstractC2302b;
import org.achartengine.ChartFactory;

/* JADX INFO: renamed from: f7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1785d extends AbstractC2302b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f40860w = {"_id", ChartFactory.TITLE, "_data", "_size", "bucket_id", "bucket_display_name", "date_added", "duration"};

    public C1785d(Context context) {
        super(context);
        L(f40860w);
        P(MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        O("date_added DESC");
        M("mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=? or mime_type=?");
        N(new String[]{"video/mpeg", "video/mp4", "video/x-matroska", "video/3gpp", "video/MP2T", "video/x-flv", "video/x-msvideo", "video/x-ms-wmv", "video/quicktime"});
    }
}
