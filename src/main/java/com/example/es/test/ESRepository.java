package com.example.es.test;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ESRepository extends ElasticsearchRepository<SubWay, String> {
    List<SubWay> findByStation(String station);
}
