import java.util.ArrayList;
import java.util.List;

import sort.InsertionSort;
import sort.QuickSort;
import sort.Sort;
import sort.SortableArray;
import sort.SortableData;
import sort.SortableList;

public class TestSort {

	public static <T extends Comparable<? super T>> void sortAndPrint(
			SortableData<T> sd, Sort sort) {
		sort.doSort(sd);
		for (int i = 0; i < sd.size(); ++i) {
			System.out.print(sd.get(i) + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] args2 = new String[args.length];
		System.arraycopy(args, 0, args2, 0, args.length);
		Sort isort = new InsertionSort();
		Sort qsort = new QuickSort();
		
		sortAndPrint(new SortableArray<String>(args2), isort);
		System.arraycopy(args, 0, args2, 0, args.length);
		sortAndPrint(new SortableArray<String>(args2), qsort);
		List<String> ls = new ArrayList<String>();
		for (String s : args) {
			ls.add(s);
		}
		sortAndPrint(new SortableList<String>(ls), isort);
		ls.clear();
		for (String s : args) {
			ls.add(s);
		}
		sortAndPrint(new SortableList<String>(ls), qsort);
	}

}
