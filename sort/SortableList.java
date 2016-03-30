package sort;

import java.util.List;

public class SortableList<T extends Comparable<? super T>> extends
		SortableComparableData<T> {

	List<T> list;

	public SortableList(List<T> list) {
		this.list = list;
	}

	public int size() {
		return list.size();
	}

	public void swap(int i, int j) {
		T tmp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, tmp);
	}

	public T get(int i) {
		return list.get(i);
	}
}