/*
 * Classname
 *
 * Version information
 *
 * Date
 *
 * Copyright notice
 *
 * Modification Logs:
 *      DATE            AUTHOR              DESCRIPTION
 *  -----------------------------------------------------------------------------------------
 *  10-Aug-2003         QuangNTN            Description of modification
 */
public class Main {
    public static void main(String[] args) {
        String title = "177. Nth Highest Salary";
        System.out.println(modifyTitleIntoClassName(title));
    }

    public static String modifyTitleIntoClassName(String title) {
        if (title == null || title.isEmpty()) return "";
        return "_" + title.replaceAll("\\s+|\\.\\s", "_");
    }

}