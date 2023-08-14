package ArayuzIslemleri;

import java.util.Objects;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GirisEkranIslemleri {
    
    // Component Değişkenler
    private JTextField jTextField_KullanıcıAdı;
    private JTextField jTextField_KurtarmaKodu;
    private JPasswordField jPasswordField_Sifre;
    
    private String girilenKullaniciAdi;
    private String girilenSifre;
    private String girilenKurtarmaKodu;
    
    
    // Değişkenlerimiz - Mesaj
    private String sonucMesaj;
    private String sonucGiris_BosAlan;
    private String sonucGiris_Mesaj;
    private String sonucKurtarma_BosAlan;
    private String sonucKurtarma_Mesaj;

    public GirisEkranIslemleri(JTextField jTextField_KullanıcıAdı, JTextField jTextField_KurtarmaKodu, JPasswordField jPasswordField_Sifre) {
        this.jTextField_KullanıcıAdı = jTextField_KullanıcıAdı;
        this.jTextField_KurtarmaKodu = jTextField_KurtarmaKodu;
        this.jPasswordField_Sifre = jPasswordField_Sifre;
        
        
        this.girilenKullaniciAdi = jTextField_KullanıcıAdı.getText();
        this.girilenSifre = new String(jPasswordField_Sifre.getPassword());
        this.girilenKurtarmaKodu = jTextField_KurtarmaKodu.getText();
    }
    
    // GİRİŞ YAP METODLARI
   
    public boolean girisYap(String kullaniciAdi, String kullaniciSifre){
        
        return true;
        
    }
    
    protected boolean bosGirisKontrol(){
        if(girilenKullaniciAdi.equals("")&& girilenSifre.equals("")){
            
            this.sonucGiris_BosAlan = "Kullanıcı Adı ve Şifresi Giriniz";
            return false;
        }else if(girilenKullaniciAdi.equals("")){
             this.sonucGiris_BosAlan = "Kullanıcı Adı Giriniz";
             return false;
        }else if(girilenSifre.equals("")){
            this.sonucGiris_BosAlan = "Şifre Giriniz";
            return false;
        }else{
            this.sonucGiris_BosAlan = "BAŞARILI";
            return true;
        }
    }
    
    protected boolean sifreKontrol(String kullaniciAdi, String kullaniciSifre){
        if(girilenKullaniciAdi.equals(kullaniciAdi) && Objects.equals(girilenSifre, kullaniciSifre)){
            this.sonucGiris_Mesaj = "Giriş Başarılı";
            return true;
        }else{
            this.sonucGiris_Mesaj = "Kullanıcı Adınız veya Şifreniz Yanlış Girildi";
             return false;
        }
    }
    
    
    
    // ŞİFRE KURTARMA METODLARI
    public boolean sifreKurtar(String kurtarmaKodu){
        
        
        return true;
    }
    
    protected boolean bosKurtarmaKontrol(){
        
        if(!girilenKurtarmaKodu.equals("")){
            this.sonucKurtarma_BosAlan = "Başarılı";
            return true;
        }else{
            this.sonucKurtarma_BosAlan = "Kurtarma Kodu Girmediniz";
            return false;
        }
    }
    
    protected boolean kurtarmaKoduKontrol(String kurtarmaKodu){
        if(girilenKurtarmaKodu.equals(kurtarmaKodu)){
            this.sonucKurtarma_Mesaj = "Başarılı";
            return true;
        }else{
            this.sonucKurtarma_Mesaj = "Kurtarma Kodu Eşleşmedi";
            return false;
        }
    }
}
