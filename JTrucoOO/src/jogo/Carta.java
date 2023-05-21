/*
 * Carta.java
 *
 * Created on 19/05/2011, 09:47:40
 * License: GPLv3
 */
package jogo;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Classe para representar uma Carta de baralho sobre a mesa
 * 
 * @author Emerson Ribeiro de Mello
 */
public class Carta {

   private Image imagem;
   private boolean verso;
   private int x;
   private int y;
   private int largura;
   private int altura;
   private final static String caminhoImg = "resources/cartas/";
   private final static Image fundo =
           (new ImageIcon(ClassLoader.getSystemResource(caminhoImg+"fundoa.png"))).getImage();

   /**
    * Ao criar uma carta deve-se informar a imagem desta carta e se a mesma
    * esta' com o verso aparecendo
    * @param nomeArqImagem - Nome da imagem
    * @param deVerso - true se o verso estiver a mostra, false para aparecer a frente
    */
   public Carta(String nomeArqImagem, boolean deVerso) {

      ImageIcon iicon =
              new ImageIcon(this.getClass().getResource("/"+caminhoImg + nomeArqImagem));
      this.imagem = iicon.getImage();

      this.largura = this.imagem.getWidth(null);
      this.altura = this.imagem.getHeight(null);

      this.x = 0;
      this.y = 0;
      this.verso = deVerso;
   }

   /**
    * Atualiza as coordenadas X e Y da carta
    * @param nx - nova coordenada X
    * @param ny - nova coordenada Y
    */
   public void mover(int nx, int ny) {
      this.x = nx;
      this.y = ny;
   }

   /**
    * Virando a carta para exibir a imagem da carta ou seu verso
    */
   public void virar() {
      this.verso = !this.verso;
   }

   /**
    * Verifica se as coordenadas do clique do mouse estão contidas dentro dos 
    * limites da carta
    * @param px -- coordenada X do clique
    * @param py -- coordenada Y do clique
    * @return true se o clique foi dentro da area da carta
    */
   public boolean clicouDentro(int px, int py) {
      return ((px > this.x && px < (this.x + largura))
              && (py > this.y && py < (this.y + altura))) ? true : false;
   }

   /**
    * Desenha a carta no JPanel pai. Verifica se desenhará a frente ou o verso
    * @param g 
    * @param pai 
    */
   public void desenhar(Graphics g, JPanel pai) {
      Image i = (!this.verso) ? this.imagem : Carta.fundo;
      g.drawImage(i, this.x, this.y, pai);
   }

   public int getAltura() {
      return this.altura;
   }

   public Image getImagem() {
      return this.imagem;
   }

   public int getLargura() {
      return this.largura;
   }

   public int getX() {
      return this.x;
   }

   public int getY() {
      return this.y;
   }
}
