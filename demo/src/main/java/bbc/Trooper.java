package bbc;

import javax.swing.ImageIcon;

public class Trooper {
  private int id;                         // Used to find the trooper's stats on the excel page
  private int state;                      // The state
  private int positionX;
  private int positionY;

  private String name;                    // The name of the cat
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
    DatabaseReader dbr = new DatabaseReader();
    
    // This thing has complexity (x^2)/2, we can make it a bit better with a 
    // dedicated function on DatabaseReader methinks, although stats shouldn't be 
    // THAT many for each cat but better safe than sburated in the eyes

    this.health = dbr.getCatScalarStat(id, "HP");
    this.numberOfKnockbacks = dbr.getCatScalarStat(id, "NumKB");
    this.knockbackDistance = dbr.getCatScalarStat(id, "KBDist");
    this.attackPower = dbr.getCatScalarStat(id, "ATK");

    this.name = dbr.getCatDescStat(id, "Name");
    this.description = dbr.getCatDescStat(id, "Desc");
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

  
  //Utils and debug
  public void visualizeStats() {
    System.out.println("Name: " + this.name);

    System.out.println("HP: " + this.health);
    System.out.println("ATK: " + this.attackPower);
    System.out.println("NumKB: " + this.numberOfKnockbacks);
    System.out.println("KBDist: " + this.knockbackDistance);

    System.out.println("\nDescription:\n\n" + this.description);
  }
}
