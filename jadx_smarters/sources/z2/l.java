package Z2;

import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import d4.AbstractC1684a;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static StreamRequest a(Uri uri) {
        StreamRequest.StreamFormat streamFormat;
        if (!"ssai".equals(uri.getScheme()) || !"dai.google.com".equals(uri.getAuthority())) {
            throw new IllegalArgumentException("Invalid URI scheme or authority.");
        }
        String queryParameter = uri.getQueryParameter("assetKey");
        String queryParameter2 = uri.getQueryParameter("apiKey");
        StreamRequest streamRequestCreateLiveStreamRequest = !TextUtils.isEmpty(queryParameter) ? ImaSdkFactory.getInstance().createLiveStreamRequest(queryParameter, queryParameter2) : ImaSdkFactory.getInstance().createVodStreamRequest((String) AbstractC1684a.e(uri.getQueryParameter("contentSourceId")), (String) AbstractC1684a.e(uri.getQueryParameter("videoId")), queryParameter2);
        int i9 = Integer.parseInt(uri.getQueryParameter(IjkMediaMeta.IJKM_KEY_FORMAT));
        if (i9 == 0) {
            streamFormat = StreamRequest.StreamFormat.DASH;
        } else {
            if (i9 != 2) {
                throw new IllegalArgumentException("Unsupported stream format:" + i9);
            }
            streamFormat = StreamRequest.StreamFormat.HLS;
        }
        streamRequestCreateLiveStreamRequest.setFormat(streamFormat);
        String queryParameter3 = uri.getQueryParameter("adTagParameters");
        if (!TextUtils.isEmpty(queryParameter3)) {
            HashMap map = new HashMap();
            Uri uri2 = Uri.parse(queryParameter3);
            for (String str : uri2.getQueryParameterNames()) {
                String queryParameter4 = uri2.getQueryParameter(str);
                if (!TextUtils.isEmpty(queryParameter4)) {
                    map.put(str, queryParameter4);
                }
            }
            streamRequestCreateLiveStreamRequest.setAdTagParameters(map);
        }
        String queryParameter5 = uri.getQueryParameter("manifestSuffix");
        if (queryParameter5 != null) {
            streamRequestCreateLiveStreamRequest.setManifestSuffix(queryParameter5);
        }
        if (uri.getQueryParameter("contentUrl") != null) {
        }
        String queryParameter6 = uri.getQueryParameter("authToken");
        if (queryParameter6 != null) {
            streamRequestCreateLiveStreamRequest.setAuthToken(queryParameter6);
        }
        String queryParameter7 = uri.getQueryParameter("streamActivityMonitorId");
        if (queryParameter7 != null) {
            streamRequestCreateLiveStreamRequest.setStreamActivityMonitorId(queryParameter7);
        }
        return streamRequestCreateLiveStreamRequest;
    }

    public static String b(Uri uri) {
        return (String) AbstractC1684a.e(uri.getQueryParameter("adsId"));
    }

    public static int c(Uri uri) {
        String queryParameter = uri.getQueryParameter("loadVideoTimeoutMs");
        return TextUtils.isEmpty(queryParameter) ? Constants.MAXIMUM_UPLOAD_PARTS : Integer.parseInt(queryParameter);
    }

    public static boolean d(Uri uri) {
        return !TextUtils.isEmpty(uri.getQueryParameter("assetKey"));
    }
}
