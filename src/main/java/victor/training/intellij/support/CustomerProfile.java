package victor.training.intellij.support;

import lombok.Data;

@Data // errorum humanum est
public class CustomerProfile {
   private String name;
   private  boolean goldMember;

    public int getDiscountPercentage() {
        int discountPercentage = 3;
        if (isGoldMember()) {
            discountPercentage += 1;
        }
        return discountPercentage;
    }
}
