package L1;

import F1.h;
import com.amazonaws.mobileconnectors.appsync.AppSyncSubscriptionCall;
import com.amazonaws.mobileconnectors.appsync.subscription.SubscriptionResponse;
import java.util.List;
import v1.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {
    @Override // L1.b
    public void addListener(t tVar, AppSyncSubscriptionCall.Callback callback) {
    }

    @Override // L1.b
    public void removeListener(t tVar, AppSyncSubscriptionCall.Callback callback) {
    }

    @Override // L1.b
    public void subscribe(t tVar, List list, SubscriptionResponse subscriptionResponse, h hVar) {
    }

    @Override // L1.b
    public void unsubscribe(t tVar) {
        throw new IllegalStateException("Subscription manager is not configured");
    }
}
