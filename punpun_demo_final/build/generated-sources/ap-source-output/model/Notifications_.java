package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Notifications.class)
public class Notifications_ { 

    public static volatile SingularAttribute<Notifications, Date> timestamp;
    public static volatile SingularAttribute<Notifications, Integer> notificationId;
    public static volatile SingularAttribute<Notifications, String> detail;
    public static volatile SingularAttribute<Notifications, String> action;
    public static volatile SingularAttribute<Notifications, Members> memberId;
    public static volatile SingularAttribute<Notifications, String> actor;
    public static volatile SingularAttribute<Notifications, Character> checked;

}