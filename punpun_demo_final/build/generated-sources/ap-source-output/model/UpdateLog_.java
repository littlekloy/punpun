package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(UpdateLog.class)
public class UpdateLog_ { 

    public static volatile SingularAttribute<UpdateLog, String> detail;
    public static volatile SingularAttribute<UpdateLog, Date> acitivityDate;
    public static volatile SingularAttribute<UpdateLog, Integer> updateLogId;
    public static volatile SingularAttribute<UpdateLog, Members> memberId;
    public static volatile SingularAttribute<UpdateLog, Projects> projectId;
    public static volatile SingularAttribute<UpdateLog, Date> date;

}