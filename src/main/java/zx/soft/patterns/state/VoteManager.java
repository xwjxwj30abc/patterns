package zx.soft.patterns.state;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {

	private VoteState state = null;
	//<user,voteItem>
	private Map<String, String> mapVote = new HashMap<>();
	//<user,count>
	private Map<String, Integer> mapVoteCount = new HashMap<>();

	public Map<String, String> getMapVote() {
		return mapVote;
	}

	public void vote(String user, String voteItem) {
		Integer oldVoteCount = mapVoteCount.get(user);
		if (oldVoteCount == null) {
			oldVoteCount = 0;
		}
		oldVoteCount = oldVoteCount + 1;
		mapVoteCount.put(user, oldVoteCount);
		if (oldVoteCount == 1) {
			state = new NormalVoteState();
		} else if (oldVoteCount > 1 && oldVoteCount < 5) {
			state = new RepeatVoteState();
		} else if (oldVoteCount >= 5 && oldVoteCount < 8) {
			state = new SpiteVoteState();
		} else if (oldVoteCount >= 8) {
			state = new BlackVoteState();
		}
		state.vote(user, voteItem, this);
	}

}
