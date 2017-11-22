package a_b_listyIterator;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class CommandExecutor {
    private ListyIterator collection;

    CommandExecutor() {
        this.collection = new ListyIterator();
    }

    void executeHasNextCommand() {
        System.out.println(this.collection.hasNext());
    }

    void executePrintCommand() {
        try {
            collection.print();
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Invalid Operation!");
        }
    }

    void executeMoveCommand() {
        System.out.println(collection.move());
    }

    void executeCreateCommand(String[] strings) {
        collection.create(strings);
    }

    void executePrintAllCommand() {
        try {
            StringBuilder result = new StringBuilder();
            this.collection.forEach(x -> result.append(x).append(" "));
            System.out.println(result.toString().trim());
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Invalid Operation!");
        }
    }
}
