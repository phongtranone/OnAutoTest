package dataproviders;

import com.opencsv.bean.CsvToBeanBuilder;
import core.model.ProDataInputObj;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ProDataProvider {
    @DataProvider(name = "pro_data_provider", parallel = true)
    public Object[][] dataProvider1() {
        String path = System.getProperty("user.dir") + "\\TestData\\Pro_Data_Input.csv";
        try {
            List<ProDataInputObj> proDataInputObjList = new CsvToBeanBuilder(new FileReader(path))
                    .withType(ProDataInputObj.class)
                    .build()
                    .parse();

            //Ignore first row of CSV data input because it is the header
            Object [][] dataTest = new Object[proDataInputObjList.size() - 1][];
            int count = 0;

            //Ignore first row of CSV data input because it is the header
            for (int index = 1; index < proDataInputObjList.size(); index++) {
                dataTest[count] = new Object[]{proDataInputObjList.get(index)};
                count++;
            }
            return dataTest;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
