package singleton;

import java.time.LocalDate;

public class President {
    private String fullName;
    private LocalDate endOfTerm;

    private static President actualPresident;

    private President(String fullName) {
        this.fullName=fullName;
        this.endOfTerm=LocalDate.of(2024,02,25);
    }


    public static President getInstance(String fullName) {
        if (actualPresident == null || actualPresident.endOfTerm.isBefore(LocalDate.now())) {
            actualPresident=new President(fullName);
        }
        return actualPresident;
    }

    @Override
    public String toString() {
        return "Actual President is : " + fullName + '\'' +
                ", the end of term is " + endOfTerm;
    }
}
