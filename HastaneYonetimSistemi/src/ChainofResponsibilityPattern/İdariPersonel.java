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
public class İdariPersonel extends Employee {

    @Override
    public void ProcessRequest(HospitalStaff req) {
        if (req.positionToBeApproved.equals("İdari Personel")) {
            System.out.println("İdari Personeldesiniz.");
        } else if (NextApprover != null) {
            System.out.println("İdari Personeldesiniz Randevunuzun onaylanması için Bilgi İşlem personeline yönlendiriliyorsunz.");

        }
    }

}
