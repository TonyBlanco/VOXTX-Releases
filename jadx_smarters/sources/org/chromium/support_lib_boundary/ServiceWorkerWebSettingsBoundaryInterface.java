package org.chromium.support_lib_boundary;

/* JADX INFO: loaded from: classes4.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    int getRequestedWithHeaderMode();

    void setAllowContentAccess(boolean z9);

    void setAllowFileAccess(boolean z9);

    void setBlockNetworkLoads(boolean z9);

    void setCacheMode(int i9);

    void setRequestedWithHeaderMode(int i9);
}
