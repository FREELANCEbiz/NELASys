package app.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T09:33:25")
@StaticMetamodel(TransactionLog.class)
public class TransactionLog_ { 

    public static volatile SingularAttribute<TransactionLog, Integer> transId;
    public static volatile SingularAttribute<TransactionLog, Integer> transLogID;
    public static volatile SingularAttribute<TransactionLog, Date> transDateTime;
    public static volatile SingularAttribute<TransactionLog, String> details;
    public static volatile SingularAttribute<TransactionLog, Integer> userId;

}