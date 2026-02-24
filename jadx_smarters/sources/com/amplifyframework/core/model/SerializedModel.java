package com.amplifyframework.core.model;

import O.c;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SerializedModel implements Model {
    private final Serializable modelId;
    private final ModelSchema modelSchema;
    private final Map<String, Object> serializedData;

    public static final class Builder implements BuilderSteps.SerializedDataStep, BuilderSteps.ModelSchemaStep, BuilderSteps.BuildStep {
        private String id;
        private ModelSchema modelSchema;
        private final Map<String, Object> serializedData;

        private Builder() {
            this.serializedData = new HashMap();
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.BuildStep
        public SerializedModel build() {
            return new SerializedModel(this.id, Immutable.of(this.serializedData), this.modelSchema);
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.ModelSchemaStep
        public BuilderSteps.SerializedDataStep modelSchema(ModelSchema modelSchema) {
            this.modelSchema = modelSchema;
            return this;
        }

        @Override // com.amplifyframework.core.model.SerializedModel.BuilderSteps.SerializedDataStep
        public BuilderSteps.BuildStep serializedData(Map<String, Object> map) {
            Map<String, Object> map2 = this.serializedData;
            Objects.requireNonNull(map);
            map2.putAll(map);
            this.id = ModelIdentifier.Helper.getUniqueKey(this.modelSchema, map);
            return this;
        }
    }

    public interface BuilderSteps {

        public interface BuildStep {
            SerializedModel build();
        }

        public interface ModelSchemaStep {
            SerializedDataStep modelSchema(ModelSchema modelSchema);
        }

        public interface SerializedDataStep {
            BuildStep serializedData(Map<String, Object> map);
        }
    }

    private SerializedModel(Serializable serializable, Map<String, Object> map, ModelSchema modelSchema) {
        this.modelId = serializable;
        this.serializedData = map;
        this.modelSchema = modelSchema;
    }

    public static BuilderSteps.ModelSchemaStep builder() {
        return new Builder();
    }

    public static <T extends Model> SerializedModel create(T t9, ModelSchema modelSchema) throws AmplifyException {
        return builder().modelSchema(modelSchema).serializedData(ModelConverter.toMap(t9, modelSchema)).build();
    }

    public static <T extends Model> SerializedModel difference(T t9, T t10, ModelSchema modelSchema) throws AmplifyException {
        if (t10 == null) {
            return create(t9, modelSchema);
        }
        Map<String, Object> map = ModelConverter.toMap(t9, modelSchema);
        Map<String, Object> map2 = ModelConverter.toMap(t10, modelSchema);
        HashMap map3 = new HashMap();
        for (String str : map.keySet()) {
            HashSet hashSet = new HashSet();
            hashSet.add(PrimaryKey.fieldName());
            hashSet.addAll(modelSchema.getPrimaryIndexFields());
            if (hashSet.contains(str) || !c.a(map2.get(str), map.get(str))) {
                map3.put(str, map.get(str));
            }
        }
        return builder().modelSchema(modelSchema).serializedData(map3).build();
    }

    public static SerializedModel merge(SerializedModel serializedModel, SerializedModel serializedModel2, ModelSchema modelSchema) {
        HashMap map = new HashMap(serializedModel.serializedData);
        for (String str : serializedModel2.getSerializedData().keySet()) {
            if (!map.containsKey(str)) {
                map.put(str, serializedModel2.getSerializedData().get(str));
            }
        }
        return builder().modelSchema(modelSchema).serializedData(map).build();
    }

    public static Map<String, Object> parseSerializedData(Map<String, Object> map, String str, SchemaRegistry schemaRegistry) {
        Object objBuild;
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ModelField> entry : schemaRegistry.getModelSchemaForModelClass(str).getFields().entrySet()) {
            String key = entry.getKey();
            ModelField value = entry.getValue();
            if (map.containsKey(key)) {
                Object obj = map.get(key);
                if (obj == null) {
                    objBuild = null;
                } else if (value.isModel()) {
                    ModelSchema modelSchemaForModelClass = schemaRegistry.getModelSchemaForModelClass(value.getTargetType());
                    Map<String, Object> map3 = (Map) map.get(key);
                    if (map3 != null) {
                        objBuild = builder().modelSchema(modelSchemaForModelClass).serializedData(map3).build();
                    }
                } else if (!value.isCustomType()) {
                    map2.put(key, obj);
                } else if (value.isArray()) {
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    if (!list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(SerializedCustomType.builder().serializedData(SerializedCustomType.parseSerializedData((Map) it.next(), value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build());
                        }
                    }
                    map2.put(key, arrayList);
                } else {
                    objBuild = SerializedCustomType.builder().serializedData(SerializedCustomType.parseSerializedData((Map) obj, value.getTargetType(), schemaRegistry)).customTypeSchema(schemaRegistry.getCustomTypeSchemaForCustomTypeClass(value.getTargetType())).build();
                }
                map2.put(key, objBuild);
            }
        }
        return map2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SerializedModel.class != obj.getClass()) {
            return false;
        }
        SerializedModel serializedModel = (SerializedModel) obj;
        return c.a(this.modelId, serializedModel.modelId) && c.a(this.serializedData, serializedModel.serializedData) && c.a(this.modelSchema, serializedModel.modelSchema);
    }

    @Override // com.amplifyframework.core.model.Model
    public String getModelName() {
        ModelSchema modelSchema = this.modelSchema;
        if (modelSchema == null) {
            return null;
        }
        return modelSchema.getName();
    }

    public ModelSchema getModelSchema() {
        return this.modelSchema;
    }

    @Override // com.amplifyframework.core.model.Model
    public /* synthetic */ String getPrimaryKeyString() {
        return a.b(this);
    }

    public Map<String, Object> getSerializedData() {
        return this.serializedData;
    }

    public Object getValue(ModelField modelField) {
        return this.serializedData.get(modelField.getName());
    }

    public int hashCode() {
        return c.b(this.modelId, this.serializedData, this.modelSchema);
    }

    @Override // com.amplifyframework.core.model.Model
    public Serializable resolveIdentifier() {
        return this.modelId;
    }

    public String toString() {
        return "SerializedModel{id='" + this.modelId + "', serializedData=" + this.serializedData + ", modelName=" + getModelName() + '}';
    }
}
