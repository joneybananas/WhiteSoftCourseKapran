import Models.Employee;
import Utils.MyFileUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyFileUtil myFileUtil = new MyFileUtil("./src/file.json");

        myFileUtil.printList(false);


    }
}