package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Donations;
import model.ProjectDonations;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Guests.class)
public class Guests_ { 

    public static volatile SingularAttribute<Guests, String> lastName;
    public static volatile SingularAttribute<Guests, String> email;
    public static volatile CollectionAttribute<Guests, ProjectDonations> projectDonationsCollection;
    public static volatile SingularAttribute<Guests, Integer> guestId;
    public static volatile SingularAttribute<Guests, String> firstName;
    public static volatile CollectionAttribute<Guests, Donations> donationsCollection;

}