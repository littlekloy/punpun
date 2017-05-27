package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Donations;
import model.ProjectItems;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(ItemDonations.class)
public class ItemDonations_ { 

    public static volatile SingularAttribute<ItemDonations, Float> amount;
    public static volatile SingularAttribute<ItemDonations, Donations> donationId;
    public static volatile SingularAttribute<ItemDonations, ProjectItems> projectItems;
    public static volatile SingularAttribute<ItemDonations, Integer> itemDonationId;

}