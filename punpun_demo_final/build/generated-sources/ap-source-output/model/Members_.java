package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Address;
import model.Comments;
import model.CreditCardInfo;
import model.DeleteLog;
import model.Donations;
import model.EditLog;
import model.Interests;
import model.MemberTeamPivot;
import model.Members;
import model.Notifications;
import model.ProjectDonations;
import model.Projects;
import model.ReportLog;
import model.UpdateLog;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Members.class)
public class Members_ { 

    public static volatile CollectionAttribute<Members, Notifications> notificationsCollection;
    public static volatile SingularAttribute<Members, String> facebookId;
    public static volatile SingularAttribute<Members, String> password;
    public static volatile CollectionAttribute<Members, Members> membersCollection;
    public static volatile CollectionAttribute<Members, Comments> commentsCollection;
    public static volatile SingularAttribute<Members, String> username;
    public static volatile SingularAttribute<Members, Integer> level;
    public static volatile CollectionAttribute<Members, Members> membersCollection1;
    public static volatile SingularAttribute<Members, String> role;
    public static volatile CollectionAttribute<Members, UpdateLog> updateLogCollection;
    public static volatile SingularAttribute<Members, String> firstName;
    public static volatile CollectionAttribute<Members, Interests> interestsCollection;
    public static volatile SingularAttribute<Members, String> lastName;
    public static volatile CollectionAttribute<Members, DeleteLog> deleteLogCollection;
    public static volatile CollectionAttribute<Members, ProjectDonations> projectDonationsCollection;
    public static volatile CollectionAttribute<Members, MemberTeamPivot> memberTeamPivotCollection;
    public static volatile SingularAttribute<Members, Float> point;
    public static volatile SingularAttribute<Members, String> email;
    public static volatile SingularAttribute<Members, Address> address;
    public static volatile CollectionAttribute<Members, Projects> projectsCollection;
    public static volatile SingularAttribute<Members, Integer> memberId;
    public static volatile CollectionAttribute<Members, Donations> donationsCollection;
    public static volatile CollectionAttribute<Members, ReportLog> reportLogCollection;
    public static volatile CollectionAttribute<Members, CreditCardInfo> creditCardInfoCollection;
    public static volatile CollectionAttribute<Members, EditLog> editLogCollection;

}