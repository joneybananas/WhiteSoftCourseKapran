package Utils;

import Models.Employee;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;

public class MyFileUtil {


    private String path;

    private List<Employee> employeesList;


    public MyFileUtil(String path) {
        this.path = path;
        Gson gson = new Gson();
        try {
            employeesList = gson.fromJson(new FileReader(path), new TypeToken<List<Employee>>() {
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void printList(Boolean asc) {

        Comparator<Employee> lastThenFirst = Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName);

        List<Employee> bufferList = employeesList.stream().sorted(lastThenFirst).collect(Collectors.toList());

        if (!asc) Collections.reverse(bufferList);

        bufferList.forEach(System.out::println);

    }


}
