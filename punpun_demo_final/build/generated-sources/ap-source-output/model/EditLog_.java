package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(EditLog.class)
public class EditLog_ { 

    public static volatile SingularAttribute<EditLog, Members> memberId;
    public static volatile SingularAttribute<EditLog, Projects> projectId;
    public static volatile SingularAttribute<EditLog, Date> date;
    public static volatile SingularAttribute<EditLog, Integer> editLogId;

}