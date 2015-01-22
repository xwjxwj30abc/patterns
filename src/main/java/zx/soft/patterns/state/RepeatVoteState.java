package zx.soft.patterns.state;

public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		System.out.println("please do not repeated vote!");
	}

}
