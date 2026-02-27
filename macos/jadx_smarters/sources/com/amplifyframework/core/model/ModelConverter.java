package com.amplifyframework.core.model;

import com.amplifyframework.AmplifyException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class ModelConverter {
    private ModelConverter() {
    }

    private static Map<String, Object> extractAssociateId(ModelField modelField, Model model, ModelSchema modelSchema) throws AmplifyException {
        String str;
        Object primaryKeyString;
        Object objExtractFieldValue = extractFieldValue(modelField.getName(), model, modelSchema);
        if (modelField.isModel() && (objExtractFieldValue instanceof Model)) {
            Model model2 = (Model) objExtractFieldValue;
            ModelSchema modelSchemaForModelClass = SchemaRegistry.instance().getModelSchemaForModelClass(model2.getModelName());
            HashMap map = new HashMap();
            if (modelSchemaForModelClass.getPrimaryIndexFields().size() > 1 && (model2.resolveIdentifier() instanceof ModelIdentifier)) {
                ModelIdentifier modelIdentifier = (ModelIdentifier) model2.resolveIdentifier();
                ListIterator<String> listIterator = modelSchemaForModelClass.getPrimaryIndexFields().listIterator();
                map.put(listIterator.next(), modelIdentifier.key());
                ListIterator<? extends Serializable> listIterator2 = modelIdentifier.sortedKeys().listIterator();
                while (listIterator.hasNext()) {
                    map.put(listIterator.next(), listIterator2.next());
                }
                return map;
            }
            if (modelSchemaForModelClass.getPrimaryIndexFields().size() > 1 && (model2 instanceof SerializedModel)) {
                for (String str2 : modelSchemaForModelClass.getPrimaryIndexFields()) {
                    map.put(str2, ((SerializedModel) model2).getSerializedData().get(str2));
                }
                return map;
            }
            str = modelSchemaForModelClass.getPrimaryIndexFields().get(0);
            primaryKeyString = model2.getPrimaryKeyString();
        } else {
            if (!modelField.isModel() || !(objExtractFieldValue instanceof Map)) {
                if (modelField.isModel() && objExtractFieldValue == null) {
                    return null;
                }
                throw new IllegalStateException("Associated data is not a Model or Map.");
            }
            str = Name.MARK;
            primaryKeyString = ((Map) objExtractFieldValue).get(Name.MARK);
        }
        return Collections.singletonMap(str, primaryKeyString);
    }

    private static Object extractFieldValue(String str, Model model, ModelSchema modelSchema) throws AmplifyException {
        if (model instanceof SerializedModel) {
            return ((SerializedModel) model).getSerializedData().get(str);
        }
        try {
            Field declaredField = model.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(model);
        } catch (Exception e9) {
            throw new AmplifyException("An invalid field was provided. " + str + " is not present in " + modelSchema.getName(), e9, "Check if this model schema is a correct representation of the fields in the provided Object");
        }
    }

    public static <T extends Model> Map<String, Object> toMap(T t9, ModelSchema modelSchema) throws AmplifyException {
        Object objExtractFieldValue;
        SchemaRegistry schemaRegistryInstance = SchemaRegistry.instance();
        HashMap map = new HashMap();
        for (ModelField modelField : modelSchema.getFields().values()) {
            String name = modelField.getName();
            String targetType = modelField.getTargetType();
            ModelAssociation modelAssociation = modelSchema.getAssociations().get(name);
            if (modelAssociation == null) {
                if (!(t9 instanceof SerializedModel) || ((SerializedModel) t9).getSerializedData().containsKey(modelField.getName())) {
                    objExtractFieldValue = extractFieldValue(modelField.getName(), t9, modelSchema);
                    map.put(name, objExtractFieldValue);
                }
            } else if (modelAssociation.isOwner()) {
                ModelSchema modelSchemaForModelClass = schemaRegistryInstance.getModelSchemaForModelClass(targetType);
                Map<String, Object> mapExtractAssociateId = extractAssociateId(modelField, t9, modelSchema);
                if (mapExtractAssociateId != null) {
                    objExtractFieldValue = SerializedModel.builder().modelSchema(modelSchemaForModelClass).serializedData(mapExtractAssociateId).build();
                    map.put(name, objExtractFieldValue);
                }
            }
        }
        return map;
    }
}
