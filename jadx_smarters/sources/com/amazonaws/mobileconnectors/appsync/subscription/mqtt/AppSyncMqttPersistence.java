package com.amazonaws.mobileconnectors.appsync.subscription.mqtt;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.internal.FileLock;
import org.eclipse.paho.client.mqttv3.internal.MqttPersistentData;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncMqttPersistence implements MqttClientPersistence {
    private static final FilenameFilter FILE_FILTER = new FilenameFilter() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.mqtt.AppSyncMqttPersistence.1
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(AppSyncMqttPersistence.MESSAGE_FILE_EXTENSION);
        }
    };
    private static final String LOCK_FILENAME = ".lck";
    private static final String MESSAGE_BACKUP_FILE_EXTENSION = ".bup";
    private static final String MESSAGE_FILE_EXTENSION = ".msg";
    private File clientDir;
    private File dataDir;
    private FileLock fileLock;

    public AppSyncMqttPersistence() {
        this(System.getProperty("user.dir"));
    }

    public AppSyncMqttPersistence(String str) {
        this.clientDir = null;
        this.fileLock = null;
        this.dataDir = new File(str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    private void checkIsOpen() throws MqttPersistenceException {
        if (this.clientDir == null) {
            throw new MqttPersistenceException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    private File[] getFiles() throws MqttPersistenceException {
        checkIsOpen();
        File[] fileArrListFiles = this.clientDir.listFiles(FILE_FILTER);
        if (fileArrListFiles != null) {
            return fileArrListFiles;
        }
        throw new MqttPersistenceException();
    }

    private boolean isSafeChar(char c9) {
        return Character.isJavaIdentifierPart(c9) || c9 == '-';
    }

    private void restoreBackups(File file) throws MqttPersistenceException {
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.amazonaws.mobileconnectors.appsync.subscription.mqtt.AppSyncMqttPersistence.2
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.getName().endsWith(AppSyncMqttPersistence.MESSAGE_BACKUP_FILE_EXTENSION);
            }
        });
        for (int i9 = 0; i9 < fileArrListFiles.length; i9++) {
            File file2 = new File(file, fileArrListFiles[i9].getName().substring(0, fileArrListFiles[i9].getName().length() - 4));
            if (!fileArrListFiles[i9].renameTo(file2)) {
                file2.delete();
                fileArrListFiles[i9].renameTo(file2);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    public void clear() throws MqttPersistenceException {
        checkIsOpen();
        for (File file : getFiles()) {
            file.delete();
        }
    }

    public void close() throws MqttPersistenceException {
        synchronized (this) {
            try {
                FileLock fileLock = this.fileLock;
                if (fileLock != null) {
                    fileLock.release();
                }
                if (getFiles().length == 0) {
                    this.clientDir.delete();
                }
                this.clientDir = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    public boolean containsKey(String str) throws MqttPersistenceException {
        checkIsOpen();
        return new File(this.clientDir, str + MESSAGE_FILE_EXTENSION).exists();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    public MqttPersistable get(String str) throws MqttPersistenceException {
        checkIsOpen();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(this.clientDir, str + MESSAGE_FILE_EXTENSION));
            int iAvailable = fileInputStream.available();
            byte[] bArr = new byte[iAvailable];
            for (int i9 = 0; i9 < iAvailable; i9 += fileInputStream.read(bArr, i9, iAvailable - i9)) {
            }
            fileInputStream.close();
            return new MqttPersistentData(str, bArr, 0, iAvailable, (byte[]) null, 0, 0);
        } catch (IOException e9) {
            throw new MqttPersistenceException(e9);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    public Enumeration keys() throws MqttPersistenceException {
        checkIsOpen();
        File[] files = getFiles();
        Vector vector = new Vector(files.length);
        for (File file : files) {
            vector.addElement(file.getName().substring(0, r4.length() - 4));
        }
        return vector.elements();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    public void open(String str, String str2) throws MqttPersistenceException {
        if (this.dataDir.exists() && !this.dataDir.isDirectory()) {
            throw new MqttPersistenceException();
        }
        if (!this.dataDir.exists() && !this.dataDir.mkdirs()) {
            throw new MqttPersistenceException();
        }
        if (!this.dataDir.canWrite()) {
            throw new MqttPersistenceException();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if (isSafeChar(cCharAt)) {
                stringBuffer.append(cCharAt);
            }
        }
        stringBuffer.append("-");
        int iIndexOf = str2.indexOf("iot");
        int iMin = Math.min(str2.length(), 100);
        if (iIndexOf <= 0) {
            iIndexOf = iMin;
        }
        for (int i10 = 0; i10 < iIndexOf; i10++) {
            char cCharAt2 = str2.charAt(i10);
            if (isSafeChar(cCharAt2)) {
                stringBuffer.append(cCharAt2);
            }
        }
        synchronized (this) {
            if (this.clientDir == null) {
                File file = new File(this.dataDir, stringBuffer.toString());
                this.clientDir = file;
                if (!file.exists()) {
                    this.clientDir.mkdir();
                }
            }
            try {
                this.fileLock = new FileLock(this.clientDir, LOCK_FILENAME);
            } catch (Exception unused) {
            }
            restoreBackups(this.clientDir);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    public void put(String str, MqttPersistable mqttPersistable) throws MqttPersistenceException {
        checkIsOpen();
        File file = new File(this.clientDir, str + MESSAGE_FILE_EXTENSION);
        File file2 = new File(this.clientDir, str + MESSAGE_FILE_EXTENSION + MESSAGE_BACKUP_FILE_EXTENSION);
        if (file.exists() && !file.renameTo(file2)) {
            file2.delete();
            file.renameTo(file2);
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(mqttPersistable.getHeaderBytes(), mqttPersistable.getHeaderOffset(), mqttPersistable.getHeaderLength());
                if (mqttPersistable.getPayloadBytes() != null) {
                    fileOutputStream.write(mqttPersistable.getPayloadBytes(), mqttPersistable.getPayloadOffset(), mqttPersistable.getPayloadLength());
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                if (file2.exists()) {
                    file2.delete();
                }
                if (!file2.exists() || file2.renameTo(file)) {
                    return;
                }
                file.delete();
                file2.renameTo(file);
            } catch (IOException e9) {
                throw new MqttPersistenceException(e9);
            }
        } catch (Throwable th) {
            if (file2.exists() && !file2.renameTo(file)) {
                file.delete();
                file2.renameTo(file);
            }
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.eclipse.paho.client.mqttv3.MqttPersistenceException */
    public void remove(String str) throws MqttPersistenceException {
        checkIsOpen();
        File file = new File(this.clientDir, str + MESSAGE_FILE_EXTENSION);
        if (file.exists()) {
            file.delete();
        }
    }
}
