package app.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T09:33:25")
@StaticMetamodel(TransactionCancelled.class)
public class TransactionCancelled_ { 

    public static volatile SingularAttribute<TransactionCancelled, String> reason;
    public static volatile SingularAttribute<TransactionCancelled, Integer> transId;
    public static volatile SingularAttribute<TransactionCancelled, Date> transDateTime;
    public static volatile SingularAttribute<TransactionCancelled, Integer> transCancelId;
    public static volatile SingularAttribute<TransactionCancelled, Integer> userId;

}