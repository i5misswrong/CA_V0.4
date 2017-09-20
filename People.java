package CA04;

public class People {
	Data data=new Data();
	Rule rule=new Rule();
	public boolean isNextCrash(Block B[][],int i,int j,int direction) {
		boolean flag=false;
		switch (direction) {
		case 1:
			if(B[i-1][j-1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i-1][j-1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 2:
			if(B[i-1][j].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i-1][j].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 3:
			if(B[i-1][j+1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i-1][j+1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 4:
			if(B[i][j-1].getLogo()==data.LOGO_NULL) {
				flag=true;
			}
			if(B[i][j-1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 6:
			if(B[i][j+1].getLogo()==data.LOGO_NULL) {
				flag=true;
			}
			if(B[i][j+1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 7:
			if(B[i+1][j-1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i+1][j-1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 8:
			if(B[i+1][j].getLogo()==data.LOGO_NULL) {
				flag=true;
			}
			if(B[i+1][j].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		case 9:
			if(B[i+1][j+1].getLogo()==data.LOGO_NULL ) {
				flag=true;
			}
			if(B[i+1][j+1].getLogo()==data.LOGO_EXIT) {
				rule.getExit(B, i, j);
			}
			break;
		default:
			break;
		}
		return flag;
	}
	public void peopleMove(Block B[][],int i,int j,int direction) {
		switch (direction) {
		case 1:
			B[i][j].setMoveOK(false);
			B[i-1][j-1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 2:
			B[i][j].setMoveOK(false);
			B[i-1][j]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 3:
			B[i][j].setMoveOK(false);
			B[i-1][j+1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 4:
			B[i][j].setMoveOK(false);
			B[i][j-1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 6:
			B[i][j].setMoveOK(false);
			B[i][j+1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 7:
			B[i][j].setMoveOK(false);
			B[i+1][j-1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 8:
			B[i][j].setMoveOK(false);
			B[i+1][j]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		case 9:
			B[i][j].setMoveOK(false);
			B[i+1][j+1]=B[i][j];
			B[i][j]=new Block(data.LOGO_NULL);
			break;
		default:
			break;
		}
	}
}
