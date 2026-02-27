package com.amplifyframework.core.model;

import O.c;
import android.annotation.SuppressLint;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelAssociation;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.annotations.BelongsTo;
import com.amplifyframework.core.model.annotations.HasMany;
import com.amplifyframework.core.model.annotations.HasOne;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.Indexes;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.util.FieldFinder;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ModelSchema {
    private final Map<String, ModelAssociation> associations;
    private final List<AuthRule> authRules;
    private final Map<String, ModelField> fields;
    private final Map<String, ModelIndex> indexes;
    private final String listPluralName;
    private final Class<? extends Model> modelClass;
    private final int modelSchemaVersion;
    private final Model.Type modelType;
    private final String name;
    private final String pluralName;
    private final String syncPluralName;

    public static final class Builder {
        private String listPluralName;
        private Class<? extends Model> modelClass;
        private int modelSchemaVersion;
        private String name;
        private String pluralName;
        private String syncPluralName;
        private Model.Type type;
        private final List<AuthRule> authRules = new ArrayList();
        private final Map<String, ModelField> fields = new TreeMap();
        private final Map<String, ModelAssociation> associations = new TreeMap();
        private final Map<String, ModelIndex> indexes = new TreeMap();

        public Builder associations(Map<String, ModelAssociation> map) {
            Objects.requireNonNull(map);
            this.associations.clear();
            this.associations.putAll(map);
            return this;
        }

        public Builder authRules(List<AuthRule> list) {
            Objects.requireNonNull(list);
            this.authRules.clear();
            this.authRules.addAll(list);
            return this;
        }

        @SuppressLint({"SyntheticAccessor"})
        public ModelSchema build() {
            Objects.requireNonNull(this.name);
            return new ModelSchema(this);
        }

        public Builder fields(Map<String, ModelField> map) {
            Objects.requireNonNull(map);
            this.fields.clear();
            this.fields.putAll(map);
            return this;
        }

        public Builder indexes(Map<String, ModelIndex> map) {
            Objects.requireNonNull(map);
            this.indexes.clear();
            this.indexes.putAll(map);
            return this;
        }

        public Builder listPluralName(String str) {
            this.listPluralName = str;
            return this;
        }

        public Builder modelClass(Class<? extends Model> cls) {
            this.modelClass = cls;
            return this;
        }

        public Builder modelType(Model.Type type) {
            this.type = type;
            return this;
        }

        public Builder name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        public Builder pluralName(String str) {
            this.pluralName = str;
            return this;
        }

        public Builder syncPluralName(String str) {
            this.syncPluralName = str;
            return this;
        }

        public Builder version(int i9) {
            this.modelSchemaVersion = i9;
            return this;
        }
    }

    private ModelSchema(Builder builder) {
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.listPluralName = builder.listPluralName;
        this.syncPluralName = builder.syncPluralName;
        this.authRules = builder.authRules;
        this.fields = builder.fields;
        this.associations = builder.associations;
        this.indexes = builder.indexes;
        this.modelClass = builder.modelClass;
        this.modelType = builder.type;
        this.modelSchemaVersion = builder.modelSchemaVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    private static ModelAssociation createModelAssociation(Field field) {
        ModelAssociation.Builder builderAssociatedName;
        Class<? extends Model> clsType;
        ModelAssociation.Builder builderAssociatedType;
        if (field.isAnnotationPresent(BelongsTo.class)) {
            Annotation annotation = field.getAnnotation(BelongsTo.class);
            Objects.requireNonNull(annotation);
            BelongsTo belongsTo = (BelongsTo) annotation;
            builderAssociatedType = ModelAssociation.builder().name(BelongsTo.class.getSimpleName()).targetName(belongsTo.targetName()).targetNames(belongsTo.targetNames()).associatedType(belongsTo.type().getSimpleName()).associatedName(field.getName());
        } else {
            if (field.isAnnotationPresent(HasOne.class)) {
                Annotation annotation2 = field.getAnnotation(HasOne.class);
                Objects.requireNonNull(annotation2);
                HasOne hasOne = (HasOne) annotation2;
                builderAssociatedName = ModelAssociation.builder().name(HasOne.class.getSimpleName()).associatedName(hasOne.associatedWith());
                clsType = hasOne.type();
            } else {
                if (!field.isAnnotationPresent(HasMany.class)) {
                    return null;
                }
                Annotation annotation3 = field.getAnnotation(HasMany.class);
                Objects.requireNonNull(annotation3);
                HasMany hasMany = (HasMany) annotation3;
                builderAssociatedName = ModelAssociation.builder().name(HasMany.class.getSimpleName()).associatedName(hasMany.associatedWith());
                clsType = hasMany.type();
            }
            builderAssociatedType = builderAssociatedName.associatedType(clsType.getSimpleName());
        }
        return builderAssociatedType.build();
    }

    private static ModelField createModelField(Field field) {
        com.amplifyframework.core.model.annotations.ModelField modelField = (com.amplifyframework.core.model.annotations.ModelField) field.getAnnotation(com.amplifyframework.core.model.annotations.ModelField.class);
        if (modelField == null) {
            return null;
        }
        String name = field.getName();
        Class<?> type = field.getType();
        String strTargetType = modelField.targetType();
        ArrayList arrayList = new ArrayList();
        for (com.amplifyframework.core.model.annotations.AuthRule authRule : modelField.authRules()) {
            arrayList.add(new AuthRule(authRule));
        }
        ModelField.ModelFieldBuilder modelFieldBuilderJavaClassForValue = ModelField.builder().name(name).javaClassForValue(type);
        if (strTargetType.isEmpty()) {
            strTargetType = type.getSimpleName();
        }
        return modelFieldBuilderJavaClassForValue.targetType(strTargetType).isReadOnly(modelField.isReadOnly()).isRequired(modelField.isRequired()).isArray(Collection.class.isAssignableFrom(field.getType())).isEnum(Enum.class.isAssignableFrom(field.getType())).isModel(Model.class.isAssignableFrom(field.getType())).authRules(arrayList).build();
    }

    private static ModelIndex createModelIndex(Index index) {
        return ModelIndex.builder().indexName(index.name()).indexFieldNames(Arrays.asList(index.fields())).build();
    }

    public static ModelSchema fromModelClass(Class<? extends Model> cls) throws AmplifyException {
        try {
            List<Field> listFindModelFieldsIn = FieldFinder.findModelFieldsIn(cls);
            TreeMap treeMap = new TreeMap();
            TreeMap treeMap2 = new TreeMap();
            TreeMap treeMap3 = new TreeMap();
            ArrayList arrayList = new ArrayList();
            ModelConfig modelConfig = (ModelConfig) cls.getAnnotation(ModelConfig.class);
            String simpleName = cls.getSimpleName();
            String strSyncPluralName = null;
            String strPluralName = (modelConfig == null || modelConfig.pluralName().isEmpty()) ? null : modelConfig.pluralName();
            Model.Type type = modelConfig != null ? modelConfig.type() : Model.Type.USER;
            String strListPluralName = (modelConfig == null || modelConfig.listPluralName().isEmpty()) ? null : modelConfig.listPluralName();
            if (modelConfig != null && !modelConfig.syncPluralName().isEmpty()) {
                strSyncPluralName = modelConfig.syncPluralName();
            }
            int iVersion = modelConfig != null ? modelConfig.version() : 0;
            if (modelConfig != null) {
                com.amplifyframework.core.model.annotations.AuthRule[] authRuleArrAuthRules = modelConfig.authRules();
                int length = authRuleArrAuthRules.length;
                int i9 = 0;
                while (i9 < length) {
                    arrayList.add(new AuthRule(authRuleArrAuthRules[i9]));
                    i9++;
                    authRuleArrAuthRules = authRuleArrAuthRules;
                }
            }
            Annotation[] annotations = cls.getAnnotations();
            int length2 = annotations.length;
            int i10 = 0;
            while (i10 < length2) {
                Annotation annotation = annotations[i10];
                Annotation[] annotationArr = annotations;
                int i11 = length2;
                if (annotation.annotationType().isAssignableFrom(Indexes.class)) {
                    Index[] indexArrValue = ((Indexes) annotation).value();
                    int length3 = indexArrValue.length;
                    int i12 = 0;
                    while (i12 < length3) {
                        Index[] indexArr = indexArrValue;
                        ModelIndex modelIndexCreateModelIndex = createModelIndex(indexArrValue[i12]);
                        treeMap3.put(modelIndexCreateModelIndex.getIndexName(), modelIndexCreateModelIndex);
                        i12++;
                        length3 = length3;
                        indexArrValue = indexArr;
                    }
                } else if (annotation.annotationType().isAssignableFrom(Index.class)) {
                    ModelIndex modelIndexCreateModelIndex2 = createModelIndex((Index) annotation);
                    treeMap3.put(modelIndexCreateModelIndex2.getIndexName(), modelIndexCreateModelIndex2);
                }
                i10++;
                annotations = annotationArr;
                length2 = i11;
            }
            for (Field field : listFindModelFieldsIn) {
                ModelField modelFieldCreateModelField = createModelField(field);
                if (modelFieldCreateModelField != null) {
                    treeMap.put(field.getName(), modelFieldCreateModelField);
                }
                ModelAssociation modelAssociationCreateModelAssociation = createModelAssociation(field);
                if (modelAssociationCreateModelAssociation != null) {
                    treeMap2.put(field.getName(), modelAssociationCreateModelAssociation);
                }
            }
            return builder().name(simpleName).pluralName(strPluralName).listPluralName(strListPluralName).syncPluralName(strSyncPluralName).authRules(arrayList).fields(treeMap).associations(treeMap2).indexes(treeMap3).modelClass(cls).modelType(type).version(iVersion).build();
        } catch (Exception e9) {
            throw new AmplifyException("Error in constructing a ModelSchema.", e9, AmplifyException.TODO_RECOVERY_SUGGESTION);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelSchema.class != obj.getClass()) {
            return false;
        }
        ModelSchema modelSchema = (ModelSchema) obj;
        return c.a(getName(), modelSchema.getName()) && c.a(getPluralName(), modelSchema.getPluralName()) && c.a(getListPluralName(), modelSchema.getListPluralName()) && c.a(getSyncPluralName(), modelSchema.getSyncPluralName()) && c.a(getAuthRules(), modelSchema.getAuthRules()) && c.a(getFields(), modelSchema.getFields()) && c.a(getAssociations(), modelSchema.getAssociations()) && c.a(getIndexes(), modelSchema.getIndexes()) && c.a(getModelClass(), modelSchema.getModelClass());
    }

    public Map<String, ModelAssociation> getAssociations() {
        return Immutable.of(this.associations);
    }

    public List<AuthRule> getAuthRules() {
        return this.authRules;
    }

    public Map<String, ModelField> getFields() {
        return this.fields;
    }

    public Map<String, ModelIndex> getIndexes() {
        return this.indexes;
    }

    public String getListPluralName() {
        return this.listPluralName;
    }

    public Class<? extends Model> getModelClass() {
        return this.modelClass;
    }

    public Model.Type getModelType() {
        return this.modelType;
    }

    public String getName() {
        return this.name;
    }

    public String getPluralName() {
        return this.pluralName;
    }

    public List<String> getPrimaryIndexFields() {
        ModelIndex modelIndex = this.indexes.get("undefined");
        return (modelIndex == null || modelIndex.getIndexFieldNames().size() < 1) ? Arrays.asList(PrimaryKey.fieldName()) : modelIndex.getIndexFieldNames();
    }

    public String getPrimaryKeyName() {
        return getPrimaryIndexFields().get(0);
    }

    public String getSyncPluralName() {
        return this.syncPluralName;
    }

    public int getVersion() {
        return this.modelSchemaVersion;
    }

    public boolean hasModelLevelRules() {
        return this.authRules.size() > 0;
    }

    public int hashCode() {
        return c.b(getName(), getPluralName(), getListPluralName(), getSyncPluralName(), getAuthRules(), getFields(), getAssociations(), getIndexes(), getModelClass(), Integer.valueOf(getVersion()));
    }

    public String toString() {
        return "ModelSchema{name='" + this.name + "', pluralName='" + this.pluralName + "', listPluralName='" + this.listPluralName + "', syncPluralName='" + this.syncPluralName + "', authRules=" + this.authRules + ", fields=" + this.fields + ", associations=" + this.associations + ", indexes=" + this.indexes + ", modelClass=" + this.modelClass + ", modelSchemaVersion=" + this.modelSchemaVersion + '}';
    }
}
