import java.io.*;
import java.util.*;

public class Pokemon
{

  boolean alive;
  boolean active;
  boolean taken=false;
  int id;
  int health=50;
  //Why healt is 50 not 100???
  int movement;
  int attack;
  int defence;
  String name;
  String masterName="wild";
  char firstInitial;
  int xpos;
  int ypos;
  static int count;
  
  Pokemon(String n,int m, int a, int d,int id,int x,int y)
  {
  
     this.name=n;
	 this.firstInitial=n.charAt(0);
	 this.movement=m;
	 this.attack=a;
	 this.defence=d;
	 this.id=id;
	 count++;
	 this.xpos=x;
	 this.ypos=y;
  }
  
  public void displayInfo()
  {
   
    System.out.println(this.masterName+"\t"+this.name+"\t"+this.health+"\t"+this.firstInitial);
  
  }
  
  boolean getTaken()
  {
    return this.taken;
  }
  
   String getName()
  {
    return this.name;
  }
  String getMasterName()
  {
    return this.masterName;
  }
  
   boolean getAlive()
  {
    return this.alive;
  }
  
  boolean getIdOf(int x, int y)
  {
    if(x==this.xpos&&y==this.ypos)
    return true;
	 else 
	 return false;
  }
  
  
   char getFirstInitial()
  {
    return this.firstInitial;
  }
  
  
  int getId()
  {
    return this.id;
  }
  
     int getHealth()
  {
    return this.health;
  }
  
  
   int getAttack()
  {
    return this.attack;
  }
  
   int getDefence()
  {
    return this.defence;
  }
  
  int getxPos()
  {
    return this.xpos;
  }
  
  int getyPos()
  {
    return this.ypos;
  }
  
    
  
    int getCount()
  {
    return this.count;
  }
  
  void setHealth(int n)
  {
  
  this.health=n;
  }
  
  void addHealth(int n)
  {
  
  this.health=this.health+n;
  }
  
  void setMaster(String n)
  {
  
  this.masterName=n;
  this.taken=true;
  this.alive=true;
  this.active=true;
  }
  
  
  void takeAttack(int x)
  {
   // System.out.println(this.name + "came for attacking");
   int g=(int)(Math.random()*100);
   
   if(g>4)
    {int d=(int)(Math.random()*this.defence);
	x-=d;
	if(x<=0)
	  {x=0;
	   System.out.println(this.name.toUpperCase() + " DODGED!!!!!!!!!! like a baws");
	  }else
	  {
    this.health-=x;
	System.out.println(this.name.toUpperCase() + " took Damage of "+x);
	}
	if(this.health<1)
	  {this.alive=false;
	   System.out.println("\n||*******************"+this.name.toUpperCase() + " of " + this.masterName.toUpperCase() +" is DEAD!!*******************||\n");
	   this.health=0;
	   }
	}
	 else
	   System.out.println(this.name.toUpperCase() + " DODGED!!!!!!!!!! like a baws");
  }
  
  void setxPos(int x)
  {
  
  this.xpos=x;
  }
  void setyPos(int x)
  {
  
  this.ypos=x;
  }
  
  

}
