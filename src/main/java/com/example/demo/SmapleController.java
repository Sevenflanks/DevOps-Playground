package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class SmapleController {

    @Autowired
    private SampleDataDao sampleDataDao;

    @PostConstruct
    public void init() {
        sampleDataDao.save(new SampleData(null, "AAA"));
        sampleDataDao.save(new SampleData(null, "BBB"));
        sampleDataDao.save(new SampleData(null, "CCC"));
        sampleDataDao.save(new SampleData(null, "DDD"));
        sampleDataDao.save(new SampleData(null, "EEE"));
        sampleDataDao.save(new SampleData(null, "FFF"));
    }

    @GetMapping
    public Page<SampleData> query(Pageable pageable) {
        return sampleDataDao.findAll(pageable);
    }

}
