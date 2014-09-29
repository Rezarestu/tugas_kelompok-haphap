import javax.swing.JOptionPane;

public class utama extends bank{
 public static void main(String[] args){
     int pilih1;
        
        nasabah coba=new nasabah();  
        nasabah Tombol;
        Tombol = coba;
       
        int x=0;
        do
        {String data2=JOptionPane.showInputDialog("\tBANK HAPHAP \n 1. Nasabah Baru "
                + "\n 2. Menabung \n 3. Transfer  \n 4. Mengambil \n 5. Exit \n "
                + " Masukan Pilihan Anda?");
          pilih1=Integer.parseInt(data2);
          switch(pilih1){
              case 1:
              Tombol.setnsb1();
              Tombol.setnsb2();
              Tombol.getnsb1();
              break;
               
              case 2:
              Tombol.setnsb3();
              Tombol.getnsb1();
              break;
                  
              case 3:
              Tombol.transfer();
              Tombol.getnsb4();
              break;
                  
              case 4:
              Tombol.ambil();
              Tombol.getnsb1();               
              break;
                  
              case 5:
               System.exit(0);
              break;
                  
          }    
              x++;
          }      while (x>0);     
        }
}


