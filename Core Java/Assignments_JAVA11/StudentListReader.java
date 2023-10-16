import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class StudentListReader {
    public static void main(String[] args) {
        try {
           
            List<String> lines = Files.lines(Paths.get("Students.txt"))
                    .collect(Collectors.toList());

            int studentCount = 0;


            for (String line : lines) {
               
                String trimmedLine = line.trim();

                
                if (!trimmedLine.isEmpty()) {
                    System.out.println(trimmedLine);
                    studentCount++;
                }
            }

           
            System.out.println("Total number of students: " + studentCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

