package j_CollectionHierarchy;

import j_CollectionHierarchy.interfaces.IAddable;
import j_CollectionHierarchy.interfaces.IRemovable;
import j_CollectionHierarchy.models.AddCollection;
import j_CollectionHierarchy.models.AddRemoveCollection;
import j_CollectionHierarchy.models.MyList;

import java.util.Scanner;

/**
 * Created by George-Lenovo on 6/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strings = in.nextLine().split("\\s+");
        int count = Integer.parseInt(in.nextLine());

        IAddable<String> addCollection = new AddCollection<>();
        IRemovable<String> addRemoveCollection = new AddRemoveCollection<>();
        IRemovable<String> myList = new MyList<>();

        executeAdd(addCollection, strings);
        executeAdd(addRemoveCollection, strings);
        executeAdd(myList, strings);

        executeRemove(addRemoveCollection, count);
        executeRemove(myList, count);
    }

    private static void executeRemove(IRemovable<String> collection, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();
    }

    private static void executeAdd(IAddable<String> collection, String[] strings) {
        for (String string : strings) {
            System.out.print(collection.add(string) + " ");
        }
        System.out.println();
    }
}
