package step2.view;

import java.util.Scanner;

public class InputView {

    private static final String PURCHASE_LOTTO = "구입금액을 입력해 주세요.";
    private static final String LAST_WEEK_LOTTO = "지난 주 당첨번호를 입력해 주세요.";
    private static final Scanner scanner = new Scanner(System.in);
    private InputView(){}

    public static int purchaseLotto(){
        System.out.println(PURCHASE_LOTTO);
        return scanner.nextInt();
    }
    public static String lastWeekLotto(){
        System.out.println(LAST_WEEK_LOTTO);
        return scanner.next();
    }

}