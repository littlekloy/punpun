package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Interests.class)
public class Interests_ { 

    public static volatile SingularAttribute<Interests, Integer> interestId;
    public static volatile SingularAttribute<Interests, String> name;
    public static volatile CollectionAttribute<Interests, Members> membersCollection;

}