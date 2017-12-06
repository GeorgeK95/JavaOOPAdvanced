import P01_ExtendedArrayList.ExtendedArrayList;
import P02_FileStream.BaseFile;
import P02_FileStream.File;
import P02_FileStream.Music;
import P02_FileStream.StreamProgressInfo;
import P03_GraphicEditor.Circle;
import P03_GraphicEditor.Rectangle;
import P03_GraphicEditor.Shape;
import P04_DetailPrinter.Employee;
import P04_DetailPrinter.Manager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//       task_1();
//        task_2();
//        task_3();
//        task_4();
    }

    private static void task_4() {
        Employee empl = new Employee("Ivan");
        empl.print();
        Employee mng = new Manager("Pesho", new ArrayList<String>() {{
            add("some Doc");
        }});
        mng.print();
    }

    private static void task_3() {
        Shape sh = new Shape();
        sh.draw();
        sh = new Rectangle();
        sh.draw();
        sh = new Circle();
        sh.draw();
    }

    private static void task_2() {
        BaseFile music = new Music(5, 2);
        BaseFile file = new File(50, 30);
        StreamProgressInfo spi = new StreamProgressInfo(music);
        System.out.println(spi.calculateCurrentPercent());
        spi = new StreamProgressInfo(file);
        System.out.println(spi.calculateCurrentPercent());
    }

    private static void task_1() {
        ExtendedArrayList<Integer> eal = new ExtendedArrayList<Integer>();
        eal.add(5);
        eal.add(-5);
        eal.add(10);
        eal.add(5220);
        eal.add(-5001);
        System.out.println("Max: " + eal.max());
        System.out.println("Min: " + eal.min());
    }
}
