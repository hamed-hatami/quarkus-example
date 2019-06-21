package ir.hatami.quarkus.example.api.control.gateway;

import org.elasticsearch.client.RestHighLevelClient;

public interface ElasticSearchConnection {

    RestHighLevelClient getClient();

    void checkConnection(RestHighLevelClient client);

    String getIndexName();

    String getHttpHostURI();
}
