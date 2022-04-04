package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();

        arr1.add("Scrum");
        arr1.add("Java");
        arr1.add("Jira");
        arr1.add("Selenium");
        arr1.add("Cucumber");
        arr1.add("Postman");
        arr1.add("Rest Assured");

        for (String listname : arr1) {
            System.out.println(arr1);
        }

    }
}
