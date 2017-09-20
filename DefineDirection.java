package CA04;

public class DefineDirection {
	public int outputDirection(Block B[][],int i,int j) {
		int direction=0;
		if(B[i][j].isType()) {
			direction=defineTrue();
		}
		else {
			direction=defineFalse();
		}
		System.out.println(direction);
		return direction;
	}
	public int defineTrue() {
		double rom=Math.random();
		int direction=5;
		if(rom<0.7) {
			direction=6;
		}
		else if(rom>0.7 & rom<0.9) {
			direction=9;
		}
		else if(rom>0.9) {
			direction=3;
		}
		return direction;
	}
	public int defineFalse() {
		double rom=Math.random();
		int direction=5;
		if(rom<0.7) {
			direction=4;
		}
		else if(rom>0.7 & rom<0.9) {
			direction=1;
		}
		else if(rom>0.9) {
			direction=7;
		}
		return direction;
	}
}
