package com.google.ads.interactivemedia.v3.internal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class aoi extends apj {
    public aoi(anw anwVar, agl aglVar, int i9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(anwVar, "9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", aglVar, i9, 49, null, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apj
    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.f20474g.aK(agh.f19671c);
        try {
            this.f20474g.aK(((Boolean) this.f20471d.invoke(null, this.f20468a.b())).booleanValue() ? agh.f19670b : agh.f19669a);
        } catch (InvocationTargetException e9) {
            if (!(e9.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e9;
            }
        }
    }
}
