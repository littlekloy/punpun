package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Items;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:09")
@StaticMetamodel(ItemCategories.class)
public class ItemCategories_ { 

    public static volatile SingularAttribute<ItemCategories, Integer> itemCatagoryId;
    public static volatile SingularAttribute<ItemCategories, String> description;
    public static volatile SingularAttribute<ItemCategories, String> name;
    public static volatile CollectionAttribute<ItemCategories, Items> itemsCollection;

}