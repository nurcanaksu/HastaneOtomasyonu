/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainofResponsibilityPattern;

/**
 *
 * @author nurcan
 */
public class VeriGirisPersoneli extends Employee{

    @Override
    public void ProcessRequest(HospitalStaff req) { if(req.positionToBeApproved.equals("Veri Giriş Personeli"))
        {
            System.out.println("Veri giriş personelindesiniz." );
            
        }else if (NextApprover != null)
        {
            System.out.println("Veri giriş personelindesiniz.Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");
 
        }   }

    
}
