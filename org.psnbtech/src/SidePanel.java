



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * The {@code SidePanel} class is responsible for displaying statistics and
 * controls to the player.
 * @author Brendan Jones
 *
 */
public class SidePanel extends JPanel {
	
	/**
	 * Serial Version UID.
	 */
	private static final long serialVersionUID = -40557434900946408L;

	/**
	 * The large font to draw with.
	 */
	private static final Font LARGE_FONT = new Font("Tahoma", Font.BOLD, 20);
	
	/**
	 * The medium font to draw with.
	 */
	private static final Font MEDIUM_FONT = new Font("Tahoma", Font.BOLD, 16);

	/**
	 * The small font to draw with.
	 */
	private static final Font SMALL_FONT = new Font("Tahoma", Font.BOLD, 12);
	
	/**
	 * The SnakeGame instance.
	 */
	public static SnakeGame game;
	
	/**
	 * Creates a new SidePanel instance.
	 * @param game The SnakeGame instance.
	 */
	public SidePanel(SnakeGame game) {
		SidePanel.game = game;
		
		setPreferredSize(new Dimension(300, BoardPanel.ROW_COUNT * BoardPanel.TILE_SIZE));
		setBackground(Color.BLACK);
	}
	
	private static final int STATISTICS_OFFSET = 150;
	
	private static final int CONTROLS_OFFSET = 320;
	
	private static final int MESSAGE_STRIDE = 30;
	
	private static final int SMALL_OFFSET = 30;
	
	private static final int LARGE_OFFSET = 50;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		/*
		 * Set the color to draw the font in to white.
		 */
		g.setColor(Color.RED);
		
		/*
		 * Draw the game name onto the window.
		 */
		g.setFont(LARGE_FONT);
		g.drawString("Tunceli Üniversitesi", getWidth() / 2 - g.getFontMetrics().stringWidth("    Snake Game") / 2, 50);
                g.setColor(Color.WHITE);
		g.drawString("Yılan Oyunu", getWidth() / 2 - g.getFontMetrics().stringWidth("Tunc") / 2, 100);
		
		/*
		 * Draw the categories onto the window.
		 */
		g.setFont(MEDIUM_FONT);
		g.drawString("İstatistikler", SMALL_OFFSET, STATISTICS_OFFSET);
		g.drawString("Kontroller", SMALL_OFFSET, CONTROLS_OFFSET);
				
		/*
		 * Draw the category content onto the window.
		 */
		g.setFont(SMALL_FONT);
		
		//Draw the content for the statistics category.
		int drawY = STATISTICS_OFFSET;
		g.drawString("Toplam  Skor: " + game.getScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Yenilen Meyve: " + game.getFruitsEaten(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Meyve   Skoru: " + game.getNextFruitScore(), LARGE_OFFSET, drawY += MESSAGE_STRIDE);
               
                if(game.getScore()>200){
                   BoardPanel.renkAta(TileType.SnakeBody,g);
              Clock.millisPerCycle=(1.0f / 9.0f) * (1000-(game.getScore()/3));
                }
		//Draw the content for the controls category.
		drawY = CONTROLS_OFFSET;
		g.drawString("Yukarı: W / Yukarı Tuşu", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Aşağı: S / Aşağı Tuşu", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Sola: A / Sol Tuş", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Sağa: D / Sağ Tuş", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
		g.drawString("Pause Tuşu: P", LARGE_OFFSET, drawY += MESSAGE_STRIDE);
	}

}
