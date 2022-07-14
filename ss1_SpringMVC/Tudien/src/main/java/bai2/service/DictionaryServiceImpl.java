package bai2.service;

import bai2.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements IDictionaryService {

    @Autowired
    IDictionaryRepository tuDienRepository;
    @Override
    public String tuDien(String name) {
       String result =  tuDienRepository.tuDien(name);
        if (result != null) {
            return result;
        } else {
            return "Not found!";
        }
    }
}
