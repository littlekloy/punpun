package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Guests;
import model.ItemDonations;
import model.Members;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Donations.class)
public class Donations_ { 

    public static volatile SingularAttribute<Donations, Float> amount;
    public static volatile SingularAttribute<Donations, Integer> donationId;
    public static volatile SingularAttribute<Donations, String> status;
    public static volatile SingularAttribute<Donations, Guests> guestId;
    public static volatile SingularAttribute<Donations, String> method;
    public static volatile SingularAttribute<Donations, Members> memberId;
    public static volatile SingularAttribute<Donations, Projects> projectId;
    public static volatile SingularAttribute<Donations, Date> date;
    public static volatile SingularAttribute<Donations, String> type;
    public static volatile CollectionAttribute<Donations, ItemDonations> itemDonationsCollection;

}