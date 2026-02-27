package com.amplifyframework.core.model;

import com.amplifyframework.core.model.Model;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ModelIdentifier<T extends Model> implements Serializable {
    private static final long serialVersionUID = 1;
    private final Serializable key;
    private final List<? extends Serializable> sortedKeys;

    public static class Helper {
        public static final String PRIMARY_KEY_DELIMITER = "#";
        public static final String PRIMARY_KEY_ENCAPSULATE_CHAR = "\"";

        public static String escapeAndEncapsulateString(String str) {
            return PRIMARY_KEY_ENCAPSULATE_CHAR + str.replaceAll(PRIMARY_KEY_ENCAPSULATE_CHAR, "\"\"") + PRIMARY_KEY_ENCAPSULATE_CHAR;
        }

        public static String getIdentifier(Serializable serializable, List<? extends Serializable> list) {
            StringBuilder sb = new StringBuilder();
            sb.append(escapeAndEncapsulateString(serializable.toString()));
            for (Serializable serializable2 : list) {
                sb.append(PRIMARY_KEY_DELIMITER);
                sb.append(escapeAndEncapsulateString(serializable2.toString()));
            }
            return sb.toString();
        }

        public static String getUniqueKey(ModelSchema modelSchema, Map<String, Object> map) {
            try {
                List<String> primaryIndexFields = modelSchema.getPrimaryIndexFields();
                if (primaryIndexFields.size() == 1) {
                    Object obj = map.get(primaryIndexFields.get(0));
                    Objects.requireNonNull(obj);
                    return obj.toString();
                }
                ListIterator<String> listIterator = primaryIndexFields.listIterator();
                Serializable serializable = (Serializable) map.get(listIterator.next());
                ArrayList arrayList = new ArrayList();
                while (listIterator.hasNext()) {
                    arrayList.add((Serializable) map.get(listIterator.next()));
                }
                if (serializable != null) {
                    return getIdentifier(serializable, arrayList);
                }
                return null;
            } catch (Exception e9) {
                throw new IllegalStateException("Invalid Primary Key, It should either be single field or of type composite primary key Primary Key." + e9);
            }
        }

        public static String getUniqueKey(Serializable serializable) {
            try {
                return serializable instanceof ModelIdentifier ? ((ModelIdentifier) serializable).getIdentifier() : serializable.toString();
            } catch (Exception e9) {
                throw new IllegalStateException("Invalid Primary Key, It should either be of type String or composite Primary Key." + e9);
            }
        }
    }

    public ModelIdentifier(Serializable serializable, Serializable... serializableArr) {
        this.key = serializable;
        this.sortedKeys = Arrays.asList(serializableArr);
    }

    public String getIdentifier() {
        return Helper.getIdentifier(this.key, this.sortedKeys);
    }

    public Serializable key() {
        return this.key;
    }

    public List<? extends Serializable> sortedKeys() {
        return this.sortedKeys;
    }
}
