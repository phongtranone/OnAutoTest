package regression;

import com.google.common.collect.Comparators;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortSample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("2.870.000₫");
        myList.add("1.100.000₫");
        myList.add("870.000₫");
        myList.add("770.000₫");
        myList.add("670.000₫");
        myList.add("570.000₫");

        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = new ArrayList<>();

        for (String s : myList) {
            String priceTxt = s.replaceAll("[^0-9]", "");
            myList1.add(Integer.parseInt(priceTxt));
            myList2.add(Integer.parseInt(priceTxt));
        }
        System.out.println("List 1 debug 1: " + myList1);
        System.out.println("List 2 debug 1: " + myList2);

        //boolean checking = Comparators.isInOrder(myList1, );
        Collections.sort(myList1);
        System.out.println("List 1 debug 2: " + myList1);
        System.out.println("List 2 debug 2: " + myList2);

        //
        System.out.println("Compare 2 list: " + myList1.equals(myList2));



    }
}
