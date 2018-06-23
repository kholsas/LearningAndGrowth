package za.co.files.kholofelo.replace;


import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReplaceLineInFile {


  private static Path FILE_PATH = Paths.get("/home/kholofelo/logistics/20159595901/training.csv");

  public static void main(String... args) throws IOException {

    List<String> fileContent = new ArrayList<>(
        Files.readAllLines(FILE_PATH, StandardCharsets.UTF_8));

    for (int i = 0; i < fileContent.size(); i++) {
      System.out.println(fileContent.get(i));
      if (fileContent.get(i).startsWith("1832")) {
        fileContent.set(i, "1832,Sales,19,Yes,Travel_Often,Sales,1,2,Life Sciences,1,2,Female,3,2,Sales Executive,4,Married,25993,8,Yes,11,3,1,0,8,0,1,6,4,0,5");
        break;
      }
    }

    Files.write(FILE_PATH, fileContent, StandardCharsets.UTF_8);
  }

}
