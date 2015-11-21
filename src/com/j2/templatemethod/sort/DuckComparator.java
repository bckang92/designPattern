package com.j2.templatemethod.sort;

import java.util.Comparator;

public class DuckComparator implements Comparator<Duck> {

	public int compare(Duck o1, Duck o2) {
		return o1.name.compareTo(o2.name);
	}

}
