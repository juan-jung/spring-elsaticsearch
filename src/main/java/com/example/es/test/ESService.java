package com.example.es.test;

import lombok.RequiredArgsConstructor;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.builder.SearchSourceBuilderException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ESService {

    private final RestHighLevelClient client;

    public SearchHits test(String station) throws Exception{
        SearchSourceBuilder ssb = new SearchSourceBuilder()
                .query(QueryBuilders.boolQuery()
                        .should(QueryBuilders.termQuery("engtokor",station)));
        return client.search(new SearchRequest("subway").source(ssb), RequestOptions.DEFAULT).getHits();
    }

}
