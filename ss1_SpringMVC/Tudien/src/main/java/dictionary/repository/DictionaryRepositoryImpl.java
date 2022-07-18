package dictionary.repository;


import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DictionaryRepositoryImpl implements IDictionaryRepository {

    private static Map<String, String> dictionaryMap;

    static {
        dictionaryMap = new HashMap<>();
        dictionaryMap.put("hello", "Xin chào");
        dictionaryMap.put("how", "Thế nào");
        dictionaryMap.put("book", "Quyển vở");
        dictionaryMap.put("computer", "Máy tính");
    }

    @Override
    public String dictionary(String name) {
        return dictionaryMap.get(name);
    }
}
