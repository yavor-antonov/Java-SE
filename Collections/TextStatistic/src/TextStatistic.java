import javax.net.ssl.ManagerFactoryParameters;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TextStatistic {
    private String text;
    private Map<Character,Integer> statistic;

    public TextStatistic(String text) {
        if (text == null) {
            this.text = ("");
        }else{
            this.text = text.toLowerCase();
        }
        this.statistic = new TreeMap<Character,Integer>();
        makeStatistics();
    }

    private void makeStatistics(){
        for (int i = 0; i < this.text.length(); i++) {
            char letter = this.text.charAt(i);
            if (((letter) >='a') && (letter <= 'z')){
                Integer val = this.statistic.get(letter);
                if (val != null){
                    this.statistic.put(letter,val+1);
                }else{
                    this.statistic.put(letter,1);
                }
            }
        }
        this.statistic = sortByValues(this.statistic);
    }

    private <K extends Comparable<K>,V extends Comparable<V>> Map<K,V> sortByValues(final Map<K,V> map){
        Comparator<K> valueComparator = new Comparator<K>() {

            @Override
            public int compare(K k1, K k2) {
                int compare = map.get(k1).compareTo(map.get(k2));
                if (compare == 0){
                    return  k1.compareTo(k2);
                }else{
                    return -compare;
                }
            }
        };

        Map<K,V> sortedByValues = new TreeMap<K,V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

    public  void printStatistics(){
        for (Map.Entry<Character, Integer> entry : this.statistic.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
