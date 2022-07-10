package org.example;

public class ChildBook extends BOOK  implements Loanable {
    public ChildBook(int pages) {
        super(pages);
         category = Category.CHILD;
    }

    @Override
    public void loan() {
        System.out.println("Loan this child book is possible");
    }
}
