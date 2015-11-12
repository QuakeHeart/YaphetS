package com.jumpshit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.security.auth.x500.X500Principal;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Jump extends JFrame implements MouseListener{
	//取得屏幕的宽和高
     int width = Toolkit.getDefaultToolkit().getScreenSize().width;
     int height = Toolkit.getDefaultToolkit().getScreenSize().height;
     //背景图片
     BufferedImage bgImage = null;
    
     // 保存棋子的坐标
     int x=1000;
     int y=1000;
     int tempX=1000;
     int tempY=1000;
     
     // 保存棋盘,0表示棋盘该点无棋子，1表示三角，2表示圆形
      int[][] allChess = new int[3][3];
     
     // 保存当前下子是三角还是圆形，true是三角，false是圆形
     Boolean isShanjiao = true;
     // 保存游戏信息
     String message = "黑方先行";
     // 保存棋谱
   
    
     //标示当前游戏是否可以继续
     boolean canPlay = true;
    
 	 // 保存最多拥有多少时间(秒)
 	
 	    int maxTime = 0;
 	    // 游戏时间设置的信息
 	    String shanjiaoMessage = "无限制";
 	    String yuanxingMessage = "无限制";
     public Jump(){
    	 //设置标题
    	 this.setTitle("跳茅坑");
    	 //设置窗体大小
    	 this.setSize(1000,600);
    	 //设置窗体出现位置
    	 this.setLocation((width-1000)/2,(height-600)/2);
    	 //设置窗体为大小不可改变
    	 this.setResizable(false);
    	 //将窗体的关闭方式设置为默认关闭后程序结束
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 //为窗体加入监听器
    	 this.addMouseListener(this);
    	 //让窗体显示出来
    	 this.setVisible(true);
         this.repaint();
         this.addMouseListener(this);

     }

     //绘制背景
     public void paint(Graphics J) {
    	 
    	 try {
 			bgImage = ImageIO.read(new File("E:/image/JTS.jpg" ));
 		} catch (IOException e) {
 			// TODO 自动生成的 catch 块
 			e.printStackTrace();
 		}
    	 
    	 J.setColor(Color.WHITE);
         J.drawImage(bgImage, 0,20, this);
         J.setFont(new Font("黑体",Font.BOLD,30));
         J.drawString("游戏信息：",18,80);
         J.setFont(new Font("宋体",0,20));
         J.setColor(Color.RED);
		 J.drawString("无限制",270,545 );
		 J.drawString("无限制",584,545 );
          
		 //提前下好棋子
        /* J.setColor(Color.green);
	     J.fillRect(326, 183, 20, 20);
		 J.fillRect(607, 447, 50, 50);
		 J.setColor(Color.RED);
		 J.fillOval(600, 183, 50, 50);
		 J.fillOval(326, 447, 50, 50);*/
		 //绘制棋子
	     J.setColor(Color.BLACK);
 		 J.fillOval(x, y, 40, 40);	
 		 J.setColor(Color.BLUE);
 		 J.fillRect(tempX,tempY, 40, 40);
	   }
     
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自动生成的方法存根
		
		if (canPlay == true) {
			
			//System.out.println(x=e.getX());System.out.println(y=e.getY());
			 x = e.getX();
			 y = e.getY();
			
					
				}
			
			/*if(x >= 333 && x <= 600 && y >= 161 && y <= 480){
				
				for(int i=1;i<=3;i++){
					for(int j=1;j<=3;j++){
			    if(allChess[i][j]==0){
			      if(allChess[i][j]==1)	{
			    	}  
			      }
			     }
			    }*/
				 
			 this.repaint();
		 
		   	 
		
		//点击开始 按钮
		if(e.getX()>=90&&e.getX()<=187&&e.getY()>=190&&e.getY()<=245){

			int result = JOptionPane.showConfirmDialog(this, "是否重新开始游戏");
		
			if(result==0){
			
				//现在重新开始游戏
				//重新开始所要做的操作：(1)把棋子归位置(2)将游戏信息：的显示改回到开始位置(3)将下一步下棋改为山角
				 for(int q=350;q<=600;q+=150){
						x=q;}
		      }
		   }
	    
		//点击设置 按钮
		if(e.getX()>=88&&e.getX()<=187&&e.getY()>=268&&e.getY()<=313){
			String input = JOptionPane.showInputDialog("请输入游戏的最大时间(单位:分钟，如果输入0，表示没有时间限制：");
           } 
		// 点击 游戏说明 按钮  
		if (e.getX() >= 83 && e.getX() <= 183 && e.getY() >= 353&& e.getY() <= 402) 
		   {
			JOptionPane.showMessageDialog(this,"跳茅坑游戏");
			}
            // 点击 关于 按钮
		 if (e.getX() >= 801 && e.getX() <= 895 && e.getY() >= 354&& e.getY() <= 397) 
		   {
			JOptionPane.showMessageDialog(this,"本游戏由Scq制作，详情请到B115咨询");
			}
  	        // 点击 退出 按钮
	      if (e.getX() >= 796 && e.getX() <= 892 && e.getY() >= 503&& e.getY() <= 551) 
	      {
			 JOptionPane.showMessageDialog(this, "游戏结束");
		      System.exit(0);
		   }
	    }
	 
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根
	
	}
	public static class Run {
	     public static void main(String[] args) {
			Jump jump = new Jump();
			
		}
	}


}
