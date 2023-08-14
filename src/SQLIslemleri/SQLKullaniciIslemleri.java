package SQLIslemleri;

import MailConfig.MailIslemleri;
import javax.mail.MessagingException;


public class SQLKullaniciIslemleri {
    
    // Değişkenler
    
    private String mailAtilacakAdres = "";
    private String unutulanSifre = "";
    
    
    // Classlar
   // MailIslemleri mail = new MailIslemleri();
    
    private MailIslemleri mail;

    // Constructor
    public SQLKullaniciIslemleri(MailIslemleri mail) {
        this.mail = mail;
    }
    
    public void kullaniciBul(String kullaniciAdi){
        
        
        //Bu bilgiler Db'den gelecek
        this.mailAtilacakAdres = "sayars244@gmail.com";
        this.unutulanSifre = "123456";
    }
    
    public void sifremiUnuttum(String kullaniciAdi) throws MessagingException{
        kullaniciBul(kullaniciAdi);
        if(!mailAtilacakAdres.equals("")){
            
            System.out.println("Mail Gönderme İşlemlerine Devam Edilecek");
            mail.mailGonder(mailAtilacakAdres);
        }else{
            System.out.println("Kullanıcı Maili Bulunamadı >> UYARI GÖNDERİLECEK");
        }
    }
    
             
}
