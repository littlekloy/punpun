package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MemberTeamPivotPK;
import model.Members;
import model.Teams;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:09")
@StaticMetamodel(MemberTeamPivot.class)
public class MemberTeamPivot_ { 

    public static volatile SingularAttribute<MemberTeamPivot, String> position;
    public static volatile SingularAttribute<MemberTeamPivot, Teams> teams;
    public static volatile SingularAttribute<MemberTeamPivot, MemberTeamPivotPK> memberTeamPivotPK;
    public static volatile SingularAttribute<MemberTeamPivot, Members> members;

}