import java.util.ArrayList;
public class Wirework {
    public static ArrayList<String> weedling(ArrayList<String> strList,
            boolean[] table1, boolean[] table2) {
        ArrayList<String> retList = new ArrayList<String>();
        for (int i = 0; i < strList.size(); i++) {
            if (table1[i] && table2[i]) {
                retList.add(strList.get(i));
            }
        }
        return retList;
    }
}
