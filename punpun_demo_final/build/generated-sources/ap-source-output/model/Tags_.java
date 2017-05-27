package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Tags.class)
public class Tags_ { 

    public static volatile SingularAttribute<Tags, String> name;
    public static volatile CollectionAttribute<Tags, Projects> projectsCollection;
    public static volatile SingularAttribute<Tags, Integer> tagId;

}