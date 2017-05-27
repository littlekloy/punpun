package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.ItemCategories;
import model.ProjectItems;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Items.class)
public class Items_ { 

    public static volatile SingularAttribute<Items, String> name;
    public static volatile SingularAttribute<Items, Integer> itemId;
    public static volatile CollectionAttribute<Items, ProjectItems> projectItemsCollection;
    public static volatile SingularAttribute<Items, ItemCategories> itemCategoryId;

}