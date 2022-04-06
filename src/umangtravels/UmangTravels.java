/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package umangtravels;

/**
 *
 * @author UMANG ARORA
 */
public class UmangTravels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//new Splash().setVisible(true);
        Splash s=new Splash();
    
    s.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=700; i+=10, x+=7){
            s.setLocation(900 - ((i+x)/2), 500 - (i/2));
            s.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
        try{
            Thread.sleep(4000);
            s.setVisible(false);
            
            Login l = new Login();
            l.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
    
}
