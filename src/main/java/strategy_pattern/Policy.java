package strategy_pattern;

public class Policy {
	
	private Context context;
	public Policy(Context context) {
		this.context = context;
	}
	public void configure() {
		if (context.isChaptersSortedByName()) {
			getContext().setSearchAlgorithm(new BinarySearch());
		} else  {
			getContext().setSearchAlgorithm(new LinearSearch());
		}
	}
	
	public Context getContext() {
		return context;
	}
}
