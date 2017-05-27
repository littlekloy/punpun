package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(ReportLog.class)
public class ReportLog_ { 

    public static volatile SingularAttribute<ReportLog, Integer> reportLogId;
    public static volatile SingularAttribute<ReportLog, String> reason;
    public static volatile SingularAttribute<ReportLog, Members> memberId;
    public static volatile SingularAttribute<ReportLog, Projects> projectId;
    public static volatile SingularAttribute<ReportLog, Date> date;

}