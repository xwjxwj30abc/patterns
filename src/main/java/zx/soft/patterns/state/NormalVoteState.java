package zx.soft.patterns.state;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("thanks for voting");
	}

}
