package CA04;

public class Rule {
	Data data=new Data();
	public void getExit(Block B[][],int i,int j) {
		B[i][j]=new Block(data.LOGO_NULL);
	}
}
