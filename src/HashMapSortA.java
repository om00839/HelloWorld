

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * HashMapSort
 * 
 * @version 1.0
 * @since 2015.10.3.
 * @author speechless (hellossong@gmail.com)
 */

public class HashMapSortA {
	
	public static <K, V extends Comparable<? super V>> List<K> sortByValue(final Map<K, V> map, final int order) {
		List<K> list = new LinkedList<K>(map.keySet());
		Comparator<K> ValueCompare = new Comparator<K>() {
			public int compare(K k1, K k2) {
				return order * (map.get(k1).compareTo(map.get(k2)));
			}
		};
		Collections.sort(list, ValueCompare);
		return list;
	}
	
	public static <K extends Comparable<? super K>, V> List<K> sortByKey(final Map<K, V> map, final int order) {
		List<K> list = new LinkedList<K>(map.keySet());
		Comparator<K> KeyCompare = new Comparator<K>() {
			public int compare(K k1, K k2) {
				return order * (k1.compareTo(k2));
			}
		};
		Collections.sort(list, KeyCompare);
		return list;
	}
}
