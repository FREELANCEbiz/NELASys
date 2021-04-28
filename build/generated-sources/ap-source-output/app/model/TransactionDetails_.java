package app.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T09:33:25")
@StaticMetamodel(TransactionDetails.class)
public class TransactionDetails_ { 

    public static volatile SingularAttribute<TransactionDetails, Integer> shareHolderId;
    public static volatile SingularAttribute<TransactionDetails, BigDecimal> amount;
    public static volatile SingularAttribute<TransactionDetails, Integer> transId;
    public static volatile SingularAttribute<TransactionDetails, Integer> cOAId;
    public static volatile SingularAttribute<TransactionDetails, Integer> transDetailId;

}