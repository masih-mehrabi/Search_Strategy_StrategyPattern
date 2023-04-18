package strategy_pattern;
import java.util.List;

public class LinearSearch implements SearchStrategy {
	
	@Override
	public int performSearch(List<Chapter> chapters, String name) {
		for (Chapter chapter : chapters) {
			if (chapter.getName().equals(name)) {
				return chapter.getPageNumber();
			}
			
		}
		return -1;
	}
}
