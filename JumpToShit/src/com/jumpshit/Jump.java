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
	//ȡ����Ļ�Ŀ�͸�
     int width = Toolkit.getDefaultToolkit().getScreenSize().width;
     int height = Toolkit.getDefaultToolkit().getScreenSize().height;
     //����ͼƬ
     BufferedImage bgImage = null;
    
     // �������ӵ�����
     int x=1000;
     int y=1000;
     int tempX=1000;
     int tempY=1000;
     
     // ��������,0��ʾ���̸õ������ӣ�1��ʾ���ǣ�2��ʾԲ��
      int[][] allChess = new int[3][3];
     
     // ���浱ǰ���������ǻ���Բ�Σ�true�����ǣ�false��Բ��
     Boolean isShanjiao = true;
     // ������Ϸ��Ϣ
     String message = "�ڷ�����";
     // ��������
   
    
     //��ʾ��ǰ��Ϸ�Ƿ���Լ���
     boolean canPlay = true;
    
 	 // �������ӵ�ж���ʱ��(��)
 	
 	    int maxTime = 0;
 	    // ��Ϸʱ�����õ���Ϣ
 	    String shanjiaoMessage = "������";
 	    String yuanxingMessage = "������";
     public Jump(){
    	 //���ñ���
    	 this.setTitle("��é��");
    	 //���ô����С
    	 this.setSize(1000,600);
    	 //���ô������λ��
    	 this.setLocation((width-1000)/2,(height-600)/2);
    	 //���ô���Ϊ��С���ɸı�
    	 this.setResizable(false);
    	 //������Ĺرշ�ʽ����ΪĬ�Ϲرպ�������
    	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 //Ϊ������������
    	 this.addMouseListener(this);
    	 //�ô�����ʾ����
    	 this.setVisible(true);
         this.repaint();
         this.addMouseListener(this);

     }

     //���Ʊ���
     public void paint(Graphics J) {
    	 
    	 try {
 			bgImage = ImageIO.read(new File("E:/image/JTS.jpg" ));
 		} catch (IOException e) {
 			// TODO �Զ����ɵ� catch ��
 			e.printStackTrace();
 		}
    	 
    	 J.setColor(Color.WHITE);
         J.drawImage(bgImage, 0,20, this);
         J.setFont(new Font("����",Font.BOLD,30));
         J.drawString("��Ϸ��Ϣ��",18,80);
         J.setFont(new Font("����",0,20));
         J.setColor(Color.RED);
		 J.drawString("������",270,545 );
		 J.drawString("������",584,545 );
          
		 //��ǰ�º�����
        /* J.setColor(Color.green);
	     J.fillRect(326, 183, 20, 20);
		 J.fillRect(607, 447, 50, 50);
		 J.setColor(Color.RED);
		 J.fillOval(600, 183, 50, 50);
		 J.fillOval(326, 447, 50, 50);*/
		 //��������
	     J.setColor(Color.BLACK);
 		 J.fillOval(x, y, 40, 40);	
 		 J.setColor(Color.BLUE);
 		 J.fillRect(tempX,tempY, 40, 40);
	   }
     
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO �Զ����ɵķ������
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
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
		 
		   	 
		
		//�����ʼ ��ť
		if(e.getX()>=90&&e.getX()<=187&&e.getY()>=190&&e.getY()<=245){

			int result = JOptionPane.showConfirmDialog(this, "�Ƿ����¿�ʼ��Ϸ");
		
			if(result==0){
			
				//�������¿�ʼ��Ϸ
				//���¿�ʼ��Ҫ���Ĳ�����(1)�����ӹ�λ��(2)����Ϸ��Ϣ������ʾ�Ļص���ʼλ��(3)����һ�������Ϊɽ��
				 for(int q=350;q<=600;q+=150){
						x=q;}
		      }
		   }
	    
		//������� ��ť
		if(e.getX()>=88&&e.getX()<=187&&e.getY()>=268&&e.getY()<=313){
			String input = JOptionPane.showInputDialog("��������Ϸ�����ʱ��(��λ:���ӣ��������0����ʾû��ʱ�����ƣ�");
           } 
		// ��� ��Ϸ˵�� ��ť  
		if (e.getX() >= 83 && e.getX() <= 183 && e.getY() >= 353&& e.getY() <= 402) 
		   {
			JOptionPane.showMessageDialog(this,"��é����Ϸ");
			}
            // ��� ���� ��ť
		 if (e.getX() >= 801 && e.getX() <= 895 && e.getY() >= 354&& e.getY() <= 397) 
		   {
			JOptionPane.showMessageDialog(this,"����Ϸ��Scq�����������뵽B115��ѯ");
			}
  	        // ��� �˳� ��ť
	      if (e.getX() >= 796 && e.getX() <= 892 && e.getY() >= 503&& e.getY() <= 551) 
	      {
			 JOptionPane.showMessageDialog(this, "��Ϸ����");
		      System.exit(0);
		   }
	    }
	 
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
	
	}
	public static class Run {
	     public static void main(String[] args) {
			Jump jump = new Jump();
			
		}
	}


}
