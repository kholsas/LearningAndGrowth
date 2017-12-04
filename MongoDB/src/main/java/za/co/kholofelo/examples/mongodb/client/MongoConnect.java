package za.co.kholofelo.examples.mongodb.client;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 * @author Kholofelo Maloma
 * @since 2017/12/04.
 */
public class MongoConnect {

    public static void main(String[] args) {
        MongoClientFactory mongoClientFactory = MongoClient::new;
        MongoClient mongoClient = mongoClientFactory.getMongoClient("localhost", 27017);

        MongoCredential credential;
        credential = MongoCredential.createCredential("sampleUser", "myDb",
                "password".toCharArray());

        MongoDatabase database = mongoClient.getDatabase("myDb");
        System.out.println("Credentials ::" + credential);
//        database.createCollection("People");
        MongoCollection<Document> collection = database.getCollection("myCollection");
        System.out.println("Collection retrieved! NameSpace : " + collection.getNamespace());

         collection.insertOne(new Document("firstName", "Kholofelo")
                .append("lastName", "Maloma")
                .append("age", 3));

        collection.find().iterator().forEachRemaining(System.out::println);
    }
}
