public class TodoPrint {
    public static void main(String[] args) {


        String todoText = " - Buy milk\n";

        StringBuilder addingTodo = new StringBuilder ();

        addingTodo.append(" - Buy milk\n").append(" - Download games\n").append(" \t - Diablo");

        System.out.println(addingTodo);
    }
}




/* Add "My todo:" to the beginning of the todoText
Add " - Download games" to the end of the todoText
Add " - Diablo" to the end of the todoText but with indention

Expected outpt:

My todo:
- Buy milk
- Download games
     - Diablo */
