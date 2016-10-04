import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by seregin-av on 03.10.2016.
 */
public class DataProviders {
    @DataProvider (name = "Data for login")
    public static Iterator<Object[]> forLogin() throws Exception {
        List<Object[]> list = new ArrayList<Object[]>();
        list.add(new Object[]{"dealingsibit@gmail.com","sibit12345"});
        return list.iterator();
    }

}
