/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mercury;



import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author asus
 */
@ManagedBean
@SessionScoped
public class Controller {
      
  public Controller(){   
}
  
  ArrayList<String> transaksi = new ArrayList<String>();



   int hasil=0;
   int result_;
   private String result="0";
   private int quantity1;

   
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getQuantity1() {
        return quantity1;
    }

    public void setQuantity1(int quantity1) {
        this.quantity1 = quantity1;
    }

    public ArrayList<String> getTransaksi() {
        return transaksi;
    }

    public void setTransaksi(ArrayList<String> transaksi) {
        this.transaksi = transaksi;
    }

    
     
  public void add1(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (10000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
            
            transaksi.add("11");
            
    }
  
  public void add2(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (5000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
            transaksi.add("15");
    }
  
   public void add3(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (3500 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("19");
    }
   
    public void add4(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (11000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("13");
    }
    
     public void add5(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (5000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("16");
    }
     
      public void add6(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (7000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("20");
    }
      
       public void add7(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (11000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("12");
    }
       
        public void add8(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (7000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("17");
    }
        
         public void add9(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (11000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("14");
    }
         
          public void add10(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (8000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
             transaksi.add("18");
    }
  
           public void add11(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (12000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add12(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (15000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add13(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (16000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add14(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (10000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add15(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (12000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add16(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (8000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add17(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (15000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add18(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (15000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add19(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (10000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
           
           public void add20(){
            result_ = Integer.parseInt(result);     
            hasil = result_ + (20000 * quantity1);
            result = Integer.toString(hasil);
            hasil-= Integer.parseInt(result);
            result_-=Integer.parseInt(result);
    }
         
}
  

  
  
  
 
