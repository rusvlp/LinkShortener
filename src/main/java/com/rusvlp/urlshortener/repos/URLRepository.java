package com.rusvlp.urlshortener.repos;

import com.rusvlp.urlshortener.model.URL;

import java.util.HashMap;
import java.util.Map;

public class URLRepository {
    private static Map<String, URL> map = new HashMap<>();


    public static URL getURL(String shorten){
        if (map.containsKey(shorten))
            return map.get(shorten);
        else return null;
    }

    public static String putURL(URL u){
        String key = u.compress();
        if (!map.containsKey(key))
            map.put(key, u);

        return key;
    }
}
