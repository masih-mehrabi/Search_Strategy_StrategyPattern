package strategy_pattern;

import java.util.*;

public class Context {
	
	private SearchStrategy searchAlgorithm;
	private List<Chapter> book;
	
	public List<Chapter> getBook() {
		return this.book;
	}
	public boolean isChaptersSortedByName() {
		boolean output = true;
		for (int i = 0; i < book.size() - 1; i++) {
			if (book.get(i).getName().compareTo(book.get(i + 1).getName()) > 0) {
				output = false;
				break;
			}
		}
		return output;
	}
	public SearchStrategy getSearchAlgorithm() {
		return searchAlgorithm;
	}
	public int search(String name) {
		return searchAlgorithm.performSearch(getBook(), name);
	}
	public void setBook(List<Chapter> book) {
		this.book = book;
	}
	public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
		this.searchAlgorithm = searchAlgorithm;
	}
}