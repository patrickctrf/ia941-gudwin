/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package r1_175480;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import ws3dproxy.CommandExecException;
import ws3dproxy.model.Creature;

/**
 *
 * @author patrickctrf
 */
public class TecladoJoystick implements KeyListener {

    public TecladoJoystick(Creature creature) {
        this.creature = creature;
    }

    private Creature creature = null;

    public int direcao = 0;

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println("Tecla pressionada!");

        int key = e.getKeyCode();
        try {
            // Codigos convencionados para andar em cada direcao (ou rodar)
            if (key == KeyEvent.VK_A) {
                direcao = 1;
                this.creature.rotate(-1);
                System.out.println("esquerda");
                return;
            }

            if (key == KeyEvent.VK_D) {
                direcao = 2;
                this.creature.rotate(1);
                System.out.println("direita");
                return;
            }
            
            if (key == KeyEvent.VK_W) {
                direcao = 3;
                this.creature.move(+1, +1, 0);
                System.out.println("frente");
                return;
            }

            if (key == KeyEvent.VK_S) {
                direcao = 4;
                this.creature.move(-1, -1, 0);
                System.out.println("tras");
                return;
            }

            // Qualquer outra tecla pressionada faz a criatura parar de andar
            direcao = 0;
            this.creature.rotate(0);
            this.creature.move(0, 0, 0);
            System.out.println("parar");

        } catch (CommandExecException ex) {
            System.out.println(ex);
        }

    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}
