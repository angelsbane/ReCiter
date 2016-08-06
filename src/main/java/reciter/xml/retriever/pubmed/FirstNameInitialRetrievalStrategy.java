package reciter.xml.retriever.pubmed;

import reciter.model.author.TargetAuthor;

public class FirstNameInitialRetrievalStrategy extends AbstractRetrievalStrategy {

	private int threshold = DEFAULT_THRESHOLD;
	private static final String retrievalStrategyName = "FirstNameInitialRetrievalStrategy";
	
	public FirstNameInitialRetrievalStrategy(boolean isRetrieveExceedThreshold) {
		this.isRetrieveExceedThreshold = isRetrieveExceedThreshold;
	}

	@Override
	public String constructInitialQuery(TargetAuthor targetAuthor) {
		return targetAuthor.getAuthorName().getLastName() + " " + targetAuthor.getAuthorName().getFirstInitial() + "[au]";
	}

	@Override
	protected String constructStrictQuery(TargetAuthor targetAuthor) {
		return targetAuthor.getAuthorName().getLastName() + " " + targetAuthor.getAuthorName().getFirstName() + "[au]";
	}
	
	@Override
	public int getThreshold() {
		return threshold;
	}

	@Override
	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	@Override
	public String getRetrievalStrategyName() {
		return retrievalStrategyName;
	}
}