package com.amazonaws.services.s3.model;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class StaticEncryptionMaterialsProvider implements EncryptionMaterialsProvider {
    private final EncryptionMaterials materials;

    public StaticEncryptionMaterialsProvider(EncryptionMaterials encryptionMaterials) {
        this.materials = encryptionMaterials;
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterialsProvider
    public EncryptionMaterials getEncryptionMaterials() {
        return this.materials;
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterialsAccessor
    public EncryptionMaterials getEncryptionMaterials(Map<String, String> map) {
        EncryptionMaterials encryptionMaterials;
        Map<String, String> materialsDescription = this.materials.getMaterialsDescription();
        if (map != null && map.equals(materialsDescription)) {
            return this.materials;
        }
        EncryptionMaterialsAccessor accessor = this.materials.getAccessor();
        if (accessor != null && (encryptionMaterials = accessor.getEncryptionMaterials(map)) != null) {
            return encryptionMaterials;
        }
        boolean z9 = true;
        boolean z10 = map == null || map.size() == 0;
        if (materialsDescription != null && materialsDescription.size() != 0) {
            z9 = false;
        }
        if (z10 && z9) {
            return this.materials;
        }
        return null;
    }

    @Override // com.amazonaws.services.s3.model.EncryptionMaterialsProvider
    public void refresh() {
    }
}
