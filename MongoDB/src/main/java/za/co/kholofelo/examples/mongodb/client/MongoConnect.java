package za.co.kholofelo.examples.mongodb.client;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.Random;
import java.util.function.Supplier;

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


        MongoCollection<Document> collection = database.getCollection("myCollection");
        System.out.println("Collection retrieved! NameSpace : " + collection.getNamespace());

        Supplier<Random> randomSupplier = Random::new;

        Random random = randomSupplier.get();

        collection.insertOne(new Document("firstName", "Kholofelo")
                .append("id", random.nextInt(630))
                .append("lastName", "Maloma")
                .append("age", random.nextInt(50)));

        System.out.println("End of Insertion");
        collection.find().iterator().forEachRemaining(System.out::println);
        System.out.println("Now updating all records with age less than 40");
        collection.updateMany(Filters.lt("age", 40), Updates.set("age", 46));
        System.out.println("Done updating. Everyone should be older than 40 at this point. Midlife crisis are at the door!");
        collection.find().iterator().forEachRemaining(System.out::println);

        System.out.println(System.lineSeparator());
        System.out.println("Now let us delete everyone with id bigger than 100");
        collection.deleteMany(Filters.gt("id", 100));
        System.out.println("\nDone deleting. Let us see what just happened\n\n");
        collection.find().iterator().forEachRemaining(System.out::println);

        System.out.println("\nOkay! Okay! Now we gotta slow down a bit there! This collection is a little dirty and useless at this point! Let us delete/drop it... ");
        collection.drop();
        System.out.println("Collection dropped! To prove this, we will try to print out its documents\n" );

        collection.find().iterator().forEachRemaining(System.out::println);
        System.out.println("See, told'ya! No items found!");


    }
}
