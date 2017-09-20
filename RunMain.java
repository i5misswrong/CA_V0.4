package CA04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw draw=new Draw();
		Data data=new Data();
		People people=new People();
		Rule rule=new Rule();
		DefineDirection dd=new DefineDirection();
		int m=data.M;
		int n=data.N;
		Block B[][]=new Block[m][n];
		draw.initWallAndPeople(B);
		draw.onColor(B);
		while(true) {
			draw.changeMoveOK(B);
			for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(B[i][j].getLogo()==data.LOGO_PEOPLE) {
						if(B[i][j].isMoveOK()) {
							int direction=dd.outputDirection(B, i, j);
							if(people.isNextCrash(B, i, j, direction)) {
								people.peopleMove(B, i, j, direction);
							}
						}
						
					}
					
				}
			}
			
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			draw.onColor(B);
		}
		
	}

}
