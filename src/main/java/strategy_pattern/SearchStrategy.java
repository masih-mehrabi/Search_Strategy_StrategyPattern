package strategy_pattern;

import java.util.List;

public interface SearchStrategy {
	int performSearch(List<Chapter> book, String name);
	
}