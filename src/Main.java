import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String typeSql = ".sql";
        List<String> titles = getTitles();
        for (String title : titles) {
            if (typeSql.equals(".sql")) {
                String fileName = modifyTitleIntoClassName(title, typeSql);
                generateSqlFile(fileName);
            } else {
                System.out.println(modifyTitleIntoClassName(title, typeSql));
            }
        }
    }

    private static List<String> getTitles() {
        return List.of("1378. Replace Employee ID With The Unique Identifier",
                "1068. Product Sales Analysis I",
                "1581. Customer Who Visited but Did Not Make Any Transactions",
                "197. Rising Temperature",
                "1661. Average Time of Process per Machine",
                "577. Employee Bonus",
                "1280. Students and Examinations",
                "570. Managers with at Least 5 Direct Reports",
                "1934. Confirmation Rate");
    }

    private static String modifyTitleIntoClassName(String title, String type) {
        if (title == null || title.isEmpty()) return "";
        if (type.equals(".sql")) return title.replaceAll("\\s+|\\.\\s", "_") + type;
        return "_" + title.replaceAll("\\s+|\\.\\s", "_") + type;
    }

    private static void generateSqlFile(String fileName) {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("DROP SCHEMA IF EXISTS leetcode CASCADE;\n");
            writer.write("CREATE SCHEMA leetcode;\n");
            writer.write("SET search_path TO leetcode, public;\n");

            writer.flush();
            System.out.println("File created successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + fileName);
            e.printStackTrace();
        }
    }

}