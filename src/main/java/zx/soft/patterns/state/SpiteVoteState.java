package zx.soft.patterns.state;

public class SpiteVoteState implements VoteState {

	@Override
	public void vote(String user, String voteItem, VoteManager voteManager) {

		String s = voteManager.getMapVote().get(user);
		if (s != null) {
			voteManager.getMapVote().remove(user);
		}
		System.out.println("取消刷票资格");
	}

}
