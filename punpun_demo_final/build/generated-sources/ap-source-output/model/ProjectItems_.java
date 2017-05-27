package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ItemDonations;
import model.Items;
import model.ProjectItemsPK;
import model.Projects;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(ProjectItems.class)
public class ProjectItems_ { 

    public static volatile SingularAttribute<ProjectItems, Float> amount;
    public static volatile SingularAttribute<ProjectItems, Projects> projects;
    public static volatile SingularAttribute<ProjectItems, Items> items;
    public static volatile SingularAttribute<ProjectItems, ProjectItemsPK> projectItemsPK;
    public static volatile CollectionAttribute<ProjectItems, ItemDonations> itemDonationsCollection;

}