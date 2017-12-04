package za.co.kholofelo.examples.mongodb.client;

import com.mongodb.MongoClient;

/**
 * @author Kholofelo Maloma
 * @since 2017/12/04.
 */
@FunctionalInterface
public interface MongoClientFactory {

    MongoClient getMongoClient(String host, int port);
}
