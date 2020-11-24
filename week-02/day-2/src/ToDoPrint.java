//public class TodoPrint {
//    public static void main(String... args){
//        String todoText = " - Buy milk\n";
//        // Add "My todo:" to the beginning of the todoText
//        // Add " - Download games" to the end of the todoText
//        // Add " - Diablo" to the end of the todoText but with indention
//
//        // Expected output:
//
//        // My todo:
//        //  - Buy milk
//        //  - Download games
//        //      - Diablo
//
//        System.out.println(todoText);
//    }
//}

public class ToDoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        String beginning = "My todo:";
        String ending = " - Download games";
        String ending2 = "- Diablo";
        beginning = beginning.concat("\n");
        String tab = "\t";
        String enter = "\n";

        todoText = beginning + todoText + ending + enter + tab + ending2;

        System.out.println(todoText);
    }
}
