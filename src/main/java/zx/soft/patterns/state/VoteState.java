package zx.soft.patterns.state;

public interface VoteState {

	//在具体的状态处理类中通常需要获取上下文自身的数据，甚至在必要的时候会回调上下文的方法，
	//因此，通常将上下文自身当作一个参数传递给具体的状态处理类
	public void vote(String user, String voteItem, VoteManager voteManager);

}
