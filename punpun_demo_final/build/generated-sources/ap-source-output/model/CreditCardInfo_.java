package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Members;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T03:53:10")
@StaticMetamodel(CreditCardInfo.class)
public class CreditCardInfo_ { 

    public static volatile SingularAttribute<CreditCardInfo, Integer> cardId;
    public static volatile SingularAttribute<CreditCardInfo, Date> expireDate;
    public static volatile SingularAttribute<CreditCardInfo, String> cvv;
    public static volatile SingularAttribute<CreditCardInfo, Members> memberId;
    public static volatile SingularAttribute<CreditCardInfo, Integer> infoId;

}