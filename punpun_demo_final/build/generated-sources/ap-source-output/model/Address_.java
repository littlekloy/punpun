package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> addressLine;
    public static volatile SingularAttribute<Address, String> provice;
    public static volatile SingularAttribute<Address, Integer> memberId;
    public static volatile SingularAttribute<Address, String> district;
    public static volatile SingularAttribute<Address, String> postcode;
    public static volatile SingularAttribute<Address, String> subdistrict;
    public static volatile SingularAttribute<Address, Members> members;
    public static volatile SingularAttribute<Address, String> country;

}