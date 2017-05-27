package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Guests;
import model.Members;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(ProjectDonations.class)
public class ProjectDonations_ { 

    public static volatile SingularAttribute<ProjectDonations, Float> amount;
    public static volatile SingularAttribute<ProjectDonations, Integer> donationId;
    public static volatile SingularAttribute<ProjectDonations, Guests> guestId;
    public static volatile SingularAttribute<ProjectDonations, Members> memberId;
    public static volatile SingularAttribute<ProjectDonations, Projects> projectId;
    public static volatile SingularAttribute<ProjectDonations, Date> date;

}