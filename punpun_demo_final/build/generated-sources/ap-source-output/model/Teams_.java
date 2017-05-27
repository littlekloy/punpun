package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.MemberTeamPivot;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Teams.class)
public class Teams_ { 

    public static volatile SingularAttribute<Teams, String> description;
    public static volatile CollectionAttribute<Teams, Projects> projectsCollection;
    public static volatile CollectionAttribute<Teams, MemberTeamPivot> memberTeamPivotCollection;
    public static volatile SingularAttribute<Teams, Integer> teamId;

}