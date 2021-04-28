package app.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T09:33:25")
@StaticMetamodel(TransactionCharges.class)
public class TransactionCharges_ { 

    public static volatile SingularAttribute<TransactionCharges, Short> shareHolderId;
    public static volatile SingularAttribute<TransactionCharges, BigDecimal> amount;
    public static volatile SingularAttribute<TransactionCharges, Integer> chargeId;
    public static volatile SingularAttribute<TransactionCharges, Short> cOAId;
    public static volatile SingularAttribute<TransactionCharges, Short> transTypeId;

}