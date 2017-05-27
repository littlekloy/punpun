package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Comments;
import model.DeleteLog;
import model.Donations;
import model.EditLog;
import model.Members;
import model.ProjectDonations;
import model.ProjectItems;
import model.ReportLog;
import model.Tags;
import model.Teams;
import model.UpdateLog;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Projects.class)
public class Projects_ { 

    public static volatile CollectionAttribute<Projects, DeleteLog> deleteLogCollection;
    public static volatile SingularAttribute<Projects, Float> budget;
    public static volatile SingularAttribute<Projects, Date> startDate;
    public static volatile SingularAttribute<Projects, Float> percent;
    public static volatile SingularAttribute<Projects, Integer> supporter;
    public static volatile SingularAttribute<Projects, String> location;
    public static volatile SingularAttribute<Projects, String> status;
    public static volatile SingularAttribute<Projects, Integer> funded;
    public static volatile CollectionAttribute<Projects, ProjectDonations> projectDonationsCollection;
    public static volatile SingularAttribute<Projects, Date> endDate;
    public static volatile SingularAttribute<Projects, Integer> projectId;
    public static volatile SingularAttribute<Projects, Teams> teamId;
    public static volatile CollectionAttribute<Projects, Members> membersCollection;
    public static volatile CollectionAttribute<Projects, ProjectItems> projectItemsCollection;
    public static volatile CollectionAttribute<Projects, Comments> commentsCollection;
    public static volatile SingularAttribute<Projects, String> story;
    public static volatile SingularAttribute<Projects, Integer> projectCategoryId;
    public static volatile SingularAttribute<Projects, String> shortDescription;
    public static volatile SingularAttribute<Projects, String> name;
    public static volatile CollectionAttribute<Projects, Tags> tagsCollection;
    public static volatile SingularAttribute<Projects, Integer> fundingDuration;
    public static volatile CollectionAttribute<Projects, UpdateLog> updateLogCollection;
    public static volatile CollectionAttribute<Projects, Donations> donationsCollection;
    public static volatile CollectionAttribute<Projects, ReportLog> reportLogCollection;
    public static volatile CollectionAttribute<Projects, EditLog> editLogCollection;

}