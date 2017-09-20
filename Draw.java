package CA04;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.*;

public class Draw {
	Data data=new Data();
	int m=data.M;
	int n=data.N;
	JFrame jf;
	JPanel[][] jp;
	
	public Draw() {
		jf=new JFrame("CA");
		jp=new JPanel[m][n];
		jf.setLayout(new GridLayout(m,n,3,3));
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				jp[i][j]=new JPanel();
				jp[i][j].setBackground(Color.gray);
				jf.add(jp[i][j]);
			}
		}
		jf.setTitle("CA_V0.4");
		jf.setVisible(true);
		
		jf.setSize(n*20,m*20);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void onColor(Block B[][]) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				int logo=B[i][j].getLogo();
				switch (logo) {
				case 1:
					if(B[i][j].isType()) {
						jp[i][j].setBackground(Color.BLUE);
					}
					else {
						jp[i][j].setBackground(Color.RED);
					}
					break;
				case 0:
					jp[i][j].setBackground(Color.WHITE);
					break;
				case 10:
					jp[i][j].setBackground(Color.BLACK);
					break;
				case 100:
					jp[i][j].setBackground(Color.GREEN);
					break;
				default:
					jp[i][j].setBackground(Color.GRAY);
					break;
				}
			}
		}
	}
	public void initWallAndPeople(Block B[][]) {
		for (int i = 0; i < m; i++) {//初始化矩阵
			for (int j = 0; j < n; j++) {
				B[i][j]=new Block(data.LOGO_NULL);
			}
		}
		for(int i=0;i<m;i++) {//设置出口 左右两边
			for(int j=0;j<n;j++) {
				B[i][0]=new Block(data.LOGO_EXIT);
				B[i][n-1]=new Block(data.LOGO_EXIT);
			}
		}
		for(int i = 0;i<m;i++) {  //设置墙壁 上下
			for (int j=0;j<n;j++) {
				B[0][j]=new Block(data.LOGO_WALL);
				B[m-1][j]=new Block(data.LOGO_WALL);
			}
		}
		ArrayList<int []> Arr=new ArrayList<>(); //存放所有空位的Arraylist 里面存放的是数组
												//A[0]代表i m A[1]代表j n
		for (int i=1;i<m-1;i++) {  //将中间区域存放到Arr
			for (int j=1;j<n-1;j++) {
				int A[]=new int[2];
				A[0]=i;
				A[1]=j;
				Arr.add(A);
				Collections.shuffle(Arr);//随机排序
			}
		}
		for(int i=0;i<data.PEOPLE_NUMBER;i++) { //创建行人
			int people_site[]=Arr.get(i);//获得位置
			if(B[people_site[0]][people_site[1]].getLogo()==data.LOGO_NULL) {//如果该点为空
				B[people_site[0]][people_site[1]]=new Block(data.LOGO_PEOPLE);//在该店创建行人
				if(people_site[0]<m/2) {//如果位于上半部分
					B[people_site[0]][people_site[1]].setType(false);//设置行人属性为false
				}
				else {
					B[people_site[0]][people_site[1]].setType(true);
				}
			}
			
		}
	}
	public void changeMoveOK(Block B[][]) {
		for(int i=0;i<data.M;i++) {
			for(int j=0;j<data.N;j++) {
				if(B[i][j].getLogo()==data.LOGO_PEOPLE) {
					B[i][j].setMoveOK(true);
				}
			}
		}
	}
}
