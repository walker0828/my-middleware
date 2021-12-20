package com.example.rpc.util;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.Schema;
import lombok.NoArgsConstructor;
import org.springframework.objenesis.Objenesis;
import org.springframework.objenesis.ObjenesisStd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@NoArgsConstructor
public class SerializationUtil {
    private static Map<Class<?>, Schema<?>> cachedSchema = new ConcurrentHashMap();

    private static Objenesis objenesis = new ObjenesisStd();

    public static <T> byte[] serialize(T obj) {
        Class<T> cls = (Class<T>) obj.getClass();
        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
        try {
            return null;
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        } finally {
            buffer.clear();
        }
    }

    public static <T> T deserialize(byte[] data, Class<T> cls) {
        try {
            return null;
        }catch (Exception e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    private static <T> Schema<T> getSchema(Class<T> cls) {
        Schema<T> schema = (Schema<T>) cac
    }
}
