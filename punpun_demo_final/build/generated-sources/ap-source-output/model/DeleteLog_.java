package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(DeleteLog.class)
public class DeleteLog_ { 

    public static volatile SingularAttribute<DeleteLog, Projects> projectID;
    public static volatile SingularAttribute<DeleteLog, String> reason;
    public static volatile SingularAttribute<DeleteLog, Integer> deleteLogID;
    public static volatile SingularAttribute<DeleteLog, Date> date;
    public static volatile SingularAttribute<DeleteLog, Members> memberID;

}