/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author diniristanti
 */
import javax.swing.JOptionPane;
class tarik {
    private int saldo;

    public void ambil(int tab, int t) {
        if (t%100!=0) {
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali","Transaksi Gagal",0);
        }else
            if(t>tab){
                JOptionPane.showMessageDialog(null,"Saldo anda tidak mencukupi, silakan melakukan penyetoran","Transaksi Gagal", 0);
            }else
                if (t<50000) {
                    JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan tunai adalah Rp 50000","Transaksi Gagal", 0);
                }else{
                    saldo=tab-t;
                    JOptionPane.showMessageDialog(null,"Saldo anda saat ini sebesar : "+saldo);
                    if(tab<=50000){
                        
                        JOptionPane.showMessageDialog(null, "Saldo minimal harus Rp 50000, Segara lakukan penyetoran untuk menghindari penutupan akun","CAUTION" ,0);
                        
    }}
    }

    int getsaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
