package CA04;

public class Block {
	int uid;
	int x;
	int y;
	int logo;
	int direction;
	boolean type=false;
	boolean moveOK=false;
	public Block(int logo) {
		this.logo=logo;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getLogo() {
		return logo;
	}
	public void setLogo(int logo) {
		this.logo = logo;
	}
	public int getDirection() {
		return direction;
	}
	public void setDirection(int direction) {
		this.direction = direction;
	}
	public boolean isType() {
		return type;
	}
	public void setType(boolean type) {
		this.type = type;
	}
	public boolean isMoveOK() {
		return moveOK;
	}
	public void setMoveOK(boolean moveOK) {
		this.moveOK = moveOK;
	}
	
}
