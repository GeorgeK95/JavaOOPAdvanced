package c_stack;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
class CommandExecutor {
    private CustomStack stack;

    CommandExecutor() {
        this.stack = new CustomStack();
    }

    void pop() {
        try {
            this.stack.pop();
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("No elements");
        }
    }

    void print() {
        for (int i = 0; i < 2; i++) {
            stack.forEach(System.out::println);
        }
    }

    void push(String command) {
        String[] data = command.split("\\s+");
        for (int i = 1; i < data.length; i++) {
            stack.push(Integer.valueOf(data[i].replace(",", "")));
        }
    }
}
