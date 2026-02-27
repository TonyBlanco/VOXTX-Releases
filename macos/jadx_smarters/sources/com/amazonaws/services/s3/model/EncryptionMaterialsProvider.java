package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface EncryptionMaterialsProvider extends EncryptionMaterialsAccessor {
    EncryptionMaterials getEncryptionMaterials();

    void refresh();
}
