package com.ruslooob.utils;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayUtils {
    public static <T> boolean isContainsUniqValues(T[] arr) {
        Set<T> values = new HashSet<>();
        Collections.addAll(values, arr);
        return values.size() == arr.length;
    }
}
