package bbc;

import javax.swing.ImageIcon;

public class Trooper {
  private int id;                         // Used to find the trooper's stats on the excel page
  private int state;                      // The state
  private int positionX;
  private int positionY;


  private int health;                     // At 0 health, the trooper despawns
  private int numberOfKnockbacks;         // If the trooper drops below i/nths of life with i < n, it's knocked back and stunned for a second 
  private int knockbackDistance;          // Distance of the knockback
  private int attackPower;                // The trooper's attacks deal this dmg

  private int level;                      // Goes 1 to 50
  private String description;             // The cat's description

  ImageIcon spriteSheet;

  private ImageIcon[] regularAttackCycle;
  private ImageIcon[] criticalAttackCycle;
  private ImageIcon[] walkCycle;
  private ImageIcon[] knockBackCycle;

  
  public Trooper(int id) {
    //Import stats from excel sheet or smth
    this.health = 400;
    this.numberOfKnockbacks = 1;
    this.knockbackDistance = 1;
    this.attackPower = 20;

    this.level = 2;
    this.description = "This is a generic unit";
  }

  public void walk() {
    // cicla la walk animation

    // muovi il trooper basato sulla walkSpeed
  }

  public void attack() {
    // cicla la atk animation

    // crea un evento attacco con un nemico (o nessuno) in argomento
  }

  public void knockback() {
    // cicla la kb animation

    // salta all'indietro
  }

  public void despawn() {
    // spawn cloud

    // delete unit
  }

  

}
