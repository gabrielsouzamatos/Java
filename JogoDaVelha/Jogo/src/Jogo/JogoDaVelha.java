package Jogo;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JogoDaVelha extends JPanel implements MouseListener {
	
	Font fonte = new Font("Consolas", Font.BOLD, 60);
	Font fonteMed = new Font("Consolas", Font.BOLD, 30);
	Font fontePeq = new Font("Consolas", Font.BOLD, 15);
	
	int matriz[][];
	int jogador;
	int ganhador;
	boolean jogarNov;
	
	int v1;
	int v2;
	int v3;
	
	public JogoDaVelha(){
		
		matriz = new int [3][3];
		jogador = 1;
		ganhador = 0;
		jogarNov = false;
		
		
		for(int lin = 0; lin < 3; lin++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(matriz[lin][col]);
			}
			System.out.println();
		}
		
		
	}
	
	@Override
	public void paintComponent(Graphics g2) {
		
		Graphics2D g = (Graphics2D) g2.create();
		
		System.out.println();
		for(int lin = 0; lin < 3; lin++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(matriz[lin][col]);
			}
			System.out.println();
		}
		
		if(jogarNov) {
			int jogarNovamente = JOptionPane.showConfirmDialog(this, "Jogar de novo?");
			
			if(jogarNovamente == JOptionPane.OK_OPTION ) {
				jogarNov = false;
				reiniciarJogo();
			}else {
				System.exit(1);
			}
		}
		g.setStroke(new BasicStroke(4));
		g.setFont(fonte);
		
		g.setColor(Color.white);
		g.fillRect(0, 0, 600, 600);
		
		g.setColor(Color.black);
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);
		
		g.drawLine(200, 0, 200, 600);
		g.drawLine(400, 0, 400, 600);
		
		for(int lin = 0; lin < 3; lin++) {
			for(int col = 0; col < 3; col++) {
				if(matriz[lin][col] == 1) {
					g.setColor(Color.blue);
					g.drawString("o", 75 + col * 200, 125 + lin * 200);
				}else if(matriz[lin][col] == 2) {
					g.setColor(Color.red);
					g.drawString("x", 75 + col * 200, 125 + lin * 200);
				}
			}
		}
		
		if(ganhador != 0) {
			
			if(ganhador == 3) {
				g.setFont(fonteMed);
				g.setColor(Color.black);
				g.drawString("O jogo empatou", 180, 180);
			}else {
			
				if(ganhador == 1) {
					g.setColor(Color.blue);
				}else if(jogador == 2){
					g.setColor(Color.red);
				}
				
				g.setFont(fonteMed);
				g.drawString("O jogador " +  ganhador + " venceu" , 150, 200);
			}
			
			jogarNov = true;
			repaint();
		}
		
		g.setFont(fontePeq);
		g.setColor(Color.blue);
		g.drawString("Vitorias: " + v1, 60, 20);
		
		g.setFont(fontePeq);
		g.setColor(Color.red);
		g.drawString("Vitorias: " + v2, 460, 20);
		
		g.setFont(fontePeq);
		g.setColor(Color.black);
		g.drawString("Empates: " + v3, 260, 20);
	}
		

	@Override
	public void mouseClicked(MouseEvent e) {
		int lin = e.getY()/200;
		int col = e.getX()/200;
		if(lin == 3) {
			lin = 2;
		}else if(col == 3) {
			col = 2;
		}
		System.out.println("Linha"+lin);
		System.out.println("coluna"+col);
		
		if(jogador == 1 && matriz[lin][col] == 0) {
			matriz[lin][col] = 1;
			jogador = 2;
		}else if(jogador == 2 && matriz[lin][col] == 0) {
			matriz[lin][col] = 2;
			jogador = 1;
		}
		verificaGanhador();
		
		repaint();
		
	}
	
	private void verificaGanhador() {
		
		for(int lin = 0; lin < 3; lin++) {
			 if(matriz[lin][0] == matriz[lin][1] && matriz[lin][0] == matriz[lin][2] && matriz[lin][0] != 0) {
				 System.out.println("Ganhou");
				 ganhador = matriz[lin][0];
				 break;
			 }
		}
		
		for(int col = 0; col < 3; col++) {
			 if(matriz[0][col] == matriz[1][col] && matriz[0][col] == matriz[2][col] && matriz[0][col] != 0) {
				 System.out.println("Ganhou");
				 ganhador = matriz[0][col];
				 break;
			 }
		}
		if(matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != 0) {
			System.out.println("Ganhou");
			 ganhador = matriz[0][0];
		}
		if(matriz[0][2] == matriz[1][1] && matriz[0][2] == matriz[2][0] && matriz[0][2] != 0) {
			System.out.println("Ganhou");
			 ganhador = matriz[0][0];
		}
		
		if (ganhador == 1) {
			v1++;
		}else if(ganhador == 2){
			v2++;
		}else {
			boolean cheia = true;
			
			for(int lin = 0; lin < 3; lin++) {
				for(int col = 0; col < 3; col++) {
					if(matriz[lin][col] == 0) {
						cheia = false;
					}
				}
			}
			
			if(cheia) {
				ganhador = 3;
				v3++;
			}
		}
	}
	
	private void reiniciarJogo() {
		for(int lin = 0; lin < 3; lin++) {
			for(int col = 0; col < 3; col++) {
				matriz[lin][col] = 0;
				ganhador = 0;
			}
		}
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
