import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyPadButton1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyPadButton1 extends KeyPadButton
{
    
 
    
public KeyPadButton1(KeyPad keyPad){
    super(keyPad);
    this.keyPad=keyPad;


}
    
       public String getValue(){
        return "1";
    }
    
}
