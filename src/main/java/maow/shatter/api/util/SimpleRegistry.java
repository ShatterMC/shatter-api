package maow.shatter.api.util;

import java.util.HashMap;
import java.util.Map;

public class SimpleRegistry<T> {
    private final Map<String, T> registry = new HashMap<>();

    public void register(String id, T obj) {
        if (registry.containsKey(id)) try {
            throw new RuntimeException("Registry already contains key \"" + id + "\"");
        } catch (RuntimeException e) {
            e.printStackTrace();
            return;
        }
        registry.put(id, obj);
    }

    public T get(String id) {
        if (!registry.containsKey(id)) try {
            throw new RuntimeException("Registry does not contain key \"" + id + "\", this will return null!");
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
        return registry.get(id);
    }
}
