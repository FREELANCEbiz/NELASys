package app.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-06-18T09:33:25")
@StaticMetamodel(PayrollPeriod.class)
public class PayrollPeriod_ { 

    public static volatile SingularAttribute<PayrollPeriod, Date> endDate;
    public static volatile SingularAttribute<PayrollPeriod, Date> transDate;
    public static volatile SingularAttribute<PayrollPeriod, String> description;
    public static volatile SingularAttribute<PayrollPeriod, Integer> userId;
    public static volatile SingularAttribute<PayrollPeriod, Date> startDate;
    public static volatile SingularAttribute<PayrollPeriod, Integer> monthId;
    public static volatile SingularAttribute<PayrollPeriod, Integer> pPId;
    public static volatile SingularAttribute<PayrollPeriod, Integer> yearId;

}