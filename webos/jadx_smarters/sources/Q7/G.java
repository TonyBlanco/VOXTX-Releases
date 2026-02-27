package q7;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: loaded from: classes4.dex */
public class G extends RecyclerView.D {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NativeAdLayout f47219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f47220u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Button f47221v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public MediaView f47222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TextView f47223x;

    public G(View view) {
        super(view);
        NativeAdLayout nativeAdLayout = (NativeAdLayout) view.findViewById(a7.f.zb);
        this.f47219t = nativeAdLayout;
        this.f47220u = (TextView) nativeAdLayout.findViewById(a7.f.yb);
        this.f47223x = (TextView) this.f47219t.findViewById(a7.f.xb);
        this.f47222w = (MediaView) this.f47219t.findViewById(a7.f.Ab);
        this.f47221v = (Button) this.f47219t.findViewById(a7.f.wb);
    }

    public NativeAdLayout P() {
        return this.f47219t;
    }

    public Button Q() {
        return this.f47221v;
    }

    public MediaView R() {
        return this.f47222w;
    }

    public TextView S() {
        return this.f47223x;
    }

    public TextView T() {
        return this.f47220u;
    }
}
