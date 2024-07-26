package com.example.demo.g_ioc.gc_mutability.gcb_immutable.gcbb_stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/mutable-stream")
@Service
public class GCBBC_Service {

    // 4. Instance the repository
    @Autowired
    GCBBD_Repository repository;

    // 5. Return the repository.findAll() method
    public List<GCBBA_Model> findAll() {

        // 6. New list to retrieve
        List<GCBBA_Model> newList = new ArrayList<>();

        // 7. Copy the original list to the new list
        repository.findAll().stream().forEach(p -> {

            GCBBA_Model newModel = new GCBBA_Model();

            // Name
            String newName = p.getName();
            newModel.setName(newName);

            // Price
            double newPrice = p.getPrice() * 2;
            newModel.setPrice(newPrice);

            newList.add(newModel);

        });

        // 8. Return the new list
        return newList;

    }

}
