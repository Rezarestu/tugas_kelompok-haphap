import javax.swing.JOptionPane;

public class nasabah extends bank{
   

public void getnsb1(){
    JOptionPane.showMessageDialog(null,"Data Nasabah \n"
+ "Nama Nasabah : "+getb()+"\n"
+ "No rekening : "+geta()+"\n"
+ "Saldo : Rp "+getc()+"\n");
}

public void getnsb4(){
JOptionPane.showMessageDialog(null,"Data Nasabah \n"
+ "Nama Nasabah : "+getb()+"\n"
+ "No rekening : "+geta()+"\n"
+ "No rekening tujuan : "+gete()+"\n"
+ "Jumlah Transfer : "+getd()+"\n"
+ "Saldo : Rp "+getc()+"\n");
}
}

