package com.example.es.test;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "subway")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SubWay {
    private String id;
    private String station;
    private String excode;
    private String line;
}
