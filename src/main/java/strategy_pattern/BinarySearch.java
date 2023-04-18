package strategy_pattern;

import java.util.List;

public class BinarySearch implements SearchStrategy {
	@Override
	public int performSearch(List<Chapter> chapters, String name) {
		int last = chapters.size() - 1;
		int first = 0;
		int mid;
		int output = -1;
		while (first <= last) {
			mid = first + (last - first) / 2;
			
			if (chapters.get(mid).getName().compareTo(name) == 0) {
				output = chapters.get(mid).getPageNumber();
				break;
			} else {
				if (chapters.get(mid).getName().compareTo(name) < 0) {
					first = mid + 1;
				} else {
					last = mid - 1;
				}
			}
		}
		return output;
	}
}