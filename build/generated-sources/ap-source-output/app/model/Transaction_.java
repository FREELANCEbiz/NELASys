package app.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T09:33:25")
@StaticMetamodel(Transaction.class)
public class Transaction_ { 

    public static volatile SingularAttribute<Transaction, BigDecimal> totalAmount;
    public static volatile SingularAttribute<Transaction, Integer> electricianId;
    public static volatile SingularAttribute<Transaction, Integer> statusId;
    public static volatile SingularAttribute<Transaction, Integer> transId;
    public static volatile SingularAttribute<Transaction, String> oRNo;
    public static volatile SingularAttribute<Transaction, Short> transTypeId;
    public static volatile SingularAttribute<Transaction, Date> transDate;
    public static volatile SingularAttribute<Transaction, Date> oRDate;
    public static volatile SingularAttribute<Transaction, Integer> userId;
    public static volatile SingularAttribute<Transaction, Short> transStatus;
    public static volatile SingularAttribute<Transaction, String> consumer;

}